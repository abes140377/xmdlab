package org.application.manager.document;

import org.springframework.data.mongodb.core.mapping.Document;
import org.xmdlab.framework.jee.document.AbstractDocument;

@Document
public class Team extends AbstractDocument {

	private String name;

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