package org.xmdlab.cartride.common.generator;

import java.io.File;
import java.util.Properties;

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
