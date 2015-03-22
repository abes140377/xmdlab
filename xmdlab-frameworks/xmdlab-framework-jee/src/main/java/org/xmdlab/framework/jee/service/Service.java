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
	
	public void delete(Long id);
	
	public void delete(E entity);
	
	public void delete(Iterable<? extends E> entities);
	
	public E findOne(Long id);
	
	public E findOne(Predicate predicate);
	
	public E getOne(Long id);
	
	public E save(E entity);
	
	//public E saveAndFlush(E entity);
	
	public boolean exists(Long id);
}
