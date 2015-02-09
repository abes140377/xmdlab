/*
 * generated by Xtext
 */
package org.xmdlab.cartridge.generator.dsl.generator

import com.google.inject.Inject
import com.google.inject.Provider
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslMetafacade
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslModel
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTemplate
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTransformation
import org.xmdlab.cartridge.generator.dsl.templates.ManifestMfTpl
import org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgGeneratorMwe2Tpl
import org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorBaseXtendTpl
import org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorModuleTpl
import org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorStandaloneSetupTpl
import org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorXtendTpl
import org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeOutputConfigurationProviderTpl
import org.xmdlab.cartridge.generator.dsl.templates.metafacade.CartridgeMetafacadeBaseXtendTpl
import org.xmdlab.cartridge.generator.dsl.templates.metafacade.CartridgeMetafacadeImplXtendTpl
import org.xmdlab.cartridge.generator.dsl.templates.metafacade.CartridgeMetafacadeXtendTpl
import org.xmdlab.cartridge.generator.dsl.templates.conf.CartridgePropertiesTpl
import org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateBaseTpl
import org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateTpl
import org.xmdlab.cartridge.generator.dsl.templates.transformation.CartridgeTransformationBaseXtendTpl
import org.xmdlab.cartridge.generator.dsl.templates.transformation.CartridgeTransformationComponentTpl
import org.xmdlab.cartridge.generator.dsl.templates.transformation.CartridgeTransformationXtendTpl

