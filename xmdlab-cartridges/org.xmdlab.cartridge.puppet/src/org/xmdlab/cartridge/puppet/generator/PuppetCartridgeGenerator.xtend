/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorXtendTpl
 */
package org.xmdlab.cartridge.puppet.generator

import org.xmdlab.cartridge.puppet.metafacade.NodeMetafacade
import org.xmdlab.cartridge.puppet.metafacade.ProfileMetafacade

/**
 * The PuppetCartridgeGeneratorStandaloneSetup
 *
 * @author Sebastian Freund<seba1403@googlemail.com>
 *
 */
class PuppetCartridgeGenerator extends PuppetCartridgeGeneratorBase {

	override void runTest(ProfileMetafacade profileMetafacade) {
		//		val modelResource = profileMetafacade.modelResource
		//
		//		for (module : modelResource.modules) {
		//			val CloneCommand clone = Git.cloneRepository()
		//			clone.directory = new File("/tmp")
		//			clone.URI = ""
		//		}
	}

	override getCompileRoleOutputPattern(NodeMetafacade nodeMetafacade) {
		nodeMetafacade.modelResource.name + '.pp'
	}

	override getCompileProfileOutputPattern(ProfileMetafacade profileMetafacade) {
		profileMetafacade.modelResource.name + '.pp'
	}

}
