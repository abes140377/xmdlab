package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*
import java.util.Comparator
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTemplate

class CartridgeGeneratorBaseXtendTpl {
	
	@Inject extension GeneratorProperties generatorProperties

	def generate(DslCartridge dslCartridge) '''
		«val className = cartridgeName.toFirstUpper + "CartridgeGeneratorBase"»
		«val templates = dslCartridge.templates»
		«val metafacades = dslCartridge.metafacades»
		«getGeneratedComment(class.name)»
		package «basePackage».generator
		
		import com.google.inject.Inject
		import com.google.inject.Provider
		import org.eclipse.xtext.generator.IFileSystemAccess
		import org.slf4j.Logger
		import org.slf4j.LoggerFactory
		import org.xmdlab.cartridge.common.generator.IGenerator
		import org.xmdlab.cartridge.jee.conf.JeeCartridgeProperties
		«FOR m : metafacades»
		import «basePackage».metafacade.«m.name.toFirstUpper»
		«ENDFOR»
		«FOR t : templates.sort(new Comparator<DslTemplate>() {
			override compare(DslTemplate t1, DslTemplate t2) {
				return t1.path.compareTo(t2.path)
			}
		})»
		import «basePackage».«getTemplateSubpackageFromPath(t)».«getTemplateNameFromPath(t).toFirstUpper»
		«ENDFOR»
		«FOR m : metafacades»
		import «m.modelElement»
		«ENDFOR»
		
		import static «basePackage».io.«cartridgeName.toFirstUpper»CartridgeOutputConfigurationProvider.*
		
		«getClassComment(className)»
		abstract class «className» implements IGenerator<«getTransformationOutputClassSimpleName(dslCartridge)»> {
		
			val static final Logger LOG = LoggerFactory.getLogger(«className»)

			@Inject «cartridgeName.toFirstUpper»CartridgeProperties «cartridgeName»CartridgeProperties
		
			«FOR m : dslCartridge.metafacades»
				@Inject «m.name.toFirstUpper» «m.name»
			«ENDFOR»
		
			«FOR t : templates»				
				@Inject Provider<«getTemplateNameFromPath(t).toFirstUpper»> «getTemplateNameFromPath(t).toFirstLower»
			«ENDFOR»
		
			«FOR t : templates»
			/**
			 * 
			 */
			def compile«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»(IFileSystemAccess fsa, «getMetafacadeModelElementSimpleClassName(t.modelElement.type)» «getMetafacadeModelElementSimpleClassName(t.modelElement.type).toFirstLower») {
				val «getTemplateNameFromPath(t).toFirstUpper» tpl = «getTemplateNameFromPath(t).toFirstLower».get
				
				«IF isSet(t.outputPattern)»
					val String fileName = "«t.outputPattern»"
				«ELSE»
					val String fileName = get«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»OutputPattern(«getMetafacadeModelElementSimpleClassName(t.modelElement.type).toFirstLower»)
				«ENDIF»
				
				«t.modelElement.type.name».modelResource = «getMetafacadeModelElementSimpleClassName(t.modelElement.type).toFirstLower»
				
				«IF t.outlet.isSet»
					fsa.generateFile(fileName, «getOutletConstantName(t)», tpl.generate())
				«ELSE»
					fsa.generateFile(fileName, tpl.generate())
				«ENDIF»
			}
		
			«IF isNotSet(t.outputPattern)»
			def String get«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»OutputPattern(«getMetafacadeModelElementSimpleClassName(t.modelElement.type)» «getMetafacadeModelElementSimpleClassName(t.modelElement.type).toFirstLower»)
			«ENDIF»
			«ENDFOR»
		}
	'''
}