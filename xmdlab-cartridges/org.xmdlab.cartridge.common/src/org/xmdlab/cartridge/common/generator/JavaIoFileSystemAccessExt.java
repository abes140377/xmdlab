package org.xmdlab.cartridge.common.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.RuntimeIOException;
import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext;

/**
 * 
 * @author seba
 *
 */
public class JavaIoFileSystemAccessExt extends JavaIoFileSystemAccess {

	@Override
	public void generateFile(String fileName, String outputConfigName,
			CharSequence contents) throws RuntimeIOException {
		File file = getFile(fileName, outputConfigName);
		try {
			createFolder(file.getParentFile());
			String encoding = getEncoding(getURI(fileName, outputConfigName));
			OutputStreamWriter writer = new OutputStreamWriter(
					new FileOutputStream(file), encoding);
			try {
				writer.append(postProcess(fileName, outputConfigName, contents,
						encoding));
				if (isWriteTrace())
					generateTrace(fileName, outputConfigName, contents);
			} finally {
				writer.close();
				XmdlabGeneratorContext.addGeneratedFile(file);
			}
		} catch (IOException e) {
			throw new RuntimeIOException(e);
		}
	}
}