package org.xmdlab.cartridge.common.conf

import com.typesafe.config.Config

interface ICartridgeProperties {
	
	def Config getConfig()
}