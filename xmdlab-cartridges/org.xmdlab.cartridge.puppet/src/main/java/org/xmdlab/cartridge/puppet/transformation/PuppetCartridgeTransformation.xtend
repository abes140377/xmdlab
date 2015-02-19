/**
 * Generated by Xgen. !!! DO NOT EDIT BY HAND IF THIS FILE WAS GENERATED TO A DERIVED DIRECTORY !!!
 * Xtend Template: org.xmdlab.cartridge.generator.dsl.templates.transformation.CartridgeTransformationXtendTpl
 */
package org.xmdlab.cartridge.puppet.transformation

import java.util.List
import org.eclipse.xtext.EcoreUtil2
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.xmdlab.dsl.domain.domainDsl.DslDomain
import org.xmdlab.dsl.domain.domainDsl.DslNode
import org.xmdlab.puppet.site.mm.MmFactory
import org.xmdlab.puppet.site.mm.MmSite

class PuppetCartridgeTransformation extends PuppetCartridgeTransformationBase {
	val static final Logger LOG = LoggerFactory.getLogger(PuppetCartridgeTransformation)
	
	private static val MmFactory FACTORY = MmFactory::eINSTANCE
	
	var MmSite mmSite
	var DslDomain dslDomain
	
	/**
	 * 
	 */
	override create FACTORY.createMmSite transform(DslDomain dslDomain) {
		LOG.info("transform dslDomain: " + dslDomain)
		
		this.mmSite = mmSite
		this.dslDomain = dslDomain
		
		domainName = dslDomain.name
		
		val List<DslNode> allDslNodes = EcoreUtil2::eAllOfType(dslDomain, typeof(DslNode))
		nodes.addAll(allDslNodes.map[e|transform(e)])
	}
	
	/**
	 * 
	 */
	def create FACTORY.createMmNode transform(DslNode dslNode) {
		hostname = dslNode.name
		fqdn = hostname + "." + dslDomain.name
		doc = dslNode.doc
	}
}
