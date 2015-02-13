package org.xmdlab.cartridge.puppet.generator

interface GeneratorTest<T> {

	def T getDslmodel(String modelFilePath)
}
