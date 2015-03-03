package org.application.manager.resource;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/resources")
public class SwaggerJaxrsResourceConfiguration extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		resources
				.add(com.wordnik.swagger.jaxrs.listing.ApiListingResource.class);
		resources
				.add(com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider.class);
		resources
				.add(com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON.class);
		resources
				.add(com.wordnik.swagger.jaxrs.listing.ResourceListingProvider.class);
		addRestResourceClasses(resources);
		return resources;
	}

	private void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(OrganisationResource.class);
	}
}
