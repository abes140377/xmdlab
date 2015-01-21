package org.xmdlab.cartridge.generator.dsl.templates.transformation

import com.google.inject.Inject

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTransformation
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

/**
 * 
 */
class CartridgeTransformationBaseXtendTpl {

	@Inject extension GeneratorProperties generatorProperties

	/**
	 * 
	 */
	def generate(DslTransformation dslTransformation) '''
		«getGeneratedComment(class.name)»
		package «basePackage».transformation
		
		class «cartridgeName.toFirstUpper»CartridgeTransformationBase {
			private static val «getMmFactory(dslTransformation.output)» FACTORY = «getMmFactory(dslTransformation.output)»::eINSTANCE
			
			def create FACTORY.create«getMmRootClassSimpleName(dslTransformation.output)» transform(«dslTransformation.input» «getDslRootClass(dslTransformation.input).toFirstLower») {
				throw new UnsupportedOperationException("TODO: Override «cartridgeName.toFirstUpper»CartridgeTransformationBase:transform() in «cartridgeName.toFirstUpper»CartridgeTransformation")
			}
		}
	'''
}
