package org.xmdlab.dsl.puppet.validation;

@SuppressWarnings("all")
public class IssueCodes {
  private final static String ISSUE_CODE_PREFIX = "de.freund.xgen.dsl.validation.issue.";
  
  public final static String UNCAPITALIZED_NAME = (IssueCodes.ISSUE_CODE_PREFIX + "uncapitalized_name");
  
  public final static String NO_DOMAIN_EXPRESSION = (IssueCodes.ISSUE_CODE_PREFIX + "no_domain_expression");
}
