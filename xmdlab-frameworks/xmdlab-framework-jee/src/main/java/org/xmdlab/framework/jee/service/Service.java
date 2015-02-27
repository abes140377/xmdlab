package org.xmdlab.framework.jee.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.mysema.query.types.Predicate;

/**
 * 
 * @author seba
 *
 * @param <E>
 */
public interface Service<E> {

	public List<E> findAll();
	
	public List<E> findAll(Sort sort);
	
	public Page<E> findAll(Pageable pageable);
	
	public Page<E> findAll(Predicate predicate, Pageable pageable);
	
	public void deleteAll();
	
	public void deleteAll(E entity);
	
	public void deleteAll(Long id);
	
	public void findOne(Long id);
	
	public void findOne(Predicate predicate);
	
	public void getOne(Long id);
	
	public void save(E entity);
	
	public void saveAndFlush(E entity);
	
	public void exists(Long id);
}
