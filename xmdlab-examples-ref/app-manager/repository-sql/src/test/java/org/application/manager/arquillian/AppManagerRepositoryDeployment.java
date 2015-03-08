package org.application.manager.arquillian;

import static org.xmdlab.framework.test.arquillian.DeploymentUtil.addLibraries;
import static org.xmdlab.framework.test.arquillian.DeploymentUtil.createBaseDeployment;

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
		WebArchive war = createBaseDeployment();

		addLibraries(war);

		war.addPackage("org.application.manager.repository");

		return war;
	}
}
