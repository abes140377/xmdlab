/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.templates.TemplateBaseTpl
 */
package org.xmdlab.cartridge.jee.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade
import org.xmdlab.cartridge.common.template.Template

abstract class ReadmeMdTplBase implements Template {
	
	@Inject extension ApplicationMetafacade applicationMetafacade

	override generate() '''
		«doGenerate()»
	'''

	def String doGenerate()
	
	def getApplicationMetafacade() {
		return applicationMetafacade
	}
}
