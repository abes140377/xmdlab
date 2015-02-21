package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.util.StringHelper
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class CartridgeGeneratorWorkflowTpl {

	@Inject extension GeneratorProperties generatorProperties
//	@Inject extension ModelHelper
	
	def generate(DslCartridge dslCartridge) '''
	«StringHelper.getGeneratedComment(class.name)»
	package «basePackage».generator

	import com.google.common.base.Charsets
	import com.google.common.io.Files
	import com.google.inject.Inject
	import com.google.inject.Injector
	import java.io.File
	import org.eclipse.xtext.generator.JavaIoFileSystemAccess
	import org.eclipse.xtext.junit4.util.ParseHelper
	import org.slf4j.Logger
	import org.slf4j.LoggerFactory
	import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext
	import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.Severity
	import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.XmdlabGeneratorIssueImpl
	import org.xmdlab.cartridge.common.generator.CartridgeGeneratorWorkflow
	import org.xmdlab.cartridge.common.generator.IGenerator
	import org.xmdlab.cartridge.common.generator.JavaIoFileSystemAccessExt
	import «basePackage».io.«cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider
	import «basePackage».transformation.«cartridgeName.toFirstUpper»CartridgeTransformation
	import «dslCartridge.getTransformationInputClassName»
	import «dslCartridge.getDslModelClassName()»
	import «dslCartridge.getTransformationOutputClassName»
	
	/**
	 * 
	 */
	class «cartridgeName.toFirstUpper»CartridgeGeneratorWorkflow extends CartridgeGeneratorWorkflow {
	
		private final static Logger LOG = LoggerFactory.getLogger(«cartridgeName.toFirstUpper»CartridgeGeneratorWorkflow)
	
		@Inject Injector injector
	
		@Inject ParseHelper<«dslCartridge.getDslModelClassSimpleName»> parser
		
		/**
		 * 
		 */
		override boolean run(String modelPath) {
			val «dslCartridge.getDslModelClassSimpleName» «dslCartridge.getDslModelClassSimpleName.toFirstLower» = parser.parse(Files.toString(new File(modelPath), Charsets.ISO_8859_1))
	
			val «dslCartridge.transformationInputClassSimpleName» «dslCartridge.getTransformationInputClassSimpleName.toFirstLower» = «dslCartridge.getDslModelClassSimpleName.toFirstLower».eAllContents.filter(«dslCartridge.transformationInputClassSimpleName»).head
	
			if (validate(«dslCartridge.getTransformationInputClassSimpleName.toFirstLower»)) {
	
				val «dslCartridge.getTransformationOutputClassSimpleName.toFirstLower» = transformModel(«dslCartridge.getTransformationInputClassSimpleName.toFirstLower»)
	
				if («dslCartridge.getTransformationOutputClassSimpleName.toFirstLower» != null) {
					generateCode(«dslCartridge.getTransformationOutputClassSimpleName.toFirstLower»)
					return true
				}
			}
	
			LOG.error("Executing workflow failed")
	
			return false
		}
	
		/**
		 * 
		 */
		protected def void generateCode(«dslCartridge.getTransformationOutputClassSimpleName» «dslCartridge.getTransformationOutputClassSimpleName.toFirstLower») {
			val «cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider outputConfigurationProvider = injector.getInstance(
				«cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider)
			val JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccessExt)
			fsa.outputConfigurations = outputConfigurationProvider.outputConfigurations
			val IGenerator<«dslCartridge.getTransformationOutputClassSimpleName»> generator = injector.getInstance(«cartridgeName.toFirstUpper»CartridgeGenerator)
	
			generator.doGenerate(«dslCartridge.getTransformationOutputClassSimpleName.toFirstLower», fsa)
		}
	
		/**
		 * 
		 */
		protected def «dslCartridge.getTransformationOutputClassSimpleName» transformModel(«dslCartridge.getTransformationInputClassSimpleName» «dslCartridge.getTransformationInputClassSimpleName.toFirstLower») {
			LOG.info("Transforming «dslCartridge.getTransformationInputClassSimpleName.toFirstLower» " + «dslCartridge.getTransformationInputClassSimpleName.toFirstLower».name)
	
			// run transformation
			val «cartridgeName.toFirstUpper»CartridgeTransformation transformation = injector.getInstance(«cartridgeName.toFirstUpper»CartridgeTransformation)
			var transformedModel = transformation.transform(«dslCartridge.getTransformationInputClassSimpleName.toFirstLower») as «dslCartridge.getTransformationOutputClassSimpleName»
	
			if (transformedModel == null) {
				XmdlabGeneratorContext.addIssue(
					new XmdlabGeneratorIssueImpl(Severity.ERROR,
						"Transformation and modification of model '" + «dslCartridge.getTransformationInputClassSimpleName.toFirstLower».name + "' failed"))
			}
	
			return transformedModel
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