package org.xmdlab.maven.plugin;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.maven.model.Resource;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.model.FileSet;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.codehaus.plexus.util.FileUtils;
import org.sonatype.plexus.build.incremental.BuildContext;
import org.xmdlab.cartridge.common.generator.GeneratorRunner;
import org.xmdlab.cartridge.common.generator.XmdlabGeneratorIssue;
import org.xmdlab.cartridge.common.generator.XmdlabGeneratorResult;

/**
 * @requiresDependencyResolution
 */
@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES, threadSafe = true, requiresDependencyResolution = ResolutionScope.COMPILE)
public class GeneratorMojo extends AbstractGeneratorMojo {

	/**
	 * The current build session instance. This is used for toolchain manager
	 * API calls.
	 */
	@Parameter(defaultValue = "${session}", readonly = true)
	private MavenSession session;

	/**
	 * Eclipse M2E integration.
	 */
	@Component
	private BuildContext buildContext;

	/**
	 * Relative path of model file.
	 */
	@Parameter(required = true)
	private String model;

	/**
	 * A <code>java.util.List</code> of {@link FileSet}s that will be checked on
	 * up-to-date. If all resources are up-to-date the plugin stops the
	 * execution, because there are no files to regenerate. <br/>
	 * The entries of this list can be relative path to the project root or
	 * absolute path.
	 * <p>
	 * If not specified then a fileset with the default value of
	 * <code>"src/main/resources/*.btdesign"</code> is used.
	 */
	@Parameter
	private FileSet[] checkFileSets;

	/**
	 * Skip the execution.
	 * <p>
	 * Can be set from command line using '-Dxmdlab.generator.skip=true'.
	 */
	@Parameter(property = "xmdlab.generator.skip", defaultValue = "false")
	private boolean skip;

	/**
	 * Don't try to detect if Sculptor code generation is up-to-date and can be
	 * skipped.
	 * <p>
	 * Can be set from command line using '-Dxmdlab.generator.force=true'.
	 */
	@Parameter(property = "xmdlab.generator.force", defaultValue = "false")
	private boolean force;

	/**
	 * Delete all previously generated files before starting code generation.
	 * <p>
	 * Can be set from command line using '-Dxmdlab.generator.clean=false'.
	 */
	@Parameter(property = "xmdlab.generator.clean", defaultValue = "true")
	private boolean clean;

	/**
	 * Returns <code>model</code> file.
	 */
	protected File getModelFile() {
		return new File(project.getBasedir(), model);
	}

	/**
	 * Check if the execution should be skipped.
	 * 
	 * @return true to skip
	 */
	protected boolean isSkip() {
		return skip;
	}

	/**
	 * Check if the execution should be forced.
	 * 
	 * @return true to force
	 */
	protected boolean isForce() {
		return force;
	}

	/**
	 * Check if the previously generated files should be deleted before starting
	 * the code generator.
	 * 
	 * @return true to delete
	 */
	protected boolean isClean() {
		return clean;
	}

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		URL[] urls = ((URLClassLoader) cl).getURLs();
		for (URL url : urls) {
			getLog().info(url.getFile());
		}

		// Initialize missing Mojo parameters
		initMojoMultiValueParameters();

		// If skip flag set then omit code generator execution
		if (isSkip()) {
			getLog().info("Skipping code generator execution");
			return;
		}

		// Check model file
		File modelFile = getModelFile();
		if (!modelFile.exists() || !modelFile.isFile()) {
			throw new MojoExecutionException("Model file '" + model
					+ "' specified in <model/> does not exists");
		}

		// If not forced flag set the check for modified source files
		Set<String> changedFiles;
		if (isForce()) {
			getLog().info("Forced code generator execution");
			changedFiles = null;
		} else {
			changedFiles = getChangedFiles();
		}

