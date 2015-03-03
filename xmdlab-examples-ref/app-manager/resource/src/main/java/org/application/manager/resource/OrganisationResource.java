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

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

/**
 * 
 * @author freund
 *
 */
@Path("/")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
@Api(value = "/organisation", description = "Organisation resource service")
public class OrganisationResource {

	@Inject
	OrganisationService organisationService;

	@GET
	@Path("/organisations")
	@ApiOperation(value = "list", notes = "List all available organisations")
	public Organisation[] list() {
		Organisation[] organisations = organisationService.findAll().toArray(
				new Organisation[0]);

		return organisations;
	}

	@GET
	@Path("/organisation/{id}")
	@ApiOperation(value = "get", notes = "Get a organisation by id")
	public Organisation get(@ApiParam(value = "Organisation id") @PathParam("id") Long id) {
		return organisationService.findOne(id);
	}

	@PUT
	@Path("/organisation")
	@ApiOperation(value = "create", notes = "Get a organisation by id")
	public Organisation create(@ApiParam(value = "The Organisation Object to create") Organisation organisation) {
		Organisation o = organisationService.save(organisation);

		return o;
	}

	@POST
	@Path("/organisation")
	@ApiOperation(value = "update", notes = "Update a Organisation Object")
	public Organisation update(@ApiParam(value = "The Organisation Object to update") Organisation organisation) {
		Organisation o = organisationService.findOne(organisation.getId());
		o.setName(organisation.getName());
		o.setDescription(organisation.getDescription());

		return organisationService.save(o);
	}

	@DELETE
	@Path("/organisation/{id}")
	@ApiOperation(value = "get", notes = "Delete the organisation with id")
	public void delete(@ApiParam(value = "Organisation id") @PathParam("id") Long id) {
		organisationService.delete(id);
	}
}
