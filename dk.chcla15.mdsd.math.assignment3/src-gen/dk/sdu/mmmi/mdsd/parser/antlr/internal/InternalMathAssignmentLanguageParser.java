package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathAssignmentLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathAssignmentLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'external'", "'('", "','", "')'", "'type'", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'let'", "'='", "'in'", "'end'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathAssignmentLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathAssignmentLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathAssignmentLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathAssignmentLanguage.g"; }



     	private MathAssignmentLanguageGrammarAccess grammarAccess;

        public InternalMathAssignmentLanguageParser(TokenStream input, MathAssignmentLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathAssignmentLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMathAssignmentLanguage.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathAssignmentLanguage.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathAssignmentLanguage.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathAssignmentLanguage.g:71:1: ruleMathExp returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:77:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // InternalMathAssignmentLanguage.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // InternalMathAssignmentLanguage.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalMathAssignmentLanguage.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalMathAssignmentLanguage.g:80:4: lv_declarations_0_0= ruleDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getMathExpAccess().getDeclarationsDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    				}
            	    				add(
            	    					current,
            	    					"declarations",
            	    					lv_declarations_0_0,
            	    					"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Declaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMathAssignmentLanguage.g:100:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMathAssignmentLanguage.g:100:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMathAssignmentLanguage.g:101:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMathAssignmentLanguage.g:107:1: ruleDeclaration returns [EObject current=null] : (this_Type_0= ruleType | this_ExternalDef_1= ruleExternalDef | this_ResultStatement_2= ruleResultStatement ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_ExternalDef_1 = null;

        EObject this_ResultStatement_2 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:113:2: ( (this_Type_0= ruleType | this_ExternalDef_1= ruleExternalDef | this_ResultStatement_2= ruleResultStatement ) )
            // InternalMathAssignmentLanguage.g:114:2: (this_Type_0= ruleType | this_ExternalDef_1= ruleExternalDef | this_ResultStatement_2= ruleResultStatement )
            {
            // InternalMathAssignmentLanguage.g:114:2: (this_Type_0= ruleType | this_ExternalDef_1= ruleExternalDef | this_ResultStatement_2= ruleResultStatement )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:115:3: this_Type_0= ruleType
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_0=ruleType();

                    state._fsp--;


                    			current = this_Type_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:124:3: this_ExternalDef_1= ruleExternalDef
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getExternalDefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalDef_1=ruleExternalDef();

                    state._fsp--;


                    			current = this_ExternalDef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMathAssignmentLanguage.g:133:3: this_ResultStatement_2= ruleResultStatement
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getResultStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ResultStatement_2=ruleResultStatement();

                    state._fsp--;


                    			current = this_ResultStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleExternalDef"
    // InternalMathAssignmentLanguage.g:145:1: entryRuleExternalDef returns [EObject current=null] : iv_ruleExternalDef= ruleExternalDef EOF ;
    public final EObject entryRuleExternalDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDef = null;


        try {
            // InternalMathAssignmentLanguage.g:145:52: (iv_ruleExternalDef= ruleExternalDef EOF )
            // InternalMathAssignmentLanguage.g:146:2: iv_ruleExternalDef= ruleExternalDef EOF
            {
             newCompositeNode(grammarAccess.getExternalDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDef=ruleExternalDef();

            state._fsp--;

             current =iv_ruleExternalDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalDef"


    // $ANTLR start "ruleExternalDef"
    // InternalMathAssignmentLanguage.g:152:1: ruleExternalDef returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternalDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:158:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' ) )
            // InternalMathAssignmentLanguage.g:159:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            {
            // InternalMathAssignmentLanguage.g:159:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )
            // InternalMathAssignmentLanguage.g:160:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalDefAccess().getExternalKeyword_0());
            		
            // InternalMathAssignmentLanguage.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathAssignmentLanguage.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalMathAssignmentLanguage.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalDefAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMathAssignmentLanguage.g:186:3: ( (lv_parameters_3_0= ruleParameter ) )
            // InternalMathAssignmentLanguage.g:187:4: (lv_parameters_3_0= ruleParameter )
            {
            // InternalMathAssignmentLanguage.g:187:4: (lv_parameters_3_0= ruleParameter )
            // InternalMathAssignmentLanguage.g:188:5: lv_parameters_3_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getExternalDefAccess().getParametersParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_parameters_3_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalDefRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_3_0,
            						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathAssignmentLanguage.g:205:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:206:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalDefAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMathAssignmentLanguage.g:210:4: ( (lv_parameters_5_0= ruleParameter ) )
            	    // InternalMathAssignmentLanguage.g:211:5: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalMathAssignmentLanguage.g:211:5: (lv_parameters_5_0= ruleParameter )
            	    // InternalMathAssignmentLanguage.g:212:6: lv_parameters_5_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getExternalDefAccess().getParametersParameterParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalDefRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_5_0,
            	    							"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalDefAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRuleParameter"
    // InternalMathAssignmentLanguage.g:238:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMathAssignmentLanguage.g:238:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMathAssignmentLanguage.g:239:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMathAssignmentLanguage.g:245:1: ruleParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameterName_1_0=null;


        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:251:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ) )
            // InternalMathAssignmentLanguage.g:252:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameterName_1_0= RULE_ID ) ) )
            {
            // InternalMathAssignmentLanguage.g:252:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_parameterName_1_0= RULE_ID ) ) )
            // InternalMathAssignmentLanguage.g:253:3: ( (otherlv_0= RULE_ID ) ) ( (lv_parameterName_1_0= RULE_ID ) )
            {
            // InternalMathAssignmentLanguage.g:253:3: ( (otherlv_0= RULE_ID ) )
            // InternalMathAssignmentLanguage.g:254:4: (otherlv_0= RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:254:4: (otherlv_0= RULE_ID )
            // InternalMathAssignmentLanguage.g:255:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0());
            				

            }


            }

            // InternalMathAssignmentLanguage.g:266:3: ( (lv_parameterName_1_0= RULE_ID ) )
            // InternalMathAssignmentLanguage.g:267:4: (lv_parameterName_1_0= RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:267:4: (lv_parameterName_1_0= RULE_ID )
            // InternalMathAssignmentLanguage.g:268:5: lv_parameterName_1_0= RULE_ID
            {
            lv_parameterName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_parameterName_1_0, grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameterName",
            						lv_parameterName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalMathAssignmentLanguage.g:288:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMathAssignmentLanguage.g:288:45: (iv_ruleType= ruleType EOF )
            // InternalMathAssignmentLanguage.g:289:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMathAssignmentLanguage.g:295:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:301:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMathAssignmentLanguage.g:302:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMathAssignmentLanguage.g:302:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMathAssignmentLanguage.g:303:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalMathAssignmentLanguage.g:307:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMathAssignmentLanguage.g:308:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:308:4: (lv_name_1_0= RULE_ID )
            // InternalMathAssignmentLanguage.g:309:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleResultStatement"
    // InternalMathAssignmentLanguage.g:329:1: entryRuleResultStatement returns [EObject current=null] : iv_ruleResultStatement= ruleResultStatement EOF ;
    public final EObject entryRuleResultStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResultStatement = null;


        try {
            // InternalMathAssignmentLanguage.g:329:56: (iv_ruleResultStatement= ruleResultStatement EOF )
            // InternalMathAssignmentLanguage.g:330:2: iv_ruleResultStatement= ruleResultStatement EOF
            {
             newCompositeNode(grammarAccess.getResultStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResultStatement=ruleResultStatement();

            state._fsp--;

             current =iv_ruleResultStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResultStatement"


    // $ANTLR start "ruleResultStatement"
    // InternalMathAssignmentLanguage.g:336:1: ruleResultStatement returns [EObject current=null] : (otherlv_0= 'result' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleResultStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:342:2: ( (otherlv_0= 'result' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMathAssignmentLanguage.g:343:2: (otherlv_0= 'result' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMathAssignmentLanguage.g:343:2: (otherlv_0= 'result' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMathAssignmentLanguage.g:344:3: otherlv_0= 'result' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getResultStatementAccess().getResultKeyword_0());
            		
            // InternalMathAssignmentLanguage.g:348:3: ( (lv_label_1_0= RULE_STRING ) )
            // InternalMathAssignmentLanguage.g:349:4: (lv_label_1_0= RULE_STRING )
            {
            // InternalMathAssignmentLanguage.g:349:4: (lv_label_1_0= RULE_STRING )
            // InternalMathAssignmentLanguage.g:350:5: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_label_1_0, grammarAccess.getResultStatementAccess().getLabelSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResultStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getResultStatementAccess().getIsKeyword_2());
            		
            // InternalMathAssignmentLanguage.g:370:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMathAssignmentLanguage.g:371:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMathAssignmentLanguage.g:371:4: (lv_exp_3_0= ruleExp )
            // InternalMathAssignmentLanguage.g:372:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getResultStatementAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResultStatementRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResultStatement"


    // $ANTLR start "entryRuleExp"
    // InternalMathAssignmentLanguage.g:393:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathAssignmentLanguage.g:393:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathAssignmentLanguage.g:394:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathAssignmentLanguage.g:400:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:406:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMathAssignmentLanguage.g:407:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMathAssignmentLanguage.g:407:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMathAssignmentLanguage.g:408:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathAssignmentLanguage.g:416:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:417:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMathAssignmentLanguage.g:417:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==18) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==19) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMathAssignmentLanguage.g:418:5: (otherlv_1= '+' () )
            	            {
            	            // InternalMathAssignmentLanguage.g:418:5: (otherlv_1= '+' () )
            	            // InternalMathAssignmentLanguage.g:419:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalMathAssignmentLanguage.g:423:6: ()
            	            // InternalMathAssignmentLanguage.g:424:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathAssignmentLanguage.g:432:5: (otherlv_3= '-' () )
            	            {
            	            // InternalMathAssignmentLanguage.g:432:5: (otherlv_3= '-' () )
            	            // InternalMathAssignmentLanguage.g:433:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,19,FOLLOW_9); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalMathAssignmentLanguage.g:437:6: ()
            	            // InternalMathAssignmentLanguage.g:438:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathAssignmentLanguage.g:446:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMathAssignmentLanguage.g:447:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMathAssignmentLanguage.g:447:5: (lv_right_5_0= ruleFactor )
            	    // InternalMathAssignmentLanguage.g:448:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMathAssignmentLanguage.g:470:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMathAssignmentLanguage.g:470:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMathAssignmentLanguage.g:471:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMathAssignmentLanguage.g:477:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:483:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMathAssignmentLanguage.g:484:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMathAssignmentLanguage.g:484:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMathAssignmentLanguage.g:485:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathAssignmentLanguage.g:493:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:494:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMathAssignmentLanguage.g:494:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==20) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==21) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMathAssignmentLanguage.g:495:5: (otherlv_1= '*' () )
            	            {
            	            // InternalMathAssignmentLanguage.g:495:5: (otherlv_1= '*' () )
            	            // InternalMathAssignmentLanguage.g:496:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalMathAssignmentLanguage.g:500:6: ()
            	            // InternalMathAssignmentLanguage.g:501:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathAssignmentLanguage.g:509:5: (otherlv_3= '/' () )
            	            {
            	            // InternalMathAssignmentLanguage.g:509:5: (otherlv_3= '/' () )
            	            // InternalMathAssignmentLanguage.g:510:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalMathAssignmentLanguage.g:514:6: ()
            	            // InternalMathAssignmentLanguage.g:515:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathAssignmentLanguage.g:523:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMathAssignmentLanguage.g:524:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMathAssignmentLanguage.g:524:5: (lv_right_5_0= rulePrimary )
            	    // InternalMathAssignmentLanguage.g:525:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMathAssignmentLanguage.g:547:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathAssignmentLanguage.g:547:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathAssignmentLanguage.g:548:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathAssignmentLanguage.g:554:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse | this_ExternalUse_4= ruleExternalUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableBinding_2 = null;

        EObject this_VariableUse_3 = null;

        EObject this_ExternalUse_4 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:560:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse | this_ExternalUse_4= ruleExternalUse ) )
            // InternalMathAssignmentLanguage.g:561:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse | this_ExternalUse_4= ruleExternalUse )
            {
            // InternalMathAssignmentLanguage.g:561:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse | this_ExternalUse_4= ruleExternalUse )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                int LA8_4 = input.LA(2);

                if ( (LA8_4==EOF||LA8_4==11||(LA8_4>=13 && LA8_4<=16)||(LA8_4>=18 && LA8_4<=21)||(LA8_4>=24 && LA8_4<=25)) ) {
                    alt8=4;
                }
                else if ( (LA8_4==12) ) {
                    alt8=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:562:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:571:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMathAssignmentLanguage.g:580:3: this_VariableBinding_2= ruleVariableBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableBinding_2=ruleVariableBinding();

                    state._fsp--;


                    			current = this_VariableBinding_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMathAssignmentLanguage.g:589:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMathAssignmentLanguage.g:598:3: this_ExternalUse_4= ruleExternalUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalUseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalUse_4=ruleExternalUse();

                    state._fsp--;


                    			current = this_ExternalUse_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMathAssignmentLanguage.g:610:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMathAssignmentLanguage.g:610:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMathAssignmentLanguage.g:611:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMathAssignmentLanguage.g:617:1: ruleVariableUse returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:623:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalMathAssignmentLanguage.g:624:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalMathAssignmentLanguage.g:624:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            // InternalMathAssignmentLanguage.g:625:3: () ( (lv_id_1_0= RULE_ID ) )
            {
            // InternalMathAssignmentLanguage.g:625:3: ()
            // InternalMathAssignmentLanguage.g:626:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarAction_0(),
            					current);
            			

            }

            // InternalMathAssignmentLanguage.g:632:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMathAssignmentLanguage.g:633:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:633:4: (lv_id_1_0= RULE_ID )
            // InternalMathAssignmentLanguage.g:634:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalMathAssignmentLanguage.g:654:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalMathAssignmentLanguage.g:654:56: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalMathAssignmentLanguage.g:655:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalMathAssignmentLanguage.g:661:1: ruleVariableBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_binding_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:667:2: ( ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalMathAssignmentLanguage.g:668:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalMathAssignmentLanguage.g:668:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalMathAssignmentLanguage.g:669:3: () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalMathAssignmentLanguage.g:669:3: ()
            // InternalMathAssignmentLanguage.g:670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
            		
            // InternalMathAssignmentLanguage.g:680:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalMathAssignmentLanguage.g:681:4: (lv_id_2_0= RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:681:4: (lv_id_2_0= RULE_ID )
            // InternalMathAssignmentLanguage.g:682:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_id_2_0, grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalMathAssignmentLanguage.g:702:3: ( (lv_binding_4_0= ruleExp ) )
            // InternalMathAssignmentLanguage.g:703:4: (lv_binding_4_0= ruleExp )
            {
            // InternalMathAssignmentLanguage.g:703:4: (lv_binding_4_0= ruleExp )
            // InternalMathAssignmentLanguage.g:704:5: lv_binding_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_binding_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_4_0,
            						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_5());
            		
            // InternalMathAssignmentLanguage.g:725:3: ( (lv_body_6_0= ruleExp ) )
            // InternalMathAssignmentLanguage.g:726:4: (lv_body_6_0= ruleExp )
            {
            // InternalMathAssignmentLanguage.g:726:4: (lv_body_6_0= ruleExp )
            // InternalMathAssignmentLanguage.g:727:5: lv_body_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_body_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableBindingAccess().getEndKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleExternalUse"
    // InternalMathAssignmentLanguage.g:752:1: entryRuleExternalUse returns [EObject current=null] : iv_ruleExternalUse= ruleExternalUse EOF ;
    public final EObject entryRuleExternalUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalUse = null;


        try {
            // InternalMathAssignmentLanguage.g:752:52: (iv_ruleExternalUse= ruleExternalUse EOF )
            // InternalMathAssignmentLanguage.g:753:2: iv_ruleExternalUse= ruleExternalUse EOF
            {
             newCompositeNode(grammarAccess.getExternalUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalUse=ruleExternalUse();

            state._fsp--;

             current =iv_ruleExternalUse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalUse"


    // $ANTLR start "ruleExternalUse"
    // InternalMathAssignmentLanguage.g:759:1: ruleExternalUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleExternalUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:765:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' ) )
            // InternalMathAssignmentLanguage.g:766:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' )
            {
            // InternalMathAssignmentLanguage.g:766:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')' )
            // InternalMathAssignmentLanguage.g:767:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (lv_arguments_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )* otherlv_6= ')'
            {
            // InternalMathAssignmentLanguage.g:767:3: ()
            // InternalMathAssignmentLanguage.g:768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalUseAccess().getExternalUseAction_0(),
            					current);
            			

            }

            // InternalMathAssignmentLanguage.g:774:3: ( (otherlv_1= RULE_ID ) )
            // InternalMathAssignmentLanguage.g:775:4: (otherlv_1= RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:775:4: (otherlv_1= RULE_ID )
            // InternalMathAssignmentLanguage.g:776:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_1, grammarAccess.getExternalUseAccess().getExternalExternalDefCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalUseAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMathAssignmentLanguage.g:791:3: ( (lv_arguments_3_0= ruleExp ) )
            // InternalMathAssignmentLanguage.g:792:4: (lv_arguments_3_0= ruleExp )
            {
            // InternalMathAssignmentLanguage.g:792:4: (lv_arguments_3_0= ruleExp )
            // InternalMathAssignmentLanguage.g:793:5: lv_arguments_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_arguments_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalUseRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_3_0,
            						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathAssignmentLanguage.g:810:3: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:811:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleExp ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getExternalUseAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMathAssignmentLanguage.g:815:4: ( (lv_arguments_5_0= ruleExp ) )
            	    // InternalMathAssignmentLanguage.g:816:5: (lv_arguments_5_0= ruleExp )
            	    {
            	    // InternalMathAssignmentLanguage.g:816:5: (lv_arguments_5_0= ruleExp )
            	    // InternalMathAssignmentLanguage.g:817:6: lv_arguments_5_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_arguments_5_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalUseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_5_0,
            	    							"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalUseAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalUse"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathAssignmentLanguage.g:843:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMathAssignmentLanguage.g:843:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMathAssignmentLanguage.g:844:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathAssignmentLanguage.g:850:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:856:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalMathAssignmentLanguage.g:857:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalMathAssignmentLanguage.g:857:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalMathAssignmentLanguage.g:858:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_15);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathAssignmentLanguage.g:878:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathAssignmentLanguage.g:878:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathAssignmentLanguage.g:879:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathAssignmentLanguage.g:885:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMathAssignmentLanguage.g:891:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMathAssignmentLanguage.g:892:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMathAssignmentLanguage.g:892:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMathAssignmentLanguage.g:893:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMathAssignmentLanguage.g:893:3: ()
            // InternalMathAssignmentLanguage.g:894:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalMathAssignmentLanguage.g:900:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMathAssignmentLanguage.g:901:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMathAssignmentLanguage.g:901:4: (lv_value_1_0= RULE_INT )
            // InternalMathAssignmentLanguage.g:902:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000401050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});

}