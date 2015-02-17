package org.application.manager.ejb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.application.manager.entity.Organisation;
import org.application.manager.repository.OrganisationRepository;

@Model
public class OrganisationBean {

//	@Inject
//	OrganisationRepository repo;
//
//	List<Organisation> personList;
//
//	@PostConstruct
//	void init() {
//		this.personList = repo.findAll();
//	}
}
