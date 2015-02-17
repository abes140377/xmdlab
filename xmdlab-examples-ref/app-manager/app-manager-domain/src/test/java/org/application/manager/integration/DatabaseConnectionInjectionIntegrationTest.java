package org.application.manager.integration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.application.manager.arquillian.AppManagerDomainDeployment;
import org.application.manager.entity.Organisation;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.persistence.PersistenceTest;
import org.jboss.arquillian.persistence.ShouldMatchDataSet;
import org.jboss.arquillian.persistence.UsingDataSet;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.jboss.shrinkwrap.api.spec.WebArchive;
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
		return AppManagerDomainDeployment.createWarDeployment();
	}

	@Test
	@Transactional(TransactionMode.COMMIT)
	@UsingDataSet("datasets/organisations.yml")
	@ShouldMatchDataSet(value = "expected-organisations.yml", orderBy = { "id" })
	public void should_inject_dbunit_database_connection() throws Exception {
		Assert.assertNotNull(em);

		Organisation o = new Organisation();
		o.setName("Bbb");
		o.setDescription("Bbb");

		em.persist(o);
		em.flush();

		Assert.assertNotNull(
				"Organisation object id should not be null after persiting.",
				o.getId());
	}
}
