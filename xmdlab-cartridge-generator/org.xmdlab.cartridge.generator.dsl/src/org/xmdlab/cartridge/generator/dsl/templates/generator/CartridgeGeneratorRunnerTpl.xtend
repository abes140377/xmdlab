package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*
import java.util.Comparator
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTemplate

class CartridgeGeneratorRunnerTpl {
	
	@Inject extension GeneratorProperties generatorProperties

	def generate(DslCartridge dslCartridge) '''
		«val className = cartridgeName.toFirstUpper + "CartridgeGeneratorBase"»
		«val templates = dslCartridge.templates»
		«val metafacades = dslCartridge.metafacades»
		«getGeneratedComment(class.name)»
		package «basePackage».generator
		
		import org.xmdlab.cartridge.common.generator.GeneratorRunner
		import org.xmdlab.cartridge.«cartridgeName».«cartridgeName.toFirstUpper»CartridgeGeneratorStandaloneSetup
		
		/**
		 * 
		 */
		class «cartridgeName.toFirstUpper»GeneratorRunner extends GeneratorRunner<«cartridgeName.toFirstUpper»CartridgeGeneratorStandaloneSetup, «cartridgeName.toFirstUpper»CartridgeGeneratorWorkflow> {
		
			/**
			 * 
			 */
			def static void main(String... args) {
				new «cartridgeName.toFirstUpper»GeneratorRunner().run(args.get(0))
			}
		
			/**
			 * 
			 */
			override getStandaloneSetupClass() {
				«cartridgeName.toFirstUpper»CartridgeGeneratorStandaloneSetup
			}
		
			/**
			 * 
			 */
			override getWorkflowClass() {
				«cartridgeName.toFirstUpper»CartridgeGeneratorWorkflow
			}
		
		}
	'''
}