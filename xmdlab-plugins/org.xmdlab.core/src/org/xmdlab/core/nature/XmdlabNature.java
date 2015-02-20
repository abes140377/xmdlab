package org.xmdlab.core.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * 
 * @author freund
 *
 */
public class XmdlabNature implements IProjectNature {
	
	public static final String NATURE_ID = "nature.xmdlabNature";

	private IProject project;

	@Override
	public void configure() throws CoreException {
		System.out.println("DEBUG: XmdlabNature#configure()");
		
	}

	@Override
	public void deconfigure() throws CoreException {
		System.out.println("DEBUG: XmdlabNature#deconfigure()");

	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

}