		// Code generator is only executed if force flag is set or source files
		// are modified
		if (changedFiles == null || !changedFiles.isEmpty()) {

			// If clean flag set then delete the previously generated files
			if (isClean()) {
				// deleteGeneratedFiles();
				getLog().warn(
						"Implement deleteGeneratedFiles() in GeneratorMojo");
			} else {
				getLog().info(
						"Automatic cleanup disabled - keeping "
								+ "previously generated files");
			}

			// Execute Sculptor code generator
			if (!executeGenerator()) {
				throw new MojoExecutionException(
						"Sculptor code generator failed");
			}
		}
	}

	/**
	 * Executes the commandline running the Eclipse MWE2 launcher and returns
	 * the commandlines exit value.
	 */
	protected boolean executeGenerator() throws MojoExecutionException {
		// Add resources and output directory to plugins classpath
		List<Object> classpathEntries = new ArrayList<Object>();
		classpathEntries.addAll(project.getResources());
		classpathEntries.add(project.getBuild().getOutputDirectory());
		extendPluginClasspath(classpathEntries);

		// Execute commandline and retrieve list of generated files
		List<File> generatedFiles;
		try {
			generatedFiles = doRunGenerator();
		} catch (Exception e) {
			throw new MojoExecutionException(e.getMessage(), e);
		}
		
		if (generatedFiles != null) {
			// If the code generation succeeded then write status file (and
			// refresh Eclipse workspace) else delete generated files
			if (isVerbose()) {
				for (File generatedFile : generatedFiles) {
					getLog().info(
							"Generated: "
									+ getProjectRelativePath(generatedFile));
				}
			}
			updateStatusFile(generatedFiles);
			if (generatedFiles.size() > 0) {
				refreshEclipseWorkspace();
			}
			getLog().info("Generated " + generatedFiles.size() + " files");
			return true;
		} else {
			getLog().error("Executing generator workflow failed");
		}
		return false;
	}

	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	protected List<File> doRunGenerator() throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Class c = Class
				.forName("org.xmdlab.cartridge.jee.generator.JeeGeneratorRunner");
		Constructor<? extends GeneratorRunner> constructor = c.getConstructor();
		GeneratorRunner runner = constructor.newInstance();
		System.out.println(runner);

		XmdlabGeneratorResult result = runner.run(getModelFile(),
				new Properties());

		// Log all issues occured during workflow execution
		for (XmdlabGeneratorIssue issue : result.getIssues()) {
			switch (issue.getSeverity()) {
			case ERROR:
				if (issue.getThrowable() != null) {
					getLog().error(issue.getMessage(), issue.getThrowable());
				} else {
					getLog().error(issue.getMessage());
				}
				break;
			case WARNING:
				getLog().warn(issue.getMessage());
				break;
			case INFO:
				getLog().info(issue.getMessage());
				break;
			}
		}

		// Abort build on error
		return (result.getStatus() == XmdlabGeneratorResult.Status.SUCCESS ? result
				.getGeneratedFiles() : null);
	}

	public void extendPluginClasspath(List<Object> classpathEntries)
			throws MojoExecutionException {
		// we need a LinkedHashSet here to preserve insertion order
		Set<URL> urls = new LinkedHashSet<URL>();
		for (Object classpathEntry : classpathEntries) {
			if (classpathEntry instanceof Resource) {
				File resourceFile = new File(
						((Resource) classpathEntry).getDirectory());
				if (resourceFile.exists()) {
					getLog().debug(
							"Adding resource to plugin classpath: "
									+ resourceFile.getPath());
					try {
						urls.add(resourceFile.toURI().toURL());
					} catch (MalformedURLException e) {
						throw new MojoExecutionException(e.getMessage(), e);
					}
				}
			} else if (classpathEntry instanceof String) {
				File path = new File((String) classpathEntry);
				if (path.exists()) {
					getLog().debug(
							"Adding path to plugin classpath: "
									+ path.getPath());
					try {
						urls.add(path.toURI().toURL());
					} catch (MalformedURLException e) {
						throw new MojoExecutionException(e.getMessage(), e);
					}
				}
			} else {
				throw new IllegalArgumentException(
						"Unsupported classpathentry: " + classpathEntry);
			}
		}
		ClassLoader classLoader = new ResourceChildFirstURLClassLoader(urls,
				Thread.currentThread().getContextClassLoader());
		getLog().debug(
				"Setting new context classloader '" + classLoader + "': "
						+ urls);
		Thread.currentThread().setContextClassLoader(classLoader);
	}

	private void refreshEclipseWorkspace() {
		getLog().warn("Implement refreshEclipseWorkspace() in GeneratorMojo");
		// buildContext.refresh(outletSrcOnceDir);
		// buildContext.refresh(outletResOnceDir);
		// buildContext.refresh(outletSrcDir);
		// buildContext.refresh(outletResDir);
		// buildContext.refresh(outletWebrootDir);
		// buildContext.refresh(outletSrcTestOnceDir);
		// buildContext.refresh(outletResTestOnceDir);
		// buildContext.refresh(outletSrcTestDir);
		// buildContext.refresh(outletResTestDir);
		// buildContext.refresh(outletDocDir);
	}

	/**
	 * Initialize default values for the multi-value Mojo parameter
	 * <code>checkFileSets</code>.
	 */
	protected void initMojoMultiValueParameters() {
		// Set default values for 'checkFileSets' to
		// "src/main/resources/*.btdesign"
		if (checkFileSets == null) {
			FileSet defaultFileSet = new FileSet();
			defaultFileSet.setDirectory(project.getBasedir()
					+ "/src/main/resources");
			defaultFileSet.addInclude("*.application");
			checkFileSets = new FileSet[] { defaultFileSet };
		}
	}

	/**
	 * Returns a list with file names from the <code>checkFileSets</code>
	 * parameter that have been modified since previous generator run. Empty if
	 * no files changed or <code>null</code> if there is no status file to
	 * compare against, i.e. always run the generator.
	 */
	protected Set<String> getChangedFiles() {

		// If there is no status file to compare against then always run the
		// generator
		File statusFile = getStatusFile();
		if (statusFile == null) {
			return null;
		}
		final long statusFileLastModified = statusFile.lastModified();
		final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (isVerbose()) {
			getLog().info(
					"Last code generator execution: "
							+ df.format(new Date(statusFileLastModified)));
		}

		// Create list of files to check - start with project pom.xml and
		// generator config files
		List<File> filesToCheck = new ArrayList<File>();
		filesToCheck.add(new File(project.getBasedir(), "pom.xml"));

		// Now add generator config files
		FileSet generatorFileSet = new FileSet();
		generatorFileSet.setDirectory(project.getBasedir()
				+ "/src/main/resources/generator");
		generatorFileSet.addInclude("*");
		filesToCheck.addAll(toFileList(generatorFileSet));

		// Finally add files from configured filesets in 'checkFileSets'
		for (FileSet fs : checkFileSets) {
			filesToCheck.addAll(toFileList(fs));
		}

		// Check files for modification
		Set<String> changedFiles = new HashSet<String>();
		for (File checkFile : filesToCheck) {
			if (!checkFile.isAbsolute()) {
				checkFile = new File(project.getBasedir(), checkFile.getPath());
			}
			final boolean isModified = checkFile.lastModified() > statusFileLastModified;
			if (isModified) {
				changedFiles.add(checkFile.getAbsolutePath());
			}
			if (isVerbose()) {
				getLog().info(
						"File '" + checkFile.getAbsolutePath() + "': "
								+ (isModified ? "outdated" : "up-to-date")
								+ " (" + " "
								+ df.format(new Date(checkFile.lastModified()))
								+ ")");
			}
		}

		// Print info of result
		if (changedFiles.size() == 1) {
			String fileName = changedFiles.iterator().next();
			if (fileName.startsWith(project.getBasedir().getAbsolutePath())) {
				fileName = fileName.substring(project.getBasedir()
						.getAbsolutePath().length() + 1);
			}
			final String message = MessageFormat.format(
					"\"{0}\" has been modified since last generator "
							+ "run at {1}", fileName,
					df.format(new Date(statusFileLastModified)));
			getLog().info(message);
		} else if (changedFiles.size() > 1) {
			final String message = MessageFormat.format(
					"{0} checked resources have been modified since "
							+ "last generator run at {1}", changedFiles.size(),
					df.format(new Date(statusFileLastModified)));
			getLog().info(message);
		} else {
			getLog().info(
					"Everything is up-to-date - no generator run is needed");
		}
		return changedFiles;
	}

	@SuppressWarnings("unchecked")
	private List<File> toFileList(FileSet fileSet) {
		File directory = new File(fileSet.getDirectory());
		String includes = toCommaSeparatedString(fileSet.getIncludes());
		String excludes = toCommaSeparatedString(fileSet.getExcludes());
		try {
			return FileUtils.getFiles(directory, includes, excludes);
		} catch (IllegalStateException e) {
			getLog().warn(e.getMessage() + ". Ignoring fileset.");
		} catch (IOException e) {
			getLog().warn(e);
		}
		return Collections.emptyList();
	}

	private String toCommaSeparatedString(Collection<String> strings) {
		StringBuilder sb = new StringBuilder();
		for (String string : strings) {
			if (sb.length() > 0) {
				sb.append(",");
			}
			sb.append(string);
		}
		return sb.toString();
	}
}