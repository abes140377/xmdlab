/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateTpl
 */
package org.xmdlab.cartridge.puppet.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.puppet.metafacade.*
import org.xmdlab.cartridge.puppet.util.PuppetCartridgeProjectProperties

class ProfileBaseTpl extends ProfileBaseTplBase {
	
	@Inject extension PuppetCartridgeProjectProperties p
	
	override doGenerate(ProfileMetafacade profileMetafacade) '''
	class profile::base {
	}
	'''
}