package org.xmdlab.cartridge.generator.dsl.templates.generator

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.util.StringHelper
//import static org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

class CartridgGeneratorMwe2Tpl {
	
	@Inject extension GeneratorProperties generatorProperties
//	@Inject extension ModelHelper modelHelper
	
	def generate(DslCartridge dslCartridge) '''
		«StringHelper.getGeneratedComment(class.name)»
		module «basePackage».generator.«cartridgeName.toFirstUpper»CartridgeGenerator

		import org.eclipse.emf.mwe.utils.*
		
		var modelPath
		
		«FOR o : dslCartridge.outlets»
		var «o.name»Dir
		«ENDFOR»

		/**
		*
		*/
		Workflow {
			// print welcome message
			component = org.xmdlab.cartridge.common.workflow.WelcomeMessage {
				cartridge = "«cartridgeName.toFirstUpper» Cartridge"
			}
			
			// read model file
			component = org.eclipse.xtext.mwe.Reader {
				path = modelPath
				// this class will be generated by the xtext generator
				register = «basePackage».«cartridgeName.toFirstUpper»CartridgeGeneratorStandaloneSetup {}
				loadResource = {
					slot = "model"
				}
			}
			
			«IF dslCartridge.transformation != null»
			// invoke the transformation
			component = «basePackage».transformation.«cartridgeName.toFirstUpper»CartridgeTransformationComponent {
				modelSlot = "model"
				outputSlot = "transformed"
			}
			«ELSE»
			// no transformation required
			«ENDIF»
			
			// run generator
			component = «cartridgeName.toFirstUpper»CartridgeGeneratorComponent {
				register = «basePackage».«cartridgeName.toFirstUpper»CartridgeGeneratorStandaloneSetup {}
				
				slot = «IF dslCartridge.transformation != null»'transformed'«ELSE»'model'«ENDIF»
				
				«FOR o : dslCartridge.outlets»
				outlet = {
					outletName = "«o.name»"
					path = «o.name»Dir
				}
				«ENDFOR»
			}
		}
	'''
}