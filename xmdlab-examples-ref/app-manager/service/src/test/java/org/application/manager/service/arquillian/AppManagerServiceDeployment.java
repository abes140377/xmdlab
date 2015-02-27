package org.application.manager.service.arquillian;

import java.io.File;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;
import org.xmdlab.framework.jee.domain.AbstractEntity;
import org.xmdlab.framework.jee.repository.Repository;
import org.xmdlab.framework.jee.service.AbstractService;

/**
 * 
 * @author freund
 *
 */
@Ignore
public class AppManagerServiceDeployment {

	/**
	 * 
	 * @return
	 */
	public static WebArchive createServiceDeployment() {
		WebArchive war = ShrinkWrap
				.create(WebArchive.class, "test.war")

				// add framework packages
				.addPackage(AbstractEntity.class.getPackage())
				.addPackage(AbstractService.class.getPackage())
				.addPackage(Repository.class.getPackage())

				// add module packages
				.addPackage("org.application.manager.entity")
				.addPackage("org.application.manager.cdi")
				.addPackage("org.application.manager.repository")
				.addPackage("org.application.manager.service")

				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				// beans.xml must be in WEB-INF for war and in META-INF for jar
				.addAsWebInfResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");

		war.merge(createDependencyDeployment());

		// System.out.println(war.toString(true));

		return war;
	}

	/**
	 * 
	 * @return
	 */
	private static WebArchive createDependencyDeployment() {
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
