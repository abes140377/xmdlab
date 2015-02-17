package org.application.manager.integration;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.inject.Inject;

import org.application.manager.arquillian.AppManagerDomainDeployment;
import org.application.manager.entity.Organisation;
import org.application.manager.repository.OrganisationRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.persistence.PersistenceTest;
import org.jboss.arquillian.persistence.UsingDataSet;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 
 * @author freund
 *
 */
@RunWith(Arquillian.class)
@PersistenceTest
public class OrganisationRepositoryIntegrationTest {

	@Inject
	OrganisationRepository organisationRepository;

	@Deployment
	public static WebArchive createDeployment() {
		return AppManagerDomainDeployment.createWarDeployment();
	}

	/**
	 * 
	 */
	@Test
	public void shouldInjectOrganisationRepository() {
		Assert.assertNotNull("OrganisationRepository should not be null.",
				organisationRepository);
	}

	/**
	 * 
	 */
	@Test
	@Transactional
	public void canSaveOrganisation() {
		Organisation o = new Organisation();
		o.setName("name1");
		o.setDescription("descrition1");

		organisationRepository.save(o);

		Assert.assertNotNull(o.getId());
	}

	@Test
	@UsingDataSet("datasets/organisations.yml")
	public void canFindAllAndCount() {
		List<Organisation> organisations = organisationRepository.findAll();

		Assert.assertEquals(1, organisations.size());

		long count = organisationRepository.count();

		Assert.assertEquals(1, count);
	}

	@Test
	@UsingDataSet("datasets/organisations.yml")
	public void canGetOne() {
		Long organisationId = -1L;
		Organisation result = organisationRepository.getOne(organisationId);

		Assert.assertEquals(organisationId, result.getId());
	}

	@Test
	@UsingDataSet("datasets/organisations.yml")
	public void accessesOrganisationPageByPage() {
		Page<Organisation> result = organisationRepository
				.findAll(new PageRequest(1, 1));

		assertThat(result, is(notNullValue()));
		assertThat(result.isFirst(), is(false));
		// assertThat(result.isLast(), is(false));
		// assertThat(result.getNumberOfElements(), is(1));
	}

}
