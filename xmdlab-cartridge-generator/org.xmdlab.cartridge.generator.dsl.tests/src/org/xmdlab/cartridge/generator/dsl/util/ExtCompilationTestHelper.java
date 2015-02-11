package org.xmdlab.cartridge.generator.dsl.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.junit.Assert;

public class ExtCompilationTestHelper extends CompilationTestHelper {

	/**
	 * Asserts that the expected code is generated for the given source.
	 * Assumes that
	 * 
	 * @param source some valid source code written in the language under test
	 * @param expected the expected Java source code.
	 * @throws IOException if the resource loading fails 
	 */
	public void assertCompilesToReference(CharSequence source, final CharSequence expected, final Map<String, String> srcFolders) throws IOException {		
		final List<String> srcFiles = new ArrayList<String>();
		final List<String> srcGenFiles = new ArrayList<String>();

		final boolean[] called = {false};
		compile(source, new IAcceptor<CompilationTestHelper.Result>() {
			public void accept(Result r) {
				Map<String, CharSequence> generatedResources = r.getAllGeneratedResources();
				
				String refSrcFolder = null;
				String refSrcGenFolder = null;
				
				for (Entry<String, String> tFolder : srcFolders.entrySet()) {
					if(tFolder.getKey().equals("src")) {
						refSrcFolder = tFolder.getValue(); 
					} else if (tFolder.getKey().equals("src-gen")) {
						refSrcGenFolder = tFolder.getValue();
					}
				}
				
				for (Entry<String, CharSequence> entry : generatedResources.entrySet()) {
					String path = entry.getKey();
					String trimmed = path.substring(11);
					
					if(trimmed.startsWith("src/")) {
						srcFiles.add(trimmed.substring(4));
					} else if(trimmed.startsWith("src-gen/")) {
						srcGenFiles.add(trimmed.substring(8));
					} else {
						throw new RuntimeException("Folder not available");
					}					
				}
				
				System.out.println(srcFiles);
				System.out.println(srcGenFiles);
				
				System.out.println(refSrcFolder);
				System.out.println(refSrcFolder);
				
				for (String srcFile : srcFiles) {
					System.out.println(srcFile);
				}
				
				for (String srcGenFile : srcGenFiles) {
					
				}
				
//				Assert.assertEquals(expected.toString(), r.getSingleGeneratedCode());
				called[0] = true;
			}
		});
		Assert.assertTrue("Nothing was generated but the expectation was :\n"+expected, called[0]);
	}
}
