/*
 * generated by Xtext 2.21.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathAssignmentLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.MathAssignmentLanguage.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cResultKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		
		//MathExp:
		//	'result' 'is' exp=Exp;
		@Override public ParserRule getRule() { return rule; }
		
		//'result' 'is' exp=Exp
		public Group getGroup() { return cGroup; }
		
		//'result'
		public Keyword getResultKeyword_0() { return cResultKeyword_0; }
		
		//'is'
		public Keyword getIsKeyword_1() { return cIsKeyword_1; }
		
		//exp=Exp
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_2_0() { return cExpExpParserRuleCall_2_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFactorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_0 = (Keyword)cGroup_1_0_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_1 = (Action)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_1_0_1_0 = (Keyword)cGroup_1_0_1.eContents().get(0);
		private final Action cMinusLeftAction_1_0_1_1 = (Action)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightFactorParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp Expression:
		//	Factor (('+' {Plus.left=current} | '-' {Minus.left=current}) right=Factor)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Factor (('+' {Plus.left=current} | '-' {Minus.left=current}) right=Factor)*
		public Group getGroup() { return cGroup; }
		
		//Factor
		public RuleCall getFactorParserRuleCall_0() { return cFactorParserRuleCall_0; }
		
		//(('+' {Plus.left=current} | '-' {Minus.left=current}) right=Factor)*
		public Group getGroup_1() { return cGroup_1; }
		
		//('+' {Plus.left=current} | '-' {Minus.left=current})
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'+' {Plus.left=current}
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_0() { return cPlusSignKeyword_1_0_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_1() { return cPlusLeftAction_1_0_0_1; }
		
		//'-' {Minus.left=current}
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_0() { return cHyphenMinusKeyword_1_0_1_0; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_1() { return cMinusLeftAction_1_0_1_1; }
		
		//right=Factor
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Factor
		public RuleCall getRightFactorParserRuleCall_1_1_0() { return cRightFactorParserRuleCall_1_1_0; }
	}
	public class FactorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Factor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_0 = (Keyword)cGroup_1_0_0.eContents().get(0);
		private final Action cMultLeftAction_1_0_0_1 = (Action)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0_1_0 = (Keyword)cGroup_1_0_1.eContents().get(0);
		private final Action cDivLeftAction_1_0_1_1 = (Action)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Factor Expression:
		//	Primary (('*' {Mult.left=current} | '/' {Div.left=current}) right=Primary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary (('*' {Mult.left=current} | '/' {Div.left=current}) right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//(('*' {Mult.left=current} | '/' {Div.left=current}) right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//('*' {Mult.left=current} | '/' {Div.left=current})
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'*' {Mult.left=current}
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_0() { return cAsteriskKeyword_1_0_0_0; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0_0_1() { return cMultLeftAction_1_0_0_1; }
		
		//'/' {Div.left=current}
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0_1_0() { return cSolidusKeyword_1_0_1_0; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_0_1_1() { return cDivLeftAction_1_0_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_0() { return cRightPrimaryParserRuleCall_1_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesisParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVariableBindingParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cVariableUseParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Primary Expression:
		//	Number | Parenthesis | VariableBinding | VariableUse;
		@Override public ParserRule getRule() { return rule; }
		
		//Number | Parenthesis | VariableBinding | VariableUse
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Number
		public RuleCall getNumberParserRuleCall_0() { return cNumberParserRuleCall_0; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_1() { return cParenthesisParserRuleCall_1; }
		
		//VariableBinding
		public RuleCall getVariableBindingParserRuleCall_2() { return cVariableBindingParserRuleCall_2; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_3() { return cVariableUseParserRuleCall_3; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.MathAssignmentLanguage.VariableUse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVarAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		
		//VariableUse Expression:
		//	{Var} id=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//{Var} id=ID
		public Group getGroup() { return cGroup; }
		
		//{Var}
		public Action getVarAction_0() { return cVarAction_0; }
		
		//id=ID
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
	}
	public class VariableBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.MathAssignmentLanguage.VariableBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLetAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLetKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cIdIDTerminalRuleCall_2_0 = (RuleCall)cIdAssignment_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cBindingAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBindingExpParserRuleCall_4_0 = (RuleCall)cBindingAssignment_4.eContents().get(0);
		private final Keyword cInKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBodyAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBodyExpParserRuleCall_6_0 = (RuleCall)cBodyAssignment_6.eContents().get(0);
		private final Keyword cEndKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VariableBinding Expression:
		//	{Let} 'let' id=ID '=' binding=Exp 'in' body=Exp 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//{Let} 'let' id=ID '=' binding=Exp 'in' body=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		//{Let}
		public Action getLetAction_0() { return cLetAction_0; }
		
		//'let'
		public Keyword getLetKeyword_1() { return cLetKeyword_1; }
		
		//id=ID
		public Assignment getIdAssignment_2() { return cIdAssignment_2; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_2_0() { return cIdIDTerminalRuleCall_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//binding=Exp
		public Assignment getBindingAssignment_4() { return cBindingAssignment_4; }
		
		//Exp
		public RuleCall getBindingExpParserRuleCall_4_0() { return cBindingExpParserRuleCall_4_0; }
		
		//'in'
		public Keyword getInKeyword_5() { return cInKeyword_5; }
		
		//body=Exp
		public Assignment getBodyAssignment_6() { return cBodyAssignment_6; }
		
		//Exp
		public RuleCall getBodyExpParserRuleCall_6_0() { return cBodyExpParserRuleCall_6_0; }
		
		//'end'
		public Keyword getEndKeyword_7() { return cEndKeyword_7; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cExpParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parenthesis Expression:
		//	'(' Exp ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Exp ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Exp
		public RuleCall getExpParserRuleCall_1() { return cExpParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.MathAssignmentLanguage.Number");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNumAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Number Expression:
		//	{Num} value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//{Num} value=INT
		public Group getGroup() { return cGroup; }
		
		//{Num}
		public Action getNumAction_0() { return cNumAction_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	
	
	private final MathExpElements pMathExp;
	private final ExpElements pExp;
	private final FactorElements pFactor;
	private final PrimaryElements pPrimary;
	private final VariableUseElements pVariableUse;
	private final VariableBindingElements pVariableBinding;
	private final ParenthesisElements pParenthesis;
	private final NumberElements pNumber;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathAssignmentLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMathExp = new MathExpElements();
		this.pExp = new ExpElements();
		this.pFactor = new FactorElements();
		this.pPrimary = new PrimaryElements();
		this.pVariableUse = new VariableUseElements();
		this.pVariableBinding = new VariableBindingElements();
		this.pParenthesis = new ParenthesisElements();
		this.pNumber = new NumberElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.MathAssignmentLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MathExp:
	//	'result' 'is' exp=Exp;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//Exp Expression:
	//	Factor (('+' {Plus.left=current} | '-' {Minus.left=current}) right=Factor)*;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//Factor Expression:
	//	Primary (('*' {Mult.left=current} | '/' {Div.left=current}) right=Primary)*;
	public FactorElements getFactorAccess() {
		return pFactor;
	}
	
	public ParserRule getFactorRule() {
		return getFactorAccess().getRule();
	}
	
	//Primary Expression:
	//	Number | Parenthesis | VariableBinding | VariableUse;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//VariableUse Expression:
	//	{Var} id=ID;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//VariableBinding Expression:
	//	{Let} 'let' id=ID '=' binding=Exp 'in' body=Exp 'end';
	public VariableBindingElements getVariableBindingAccess() {
		return pVariableBinding;
	}
	
	public ParserRule getVariableBindingRule() {
		return getVariableBindingAccess().getRule();
	}
	
	//Parenthesis Expression:
	//	'(' Exp ')';
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//Number Expression:
	//	{Num} value=INT;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
