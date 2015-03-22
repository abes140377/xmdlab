package org.application.manager.service.integration;

import java.util.List;

import javax.inject.Inject;

import org.application.manager.document.Organisation;
import org.application.manager.service.OrganisationService;
import org.application.manager.service.arquillian.AppManagerServiceDeployment;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.persistence.PersistenceTest;
import org.jboss.arquillian.persistence.UsingDataSet;
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
	
	/**
	 * 
	 */
	@Test
	public void canSaveOrganisation() {
		Organisation o = new Organisation();
		o.setName("name1");
		o.setDescription("descrition1");

		organisationService.save(o);

		Assert.assertNotNull(o.getId());
	}
	
	/**
	 * 
	 */
	@Test
	@UsingDataSet("datasets/organisations.yml")
	public void testFindAll() {
		List<Organisation> organisations = organisationService.findAll();
		
		Assert.assertEquals(1, organisations.size());
	}
	
	/**
	 * 
	 */
	@Test
	@UsingDataSet("datasets/organisations.yml")
	public void canGetOne() {
		Long organisationId = -1L;
		Organisation result = organisationService.getOne(organisationId);

		Assert.assertEquals(organisationId, result.getId());
	}
}
