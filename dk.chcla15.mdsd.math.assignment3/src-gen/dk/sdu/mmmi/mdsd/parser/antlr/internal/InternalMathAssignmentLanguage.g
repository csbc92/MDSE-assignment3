/*
 * generated by Xtext 2.21.0
 */
grammar InternalMathAssignmentLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMathExp
entryRuleMathExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMathExpRule()); }
	iv_ruleMathExp=ruleMathExp
	{ $current=$iv_ruleMathExp.current; }
	EOF;

// Rule MathExp
ruleMathExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMathExpAccess().getDeclarationsDeclarationParserRuleCall_0());
			}
			lv_declarations_0_0=ruleDeclaration
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMathExpRule());
				}
				add(
					$current,
					"declarations",
					lv_declarations_0_0,
					"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Declaration");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getTypeParserRuleCall_0());
		}
		this_Type_0=ruleType
		{
			$current = $this_Type_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getExternalDefParserRuleCall_1());
		}
		this_ExternalDef_1=ruleExternalDef
		{
			$current = $this_ExternalDef_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getResultStatementParserRuleCall_2());
		}
		this_ResultStatement_2=ruleResultStatement
		{
			$current = $this_ResultStatement_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExternalDef
entryRuleExternalDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalDefRule()); }
	iv_ruleExternalDef=ruleExternalDef
	{ $current=$iv_ruleExternalDef.current; }
	EOF;

// Rule ExternalDef
ruleExternalDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='external'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalDefAccess().getExternalKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalDefRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getExternalDefAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalDefAccess().getParametersParameterParserRuleCall_3_0());
				}
				lv_parameters_3_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalDefRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_3_0,
						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getExternalDefAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExternalDefAccess().getParametersParameterParserRuleCall_4_1_0());
					}
					lv_parameters_5_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExternalDefRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_5_0,
							"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getExternalDefAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0());
				}
			)
		)
		(
			(
				lv_parameterName_1_0=RULE_ID
				{
					newLeafNode(lv_parameterName_1_0, grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"parameterName",
						lv_parameterName_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleResultStatement
entryRuleResultStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResultStatementRule()); }
	iv_ruleResultStatement=ruleResultStatement
	{ $current=$iv_ruleResultStatement.current; }
	EOF;

// Rule ResultStatement
ruleResultStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='result'
		{
			newLeafNode(otherlv_0, grammarAccess.getResultStatementAccess().getResultKeyword_0());
		}
		(
			(
				lv_label_1_0=RULE_STRING
				{
					newLeafNode(lv_label_1_0, grammarAccess.getResultStatementAccess().getLabelSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResultStatementRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='is'
		{
			newLeafNode(otherlv_2, grammarAccess.getResultStatementAccess().getIsKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getResultStatementAccess().getExpExpParserRuleCall_3_0());
				}
				lv_exp_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getResultStatementRule());
					}
					set(
						$current,
						"exp",
						lv_exp_3_0,
						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
		}
		this_Factor_0=ruleFactor
		{
			$current = $this_Factor_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1='+'
					{
						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3='-'
					{
						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
					}
					lv_right_5_0=ruleFactor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Factor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleFactor
entryRuleFactor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFactorRule()); }
	iv_ruleFactor=ruleFactor
	{ $current=$iv_ruleFactor.current; }
	EOF;

// Rule Factor
ruleFactor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1='*'
					{
						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3='/'
					{
						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
					}
					lv_right_5_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFactorRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
		}
		this_Number_0=ruleNumber
		{
			$current = $this_Number_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
		}
		this_Parenthesis_1=ruleParenthesis
		{
			$current = $this_Parenthesis_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2());
		}
		this_VariableBinding_2=ruleVariableBinding
		{
			$current = $this_VariableBinding_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
		}
		this_VariableUse_3=ruleVariableUse
		{
			$current = $this_VariableUse_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalUseParserRuleCall_4());
		}
		this_ExternalUse_4=ruleExternalUse
		{
			$current = $this_ExternalUse_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVariableUse
entryRuleVariableUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableUseRule()); }
	iv_ruleVariableUse=ruleVariableUse
	{ $current=$iv_ruleVariableUse.current; }
	EOF;

// Rule VariableUse
ruleVariableUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVariableUseAccess().getVarAction_0(),
					$current);
			}
		)
		(
			(
				lv_id_1_0=RULE_ID
				{
					newLeafNode(lv_id_1_0, grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableUseRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleVariableBinding
entryRuleVariableBinding returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableBindingRule()); }
	iv_ruleVariableBinding=ruleVariableBinding
	{ $current=$iv_ruleVariableBinding.current; }
	EOF;

// Rule VariableBinding
ruleVariableBinding returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getVariableBindingAccess().getLetAction_0(),
					$current);
			}
		)
		otherlv_1='let'
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_ID
				{
					newLeafNode(lv_id_2_0, grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableBindingRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0());
				}
				lv_binding_4_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableBindingRule());
					}
					set(
						$current,
						"binding",
						lv_binding_4_0,
						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='in'
		{
			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0());
				}
				lv_body_6_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableBindingRule());
					}
					set(
						$current,
						"body",
						lv_body_6_0,
						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='end'
		{
			newLeafNode(otherlv_7, grammarAccess.getVariableBindingAccess().getEndKeyword_7());
		}
	)
;

// Entry rule entryRuleExternalUse
entryRuleExternalUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalUseRule()); }
	iv_ruleExternalUse=ruleExternalUse
	{ $current=$iv_ruleExternalUse.current; }
	EOF;

// Rule ExternalUse
ruleExternalUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExternalUseAccess().getExternalUseAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalUseRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getExternalUseAccess().getExternalExternalDefCrossReference_1_0());
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getExternalUseAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_3_0());
				}
				lv_arguments_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalUseRule());
					}
					add(
						$current,
						"arguments",
						lv_arguments_3_0,
						"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getExternalUseAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_4_1_0());
					}
					lv_arguments_5_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExternalUseRule());
						}
						add(
							$current,
							"arguments",
							lv_arguments_5_0,
							"dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getExternalUseAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleParenthesis
entryRuleParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesisRule()); }
	iv_ruleParenthesis=ruleParenthesis
	{ $current=$iv_ruleParenthesis.current; }
	EOF;

// Rule Parenthesis
ruleParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
		}
		this_Exp_1=ruleExp
		{
			$current = $this_Exp_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNumberAccess().getNumAction_0(),
					$current);
			}
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumberRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
