package org.xmdlab.cartridge.generator.dsl;

import org.xmdlab.cartridge.generator.dsl.generator.CartridgeOutputsConfigurationProvider;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CartridgeGeneratorInjectorProviderCustom extends CartridgeDslInjectorProvider {

	@Override
	protected Injector internalCreateInjector() {
		return new CartridgeDslStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(new CartridgeDslRuntimeModule() {
					// this is required only by the CompilationTestHelper since
					// Xtext 2.7
					@SuppressWarnings("unused")
					public Class<? extends org.eclipse.xtend.lib.macro.file.MutableFileSystemSupport> bindMutableFileSystemSupport() {
						return org.eclipse.xtext.xbase.file.JavaIOFileSystemSupport.class;
					}

					// this is required only by the CompilationTestHelper since
					// Xtext 2.7
					@SuppressWarnings("unused")
					public Class<? extends com.google.inject.Provider<org.eclipse.xtext.xbase.file.WorkspaceConfig>> provideWorkspaceConfig() {
						return org.eclipse.xtext.xbase.file.RuntimeWorkspaceConfigProvider.class;
					}
					
					@SuppressWarnings("unused")
					public Class<? extends org.eclipse.xtext.generator.IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
						return CartridgeOutputsConfigurationProvider.class;
					}
				});
			}
		}.createInjectorAndDoEMFRegistration();
	}
}
