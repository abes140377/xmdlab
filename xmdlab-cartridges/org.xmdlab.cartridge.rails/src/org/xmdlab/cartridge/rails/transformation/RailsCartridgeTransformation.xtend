/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.transformation.CartridgeTransformationXtendTpl
 */
package org.xmdlab.cartridge.rails.transformation

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.xmdlab.mm.rails.application.Application
import org.xmdlab.dsl.application.applicationDsl.DslModule
import java.util.List
import org.eclipse.xtext.EcoreUtil2
import org.xmdlab.dsl.application.applicationDsl.DslSimpleDomainObject
import org.xmdlab.cartride.common.metamodel.HelperBase
import org.xmdlab.dsl.application.applicationDsl.DslEntity
import org.xmdlab.dsl.application.applicationDsl.DslAttribute

class RailsCartridgeTransformation extends RailsCartridgeTransformationBase {
	@Inject extension HelperBase
	
	private static val org.xmdlab.mm.rails.application.ApplicationFactory FACTORY = org.xmdlab.mm.rails.application.ApplicationFactory::eINSTANCE
	
	var Application globalApp
	
	override create FACTORY.createApplication transform(org.xmdlab.dsl.application.applicationDsl.DslModel dslModel) {
		globalApp = it
		
		val dslApp = dslModel.app
		name =  dslApp.name
		basePackage = dslApp.basePackage
		
		val List<DslModule> allDslModules = EcoreUtil2::eAllOfType(dslApp, typeof(DslModule))
		modules.addAll(allDslModules.map[e | transform(e)])
	}
	
	def create FACTORY.createModule transform(DslModule dslModule) {
		application = globalApp
		
		basePackage = dslModule.basePackage
	}
	
	// this "method" is not used, it is kind of "abstract"
	def dispatch create FACTORY.createModel transformSimpleDomainObject(DslSimpleDomainObject domainObject) {
		error("Wrong type of domainObject "+domainObject.name+"["+ (domainObject.^class.simpleName) +"] passed into transformSimpleDomainObject")
	}
	
	def dispatch create FACTORY.createModel transformSimpleDomainObject(DslEntity domainObject) {
		module = (domainObject.eContainer as DslModule).transform
		name = domainObject.name
		^package = domainObject.^package
		
		attributes.addAll(domainObject.attributes.map[e | transform(e)])
	}
	
	def create FACTORY.createAttribute transform(DslAttribute attribute) {
		name = attribute.name
		type = attribute.type
	}
}
