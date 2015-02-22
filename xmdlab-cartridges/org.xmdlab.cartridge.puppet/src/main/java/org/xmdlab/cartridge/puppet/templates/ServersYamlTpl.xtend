/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateTpl
 */
package org.xmdlab.cartridge.puppet.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.puppet.conf.PuppetCartridgeProperties

class ServersYamlTpl extends ServersYamlTplBase {

	@Inject extension PuppetCartridgeProperties

	override doGenerate() '''
		�val site = siteMetafacade.modelResource�
		---
		�FOR n : site.nodes�
		- name: �n.hostname�
		  box: �vmBox�
		  boxUrl: �vmBoxUrl�
		  ram: �vmBoxRam�
		  ip: �n.ip�
		�ENDFOR�	
	'''
}
