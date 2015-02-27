package org.application.manager.service.integration;

import javax.inject.Inject;

import org.application.manager.service.arquillian.AppManagerServiceDeployment;
import org.application.manager.service.OrganisationService;
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

	private static final Logger LOG = LoggerFactory
			.getLogger(DependencyInjectionIntegrationTest.class);

	@Inject
	private OrganisationService organisationService;

	@Deployment
	public static WebArchive createDeployment() {
		return AppManagerServiceDeployment.createServiceDeployment();
	}

	@Test
	public void testCanInjectServiceEjb() throws Exception {
		Assert.assertNotNull(
				"organisationService must not be null after injection",
				organisationService);
	}
}