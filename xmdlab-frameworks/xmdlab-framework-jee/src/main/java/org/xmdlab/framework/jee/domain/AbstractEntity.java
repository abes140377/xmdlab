package org.xmdlab.framework.jee.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;

/**
 * Base class to derive entity classes from.
 * 
 * @author freund
 */
@MappedSuperclass
public class AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// @Column(name = "create_date", nullable = false)
	// private Date createDate;
	//
	// @Column(name = "modification_date", nullable = false)
	// private Date modificationDate;

	@Version
	private long version = 0;

	// @PreUpdate
	// public void preUpdate() {
	// modificationDate = new Date();
	// }
	//
	// @PrePersist
	// public void prePersist() {
	// Date now = new Date();
	// createDate = now;
	// modificationDate = now;
	// }

	/**
	 * Returns the identifier of the entity.
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This setter method should only be used by unit tests.
	 * 
	 * @param id
	 */
	protected void setId(Long id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (this.id == null || obj == null
				|| !(this.getClass().equals(obj.getClass()))) {
			return false;
		}
		AbstractEntity that = (AbstractEntity) obj;

		return this.id.equals(that.getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}
}