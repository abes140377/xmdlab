package org.xmdlab.framework.jee.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MongoRepository<R> extends org.springframework.data.mongodb.repository.MongoRepository<R, Long>,
		QueryDslPredicateExecutor<R> {

}
