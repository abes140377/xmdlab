package org.xmdlab.cartridge.jee.generator

interface GeneratorTest<T> {

	def T getDslmodel(String modelFilePath)
}
