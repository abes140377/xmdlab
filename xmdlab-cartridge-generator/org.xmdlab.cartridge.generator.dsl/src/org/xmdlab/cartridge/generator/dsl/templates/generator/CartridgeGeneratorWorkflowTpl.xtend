package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.util.StringHelper

class CartridgeGeneratorWorkflowTpl {

	@Inject extension GeneratorProperties generatorProperties
	
	def generate(DslCartridge dslCartridge) '''
	package «basePackage».generator

	import com.google.inject.Inject
	import com.google.inject.Injector
	import org.eclipse.emf.common.util.URI
	import org.eclipse.emf.ecore.EObject
	import org.eclipse.emf.ecore.resource.Resource
	import org.eclipse.xtext.generator.JavaIoFileSystemAccess
	import org.eclipse.xtext.resource.XtextResource
	import org.eclipse.xtext.resource.XtextResourceSet
	import org.slf4j.Logger
	import org.slf4j.LoggerFactory
	import org.xmdlab.cartridge.common.conf.CartridgeProperties
	import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext
	import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.Severity
	import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.XmdlabGeneratorIssueImpl
	import org.xmdlab.cartridge.common.generator.CartridgeGeneratorWorkflow
	import org.xmdlab.cartridge.common.generator.IGenerator
	import org.xmdlab.cartridge.common.generator.JavaIoFileSystemAccessExt
	import «basePackage».io.«cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider
	import «basePackage».metafacade.ApplicationMetafacade
	import «basePackage».transformation.«cartridgeName.toFirstUpper»CartridgeTransformation
	import org.xmdlab.dsl.application.applicationDsl.*
	import org.xmdlab.jee.application.mm.*
	
	«StringHelper.getGeneratedComment(class.name)»
	class «cartridgeName.toFirstUpper»CartridgeGeneratorWorkflow extends CartridgeGeneratorWorkflow {
		
		private Logger LOGGER = LoggerFactory.getLogger(«cartridgeName.toFirstUpper»CartridgeGeneratorWorkflow)
	
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
		override boolean run(String modelURI) {
			cartridgeProperties.config.entrySet.forEach[
				LOGGER.info(it.key)
				LOGGER.info(it.value.render)
			]
			if (readModel(modelURI)) {
				val dslApp = getApplication()
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
		protected def void generateCode(MmApplication application) {
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
			
			val «cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider outputConfigurationProvider = injector.getInstance(
				«cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider)
			val JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccessExt)
			fsa.outputConfigurations = outputConfigurationProvider.outputConfigurations
			val IGenerator generator = injector.getInstance(«cartridgeName.toFirstUpper»CartridgeGenerator)
	
			generator.doGenerate(fsa)
		}
	
		/**
		 * 
		 */
		protected def MmApplication transformModel(DslApplication application) {
			LOGGER.info("Transforming application " + application.name)
	
			// run transformation
			val «cartridgeName.toFirstUpper»CartridgeTransformation transformation = injector.getInstance(«cartridgeName.toFirstUpper»CartridgeTransformation)
			var transformedApplication = transformation.transform(application) as MmApplication
	
			
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
			
			return true
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
	'''
	
//	def generate(DslCartridge dslCartridge) '''
//		«StringHelper.getGeneratedComment(class.name)»
//		package «basePackage».generator;
//		
//		import static com.google.common.collect.Lists.newArrayList;
//		import static com.google.common.collect.Maps.newHashMap;
//		import static com.google.common.collect.Maps.uniqueIndex;
//		
//		import java.util.List;
//		import java.util.Map;
//		import java.util.Map.Entry;
//		import java.util.Set;
//		
//		import org.eclipse.emf.ecore.resource.Resource;
//		import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
//		import org.eclipse.xtext.EcoreUtil2;
//		import org.eclipse.xtext.ISetup;
//		import org.eclipse.xtext.generator.GeneratorComponent;
//		import org.eclipse.xtext.generator.IFileSystemAccess;
//		import org.eclipse.xtext.generator.IGenerator;
//		import org.eclipse.xtext.generator.IOutputConfigurationProvider;
//		import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
//		import org.eclipse.xtext.generator.OutputConfiguration;
//		import org.xmdlab.rails.application.mm.Application;
//		
//		import com.google.common.base.Function;
//		import com.google.inject.Injector;
//		
//		«FOR m : dslCartridge.metafacades»
//		import «basePackage».metafacade.«m.name.toFirstUpper»;
//		«ENDFOR»
//		
//		public class «cartridgeName.toFirstUpper»CartridgeGeneratorComponent extends GeneratorComponent {
//			private Injector injector;
//			private List<String> slotNames = newArrayList();
//			private Map<String, String> outlets = newHashMap();
//		
//			/**
//			 * @since 2.4
//			 */
//			protected List<String> getSlotNames() {
//				return slotNames;
//			}
//		
//			/**
//			 * @since 2.4
//			 */
//			protected Map<String, String> getOutlets() {
//				return outlets;
//			}
//		
//			/**
//			 * registering an {@link ISetup}, which causes the execution of
//			 * {@link ISetup#createInjectorAndDoEMFRegistration()} the resulting
//			 * {@link com.google.inject.Inject} is stored and used to obtain the used
//			 * {@link IGenerator}.
//			 */
//			public void setRegister(ISetup setup) {
//				injector = setup.createInjectorAndDoEMFRegistration();
//			}
//		
//			/**
//			 * sets the {@link Injector} to be used to obtain the used
//			 * {@link IGenerator} instance.
//			 */
//			public void setInjector(Injector injector) {
//				this.injector = injector;
//			}
//		
//			/**
//			 * adds a slot name to look for {@link Resource}s (the slot's contents might
//			 * be a Resource or an Iterable of Resources).
//			 */
//			public void addSlot(String slot) {
//				this.slotNames.add(slot);
//			}
//		
//			public void preInvoke() {
//				if (injector == null)
//					throw new IllegalStateException(
//							"no Injector has been configured. Use 'register' with an ISetup or 'injector' directly.");
//				if (outlets.isEmpty())
//					throw new IllegalStateException("no 'outlet' has been configured.");
//		
//				for (Entry<String, String> outlet : outlets.entrySet()) {
//					if (outlet.getKey() == null)
//						throw new IllegalStateException(
//								"One of the outlets was configured without a name");
//					if (outlet.getValue() == null)
//						throw new IllegalStateException("The path of outlet '"
//								+ outlet.getKey() + "' was null.");
//				}
//			}
//		
//			/**
//			 * an outlet is defined by a name and a path. The generator will internally
//			 * choose one of the configured outlets when generating a file. the given
//			 * path defines the root directory of the outlet.
//			 */
//			public void addOutlet(Outlet out) {
//				outlets.put(out.outletName, out.path);
//			}
//		
//			public void invoke(IWorkflowContext ctx) {
//				IGenerator instance = getCompiler();
//				IFileSystemAccess fileSystemAccess = getConfiguredFileSystemAccess();
//				for (String slot : slotNames) {
//					Object object = ctx.get(slot);
//					if (object == null) {
//						throw new IllegalStateException("Slot '" + slot
//								+ "' was empty!");
//					}
//					if (object instanceof Resource) {
//						Resource resource = (Resource) object;
//						
//						// init metafacades
//						«FOR m : dslCartridge.metafacades»
//						«m.name.toFirstUpper» «m.name» = injector.getInstance(«m.name.toFirstUpper».class);
//						«m.modelElement» modelElement = EcoreUtil2.eAllOfType(resource.getAllContents().next(), «m.modelElement».class).get(0);
//						«m.name».setModelResource(modelElement);
//						
//						«ENDFOR»
//						// run generation
//						instance.doGenerate(resource, fileSystemAccess);
//					} else {
//						throw new IllegalStateException(
//								"Slot contents was not a Resource but a '"
//										+ object.getClass().getSimpleName() + "'!");
//					}
//				}
//			}
//		
//			protected IGenerator getCompiler() {
//				return injector.getInstance(IGenerator.class);
//			}
//		
//			protected IFileSystemAccess getConfiguredFileSystemAccess() {
//				final JavaIoFileSystemAccess configuredFileSystemAccess = injector
//						.getInstance(JavaIoFileSystemAccess.class);
//				configuredFileSystemAccess
//						.setOutputConfigurations(getOutputConfigurations());
//				for (Entry<String, String> outs : outlets.entrySet()) {
//					configuredFileSystemAccess.setOutputPath(outs.getKey(),
//							outs.getValue());
//				}
//				return configuredFileSystemAccess;
//			}
//		
//			public void postInvoke() {
//		
//			}
//		
//			/**
//			 * @since 2.3
//			 */
//			protected Map<String, OutputConfiguration> getOutputConfigurations() {
//				IOutputConfigurationProvider outputConfigurationProvider = injector
//						.getInstance(IOutputConfigurationProvider.class);
//				Set<OutputConfiguration> configurations = outputConfigurationProvider
//						.getOutputConfigurations();
//				return uniqueIndex(configurations,
//						new Function<OutputConfiguration, String>() {
//							public String apply(OutputConfiguration from) {
//								return from.getName();
//							}
//						});
//			}
//		
//			public static class Outlet {
//				private String outletName = IFileSystemAccess.DEFAULT_OUTPUT;
//				private String path;
//		
//				public void setOutletName(String outputName) {
//					this.outletName = outputName;
//				}
//		
//				public void setPath(String path) {
//					this.path = path;
//				}
//		
//				public String getOutletName() {
//					return outletName;
//				}
//		
//				public String getPath() {
//					return path;
//				}
//			}
//		}
//	'''
}