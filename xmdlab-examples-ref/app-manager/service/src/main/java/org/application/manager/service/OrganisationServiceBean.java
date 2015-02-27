package org.application.manager.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.application.manager.entity.Organisation;
import org.application.manager.repository.OrganisationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.xmdlab.framework.jee.service.AbstractService;

import com.mysema.query.types.Predicate;

/**
 * 
 * @author seba
 * 
 */
@Stateless
public class OrganisationServiceBean extends AbstractService<Organisation> implements OrganisationService {
	
	@Inject
	OrganisationRepository organisationRepository;

	@Override
	public List<Organisation> findAll() {
		return organisationRepository.findAll();
	}

	@Override
	public List<Organisation> findAll(Sort sort) {
		return organisationRepository.findAll(sort);
	}
	
	@Override
	public Page<Organisation> findAll(Pageable pageable) {
		return organisationRepository.findAll(pageable);
	}
	
	@Override
	public Page<Organisation> findAll(Predicate predicate, Pageable pageable) {
		return organisationRepository.findAll(predicate, pageable);
	}
	
	@Override
	public void deleteAll() {
		organisationRepository.deleteAll();
	}
	
	@Override
	public void deleteAll(Organisation organisation) {
		organisationRepository.delete(organisation);
	}
	
	@Override
	public void deleteAll(Long id) {
		organisationRepository.delete(id);
	}
	
	@Override
	public void findOne(Long id) {
		organisationRepository.findOne(id);
	}
	
	@Override
	public void findOne(Predicate predicate) {
		organisationRepository.findOne(predicate);
	}
	
	@Override
	public void getOne(Long id) {
		organisationRepository.getOne(id);
	}
	
	@Override
	public void save(Organisation organisation) {
		organisationRepository.save(organisation);
	}
	
	@Override
	public void saveAndFlush(Organisation organisation) {
		organisationRepository.saveAndFlush(organisation);
	}
	
	@Override
	public void exists(Long id) {
		organisationRepository.exists(id);
	}
}