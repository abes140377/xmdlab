package org.xmdlab.framework.jee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface Repository<R> extends JpaRepository<R, Long>,
		QueryDslPredicateExecutor<R> {

}
