package org.xmdlab.cartridge.common.generator

import java.util.Map
import org.eclipse.xtext.generator.OutputConfiguration

interface IOutputConfigurationProvider {

	def Map<String, OutputConfiguration> getOutputConfigurations()
}
