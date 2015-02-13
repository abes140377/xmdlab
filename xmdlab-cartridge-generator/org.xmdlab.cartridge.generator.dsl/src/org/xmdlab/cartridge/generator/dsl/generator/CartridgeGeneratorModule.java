package org.xmdlab.cartridge.generator.dsl.generator;

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.xmdlab.cartridge.generator.dsl.io.CartridgeOutputsConfigurationProvider;
import org.xmdlab.cartridge.generator.dsl.io.OutputConfigurationAwareFileSystemAccess;

import com.google.inject.AbstractModule;

/**
 * 
 * @author freund
 *
 */
public class CartridgeGeneratorModule extends AbstractModule {

	@Override
	protected void configure() {
		// configure OutputsConfigurationProvider
		bind(IOutputConfigurationProvider.class).to(
				CartridgeOutputsConfigurationProvider.class);

		// configure FileSystemAccess
		bind(JavaIoFileSystemAccess.class).to(
				OutputConfigurationAwareFileSystemAccess.class);
	}
}