package org.xmdlab.cartridge.generator.dsl.util

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Before
import org.junit.runner.RunWith
import org.xmdlab.cartridge.generator.dsl.CartridgeGeneratorInjectorProviderCustom
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslModel
import com.google.common.io.Files
import java.io.File
import com.google.common.base.Charsets
import org.junit.Test
import org.eclipse.ui.internal.keys.model.ModelElement

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CartridgeGeneratorInjectorProviderCustom))
class ModelHelperTest {

	@Inject extension ParseHelper<DslModel>
	
	var static DslModel model
	
	@Before
	def void beforeClass() {
		model = Files.toString(new File("resource/jee/jee.cartridge"), Charsets.UTF_8).parse

		Assert.assertNotNull(model)
	}
	
	@Test
	def void testGetMetafacadeModelElementClassName() {
		val result = ModelHelper.getMetafacadeModelElementClassName(model.cartridge.metafacades.head)
		
		Assert.assertEquals("org.xmdlab.jee.application.mm.MmApplication" , result)
	}
	
	@Test
	def void testGetMetafacadeModelElementSimpleClassName() {
		val result = ModelHelper.getMetafacadeModelElementSimpleClassName(model.cartridge.metafacades.head)
		
		Assert.assertEquals("MmApplication" , result)
	}
	
	@Test
	def void testGetTemplateNameFromPathWithoutSuffix() {
		val result = ModelHelper.getTemplateNameFromPathWithoutSuffix(model.cartridge.templates.head)
		
		Assert.assertEquals("ReadmeMd" , result)
	}
	
	@Test
	def void testGetDslModelClassName() {
		val result = ModelHelper.getDslModelClassName(model.cartridge)
		
		Assert.assertEquals("org.xmdlab.dsl.application.applicationDsl.DslModel" , result)
	}
	
	@Test
	def void getDslModelClassSimpleName() {
		val result = ModelHelper.getDslModelClassSimpleName(model.cartridge)
		
		Assert.assertEquals("DslModel" , result)
	}
	
	@Test
	def void testGetTransformationInputClassName() {
		val result = ModelHelper.getTransformationInputClassName(model.cartridge)
		
		Assert.assertEquals("org.xmdlab.dsl.application.applicationDsl.DslApplication" , result)
	}
	
	@Test
	def void testGetTransformationInputClassSimpleName() {
		val result = ModelHelper.getTransformationInputClassSimpleName(model.cartridge)
		
		Assert.assertEquals("DslApplication" , result)
	}
	
	@Test
	def void testGetTransformationOutputClassName() {
		val result = ModelHelper.getTransformationOutputClassName(model.cartridge)
		
		Assert.assertEquals("org.xmdlab.jee.application.mm.MmApplication" , result)
	}
	
	@Test
	def void testGetTransformationOutputClassSimpleName() {
		val result = ModelHelper.getTransformationOutputClassSimpleName(model.cartridge)
		
		Assert.assertEquals("MmApplication" , result)
	}
}
