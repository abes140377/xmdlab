package org.xmdlab.cartridge.generator.dsl.templates.namespace

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties

import static extension org.xmdlab.cartridge.generator.dsl.util.StringHelper.*
import static extension org.xmdlab.cartridge.generator.dsl.util.ModelHelper.*

/**
 * 
 */
class CartridgeProjectPropertiesTpl {

	@Inject extension GeneratorProperties generatorProperties

	/**
	 * 
	 */
	def generate(DslCartridge dslCartridge) '''
		«getGeneratedComment(class.name)»
		package «basePackage».util;
		
		import com.google.inject.Singleton
		import com.typesafe.config.Config
		import com.typesafe.config.ConfigFactory
		import java.io.File
		import java.util.Map
		import org.eclipse.emf.common.util.URI
		
		«getClassComment(class.name)»
		@Singleton
		public class «cartridgeName.toFirstUpper»CartridgeProjectProperties {
		
			var Config _conf
		
			def String getPropertyValue(String key) {
				getConf().getString(key)
			}
		
			def Config getConf() {
				if (_conf == null || _conf.entrySet().size() == 0) {
					val confFile = new File("./model/generator.conf")
					println("Reading generator properties from " + confFile.absolutePath)
					_conf = ConfigFactory.parseFile(confFile)
				}
				
				«IF dslCartridge.hasPropertyWithDefault»
				val Map<String, String> defaults = newHashMap()
				«FOR p : dslCartridge.allProperties»
				«IF p.^default.isSet»
				defaults.put("«p.name»", "«p.^default»")
				«ENDIF»
				«ENDFOR»
				
				_conf.withFallback(ConfigFactory.parseMap(defaults))
				«ENDIF»
		
				return _conf
			}
			
			«FOR pgMap : dslCartridge.propertyGroupMap.entrySet»
			// Properties for group «pgMap.key»
			«FOR p : pgMap.value»
			def String get«p.name.toFirstUpper»() {
				return getConf().getString("«pgMap.key».«p.name»")
			}
			«ENDFOR»
			«ENDFOR»
		}
	'''
}
