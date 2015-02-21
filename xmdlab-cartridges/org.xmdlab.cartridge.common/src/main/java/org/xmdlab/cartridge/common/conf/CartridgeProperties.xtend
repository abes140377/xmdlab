package org.xmdlab.cartridge.common.conf

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class CartridgeProperties implements ICartridgeProperties {

	private Logger LOG = LoggerFactory.getLogger(CartridgeProperties);

	var Config config

	/**
	 * 
	 */
	new() {
		// Load cartridge.conf from generator module classpath
		val Config cartridgeConfig = ConfigFactory.load("cartridge")

		// Load reference.conf from cartridge classpath
		val Config referenceConfig = ConfigFactory.load()

		// merge configs. This allows ovverride of default values from reference.conf with cartridge.conf values from generator module 
		config = cartridgeConfig.withFallback(referenceConfig)

		if (LOG.isDebugEnabled) {
			LOG.debug("Configuration loaded and merged:")
			config.entrySet.forEach [
				LOG.debug(it.key + " - " + it.value.render)
			]
		}
	}

	override Config getConfig() {
		config
	}

}
