/*
 * Copyright 2013 The Sculptor Project Team, including the original 
 * author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xmdlab.cartridge.jee.util;

/**
 * Utilities for code generation and transformation. It is used from templates
 * and transformations via extensions.
 */
public class HelperBase {

	// private static final Logger LOG =
	// LoggerFactory.getLogger(HelperBase.class);

	private PrimitiveTypeMapper primitiveTypeMapper = new PrimitiveTypeMapper();

	/**
	 * Handles all validation annotations with multiple parameters (Range, Size,
	 * ...).
	 * 
	 * @param annotation
	 *            the name of the annotation
	 * @param parameterNames
	 *            the parameter names
	 * @param parameters
	 *            the parameter values
	 * @param validate
	 *            the validate string
	 * @return annotation validation string
	 */
	public String handleParameterizedAnnotation(String annotation,
			String parameterNames, String parameters, String validate) {

		if (parameters == null)
			return "";

		if (parameterNames == null)
			return "";

		// validate contains range
		if (validate != null
				&& validate.toLowerCase().matches(
						".*@" + annotation.toLowerCase() + ".*"))
			return "";

		String result = " @" + annotation;

		// if validate contains any given parameter name, add complete
		// annotation
		String[] paramNames = parameterNames.split(",");
		for (String paramName : paramNames) {
			if (parameters.toLowerCase().matches(".*" + paramName + ".*")) {
				result += "(" + parameters + ")";
				return result + " ";
			}
		}

		// setting parameters
		String[] params = parameters.split(",");
		result += "(";
		for (int i = 0; i < params.length; i++) {
			if (paramNames[i] != null) {
				if (i > 0)
					result += ",";
				result += paramNames[i] + "=" + params[i];
			}
		}
		result += ")";

		return result + " ";
	}

	/**
	 * Handles all boolean validation annotations (Future, Past, Email, ...).
	 * 
	 * @param annotation
	 *            the name of the annotation
	 * @param value
	 *            annotation is set or not
	 * @param validate
	 *            the validate string
	 * @return annotation validation string
	 */
	public String handleBooleanAnnotation(String annotation, Boolean value,
			String message, String validate) {

		if (!Boolean.TRUE.equals(value))
			return "";

		// if validate contains annotation, do nothing
		if (validate != null
				&& validate.toLowerCase().matches(
						".*@" + annotation.toLowerCase() + ".*"))
			return "";

		String result = " @" + annotation;

		// set message if not set
		if (message != null) {
			result += "("
					+ (message.toLowerCase().matches(".*message.*") ? ""
							: "message=") + message + ")";
		}

		return result + " ";
	}

	/**
	 * Handles all simple validation annotations (Max, Min, ...).
	 * 
	 * @param annotation
	 *            the name of the annotation
	 * @param value
	 *            the parameter values
	 * @param validate
	 *            the validate string
	 * @return annotation validation string
	 */
	public String handleSimpleAnnotation(String annotation, String value,
			String validate) {

		if (value == null)
			return "";

		// if validate contains annotation, do nothing
		if (validate != null
				&& validate.toLowerCase().matches(
						".*@" + annotation.toLowerCase() + ".*"))
			return "";

		String result = " @" + annotation;

		// if validate contains named annotation parameters
		if (value.toLowerCase().matches(".*value.*")
				|| value.toLowerCase().matches(".*message.*")) {
			result += "(" + value + ") ";
			return result + " ";
		}

		// a simple annotation only has parameters value and message
		String[] params = value.split(",");
		if (params.length == 1)
			result += "(" + params[0] + ")";
		if (params.length == 2)
			result += "(value=" + params[0] + ", message=" + params[1] + ")";

		return result + " ";
	}

	public boolean isPrimitiveType(String typeName) {
		return primitiveTypeMapper.isPrimitiveType(typeName);
	}
}
