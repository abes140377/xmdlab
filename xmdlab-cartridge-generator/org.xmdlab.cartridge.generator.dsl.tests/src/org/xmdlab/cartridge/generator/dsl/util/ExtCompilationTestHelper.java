package org.xmdlab.cartridge.generator.dsl.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.junit.Assert;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class ExtCompilationTestHelper extends CompilationTestHelper {
	
	public static final String MAN_SRC_FOLDER_KEY = "src";
	public static final String GEN_SRC_FOLDER_KEY = "src-gen";
	public static final String GEN_TEST_SRC_FOLDER_KEY = "test-src-gen";
	public static final String BASE_FOLDER_KEY = "base";

	/**
	 * Asserts that the expected code is generated for the given source. Assumes
	 * that
	 * 
	 * @param source
	 *            some valid source code written in the language under test
	 * @param expected
	 *            the expected Java source code.
	 * @throws IOException
	 *             if the resource loading fails
	 */
	public void assertCompilesToReference(CharSequence source,
			final Map<String, String> srcFolders) throws IOException {
		final List<String> srcFiles = new ArrayList<String>();
		final List<String> srcGenFiles = new ArrayList<String>();
		final List<String> testSrcGenFiles = new ArrayList<String>();
		final List<String> baseFiles = new ArrayList<String>();

		final boolean[] called = { false };
		compile(source, new IAcceptor<CompilationTestHelper.Result>() {
			public void accept(Result r) {
				Map<String, CharSequence> generatedResources = r
						.getAllGeneratedResources();

				String refSrcFolder = null;
				String refSrcGenFolder = null;
				String refTestSrcGenFolder = null;
				String refBaseFolder = null;

				for (Entry<String, String> tFolder : srcFolders.entrySet()) {
					if (tFolder.getKey().equals(MAN_SRC_FOLDER_KEY)) {
						refSrcFolder = tFolder.getValue();
					} else if (tFolder.getKey().equals(GEN_SRC_FOLDER_KEY)) {
						refSrcGenFolder = tFolder.getValue();
					} else if (tFolder.getKey().equals(GEN_TEST_SRC_FOLDER_KEY)) {
						refTestSrcGenFolder = tFolder.getValue();
					} else if (tFolder.getKey().equals(BASE_FOLDER_KEY)) {
						refBaseFolder = tFolder.getValue();
					}
				}

				if (refSrcFolder == null || refSrcGenFolder == null
						|| refBaseFolder == null || refTestSrcGenFolder == null)
					throw new RuntimeException(
							"Unable to exetute ExtCompilationTestHelper.assertCompilesToReference because on of"
									+ "refSrcFolder, refSrcGenFolder or refBaseFolder could not be determined.");

				for (Entry<String, CharSequence> entry : generatedResources
						.entrySet()) {
					String path = entry.getKey();
					String trimmed = path.substring(11);

					System.out.println(trimmed);

					if (trimmed.startsWith("src/main/java/")) {
						srcFiles.add(trimmed.substring(14));
					} else if (trimmed.startsWith("src-gen/")) {
						srcGenFiles.add(trimmed.substring(8));
					} else if (trimmed.startsWith("test-src-gen/")) {
						testSrcGenFiles.add(trimmed.substring(13));
					} else if (trimmed.indexOf("/") == -1) {
						baseFiles.add(trimmed);
					} else {
						throw new RuntimeException("Folder not available");
					}
				}

				for (String srcFile : srcFiles) {
					CharSequence generatedFileContent = generatedResources
							.get("/myProject/src/main/java/" + srcFile);

					File expectedFile = null;
					String expectedFileContent = null;
					try {
						File initialFile = new File(refSrcFolder + "/"
								+ srcFile + ".initial");
						if (initialFile.exists()) {
							expectedFile = initialFile;
						} else {
							expectedFile = new File(refSrcFolder + "/"
									+ srcFile);
						}
						expectedFileContent = Files.toString(expectedFile,
								Charsets.ISO_8859_1);
					} catch (IOException e) {
						Assert.assertTrue("Expected File " + expectedFile
								+ " does not exist.", false);
					}

					System.out.print("[refSrcFolder] Compare file: ");
					System.out.println(srcFile + " < - > " + expectedFile);

					Assert.assertEquals(expectedFileContent,
							generatedFileContent.toString());
				}

				for (String srcGenFile : srcGenFiles) {
					File expectedFile = null;
					String expectedFileContent = null;

					CharSequence generatedFileContent = generatedResources
							.get("/myProject/src-gen/" + srcGenFile);

					expectedFile = new File(refSrcGenFolder + "/" + srcGenFile);
					try {
						expectedFileContent = Files.toString(expectedFile,
								Charsets.ISO_8859_1);
					} catch (IOException e) {
						Assert.assertTrue("Expected File " + expectedFile
								+ " does not exist.", false);
					}

					System.out.print("[refSrcFolder] Compare file: ");
					System.out.println(srcGenFile + " < - > " + expectedFile);

					Assert.assertEquals(expectedFileContent,
							generatedFileContent.toString());
				}

				for (String baseFile : baseFiles) {
					File expectedFile = null;
					String expectedFileContent = null;

					CharSequence generatedFileContent = generatedResources
							.get("/myProject/" + baseFile);

					expectedFile = new File(refBaseFolder + "/" + baseFile);
					try {
						expectedFileContent = Files.toString(expectedFile,
								Charsets.ISO_8859_1);
					} catch (IOException e) {
						Assert.assertTrue("Expected File " + expectedFile
								+ " does not exist.", false);
					}

					System.out.print("[refBaseFolder] Compare file: ");
					System.out.println(baseFile + " < - > " + expectedFile);

					Assert.assertEquals(expectedFileContent,
							generatedFileContent.toString());
				}
				
				for (String testSrcGenFile : testSrcGenFiles) {
					File expectedFile = null;
					String expectedFileContent = null;

					CharSequence generatedFileContent = generatedResources
							.get("/myProject/test-src-gen/" + testSrcGenFile);

					expectedFile = new File(refTestSrcGenFolder + "/" + testSrcGenFile);
					try {
						expectedFileContent = Files.toString(expectedFile,
								Charsets.ISO_8859_1);
					} catch (IOException e) {
						Assert.assertTrue("Expected File " + expectedFile
								+ " does not exist.", false);
					}

					System.out.print("[refTestSrcGen] Compare file: ");
					System.out.println(testSrcGenFile + " < - > " + expectedFile);

					Assert.assertEquals(expectedFileContent,
							generatedFileContent.toString());
				}

				called[0] = true;
			}
		});
	}
}
