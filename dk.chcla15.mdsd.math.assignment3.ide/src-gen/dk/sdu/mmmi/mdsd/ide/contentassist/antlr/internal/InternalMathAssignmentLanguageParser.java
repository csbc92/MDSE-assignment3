package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.services.MathAssignmentLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathAssignmentLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'external'", "'('", "')'", "','", "'type'", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'let'", "'='", "'in'", "'end'"
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

    	public void setGrammarAccess(MathAssignmentLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMathExp"
    // InternalMathAssignmentLanguage.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:54:1: ( ruleMathExp EOF )
            // InternalMathAssignmentLanguage.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathAssignmentLanguage.g:62:1: ruleMathExp : ( ( rule__MathExp__DeclarationsAssignment )* ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:66:2: ( ( ( rule__MathExp__DeclarationsAssignment )* ) )
            // InternalMathAssignmentLanguage.g:67:2: ( ( rule__MathExp__DeclarationsAssignment )* )
            {
            // InternalMathAssignmentLanguage.g:67:2: ( ( rule__MathExp__DeclarationsAssignment )* )
            // InternalMathAssignmentLanguage.g:68:3: ( rule__MathExp__DeclarationsAssignment )*
            {
             before(grammarAccess.getMathExpAccess().getDeclarationsAssignment()); 
            // InternalMathAssignmentLanguage.g:69:3: ( rule__MathExp__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:69:4: rule__MathExp__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MathExp__DeclarationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMathExpAccess().getDeclarationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMathAssignmentLanguage.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:79:1: ( ruleDeclaration EOF )
            // InternalMathAssignmentLanguage.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMathAssignmentLanguage.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalMathAssignmentLanguage.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalMathAssignmentLanguage.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalMathAssignmentLanguage.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalMathAssignmentLanguage.g:94:3: ( rule__Declaration__Alternatives )
            // InternalMathAssignmentLanguage.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleExternalDef"
    // InternalMathAssignmentLanguage.g:103:1: entryRuleExternalDef : ruleExternalDef EOF ;
    public final void entryRuleExternalDef() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:104:1: ( ruleExternalDef EOF )
            // InternalMathAssignmentLanguage.g:105:1: ruleExternalDef EOF
            {
             before(grammarAccess.getExternalDefRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalDef();

            state._fsp--;

             after(grammarAccess.getExternalDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalDef"


    // $ANTLR start "ruleExternalDef"
    // InternalMathAssignmentLanguage.g:112:1: ruleExternalDef : ( ( rule__ExternalDef__Group__0 ) ) ;
    public final void ruleExternalDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:116:2: ( ( ( rule__ExternalDef__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:117:2: ( ( rule__ExternalDef__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:117:2: ( ( rule__ExternalDef__Group__0 ) )
            // InternalMathAssignmentLanguage.g:118:3: ( rule__ExternalDef__Group__0 )
            {
             before(grammarAccess.getExternalDefAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:119:3: ( rule__ExternalDef__Group__0 )
            // InternalMathAssignmentLanguage.g:119:4: rule__ExternalDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalDef"


    // $ANTLR start "entryRuleParameter"
    // InternalMathAssignmentLanguage.g:128:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:129:1: ( ruleParameter EOF )
            // InternalMathAssignmentLanguage.g:130:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMathAssignmentLanguage.g:137:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:141:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:142:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:142:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMathAssignmentLanguage.g:143:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:144:3: ( rule__Parameter__Group__0 )
            // InternalMathAssignmentLanguage.g:144:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalMathAssignmentLanguage.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:154:1: ( ruleType EOF )
            // InternalMathAssignmentLanguage.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMathAssignmentLanguage.g:162:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:166:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:167:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:167:2: ( ( rule__Type__Group__0 ) )
            // InternalMathAssignmentLanguage.g:168:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:169:3: ( rule__Type__Group__0 )
            // InternalMathAssignmentLanguage.g:169:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleResultStatement"
    // InternalMathAssignmentLanguage.g:178:1: entryRuleResultStatement : ruleResultStatement EOF ;
    public final void entryRuleResultStatement() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:179:1: ( ruleResultStatement EOF )
            // InternalMathAssignmentLanguage.g:180:1: ruleResultStatement EOF
            {
             before(grammarAccess.getResultStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleResultStatement();

            state._fsp--;

             after(grammarAccess.getResultStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResultStatement"


    // $ANTLR start "ruleResultStatement"
    // InternalMathAssignmentLanguage.g:187:1: ruleResultStatement : ( ( rule__ResultStatement__Group__0 ) ) ;
    public final void ruleResultStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:191:2: ( ( ( rule__ResultStatement__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:192:2: ( ( rule__ResultStatement__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:192:2: ( ( rule__ResultStatement__Group__0 ) )
            // InternalMathAssignmentLanguage.g:193:3: ( rule__ResultStatement__Group__0 )
            {
             before(grammarAccess.getResultStatementAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:194:3: ( rule__ResultStatement__Group__0 )
            // InternalMathAssignmentLanguage.g:194:4: rule__ResultStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ResultStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResultStatement"


    // $ANTLR start "entryRuleExp"
    // InternalMathAssignmentLanguage.g:203:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:204:1: ( ruleExp EOF )
            // InternalMathAssignmentLanguage.g:205:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathAssignmentLanguage.g:212:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:216:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:217:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:217:2: ( ( rule__Exp__Group__0 ) )
            // InternalMathAssignmentLanguage.g:218:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:219:3: ( rule__Exp__Group__0 )
            // InternalMathAssignmentLanguage.g:219:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMathAssignmentLanguage.g:228:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:229:1: ( ruleFactor EOF )
            // InternalMathAssignmentLanguage.g:230:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMathAssignmentLanguage.g:237:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:241:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:242:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:242:2: ( ( rule__Factor__Group__0 ) )
            // InternalMathAssignmentLanguage.g:243:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:244:3: ( rule__Factor__Group__0 )
            // InternalMathAssignmentLanguage.g:244:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMathAssignmentLanguage.g:253:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:254:1: ( rulePrimary EOF )
            // InternalMathAssignmentLanguage.g:255:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathAssignmentLanguage.g:262:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:266:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMathAssignmentLanguage.g:267:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMathAssignmentLanguage.g:267:2: ( ( rule__Primary__Alternatives ) )
            // InternalMathAssignmentLanguage.g:268:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMathAssignmentLanguage.g:269:3: ( rule__Primary__Alternatives )
            // InternalMathAssignmentLanguage.g:269:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMathAssignmentLanguage.g:278:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:279:1: ( ruleVariableUse EOF )
            // InternalMathAssignmentLanguage.g:280:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMathAssignmentLanguage.g:287:1: ruleVariableUse : ( ( rule__VariableUse__Group__0 ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:291:2: ( ( ( rule__VariableUse__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:292:2: ( ( rule__VariableUse__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:292:2: ( ( rule__VariableUse__Group__0 ) )
            // InternalMathAssignmentLanguage.g:293:3: ( rule__VariableUse__Group__0 )
            {
             before(grammarAccess.getVariableUseAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:294:3: ( rule__VariableUse__Group__0 )
            // InternalMathAssignmentLanguage.g:294:4: rule__VariableUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalMathAssignmentLanguage.g:303:1: entryRuleVariableBinding : ruleVariableBinding EOF ;
    public final void entryRuleVariableBinding() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:304:1: ( ruleVariableBinding EOF )
            // InternalMathAssignmentLanguage.g:305:1: ruleVariableBinding EOF
            {
             before(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableBinding();

            state._fsp--;

             after(grammarAccess.getVariableBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalMathAssignmentLanguage.g:312:1: ruleVariableBinding : ( ( rule__VariableBinding__Group__0 ) ) ;
    public final void ruleVariableBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:316:2: ( ( ( rule__VariableBinding__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:317:2: ( ( rule__VariableBinding__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:317:2: ( ( rule__VariableBinding__Group__0 ) )
            // InternalMathAssignmentLanguage.g:318:3: ( rule__VariableBinding__Group__0 )
            {
             before(grammarAccess.getVariableBindingAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:319:3: ( rule__VariableBinding__Group__0 )
            // InternalMathAssignmentLanguage.g:319:4: rule__VariableBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleExternalUse"
    // InternalMathAssignmentLanguage.g:328:1: entryRuleExternalUse : ruleExternalUse EOF ;
    public final void entryRuleExternalUse() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:329:1: ( ruleExternalUse EOF )
            // InternalMathAssignmentLanguage.g:330:1: ruleExternalUse EOF
            {
             before(grammarAccess.getExternalUseRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalUse();

            state._fsp--;

             after(grammarAccess.getExternalUseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalUse"


    // $ANTLR start "ruleExternalUse"
    // InternalMathAssignmentLanguage.g:337:1: ruleExternalUse : ( ( rule__ExternalUse__Group__0 ) ) ;
    public final void ruleExternalUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:341:2: ( ( ( rule__ExternalUse__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:342:2: ( ( rule__ExternalUse__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:342:2: ( ( rule__ExternalUse__Group__0 ) )
            // InternalMathAssignmentLanguage.g:343:3: ( rule__ExternalUse__Group__0 )
            {
             before(grammarAccess.getExternalUseAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:344:3: ( rule__ExternalUse__Group__0 )
            // InternalMathAssignmentLanguage.g:344:4: rule__ExternalUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalUse"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathAssignmentLanguage.g:353:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:354:1: ( ruleParenthesis EOF )
            // InternalMathAssignmentLanguage.g:355:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathAssignmentLanguage.g:362:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:366:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:367:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:367:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMathAssignmentLanguage.g:368:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:369:3: ( rule__Parenthesis__Group__0 )
            // InternalMathAssignmentLanguage.g:369:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathAssignmentLanguage.g:378:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMathAssignmentLanguage.g:379:1: ( ruleNumber EOF )
            // InternalMathAssignmentLanguage.g:380:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathAssignmentLanguage.g:387:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:391:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalMathAssignmentLanguage.g:392:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalMathAssignmentLanguage.g:392:2: ( ( rule__Number__Group__0 ) )
            // InternalMathAssignmentLanguage.g:393:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalMathAssignmentLanguage.g:394:3: ( rule__Number__Group__0 )
            // InternalMathAssignmentLanguage.g:394:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalMathAssignmentLanguage.g:402:1: rule__Declaration__Alternatives : ( ( ruleType ) | ( ruleExternalDef ) | ( ruleResultStatement ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:406:1: ( ( ruleType ) | ( ruleExternalDef ) | ( ruleResultStatement ) )
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
                    // InternalMathAssignmentLanguage.g:407:2: ( ruleType )
                    {
                    // InternalMathAssignmentLanguage.g:407:2: ( ruleType )
                    // InternalMathAssignmentLanguage.g:408:3: ruleType
                    {
                     before(grammarAccess.getDeclarationAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:413:2: ( ruleExternalDef )
                    {
                    // InternalMathAssignmentLanguage.g:413:2: ( ruleExternalDef )
                    // InternalMathAssignmentLanguage.g:414:3: ruleExternalDef
                    {
                     before(grammarAccess.getDeclarationAccess().getExternalDefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalDef();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getExternalDefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMathAssignmentLanguage.g:419:2: ( ruleResultStatement )
                    {
                    // InternalMathAssignmentLanguage.g:419:2: ( ruleResultStatement )
                    // InternalMathAssignmentLanguage.g:420:3: ruleResultStatement
                    {
                     before(grammarAccess.getDeclarationAccess().getResultStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleResultStatement();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getResultStatementParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Exp__Alternatives_1_0"
    // InternalMathAssignmentLanguage.g:429:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:433:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:434:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:434:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalMathAssignmentLanguage.g:435:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalMathAssignmentLanguage.g:436:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalMathAssignmentLanguage.g:436:4: rule__Exp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:440:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:440:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalMathAssignmentLanguage.g:441:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalMathAssignmentLanguage.g:442:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalMathAssignmentLanguage.g:442:4: rule__Exp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives_1_0"
    // InternalMathAssignmentLanguage.g:450:1: rule__Factor__Alternatives_1_0 : ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) );
    public final void rule__Factor__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:454:1: ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:455:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:455:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    // InternalMathAssignmentLanguage.g:456:3: ( rule__Factor__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_0()); 
                    // InternalMathAssignmentLanguage.g:457:3: ( rule__Factor__Group_1_0_0__0 )
                    // InternalMathAssignmentLanguage.g:457:4: rule__Factor__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:461:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    {
                    // InternalMathAssignmentLanguage.g:461:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    // InternalMathAssignmentLanguage.g:462:3: ( rule__Factor__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_1()); 
                    // InternalMathAssignmentLanguage.g:463:3: ( rule__Factor__Group_1_0_1__0 )
                    // InternalMathAssignmentLanguage.g:463:4: rule__Factor__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMathAssignmentLanguage.g:471:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableBinding ) | ( ruleVariableUse ) | ( ruleExternalUse ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:475:1: ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableBinding ) | ( ruleVariableUse ) | ( ruleExternalUse ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==12) ) {
                    alt5=5;
                }
                else if ( (LA5_4==EOF||LA5_4==11||(LA5_4>=13 && LA5_4<=16)||(LA5_4>=18 && LA5_4<=21)||(LA5_4>=24 && LA5_4<=25)) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMathAssignmentLanguage.g:476:2: ( ruleNumber )
                    {
                    // InternalMathAssignmentLanguage.g:476:2: ( ruleNumber )
                    // InternalMathAssignmentLanguage.g:477:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMathAssignmentLanguage.g:482:2: ( ruleParenthesis )
                    {
                    // InternalMathAssignmentLanguage.g:482:2: ( ruleParenthesis )
                    // InternalMathAssignmentLanguage.g:483:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMathAssignmentLanguage.g:488:2: ( ruleVariableBinding )
                    {
                    // InternalMathAssignmentLanguage.g:488:2: ( ruleVariableBinding )
                    // InternalMathAssignmentLanguage.g:489:3: ruleVariableBinding
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableBinding();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMathAssignmentLanguage.g:494:2: ( ruleVariableUse )
                    {
                    // InternalMathAssignmentLanguage.g:494:2: ( ruleVariableUse )
                    // InternalMathAssignmentLanguage.g:495:3: ruleVariableUse
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMathAssignmentLanguage.g:500:2: ( ruleExternalUse )
                    {
                    // InternalMathAssignmentLanguage.g:500:2: ( ruleExternalUse )
                    // InternalMathAssignmentLanguage.g:501:3: ruleExternalUse
                    {
                     before(grammarAccess.getPrimaryAccess().getExternalUseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getExternalUseParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__ExternalDef__Group__0"
    // InternalMathAssignmentLanguage.g:510:1: rule__ExternalDef__Group__0 : rule__ExternalDef__Group__0__Impl rule__ExternalDef__Group__1 ;
    public final void rule__ExternalDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:514:1: ( rule__ExternalDef__Group__0__Impl rule__ExternalDef__Group__1 )
            // InternalMathAssignmentLanguage.g:515:2: rule__ExternalDef__Group__0__Impl rule__ExternalDef__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ExternalDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__0"


    // $ANTLR start "rule__ExternalDef__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:522:1: rule__ExternalDef__Group__0__Impl : ( 'external' ) ;
    public final void rule__ExternalDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:526:1: ( ( 'external' ) )
            // InternalMathAssignmentLanguage.g:527:1: ( 'external' )
            {
            // InternalMathAssignmentLanguage.g:527:1: ( 'external' )
            // InternalMathAssignmentLanguage.g:528:2: 'external'
            {
             before(grammarAccess.getExternalDefAccess().getExternalKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getExternalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__0__Impl"


    // $ANTLR start "rule__ExternalDef__Group__1"
    // InternalMathAssignmentLanguage.g:537:1: rule__ExternalDef__Group__1 : rule__ExternalDef__Group__1__Impl rule__ExternalDef__Group__2 ;
    public final void rule__ExternalDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:541:1: ( rule__ExternalDef__Group__1__Impl rule__ExternalDef__Group__2 )
            // InternalMathAssignmentLanguage.g:542:2: rule__ExternalDef__Group__1__Impl rule__ExternalDef__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ExternalDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__1"


    // $ANTLR start "rule__ExternalDef__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:549:1: rule__ExternalDef__Group__1__Impl : ( ( rule__ExternalDef__NameAssignment_1 ) ) ;
    public final void rule__ExternalDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:553:1: ( ( ( rule__ExternalDef__NameAssignment_1 ) ) )
            // InternalMathAssignmentLanguage.g:554:1: ( ( rule__ExternalDef__NameAssignment_1 ) )
            {
            // InternalMathAssignmentLanguage.g:554:1: ( ( rule__ExternalDef__NameAssignment_1 ) )
            // InternalMathAssignmentLanguage.g:555:2: ( rule__ExternalDef__NameAssignment_1 )
            {
             before(grammarAccess.getExternalDefAccess().getNameAssignment_1()); 
            // InternalMathAssignmentLanguage.g:556:2: ( rule__ExternalDef__NameAssignment_1 )
            // InternalMathAssignmentLanguage.g:556:3: rule__ExternalDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__1__Impl"


    // $ANTLR start "rule__ExternalDef__Group__2"
    // InternalMathAssignmentLanguage.g:564:1: rule__ExternalDef__Group__2 : rule__ExternalDef__Group__2__Impl rule__ExternalDef__Group__3 ;
    public final void rule__ExternalDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:568:1: ( rule__ExternalDef__Group__2__Impl rule__ExternalDef__Group__3 )
            // InternalMathAssignmentLanguage.g:569:2: rule__ExternalDef__Group__2__Impl rule__ExternalDef__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ExternalDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__2"


    // $ANTLR start "rule__ExternalDef__Group__2__Impl"
    // InternalMathAssignmentLanguage.g:576:1: rule__ExternalDef__Group__2__Impl : ( '(' ) ;
    public final void rule__ExternalDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:580:1: ( ( '(' ) )
            // InternalMathAssignmentLanguage.g:581:1: ( '(' )
            {
            // InternalMathAssignmentLanguage.g:581:1: ( '(' )
            // InternalMathAssignmentLanguage.g:582:2: '('
            {
             before(grammarAccess.getExternalDefAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__2__Impl"


    // $ANTLR start "rule__ExternalDef__Group__3"
    // InternalMathAssignmentLanguage.g:591:1: rule__ExternalDef__Group__3 : rule__ExternalDef__Group__3__Impl rule__ExternalDef__Group__4 ;
    public final void rule__ExternalDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:595:1: ( rule__ExternalDef__Group__3__Impl rule__ExternalDef__Group__4 )
            // InternalMathAssignmentLanguage.g:596:2: rule__ExternalDef__Group__3__Impl rule__ExternalDef__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ExternalDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__3"


    // $ANTLR start "rule__ExternalDef__Group__3__Impl"
    // InternalMathAssignmentLanguage.g:603:1: rule__ExternalDef__Group__3__Impl : ( ( rule__ExternalDef__ParametersAssignment_3 ) ) ;
    public final void rule__ExternalDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:607:1: ( ( ( rule__ExternalDef__ParametersAssignment_3 ) ) )
            // InternalMathAssignmentLanguage.g:608:1: ( ( rule__ExternalDef__ParametersAssignment_3 ) )
            {
            // InternalMathAssignmentLanguage.g:608:1: ( ( rule__ExternalDef__ParametersAssignment_3 ) )
            // InternalMathAssignmentLanguage.g:609:2: ( rule__ExternalDef__ParametersAssignment_3 )
            {
             before(grammarAccess.getExternalDefAccess().getParametersAssignment_3()); 
            // InternalMathAssignmentLanguage.g:610:2: ( rule__ExternalDef__ParametersAssignment_3 )
            // InternalMathAssignmentLanguage.g:610:3: rule__ExternalDef__ParametersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__ParametersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalDefAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__3__Impl"


    // $ANTLR start "rule__ExternalDef__Group__4"
    // InternalMathAssignmentLanguage.g:618:1: rule__ExternalDef__Group__4 : rule__ExternalDef__Group__4__Impl rule__ExternalDef__Group__5 ;
    public final void rule__ExternalDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:622:1: ( rule__ExternalDef__Group__4__Impl rule__ExternalDef__Group__5 )
            // InternalMathAssignmentLanguage.g:623:2: rule__ExternalDef__Group__4__Impl rule__ExternalDef__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ExternalDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__4"


    // $ANTLR start "rule__ExternalDef__Group__4__Impl"
    // InternalMathAssignmentLanguage.g:630:1: rule__ExternalDef__Group__4__Impl : ( ( rule__ExternalDef__Group_4__0 )* ) ;
    public final void rule__ExternalDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:634:1: ( ( ( rule__ExternalDef__Group_4__0 )* ) )
            // InternalMathAssignmentLanguage.g:635:1: ( ( rule__ExternalDef__Group_4__0 )* )
            {
            // InternalMathAssignmentLanguage.g:635:1: ( ( rule__ExternalDef__Group_4__0 )* )
            // InternalMathAssignmentLanguage.g:636:2: ( rule__ExternalDef__Group_4__0 )*
            {
             before(grammarAccess.getExternalDefAccess().getGroup_4()); 
            // InternalMathAssignmentLanguage.g:637:2: ( rule__ExternalDef__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:637:3: rule__ExternalDef__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ExternalDef__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExternalDefAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__4__Impl"


    // $ANTLR start "rule__ExternalDef__Group__5"
    // InternalMathAssignmentLanguage.g:645:1: rule__ExternalDef__Group__5 : rule__ExternalDef__Group__5__Impl ;
    public final void rule__ExternalDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:649:1: ( rule__ExternalDef__Group__5__Impl )
            // InternalMathAssignmentLanguage.g:650:2: rule__ExternalDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__5"


    // $ANTLR start "rule__ExternalDef__Group__5__Impl"
    // InternalMathAssignmentLanguage.g:656:1: rule__ExternalDef__Group__5__Impl : ( ')' ) ;
    public final void rule__ExternalDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:660:1: ( ( ')' ) )
            // InternalMathAssignmentLanguage.g:661:1: ( ')' )
            {
            // InternalMathAssignmentLanguage.g:661:1: ( ')' )
            // InternalMathAssignmentLanguage.g:662:2: ')'
            {
             before(grammarAccess.getExternalDefAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group__5__Impl"


    // $ANTLR start "rule__ExternalDef__Group_4__0"
    // InternalMathAssignmentLanguage.g:672:1: rule__ExternalDef__Group_4__0 : rule__ExternalDef__Group_4__0__Impl rule__ExternalDef__Group_4__1 ;
    public final void rule__ExternalDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:676:1: ( rule__ExternalDef__Group_4__0__Impl rule__ExternalDef__Group_4__1 )
            // InternalMathAssignmentLanguage.g:677:2: rule__ExternalDef__Group_4__0__Impl rule__ExternalDef__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__ExternalDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_4__0"


    // $ANTLR start "rule__ExternalDef__Group_4__0__Impl"
    // InternalMathAssignmentLanguage.g:684:1: rule__ExternalDef__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ExternalDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:688:1: ( ( ',' ) )
            // InternalMathAssignmentLanguage.g:689:1: ( ',' )
            {
            // InternalMathAssignmentLanguage.g:689:1: ( ',' )
            // InternalMathAssignmentLanguage.g:690:2: ','
            {
             before(grammarAccess.getExternalDefAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalDef__Group_4__1"
    // InternalMathAssignmentLanguage.g:699:1: rule__ExternalDef__Group_4__1 : rule__ExternalDef__Group_4__1__Impl ;
    public final void rule__ExternalDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:703:1: ( rule__ExternalDef__Group_4__1__Impl )
            // InternalMathAssignmentLanguage.g:704:2: rule__ExternalDef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_4__1"


    // $ANTLR start "rule__ExternalDef__Group_4__1__Impl"
    // InternalMathAssignmentLanguage.g:710:1: rule__ExternalDef__Group_4__1__Impl : ( ( rule__ExternalDef__ParametersAssignment_4_1 ) ) ;
    public final void rule__ExternalDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:714:1: ( ( ( rule__ExternalDef__ParametersAssignment_4_1 ) ) )
            // InternalMathAssignmentLanguage.g:715:1: ( ( rule__ExternalDef__ParametersAssignment_4_1 ) )
            {
            // InternalMathAssignmentLanguage.g:715:1: ( ( rule__ExternalDef__ParametersAssignment_4_1 ) )
            // InternalMathAssignmentLanguage.g:716:2: ( rule__ExternalDef__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getExternalDefAccess().getParametersAssignment_4_1()); 
            // InternalMathAssignmentLanguage.g:717:2: ( rule__ExternalDef__ParametersAssignment_4_1 )
            // InternalMathAssignmentLanguage.g:717:3: rule__ExternalDef__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDef__ParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalDefAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMathAssignmentLanguage.g:726:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:730:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMathAssignmentLanguage.g:731:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:738:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:742:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMathAssignmentLanguage.g:743:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMathAssignmentLanguage.g:743:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMathAssignmentLanguage.g:744:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalMathAssignmentLanguage.g:745:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMathAssignmentLanguage.g:745:3: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMathAssignmentLanguage.g:753:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:757:1: ( rule__Parameter__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:758:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:764:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ParameterNameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:768:1: ( ( ( rule__Parameter__ParameterNameAssignment_1 ) ) )
            // InternalMathAssignmentLanguage.g:769:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            {
            // InternalMathAssignmentLanguage.g:769:1: ( ( rule__Parameter__ParameterNameAssignment_1 ) )
            // InternalMathAssignmentLanguage.g:770:2: ( rule__Parameter__ParameterNameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 
            // InternalMathAssignmentLanguage.g:771:2: ( rule__Parameter__ParameterNameAssignment_1 )
            // InternalMathAssignmentLanguage.g:771:3: rule__Parameter__ParameterNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParameterNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameterNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalMathAssignmentLanguage.g:780:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:784:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalMathAssignmentLanguage.g:785:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:792:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:796:1: ( ( 'type' ) )
            // InternalMathAssignmentLanguage.g:797:1: ( 'type' )
            {
            // InternalMathAssignmentLanguage.g:797:1: ( 'type' )
            // InternalMathAssignmentLanguage.g:798:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalMathAssignmentLanguage.g:807:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:811:1: ( rule__Type__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:812:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:818:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:822:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalMathAssignmentLanguage.g:823:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalMathAssignmentLanguage.g:823:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalMathAssignmentLanguage.g:824:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalMathAssignmentLanguage.g:825:2: ( rule__Type__NameAssignment_1 )
            // InternalMathAssignmentLanguage.g:825:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__ResultStatement__Group__0"
    // InternalMathAssignmentLanguage.g:834:1: rule__ResultStatement__Group__0 : rule__ResultStatement__Group__0__Impl rule__ResultStatement__Group__1 ;
    public final void rule__ResultStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:838:1: ( rule__ResultStatement__Group__0__Impl rule__ResultStatement__Group__1 )
            // InternalMathAssignmentLanguage.g:839:2: rule__ResultStatement__Group__0__Impl rule__ResultStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ResultStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResultStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__Group__0"


    // $ANTLR start "rule__ResultStatement__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:846:1: rule__ResultStatement__Group__0__Impl : ( 'result' ) ;
    public final void rule__ResultStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:850:1: ( ( 'result' ) )
            // InternalMathAssignmentLanguage.g:851:1: ( 'result' )
            {
            // InternalMathAssignmentLanguage.g:851:1: ( 'result' )
            // InternalMathAssignmentLanguage.g:852:2: 'result'
            {
             before(grammarAccess.getResultStatementAccess().getResultKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResultStatementAccess().getResultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__Group__0__Impl"


    // $ANTLR start "rule__ResultStatement__Group__1"
    // InternalMathAssignmentLanguage.g:861:1: rule__ResultStatement__Group__1 : rule__ResultStatement__Group__1__Impl rule__ResultStatement__Group__2 ;
    public final void rule__ResultStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:865:1: ( rule__ResultStatement__Group__1__Impl rule__ResultStatement__Group__2 )
            // InternalMathAssignmentLanguage.g:866:2: rule__ResultStatement__Group__1__Impl rule__ResultStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ResultStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResultStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__Group__1"


    // $ANTLR start "rule__ResultStatement__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:873:1: rule__ResultStatement__Group__1__Impl : ( ( rule__ResultStatement__LabelAssignment_1 ) ) ;
    public final void rule__ResultStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:877:1: ( ( ( rule__ResultStatement__LabelAssignment_1 ) ) )
            // InternalMathAssignmentLanguage.g:878:1: ( ( rule__ResultStatement__LabelAssignment_1 ) )
            {
            // InternalMathAssignmentLanguage.g:878:1: ( ( rule__ResultStatement__LabelAssignment_1 ) )
            // InternalMathAssignmentLanguage.g:879:2: ( rule__ResultStatement__LabelAssignment_1 )
            {
             before(grammarAccess.getResultStatementAccess().getLabelAssignment_1()); 
            // InternalMathAssignmentLanguage.g:880:2: ( rule__ResultStatement__LabelAssignment_1 )
            // InternalMathAssignmentLanguage.g:880:3: rule__ResultStatement__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ResultStatement__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResultStatementAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__Group__1__Impl"


    // $ANTLR start "rule__ResultStatement__Group__2"
    // InternalMathAssignmentLanguage.g:888:1: rule__ResultStatement__Group__2 : rule__ResultStatement__Group__2__Impl rule__ResultStatement__Group__3 ;
    public final void rule__ResultStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:892:1: ( rule__ResultStatement__Group__2__Impl rule__ResultStatement__Group__3 )
            // InternalMathAssignmentLanguage.g:893:2: rule__ResultStatement__Group__2__Impl rule__ResultStatement__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ResultStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ResultStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__Group__2"


    // $ANTLR start "rule__ResultStatement__Group__2__Impl"
    // InternalMathAssignmentLanguage.g:900:1: rule__ResultStatement__Group__2__Impl : ( 'is' ) ;
    public final void rule__ResultStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:904:1: ( ( 'is' ) )
            // InternalMathAssignmentLanguage.g:905:1: ( 'is' )
            {
            // InternalMathAssignmentLanguage.g:905:1: ( 'is' )
            // InternalMathAssignmentLanguage.g:906:2: 'is'
            {
             before(grammarAccess.getResultStatementAccess().getIsKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResultStatementAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__Group__2__Impl"


    // $ANTLR start "rule__ResultStatement__Group__3"
    // InternalMathAssignmentLanguage.g:915:1: rule__ResultStatement__Group__3 : rule__ResultStatement__Group__3__Impl ;
    public final void rule__ResultStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:919:1: ( rule__ResultStatement__Group__3__Impl )
            // InternalMathAssignmentLanguage.g:920:2: rule__ResultStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ResultStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__Group__3"


    // $ANTLR start "rule__ResultStatement__Group__3__Impl"
    // InternalMathAssignmentLanguage.g:926:1: rule__ResultStatement__Group__3__Impl : ( ( rule__ResultStatement__ExpAssignment_3 ) ) ;
    public final void rule__ResultStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:930:1: ( ( ( rule__ResultStatement__ExpAssignment_3 ) ) )
            // InternalMathAssignmentLanguage.g:931:1: ( ( rule__ResultStatement__ExpAssignment_3 ) )
            {
            // InternalMathAssignmentLanguage.g:931:1: ( ( rule__ResultStatement__ExpAssignment_3 ) )
            // InternalMathAssignmentLanguage.g:932:2: ( rule__ResultStatement__ExpAssignment_3 )
            {
             before(grammarAccess.getResultStatementAccess().getExpAssignment_3()); 
            // InternalMathAssignmentLanguage.g:933:2: ( rule__ResultStatement__ExpAssignment_3 )
            // InternalMathAssignmentLanguage.g:933:3: rule__ResultStatement__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ResultStatement__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResultStatementAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__Group__3__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalMathAssignmentLanguage.g:942:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:946:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalMathAssignmentLanguage.g:947:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:954:1: rule__Exp__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:958:1: ( ( ruleFactor ) )
            // InternalMathAssignmentLanguage.g:959:1: ( ruleFactor )
            {
            // InternalMathAssignmentLanguage.g:959:1: ( ruleFactor )
            // InternalMathAssignmentLanguage.g:960:2: ruleFactor
            {
             before(grammarAccess.getExpAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalMathAssignmentLanguage.g:969:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:973:1: ( rule__Exp__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:974:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:980:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:984:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalMathAssignmentLanguage.g:985:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalMathAssignmentLanguage.g:985:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalMathAssignmentLanguage.g:986:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalMathAssignmentLanguage.g:987:2: ( rule__Exp__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:987:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalMathAssignmentLanguage.g:996:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1000:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalMathAssignmentLanguage.g:1001:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:1008:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1012:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalMathAssignmentLanguage.g:1013:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalMathAssignmentLanguage.g:1013:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalMathAssignmentLanguage.g:1014:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalMathAssignmentLanguage.g:1015:2: ( rule__Exp__Alternatives_1_0 )
            // InternalMathAssignmentLanguage.g:1015:3: rule__Exp__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalMathAssignmentLanguage.g:1023:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1027:1: ( rule__Exp__Group_1__1__Impl )
            // InternalMathAssignmentLanguage.g:1028:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:1034:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1038:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalMathAssignmentLanguage.g:1039:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalMathAssignmentLanguage.g:1039:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalMathAssignmentLanguage.g:1040:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalMathAssignmentLanguage.g:1041:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalMathAssignmentLanguage.g:1041:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__0"
    // InternalMathAssignmentLanguage.g:1050:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1054:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalMathAssignmentLanguage.g:1055:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Exp__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0"


    // $ANTLR start "rule__Exp__Group_1_0_0__0__Impl"
    // InternalMathAssignmentLanguage.g:1062:1: rule__Exp__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1066:1: ( ( '+' ) )
            // InternalMathAssignmentLanguage.g:1067:1: ( '+' )
            {
            // InternalMathAssignmentLanguage.g:1067:1: ( '+' )
            // InternalMathAssignmentLanguage.g:1068:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__1"
    // InternalMathAssignmentLanguage.g:1077:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1081:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalMathAssignmentLanguage.g:1082:2: rule__Exp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1"


    // $ANTLR start "rule__Exp__Group_1_0_0__1__Impl"
    // InternalMathAssignmentLanguage.g:1088:1: rule__Exp__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1092:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:1093:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:1093:1: ( () )
            // InternalMathAssignmentLanguage.g:1094:2: ()
            {
             before(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1()); 
            // InternalMathAssignmentLanguage.g:1095:2: ()
            // InternalMathAssignmentLanguage.g:1095:3: 
            {
            }

             after(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__0"
    // InternalMathAssignmentLanguage.g:1104:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1108:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalMathAssignmentLanguage.g:1109:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Exp__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__0"


    // $ANTLR start "rule__Exp__Group_1_0_1__0__Impl"
    // InternalMathAssignmentLanguage.g:1116:1: rule__Exp__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1120:1: ( ( '-' ) )
            // InternalMathAssignmentLanguage.g:1121:1: ( '-' )
            {
            // InternalMathAssignmentLanguage.g:1121:1: ( '-' )
            // InternalMathAssignmentLanguage.g:1122:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__1"
    // InternalMathAssignmentLanguage.g:1131:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1135:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalMathAssignmentLanguage.g:1136:2: rule__Exp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__1"


    // $ANTLR start "rule__Exp__Group_1_0_1__1__Impl"
    // InternalMathAssignmentLanguage.g:1142:1: rule__Exp__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1146:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:1147:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:1147:1: ( () )
            // InternalMathAssignmentLanguage.g:1148:2: ()
            {
             before(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1()); 
            // InternalMathAssignmentLanguage.g:1149:2: ()
            // InternalMathAssignmentLanguage.g:1149:3: 
            {
            }

             after(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalMathAssignmentLanguage.g:1158:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1162:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalMathAssignmentLanguage.g:1163:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:1170:1: rule__Factor__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1174:1: ( ( rulePrimary ) )
            // InternalMathAssignmentLanguage.g:1175:1: ( rulePrimary )
            {
            // InternalMathAssignmentLanguage.g:1175:1: ( rulePrimary )
            // InternalMathAssignmentLanguage.g:1176:2: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalMathAssignmentLanguage.g:1185:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1189:1: ( rule__Factor__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:1190:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:1196:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1200:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalMathAssignmentLanguage.g:1201:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalMathAssignmentLanguage.g:1201:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalMathAssignmentLanguage.g:1202:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalMathAssignmentLanguage.g:1203:2: ( rule__Factor__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:1203:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalMathAssignmentLanguage.g:1212:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1216:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalMathAssignmentLanguage.g:1217:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalMathAssignmentLanguage.g:1224:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__Alternatives_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1228:1: ( ( ( rule__Factor__Alternatives_1_0 ) ) )
            // InternalMathAssignmentLanguage.g:1229:1: ( ( rule__Factor__Alternatives_1_0 ) )
            {
            // InternalMathAssignmentLanguage.g:1229:1: ( ( rule__Factor__Alternatives_1_0 ) )
            // InternalMathAssignmentLanguage.g:1230:2: ( rule__Factor__Alternatives_1_0 )
            {
             before(grammarAccess.getFactorAccess().getAlternatives_1_0()); 
            // InternalMathAssignmentLanguage.g:1231:2: ( rule__Factor__Alternatives_1_0 )
            // InternalMathAssignmentLanguage.g:1231:3: rule__Factor__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalMathAssignmentLanguage.g:1239:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1243:1: ( rule__Factor__Group_1__1__Impl )
            // InternalMathAssignmentLanguage.g:1244:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalMathAssignmentLanguage.g:1250:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1254:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalMathAssignmentLanguage.g:1255:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalMathAssignmentLanguage.g:1255:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalMathAssignmentLanguage.g:1256:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalMathAssignmentLanguage.g:1257:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalMathAssignmentLanguage.g:1257:3: rule__Factor__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__0"
    // InternalMathAssignmentLanguage.g:1266:1: rule__Factor__Group_1_0_0__0 : rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 ;
    public final void rule__Factor__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1270:1: ( rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 )
            // InternalMathAssignmentLanguage.g:1271:2: rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Factor__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__0"


    // $ANTLR start "rule__Factor__Group_1_0_0__0__Impl"
    // InternalMathAssignmentLanguage.g:1278:1: rule__Factor__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Factor__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1282:1: ( ( '*' ) )
            // InternalMathAssignmentLanguage.g:1283:1: ( '*' )
            {
            // InternalMathAssignmentLanguage.g:1283:1: ( '*' )
            // InternalMathAssignmentLanguage.g:1284:2: '*'
            {
             before(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__1"
    // InternalMathAssignmentLanguage.g:1293:1: rule__Factor__Group_1_0_0__1 : rule__Factor__Group_1_0_0__1__Impl ;
    public final void rule__Factor__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1297:1: ( rule__Factor__Group_1_0_0__1__Impl )
            // InternalMathAssignmentLanguage.g:1298:2: rule__Factor__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__1"


    // $ANTLR start "rule__Factor__Group_1_0_0__1__Impl"
    // InternalMathAssignmentLanguage.g:1304:1: rule__Factor__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1308:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:1309:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:1309:1: ( () )
            // InternalMathAssignmentLanguage.g:1310:2: ()
            {
             before(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); 
            // InternalMathAssignmentLanguage.g:1311:2: ()
            // InternalMathAssignmentLanguage.g:1311:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__0"
    // InternalMathAssignmentLanguage.g:1320:1: rule__Factor__Group_1_0_1__0 : rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 ;
    public final void rule__Factor__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1324:1: ( rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 )
            // InternalMathAssignmentLanguage.g:1325:2: rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Factor__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__0"


    // $ANTLR start "rule__Factor__Group_1_0_1__0__Impl"
    // InternalMathAssignmentLanguage.g:1332:1: rule__Factor__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Factor__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1336:1: ( ( '/' ) )
            // InternalMathAssignmentLanguage.g:1337:1: ( '/' )
            {
            // InternalMathAssignmentLanguage.g:1337:1: ( '/' )
            // InternalMathAssignmentLanguage.g:1338:2: '/'
            {
             before(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__1"
    // InternalMathAssignmentLanguage.g:1347:1: rule__Factor__Group_1_0_1__1 : rule__Factor__Group_1_0_1__1__Impl ;
    public final void rule__Factor__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1351:1: ( rule__Factor__Group_1_0_1__1__Impl )
            // InternalMathAssignmentLanguage.g:1352:2: rule__Factor__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__1"


    // $ANTLR start "rule__Factor__Group_1_0_1__1__Impl"
    // InternalMathAssignmentLanguage.g:1358:1: rule__Factor__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1362:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:1363:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:1363:1: ( () )
            // InternalMathAssignmentLanguage.g:1364:2: ()
            {
             before(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); 
            // InternalMathAssignmentLanguage.g:1365:2: ()
            // InternalMathAssignmentLanguage.g:1365:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__VariableUse__Group__0"
    // InternalMathAssignmentLanguage.g:1374:1: rule__VariableUse__Group__0 : rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 ;
    public final void rule__VariableUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1378:1: ( rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 )
            // InternalMathAssignmentLanguage.g:1379:2: rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__0"


    // $ANTLR start "rule__VariableUse__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:1386:1: rule__VariableUse__Group__0__Impl : ( () ) ;
    public final void rule__VariableUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1390:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:1391:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:1391:1: ( () )
            // InternalMathAssignmentLanguage.g:1392:2: ()
            {
             before(grammarAccess.getVariableUseAccess().getVarAction_0()); 
            // InternalMathAssignmentLanguage.g:1393:2: ()
            // InternalMathAssignmentLanguage.g:1393:3: 
            {
            }

             after(grammarAccess.getVariableUseAccess().getVarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__0__Impl"


    // $ANTLR start "rule__VariableUse__Group__1"
    // InternalMathAssignmentLanguage.g:1401:1: rule__VariableUse__Group__1 : rule__VariableUse__Group__1__Impl ;
    public final void rule__VariableUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1405:1: ( rule__VariableUse__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:1406:2: rule__VariableUse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__1"


    // $ANTLR start "rule__VariableUse__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:1412:1: rule__VariableUse__Group__1__Impl : ( ( rule__VariableUse__IdAssignment_1 ) ) ;
    public final void rule__VariableUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1416:1: ( ( ( rule__VariableUse__IdAssignment_1 ) ) )
            // InternalMathAssignmentLanguage.g:1417:1: ( ( rule__VariableUse__IdAssignment_1 ) )
            {
            // InternalMathAssignmentLanguage.g:1417:1: ( ( rule__VariableUse__IdAssignment_1 ) )
            // InternalMathAssignmentLanguage.g:1418:2: ( rule__VariableUse__IdAssignment_1 )
            {
             before(grammarAccess.getVariableUseAccess().getIdAssignment_1()); 
            // InternalMathAssignmentLanguage.g:1419:2: ( rule__VariableUse__IdAssignment_1 )
            // InternalMathAssignmentLanguage.g:1419:3: rule__VariableUse__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__1__Impl"


    // $ANTLR start "rule__VariableBinding__Group__0"
    // InternalMathAssignmentLanguage.g:1428:1: rule__VariableBinding__Group__0 : rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1 ;
    public final void rule__VariableBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1432:1: ( rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1 )
            // InternalMathAssignmentLanguage.g:1433:2: rule__VariableBinding__Group__0__Impl rule__VariableBinding__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__VariableBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__0"


    // $ANTLR start "rule__VariableBinding__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:1440:1: rule__VariableBinding__Group__0__Impl : ( () ) ;
    public final void rule__VariableBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1444:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:1445:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:1445:1: ( () )
            // InternalMathAssignmentLanguage.g:1446:2: ()
            {
             before(grammarAccess.getVariableBindingAccess().getLetAction_0()); 
            // InternalMathAssignmentLanguage.g:1447:2: ()
            // InternalMathAssignmentLanguage.g:1447:3: 
            {
            }

             after(grammarAccess.getVariableBindingAccess().getLetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__0__Impl"


    // $ANTLR start "rule__VariableBinding__Group__1"
    // InternalMathAssignmentLanguage.g:1455:1: rule__VariableBinding__Group__1 : rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2 ;
    public final void rule__VariableBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1459:1: ( rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2 )
            // InternalMathAssignmentLanguage.g:1460:2: rule__VariableBinding__Group__1__Impl rule__VariableBinding__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VariableBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__1"


    // $ANTLR start "rule__VariableBinding__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:1467:1: rule__VariableBinding__Group__1__Impl : ( 'let' ) ;
    public final void rule__VariableBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1471:1: ( ( 'let' ) )
            // InternalMathAssignmentLanguage.g:1472:1: ( 'let' )
            {
            // InternalMathAssignmentLanguage.g:1472:1: ( 'let' )
            // InternalMathAssignmentLanguage.g:1473:2: 'let'
            {
             before(grammarAccess.getVariableBindingAccess().getLetKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getLetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__1__Impl"


    // $ANTLR start "rule__VariableBinding__Group__2"
    // InternalMathAssignmentLanguage.g:1482:1: rule__VariableBinding__Group__2 : rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3 ;
    public final void rule__VariableBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1486:1: ( rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3 )
            // InternalMathAssignmentLanguage.g:1487:2: rule__VariableBinding__Group__2__Impl rule__VariableBinding__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__VariableBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__2"


    // $ANTLR start "rule__VariableBinding__Group__2__Impl"
    // InternalMathAssignmentLanguage.g:1494:1: rule__VariableBinding__Group__2__Impl : ( ( rule__VariableBinding__IdAssignment_2 ) ) ;
    public final void rule__VariableBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1498:1: ( ( ( rule__VariableBinding__IdAssignment_2 ) ) )
            // InternalMathAssignmentLanguage.g:1499:1: ( ( rule__VariableBinding__IdAssignment_2 ) )
            {
            // InternalMathAssignmentLanguage.g:1499:1: ( ( rule__VariableBinding__IdAssignment_2 ) )
            // InternalMathAssignmentLanguage.g:1500:2: ( rule__VariableBinding__IdAssignment_2 )
            {
             before(grammarAccess.getVariableBindingAccess().getIdAssignment_2()); 
            // InternalMathAssignmentLanguage.g:1501:2: ( rule__VariableBinding__IdAssignment_2 )
            // InternalMathAssignmentLanguage.g:1501:3: rule__VariableBinding__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableBindingAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__2__Impl"


    // $ANTLR start "rule__VariableBinding__Group__3"
    // InternalMathAssignmentLanguage.g:1509:1: rule__VariableBinding__Group__3 : rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4 ;
    public final void rule__VariableBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1513:1: ( rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4 )
            // InternalMathAssignmentLanguage.g:1514:2: rule__VariableBinding__Group__3__Impl rule__VariableBinding__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__VariableBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__3"


    // $ANTLR start "rule__VariableBinding__Group__3__Impl"
    // InternalMathAssignmentLanguage.g:1521:1: rule__VariableBinding__Group__3__Impl : ( '=' ) ;
    public final void rule__VariableBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1525:1: ( ( '=' ) )
            // InternalMathAssignmentLanguage.g:1526:1: ( '=' )
            {
            // InternalMathAssignmentLanguage.g:1526:1: ( '=' )
            // InternalMathAssignmentLanguage.g:1527:2: '='
            {
             before(grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__3__Impl"


    // $ANTLR start "rule__VariableBinding__Group__4"
    // InternalMathAssignmentLanguage.g:1536:1: rule__VariableBinding__Group__4 : rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5 ;
    public final void rule__VariableBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1540:1: ( rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5 )
            // InternalMathAssignmentLanguage.g:1541:2: rule__VariableBinding__Group__4__Impl rule__VariableBinding__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__VariableBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__4"


    // $ANTLR start "rule__VariableBinding__Group__4__Impl"
    // InternalMathAssignmentLanguage.g:1548:1: rule__VariableBinding__Group__4__Impl : ( ( rule__VariableBinding__BindingAssignment_4 ) ) ;
    public final void rule__VariableBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1552:1: ( ( ( rule__VariableBinding__BindingAssignment_4 ) ) )
            // InternalMathAssignmentLanguage.g:1553:1: ( ( rule__VariableBinding__BindingAssignment_4 ) )
            {
            // InternalMathAssignmentLanguage.g:1553:1: ( ( rule__VariableBinding__BindingAssignment_4 ) )
            // InternalMathAssignmentLanguage.g:1554:2: ( rule__VariableBinding__BindingAssignment_4 )
            {
             before(grammarAccess.getVariableBindingAccess().getBindingAssignment_4()); 
            // InternalMathAssignmentLanguage.g:1555:2: ( rule__VariableBinding__BindingAssignment_4 )
            // InternalMathAssignmentLanguage.g:1555:3: rule__VariableBinding__BindingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__BindingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableBindingAccess().getBindingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__4__Impl"


    // $ANTLR start "rule__VariableBinding__Group__5"
    // InternalMathAssignmentLanguage.g:1563:1: rule__VariableBinding__Group__5 : rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6 ;
    public final void rule__VariableBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1567:1: ( rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6 )
            // InternalMathAssignmentLanguage.g:1568:2: rule__VariableBinding__Group__5__Impl rule__VariableBinding__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__VariableBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__5"


    // $ANTLR start "rule__VariableBinding__Group__5__Impl"
    // InternalMathAssignmentLanguage.g:1575:1: rule__VariableBinding__Group__5__Impl : ( 'in' ) ;
    public final void rule__VariableBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1579:1: ( ( 'in' ) )
            // InternalMathAssignmentLanguage.g:1580:1: ( 'in' )
            {
            // InternalMathAssignmentLanguage.g:1580:1: ( 'in' )
            // InternalMathAssignmentLanguage.g:1581:2: 'in'
            {
             before(grammarAccess.getVariableBindingAccess().getInKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__5__Impl"


    // $ANTLR start "rule__VariableBinding__Group__6"
    // InternalMathAssignmentLanguage.g:1590:1: rule__VariableBinding__Group__6 : rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7 ;
    public final void rule__VariableBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1594:1: ( rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7 )
            // InternalMathAssignmentLanguage.g:1595:2: rule__VariableBinding__Group__6__Impl rule__VariableBinding__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__VariableBinding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__6"


    // $ANTLR start "rule__VariableBinding__Group__6__Impl"
    // InternalMathAssignmentLanguage.g:1602:1: rule__VariableBinding__Group__6__Impl : ( ( rule__VariableBinding__BodyAssignment_6 ) ) ;
    public final void rule__VariableBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1606:1: ( ( ( rule__VariableBinding__BodyAssignment_6 ) ) )
            // InternalMathAssignmentLanguage.g:1607:1: ( ( rule__VariableBinding__BodyAssignment_6 ) )
            {
            // InternalMathAssignmentLanguage.g:1607:1: ( ( rule__VariableBinding__BodyAssignment_6 ) )
            // InternalMathAssignmentLanguage.g:1608:2: ( rule__VariableBinding__BodyAssignment_6 )
            {
             before(grammarAccess.getVariableBindingAccess().getBodyAssignment_6()); 
            // InternalMathAssignmentLanguage.g:1609:2: ( rule__VariableBinding__BodyAssignment_6 )
            // InternalMathAssignmentLanguage.g:1609:3: rule__VariableBinding__BodyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__BodyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVariableBindingAccess().getBodyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__6__Impl"


    // $ANTLR start "rule__VariableBinding__Group__7"
    // InternalMathAssignmentLanguage.g:1617:1: rule__VariableBinding__Group__7 : rule__VariableBinding__Group__7__Impl ;
    public final void rule__VariableBinding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1621:1: ( rule__VariableBinding__Group__7__Impl )
            // InternalMathAssignmentLanguage.g:1622:2: rule__VariableBinding__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableBinding__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__7"


    // $ANTLR start "rule__VariableBinding__Group__7__Impl"
    // InternalMathAssignmentLanguage.g:1628:1: rule__VariableBinding__Group__7__Impl : ( 'end' ) ;
    public final void rule__VariableBinding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1632:1: ( ( 'end' ) )
            // InternalMathAssignmentLanguage.g:1633:1: ( 'end' )
            {
            // InternalMathAssignmentLanguage.g:1633:1: ( 'end' )
            // InternalMathAssignmentLanguage.g:1634:2: 'end'
            {
             before(grammarAccess.getVariableBindingAccess().getEndKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getEndKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__Group__7__Impl"


    // $ANTLR start "rule__ExternalUse__Group__0"
    // InternalMathAssignmentLanguage.g:1644:1: rule__ExternalUse__Group__0 : rule__ExternalUse__Group__0__Impl rule__ExternalUse__Group__1 ;
    public final void rule__ExternalUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1648:1: ( rule__ExternalUse__Group__0__Impl rule__ExternalUse__Group__1 )
            // InternalMathAssignmentLanguage.g:1649:2: rule__ExternalUse__Group__0__Impl rule__ExternalUse__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ExternalUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__0"


    // $ANTLR start "rule__ExternalUse__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:1656:1: rule__ExternalUse__Group__0__Impl : ( () ) ;
    public final void rule__ExternalUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1660:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:1661:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:1661:1: ( () )
            // InternalMathAssignmentLanguage.g:1662:2: ()
            {
             before(grammarAccess.getExternalUseAccess().getExternalUseAction_0()); 
            // InternalMathAssignmentLanguage.g:1663:2: ()
            // InternalMathAssignmentLanguage.g:1663:3: 
            {
            }

             after(grammarAccess.getExternalUseAccess().getExternalUseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__0__Impl"


    // $ANTLR start "rule__ExternalUse__Group__1"
    // InternalMathAssignmentLanguage.g:1671:1: rule__ExternalUse__Group__1 : rule__ExternalUse__Group__1__Impl rule__ExternalUse__Group__2 ;
    public final void rule__ExternalUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1675:1: ( rule__ExternalUse__Group__1__Impl rule__ExternalUse__Group__2 )
            // InternalMathAssignmentLanguage.g:1676:2: rule__ExternalUse__Group__1__Impl rule__ExternalUse__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ExternalUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__1"


    // $ANTLR start "rule__ExternalUse__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:1683:1: rule__ExternalUse__Group__1__Impl : ( ( rule__ExternalUse__ExternalAssignment_1 ) ) ;
    public final void rule__ExternalUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1687:1: ( ( ( rule__ExternalUse__ExternalAssignment_1 ) ) )
            // InternalMathAssignmentLanguage.g:1688:1: ( ( rule__ExternalUse__ExternalAssignment_1 ) )
            {
            // InternalMathAssignmentLanguage.g:1688:1: ( ( rule__ExternalUse__ExternalAssignment_1 ) )
            // InternalMathAssignmentLanguage.g:1689:2: ( rule__ExternalUse__ExternalAssignment_1 )
            {
             before(grammarAccess.getExternalUseAccess().getExternalAssignment_1()); 
            // InternalMathAssignmentLanguage.g:1690:2: ( rule__ExternalUse__ExternalAssignment_1 )
            // InternalMathAssignmentLanguage.g:1690:3: rule__ExternalUse__ExternalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalUse__ExternalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalUseAccess().getExternalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__1__Impl"


    // $ANTLR start "rule__ExternalUse__Group__2"
    // InternalMathAssignmentLanguage.g:1698:1: rule__ExternalUse__Group__2 : rule__ExternalUse__Group__2__Impl rule__ExternalUse__Group__3 ;
    public final void rule__ExternalUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1702:1: ( rule__ExternalUse__Group__2__Impl rule__ExternalUse__Group__3 )
            // InternalMathAssignmentLanguage.g:1703:2: rule__ExternalUse__Group__2__Impl rule__ExternalUse__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ExternalUse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__2"


    // $ANTLR start "rule__ExternalUse__Group__2__Impl"
    // InternalMathAssignmentLanguage.g:1710:1: rule__ExternalUse__Group__2__Impl : ( '(' ) ;
    public final void rule__ExternalUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1714:1: ( ( '(' ) )
            // InternalMathAssignmentLanguage.g:1715:1: ( '(' )
            {
            // InternalMathAssignmentLanguage.g:1715:1: ( '(' )
            // InternalMathAssignmentLanguage.g:1716:2: '('
            {
             before(grammarAccess.getExternalUseAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExternalUseAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__2__Impl"


    // $ANTLR start "rule__ExternalUse__Group__3"
    // InternalMathAssignmentLanguage.g:1725:1: rule__ExternalUse__Group__3 : rule__ExternalUse__Group__3__Impl rule__ExternalUse__Group__4 ;
    public final void rule__ExternalUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1729:1: ( rule__ExternalUse__Group__3__Impl rule__ExternalUse__Group__4 )
            // InternalMathAssignmentLanguage.g:1730:2: rule__ExternalUse__Group__3__Impl rule__ExternalUse__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ExternalUse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__3"


    // $ANTLR start "rule__ExternalUse__Group__3__Impl"
    // InternalMathAssignmentLanguage.g:1737:1: rule__ExternalUse__Group__3__Impl : ( ( rule__ExternalUse__ArgumentsAssignment_3 ) ) ;
    public final void rule__ExternalUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1741:1: ( ( ( rule__ExternalUse__ArgumentsAssignment_3 ) ) )
            // InternalMathAssignmentLanguage.g:1742:1: ( ( rule__ExternalUse__ArgumentsAssignment_3 ) )
            {
            // InternalMathAssignmentLanguage.g:1742:1: ( ( rule__ExternalUse__ArgumentsAssignment_3 ) )
            // InternalMathAssignmentLanguage.g:1743:2: ( rule__ExternalUse__ArgumentsAssignment_3 )
            {
             before(grammarAccess.getExternalUseAccess().getArgumentsAssignment_3()); 
            // InternalMathAssignmentLanguage.g:1744:2: ( rule__ExternalUse__ArgumentsAssignment_3 )
            // InternalMathAssignmentLanguage.g:1744:3: rule__ExternalUse__ArgumentsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExternalUse__ArgumentsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalUseAccess().getArgumentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__3__Impl"


    // $ANTLR start "rule__ExternalUse__Group__4"
    // InternalMathAssignmentLanguage.g:1752:1: rule__ExternalUse__Group__4 : rule__ExternalUse__Group__4__Impl rule__ExternalUse__Group__5 ;
    public final void rule__ExternalUse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1756:1: ( rule__ExternalUse__Group__4__Impl rule__ExternalUse__Group__5 )
            // InternalMathAssignmentLanguage.g:1757:2: rule__ExternalUse__Group__4__Impl rule__ExternalUse__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ExternalUse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__4"


    // $ANTLR start "rule__ExternalUse__Group__4__Impl"
    // InternalMathAssignmentLanguage.g:1764:1: rule__ExternalUse__Group__4__Impl : ( ( rule__ExternalUse__Group_4__0 )* ) ;
    public final void rule__ExternalUse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1768:1: ( ( ( rule__ExternalUse__Group_4__0 )* ) )
            // InternalMathAssignmentLanguage.g:1769:1: ( ( rule__ExternalUse__Group_4__0 )* )
            {
            // InternalMathAssignmentLanguage.g:1769:1: ( ( rule__ExternalUse__Group_4__0 )* )
            // InternalMathAssignmentLanguage.g:1770:2: ( rule__ExternalUse__Group_4__0 )*
            {
             before(grammarAccess.getExternalUseAccess().getGroup_4()); 
            // InternalMathAssignmentLanguage.g:1771:2: ( rule__ExternalUse__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMathAssignmentLanguage.g:1771:3: rule__ExternalUse__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ExternalUse__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExternalUseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__4__Impl"


    // $ANTLR start "rule__ExternalUse__Group__5"
    // InternalMathAssignmentLanguage.g:1779:1: rule__ExternalUse__Group__5 : rule__ExternalUse__Group__5__Impl ;
    public final void rule__ExternalUse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1783:1: ( rule__ExternalUse__Group__5__Impl )
            // InternalMathAssignmentLanguage.g:1784:2: rule__ExternalUse__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__5"


    // $ANTLR start "rule__ExternalUse__Group__5__Impl"
    // InternalMathAssignmentLanguage.g:1790:1: rule__ExternalUse__Group__5__Impl : ( ')' ) ;
    public final void rule__ExternalUse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1794:1: ( ( ')' ) )
            // InternalMathAssignmentLanguage.g:1795:1: ( ')' )
            {
            // InternalMathAssignmentLanguage.g:1795:1: ( ')' )
            // InternalMathAssignmentLanguage.g:1796:2: ')'
            {
             before(grammarAccess.getExternalUseAccess().getRightParenthesisKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExternalUseAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group__5__Impl"


    // $ANTLR start "rule__ExternalUse__Group_4__0"
    // InternalMathAssignmentLanguage.g:1806:1: rule__ExternalUse__Group_4__0 : rule__ExternalUse__Group_4__0__Impl rule__ExternalUse__Group_4__1 ;
    public final void rule__ExternalUse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1810:1: ( rule__ExternalUse__Group_4__0__Impl rule__ExternalUse__Group_4__1 )
            // InternalMathAssignmentLanguage.g:1811:2: rule__ExternalUse__Group_4__0__Impl rule__ExternalUse__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__ExternalUse__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group_4__0"


    // $ANTLR start "rule__ExternalUse__Group_4__0__Impl"
    // InternalMathAssignmentLanguage.g:1818:1: rule__ExternalUse__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ExternalUse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1822:1: ( ( ',' ) )
            // InternalMathAssignmentLanguage.g:1823:1: ( ',' )
            {
            // InternalMathAssignmentLanguage.g:1823:1: ( ',' )
            // InternalMathAssignmentLanguage.g:1824:2: ','
            {
             before(grammarAccess.getExternalUseAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExternalUseAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group_4__0__Impl"


    // $ANTLR start "rule__ExternalUse__Group_4__1"
    // InternalMathAssignmentLanguage.g:1833:1: rule__ExternalUse__Group_4__1 : rule__ExternalUse__Group_4__1__Impl ;
    public final void rule__ExternalUse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1837:1: ( rule__ExternalUse__Group_4__1__Impl )
            // InternalMathAssignmentLanguage.g:1838:2: rule__ExternalUse__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalUse__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group_4__1"


    // $ANTLR start "rule__ExternalUse__Group_4__1__Impl"
    // InternalMathAssignmentLanguage.g:1844:1: rule__ExternalUse__Group_4__1__Impl : ( ( rule__ExternalUse__ArgumentsAssignment_4_1 ) ) ;
    public final void rule__ExternalUse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1848:1: ( ( ( rule__ExternalUse__ArgumentsAssignment_4_1 ) ) )
            // InternalMathAssignmentLanguage.g:1849:1: ( ( rule__ExternalUse__ArgumentsAssignment_4_1 ) )
            {
            // InternalMathAssignmentLanguage.g:1849:1: ( ( rule__ExternalUse__ArgumentsAssignment_4_1 ) )
            // InternalMathAssignmentLanguage.g:1850:2: ( rule__ExternalUse__ArgumentsAssignment_4_1 )
            {
             before(grammarAccess.getExternalUseAccess().getArgumentsAssignment_4_1()); 
            // InternalMathAssignmentLanguage.g:1851:2: ( rule__ExternalUse__ArgumentsAssignment_4_1 )
            // InternalMathAssignmentLanguage.g:1851:3: rule__ExternalUse__ArgumentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalUse__ArgumentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalUseAccess().getArgumentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__Group_4__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMathAssignmentLanguage.g:1860:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1864:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMathAssignmentLanguage.g:1865:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:1872:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1876:1: ( ( '(' ) )
            // InternalMathAssignmentLanguage.g:1877:1: ( '(' )
            {
            // InternalMathAssignmentLanguage.g:1877:1: ( '(' )
            // InternalMathAssignmentLanguage.g:1878:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMathAssignmentLanguage.g:1887:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1891:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMathAssignmentLanguage.g:1892:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:1899:1: rule__Parenthesis__Group__1__Impl : ( ruleExp ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1903:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:1904:1: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:1904:1: ( ruleExp )
            // InternalMathAssignmentLanguage.g:1905:2: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMathAssignmentLanguage.g:1914:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1918:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalMathAssignmentLanguage.g:1919:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMathAssignmentLanguage.g:1925:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1929:1: ( ( ')' ) )
            // InternalMathAssignmentLanguage.g:1930:1: ( ')' )
            {
            // InternalMathAssignmentLanguage.g:1930:1: ( ')' )
            // InternalMathAssignmentLanguage.g:1931:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalMathAssignmentLanguage.g:1941:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1945:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalMathAssignmentLanguage.g:1946:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalMathAssignmentLanguage.g:1953:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1957:1: ( ( () ) )
            // InternalMathAssignmentLanguage.g:1958:1: ( () )
            {
            // InternalMathAssignmentLanguage.g:1958:1: ( () )
            // InternalMathAssignmentLanguage.g:1959:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumAction_0()); 
            // InternalMathAssignmentLanguage.g:1960:2: ()
            // InternalMathAssignmentLanguage.g:1960:3: 
            {
            }

             after(grammarAccess.getNumberAccess().getNumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalMathAssignmentLanguage.g:1968:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1972:1: ( rule__Number__Group__1__Impl )
            // InternalMathAssignmentLanguage.g:1973:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalMathAssignmentLanguage.g:1979:1: rule__Number__Group__1__Impl : ( ( rule__Number__ValueAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1983:1: ( ( ( rule__Number__ValueAssignment_1 ) ) )
            // InternalMathAssignmentLanguage.g:1984:1: ( ( rule__Number__ValueAssignment_1 ) )
            {
            // InternalMathAssignmentLanguage.g:1984:1: ( ( rule__Number__ValueAssignment_1 ) )
            // InternalMathAssignmentLanguage.g:1985:2: ( rule__Number__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
            // InternalMathAssignmentLanguage.g:1986:2: ( rule__Number__ValueAssignment_1 )
            // InternalMathAssignmentLanguage.g:1986:3: rule__Number__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__MathExp__DeclarationsAssignment"
    // InternalMathAssignmentLanguage.g:1995:1: rule__MathExp__DeclarationsAssignment : ( ruleDeclaration ) ;
    public final void rule__MathExp__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:1999:1: ( ( ruleDeclaration ) )
            // InternalMathAssignmentLanguage.g:2000:2: ( ruleDeclaration )
            {
            // InternalMathAssignmentLanguage.g:2000:2: ( ruleDeclaration )
            // InternalMathAssignmentLanguage.g:2001:3: ruleDeclaration
            {
             before(grammarAccess.getMathExpAccess().getDeclarationsDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getDeclarationsDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__DeclarationsAssignment"


    // $ANTLR start "rule__ExternalDef__NameAssignment_1"
    // InternalMathAssignmentLanguage.g:2010:1: rule__ExternalDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2014:1: ( ( RULE_ID ) )
            // InternalMathAssignmentLanguage.g:2015:2: ( RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:2015:2: ( RULE_ID )
            // InternalMathAssignmentLanguage.g:2016:3: RULE_ID
            {
             before(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__NameAssignment_1"


    // $ANTLR start "rule__ExternalDef__ParametersAssignment_3"
    // InternalMathAssignmentLanguage.g:2025:1: rule__ExternalDef__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__ExternalDef__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2029:1: ( ( ruleParameter ) )
            // InternalMathAssignmentLanguage.g:2030:2: ( ruleParameter )
            {
            // InternalMathAssignmentLanguage.g:2030:2: ( ruleParameter )
            // InternalMathAssignmentLanguage.g:2031:3: ruleParameter
            {
             before(grammarAccess.getExternalDefAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getExternalDefAccess().getParametersParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__ParametersAssignment_3"


    // $ANTLR start "rule__ExternalDef__ParametersAssignment_4_1"
    // InternalMathAssignmentLanguage.g:2040:1: rule__ExternalDef__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__ExternalDef__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2044:1: ( ( ruleParameter ) )
            // InternalMathAssignmentLanguage.g:2045:2: ( ruleParameter )
            {
            // InternalMathAssignmentLanguage.g:2045:2: ( ruleParameter )
            // InternalMathAssignmentLanguage.g:2046:3: ruleParameter
            {
             before(grammarAccess.getExternalDefAccess().getParametersParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getExternalDefAccess().getParametersParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDef__ParametersAssignment_4_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // InternalMathAssignmentLanguage.g:2055:1: rule__Parameter__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2059:1: ( ( ( RULE_ID ) ) )
            // InternalMathAssignmentLanguage.g:2060:2: ( ( RULE_ID ) )
            {
            // InternalMathAssignmentLanguage.g:2060:2: ( ( RULE_ID ) )
            // InternalMathAssignmentLanguage.g:2061:3: ( RULE_ID )
            {
             before(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 
            // InternalMathAssignmentLanguage.g:2062:3: ( RULE_ID )
            // InternalMathAssignmentLanguage.g:2063:4: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__ParameterNameAssignment_1"
    // InternalMathAssignmentLanguage.g:2074:1: rule__Parameter__ParameterNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__ParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2078:1: ( ( RULE_ID ) )
            // InternalMathAssignmentLanguage.g:2079:2: ( RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:2079:2: ( RULE_ID )
            // InternalMathAssignmentLanguage.g:2080:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParameterNameAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalMathAssignmentLanguage.g:2089:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2093:1: ( ( RULE_ID ) )
            // InternalMathAssignmentLanguage.g:2094:2: ( RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:2094:2: ( RULE_ID )
            // InternalMathAssignmentLanguage.g:2095:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__ResultStatement__LabelAssignment_1"
    // InternalMathAssignmentLanguage.g:2104:1: rule__ResultStatement__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ResultStatement__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2108:1: ( ( RULE_STRING ) )
            // InternalMathAssignmentLanguage.g:2109:2: ( RULE_STRING )
            {
            // InternalMathAssignmentLanguage.g:2109:2: ( RULE_STRING )
            // InternalMathAssignmentLanguage.g:2110:3: RULE_STRING
            {
             before(grammarAccess.getResultStatementAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResultStatementAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__LabelAssignment_1"


    // $ANTLR start "rule__ResultStatement__ExpAssignment_3"
    // InternalMathAssignmentLanguage.g:2119:1: rule__ResultStatement__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__ResultStatement__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2123:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:2124:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:2124:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:2125:3: ruleExp
            {
             before(grammarAccess.getResultStatementAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getResultStatementAccess().getExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResultStatement__ExpAssignment_3"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalMathAssignmentLanguage.g:2134:1: rule__Exp__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2138:1: ( ( ruleFactor ) )
            // InternalMathAssignmentLanguage.g:2139:2: ( ruleFactor )
            {
            // InternalMathAssignmentLanguage.g:2139:2: ( ruleFactor )
            // InternalMathAssignmentLanguage.g:2140:3: ruleFactor
            {
             before(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_1"
    // InternalMathAssignmentLanguage.g:2149:1: rule__Factor__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2153:1: ( ( rulePrimary ) )
            // InternalMathAssignmentLanguage.g:2154:2: ( rulePrimary )
            {
            // InternalMathAssignmentLanguage.g:2154:2: ( rulePrimary )
            // InternalMathAssignmentLanguage.g:2155:3: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__RightAssignment_1_1"


    // $ANTLR start "rule__VariableUse__IdAssignment_1"
    // InternalMathAssignmentLanguage.g:2164:1: rule__VariableUse__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableUse__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2168:1: ( ( RULE_ID ) )
            // InternalMathAssignmentLanguage.g:2169:2: ( RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:2169:2: ( RULE_ID )
            // InternalMathAssignmentLanguage.g:2170:3: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__IdAssignment_1"


    // $ANTLR start "rule__VariableBinding__IdAssignment_2"
    // InternalMathAssignmentLanguage.g:2179:1: rule__VariableBinding__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableBinding__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2183:1: ( ( RULE_ID ) )
            // InternalMathAssignmentLanguage.g:2184:2: ( RULE_ID )
            {
            // InternalMathAssignmentLanguage.g:2184:2: ( RULE_ID )
            // InternalMathAssignmentLanguage.g:2185:3: RULE_ID
            {
             before(grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__IdAssignment_2"


    // $ANTLR start "rule__VariableBinding__BindingAssignment_4"
    // InternalMathAssignmentLanguage.g:2194:1: rule__VariableBinding__BindingAssignment_4 : ( ruleExp ) ;
    public final void rule__VariableBinding__BindingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2198:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:2199:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:2199:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:2200:3: ruleExp
            {
             before(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__BindingAssignment_4"


    // $ANTLR start "rule__VariableBinding__BodyAssignment_6"
    // InternalMathAssignmentLanguage.g:2209:1: rule__VariableBinding__BodyAssignment_6 : ( ruleExp ) ;
    public final void rule__VariableBinding__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2213:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:2214:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:2214:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:2215:3: ruleExp
            {
             before(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableBinding__BodyAssignment_6"


    // $ANTLR start "rule__ExternalUse__ExternalAssignment_1"
    // InternalMathAssignmentLanguage.g:2224:1: rule__ExternalUse__ExternalAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExternalUse__ExternalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2228:1: ( ( ( RULE_ID ) ) )
            // InternalMathAssignmentLanguage.g:2229:2: ( ( RULE_ID ) )
            {
            // InternalMathAssignmentLanguage.g:2229:2: ( ( RULE_ID ) )
            // InternalMathAssignmentLanguage.g:2230:3: ( RULE_ID )
            {
             before(grammarAccess.getExternalUseAccess().getExternalExternalDefCrossReference_1_0()); 
            // InternalMathAssignmentLanguage.g:2231:3: ( RULE_ID )
            // InternalMathAssignmentLanguage.g:2232:4: RULE_ID
            {
             before(grammarAccess.getExternalUseAccess().getExternalExternalDefIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalUseAccess().getExternalExternalDefIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExternalUseAccess().getExternalExternalDefCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__ExternalAssignment_1"


    // $ANTLR start "rule__ExternalUse__ArgumentsAssignment_3"
    // InternalMathAssignmentLanguage.g:2243:1: rule__ExternalUse__ArgumentsAssignment_3 : ( ruleExp ) ;
    public final void rule__ExternalUse__ArgumentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2247:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:2248:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:2248:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:2249:3: ruleExp
            {
             before(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__ArgumentsAssignment_3"


    // $ANTLR start "rule__ExternalUse__ArgumentsAssignment_4_1"
    // InternalMathAssignmentLanguage.g:2258:1: rule__ExternalUse__ArgumentsAssignment_4_1 : ( ruleExp ) ;
    public final void rule__ExternalUse__ArgumentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2262:1: ( ( ruleExp ) )
            // InternalMathAssignmentLanguage.g:2263:2: ( ruleExp )
            {
            // InternalMathAssignmentLanguage.g:2263:2: ( ruleExp )
            // InternalMathAssignmentLanguage.g:2264:3: ruleExp
            {
             before(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExternalUseAccess().getArgumentsExpParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalUse__ArgumentsAssignment_4_1"


    // $ANTLR start "rule__Number__ValueAssignment_1"
    // InternalMathAssignmentLanguage.g:2273:1: rule__Number__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMathAssignmentLanguage.g:2277:1: ( ( RULE_INT ) )
            // InternalMathAssignmentLanguage.g:2278:2: ( RULE_INT )
            {
            // InternalMathAssignmentLanguage.g:2278:2: ( RULE_INT )
            // InternalMathAssignmentLanguage.g:2279:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000401050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}