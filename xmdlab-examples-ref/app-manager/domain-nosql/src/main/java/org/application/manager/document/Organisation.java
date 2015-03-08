package org.application.manager.document;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;
import org.xmdlab.framework.jee.domain.AbstractDocument;

/**
 * 
 * @author Sebastian Freund<seba1403@gmail.com>
 *
 */
@Document
public class Organisation extends AbstractDocument {
	
	public static final int MAX_LENGTH_DESCRIPTION = 500;
    public static final int MAX_LENGTH_NAME = 100;

	private String name;

	private String description;
	
	private Set<Team> teams = new HashSet<Team>();

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
	public Organisation(String name, String description, Set<Team> teams) {
		this.name = name;
		this.description = description;
		this.teams = teams;
	}
	
	
	
	/**
     * Gets a builder which is used to create Organisation objects.
     * @param firstName The first name of the created user.
     * @param lastName  The last name of the created user.
     * @return  A new Builder instance.
     */
    public static Builder getBuilder(String name, String description) {
        return new Builder(name, description);
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
	
	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}
	
	public void addTeam(Team team) {
		this.teams.add(team);
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