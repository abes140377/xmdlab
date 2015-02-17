package org.application.manager.integration;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.UserTransaction;

import org.application.manager.arquillian.AppManagerDomainDeployment;
import org.application.manager.entity.EmailAddress;
import org.application.manager.entity.QUser;
import org.application.manager.entity.User;
import org.application.manager.repository.UserRepository;
import org.hamcrest.Matchers;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.persistence.PersistenceTest;
import org.jboss.arquillian.persistence.UsingDataSet;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.mysema.query.types.expr.BooleanExpression;

/**
 * 
 * @author freund
 *
 */
@RunWith(Arquillian.class)
@PersistenceTest
public class UserRepositoryIntegrationTest {

	@Inject
	UserRepository userRepository;
	
	@Inject UserTransaction utx;

	@Deployment
	public static WebArchive createDeployment() {
		return AppManagerDomainDeployment.createWarDeployment();
	}

	/**
	 * 
	 */
	@Test
	public void shouldInjectUserRepository() {
		Assert.assertNotNull("UserRepository should not be null.",
				userRepository);
	}

	/**
	 * 
	 */
	@Test
	@Transactional
	public void canSaveUser() throws Exception {
		User o = new User();
		o.setFirstname("firstname");
		o.setLastname("lastname");
		o.setUsername("username");
		o.setEmailAddress(new EmailAddress("test@irgendwo.de"));

//		utx.begin();
		userRepository.save(o);
		utx.commit();
		
//		Assert.assertNotNull(o.getId());
//		Assert.assertNotNull(userRepository.getOne(o.getId()));
	}

//	@Test
//	@UsingDataSet("datasets/users.yml")
//	public void canFindAllAndCount() {
//		List<User> users = userRepository.findAll();
//
//		Assert.assertEquals(2, users.size());
//
//		long count = userRepository.count();
//
//		Assert.assertEquals(2, count);
//	}

//	@Test
//	@UsingDataSet("datasets/users.yml")
//	public void canGetOne() {
//		Long userId = -1L;
//		User result = userRepository.getOne(userId);
//
//		Assert.assertEquals(userId, result.getId());
//	}
//
//	@Test
//	@UsingDataSet("datasets/users.yml")
//	@Transactional(value = TransactionMode.ROLLBACK)
//	public void accessesUserPageByPage() {
//		Page<User> result = userRepository.findAll(new PageRequest(1, 1));
//
//		assertThat(result, is(notNullValue()));
//		assertThat(result.isFirst(), is(false));
//		// assertThat(result.isLast(), is(false));
//		// assertThat(result.getNumberOfElements(), is(1));
//	}

//	@Test
//	@UsingDataSet("datasets/users.yml")
//	@Transactional
//	public void executesQuerydslPredicate() {
//		User dave = userRepository.findByEmailAddress(new EmailAddress(
//				"dave@dmband.com"));
//		User carter = userRepository.findByEmailAddress(new EmailAddress(
//				"carter@dmband.com"));
//
//		QUser user = QUser.user;
//
//		BooleanExpression firstnameStartsWithDa = user.firstname
//				.startsWith("Da");
//		BooleanExpression lastnameContainsEau = user.lastname.contains("eau");
//
//		Iterable<User> result = userRepository.findAll(firstnameStartsWithDa
//				.or(lastnameContainsEau));
//
//		assertThat(result, is(Matchers.<User> iterableWithSize(2)));
//		assertThat(result, hasItems(dave, carter));
//	}
}
