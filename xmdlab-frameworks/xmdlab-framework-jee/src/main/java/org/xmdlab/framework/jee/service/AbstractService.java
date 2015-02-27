package org.xmdlab.framework.jee.service;

import java.util.List;

import javax.inject.Inject;
import javax.naming.OperationNotSupportedException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.xmdlab.framework.jee.repository.Repository;

import com.mysema.query.types.Predicate;

/**
 * 
 * @author seba
 *
 * @param <E>
 */
public class AbstractService<E> implements Service<E> {

//	@Inject
    private Repository<E> repository;

	@Override
	public List<E> findAll() {
		return repository.findAll();
	}

	@Override
	public List<E> findAll(Sort sort) {
		return repository.findAll(sort);
	}

	@Override
	public Page<E> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public Page<E> findAll(Predicate predicate, Pageable pageable) {
		return repository.findAll(predicate, pageable);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void deleteAll(E entity) {
		//repository.deleteAll(entity);
	}

	@Override
	public void deleteAll(Long id) {
		//repository.deleteAll(id);
	}

	@Override
	public void findOne(Long id) {
		repository.findOne(id);
	}

	@Override
	public void findOne(Predicate predicate) {
		repository.findOne(predicate);
	}

	@Override
	public void getOne(Long id) {
		repository.findOne(id);
	}

	@Override
	public void save(E entity) {
		repository.save(entity);
	}

	@Override
	public void saveAndFlush(E entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void exists(Long id) {
		repository.exists(id);
	}
}
