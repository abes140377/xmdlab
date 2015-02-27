package org.xmdlab.cartridge.generator.dsl.templates.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTemplate
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import static org.xmdlab.util.StringHelper.*
import static org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class TemplateTpl {

	@Inject extension GeneratorProperties generatorProperties

	def generate(DslTemplate dslTemplate) '''
		«getGeneratedComment(class.name)»
		package «basePackage».«getTemplateSubpackageFromPath(dslTemplate)»
		
		import com.google.inject.Inject
		import «basePackage».metafacade.*
		import «basePackage».conf.«cartridgeName.toFirstUpper»CartridgeProperties
		
		«val tmp = "'''"»
		class «getTemplateNameFromPath(dslTemplate).toFirstUpper» extends «getTemplateNameFromPath(dslTemplate)»Base {
			
			@Inject extension «cartridgeName.toFirstUpper»CartridgeProperties
			
			override doGenerate() «tmp»
			
			«tmp»
		}
	'''
}
