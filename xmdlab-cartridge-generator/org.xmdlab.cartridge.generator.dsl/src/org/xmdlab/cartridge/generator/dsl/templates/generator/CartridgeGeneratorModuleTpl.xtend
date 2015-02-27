package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject

import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import static org.xmdlab.util.StringHelper.*
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

class CartridgeGeneratorModuleTpl {

	@Inject extension GeneratorProperties generatorProperties
	
	def generate(DslCartridge dslCartridge) '''
		«val modelName = dslCartridge.name»
		«val modelNameFirstUpper = modelName.toFirstUpper»
		«val className = modelNameFirstUpper + "CartridgeGeneratorModule"»
		«getGeneratedComment(class.name)»
		package «basePackage»;
		
		import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
		import org.eclipse.xtext.service.AbstractGenericModule;
		import org.xmdlab.cartridge.common.conf.CartridgeProperties;
		import org.xmdlab.cartridge.common.generator.IOutputConfigurationProvider;
		import org.xmdlab.cartridge.common.io.OutputConfigurationAwareFileSystemAccess;
		import «basePackage».conf.«modelNameFirstUpper»CartridgeProperties;
		import «basePackage».generator.«modelNameFirstUpper»CartridgeGenerator;
		import «basePackage».io.«modelNameFirstUpper»CartridgeOutputConfigurationProvider;
		import «basePackage».metafacade.*;
		
		import com.google.inject.Binder;
		
		«getClassComment(className)»
		public class «className» extends AbstractGenericModule {
		
			@Override
			public void configure(Binder binder) {
				super.configure(binder);
			}
			
			public Class<? extends CartridgeProperties> bind«modelNameFirstUpper»CartridgeProperties() {
				return «modelNameFirstUpper»CartridgeProperties.class;
			}
			
			public Class<? extends org.xmdlab.cartridge.common.generator.IGenerator> bindIGenerator() {
				return «modelNameFirstUpper»CartridgeGenerator.class;
			}
			
			public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
				return «modelNameFirstUpper»CartridgeOutputConfigurationProvider.class;
			}
			
			public Class<? extends JavaIoFileSystemAccess> bindJavaIoFileSystemAccess() {
				return OutputConfigurationAwareFileSystemAccess.class;
			}
			
			«FOR metafacade : dslCartridge.metafacades»
			public Class<? extends «metafacade.name.toFirstUpper»> bind«metafacade.name.toFirstUpper»() {
				return «metafacade.name.toFirstUpper»Impl.class;
			}
			
			«ENDFOR»
		}
	'''
}
