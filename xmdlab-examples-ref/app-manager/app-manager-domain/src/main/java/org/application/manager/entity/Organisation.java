package org.application.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

import org.xmdlab.framework.jee.domain.AbstractEntity;

/**
 * 
 * @author Sebastian Freund<seba1403@gmail.com>
 *
 */
@Entity
@Table(name = "organisation")
public class Organisation extends AbstractEntity {
	
	public static final int MAX_LENGTH_DESCRIPTION = 500;
    public static final int MAX_LENGTH_NAME = 100;

	@Column(name = "name", nullable = false, length = MAX_LENGTH_NAME)
	private String name;

	@Column(name = "description", nullable = true, length = MAX_LENGTH_DESCRIPTION)
	private String description;

	/**
	 * 
	 */
	public Organisation() {
	}

	/**
	 * 
	 * @param name
	 * @param description
	 */
	public Organisation(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	/**
     * Gets a builder which is used to create Organisation objects.
     * @param firstName The first name of the created user.
     * @param lastName  The last name of the created user.
     * @return  A new Builder instance.
     */
    public static Builder getBuilder(String firstName, String lastName) {
        return new Builder(firstName, lastName);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Organisation [id=" + getId() + ", name=" + name
				+ ", description=" + description + "]";
	}
	
	/**
     * A Builder class used to create new Organisation objects.
     */
    public static class Builder {
        Organisation built;
 
        /**
         * Creates a new Builder instance.
         * @param firstName The first name of the created Organisation object.
         * @param lastName  The last name of the created Organisation object.
         */
        Builder(String name, String description) {
            built = new Organisation();
            built.name = name;
            built.description = description;
        }
 
        /**
         * Builds the new Organisation object.
         * @return  The created Organisation object.
         */
        public Organisation build() {
            return built;
        }
    }
}