package org.application.manager.repository;

import org.application.manager.entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * 
 * @author freund
 *
 */
public interface OrganisationRepository<T extends Organisation> extends
		JpaRepository<T, Long>, QueryDslPredicateExecutor<T> {

}
