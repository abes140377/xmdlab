package org.application.manager.resource.arquillian;

import java.io.File;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;

/**
 * 
 * @author freund
 *
 */
@Ignore
public class AppManagerResourceDeployment {

	/**
	 * 
	 * @return
	 */
	public static WebArchive createResourceDeployment() {
		WebArchive war = ShrinkWrap
				.create(WebArchive.class, "test.war")

				// add framework packages
				.addPackage("org.xmdlab.framework.jee.domain")
				.addPackage("org.xmdlab.framework.jee.repository")

				// add module packages
				.addPackage("org.application.manager.entity")
				.addPackage("org.application.manager.cdi")
				.addPackage("org.application.manager.repository")
				.addPackage("org.application.manager.resource")
				
				.setWebXML("src/main/webapp/WEB-INF/web.xml")
				
				.addAsWebResource("src/main/webapp/index.html")

				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				// beans.xml must be in WEB-INF for war and in META-INF for jar
				.addAsWebInfResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");

		 System.out.println(war.toString(true));

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
		String springDataVersion = System.getProperty("springDataVersion",
				"1.7.2.RELEASE");
		String querydslVersion = System.getProperty("querydslVersion", "3.6.0");

		File[] slf4jDependencies = Maven.resolver()
				.resolve("org.slf4j:slf4j-simple:" + slf4jVersion)
				.withoutTransitivity().asFile();
		File[] springDataDependencies = Maven
				.resolver()
				.resolve(
						"org.springframework.data:spring-data-jpa:"
								+ springDataVersion).withTransitivity()
				.asFile();
		File[] querydslDependencies = Maven.resolver()
				.resolve("com.mysema.querydsl:querydsl-jpa:" + querydslVersion)
				.withTransitivity().asFile();

		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war");

		war.addAsLibraries(slf4jDependencies);
		war.addAsLibraries(springDataDependencies);
		war.addAsLibraries(querydslDependencies);

		return war;
	}
}
