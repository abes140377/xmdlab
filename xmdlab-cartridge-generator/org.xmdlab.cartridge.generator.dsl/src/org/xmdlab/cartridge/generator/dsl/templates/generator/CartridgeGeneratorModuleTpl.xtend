package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject

import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.util.StringHelper
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

class CartridgeGeneratorModuleTpl {

	@Inject extension GeneratorProperties generatorProperties
	
	def generate(DslCartridge dslCartridge) '''
		«val modelName = dslCartridge.name»
		«val modelNameFirstUpper = modelName.toFirstUpper»
		«val className = modelNameFirstUpper + "CartridgeGeneratorModule"»
		«StringHelper.getGeneratedComment(class.name)»
		package «basePackage»;
		
		import org.eclipse.xtext.generator.IOutputConfigurationProvider;
		//import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
		import org.eclipse.xtext.service.AbstractGenericModule;
		
		import com.google.inject.Binder;
		
		import «basePackage».util.«modelNameFirstUpper»CartridgeOutputConfigurationProvider;
		
		import «basePackage».metafacade.*;
		import «basePackage».generator.*;
		
		«StringHelper::getClassComment(className)»
		public class «className» extends AbstractGenericModule {
		
			@Override
			public void configure(Binder binder) {
				super.configure(binder);
			}
		
			public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
				return «modelNameFirstUpper»CartridgeGenerator.class;
			}
		
			public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
				return «modelNameFirstUpper»CartridgeOutputConfigurationProvider.class;
			}
			
			«FOR metafacade : dslCartridge.metafacades»
			public Class<? extends «metafacade.name.toFirstUpper»> bind«metafacade.name.toFirstUpper»() {
				return «metafacade.name.toFirstUpper»Impl.class;
			}
			«ENDFOR»
		
			// public Class<? extends JavaIoFileSystemAccess> bindJavaIoFileSystemAccess() {
			//	return de.freund.xgen.xtext.core.fsa.JavaIoFileSystemAccessExt.class;
			// }
		}
	'''
}
