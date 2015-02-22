package org.xmdlab.cartridge.common.io

import com.google.common.collect.Maps
import com.google.inject.Inject
import java.io.File
import java.util.Map
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.OutputConfiguration
import org.xmdlab.cartridge.common.generator.IOutputConfigurationProvider

/**
 * 
 */
public class GenFile {

	@Inject OutputConfigurationAwareFileSystemAccess fsa
	@Inject IOutputConfigurationProvider outputConfigurationProvider

	private Map<String, OutputConfiguration> outputConfigurations;

	/**
	 * 
	 */
	def public void generateFile(String fileName, CharSequence contents, boolean overrideExisting) {
		generateFile(fileName, OutputConfigurationAwareFileSystemAccess.DEFAULT_OUTPUT, contents, false)
	}

	/**
	 * 
	 */
	def public void generateFile(String fileName, CharSequence contents) {
		generateFile(fileName, OutputConfigurationAwareFileSystemAccess.DEFAULT_OUTPUT, contents, false)
	}

	/**
     * 
     */
	def public void generateFile(String fileName, String outputConfig, CharSequence contents) {
		generateFile(fileName, outputConfig, contents, false)
	}

	/**
     * 
     */
	def public void generateFile(String fileName, String outputConfig, CharSequence contents, boolean overrideExisting) {
		fsa.generateFile(fileName, outputConfig, contents, overrideExisting);
	}

	/**
     * 
     */
	def boolean fileExists(IFileSystemAccess fsa, String outputConfigurationName, String path) {
		val String fullPath = getOutputConfiguration(outputConfigurationName).getOutputDirectory() + "/" + path;
		val File f = new File(fullPath);
		return f.exists() && f.isFile();
	}

	/**
	 * 
	 */
	def OutputConfiguration getOutputConfiguration(String key) {
		if (outputConfigurations == null) {
			outputConfigurations = Maps.newHashMap();
			for (Map.Entry<String, OutputConfiguration> entry : outputConfigurationProvider.getOutputConfigurations().
				entrySet()) {
				outputConfigurations.put(entry.getKey(), entry.getValue());
			}
		}
		return outputConfigurations.get(key);
	}
}
