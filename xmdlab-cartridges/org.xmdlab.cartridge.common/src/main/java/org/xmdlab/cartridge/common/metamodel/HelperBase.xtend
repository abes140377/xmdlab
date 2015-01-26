package org.xmdlab.cartridge.common.metamodel

class HelperBase {
	
	def void error(String msg) {
		throw new RuntimeException(msg);
	}
}