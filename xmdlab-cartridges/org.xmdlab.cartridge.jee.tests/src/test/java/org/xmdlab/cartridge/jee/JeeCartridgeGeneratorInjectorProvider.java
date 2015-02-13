package org.xmdlab.cartridge.jee;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipse.xtext.junit4.IRegistryConfigurator;
import org.xmdlab.cartridge.jee.io.JeeCartridgeOutputConfigurationProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * 
 * @author seba
 *
 */
public class JeeCartridgeGeneratorInjectorProvider implements
		IInjectorProvider, IRegistryConfigurator {

	protected GlobalStateMemento stateBeforeInjectorCreation;
	protected GlobalStateMemento stateAfterInjectorCreation;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}

	/**
	 * 
	 */
	public Injector getInjector() {
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries
					.makeCopyOfGlobalState();
			this.injector = internalCreateInjector();
			stateAfterInjectorCreation = GlobalRegistries
					.makeCopyOfGlobalState();
		}
		return injector;
	}

	protected Injector internalCreateInjector() {
		return new JeeCartridgeGeneratorStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(new JeeCartridgeGeneratorModule() {
					// this is required only by the CompilationTestHelper since
					// Xtext 2.7
//					@SuppressWarnings("unused")
//					public Class<? extends org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport> bindMutableFileSystemSupport() {
//						return org.eclipse.xtext.xbase.file.JavaIOFileSystemSupport.class;
//					}

					// this is required only by the CompilationTestHelper since
					// Xtext 2.7
//					@SuppressWarnings("unused")
//					public Class<? extends com.google.inject.Provider<org.eclipse.xtext.xbase.file.WorkspaceConfig>> provideWorkspaceConfig() {
//						return org.eclipse.xtext.xbase.file.RuntimeWorkspaceConfigProvider.class;
//					}

					@SuppressWarnings("unused")
					public Class<? extends org.xmdlab.cartridge.common.generator.IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
						return JeeCartridgeOutputConfigurationProvider.class;
					}
				});
			}
		}.createInjectorAndDoEMFRegistration();
		
//		return new JeeCartridgeGeneratorStandaloneSetup()
//				.createInjectorAndDoEMFRegistration();
	}

	public void restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
	}

	public void setupRegistry() {
		getInjector();
		stateAfterInjectorCreation.restoreGlobalState();
	}
}
