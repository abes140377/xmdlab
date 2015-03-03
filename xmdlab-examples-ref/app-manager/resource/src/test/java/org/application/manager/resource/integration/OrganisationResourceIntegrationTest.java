package org.application.manager.resource.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.application.manager.entity.Organisation;
import org.application.manager.resource.arquillian.AppManagerResourceDeployment;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.InSequence;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * 
 * @author freund
 *
 */
@RunWith(Arquillian.class)
public class OrganisationResourceIntegrationTest {

	private static final String NAME = "testname";
	private static final String DESCRIPTION = "description for test";

	private static Organisation createdOrganisation;

	@ArquillianResource
	URL deploymentURL;

	Client client;

	@Deployment(testable = false)
	public static WebArchive createDeployment() {
		return AppManagerResourceDeployment.createResourceDeployment();
	}

	@Before
	public void setUp() throws MalformedURLException {
		client = ClientBuilder.newClient();
	}

	/**
	 * 
	 * @throws MalformedURLException
	 */
	@Test
	@InSequence(1)
	public void testCreate() throws MalformedURLException {
		Organisation o = Organisation.getBuilder(NAME, DESCRIPTION).build();

		WebTarget target = client.target(createUri("rest/organisation"));
		Response r = target.request(MediaType.APPLICATION_JSON).put(
				Entity.entity(o, MediaType.APPLICATION_JSON));

		createdOrganisation = r.readEntity(Organisation.class);

		Long id = createdOrganisation.getId();

		assertNotNull(id);
	}

	/**
	 * 
	 * @throws MalformedURLException
	 */
	@Test
	@InSequence(2)
	public void testGet() throws MalformedURLException {
		String id = createdOrganisation.getId().toString();

		WebTarget target = client.target(createUri("rest/organisation")).path(
				id);
		Response r = target.request(MediaType.APPLICATION_JSON).get();

		assertEquals("Failed! HTTP error code : " + r.getStatus(), 200,
				r.getStatus());

		Organisation result = r.readEntity(Organisation.class);

		assertEquals(NAME, result.getName());
		assertEquals(DESCRIPTION, result.getDescription());
	}

	/**
	 * 
	 * @throws MalformedURLException
	 */
	@Test
	@InSequence(3)
	public void testList() throws MalformedURLException {
		WebTarget target = client.target(createUri("rest/organisations"));
		Response r = target.request(MediaType.APPLICATION_JSON).get();

		assertEquals("Failed! HTTP error code : " + r.getStatus(), 200,
				r.getStatus());

		Organisation[] result = r.readEntity(Organisation[].class);

		assertEquals("Wrong number of organisations found.", 1, result.length);
		assertEquals(NAME, result[0].getName());
		assertEquals(DESCRIPTION, result[0].getDescription());
	}

	/**
	 * 
	 * @throws MalformedURLException
	 */
	@Test
	@InSequence(4)
	public void testUpdate() throws MalformedURLException {
		String newName = "123";
		String newDescription = "456";

		createdOrganisation.setName(newName);
		createdOrganisation.setDescription(newDescription);

		WebTarget target = client.target(createUri("rest/organisation"));
		Response r = target.request(MediaType.APPLICATION_JSON).post(
				Entity.entity(createdOrganisation, MediaType.APPLICATION_JSON));

		Organisation result = r.readEntity(Organisation.class);

		assertEquals(createdOrganisation.getId(), result.getId());
		assertEquals(newName, result.getName());
		assertEquals(newDescription, result.getDescription());
	}

	@Test
	@InSequence(5)
	public void testDelete() throws MalformedURLException {
		String id = createdOrganisation.getId().toString();

		WebTarget target = client.target(createUri("rest/organisation")).path(
				id);
		Response r = target.request(MediaType.APPLICATION_JSON).delete();

		// Check for status code 204 (The server successfully processed the
		// request, but is not returning any content. Usually used as a response
		// to a successful delete request.)
		assertEquals("Failed! HTTP error code : " + r.getStatus(), 204,
				r.getStatus());
	}

	/**
	 * 
	 * @param path
	 * @return
	 * @throws MalformedURLException
	 */
	private URI createUri(String path) throws MalformedURLException {
		return URI.create(new URL(deploymentURL, path).toExternalForm());
	}
}
