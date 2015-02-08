package org.xmdlab.cartridge.common.generator

import com.google.inject.Injector
import java.io.File
import java.io.IOException
import java.lang.reflect.Constructor
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.ISetup
import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue
import org.xmdlab.cartridge.common.context.XmdlabGeneratorResult
import org.xmdlab.cartridge.common.util.FileHelper
import org.xmdlab.cartridge.common.context.XmdlabGeneratorResult.Status

/**
 * 
 */
abstract class GeneratorRunner<S extends ISetup, W extends CartridgeGeneratorWorkflow> {

	/**
	 * 
	 */
	def XmdlabGeneratorResult run(String modelFile) {
		val Constructor<S> constructor = getStandaloneSetupClass().getConstructor()
		val S setup = constructor.newInstance();

		val Injector injector = setup.createInjectorAndDoEMFRegistration()
		val W workflow = injector.getInstance(getWorkflowClass());
		XmdlabGeneratorContext.getGeneratedFiles().clear();

		val boolean success = workflow.run(URI.createFileURI(modelFile).toString());

		var List<XmdlabGeneratorIssue> issues = XmdlabGeneratorContext.getIssues();
		var List<File> generatedFiles = XmdlabGeneratorContext.getGeneratedFiles();
		val status = [
			if (success)
				Status::SUCCESS
			else
				Status::FAILED
		].apply(success)

		var XmdlabGeneratorResult result = new XmdlabGeneratorResult(status, issues, generatedFiles)

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

		return result
	}

	/**
	 * 
	 */
	def Class<S> getStandaloneSetupClass()

	/**
	 * 
	 */
	def Class<W> getWorkflowClass()
}
