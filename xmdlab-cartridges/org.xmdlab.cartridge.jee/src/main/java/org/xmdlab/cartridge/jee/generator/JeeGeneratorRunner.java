/*
 * Copyright 2014 The Sculptor Project Team, including the original 
 * author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xmdlab.cartridge.jee.generator;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ISetup;
import org.xmdlab.cartride.common.generator.GeneratorRunner;
import org.xmdlab.cartride.common.generator.XmdlabGeneratorContext;
import org.xmdlab.cartride.common.generator.XmdlabGeneratorIssue;
import org.xmdlab.cartride.common.generator.XmdlabGeneratorResult;
import org.xmdlab.cartride.common.generator.XmdlabGeneratorResult.Status;
import org.xmdlab.cartride.common.util.FileHelper;
import org.xmdlab.cartridge.jee.JeeCartridgeGeneratorStandaloneSetup;

import com.google.inject.Injector;

/**
 * Retrieves an instance of the generators internal workflow from the generators
 * guice-configured setup, executes it with the given model + generator
 * properties and returns a {@link XmdlabGeneratorResult} instance (holding
 * lists of generated {@link File}s and {@link XmdlabGeneratorIssue} instances).
 * 
 * @see SculptorGeneratorSetup#createInjectorAndDoEMFRegistration()
 * @see SculptorGeneratorWorkflow#run(String)
 */
public class JeeGeneratorRunner implements GeneratorRunner {

	/**
	 * 
	 */
	public XmdlabGeneratorResult run(File modelFile, Properties generatorProperties) {
		Injector injector = new JeeCartridgeGeneratorStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		JeeCartridgeGeneratorWorkflow workflow = injector
				.getInstance(JeeCartridgeGeneratorWorkflow.class);
		XmdlabGeneratorContext.getGeneratedFiles().clear();
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// Execute the generators workflow
			boolean success = workflow.run(
					URI.createFileURI(modelFile.toString()).toString(),
					generatorProperties);

			List<XmdlabGeneratorIssue> issues = XmdlabGeneratorContext
					.getIssues();
			List<File> generatedFiles = XmdlabGeneratorContext
					.getGeneratedFiles();
			XmdlabGeneratorResult result = new XmdlabGeneratorResult(
					(success ? Status.SUCCESS : Status.FAILED), issues,
					generatedFiles);

			// If generation failed then delete any generated files
			if (!success) {
				for (File file : generatedFiles) {
					try {
						FileHelper.deleteFile(file);
					} catch (IOException e) {
						// we can't do anything here
					}
				}
			}
			return result;
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return null;
		} finally {
			XmdlabGeneratorContext.close();
		}
	}

}