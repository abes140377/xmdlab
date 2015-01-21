package org.xmdlab.cartridge.generator.dsl.templates.metafacade

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslMetafacade
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

class CartridgeMetafacadeImplXtendTpl {

	@Inject extension GeneratorProperties generatorProperties

	def generate(DslMetafacade metafacade) '''
		«getGeneratedComment(class.name)»
		package «basePackage».metafacade
		
		import com.google.inject.Singleton
		
		@Singleton
		class «metafacade.name.toFirstUpper»Impl extends «metafacade.name.toFirstUpper»Base {
		
		}
	'''
}
