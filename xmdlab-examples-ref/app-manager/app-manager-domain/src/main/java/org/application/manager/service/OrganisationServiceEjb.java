package org.application.manager.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.application.manager.entity.Organisation;
import org.application.manager.repository.OrganisationRepository;

@Stateless
public class OrganisationServiceEjb implements OrganisationService {
	
	@Inject
	OrganisationRepository organisationRepository;

	@Override
	public List<Organisation> findAll() {
		return organisationRepository.findAll();
	}

	
}