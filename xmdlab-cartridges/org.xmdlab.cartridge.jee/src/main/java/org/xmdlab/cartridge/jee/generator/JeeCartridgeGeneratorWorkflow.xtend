package org.xmdlab.cartridge.jee.generator

import com.google.inject.Inject
import com.google.inject.Injector
import java.util.Properties
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.EmfFormatter
import org.eclipse.xtext.validation.AbstractValidationDiagnostic
import org.xmdlab.cartridge.common.conf.CartridgeProperties
import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.Severity
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.XmdlabGeneratorIssueImpl
import org.xmdlab.cartridge.common.generator.IGenerator
import org.xmdlab.cartridge.common.generator.JavaIoFileSystemAccessExt
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade
import org.xmdlab.cartridge.jee.transformation.JeeCartridgeTransformation
import org.xmdlab.dsl.application.applicationDsl.DslApplication
import org.xmdlab.dsl.application.applicationDsl.DslModel
import org.xmdlab.jee.application.mm.Application
import java.util.Set
import java.util.Map.Entry
import com.typesafe.config.ConfigValue
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.xmdlab.cartridge.common.generator.CartridgeGeneratorWorkflow

/**
 * 
 */
class JeeCartridgeGeneratorWorkflow extends CartridgeGeneratorWorkflow {
	
	private Logger LOGGER = LoggerFactory.getLogger(JeeCartridgeGeneratorWorkflow)

	@Inject
	var Injector injector
	
	@Inject
	CartridgeProperties cartridgeProperties;

	var XtextResourceSet resourceSet

	/**
	 * 
	 */
	@Inject
	protected def final void setResourceSet(XtextResourceSet resourceSet) {
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
		this.resourceSet = resourceSet
	}

	/**
	 * 
	 */
	def final boolean run(String modelURI) {
		if (readModel(modelURI)) {
			val dslApp = getApplication()
			LOGGER.info(dslApp.basePackage + " " + dslApp.name)
			if (validateApplication(dslApp)) {
				val app = transformModel(dslApp)
				if (app != null) {

					// init metafacades
					var ApplicationMetafacade applicationMetafacade = injector.getInstance(ApplicationMetafacade)
					applicationMetafacade.modelResource = app

					// run generator
					generateCode(app)

					return true
				}
			}
		}

		LOGGER.error("Executing workflow failed")

		return false
	}

	/**
	 * 
	 */
	protected def void generateCode(Application application) {
		if (application == null) {
			XmdlabGeneratorContext.addIssue(
				new XmdlabGeneratorIssueImpl(Severity.ERROR,
					"Transformation and modification of application '" + application.name + "' failed"))
		}

		// register the factory to be able to read xmi files
		// Resource.Factory.Registry::INSTANCE.getExtensionToFactoryMap().put(
		// Resource.Factory.Registry::DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		// create emf resource from transformed model
		// var ResourceSet resourceSet = new ResourceSetImpl();
		// var Resource input = resourceSet.createResource(URI.createURI("mm.sc"));
		// input.getContents().add(application);
		// get output configuration for cartridge an set in filesystem access
		
		val JeeCartridgeOutputConfigurationProvider outputConfigurationProvider = injector.getInstance(
			JeeCartridgeOutputConfigurationProvider)
		val JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccessExt)
		fsa.outputConfigurations = outputConfigurationProvider.outputConfigurations
		val IGenerator generator = injector.getInstance(JeeCartridgeGenerator)

		generator.doGenerate(fsa)
	}

	/**
	 * 
	 */
	protected def Application transformModel(DslApplication application) {
		LOGGER.info("Transforming application " + application.name)

		// run transformation
		val JeeCartridgeTransformation transformation = injector.getInstance(JeeCartridgeTransformation)
		var transformedApplication = transformation.transform(application) as Application

		
		// if (transformedApplication != null) {
		//     LOG.debug("Modifying transformed application '{}'", transformedApplication.name)
		//		transformedApplication = runAction("org.sculptor.generator.transform.Transformation.modify",
		//		    transformedApplication) as Application
		// }
		
		if (transformedApplication == null) {
			XmdlabGeneratorContext.addIssue(
				new XmdlabGeneratorIssueImpl(Severity.ERROR,
					"Transformation and modification of model '" + application.name + "' failed"))
		}
		transformedApplication
	}

	/**
	 * 
	 */
	protected def boolean readModel(String modelURI) {
		// Read all the models from given URI and check for imports 
		var newUris = newArrayList
		newUris.add(modelURI)
		var int numberResources
		do {

			// Remember the current number of resources in the resource set 
			numberResources = resourceSet.resources.size

			// Convert given text into URIs
			var realUris = newArrayList
			for (uri : newUris) {
				try {
					realUris.add(URI.createURI(uri))
				} catch (Exception e) {
					XmdlabGeneratorContext.addIssue(
						new XmdlabGeneratorIssueImpl(Severity.ERROR, "Invalid URI '" + uri + "' : " + e.message, e))
					return false
				}
			}

			// Check the exising URIs for new URIs from imports
			newUris = newArrayList
			for (uri : realUris) {
				val resource = resourceSet.getResource(uri, true)
				for (obj : resource.contents) {
					if (obj instanceof DslModel) {
						for (import : obj.imports) {
							val app = obj.app

							LOGGER.info("Application loaded: " + app)

							newUris.add(import.importURI)
						}
					}
				}
			}
		} while (!newUris.empty && numberResources != resourceSet.resources.size)
		true
	}

	/**
	 * 
	 */
	protected def DslApplication getApplication() {
		var DslApplication mainApp = null
		for (Resource resource : resourceSet.resources) {
			for (EObject obj : resource.contents) {
				if (obj instanceof DslModel) {
					val model = obj
					if (mainApp == null) {
						mainApp = model.app
						LOGGER.info("Got Application: " + mainApp)
					} else {
						mainApp.modules.addAll(model.app.modules)
						LOGGER.info("Got Modules: " + model.app.modules)
					}
				}
			}
		}
		if (mainApp != null) {
			// LOG.debug("Found application '{}'", mainApp.name)
		} else {
			XmdlabGeneratorContext.addIssue(
				new XmdlabGeneratorIssueImpl(Severity.ERROR, "No application found in resource set: " + resourceSet))
		}

		return mainApp
	}
}