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
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslTask

class ModelHelper {
	
	def static String getMmFactory(String transformationOutput) {
		var String result
		
		val String package = getPackage(transformationOutput)
		val String basePackage = package.substring(0, package.lastIndexOf("."))
		val String subPackage = package.substring(package.lastIndexOf(".") + 1)
		
		result = basePackage + '.' + subPackage + '.' + subPackage.toFirstUpper + 'Factory'
		 
		return result
	}
	
	def static String getMmRootClassSimpleName(String transformationOutput) {
		var String result
		
		result = getClass(transformationOutput).toFirstUpper
		 
		return result
	}
	
	def static String getMmRootClass(String transformationOutput) {
		var String result
		
		val String package = getPackage(transformationOutput)
		val String basePackage = package.substring(0, package.lastIndexOf("."))
		val String subPackage = package.substring(package.lastIndexOf(".") + 1)
		
		result = basePackage + '.' + subPackage + '.' + subPackage.toFirstUpper
		 
		return result
	}
	
	def static String getDslRootClass(String transformationInput) {
		val result = getClass(transformationInput)
		
		return result
	}
	
	def static String getRuntimeModuleClass(DslCartridge dslCartridge) {
		var String result
		// org.xmdlab.dsl.application.ApplicationDslRuntimeModule
		if(dslCartridge.transformation != null) {
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
	
	def static String getStandaloneSetupClass(DslCartridge dslCartridge) {
		var String result
		//org.xmdlab.dsl.application.ApplicationDslStandaloneSetup
		if(dslCartridge.transformation != null) {
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
	
	def static getEmfPackage(String output) {
		val package = getPackage(output)
		
		return package + '.' + package.substring(package.lastIndexOf('.') + 1).toFirstUpper + 'Package'
	}
	
	def static String getPackage(String fqClassName) {
		return fqClassName.substring(0, fqClassName.lastIndexOf("."))
	}
	
	/**
	 * 
	 */
	def static boolean hasPropertyWithDefault(DslCartridge dslCartridge) {
		val properties = getAllProperties(dslCartridge)
		
		for (p : properties) {
			if(!p.^default.isNullOrEmpty) {
				return true
			}
		}
		
		return false
	}
	
	/**
	 * 
	 */
	def static List<DslProperty> getAllProperties(DslCartridge dslCartridge) {
		var resultList = newArrayList()
		val propertyGroups = dslCartridge.cartridgeProperties.propertyGroups
		
		for (pg : propertyGroups) {
			resultList.addAll(pg.properties)
		}
		
		return resultList
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

	/**
	 * 
	 */
	def static String getOutletConstantName(DslTemplate template) {
		return 'OUTPUTCONFIG_' + StringHelper.camelCaseToUnderscore(template.outlet.name)
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
	def static String asString(BoolLiteral boolLiteral) {
		if (boolLiteral instanceof TrueLiteral) {
			return 'true'
		} else if (boolLiteral instanceof FalseLiteral) {
			return 'false'
		} else {
			throw new UnsupportedOperationException('Implement me!')
		}
	}
	
//	/**
//	 * 
//	 */
//	def static String compileTaskParameters(DslTask task) {
//		val map = task.modelElements.map[type]
//
//		var params = ''
//		for (metafacade : map) {
//			val name = metafacade.name
//			params += name.toFirstUpper + " " + name + ", "
//		}
//
//		params.substring(0, params.lastIndexOf(','))
//	}

	/**
	 * 
	 */
	def static String compileTemplateParameters(DslTemplate template) {
		val map = template.modelElements.map[type]

		var params = ''
		for (metafacade : map) {
			val name = metafacade.name
			params += name.toFirstUpper + " " + name + ", "
		}

		params.substring(0, params.lastIndexOf(','))
	}

	/**
	 * 
	 */
	def static List<DslMetafacade> nonModelMetafacades(DslCartridge dslCartridge) {
		dslCartridge.metafacades.filter[m|m.name != 'modelMetafacade'].toList
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

		// templates/ReadmeMdTpl
		val templatePath = dslTemplate.path

		return templatePath.substring(templatePath.lastIndexOf("/") + 1)
	}

	/**
	 * Check if there is at least one metafacde with a output declaration available.
	 */
//	def static boolean needTransformation(DslCartridge dslCartridge) {
//		for (metafacade : dslCartridge.metafacades) {
//			if (metafacade.output != null) {
//				return true;
//			}
//		}
//
//		return false
//	}

	/**
	 * 
	 */
	def static String getInputModelFactory(String input) {
		val String modelPackage = input.substring(0, input.lastIndexOf("."))
		val String modelName = modelPackage.substring(modelPackage.lastIndexOf(".") + 1)

		return modelPackage + "." + modelName.toFirstUpper + "Factory"
	}

	/**
	 * 
	 */
	def static String getOutputModelFactory(String output) {
		val String modelPackage = output.substring(0, output.lastIndexOf("."))
		val String modelName = modelPackage.substring(modelPackage.lastIndexOf(".") + 1)

		return modelPackage + "." + modelName.toFirstUpper + "Factory"
	}

	/**
	 * 
	 */
	def static String getOutputModelClass(String output) {
		return output.substring(output.lastIndexOf(".") + 1)
	}
	
	/**
	 * 
	 */
	def static String getClass(String fqClassName) {
		return fqClassName.substring(fqClassName.lastIndexOf(".") + 1)
	}

	/**
	 * 
	 */
	def static String getOutputModelPackage(String output) {
		val String modelPackage = output.substring(0, output.lastIndexOf("."))
		val String modelName = modelPackage.substring(modelPackage.lastIndexOf(".") + 1)

		return modelPackage + "." + modelName.toFirstUpper + "Package"
	}

	/**
	 * 
	 */
	def static String getOutputModelBundle(String output) {
		return output.substring(0, output.lastIndexOf("."))
	}

	/**
	 * 
	 */
	def static String getInputModelBundle(String input) {
		val String modelPackage = input.substring(0, input.lastIndexOf("."))

		return modelPackage.substring(0, modelPackage.lastIndexOf("."))
	}

}
