/*
 * generated by Xtext
 */
package org.xmdlab.dsl.domain.formatting

import com.google.inject.Inject
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.xmdlab.dsl.domain.services.DomainDslGrammarAccess

// import com.google.inject.Inject;
// import org.xmdlab.dsl.domain.services.DomainDslGrammarAccess
/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class DomainDslFormatter extends AbstractDeclarativeFormatter {

	@Inject extension DomainDslGrammarAccess g

	override protected void configureFormatting(FormattingConfig c) {

		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
		
		// ====== dsl node ======
		val n = g.getDslNodeAccess()
		
		// indentation between { } 
		c.setIndentation(n.leftCurlyBracketKeyword_5, n.rightCurlyBracketKeyword_7)
		
		// newline after {
		c.setLinewrap().after(n.leftCurlyBracketKeyword_5)
		
		// two newlines after } 
		c.setLinewrap(2).after(n.rightCurlyBracketKeyword_7)
	}
}
