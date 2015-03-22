package org.application.manager.arquillian;

import java.io.File;
import java.util.Arrays;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Ignore;
import static org.xmdlab.framework.test.arquillian.DeploymentUtil.*;

/**
 * 
 * @author freund
 *
 */
@Ignore
public class AppManagerDomainDeployment {

	/**
	 * 
	 * @return
	 */
	public static WebArchive createDomainRepositoryDeployment() {
		WebArchive war = ShrinkWrap
				.create(WebArchive.class, "test.war")

				// add module packages
				.addPackage("org.application.manager.entity")

				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				// beans.xml must be in WEB-INF for war and in META-INF for jar
				.addAsWebInfResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");

		addLibrariesTransitiv(war);

		addJpaFrameworkPackages(war);
		
		System.out.println(war.toString(true));

		return war;
	}
}
