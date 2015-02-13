package org.xmdlab.cartridge.jee.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.xmdlab.cartridge.common.generator.IGenerator
import org.xmdlab.cartridge.common.util.FileHelper
import static org.junit.Assert.*
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

/**
 * 
 */
class BaseGeneratorTest<T extends EObject> implements GeneratorTest<T> {

	val protected fsa = new InMemoryFileSystemAccess()

	@Inject protected IGenerator generator
	@Inject protected ParseHelper<T> parseHelper
	@Inject ValidationTestHelper validationTester

	/**
	 * 
	 */
	override T getDslmodel(String modelFilePath) {
		val modelString = FileHelper.readFile(modelFilePath)

		val model = parseHelper.parse(modelString)

		// Helper to test all validation rules and ensure resolved links
		validationTester.assertNoIssues(model)

		val dslModel = model.eResource.contents.get(0) as T

		return dslModel
	}

	/**
	 * 
	 */
	def assertExistenceAndContent(String outlet, String fileName) {
		val outletAndFileName = outlet + fileName

		assertTrue(fsa.textFiles.containsKey(outletAndFileName))

		val expectedContent = FileHelper.readFile("src/test/resources/expected/" + fileName)

		val actualContent = fsa.textFiles.get(outletAndFileName).toString

		assertEquals("Expected content \n" + expectedContent + "\n is not equal to \n" + actualContent, expectedContent, actualContent)
	}
}
