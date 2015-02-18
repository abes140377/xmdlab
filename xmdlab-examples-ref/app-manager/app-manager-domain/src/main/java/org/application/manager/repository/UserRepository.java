package org.application.manager.repository;

import org.application.manager.entity.EmailAddress;
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
	 * Returns the customer with the given {@link EmailAddress}.
	 * 
	 * @param emailAddress
	 *            the {@link EmailAddress} to search for.
	 * @since 
	 * @return
	 */
//	User findByFirstname(String firstname);
}
