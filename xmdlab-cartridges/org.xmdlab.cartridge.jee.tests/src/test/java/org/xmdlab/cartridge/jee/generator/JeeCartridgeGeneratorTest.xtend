package org.xmdlab.cartridge.jee.generator

import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.cartridge.common.generator.IGenerator
import org.xmdlab.cartridge.jee.JeeCartridgeGeneratorInjectorProvider
import org.xmdlab.cartridge.jee.metafacade.ApplicationMetafacade
import org.xmdlab.cartridge.jee.transformation.JeeCartridgeTransformation
import org.xmdlab.dsl.application.applicationDsl.DslModel
import org.xmdlab.jee.application.mm.Application

import static org.junit.Assert.*

/**
 * 
 */
@RunWith(typeof(XtextRunner))
@InjectWith(typeof(JeeCartridgeGeneratorInjectorProvider))
class JeeCartridgeGeneratorTest {

	@Inject IGenerator underTest
	@Inject ParseHelper<DslModel> parseHelper

	@Inject JeeCartridgeTransformation transformation
	@Inject ApplicationMetafacade applicationMetafacade

	@Test
	def test() {
		val model = parseHelper.parse('''
			Application application-manager {

			    basePackage=org.application.manager
			    
			    Entity Organisation {
			    	String name;
			        String description;
				}
				
				Entity Team {
			    	String name;
			        String description;
				}
			}
		''')

		val dslModel = model.eResource.contents.get(0) as DslModel
		val Application application = transformation.transform(dslModel.app)
		
		applicationMetafacade.modelResource = application

		val fsa = new InMemoryFileSystemAccess()
		underTest.doGenerate(fsa)
		
		println(fsa.textFiles)
		
		assertEquals(2, fsa.textFiles.size)
		
		assertTrue(fsa.textFiles.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "Alice.java"))
		
		assertEquals(
			'''
				public class Alice {
				     
				}
			'''.toString,
			fsa.textFiles.get(IFileSystemAccess::DEFAULT_OUTPUT + "Alice.java").toString
		)
		
		assertTrue(fsa.textFiles.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "Bob.java"))
		
		assertEquals(
			'''
				public class Bob {
				     
				}
			'''.toString, fsa.textFiles.get(IFileSystemAccess::DEFAULT_OUTPUT + "Bob.java").toString)

	}
}
