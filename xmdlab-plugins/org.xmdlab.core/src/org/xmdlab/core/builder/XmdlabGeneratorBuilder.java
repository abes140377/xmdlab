package org.xmdlab.core.builder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.reflections.Reflections;

/**
 * 
 * @author freund
 *
 */
public class XmdlabGeneratorBuilder extends IncrementalProjectBuilder {

	public static final String BUILDER_ID = "org.xmdlab.builder.generatorBuilder";

	/**
	 * 
	 */
	@Override
	protected IProject[] build(final int kind, final Map<String, String> args,
			final IProgressMonitor monitor) throws CoreException {

		// get the project to build
		IProject project = getProject();
		IJavaProject javaProject = JavaCore.create(project);

		System.out.println(javaProject);
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		switch (kind) {

		case FULL_BUILD:

			System.out
					.println("Xmdlab Cartridge Generator builder (FULL_BUILD) triggered on "
							+ project.getName());
			break;

		case INCREMENTAL_BUILD:
			System.out
					.println("Xmdlab Cartridge Generator builder (INCREMENTAL_BUILD) triggered on "
							+ project.getName());
			break;

		case AUTO_BUILD:
			System.out
					.println("Xmdlab Cartridge Generator builder (AUTO_BUILD) triggered on "
							+ project.getName());
			break;
		}

		return new IProject[] { project };
	}
}
