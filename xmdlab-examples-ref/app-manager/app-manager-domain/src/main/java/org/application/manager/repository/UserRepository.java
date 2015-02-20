package org.application.manager.repository;

import org.application.manager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * 
 * @author freund
 *
 */
public interface UserRepository extends JpaRepository<User, Long>,
		QueryDslPredicateExecutor<User> {

	/**
	 * 
	 * @param firstname
	 * @return
	 */
	 // User findByFirstname(String firstname);
}
