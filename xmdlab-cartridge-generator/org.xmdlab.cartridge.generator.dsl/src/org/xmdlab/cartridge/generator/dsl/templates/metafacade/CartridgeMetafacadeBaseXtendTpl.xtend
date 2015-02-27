package org.xmdlab.cartridge.generator.dsl.templates.metafacade

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslMetafacade
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import static org.xmdlab.util.StringHelper.*
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class CartridgeMetafacadeBaseXtendTpl {

	@Inject extension GeneratorProperties generatorProperties

	def generate(DslMetafacade metafacade) '''
		«getGeneratedComment(class.name)»
		package «basePackage».metafacade
		
		import org.xmdlab.cartridge.common.metafacade.MetafacadeBase
		import «metafacade.modelElement»
		
		abstract class «metafacade.name.toFirstUpper»Base extends MetafacadeBase<«getMmRootClassSimpleName(metafacade.modelElement)»> implements «metafacade.name.toFirstUpper» {
		}
	'''
}
