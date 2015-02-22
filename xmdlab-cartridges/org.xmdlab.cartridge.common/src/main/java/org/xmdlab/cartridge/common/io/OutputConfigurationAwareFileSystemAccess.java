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

	private Map<String, OutputConfiguration> outputs;

	/**
	 * 
	 * @param fileName
	 * @param outputName
	 * @param contents
	 * @param override
	 * @throws RuntimeIOException
	 */
	public void generateFile(String fileName, String outputName,
			CharSequence contents, boolean override) throws RuntimeIOException {
		OutputConfiguration outputConfig = getOutputConfig(outputName);
		File file = getFile(fileName, outputName);
		if (!createFolder(file.getParentFile(), outputConfig)) {
			LOG.info("Skip generate file "
					+ file
					+ " because parent dir doesn not exist and output configuration "
					+ outputName
					+ " is not configured to create the parent directory automaticaly.");
			return; // folder does not exist
		}

		if (!file.exists() || outputConfig.isOverrideExistingResources()
				|| override) {
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
			CharSequence contents) throws RuntimeIOException {
		generateFile(fileName, outputName, contents, false);
	}

	public void generateFile(String fileName, String outputName,
			InputStream content, boolean override) throws RuntimeIOException {
		OutputConfiguration outputConfig = getOutputConfig(outputName);
		File file = getFile(fileName, outputName);
		if (!createFolder(file.getParentFile(), outputConfig)) {
			return; // folder does not exist
		}

		if (!file.exists() || outputConfig.isOverrideExistingResources()
				|| override) {
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
	 */
	@Override
	public void generateFile(String fileName, String outputName,
			InputStream content) throws RuntimeIOException {
		generateFile(fileName, outputName, content, false);
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

	@Override
	protected OutputConfiguration getOutputConfig(String outputName) {
		if (outputs == null) {
			outputs = Maps.newHashMap();
			for (Map.Entry<String, OutputConfiguration> entry : outputConfigurationProvider
					.getOutputConfigurations().entrySet()) {
				outputs.put(entry.getKey(), entry.getValue());
			}
		}
		return outputs.get(outputName);
	}

	/**
	 * @since 2.1
	 */
	@Override
	public Map<String, OutputConfiguration> getOutputConfigurations() {
		return outputs;
	}
}