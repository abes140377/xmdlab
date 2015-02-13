package org.xmdlab.cartridge.generator.dsl.generator;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.apache.log4j.Logger;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.util.RuntimeIOException;

import com.google.common.io.ByteStreams;

public class OutputConfigurationAwareFileSystemAccess extends
		JavaIoFileSystemAccess {
	
	final private static Logger log = Logger.getLogger(OutputConfigurationAwareFileSystemAccess.class);

	@Override
	public void generateFile(String fileName, String outputName,
			CharSequence contents) throws RuntimeIOException {
		OutputConfiguration outputConfig = getOutputConfig(outputName);
		File file = getFile(fileName, outputName);
		if (!createFolder(file.getParentFile(), outputConfig)) {
			return; // folder does not exist
		}

		if (!file.exists() || outputConfig.isOverrideExistingResources()) {
			log.info("Generate file: " + file);
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
				}
			} catch (IOException e) {
				throw new RuntimeIOException(e);
			}
		} else {
			log.info("SKIPPED Generate file: " + file);
		}
	}

	@Override
	public void generateFile(String fileName, String outputName,
			InputStream content) throws RuntimeIOException {
		OutputConfiguration outputConfig = getOutputConfig(outputName);
		File file = getFile(fileName, outputName);
		if (!createFolder(file.getParentFile(), outputConfig)) {
			return; // folder does not exist
		}

		if (!file.exists() || outputConfig.isOverrideExistingResources()) {
			log.info("Generate file: " + file);
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
					}
				}
			} catch (IOException e) {
				throw new RuntimeIOException(e);
			}
		} else {
			log.info("SKIPPED Generate file: " + file);
		}
	}

	protected boolean createFolder(File parent, OutputConfiguration outputConfig) {
		if (parent != null && !parent.exists()
				&& outputConfig.isCreateOutputDirectory() && !parent.mkdirs()) {
			log.error("Could not create directory " + parent);
			throw new RuntimeIOException("Could not create directory " + parent);
		}
		return parent != null && parent.exists();
	}

}