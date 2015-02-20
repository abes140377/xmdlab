package org.xmdlab.dsl.domain.validation

class IssueCodes {
	
	static val String ISSUE_CODE_PREFIX = "de.freund.xgen.dsl.validation.issue.";

	public static val String UNCAPITALIZED_NAME = ISSUE_CODE_PREFIX + "uncapitalized_name";
	public static val String NO_DOMAIN_EXPRESSION = ISSUE_CODE_PREFIX + "no_domain_expression";
	public static val String NODE_HAS_NO_ROLE_EXPRESSION = ISSUE_CODE_PREFIX + "node_has_no_role_expression";

}