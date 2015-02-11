/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.generator.CartridgeGeneratorBaseXtendTpl
 */
package org.xmdlab.cartridge.jee.generator

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.generator.IFileSystemAccess
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.xmdlab.cartridge.common.generator.IGenerator
import org.xmdlab.cartridge.jee.conf.JeeCartridgeProperties
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade
import org.xmdlab.cartridge.jee.metafacade.EntityMetafacade
import org.xmdlab.cartridge.jee.templates.EntityTpl
import org.xmdlab.cartridge.jee.templates.ReadmeMdTpl
import org.xmdlab.jee.application.mm.MmApplication
import org.xmdlab.jee.application.mm.MmEntity

import static org.xmdlab.cartridge.jee.io.JeeCartridgeOutputConfigurationProvider.*

/**
 * The JeeCartridgeGeneratorBase
 *
 * @author Sebastian Freund<seba1403@googlemail.com>
 *
 */
abstract class JeeCartridgeGeneratorBase implements IGenerator<MmApplication> {

	val static final Logger LOG = LoggerFactory.getLogger(JeeCartridgeGeneratorBase)

	@Inject JeeCartridgeProperties jeeCartridgeProperties

	@Inject ApplicationMetafacade applicationMetafacade
	@Inject EntityMetafacade entityMetafacade

	@Inject Provider<ReadmeMdTpl> readmeMdTpl
	@Inject Provider<EntityTpl> entityTpl

	/**
	* This method is a long sequence of calling all templates for the code generation
	*/
	override void doGenerate(MmApplication mmApplication, IFileSystemAccess fsa) {
		LOG.info("")
		LOG.info("// =============================================================================")
		LOG.info("// Running generator")
		LOG.info("// =============================================================================")
		LOG.info("")

		jeeCartridgeProperties.config.entrySet.forEach [
			LOG.info(it.key + " -> " + it.value.render)
		]

		// compile templates
		compileReadmeMd(fsa, mmApplication)

		mmApplication.eAllContents.filter(MmEntity).forEach[compileEntity(fsa, it)]
	}

	/**
	 * 
	 */
	def void compileEntity(IFileSystemAccess fsa, MmEntity entity) {
		LOG.info("compileEntity: " + entity)

		val EntityTpl tpl = entityTpl.get

		val String fileName = entity.name + ".java"

		entityMetafacade.modelResource = entity

		fsa.generateFile(fileName, OUTPUTCONFIG_CORE_GENERATED_SRC, tpl.generate())
	}

	/**
	 *
	 */
	def compileReadmeMd(IFileSystemAccess fsa, MmApplication mmApplication) {
		LOG.info("compileReadmeMd")

		val ReadmeMdTpl tpl = readmeMdTpl.get

		val String fileName = "README.md"
		
		applicationMetafacade.modelResource = mmApplication

		fsa.generateFile(fileName, tpl.generate())
	}
}
