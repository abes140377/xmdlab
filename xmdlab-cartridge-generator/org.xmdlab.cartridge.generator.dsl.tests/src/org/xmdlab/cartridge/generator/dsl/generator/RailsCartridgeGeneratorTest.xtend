package org.xmdlab.cartridge.generator.dsl.generator

import com.google.inject.Inject
import java.util.Scanner
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.generator.dsl.CartridgeGeneratorInjectorProviderCustom
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.xmdlab.cartridge.generator.dsl.GeneratorConstants

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CartridgeGeneratorInjectorProviderCustom))
class PuppetCartridgeGeneratorTest {

	@Inject extension CompilationTestHelper compilationTestHelper

	val modelName = 'rails'
	var String modelAsString = null

	@Before
	def void before() {
		val propertyFileContent = '''
			cartridge : {
				name : «modelName»
				basePackage : de.freund.xgen.cartridge.«modelName»
			}
		'''
		compilationTestHelper.copyToWorkspace("myProject/src/" + GeneratorConstants::CARTRIDGE_CONF_FILENAME,
			propertyFileContent)

		modelAsString = new Scanner(getClass.getResourceAsStream("/rails/" + modelName + ".cartridge"), GeneratorConstants::ENCODING).
			useDelimiter("\\A").next();
	}

	@Test
	def void testGeneratedCode() {
		val String result = new Scanner(
			getClass.getResourceAsStream("/rails/" + modelName + "-generator-test-result.txt"), GeneratorConstants::ENCODING).
			useDelimiter("\\A").next();
		modelAsString.assertCompilesTo(
			'''
				«result»
			''')
	}
}
