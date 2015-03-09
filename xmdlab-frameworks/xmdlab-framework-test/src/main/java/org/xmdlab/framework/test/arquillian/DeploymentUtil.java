package org.xmdlab.framework.test.arquillian;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;

/**
 * The Class DeploymentUtil.
 */
public class DeploymentUtil {

	/** The dependencies. */
	private static List<String> dependencies = Arrays.asList(new String[] {
			"org.slf4j:slf4j-simple:1.7.7",
			"org.springframework.data:spring-data-jpa:1.7.2.RELEASE",
			"com.mysema.querydsl:querydsl-jpa:3.6.0" });

	/**
	 * Creates the base deployment with libraries.
	 *
	 * @return the web archive
	 */
	public static WebArchive createBaseDeploymentWithLibraries() {
		WebArchive war = createBaseDeployment();

		addLibraries(war);

		return war;
	}

	/**
	 * Creates the base deployment with tranisitive libraries.
	 *
	 * @return the web archive
	 */
	public static WebArchive createBaseDeploymentWithTranisitiveLibraries() {
		WebArchive war = createBaseDeployment();

		addLibrariesTransitiv(war);

		return war;
	}

	/**
	 * Creates the base deployment.
	 *
	 * @return the web archive
	 */
	public static WebArchive createBaseDeployment() {
		WebArchive war = ShrinkWrap
				.create(WebArchive.class, "test.war")

				// add module packages
				// .addPackage("org.application.manager.entity")

				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				// beans.xml must be in WEB-INF for war and in META-INF for jar
				.addAsWebInfResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");

		return war;
	}

	/**
	 * Adds the jpa framework packages.
	 *
	 * @param archiveToMerge the archive to merge
	 */
	public static void addJpaFrameworkPackages(WebArchive archiveToMerge) {
		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war")
				.addPackage("org.xmdlab.framework.jee.domain")
				.addPackage("org.xmdlab.framework.jee.repository")
				.addPackage("org.xmdlab.framework.jee.cdi");

		archiveToMerge.merge(war);
	}

	/**
	 * Adds the mongodb framework packages.
	 *
	 * @param archiveToMerge the archive to merge
	 */
	public static void addMongodbFrameworkPackages(WebArchive archiveToMerge) {
		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war")
				.addPackage("org.xmdlab.framework.jee.domain")
				.addPackage("org.xmdlab.framework.jee.repository");

		archiveToMerge.merge(war);
	}

	/**
	 * Adds the libraries.
	 *
	 * @param archiveToMerge the archive to merge
	 */
	public static void addLibraries(WebArchive archiveToMerge) {
		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war");

		for (String dependency : dependencies) {
			File[] deps = Maven.resolver().resolve(dependency)
					.withoutTransitivity().asFile();

			war.addAsLibraries(deps);
		}

		archiveToMerge.merge(war);
	}

	/**
	 * Adds the libraries transitiv.
	 *
	 * @param archiveToMerge the archive to merge
	 */
	public static void addLibrariesTransitiv(WebArchive archiveToMerge) {
		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war");

		for (String dependency : dependencies) {
			File[] deps = Maven.resolver().resolve(dependency)
					.withTransitivity().asFile();

			war.addAsLibraries(deps);
		}

		archiveToMerge.merge(war);
	}
}
