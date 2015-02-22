package org.xmdlab.cartridge.common.io

import java.util.Map
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.OutputConfiguration

class DefaultOutputConfigurationProvider implements org.xmdlab.cartridge.common.generator.IOutputConfigurationProvider {

	Map<String, OutputConfiguration> outputs = newHashMap();

	def override Map<String, OutputConfiguration> getOutputConfigurations() {
		//
		var OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT)
		defaultOutput.setDescription("Output Folder");
		defaultOutput.setOutputDirectory("./src-gen");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);
		defaultOutput.setKeepLocalHistory(true);

		outputs.put(IFileSystemAccess.DEFAULT_OUTPUT, defaultOutput);

		return outputs;
	}
}
