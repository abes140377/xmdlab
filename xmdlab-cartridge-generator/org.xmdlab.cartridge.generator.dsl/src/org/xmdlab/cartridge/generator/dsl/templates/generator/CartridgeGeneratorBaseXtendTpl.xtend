package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class CartridgeGeneratorBaseXtendTpl {
	
	@Inject extension GeneratorProperties generatorProperties

	def generate(DslCartridge dslCartridge) '''
		«val className = cartridgeName.toFirstUpper + "CartridgeGeneratorBase"»
		«val templates = dslCartridge.templates»
		«getGeneratedComment(class.name)»
		package «basePackage».generator
		
		import com.google.inject.Inject
		import com.google.inject.Provider
		import org.eclipse.xtext.generator.IFileSystemAccess
		import org.xmdlab.cartridge.common.generator.IGenerator
		«FOR t : templates»
		import «basePackage».«getTemplateSubpackageFromPath(t)».«getTemplateNameFromPath(t).toFirstUpper»
		«ENDFOR»
		import «basePackage».metafacade.*
		import static «basePackage».io.«cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider.*
		import org.slf4j.LoggerFactory
		import org.slf4j.Logger
		import «basePackage».conf.«cartridgeName.toFirstUpper»CartridgeProperties
		import org.xmdlab.jee.application.mm.*
		
		«getClassComment(className)»
		abstract class «className» implements IGenerator {
		
			val static final Logger LOG = LoggerFactory.getLogger(«className»)

			@Inject extension «cartridgeName.toFirstUpper»CartridgeProperties
		
			«FOR m : dslCartridge.metafacades»
				@Inject «m.name.toFirstUpper» «m.name»
			«ENDFOR»
			«FOR t : templates»				
				@Inject Provider<«getTemplateNameFromPath(t).toFirstUpper»> «getTemplateNameFromPath(t).toFirstLower»
			«ENDFOR»
			
			/**
			* This method is a long sequence of calling all templates for the code generation
			*/
			override void doGenerate(IFileSystemAccess fsa) {
				val MmApplication application = applicationMetafacade.modelResource
				
				LOG.info("doGenerate: " + application)
				
				// compile templates
				«FOR t : templates»
				compile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»(fsa)
				«ENDFOR»
			}
			
			«FOR t : templates»
			/**
			 *
			 */
			def compile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»(IFileSystemAccess fsa) {
				val «getTemplateNameFromPath(t).toFirstUpper» tpl = «getTemplateNameFromPath(t).toFirstLower».get
				
				«IF isSet(t.outputPattern)»
					val String fileName = "«t.outputPattern»"
				«ELSE»
					val String fileName = getCompile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»OutputPattern(«t.modelElements.map[type.name].join(', ')»)
				«ENDIF»
				
				«IF t.outlet.isSet»
					fsa.generateFile(fileName, «getOutletConstantName(t)», tpl.generate())
				«ELSE»
					fsa.generateFile(fileName, tpl.generate(«t.modelElements.map[type.name].join(', ')»))
				«ENDIF»
			}
			«IF isNotSet(t.outputPattern)»
			
			def String get«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»OutputPattern()
			«ENDIF»
			
			«ENDFOR»
		}
	'''
}