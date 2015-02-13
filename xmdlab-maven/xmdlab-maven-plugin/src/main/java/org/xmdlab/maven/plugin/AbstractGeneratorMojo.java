package org.xmdlab.maven.plugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.FileUtils;

/**
 * Base class for all code generator-related {@link Mojo}s of this plugin. It
 * provides common properties (like the outlet directories for the code
 * generator) and shared code (like handling of the generated files).
 */
public abstract class AbstractGeneratorMojo extends AbstractMojo {

	/**
	 * The enclosing project.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	protected MavenProject project;

	/**
	 * File holding the status of the last code generator execution.
	 */
	@Parameter(defaultValue = ".sculptor-status", required = true)
	private File statusFile;

	/**
	 * Verbose logging.
	 * <p>
	 * Can be set from command line using '-Dverbose=true'.
	 */
	@Parameter(property = "verbose", defaultValue = "false")
	private boolean verbose;

	/**
	 * Returns enclosing {@link MavenProject}.
	 */
	protected MavenProject getProject() {
		return project;
	}

	/**
	 * Check if the logging should be verbose.
	 * <p>
	 * If Maven debug logging is requested "mvn -X" the verbose logging is
	 * active as well.
	 * 
	 * @return true to verbose logging
	 */
	protected boolean isVerbose() {
		return verbose || getLog().isDebugEnabled();
	}

	/**
	 * Returns the StatusFile (defined via {@link #statusFile}) or
	 * <code>null</code> if none exists.
	 */
	protected File getStatusFile() {
		return (statusFile.exists() ? statusFile : null);
	}

	/**
	 * Returns the list of generated files from the StatusFile (defined via
	 * {@link #statusFile}) or <code>null</code> if no StatusFile exists.
	 */
	protected Set<String> getGeneratedFiles() {
		Properties statusFileProps = getStatusProperties();
		if (statusFileProps != null) {
			return statusFileProps.stringPropertyNames();
		}
		return null;
	}

	/**
	 * Updates the StatusFile (defined via {@link #statusFile}). This file
	 * indicates the last successful execution of the code generator and is used
	 * to check the state of the source files.
	 * 
	 * @param createdFiles
	 *            list of files created by the code generator
	 */
	protected boolean updateStatusFile(List<File> createdFiles) {
		boolean success;
		final Properties statusProperties = new Properties();
		try {
			for (File createdFile : createdFiles) {
				try {
					statusProperties.setProperty(
							getProjectRelativePath(createdFile),
							calculateChecksum(createdFile));
				} catch (IOException e) {
					getLog().warn(
							"Checksum calculation failed: " + e.getMessage());
				}
			}
			final FileWriter statusWriter = new FileWriter(statusFile);
			try {
				statusProperties.store(statusWriter,
						"Sculptor created the following " + createdFiles.size()
								+ " files");
				success = true;
			} finally {
				statusWriter.close();
			}
		} catch (IOException e) {
			getLog().warn("Updating status file failed: " + e.getMessage());
			success = false;
		}
		return success;
	}

