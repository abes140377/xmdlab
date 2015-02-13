package org.xmdlab.dsl.domain.parser

import com.google.inject.Inject
import org.eclipse.ui.internal.Model
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xmdlab.dsl.domain.DomainDslInjectorProvider
import org.xmdlab.dsl.domain.domainDsl.DslModel
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.xmdlab.dsl.domain.domainDsl.DomainDslPackage
import org.xmdlab.dsl.domain.validation.IssueCodes
import static extension org.eclipse.xtext.formatting.INodeModelFormatter.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(DomainDslInjectorProvider))
class EntitiesParserTest {

	@Inject extension ParseHelper<DslModel>

	//	@Inject extension ValidationTestHelper
	//	@Test
	//	def void testEntityExtendsItself() {
	//		'''
	//Node server domain = femoplus.local {
	//	Role Appserver {
	//		Profile play {
	//			Module ntp {
	//				source = domainlabs/ntp
	//			}	
	//		}
	//		Profile pdc {
	//			Module play {
	//				source = "git@github.com:abes140377/domain-play.git" ref = '0.1.0'
	//			}
	//		}
	//	}
	//} '''.parse.assertError(
	//			DomainDslPackage::eINSTANCE.dslRole,
	//			IssueCodes::UNCAPITALIZED_NAME,
	//			"Expected ERROR 'de.freund.xgen.dsl.validation.issue.uncapitalized_name' on DslRole but got WARNING (de.freund.xgen.dsl.validation.issue.uncapitalized_name) 'DslRole name should start with a lower case letter' on DslRole"
	//		)
	//	}
	@Test
	def void testParsing() {
		val model = '''
Node server domain = femoplus.local {
	Role appserver {
		Profile play {
			Module domainlabs-ntp
		}
		Profile pdc {
			Module teamserver-play git = "git@github.com:abes140377/domain-play.git" ref = "0.1.0"
		}
	}
}
'''.
			parse
		val node = model.domain
		Assert::assertEquals("server", node.name)

	//		val role = node.role
	//		val profile1 = role.profiles.get(0)
	//		val profile2 = role.profiles.get(1)
	//		Assert::assertEquals("play", profile1.name);
	//		Assert::assertEquals("pdc", profile2.name);
	}
}
