package org.xmdlab.cartridge.jee.templates;

import com.google.inject.Inject;
import org.apache.log4j.Logger;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmdlab.cartridge.jee.JeeCartridgeGeneratorInjectorProvider;
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade;
import org.xmdlab.cartridge.jee.templates.ReadmeMdTpl;
import org.xmdlab.jee.application.mm.Application;
import org.xmdlab.jee.application.mm.MmFactory;

@RunWith(XtextRunner.class)
@InjectWith(JeeCartridgeGeneratorInjectorProvider.class)
@SuppressWarnings("all")
public class ReadmeMdTplTest {
  private final static Logger LOG = Logger.getLogger(ReadmeMdTplTest.class);
  
  @Inject
  private ApplicationMetafacade applicationMetafacade;
  
  @Inject
  private ReadmeMdTpl readmeMdTpl;
  
  @Before
  public void beforeClass() {
    Application application = MmFactory.eINSTANCE.createApplication();
    application.setBasePackage("de.xmdlab.test");
    application.setName("TestEntity");
    this.applicationMetafacade.setModelResource(application);
    String _generate = this.readmeMdTpl.generate();
    ReadmeMdTplTest.LOG.info(_generate);
  }
  
  @Test
  public void testInjection() {
    String _generate = this.readmeMdTpl.generate();
    String _string = _generate.toString();
    String _trim = _string.trim();
    Assert.assertEquals("# TODO TestEntity", _trim);
  }
}
