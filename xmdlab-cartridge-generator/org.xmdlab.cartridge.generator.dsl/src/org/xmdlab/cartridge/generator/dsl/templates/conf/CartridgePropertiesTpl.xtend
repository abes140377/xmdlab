package org.xmdlab.cartridge.generator.dsl.templates.conf

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static org.xmdlab.util.StringHelper.*
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*
import org.xmdlab.cartridge.generator.dsl.util.ModelHelper

/**
 * 
 */
class CartridgePropertiesTpl {

	@Inject extension GeneratorProperties generatorProperties
	@Inject extension ModelHelper modelHelper

	/**
	 * 
	 */
	def generate(DslCartridge dslCartridge) '''
		«getGeneratedComment(class.name)»
		package «basePackage».conf
		
		import com.google.inject.Singleton
		import org.xmdlab.cartridge.common.conf.CartridgeProperties
		
		«getClassComment(class.name)»
		@Singleton
		class «cartridgeName.toFirstUpper»CartridgeProperties extends CartridgeProperties {
			«FOR pgMap : dslCartridge.propertyGroupMap.entrySet»
			
			// Properties for group «pgMap.key»
			«FOR p : pgMap.value»
			def String get«p.name.toFirstUpper»() {
				return config.getString("«pgMap.key + "." + p.name»")
			}
			«ENDFOR»
			«ENDFOR»
		}
	'''
}
