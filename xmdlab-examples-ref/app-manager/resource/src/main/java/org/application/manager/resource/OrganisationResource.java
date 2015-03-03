package org.application.manager.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.application.manager.entity.Organisation;
import org.application.manager.service.OrganisationService;

/**
 * 
 * @author freund
 *
 */
@Path("/")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class OrganisationResource {

	@Inject
	OrganisationService organisationService;

	@GET
	@Path("/organisations")
	public Organisation[] list() {
		Organisation[] organisations = organisationService.findAll().toArray(
				new Organisation[0]);

		return organisations;
	}

	@GET
	@Path("/organisation/{id}")
	public Organisation get(@PathParam("id") Long id) {
		return organisationService.findOne(id);
	}

	@PUT
	@Path("/organisation")
	public Organisation create(Organisation organisation) {
		Organisation o = organisationService.save(organisation);

		return o;
	}

	@POST
	@Path("/organisation")
	public Organisation update(Organisation organisation) {
		Organisation o = organisationService.findOne(organisation.getId());
		o.setName(organisation.getName());
		o.setDescription(organisation.getDescription());

		return organisationService.save(o);
	}

	@DELETE
	@Path("/organisation/{id}")
	public void delete(@PathParam("id") Long id) {
		organisationService.delete(id);
	}
}
