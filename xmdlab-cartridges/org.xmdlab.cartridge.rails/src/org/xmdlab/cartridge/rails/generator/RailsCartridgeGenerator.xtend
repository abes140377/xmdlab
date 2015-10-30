/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorXtendTpl
 */
package org.xmdlab.cartridge.rails.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.rails.metafacade.ApplicationMetafacade
import org.xmdlab.cartridge.rails.task.CreateInitialProjectTask
import org.xmdlab.cartridge.rails.util.RailsCartridgeProjectProperties

/**
 * The RailsCartridgeGeneratorStandaloneSetup
 *
 * @author Sebastian Freund<seba1403@googlemail.com>
 *
 */
class RailsCartridgeGenerator extends RailsCartridgeGeneratorBase {

	@Inject extension RailsCartridgeProjectProperties properties
	@Inject ApplicationMetafacade applicationMetafacade
	@Inject CreateInitialProjectTask createInitialProjectTask

	override void beforeCompileEclipseProject() {
		createInitialProjectTask.run
	}

}