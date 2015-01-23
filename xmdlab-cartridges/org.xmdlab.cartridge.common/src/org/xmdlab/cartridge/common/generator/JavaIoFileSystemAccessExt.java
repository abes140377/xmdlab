package org.xmdlab.cartridge.common.generator;

import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

public class JavaIoFileSystemAccessExt extends JavaIoFileSystemAccess {
	// @Inject
	// @Named("java")
	// private IPostProcessor javaPostProcessor;

	@Override
	public void generateFile(String fileName, CharSequence contents) {
		// if (javaPostProcessor.accepts(fileName)) {
		// contents = javaPostProcessor.process(fileName, contents);
		// }
		super.generateFile(fileName, contents);
	}
}