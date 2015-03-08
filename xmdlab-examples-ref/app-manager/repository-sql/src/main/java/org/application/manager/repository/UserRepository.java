package org.application.manager.repository;

import org.application.manager.entity.User;
import org.xmdlab.framework.jee.repository.JpaRepository;

/**
 * 
 * @author freund
 *
 */
public interface UserRepository extends JpaRepository<User> {

	/**
	 * 
	 * @param firstname
	 * @return
	 */
	 // User findByFirstname(String firstname);
}
