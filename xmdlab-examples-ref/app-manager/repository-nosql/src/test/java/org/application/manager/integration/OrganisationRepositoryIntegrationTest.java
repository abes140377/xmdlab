package org.application.manager.integration;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;

import org.application.manager.arquillian.AppManagerRepositoryDeployment;
import org.application.manager.document.Organisation;
import org.application.manager.repository.OrganisationRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * The Class OrganisationRepositoryIntegrationTest.
 *
 * @author Sebastian Freund <seba140377@web.de>
 */
@RunWith(Arquillian.class)
public class OrganisationRepositoryIntegrationTest {

	/** The organisation repository. */
	@Inject
	OrganisationRepository organisationRepository;

	/**
	 * Creates the deployment.
	 *
	 * @return the web archive
	 */
	@Deployment
	public static WebArchive createDeployment() {
		return AppManagerRepositoryDeployment
				.createDomainRepositoryDeployment();
	}

	/**
	 * Should inject organisation repository.
	 */
	@Test
	public void shouldInjectOrganisationRepository() {
		Assert.assertNotNull("OrganisationRepository should not be null.",
				organisationRepository);
	}

	/**
	 * Can save organisation.
	 */
	@Test
	public void canSaveOrganisation() {
		Organisation o = new Organisation();
		o.setName("name1");
		o.setDescription("descrition1");

		organisationRepository.save(o);

		Assert.assertNotNull(o.getId());
	}

	/**
	 * Can find all and count.
	 */
	@Test
	public void canFindAllAndCount() {
		// Iterable<Organisation> organisations =
		// organisationRepository.findAll();

		// Assert.assertEquals(1, organisations.size());

		long count = organisationRepository.count();

		Assert.assertEquals(1, count);
	}

	/**
	 * Can get one.
	 */
	@Test
	public void canGetOne() {
		Long organisationId = -1L;
		Organisation result = organisationRepository.findOne(organisationId);

		Assert.assertEquals(organisationId, result.getId());
	}

	/**
	 * Accesses organisation page by page.
	 */
	@Test
	public void accessesOrganisationPageByPage() {
		Page<Organisation> result = organisationRepository
				.findAll(new PageRequest(1, 1));

		assertThat(result, is(notNullValue()));
		assertThat(result.isFirst(), is(false));
		assertThat(result.isLast(), is(true));
		// assertThat(result.getNumberOfElements(), is(1));
	}

}
