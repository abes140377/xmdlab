package org.xmdlab.cartridge.puppet.generator

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.puppet.PuppetCartridgeGeneratorInjectorProvider
import org.xmdlab.dsl.domain.domainDsl.DslModel

/**
 * 
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PuppetCartridgeGeneratorInjectorProvider))
class PuppetCartridgeGeneratorTest extends BaseGeneratorTest<DslModel> {

	// val static final Logger LOG = LoggerFactory.getLogger(PuppetCartridgeGeneratorTest)
	//	@Inject PuppetCartridgeTransformation transformation
	//	@Inject ApplicationMetafacade applicationMetafacade
	@Test
	def test() {
		val dslModel = getDslmodel("src/test/resources/model/test.domain")

	//		val MmNode application = transformation.transform(dslModel.app)
	//
	//		applicationMetafacade.modelResource = application
	//		
	//		generator.doGenerate(fsa)
	//
	//		// LOG.info(fsa.textFiles.toString)
	//
	//		// check expected number of generated files
	//		assertEquals(3, fsa.textFiles.size)
	//
	//		// check generated files
	//		assertExistenceAndContent(OUTPUTCONFIG_CORE_GENERATED_SRC, "Organisation.java")
	}
}
