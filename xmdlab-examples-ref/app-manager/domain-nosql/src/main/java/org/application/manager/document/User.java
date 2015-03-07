package org.application.manager.document;

import org.springframework.data.mongodb.core.mapping.Document;
import org.xmdlab.framework.jee.document.AbstractDocument;

/**
 * The Class User.
 */
@Document
public class User extends AbstractDocument {

	/** The firstname. */
	private String firstname;

	/** The lastname. */
	private String lastname;

	/** The username. */
	private String username;

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
