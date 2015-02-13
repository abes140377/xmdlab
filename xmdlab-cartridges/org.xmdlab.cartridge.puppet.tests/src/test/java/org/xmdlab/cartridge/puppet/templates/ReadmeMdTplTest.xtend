package org.xmdlab.cartridge.puppet.templates

import org.apache.log4j.Logger
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.puppet.PuppetCartridgeGeneratorInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(PuppetCartridgeGeneratorInjectorProvider))
class ReadmeMdTplTest {

	private final static Logger LOG = Logger.getLogger(ReadmeMdTplTest);

	//	@Inject ApplicationMetafacade applicationMetafacade
	//	@Inject ReadmeMdTpl readmeMdTpl
	@Before
	def void beforeClass() {
		//		var MmApplication application = MmFactory.eINSTANCE.createMmApplication
		//		application.basePackage = "de.xmdlab.test"
		//		application.name = "TestEntity"
		//		
		//		applicationMetafacade.modelResource = application
		//		LOG.info(readmeMdTpl.generate())
	}

	@Test
	def void testInjection() {
		//		assertEquals("# TODO TestEntity", readmeMdTpl.generate().toString.trim)
	}
}
