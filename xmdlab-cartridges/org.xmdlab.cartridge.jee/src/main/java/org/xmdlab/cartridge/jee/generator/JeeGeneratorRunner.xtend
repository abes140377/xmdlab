package org.xmdlab.cartridge.jee.generator

import org.xmdlab.cartridge.common.generator.GeneratorRunner
import java.io.File
import com.google.inject.Injector
import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext
import org.eclipse.emf.common.util.URI
import java.util.List
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue
import org.xmdlab.cartridge.common.context.XmdlabGeneratorResult
import org.xmdlab.cartridge.common.context.XmdlabGeneratorResult.Status;
import org.xmdlab.cartridge.common.util.FileHelper
import java.io.IOException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.xmdlab.cartridge.jee.JeeCartridgeGeneratorStandaloneSetup

/**
 * 
 */
class JeeGeneratorRunner implements GeneratorRunner {
	
	private Logger LOGGER = LoggerFactory.getLogger(JeeGeneratorRunner);
	
	/**
	 * 
	 */
	override run(File modelFile) {
		val Injector injector = new JeeCartridgeGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration()
		val JeeCartridgeGeneratorWorkflow workflow = injector
				.getInstance(JeeCartridgeGeneratorWorkflow);
		XmdlabGeneratorContext.getGeneratedFiles().clear();
		
		try {
			// Execute the generators workflow
			val boolean success = workflow.run(
					URI.createFileURI(modelFile.toString()).toString());

			var List<XmdlabGeneratorIssue> issues = XmdlabGeneratorContext
					.getIssues();
			var List<File> generatedFiles = XmdlabGeneratorContext
					.getGeneratedFiles();
			val status = [
				if(success)
					Status::SUCCESS
				else
					Status::FAILED
			].apply(success)
			//val status = success ? Status::SUCCESS : Status::FAILED
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
			return result;
		} catch (Exception e) {
			LOGGER.error(e.toString(), e);
			return null;
		} finally {
			XmdlabGeneratorContext.close();
		}
	}
	
}