package org.xmdlab.cartridge.jee.generator

import com.google.common.base.Charsets
import com.google.common.io.Files
import com.google.inject.Inject
import com.google.inject.Injector
import java.io.File
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.junit4.util.ParseHelper
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.xmdlab.cartridge.common.context.XmdlabGeneratorContext
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.Severity
import org.xmdlab.cartridge.common.context.XmdlabGeneratorIssue.XmdlabGeneratorIssueImpl
import org.xmdlab.cartridge.common.generator.CartridgeGeneratorWorkflow
import org.xmdlab.cartridge.common.generator.IGenerator
import org.xmdlab.cartridge.common.generator.JavaIoFileSystemAccessExt
import org.xmdlab.cartridge.jee.io.JeeCartridgeOutputConfigurationProvider
import org.xmdlab.cartridge.jee.transformation.JeeCartridgeTransformation
import org.xmdlab.dsl.application.applicationDsl.DslApplication
import org.xmdlab.dsl.application.applicationDsl.DslModel
import org.xmdlab.jee.application.mm.MmApplication

/**
 * 
 */
class JeeCartridgeGeneratorWorkflow extends CartridgeGeneratorWorkflow {

	private Logger LOGGER = LoggerFactory.getLogger(JeeCartridgeGeneratorWorkflow)

	@Inject
	var Injector injector

	@Inject
	ParseHelper<DslModel> parser

	/**
	 * 
	 */
	override boolean run(String modelURI) {
		LOGGER.info(parser.toString)
		val DslModel dslModel = parser.parse(Files.toString(new File(modelURI), Charsets.ISO_8859_1))

		val DslApplication dslApplication = dslModel.eAllContents.filter(DslApplication).head

		if (validate(dslApplication)) {
			
			val mmApplication = transformModel(dslApplication)
			
			if (mmApplication != null) {
				generateCode(mmApplication)
				return true
			}
		}

		LOGGER.error("Executing workflow failed")

		return false
	}

	/**
	 * 
	 */
	protected def void generateCode(MmApplication mmApplication) {
		val JeeCartridgeOutputConfigurationProvider outputConfigurationProvider = injector.getInstance(
			JeeCartridgeOutputConfigurationProvider)
		val JavaIoFileSystemAccess fsa = injector.getInstance(JavaIoFileSystemAccessExt)
		fsa.outputConfigurations = outputConfigurationProvider.outputConfigurations
		val IGenerator<MmApplication> generator = injector.getInstance(JeeCartridgeGenerator)

		generator.doGenerate(mmApplication, fsa)
	}

	/**
	 * 
	 */
	protected def MmApplication transformModel(DslApplication application) {
		LOGGER.info("Transforming application " + application.name)

		// run transformation
		val JeeCartridgeTransformation transformation = injector.getInstance(JeeCartridgeTransformation)
		var transformedApplication = transformation.transform(application) as MmApplication

		if (transformedApplication == null) {
			XmdlabGeneratorContext.addIssue(
				new XmdlabGeneratorIssueImpl(Severity.ERROR,
					"Transformation and modification of model '" + application.name + "' failed"))
		}

		return transformedApplication
	}

}
