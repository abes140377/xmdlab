package org.application.manager.repository;

import org.application.manager.document.User;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.xmdlab.framework.jee.repository.MongoRepository;

/**
 * 
 * @author freund
 *
 */
public interface UserRepository extends MongoRepository<User> {

	/**
	 * 
	 * @param firstname
	 * @return
	 */
	 // User findByFirstname(String firstname);
}
