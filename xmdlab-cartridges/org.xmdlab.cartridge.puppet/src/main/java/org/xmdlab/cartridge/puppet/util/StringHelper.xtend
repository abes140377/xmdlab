package org.xmdlab.cartridge.puppet.util

class StringHelper {
	
	def static String createManifestComment(Class c) {
		var StringBuffer buffer = new StringBuffer();
		
		buffer.append("# ")
		buffer.append(c.name)
		
		return buffer.toString
	}
}