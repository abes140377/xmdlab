package org.xmdlab.core.util;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class PluginUtil {

	/**
	 * 
	 * @param event
	 * @return
	 */
	public static IProject getProject(final ExecutionEvent event) {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			final Object element = ((IStructuredSelection) selection).getFirstElement();

			return (IProject) Platform.getAdapterManager().getAdapter(element, IProject.class);
		}

		return null;
	}
}
