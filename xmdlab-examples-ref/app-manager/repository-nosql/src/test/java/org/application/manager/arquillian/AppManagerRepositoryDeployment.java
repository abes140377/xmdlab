package org.application.manager.arquillian;

import static org.xmdlab.framework.test.arquillian.DeploymentUtil.*;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Ignore;

/**
 * 
 * @author freund
 *
 */
@Ignore
public class AppManagerRepositoryDeployment {

	/**
	 * 
	 * @return
	 */
	public static WebArchive createDomainRepositoryDeployment() {
		// WebArchive war = createBaseDeployment();

		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war")

		// add module packages
		// .addPackage("org.application.manager.entity")

				// .addAsResource("test-persistence.xml",
				// "META-INF/persistence.xml")
				// beans.xml must be in WEB-INF for war and in META-INF for jar
				.addAsWebInfResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"));
		// .addAsWebInfResource("jbossas-ds.xml");

		addLibraries(war);
		addLibraryTransitive(war, "org.springframework.data:spring-data-mongodb:1.6.2.RELEASE");
		addLibraryTransitive(war, "com.mysema.querydsl:querydsl-mongodb:3.6.0");

		war.addPackage("org.xmdlab.framework.jee.domain");
		war.addPackage("org.xmdlab.framework.jee.repository");
		
		war.addPackage("org.application.manager.repository");
		
		System.out.println(war.toString(true));

		return war;
	}
}
