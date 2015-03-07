package com.blogspot.babdev.bookapi.resource;

import org.application.manager.entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.rest.repository.annotation.RestResource;

@RestResource(path = "organisation", rel = "organisation")
public interface OrganisationRepository extends JpaRepository<Organisation, Long>,
		QueryDslPredicateExecutor<Organisation> {

}
