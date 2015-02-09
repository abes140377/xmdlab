package org.xmdlab.cartridge.common.generator

import org.eclipse.xtext.generator.IFileSystemAccess

interface IGenerator<M> {
	
	/**
	 * @param fsa - file system access to be used to generate files
	 */
	def void doGenerate(M mmEObject, IFileSystemAccess fsa);
}