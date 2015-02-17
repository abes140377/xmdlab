package org.application.manager.integration;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.application.manager.ejb.TestEJB;
import org.application.manager.entity.Organisation;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.persistence.PersistenceTest;
import org.jboss.arquillian.persistence.ShouldMatchDataSet;
import org.jboss.arquillian.persistence.UsingDataSet;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
@PersistenceTest
public class DatabaseConnectionInjectionIntegrationTest {

	@PersistenceContext
	EntityManager em;

	@Deployment
	public static WebArchive createDeployment() {
		File[] dependencies = Maven.resolver()
				.resolve("org.slf4j:slf4j-simple:1.7.7").withoutTransitivity()
				.asFile();

		WebArchive war = ShrinkWrap
				.create(WebArchive.class, "test.war")
				.addPackage(TestEJB.class.getPackage())
				.addPackage(Organisation.class.getPackage())
				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				.addAsManifestResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");

		war.addAsLibraries(dependencies);

		return war;
	}

	// Test needs to be "persistence-extension-aware" in order to get this
	// reference.
	// This can be achieved using any of APE annotations such as
	// @PersistenceTest, @UsingDataSet, @ShouldMatchDataSet etc.
	// @ArquillianResource
	// private DatabaseConnection databaseConnection;

	@Test
	@Transactional(TransactionMode.COMMIT)
	@UsingDataSet("datasets/organisations.yml")
	@ShouldMatchDataSet(value = "expected-organisations.yml", orderBy = { "id"})
	public void should_inject_dbunit_database_connection() throws Exception {
		Assert.assertNotNull(em);

		Organisation o = new Organisation();
		o.setName("Bbb");
		o.setDescription("Bbb");

		em.persist(o);
		em.flush();
		
		Assert.assertNotNull("Organisation object id should not be null after persiting.", o.getId());
	}
}
