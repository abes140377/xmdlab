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
		import org.slf4j.Logger
		import org.slf4j.LoggerFactory

		class «cartridgeName.toFirstUpper()»CartridgeTransformation extends «cartridgeName.toFirstUpper()»CartridgeTransformationBase {
			val static final Logger LOG = LoggerFactory.getLogger(«cartridgeName.toFirstUpper()»CartridgeTransformation)
			
			private static val «getMmFactory(dslTransformation.output)» FACTORY = «getMmFactory(dslTransformation.output)»::eINSTANCE
			
			var «dslTransformation.output» «getMmRootClassSimpleName(dslTransformation.output).toFirstLower»
			var «dslTransformation.input» «getDslRootClass(dslTransformation.input).toFirstLower»
			
			override create FACTORY.create«getMmRootClassSimpleName(dslTransformation.output)» transform(«dslTransformation.input» «getDslRootClass(dslTransformation.input).toFirstLower») {
				LOG.info("transform «getDslRootClass(dslTransformation.input).toFirstLower»: " + «getDslRootClass(dslTransformation.input).toFirstLower»)
				
				throw new UnsupportedOperationException("TODO: Implement me!")
			}
		}
	'''
}