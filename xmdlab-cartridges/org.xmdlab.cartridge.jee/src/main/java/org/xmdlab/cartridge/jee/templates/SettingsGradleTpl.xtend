/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateTpl
 */
package org.xmdlab.cartridge.jee.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.jee.metafacade.*
import org.xmdlab.cartridge.jee.conf.JeeCartridgeProperties

class SettingsGradleTpl extends SettingsGradleTplBase {
	
	@Inject extension JeeCartridgeProperties
	
	override doGenerate() '''
	include 'domain'

	//include ':xmdlab-framework-jee'
	//project(':xmdlab-framework-jee').projectDir = file('../../xmdlab-frameworks/xmdlab-framework-jee')
	'''
}
