package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject

import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.util.StringHelper
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class CartridgeGeneratorStandaloneSetupTpl {
	
	@Inject extension GeneratorProperties generatorProperties

	def generate(DslCartridge dslCartridge) '''
		«val modelName = dslCartridge.name»
		«val modelNameFirstUpper = modelName.toFirstUpper»
		«val className = modelNameFirstUpper + "CartridgeGeneratorStandaloneSetup"»
		«StringHelper.getGeneratedComment(class.name)»
		package «basePackage»;
		
		import org.eclipse.xtext.util.Modules2;
		
		import com.google.inject.Guice;
		import com.google.inject.Injector;
		
		«StringHelper::getClassComment(className)»
		public class «modelNameFirstUpper»CartridgeGeneratorStandaloneSetup extends «getStandaloneSetupClass(dslCartridge)» {
		
			public static void doSetup() {
				new «modelNameFirstUpper»CartridgeGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
			}
			
			@Override
			public Injector createInjector() {
				// Reihenfolge ist entscheidend, «modelNameFirstUpper»CartridgeGeneratorModule
				// muss nach DomainmodelRuntimeModule kommen
				return Guice.createInjector(Modules2.mixin(
					new «getRuntimeModuleClass(dslCartridge)»(),
					new «modelNameFirstUpper»CartridgeGeneratorModule()));
			}
		}
	'''
}
