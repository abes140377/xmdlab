/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorStandaloneSetupTpl
 */
package org.xmdlab.cartridge.jee;

import org.eclipse.xtext.util.Modules2;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * The JeeCartridgeGeneratorStandaloneSetup
 *
 * @author Sebastian Freund<seba1403@googlemail.com>
 *
 */
public class JeeCartridgeGeneratorStandaloneSetup extends org.xmdlab.dsl.application.ApplicationDslStandaloneSetup {

	public static void doSetup() {
		new JeeCartridgeGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(
			new org.xmdlab.dsl.application.ApplicationDslRuntimeModule(),
			new JeeCartridgeGeneratorModule()));
	}
}
