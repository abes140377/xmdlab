package org.xmdlab.cartridge.generator.dsl.templates.metafacade

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslMetafacade
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

/**
 * 
 */
class CartridgeMetafacadeXtendTpl {

	@Inject extension GeneratorProperties generatorProperties

	/**
	 * 
	 */
	def generate(DslMetafacade metafacade) '''
		«getGeneratedComment(class.name)»
		package «basePackage».metafacade
		
		import org.xmdlab.cartridge.common.metafacade.Metafacade
		
		interface «metafacade.name.toFirstUpper» extends Metafacade<«metafacade.modelElement»> {
			«FOR facadeMethod : metafacade.facadeMethods»
			def «facadeMethod.type» «facadeMethod.name»()
			«ENDFOR»
		}
	'''
}
