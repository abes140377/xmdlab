package org.xmdlab.cartridge.jee.generator

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.jee.JeeCartridgeGeneratorInjectorProvider
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade
import org.xmdlab.cartridge.jee.transformation.JeeCartridgeTransformation
import org.xmdlab.dsl.application.applicationDsl.DslModel

import static org.junit.Assert.*
import static org.xmdlab.cartridge.jee.io.JeeCartridgeOutputConfigurationProvider.*
import org.xmdlab.jee.application.mm.MmApplication

/**
 * 
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(JeeCartridgeGeneratorInjectorProvider))
class JeeCartridgeGeneratorTest extends BaseGeneratorTest<DslModel> {

	// val static final Logger LOG = LoggerFactory.getLogger(JeeCartridgeGeneratorTest)

	@Inject JeeCartridgeTransformation transformation
	@Inject ApplicationMetafacade applicationMetafacade

	@Test
	def test() {
		val dslModel = getDslmodel("src/test/resources/model/app-manager.application")

		val MmApplication application = transformation.transform(dslModel.app)

		generator.doGenerate(application, fsa)

		// LOG.info(fsa.textFiles.toString)

		// check expected number of generated files
		assertEquals(3, fsa.textFiles.size)

		// check generated files
		assertExistenceAndContent(OUTPUTCONFIG_DOMAIN_SRC_GEN, "Organisation.java")
	}
}
