package org.xmdlab.cartridge.generator.dsl.util

import java.util.HashMap
import java.util.List
import java.util.Map
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.BoolLiteral
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslMetafacade
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslOutlet
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslProperty
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTemplate
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.FalseLiteral
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.TrueLiteral

class ModelHelper {
	
	/**
	 * 
	 */
	def static getMetafacadeModelElementSimpleClassName(DslMetafacade dslMetafacade) {
		val result = getMetafacadeModelElementClassName(dslMetafacade).getSimpleClassName
		
		return result
	}
	
	/**
	 * 
	 */
	def static getMetafacadeModelElementClassName(DslMetafacade dslMetafacade) {
		val result = dslMetafacade.modelElement
		
		return result
	}	

	/**
	 * 
	 */
	def static getDslModelClassName(DslCartridge dslCartridge) {
		val result = dslCartridge.transformation.input.package

		return result + ".DslModel"
	}

	/**
	 * 
	 */
	def static getDslModelClassSimpleName(DslCartridge dslCartridge) {
		val result = getDslModelClassName(dslCartridge)

		return result.substring(result.lastIndexOf('.') + 1)
	}

	/**
	 * 
	 */
	def static getTransformationInputClassName(DslCartridge dslCartridge) {
		val result = dslCartridge.transformation.input

		return result
	}

	/**
	 * 
	 */
	def static getTransformationInputClassSimpleName(DslCartridge dslCartridge) {
		val result = dslCartridge.transformation.input

		return result.substring(result.lastIndexOf('.') + 1)
	}

	/**
	 * 
	 */
	def static getTransformationOutputClassName(DslCartridge dslCartridge) {
		val result = dslCartridge.transformation.output

		return result
	}

	/**
	 * 
	 */
	def static getTransformationOutputClassSimpleName(DslCartridge dslCartridge) {
		val result = dslCartridge.transformation.output

		return result.substring(result.lastIndexOf('.') + 1)
	}

	/**
	 * 
	 */
	def static String getTemplateNameAndSubpackageFromPath(DslTemplate dslTemplate) {
		return getTemplateSubpackageFromPath(dslTemplate) + "." + getTemplateNameFromPath(dslTemplate)
	}

	/**
	 * 
	 */
	def static String getTemplateSubpackageFromPath(DslTemplate dslTemplate) {
		val templatePath = dslTemplate.path

		return templatePath.substring(0, templatePath.lastIndexOf("/"))
	}

	/**
	 * 
	 */
	def static String getTemplateNameFromPathWithoutSuffix(DslTemplate dslTemplate) {
		val templateName = getTemplateNameFromPath(dslTemplate)

		templateName.substring(0, templateName.lastIndexOf("Tpl"))
	}

	/**
	 * 
	 */
	def static String getTemplateNameFromPath(DslTemplate dslTemplate) {
		val templatePath = dslTemplate.path

		return templatePath.substring(templatePath.lastIndexOf("/") + 1)
	}

	/**
	 * 
	 */
	def static boolean isSet(DslOutlet dslOutlet) {
		return dslOutlet != null && dslOutlet.name != null && !dslOutlet.name.equals('')
	}

	/**
	 * 
	 */
	def static String getOutletConstantName(DslTemplate template) {
		return 'OUTPUTCONFIG_' + StringHelper.camelCaseToUnderscore(template.outlet.name)
	}

	/**
	 * 
	 */
	def static String getStandaloneSetupClass(DslCartridge dslCartridge) {
		var String result

		//org.xmdlab.dsl.application.ApplicationDslStandaloneSetup
		if (dslCartridge.transformation != null) {
			val String input = dslCartridge.transformation.input

			val package = getPackage(input)
			val basePackage = package.substring(0, package.lastIndexOf("."))
			val subPackage = package.substring(package.lastIndexOf(".") + 1)

			result = basePackage + '.' + subPackage.toFirstUpper + 'StandaloneSetup'
		} else {
			throw new UnsupportedOperationException("Implement me!")
		}

		return result
	}

	/**
	 * 
	 */
	def static String getRuntimeModuleClass(DslCartridge dslCartridge) {
		var String result

		// org.xmdlab.dsl.application.ApplicationDslRuntimeModule
		if (dslCartridge.transformation != null) {
			val String input = dslCartridge.transformation.input

			val package = getPackage(input)
			val basePackage = package.substring(0, package.lastIndexOf("."))
			val subPackage = package.substring(package.lastIndexOf(".") + 1)

			result = basePackage + '.' + subPackage.toFirstUpper + 'RuntimeModule'
		} else {
			throw new UnsupportedOperationException("Implement me!")
		}

		return result
	}

	/**
	 * 
	 */
	def static String asString(BoolLiteral boolLiteral) {
		if (boolLiteral instanceof TrueLiteral) {
			return 'true'
		} else if (boolLiteral instanceof FalseLiteral) {
			return 'false'
		} else {
			throw new UnsupportedOperationException('Implement me!')
		}
	}
	
	/**
	 * 
	 */
	def static boolean asBoolean(BoolLiteral boolLiteral) {
		if(boolLiteral == null) {
			return false
		}
		if (boolLiteral instanceof TrueLiteral) {
			return true
		} else if (boolLiteral instanceof FalseLiteral) {
			return false
		} else {
			throw new UnsupportedOperationException('Implement me!')
		}
	}

	/**
	 * 
	 */
	def static String getMmRootClassSimpleName(String transformationOutput) {
		var String result

		result = getSimpleClassName(transformationOutput).toFirstUpper

		return result
	}

	/**
	 * 
	 */
	def static String getMmFactory(String transformationOutput) {
		var String result

		val String package = getPackage(transformationOutput)
		val String basePackage = package.substring(0, package.lastIndexOf("."))
		val String subPackage = package.substring(package.lastIndexOf(".") + 1)

		result = basePackage + '.' + subPackage + '.' + subPackage.toFirstUpper + 'Factory'

		return result
	}

	/**
	 * 
	 */
	def static String getDslRootClass(String transformationInput) {
		val result = getSimpleClassName(transformationInput)

		return result
	}

	/**
	 * 
	 */
	def static getEmfPackage(String output) {
		val package = getPackage(output)

		return package + '.' + package.substring(package.lastIndexOf('.') + 1).toFirstUpper + 'Package'
	}	

	/**
	 * 
	 */
	def static Map<String, List<DslProperty>> getPropertyGroupMap(DslCartridge dslCartridge) {
		var resultMap = new HashMap();

		val propertyGroups = dslCartridge.cartridgeProperties.propertyGroups
		for (pg : propertyGroups) {
			resultMap.put(pg.name, pg.properties)
		}

		return resultMap
	}

	// ============================
	
	/**
	 * 
	 */
	def static String getSimpleClassName(String fqClassName) {
		return fqClassName.substring(fqClassName.lastIndexOf(".") + 1)
	}
	
	def private static String getPackage(String fqClassName) {
		return fqClassName.substring(0, fqClassName.lastIndexOf("."))
	}

}
