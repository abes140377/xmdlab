package org.xmdlab.cartridge.generator.dsl.util

import org.junit.Test
import org.junit.Assert

class ModelHelperTest {
	
	@Test
	def void testGetMmFactory() {
		val transformationOutput = 'org.xmdlab.mm.rails.application.Application'
		
		val String result = ModelHelper.getMmFactory(transformationOutput)
		
		Assert.assertEquals('org.xmdlab.mm.rails.application.ApplicationFactory', result)
	}
	
	@Test
	def void testGetMmRootClassSimpleName() {
		val transformationOutput = 'org.xmdlab.mm.rails.application.Application'
		
		val String result = ModelHelper.getMmRootClassSimpleName(transformationOutput)
		
		Assert.assertEquals('Application', result)
	}
	
	@Test
	def void testGetMmFactoryFromTransformationOutput() {
		val String transformationOutput = 'org.xmdlab.mm.rails.application.RailsApplication'
		
		val String result = ModelHelper.getMmFactory(transformationOutput)
		
		Assert.assertEquals('org.xmdlab.mm.rails.application.ApplicationFactory', result)
	}
	
	@Test
	def void getDslRootClass() {
		val String transformationInput = 'org.xmdlab.dsl.application.applicationDsl.DslModel'
		
		val String result = ModelHelper.getDslRootClass(transformationInput)
		
		Assert.assertEquals('DslModel', result)
	}
	
	//	@Test
	//	def testGetInputModelFactory() {
	//		var Input i = MetafacadeFactory.eINSTANCE.createInput()
	//		i.name = "de.freund.xgen.domainmodel.dsl.domainmodel.DslModel"
	//
	//		val result = getInputModelFactory(i)
	//
	//		assertEquals("de.freund.xgen.domainmodel.dsl.domainmodel.DomainmodelFactory", result)
	//	}
	//
	//	@Test
	//	def testGetOutputModelFactory() {
	//		var Output o = MetafacadeFactory.eINSTANCE.createOutput()
	//		o.name = "de.freund.xgen.mm.puppetsite.Site"
	//
	//		val result = getOutputModelFactory(o)
	//
	//		assertEquals("de.freund.xgen.mm.puppetsite.PuppetsiteFactory", result)
	//
	//	}
	//
	//	@Test
	//	def testGetOutputModelClass() {
	//		var Output o = MetafacadeFactory.eINSTANCE.createOutput()
	//		o.name = "de.freund.xgen.mm.puppetsite.Site"
	//
	//		val result = getOutputModelClass(o)
	//
	//		assertEquals("Site", result)
	//	}
	//
	//	@Test
	//	def testGetOutputModelPackage() {
	//		var Output o = MetafacadeFactory.eINSTANCE.createOutput()
	//		o.name = "de.freund.xgen.mm.puppetsite.Site"
	//
	//		val result = getOutputModelPackage(o)
	//
	//		assertEquals("de.freund.xgen.mm.puppetsite.PuppetsitePackage", result)
	//	}
	//
	//	@Test
	//	def testGetOutputModelBundle() {
	//		var Output o = MetafacadeFactory.eINSTANCE.createOutput()
	//		o.name = "de.freund.xgen.mm.puppetsite.Site"
	//
	//		val result = getOutputModelBundle(o)
	//
	//		assertEquals("de.freund.xgen.mm.puppetsite", result)
	//	}
	//	
	//	@Test
	//	def testGetInputModelBundle() {
	//		var Input i = MetafacadeFactory.eINSTANCE.createInput()
	//		i.name = "de.freund.xgen.domainmodel.dsl.domainmodel.DslModel"
	//
	//		val result = getInputModelBundle(i)
	//
	//		assertEquals("de.freund.xgen.domainmodel.dsl", result)
	//	}
}
