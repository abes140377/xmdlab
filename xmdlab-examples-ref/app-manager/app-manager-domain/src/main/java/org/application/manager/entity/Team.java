package org.application.manager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.xmdlab.framework.jee.domain.AbstractEntity;

@Entity
@Table(name = "TEAM")
public class Team extends AbstractEntity {

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "DESCRIPTION", nullable = true)
	private String description;

	/**
	 * 
	 */
	public Team() {
	}

	/**
	 * 
	 * @param name
	 * @param description
	 */
	public Team(String name, String description) {
		this.name = name;
		this.description = description;
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
		return "Team [id=" + getId() + ", name=" + name + ", description="
				+ description + "]";
	}

}