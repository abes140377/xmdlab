package org.xmdlab.cartridge.generator.dsl.parser

import com.google.inject.Inject
import java.util.Scanner
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.generator.dsl.CartridgeGeneratorInjectorProviderCustom
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslModel
import org.xmdlab.cartridge.generator.dsl.GeneratorConstants

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CartridgeGeneratorInjectorProviderCustom))
class PuppetSimpleCartridgeGeneratorParserTest {

	@Inject extension ParseHelper<DslModel>
	@Inject extension ValidationTestHelper

	val static cartridgeName = 'puppet'

	var static String modelAsString = null

	@Before
	def void beforeClass() {
		modelAsString = new Scanner(getClass.getResourceAsStream("/puppet/" + cartridgeName + ".cartridge"), GeneratorConstants::ENCODING).
			useDelimiter("\\A").next();
	}

	/**
	 * 
	 */
	@Test
	def void testParsing() {
		modelAsString.parse.assertNoErrors
	}

	/**
	 * 
 	 */
	@Test
	def void testValuesAfterParsing() {
		val model = modelAsString.parse

		Assert::assertEquals(cartridgeName, model.cartridge.name)
	}
}
