package org.xmdlab.cartridge.generator.dsl.templates.metafacade

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslMetafacade
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

class CartridgeMetafacadeBaseXtendTpl {

	@Inject extension GeneratorProperties generatorProperties

	def generate(DslMetafacade metafacade) '''
		«getGeneratedComment(class.name)»
		package «basePackage».metafacade
		
		import org.xmdlab.cartride.common.metafacade.MetafacadeBase
		
		abstract class «metafacade.name.toFirstUpper»Base extends MetafacadeBase<«metafacade.modelElement»> implements «metafacade.name.toFirstUpper» {
			
		}
	'''
}
