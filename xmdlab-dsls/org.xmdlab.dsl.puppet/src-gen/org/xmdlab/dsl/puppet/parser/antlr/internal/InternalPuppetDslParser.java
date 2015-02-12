package org.xmdlab.dsl.puppet.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xmdlab.dsl.puppet.services.PuppetDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPuppetDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Node'", "'domain'", "'='", "'{'", "'}'", "'Role'", "'Profile'", "'Module'", "'version'", "'git'", "'ref'", "'.'", "'-'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPuppetDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPuppetDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPuppetDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g"; }



     	private PuppetDslGrammarAccess grammarAccess;
     	
        public InternalPuppetDslParser(TokenStream input, PuppetDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DslModel";	
       	}
       	
       	@Override
       	protected PuppetDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDslModel"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:67:1: entryRuleDslModel returns [EObject current=null] : iv_ruleDslModel= ruleDslModel EOF ;
    public final EObject entryRuleDslModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslModel = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:68:2: (iv_ruleDslModel= ruleDslModel EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:69:2: iv_ruleDslModel= ruleDslModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslModelRule()); 
            }
            pushFollow(FOLLOW_ruleDslModel_in_entryRuleDslModel75);
            iv_ruleDslModel=ruleDslModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslModel"


    // $ANTLR start "ruleDslModel"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:76:1: ruleDslModel returns [EObject current=null] : ( (lv_node_0_0= ruleDslNode ) ) ;
    public final EObject ruleDslModel() throws RecognitionException {
        EObject current = null;

        EObject lv_node_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:79:28: ( ( (lv_node_0_0= ruleDslNode ) ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:80:1: ( (lv_node_0_0= ruleDslNode ) )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:80:1: ( (lv_node_0_0= ruleDslNode ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:81:1: (lv_node_0_0= ruleDslNode )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:81:1: (lv_node_0_0= ruleDslNode )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:82:3: lv_node_0_0= ruleDslNode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDslModelAccess().getNodeDslNodeParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDslNode_in_ruleDslModel130);
            lv_node_0_0=ruleDslNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDslModelRule());
              	        }
                     		set(
                     			current, 
                     			"node",
                      		lv_node_0_0, 
                      		"DslNode");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslModel"


    // $ANTLR start "entryRuleDslNode"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:106:1: entryRuleDslNode returns [EObject current=null] : iv_ruleDslNode= ruleDslNode EOF ;
    public final EObject entryRuleDslNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslNode = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:107:2: (iv_ruleDslNode= ruleDslNode EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:108:2: iv_ruleDslNode= ruleDslNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslNodeRule()); 
            }
            pushFollow(FOLLOW_ruleDslNode_in_entryRuleDslNode165);
            iv_ruleDslNode=ruleDslNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslNode175); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslNode"


    // $ANTLR start "ruleDslNode"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:115:1: ruleDslNode returns [EObject current=null] : (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain' otherlv_3= '=' ( (lv_domain_4_0= ruleQualifiedName ) ) otherlv_5= '{' ( (lv_role_6_0= ruleDslRole ) ) otherlv_7= '}' ) ;
    public final EObject ruleDslNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_domain_4_0 = null;

        EObject lv_role_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:118:28: ( (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain' otherlv_3= '=' ( (lv_domain_4_0= ruleQualifiedName ) ) otherlv_5= '{' ( (lv_role_6_0= ruleDslRole ) ) otherlv_7= '}' ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:119:1: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain' otherlv_3= '=' ( (lv_domain_4_0= ruleQualifiedName ) ) otherlv_5= '{' ( (lv_role_6_0= ruleDslRole ) ) otherlv_7= '}' )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:119:1: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain' otherlv_3= '=' ( (lv_domain_4_0= ruleQualifiedName ) ) otherlv_5= '{' ( (lv_role_6_0= ruleDslRole ) ) otherlv_7= '}' )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:119:3: otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'domain' otherlv_3= '=' ( (lv_domain_4_0= ruleQualifiedName ) ) otherlv_5= '{' ( (lv_role_6_0= ruleDslRole ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDslNode212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDslNodeAccess().getNodeKeyword_0());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDslNode229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDslNodeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDslNodeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDslNode246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDslNodeAccess().getDomainKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDslNode258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDslNodeAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:149:1: ( (lv_domain_4_0= ruleQualifiedName ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:150:1: (lv_domain_4_0= ruleQualifiedName )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:150:1: (lv_domain_4_0= ruleQualifiedName )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:151:3: lv_domain_4_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDslNodeAccess().getDomainQualifiedNameParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDslNode279);
            lv_domain_4_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDslNodeRule());
              	        }
                     		set(
                     			current, 
                     			"domain",
                      		lv_domain_4_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDslNode291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDslNodeAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:171:1: ( (lv_role_6_0= ruleDslRole ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:172:1: (lv_role_6_0= ruleDslRole )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:172:1: (lv_role_6_0= ruleDslRole )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:173:3: lv_role_6_0= ruleDslRole
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDslNodeAccess().getRoleDslRoleParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDslRole_in_ruleDslNode312);
            lv_role_6_0=ruleDslRole();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDslNodeRule());
              	        }
                     		set(
                     			current, 
                     			"role",
                      		lv_role_6_0, 
                      		"DslRole");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleDslNode324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDslNodeAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslNode"


    // $ANTLR start "entryRuleDslRole"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:201:1: entryRuleDslRole returns [EObject current=null] : iv_ruleDslRole= ruleDslRole EOF ;
    public final EObject entryRuleDslRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslRole = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:202:2: (iv_ruleDslRole= ruleDslRole EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:203:2: iv_ruleDslRole= ruleDslRole EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslRoleRule()); 
            }
            pushFollow(FOLLOW_ruleDslRole_in_entryRuleDslRole360);
            iv_ruleDslRole=ruleDslRole();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslRole; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslRole370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslRole"


    // $ANTLR start "ruleDslRole"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:210:1: ruleDslRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_profiles_3_0= ruleDslProfile ) )+ otherlv_4= '}' ) ;
    public final EObject ruleDslRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_profiles_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:213:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_profiles_3_0= ruleDslProfile ) )+ otherlv_4= '}' ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:214:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_profiles_3_0= ruleDslProfile ) )+ otherlv_4= '}' )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:214:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_profiles_3_0= ruleDslProfile ) )+ otherlv_4= '}' )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:214:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_profiles_3_0= ruleDslProfile ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDslRole407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDslRoleAccess().getRoleKeyword_0());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:218:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:219:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:219:1: (lv_name_1_0= RULE_ID )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:220:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDslRole424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDslRoleAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDslRoleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDslRole441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDslRoleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:240:1: ( (lv_profiles_3_0= ruleDslProfile ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:241:1: (lv_profiles_3_0= ruleDslProfile )
            	    {
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:241:1: (lv_profiles_3_0= ruleDslProfile )
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:242:3: lv_profiles_3_0= ruleDslProfile
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDslRoleAccess().getProfilesDslProfileParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDslProfile_in_ruleDslRole462);
            	    lv_profiles_3_0=ruleDslProfile();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDslRoleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"profiles",
            	              		lv_profiles_3_0, 
            	              		"DslProfile");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDslRole475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDslRoleAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslRole"


    // $ANTLR start "entryRuleDslProfile"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:270:1: entryRuleDslProfile returns [EObject current=null] : iv_ruleDslProfile= ruleDslProfile EOF ;
    public final EObject entryRuleDslProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslProfile = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:271:2: (iv_ruleDslProfile= ruleDslProfile EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:272:2: iv_ruleDslProfile= ruleDslProfile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslProfileRule()); 
            }
            pushFollow(FOLLOW_ruleDslProfile_in_entryRuleDslProfile511);
            iv_ruleDslProfile=ruleDslProfile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslProfile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslProfile521); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslProfile"


    // $ANTLR start "ruleDslProfile"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:279:1: ruleDslProfile returns [EObject current=null] : (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_forgeModules_3_0= ruleDslForgeModule ) ) | ( (lv_gitModules_4_0= ruleDslGitModule ) ) )+ otherlv_5= '}' ) ;
    public final EObject ruleDslProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_forgeModules_3_0 = null;

        EObject lv_gitModules_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:282:28: ( (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_forgeModules_3_0= ruleDslForgeModule ) ) | ( (lv_gitModules_4_0= ruleDslGitModule ) ) )+ otherlv_5= '}' ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:283:1: (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_forgeModules_3_0= ruleDslForgeModule ) ) | ( (lv_gitModules_4_0= ruleDslGitModule ) ) )+ otherlv_5= '}' )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:283:1: (otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_forgeModules_3_0= ruleDslForgeModule ) ) | ( (lv_gitModules_4_0= ruleDslGitModule ) ) )+ otherlv_5= '}' )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:283:3: otherlv_0= 'Profile' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_forgeModules_3_0= ruleDslForgeModule ) ) | ( (lv_gitModules_4_0= ruleDslGitModule ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDslProfile558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDslProfileAccess().getProfileKeyword_0());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:287:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:288:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:288:1: (lv_name_1_0= RULE_ID )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDslProfile575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDslProfileAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDslProfileRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDslProfile592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDslProfileAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:309:1: ( ( (lv_forgeModules_3_0= ruleDslForgeModule ) ) | ( (lv_gitModules_4_0= ruleDslGitModule ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_ID) ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3==23) ) {
                            int LA2_4 = input.LA(4);

                            if ( (LA2_4==RULE_ID) ) {
                                int LA2_5 = input.LA(5);

                                if ( (LA2_5==15||(LA2_5>=18 && LA2_5<=19)) ) {
                                    alt2=1;
                                }
                                else if ( (LA2_5==20) ) {
                                    alt2=2;
                                }


                            }


                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:309:2: ( (lv_forgeModules_3_0= ruleDslForgeModule ) )
            	    {
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:309:2: ( (lv_forgeModules_3_0= ruleDslForgeModule ) )
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:310:1: (lv_forgeModules_3_0= ruleDslForgeModule )
            	    {
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:310:1: (lv_forgeModules_3_0= ruleDslForgeModule )
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:311:3: lv_forgeModules_3_0= ruleDslForgeModule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDslProfileAccess().getForgeModulesDslForgeModuleParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDslForgeModule_in_ruleDslProfile614);
            	    lv_forgeModules_3_0=ruleDslForgeModule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDslProfileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"forgeModules",
            	              		lv_forgeModules_3_0, 
            	              		"DslForgeModule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:328:6: ( (lv_gitModules_4_0= ruleDslGitModule ) )
            	    {
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:328:6: ( (lv_gitModules_4_0= ruleDslGitModule ) )
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:329:1: (lv_gitModules_4_0= ruleDslGitModule )
            	    {
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:329:1: (lv_gitModules_4_0= ruleDslGitModule )
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:330:3: lv_gitModules_4_0= ruleDslGitModule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDslProfileAccess().getGitModulesDslGitModuleParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDslGitModule_in_ruleDslProfile641);
            	    lv_gitModules_4_0=ruleDslGitModule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDslProfileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"gitModules",
            	              		lv_gitModules_4_0, 
            	              		"DslGitModule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleDslProfile655); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDslProfileAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslProfile"


    // $ANTLR start "entryRuleDslForgeModule"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:358:1: entryRuleDslForgeModule returns [EObject current=null] : iv_ruleDslForgeModule= ruleDslForgeModule EOF ;
    public final EObject entryRuleDslForgeModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslForgeModule = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:359:2: (iv_ruleDslForgeModule= ruleDslForgeModule EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:360:2: iv_ruleDslForgeModule= ruleDslForgeModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslForgeModuleRule()); 
            }
            pushFollow(FOLLOW_ruleDslForgeModule_in_entryRuleDslForgeModule691);
            iv_ruleDslForgeModule=ruleDslForgeModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslForgeModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslForgeModule701); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslForgeModule"


    // $ANTLR start "ruleDslForgeModule"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:367:1: ruleDslForgeModule returns [EObject current=null] : (otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) (otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= ruleVersion ) ) )? ) ;
    public final EObject ruleDslForgeModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_version_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:370:28: ( (otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) (otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= ruleVersion ) ) )? ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:371:1: (otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) (otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= ruleVersion ) ) )? )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:371:1: (otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) (otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= ruleVersion ) ) )? )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:371:3: otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) (otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= ruleVersion ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDslForgeModule738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDslForgeModuleAccess().getModuleKeyword_0());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:375:1: ( (lv_name_1_0= ruleForgeId ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:376:1: (lv_name_1_0= ruleForgeId )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:376:1: (lv_name_1_0= ruleForgeId )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:377:3: lv_name_1_0= ruleForgeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDslForgeModuleAccess().getNameForgeIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForgeId_in_ruleDslForgeModule759);
            lv_name_1_0=ruleForgeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDslForgeModuleRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ForgeId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:393:2: (otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= ruleVersion ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:393:4: otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= ruleVersion ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleDslForgeModule772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDslForgeModuleAccess().getVersionKeyword_2_0());
                          
                    }
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDslForgeModule784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDslForgeModuleAccess().getEqualsSignKeyword_2_1());
                          
                    }
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:401:1: ( (lv_version_4_0= ruleVersion ) )
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:402:1: (lv_version_4_0= ruleVersion )
                    {
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:402:1: (lv_version_4_0= ruleVersion )
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:403:3: lv_version_4_0= ruleVersion
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDslForgeModuleAccess().getVersionVersionParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVersion_in_ruleDslForgeModule805);
                    lv_version_4_0=ruleVersion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDslForgeModuleRule());
                      	        }
                             		set(
                             			current, 
                             			"version",
                              		lv_version_4_0, 
                              		"Version");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslForgeModule"


    // $ANTLR start "entryRuleDslGitModule"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:427:1: entryRuleDslGitModule returns [EObject current=null] : iv_ruleDslGitModule= ruleDslGitModule EOF ;
    public final EObject entryRuleDslGitModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslGitModule = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:428:2: (iv_ruleDslGitModule= ruleDslGitModule EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:429:2: iv_ruleDslGitModule= ruleDslGitModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslGitModuleRule()); 
            }
            pushFollow(FOLLOW_ruleDslGitModule_in_entryRuleDslGitModule843);
            iv_ruleDslGitModule=ruleDslGitModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslGitModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslGitModule853); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslGitModule"


    // $ANTLR start "ruleDslGitModule"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:436:1: ruleDslGitModule returns [EObject current=null] : (otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) otherlv_2= 'git' otherlv_3= '=' ( (lv_git_4_0= RULE_STRING ) ) (otherlv_5= 'ref' otherlv_6= '=' ( (lv_ref_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDslGitModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_git_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_ref_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:439:28: ( (otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) otherlv_2= 'git' otherlv_3= '=' ( (lv_git_4_0= RULE_STRING ) ) (otherlv_5= 'ref' otherlv_6= '=' ( (lv_ref_7_0= RULE_STRING ) ) )? ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:440:1: (otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) otherlv_2= 'git' otherlv_3= '=' ( (lv_git_4_0= RULE_STRING ) ) (otherlv_5= 'ref' otherlv_6= '=' ( (lv_ref_7_0= RULE_STRING ) ) )? )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:440:1: (otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) otherlv_2= 'git' otherlv_3= '=' ( (lv_git_4_0= RULE_STRING ) ) (otherlv_5= 'ref' otherlv_6= '=' ( (lv_ref_7_0= RULE_STRING ) ) )? )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:440:3: otherlv_0= 'Module' ( (lv_name_1_0= ruleForgeId ) ) otherlv_2= 'git' otherlv_3= '=' ( (lv_git_4_0= RULE_STRING ) ) (otherlv_5= 'ref' otherlv_6= '=' ( (lv_ref_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDslGitModule890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDslGitModuleAccess().getModuleKeyword_0());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:444:1: ( (lv_name_1_0= ruleForgeId ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:445:1: (lv_name_1_0= ruleForgeId )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:445:1: (lv_name_1_0= ruleForgeId )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:446:3: lv_name_1_0= ruleForgeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDslGitModuleAccess().getNameForgeIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForgeId_in_ruleDslGitModule911);
            lv_name_1_0=ruleForgeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDslGitModuleRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ForgeId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDslGitModule923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDslGitModuleAccess().getGitKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDslGitModule935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDslGitModuleAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:470:1: ( (lv_git_4_0= RULE_STRING ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:471:1: (lv_git_4_0= RULE_STRING )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:471:1: (lv_git_4_0= RULE_STRING )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:472:3: lv_git_4_0= RULE_STRING
            {
            lv_git_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDslGitModule952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_git_4_0, grammarAccess.getDslGitModuleAccess().getGitSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDslGitModuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"git",
                      		lv_git_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:488:2: (otherlv_5= 'ref' otherlv_6= '=' ( (lv_ref_7_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:488:4: otherlv_5= 'ref' otherlv_6= '=' ( (lv_ref_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleDslGitModule970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDslGitModuleAccess().getRefKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleDslGitModule982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getDslGitModuleAccess().getEqualsSignKeyword_5_1());
                          
                    }
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:496:1: ( (lv_ref_7_0= RULE_STRING ) )
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:497:1: (lv_ref_7_0= RULE_STRING )
                    {
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:497:1: (lv_ref_7_0= RULE_STRING )
                    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:498:3: lv_ref_7_0= RULE_STRING
                    {
                    lv_ref_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDslGitModule999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ref_7_0, grammarAccess.getDslGitModuleAccess().getRefSTRINGTerminalRuleCall_5_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDslGitModuleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ref",
                              		lv_ref_7_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslGitModule"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:522:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:523:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:524:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1043);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1054); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:531:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:534:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:535:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:535:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:535:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1094); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:542:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) && (synpred1_InternalPuppetDsl())) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:542:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:542:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:542:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName1122); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1138); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:565:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:566:2: (iv_ruleVersion= ruleVersion EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:567:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1186);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion1197); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:574:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID ) ( ( ( '.' )=>kw= '.' ) this_ID_4= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:577:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID ) ( ( ( '.' )=>kw= '.' ) this_ID_4= RULE_ID ) ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:578:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID ) ( ( ( '.' )=>kw= '.' ) this_ID_4= RULE_ID ) )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:578:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID ) ( ( ( '.' )=>kw= '.' ) this_ID_4= RULE_ID ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:578:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID ) ( ( ( '.' )=>kw= '.' ) this_ID_4= RULE_ID )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVersion1237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:585:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:585:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:585:2: ( ( '.' )=>kw= '.' )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:585:3: ( '.' )=>kw= '.'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleVersion1265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0()); 
                  
            }

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVersion1281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1()); 
                  
            }

            }

            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:600:2: ( ( ( '.' )=>kw= '.' ) this_ID_4= RULE_ID )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:600:3: ( ( '.' )=>kw= '.' ) this_ID_4= RULE_ID
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:600:3: ( ( '.' )=>kw= '.' )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:600:4: ( '.' )=>kw= '.'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleVersion1310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_2_0()); 
                  
            }

            }

            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVersion1326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_4, grammarAccess.getVersionAccess().getIDTerminalRuleCall_2_1()); 
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleForgeId"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:623:1: entryRuleForgeId returns [String current=null] : iv_ruleForgeId= ruleForgeId EOF ;
    public final String entryRuleForgeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForgeId = null;


        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:624:2: (iv_ruleForgeId= ruleForgeId EOF )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:625:2: iv_ruleForgeId= ruleForgeId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForgeIdRule()); 
            }
            pushFollow(FOLLOW_ruleForgeId_in_entryRuleForgeId1373);
            iv_ruleForgeId=ruleForgeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForgeId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForgeId1384); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForgeId"


    // $ANTLR start "ruleForgeId"
    // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:632:1: ruleForgeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( '-' )=>kw= '-' ) this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleForgeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:635:28: ( (this_ID_0= RULE_ID ( ( '-' )=>kw= '-' ) this_ID_2= RULE_ID ) )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:636:1: (this_ID_0= RULE_ID ( ( '-' )=>kw= '-' ) this_ID_2= RULE_ID )
            {
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:636:1: (this_ID_0= RULE_ID ( ( '-' )=>kw= '-' ) this_ID_2= RULE_ID )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:636:6: this_ID_0= RULE_ID ( ( '-' )=>kw= '-' ) this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForgeId1424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getForgeIdAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:643:1: ( ( '-' )=>kw= '-' )
            // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:643:2: ( '-' )=>kw= '-'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleForgeId1451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getForgeIdAccess().getHyphenMinusKeyword_1()); 
                  
            }

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForgeId1467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getForgeIdAccess().getIDTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForgeId"

    // $ANTLR start synpred1_InternalPuppetDsl
    public final void synpred1_InternalPuppetDsl_fragment() throws RecognitionException {   
        // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:542:3: ( '.' )
        // ../org.xmdlab.dsl.puppet/src-gen/org/xmdlab/dsl/puppet/parser/antlr/internal/InternalPuppetDsl.g:543:2: '.'
        {
        match(input,22,FOLLOW_22_in_synpred1_InternalPuppetDsl1113); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalPuppetDsl

    // Delegated rules

    public final boolean synpred1_InternalPuppetDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPuppetDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleDslModel_in_entryRuleDslModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslNode_in_ruleDslModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslNode_in_entryRuleDslNode165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslNode175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDslNode212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDslNode229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDslNode246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDslNode258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDslNode279 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDslNode291 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleDslRole_in_ruleDslNode312 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDslNode324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslRole_in_entryRuleDslRole360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslRole370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDslRole407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDslRole424 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDslRole441 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleDslProfile_in_ruleDslRole462 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleDslRole475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslProfile_in_entryRuleDslProfile511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslProfile521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDslProfile558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDslProfile575 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDslProfile592 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleDslForgeModule_in_ruleDslProfile614 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_ruleDslGitModule_in_ruleDslProfile641 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleDslProfile655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslForgeModule_in_entryRuleDslForgeModule691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslForgeModule701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDslForgeModule738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleForgeId_in_ruleDslForgeModule759 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleDslForgeModule772 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDslForgeModule784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleDslForgeModule805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslGitModule_in_entryRuleDslGitModule843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslGitModule853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDslGitModule890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleForgeId_in_ruleDslGitModule911 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDslGitModule923 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDslGitModule935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDslGitModule952 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleDslGitModule970 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDslGitModule982 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDslGitModule999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1094 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1138 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVersion1237 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleVersion1265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVersion1281 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleVersion1310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVersion1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForgeId_in_entryRuleForgeId1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForgeId1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForgeId1424 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleForgeId1451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForgeId1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred1_InternalPuppetDsl1113 = new BitSet(new long[]{0x0000000000000002L});

}