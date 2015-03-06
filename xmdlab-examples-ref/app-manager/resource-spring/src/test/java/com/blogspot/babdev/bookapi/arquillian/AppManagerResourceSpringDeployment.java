package com.blogspot.babdev.bookapi.arquillian;

import java.io.File;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;

/**
 * 
 * @author freund
 *
 */
@Ignore
public class AppManagerResourceSpringDeployment {

	/**
	 * 
	 * @return
	 */
	public static WebArchive createResourceSpringDeployment() {
		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war")

				// add framework packages
				.addPackage("com.blogspot.babdev.bookapi")
				.addPackage("com.blogspot.babdev.bookapi.model");

				// add module packages
				// .addPackage("org.application.manager.entity")
				// .addPackage("org.application.manager.cdi")
				// .addPackage("org.application.manager.repository")
				// .addPackage("org.application.manager.service")
				// .addPackage("org.application.manager.resource")

//				.setWebXML("src/main/webapp/WEB-INF/web.xml");

		// .addAsResource("test-persistence.xml",
		// "META-INF/persistence.xml")
		// beans.xml must be in WEB-INF for war and in META-INF for jar
		// .addAsWebInfResource(EmptyAsset.INSTANCE,
		// ArchivePaths.create("beans.xml"))
		// .addAsWebInfResource("jbossas-ds.xml");

		// System.out.println(war.toString(true));

		war.merge(createDomainBaseDeployment());

		return war;
	}

	/**
	 * 
	 * @return
	 */
	private static WebArchive createDomainBaseDeployment() {
		// TODO: System properties not send when calling from gradle

		String slf4jVersion = System.getProperty("slf4jVersion", "1.7.7");
		File[] slf4jDependencies = Maven.resolver()
				.resolve("org.slf4j:slf4j-simple:" + slf4jVersion)
				.withoutTransitivity().asFile();

		String springDataRestVersion = System.getProperty(
				"springDataRestVersion", "1.0.0.RELEASE");
		File[] springDataRestDependencies = Maven
				.resolver()
				.resolve(
						"org.springframework.data:spring-data-rest-webmvc:"
								+ springDataRestVersion).withTransitivity()
				.asFile();

		String springWebMvcVersion = System.getProperty("springWebMvcVersion",
				"3.2.4.RELEASE");
		File[] springWebMvcDependencies = Maven
				.resolver()
				.resolve(
						"org.springframework:spring-webmvc:"
								+ springWebMvcVersion).withTransitivity()
				.asFile();

		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war");

		war.addAsLibraries(slf4jDependencies);
		war.addAsLibraries(springDataRestDependencies);
		war.addAsLibraries(springWebMvcDependencies);

		return war;
	}
}
