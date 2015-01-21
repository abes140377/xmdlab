package org.xmdlab.cartridge.generator.dsl.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class CartridgeOutputsConfigurationProvider extends
		OutputConfigurationProvider {

	public static final String BASEDIR_OUTPUT = "basedir";
	public static final String GEN_MAN_OUTPUT = "gen-man";

	/**
	 * @return a set of {@link OutputConfiguration} available for the generator
	 */
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> outputs = super.getOutputConfigurations();
		
		//
		OutputConfiguration basedirOutput = new OutputConfiguration(
				BASEDIR_OUTPUT);
		basedirOutput.setDescription("Basedir output folder");
		basedirOutput.setOutputDirectory(".");
		basedirOutput.setOverrideExistingResources(true);
		basedirOutput.setCreateOutputDirectory(true);
		basedirOutput.setCleanUpDerivedResources(true);
		basedirOutput.setSetDerivedProperty(true);
		basedirOutput.setKeepLocalHistory(true);

		outputs.add(basedirOutput);

		//
		OutputConfiguration readonlyOutput = new OutputConfiguration(
				GEN_MAN_OUTPUT);
		readonlyOutput.setDescription("Folder for manualy written souce files");
		readonlyOutput.setOutputDirectory("./src");
		readonlyOutput.setOverrideExistingResources(false);
		readonlyOutput.setCreateOutputDirectory(true);
		readonlyOutput.setCleanUpDerivedResources(false);
		readonlyOutput.setSetDerivedProperty(false);

		outputs.add(readonlyOutput);

		return outputs;
	}
}