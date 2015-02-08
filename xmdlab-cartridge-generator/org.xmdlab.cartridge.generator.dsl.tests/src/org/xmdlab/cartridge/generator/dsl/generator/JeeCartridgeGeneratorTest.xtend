package org.xmdlab.cartridge.generator.dsl.generator

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.generator.dsl.CartridgeGeneratorInjectorProviderCustom
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.xmdlab.cartridge.generator.dsl.GeneratorConstants
import java.io.File
import com.google.common.io.Files
import com.google.common.base.Charsets

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CartridgeGeneratorInjectorProviderCustom))
class JeeCartridgeGeneratorTest {

	@Inject extension CompilationTestHelper compilationTestHelper

	val modelName = 'jee'
	var String modelAsString = null

	@Before
	def void before() {
		val propertyFileContent = Files.toString(new File("resource/jee/" +"cartridge.conf"), Charsets.ISO_8859_1)
		
		compilationTestHelper.copyToWorkspace("myProject/src/" + GeneratorConstants::CARTRIDGE_CONF_FILENAME,
			propertyFileContent)
		
		modelAsString = Files.toString(new File("resource/jee/" + modelName + ".cartridge"), Charsets.ISO_8859_1)
	}

	@Test
	def void testGeneratedCode() {
		val String result = Files.toString(new File("resource/jee/" + modelName + "-generator-test-result.txt"), Charsets.ISO_8859_1)
		
		modelAsString.assertCompilesTo(result)
	}
}
