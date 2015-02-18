package org.application.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.xmdlab.framework.jee.domain.AbstractEntity;

/**
 * The Class User.
 */
@Entity
@Table(name = "USER")
public class User extends AbstractEntity {

	/** The firstname. */
	@Column(name = "FIRSTNAME", nullable = true)
	private String firstname;

	/** The lastname. */
	@Column(name = "LASTNAME", nullable = true)
	private String lastname;

	/** The username. */
	@Column(name = "USERNAME", nullable = false, unique = true)
	private String username;

	@Column(name = "EMAIL_ADDRESS")
	private EmailAddress emailAddress;

	/**
	 * Instantiates a new user.
	 */
	public User() {
	}

	/**
	 * Instantiates a new user.
	 */
	public User(String firstname, String lastname, String username,
			EmailAddress emailAddress) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.emailAddress = emailAddress;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname
				+ ", username=" + username + ", emailAddress=" + emailAddress
				+ "]";
	}

}
