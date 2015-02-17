package org.application.manager.integration;

import java.io.File;

import javax.inject.Inject;

import org.application.manager.cdi.Repositories;
import org.application.manager.ejb.TestEJB;
import org.application.manager.entity.Organisation;
import org.application.manager.repository.OrganisationRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class OrganisationRepositoryIntegrationTest {

	@Inject
	OrganisationRepository organisationRepository;

	@Deployment
	public static WebArchive createDeployment() {
		File[] slf4jDependencies = Maven.resolver()
				.resolve("org.slf4j:slf4j-simple:1.7.7").withoutTransitivity()
				.asFile();
		File[] springDataDependencies = Maven
				.resolver()
				.resolve(
						"org.springframework.data:spring-data-jpa:1.7.2.RELEASE")
				.withTransitivity().asFile();

		WebArchive war = ShrinkWrap
				.create(WebArchive.class, "test.war")
				.addPackage(TestEJB.class.getPackage())
				.addPackage(Organisation.class.getPackage())
				.addPackage(Repositories.class.getPackage())
				.addPackage(OrganisationRepository.class.getPackage())
				.addPackage(
						OrganisationRepositoryIntegrationTest.class
								.getPackage())
				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				.addAsManifestResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");

		war.addAsLibraries(slf4jDependencies);
		war.addAsLibraries(springDataDependencies);

		return war;
	}

	@Test
	public void should_inject_dbunit_database_connection() throws Exception {
		Assert.assertNotNull("OrganisationRepository should not be null.",
				organisationRepository);
	}
}
