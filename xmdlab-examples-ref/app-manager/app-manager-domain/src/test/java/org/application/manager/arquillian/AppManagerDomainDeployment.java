package org.application.manager.arquillian;

import java.io.File;

import org.application.manager.cdi.CdiConfig;
import org.application.manager.ejb.TestEJB;
import org.application.manager.entity.Organisation;
import org.application.manager.repository.OrganisationRepository;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Ignore;
import org.xmdlab.framework.jee.domain.AbstractEntity;

/**
 * 
 * @author freund
 *
 */
@Ignore
public class AppManagerDomainDeployment {

	public static WebArchive createWarDeployment() {
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

		WebArchive war = ShrinkWrap
				.create(WebArchive.class, "test.war")

				.addPackage(TestEJB.class.getPackage())
				.addPackage(Organisation.class.getPackage())
				.addPackage(CdiConfig.class.getPackage())
				.addPackage(OrganisationRepository.class.getPackage())
				.addPackage(AbstractEntity.class.getPackage())

				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				// beans.xml must be in WEB-INF for war and in META-INF for jar
				.addAsWebInfResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");

		war.addAsLibraries(slf4jDependencies);
		war.addAsLibraries(springDataDependencies);
		war.addAsLibraries(querydslDependencies);

		// System.out.println(war.toString(true));

		return war;
	}
}
