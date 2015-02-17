package org.application.manager.integration;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import org.application.manager.arquillian.AppManagerDomainDeployment;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * 
 * @author freund
 *
 */
@RunWith(Arquillian.class)
public class EntityManagerIntegrationTest {

	@Resource
	UserTransaction utx;

	@PersistenceContext
	EntityManager em;
	
	@Deployment
	public static WebArchive createDeployment() {
		return AppManagerDomainDeployment.createWarDeployment();
	}

	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void shouldInjectEntityManagerAndUsertransaction() throws Exception {
		Assert.assertNotNull("Injected entity manager must not be null.", em);
		Assert.assertNotNull("Injected user transaction must not be null.", utx);
	}
}
