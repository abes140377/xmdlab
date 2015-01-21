package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

class CartridgeGeneratorXtendTpl {

	@Inject extension GeneratorProperties generatorProperties
	
	def generate(DslCartridge dslCartridge) '''
		«val modelNameFirstUpper = cartridgeName.toFirstUpper»
		«val className = modelNameFirstUpper + "CartridgeGeneratorStandaloneSetup"»
		«getGeneratedComment(class.name)»
		package «basePackage».generator
		
		«getClassComment(className)»
		class «modelNameFirstUpper»CartridgeGenerator extends «modelNameFirstUpper»CartridgeGeneratorBase {
		
			«FOR t : dslCartridge.templates»
«««				«val output = t.metafacade.transformation.output.name»
«««				«val attributeName = output.substring(output.lastIndexOf(".") + 1).toFirstLower»
«««				«IF t.outputPattern == null»
«««					/**
«««					 * Override get«t.name»OutputPattern() in «modelNameFirstUpper»CartridgeGeneratorBase
«««					 */
«««					override String get«t.name»OutputPattern(«output» «attributeName») {
«««						throw new RuntimeException("ERROR: implement missing for «modelNameFirstUpper»CartridgeGenerator:get«t.name»OutputPattern(«output» «attributeName»)")
«««					}
«««				«ENDIF»
			«ENDFOR»
		}
	'''
}
