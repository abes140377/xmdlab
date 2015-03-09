package org.xmdlab.framework.jee.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface JpaRepository<R> extends org.springframework.data.jpa.repository.JpaRepository<R, Long>,
		QueryDslPredicateExecutor<R> {

}
