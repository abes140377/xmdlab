package org.application.manager.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.application.manager.document.Organisation;
import org.application.manager.repository.OrganisationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.mysema.query.types.Predicate;

/**
 * 
 * @author seba
 * 
 */
@Stateless
public class OrganisationServiceBean implements OrganisationService {

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
	public void delete(Long id) {
		organisationRepository.delete(id);
	}

	@Override
	public void delete(Organisation entity) {
		organisationRepository.delete(entity);
	}

	@Override
	public void delete(Iterable<? extends Organisation> entities) {
		organisationRepository.delete(entities);
	}

	@Override
	public Organisation findOne(Long id) {
		return organisationRepository.findOne(id);
	}

	@Override
	public Organisation findOne(Predicate predicate) {
		return organisationRepository.findOne(predicate);
	}

	@Override
	public Organisation getOne(Long id) {
		return organisationRepository.findOne(id);
	}

	@Override
	public Organisation save(Organisation organisation) {
		return organisationRepository.save(organisation);
	}

//	@Override
//	public Organisation saveAndFlush(Organisation organisation) {
//		return organisationRepository.saveAndFlush(organisation);
//	}

	@Override
	public boolean exists(Long id) {
		return organisationRepository.exists(id);
	}
}