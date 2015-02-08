package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
//import org.xmdlab.cartridge.generator.dsl.util.ModelHelper

class CartridgeOutputConfigurationProviderTpl {

	@Inject extension GeneratorProperties generatorProperties
//	@Inject extension ModelHelper modelHelper

	val prefix = "OUTPUTCONFIG_"

	def generate(DslCartridge dslCartridge) '''
		«val className = cartridgeName.toFirstUpper + "CartridgeOutputConfigurationProvider"»
		«getGeneratedComment(class.name)»
		package «basePackage».io;
		
		import java.util.Map
		import org.eclipse.xtext.generator.OutputConfiguration
		import org.xmdlab.cartridge.common.generator.DefaultOutputConfigurationProvider
		
		«getClassComment(className, "Configuration of output locations and settings for code generation.")»
		public class «className» extends DefaultOutputConfigurationProvider {
			Map<String, OutputConfiguration> outputs = super.getOutputConfigurations();
		
			«FOR o : dslCartridge.outlets»
				public static String «prefix»«camelCaseToUnderscore(o.name)» = "«o.name»";
			«ENDFOR»
		
			override public Map<String, OutputConfiguration> getOutputConfigurations() {
			«FOR o : dslCartridge.outlets»
				//
				var OutputConfiguration «o.name»Output = new OutputConfiguration(«prefix»«camelCaseToUnderscore(o.name)»);
				«o.name»Output.setDescription("«o.name» output configuraton");
				«o.name»Output.setOutputDirectory("«o.outputDirectory»");
				«o.name»Output.setOverrideExistingResources(«o.overwrite.asString»);
				
				outputs.put(«prefix»«camelCaseToUnderscore(o.name)», «o.name»Output);
				
			«ENDFOR»
				return outputs;
			}
		}
	'''
}
