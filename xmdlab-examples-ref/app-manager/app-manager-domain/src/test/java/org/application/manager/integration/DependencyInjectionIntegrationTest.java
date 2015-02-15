package org.application.manager.integration;

import java.io.File;

import javax.inject.Inject;

import org.application.manager.ejb.TestEJB;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Arquillian.class)
public class DependencyInjectionIntegrationTest {

	Logger log = LoggerFactory
			.getLogger(DependencyInjectionIntegrationTest.class);

	@Inject
	private TestEJB testEjb;

	@Deployment
	public static WebArchive createDeployment() {
		File[] dependencies = Maven.resolver()
				.resolve("org.slf4j:slf4j-simple:1.7.7").withoutTransitivity()
				.asFile();

		WebArchive war = ShrinkWrap
				.create(WebArchive.class, "test.war")
				.addPackage(TestEJB.class.getPackage())
				.addAsManifestResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");

		war.addAsLibraries(dependencies);

		return war;
	}

	@Test
	public void testCDI() throws Exception {
		log.info(testEjb.helloWorld());

		Assert.assertEquals("hello world", testEjb.helloWorld());
	}
}