/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.jee.templates.EntityTpl
 */
package org.application.manager.organisation

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.xmdlab.framework.jee.domain.AbstractEntity;

/**
 * The org.xmdlab.cartridge.jee.templates.EntityTpl
 *
 * @author Sebastian Freund<seba1403@googlemail.com>
 *
 */
@Entity
@Table(name = "team")
public class Team extends AbstractEntity {
	
	/**
	 * Default constructor
	 */
	public Organisation() { }
	
	// no required constructor
	
	
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
		return "Team [id=" + getId()
			+ ", name=" + name
			+ ", description=" + description
			+ "]";
	}
	
	/**
	 * A Builder class used to create new Team objects.
	 */
	public static class Builder {
		Team built;
	
		/**
		 * Creates a new Builder instance.
		 * @param name 
		 * @param description 
		 */
		Builder(String name, String description) {
			built = new Team();
			built.name = name;
			built.description = description;
		}
	
		/**
		 * Builds the new Team object.
		 * @return  The created Team object.
		 */
		public Team build() {
			return built;
		}
	}
}
