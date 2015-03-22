package org.application.manager.integration;

import javax.inject.Inject;

import org.application.manager.arquillian.AppManagerRepositoryDeployment;
import org.application.manager.document.EmailAddress;
import org.application.manager.document.User;
import org.application.manager.repository.UserRepository;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * 
 * @author freund
 *
 */
@RunWith(Arquillian.class)
public class UserRepositoryIntegrationTest {

	@Inject
	UserRepository userRepository;

	@Deployment
	public static WebArchive createDeployment() {
		return AppManagerRepositoryDeployment
				.createDomainRepositoryDeployment();
	}

	/**
	 * 
	 */
	@Test
	@InSequence(1)
	public void shouldInjectUserRepository() {
		Assert.assertNotNull("UserRepository should not be null.",
				userRepository);
	}

	/**
	 * 
	 */
	@Test
	@InSequence(2)
	public void canSaveUser() throws Exception {
		User u = new User();
		//u.setId
		u.setFirstname("firstname");
		u.setLastname("lastname");
		u.setUsername("username");
//		u.setEmailAddress(new EmailAddress("test@irgendwo.de"));

		userRepository.save(u);

//		Assert.assertNotNull(u.getId());
//		Assert.assertNotNull(userRepository.findOne(u.getId()));
	}

	// @Test
	// public void canFindAllAndCount() throws Exception {
	// List<User> users = userRepository.findAll();
	//
	// Assert.assertEquals(2, users.size());
	//
	// long count = userRepository.count();
	//
	// Assert.assertEquals(2, count);
	// }
	//
	// @Test
	// public void canGetOne() {
	// Long userId = -1L;
	// User result = userRepository.findOne(userId);
	//
	// Assert.assertEquals(userId, result.getId());
	// }
	//
	// @Test
	// public void accessesUserPageByPage() {
	// Page<User> result = userRepository.findAll(new PageRequest(1, 1));
	//
	// assertThat(result, is(notNullValue()));
	// assertThat(result.isFirst(), is(false));
	// assertThat(result.isLast(), is(true));
	// assertThat(result.getNumberOfElements(), is(1));
	// }

	// @Test
	// @UsingDataSet("datasets/users.yml")
	// @Transactional
	// public void executesQuerydslPredicate() {
	// User dave = userRepository.findByEmailAddress(new EmailAddress(
	// "dave@dmband.com"));
	// User carter = userRepository.findByEmailAddress(new EmailAddress(
	// "carter@dmband.com"));
	//
	// QUser user = QUser.user;
	//
	// BooleanExpression firstnameStartsWithDa = user.firstname
	// .startsWith("Da");
	// BooleanExpression lastnameContainsEau = user.lastname.contains("eau");
	//
	// Iterable<User> result = userRepository.findAll(firstnameStartsWithDa
	// .or(lastnameContainsEau));
	//
	// assertThat(result, is(Matchers.<User> iterableWithSize(2)));
	// assertThat(result, hasItems(dave, carter));
	// }
}
