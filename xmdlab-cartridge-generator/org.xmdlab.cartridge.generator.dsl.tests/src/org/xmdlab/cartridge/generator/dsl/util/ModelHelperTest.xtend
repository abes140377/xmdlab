package org.xmdlab.cartridge.generator.dsl.util

import org.junit.Test
import org.junit.Assert

class ModelHelperTest {
	
	@Test
	def void testGetMmFactory() {
		val transformationOutput = 'org.xmdlab.rails.application.mm.Application'
		
		val String result = ModelHelper.getMmFactory(transformationOutput)
		
		Assert.assertEquals('org.xmdlab.rails.application.mm.MmFactory', result)
	}
	
	@Test
	def void testGetMmRootClassSimpleName() {
		val transformationOutput = 'org.xmdlab.rails.application.mm.Application'
		
		val String result = ModelHelper.getMmRootClassSimpleName(transformationOutput)
		
		Assert.assertEquals('Application', result)
	}
	
	@Test
	def void testGetMmFactoryFromTransformationOutput() {
		val String transformationOutput = 'org.xmdlab.rails.application.mm.RailsApplication'
		
		val String result = ModelHelper.getMmFactory(transformationOutput)
		
		Assert.assertEquals('org.xmdlab.rails.application.mm.MmFactory', result)
	}
	
	@Test
	def void getDslRootClass() {
		val String transformationInput = 'org.xmdlab.dsl.application.applicationDsl.DslModel'
		
		val String result = ModelHelper.getDslRootClass(transformationInput)
		
		Assert.assertEquals('DslModel', result)
	}
}
