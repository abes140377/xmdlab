package org.xmdlab.cartridge.generator.dsl.generator

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import java.io.IOException
import com.google.inject.Singleton
import org.apache.log4j.Logger

@Singleton
class GeneratorProperties {
	final private static Logger log = Logger.getLogger(CartridgeDslGenerator)
	
	var Config _conf
	var URI modelUri

	def String getPropertyValue(String key) {
		getConf().getString(key)
	}

	def Config getConf() {
		if (_conf == null || _conf.entrySet().size() == 0) {
			val Config conf1 = ConfigFactory.load()
			val Config conf2 = ConfigFactory.parseFile(getConfigFile())
			
			_conf = conf1.withFallback(conf2)

			_conf.entrySet.forEach [
				log.info(it.key + " = " + it.value.render)
			]
		}

		return _conf
	}

	def File getConfigFile() {
		var String result = null

		val URI confUri = modelUri.trimSegments(1).appendSegment(GeneratorConstants::CARTRIDGE_CONF_FILENAME)

		if (confUri.isFile()) {
			result = confUri.toFileString()
		} else if (confUri.isPlatformResource()) {
			val String propertiesWorkspacePath = confUri.devicePath().replace("/resource", "")

			try {
				result = ResourcesPlugin::getWorkspace().getRoot().getFile(new Path(propertiesWorkspacePath)).
					getLocation().toFile().getCanonicalPath()
			} catch (IOException e) {
				System.out.println(e.toString())
				e.printStackTrace()
			}
		} else {
			result = new File(URI.createFileURI(confUri.segment(0)).toFileString()).getAbsolutePath()
		}

		return new File(result)
	}

	def void setModelUri(URI modelUri) {
		this.modelUri = modelUri;
	}

	def String getBasePackage() {
		return getPropertyValue("cartridge.basePackage")
	}

	def String getCartridgeName() {
		return getPropertyValue("cartridge.name")
	}

	def String getCartridgeDslModel() {
		return getPropertyValue("cartridge.dslModel")
	}

	def String getCartridgeMetaModel() {
		return getPropertyValue("cartridge.metaModel")
	}
}
