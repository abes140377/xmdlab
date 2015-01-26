package org.xmdlab.cartridge.common.conf

import org.xmdlab.cartridge.common.conf.ICartridgeProperties
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class CartridgeProperties implements ICartridgeProperties {
	
	private Logger LOGGER = LoggerFactory.getLogger(CartridgeProperties);
	
	private Config config;
	
	new(Config config) {
		this.config = config

		LOGGER.info("Typsafe configuration loaded: " + config)

		// This verifies that the Config is sane and has our
		// reference config. Importantly, we specify the "simple-lib"
		// path so we only validate settings that belong to this
		// library. Otherwise, we might throw mistaken errors about
		// settings we know nothing about.
		config.checkValid(ConfigFactory.defaultReference(), "simple-lib")
	}
	
	// This uses the standard default Config, if none is provided,
	// which simplifies apps willing to use the defaults
	new() {
		this(ConfigFactory.load())
	}
	
	// this is the amazing functionality provided by simple-lib	
	def void printSetting(String path) {
		LOGGER.info("The setting '" + path + "' is: " + config.getString(path))
	}
	
	override Config getConfig() {
		config
	}
	
}