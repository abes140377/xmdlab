package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import static org.xmdlab.util.StringHelper.*
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class CartridgeGeneratorXtendTpl {

	@Inject extension GeneratorProperties generatorProperties

	def generate(DslCartridge dslCartridge) '''
		«val modelNameFirstUpper = cartridgeName.toFirstUpper»
		«val className = modelNameFirstUpper + "CartridgeGenerator"»
		«getGeneratedComment(class.name)»
		package «basePackage».generator
		
		import org.eclipse.xtext.generator.IFileSystemAccess
		«FOR m : dslCartridge.metafacades»
		import «m.modelElement»
		«ENDFOR»
		
		«getClassComment(className)»
		class «className» extends «modelNameFirstUpper»CartridgeGeneratorBase {
		
			override doGenerate(«getTransformationOutputClassSimpleName(dslCartridge)» «getTransformationOutputClassSimpleName(dslCartridge).toFirstLower», IFileSystemAccess fsa) {
				throw new UnsupportedOperationException("Generated method stub «className»:doGenerate(..). Implement me!")
			}
			
			«FOR t : dslCartridge.templates»
			«IF t.outputPattern.nullOrEmpty»
			override String get«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»OutputPattern(«getMetafacadeModelElementSimpleClassName(t.modelElement.type)» «getMetafacadeModelElementSimpleClassName(t.modelElement.type).toFirstLower») {
				throw new UnsupportedOperationException("Generated method stub «className»:get«getTemplateNameFromPathWithoutSuffix(t).toFirstUpper»OutputPattern(..). Implement me!")
			}
			«ENDIF»
			«ENDFOR»
		}
	'''
}
