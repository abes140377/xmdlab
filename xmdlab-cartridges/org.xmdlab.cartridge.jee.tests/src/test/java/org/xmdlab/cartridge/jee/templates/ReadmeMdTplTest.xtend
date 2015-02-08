package org.xmdlab.cartridge.jee.templates

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.jee.JeeCartridgeGeneratorInjectorProvider
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade
import com.google.inject.Inject
import org.xmdlab.jee.application.mm.MmFactory
import org.apache.log4j.Logger
import static org.junit.Assert.*
import org.junit.Before
import org.xmdlab.jee.application.mm.MmApplication

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(JeeCartridgeGeneratorInjectorProvider))
class ReadmeMdTplTest {
	
	private final static Logger LOG = Logger.getLogger(ReadmeMdTplTest);

	@Inject ApplicationMetafacade applicationMetafacade
	@Inject ReadmeMdTpl readmeMdTpl
	
	@Before
	def void beforeClass() {
		var MmApplication application = MmFactory.eINSTANCE.createMmApplication
		application.basePackage = "de.xmdlab.test"
		application.name = "TestEntity"
		
		applicationMetafacade.modelResource = application
		LOG.info(readmeMdTpl.generate())
	}

	@Test
	def void testInjection() {		
		assertEquals("# TODO TestEntity", readmeMdTpl.generate().toString.trim)
	}
}
