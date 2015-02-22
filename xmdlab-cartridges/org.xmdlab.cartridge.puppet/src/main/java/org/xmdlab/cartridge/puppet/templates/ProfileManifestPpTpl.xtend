/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateTpl
 */
package org.xmdlab.cartridge.puppet.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.puppet.metafacade.*
import org.xmdlab.cartridge.puppet.conf.PuppetCartridgeProperties

class ProfileManifestPpTpl extends ProfileManifestPpTplBase {
	
	@Inject extension PuppetCartridgeProperties
	
	override doGenerate() '''
	�val profile = profileMetafacade.modelResource�
	class profile::�profile.name� {
	  notify { '�profile.name�_test': 
		withpath => true,
		name     => "notify from �profile.name�",
	  }
	}
	'''
}
