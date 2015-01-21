package org.xmdlab.cartride.common.metamodel

class HelperBase {
	
	def void error(String msg) {
		throw new RuntimeException(msg);
	}
}