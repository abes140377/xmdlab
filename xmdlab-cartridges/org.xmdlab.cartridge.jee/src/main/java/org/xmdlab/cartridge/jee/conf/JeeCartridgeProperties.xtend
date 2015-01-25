package org.xmdlab.cartridge.jee.conf

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import org.xmdlab.cartridge.common.conf.CartridgeProperties

/**
 * 
 */
class JeeCartridgeProperties implements CartridgeProperties {

	private Config config

	// we have a constructor allowing the app to provide a custom Config
	new(Config config) {
		this.config = config

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
		System.out.println("The setting '" + path + "' is: " + config.getString(path))
	}
}