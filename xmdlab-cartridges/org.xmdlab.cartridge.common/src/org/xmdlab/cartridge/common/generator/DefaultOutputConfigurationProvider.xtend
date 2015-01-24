package org.xmdlab.cartridge.common.generator

import java.util.Map
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.OutputConfiguration

class DefaultOutputConfigurationProvider {

	Map<String, OutputConfiguration> outputs = newHashMap();

	def Map<String, OutputConfiguration> getOutputConfigurations() {
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
