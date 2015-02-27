package org.xmdlab.cartridge.common.util

import com.google.common.base.CaseFormat

/**
 * 
 */
class StringHelper {
	
	/**
	 * Convert the given string (with .) to a path (with /) by replacing
	 */
	def static toPath(String packageName) {
		packageName.replace(".", "/")
	}
	
	/**
	 * 
	 */
	def static camelCaseToUnderscore(String input) {
		CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, input);
	}
}