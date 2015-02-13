package org.xmdlab.cartridge.generator.dsl.templates.test

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*

class CartridgeInjectorProviderTpl {

	@Inject extension GeneratorProperties generatorProperties

	def generate(DslCartridge dslCartridge) '''
		«getGeneratedComment(class.name)»
		package «basePackage»
		
		import org.eclipse.xtext.junit4.GlobalRegistries;
		import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
		import org.eclipse.xtext.junit4.IInjectorProvider;
		import org.eclipse.xtext.junit4.IRegistryConfigurator;
		
		import com.google.inject.Injector;
		
		public class «cartridgeName.toFirstUpper»CartridgeInjectorProvider implements IInjectorProvider, IRegistryConfigurator {
			
			protected GlobalStateMemento stateBeforeInjectorCreation;
			protected GlobalStateMemento stateAfterInjectorCreation;
			protected Injector injector;
		
			static {
				GlobalRegistries.initializeDefaults();
			}
		
			public Injector getInjector()
			{
				if (injector == null) {
					stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
					this.injector = internalCreateInjector();
					stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
				}
				return injector;
			}
			
			protected Injector internalCreateInjector() {
			    return new «cartridgeName.toFirstUpper»CartridgeGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
			}
		
			public void restoreRegistry() {
				stateBeforeInjectorCreation.restoreGlobalState();
			}
		
			public void setupRegistry() {
				getInjector();
				stateAfterInjectorCreation.restoreGlobalState();
			}
		}
	'''
}
