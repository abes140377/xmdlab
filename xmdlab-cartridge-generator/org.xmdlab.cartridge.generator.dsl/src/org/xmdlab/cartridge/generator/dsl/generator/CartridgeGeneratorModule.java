package org.xmdlab.cartridge.generator.dsl.generator;

import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

import com.google.inject.AbstractModule;

public class CartridgeGeneratorModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(OutputConfigurationProvider.class).to(
				CartridgeOutputsConfigurationProvider.class);
		bind(JavaIoFileSystemAccess.class).to(
				OutputConfigurationAwareFileSystemAccess.class);
	}
}