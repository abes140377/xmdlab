package org.application.manager.cdi;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * @author freund
 *
 */
public class CdiConfig {

	@Produces
	@Dependent
	@PersistenceContext
	public EntityManager entityManager;
}
