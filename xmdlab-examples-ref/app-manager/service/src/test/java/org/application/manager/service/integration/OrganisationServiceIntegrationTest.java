package org.application.manager.service.integration;

import javax.inject.Inject;

import org.application.manager.service.arquillian.AppManagerServiceDeployment;
import org.application.manager.service.OrganisationService;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.persistence.PersistenceTest;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@PersistenceTest
public class OrganisationServiceIntegrationTest {

	@Inject
	OrganisationService organisationService;
	
	@Deployment
	public static WebArchive createDeployment() {
		return AppManagerServiceDeployment.createServiceDeployment();
	}
	
	/**
	 * 
	 */
	@Test
	public void shouldInjectOrganisationService() {
		Assert.assertNotNull("OrganisationService should not be null.",
				organisationService);
	}
}
