package org.xmdlab.cartridge.generator.dsl.io

import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class CartridgeOutputsConfigurationProvider implements IOutputConfigurationProvider {

	//	@Inject extension GeneratorProperties generatorProperties
	public static final String BASEDIR_OUTPUT = "basedir"
	public static final String GEN_MAN_OUTPUT = "gen-man"
	public static final String TEST_GEN_OUTPUT = "test-gen"

	/**
	 * @see IOutputConfigurationProvider.getOutputConfigurations()
	 */
	override getOutputConfigurations() {
		var Set<OutputConfiguration> outputs = newHashSet()

		//
		var OutputConfiguration basedirOutput = new OutputConfiguration(BASEDIR_OUTPUT)
		basedirOutput.setDescription("Basedir output folder")
		basedirOutput.setOutputDirectory(".")
		basedirOutput.setOverrideExistingResources(false)
		basedirOutput.setCreateOutputDirectory(true)
		basedirOutput.setCleanUpDerivedResources(false)
		basedirOutput.setSetDerivedProperty(false)
		basedirOutput.setKeepLocalHistory(false)

		outputs.add(basedirOutput)

		//
		var OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT)
		defaultOutput.setDescription("Folder for generated souce files")
		defaultOutput.setOutputDirectory("./src-gen")
		defaultOutput.setOverrideExistingResources(true)
		defaultOutput.setCreateOutputDirectory(true)
		defaultOutput.setCleanUpDerivedResources(true)
		defaultOutput.setSetDerivedProperty(true)
		defaultOutput.setKeepLocalHistory(true)

		outputs.add(defaultOutput)

		//
		var OutputConfiguration readonlyOutput = new OutputConfiguration(GEN_MAN_OUTPUT)
		readonlyOutput.setDescription("Folder for manualy written souce files")
		readonlyOutput.setOutputDirectory("./src/main/java")
		readonlyOutput.setOverrideExistingResources(false)
		readonlyOutput.setCreateOutputDirectory(true)
		readonlyOutput.setCleanUpDerivedResources(false)
		readonlyOutput.setSetDerivedProperty(false)
		basedirOutput.setKeepLocalHistory(false)

		outputs.add(readonlyOutput)

		//
		var OutputConfiguration testGeneratedOutput = new OutputConfiguration(TEST_GEN_OUTPUT)
		testGeneratedOutput.setDescription("Folder for manualy written souce files")
		testGeneratedOutput.setOutputDirectory("./test-src-gen")
		testGeneratedOutput.setOverrideExistingResources(false)
		testGeneratedOutput.setCreateOutputDirectory(true)
		testGeneratedOutput.setCleanUpDerivedResources(false)
		testGeneratedOutput.setSetDerivedProperty(false)
		basedirOutput.setKeepLocalHistory(false)

		outputs.add(testGeneratedOutput)

		return outputs
	}

}
