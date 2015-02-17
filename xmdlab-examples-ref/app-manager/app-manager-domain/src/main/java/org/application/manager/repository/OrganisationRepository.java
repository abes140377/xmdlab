package org.application.manager.repository;

import org.application.manager.entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author freund
 *
 */
public interface OrganisationRepository extends
		JpaRepository<Organisation, Long> {

}
