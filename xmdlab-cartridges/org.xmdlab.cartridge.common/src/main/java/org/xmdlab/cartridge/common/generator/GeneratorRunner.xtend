package org.xmdlab.cartridge.common.generator

import java.io.File
import org.xmdlab.cartridge.common.context.XmdlabGeneratorResult

/**
 * 
 */
interface GeneratorRunner {
	
	/**
	 * 
	 */
	def XmdlabGeneratorResult run(File modelFile)
}
