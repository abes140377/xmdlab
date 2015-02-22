package org.xmdlab.cartridge.common.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.util.RuntimeIOException;
import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext;

import com.google.common.collect.Maps;
import com.google.common.io.ByteStreams;

/**
 * 
 * @author seba
 *
 */
public class OutputConfigurationAwareFileSystemAccess extends
		JavaIoFileSystemAccess {

	final private static Logger LOG = Logger
			.getLogger(OutputConfigurationAwareFileSystemAccess.class);
	
	@Inject
	org.xmdlab.cartridge.common.generator.IOutputConfigurationProvider outputConfigurationProvider;

	private Map<String, OutputConfiguration> outputConfigurations;

	/**
	 * 
	 */
	@Override
	public void generateFile(String fileName, String outputName,
			CharSequence contents) throws RuntimeIOException {
		OutputConfiguration outputConfig = getOutputConfigurationForKey(outputName);
		File file = getFile(fileName, outputName);
		if (!createFolder(file.getParentFile(), outputConfig)) {
			return; // folder does not exist
		}

		if (!file.exists() || outputConfig.isOverrideExistingResources()) {
			LOG.info("Generate file: " + file);
			try {
				String encoding = getEncoding(getURI(fileName, outputName));
				OutputStreamWriter writer = new OutputStreamWriter(
						new FileOutputStream(file), encoding);
				try {
					writer.append(postProcess(fileName, outputName, contents,
							encoding));
					if (isWriteTrace()) {
						generateTrace(fileName, outputName, contents);
					}
				} finally {
					writer.close();
					XmdlabGeneratorContext.addGeneratedFile(file);
				}
			} catch (IOException e) {
				throw new RuntimeIOException(e);
			}
		} else {
			LOG.info("SKIPPED Generate file: " + file);
		}
	}

	/**
	 * 
	 */
	@Override
	public void generateFile(String fileName, String outputName,
			InputStream content) throws RuntimeIOException {
		OutputConfiguration outputConfig = getOutputConfigurationForKey(outputName);
		File file = getFile(fileName, outputName);
		if (!createFolder(file.getParentFile(), outputConfig)) {
			return; // folder does not exist
		}

		if (!file.exists() || outputConfig.isOverrideExistingResources()) {
			LOG.info("Generate file: " + file);
			try {
				OutputStream out = new BufferedOutputStream(
						new FileOutputStream(file));
				try {
					ByteStreams.copy(content, out);
				} finally {
					try {
						out.close();
					} finally {
						content.close();
						XmdlabGeneratorContext.addGeneratedFile(file);
					}
				}
			} catch (IOException e) {
				throw new RuntimeIOException(e);
			}
		} else {
			LOG.info("SKIPPED Generate file: " + file);
		}
	}

	/**
	 * 
	 * @param parent
	 * @param outputConfig
	 * @return
	 */
	protected boolean createFolder(File parent, OutputConfiguration outputConfig) {
		if (parent != null && !parent.exists()
				&& outputConfig.isCreateOutputDirectory() && !parent.mkdirs()) {
			LOG.error("Could not create directory " + parent);
			throw new RuntimeIOException("Could not create directory " + parent);
		}
		return parent != null && parent.exists();
	}

	protected OutputConfiguration getOutputConfigurationForKey(String key) {
		if (outputConfigurations == null) {
			outputConfigurations = Maps.newHashMap();
			for (Map.Entry<String, OutputConfiguration> entry : outputConfigurationProvider
					.getOutputConfigurations().entrySet()) {
				// outputConfigurations.put(out.getName(), out);
				outputConfigurations.put(entry.getKey(), entry.getValue());
			}
		}
		return outputConfigurations.get(key);
	}
}