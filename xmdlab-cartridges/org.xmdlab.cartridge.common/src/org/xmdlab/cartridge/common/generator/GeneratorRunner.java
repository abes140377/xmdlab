package org.xmdlab.cartridge.common.generator;

import java.io.File;
import java.util.Properties;

import org.xmdlab.cartridge.common.context.XmdlabGeneratorResult;

public interface GeneratorRunner {

	/**
	 * 
	 * @param setupClassName
	 * @param modelFile
	 * @param generatorProperties
	 * @return
	 */
	public XmdlabGeneratorResult run(File modelFile,
			Properties generatorProperties);
}
