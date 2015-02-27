package org.application.manager.service;

import java.util.List;

import org.application.manager.entity.Organisation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.mysema.query.types.Predicate;

public interface OrganisationService {

	public List<Organisation> findAll();
	
	public List<Organisation> findAll(Sort sort);
	
	public Page<Organisation> findAll(Pageable pageable);
	
	public Page<Organisation> findAll(Predicate predicate, Pageable pageable);
	
	public void deleteAll();
	
	public void deleteAll(Organisation organisation);
	
	public void deleteAll(Long id);
	
	public void findOne(Long id);
	
	public void findOne(Predicate predicate);
	
	public void getOne(Long id);
	
	public void save(Organisation organisation);
	
	public void saveAndFlush(Organisation organisation);
	
	public void exists(Long id);
}
