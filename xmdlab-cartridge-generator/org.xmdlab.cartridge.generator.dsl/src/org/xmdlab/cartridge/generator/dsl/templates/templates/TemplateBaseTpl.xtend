package org.xmdlab.cartridge.generator.dsl.templates.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTemplate
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class TemplateBaseTpl {

	@Inject extension GeneratorProperties generatorProperties
	

	def generate(DslTemplate dslTemplate) '''
		«getGeneratedComment(class.name)»
		package «basePackage».«getTemplateSubpackageFromPath(dslTemplate)»
		
		import com.google.inject.Inject
		import «basePackage».metafacade.*
				
		«val tmp = "'''"»
		«val open = "«"»
		«val close = "»"»
		abstract class «getTemplateNameFromPath(dslTemplate)»Base {
			
			«FOR m : dslTemplate.modelElements»
			@Inject extension «m.type.name.toFirstUpper» «m.type.name»
			«ENDFOR»
		
			def generate() «tmp»
				«open»doGenerate()«close»
			«tmp»
		
			def String doGenerate()
			
			«FOR m : dslTemplate.modelElements»
			def get«m.type.name.toFirstUpper»() {
				return «m.type.name»
			}
			«ENDFOR»
		}
	'''
}