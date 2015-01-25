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
import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.Severity
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.XmdlabGeneratorIssueImpl
import org.xmdlab.cartridge.common.generator.IGenerator
import org.xmdlab.cartridge.common.generator.JavaIoFileSystemAccessExt
import org.xmdlab.cartridge.jee.conf.JeeCartridgeProperties
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade
import org.xmdlab.cartridge.jee.transformation.JeeCartridgeTransformation
import org.xmdlab.dsl.application.applicationDsl.DslApplication
import org.xmdlab.dsl.application.applicationDsl.DslModel
import org.xmdlab.jee.application.mm.Application
import org.xmdlab.cartridge.common.conf.CartridgeProperties

/**
 * 
 */
class JeeCartridgeGeneratorWorkflow {

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
		println cartridgeProperties.toString
		if (readModel(modelURI)) {
			val dslApp = getApplication()
			println(dslApp.basePackage + " " + dslApp.name)
			if (validateApplication(dslApp)) {
				val app = transformAndModifyApplication(dslApp)
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

		println("Executing workflow failed")

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
	protected def Application transformAndModifyApplication(DslApplication application) {
		println("Transforming application " + application.name)

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
					"Transformation and modification of application '" + application.name + "' failed"))
		}
		transformedApplication
	}

	/**
	 * 
	 */
	protected def boolean validateApplication(DslApplication application) {
		val appDiagnostic = Diagnostician.INSTANCE.validate(application)

		if (appDiagnostic.getSeverity() != Diagnostic.OK) {
			logDiagnostic(appDiagnostic)
			if (appDiagnostic.getSeverity() == Diagnostic.ERROR) {
				XmdlabGeneratorContext.addIssue(
					new XmdlabGeneratorIssueImpl(Severity.ERROR,
						"Validating  application '" + application.name + "' failed"))
				return false
			}
		}
		true
	}

	protected def void logDiagnostic(Diagnostic diagnostic) {
		val eObject = if (diagnostic instanceof AbstractValidationDiagnostic)
				(diagnostic).sourceEObject
			else
				null
		if (eObject != null) {
			val message = "Model validation error \"" + diagnostic.getMessage() + "\" at " +
				EmfFormatter.objPath(eObject)
			switch diagnostic.severity {
				case Diagnostic.ERROR:
					XmdlabGeneratorContext.addIssue(new XmdlabGeneratorIssueImpl(Severity.ERROR, message))
				case Diagnostic.WARNING:
					XmdlabGeneratorContext.addIssue(new XmdlabGeneratorIssueImpl(Severity.WARNING, message))
				default:
					XmdlabGeneratorContext.addIssue(new XmdlabGeneratorIssueImpl(Severity.INFO, message))
			}
		}
		if (diagnostic.getChildren() != null) {
			for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
				logDiagnostic(childDiagnostic)
			}
		}
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

							println("Application loaded: " + app)

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
						println("Got Application: " + mainApp)
					} else {
						mainApp.modules.addAll(model.app.modules)
						println("Got Modules: " + model.app.modules)
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
	
	/**
	 * 
	 */
	protected def updateConfiguration(Properties properties) {
		if (properties != null) {
			// println("Updating configuration with {}", properties)
			// properties.stringPropertyNames.forEach[key|configuration.setString(key, properties.getProperty(key))]
		}
	}
}