/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateTpl
 */
package org.xmdlab.cartridge.jee.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.jee.conf.JeeCartridgeProperties

class ReadmeMdTpl extends ReadmeMdTplBase {

	@Inject extension JeeCartridgeProperties
	
	override doGenerate() '''
		�val appName = applicationMetafacade.modelResource.name�
		# TODO �appName�
	'''
}
