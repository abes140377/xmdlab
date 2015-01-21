package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTemplate
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslMetafacade

class CartridgeGeneratorBaseXtendTpl {
	
	@Inject extension GeneratorProperties generatorProperties

	def generate(DslCartridge dslCartridge) '''
		«val className = cartridgeName.toFirstUpper + "CartridgeGeneratorBase"»
		«val templates = dslCartridge.templates»
		«val tasks = dslCartridge.tasks»
		«getGeneratedComment(class.name)»
		package «basePackage».generator
		
		import com.google.inject.Inject
		import com.google.inject.Provider
		import static «basePackage».util.«cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider.*
		import org.eclipse.xtext.generator.IFileSystemAccess
		import org.eclipse.xtext.generator.IGenerator
		//import org.eclipse.xtext.naming.IQualifiedNameProvider
		import org.eclipse.emf.ecore.resource.Resource
		
		import «basePackage».util.«cartridgeName.toFirstUpper»CartridgeProjectProperties
		
		import «basePackage».metafacade.*
		
		«FOR t : templates»
		import «basePackage».«getTemplateSubpackageFromPath(t)».«getTemplateNameFromPath(t).toFirstUpper»
		«ENDFOR»
		
		«getClassComment(className)»
		abstract class «className» implements IGenerator {
		
			// @Inject extension IQualifiedNameProvider nameProvider
			@Inject «cartridgeName.toFirstUpper»CartridgeProjectProperties properties
		
			«FOR t : templates»				
				@Inject Provider<«getTemplateNameFromPath(t).toFirstUpper»> «getTemplateNameFromPath(t).toFirstLower»
			«ENDFOR»
			«FOR m : dslCartridge.metafacades»
				@Inject «m.name.toFirstUpper» «m.name»
			«ENDFOR»
		
			/**
			* This method is a long sequence of calling all templates for the code generation
			*/
			override void doGenerate(Resource resource, IFileSystemAccess fsa) {
«««				// Init metafacades
«««				«FOR m : dslCartridge.nonModelMetafacades()»
«««				«m.name».modelResource = resource.allContents.filter(typeof(«m.modelElement»)).head
«««				«ENDFOR»
				
				// compile templates
				«FOR t : templates»
«««				«val templateParameters = t.modelElements.map[type.name].join(', ')»
				beforeCompile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»()
				compile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»(fsa)
				afterCompile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»()
				
				«ENDFOR»
			}
		
			«FOR t : templates»
			/**
			 *
			 */
			def void beforeCompile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»() { }
			
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
			
			/**
			 *
			 */
			def void afterCompile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»() { }
			
			«IF isNotSet(t.outputPattern)»
			def String getCompile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»OutputPattern()
			«ENDIF»
			
			«ENDFOR»
		}
	'''
}