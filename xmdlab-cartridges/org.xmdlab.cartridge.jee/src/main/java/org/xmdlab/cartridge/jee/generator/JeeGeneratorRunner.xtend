package org.xmdlab.cartridge.jee.generator

import org.xmdlab.cartridge.common.generator.GeneratorRunner
import org.xmdlab.cartridge.jee.JeeCartridgeGeneratorStandaloneSetup

/**
 * 
 */
class JeeGeneratorRunner extends GeneratorRunner<JeeCartridgeGeneratorStandaloneSetup, JeeCartridgeGeneratorWorkflow> {

	/**
	 * 
	 */
	def static void main(String... args) {
		new JeeGeneratorRunner().run(args.get(0))
	}

	/**
	 * 
	 */
	override getStandaloneSetupClass() {
		JeeCartridgeGeneratorStandaloneSetup
	}

	/**
	 * 
	 */
	override getWorkflowClass() {
		JeeCartridgeGeneratorWorkflow
	}

}
