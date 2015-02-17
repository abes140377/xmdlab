package org.application.manager.arquillian;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.gradle.archive.importer.embedded.EmbeddedGradleImporter;
import org.jboss.shrinkwrap.api.spec.WebArchive;

public class AppManagerDomainDeployment {

	public static WebArchive createWebArchive() {
		return ShrinkWrap
				.create(EmbeddedGradleImporter.class, "test.war")
				.forThisProjectDirectory()
				.importBuildOutput()
				.as(WebArchive.class)
				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				.addAsManifestResource(EmptyAsset.INSTANCE,
						ArchivePaths.create("beans.xml"))
				.addAsWebInfResource("jbossas-ds.xml");
	}
}
