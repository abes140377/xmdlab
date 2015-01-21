package org.xmdlab.cartridge.generator.dsl.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge

/**
 * 
 */
class ManifestMfTpl {

	@Inject extension GeneratorProperties generatorProperties

	/**
	 * 
	 */
	def generate(DslCartridge dslCartridge) '''
		Manifest-Version: 1.0
		Bundle-ManifestVersion: 2
		Bundle-Name: Xgen ejb cartridge
		Bundle-SymbolicName: «basePackage».«cartridgeName»
		Bundle-Version: x.y.z(.qualifier)
		Bundle-RequiredExecutionEnvironment: JavaSE-1.7
«««		Require-Bundle: «inputModelBundle»,
«««		 «outputModelBundle»,
		 de.freund.xgen.cartridge.namespace.dsl,
		 de.freund.xgen.cartridge.metafacade.dsl,
		 de.freund.xgen.cartridge.dsl,
		 org.eclipse.core.runtime,
		 org.eclipse.core.resources,
		 org.eclipse.emf.mwe2.launch,
		 org.apache.log4j,
		 org.eclipse.xtext.xbase.lib
	'''
}
