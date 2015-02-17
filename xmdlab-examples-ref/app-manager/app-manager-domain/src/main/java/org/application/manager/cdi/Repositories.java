package org.application.manager.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.application.manager.repository.OrganisationRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

public class Repositories {
	@PersistenceContext
	EntityManager em;

	@Produces
	OrganisationRepository createOrganisationRepository() throws Exception {
		// need to use getDelegate() in Glassfish, it should be safe anyway
		JpaRepositoryFactory rf = new JpaRepositoryFactory(
				(EntityManager) em.getDelegate());
		return rf.getRepository(OrganisationRepository.class);

	}
}