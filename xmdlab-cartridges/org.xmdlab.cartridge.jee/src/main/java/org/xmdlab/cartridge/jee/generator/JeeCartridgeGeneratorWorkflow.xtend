package org.xmdlab.cartridge.jee.generator

import com.google.inject.Inject
import com.google.inject.Injector
import java.util.Properties
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import org.xmdlab.cartride.common.generator.XmdlabGeneratorContext
import org.xmdlab.cartride.common.generator.XmdlabGeneratorIssue.XmdlabGeneratorIssueImpl
import org.xmdlab.cartride.common.generator.XmdlabGeneratorIssue.Severity
import org.xmdlab.dsl.application.applicationDsl.DslModel
import org.xmdlab.dsl.application.applicationDsl.DslApplication
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject
import java.lang.reflect.Method
import org.xmdlab.cartride.common.generator.XmdlabGeneratorException

class JeeCartridgeGeneratorWorkflow {

	@Inject
	var Injector injector

	var XtextResourceSet resourceSet

	@Inject
	protected def final void setResourceSet(XtextResourceSet resourceSet) {
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
		this.resourceSet = resourceSet
	}

	def final boolean run(String modelURI, Properties properties) {
		if (readModel(modelURI)) {
			val dslApp = getApplication()
			println (dslApp.basePackage + " " + dslApp.name) 
		}

		println("Executing workflow failed")
		false
	}

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

	protected def DslApplication getApplication() {
		//		LOG.debug("Retrieving application from resource set '{}'", resourceSet)
		var DslApplication mainApp = null
		for (Resource resource : resourceSet.resources) {
			for (EObject obj : resource.contents) {
				if (obj instanceof DslModel) {
					val model = obj
					if (mainApp == null) {
						println("Got Application: " + mainApp)
						mainApp = model.app
					} else {
						println("Got Modules: " + mainApp)
						mainApp.modules.addAll(model.app.modules)
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
	
	protected def org.xmdlab.jee.application.mm.Application transformAndModifyApplication(DslApplication application) {
		println("Transforming application" + application.name)
		var transformedApplication = runAction("org.sculptor.generator.transform.DslTransformation.transform",
			application) as org.xmdlab.jee.application.mm.Application
//		if (transformedApplication != null) {
//			LOG.debug("Modifying transformed application '{}'", transformedApplication.name)
//			transformedApplication = runAction("org.sculptor.generator.transform.Transformation.modify",
//				transformedApplication) as Application
//		}
		if (transformedApplication == null) {
			XmdlabGeneratorContext.addIssue(
				new XmdlabGeneratorIssueImpl(Severity.ERROR,
					"Transformation and modification of application '" + application.name + "' failed"))
		}
		transformedApplication
	}
	
	protected def Object runAction(String actionName, Object input) {
//		LOG.debug("Running action '{}' on '{}'", actionName, input.class.name)
		try {
			val lastDot = actionName.lastIndexOf('.')
			val actionClass = Class.forName(actionName.substring(0, lastDot))
			var Method actionMethod
			try {
				actionMethod = actionClass.getMethod(actionName.substring(lastDot + 1), input.class)
			} catch (Throwable th) {
				actionMethod = actionClass.getMethod(actionName.substring(lastDot + 1), input.class.interfaces.get(0))
			}
			val actionObj = injector.getInstance(actionClass)
			return actionMethod.invoke(actionObj, input)
		} catch (Throwable t) {
			XmdlabGeneratorContext.addIssue(
				new XmdlabGeneratorIssueImpl(Severity.ERROR,
					"Error running action '" + actionName + "': " +
						if(t.cause instanceof XmdlabGeneratorException) t.cause.message else t.message, t))
		}
		null
	}

	protected def updateConfiguration(Properties properties) {
		if (properties != null) {
			// println("Updating configuration with {}", properties)
			// properties.stringPropertyNames.forEach[key|configuration.setString(key, properties.getProperty(key))]
		}
	}
}
