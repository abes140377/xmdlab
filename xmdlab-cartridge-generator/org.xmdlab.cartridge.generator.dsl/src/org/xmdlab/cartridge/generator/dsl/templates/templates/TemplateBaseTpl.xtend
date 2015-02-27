package org.xmdlab.cartridge.generator.dsl.templates.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTemplate
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import static org.xmdlab.util.StringHelper.*
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class TemplateBaseTpl {

	@Inject extension GeneratorProperties generatorProperties
	
	def generate(DslTemplate dslTemplate) '''
		«getGeneratedComment(class.name)»
		package «basePackage».«getTemplateSubpackageFromPath(dslTemplate)»
		
		import com.google.inject.Inject
		import «basePackage».metafacade.«dslTemplate.modelElement.type.name.toFirstUpper»
		import org.xmdlab.cartridge.common.template.Template

		/**
		 *
		 */
		abstract class «getTemplateNameFromPath(dslTemplate)»Base implements Template {
			
			@Inject extension «dslTemplate.modelElement.type.name.toFirstUpper» «dslTemplate.modelElement.type.name»
		
			/**
		 	 *
		 	 */
			override generate() {
				doGenerate()
			}
		
			def String doGenerate()
			
			/**
		 	 *
		 	 */
			def get«dslTemplate.modelElement.type.name.toFirstUpper»() {
				return «dslTemplate.modelElement.type.name»
			}
		}
	'''
}