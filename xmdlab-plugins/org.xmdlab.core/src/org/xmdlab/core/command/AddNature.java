package org.xmdlab.core.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.xmdlab.core.builder.XmdlabGeneratorBuilder;
import org.xmdlab.core.nature.XmdlabNature;
import org.xmdlab.core.util.PluginUtil;

public class AddNature extends AbstractHandler implements IHandler {

	/**
	 * 
	 */
	@Override
	public Object execute(final ExecutionEvent event) {
		final IProject project = PluginUtil.getProject(event);

		if (project != null) {
			try {
				// verify already registered builders
				if (hasNature(project))
					// already enabled
					return null;

				// add nature to project properties
				IProjectDescription description = project.getDescription();
				String[] natures = description.getNatureIds();
				String[] newNatures = new String[natures.length + 1];
				System.arraycopy(natures, 0, newNatures, 0, natures.length);
				newNatures[natures.length] = XmdlabNature.NATURE_ID;
				description.setNatureIds(newNatures);
				IProgressMonitor progressMonitor = new NullProgressMonitor();
				project.setDescription(description, progressMonitor);

				// verify already registered builders
				if (hasBuilder(project))
					// already enabled
					return null;

				// add builder to project properties
				final ICommand buildCommand = description.newCommand();
				buildCommand.setBuilderName(XmdlabGeneratorBuilder.BUILDER_ID);

				final List<ICommand> commands = new ArrayList<ICommand>();
				commands.addAll(Arrays.asList(description.getBuildSpec()));
				commands.add(buildCommand);

				description.setBuildSpec(commands.toArray(new ICommand[commands
						.size()]));
				project.setDescription(description, null);
			} catch (final CoreException e) {
				// TODO could not read/write project description
				e.printStackTrace();
			}
		}

		return null;
	}

	/**
	 * 
	 * @param project
	 * @return
	 */
	private static final boolean hasBuilder(final IProject project) {
		try {
			for (final ICommand buildSpec : project.getDescription()
					.getBuildSpec()) {
				if (XmdlabGeneratorBuilder.BUILDER_ID.equals(buildSpec
						.getBuilderName()))
					return true;
			}
		} catch (final CoreException e) {
		}

		return false;
	}

	/**
	 * 
	 * @param project
	 * @return
	 */
	private static final boolean hasNature(final IProject project) {
		try {
			for (final String natureid : project.getDescription()
					.getNatureIds()) {
				if (XmdlabNature.NATURE_ID.equals(natureid))
					return true;
			}
		} catch (final CoreException e) {
		}

		return false;
	}
}
