/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateTpl
 */
package org.xmdlab.cartridge.puppet.templates

import org.xmdlab.cartridge.puppet.metafacade.*

class RoleTpl extends RoleTplBase {
	
	override doGenerate(NodeMetafacade nodeMetafacade) '''
	class role::�nodeMetafacade.modelResource.name� inherits role {
		�val profiles = nodeMetafacade.modelResource.role.profiles�
		�FOR profile : profiles�
		include profile::�profile.name�
		�ENDFOR�
	}
	'''
}