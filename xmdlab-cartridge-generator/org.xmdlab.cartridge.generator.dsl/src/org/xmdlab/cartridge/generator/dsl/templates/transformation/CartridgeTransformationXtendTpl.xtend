package org.xmdlab.cartridge.generator.dsl.templates.transformation

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static org.xmdlab.cartridge.generator.dsl.util.StringHelper.*
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTransformation
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

/**
 * 
 */
class CartridgeTransformationXtendTpl {

	@Inject extension GeneratorProperties

	/**
	 * 
	 */
	def generate(DslTransformation dslTransformation) '''
		«getGeneratedComment(class.name)»
		package «basePackage».transformation
		
		import com.google.inject.Inject
		import org.eclipse.xtext.naming.IQualifiedNameProvider
		
		class «cartridgeName.toFirstUpper()»CartridgeTransformation extends «cartridgeName.toFirstUpper()»CartridgeTransformationBase {
			private static val «getMmFactory(dslTransformation.output)» FACTORY = «getMmFactory(dslTransformation.output)»::eINSTANCE
			
			override create FACTORY.create«getMmRootClassSimpleName(dslTransformation.output)» transform(«dslTransformation.input» «getDslRootClass(dslTransformation.input).toFirstLower») {
				throw new UnsupportedOperationException("TODO: Implement me!")
			}
		}
	'''
}