	/**
	 * Returns the {@link Properties} instance populated from the StatusFile
	 * (defined via {@link #statusFile}) or <code>null</code> if no StatusFile
	 * exists.
	 */
	private Properties getStatusProperties() {
		final File statusFile = getStatusFile();
		if (statusFile != null) {
			try {
				Properties statusFileProps = new Properties();
				final FileReader statusReader = new FileReader(statusFile);
				try {
					statusFileProps.load(statusReader);
					return statusFileProps;
				} finally {
					statusReader.close();
				}
			} catch (IOException e) {
				getLog().warn("Reading status file failed: " + e.getMessage());
			}
		}
		return null;
	}
	
//	/**
//	 * Deletes the files in the directories marked as 'generated' and the
//	 * unmodified one-shot generated files.
//	 * <p>
//	 * The list of all previously generated files is retrieved from the StatusFile
//	 * (defined via {@link #statusFile}). Modified one-shot generated files are
//	 * detected by a changed file checksum.
//	 */
//	protected boolean deleteGeneratedFiles() {
//		boolean success;
//		
//		// First delete all files in the directories marked as 'generated'
//		cleanDirectory(outletSrcDir);
//		cleanDirectory(outletResDir);
//		cleanDirectory(outletSrcTestDir);
//		cleanDirectory(outletResTestDir);
//
//		// Finally delete the non-modified one-shot generated files in the other folders
//		Properties statusFileProps = getStatusProperties();
//
//		// If there is no status file to compare against or no files are
//		// generated then skip deletion
//		if (statusFileProps == null || statusFileProps.isEmpty()) {
//
//			// No status file - we can't delete any previously generated files
//			success = true;
//		} else {
//			try {
//				// Iterate through the list of generated files
//				for (String fileName : statusFileProps.stringPropertyNames()) {
//					File file = new File(getProject().getBasedir(), fileName);
//					if (file.exists()) {
//
//						// For one-shot generated files compare checksum before
//						// deleting
//						boolean delete;
//						if (fileName
//								.startsWith(getProjectRelativePath(outletSrcOnceDir))
//								|| fileName
//										.startsWith(getProjectRelativePath(outletResOnceDir))
//								|| fileName
//										.startsWith(getProjectRelativePath(outletWebrootDir))
//								|| fileName
//										.startsWith(getProjectRelativePath(outletSrcTestOnceDir))
//								|| fileName
//										.startsWith(getProjectRelativePath(outletResTestOnceDir))) {
//							delete = calculateChecksum(file).equals(
//									statusFileProps.getProperty(fileName));
//							if (!delete
//									&& (isVerbose() || getLog()
//											.isDebugEnabled())) {
//								getLog().info(
//										"Keeping previously generated modified"
//												+ " file: " + file);
//							}
//						} else {
//							delete = false;
//						}
//						if (delete) {
//							if (isVerbose() || getLog().isDebugEnabled()) {
//								getLog().info(
//										"Deleting previously generated file: "
//												+ file);
//							}
//							// We have to make sure the file is deleted on
//							// Windows as well
//							FileUtils.forceDelete(file);
//
//							// Delete image file generated from dot file
//							if (fileName.endsWith(".dot")) {
//								File imageFile = new File(getProject()
//										.getBasedir(), fileName + ".png");
//								if (imageFile.exists()) {
//									if (isVerbose()
//											|| getLog().isDebugEnabled()) {
//										getLog().info(
//												"Deleting previously generated file: "
//														+ imageFile);
//									}
//									// We have to make sure the file is deleted
//									// on Windows as well
//									FileUtils.forceDelete(imageFile);
//								}
//							}
//						}
//					}
//				}
//				success = true;
//			} catch (IOException e) {
//				getLog().warn("Reading status file failed: " + e.getMessage());
//				success = false;
//			}
//		}
//		return success;
//	}

//	/**
//	 * Deletes all files within the given directory.
//	 */
//	private void cleanDirectory(File dir) {
//		if (isVerbose() || getLog().isDebugEnabled()) {
//			getLog().info(
//					"Deleting previously generated files in directory: "
//							+ dir.getPath());
//		}
//		if (dir.exists()) {
//			try {
//				FileUtils.cleanDirectory(dir);
//			} catch (IOException e) {
//				getLog().warn("Cleaning directory failed: " + e.getMessage());
//			}
//		}
//	}

	/**
	 * Returns the path of given file relative to the enclosing Maven project.
	 */
	protected String getProjectRelativePath(File file) {
		String path = file.getAbsolutePath();
		String prefix = project.getBasedir().getAbsolutePath();
		if (path.startsWith(prefix)) {
			path = path.substring(prefix.length() + 1);
		}
		if (File.separatorChar != '/') {
			path = path.replace(File.separatorChar, '/');
		}
		return path;
	}

	/**
	 * Returns a hex representation of the MD5 checksum from given file.
	 */
	private String calculateChecksum(File file) throws IOException {
		InputStream is = new FileInputStream(file);
		return DigestUtils.md5Hex(is);
	}
}