import static org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*
import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTask
import org.xmdlab.cartridge.generator.dsl.templates.task.TaskClassTpl
import org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorWorkflowTpl

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CartridgeDslGenerator implements IGenerator {

	final private static Logger log = Logger.getLogger(CartridgeDslGenerator);

	@Inject extension GeneratorProperties generatorProperties

	@Inject extension Provider<TaskClassTpl> taskClassTpl

	@Inject extension Provider<CartridgeGeneratorWorkflowTpl> cartridgeGeneratorWorkflowTpl

	@Inject extension Provider<CartridgGeneratorMwe2Tpl> cartridgGeneratorMwe2Tpl
	@Inject extension Provider<CartridgeGeneratorStandaloneSetupTpl> cartridgeGeneratorStandaloneSetupTpl
	@Inject extension Provider<CartridgeGeneratorModuleTpl> cartridgeGeneratorModuleTpl
	@Inject extension Provider<CartridgeGeneratorBaseXtendTpl> cartridgeGeneratorBaseXtendTpl
	@Inject extension Provider<CartridgeGeneratorXtendTpl> cartridgeGeneratorXtendTpl
	@Inject extension Provider<CartridgeOutputConfigurationProviderTpl> cartridgeOutputConfigurationProviderTpl

	@Inject extension Provider<CartridgePropertiesTpl> cartridgePropertiesTpl

	@Inject extension Provider<ManifestMfTpl> manifestMfTpl
	@Inject extension Provider<CartridgeTransformationXtendTpl> cartridgeTransformationXtendTpl
	@Inject extension Provider<CartridgeTransformationComponentTpl> cartridgeTransformationComponentTpl
	@Inject extension Provider<CartridgeTransformationBaseXtendTpl> cartridgeTransformationBaseXtendTpl

	@Inject extension Provider<CartridgeMetafacadeXtendTpl> metafacadeXtendTpl
	@Inject extension Provider<CartridgeMetafacadeBaseXtendTpl> cartridgeMetafacadeBaseXtendTpl
	@Inject extension Provider<CartridgeMetafacadeImplXtendTpl> cartridgeMetafacadeImplXtendTpl

	@Inject extension Provider<TemplateBaseTpl> templateBaseTpl
	@Inject extension Provider<TemplateTpl> templateTpl

	/**
	 * 
	 */
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		log.info("CartridgeGenerator:doGenerate(...) called with Resource from URI: " + resource.URI)

		var dslModel = resource.contents.filter(typeof(DslModel)).head as DslModel
		val dslCartridge = dslModel.cartridge
		generatorProperties.modelUri = resource.URI

		//
		generateCartridgeProjectProperties(dslCartridge, fsa)

		//
		val DslTransformation dslTransformation = dslCartridge.transformation
		if (dslTransformation != null) {
			// nicht mehr benutz
			//generateCartridgeTransformationComponent(dslTransformation, fsa)
			generateCartridgeTransformationBaseXtend(dslTransformation, fsa)
			generateCartridgeTransformationXtend(dslTransformation, fsa)
		}

		//
		generateCartridgeGeneratorWorkflow(dslCartridge, fsa)
		generateCartridgeGeneratorModule(dslCartridge, fsa)
		generateCartridgeGeneratorStandaloneSetup(dslCartridge, fsa)

		// nicht mehr benutz
		// generateMwe2CartridgeGenerator(dslCartridge, fsa)
		generateCartridgeGeneratorBaseXtend(dslCartridge, fsa)
		generateCartridgeGeneratorXtend(dslCartridge, fsa)

		//
		generateCartridgeOutputConfigurationProvider(dslCartridge, fsa)

		// for (task : dslCartridge.tasks) {
		// 	 generateTaskClass(task, fsa)
		// }
		
		for (metafacade : dslCartridge.metafacades) {
			generateCartridgeMetafacadeXtend(metafacade, fsa)
			generateCartridgeMetafacadeBaseXtend(metafacade, fsa)
			generateCartridgeMetafacadeImplXtend(metafacade, fsa)
		}

		//
		for (template : dslCartridge.templates) {
			generateTemplate(template, fsa)
		}
	}

	// =======================================================================================================================================
	def generateManifestMf(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val ManifestMfTpl tpl = manifestMfTpl.get

		val fileName = "META-INF/MANIFEST.MF_gen"

		fsa.generateFile(fileName, CartridgeOutputsConfigurationProvider::BASEDIR_OUTPUT, tpl.generate(dslCartridge))
	}

	// =======================================================================================================================================
	// Tasks
	/**
	 * 
	 */
	def generateTaskClass(DslTask dslTask, IFileSystemAccess fsa) {
		val TaskClassTpl tpl = taskClassTpl.get

		val fileName = javaToFsPath(basePackage) + "/task/" + dslTask.name.toFirstUpper + "Task.xtend"

		fsa.generateFile(fileName, CartridgeOutputsConfigurationProvider::GEN_MAN_OUTPUT, tpl.generate(dslTask))
	}

	// =======================================================================================================================================
	/**
	 * 
	 */
	def generateCartridgeGeneratorWorkflow(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val CartridgeGeneratorWorkflowTpl tpl = cartridgeGeneratorWorkflowTpl.get

		val fileName = javaToFsPath(basePackage) + "/generator/" + cartridgeName.toFirstUpper +
			"CartridgeGeneratorWorkflow.java"

		fsa.generateFile(fileName, tpl.generate(dslCartridge))
	}

	/**
	 * 
	 */
	def generateMwe2CartridgeGenerator(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val CartridgGeneratorMwe2Tpl tpl = cartridgGeneratorMwe2Tpl.get

		val fileName = javaToFsPath(basePackage) + "/generator/" + cartridgeName.toFirstUpper +
			"CartridgeGenerator.mwe2"

		fsa.generateFile(fileName, tpl.generate(dslCartridge))
	}

	/**
	 * 
	 */
	def generateCartridgeGeneratorStandaloneSetup(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val CartridgeGeneratorStandaloneSetupTpl tpl = cartridgeGeneratorStandaloneSetupTpl.get

		val fileName = javaToFsPath(basePackage) + "/" + cartridgeName.toFirstUpper +
			"CartridgeGeneratorStandaloneSetup.java"

		fsa.generateFile(fileName, tpl.generate(dslCartridge))
	}

	/**
	 * 
	 */
	def generateCartridgeGeneratorModule(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val CartridgeGeneratorModuleTpl tpl = cartridgeGeneratorModuleTpl.get

		val fileName = javaToFsPath(basePackage) + "/" + cartridgeName.toFirstUpper + "CartridgeGeneratorModule.java"

		fsa.generateFile(fileName, tpl.generate(dslCartridge))
	}

	/**
	 * 
	 */
	def generateCartridgeGeneratorBaseXtend(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val CartridgeGeneratorBaseXtendTpl tpl = cartridgeGeneratorBaseXtendTpl.get

		val fileName = javaToFsPath(basePackage) + "/generator/" + cartridgeName.toFirstUpper +
			"CartridgeGeneratorBase.xtend"

		fsa.generateFile(fileName, tpl.generate(dslCartridge))
	}

	/**
	 * 
	 */
	def generateCartridgeOutputConfigurationProvider(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val CartridgeOutputConfigurationProviderTpl tpl = cartridgeOutputConfigurationProviderTpl.get

		val fileName = javaToFsPath(basePackage) + "/util/" + cartridgeName.toFirstUpper +
			"CartridgeOutputConfigurationProvider.xtend"

		fsa.generateFile(fileName, tpl.generate(dslCartridge))
	}

	/**
	 * 
	 */
	def generateCartridgeGeneratorXtend(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val CartridgeGeneratorXtendTpl tpl = cartridgeGeneratorXtendTpl.get

		val fileName = javaToFsPath(basePackage) + "/generator/" + cartridgeName.toFirstUpper +
			"CartridgeGenerator.xtend"

		fsa.generateFile(fileName, CartridgeOutputsConfigurationProvider::GEN_MAN_OUTPUT, tpl.generate(dslCartridge))
	}

	// =======================================================================================================================================
	// Namespace
	/**
	 * 
	 */
	def generateCartridgeProjectProperties(DslCartridge dslCartridge, IFileSystemAccess fsa) {
		val CartridgePropertiesTpl tpl = cartridgePropertiesTpl.get

		val fileName = javaToFsPath(basePackage) + "/conf/" + cartridgeName.toFirstUpper +
			"CartridgeProjectProperties.xtend"

		fsa.generateFile(fileName, tpl.generate(dslCartridge))
	}

	// =======================================================================================================================================
	// Transformation
	/**
	 * 
	 */
	def generateCartridgeTransformationComponent(DslTransformation dslTransformation, IFileSystemAccess fsa) {
		val CartridgeTransformationComponentTpl tpl = cartridgeTransformationComponentTpl.get

		val fileName = javaToFsPath(basePackage) + "/transformation/" + cartridgeName.toFirstUpper +
			"CartridgeTransformationComponent.java"

		fsa.generateFile(fileName, tpl.generate(dslTransformation))
	}

	/**
	 * 
	 */
	def generateCartridgeTransformationXtend(DslTransformation dslTransformation, IFileSystemAccess fsa) {
		val CartridgeTransformationXtendTpl tpl = cartridgeTransformationXtendTpl.get

		val fileName = javaToFsPath(basePackage) + "/transformation/" + cartridgeName.toFirstUpper +
			"CartridgeTransformation.xtend"

		fsa.generateFile(fileName, CartridgeOutputsConfigurationProvider::GEN_MAN_OUTPUT,
			tpl.generate(dslTransformation))
	}

	/**
	 * 
	 */
	def generateCartridgeTransformationBaseXtend(DslTransformation dslTransformation, IFileSystemAccess fsa) {
		val CartridgeTransformationBaseXtendTpl tpl = cartridgeTransformationBaseXtendTpl.get

		val fileName = javaToFsPath(basePackage) + "/transformation/" + cartridgeName.toFirstUpper +
			"CartridgeTransformationBase.xtend"

		fsa.generateFile(fileName, tpl.generate(dslTransformation))
	}

	// =======================================================================================================================================
	// Metafacade
	/**
	 * 
	 */
	def generateCartridgeMetafacadeXtend(DslMetafacade dslMetafacade, IFileSystemAccess fsa) {
		val CartridgeMetafacadeXtendTpl tpl = metafacadeXtendTpl.get

		val fileName = javaToFsPath(basePackage) + "/metafacade/" + dslMetafacade.name.toFirstUpper + ".xtend"

		fsa.generateFile(fileName, tpl.generate(dslMetafacade))
	}

	/**
	 * 
	 */
	def generateCartridgeMetafacadeBaseXtend(DslMetafacade dslMetafacade, IFileSystemAccess fsa) {
		val CartridgeMetafacadeBaseXtendTpl tpl = cartridgeMetafacadeBaseXtendTpl.get

		val fileName = javaToFsPath(basePackage) + "/metafacade/" + dslMetafacade.name.toFirstUpper + "Base.xtend"

		fsa.generateFile(fileName, tpl.generate(dslMetafacade))
	}

	/**
	 * 
	 */
	def generateCartridgeMetafacadeImplXtend(DslMetafacade dslMetafacade, IFileSystemAccess fsa) {
		val CartridgeMetafacadeImplXtendTpl tpl = cartridgeMetafacadeImplXtendTpl.get

		val fileName = javaToFsPath(basePackage) + "/metafacade/" + dslMetafacade.name.toFirstUpper + "Impl.xtend"

		fsa.generateFile(fileName, CartridgeOutputsConfigurationProvider::GEN_MAN_OUTPUT, tpl.generate(dslMetafacade))
	}

	// =======================================================================================================================================
	// Template
	/**
	 * 
	 */
	def generateTemplate(DslTemplate template, IFileSystemAccess fsa) {
		val TemplateBaseTpl templateBaseTpl = templateBaseTpl.get
		val TemplateTpl templateTpl = templateTpl.get

		val fileNameTemplateBase = javaToFsPath(basePackage) + "/" + getTemplateSubpackageFromPath(template) + "/" +
			getTemplateNameFromPath(template).toFirstUpper + "Base.xtend"
		val fileNameTemplate = javaToFsPath(basePackage) + "/" + getTemplateSubpackageFromPath(template) + "/" +
			getTemplateNameFromPath(template).toFirstUpper + ".xtend"

		fsa.generateFile(fileNameTemplateBase, templateBaseTpl.generate(template))
		fsa.generateFile(fileNameTemplate, CartridgeOutputsConfigurationProvider::GEN_MAN_OUTPUT,
			templateTpl.generate(template))
	}
}
