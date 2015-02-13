package org.xmdlab.cartridge.generator.dsl.generator

import com.google.common.base.Charsets
import com.google.common.io.Files
import com.google.inject.Inject
import java.io.File
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.generator.dsl.CartridgeGeneratorInjectorProviderCustom
import org.xmdlab.cartridge.generator.dsl.util.ExtCompilationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(CartridgeGeneratorInjectorProviderCustom))
class PuppetCartridgeGeneratorTest {

	@Inject extension ExtCompilationTestHelper compilationTestHelper

	val modelName = 'puppet'
	var String modelAsString = null

	@Before
	def void before() {
		val propertyFileContent = Files.toString(new File("resource/" + modelName + "/" + "cartridge.conf"),
			Charsets.ISO_8859_1)

		compilationTestHelper.copyToWorkspace("myProject/src/" + GeneratorConstants::CARTRIDGE_CONF_FILENAME,
			propertyFileContent)

		modelAsString = Files.toString(new File("resource/" + modelName + "/" + modelName + ".cartridge"),
			Charsets.ISO_8859_1)
	}

	@Test
	def void testGeneratedCode() {
		val String basePath = new File('../..').absolutePath

		var srcFolders = newHashMap()
		srcFolders.put("base", basePath + "/xmdlab-cartridges/org.xmdlab.cartridge.puppet")
		srcFolders.put("src", basePath + "/xmdlab-cartridges/org.xmdlab.cartridge.puppet/src/main/java")
		srcFolders.put("src-gen", basePath + "/xmdlab-cartridges/org.xmdlab.cartridge.puppet/src-gen")

		modelAsString.assertCompilesToReference(srcFolders)
	}
}
