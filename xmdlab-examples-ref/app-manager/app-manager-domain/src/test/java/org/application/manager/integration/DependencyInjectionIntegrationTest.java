package org.application.manager.integration;

import javax.inject.Inject;

import org.application.manager.arquillian.AppManagerDomainDeployment;
import org.application.manager.ejb.TestEJB;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Arquillian.class)
public class DependencyInjectionIntegrationTest {

	Logger log = LoggerFactory
			.getLogger(DependencyInjectionIntegrationTest.class);

	@Inject
	private TestEJB testEjb;

	@Deployment
	public static WebArchive createDeployment() {
		return AppManagerDomainDeployment.createWarDeployment();
	}

	@Test
	public void testCDI() throws Exception {
		log.info(testEjb.helloWorld());

		Assert.assertEquals("hello world", testEjb.helloWorld());
	}
}