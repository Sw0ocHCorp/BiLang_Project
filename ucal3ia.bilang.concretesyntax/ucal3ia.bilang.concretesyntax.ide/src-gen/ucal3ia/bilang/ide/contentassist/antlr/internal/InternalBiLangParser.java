package ucal3ia.bilang.ide.contentassist.antlr.internal;

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
import ucal3ia.bilang.services.BiLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBiLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'+'", "'-'", "'*'", "'/'", "'mean'", "'median'", "'std'", "'= '", "'!= '", "'='", "'<'", "'>'", "'Task'", "':'", "'load'", "'[dashboard:'", "']'", "'['", "'=>'", "'null replacement->'", "','", "'processing='", "'filtering='", "'plots'", "'{'", "'}'", "'('", "'l'", "'r'", "')'", "'.'", "'bar'", "'->'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'donut'", "'pie'", "'polar'", "'scatter'", "'radar'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBiLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBiLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBiLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBiLang.g"; }


    	private BiLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(BiLangGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTask"
    // InternalBiLang.g:53:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalBiLang.g:54:1: ( ruleTask EOF )
            // InternalBiLang.g:55:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalBiLang.g:62:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:66:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalBiLang.g:67:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalBiLang.g:67:2: ( ( rule__Task__Group__0 ) )
            // InternalBiLang.g:68:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalBiLang.g:69:3: ( rule__Task__Group__0 )
            // InternalBiLang.g:69:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleFileExtractor"
    // InternalBiLang.g:78:1: entryRuleFileExtractor : ruleFileExtractor EOF ;
    public final void entryRuleFileExtractor() throws RecognitionException {
        try {
            // InternalBiLang.g:79:1: ( ruleFileExtractor EOF )
            // InternalBiLang.g:80:1: ruleFileExtractor EOF
            {
             before(grammarAccess.getFileExtractorRule()); 
            pushFollow(FOLLOW_1);
            ruleFileExtractor();

            state._fsp--;

             after(grammarAccess.getFileExtractorRule()); 
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
    // $ANTLR end "entryRuleFileExtractor"


    // $ANTLR start "ruleFileExtractor"
    // InternalBiLang.g:87:1: ruleFileExtractor : ( ( rule__FileExtractor__Group__0 ) ) ;
    public final void ruleFileExtractor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:91:2: ( ( ( rule__FileExtractor__Group__0 ) ) )
            // InternalBiLang.g:92:2: ( ( rule__FileExtractor__Group__0 ) )
            {
            // InternalBiLang.g:92:2: ( ( rule__FileExtractor__Group__0 ) )
            // InternalBiLang.g:93:3: ( rule__FileExtractor__Group__0 )
            {
             before(grammarAccess.getFileExtractorAccess().getGroup()); 
            // InternalBiLang.g:94:3: ( rule__FileExtractor__Group__0 )
            // InternalBiLang.g:94:4: rule__FileExtractor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileExtractorAccess().getGroup()); 

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
    // $ANTLR end "ruleFileExtractor"


    // $ANTLR start "entryRuleFilteringStep"
    // InternalBiLang.g:103:1: entryRuleFilteringStep : ruleFilteringStep EOF ;
    public final void entryRuleFilteringStep() throws RecognitionException {
        try {
            // InternalBiLang.g:104:1: ( ruleFilteringStep EOF )
            // InternalBiLang.g:105:1: ruleFilteringStep EOF
            {
             before(grammarAccess.getFilteringStepRule()); 
            pushFollow(FOLLOW_1);
            ruleFilteringStep();

            state._fsp--;

             after(grammarAccess.getFilteringStepRule()); 
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
    // $ANTLR end "entryRuleFilteringStep"


    // $ANTLR start "ruleFilteringStep"
    // InternalBiLang.g:112:1: ruleFilteringStep : ( ( rule__FilteringStep__Alternatives ) ) ;
    public final void ruleFilteringStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:116:2: ( ( ( rule__FilteringStep__Alternatives ) ) )
            // InternalBiLang.g:117:2: ( ( rule__FilteringStep__Alternatives ) )
            {
            // InternalBiLang.g:117:2: ( ( rule__FilteringStep__Alternatives ) )
            // InternalBiLang.g:118:3: ( rule__FilteringStep__Alternatives )
            {
             before(grammarAccess.getFilteringStepAccess().getAlternatives()); 
            // InternalBiLang.g:119:3: ( rule__FilteringStep__Alternatives )
            // InternalBiLang.g:119:4: rule__FilteringStep__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilteringStep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilteringStepAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFilteringStep"


    // $ANTLR start "entryRulePreprocessingStep"
    // InternalBiLang.g:128:1: entryRulePreprocessingStep : rulePreprocessingStep EOF ;
    public final void entryRulePreprocessingStep() throws RecognitionException {
        try {
            // InternalBiLang.g:129:1: ( rulePreprocessingStep EOF )
            // InternalBiLang.g:130:1: rulePreprocessingStep EOF
            {
             before(grammarAccess.getPreprocessingStepRule()); 
            pushFollow(FOLLOW_1);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getPreprocessingStepRule()); 
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
    // $ANTLR end "entryRulePreprocessingStep"


    // $ANTLR start "rulePreprocessingStep"
    // InternalBiLang.g:137:1: rulePreprocessingStep : ( ( rule__PreprocessingStep__Alternatives ) ) ;
    public final void rulePreprocessingStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:141:2: ( ( ( rule__PreprocessingStep__Alternatives ) ) )
            // InternalBiLang.g:142:2: ( ( rule__PreprocessingStep__Alternatives ) )
            {
            // InternalBiLang.g:142:2: ( ( rule__PreprocessingStep__Alternatives ) )
            // InternalBiLang.g:143:3: ( rule__PreprocessingStep__Alternatives )
            {
             before(grammarAccess.getPreprocessingStepAccess().getAlternatives()); 
            // InternalBiLang.g:144:3: ( rule__PreprocessingStep__Alternatives )
            // InternalBiLang.g:144:4: rule__PreprocessingStep__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PreprocessingStep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPreprocessingStepAccess().getAlternatives()); 

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
    // $ANTLR end "rulePreprocessingStep"


    // $ANTLR start "entryRulePlot"
    // InternalBiLang.g:153:1: entryRulePlot : rulePlot EOF ;
    public final void entryRulePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:154:1: ( rulePlot EOF )
            // InternalBiLang.g:155:1: rulePlot EOF
            {
             before(grammarAccess.getPlotRule()); 
            pushFollow(FOLLOW_1);
            rulePlot();

            state._fsp--;

             after(grammarAccess.getPlotRule()); 
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
    // $ANTLR end "entryRulePlot"


    // $ANTLR start "rulePlot"
    // InternalBiLang.g:162:1: rulePlot : ( ( rule__Plot__Alternatives ) ) ;
    public final void rulePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:166:2: ( ( ( rule__Plot__Alternatives ) ) )
            // InternalBiLang.g:167:2: ( ( rule__Plot__Alternatives ) )
            {
            // InternalBiLang.g:167:2: ( ( rule__Plot__Alternatives ) )
            // InternalBiLang.g:168:3: ( rule__Plot__Alternatives )
            {
             before(grammarAccess.getPlotAccess().getAlternatives()); 
            // InternalBiLang.g:169:3: ( rule__Plot__Alternatives )
            // InternalBiLang.g:169:4: rule__Plot__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Plot__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlotAccess().getAlternatives()); 

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
    // $ANTLR end "rulePlot"


    // $ANTLR start "entryRuleEString"
    // InternalBiLang.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBiLang.g:179:1: ( ruleEString EOF )
            // InternalBiLang.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBiLang.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBiLang.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBiLang.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalBiLang.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBiLang.g:194:3: ( rule__EString__Alternatives )
            // InternalBiLang.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDataFiltering"
    // InternalBiLang.g:203:1: entryRuleDataFiltering : ruleDataFiltering EOF ;
    public final void entryRuleDataFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:204:1: ( ruleDataFiltering EOF )
            // InternalBiLang.g:205:1: ruleDataFiltering EOF
            {
             before(grammarAccess.getDataFilteringRule()); 
            pushFollow(FOLLOW_1);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getDataFilteringRule()); 
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
    // $ANTLR end "entryRuleDataFiltering"


    // $ANTLR start "ruleDataFiltering"
    // InternalBiLang.g:212:1: ruleDataFiltering : ( ( rule__DataFiltering__Group__0 ) ) ;
    public final void ruleDataFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:216:2: ( ( ( rule__DataFiltering__Group__0 ) ) )
            // InternalBiLang.g:217:2: ( ( rule__DataFiltering__Group__0 ) )
            {
            // InternalBiLang.g:217:2: ( ( rule__DataFiltering__Group__0 ) )
            // InternalBiLang.g:218:3: ( rule__DataFiltering__Group__0 )
            {
             before(grammarAccess.getDataFilteringAccess().getGroup()); 
            // InternalBiLang.g:219:3: ( rule__DataFiltering__Group__0 )
            // InternalBiLang.g:219:4: rule__DataFiltering__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getGroup()); 

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
    // $ANTLR end "ruleDataFiltering"


    // $ANTLR start "entryRuleDashBoard"
    // InternalBiLang.g:228:1: entryRuleDashBoard : ruleDashBoard EOF ;
    public final void entryRuleDashBoard() throws RecognitionException {
        try {
            // InternalBiLang.g:229:1: ( ruleDashBoard EOF )
            // InternalBiLang.g:230:1: ruleDashBoard EOF
            {
             before(grammarAccess.getDashBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleDashBoard();

            state._fsp--;

             after(grammarAccess.getDashBoardRule()); 
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
    // $ANTLR end "entryRuleDashBoard"


    // $ANTLR start "ruleDashBoard"
    // InternalBiLang.g:237:1: ruleDashBoard : ( ( rule__DashBoard__Group__0 ) ) ;
    public final void ruleDashBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:241:2: ( ( ( rule__DashBoard__Group__0 ) ) )
            // InternalBiLang.g:242:2: ( ( rule__DashBoard__Group__0 ) )
            {
            // InternalBiLang.g:242:2: ( ( rule__DashBoard__Group__0 ) )
            // InternalBiLang.g:243:3: ( rule__DashBoard__Group__0 )
            {
             before(grammarAccess.getDashBoardAccess().getGroup()); 
            // InternalBiLang.g:244:3: ( rule__DashBoard__Group__0 )
            // InternalBiLang.g:244:4: rule__DashBoard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getGroup()); 

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
    // $ANTLR end "ruleDashBoard"


    // $ANTLR start "entryRuleNullReplacement"
    // InternalBiLang.g:253:1: entryRuleNullReplacement : ruleNullReplacement EOF ;
    public final void entryRuleNullReplacement() throws RecognitionException {
        try {
            // InternalBiLang.g:254:1: ( ruleNullReplacement EOF )
            // InternalBiLang.g:255:1: ruleNullReplacement EOF
            {
             before(grammarAccess.getNullReplacementRule()); 
            pushFollow(FOLLOW_1);
            ruleNullReplacement();

            state._fsp--;

             after(grammarAccess.getNullReplacementRule()); 
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
    // $ANTLR end "entryRuleNullReplacement"


    // $ANTLR start "ruleNullReplacement"
    // InternalBiLang.g:262:1: ruleNullReplacement : ( ( rule__NullReplacement__Group__0 ) ) ;
    public final void ruleNullReplacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:266:2: ( ( ( rule__NullReplacement__Group__0 ) ) )
            // InternalBiLang.g:267:2: ( ( rule__NullReplacement__Group__0 ) )
            {
            // InternalBiLang.g:267:2: ( ( rule__NullReplacement__Group__0 ) )
            // InternalBiLang.g:268:3: ( rule__NullReplacement__Group__0 )
            {
             before(grammarAccess.getNullReplacementAccess().getGroup()); 
            // InternalBiLang.g:269:3: ( rule__NullReplacement__Group__0 )
            // InternalBiLang.g:269:4: rule__NullReplacement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NullReplacement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullReplacementAccess().getGroup()); 

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
    // $ANTLR end "ruleNullReplacement"


    // $ANTLR start "entryRuleQuantitativeFiltering"
    // InternalBiLang.g:278:1: entryRuleQuantitativeFiltering : ruleQuantitativeFiltering EOF ;
    public final void entryRuleQuantitativeFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:279:1: ( ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:280:1: ruleQuantitativeFiltering EOF
            {
             before(grammarAccess.getQuantitativeFilteringRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantitativeFiltering();

            state._fsp--;

             after(grammarAccess.getQuantitativeFilteringRule()); 
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
    // $ANTLR end "entryRuleQuantitativeFiltering"


    // $ANTLR start "ruleQuantitativeFiltering"
    // InternalBiLang.g:287:1: ruleQuantitativeFiltering : ( ( rule__QuantitativeFiltering__Group__0 ) ) ;
    public final void ruleQuantitativeFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:291:2: ( ( ( rule__QuantitativeFiltering__Group__0 ) ) )
            // InternalBiLang.g:292:2: ( ( rule__QuantitativeFiltering__Group__0 ) )
            {
            // InternalBiLang.g:292:2: ( ( rule__QuantitativeFiltering__Group__0 ) )
            // InternalBiLang.g:293:3: ( rule__QuantitativeFiltering__Group__0 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getGroup()); 
            // InternalBiLang.g:294:3: ( rule__QuantitativeFiltering__Group__0 )
            // InternalBiLang.g:294:4: rule__QuantitativeFiltering__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantitativeFilteringAccess().getGroup()); 

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
    // $ANTLR end "ruleQuantitativeFiltering"


    // $ANTLR start "entryRuleQualitativeFiltering"
    // InternalBiLang.g:303:1: entryRuleQualitativeFiltering : ruleQualitativeFiltering EOF ;
    public final void entryRuleQualitativeFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:304:1: ( ruleQualitativeFiltering EOF )
            // InternalBiLang.g:305:1: ruleQualitativeFiltering EOF
            {
             before(grammarAccess.getQualitativeFilteringRule()); 
            pushFollow(FOLLOW_1);
            ruleQualitativeFiltering();

            state._fsp--;

             after(grammarAccess.getQualitativeFilteringRule()); 
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
    // $ANTLR end "entryRuleQualitativeFiltering"


    // $ANTLR start "ruleQualitativeFiltering"
    // InternalBiLang.g:312:1: ruleQualitativeFiltering : ( ( rule__QualitativeFiltering__Group__0 ) ) ;
    public final void ruleQualitativeFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:316:2: ( ( ( rule__QualitativeFiltering__Group__0 ) ) )
            // InternalBiLang.g:317:2: ( ( rule__QualitativeFiltering__Group__0 ) )
            {
            // InternalBiLang.g:317:2: ( ( rule__QualitativeFiltering__Group__0 ) )
            // InternalBiLang.g:318:3: ( rule__QualitativeFiltering__Group__0 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getGroup()); 
            // InternalBiLang.g:319:3: ( rule__QualitativeFiltering__Group__0 )
            // InternalBiLang.g:319:4: rule__QualitativeFiltering__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualitativeFilteringAccess().getGroup()); 

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
    // $ANTLR end "ruleQualitativeFiltering"


    // $ANTLR start "entryRuleMathOperation"
    // InternalBiLang.g:328:1: entryRuleMathOperation : ruleMathOperation EOF ;
    public final void entryRuleMathOperation() throws RecognitionException {
        try {
            // InternalBiLang.g:329:1: ( ruleMathOperation EOF )
            // InternalBiLang.g:330:1: ruleMathOperation EOF
            {
             before(grammarAccess.getMathOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleMathOperation();

            state._fsp--;

             after(grammarAccess.getMathOperationRule()); 
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
    // $ANTLR end "entryRuleMathOperation"


    // $ANTLR start "ruleMathOperation"
    // InternalBiLang.g:337:1: ruleMathOperation : ( ( rule__MathOperation__Group__0 ) ) ;
    public final void ruleMathOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:341:2: ( ( ( rule__MathOperation__Group__0 ) ) )
            // InternalBiLang.g:342:2: ( ( rule__MathOperation__Group__0 ) )
            {
            // InternalBiLang.g:342:2: ( ( rule__MathOperation__Group__0 ) )
            // InternalBiLang.g:343:3: ( rule__MathOperation__Group__0 )
            {
             before(grammarAccess.getMathOperationAccess().getGroup()); 
            // InternalBiLang.g:344:3: ( rule__MathOperation__Group__0 )
            // InternalBiLang.g:344:4: rule__MathOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleMathOperation"


    // $ANTLR start "entryRuleColReference"
    // InternalBiLang.g:353:1: entryRuleColReference : ruleColReference EOF ;
    public final void entryRuleColReference() throws RecognitionException {
        try {
            // InternalBiLang.g:354:1: ( ruleColReference EOF )
            // InternalBiLang.g:355:1: ruleColReference EOF
            {
             before(grammarAccess.getColReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleColReference();

            state._fsp--;

             after(grammarAccess.getColReferenceRule()); 
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
    // $ANTLR end "entryRuleColReference"


    // $ANTLR start "ruleColReference"
    // InternalBiLang.g:362:1: ruleColReference : ( ( rule__ColReference__Group__0 ) ) ;
    public final void ruleColReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:366:2: ( ( ( rule__ColReference__Group__0 ) ) )
            // InternalBiLang.g:367:2: ( ( rule__ColReference__Group__0 ) )
            {
            // InternalBiLang.g:367:2: ( ( rule__ColReference__Group__0 ) )
            // InternalBiLang.g:368:3: ( rule__ColReference__Group__0 )
            {
             before(grammarAccess.getColReferenceAccess().getGroup()); 
            // InternalBiLang.g:369:3: ( rule__ColReference__Group__0 )
            // InternalBiLang.g:369:4: rule__ColReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleColReference"


    // $ANTLR start "entryRuleStatisticalOperation"
    // InternalBiLang.g:378:1: entryRuleStatisticalOperation : ruleStatisticalOperation EOF ;
    public final void entryRuleStatisticalOperation() throws RecognitionException {
        try {
            // InternalBiLang.g:379:1: ( ruleStatisticalOperation EOF )
            // InternalBiLang.g:380:1: ruleStatisticalOperation EOF
            {
             before(grammarAccess.getStatisticalOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleStatisticalOperation();

            state._fsp--;

             after(grammarAccess.getStatisticalOperationRule()); 
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
    // $ANTLR end "entryRuleStatisticalOperation"


    // $ANTLR start "ruleStatisticalOperation"
    // InternalBiLang.g:387:1: ruleStatisticalOperation : ( ( rule__StatisticalOperation__Group__0 ) ) ;
    public final void ruleStatisticalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:391:2: ( ( ( rule__StatisticalOperation__Group__0 ) ) )
            // InternalBiLang.g:392:2: ( ( rule__StatisticalOperation__Group__0 ) )
            {
            // InternalBiLang.g:392:2: ( ( rule__StatisticalOperation__Group__0 ) )
            // InternalBiLang.g:393:3: ( rule__StatisticalOperation__Group__0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getGroup()); 
            // InternalBiLang.g:394:3: ( rule__StatisticalOperation__Group__0 )
            // InternalBiLang.g:394:4: rule__StatisticalOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StatisticalOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatisticalOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleStatisticalOperation"


    // $ANTLR start "entryRuleEFloat"
    // InternalBiLang.g:403:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalBiLang.g:404:1: ( ruleEFloat EOF )
            // InternalBiLang.g:405:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalBiLang.g:412:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:416:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalBiLang.g:417:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalBiLang.g:417:2: ( ( rule__EFloat__Group__0 ) )
            // InternalBiLang.g:418:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalBiLang.g:419:3: ( rule__EFloat__Group__0 )
            // InternalBiLang.g:419:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // InternalBiLang.g:428:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBiLang.g:429:1: ( ruleEInt EOF )
            // InternalBiLang.g:430:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBiLang.g:437:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:441:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBiLang.g:442:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBiLang.g:442:2: ( ( rule__EInt__Group__0 ) )
            // InternalBiLang.g:443:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBiLang.g:444:3: ( rule__EInt__Group__0 )
            // InternalBiLang.g:444:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleBarPlot"
    // InternalBiLang.g:453:1: entryRuleBarPlot : ruleBarPlot EOF ;
    public final void entryRuleBarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:454:1: ( ruleBarPlot EOF )
            // InternalBiLang.g:455:1: ruleBarPlot EOF
            {
             before(grammarAccess.getBarPlotRule()); 
            pushFollow(FOLLOW_1);
            ruleBarPlot();

            state._fsp--;

             after(grammarAccess.getBarPlotRule()); 
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
    // $ANTLR end "entryRuleBarPlot"


    // $ANTLR start "ruleBarPlot"
    // InternalBiLang.g:462:1: ruleBarPlot : ( ( rule__BarPlot__Group__0 ) ) ;
    public final void ruleBarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:466:2: ( ( ( rule__BarPlot__Group__0 ) ) )
            // InternalBiLang.g:467:2: ( ( rule__BarPlot__Group__0 ) )
            {
            // InternalBiLang.g:467:2: ( ( rule__BarPlot__Group__0 ) )
            // InternalBiLang.g:468:3: ( rule__BarPlot__Group__0 )
            {
             before(grammarAccess.getBarPlotAccess().getGroup()); 
            // InternalBiLang.g:469:3: ( rule__BarPlot__Group__0 )
            // InternalBiLang.g:469:4: rule__BarPlot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBarPlotAccess().getGroup()); 

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
    // $ANTLR end "ruleBarPlot"


    // $ANTLR start "entryRuleLinePlot"
    // InternalBiLang.g:478:1: entryRuleLinePlot : ruleLinePlot EOF ;
    public final void entryRuleLinePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:479:1: ( ruleLinePlot EOF )
            // InternalBiLang.g:480:1: ruleLinePlot EOF
            {
             before(grammarAccess.getLinePlotRule()); 
            pushFollow(FOLLOW_1);
            ruleLinePlot();

            state._fsp--;

             after(grammarAccess.getLinePlotRule()); 
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
    // $ANTLR end "entryRuleLinePlot"


    // $ANTLR start "ruleLinePlot"
    // InternalBiLang.g:487:1: ruleLinePlot : ( ( rule__LinePlot__Group__0 ) ) ;
    public final void ruleLinePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:491:2: ( ( ( rule__LinePlot__Group__0 ) ) )
            // InternalBiLang.g:492:2: ( ( rule__LinePlot__Group__0 ) )
            {
            // InternalBiLang.g:492:2: ( ( rule__LinePlot__Group__0 ) )
            // InternalBiLang.g:493:3: ( rule__LinePlot__Group__0 )
            {
             before(grammarAccess.getLinePlotAccess().getGroup()); 
            // InternalBiLang.g:494:3: ( rule__LinePlot__Group__0 )
            // InternalBiLang.g:494:4: rule__LinePlot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinePlotAccess().getGroup()); 

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
    // $ANTLR end "ruleLinePlot"


    // $ANTLR start "entryRuleDonutPlot"
    // InternalBiLang.g:503:1: entryRuleDonutPlot : ruleDonutPlot EOF ;
    public final void entryRuleDonutPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:504:1: ( ruleDonutPlot EOF )
            // InternalBiLang.g:505:1: ruleDonutPlot EOF
            {
             before(grammarAccess.getDonutPlotRule()); 
            pushFollow(FOLLOW_1);
            ruleDonutPlot();

            state._fsp--;

             after(grammarAccess.getDonutPlotRule()); 
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
    // $ANTLR end "entryRuleDonutPlot"


    // $ANTLR start "ruleDonutPlot"
    // InternalBiLang.g:512:1: ruleDonutPlot : ( ( rule__DonutPlot__Group__0 ) ) ;
    public final void ruleDonutPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:516:2: ( ( ( rule__DonutPlot__Group__0 ) ) )
            // InternalBiLang.g:517:2: ( ( rule__DonutPlot__Group__0 ) )
            {
            // InternalBiLang.g:517:2: ( ( rule__DonutPlot__Group__0 ) )
            // InternalBiLang.g:518:3: ( rule__DonutPlot__Group__0 )
            {
             before(grammarAccess.getDonutPlotAccess().getGroup()); 
            // InternalBiLang.g:519:3: ( rule__DonutPlot__Group__0 )
            // InternalBiLang.g:519:4: rule__DonutPlot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getGroup()); 

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
    // $ANTLR end "ruleDonutPlot"


    // $ANTLR start "entryRulePiePlot"
    // InternalBiLang.g:528:1: entryRulePiePlot : rulePiePlot EOF ;
    public final void entryRulePiePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:529:1: ( rulePiePlot EOF )
            // InternalBiLang.g:530:1: rulePiePlot EOF
            {
             before(grammarAccess.getPiePlotRule()); 
            pushFollow(FOLLOW_1);
            rulePiePlot();

            state._fsp--;

             after(grammarAccess.getPiePlotRule()); 
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
    // $ANTLR end "entryRulePiePlot"


    // $ANTLR start "rulePiePlot"
    // InternalBiLang.g:537:1: rulePiePlot : ( ( rule__PiePlot__Group__0 ) ) ;
    public final void rulePiePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:541:2: ( ( ( rule__PiePlot__Group__0 ) ) )
            // InternalBiLang.g:542:2: ( ( rule__PiePlot__Group__0 ) )
            {
            // InternalBiLang.g:542:2: ( ( rule__PiePlot__Group__0 ) )
            // InternalBiLang.g:543:3: ( rule__PiePlot__Group__0 )
            {
             before(grammarAccess.getPiePlotAccess().getGroup()); 
            // InternalBiLang.g:544:3: ( rule__PiePlot__Group__0 )
            // InternalBiLang.g:544:4: rule__PiePlot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getGroup()); 

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
    // $ANTLR end "rulePiePlot"


    // $ANTLR start "entryRulePolarPlot"
    // InternalBiLang.g:553:1: entryRulePolarPlot : rulePolarPlot EOF ;
    public final void entryRulePolarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:554:1: ( rulePolarPlot EOF )
            // InternalBiLang.g:555:1: rulePolarPlot EOF
            {
             before(grammarAccess.getPolarPlotRule()); 
            pushFollow(FOLLOW_1);
            rulePolarPlot();

            state._fsp--;

             after(grammarAccess.getPolarPlotRule()); 
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
    // $ANTLR end "entryRulePolarPlot"


    // $ANTLR start "rulePolarPlot"
    // InternalBiLang.g:562:1: rulePolarPlot : ( ( rule__PolarPlot__Group__0 ) ) ;
    public final void rulePolarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:566:2: ( ( ( rule__PolarPlot__Group__0 ) ) )
            // InternalBiLang.g:567:2: ( ( rule__PolarPlot__Group__0 ) )
            {
            // InternalBiLang.g:567:2: ( ( rule__PolarPlot__Group__0 ) )
            // InternalBiLang.g:568:3: ( rule__PolarPlot__Group__0 )
            {
             before(grammarAccess.getPolarPlotAccess().getGroup()); 
            // InternalBiLang.g:569:3: ( rule__PolarPlot__Group__0 )
            // InternalBiLang.g:569:4: rule__PolarPlot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolarPlotAccess().getGroup()); 

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
    // $ANTLR end "rulePolarPlot"


    // $ANTLR start "entryRuleScatterPlot"
    // InternalBiLang.g:578:1: entryRuleScatterPlot : ruleScatterPlot EOF ;
    public final void entryRuleScatterPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:579:1: ( ruleScatterPlot EOF )
            // InternalBiLang.g:580:1: ruleScatterPlot EOF
            {
             before(grammarAccess.getScatterPlotRule()); 
            pushFollow(FOLLOW_1);
            ruleScatterPlot();

            state._fsp--;

             after(grammarAccess.getScatterPlotRule()); 
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
    // $ANTLR end "entryRuleScatterPlot"


    // $ANTLR start "ruleScatterPlot"
    // InternalBiLang.g:587:1: ruleScatterPlot : ( ( rule__ScatterPlot__Group__0 ) ) ;
    public final void ruleScatterPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:591:2: ( ( ( rule__ScatterPlot__Group__0 ) ) )
            // InternalBiLang.g:592:2: ( ( rule__ScatterPlot__Group__0 ) )
            {
            // InternalBiLang.g:592:2: ( ( rule__ScatterPlot__Group__0 ) )
            // InternalBiLang.g:593:3: ( rule__ScatterPlot__Group__0 )
            {
             before(grammarAccess.getScatterPlotAccess().getGroup()); 
            // InternalBiLang.g:594:3: ( rule__ScatterPlot__Group__0 )
            // InternalBiLang.g:594:4: rule__ScatterPlot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScatterPlotAccess().getGroup()); 

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
    // $ANTLR end "ruleScatterPlot"


    // $ANTLR start "entryRuleRadarPlot"
    // InternalBiLang.g:603:1: entryRuleRadarPlot : ruleRadarPlot EOF ;
    public final void entryRuleRadarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:604:1: ( ruleRadarPlot EOF )
            // InternalBiLang.g:605:1: ruleRadarPlot EOF
            {
             before(grammarAccess.getRadarPlotRule()); 
            pushFollow(FOLLOW_1);
            ruleRadarPlot();

            state._fsp--;

             after(grammarAccess.getRadarPlotRule()); 
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
    // $ANTLR end "entryRuleRadarPlot"


    // $ANTLR start "ruleRadarPlot"
    // InternalBiLang.g:612:1: ruleRadarPlot : ( ( rule__RadarPlot__Group__0 ) ) ;
    public final void ruleRadarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:616:2: ( ( ( rule__RadarPlot__Group__0 ) ) )
            // InternalBiLang.g:617:2: ( ( rule__RadarPlot__Group__0 ) )
            {
            // InternalBiLang.g:617:2: ( ( rule__RadarPlot__Group__0 ) )
            // InternalBiLang.g:618:3: ( rule__RadarPlot__Group__0 )
            {
             before(grammarAccess.getRadarPlotAccess().getGroup()); 
            // InternalBiLang.g:619:3: ( rule__RadarPlot__Group__0 )
            // InternalBiLang.g:619:4: rule__RadarPlot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadarPlotAccess().getGroup()); 

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
    // $ANTLR end "ruleRadarPlot"


    // $ANTLR start "ruleMathOperator"
    // InternalBiLang.g:628:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:632:1: ( ( ( rule__MathOperator__Alternatives ) ) )
            // InternalBiLang.g:633:2: ( ( rule__MathOperator__Alternatives ) )
            {
            // InternalBiLang.g:633:2: ( ( rule__MathOperator__Alternatives ) )
            // InternalBiLang.g:634:3: ( rule__MathOperator__Alternatives )
            {
             before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:635:3: ( rule__MathOperator__Alternatives )
            // InternalBiLang.g:635:4: rule__MathOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MathOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "ruleStatisticalOperator"
    // InternalBiLang.g:644:1: ruleStatisticalOperator : ( ( rule__StatisticalOperator__Alternatives ) ) ;
    public final void ruleStatisticalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:648:1: ( ( ( rule__StatisticalOperator__Alternatives ) ) )
            // InternalBiLang.g:649:2: ( ( rule__StatisticalOperator__Alternatives ) )
            {
            // InternalBiLang.g:649:2: ( ( rule__StatisticalOperator__Alternatives ) )
            // InternalBiLang.g:650:3: ( rule__StatisticalOperator__Alternatives )
            {
             before(grammarAccess.getStatisticalOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:651:3: ( rule__StatisticalOperator__Alternatives )
            // InternalBiLang.g:651:4: rule__StatisticalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StatisticalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatisticalOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatisticalOperator"


    // $ANTLR start "ruleQualitativeOperator"
    // InternalBiLang.g:660:1: ruleQualitativeOperator : ( ( rule__QualitativeOperator__Alternatives ) ) ;
    public final void ruleQualitativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:664:1: ( ( ( rule__QualitativeOperator__Alternatives ) ) )
            // InternalBiLang.g:665:2: ( ( rule__QualitativeOperator__Alternatives ) )
            {
            // InternalBiLang.g:665:2: ( ( rule__QualitativeOperator__Alternatives ) )
            // InternalBiLang.g:666:3: ( rule__QualitativeOperator__Alternatives )
            {
             before(grammarAccess.getQualitativeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:667:3: ( rule__QualitativeOperator__Alternatives )
            // InternalBiLang.g:667:4: rule__QualitativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQualitativeOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQualitativeOperator"


    // $ANTLR start "ruleQuantitativeOperator"
    // InternalBiLang.g:676:1: ruleQuantitativeOperator : ( ( rule__QuantitativeOperator__Alternatives ) ) ;
    public final void ruleQuantitativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:680:1: ( ( ( rule__QuantitativeOperator__Alternatives ) ) )
            // InternalBiLang.g:681:2: ( ( rule__QuantitativeOperator__Alternatives ) )
            {
            // InternalBiLang.g:681:2: ( ( rule__QuantitativeOperator__Alternatives ) )
            // InternalBiLang.g:682:3: ( rule__QuantitativeOperator__Alternatives )
            {
             before(grammarAccess.getQuantitativeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:683:3: ( rule__QuantitativeOperator__Alternatives )
            // InternalBiLang.g:683:4: rule__QuantitativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantitativeOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuantitativeOperator"


    // $ANTLR start "rule__FilteringStep__Alternatives"
    // InternalBiLang.g:691:1: rule__FilteringStep__Alternatives : ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) );
    public final void rule__FilteringStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:695:1: ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=22 && LA1_1<=24)) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=20 && LA1_1<=21)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_ID) ) {
                int LA1_2 = input.LA(2);

                if ( ((LA1_2>=20 && LA1_2<=21)) ) {
                    alt1=2;
                }
                else if ( ((LA1_2>=22 && LA1_2<=24)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBiLang.g:696:2: ( ruleQuantitativeFiltering )
                    {
                    // InternalBiLang.g:696:2: ( ruleQuantitativeFiltering )
                    // InternalBiLang.g:697:3: ruleQuantitativeFiltering
                    {
                     before(grammarAccess.getFilteringStepAccess().getQuantitativeFilteringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuantitativeFiltering();

                    state._fsp--;

                     after(grammarAccess.getFilteringStepAccess().getQuantitativeFilteringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:702:2: ( ruleQualitativeFiltering )
                    {
                    // InternalBiLang.g:702:2: ( ruleQualitativeFiltering )
                    // InternalBiLang.g:703:3: ruleQualitativeFiltering
                    {
                     before(grammarAccess.getFilteringStepAccess().getQualitativeFilteringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQualitativeFiltering();

                    state._fsp--;

                     after(grammarAccess.getFilteringStepAccess().getQualitativeFilteringParserRuleCall_1()); 

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
    // $ANTLR end "rule__FilteringStep__Alternatives"


    // $ANTLR start "rule__PreprocessingStep__Alternatives"
    // InternalBiLang.g:712:1: rule__PreprocessingStep__Alternatives : ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) );
    public final void rule__PreprocessingStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:716:1: ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
                {
                alt2=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 17:
            case 18:
            case 19:
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
                    // InternalBiLang.g:717:2: ( ruleMathOperation )
                    {
                    // InternalBiLang.g:717:2: ( ruleMathOperation )
                    // InternalBiLang.g:718:3: ruleMathOperation
                    {
                     before(grammarAccess.getPreprocessingStepAccess().getMathOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMathOperation();

                    state._fsp--;

                     after(grammarAccess.getPreprocessingStepAccess().getMathOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:723:2: ( ruleColReference )
                    {
                    // InternalBiLang.g:723:2: ( ruleColReference )
                    // InternalBiLang.g:724:3: ruleColReference
                    {
                     before(grammarAccess.getPreprocessingStepAccess().getColReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColReference();

                    state._fsp--;

                     after(grammarAccess.getPreprocessingStepAccess().getColReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:729:2: ( ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:729:2: ( ruleStatisticalOperation )
                    // InternalBiLang.g:730:3: ruleStatisticalOperation
                    {
                     before(grammarAccess.getPreprocessingStepAccess().getStatisticalOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStatisticalOperation();

                    state._fsp--;

                     after(grammarAccess.getPreprocessingStepAccess().getStatisticalOperationParserRuleCall_2()); 

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
    // $ANTLR end "rule__PreprocessingStep__Alternatives"


    // $ANTLR start "rule__Plot__Alternatives"
    // InternalBiLang.g:739:1: rule__Plot__Alternatives : ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) );
    public final void rule__Plot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:743:1: ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt3=1;
                }
                break;
            case 51:
                {
                alt3=2;
                }
                break;
            case 52:
                {
                alt3=3;
                }
                break;
            case 55:
                {
                alt3=4;
                }
                break;
            case 54:
                {
                alt3=5;
                }
                break;
            case 56:
                {
                alt3=6;
                }
                break;
            case 53:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBiLang.g:744:2: ( ruleBarPlot )
                    {
                    // InternalBiLang.g:744:2: ( ruleBarPlot )
                    // InternalBiLang.g:745:3: ruleBarPlot
                    {
                     before(grammarAccess.getPlotAccess().getBarPlotParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBarPlot();

                    state._fsp--;

                     after(grammarAccess.getPlotAccess().getBarPlotParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:750:2: ( ruleLinePlot )
                    {
                    // InternalBiLang.g:750:2: ( ruleLinePlot )
                    // InternalBiLang.g:751:3: ruleLinePlot
                    {
                     before(grammarAccess.getPlotAccess().getLinePlotParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLinePlot();

                    state._fsp--;

                     after(grammarAccess.getPlotAccess().getLinePlotParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:756:2: ( ruleDonutPlot )
                    {
                    // InternalBiLang.g:756:2: ( ruleDonutPlot )
                    // InternalBiLang.g:757:3: ruleDonutPlot
                    {
                     before(grammarAccess.getPlotAccess().getDonutPlotParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDonutPlot();

                    state._fsp--;

                     after(grammarAccess.getPlotAccess().getDonutPlotParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:762:2: ( ruleScatterPlot )
                    {
                    // InternalBiLang.g:762:2: ( ruleScatterPlot )
                    // InternalBiLang.g:763:3: ruleScatterPlot
                    {
                     before(grammarAccess.getPlotAccess().getScatterPlotParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleScatterPlot();

                    state._fsp--;

                     after(grammarAccess.getPlotAccess().getScatterPlotParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBiLang.g:768:2: ( rulePolarPlot )
                    {
                    // InternalBiLang.g:768:2: ( rulePolarPlot )
                    // InternalBiLang.g:769:3: rulePolarPlot
                    {
                     before(grammarAccess.getPlotAccess().getPolarPlotParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePolarPlot();

                    state._fsp--;

                     after(grammarAccess.getPlotAccess().getPolarPlotParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBiLang.g:774:2: ( ruleRadarPlot )
                    {
                    // InternalBiLang.g:774:2: ( ruleRadarPlot )
                    // InternalBiLang.g:775:3: ruleRadarPlot
                    {
                     before(grammarAccess.getPlotAccess().getRadarPlotParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRadarPlot();

                    state._fsp--;

                     after(grammarAccess.getPlotAccess().getRadarPlotParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBiLang.g:780:2: ( rulePiePlot )
                    {
                    // InternalBiLang.g:780:2: ( rulePiePlot )
                    // InternalBiLang.g:781:3: rulePiePlot
                    {
                     before(grammarAccess.getPlotAccess().getPiePlotParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    rulePiePlot();

                    state._fsp--;

                     after(grammarAccess.getPlotAccess().getPiePlotParserRuleCall_6()); 

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
    // $ANTLR end "rule__Plot__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBiLang.g:790:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:794:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBiLang.g:795:2: ( RULE_STRING )
                    {
                    // InternalBiLang.g:795:2: ( RULE_STRING )
                    // InternalBiLang.g:796:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:801:2: ( RULE_ID )
                    {
                    // InternalBiLang.g:801:2: ( RULE_ID )
                    // InternalBiLang.g:802:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__NullReplacement__Alternatives_2"
    // InternalBiLang.g:811:1: rule__NullReplacement__Alternatives_2 : ( ( ( rule__NullReplacement__LabelAssignment_2_0 ) ) | ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) ) );
    public final void rule__NullReplacement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:815:1: ( ( ( rule__NullReplacement__LabelAssignment_2_0 ) ) | ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=17 && LA5_0<=19)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBiLang.g:816:2: ( ( rule__NullReplacement__LabelAssignment_2_0 ) )
                    {
                    // InternalBiLang.g:816:2: ( ( rule__NullReplacement__LabelAssignment_2_0 ) )
                    // InternalBiLang.g:817:3: ( rule__NullReplacement__LabelAssignment_2_0 )
                    {
                     before(grammarAccess.getNullReplacementAccess().getLabelAssignment_2_0()); 
                    // InternalBiLang.g:818:3: ( rule__NullReplacement__LabelAssignment_2_0 )
                    // InternalBiLang.g:818:4: rule__NullReplacement__LabelAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NullReplacement__LabelAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNullReplacementAccess().getLabelAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:822:2: ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) )
                    {
                    // InternalBiLang.g:822:2: ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) )
                    // InternalBiLang.g:823:3: ( rule__NullReplacement__StatisticaloperationAssignment_2_1 )
                    {
                     before(grammarAccess.getNullReplacementAccess().getStatisticaloperationAssignment_2_1()); 
                    // InternalBiLang.g:824:3: ( rule__NullReplacement__StatisticaloperationAssignment_2_1 )
                    // InternalBiLang.g:824:4: rule__NullReplacement__StatisticaloperationAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NullReplacement__StatisticaloperationAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNullReplacementAccess().getStatisticaloperationAssignment_2_1()); 

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
    // $ANTLR end "rule__NullReplacement__Alternatives_2"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalBiLang.g:832:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:836:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBiLang.g:837:2: ( 'E' )
                    {
                    // InternalBiLang.g:837:2: ( 'E' )
                    // InternalBiLang.g:838:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:843:2: ( 'e' )
                    {
                    // InternalBiLang.g:843:2: ( 'e' )
                    // InternalBiLang.g:844:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__MathOperator__Alternatives"
    // InternalBiLang.g:853:1: rule__MathOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:857:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBiLang.g:858:2: ( ( '+' ) )
                    {
                    // InternalBiLang.g:858:2: ( ( '+' ) )
                    // InternalBiLang.g:859:3: ( '+' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:860:3: ( '+' )
                    // InternalBiLang.g:860:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:864:2: ( ( '-' ) )
                    {
                    // InternalBiLang.g:864:2: ( ( '-' ) )
                    // InternalBiLang.g:865:3: ( '-' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:866:3: ( '-' )
                    // InternalBiLang.g:866:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:870:2: ( ( '*' ) )
                    {
                    // InternalBiLang.g:870:2: ( ( '*' ) )
                    // InternalBiLang.g:871:3: ( '*' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:872:3: ( '*' )
                    // InternalBiLang.g:872:4: '*'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:876:2: ( ( '/' ) )
                    {
                    // InternalBiLang.g:876:2: ( ( '/' ) )
                    // InternalBiLang.g:877:3: ( '/' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3()); 
                    // InternalBiLang.g:878:3: ( '/' )
                    // InternalBiLang.g:878:4: '/'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__MathOperator__Alternatives"


    // $ANTLR start "rule__StatisticalOperator__Alternatives"
    // InternalBiLang.g:886:1: rule__StatisticalOperator__Alternatives : ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) );
    public final void rule__StatisticalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:890:1: ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBiLang.g:891:2: ( ( 'mean' ) )
                    {
                    // InternalBiLang.g:891:2: ( ( 'mean' ) )
                    // InternalBiLang.g:892:3: ( 'mean' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:893:3: ( 'mean' )
                    // InternalBiLang.g:893:4: 'mean'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:897:2: ( ( 'median' ) )
                    {
                    // InternalBiLang.g:897:2: ( ( 'median' ) )
                    // InternalBiLang.g:898:3: ( 'median' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:899:3: ( 'median' )
                    // InternalBiLang.g:899:4: 'median'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:903:2: ( ( 'std' ) )
                    {
                    // InternalBiLang.g:903:2: ( ( 'std' ) )
                    // InternalBiLang.g:904:3: ( 'std' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:905:3: ( 'std' )
                    // InternalBiLang.g:905:4: 'std'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__StatisticalOperator__Alternatives"


    // $ANTLR start "rule__QualitativeOperator__Alternatives"
    // InternalBiLang.g:913:1: rule__QualitativeOperator__Alternatives : ( ( ( '= ' ) ) | ( ( '!= ' ) ) );
    public final void rule__QualitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:917:1: ( ( ( '= ' ) ) | ( ( '!= ' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBiLang.g:918:2: ( ( '= ' ) )
                    {
                    // InternalBiLang.g:918:2: ( ( '= ' ) )
                    // InternalBiLang.g:919:3: ( '= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:920:3: ( '= ' )
                    // InternalBiLang.g:920:4: '= '
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:924:2: ( ( '!= ' ) )
                    {
                    // InternalBiLang.g:924:2: ( ( '!= ' ) )
                    // InternalBiLang.g:925:3: ( '!= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:926:3: ( '!= ' )
                    // InternalBiLang.g:926:4: '!= '
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualitativeOperatorAccess().getNOTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__QualitativeOperator__Alternatives"


    // $ANTLR start "rule__QuantitativeOperator__Alternatives"
    // InternalBiLang.g:934:1: rule__QuantitativeOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__QuantitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:938:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBiLang.g:939:2: ( ( '=' ) )
                    {
                    // InternalBiLang.g:939:2: ( ( '=' ) )
                    // InternalBiLang.g:940:3: ( '=' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:941:3: ( '=' )
                    // InternalBiLang.g:941:4: '='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:945:2: ( ( '<' ) )
                    {
                    // InternalBiLang.g:945:2: ( ( '<' ) )
                    // InternalBiLang.g:946:3: ( '<' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:947:3: ( '<' )
                    // InternalBiLang.g:947:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:951:2: ( ( '>' ) )
                    {
                    // InternalBiLang.g:951:2: ( ( '>' ) )
                    // InternalBiLang.g:952:3: ( '>' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:953:3: ( '>' )
                    // InternalBiLang.g:953:4: '>'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__QuantitativeOperator__Alternatives"


    // $ANTLR start "rule__Task__Group__0"
    // InternalBiLang.g:961:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:965:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBiLang.g:966:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalBiLang.g:973:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:977:1: ( ( 'Task' ) )
            // InternalBiLang.g:978:1: ( 'Task' )
            {
            // InternalBiLang.g:978:1: ( 'Task' )
            // InternalBiLang.g:979:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalBiLang.g:988:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:992:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBiLang.g:993:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalBiLang.g:1000:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1004:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBiLang.g:1005:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1005:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBiLang.g:1006:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1007:2: ( rule__Task__NameAssignment_1 )
            // InternalBiLang.g:1007:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalBiLang.g:1015:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1019:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalBiLang.g:1020:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalBiLang.g:1027:1: rule__Task__Group__2__Impl : ( ':' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1031:1: ( ( ':' ) )
            // InternalBiLang.g:1032:1: ( ':' )
            {
            // InternalBiLang.g:1032:1: ( ':' )
            // InternalBiLang.g:1033:2: ':'
            {
             before(grammarAccess.getTaskAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalBiLang.g:1042:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1046:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalBiLang.g:1047:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

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
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalBiLang.g:1054:1: rule__Task__Group__3__Impl : ( 'load' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1058:1: ( ( 'load' ) )
            // InternalBiLang.g:1059:1: ( 'load' )
            {
            // InternalBiLang.g:1059:1: ( 'load' )
            // InternalBiLang.g:1060:2: 'load'
            {
             before(grammarAccess.getTaskAccess().getLoadKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLoadKeyword_3()); 

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
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalBiLang.g:1069:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1073:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalBiLang.g:1074:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

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
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalBiLang.g:1081:1: rule__Task__Group__4__Impl : ( ( rule__Task__FileextractorAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1085:1: ( ( ( rule__Task__FileextractorAssignment_4 ) ) )
            // InternalBiLang.g:1086:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            {
            // InternalBiLang.g:1086:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            // InternalBiLang.g:1087:2: ( rule__Task__FileextractorAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_4()); 
            // InternalBiLang.g:1088:2: ( rule__Task__FileextractorAssignment_4 )
            // InternalBiLang.g:1088:3: rule__Task__FileextractorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Task__FileextractorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getFileextractorAssignment_4()); 

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
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalBiLang.g:1096:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1100:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalBiLang.g:1101:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

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
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalBiLang.g:1108:1: rule__Task__Group__5__Impl : ( ( rule__Task__Group_5__0 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1112:1: ( ( ( rule__Task__Group_5__0 )? ) )
            // InternalBiLang.g:1113:1: ( ( rule__Task__Group_5__0 )? )
            {
            // InternalBiLang.g:1113:1: ( ( rule__Task__Group_5__0 )? )
            // InternalBiLang.g:1114:2: ( rule__Task__Group_5__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_5()); 
            // InternalBiLang.g:1115:2: ( rule__Task__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBiLang.g:1115:3: rule__Task__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalBiLang.g:1123:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1127:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalBiLang.g:1128:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__7();

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
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalBiLang.g:1135:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )* ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1139:1: ( ( ( rule__Task__Group_6__0 )* ) )
            // InternalBiLang.g:1140:1: ( ( rule__Task__Group_6__0 )* )
            {
            // InternalBiLang.g:1140:1: ( ( rule__Task__Group_6__0 )* )
            // InternalBiLang.g:1141:2: ( rule__Task__Group_6__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalBiLang.g:1142:2: ( rule__Task__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBiLang.g:1142:3: rule__Task__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Task__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // InternalBiLang.g:1150:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1154:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalBiLang.g:1155:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__8();

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
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // InternalBiLang.g:1162:1: rule__Task__Group__7__Impl : ( '[dashboard:' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1166:1: ( ( '[dashboard:' ) )
            // InternalBiLang.g:1167:1: ( '[dashboard:' )
            {
            // InternalBiLang.g:1167:1: ( '[dashboard:' )
            // InternalBiLang.g:1168:2: '[dashboard:'
            {
             before(grammarAccess.getTaskAccess().getDashboardKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDashboardKeyword_7()); 

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
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // InternalBiLang.g:1177:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1181:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalBiLang.g:1182:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__9();

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
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // InternalBiLang.g:1189:1: rule__Task__Group__8__Impl : ( ( rule__Task__DashboardAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1193:1: ( ( ( rule__Task__DashboardAssignment_8 ) ) )
            // InternalBiLang.g:1194:1: ( ( rule__Task__DashboardAssignment_8 ) )
            {
            // InternalBiLang.g:1194:1: ( ( rule__Task__DashboardAssignment_8 ) )
            // InternalBiLang.g:1195:2: ( rule__Task__DashboardAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getDashboardAssignment_8()); 
            // InternalBiLang.g:1196:2: ( rule__Task__DashboardAssignment_8 )
            // InternalBiLang.g:1196:3: rule__Task__DashboardAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Task__DashboardAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDashboardAssignment_8()); 

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
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__9"
    // InternalBiLang.g:1204:1: rule__Task__Group__9 : rule__Task__Group__9__Impl ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1208:1: ( rule__Task__Group__9__Impl )
            // InternalBiLang.g:1209:2: rule__Task__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__9__Impl();

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
    // $ANTLR end "rule__Task__Group__9"


    // $ANTLR start "rule__Task__Group__9__Impl"
    // InternalBiLang.g:1215:1: rule__Task__Group__9__Impl : ( ']' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1219:1: ( ( ']' ) )
            // InternalBiLang.g:1220:1: ( ']' )
            {
            // InternalBiLang.g:1220:1: ( ']' )
            // InternalBiLang.g:1221:2: ']'
            {
             before(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__Task__Group__9__Impl"


    // $ANTLR start "rule__Task__Group_5__0"
    // InternalBiLang.g:1231:1: rule__Task__Group_5__0 : rule__Task__Group_5__0__Impl rule__Task__Group_5__1 ;
    public final void rule__Task__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1235:1: ( rule__Task__Group_5__0__Impl rule__Task__Group_5__1 )
            // InternalBiLang.g:1236:2: rule__Task__Group_5__0__Impl rule__Task__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_5__1();

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
    // $ANTLR end "rule__Task__Group_5__0"


    // $ANTLR start "rule__Task__Group_5__0__Impl"
    // InternalBiLang.g:1243:1: rule__Task__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Task__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1247:1: ( ( '[' ) )
            // InternalBiLang.g:1248:1: ( '[' )
            {
            // InternalBiLang.g:1248:1: ( '[' )
            // InternalBiLang.g:1249:2: '['
            {
             before(grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_5_0()); 

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
    // $ANTLR end "rule__Task__Group_5__0__Impl"


    // $ANTLR start "rule__Task__Group_5__1"
    // InternalBiLang.g:1258:1: rule__Task__Group_5__1 : rule__Task__Group_5__1__Impl rule__Task__Group_5__2 ;
    public final void rule__Task__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1262:1: ( rule__Task__Group_5__1__Impl rule__Task__Group_5__2 )
            // InternalBiLang.g:1263:2: rule__Task__Group_5__1__Impl rule__Task__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_5__2();

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
    // $ANTLR end "rule__Task__Group_5__1"


    // $ANTLR start "rule__Task__Group_5__1__Impl"
    // InternalBiLang.g:1270:1: rule__Task__Group_5__1__Impl : ( ( rule__Task__DatafilteringAssignment_5_1 ) ) ;
    public final void rule__Task__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1274:1: ( ( ( rule__Task__DatafilteringAssignment_5_1 ) ) )
            // InternalBiLang.g:1275:1: ( ( rule__Task__DatafilteringAssignment_5_1 ) )
            {
            // InternalBiLang.g:1275:1: ( ( rule__Task__DatafilteringAssignment_5_1 ) )
            // InternalBiLang.g:1276:2: ( rule__Task__DatafilteringAssignment_5_1 )
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_5_1()); 
            // InternalBiLang.g:1277:2: ( rule__Task__DatafilteringAssignment_5_1 )
            // InternalBiLang.g:1277:3: rule__Task__DatafilteringAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DatafilteringAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDatafilteringAssignment_5_1()); 

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
    // $ANTLR end "rule__Task__Group_5__1__Impl"


    // $ANTLR start "rule__Task__Group_5__2"
    // InternalBiLang.g:1285:1: rule__Task__Group_5__2 : rule__Task__Group_5__2__Impl rule__Task__Group_5__3 ;
    public final void rule__Task__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1289:1: ( rule__Task__Group_5__2__Impl rule__Task__Group_5__3 )
            // InternalBiLang.g:1290:2: rule__Task__Group_5__2__Impl rule__Task__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_5__3();

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
    // $ANTLR end "rule__Task__Group_5__2"


    // $ANTLR start "rule__Task__Group_5__2__Impl"
    // InternalBiLang.g:1297:1: rule__Task__Group_5__2__Impl : ( ( rule__Task__DatafilteringAssignment_5_2 )* ) ;
    public final void rule__Task__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1301:1: ( ( ( rule__Task__DatafilteringAssignment_5_2 )* ) )
            // InternalBiLang.g:1302:1: ( ( rule__Task__DatafilteringAssignment_5_2 )* )
            {
            // InternalBiLang.g:1302:1: ( ( rule__Task__DatafilteringAssignment_5_2 )* )
            // InternalBiLang.g:1303:2: ( rule__Task__DatafilteringAssignment_5_2 )*
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_5_2()); 
            // InternalBiLang.g:1304:2: ( rule__Task__DatafilteringAssignment_5_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBiLang.g:1304:3: rule__Task__DatafilteringAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Task__DatafilteringAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getDatafilteringAssignment_5_2()); 

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
    // $ANTLR end "rule__Task__Group_5__2__Impl"


    // $ANTLR start "rule__Task__Group_5__3"
    // InternalBiLang.g:1312:1: rule__Task__Group_5__3 : rule__Task__Group_5__3__Impl ;
    public final void rule__Task__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1316:1: ( rule__Task__Group_5__3__Impl )
            // InternalBiLang.g:1317:2: rule__Task__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_5__3__Impl();

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
    // $ANTLR end "rule__Task__Group_5__3"


    // $ANTLR start "rule__Task__Group_5__3__Impl"
    // InternalBiLang.g:1323:1: rule__Task__Group_5__3__Impl : ( ']' ) ;
    public final void rule__Task__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1327:1: ( ( ']' ) )
            // InternalBiLang.g:1328:1: ( ']' )
            {
            // InternalBiLang.g:1328:1: ( ']' )
            // InternalBiLang.g:1329:2: ']'
            {
             before(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_5_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_5_3()); 

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
    // $ANTLR end "rule__Task__Group_5__3__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalBiLang.g:1339:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1343:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalBiLang.g:1344:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1();

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
    // $ANTLR end "rule__Task__Group_6__0"


    // $ANTLR start "rule__Task__Group_6__0__Impl"
    // InternalBiLang.g:1351:1: rule__Task__Group_6__0__Impl : ( ( rule__Task__FileextractorAssignment_6_0 ) ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1355:1: ( ( ( rule__Task__FileextractorAssignment_6_0 ) ) )
            // InternalBiLang.g:1356:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            {
            // InternalBiLang.g:1356:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            // InternalBiLang.g:1357:2: ( rule__Task__FileextractorAssignment_6_0 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0()); 
            // InternalBiLang.g:1358:2: ( rule__Task__FileextractorAssignment_6_0 )
            // InternalBiLang.g:1358:3: rule__Task__FileextractorAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__FileextractorAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0()); 

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
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // InternalBiLang.g:1366:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1370:1: ( rule__Task__Group_6__1__Impl )
            // InternalBiLang.g:1371:2: rule__Task__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1__Impl();

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
    // $ANTLR end "rule__Task__Group_6__1"


    // $ANTLR start "rule__Task__Group_6__1__Impl"
    // InternalBiLang.g:1377:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__Group_6_1__0 )? ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1381:1: ( ( ( rule__Task__Group_6_1__0 )? ) )
            // InternalBiLang.g:1382:1: ( ( rule__Task__Group_6_1__0 )? )
            {
            // InternalBiLang.g:1382:1: ( ( rule__Task__Group_6_1__0 )? )
            // InternalBiLang.g:1383:2: ( rule__Task__Group_6_1__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6_1()); 
            // InternalBiLang.g:1384:2: ( rule__Task__Group_6_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBiLang.g:1384:3: rule__Task__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_6_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Task__Group_6_1__0"
    // InternalBiLang.g:1393:1: rule__Task__Group_6_1__0 : rule__Task__Group_6_1__0__Impl rule__Task__Group_6_1__1 ;
    public final void rule__Task__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1397:1: ( rule__Task__Group_6_1__0__Impl rule__Task__Group_6_1__1 )
            // InternalBiLang.g:1398:2: rule__Task__Group_6_1__0__Impl rule__Task__Group_6_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6_1__1();

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
    // $ANTLR end "rule__Task__Group_6_1__0"


    // $ANTLR start "rule__Task__Group_6_1__0__Impl"
    // InternalBiLang.g:1405:1: rule__Task__Group_6_1__0__Impl : ( '[' ) ;
    public final void rule__Task__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1409:1: ( ( '[' ) )
            // InternalBiLang.g:1410:1: ( '[' )
            {
            // InternalBiLang.g:1410:1: ( '[' )
            // InternalBiLang.g:1411:2: '['
            {
             before(grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_6_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_6_1_0()); 

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
    // $ANTLR end "rule__Task__Group_6_1__0__Impl"


    // $ANTLR start "rule__Task__Group_6_1__1"
    // InternalBiLang.g:1420:1: rule__Task__Group_6_1__1 : rule__Task__Group_6_1__1__Impl rule__Task__Group_6_1__2 ;
    public final void rule__Task__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1424:1: ( rule__Task__Group_6_1__1__Impl rule__Task__Group_6_1__2 )
            // InternalBiLang.g:1425:2: rule__Task__Group_6_1__1__Impl rule__Task__Group_6_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6_1__2();

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
    // $ANTLR end "rule__Task__Group_6_1__1"


    // $ANTLR start "rule__Task__Group_6_1__1__Impl"
    // InternalBiLang.g:1432:1: rule__Task__Group_6_1__1__Impl : ( ( rule__Task__DatafilteringAssignment_6_1_1 ) ) ;
    public final void rule__Task__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1436:1: ( ( ( rule__Task__DatafilteringAssignment_6_1_1 ) ) )
            // InternalBiLang.g:1437:1: ( ( rule__Task__DatafilteringAssignment_6_1_1 ) )
            {
            // InternalBiLang.g:1437:1: ( ( rule__Task__DatafilteringAssignment_6_1_1 ) )
            // InternalBiLang.g:1438:2: ( rule__Task__DatafilteringAssignment_6_1_1 )
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1_1()); 
            // InternalBiLang.g:1439:2: ( rule__Task__DatafilteringAssignment_6_1_1 )
            // InternalBiLang.g:1439:3: rule__Task__DatafilteringAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DatafilteringAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1_1()); 

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
    // $ANTLR end "rule__Task__Group_6_1__1__Impl"


    // $ANTLR start "rule__Task__Group_6_1__2"
    // InternalBiLang.g:1447:1: rule__Task__Group_6_1__2 : rule__Task__Group_6_1__2__Impl rule__Task__Group_6_1__3 ;
    public final void rule__Task__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1451:1: ( rule__Task__Group_6_1__2__Impl rule__Task__Group_6_1__3 )
            // InternalBiLang.g:1452:2: rule__Task__Group_6_1__2__Impl rule__Task__Group_6_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_6_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6_1__3();

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
    // $ANTLR end "rule__Task__Group_6_1__2"


    // $ANTLR start "rule__Task__Group_6_1__2__Impl"
    // InternalBiLang.g:1459:1: rule__Task__Group_6_1__2__Impl : ( ( rule__Task__DatafilteringAssignment_6_1_2 )* ) ;
    public final void rule__Task__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1463:1: ( ( ( rule__Task__DatafilteringAssignment_6_1_2 )* ) )
            // InternalBiLang.g:1464:1: ( ( rule__Task__DatafilteringAssignment_6_1_2 )* )
            {
            // InternalBiLang.g:1464:1: ( ( rule__Task__DatafilteringAssignment_6_1_2 )* )
            // InternalBiLang.g:1465:2: ( rule__Task__DatafilteringAssignment_6_1_2 )*
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1_2()); 
            // InternalBiLang.g:1466:2: ( rule__Task__DatafilteringAssignment_6_1_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBiLang.g:1466:3: rule__Task__DatafilteringAssignment_6_1_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Task__DatafilteringAssignment_6_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1_2()); 

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
    // $ANTLR end "rule__Task__Group_6_1__2__Impl"


    // $ANTLR start "rule__Task__Group_6_1__3"
    // InternalBiLang.g:1474:1: rule__Task__Group_6_1__3 : rule__Task__Group_6_1__3__Impl ;
    public final void rule__Task__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1478:1: ( rule__Task__Group_6_1__3__Impl )
            // InternalBiLang.g:1479:2: rule__Task__Group_6_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6_1__3__Impl();

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
    // $ANTLR end "rule__Task__Group_6_1__3"


    // $ANTLR start "rule__Task__Group_6_1__3__Impl"
    // InternalBiLang.g:1485:1: rule__Task__Group_6_1__3__Impl : ( ']' ) ;
    public final void rule__Task__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1489:1: ( ( ']' ) )
            // InternalBiLang.g:1490:1: ( ']' )
            {
            // InternalBiLang.g:1490:1: ( ']' )
            // InternalBiLang.g:1491:2: ']'
            {
             before(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_6_1_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_6_1_3()); 

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
    // $ANTLR end "rule__Task__Group_6_1__3__Impl"


    // $ANTLR start "rule__FileExtractor__Group__0"
    // InternalBiLang.g:1501:1: rule__FileExtractor__Group__0 : rule__FileExtractor__Group__0__Impl rule__FileExtractor__Group__1 ;
    public final void rule__FileExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1505:1: ( rule__FileExtractor__Group__0__Impl rule__FileExtractor__Group__1 )
            // InternalBiLang.g:1506:2: rule__FileExtractor__Group__0__Impl rule__FileExtractor__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FileExtractor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group__1();

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
    // $ANTLR end "rule__FileExtractor__Group__0"


    // $ANTLR start "rule__FileExtractor__Group__0__Impl"
    // InternalBiLang.g:1513:1: rule__FileExtractor__Group__0__Impl : ( ( rule__FileExtractor__NameAssignment_0 ) ) ;
    public final void rule__FileExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1517:1: ( ( ( rule__FileExtractor__NameAssignment_0 ) ) )
            // InternalBiLang.g:1518:1: ( ( rule__FileExtractor__NameAssignment_0 ) )
            {
            // InternalBiLang.g:1518:1: ( ( rule__FileExtractor__NameAssignment_0 ) )
            // InternalBiLang.g:1519:2: ( rule__FileExtractor__NameAssignment_0 )
            {
             before(grammarAccess.getFileExtractorAccess().getNameAssignment_0()); 
            // InternalBiLang.g:1520:2: ( rule__FileExtractor__NameAssignment_0 )
            // InternalBiLang.g:1520:3: rule__FileExtractor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFileExtractorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FileExtractor__Group__0__Impl"


    // $ANTLR start "rule__FileExtractor__Group__1"
    // InternalBiLang.g:1528:1: rule__FileExtractor__Group__1 : rule__FileExtractor__Group__1__Impl rule__FileExtractor__Group__2 ;
    public final void rule__FileExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1532:1: ( rule__FileExtractor__Group__1__Impl rule__FileExtractor__Group__2 )
            // InternalBiLang.g:1533:2: rule__FileExtractor__Group__1__Impl rule__FileExtractor__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FileExtractor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group__2();

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
    // $ANTLR end "rule__FileExtractor__Group__1"


    // $ANTLR start "rule__FileExtractor__Group__1__Impl"
    // InternalBiLang.g:1540:1: rule__FileExtractor__Group__1__Impl : ( '=>' ) ;
    public final void rule__FileExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1544:1: ( ( '=>' ) )
            // InternalBiLang.g:1545:1: ( '=>' )
            {
            // InternalBiLang.g:1545:1: ( '=>' )
            // InternalBiLang.g:1546:2: '=>'
            {
             before(grammarAccess.getFileExtractorAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFileExtractorAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__FileExtractor__Group__1__Impl"


    // $ANTLR start "rule__FileExtractor__Group__2"
    // InternalBiLang.g:1555:1: rule__FileExtractor__Group__2 : rule__FileExtractor__Group__2__Impl rule__FileExtractor__Group__3 ;
    public final void rule__FileExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1559:1: ( rule__FileExtractor__Group__2__Impl rule__FileExtractor__Group__3 )
            // InternalBiLang.g:1560:2: rule__FileExtractor__Group__2__Impl rule__FileExtractor__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__FileExtractor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group__3();

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
    // $ANTLR end "rule__FileExtractor__Group__2"


    // $ANTLR start "rule__FileExtractor__Group__2__Impl"
    // InternalBiLang.g:1567:1: rule__FileExtractor__Group__2__Impl : ( ( rule__FileExtractor__PathAssignment_2 ) ) ;
    public final void rule__FileExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1571:1: ( ( ( rule__FileExtractor__PathAssignment_2 ) ) )
            // InternalBiLang.g:1572:1: ( ( rule__FileExtractor__PathAssignment_2 ) )
            {
            // InternalBiLang.g:1572:1: ( ( rule__FileExtractor__PathAssignment_2 ) )
            // InternalBiLang.g:1573:2: ( rule__FileExtractor__PathAssignment_2 )
            {
             before(grammarAccess.getFileExtractorAccess().getPathAssignment_2()); 
            // InternalBiLang.g:1574:2: ( rule__FileExtractor__PathAssignment_2 )
            // InternalBiLang.g:1574:3: rule__FileExtractor__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileExtractorAccess().getPathAssignment_2()); 

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
    // $ANTLR end "rule__FileExtractor__Group__2__Impl"


    // $ANTLR start "rule__FileExtractor__Group__3"
    // InternalBiLang.g:1582:1: rule__FileExtractor__Group__3 : rule__FileExtractor__Group__3__Impl ;
    public final void rule__FileExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1586:1: ( rule__FileExtractor__Group__3__Impl )
            // InternalBiLang.g:1587:2: rule__FileExtractor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group__3__Impl();

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
    // $ANTLR end "rule__FileExtractor__Group__3"


    // $ANTLR start "rule__FileExtractor__Group__3__Impl"
    // InternalBiLang.g:1593:1: rule__FileExtractor__Group__3__Impl : ( ( rule__FileExtractor__Group_3__0 )? ) ;
    public final void rule__FileExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1597:1: ( ( ( rule__FileExtractor__Group_3__0 )? ) )
            // InternalBiLang.g:1598:1: ( ( rule__FileExtractor__Group_3__0 )? )
            {
            // InternalBiLang.g:1598:1: ( ( rule__FileExtractor__Group_3__0 )? )
            // InternalBiLang.g:1599:2: ( rule__FileExtractor__Group_3__0 )?
            {
             before(grammarAccess.getFileExtractorAccess().getGroup_3()); 
            // InternalBiLang.g:1600:2: ( rule__FileExtractor__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBiLang.g:1600:3: rule__FileExtractor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FileExtractor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileExtractorAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FileExtractor__Group__3__Impl"


    // $ANTLR start "rule__FileExtractor__Group_3__0"
    // InternalBiLang.g:1609:1: rule__FileExtractor__Group_3__0 : rule__FileExtractor__Group_3__0__Impl rule__FileExtractor__Group_3__1 ;
    public final void rule__FileExtractor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1613:1: ( rule__FileExtractor__Group_3__0__Impl rule__FileExtractor__Group_3__1 )
            // InternalBiLang.g:1614:2: rule__FileExtractor__Group_3__0__Impl rule__FileExtractor__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__FileExtractor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group_3__1();

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
    // $ANTLR end "rule__FileExtractor__Group_3__0"


    // $ANTLR start "rule__FileExtractor__Group_3__0__Impl"
    // InternalBiLang.g:1621:1: rule__FileExtractor__Group_3__0__Impl : ( 'null replacement->' ) ;
    public final void rule__FileExtractor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1625:1: ( ( 'null replacement->' ) )
            // InternalBiLang.g:1626:1: ( 'null replacement->' )
            {
            // InternalBiLang.g:1626:1: ( 'null replacement->' )
            // InternalBiLang.g:1627:2: 'null replacement->'
            {
             before(grammarAccess.getFileExtractorAccess().getNullReplacementKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFileExtractorAccess().getNullReplacementKeyword_3_0()); 

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
    // $ANTLR end "rule__FileExtractor__Group_3__0__Impl"


    // $ANTLR start "rule__FileExtractor__Group_3__1"
    // InternalBiLang.g:1636:1: rule__FileExtractor__Group_3__1 : rule__FileExtractor__Group_3__1__Impl rule__FileExtractor__Group_3__2 ;
    public final void rule__FileExtractor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1640:1: ( rule__FileExtractor__Group_3__1__Impl rule__FileExtractor__Group_3__2 )
            // InternalBiLang.g:1641:2: rule__FileExtractor__Group_3__1__Impl rule__FileExtractor__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__FileExtractor__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group_3__2();

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
    // $ANTLR end "rule__FileExtractor__Group_3__1"


    // $ANTLR start "rule__FileExtractor__Group_3__1__Impl"
    // InternalBiLang.g:1648:1: rule__FileExtractor__Group_3__1__Impl : ( ( rule__FileExtractor__NullreplacementAssignment_3_1 ) ) ;
    public final void rule__FileExtractor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1652:1: ( ( ( rule__FileExtractor__NullreplacementAssignment_3_1 ) ) )
            // InternalBiLang.g:1653:1: ( ( rule__FileExtractor__NullreplacementAssignment_3_1 ) )
            {
            // InternalBiLang.g:1653:1: ( ( rule__FileExtractor__NullreplacementAssignment_3_1 ) )
            // InternalBiLang.g:1654:2: ( rule__FileExtractor__NullreplacementAssignment_3_1 )
            {
             before(grammarAccess.getFileExtractorAccess().getNullreplacementAssignment_3_1()); 
            // InternalBiLang.g:1655:2: ( rule__FileExtractor__NullreplacementAssignment_3_1 )
            // InternalBiLang.g:1655:3: rule__FileExtractor__NullreplacementAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__NullreplacementAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFileExtractorAccess().getNullreplacementAssignment_3_1()); 

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
    // $ANTLR end "rule__FileExtractor__Group_3__1__Impl"


    // $ANTLR start "rule__FileExtractor__Group_3__2"
    // InternalBiLang.g:1663:1: rule__FileExtractor__Group_3__2 : rule__FileExtractor__Group_3__2__Impl ;
    public final void rule__FileExtractor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1667:1: ( rule__FileExtractor__Group_3__2__Impl )
            // InternalBiLang.g:1668:2: rule__FileExtractor__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group_3__2__Impl();

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
    // $ANTLR end "rule__FileExtractor__Group_3__2"


    // $ANTLR start "rule__FileExtractor__Group_3__2__Impl"
    // InternalBiLang.g:1674:1: rule__FileExtractor__Group_3__2__Impl : ( ( rule__FileExtractor__Group_3_2__0 )* ) ;
    public final void rule__FileExtractor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1678:1: ( ( ( rule__FileExtractor__Group_3_2__0 )* ) )
            // InternalBiLang.g:1679:1: ( ( rule__FileExtractor__Group_3_2__0 )* )
            {
            // InternalBiLang.g:1679:1: ( ( rule__FileExtractor__Group_3_2__0 )* )
            // InternalBiLang.g:1680:2: ( rule__FileExtractor__Group_3_2__0 )*
            {
             before(grammarAccess.getFileExtractorAccess().getGroup_3_2()); 
            // InternalBiLang.g:1681:2: ( rule__FileExtractor__Group_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBiLang.g:1681:3: rule__FileExtractor__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FileExtractor__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFileExtractorAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__FileExtractor__Group_3__2__Impl"


    // $ANTLR start "rule__FileExtractor__Group_3_2__0"
    // InternalBiLang.g:1690:1: rule__FileExtractor__Group_3_2__0 : rule__FileExtractor__Group_3_2__0__Impl rule__FileExtractor__Group_3_2__1 ;
    public final void rule__FileExtractor__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1694:1: ( rule__FileExtractor__Group_3_2__0__Impl rule__FileExtractor__Group_3_2__1 )
            // InternalBiLang.g:1695:2: rule__FileExtractor__Group_3_2__0__Impl rule__FileExtractor__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
            rule__FileExtractor__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group_3_2__1();

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
    // $ANTLR end "rule__FileExtractor__Group_3_2__0"


    // $ANTLR start "rule__FileExtractor__Group_3_2__0__Impl"
    // InternalBiLang.g:1702:1: rule__FileExtractor__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FileExtractor__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1706:1: ( ( ',' ) )
            // InternalBiLang.g:1707:1: ( ',' )
            {
            // InternalBiLang.g:1707:1: ( ',' )
            // InternalBiLang.g:1708:2: ','
            {
             before(grammarAccess.getFileExtractorAccess().getCommaKeyword_3_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFileExtractorAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__FileExtractor__Group_3_2__0__Impl"


    // $ANTLR start "rule__FileExtractor__Group_3_2__1"
    // InternalBiLang.g:1717:1: rule__FileExtractor__Group_3_2__1 : rule__FileExtractor__Group_3_2__1__Impl ;
    public final void rule__FileExtractor__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1721:1: ( rule__FileExtractor__Group_3_2__1__Impl )
            // InternalBiLang.g:1722:2: rule__FileExtractor__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__FileExtractor__Group_3_2__1"


    // $ANTLR start "rule__FileExtractor__Group_3_2__1__Impl"
    // InternalBiLang.g:1728:1: rule__FileExtractor__Group_3_2__1__Impl : ( ( rule__FileExtractor__NullreplacementAssignment_3_2_1 ) ) ;
    public final void rule__FileExtractor__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1732:1: ( ( ( rule__FileExtractor__NullreplacementAssignment_3_2_1 ) ) )
            // InternalBiLang.g:1733:1: ( ( rule__FileExtractor__NullreplacementAssignment_3_2_1 ) )
            {
            // InternalBiLang.g:1733:1: ( ( rule__FileExtractor__NullreplacementAssignment_3_2_1 ) )
            // InternalBiLang.g:1734:2: ( rule__FileExtractor__NullreplacementAssignment_3_2_1 )
            {
             before(grammarAccess.getFileExtractorAccess().getNullreplacementAssignment_3_2_1()); 
            // InternalBiLang.g:1735:2: ( rule__FileExtractor__NullreplacementAssignment_3_2_1 )
            // InternalBiLang.g:1735:3: rule__FileExtractor__NullreplacementAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__NullreplacementAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFileExtractorAccess().getNullreplacementAssignment_3_2_1()); 

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
    // $ANTLR end "rule__FileExtractor__Group_3_2__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group__0"
    // InternalBiLang.g:1744:1: rule__DataFiltering__Group__0 : rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 ;
    public final void rule__DataFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1748:1: ( rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 )
            // InternalBiLang.g:1749:2: rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DataFiltering__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__1();

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
    // $ANTLR end "rule__DataFiltering__Group__0"


    // $ANTLR start "rule__DataFiltering__Group__0__Impl"
    // InternalBiLang.g:1756:1: rule__DataFiltering__Group__0__Impl : ( '=>' ) ;
    public final void rule__DataFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1760:1: ( ( '=>' ) )
            // InternalBiLang.g:1761:1: ( '=>' )
            {
            // InternalBiLang.g:1761:1: ( '=>' )
            // InternalBiLang.g:1762:2: '=>'
            {
             before(grammarAccess.getDataFilteringAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getEqualsSignGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__DataFiltering__Group__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group__1"
    // InternalBiLang.g:1771:1: rule__DataFiltering__Group__1 : rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 ;
    public final void rule__DataFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1775:1: ( rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 )
            // InternalBiLang.g:1776:2: rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DataFiltering__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__2();

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
    // $ANTLR end "rule__DataFiltering__Group__1"


    // $ANTLR start "rule__DataFiltering__Group__1__Impl"
    // InternalBiLang.g:1783:1: rule__DataFiltering__Group__1__Impl : ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) ;
    public final void rule__DataFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1787:1: ( ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) )
            // InternalBiLang.g:1788:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            {
            // InternalBiLang.g:1788:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            // InternalBiLang.g:1789:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_1()); 
            // InternalBiLang.g:1790:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            // InternalBiLang.g:1790:3: rule__DataFiltering__FileextractorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__FileextractorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_1()); 

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
    // $ANTLR end "rule__DataFiltering__Group__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group__2"
    // InternalBiLang.g:1798:1: rule__DataFiltering__Group__2 : rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 ;
    public final void rule__DataFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1802:1: ( rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 )
            // InternalBiLang.g:1803:2: rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__DataFiltering__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__3();

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
    // $ANTLR end "rule__DataFiltering__Group__2"


    // $ANTLR start "rule__DataFiltering__Group__2__Impl"
    // InternalBiLang.g:1810:1: rule__DataFiltering__Group__2__Impl : ( ( rule__DataFiltering__Group_2__0 )? ) ;
    public final void rule__DataFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1814:1: ( ( ( rule__DataFiltering__Group_2__0 )? ) )
            // InternalBiLang.g:1815:1: ( ( rule__DataFiltering__Group_2__0 )? )
            {
            // InternalBiLang.g:1815:1: ( ( rule__DataFiltering__Group_2__0 )? )
            // InternalBiLang.g:1816:2: ( rule__DataFiltering__Group_2__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2()); 
            // InternalBiLang.g:1817:2: ( rule__DataFiltering__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBiLang.g:1817:3: rule__DataFiltering__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DataFiltering__Group__2__Impl"


    // $ANTLR start "rule__DataFiltering__Group__3"
    // InternalBiLang.g:1825:1: rule__DataFiltering__Group__3 : rule__DataFiltering__Group__3__Impl ;
    public final void rule__DataFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1829:1: ( rule__DataFiltering__Group__3__Impl )
            // InternalBiLang.g:1830:2: rule__DataFiltering__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__3__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group__3"


    // $ANTLR start "rule__DataFiltering__Group__3__Impl"
    // InternalBiLang.g:1836:1: rule__DataFiltering__Group__3__Impl : ( ( rule__DataFiltering__Group_3__0 )? ) ;
    public final void rule__DataFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1840:1: ( ( ( rule__DataFiltering__Group_3__0 )? ) )
            // InternalBiLang.g:1841:1: ( ( rule__DataFiltering__Group_3__0 )? )
            {
            // InternalBiLang.g:1841:1: ( ( rule__DataFiltering__Group_3__0 )? )
            // InternalBiLang.g:1842:2: ( rule__DataFiltering__Group_3__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_3()); 
            // InternalBiLang.g:1843:2: ( rule__DataFiltering__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBiLang.g:1843:3: rule__DataFiltering__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getGroup_3()); 

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
    // $ANTLR end "rule__DataFiltering__Group__3__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2__0"
    // InternalBiLang.g:1852:1: rule__DataFiltering__Group_2__0 : rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 ;
    public final void rule__DataFiltering__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1856:1: ( rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 )
            // InternalBiLang.g:1857:2: rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__DataFiltering__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2__1();

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
    // $ANTLR end "rule__DataFiltering__Group_2__0"


    // $ANTLR start "rule__DataFiltering__Group_2__0__Impl"
    // InternalBiLang.g:1864:1: rule__DataFiltering__Group_2__0__Impl : ( 'processing=' ) ;
    public final void rule__DataFiltering__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1868:1: ( ( 'processing=' ) )
            // InternalBiLang.g:1869:1: ( 'processing=' )
            {
            // InternalBiLang.g:1869:1: ( 'processing=' )
            // InternalBiLang.g:1870:2: 'processing='
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getProcessingKeyword_2_0()); 

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
    // $ANTLR end "rule__DataFiltering__Group_2__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2__1"
    // InternalBiLang.g:1879:1: rule__DataFiltering__Group_2__1 : rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 ;
    public final void rule__DataFiltering__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1883:1: ( rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 )
            // InternalBiLang.g:1884:2: rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2
            {
            pushFollow(FOLLOW_15);
            rule__DataFiltering__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2__2();

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
    // $ANTLR end "rule__DataFiltering__Group_2__1"


    // $ANTLR start "rule__DataFiltering__Group_2__1__Impl"
    // InternalBiLang.g:1891:1: rule__DataFiltering__Group_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1895:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) ) )
            // InternalBiLang.g:1896:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) )
            {
            // InternalBiLang.g:1896:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) )
            // InternalBiLang.g:1897:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1()); 
            // InternalBiLang.g:1898:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1 )
            // InternalBiLang.g:1898:3: rule__DataFiltering__ProcessingstepAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__ProcessingstepAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1()); 

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
    // $ANTLR end "rule__DataFiltering__Group_2__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2__2"
    // InternalBiLang.g:1906:1: rule__DataFiltering__Group_2__2 : rule__DataFiltering__Group_2__2__Impl ;
    public final void rule__DataFiltering__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1910:1: ( rule__DataFiltering__Group_2__2__Impl )
            // InternalBiLang.g:1911:2: rule__DataFiltering__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2__2__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_2__2"


    // $ANTLR start "rule__DataFiltering__Group_2__2__Impl"
    // InternalBiLang.g:1917:1: rule__DataFiltering__Group_2__2__Impl : ( ( rule__DataFiltering__Group_2_2__0 )* ) ;
    public final void rule__DataFiltering__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1921:1: ( ( ( rule__DataFiltering__Group_2_2__0 )* ) )
            // InternalBiLang.g:1922:1: ( ( rule__DataFiltering__Group_2_2__0 )* )
            {
            // InternalBiLang.g:1922:1: ( ( rule__DataFiltering__Group_2_2__0 )* )
            // InternalBiLang.g:1923:2: ( rule__DataFiltering__Group_2_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_2()); 
            // InternalBiLang.g:1924:2: ( rule__DataFiltering__Group_2_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBiLang.g:1924:3: rule__DataFiltering__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DataFiltering__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__DataFiltering__Group_2__2__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_2__0"
    // InternalBiLang.g:1933:1: rule__DataFiltering__Group_2_2__0 : rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 ;
    public final void rule__DataFiltering__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1937:1: ( rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 )
            // InternalBiLang.g:1938:2: rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1
            {
            pushFollow(FOLLOW_18);
            rule__DataFiltering__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_2__1();

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
    // $ANTLR end "rule__DataFiltering__Group_2_2__0"


    // $ANTLR start "rule__DataFiltering__Group_2_2__0__Impl"
    // InternalBiLang.g:1945:1: rule__DataFiltering__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1949:1: ( ( ',' ) )
            // InternalBiLang.g:1950:1: ( ',' )
            {
            // InternalBiLang.g:1950:1: ( ',' )
            // InternalBiLang.g:1951:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__DataFiltering__Group_2_2__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_2__1"
    // InternalBiLang.g:1960:1: rule__DataFiltering__Group_2_2__1 : rule__DataFiltering__Group_2_2__1__Impl ;
    public final void rule__DataFiltering__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1964:1: ( rule__DataFiltering__Group_2_2__1__Impl )
            // InternalBiLang.g:1965:2: rule__DataFiltering__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_2_2__1"


    // $ANTLR start "rule__DataFiltering__Group_2_2__1__Impl"
    // InternalBiLang.g:1971:1: rule__DataFiltering__Group_2_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1975:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) ) )
            // InternalBiLang.g:1976:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) )
            {
            // InternalBiLang.g:1976:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) )
            // InternalBiLang.g:1977:2: ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_2_1()); 
            // InternalBiLang.g:1978:2: ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 )
            // InternalBiLang.g:1978:3: rule__DataFiltering__ProcessingstepAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__ProcessingstepAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_2_1()); 

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
    // $ANTLR end "rule__DataFiltering__Group_2_2__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_3__0"
    // InternalBiLang.g:1987:1: rule__DataFiltering__Group_3__0 : rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1 ;
    public final void rule__DataFiltering__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1991:1: ( rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1 )
            // InternalBiLang.g:1992:2: rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__DataFiltering__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_3__1();

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
    // $ANTLR end "rule__DataFiltering__Group_3__0"


    // $ANTLR start "rule__DataFiltering__Group_3__0__Impl"
    // InternalBiLang.g:1999:1: rule__DataFiltering__Group_3__0__Impl : ( 'filtering=' ) ;
    public final void rule__DataFiltering__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2003:1: ( ( 'filtering=' ) )
            // InternalBiLang.g:2004:1: ( 'filtering=' )
            {
            // InternalBiLang.g:2004:1: ( 'filtering=' )
            // InternalBiLang.g:2005:2: 'filtering='
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getFilteringKeyword_3_0()); 

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
    // $ANTLR end "rule__DataFiltering__Group_3__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_3__1"
    // InternalBiLang.g:2014:1: rule__DataFiltering__Group_3__1 : rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2 ;
    public final void rule__DataFiltering__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2018:1: ( rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2 )
            // InternalBiLang.g:2019:2: rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__DataFiltering__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_3__2();

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
    // $ANTLR end "rule__DataFiltering__Group_3__1"


    // $ANTLR start "rule__DataFiltering__Group_3__1__Impl"
    // InternalBiLang.g:2026:1: rule__DataFiltering__Group_3__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) ) ;
    public final void rule__DataFiltering__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2030:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) ) )
            // InternalBiLang.g:2031:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) )
            {
            // InternalBiLang.g:2031:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) )
            // InternalBiLang.g:2032:2: ( rule__DataFiltering__FilteringstepAssignment_3_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_1()); 
            // InternalBiLang.g:2033:2: ( rule__DataFiltering__FilteringstepAssignment_3_1 )
            // InternalBiLang.g:2033:3: rule__DataFiltering__FilteringstepAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__FilteringstepAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_1()); 

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
    // $ANTLR end "rule__DataFiltering__Group_3__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_3__2"
    // InternalBiLang.g:2041:1: rule__DataFiltering__Group_3__2 : rule__DataFiltering__Group_3__2__Impl ;
    public final void rule__DataFiltering__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2045:1: ( rule__DataFiltering__Group_3__2__Impl )
            // InternalBiLang.g:2046:2: rule__DataFiltering__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_3__2__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_3__2"


    // $ANTLR start "rule__DataFiltering__Group_3__2__Impl"
    // InternalBiLang.g:2052:1: rule__DataFiltering__Group_3__2__Impl : ( ( rule__DataFiltering__Group_3_2__0 )* ) ;
    public final void rule__DataFiltering__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2056:1: ( ( ( rule__DataFiltering__Group_3_2__0 )* ) )
            // InternalBiLang.g:2057:1: ( ( rule__DataFiltering__Group_3_2__0 )* )
            {
            // InternalBiLang.g:2057:1: ( ( rule__DataFiltering__Group_3_2__0 )* )
            // InternalBiLang.g:2058:2: ( rule__DataFiltering__Group_3_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_3_2()); 
            // InternalBiLang.g:2059:2: ( rule__DataFiltering__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBiLang.g:2059:3: rule__DataFiltering__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DataFiltering__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__DataFiltering__Group_3__2__Impl"


    // $ANTLR start "rule__DataFiltering__Group_3_2__0"
    // InternalBiLang.g:2068:1: rule__DataFiltering__Group_3_2__0 : rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1 ;
    public final void rule__DataFiltering__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2072:1: ( rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1 )
            // InternalBiLang.g:2073:2: rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
            rule__DataFiltering__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_3_2__1();

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
    // $ANTLR end "rule__DataFiltering__Group_3_2__0"


    // $ANTLR start "rule__DataFiltering__Group_3_2__0__Impl"
    // InternalBiLang.g:2080:1: rule__DataFiltering__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2084:1: ( ( ',' ) )
            // InternalBiLang.g:2085:1: ( ',' )
            {
            // InternalBiLang.g:2085:1: ( ',' )
            // InternalBiLang.g:2086:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_3_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__DataFiltering__Group_3_2__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_3_2__1"
    // InternalBiLang.g:2095:1: rule__DataFiltering__Group_3_2__1 : rule__DataFiltering__Group_3_2__1__Impl ;
    public final void rule__DataFiltering__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2099:1: ( rule__DataFiltering__Group_3_2__1__Impl )
            // InternalBiLang.g:2100:2: rule__DataFiltering__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_3_2__1"


    // $ANTLR start "rule__DataFiltering__Group_3_2__1__Impl"
    // InternalBiLang.g:2106:1: rule__DataFiltering__Group_3_2__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) ) ;
    public final void rule__DataFiltering__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2110:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) ) )
            // InternalBiLang.g:2111:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) )
            {
            // InternalBiLang.g:2111:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) )
            // InternalBiLang.g:2112:2: ( rule__DataFiltering__FilteringstepAssignment_3_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_2_1()); 
            // InternalBiLang.g:2113:2: ( rule__DataFiltering__FilteringstepAssignment_3_2_1 )
            // InternalBiLang.g:2113:3: rule__DataFiltering__FilteringstepAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__FilteringstepAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_2_1()); 

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
    // $ANTLR end "rule__DataFiltering__Group_3_2__1__Impl"


    // $ANTLR start "rule__DashBoard__Group__0"
    // InternalBiLang.g:2122:1: rule__DashBoard__Group__0 : rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 ;
    public final void rule__DashBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2126:1: ( rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 )
            // InternalBiLang.g:2127:2: rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DashBoard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__1();

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
    // $ANTLR end "rule__DashBoard__Group__0"


    // $ANTLR start "rule__DashBoard__Group__0__Impl"
    // InternalBiLang.g:2134:1: rule__DashBoard__Group__0__Impl : ( ( rule__DashBoard__NameAssignment_0 ) ) ;
    public final void rule__DashBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2138:1: ( ( ( rule__DashBoard__NameAssignment_0 ) ) )
            // InternalBiLang.g:2139:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            {
            // InternalBiLang.g:2139:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            // InternalBiLang.g:2140:2: ( rule__DashBoard__NameAssignment_0 )
            {
             before(grammarAccess.getDashBoardAccess().getNameAssignment_0()); 
            // InternalBiLang.g:2141:2: ( rule__DashBoard__NameAssignment_0 )
            // InternalBiLang.g:2141:3: rule__DashBoard__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__DashBoard__Group__0__Impl"


    // $ANTLR start "rule__DashBoard__Group__1"
    // InternalBiLang.g:2149:1: rule__DashBoard__Group__1 : rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 ;
    public final void rule__DashBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2153:1: ( rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 )
            // InternalBiLang.g:2154:2: rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DashBoard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__2();

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
    // $ANTLR end "rule__DashBoard__Group__1"


    // $ANTLR start "rule__DashBoard__Group__1__Impl"
    // InternalBiLang.g:2161:1: rule__DashBoard__Group__1__Impl : ( '=>' ) ;
    public final void rule__DashBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2165:1: ( ( '=>' ) )
            // InternalBiLang.g:2166:1: ( '=>' )
            {
            // InternalBiLang.g:2166:1: ( '=>' )
            // InternalBiLang.g:2167:2: '=>'
            {
             before(grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__DashBoard__Group__1__Impl"


    // $ANTLR start "rule__DashBoard__Group__2"
    // InternalBiLang.g:2176:1: rule__DashBoard__Group__2 : rule__DashBoard__Group__2__Impl ;
    public final void rule__DashBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2180:1: ( rule__DashBoard__Group__2__Impl )
            // InternalBiLang.g:2181:2: rule__DashBoard__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__2__Impl();

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
    // $ANTLR end "rule__DashBoard__Group__2"


    // $ANTLR start "rule__DashBoard__Group__2__Impl"
    // InternalBiLang.g:2187:1: rule__DashBoard__Group__2__Impl : ( ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* ) ) ;
    public final void rule__DashBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2191:1: ( ( ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* ) ) )
            // InternalBiLang.g:2192:1: ( ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* ) )
            {
            // InternalBiLang.g:2192:1: ( ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* ) )
            // InternalBiLang.g:2193:2: ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* )
            {
            // InternalBiLang.g:2193:2: ( ( rule__DashBoard__Group_2__0 ) )
            // InternalBiLang.g:2194:3: ( rule__DashBoard__Group_2__0 )
            {
             before(grammarAccess.getDashBoardAccess().getGroup_2()); 
            // InternalBiLang.g:2195:3: ( rule__DashBoard__Group_2__0 )
            // InternalBiLang.g:2195:4: rule__DashBoard__Group_2__0
            {
            pushFollow(FOLLOW_8);
            rule__DashBoard__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getGroup_2()); 

            }

            // InternalBiLang.g:2198:2: ( ( rule__DashBoard__Group_2__0 )* )
            // InternalBiLang.g:2199:3: ( rule__DashBoard__Group_2__0 )*
            {
             before(grammarAccess.getDashBoardAccess().getGroup_2()); 
            // InternalBiLang.g:2200:3: ( rule__DashBoard__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBiLang.g:2200:4: rule__DashBoard__Group_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DashBoard__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDashBoardAccess().getGroup_2()); 

            }


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
    // $ANTLR end "rule__DashBoard__Group__2__Impl"


    // $ANTLR start "rule__DashBoard__Group_2__0"
    // InternalBiLang.g:2210:1: rule__DashBoard__Group_2__0 : rule__DashBoard__Group_2__0__Impl rule__DashBoard__Group_2__1 ;
    public final void rule__DashBoard__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2214:1: ( rule__DashBoard__Group_2__0__Impl rule__DashBoard__Group_2__1 )
            // InternalBiLang.g:2215:2: rule__DashBoard__Group_2__0__Impl rule__DashBoard__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__DashBoard__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2__1();

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
    // $ANTLR end "rule__DashBoard__Group_2__0"


    // $ANTLR start "rule__DashBoard__Group_2__0__Impl"
    // InternalBiLang.g:2222:1: rule__DashBoard__Group_2__0__Impl : ( ( rule__DashBoard__FileextractorAssignment_2_0 ) ) ;
    public final void rule__DashBoard__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2226:1: ( ( ( rule__DashBoard__FileextractorAssignment_2_0 ) ) )
            // InternalBiLang.g:2227:1: ( ( rule__DashBoard__FileextractorAssignment_2_0 ) )
            {
            // InternalBiLang.g:2227:1: ( ( rule__DashBoard__FileextractorAssignment_2_0 ) )
            // InternalBiLang.g:2228:2: ( rule__DashBoard__FileextractorAssignment_2_0 )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0()); 
            // InternalBiLang.g:2229:2: ( rule__DashBoard__FileextractorAssignment_2_0 )
            // InternalBiLang.g:2229:3: rule__DashBoard__FileextractorAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__FileextractorAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0()); 

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
    // $ANTLR end "rule__DashBoard__Group_2__0__Impl"


    // $ANTLR start "rule__DashBoard__Group_2__1"
    // InternalBiLang.g:2237:1: rule__DashBoard__Group_2__1 : rule__DashBoard__Group_2__1__Impl rule__DashBoard__Group_2__2 ;
    public final void rule__DashBoard__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2241:1: ( rule__DashBoard__Group_2__1__Impl rule__DashBoard__Group_2__2 )
            // InternalBiLang.g:2242:2: rule__DashBoard__Group_2__1__Impl rule__DashBoard__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__DashBoard__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2__2();

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
    // $ANTLR end "rule__DashBoard__Group_2__1"


    // $ANTLR start "rule__DashBoard__Group_2__1__Impl"
    // InternalBiLang.g:2249:1: rule__DashBoard__Group_2__1__Impl : ( 'plots' ) ;
    public final void rule__DashBoard__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2253:1: ( ( 'plots' ) )
            // InternalBiLang.g:2254:1: ( 'plots' )
            {
            // InternalBiLang.g:2254:1: ( 'plots' )
            // InternalBiLang.g:2255:2: 'plots'
            {
             before(grammarAccess.getDashBoardAccess().getPlotsKeyword_2_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getPlotsKeyword_2_1()); 

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
    // $ANTLR end "rule__DashBoard__Group_2__1__Impl"


    // $ANTLR start "rule__DashBoard__Group_2__2"
    // InternalBiLang.g:2264:1: rule__DashBoard__Group_2__2 : rule__DashBoard__Group_2__2__Impl rule__DashBoard__Group_2__3 ;
    public final void rule__DashBoard__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2268:1: ( rule__DashBoard__Group_2__2__Impl rule__DashBoard__Group_2__3 )
            // InternalBiLang.g:2269:2: rule__DashBoard__Group_2__2__Impl rule__DashBoard__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__DashBoard__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2__3();

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
    // $ANTLR end "rule__DashBoard__Group_2__2"


    // $ANTLR start "rule__DashBoard__Group_2__2__Impl"
    // InternalBiLang.g:2276:1: rule__DashBoard__Group_2__2__Impl : ( '{' ) ;
    public final void rule__DashBoard__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2280:1: ( ( '{' ) )
            // InternalBiLang.g:2281:1: ( '{' )
            {
            // InternalBiLang.g:2281:1: ( '{' )
            // InternalBiLang.g:2282:2: '{'
            {
             before(grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__DashBoard__Group_2__2__Impl"


    // $ANTLR start "rule__DashBoard__Group_2__3"
    // InternalBiLang.g:2291:1: rule__DashBoard__Group_2__3 : rule__DashBoard__Group_2__3__Impl rule__DashBoard__Group_2__4 ;
    public final void rule__DashBoard__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2295:1: ( rule__DashBoard__Group_2__3__Impl rule__DashBoard__Group_2__4 )
            // InternalBiLang.g:2296:2: rule__DashBoard__Group_2__3__Impl rule__DashBoard__Group_2__4
            {
            pushFollow(FOLLOW_22);
            rule__DashBoard__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2__4();

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
    // $ANTLR end "rule__DashBoard__Group_2__3"


    // $ANTLR start "rule__DashBoard__Group_2__3__Impl"
    // InternalBiLang.g:2303:1: rule__DashBoard__Group_2__3__Impl : ( ( rule__DashBoard__PlotAssignment_2_3 ) ) ;
    public final void rule__DashBoard__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2307:1: ( ( ( rule__DashBoard__PlotAssignment_2_3 ) ) )
            // InternalBiLang.g:2308:1: ( ( rule__DashBoard__PlotAssignment_2_3 ) )
            {
            // InternalBiLang.g:2308:1: ( ( rule__DashBoard__PlotAssignment_2_3 ) )
            // InternalBiLang.g:2309:2: ( rule__DashBoard__PlotAssignment_2_3 )
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_2_3()); 
            // InternalBiLang.g:2310:2: ( rule__DashBoard__PlotAssignment_2_3 )
            // InternalBiLang.g:2310:3: rule__DashBoard__PlotAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__PlotAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getPlotAssignment_2_3()); 

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
    // $ANTLR end "rule__DashBoard__Group_2__3__Impl"


    // $ANTLR start "rule__DashBoard__Group_2__4"
    // InternalBiLang.g:2318:1: rule__DashBoard__Group_2__4 : rule__DashBoard__Group_2__4__Impl rule__DashBoard__Group_2__5 ;
    public final void rule__DashBoard__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2322:1: ( rule__DashBoard__Group_2__4__Impl rule__DashBoard__Group_2__5 )
            // InternalBiLang.g:2323:2: rule__DashBoard__Group_2__4__Impl rule__DashBoard__Group_2__5
            {
            pushFollow(FOLLOW_22);
            rule__DashBoard__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2__5();

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
    // $ANTLR end "rule__DashBoard__Group_2__4"


    // $ANTLR start "rule__DashBoard__Group_2__4__Impl"
    // InternalBiLang.g:2330:1: rule__DashBoard__Group_2__4__Impl : ( ( rule__DashBoard__PlotAssignment_2_4 )* ) ;
    public final void rule__DashBoard__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2334:1: ( ( ( rule__DashBoard__PlotAssignment_2_4 )* ) )
            // InternalBiLang.g:2335:1: ( ( rule__DashBoard__PlotAssignment_2_4 )* )
            {
            // InternalBiLang.g:2335:1: ( ( rule__DashBoard__PlotAssignment_2_4 )* )
            // InternalBiLang.g:2336:2: ( rule__DashBoard__PlotAssignment_2_4 )*
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_2_4()); 
            // InternalBiLang.g:2337:2: ( rule__DashBoard__PlotAssignment_2_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44||(LA23_0>=51 && LA23_0<=56)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBiLang.g:2337:3: rule__DashBoard__PlotAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DashBoard__PlotAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDashBoardAccess().getPlotAssignment_2_4()); 

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
    // $ANTLR end "rule__DashBoard__Group_2__4__Impl"


    // $ANTLR start "rule__DashBoard__Group_2__5"
    // InternalBiLang.g:2345:1: rule__DashBoard__Group_2__5 : rule__DashBoard__Group_2__5__Impl ;
    public final void rule__DashBoard__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2349:1: ( rule__DashBoard__Group_2__5__Impl )
            // InternalBiLang.g:2350:2: rule__DashBoard__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2__5__Impl();

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
    // $ANTLR end "rule__DashBoard__Group_2__5"


    // $ANTLR start "rule__DashBoard__Group_2__5__Impl"
    // InternalBiLang.g:2356:1: rule__DashBoard__Group_2__5__Impl : ( '}' ) ;
    public final void rule__DashBoard__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2360:1: ( ( '}' ) )
            // InternalBiLang.g:2361:1: ( '}' )
            {
            // InternalBiLang.g:2361:1: ( '}' )
            // InternalBiLang.g:2362:2: '}'
            {
             before(grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_2_5()); 

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
    // $ANTLR end "rule__DashBoard__Group_2__5__Impl"


    // $ANTLR start "rule__NullReplacement__Group__0"
    // InternalBiLang.g:2372:1: rule__NullReplacement__Group__0 : rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1 ;
    public final void rule__NullReplacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2376:1: ( rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1 )
            // InternalBiLang.g:2377:2: rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__NullReplacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullReplacement__Group__1();

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
    // $ANTLR end "rule__NullReplacement__Group__0"


    // $ANTLR start "rule__NullReplacement__Group__0__Impl"
    // InternalBiLang.g:2384:1: rule__NullReplacement__Group__0__Impl : ( ( rule__NullReplacement__ColNameAssignment_0 ) ) ;
    public final void rule__NullReplacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2388:1: ( ( ( rule__NullReplacement__ColNameAssignment_0 ) ) )
            // InternalBiLang.g:2389:1: ( ( rule__NullReplacement__ColNameAssignment_0 ) )
            {
            // InternalBiLang.g:2389:1: ( ( rule__NullReplacement__ColNameAssignment_0 ) )
            // InternalBiLang.g:2390:2: ( rule__NullReplacement__ColNameAssignment_0 )
            {
             before(grammarAccess.getNullReplacementAccess().getColNameAssignment_0()); 
            // InternalBiLang.g:2391:2: ( rule__NullReplacement__ColNameAssignment_0 )
            // InternalBiLang.g:2391:3: rule__NullReplacement__ColNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NullReplacement__ColNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNullReplacementAccess().getColNameAssignment_0()); 

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
    // $ANTLR end "rule__NullReplacement__Group__0__Impl"


    // $ANTLR start "rule__NullReplacement__Group__1"
    // InternalBiLang.g:2399:1: rule__NullReplacement__Group__1 : rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2 ;
    public final void rule__NullReplacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2403:1: ( rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2 )
            // InternalBiLang.g:2404:2: rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__NullReplacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullReplacement__Group__2();

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
    // $ANTLR end "rule__NullReplacement__Group__1"


    // $ANTLR start "rule__NullReplacement__Group__1__Impl"
    // InternalBiLang.g:2411:1: rule__NullReplacement__Group__1__Impl : ( '=' ) ;
    public final void rule__NullReplacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2415:1: ( ( '=' ) )
            // InternalBiLang.g:2416:1: ( '=' )
            {
            // InternalBiLang.g:2416:1: ( '=' )
            // InternalBiLang.g:2417:2: '='
            {
             before(grammarAccess.getNullReplacementAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNullReplacementAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__NullReplacement__Group__1__Impl"


    // $ANTLR start "rule__NullReplacement__Group__2"
    // InternalBiLang.g:2426:1: rule__NullReplacement__Group__2 : rule__NullReplacement__Group__2__Impl ;
    public final void rule__NullReplacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2430:1: ( rule__NullReplacement__Group__2__Impl )
            // InternalBiLang.g:2431:2: rule__NullReplacement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullReplacement__Group__2__Impl();

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
    // $ANTLR end "rule__NullReplacement__Group__2"


    // $ANTLR start "rule__NullReplacement__Group__2__Impl"
    // InternalBiLang.g:2437:1: rule__NullReplacement__Group__2__Impl : ( ( rule__NullReplacement__Alternatives_2 ) ) ;
    public final void rule__NullReplacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2441:1: ( ( ( rule__NullReplacement__Alternatives_2 ) ) )
            // InternalBiLang.g:2442:1: ( ( rule__NullReplacement__Alternatives_2 ) )
            {
            // InternalBiLang.g:2442:1: ( ( rule__NullReplacement__Alternatives_2 ) )
            // InternalBiLang.g:2443:2: ( rule__NullReplacement__Alternatives_2 )
            {
             before(grammarAccess.getNullReplacementAccess().getAlternatives_2()); 
            // InternalBiLang.g:2444:2: ( rule__NullReplacement__Alternatives_2 )
            // InternalBiLang.g:2444:3: rule__NullReplacement__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__NullReplacement__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getNullReplacementAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__NullReplacement__Group__2__Impl"


    // $ANTLR start "rule__QuantitativeFiltering__Group__0"
    // InternalBiLang.g:2453:1: rule__QuantitativeFiltering__Group__0 : rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 ;
    public final void rule__QuantitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2457:1: ( rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 )
            // InternalBiLang.g:2458:2: rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QuantitativeFiltering__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__Group__1();

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
    // $ANTLR end "rule__QuantitativeFiltering__Group__0"


    // $ANTLR start "rule__QuantitativeFiltering__Group__0__Impl"
    // InternalBiLang.g:2465:1: rule__QuantitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QuantitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2469:1: ( ( () ) )
            // InternalBiLang.g:2470:1: ( () )
            {
            // InternalBiLang.g:2470:1: ( () )
            // InternalBiLang.g:2471:2: ()
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0()); 
            // InternalBiLang.g:2472:2: ()
            // InternalBiLang.g:2472:3: 
            {
            }

             after(grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantitativeFiltering__Group__0__Impl"


    // $ANTLR start "rule__QuantitativeFiltering__Group__1"
    // InternalBiLang.g:2480:1: rule__QuantitativeFiltering__Group__1 : rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 ;
    public final void rule__QuantitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2484:1: ( rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 )
            // InternalBiLang.g:2485:2: rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__QuantitativeFiltering__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__Group__2();

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
    // $ANTLR end "rule__QuantitativeFiltering__Group__1"


    // $ANTLR start "rule__QuantitativeFiltering__Group__1__Impl"
    // InternalBiLang.g:2492:1: rule__QuantitativeFiltering__Group__1__Impl : ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QuantitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2496:1: ( ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:2497:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:2497:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:2498:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:2499:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:2499:3: rule__QuantitativeFiltering__AxisAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__AxisAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_1()); 

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
    // $ANTLR end "rule__QuantitativeFiltering__Group__1__Impl"


    // $ANTLR start "rule__QuantitativeFiltering__Group__2"
    // InternalBiLang.g:2507:1: rule__QuantitativeFiltering__Group__2 : rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 ;
    public final void rule__QuantitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2511:1: ( rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 )
            // InternalBiLang.g:2512:2: rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__QuantitativeFiltering__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__Group__3();

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
    // $ANTLR end "rule__QuantitativeFiltering__Group__2"


    // $ANTLR start "rule__QuantitativeFiltering__Group__2__Impl"
    // InternalBiLang.g:2519:1: rule__QuantitativeFiltering__Group__2__Impl : ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QuantitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2523:1: ( ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2524:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2524:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:2525:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2526:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:2526:3: rule__QuantitativeFiltering__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantitativeFilteringAccess().getOperatorAssignment_2()); 

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
    // $ANTLR end "rule__QuantitativeFiltering__Group__2__Impl"


    // $ANTLR start "rule__QuantitativeFiltering__Group__3"
    // InternalBiLang.g:2534:1: rule__QuantitativeFiltering__Group__3 : rule__QuantitativeFiltering__Group__3__Impl ;
    public final void rule__QuantitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2538:1: ( rule__QuantitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:2539:2: rule__QuantitativeFiltering__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__Group__3__Impl();

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
    // $ANTLR end "rule__QuantitativeFiltering__Group__3"


    // $ANTLR start "rule__QuantitativeFiltering__Group__3__Impl"
    // InternalBiLang.g:2545:1: rule__QuantitativeFiltering__Group__3__Impl : ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) ;
    public final void rule__QuantitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2549:1: ( ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) )
            // InternalBiLang.g:2550:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            {
            // InternalBiLang.g:2550:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            // InternalBiLang.g:2551:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_3()); 
            // InternalBiLang.g:2552:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            // InternalBiLang.g:2552:3: rule__QuantitativeFiltering__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_3()); 

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
    // $ANTLR end "rule__QuantitativeFiltering__Group__3__Impl"


    // $ANTLR start "rule__QualitativeFiltering__Group__0"
    // InternalBiLang.g:2561:1: rule__QualitativeFiltering__Group__0 : rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 ;
    public final void rule__QualitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2565:1: ( rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 )
            // InternalBiLang.g:2566:2: rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualitativeFiltering__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__Group__1();

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
    // $ANTLR end "rule__QualitativeFiltering__Group__0"


    // $ANTLR start "rule__QualitativeFiltering__Group__0__Impl"
    // InternalBiLang.g:2573:1: rule__QualitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QualitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2577:1: ( ( () ) )
            // InternalBiLang.g:2578:1: ( () )
            {
            // InternalBiLang.g:2578:1: ( () )
            // InternalBiLang.g:2579:2: ()
            {
             before(grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0()); 
            // InternalBiLang.g:2580:2: ()
            // InternalBiLang.g:2580:3: 
            {
            }

             after(grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitativeFiltering__Group__0__Impl"


    // $ANTLR start "rule__QualitativeFiltering__Group__1"
    // InternalBiLang.g:2588:1: rule__QualitativeFiltering__Group__1 : rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 ;
    public final void rule__QualitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2592:1: ( rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 )
            // InternalBiLang.g:2593:2: rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__QualitativeFiltering__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__Group__2();

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
    // $ANTLR end "rule__QualitativeFiltering__Group__1"


    // $ANTLR start "rule__QualitativeFiltering__Group__1__Impl"
    // InternalBiLang.g:2600:1: rule__QualitativeFiltering__Group__1__Impl : ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QualitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2604:1: ( ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:2605:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:2605:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:2606:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:2607:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:2607:3: rule__QualitativeFiltering__AxisAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__AxisAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_1()); 

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
    // $ANTLR end "rule__QualitativeFiltering__Group__1__Impl"


    // $ANTLR start "rule__QualitativeFiltering__Group__2"
    // InternalBiLang.g:2615:1: rule__QualitativeFiltering__Group__2 : rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 ;
    public final void rule__QualitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2619:1: ( rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 )
            // InternalBiLang.g:2620:2: rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__QualitativeFiltering__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__Group__3();

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
    // $ANTLR end "rule__QualitativeFiltering__Group__2"


    // $ANTLR start "rule__QualitativeFiltering__Group__2__Impl"
    // InternalBiLang.g:2627:1: rule__QualitativeFiltering__Group__2__Impl : ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QualitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2631:1: ( ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2632:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2632:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:2633:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2634:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:2634:3: rule__QualitativeFiltering__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualitativeFilteringAccess().getOperatorAssignment_2()); 

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
    // $ANTLR end "rule__QualitativeFiltering__Group__2__Impl"


    // $ANTLR start "rule__QualitativeFiltering__Group__3"
    // InternalBiLang.g:2642:1: rule__QualitativeFiltering__Group__3 : rule__QualitativeFiltering__Group__3__Impl ;
    public final void rule__QualitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2646:1: ( rule__QualitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:2647:2: rule__QualitativeFiltering__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__Group__3__Impl();

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
    // $ANTLR end "rule__QualitativeFiltering__Group__3"


    // $ANTLR start "rule__QualitativeFiltering__Group__3__Impl"
    // InternalBiLang.g:2653:1: rule__QualitativeFiltering__Group__3__Impl : ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) ;
    public final void rule__QualitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2657:1: ( ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) )
            // InternalBiLang.g:2658:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            {
            // InternalBiLang.g:2658:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            // InternalBiLang.g:2659:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_3()); 
            // InternalBiLang.g:2660:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            // InternalBiLang.g:2660:3: rule__QualitativeFiltering__LabelsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__LabelsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_3()); 

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
    // $ANTLR end "rule__QualitativeFiltering__Group__3__Impl"


    // $ANTLR start "rule__MathOperation__Group__0"
    // InternalBiLang.g:2669:1: rule__MathOperation__Group__0 : rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 ;
    public final void rule__MathOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2673:1: ( rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 )
            // InternalBiLang.g:2674:2: rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__MathOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__1();

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
    // $ANTLR end "rule__MathOperation__Group__0"


    // $ANTLR start "rule__MathOperation__Group__0__Impl"
    // InternalBiLang.g:2681:1: rule__MathOperation__Group__0__Impl : ( ( '(' )? ) ;
    public final void rule__MathOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2685:1: ( ( ( '(' )? ) )
            // InternalBiLang.g:2686:1: ( ( '(' )? )
            {
            // InternalBiLang.g:2686:1: ( ( '(' )? )
            // InternalBiLang.g:2687:2: ( '(' )?
            {
             before(grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_0()); 
            // InternalBiLang.g:2688:2: ( '(' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBiLang.g:2688:3: '('
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__MathOperation__Group__0__Impl"


    // $ANTLR start "rule__MathOperation__Group__1"
    // InternalBiLang.g:2696:1: rule__MathOperation__Group__1 : rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 ;
    public final void rule__MathOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2700:1: ( rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 )
            // InternalBiLang.g:2701:2: rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__MathOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__2();

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
    // $ANTLR end "rule__MathOperation__Group__1"


    // $ANTLR start "rule__MathOperation__Group__1__Impl"
    // InternalBiLang.g:2708:1: rule__MathOperation__Group__1__Impl : ( 'l' ) ;
    public final void rule__MathOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2712:1: ( ( 'l' ) )
            // InternalBiLang.g:2713:1: ( 'l' )
            {
            // InternalBiLang.g:2713:1: ( 'l' )
            // InternalBiLang.g:2714:2: 'l'
            {
             before(grammarAccess.getMathOperationAccess().getLKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMathOperationAccess().getLKeyword_1()); 

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
    // $ANTLR end "rule__MathOperation__Group__1__Impl"


    // $ANTLR start "rule__MathOperation__Group__2"
    // InternalBiLang.g:2723:1: rule__MathOperation__Group__2 : rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 ;
    public final void rule__MathOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2727:1: ( rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 )
            // InternalBiLang.g:2728:2: rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__MathOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__3();

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
    // $ANTLR end "rule__MathOperation__Group__2"


    // $ANTLR start "rule__MathOperation__Group__2__Impl"
    // InternalBiLang.g:2735:1: rule__MathOperation__Group__2__Impl : ( ( rule__MathOperation__LsideAssignment_2 ) ) ;
    public final void rule__MathOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2739:1: ( ( ( rule__MathOperation__LsideAssignment_2 ) ) )
            // InternalBiLang.g:2740:1: ( ( rule__MathOperation__LsideAssignment_2 ) )
            {
            // InternalBiLang.g:2740:1: ( ( rule__MathOperation__LsideAssignment_2 ) )
            // InternalBiLang.g:2741:2: ( rule__MathOperation__LsideAssignment_2 )
            {
             before(grammarAccess.getMathOperationAccess().getLsideAssignment_2()); 
            // InternalBiLang.g:2742:2: ( rule__MathOperation__LsideAssignment_2 )
            // InternalBiLang.g:2742:3: rule__MathOperation__LsideAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__LsideAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getLsideAssignment_2()); 

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
    // $ANTLR end "rule__MathOperation__Group__2__Impl"


    // $ANTLR start "rule__MathOperation__Group__3"
    // InternalBiLang.g:2750:1: rule__MathOperation__Group__3 : rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 ;
    public final void rule__MathOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2754:1: ( rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 )
            // InternalBiLang.g:2755:2: rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__MathOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__4();

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
    // $ANTLR end "rule__MathOperation__Group__3"


    // $ANTLR start "rule__MathOperation__Group__3__Impl"
    // InternalBiLang.g:2762:1: rule__MathOperation__Group__3__Impl : ( ( rule__MathOperation__OperatorAssignment_3 ) ) ;
    public final void rule__MathOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2766:1: ( ( ( rule__MathOperation__OperatorAssignment_3 ) ) )
            // InternalBiLang.g:2767:1: ( ( rule__MathOperation__OperatorAssignment_3 ) )
            {
            // InternalBiLang.g:2767:1: ( ( rule__MathOperation__OperatorAssignment_3 ) )
            // InternalBiLang.g:2768:2: ( rule__MathOperation__OperatorAssignment_3 )
            {
             before(grammarAccess.getMathOperationAccess().getOperatorAssignment_3()); 
            // InternalBiLang.g:2769:2: ( rule__MathOperation__OperatorAssignment_3 )
            // InternalBiLang.g:2769:3: rule__MathOperation__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getOperatorAssignment_3()); 

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
    // $ANTLR end "rule__MathOperation__Group__3__Impl"


    // $ANTLR start "rule__MathOperation__Group__4"
    // InternalBiLang.g:2777:1: rule__MathOperation__Group__4 : rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 ;
    public final void rule__MathOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2781:1: ( rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 )
            // InternalBiLang.g:2782:2: rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__MathOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__5();

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
    // $ANTLR end "rule__MathOperation__Group__4"


    // $ANTLR start "rule__MathOperation__Group__4__Impl"
    // InternalBiLang.g:2789:1: rule__MathOperation__Group__4__Impl : ( 'r' ) ;
    public final void rule__MathOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2793:1: ( ( 'r' ) )
            // InternalBiLang.g:2794:1: ( 'r' )
            {
            // InternalBiLang.g:2794:1: ( 'r' )
            // InternalBiLang.g:2795:2: 'r'
            {
             before(grammarAccess.getMathOperationAccess().getRKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMathOperationAccess().getRKeyword_4()); 

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
    // $ANTLR end "rule__MathOperation__Group__4__Impl"


    // $ANTLR start "rule__MathOperation__Group__5"
    // InternalBiLang.g:2804:1: rule__MathOperation__Group__5 : rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 ;
    public final void rule__MathOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2808:1: ( rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 )
            // InternalBiLang.g:2809:2: rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__MathOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__6();

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
    // $ANTLR end "rule__MathOperation__Group__5"


    // $ANTLR start "rule__MathOperation__Group__5__Impl"
    // InternalBiLang.g:2816:1: rule__MathOperation__Group__5__Impl : ( ( rule__MathOperation__RsideAssignment_5 ) ) ;
    public final void rule__MathOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2820:1: ( ( ( rule__MathOperation__RsideAssignment_5 ) ) )
            // InternalBiLang.g:2821:1: ( ( rule__MathOperation__RsideAssignment_5 ) )
            {
            // InternalBiLang.g:2821:1: ( ( rule__MathOperation__RsideAssignment_5 ) )
            // InternalBiLang.g:2822:2: ( rule__MathOperation__RsideAssignment_5 )
            {
             before(grammarAccess.getMathOperationAccess().getRsideAssignment_5()); 
            // InternalBiLang.g:2823:2: ( rule__MathOperation__RsideAssignment_5 )
            // InternalBiLang.g:2823:3: rule__MathOperation__RsideAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__RsideAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getRsideAssignment_5()); 

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
    // $ANTLR end "rule__MathOperation__Group__5__Impl"


    // $ANTLR start "rule__MathOperation__Group__6"
    // InternalBiLang.g:2831:1: rule__MathOperation__Group__6 : rule__MathOperation__Group__6__Impl ;
    public final void rule__MathOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2835:1: ( rule__MathOperation__Group__6__Impl )
            // InternalBiLang.g:2836:2: rule__MathOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__6__Impl();

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
    // $ANTLR end "rule__MathOperation__Group__6"


    // $ANTLR start "rule__MathOperation__Group__6__Impl"
    // InternalBiLang.g:2842:1: rule__MathOperation__Group__6__Impl : ( ( ')' )? ) ;
    public final void rule__MathOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2846:1: ( ( ( ')' )? ) )
            // InternalBiLang.g:2847:1: ( ( ')' )? )
            {
            // InternalBiLang.g:2847:1: ( ( ')' )? )
            // InternalBiLang.g:2848:2: ( ')' )?
            {
             before(grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_6()); 
            // InternalBiLang.g:2849:2: ( ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:2849:3: ')'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__MathOperation__Group__6__Impl"


    // $ANTLR start "rule__ColReference__Group__0"
    // InternalBiLang.g:2858:1: rule__ColReference__Group__0 : rule__ColReference__Group__0__Impl rule__ColReference__Group__1 ;
    public final void rule__ColReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2862:1: ( rule__ColReference__Group__0__Impl rule__ColReference__Group__1 )
            // InternalBiLang.g:2863:2: rule__ColReference__Group__0__Impl rule__ColReference__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ColReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColReference__Group__1();

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
    // $ANTLR end "rule__ColReference__Group__0"


    // $ANTLR start "rule__ColReference__Group__0__Impl"
    // InternalBiLang.g:2870:1: rule__ColReference__Group__0__Impl : ( () ) ;
    public final void rule__ColReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2874:1: ( ( () ) )
            // InternalBiLang.g:2875:1: ( () )
            {
            // InternalBiLang.g:2875:1: ( () )
            // InternalBiLang.g:2876:2: ()
            {
             before(grammarAccess.getColReferenceAccess().getColReferenceAction_0()); 
            // InternalBiLang.g:2877:2: ()
            // InternalBiLang.g:2877:3: 
            {
            }

             after(grammarAccess.getColReferenceAccess().getColReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColReference__Group__0__Impl"


    // $ANTLR start "rule__ColReference__Group__1"
    // InternalBiLang.g:2885:1: rule__ColReference__Group__1 : rule__ColReference__Group__1__Impl ;
    public final void rule__ColReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2889:1: ( rule__ColReference__Group__1__Impl )
            // InternalBiLang.g:2890:2: rule__ColReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColReference__Group__1__Impl();

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
    // $ANTLR end "rule__ColReference__Group__1"


    // $ANTLR start "rule__ColReference__Group__1__Impl"
    // InternalBiLang.g:2896:1: rule__ColReference__Group__1__Impl : ( ( rule__ColReference__TargetAssignment_1 ) ) ;
    public final void rule__ColReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2900:1: ( ( ( rule__ColReference__TargetAssignment_1 ) ) )
            // InternalBiLang.g:2901:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            {
            // InternalBiLang.g:2901:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            // InternalBiLang.g:2902:2: ( rule__ColReference__TargetAssignment_1 )
            {
             before(grammarAccess.getColReferenceAccess().getTargetAssignment_1()); 
            // InternalBiLang.g:2903:2: ( rule__ColReference__TargetAssignment_1 )
            // InternalBiLang.g:2903:3: rule__ColReference__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ColReference__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColReferenceAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__ColReference__Group__1__Impl"


    // $ANTLR start "rule__StatisticalOperation__Group__0"
    // InternalBiLang.g:2912:1: rule__StatisticalOperation__Group__0 : rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 ;
    public final void rule__StatisticalOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2916:1: ( rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 )
            // InternalBiLang.g:2917:2: rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__StatisticalOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatisticalOperation__Group__1();

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
    // $ANTLR end "rule__StatisticalOperation__Group__0"


    // $ANTLR start "rule__StatisticalOperation__Group__0__Impl"
    // InternalBiLang.g:2924:1: rule__StatisticalOperation__Group__0__Impl : ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) ;
    public final void rule__StatisticalOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2928:1: ( ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) )
            // InternalBiLang.g:2929:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            {
            // InternalBiLang.g:2929:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            // InternalBiLang.g:2930:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getOperatorAssignment_0()); 
            // InternalBiLang.g:2931:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            // InternalBiLang.g:2931:3: rule__StatisticalOperation__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StatisticalOperation__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatisticalOperationAccess().getOperatorAssignment_0()); 

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
    // $ANTLR end "rule__StatisticalOperation__Group__0__Impl"


    // $ANTLR start "rule__StatisticalOperation__Group__1"
    // InternalBiLang.g:2939:1: rule__StatisticalOperation__Group__1 : rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 ;
    public final void rule__StatisticalOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2943:1: ( rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 )
            // InternalBiLang.g:2944:2: rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StatisticalOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatisticalOperation__Group__2();

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
    // $ANTLR end "rule__StatisticalOperation__Group__1"


    // $ANTLR start "rule__StatisticalOperation__Group__1__Impl"
    // InternalBiLang.g:2951:1: rule__StatisticalOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__StatisticalOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2955:1: ( ( '(' ) )
            // InternalBiLang.g:2956:1: ( '(' )
            {
            // InternalBiLang.g:2956:1: ( '(' )
            // InternalBiLang.g:2957:2: '('
            {
             before(grammarAccess.getStatisticalOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStatisticalOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__StatisticalOperation__Group__1__Impl"


    // $ANTLR start "rule__StatisticalOperation__Group__2"
    // InternalBiLang.g:2966:1: rule__StatisticalOperation__Group__2 : rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 ;
    public final void rule__StatisticalOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2970:1: ( rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 )
            // InternalBiLang.g:2971:2: rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__StatisticalOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatisticalOperation__Group__3();

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
    // $ANTLR end "rule__StatisticalOperation__Group__2"


    // $ANTLR start "rule__StatisticalOperation__Group__2__Impl"
    // InternalBiLang.g:2978:1: rule__StatisticalOperation__Group__2__Impl : ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) ;
    public final void rule__StatisticalOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2982:1: ( ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) )
            // InternalBiLang.g:2983:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            {
            // InternalBiLang.g:2983:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            // InternalBiLang.g:2984:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getColreferenceAssignment_2()); 
            // InternalBiLang.g:2985:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            // InternalBiLang.g:2985:3: rule__StatisticalOperation__ColreferenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StatisticalOperation__ColreferenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatisticalOperationAccess().getColreferenceAssignment_2()); 

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
    // $ANTLR end "rule__StatisticalOperation__Group__2__Impl"


    // $ANTLR start "rule__StatisticalOperation__Group__3"
    // InternalBiLang.g:2993:1: rule__StatisticalOperation__Group__3 : rule__StatisticalOperation__Group__3__Impl ;
    public final void rule__StatisticalOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2997:1: ( rule__StatisticalOperation__Group__3__Impl )
            // InternalBiLang.g:2998:2: rule__StatisticalOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatisticalOperation__Group__3__Impl();

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
    // $ANTLR end "rule__StatisticalOperation__Group__3"


    // $ANTLR start "rule__StatisticalOperation__Group__3__Impl"
    // InternalBiLang.g:3004:1: rule__StatisticalOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__StatisticalOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3008:1: ( ( ')' ) )
            // InternalBiLang.g:3009:1: ( ')' )
            {
            // InternalBiLang.g:3009:1: ( ')' )
            // InternalBiLang.g:3010:2: ')'
            {
             before(grammarAccess.getStatisticalOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStatisticalOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__StatisticalOperation__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalBiLang.g:3020:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3024:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalBiLang.g:3025:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalBiLang.g:3032:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3036:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3037:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3037:1: ( ( '-' )? )
            // InternalBiLang.g:3038:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:3039:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:3039:3: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalBiLang.g:3047:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3051:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalBiLang.g:3052:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalBiLang.g:3059:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3063:1: ( ( ( RULE_INT )? ) )
            // InternalBiLang.g:3064:1: ( ( RULE_INT )? )
            {
            // InternalBiLang.g:3064:1: ( ( RULE_INT )? )
            // InternalBiLang.g:3065:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalBiLang.g:3066:2: ( RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:3066:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalBiLang.g:3074:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3078:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalBiLang.g:3079:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalBiLang.g:3086:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3090:1: ( ( '.' ) )
            // InternalBiLang.g:3091:1: ( '.' )
            {
            // InternalBiLang.g:3091:1: ( '.' )
            // InternalBiLang.g:3092:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalBiLang.g:3101:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3105:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalBiLang.g:3106:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

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
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalBiLang.g:3113:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3117:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3118:1: ( RULE_INT )
            {
            // InternalBiLang.g:3118:1: ( RULE_INT )
            // InternalBiLang.g:3119:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalBiLang.g:3128:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3132:1: ( rule__EFloat__Group__4__Impl )
            // InternalBiLang.g:3133:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

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
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalBiLang.g:3139:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3143:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalBiLang.g:3144:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalBiLang.g:3144:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalBiLang.g:3145:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalBiLang.g:3146:2: ( rule__EFloat__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=11 && LA28_0<=12)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBiLang.g:3146:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalBiLang.g:3155:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3159:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalBiLang.g:3160:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

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
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalBiLang.g:3167:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3171:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalBiLang.g:3172:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalBiLang.g:3172:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalBiLang.g:3173:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalBiLang.g:3174:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalBiLang.g:3174:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalBiLang.g:3182:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3186:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalBiLang.g:3187:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_35);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

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
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalBiLang.g:3194:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3198:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3199:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3199:1: ( ( '-' )? )
            // InternalBiLang.g:3200:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBiLang.g:3201:2: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBiLang.g:3201:3: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalBiLang.g:3209:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3213:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalBiLang.g:3214:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalBiLang.g:3220:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3224:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3225:1: ( RULE_INT )
            {
            // InternalBiLang.g:3225:1: ( RULE_INT )
            // InternalBiLang.g:3226:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBiLang.g:3236:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3240:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBiLang.g:3241:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBiLang.g:3248:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3252:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3253:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3253:1: ( ( '-' )? )
            // InternalBiLang.g:3254:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:3255:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBiLang.g:3255:3: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBiLang.g:3263:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3267:1: ( rule__EInt__Group__1__Impl )
            // InternalBiLang.g:3268:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBiLang.g:3274:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3278:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3279:1: ( RULE_INT )
            {
            // InternalBiLang.g:3279:1: ( RULE_INT )
            // InternalBiLang.g:3280:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__BarPlot__Group__0"
    // InternalBiLang.g:3290:1: rule__BarPlot__Group__0 : rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 ;
    public final void rule__BarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3294:1: ( rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 )
            // InternalBiLang.g:3295:2: rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__BarPlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__1();

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
    // $ANTLR end "rule__BarPlot__Group__0"


    // $ANTLR start "rule__BarPlot__Group__0__Impl"
    // InternalBiLang.g:3302:1: rule__BarPlot__Group__0__Impl : ( () ) ;
    public final void rule__BarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3306:1: ( ( () ) )
            // InternalBiLang.g:3307:1: ( () )
            {
            // InternalBiLang.g:3307:1: ( () )
            // InternalBiLang.g:3308:2: ()
            {
             before(grammarAccess.getBarPlotAccess().getBarPlotAction_0()); 
            // InternalBiLang.g:3309:2: ()
            // InternalBiLang.g:3309:3: 
            {
            }

             after(grammarAccess.getBarPlotAccess().getBarPlotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarPlot__Group__0__Impl"


    // $ANTLR start "rule__BarPlot__Group__1"
    // InternalBiLang.g:3317:1: rule__BarPlot__Group__1 : rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 ;
    public final void rule__BarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3321:1: ( rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 )
            // InternalBiLang.g:3322:2: rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BarPlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__2();

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
    // $ANTLR end "rule__BarPlot__Group__1"


    // $ANTLR start "rule__BarPlot__Group__1__Impl"
    // InternalBiLang.g:3329:1: rule__BarPlot__Group__1__Impl : ( 'bar' ) ;
    public final void rule__BarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3333:1: ( ( 'bar' ) )
            // InternalBiLang.g:3334:1: ( 'bar' )
            {
            // InternalBiLang.g:3334:1: ( 'bar' )
            // InternalBiLang.g:3335:2: 'bar'
            {
             before(grammarAccess.getBarPlotAccess().getBarKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBarPlotAccess().getBarKeyword_1()); 

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
    // $ANTLR end "rule__BarPlot__Group__1__Impl"


    // $ANTLR start "rule__BarPlot__Group__2"
    // InternalBiLang.g:3344:1: rule__BarPlot__Group__2 : rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 ;
    public final void rule__BarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3348:1: ( rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 )
            // InternalBiLang.g:3349:2: rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__BarPlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__3();

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
    // $ANTLR end "rule__BarPlot__Group__2"


    // $ANTLR start "rule__BarPlot__Group__2__Impl"
    // InternalBiLang.g:3356:1: rule__BarPlot__Group__2__Impl : ( ( rule__BarPlot__NameAssignment_2 ) ) ;
    public final void rule__BarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3360:1: ( ( ( rule__BarPlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3361:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3361:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            // InternalBiLang.g:3362:2: ( rule__BarPlot__NameAssignment_2 )
            {
             before(grammarAccess.getBarPlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3363:2: ( rule__BarPlot__NameAssignment_2 )
            // InternalBiLang.g:3363:3: rule__BarPlot__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBarPlotAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__BarPlot__Group__2__Impl"


    // $ANTLR start "rule__BarPlot__Group__3"
    // InternalBiLang.g:3371:1: rule__BarPlot__Group__3 : rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 ;
    public final void rule__BarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3375:1: ( rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 )
            // InternalBiLang.g:3376:2: rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__BarPlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__4();

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
    // $ANTLR end "rule__BarPlot__Group__3"


    // $ANTLR start "rule__BarPlot__Group__3__Impl"
    // InternalBiLang.g:3383:1: rule__BarPlot__Group__3__Impl : ( '->' ) ;
    public final void rule__BarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3387:1: ( ( '->' ) )
            // InternalBiLang.g:3388:1: ( '->' )
            {
            // InternalBiLang.g:3388:1: ( '->' )
            // InternalBiLang.g:3389:2: '->'
            {
             before(grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__BarPlot__Group__3__Impl"


    // $ANTLR start "rule__BarPlot__Group__4"
    // InternalBiLang.g:3398:1: rule__BarPlot__Group__4 : rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 ;
    public final void rule__BarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3402:1: ( rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 )
            // InternalBiLang.g:3403:2: rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__BarPlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__5();

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
    // $ANTLR end "rule__BarPlot__Group__4"


    // $ANTLR start "rule__BarPlot__Group__4__Impl"
    // InternalBiLang.g:3410:1: rule__BarPlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__BarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3414:1: ( ( 'xAx' ) )
            // InternalBiLang.g:3415:1: ( 'xAx' )
            {
            // InternalBiLang.g:3415:1: ( 'xAx' )
            // InternalBiLang.g:3416:2: 'xAx'
            {
             before(grammarAccess.getBarPlotAccess().getXAxKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBarPlotAccess().getXAxKeyword_4()); 

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
    // $ANTLR end "rule__BarPlot__Group__4__Impl"


    // $ANTLR start "rule__BarPlot__Group__5"
    // InternalBiLang.g:3425:1: rule__BarPlot__Group__5 : rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 ;
    public final void rule__BarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3429:1: ( rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 )
            // InternalBiLang.g:3430:2: rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__BarPlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__6();

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
    // $ANTLR end "rule__BarPlot__Group__5"


    // $ANTLR start "rule__BarPlot__Group__5__Impl"
    // InternalBiLang.g:3437:1: rule__BarPlot__Group__5__Impl : ( ( rule__BarPlot__XAxisAssignment_5 ) ) ;
    public final void rule__BarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3441:1: ( ( ( rule__BarPlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:3442:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:3442:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:3443:2: ( rule__BarPlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getBarPlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:3444:2: ( rule__BarPlot__XAxisAssignment_5 )
            // InternalBiLang.g:3444:3: rule__BarPlot__XAxisAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__XAxisAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBarPlotAccess().getXAxisAssignment_5()); 

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
    // $ANTLR end "rule__BarPlot__Group__5__Impl"


    // $ANTLR start "rule__BarPlot__Group__6"
    // InternalBiLang.g:3452:1: rule__BarPlot__Group__6 : rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 ;
    public final void rule__BarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3456:1: ( rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 )
            // InternalBiLang.g:3457:2: rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__BarPlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__7();

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
    // $ANTLR end "rule__BarPlot__Group__6"


    // $ANTLR start "rule__BarPlot__Group__6__Impl"
    // InternalBiLang.g:3464:1: rule__BarPlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__BarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3468:1: ( ( 'yA' ) )
            // InternalBiLang.g:3469:1: ( 'yA' )
            {
            // InternalBiLang.g:3469:1: ( 'yA' )
            // InternalBiLang.g:3470:2: 'yA'
            {
             before(grammarAccess.getBarPlotAccess().getYAKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBarPlotAccess().getYAKeyword_6()); 

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
    // $ANTLR end "rule__BarPlot__Group__6__Impl"


    // $ANTLR start "rule__BarPlot__Group__7"
    // InternalBiLang.g:3479:1: rule__BarPlot__Group__7 : rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 ;
    public final void rule__BarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3483:1: ( rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 )
            // InternalBiLang.g:3484:2: rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__BarPlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__8();

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
    // $ANTLR end "rule__BarPlot__Group__7"


    // $ANTLR start "rule__BarPlot__Group__7__Impl"
    // InternalBiLang.g:3491:1: rule__BarPlot__Group__7__Impl : ( ( rule__BarPlot__YAxisAssignment_7 ) ) ;
    public final void rule__BarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3495:1: ( ( ( rule__BarPlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3496:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3496:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3497:2: ( rule__BarPlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getBarPlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3498:2: ( rule__BarPlot__YAxisAssignment_7 )
            // InternalBiLang.g:3498:3: rule__BarPlot__YAxisAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__YAxisAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBarPlotAccess().getYAxisAssignment_7()); 

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
    // $ANTLR end "rule__BarPlot__Group__7__Impl"


    // $ANTLR start "rule__BarPlot__Group__8"
    // InternalBiLang.g:3506:1: rule__BarPlot__Group__8 : rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 ;
    public final void rule__BarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3510:1: ( rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 )
            // InternalBiLang.g:3511:2: rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__BarPlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__9();

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
    // $ANTLR end "rule__BarPlot__Group__8"


    // $ANTLR start "rule__BarPlot__Group__8__Impl"
    // InternalBiLang.g:3518:1: rule__BarPlot__Group__8__Impl : ( ( rule__BarPlot__Group_8__0 )? ) ;
    public final void rule__BarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3522:1: ( ( ( rule__BarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:3523:1: ( ( rule__BarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3523:1: ( ( rule__BarPlot__Group_8__0 )? )
            // InternalBiLang.g:3524:2: ( rule__BarPlot__Group_8__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:3525:2: ( rule__BarPlot__Group_8__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBiLang.g:3525:3: rule__BarPlot__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarPlot__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarPlotAccess().getGroup_8()); 

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
    // $ANTLR end "rule__BarPlot__Group__8__Impl"


    // $ANTLR start "rule__BarPlot__Group__9"
    // InternalBiLang.g:3533:1: rule__BarPlot__Group__9 : rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 ;
    public final void rule__BarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3537:1: ( rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 )
            // InternalBiLang.g:3538:2: rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10
            {
            pushFollow(FOLLOW_40);
            rule__BarPlot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__10();

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
    // $ANTLR end "rule__BarPlot__Group__9"


    // $ANTLR start "rule__BarPlot__Group__9__Impl"
    // InternalBiLang.g:3545:1: rule__BarPlot__Group__9__Impl : ( ( rule__BarPlot__Group_9__0 )? ) ;
    public final void rule__BarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3549:1: ( ( ( rule__BarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:3550:1: ( ( rule__BarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:3550:1: ( ( rule__BarPlot__Group_9__0 )? )
            // InternalBiLang.g:3551:2: ( rule__BarPlot__Group_9__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:3552:2: ( rule__BarPlot__Group_9__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBiLang.g:3552:3: rule__BarPlot__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarPlot__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarPlotAccess().getGroup_9()); 

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
    // $ANTLR end "rule__BarPlot__Group__9__Impl"


    // $ANTLR start "rule__BarPlot__Group__10"
    // InternalBiLang.g:3560:1: rule__BarPlot__Group__10 : rule__BarPlot__Group__10__Impl ;
    public final void rule__BarPlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3564:1: ( rule__BarPlot__Group__10__Impl )
            // InternalBiLang.g:3565:2: rule__BarPlot__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__Group__10__Impl();

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
    // $ANTLR end "rule__BarPlot__Group__10"


    // $ANTLR start "rule__BarPlot__Group__10__Impl"
    // InternalBiLang.g:3571:1: rule__BarPlot__Group__10__Impl : ( ( rule__BarPlot__Group_10__0 )? ) ;
    public final void rule__BarPlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3575:1: ( ( ( rule__BarPlot__Group_10__0 )? ) )
            // InternalBiLang.g:3576:1: ( ( rule__BarPlot__Group_10__0 )? )
            {
            // InternalBiLang.g:3576:1: ( ( rule__BarPlot__Group_10__0 )? )
            // InternalBiLang.g:3577:2: ( rule__BarPlot__Group_10__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_10()); 
            // InternalBiLang.g:3578:2: ( rule__BarPlot__Group_10__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:3578:3: rule__BarPlot__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BarPlot__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBarPlotAccess().getGroup_10()); 

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
    // $ANTLR end "rule__BarPlot__Group__10__Impl"


    // $ANTLR start "rule__BarPlot__Group_8__0"
    // InternalBiLang.g:3587:1: rule__BarPlot__Group_8__0 : rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 ;
    public final void rule__BarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3591:1: ( rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 )
            // InternalBiLang.g:3592:2: rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1
            {
            pushFollow(FOLLOW_35);
            rule__BarPlot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group_8__1();

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
    // $ANTLR end "rule__BarPlot__Group_8__0"


    // $ANTLR start "rule__BarPlot__Group_8__0__Impl"
    // InternalBiLang.g:3599:1: rule__BarPlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__BarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3603:1: ( ( 'loc' ) )
            // InternalBiLang.g:3604:1: ( 'loc' )
            {
            // InternalBiLang.g:3604:1: ( 'loc' )
            // InternalBiLang.g:3605:2: 'loc'
            {
             before(grammarAccess.getBarPlotAccess().getLocKeyword_8_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBarPlotAccess().getLocKeyword_8_0()); 

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
    // $ANTLR end "rule__BarPlot__Group_8__0__Impl"


    // $ANTLR start "rule__BarPlot__Group_8__1"
    // InternalBiLang.g:3614:1: rule__BarPlot__Group_8__1 : rule__BarPlot__Group_8__1__Impl ;
    public final void rule__BarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3618:1: ( rule__BarPlot__Group_8__1__Impl )
            // InternalBiLang.g:3619:2: rule__BarPlot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__Group_8__1__Impl();

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
    // $ANTLR end "rule__BarPlot__Group_8__1"


    // $ANTLR start "rule__BarPlot__Group_8__1__Impl"
    // InternalBiLang.g:3625:1: rule__BarPlot__Group_8__1__Impl : ( ( rule__BarPlot__LocationAssignment_8_1 ) ) ;
    public final void rule__BarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3629:1: ( ( ( rule__BarPlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:3630:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:3630:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:3631:2: ( rule__BarPlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getBarPlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:3632:2: ( rule__BarPlot__LocationAssignment_8_1 )
            // InternalBiLang.g:3632:3: rule__BarPlot__LocationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__LocationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBarPlotAccess().getLocationAssignment_8_1()); 

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
    // $ANTLR end "rule__BarPlot__Group_8__1__Impl"


    // $ANTLR start "rule__BarPlot__Group_9__0"
    // InternalBiLang.g:3641:1: rule__BarPlot__Group_9__0 : rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 ;
    public final void rule__BarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3645:1: ( rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 )
            // InternalBiLang.g:3646:2: rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__BarPlot__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group_9__1();

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
    // $ANTLR end "rule__BarPlot__Group_9__0"


    // $ANTLR start "rule__BarPlot__Group_9__0__Impl"
    // InternalBiLang.g:3653:1: rule__BarPlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__BarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3657:1: ( ( 'colors' ) )
            // InternalBiLang.g:3658:1: ( 'colors' )
            {
            // InternalBiLang.g:3658:1: ( 'colors' )
            // InternalBiLang.g:3659:2: 'colors'
            {
             before(grammarAccess.getBarPlotAccess().getColorsKeyword_9_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBarPlotAccess().getColorsKeyword_9_0()); 

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
    // $ANTLR end "rule__BarPlot__Group_9__0__Impl"


    // $ANTLR start "rule__BarPlot__Group_9__1"
    // InternalBiLang.g:3668:1: rule__BarPlot__Group_9__1 : rule__BarPlot__Group_9__1__Impl ;
    public final void rule__BarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3672:1: ( rule__BarPlot__Group_9__1__Impl )
            // InternalBiLang.g:3673:2: rule__BarPlot__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__Group_9__1__Impl();

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
    // $ANTLR end "rule__BarPlot__Group_9__1"


    // $ANTLR start "rule__BarPlot__Group_9__1__Impl"
    // InternalBiLang.g:3679:1: rule__BarPlot__Group_9__1__Impl : ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__BarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3683:1: ( ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:3684:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:3684:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:3685:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getBarPlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:3686:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:3686:3: rule__BarPlot__ColorsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__ColorsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBarPlotAccess().getColorsAssignment_9_1()); 

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
    // $ANTLR end "rule__BarPlot__Group_9__1__Impl"


    // $ANTLR start "rule__BarPlot__Group_10__0"
    // InternalBiLang.g:3695:1: rule__BarPlot__Group_10__0 : rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 ;
    public final void rule__BarPlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3699:1: ( rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 )
            // InternalBiLang.g:3700:2: rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1
            {
            pushFollow(FOLLOW_26);
            rule__BarPlot__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BarPlot__Group_10__1();

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
    // $ANTLR end "rule__BarPlot__Group_10__0"


    // $ANTLR start "rule__BarPlot__Group_10__0__Impl"
    // InternalBiLang.g:3707:1: rule__BarPlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__BarPlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3711:1: ( ( 'thickness' ) )
            // InternalBiLang.g:3712:1: ( 'thickness' )
            {
            // InternalBiLang.g:3712:1: ( 'thickness' )
            // InternalBiLang.g:3713:2: 'thickness'
            {
             before(grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0()); 

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
    // $ANTLR end "rule__BarPlot__Group_10__0__Impl"


    // $ANTLR start "rule__BarPlot__Group_10__1"
    // InternalBiLang.g:3722:1: rule__BarPlot__Group_10__1 : rule__BarPlot__Group_10__1__Impl ;
    public final void rule__BarPlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3726:1: ( rule__BarPlot__Group_10__1__Impl )
            // InternalBiLang.g:3727:2: rule__BarPlot__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__Group_10__1__Impl();

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
    // $ANTLR end "rule__BarPlot__Group_10__1"


    // $ANTLR start "rule__BarPlot__Group_10__1__Impl"
    // InternalBiLang.g:3733:1: rule__BarPlot__Group_10__1__Impl : ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__BarPlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3737:1: ( ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:3738:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:3738:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:3739:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:3740:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:3740:3: rule__BarPlot__ThicknessAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__ThicknessAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1()); 

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
    // $ANTLR end "rule__BarPlot__Group_10__1__Impl"


    // $ANTLR start "rule__LinePlot__Group__0"
    // InternalBiLang.g:3749:1: rule__LinePlot__Group__0 : rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 ;
    public final void rule__LinePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3753:1: ( rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 )
            // InternalBiLang.g:3754:2: rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__LinePlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__1();

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
    // $ANTLR end "rule__LinePlot__Group__0"


    // $ANTLR start "rule__LinePlot__Group__0__Impl"
    // InternalBiLang.g:3761:1: rule__LinePlot__Group__0__Impl : ( () ) ;
    public final void rule__LinePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3765:1: ( ( () ) )
            // InternalBiLang.g:3766:1: ( () )
            {
            // InternalBiLang.g:3766:1: ( () )
            // InternalBiLang.g:3767:2: ()
            {
             before(grammarAccess.getLinePlotAccess().getLinePlotAction_0()); 
            // InternalBiLang.g:3768:2: ()
            // InternalBiLang.g:3768:3: 
            {
            }

             after(grammarAccess.getLinePlotAccess().getLinePlotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinePlot__Group__0__Impl"


    // $ANTLR start "rule__LinePlot__Group__1"
    // InternalBiLang.g:3776:1: rule__LinePlot__Group__1 : rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 ;
    public final void rule__LinePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3780:1: ( rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 )
            // InternalBiLang.g:3781:2: rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LinePlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__2();

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
    // $ANTLR end "rule__LinePlot__Group__1"


    // $ANTLR start "rule__LinePlot__Group__1__Impl"
    // InternalBiLang.g:3788:1: rule__LinePlot__Group__1__Impl : ( 'line' ) ;
    public final void rule__LinePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3792:1: ( ( 'line' ) )
            // InternalBiLang.g:3793:1: ( 'line' )
            {
            // InternalBiLang.g:3793:1: ( 'line' )
            // InternalBiLang.g:3794:2: 'line'
            {
             before(grammarAccess.getLinePlotAccess().getLineKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLinePlotAccess().getLineKeyword_1()); 

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
    // $ANTLR end "rule__LinePlot__Group__1__Impl"


    // $ANTLR start "rule__LinePlot__Group__2"
    // InternalBiLang.g:3803:1: rule__LinePlot__Group__2 : rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 ;
    public final void rule__LinePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3807:1: ( rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 )
            // InternalBiLang.g:3808:2: rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__LinePlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__3();

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
    // $ANTLR end "rule__LinePlot__Group__2"


    // $ANTLR start "rule__LinePlot__Group__2__Impl"
    // InternalBiLang.g:3815:1: rule__LinePlot__Group__2__Impl : ( ( rule__LinePlot__NameAssignment_2 ) ) ;
    public final void rule__LinePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3819:1: ( ( ( rule__LinePlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3820:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3820:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            // InternalBiLang.g:3821:2: ( rule__LinePlot__NameAssignment_2 )
            {
             before(grammarAccess.getLinePlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3822:2: ( rule__LinePlot__NameAssignment_2 )
            // InternalBiLang.g:3822:3: rule__LinePlot__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinePlotAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__LinePlot__Group__2__Impl"


    // $ANTLR start "rule__LinePlot__Group__3"
    // InternalBiLang.g:3830:1: rule__LinePlot__Group__3 : rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 ;
    public final void rule__LinePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3834:1: ( rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 )
            // InternalBiLang.g:3835:2: rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__LinePlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__4();

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
    // $ANTLR end "rule__LinePlot__Group__3"


    // $ANTLR start "rule__LinePlot__Group__3__Impl"
    // InternalBiLang.g:3842:1: rule__LinePlot__Group__3__Impl : ( '->' ) ;
    public final void rule__LinePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3846:1: ( ( '->' ) )
            // InternalBiLang.g:3847:1: ( '->' )
            {
            // InternalBiLang.g:3847:1: ( '->' )
            // InternalBiLang.g:3848:2: '->'
            {
             before(grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__LinePlot__Group__3__Impl"


    // $ANTLR start "rule__LinePlot__Group__4"
    // InternalBiLang.g:3857:1: rule__LinePlot__Group__4 : rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 ;
    public final void rule__LinePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3861:1: ( rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 )
            // InternalBiLang.g:3862:2: rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__LinePlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__5();

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
    // $ANTLR end "rule__LinePlot__Group__4"


    // $ANTLR start "rule__LinePlot__Group__4__Impl"
    // InternalBiLang.g:3869:1: rule__LinePlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__LinePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3873:1: ( ( 'xAx' ) )
            // InternalBiLang.g:3874:1: ( 'xAx' )
            {
            // InternalBiLang.g:3874:1: ( 'xAx' )
            // InternalBiLang.g:3875:2: 'xAx'
            {
             before(grammarAccess.getLinePlotAccess().getXAxKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLinePlotAccess().getXAxKeyword_4()); 

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
    // $ANTLR end "rule__LinePlot__Group__4__Impl"


    // $ANTLR start "rule__LinePlot__Group__5"
    // InternalBiLang.g:3884:1: rule__LinePlot__Group__5 : rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 ;
    public final void rule__LinePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3888:1: ( rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 )
            // InternalBiLang.g:3889:2: rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__LinePlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__6();

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
    // $ANTLR end "rule__LinePlot__Group__5"


    // $ANTLR start "rule__LinePlot__Group__5__Impl"
    // InternalBiLang.g:3896:1: rule__LinePlot__Group__5__Impl : ( ( rule__LinePlot__XAxisAssignment_5 ) ) ;
    public final void rule__LinePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3900:1: ( ( ( rule__LinePlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:3901:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:3901:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:3902:2: ( rule__LinePlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getLinePlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:3903:2: ( rule__LinePlot__XAxisAssignment_5 )
            // InternalBiLang.g:3903:3: rule__LinePlot__XAxisAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__XAxisAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinePlotAccess().getXAxisAssignment_5()); 

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
    // $ANTLR end "rule__LinePlot__Group__5__Impl"


    // $ANTLR start "rule__LinePlot__Group__6"
    // InternalBiLang.g:3911:1: rule__LinePlot__Group__6 : rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 ;
    public final void rule__LinePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3915:1: ( rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 )
            // InternalBiLang.g:3916:2: rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__LinePlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__7();

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
    // $ANTLR end "rule__LinePlot__Group__6"


    // $ANTLR start "rule__LinePlot__Group__6__Impl"
    // InternalBiLang.g:3923:1: rule__LinePlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__LinePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3927:1: ( ( 'yA' ) )
            // InternalBiLang.g:3928:1: ( 'yA' )
            {
            // InternalBiLang.g:3928:1: ( 'yA' )
            // InternalBiLang.g:3929:2: 'yA'
            {
             before(grammarAccess.getLinePlotAccess().getYAKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLinePlotAccess().getYAKeyword_6()); 

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
    // $ANTLR end "rule__LinePlot__Group__6__Impl"


    // $ANTLR start "rule__LinePlot__Group__7"
    // InternalBiLang.g:3938:1: rule__LinePlot__Group__7 : rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 ;
    public final void rule__LinePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3942:1: ( rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 )
            // InternalBiLang.g:3943:2: rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__LinePlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__8();

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
    // $ANTLR end "rule__LinePlot__Group__7"


    // $ANTLR start "rule__LinePlot__Group__7__Impl"
    // InternalBiLang.g:3950:1: rule__LinePlot__Group__7__Impl : ( ( rule__LinePlot__YAxisAssignment_7 ) ) ;
    public final void rule__LinePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3954:1: ( ( ( rule__LinePlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3955:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3955:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3956:2: ( rule__LinePlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getLinePlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3957:2: ( rule__LinePlot__YAxisAssignment_7 )
            // InternalBiLang.g:3957:3: rule__LinePlot__YAxisAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__YAxisAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLinePlotAccess().getYAxisAssignment_7()); 

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
    // $ANTLR end "rule__LinePlot__Group__7__Impl"


    // $ANTLR start "rule__LinePlot__Group__8"
    // InternalBiLang.g:3965:1: rule__LinePlot__Group__8 : rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 ;
    public final void rule__LinePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3969:1: ( rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 )
            // InternalBiLang.g:3970:2: rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__LinePlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__9();

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
    // $ANTLR end "rule__LinePlot__Group__8"


    // $ANTLR start "rule__LinePlot__Group__8__Impl"
    // InternalBiLang.g:3977:1: rule__LinePlot__Group__8__Impl : ( ( rule__LinePlot__Group_8__0 )? ) ;
    public final void rule__LinePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3981:1: ( ( ( rule__LinePlot__Group_8__0 )? ) )
            // InternalBiLang.g:3982:1: ( ( rule__LinePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3982:1: ( ( rule__LinePlot__Group_8__0 )? )
            // InternalBiLang.g:3983:2: ( rule__LinePlot__Group_8__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_8()); 
            // InternalBiLang.g:3984:2: ( rule__LinePlot__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:3984:3: rule__LinePlot__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinePlot__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinePlotAccess().getGroup_8()); 

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
    // $ANTLR end "rule__LinePlot__Group__8__Impl"


    // $ANTLR start "rule__LinePlot__Group__9"
    // InternalBiLang.g:3992:1: rule__LinePlot__Group__9 : rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 ;
    public final void rule__LinePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3996:1: ( rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 )
            // InternalBiLang.g:3997:2: rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10
            {
            pushFollow(FOLLOW_40);
            rule__LinePlot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__10();

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
    // $ANTLR end "rule__LinePlot__Group__9"


    // $ANTLR start "rule__LinePlot__Group__9__Impl"
    // InternalBiLang.g:4004:1: rule__LinePlot__Group__9__Impl : ( ( rule__LinePlot__Group_9__0 )? ) ;
    public final void rule__LinePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4008:1: ( ( ( rule__LinePlot__Group_9__0 )? ) )
            // InternalBiLang.g:4009:1: ( ( rule__LinePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4009:1: ( ( rule__LinePlot__Group_9__0 )? )
            // InternalBiLang.g:4010:2: ( rule__LinePlot__Group_9__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_9()); 
            // InternalBiLang.g:4011:2: ( rule__LinePlot__Group_9__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:4011:3: rule__LinePlot__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinePlot__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinePlotAccess().getGroup_9()); 

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
    // $ANTLR end "rule__LinePlot__Group__9__Impl"


    // $ANTLR start "rule__LinePlot__Group__10"
    // InternalBiLang.g:4019:1: rule__LinePlot__Group__10 : rule__LinePlot__Group__10__Impl ;
    public final void rule__LinePlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4023:1: ( rule__LinePlot__Group__10__Impl )
            // InternalBiLang.g:4024:2: rule__LinePlot__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__Group__10__Impl();

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
    // $ANTLR end "rule__LinePlot__Group__10"


    // $ANTLR start "rule__LinePlot__Group__10__Impl"
    // InternalBiLang.g:4030:1: rule__LinePlot__Group__10__Impl : ( ( rule__LinePlot__Group_10__0 )? ) ;
    public final void rule__LinePlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4034:1: ( ( ( rule__LinePlot__Group_10__0 )? ) )
            // InternalBiLang.g:4035:1: ( ( rule__LinePlot__Group_10__0 )? )
            {
            // InternalBiLang.g:4035:1: ( ( rule__LinePlot__Group_10__0 )? )
            // InternalBiLang.g:4036:2: ( rule__LinePlot__Group_10__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_10()); 
            // InternalBiLang.g:4037:2: ( rule__LinePlot__Group_10__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:4037:3: rule__LinePlot__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinePlot__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinePlotAccess().getGroup_10()); 

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
    // $ANTLR end "rule__LinePlot__Group__10__Impl"


    // $ANTLR start "rule__LinePlot__Group_8__0"
    // InternalBiLang.g:4046:1: rule__LinePlot__Group_8__0 : rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 ;
    public final void rule__LinePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4050:1: ( rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 )
            // InternalBiLang.g:4051:2: rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1
            {
            pushFollow(FOLLOW_35);
            rule__LinePlot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group_8__1();

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
    // $ANTLR end "rule__LinePlot__Group_8__0"


    // $ANTLR start "rule__LinePlot__Group_8__0__Impl"
    // InternalBiLang.g:4058:1: rule__LinePlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__LinePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4062:1: ( ( 'loc' ) )
            // InternalBiLang.g:4063:1: ( 'loc' )
            {
            // InternalBiLang.g:4063:1: ( 'loc' )
            // InternalBiLang.g:4064:2: 'loc'
            {
             before(grammarAccess.getLinePlotAccess().getLocKeyword_8_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLinePlotAccess().getLocKeyword_8_0()); 

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
    // $ANTLR end "rule__LinePlot__Group_8__0__Impl"


    // $ANTLR start "rule__LinePlot__Group_8__1"
    // InternalBiLang.g:4073:1: rule__LinePlot__Group_8__1 : rule__LinePlot__Group_8__1__Impl ;
    public final void rule__LinePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4077:1: ( rule__LinePlot__Group_8__1__Impl )
            // InternalBiLang.g:4078:2: rule__LinePlot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__Group_8__1__Impl();

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
    // $ANTLR end "rule__LinePlot__Group_8__1"


    // $ANTLR start "rule__LinePlot__Group_8__1__Impl"
    // InternalBiLang.g:4084:1: rule__LinePlot__Group_8__1__Impl : ( ( rule__LinePlot__LocationAssignment_8_1 ) ) ;
    public final void rule__LinePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4088:1: ( ( ( rule__LinePlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:4089:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:4089:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:4090:2: ( rule__LinePlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:4091:2: ( rule__LinePlot__LocationAssignment_8_1 )
            // InternalBiLang.g:4091:3: rule__LinePlot__LocationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__LocationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1()); 

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
    // $ANTLR end "rule__LinePlot__Group_8__1__Impl"


    // $ANTLR start "rule__LinePlot__Group_9__0"
    // InternalBiLang.g:4100:1: rule__LinePlot__Group_9__0 : rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 ;
    public final void rule__LinePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4104:1: ( rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 )
            // InternalBiLang.g:4105:2: rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__LinePlot__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group_9__1();

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
    // $ANTLR end "rule__LinePlot__Group_9__0"


    // $ANTLR start "rule__LinePlot__Group_9__0__Impl"
    // InternalBiLang.g:4112:1: rule__LinePlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__LinePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4116:1: ( ( 'colors' ) )
            // InternalBiLang.g:4117:1: ( 'colors' )
            {
            // InternalBiLang.g:4117:1: ( 'colors' )
            // InternalBiLang.g:4118:2: 'colors'
            {
             before(grammarAccess.getLinePlotAccess().getColorsKeyword_9_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLinePlotAccess().getColorsKeyword_9_0()); 

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
    // $ANTLR end "rule__LinePlot__Group_9__0__Impl"


    // $ANTLR start "rule__LinePlot__Group_9__1"
    // InternalBiLang.g:4127:1: rule__LinePlot__Group_9__1 : rule__LinePlot__Group_9__1__Impl ;
    public final void rule__LinePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4131:1: ( rule__LinePlot__Group_9__1__Impl )
            // InternalBiLang.g:4132:2: rule__LinePlot__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__Group_9__1__Impl();

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
    // $ANTLR end "rule__LinePlot__Group_9__1"


    // $ANTLR start "rule__LinePlot__Group_9__1__Impl"
    // InternalBiLang.g:4138:1: rule__LinePlot__Group_9__1__Impl : ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__LinePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4142:1: ( ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:4143:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:4143:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:4144:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getLinePlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:4145:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:4145:3: rule__LinePlot__ColorsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__ColorsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getLinePlotAccess().getColorsAssignment_9_1()); 

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
    // $ANTLR end "rule__LinePlot__Group_9__1__Impl"


    // $ANTLR start "rule__LinePlot__Group_10__0"
    // InternalBiLang.g:4154:1: rule__LinePlot__Group_10__0 : rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 ;
    public final void rule__LinePlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4158:1: ( rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 )
            // InternalBiLang.g:4159:2: rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1
            {
            pushFollow(FOLLOW_26);
            rule__LinePlot__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinePlot__Group_10__1();

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
    // $ANTLR end "rule__LinePlot__Group_10__0"


    // $ANTLR start "rule__LinePlot__Group_10__0__Impl"
    // InternalBiLang.g:4166:1: rule__LinePlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__LinePlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4170:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4171:1: ( 'thickness' )
            {
            // InternalBiLang.g:4171:1: ( 'thickness' )
            // InternalBiLang.g:4172:2: 'thickness'
            {
             before(grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0()); 

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
    // $ANTLR end "rule__LinePlot__Group_10__0__Impl"


    // $ANTLR start "rule__LinePlot__Group_10__1"
    // InternalBiLang.g:4181:1: rule__LinePlot__Group_10__1 : rule__LinePlot__Group_10__1__Impl ;
    public final void rule__LinePlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4185:1: ( rule__LinePlot__Group_10__1__Impl )
            // InternalBiLang.g:4186:2: rule__LinePlot__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__Group_10__1__Impl();

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
    // $ANTLR end "rule__LinePlot__Group_10__1"


    // $ANTLR start "rule__LinePlot__Group_10__1__Impl"
    // InternalBiLang.g:4192:1: rule__LinePlot__Group_10__1__Impl : ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__LinePlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4196:1: ( ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:4197:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:4197:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:4198:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:4199:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:4199:3: rule__LinePlot__ThicknessAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__ThicknessAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1()); 

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
    // $ANTLR end "rule__LinePlot__Group_10__1__Impl"


    // $ANTLR start "rule__DonutPlot__Group__0"
    // InternalBiLang.g:4208:1: rule__DonutPlot__Group__0 : rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 ;
    public final void rule__DonutPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4212:1: ( rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 )
            // InternalBiLang.g:4213:2: rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DonutPlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__1();

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
    // $ANTLR end "rule__DonutPlot__Group__0"


    // $ANTLR start "rule__DonutPlot__Group__0__Impl"
    // InternalBiLang.g:4220:1: rule__DonutPlot__Group__0__Impl : ( 'donut' ) ;
    public final void rule__DonutPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4224:1: ( ( 'donut' ) )
            // InternalBiLang.g:4225:1: ( 'donut' )
            {
            // InternalBiLang.g:4225:1: ( 'donut' )
            // InternalBiLang.g:4226:2: 'donut'
            {
             before(grammarAccess.getDonutPlotAccess().getDonutKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getDonutKeyword_0()); 

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
    // $ANTLR end "rule__DonutPlot__Group__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group__1"
    // InternalBiLang.g:4235:1: rule__DonutPlot__Group__1 : rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 ;
    public final void rule__DonutPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4239:1: ( rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 )
            // InternalBiLang.g:4240:2: rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__DonutPlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__2();

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
    // $ANTLR end "rule__DonutPlot__Group__1"


    // $ANTLR start "rule__DonutPlot__Group__1__Impl"
    // InternalBiLang.g:4247:1: rule__DonutPlot__Group__1__Impl : ( ( rule__DonutPlot__NameAssignment_1 ) ) ;
    public final void rule__DonutPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4251:1: ( ( ( rule__DonutPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4252:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4252:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            // InternalBiLang.g:4253:2: ( rule__DonutPlot__NameAssignment_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4254:2: ( rule__DonutPlot__NameAssignment_1 )
            // InternalBiLang.g:4254:3: rule__DonutPlot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DonutPlot__Group__1__Impl"


    // $ANTLR start "rule__DonutPlot__Group__2"
    // InternalBiLang.g:4262:1: rule__DonutPlot__Group__2 : rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 ;
    public final void rule__DonutPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4266:1: ( rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 )
            // InternalBiLang.g:4267:2: rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__DonutPlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__3();

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
    // $ANTLR end "rule__DonutPlot__Group__2"


    // $ANTLR start "rule__DonutPlot__Group__2__Impl"
    // InternalBiLang.g:4274:1: rule__DonutPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__DonutPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4278:1: ( ( '->' ) )
            // InternalBiLang.g:4279:1: ( '->' )
            {
            // InternalBiLang.g:4279:1: ( '->' )
            // InternalBiLang.g:4280:2: '->'
            {
             before(grammarAccess.getDonutPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__DonutPlot__Group__2__Impl"


    // $ANTLR start "rule__DonutPlot__Group__3"
    // InternalBiLang.g:4289:1: rule__DonutPlot__Group__3 : rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 ;
    public final void rule__DonutPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4293:1: ( rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 )
            // InternalBiLang.g:4294:2: rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DonutPlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__4();

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
    // $ANTLR end "rule__DonutPlot__Group__3"


    // $ANTLR start "rule__DonutPlot__Group__3__Impl"
    // InternalBiLang.g:4301:1: rule__DonutPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__DonutPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4305:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4306:1: ( 'xAx' )
            {
            // InternalBiLang.g:4306:1: ( 'xAx' )
            // InternalBiLang.g:4307:2: 'xAx'
            {
             before(grammarAccess.getDonutPlotAccess().getXAxKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getXAxKeyword_3()); 

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
    // $ANTLR end "rule__DonutPlot__Group__3__Impl"


    // $ANTLR start "rule__DonutPlot__Group__4"
    // InternalBiLang.g:4316:1: rule__DonutPlot__Group__4 : rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 ;
    public final void rule__DonutPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4320:1: ( rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 )
            // InternalBiLang.g:4321:2: rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__DonutPlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__5();

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
    // $ANTLR end "rule__DonutPlot__Group__4"


    // $ANTLR start "rule__DonutPlot__Group__4__Impl"
    // InternalBiLang.g:4328:1: rule__DonutPlot__Group__4__Impl : ( ( rule__DonutPlot__XAxisAssignment_4 ) ) ;
    public final void rule__DonutPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4332:1: ( ( ( rule__DonutPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4333:1: ( ( rule__DonutPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4333:1: ( ( rule__DonutPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4334:2: ( rule__DonutPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getDonutPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4335:2: ( rule__DonutPlot__XAxisAssignment_4 )
            // InternalBiLang.g:4335:3: rule__DonutPlot__XAxisAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__XAxisAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getXAxisAssignment_4()); 

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
    // $ANTLR end "rule__DonutPlot__Group__4__Impl"


    // $ANTLR start "rule__DonutPlot__Group__5"
    // InternalBiLang.g:4343:1: rule__DonutPlot__Group__5 : rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 ;
    public final void rule__DonutPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4347:1: ( rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 )
            // InternalBiLang.g:4348:2: rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__DonutPlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__6();

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
    // $ANTLR end "rule__DonutPlot__Group__5"


    // $ANTLR start "rule__DonutPlot__Group__5__Impl"
    // InternalBiLang.g:4355:1: rule__DonutPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__DonutPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4359:1: ( ( 'yA' ) )
            // InternalBiLang.g:4360:1: ( 'yA' )
            {
            // InternalBiLang.g:4360:1: ( 'yA' )
            // InternalBiLang.g:4361:2: 'yA'
            {
             before(grammarAccess.getDonutPlotAccess().getYAKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getYAKeyword_5()); 

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
    // $ANTLR end "rule__DonutPlot__Group__5__Impl"


    // $ANTLR start "rule__DonutPlot__Group__6"
    // InternalBiLang.g:4370:1: rule__DonutPlot__Group__6 : rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7 ;
    public final void rule__DonutPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4374:1: ( rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7 )
            // InternalBiLang.g:4375:2: rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__DonutPlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__7();

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
    // $ANTLR end "rule__DonutPlot__Group__6"


    // $ANTLR start "rule__DonutPlot__Group__6__Impl"
    // InternalBiLang.g:4382:1: rule__DonutPlot__Group__6__Impl : ( ( rule__DonutPlot__YAxisAssignment_6 ) ) ;
    public final void rule__DonutPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4386:1: ( ( ( rule__DonutPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:4387:1: ( ( rule__DonutPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:4387:1: ( ( rule__DonutPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:4388:2: ( rule__DonutPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getDonutPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:4389:2: ( rule__DonutPlot__YAxisAssignment_6 )
            // InternalBiLang.g:4389:3: rule__DonutPlot__YAxisAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__YAxisAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getYAxisAssignment_6()); 

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
    // $ANTLR end "rule__DonutPlot__Group__6__Impl"


    // $ANTLR start "rule__DonutPlot__Group__7"
    // InternalBiLang.g:4397:1: rule__DonutPlot__Group__7 : rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8 ;
    public final void rule__DonutPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4401:1: ( rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8 )
            // InternalBiLang.g:4402:2: rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__DonutPlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__8();

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
    // $ANTLR end "rule__DonutPlot__Group__7"


    // $ANTLR start "rule__DonutPlot__Group__7__Impl"
    // InternalBiLang.g:4409:1: rule__DonutPlot__Group__7__Impl : ( ( rule__DonutPlot__Group_7__0 )? ) ;
    public final void rule__DonutPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4413:1: ( ( ( rule__DonutPlot__Group_7__0 )? ) )
            // InternalBiLang.g:4414:1: ( ( rule__DonutPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:4414:1: ( ( rule__DonutPlot__Group_7__0 )? )
            // InternalBiLang.g:4415:2: ( rule__DonutPlot__Group_7__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_7()); 
            // InternalBiLang.g:4416:2: ( rule__DonutPlot__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:4416:3: rule__DonutPlot__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DonutPlot__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDonutPlotAccess().getGroup_7()); 

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
    // $ANTLR end "rule__DonutPlot__Group__7__Impl"


    // $ANTLR start "rule__DonutPlot__Group__8"
    // InternalBiLang.g:4424:1: rule__DonutPlot__Group__8 : rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9 ;
    public final void rule__DonutPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4428:1: ( rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9 )
            // InternalBiLang.g:4429:2: rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__DonutPlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__9();

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
    // $ANTLR end "rule__DonutPlot__Group__8"


    // $ANTLR start "rule__DonutPlot__Group__8__Impl"
    // InternalBiLang.g:4436:1: rule__DonutPlot__Group__8__Impl : ( ( rule__DonutPlot__Group_8__0 )? ) ;
    public final void rule__DonutPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4440:1: ( ( ( rule__DonutPlot__Group_8__0 )? ) )
            // InternalBiLang.g:4441:1: ( ( rule__DonutPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4441:1: ( ( rule__DonutPlot__Group_8__0 )? )
            // InternalBiLang.g:4442:2: ( rule__DonutPlot__Group_8__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_8()); 
            // InternalBiLang.g:4443:2: ( rule__DonutPlot__Group_8__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:4443:3: rule__DonutPlot__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DonutPlot__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDonutPlotAccess().getGroup_8()); 

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
    // $ANTLR end "rule__DonutPlot__Group__8__Impl"


    // $ANTLR start "rule__DonutPlot__Group__9"
    // InternalBiLang.g:4451:1: rule__DonutPlot__Group__9 : rule__DonutPlot__Group__9__Impl ;
    public final void rule__DonutPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4455:1: ( rule__DonutPlot__Group__9__Impl )
            // InternalBiLang.g:4456:2: rule__DonutPlot__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__9__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group__9"


    // $ANTLR start "rule__DonutPlot__Group__9__Impl"
    // InternalBiLang.g:4462:1: rule__DonutPlot__Group__9__Impl : ( ( rule__DonutPlot__Group_9__0 )? ) ;
    public final void rule__DonutPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4466:1: ( ( ( rule__DonutPlot__Group_9__0 )? ) )
            // InternalBiLang.g:4467:1: ( ( rule__DonutPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4467:1: ( ( rule__DonutPlot__Group_9__0 )? )
            // InternalBiLang.g:4468:2: ( rule__DonutPlot__Group_9__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_9()); 
            // InternalBiLang.g:4469:2: ( rule__DonutPlot__Group_9__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:4469:3: rule__DonutPlot__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DonutPlot__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDonutPlotAccess().getGroup_9()); 

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
    // $ANTLR end "rule__DonutPlot__Group__9__Impl"


    // $ANTLR start "rule__DonutPlot__Group_7__0"
    // InternalBiLang.g:4478:1: rule__DonutPlot__Group_7__0 : rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1 ;
    public final void rule__DonutPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4482:1: ( rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1 )
            // InternalBiLang.g:4483:2: rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1
            {
            pushFollow(FOLLOW_35);
            rule__DonutPlot__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_7__1();

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
    // $ANTLR end "rule__DonutPlot__Group_7__0"


    // $ANTLR start "rule__DonutPlot__Group_7__0__Impl"
    // InternalBiLang.g:4490:1: rule__DonutPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__DonutPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4494:1: ( ( 'loc' ) )
            // InternalBiLang.g:4495:1: ( 'loc' )
            {
            // InternalBiLang.g:4495:1: ( 'loc' )
            // InternalBiLang.g:4496:2: 'loc'
            {
             before(grammarAccess.getDonutPlotAccess().getLocKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getLocKeyword_7_0()); 

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
    // $ANTLR end "rule__DonutPlot__Group_7__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group_7__1"
    // InternalBiLang.g:4505:1: rule__DonutPlot__Group_7__1 : rule__DonutPlot__Group_7__1__Impl ;
    public final void rule__DonutPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4509:1: ( rule__DonutPlot__Group_7__1__Impl )
            // InternalBiLang.g:4510:2: rule__DonutPlot__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_7__1__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group_7__1"


    // $ANTLR start "rule__DonutPlot__Group_7__1__Impl"
    // InternalBiLang.g:4516:1: rule__DonutPlot__Group_7__1__Impl : ( ( rule__DonutPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__DonutPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4520:1: ( ( ( rule__DonutPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:4521:1: ( ( rule__DonutPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:4521:1: ( ( rule__DonutPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:4522:2: ( rule__DonutPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:4523:2: ( rule__DonutPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:4523:3: rule__DonutPlot__LocationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__LocationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getLocationAssignment_7_1()); 

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
    // $ANTLR end "rule__DonutPlot__Group_7__1__Impl"


    // $ANTLR start "rule__DonutPlot__Group_8__0"
    // InternalBiLang.g:4532:1: rule__DonutPlot__Group_8__0 : rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1 ;
    public final void rule__DonutPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4536:1: ( rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1 )
            // InternalBiLang.g:4537:2: rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__DonutPlot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_8__1();

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
    // $ANTLR end "rule__DonutPlot__Group_8__0"


    // $ANTLR start "rule__DonutPlot__Group_8__0__Impl"
    // InternalBiLang.g:4544:1: rule__DonutPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__DonutPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4548:1: ( ( 'colors' ) )
            // InternalBiLang.g:4549:1: ( 'colors' )
            {
            // InternalBiLang.g:4549:1: ( 'colors' )
            // InternalBiLang.g:4550:2: 'colors'
            {
             before(grammarAccess.getDonutPlotAccess().getColorsKeyword_8_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getColorsKeyword_8_0()); 

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
    // $ANTLR end "rule__DonutPlot__Group_8__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group_8__1"
    // InternalBiLang.g:4559:1: rule__DonutPlot__Group_8__1 : rule__DonutPlot__Group_8__1__Impl ;
    public final void rule__DonutPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4563:1: ( rule__DonutPlot__Group_8__1__Impl )
            // InternalBiLang.g:4564:2: rule__DonutPlot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_8__1__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group_8__1"


    // $ANTLR start "rule__DonutPlot__Group_8__1__Impl"
    // InternalBiLang.g:4570:1: rule__DonutPlot__Group_8__1__Impl : ( ( rule__DonutPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__DonutPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4574:1: ( ( ( rule__DonutPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:4575:1: ( ( rule__DonutPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:4575:1: ( ( rule__DonutPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:4576:2: ( rule__DonutPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:4577:2: ( rule__DonutPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:4577:3: rule__DonutPlot__ColorsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__ColorsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getColorsAssignment_8_1()); 

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
    // $ANTLR end "rule__DonutPlot__Group_8__1__Impl"


    // $ANTLR start "rule__DonutPlot__Group_9__0"
    // InternalBiLang.g:4586:1: rule__DonutPlot__Group_9__0 : rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1 ;
    public final void rule__DonutPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4590:1: ( rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1 )
            // InternalBiLang.g:4591:2: rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__DonutPlot__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_9__1();

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
    // $ANTLR end "rule__DonutPlot__Group_9__0"


    // $ANTLR start "rule__DonutPlot__Group_9__0__Impl"
    // InternalBiLang.g:4598:1: rule__DonutPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__DonutPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4602:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4603:1: ( 'thickness' )
            {
            // InternalBiLang.g:4603:1: ( 'thickness' )
            // InternalBiLang.g:4604:2: 'thickness'
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessKeyword_9_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getThicknessKeyword_9_0()); 

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
    // $ANTLR end "rule__DonutPlot__Group_9__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group_9__1"
    // InternalBiLang.g:4613:1: rule__DonutPlot__Group_9__1 : rule__DonutPlot__Group_9__1__Impl ;
    public final void rule__DonutPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4617:1: ( rule__DonutPlot__Group_9__1__Impl )
            // InternalBiLang.g:4618:2: rule__DonutPlot__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_9__1__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group_9__1"


    // $ANTLR start "rule__DonutPlot__Group_9__1__Impl"
    // InternalBiLang.g:4624:1: rule__DonutPlot__Group_9__1__Impl : ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__DonutPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4628:1: ( ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:4629:1: ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:4629:1: ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:4630:2: ( rule__DonutPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:4631:2: ( rule__DonutPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:4631:3: rule__DonutPlot__ThicknessAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__ThicknessAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getThicknessAssignment_9_1()); 

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
    // $ANTLR end "rule__DonutPlot__Group_9__1__Impl"


    // $ANTLR start "rule__PiePlot__Group__0"
    // InternalBiLang.g:4640:1: rule__PiePlot__Group__0 : rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 ;
    public final void rule__PiePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4644:1: ( rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 )
            // InternalBiLang.g:4645:2: rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PiePlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__1();

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
    // $ANTLR end "rule__PiePlot__Group__0"


    // $ANTLR start "rule__PiePlot__Group__0__Impl"
    // InternalBiLang.g:4652:1: rule__PiePlot__Group__0__Impl : ( 'pie' ) ;
    public final void rule__PiePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4656:1: ( ( 'pie' ) )
            // InternalBiLang.g:4657:1: ( 'pie' )
            {
            // InternalBiLang.g:4657:1: ( 'pie' )
            // InternalBiLang.g:4658:2: 'pie'
            {
             before(grammarAccess.getPiePlotAccess().getPieKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getPieKeyword_0()); 

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
    // $ANTLR end "rule__PiePlot__Group__0__Impl"


    // $ANTLR start "rule__PiePlot__Group__1"
    // InternalBiLang.g:4667:1: rule__PiePlot__Group__1 : rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 ;
    public final void rule__PiePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4671:1: ( rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 )
            // InternalBiLang.g:4672:2: rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__PiePlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__2();

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
    // $ANTLR end "rule__PiePlot__Group__1"


    // $ANTLR start "rule__PiePlot__Group__1__Impl"
    // InternalBiLang.g:4679:1: rule__PiePlot__Group__1__Impl : ( ( rule__PiePlot__NameAssignment_1 ) ) ;
    public final void rule__PiePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4683:1: ( ( ( rule__PiePlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4684:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4684:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            // InternalBiLang.g:4685:2: ( rule__PiePlot__NameAssignment_1 )
            {
             before(grammarAccess.getPiePlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4686:2: ( rule__PiePlot__NameAssignment_1 )
            // InternalBiLang.g:4686:3: rule__PiePlot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PiePlot__Group__1__Impl"


    // $ANTLR start "rule__PiePlot__Group__2"
    // InternalBiLang.g:4694:1: rule__PiePlot__Group__2 : rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 ;
    public final void rule__PiePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4698:1: ( rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 )
            // InternalBiLang.g:4699:2: rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__PiePlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__3();

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
    // $ANTLR end "rule__PiePlot__Group__2"


    // $ANTLR start "rule__PiePlot__Group__2__Impl"
    // InternalBiLang.g:4706:1: rule__PiePlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PiePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4710:1: ( ( '->' ) )
            // InternalBiLang.g:4711:1: ( '->' )
            {
            // InternalBiLang.g:4711:1: ( '->' )
            // InternalBiLang.g:4712:2: '->'
            {
             before(grammarAccess.getPiePlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__PiePlot__Group__2__Impl"


    // $ANTLR start "rule__PiePlot__Group__3"
    // InternalBiLang.g:4721:1: rule__PiePlot__Group__3 : rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 ;
    public final void rule__PiePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4725:1: ( rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 )
            // InternalBiLang.g:4726:2: rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PiePlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__4();

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
    // $ANTLR end "rule__PiePlot__Group__3"


    // $ANTLR start "rule__PiePlot__Group__3__Impl"
    // InternalBiLang.g:4733:1: rule__PiePlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PiePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4737:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4738:1: ( 'xAx' )
            {
            // InternalBiLang.g:4738:1: ( 'xAx' )
            // InternalBiLang.g:4739:2: 'xAx'
            {
             before(grammarAccess.getPiePlotAccess().getXAxKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getXAxKeyword_3()); 

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
    // $ANTLR end "rule__PiePlot__Group__3__Impl"


    // $ANTLR start "rule__PiePlot__Group__4"
    // InternalBiLang.g:4748:1: rule__PiePlot__Group__4 : rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 ;
    public final void rule__PiePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4752:1: ( rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 )
            // InternalBiLang.g:4753:2: rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__PiePlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__5();

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
    // $ANTLR end "rule__PiePlot__Group__4"


    // $ANTLR start "rule__PiePlot__Group__4__Impl"
    // InternalBiLang.g:4760:1: rule__PiePlot__Group__4__Impl : ( ( rule__PiePlot__XAxisAssignment_4 ) ) ;
    public final void rule__PiePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4764:1: ( ( ( rule__PiePlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4765:1: ( ( rule__PiePlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4765:1: ( ( rule__PiePlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4766:2: ( rule__PiePlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPiePlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4767:2: ( rule__PiePlot__XAxisAssignment_4 )
            // InternalBiLang.g:4767:3: rule__PiePlot__XAxisAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__XAxisAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getXAxisAssignment_4()); 

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
    // $ANTLR end "rule__PiePlot__Group__4__Impl"


    // $ANTLR start "rule__PiePlot__Group__5"
    // InternalBiLang.g:4775:1: rule__PiePlot__Group__5 : rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 ;
    public final void rule__PiePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4779:1: ( rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 )
            // InternalBiLang.g:4780:2: rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__PiePlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__6();

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
    // $ANTLR end "rule__PiePlot__Group__5"


    // $ANTLR start "rule__PiePlot__Group__5__Impl"
    // InternalBiLang.g:4787:1: rule__PiePlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PiePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4791:1: ( ( 'yA' ) )
            // InternalBiLang.g:4792:1: ( 'yA' )
            {
            // InternalBiLang.g:4792:1: ( 'yA' )
            // InternalBiLang.g:4793:2: 'yA'
            {
             before(grammarAccess.getPiePlotAccess().getYAKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getYAKeyword_5()); 

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
    // $ANTLR end "rule__PiePlot__Group__5__Impl"


    // $ANTLR start "rule__PiePlot__Group__6"
    // InternalBiLang.g:4802:1: rule__PiePlot__Group__6 : rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7 ;
    public final void rule__PiePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4806:1: ( rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7 )
            // InternalBiLang.g:4807:2: rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__PiePlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__7();

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
    // $ANTLR end "rule__PiePlot__Group__6"


    // $ANTLR start "rule__PiePlot__Group__6__Impl"
    // InternalBiLang.g:4814:1: rule__PiePlot__Group__6__Impl : ( ( rule__PiePlot__YAxisAssignment_6 ) ) ;
    public final void rule__PiePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4818:1: ( ( ( rule__PiePlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:4819:1: ( ( rule__PiePlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:4819:1: ( ( rule__PiePlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:4820:2: ( rule__PiePlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPiePlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:4821:2: ( rule__PiePlot__YAxisAssignment_6 )
            // InternalBiLang.g:4821:3: rule__PiePlot__YAxisAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__YAxisAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getYAxisAssignment_6()); 

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
    // $ANTLR end "rule__PiePlot__Group__6__Impl"


    // $ANTLR start "rule__PiePlot__Group__7"
    // InternalBiLang.g:4829:1: rule__PiePlot__Group__7 : rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8 ;
    public final void rule__PiePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4833:1: ( rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8 )
            // InternalBiLang.g:4834:2: rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__PiePlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__8();

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
    // $ANTLR end "rule__PiePlot__Group__7"


    // $ANTLR start "rule__PiePlot__Group__7__Impl"
    // InternalBiLang.g:4841:1: rule__PiePlot__Group__7__Impl : ( ( rule__PiePlot__Group_7__0 )? ) ;
    public final void rule__PiePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4845:1: ( ( ( rule__PiePlot__Group_7__0 )? ) )
            // InternalBiLang.g:4846:1: ( ( rule__PiePlot__Group_7__0 )? )
            {
            // InternalBiLang.g:4846:1: ( ( rule__PiePlot__Group_7__0 )? )
            // InternalBiLang.g:4847:2: ( rule__PiePlot__Group_7__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_7()); 
            // InternalBiLang.g:4848:2: ( rule__PiePlot__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:4848:3: rule__PiePlot__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PiePlot__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPiePlotAccess().getGroup_7()); 

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
    // $ANTLR end "rule__PiePlot__Group__7__Impl"


    // $ANTLR start "rule__PiePlot__Group__8"
    // InternalBiLang.g:4856:1: rule__PiePlot__Group__8 : rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9 ;
    public final void rule__PiePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4860:1: ( rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9 )
            // InternalBiLang.g:4861:2: rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__PiePlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__9();

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
    // $ANTLR end "rule__PiePlot__Group__8"


    // $ANTLR start "rule__PiePlot__Group__8__Impl"
    // InternalBiLang.g:4868:1: rule__PiePlot__Group__8__Impl : ( ( rule__PiePlot__Group_8__0 )? ) ;
    public final void rule__PiePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4872:1: ( ( ( rule__PiePlot__Group_8__0 )? ) )
            // InternalBiLang.g:4873:1: ( ( rule__PiePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4873:1: ( ( rule__PiePlot__Group_8__0 )? )
            // InternalBiLang.g:4874:2: ( rule__PiePlot__Group_8__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_8()); 
            // InternalBiLang.g:4875:2: ( rule__PiePlot__Group_8__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:4875:3: rule__PiePlot__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PiePlot__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPiePlotAccess().getGroup_8()); 

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
    // $ANTLR end "rule__PiePlot__Group__8__Impl"


    // $ANTLR start "rule__PiePlot__Group__9"
    // InternalBiLang.g:4883:1: rule__PiePlot__Group__9 : rule__PiePlot__Group__9__Impl ;
    public final void rule__PiePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4887:1: ( rule__PiePlot__Group__9__Impl )
            // InternalBiLang.g:4888:2: rule__PiePlot__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__9__Impl();

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
    // $ANTLR end "rule__PiePlot__Group__9"


    // $ANTLR start "rule__PiePlot__Group__9__Impl"
    // InternalBiLang.g:4894:1: rule__PiePlot__Group__9__Impl : ( ( rule__PiePlot__Group_9__0 )? ) ;
    public final void rule__PiePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4898:1: ( ( ( rule__PiePlot__Group_9__0 )? ) )
            // InternalBiLang.g:4899:1: ( ( rule__PiePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4899:1: ( ( rule__PiePlot__Group_9__0 )? )
            // InternalBiLang.g:4900:2: ( rule__PiePlot__Group_9__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_9()); 
            // InternalBiLang.g:4901:2: ( rule__PiePlot__Group_9__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:4901:3: rule__PiePlot__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PiePlot__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPiePlotAccess().getGroup_9()); 

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
    // $ANTLR end "rule__PiePlot__Group__9__Impl"


    // $ANTLR start "rule__PiePlot__Group_7__0"
    // InternalBiLang.g:4910:1: rule__PiePlot__Group_7__0 : rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1 ;
    public final void rule__PiePlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4914:1: ( rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1 )
            // InternalBiLang.g:4915:2: rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1
            {
            pushFollow(FOLLOW_35);
            rule__PiePlot__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_7__1();

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
    // $ANTLR end "rule__PiePlot__Group_7__0"


    // $ANTLR start "rule__PiePlot__Group_7__0__Impl"
    // InternalBiLang.g:4922:1: rule__PiePlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PiePlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4926:1: ( ( 'loc' ) )
            // InternalBiLang.g:4927:1: ( 'loc' )
            {
            // InternalBiLang.g:4927:1: ( 'loc' )
            // InternalBiLang.g:4928:2: 'loc'
            {
             before(grammarAccess.getPiePlotAccess().getLocKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getLocKeyword_7_0()); 

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
    // $ANTLR end "rule__PiePlot__Group_7__0__Impl"


    // $ANTLR start "rule__PiePlot__Group_7__1"
    // InternalBiLang.g:4937:1: rule__PiePlot__Group_7__1 : rule__PiePlot__Group_7__1__Impl ;
    public final void rule__PiePlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4941:1: ( rule__PiePlot__Group_7__1__Impl )
            // InternalBiLang.g:4942:2: rule__PiePlot__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_7__1__Impl();

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
    // $ANTLR end "rule__PiePlot__Group_7__1"


    // $ANTLR start "rule__PiePlot__Group_7__1__Impl"
    // InternalBiLang.g:4948:1: rule__PiePlot__Group_7__1__Impl : ( ( rule__PiePlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PiePlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4952:1: ( ( ( rule__PiePlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:4953:1: ( ( rule__PiePlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:4953:1: ( ( rule__PiePlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:4954:2: ( rule__PiePlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPiePlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:4955:2: ( rule__PiePlot__LocationAssignment_7_1 )
            // InternalBiLang.g:4955:3: rule__PiePlot__LocationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__LocationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getLocationAssignment_7_1()); 

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
    // $ANTLR end "rule__PiePlot__Group_7__1__Impl"


    // $ANTLR start "rule__PiePlot__Group_8__0"
    // InternalBiLang.g:4964:1: rule__PiePlot__Group_8__0 : rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1 ;
    public final void rule__PiePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4968:1: ( rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1 )
            // InternalBiLang.g:4969:2: rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__PiePlot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_8__1();

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
    // $ANTLR end "rule__PiePlot__Group_8__0"


    // $ANTLR start "rule__PiePlot__Group_8__0__Impl"
    // InternalBiLang.g:4976:1: rule__PiePlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PiePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4980:1: ( ( 'colors' ) )
            // InternalBiLang.g:4981:1: ( 'colors' )
            {
            // InternalBiLang.g:4981:1: ( 'colors' )
            // InternalBiLang.g:4982:2: 'colors'
            {
             before(grammarAccess.getPiePlotAccess().getColorsKeyword_8_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getColorsKeyword_8_0()); 

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
    // $ANTLR end "rule__PiePlot__Group_8__0__Impl"


    // $ANTLR start "rule__PiePlot__Group_8__1"
    // InternalBiLang.g:4991:1: rule__PiePlot__Group_8__1 : rule__PiePlot__Group_8__1__Impl ;
    public final void rule__PiePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4995:1: ( rule__PiePlot__Group_8__1__Impl )
            // InternalBiLang.g:4996:2: rule__PiePlot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_8__1__Impl();

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
    // $ANTLR end "rule__PiePlot__Group_8__1"


    // $ANTLR start "rule__PiePlot__Group_8__1__Impl"
    // InternalBiLang.g:5002:1: rule__PiePlot__Group_8__1__Impl : ( ( rule__PiePlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PiePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5006:1: ( ( ( rule__PiePlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5007:1: ( ( rule__PiePlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5007:1: ( ( rule__PiePlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5008:2: ( rule__PiePlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPiePlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5009:2: ( rule__PiePlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5009:3: rule__PiePlot__ColorsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__ColorsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getColorsAssignment_8_1()); 

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
    // $ANTLR end "rule__PiePlot__Group_8__1__Impl"


    // $ANTLR start "rule__PiePlot__Group_9__0"
    // InternalBiLang.g:5018:1: rule__PiePlot__Group_9__0 : rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1 ;
    public final void rule__PiePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5022:1: ( rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1 )
            // InternalBiLang.g:5023:2: rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__PiePlot__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_9__1();

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
    // $ANTLR end "rule__PiePlot__Group_9__0"


    // $ANTLR start "rule__PiePlot__Group_9__0__Impl"
    // InternalBiLang.g:5030:1: rule__PiePlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PiePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5034:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5035:1: ( 'thickness' )
            {
            // InternalBiLang.g:5035:1: ( 'thickness' )
            // InternalBiLang.g:5036:2: 'thickness'
            {
             before(grammarAccess.getPiePlotAccess().getThicknessKeyword_9_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getThicknessKeyword_9_0()); 

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
    // $ANTLR end "rule__PiePlot__Group_9__0__Impl"


    // $ANTLR start "rule__PiePlot__Group_9__1"
    // InternalBiLang.g:5045:1: rule__PiePlot__Group_9__1 : rule__PiePlot__Group_9__1__Impl ;
    public final void rule__PiePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5049:1: ( rule__PiePlot__Group_9__1__Impl )
            // InternalBiLang.g:5050:2: rule__PiePlot__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_9__1__Impl();

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
    // $ANTLR end "rule__PiePlot__Group_9__1"


    // $ANTLR start "rule__PiePlot__Group_9__1__Impl"
    // InternalBiLang.g:5056:1: rule__PiePlot__Group_9__1__Impl : ( ( rule__PiePlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PiePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5060:1: ( ( ( rule__PiePlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5061:1: ( ( rule__PiePlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5061:1: ( ( rule__PiePlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5062:2: ( rule__PiePlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPiePlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5063:2: ( rule__PiePlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5063:3: rule__PiePlot__ThicknessAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__ThicknessAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getThicknessAssignment_9_1()); 

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
    // $ANTLR end "rule__PiePlot__Group_9__1__Impl"


    // $ANTLR start "rule__PolarPlot__Group__0"
    // InternalBiLang.g:5072:1: rule__PolarPlot__Group__0 : rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 ;
    public final void rule__PolarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5076:1: ( rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 )
            // InternalBiLang.g:5077:2: rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PolarPlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__1();

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
    // $ANTLR end "rule__PolarPlot__Group__0"


    // $ANTLR start "rule__PolarPlot__Group__0__Impl"
    // InternalBiLang.g:5084:1: rule__PolarPlot__Group__0__Impl : ( 'polar' ) ;
    public final void rule__PolarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5088:1: ( ( 'polar' ) )
            // InternalBiLang.g:5089:1: ( 'polar' )
            {
            // InternalBiLang.g:5089:1: ( 'polar' )
            // InternalBiLang.g:5090:2: 'polar'
            {
             before(grammarAccess.getPolarPlotAccess().getPolarKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPolarPlotAccess().getPolarKeyword_0()); 

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
    // $ANTLR end "rule__PolarPlot__Group__0__Impl"


    // $ANTLR start "rule__PolarPlot__Group__1"
    // InternalBiLang.g:5099:1: rule__PolarPlot__Group__1 : rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 ;
    public final void rule__PolarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5103:1: ( rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 )
            // InternalBiLang.g:5104:2: rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__PolarPlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__2();

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
    // $ANTLR end "rule__PolarPlot__Group__1"


    // $ANTLR start "rule__PolarPlot__Group__1__Impl"
    // InternalBiLang.g:5111:1: rule__PolarPlot__Group__1__Impl : ( ( rule__PolarPlot__NameAssignment_1 ) ) ;
    public final void rule__PolarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5115:1: ( ( ( rule__PolarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5116:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5116:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5117:2: ( rule__PolarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5118:2: ( rule__PolarPlot__NameAssignment_1 )
            // InternalBiLang.g:5118:3: rule__PolarPlot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPolarPlotAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PolarPlot__Group__1__Impl"


    // $ANTLR start "rule__PolarPlot__Group__2"
    // InternalBiLang.g:5126:1: rule__PolarPlot__Group__2 : rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 ;
    public final void rule__PolarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5130:1: ( rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 )
            // InternalBiLang.g:5131:2: rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__PolarPlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__3();

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
    // $ANTLR end "rule__PolarPlot__Group__2"


    // $ANTLR start "rule__PolarPlot__Group__2__Impl"
    // InternalBiLang.g:5138:1: rule__PolarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PolarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5142:1: ( ( '->' ) )
            // InternalBiLang.g:5143:1: ( '->' )
            {
            // InternalBiLang.g:5143:1: ( '->' )
            // InternalBiLang.g:5144:2: '->'
            {
             before(grammarAccess.getPolarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPolarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__PolarPlot__Group__2__Impl"


    // $ANTLR start "rule__PolarPlot__Group__3"
    // InternalBiLang.g:5153:1: rule__PolarPlot__Group__3 : rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 ;
    public final void rule__PolarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5157:1: ( rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 )
            // InternalBiLang.g:5158:2: rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PolarPlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__4();

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
    // $ANTLR end "rule__PolarPlot__Group__3"


    // $ANTLR start "rule__PolarPlot__Group__3__Impl"
    // InternalBiLang.g:5165:1: rule__PolarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PolarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5169:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5170:1: ( 'xAx' )
            {
            // InternalBiLang.g:5170:1: ( 'xAx' )
            // InternalBiLang.g:5171:2: 'xAx'
            {
             before(grammarAccess.getPolarPlotAccess().getXAxKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPolarPlotAccess().getXAxKeyword_3()); 

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
    // $ANTLR end "rule__PolarPlot__Group__3__Impl"


    // $ANTLR start "rule__PolarPlot__Group__4"
    // InternalBiLang.g:5180:1: rule__PolarPlot__Group__4 : rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 ;
    public final void rule__PolarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5184:1: ( rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 )
            // InternalBiLang.g:5185:2: rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__PolarPlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__5();

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
    // $ANTLR end "rule__PolarPlot__Group__4"


    // $ANTLR start "rule__PolarPlot__Group__4__Impl"
    // InternalBiLang.g:5192:1: rule__PolarPlot__Group__4__Impl : ( ( rule__PolarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__PolarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5196:1: ( ( ( rule__PolarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5197:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5197:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5198:2: ( rule__PolarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPolarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5199:2: ( rule__PolarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5199:3: rule__PolarPlot__XAxisAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__XAxisAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPolarPlotAccess().getXAxisAssignment_4()); 

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
    // $ANTLR end "rule__PolarPlot__Group__4__Impl"


    // $ANTLR start "rule__PolarPlot__Group__5"
    // InternalBiLang.g:5207:1: rule__PolarPlot__Group__5 : rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 ;
    public final void rule__PolarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5211:1: ( rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 )
            // InternalBiLang.g:5212:2: rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__PolarPlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__6();

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
    // $ANTLR end "rule__PolarPlot__Group__5"


    // $ANTLR start "rule__PolarPlot__Group__5__Impl"
    // InternalBiLang.g:5219:1: rule__PolarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PolarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5223:1: ( ( 'yA' ) )
            // InternalBiLang.g:5224:1: ( 'yA' )
            {
            // InternalBiLang.g:5224:1: ( 'yA' )
            // InternalBiLang.g:5225:2: 'yA'
            {
             before(grammarAccess.getPolarPlotAccess().getYAKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPolarPlotAccess().getYAKeyword_5()); 

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
    // $ANTLR end "rule__PolarPlot__Group__5__Impl"


    // $ANTLR start "rule__PolarPlot__Group__6"
    // InternalBiLang.g:5234:1: rule__PolarPlot__Group__6 : rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 ;
    public final void rule__PolarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5238:1: ( rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 )
            // InternalBiLang.g:5239:2: rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__PolarPlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__7();

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
    // $ANTLR end "rule__PolarPlot__Group__6"


    // $ANTLR start "rule__PolarPlot__Group__6__Impl"
    // InternalBiLang.g:5246:1: rule__PolarPlot__Group__6__Impl : ( ( rule__PolarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__PolarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5250:1: ( ( ( rule__PolarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5251:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5251:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5252:2: ( rule__PolarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPolarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5253:2: ( rule__PolarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5253:3: rule__PolarPlot__YAxisAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__YAxisAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPolarPlotAccess().getYAxisAssignment_6()); 

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
    // $ANTLR end "rule__PolarPlot__Group__6__Impl"


    // $ANTLR start "rule__PolarPlot__Group__7"
    // InternalBiLang.g:5261:1: rule__PolarPlot__Group__7 : rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 ;
    public final void rule__PolarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5265:1: ( rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 )
            // InternalBiLang.g:5266:2: rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__PolarPlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__8();

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
    // $ANTLR end "rule__PolarPlot__Group__7"


    // $ANTLR start "rule__PolarPlot__Group__7__Impl"
    // InternalBiLang.g:5273:1: rule__PolarPlot__Group__7__Impl : ( ( rule__PolarPlot__Group_7__0 )? ) ;
    public final void rule__PolarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5277:1: ( ( ( rule__PolarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5278:1: ( ( rule__PolarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5278:1: ( ( rule__PolarPlot__Group_7__0 )? )
            // InternalBiLang.g:5279:2: ( rule__PolarPlot__Group_7__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5280:2: ( rule__PolarPlot__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:5280:3: rule__PolarPlot__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PolarPlot__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPolarPlotAccess().getGroup_7()); 

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
    // $ANTLR end "rule__PolarPlot__Group__7__Impl"


    // $ANTLR start "rule__PolarPlot__Group__8"
    // InternalBiLang.g:5288:1: rule__PolarPlot__Group__8 : rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 ;
    public final void rule__PolarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5292:1: ( rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 )
            // InternalBiLang.g:5293:2: rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__PolarPlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__9();

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
    // $ANTLR end "rule__PolarPlot__Group__8"


    // $ANTLR start "rule__PolarPlot__Group__8__Impl"
    // InternalBiLang.g:5300:1: rule__PolarPlot__Group__8__Impl : ( ( rule__PolarPlot__Group_8__0 )? ) ;
    public final void rule__PolarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5304:1: ( ( ( rule__PolarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5305:1: ( ( rule__PolarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5305:1: ( ( rule__PolarPlot__Group_8__0 )? )
            // InternalBiLang.g:5306:2: ( rule__PolarPlot__Group_8__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5307:2: ( rule__PolarPlot__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:5307:3: rule__PolarPlot__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PolarPlot__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPolarPlotAccess().getGroup_8()); 

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
    // $ANTLR end "rule__PolarPlot__Group__8__Impl"


    // $ANTLR start "rule__PolarPlot__Group__9"
    // InternalBiLang.g:5315:1: rule__PolarPlot__Group__9 : rule__PolarPlot__Group__9__Impl ;
    public final void rule__PolarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5319:1: ( rule__PolarPlot__Group__9__Impl )
            // InternalBiLang.g:5320:2: rule__PolarPlot__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group__9__Impl();

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
    // $ANTLR end "rule__PolarPlot__Group__9"


    // $ANTLR start "rule__PolarPlot__Group__9__Impl"
    // InternalBiLang.g:5326:1: rule__PolarPlot__Group__9__Impl : ( ( rule__PolarPlot__Group_9__0 )? ) ;
    public final void rule__PolarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5330:1: ( ( ( rule__PolarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5331:1: ( ( rule__PolarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5331:1: ( ( rule__PolarPlot__Group_9__0 )? )
            // InternalBiLang.g:5332:2: ( rule__PolarPlot__Group_9__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5333:2: ( rule__PolarPlot__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:5333:3: rule__PolarPlot__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PolarPlot__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPolarPlotAccess().getGroup_9()); 

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
    // $ANTLR end "rule__PolarPlot__Group__9__Impl"


    // $ANTLR start "rule__PolarPlot__Group_7__0"
    // InternalBiLang.g:5342:1: rule__PolarPlot__Group_7__0 : rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 ;
    public final void rule__PolarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5346:1: ( rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 )
            // InternalBiLang.g:5347:2: rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1
            {
            pushFollow(FOLLOW_35);
            rule__PolarPlot__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group_7__1();

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
    // $ANTLR end "rule__PolarPlot__Group_7__0"


    // $ANTLR start "rule__PolarPlot__Group_7__0__Impl"
    // InternalBiLang.g:5354:1: rule__PolarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PolarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5358:1: ( ( 'loc' ) )
            // InternalBiLang.g:5359:1: ( 'loc' )
            {
            // InternalBiLang.g:5359:1: ( 'loc' )
            // InternalBiLang.g:5360:2: 'loc'
            {
             before(grammarAccess.getPolarPlotAccess().getLocKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPolarPlotAccess().getLocKeyword_7_0()); 

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
    // $ANTLR end "rule__PolarPlot__Group_7__0__Impl"


    // $ANTLR start "rule__PolarPlot__Group_7__1"
    // InternalBiLang.g:5369:1: rule__PolarPlot__Group_7__1 : rule__PolarPlot__Group_7__1__Impl ;
    public final void rule__PolarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5373:1: ( rule__PolarPlot__Group_7__1__Impl )
            // InternalBiLang.g:5374:2: rule__PolarPlot__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group_7__1__Impl();

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
    // $ANTLR end "rule__PolarPlot__Group_7__1"


    // $ANTLR start "rule__PolarPlot__Group_7__1__Impl"
    // InternalBiLang.g:5380:1: rule__PolarPlot__Group_7__1__Impl : ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PolarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5384:1: ( ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5385:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5385:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5386:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5387:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5387:3: rule__PolarPlot__LocationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__LocationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPolarPlotAccess().getLocationAssignment_7_1()); 

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
    // $ANTLR end "rule__PolarPlot__Group_7__1__Impl"


    // $ANTLR start "rule__PolarPlot__Group_8__0"
    // InternalBiLang.g:5396:1: rule__PolarPlot__Group_8__0 : rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 ;
    public final void rule__PolarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5400:1: ( rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 )
            // InternalBiLang.g:5401:2: rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__PolarPlot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group_8__1();

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
    // $ANTLR end "rule__PolarPlot__Group_8__0"


    // $ANTLR start "rule__PolarPlot__Group_8__0__Impl"
    // InternalBiLang.g:5408:1: rule__PolarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PolarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5412:1: ( ( 'colors' ) )
            // InternalBiLang.g:5413:1: ( 'colors' )
            {
            // InternalBiLang.g:5413:1: ( 'colors' )
            // InternalBiLang.g:5414:2: 'colors'
            {
             before(grammarAccess.getPolarPlotAccess().getColorsKeyword_8_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPolarPlotAccess().getColorsKeyword_8_0()); 

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
    // $ANTLR end "rule__PolarPlot__Group_8__0__Impl"


    // $ANTLR start "rule__PolarPlot__Group_8__1"
    // InternalBiLang.g:5423:1: rule__PolarPlot__Group_8__1 : rule__PolarPlot__Group_8__1__Impl ;
    public final void rule__PolarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5427:1: ( rule__PolarPlot__Group_8__1__Impl )
            // InternalBiLang.g:5428:2: rule__PolarPlot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group_8__1__Impl();

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
    // $ANTLR end "rule__PolarPlot__Group_8__1"


    // $ANTLR start "rule__PolarPlot__Group_8__1__Impl"
    // InternalBiLang.g:5434:1: rule__PolarPlot__Group_8__1__Impl : ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PolarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5438:1: ( ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5439:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5439:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5440:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5441:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5441:3: rule__PolarPlot__ColorsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__ColorsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPolarPlotAccess().getColorsAssignment_8_1()); 

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
    // $ANTLR end "rule__PolarPlot__Group_8__1__Impl"


    // $ANTLR start "rule__PolarPlot__Group_9__0"
    // InternalBiLang.g:5450:1: rule__PolarPlot__Group_9__0 : rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 ;
    public final void rule__PolarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5454:1: ( rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 )
            // InternalBiLang.g:5455:2: rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__PolarPlot__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group_9__1();

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
    // $ANTLR end "rule__PolarPlot__Group_9__0"


    // $ANTLR start "rule__PolarPlot__Group_9__0__Impl"
    // InternalBiLang.g:5462:1: rule__PolarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PolarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5466:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5467:1: ( 'thickness' )
            {
            // InternalBiLang.g:5467:1: ( 'thickness' )
            // InternalBiLang.g:5468:2: 'thickness'
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessKeyword_9_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPolarPlotAccess().getThicknessKeyword_9_0()); 

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
    // $ANTLR end "rule__PolarPlot__Group_9__0__Impl"


    // $ANTLR start "rule__PolarPlot__Group_9__1"
    // InternalBiLang.g:5477:1: rule__PolarPlot__Group_9__1 : rule__PolarPlot__Group_9__1__Impl ;
    public final void rule__PolarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5481:1: ( rule__PolarPlot__Group_9__1__Impl )
            // InternalBiLang.g:5482:2: rule__PolarPlot__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__Group_9__1__Impl();

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
    // $ANTLR end "rule__PolarPlot__Group_9__1"


    // $ANTLR start "rule__PolarPlot__Group_9__1__Impl"
    // InternalBiLang.g:5488:1: rule__PolarPlot__Group_9__1__Impl : ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PolarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5492:1: ( ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5493:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5493:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5494:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5495:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5495:3: rule__PolarPlot__ThicknessAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__PolarPlot__ThicknessAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPolarPlotAccess().getThicknessAssignment_9_1()); 

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
    // $ANTLR end "rule__PolarPlot__Group_9__1__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__0"
    // InternalBiLang.g:5504:1: rule__ScatterPlot__Group__0 : rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 ;
    public final void rule__ScatterPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5508:1: ( rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 )
            // InternalBiLang.g:5509:2: rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ScatterPlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__1();

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
    // $ANTLR end "rule__ScatterPlot__Group__0"


    // $ANTLR start "rule__ScatterPlot__Group__0__Impl"
    // InternalBiLang.g:5516:1: rule__ScatterPlot__Group__0__Impl : ( 'scatter' ) ;
    public final void rule__ScatterPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5520:1: ( ( 'scatter' ) )
            // InternalBiLang.g:5521:1: ( 'scatter' )
            {
            // InternalBiLang.g:5521:1: ( 'scatter' )
            // InternalBiLang.g:5522:2: 'scatter'
            {
             before(grammarAccess.getScatterPlotAccess().getScatterKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getScatterPlotAccess().getScatterKeyword_0()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__0__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__1"
    // InternalBiLang.g:5531:1: rule__ScatterPlot__Group__1 : rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 ;
    public final void rule__ScatterPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5535:1: ( rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 )
            // InternalBiLang.g:5536:2: rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__ScatterPlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__2();

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
    // $ANTLR end "rule__ScatterPlot__Group__1"


    // $ANTLR start "rule__ScatterPlot__Group__1__Impl"
    // InternalBiLang.g:5543:1: rule__ScatterPlot__Group__1__Impl : ( ( rule__ScatterPlot__NameAssignment_1 ) ) ;
    public final void rule__ScatterPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5547:1: ( ( ( rule__ScatterPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5548:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5548:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5549:2: ( rule__ScatterPlot__NameAssignment_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5550:2: ( rule__ScatterPlot__NameAssignment_1 )
            // InternalBiLang.g:5550:3: rule__ScatterPlot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterPlotAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__1__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__2"
    // InternalBiLang.g:5558:1: rule__ScatterPlot__Group__2 : rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 ;
    public final void rule__ScatterPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5562:1: ( rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 )
            // InternalBiLang.g:5563:2: rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__ScatterPlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__3();

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
    // $ANTLR end "rule__ScatterPlot__Group__2"


    // $ANTLR start "rule__ScatterPlot__Group__2__Impl"
    // InternalBiLang.g:5570:1: rule__ScatterPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__ScatterPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5574:1: ( ( '->' ) )
            // InternalBiLang.g:5575:1: ( '->' )
            {
            // InternalBiLang.g:5575:1: ( '->' )
            // InternalBiLang.g:5576:2: '->'
            {
             before(grammarAccess.getScatterPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getScatterPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__2__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__3"
    // InternalBiLang.g:5585:1: rule__ScatterPlot__Group__3 : rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 ;
    public final void rule__ScatterPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5589:1: ( rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 )
            // InternalBiLang.g:5590:2: rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ScatterPlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__4();

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
    // $ANTLR end "rule__ScatterPlot__Group__3"


    // $ANTLR start "rule__ScatterPlot__Group__3__Impl"
    // InternalBiLang.g:5597:1: rule__ScatterPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__ScatterPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5601:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5602:1: ( 'xAx' )
            {
            // InternalBiLang.g:5602:1: ( 'xAx' )
            // InternalBiLang.g:5603:2: 'xAx'
            {
             before(grammarAccess.getScatterPlotAccess().getXAxKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getScatterPlotAccess().getXAxKeyword_3()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__3__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__4"
    // InternalBiLang.g:5612:1: rule__ScatterPlot__Group__4 : rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 ;
    public final void rule__ScatterPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5616:1: ( rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 )
            // InternalBiLang.g:5617:2: rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__ScatterPlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__5();

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
    // $ANTLR end "rule__ScatterPlot__Group__4"


    // $ANTLR start "rule__ScatterPlot__Group__4__Impl"
    // InternalBiLang.g:5624:1: rule__ScatterPlot__Group__4__Impl : ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) ;
    public final void rule__ScatterPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5628:1: ( ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5629:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5629:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5630:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getScatterPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5631:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5631:3: rule__ScatterPlot__XAxisAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__XAxisAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScatterPlotAccess().getXAxisAssignment_4()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__4__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__5"
    // InternalBiLang.g:5639:1: rule__ScatterPlot__Group__5 : rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 ;
    public final void rule__ScatterPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5643:1: ( rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 )
            // InternalBiLang.g:5644:2: rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ScatterPlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__6();

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
    // $ANTLR end "rule__ScatterPlot__Group__5"


    // $ANTLR start "rule__ScatterPlot__Group__5__Impl"
    // InternalBiLang.g:5651:1: rule__ScatterPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__ScatterPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5655:1: ( ( 'yA' ) )
            // InternalBiLang.g:5656:1: ( 'yA' )
            {
            // InternalBiLang.g:5656:1: ( 'yA' )
            // InternalBiLang.g:5657:2: 'yA'
            {
             before(grammarAccess.getScatterPlotAccess().getYAKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getScatterPlotAccess().getYAKeyword_5()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__5__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__6"
    // InternalBiLang.g:5666:1: rule__ScatterPlot__Group__6 : rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 ;
    public final void rule__ScatterPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5670:1: ( rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 )
            // InternalBiLang.g:5671:2: rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__ScatterPlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__7();

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
    // $ANTLR end "rule__ScatterPlot__Group__6"


    // $ANTLR start "rule__ScatterPlot__Group__6__Impl"
    // InternalBiLang.g:5678:1: rule__ScatterPlot__Group__6__Impl : ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) ;
    public final void rule__ScatterPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5682:1: ( ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5683:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5683:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5684:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getScatterPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5685:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5685:3: rule__ScatterPlot__YAxisAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__YAxisAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScatterPlotAccess().getYAxisAssignment_6()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__6__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__7"
    // InternalBiLang.g:5693:1: rule__ScatterPlot__Group__7 : rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 ;
    public final void rule__ScatterPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5697:1: ( rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 )
            // InternalBiLang.g:5698:2: rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__ScatterPlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__8();

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
    // $ANTLR end "rule__ScatterPlot__Group__7"


    // $ANTLR start "rule__ScatterPlot__Group__7__Impl"
    // InternalBiLang.g:5705:1: rule__ScatterPlot__Group__7__Impl : ( ( rule__ScatterPlot__Group_7__0 )? ) ;
    public final void rule__ScatterPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5709:1: ( ( ( rule__ScatterPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5710:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5710:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            // InternalBiLang.g:5711:2: ( rule__ScatterPlot__Group_7__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5712:2: ( rule__ScatterPlot__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:5712:3: rule__ScatterPlot__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterPlot__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterPlotAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__7__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__8"
    // InternalBiLang.g:5720:1: rule__ScatterPlot__Group__8 : rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 ;
    public final void rule__ScatterPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5724:1: ( rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 )
            // InternalBiLang.g:5725:2: rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__ScatterPlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__9();

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
    // $ANTLR end "rule__ScatterPlot__Group__8"


    // $ANTLR start "rule__ScatterPlot__Group__8__Impl"
    // InternalBiLang.g:5732:1: rule__ScatterPlot__Group__8__Impl : ( ( rule__ScatterPlot__Group_8__0 )? ) ;
    public final void rule__ScatterPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5736:1: ( ( ( rule__ScatterPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5737:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5737:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            // InternalBiLang.g:5738:2: ( rule__ScatterPlot__Group_8__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5739:2: ( rule__ScatterPlot__Group_8__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBiLang.g:5739:3: rule__ScatterPlot__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterPlot__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterPlotAccess().getGroup_8()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__8__Impl"


    // $ANTLR start "rule__ScatterPlot__Group__9"
    // InternalBiLang.g:5747:1: rule__ScatterPlot__Group__9 : rule__ScatterPlot__Group__9__Impl ;
    public final void rule__ScatterPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5751:1: ( rule__ScatterPlot__Group__9__Impl )
            // InternalBiLang.g:5752:2: rule__ScatterPlot__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group__9__Impl();

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
    // $ANTLR end "rule__ScatterPlot__Group__9"


    // $ANTLR start "rule__ScatterPlot__Group__9__Impl"
    // InternalBiLang.g:5758:1: rule__ScatterPlot__Group__9__Impl : ( ( rule__ScatterPlot__Group_9__0 )? ) ;
    public final void rule__ScatterPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5762:1: ( ( ( rule__ScatterPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5763:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5763:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            // InternalBiLang.g:5764:2: ( rule__ScatterPlot__Group_9__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5765:2: ( rule__ScatterPlot__Group_9__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBiLang.g:5765:3: rule__ScatterPlot__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScatterPlot__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScatterPlotAccess().getGroup_9()); 

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
    // $ANTLR end "rule__ScatterPlot__Group__9__Impl"


    // $ANTLR start "rule__ScatterPlot__Group_7__0"
    // InternalBiLang.g:5774:1: rule__ScatterPlot__Group_7__0 : rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 ;
    public final void rule__ScatterPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5778:1: ( rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 )
            // InternalBiLang.g:5779:2: rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1
            {
            pushFollow(FOLLOW_35);
            rule__ScatterPlot__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group_7__1();

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
    // $ANTLR end "rule__ScatterPlot__Group_7__0"


    // $ANTLR start "rule__ScatterPlot__Group_7__0__Impl"
    // InternalBiLang.g:5786:1: rule__ScatterPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__ScatterPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5790:1: ( ( 'loc' ) )
            // InternalBiLang.g:5791:1: ( 'loc' )
            {
            // InternalBiLang.g:5791:1: ( 'loc' )
            // InternalBiLang.g:5792:2: 'loc'
            {
             before(grammarAccess.getScatterPlotAccess().getLocKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getScatterPlotAccess().getLocKeyword_7_0()); 

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
    // $ANTLR end "rule__ScatterPlot__Group_7__0__Impl"


    // $ANTLR start "rule__ScatterPlot__Group_7__1"
    // InternalBiLang.g:5801:1: rule__ScatterPlot__Group_7__1 : rule__ScatterPlot__Group_7__1__Impl ;
    public final void rule__ScatterPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5805:1: ( rule__ScatterPlot__Group_7__1__Impl )
            // InternalBiLang.g:5806:2: rule__ScatterPlot__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group_7__1__Impl();

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
    // $ANTLR end "rule__ScatterPlot__Group_7__1"


    // $ANTLR start "rule__ScatterPlot__Group_7__1__Impl"
    // InternalBiLang.g:5812:1: rule__ScatterPlot__Group_7__1__Impl : ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__ScatterPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5816:1: ( ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5817:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5817:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5818:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5819:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5819:3: rule__ScatterPlot__LocationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__LocationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterPlotAccess().getLocationAssignment_7_1()); 

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
    // $ANTLR end "rule__ScatterPlot__Group_7__1__Impl"


    // $ANTLR start "rule__ScatterPlot__Group_8__0"
    // InternalBiLang.g:5828:1: rule__ScatterPlot__Group_8__0 : rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 ;
    public final void rule__ScatterPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5832:1: ( rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 )
            // InternalBiLang.g:5833:2: rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__ScatterPlot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group_8__1();

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
    // $ANTLR end "rule__ScatterPlot__Group_8__0"


    // $ANTLR start "rule__ScatterPlot__Group_8__0__Impl"
    // InternalBiLang.g:5840:1: rule__ScatterPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__ScatterPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5844:1: ( ( 'colors' ) )
            // InternalBiLang.g:5845:1: ( 'colors' )
            {
            // InternalBiLang.g:5845:1: ( 'colors' )
            // InternalBiLang.g:5846:2: 'colors'
            {
             before(grammarAccess.getScatterPlotAccess().getColorsKeyword_8_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getScatterPlotAccess().getColorsKeyword_8_0()); 

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
    // $ANTLR end "rule__ScatterPlot__Group_8__0__Impl"


    // $ANTLR start "rule__ScatterPlot__Group_8__1"
    // InternalBiLang.g:5855:1: rule__ScatterPlot__Group_8__1 : rule__ScatterPlot__Group_8__1__Impl ;
    public final void rule__ScatterPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5859:1: ( rule__ScatterPlot__Group_8__1__Impl )
            // InternalBiLang.g:5860:2: rule__ScatterPlot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group_8__1__Impl();

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
    // $ANTLR end "rule__ScatterPlot__Group_8__1"


    // $ANTLR start "rule__ScatterPlot__Group_8__1__Impl"
    // InternalBiLang.g:5866:1: rule__ScatterPlot__Group_8__1__Impl : ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__ScatterPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5870:1: ( ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5871:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5871:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5872:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5873:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5873:3: rule__ScatterPlot__ColorsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__ColorsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterPlotAccess().getColorsAssignment_8_1()); 

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
    // $ANTLR end "rule__ScatterPlot__Group_8__1__Impl"


    // $ANTLR start "rule__ScatterPlot__Group_9__0"
    // InternalBiLang.g:5882:1: rule__ScatterPlot__Group_9__0 : rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 ;
    public final void rule__ScatterPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5886:1: ( rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 )
            // InternalBiLang.g:5887:2: rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__ScatterPlot__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group_9__1();

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
    // $ANTLR end "rule__ScatterPlot__Group_9__0"


    // $ANTLR start "rule__ScatterPlot__Group_9__0__Impl"
    // InternalBiLang.g:5894:1: rule__ScatterPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__ScatterPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5898:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5899:1: ( 'thickness' )
            {
            // InternalBiLang.g:5899:1: ( 'thickness' )
            // InternalBiLang.g:5900:2: 'thickness'
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessKeyword_9_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getScatterPlotAccess().getThicknessKeyword_9_0()); 

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
    // $ANTLR end "rule__ScatterPlot__Group_9__0__Impl"


    // $ANTLR start "rule__ScatterPlot__Group_9__1"
    // InternalBiLang.g:5909:1: rule__ScatterPlot__Group_9__1 : rule__ScatterPlot__Group_9__1__Impl ;
    public final void rule__ScatterPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5913:1: ( rule__ScatterPlot__Group_9__1__Impl )
            // InternalBiLang.g:5914:2: rule__ScatterPlot__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__Group_9__1__Impl();

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
    // $ANTLR end "rule__ScatterPlot__Group_9__1"


    // $ANTLR start "rule__ScatterPlot__Group_9__1__Impl"
    // InternalBiLang.g:5920:1: rule__ScatterPlot__Group_9__1__Impl : ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__ScatterPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5924:1: ( ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5925:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5925:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5926:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5927:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5927:3: rule__ScatterPlot__ThicknessAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ScatterPlot__ThicknessAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getScatterPlotAccess().getThicknessAssignment_9_1()); 

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
    // $ANTLR end "rule__ScatterPlot__Group_9__1__Impl"


    // $ANTLR start "rule__RadarPlot__Group__0"
    // InternalBiLang.g:5936:1: rule__RadarPlot__Group__0 : rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 ;
    public final void rule__RadarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5940:1: ( rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 )
            // InternalBiLang.g:5941:2: rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RadarPlot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__1();

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
    // $ANTLR end "rule__RadarPlot__Group__0"


    // $ANTLR start "rule__RadarPlot__Group__0__Impl"
    // InternalBiLang.g:5948:1: rule__RadarPlot__Group__0__Impl : ( 'radar' ) ;
    public final void rule__RadarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5952:1: ( ( 'radar' ) )
            // InternalBiLang.g:5953:1: ( 'radar' )
            {
            // InternalBiLang.g:5953:1: ( 'radar' )
            // InternalBiLang.g:5954:2: 'radar'
            {
             before(grammarAccess.getRadarPlotAccess().getRadarKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRadarPlotAccess().getRadarKeyword_0()); 

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
    // $ANTLR end "rule__RadarPlot__Group__0__Impl"


    // $ANTLR start "rule__RadarPlot__Group__1"
    // InternalBiLang.g:5963:1: rule__RadarPlot__Group__1 : rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 ;
    public final void rule__RadarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5967:1: ( rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 )
            // InternalBiLang.g:5968:2: rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__RadarPlot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__2();

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
    // $ANTLR end "rule__RadarPlot__Group__1"


    // $ANTLR start "rule__RadarPlot__Group__1__Impl"
    // InternalBiLang.g:5975:1: rule__RadarPlot__Group__1__Impl : ( ( rule__RadarPlot__NameAssignment_1 ) ) ;
    public final void rule__RadarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5979:1: ( ( ( rule__RadarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5980:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5980:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5981:2: ( rule__RadarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5982:2: ( rule__RadarPlot__NameAssignment_1 )
            // InternalBiLang.g:5982:3: rule__RadarPlot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarPlotAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RadarPlot__Group__1__Impl"


    // $ANTLR start "rule__RadarPlot__Group__2"
    // InternalBiLang.g:5990:1: rule__RadarPlot__Group__2 : rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 ;
    public final void rule__RadarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5994:1: ( rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 )
            // InternalBiLang.g:5995:2: rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__RadarPlot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__3();

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
    // $ANTLR end "rule__RadarPlot__Group__2"


    // $ANTLR start "rule__RadarPlot__Group__2__Impl"
    // InternalBiLang.g:6002:1: rule__RadarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__RadarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6006:1: ( ( '->' ) )
            // InternalBiLang.g:6007:1: ( '->' )
            {
            // InternalBiLang.g:6007:1: ( '->' )
            // InternalBiLang.g:6008:2: '->'
            {
             before(grammarAccess.getRadarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRadarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__RadarPlot__Group__2__Impl"


    // $ANTLR start "rule__RadarPlot__Group__3"
    // InternalBiLang.g:6017:1: rule__RadarPlot__Group__3 : rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 ;
    public final void rule__RadarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6021:1: ( rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 )
            // InternalBiLang.g:6022:2: rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RadarPlot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__4();

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
    // $ANTLR end "rule__RadarPlot__Group__3"


    // $ANTLR start "rule__RadarPlot__Group__3__Impl"
    // InternalBiLang.g:6029:1: rule__RadarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__RadarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6033:1: ( ( 'xAx' ) )
            // InternalBiLang.g:6034:1: ( 'xAx' )
            {
            // InternalBiLang.g:6034:1: ( 'xAx' )
            // InternalBiLang.g:6035:2: 'xAx'
            {
             before(grammarAccess.getRadarPlotAccess().getXAxKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRadarPlotAccess().getXAxKeyword_3()); 

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
    // $ANTLR end "rule__RadarPlot__Group__3__Impl"


    // $ANTLR start "rule__RadarPlot__Group__4"
    // InternalBiLang.g:6044:1: rule__RadarPlot__Group__4 : rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 ;
    public final void rule__RadarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6048:1: ( rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 )
            // InternalBiLang.g:6049:2: rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__RadarPlot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__5();

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
    // $ANTLR end "rule__RadarPlot__Group__4"


    // $ANTLR start "rule__RadarPlot__Group__4__Impl"
    // InternalBiLang.g:6056:1: rule__RadarPlot__Group__4__Impl : ( ( rule__RadarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__RadarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6060:1: ( ( ( rule__RadarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:6061:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:6061:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:6062:2: ( rule__RadarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getRadarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:6063:2: ( rule__RadarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:6063:3: rule__RadarPlot__XAxisAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__XAxisAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRadarPlotAccess().getXAxisAssignment_4()); 

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
    // $ANTLR end "rule__RadarPlot__Group__4__Impl"


    // $ANTLR start "rule__RadarPlot__Group__5"
    // InternalBiLang.g:6071:1: rule__RadarPlot__Group__5 : rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 ;
    public final void rule__RadarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6075:1: ( rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 )
            // InternalBiLang.g:6076:2: rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__RadarPlot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__6();

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
    // $ANTLR end "rule__RadarPlot__Group__5"


    // $ANTLR start "rule__RadarPlot__Group__5__Impl"
    // InternalBiLang.g:6083:1: rule__RadarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__RadarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6087:1: ( ( 'yA' ) )
            // InternalBiLang.g:6088:1: ( 'yA' )
            {
            // InternalBiLang.g:6088:1: ( 'yA' )
            // InternalBiLang.g:6089:2: 'yA'
            {
             before(grammarAccess.getRadarPlotAccess().getYAKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRadarPlotAccess().getYAKeyword_5()); 

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
    // $ANTLR end "rule__RadarPlot__Group__5__Impl"


    // $ANTLR start "rule__RadarPlot__Group__6"
    // InternalBiLang.g:6098:1: rule__RadarPlot__Group__6 : rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 ;
    public final void rule__RadarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6102:1: ( rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 )
            // InternalBiLang.g:6103:2: rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__RadarPlot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__7();

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
    // $ANTLR end "rule__RadarPlot__Group__6"


    // $ANTLR start "rule__RadarPlot__Group__6__Impl"
    // InternalBiLang.g:6110:1: rule__RadarPlot__Group__6__Impl : ( ( rule__RadarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__RadarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6114:1: ( ( ( rule__RadarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:6115:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:6115:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:6116:2: ( rule__RadarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getRadarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:6117:2: ( rule__RadarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:6117:3: rule__RadarPlot__YAxisAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__YAxisAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRadarPlotAccess().getYAxisAssignment_6()); 

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
    // $ANTLR end "rule__RadarPlot__Group__6__Impl"


    // $ANTLR start "rule__RadarPlot__Group__7"
    // InternalBiLang.g:6125:1: rule__RadarPlot__Group__7 : rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 ;
    public final void rule__RadarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6129:1: ( rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 )
            // InternalBiLang.g:6130:2: rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__RadarPlot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__8();

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
    // $ANTLR end "rule__RadarPlot__Group__7"


    // $ANTLR start "rule__RadarPlot__Group__7__Impl"
    // InternalBiLang.g:6137:1: rule__RadarPlot__Group__7__Impl : ( ( rule__RadarPlot__Group_7__0 )? ) ;
    public final void rule__RadarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6141:1: ( ( ( rule__RadarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:6142:1: ( ( rule__RadarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:6142:1: ( ( rule__RadarPlot__Group_7__0 )? )
            // InternalBiLang.g:6143:2: ( rule__RadarPlot__Group_7__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:6144:2: ( rule__RadarPlot__Group_7__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBiLang.g:6144:3: rule__RadarPlot__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RadarPlot__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadarPlotAccess().getGroup_7()); 

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
    // $ANTLR end "rule__RadarPlot__Group__7__Impl"


    // $ANTLR start "rule__RadarPlot__Group__8"
    // InternalBiLang.g:6152:1: rule__RadarPlot__Group__8 : rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 ;
    public final void rule__RadarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6156:1: ( rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 )
            // InternalBiLang.g:6157:2: rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__RadarPlot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__9();

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
    // $ANTLR end "rule__RadarPlot__Group__8"


    // $ANTLR start "rule__RadarPlot__Group__8__Impl"
    // InternalBiLang.g:6164:1: rule__RadarPlot__Group__8__Impl : ( ( rule__RadarPlot__Group_8__0 )? ) ;
    public final void rule__RadarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6168:1: ( ( ( rule__RadarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:6169:1: ( ( rule__RadarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:6169:1: ( ( rule__RadarPlot__Group_8__0 )? )
            // InternalBiLang.g:6170:2: ( rule__RadarPlot__Group_8__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:6171:2: ( rule__RadarPlot__Group_8__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==49) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBiLang.g:6171:3: rule__RadarPlot__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RadarPlot__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadarPlotAccess().getGroup_8()); 

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
    // $ANTLR end "rule__RadarPlot__Group__8__Impl"


    // $ANTLR start "rule__RadarPlot__Group__9"
    // InternalBiLang.g:6179:1: rule__RadarPlot__Group__9 : rule__RadarPlot__Group__9__Impl ;
    public final void rule__RadarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6183:1: ( rule__RadarPlot__Group__9__Impl )
            // InternalBiLang.g:6184:2: rule__RadarPlot__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group__9__Impl();

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
    // $ANTLR end "rule__RadarPlot__Group__9"


    // $ANTLR start "rule__RadarPlot__Group__9__Impl"
    // InternalBiLang.g:6190:1: rule__RadarPlot__Group__9__Impl : ( ( rule__RadarPlot__Group_9__0 )? ) ;
    public final void rule__RadarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6194:1: ( ( ( rule__RadarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:6195:1: ( ( rule__RadarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:6195:1: ( ( rule__RadarPlot__Group_9__0 )? )
            // InternalBiLang.g:6196:2: ( rule__RadarPlot__Group_9__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:6197:2: ( rule__RadarPlot__Group_9__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBiLang.g:6197:3: rule__RadarPlot__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RadarPlot__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRadarPlotAccess().getGroup_9()); 

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
    // $ANTLR end "rule__RadarPlot__Group__9__Impl"


    // $ANTLR start "rule__RadarPlot__Group_7__0"
    // InternalBiLang.g:6206:1: rule__RadarPlot__Group_7__0 : rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 ;
    public final void rule__RadarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6210:1: ( rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 )
            // InternalBiLang.g:6211:2: rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1
            {
            pushFollow(FOLLOW_35);
            rule__RadarPlot__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group_7__1();

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
    // $ANTLR end "rule__RadarPlot__Group_7__0"


    // $ANTLR start "rule__RadarPlot__Group_7__0__Impl"
    // InternalBiLang.g:6218:1: rule__RadarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__RadarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6222:1: ( ( 'loc' ) )
            // InternalBiLang.g:6223:1: ( 'loc' )
            {
            // InternalBiLang.g:6223:1: ( 'loc' )
            // InternalBiLang.g:6224:2: 'loc'
            {
             before(grammarAccess.getRadarPlotAccess().getLocKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRadarPlotAccess().getLocKeyword_7_0()); 

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
    // $ANTLR end "rule__RadarPlot__Group_7__0__Impl"


    // $ANTLR start "rule__RadarPlot__Group_7__1"
    // InternalBiLang.g:6233:1: rule__RadarPlot__Group_7__1 : rule__RadarPlot__Group_7__1__Impl ;
    public final void rule__RadarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6237:1: ( rule__RadarPlot__Group_7__1__Impl )
            // InternalBiLang.g:6238:2: rule__RadarPlot__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group_7__1__Impl();

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
    // $ANTLR end "rule__RadarPlot__Group_7__1"


    // $ANTLR start "rule__RadarPlot__Group_7__1__Impl"
    // InternalBiLang.g:6244:1: rule__RadarPlot__Group_7__1__Impl : ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__RadarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6248:1: ( ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:6249:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:6249:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:6250:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:6251:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:6251:3: rule__RadarPlot__LocationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__LocationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarPlotAccess().getLocationAssignment_7_1()); 

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
    // $ANTLR end "rule__RadarPlot__Group_7__1__Impl"


    // $ANTLR start "rule__RadarPlot__Group_8__0"
    // InternalBiLang.g:6260:1: rule__RadarPlot__Group_8__0 : rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 ;
    public final void rule__RadarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6264:1: ( rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 )
            // InternalBiLang.g:6265:2: rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__RadarPlot__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group_8__1();

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
    // $ANTLR end "rule__RadarPlot__Group_8__0"


    // $ANTLR start "rule__RadarPlot__Group_8__0__Impl"
    // InternalBiLang.g:6272:1: rule__RadarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__RadarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6276:1: ( ( 'colors' ) )
            // InternalBiLang.g:6277:1: ( 'colors' )
            {
            // InternalBiLang.g:6277:1: ( 'colors' )
            // InternalBiLang.g:6278:2: 'colors'
            {
             before(grammarAccess.getRadarPlotAccess().getColorsKeyword_8_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRadarPlotAccess().getColorsKeyword_8_0()); 

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
    // $ANTLR end "rule__RadarPlot__Group_8__0__Impl"


    // $ANTLR start "rule__RadarPlot__Group_8__1"
    // InternalBiLang.g:6287:1: rule__RadarPlot__Group_8__1 : rule__RadarPlot__Group_8__1__Impl ;
    public final void rule__RadarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6291:1: ( rule__RadarPlot__Group_8__1__Impl )
            // InternalBiLang.g:6292:2: rule__RadarPlot__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group_8__1__Impl();

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
    // $ANTLR end "rule__RadarPlot__Group_8__1"


    // $ANTLR start "rule__RadarPlot__Group_8__1__Impl"
    // InternalBiLang.g:6298:1: rule__RadarPlot__Group_8__1__Impl : ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__RadarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6302:1: ( ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:6303:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:6303:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:6304:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:6305:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:6305:3: rule__RadarPlot__ColorsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__ColorsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarPlotAccess().getColorsAssignment_8_1()); 

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
    // $ANTLR end "rule__RadarPlot__Group_8__1__Impl"


    // $ANTLR start "rule__RadarPlot__Group_9__0"
    // InternalBiLang.g:6314:1: rule__RadarPlot__Group_9__0 : rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 ;
    public final void rule__RadarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6318:1: ( rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 )
            // InternalBiLang.g:6319:2: rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__RadarPlot__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group_9__1();

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
    // $ANTLR end "rule__RadarPlot__Group_9__0"


    // $ANTLR start "rule__RadarPlot__Group_9__0__Impl"
    // InternalBiLang.g:6326:1: rule__RadarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__RadarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6330:1: ( ( 'thickness' ) )
            // InternalBiLang.g:6331:1: ( 'thickness' )
            {
            // InternalBiLang.g:6331:1: ( 'thickness' )
            // InternalBiLang.g:6332:2: 'thickness'
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessKeyword_9_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getRadarPlotAccess().getThicknessKeyword_9_0()); 

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
    // $ANTLR end "rule__RadarPlot__Group_9__0__Impl"


    // $ANTLR start "rule__RadarPlot__Group_9__1"
    // InternalBiLang.g:6341:1: rule__RadarPlot__Group_9__1 : rule__RadarPlot__Group_9__1__Impl ;
    public final void rule__RadarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6345:1: ( rule__RadarPlot__Group_9__1__Impl )
            // InternalBiLang.g:6346:2: rule__RadarPlot__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__Group_9__1__Impl();

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
    // $ANTLR end "rule__RadarPlot__Group_9__1"


    // $ANTLR start "rule__RadarPlot__Group_9__1__Impl"
    // InternalBiLang.g:6352:1: rule__RadarPlot__Group_9__1__Impl : ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__RadarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6356:1: ( ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:6357:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:6357:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:6358:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:6359:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:6359:3: rule__RadarPlot__ThicknessAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__RadarPlot__ThicknessAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRadarPlotAccess().getThicknessAssignment_9_1()); 

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
    // $ANTLR end "rule__RadarPlot__Group_9__1__Impl"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalBiLang.g:6368:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6372:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6373:2: ( RULE_ID )
            {
            // InternalBiLang.g:6373:2: ( RULE_ID )
            // InternalBiLang.g:6374:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__FileextractorAssignment_4"
    // InternalBiLang.g:6383:1: rule__Task__FileextractorAssignment_4 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6387:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:6388:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:6388:2: ( ruleFileExtractor )
            // InternalBiLang.g:6389:3: ruleFileExtractor
            {
             before(grammarAccess.getTaskAccess().getFileextractorFileExtractorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFileExtractor();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getFileextractorFileExtractorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Task__FileextractorAssignment_4"


    // $ANTLR start "rule__Task__DatafilteringAssignment_5_1"
    // InternalBiLang.g:6398:1: rule__Task__DatafilteringAssignment_5_1 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6402:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6403:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6403:2: ( ruleDataFiltering )
            // InternalBiLang.g:6404:3: ruleDataFiltering
            {
             before(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Task__DatafilteringAssignment_5_1"


    // $ANTLR start "rule__Task__DatafilteringAssignment_5_2"
    // InternalBiLang.g:6413:1: rule__Task__DatafilteringAssignment_5_2 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6417:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6418:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6418:2: ( ruleDataFiltering )
            // InternalBiLang.g:6419:3: ruleDataFiltering
            {
             before(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Task__DatafilteringAssignment_5_2"


    // $ANTLR start "rule__Task__FileextractorAssignment_6_0"
    // InternalBiLang.g:6428:1: rule__Task__FileextractorAssignment_6_0 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6432:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:6433:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:6433:2: ( ruleFileExtractor )
            // InternalBiLang.g:6434:3: ruleFileExtractor
            {
             before(grammarAccess.getTaskAccess().getFileextractorFileExtractorParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFileExtractor();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getFileextractorFileExtractorParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Task__FileextractorAssignment_6_0"


    // $ANTLR start "rule__Task__DatafilteringAssignment_6_1_1"
    // InternalBiLang.g:6443:1: rule__Task__DatafilteringAssignment_6_1_1 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6447:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6448:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6448:2: ( ruleDataFiltering )
            // InternalBiLang.g:6449:3: ruleDataFiltering
            {
             before(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_1_0()); 

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
    // $ANTLR end "rule__Task__DatafilteringAssignment_6_1_1"


    // $ANTLR start "rule__Task__DatafilteringAssignment_6_1_2"
    // InternalBiLang.g:6458:1: rule__Task__DatafilteringAssignment_6_1_2 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_6_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6462:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6463:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6463:2: ( ruleDataFiltering )
            // InternalBiLang.g:6464:3: ruleDataFiltering
            {
             before(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_2_0()); 

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
    // $ANTLR end "rule__Task__DatafilteringAssignment_6_1_2"


    // $ANTLR start "rule__Task__DashboardAssignment_8"
    // InternalBiLang.g:6473:1: rule__Task__DashboardAssignment_8 : ( ruleDashBoard ) ;
    public final void rule__Task__DashboardAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6477:1: ( ( ruleDashBoard ) )
            // InternalBiLang.g:6478:2: ( ruleDashBoard )
            {
            // InternalBiLang.g:6478:2: ( ruleDashBoard )
            // InternalBiLang.g:6479:3: ruleDashBoard
            {
             before(grammarAccess.getTaskAccess().getDashboardDashBoardParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDashBoard();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDashboardDashBoardParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Task__DashboardAssignment_8"


    // $ANTLR start "rule__FileExtractor__NameAssignment_0"
    // InternalBiLang.g:6488:1: rule__FileExtractor__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__FileExtractor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6492:1: ( ( ruleEString ) )
            // InternalBiLang.g:6493:2: ( ruleEString )
            {
            // InternalBiLang.g:6493:2: ( ruleEString )
            // InternalBiLang.g:6494:3: ruleEString
            {
             before(grammarAccess.getFileExtractorAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFileExtractorAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FileExtractor__NameAssignment_0"


    // $ANTLR start "rule__FileExtractor__PathAssignment_2"
    // InternalBiLang.g:6503:1: rule__FileExtractor__PathAssignment_2 : ( ruleEString ) ;
    public final void rule__FileExtractor__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6507:1: ( ( ruleEString ) )
            // InternalBiLang.g:6508:2: ( ruleEString )
            {
            // InternalBiLang.g:6508:2: ( ruleEString )
            // InternalBiLang.g:6509:3: ruleEString
            {
             before(grammarAccess.getFileExtractorAccess().getPathEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFileExtractorAccess().getPathEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FileExtractor__PathAssignment_2"


    // $ANTLR start "rule__FileExtractor__NullreplacementAssignment_3_1"
    // InternalBiLang.g:6518:1: rule__FileExtractor__NullreplacementAssignment_3_1 : ( ruleNullReplacement ) ;
    public final void rule__FileExtractor__NullreplacementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6522:1: ( ( ruleNullReplacement ) )
            // InternalBiLang.g:6523:2: ( ruleNullReplacement )
            {
            // InternalBiLang.g:6523:2: ( ruleNullReplacement )
            // InternalBiLang.g:6524:3: ruleNullReplacement
            {
             before(grammarAccess.getFileExtractorAccess().getNullreplacementNullReplacementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNullReplacement();

            state._fsp--;

             after(grammarAccess.getFileExtractorAccess().getNullreplacementNullReplacementParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FileExtractor__NullreplacementAssignment_3_1"


    // $ANTLR start "rule__FileExtractor__NullreplacementAssignment_3_2_1"
    // InternalBiLang.g:6533:1: rule__FileExtractor__NullreplacementAssignment_3_2_1 : ( ruleNullReplacement ) ;
    public final void rule__FileExtractor__NullreplacementAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6537:1: ( ( ruleNullReplacement ) )
            // InternalBiLang.g:6538:2: ( ruleNullReplacement )
            {
            // InternalBiLang.g:6538:2: ( ruleNullReplacement )
            // InternalBiLang.g:6539:3: ruleNullReplacement
            {
             before(grammarAccess.getFileExtractorAccess().getNullreplacementNullReplacementParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNullReplacement();

            state._fsp--;

             after(grammarAccess.getFileExtractorAccess().getNullreplacementNullReplacementParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__FileExtractor__NullreplacementAssignment_3_2_1"


    // $ANTLR start "rule__DataFiltering__FileextractorAssignment_1"
    // InternalBiLang.g:6548:1: rule__DataFiltering__FileextractorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__DataFiltering__FileextractorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6552:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6553:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6553:2: ( ( ruleEString ) )
            // InternalBiLang.g:6554:3: ( ruleEString )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0()); 
            // InternalBiLang.g:6555:3: ( ruleEString )
            // InternalBiLang.g:6556:4: ruleEString
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0()); 

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
    // $ANTLR end "rule__DataFiltering__FileextractorAssignment_1"


    // $ANTLR start "rule__DataFiltering__ProcessingstepAssignment_2_1"
    // InternalBiLang.g:6567:1: rule__DataFiltering__ProcessingstepAssignment_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6571:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6572:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6572:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6573:3: rulePreprocessingStep
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__DataFiltering__ProcessingstepAssignment_2_1"


    // $ANTLR start "rule__DataFiltering__ProcessingstepAssignment_2_2_1"
    // InternalBiLang.g:6582:1: rule__DataFiltering__ProcessingstepAssignment_2_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6586:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6587:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6587:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6588:3: rulePreprocessingStep
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__DataFiltering__ProcessingstepAssignment_2_2_1"


    // $ANTLR start "rule__DataFiltering__FilteringstepAssignment_3_1"
    // InternalBiLang.g:6597:1: rule__DataFiltering__FilteringstepAssignment_3_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6601:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:6602:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:6602:2: ( ruleFilteringStep )
            // InternalBiLang.g:6603:3: ruleFilteringStep
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilteringStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__DataFiltering__FilteringstepAssignment_3_1"


    // $ANTLR start "rule__DataFiltering__FilteringstepAssignment_3_2_1"
    // InternalBiLang.g:6612:1: rule__DataFiltering__FilteringstepAssignment_3_2_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6616:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:6617:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:6617:2: ( ruleFilteringStep )
            // InternalBiLang.g:6618:3: ruleFilteringStep
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilteringStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__DataFiltering__FilteringstepAssignment_3_2_1"


    // $ANTLR start "rule__DashBoard__NameAssignment_0"
    // InternalBiLang.g:6627:1: rule__DashBoard__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DashBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6631:1: ( ( ruleEString ) )
            // InternalBiLang.g:6632:2: ( ruleEString )
            {
            // InternalBiLang.g:6632:2: ( ruleEString )
            // InternalBiLang.g:6633:3: ruleEString
            {
             before(grammarAccess.getDashBoardAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DashBoard__NameAssignment_0"


    // $ANTLR start "rule__DashBoard__FileextractorAssignment_2_0"
    // InternalBiLang.g:6642:1: rule__DashBoard__FileextractorAssignment_2_0 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__FileextractorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6646:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6647:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6647:2: ( ( ruleEString ) )
            // InternalBiLang.g:6648:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_0()); 
            // InternalBiLang.g:6649:3: ( ruleEString )
            // InternalBiLang.g:6650:4: ruleEString
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorEStringParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorEStringParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_0()); 

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
    // $ANTLR end "rule__DashBoard__FileextractorAssignment_2_0"


    // $ANTLR start "rule__DashBoard__PlotAssignment_2_3"
    // InternalBiLang.g:6661:1: rule__DashBoard__PlotAssignment_2_3 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6665:1: ( ( rulePlot ) )
            // InternalBiLang.g:6666:2: ( rulePlot )
            {
            // InternalBiLang.g:6666:2: ( rulePlot )
            // InternalBiLang.g:6667:3: rulePlot
            {
             before(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            rulePlot();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__DashBoard__PlotAssignment_2_3"


    // $ANTLR start "rule__DashBoard__PlotAssignment_2_4"
    // InternalBiLang.g:6676:1: rule__DashBoard__PlotAssignment_2_4 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6680:1: ( ( rulePlot ) )
            // InternalBiLang.g:6681:2: ( rulePlot )
            {
            // InternalBiLang.g:6681:2: ( rulePlot )
            // InternalBiLang.g:6682:3: rulePlot
            {
             before(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlot();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_2_4_0()); 

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
    // $ANTLR end "rule__DashBoard__PlotAssignment_2_4"


    // $ANTLR start "rule__NullReplacement__ColNameAssignment_0"
    // InternalBiLang.g:6691:1: rule__NullReplacement__ColNameAssignment_0 : ( ruleEString ) ;
    public final void rule__NullReplacement__ColNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6695:1: ( ( ruleEString ) )
            // InternalBiLang.g:6696:2: ( ruleEString )
            {
            // InternalBiLang.g:6696:2: ( ruleEString )
            // InternalBiLang.g:6697:3: ruleEString
            {
             before(grammarAccess.getNullReplacementAccess().getColNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNullReplacementAccess().getColNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NullReplacement__ColNameAssignment_0"


    // $ANTLR start "rule__NullReplacement__LabelAssignment_2_0"
    // InternalBiLang.g:6706:1: rule__NullReplacement__LabelAssignment_2_0 : ( ruleEString ) ;
    public final void rule__NullReplacement__LabelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6710:1: ( ( ruleEString ) )
            // InternalBiLang.g:6711:2: ( ruleEString )
            {
            // InternalBiLang.g:6711:2: ( ruleEString )
            // InternalBiLang.g:6712:3: ruleEString
            {
             before(grammarAccess.getNullReplacementAccess().getLabelEStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNullReplacementAccess().getLabelEStringParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__NullReplacement__LabelAssignment_2_0"


    // $ANTLR start "rule__NullReplacement__StatisticaloperationAssignment_2_1"
    // InternalBiLang.g:6721:1: rule__NullReplacement__StatisticaloperationAssignment_2_1 : ( ruleStatisticalOperation ) ;
    public final void rule__NullReplacement__StatisticaloperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6725:1: ( ( ruleStatisticalOperation ) )
            // InternalBiLang.g:6726:2: ( ruleStatisticalOperation )
            {
            // InternalBiLang.g:6726:2: ( ruleStatisticalOperation )
            // InternalBiLang.g:6727:3: ruleStatisticalOperation
            {
             before(grammarAccess.getNullReplacementAccess().getStatisticaloperationStatisticalOperationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatisticalOperation();

            state._fsp--;

             after(grammarAccess.getNullReplacementAccess().getStatisticaloperationStatisticalOperationParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__NullReplacement__StatisticaloperationAssignment_2_1"


    // $ANTLR start "rule__QuantitativeFiltering__AxisAssignment_1"
    // InternalBiLang.g:6736:1: rule__QuantitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QuantitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6740:1: ( ( ruleEString ) )
            // InternalBiLang.g:6741:2: ( ruleEString )
            {
            // InternalBiLang.g:6741:2: ( ruleEString )
            // InternalBiLang.g:6742:3: ruleEString
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QuantitativeFiltering__AxisAssignment_1"


    // $ANTLR start "rule__QuantitativeFiltering__OperatorAssignment_2"
    // InternalBiLang.g:6751:1: rule__QuantitativeFiltering__OperatorAssignment_2 : ( ruleQuantitativeOperator ) ;
    public final void rule__QuantitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6755:1: ( ( ruleQuantitativeOperator ) )
            // InternalBiLang.g:6756:2: ( ruleQuantitativeOperator )
            {
            // InternalBiLang.g:6756:2: ( ruleQuantitativeOperator )
            // InternalBiLang.g:6757:3: ruleQuantitativeOperator
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getOperatorQuantitativeOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantitativeOperator();

            state._fsp--;

             after(grammarAccess.getQuantitativeFilteringAccess().getOperatorQuantitativeOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__QuantitativeFiltering__OperatorAssignment_2"


    // $ANTLR start "rule__QuantitativeFiltering__ValuesAssignment_3"
    // InternalBiLang.g:6766:1: rule__QuantitativeFiltering__ValuesAssignment_3 : ( ruleEFloat ) ;
    public final void rule__QuantitativeFiltering__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6770:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6771:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6771:2: ( ruleEFloat )
            // InternalBiLang.g:6772:3: ruleEFloat
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValuesEFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getQuantitativeFilteringAccess().getValuesEFloatParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__QuantitativeFiltering__ValuesAssignment_3"


    // $ANTLR start "rule__QualitativeFiltering__AxisAssignment_1"
    // InternalBiLang.g:6781:1: rule__QualitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6785:1: ( ( ruleEString ) )
            // InternalBiLang.g:6786:2: ( ruleEString )
            {
            // InternalBiLang.g:6786:2: ( ruleEString )
            // InternalBiLang.g:6787:3: ruleEString
            {
             before(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QualitativeFiltering__AxisAssignment_1"


    // $ANTLR start "rule__QualitativeFiltering__OperatorAssignment_2"
    // InternalBiLang.g:6796:1: rule__QualitativeFiltering__OperatorAssignment_2 : ( ruleQualitativeOperator ) ;
    public final void rule__QualitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6800:1: ( ( ruleQualitativeOperator ) )
            // InternalBiLang.g:6801:2: ( ruleQualitativeOperator )
            {
            // InternalBiLang.g:6801:2: ( ruleQualitativeOperator )
            // InternalBiLang.g:6802:3: ruleQualitativeOperator
            {
             before(grammarAccess.getQualitativeFilteringAccess().getOperatorQualitativeOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualitativeOperator();

            state._fsp--;

             after(grammarAccess.getQualitativeFilteringAccess().getOperatorQualitativeOperatorEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__QualitativeFiltering__OperatorAssignment_2"


    // $ANTLR start "rule__QualitativeFiltering__LabelsAssignment_3"
    // InternalBiLang.g:6811:1: rule__QualitativeFiltering__LabelsAssignment_3 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__LabelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6815:1: ( ( ruleEString ) )
            // InternalBiLang.g:6816:2: ( ruleEString )
            {
            // InternalBiLang.g:6816:2: ( ruleEString )
            // InternalBiLang.g:6817:3: ruleEString
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelsEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualitativeFilteringAccess().getLabelsEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__QualitativeFiltering__LabelsAssignment_3"


    // $ANTLR start "rule__MathOperation__LsideAssignment_2"
    // InternalBiLang.g:6826:1: rule__MathOperation__LsideAssignment_2 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__LsideAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6830:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6831:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6831:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6832:3: rulePreprocessingStep
            {
             before(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MathOperation__LsideAssignment_2"


    // $ANTLR start "rule__MathOperation__OperatorAssignment_3"
    // InternalBiLang.g:6841:1: rule__MathOperation__OperatorAssignment_3 : ( ruleMathOperator ) ;
    public final void rule__MathOperation__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6845:1: ( ( ruleMathOperator ) )
            // InternalBiLang.g:6846:2: ( ruleMathOperator )
            {
            // InternalBiLang.g:6846:2: ( ruleMathOperator )
            // InternalBiLang.g:6847:3: ruleMathOperator
            {
             before(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__MathOperation__OperatorAssignment_3"


    // $ANTLR start "rule__MathOperation__RsideAssignment_5"
    // InternalBiLang.g:6856:1: rule__MathOperation__RsideAssignment_5 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__RsideAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6860:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6861:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6861:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6862:3: rulePreprocessingStep
            {
             before(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__MathOperation__RsideAssignment_5"


    // $ANTLR start "rule__ColReference__TargetAssignment_1"
    // InternalBiLang.g:6871:1: rule__ColReference__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__ColReference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6875:1: ( ( ruleEString ) )
            // InternalBiLang.g:6876:2: ( ruleEString )
            {
            // InternalBiLang.g:6876:2: ( ruleEString )
            // InternalBiLang.g:6877:3: ruleEString
            {
             before(grammarAccess.getColReferenceAccess().getTargetEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColReferenceAccess().getTargetEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ColReference__TargetAssignment_1"


    // $ANTLR start "rule__StatisticalOperation__OperatorAssignment_0"
    // InternalBiLang.g:6886:1: rule__StatisticalOperation__OperatorAssignment_0 : ( ruleStatisticalOperator ) ;
    public final void rule__StatisticalOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6890:1: ( ( ruleStatisticalOperator ) )
            // InternalBiLang.g:6891:2: ( ruleStatisticalOperator )
            {
            // InternalBiLang.g:6891:2: ( ruleStatisticalOperator )
            // InternalBiLang.g:6892:3: ruleStatisticalOperator
            {
             before(grammarAccess.getStatisticalOperationAccess().getOperatorStatisticalOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatisticalOperator();

            state._fsp--;

             after(grammarAccess.getStatisticalOperationAccess().getOperatorStatisticalOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__StatisticalOperation__OperatorAssignment_0"


    // $ANTLR start "rule__StatisticalOperation__ColreferenceAssignment_2"
    // InternalBiLang.g:6901:1: rule__StatisticalOperation__ColreferenceAssignment_2 : ( ruleColReference ) ;
    public final void rule__StatisticalOperation__ColreferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6905:1: ( ( ruleColReference ) )
            // InternalBiLang.g:6906:2: ( ruleColReference )
            {
            // InternalBiLang.g:6906:2: ( ruleColReference )
            // InternalBiLang.g:6907:3: ruleColReference
            {
             before(grammarAccess.getStatisticalOperationAccess().getColreferenceColReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColReference();

            state._fsp--;

             after(grammarAccess.getStatisticalOperationAccess().getColreferenceColReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StatisticalOperation__ColreferenceAssignment_2"


    // $ANTLR start "rule__BarPlot__NameAssignment_2"
    // InternalBiLang.g:6916:1: rule__BarPlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BarPlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6920:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6921:2: ( RULE_ID )
            {
            // InternalBiLang.g:6921:2: ( RULE_ID )
            // InternalBiLang.g:6922:3: RULE_ID
            {
             before(grammarAccess.getBarPlotAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBarPlotAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BarPlot__NameAssignment_2"


    // $ANTLR start "rule__BarPlot__XAxisAssignment_5"
    // InternalBiLang.g:6931:1: rule__BarPlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__BarPlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6935:1: ( ( ruleEString ) )
            // InternalBiLang.g:6936:2: ( ruleEString )
            {
            // InternalBiLang.g:6936:2: ( ruleEString )
            // InternalBiLang.g:6937:3: ruleEString
            {
             before(grammarAccess.getBarPlotAccess().getXAxisEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarPlotAccess().getXAxisEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__BarPlot__XAxisAssignment_5"


    // $ANTLR start "rule__BarPlot__YAxisAssignment_7"
    // InternalBiLang.g:6946:1: rule__BarPlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__BarPlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6950:1: ( ( ruleEString ) )
            // InternalBiLang.g:6951:2: ( ruleEString )
            {
            // InternalBiLang.g:6951:2: ( ruleEString )
            // InternalBiLang.g:6952:3: ruleEString
            {
             before(grammarAccess.getBarPlotAccess().getYAxisEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarPlotAccess().getYAxisEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__BarPlot__YAxisAssignment_7"


    // $ANTLR start "rule__BarPlot__LocationAssignment_8_1"
    // InternalBiLang.g:6961:1: rule__BarPlot__LocationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__BarPlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6965:1: ( ( ruleEInt ) )
            // InternalBiLang.g:6966:2: ( ruleEInt )
            {
            // InternalBiLang.g:6966:2: ( ruleEInt )
            // InternalBiLang.g:6967:3: ruleEInt
            {
             before(grammarAccess.getBarPlotAccess().getLocationEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getBarPlotAccess().getLocationEIntParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__BarPlot__LocationAssignment_8_1"


    // $ANTLR start "rule__BarPlot__ColorsAssignment_9_1"
    // InternalBiLang.g:6976:1: rule__BarPlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarPlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6980:1: ( ( ruleEString ) )
            // InternalBiLang.g:6981:2: ( ruleEString )
            {
            // InternalBiLang.g:6981:2: ( ruleEString )
            // InternalBiLang.g:6982:3: ruleEString
            {
             before(grammarAccess.getBarPlotAccess().getColorsEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarPlotAccess().getColorsEStringParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__BarPlot__ColorsAssignment_9_1"


    // $ANTLR start "rule__BarPlot__ThicknessAssignment_10_1"
    // InternalBiLang.g:6991:1: rule__BarPlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__BarPlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6995:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6996:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6996:2: ( ruleEFloat )
            // InternalBiLang.g:6997:3: ruleEFloat
            {
             before(grammarAccess.getBarPlotAccess().getThicknessEFloatParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getBarPlotAccess().getThicknessEFloatParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__BarPlot__ThicknessAssignment_10_1"


    // $ANTLR start "rule__LinePlot__NameAssignment_2"
    // InternalBiLang.g:7006:1: rule__LinePlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinePlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7010:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7011:2: ( RULE_ID )
            {
            // InternalBiLang.g:7011:2: ( RULE_ID )
            // InternalBiLang.g:7012:3: RULE_ID
            {
             before(grammarAccess.getLinePlotAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinePlotAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__LinePlot__NameAssignment_2"


    // $ANTLR start "rule__LinePlot__XAxisAssignment_5"
    // InternalBiLang.g:7021:1: rule__LinePlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__LinePlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7025:1: ( ( ruleEString ) )
            // InternalBiLang.g:7026:2: ( ruleEString )
            {
            // InternalBiLang.g:7026:2: ( ruleEString )
            // InternalBiLang.g:7027:3: ruleEString
            {
             before(grammarAccess.getLinePlotAccess().getXAxisEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinePlotAccess().getXAxisEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__LinePlot__XAxisAssignment_5"


    // $ANTLR start "rule__LinePlot__YAxisAssignment_7"
    // InternalBiLang.g:7036:1: rule__LinePlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__LinePlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7040:1: ( ( ruleEString ) )
            // InternalBiLang.g:7041:2: ( ruleEString )
            {
            // InternalBiLang.g:7041:2: ( ruleEString )
            // InternalBiLang.g:7042:3: ruleEString
            {
             before(grammarAccess.getLinePlotAccess().getYAxisEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinePlotAccess().getYAxisEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__LinePlot__YAxisAssignment_7"


    // $ANTLR start "rule__LinePlot__LocationAssignment_8_1"
    // InternalBiLang.g:7051:1: rule__LinePlot__LocationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__LinePlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7055:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7056:2: ( ruleEInt )
            {
            // InternalBiLang.g:7056:2: ( ruleEInt )
            // InternalBiLang.g:7057:3: ruleEInt
            {
             before(grammarAccess.getLinePlotAccess().getLocationEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLinePlotAccess().getLocationEIntParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__LinePlot__LocationAssignment_8_1"


    // $ANTLR start "rule__LinePlot__ColorsAssignment_9_1"
    // InternalBiLang.g:7066:1: rule__LinePlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LinePlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7070:1: ( ( ruleEString ) )
            // InternalBiLang.g:7071:2: ( ruleEString )
            {
            // InternalBiLang.g:7071:2: ( ruleEString )
            // InternalBiLang.g:7072:3: ruleEString
            {
             before(grammarAccess.getLinePlotAccess().getColorsEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinePlotAccess().getColorsEStringParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__LinePlot__ColorsAssignment_9_1"


    // $ANTLR start "rule__LinePlot__ThicknessAssignment_10_1"
    // InternalBiLang.g:7081:1: rule__LinePlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__LinePlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7085:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7086:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7086:2: ( ruleEFloat )
            // InternalBiLang.g:7087:3: ruleEFloat
            {
             before(grammarAccess.getLinePlotAccess().getThicknessEFloatParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getLinePlotAccess().getThicknessEFloatParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__LinePlot__ThicknessAssignment_10_1"


    // $ANTLR start "rule__DonutPlot__NameAssignment_1"
    // InternalBiLang.g:7096:1: rule__DonutPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DonutPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7100:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7101:2: ( RULE_ID )
            {
            // InternalBiLang.g:7101:2: ( RULE_ID )
            // InternalBiLang.g:7102:3: RULE_ID
            {
             before(grammarAccess.getDonutPlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DonutPlot__NameAssignment_1"


    // $ANTLR start "rule__DonutPlot__XAxisAssignment_4"
    // InternalBiLang.g:7111:1: rule__DonutPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__DonutPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7115:1: ( ( ruleEString ) )
            // InternalBiLang.g:7116:2: ( ruleEString )
            {
            // InternalBiLang.g:7116:2: ( ruleEString )
            // InternalBiLang.g:7117:3: ruleEString
            {
             before(grammarAccess.getDonutPlotAccess().getXAxisEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getXAxisEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DonutPlot__XAxisAssignment_4"


    // $ANTLR start "rule__DonutPlot__YAxisAssignment_6"
    // InternalBiLang.g:7126:1: rule__DonutPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__DonutPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7130:1: ( ( ruleEString ) )
            // InternalBiLang.g:7131:2: ( ruleEString )
            {
            // InternalBiLang.g:7131:2: ( ruleEString )
            // InternalBiLang.g:7132:3: ruleEString
            {
             before(grammarAccess.getDonutPlotAccess().getYAxisEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getYAxisEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DonutPlot__YAxisAssignment_6"


    // $ANTLR start "rule__DonutPlot__LocationAssignment_7_1"
    // InternalBiLang.g:7141:1: rule__DonutPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__DonutPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7145:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7146:2: ( ruleEInt )
            {
            // InternalBiLang.g:7146:2: ( ruleEInt )
            // InternalBiLang.g:7147:3: ruleEInt
            {
             before(grammarAccess.getDonutPlotAccess().getLocationEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getLocationEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__DonutPlot__LocationAssignment_7_1"


    // $ANTLR start "rule__DonutPlot__ColorsAssignment_8_1"
    // InternalBiLang.g:7156:1: rule__DonutPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__DonutPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7160:1: ( ( ruleEString ) )
            // InternalBiLang.g:7161:2: ( ruleEString )
            {
            // InternalBiLang.g:7161:2: ( ruleEString )
            // InternalBiLang.g:7162:3: ruleEString
            {
             before(grammarAccess.getDonutPlotAccess().getColorsEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getColorsEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__DonutPlot__ColorsAssignment_8_1"


    // $ANTLR start "rule__DonutPlot__ThicknessAssignment_9_1"
    // InternalBiLang.g:7171:1: rule__DonutPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__DonutPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7175:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7176:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7176:2: ( ruleEFloat )
            // InternalBiLang.g:7177:3: ruleEFloat
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__DonutPlot__ThicknessAssignment_9_1"


    // $ANTLR start "rule__PiePlot__NameAssignment_1"
    // InternalBiLang.g:7186:1: rule__PiePlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PiePlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7190:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7191:2: ( RULE_ID )
            {
            // InternalBiLang.g:7191:2: ( RULE_ID )
            // InternalBiLang.g:7192:3: RULE_ID
            {
             before(grammarAccess.getPiePlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PiePlot__NameAssignment_1"


    // $ANTLR start "rule__PiePlot__XAxisAssignment_4"
    // InternalBiLang.g:7201:1: rule__PiePlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PiePlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7205:1: ( ( ruleEString ) )
            // InternalBiLang.g:7206:2: ( ruleEString )
            {
            // InternalBiLang.g:7206:2: ( ruleEString )
            // InternalBiLang.g:7207:3: ruleEString
            {
             before(grammarAccess.getPiePlotAccess().getXAxisEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getXAxisEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PiePlot__XAxisAssignment_4"


    // $ANTLR start "rule__PiePlot__YAxisAssignment_6"
    // InternalBiLang.g:7216:1: rule__PiePlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PiePlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7220:1: ( ( ruleEString ) )
            // InternalBiLang.g:7221:2: ( ruleEString )
            {
            // InternalBiLang.g:7221:2: ( ruleEString )
            // InternalBiLang.g:7222:3: ruleEString
            {
             before(grammarAccess.getPiePlotAccess().getYAxisEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getYAxisEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__PiePlot__YAxisAssignment_6"


    // $ANTLR start "rule__PiePlot__LocationAssignment_7_1"
    // InternalBiLang.g:7231:1: rule__PiePlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__PiePlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7235:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7236:2: ( ruleEInt )
            {
            // InternalBiLang.g:7236:2: ( ruleEInt )
            // InternalBiLang.g:7237:3: ruleEInt
            {
             before(grammarAccess.getPiePlotAccess().getLocationEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getLocationEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__PiePlot__LocationAssignment_7_1"


    // $ANTLR start "rule__PiePlot__ColorsAssignment_8_1"
    // InternalBiLang.g:7246:1: rule__PiePlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PiePlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7250:1: ( ( ruleEString ) )
            // InternalBiLang.g:7251:2: ( ruleEString )
            {
            // InternalBiLang.g:7251:2: ( ruleEString )
            // InternalBiLang.g:7252:3: ruleEString
            {
             before(grammarAccess.getPiePlotAccess().getColorsEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getColorsEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__PiePlot__ColorsAssignment_8_1"


    // $ANTLR start "rule__PiePlot__ThicknessAssignment_9_1"
    // InternalBiLang.g:7261:1: rule__PiePlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PiePlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7265:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7266:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7266:2: ( ruleEFloat )
            // InternalBiLang.g:7267:3: ruleEFloat
            {
             before(grammarAccess.getPiePlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__PiePlot__ThicknessAssignment_9_1"


    // $ANTLR start "rule__PolarPlot__NameAssignment_1"
    // InternalBiLang.g:7276:1: rule__PolarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PolarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7280:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7281:2: ( RULE_ID )
            {
            // InternalBiLang.g:7281:2: ( RULE_ID )
            // InternalBiLang.g:7282:3: RULE_ID
            {
             before(grammarAccess.getPolarPlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolarPlotAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PolarPlot__NameAssignment_1"


    // $ANTLR start "rule__PolarPlot__XAxisAssignment_4"
    // InternalBiLang.g:7291:1: rule__PolarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PolarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7295:1: ( ( ruleEString ) )
            // InternalBiLang.g:7296:2: ( ruleEString )
            {
            // InternalBiLang.g:7296:2: ( ruleEString )
            // InternalBiLang.g:7297:3: ruleEString
            {
             before(grammarAccess.getPolarPlotAccess().getXAxisEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolarPlotAccess().getXAxisEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PolarPlot__XAxisAssignment_4"


    // $ANTLR start "rule__PolarPlot__YAxisAssignment_6"
    // InternalBiLang.g:7306:1: rule__PolarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PolarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7310:1: ( ( ruleEString ) )
            // InternalBiLang.g:7311:2: ( ruleEString )
            {
            // InternalBiLang.g:7311:2: ( ruleEString )
            // InternalBiLang.g:7312:3: ruleEString
            {
             before(grammarAccess.getPolarPlotAccess().getYAxisEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolarPlotAccess().getYAxisEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__PolarPlot__YAxisAssignment_6"


    // $ANTLR start "rule__PolarPlot__LocationAssignment_7_1"
    // InternalBiLang.g:7321:1: rule__PolarPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__PolarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7325:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7326:2: ( ruleEInt )
            {
            // InternalBiLang.g:7326:2: ( ruleEInt )
            // InternalBiLang.g:7327:3: ruleEInt
            {
             before(grammarAccess.getPolarPlotAccess().getLocationEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPolarPlotAccess().getLocationEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__PolarPlot__LocationAssignment_7_1"


    // $ANTLR start "rule__PolarPlot__ColorsAssignment_8_1"
    // InternalBiLang.g:7336:1: rule__PolarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PolarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7340:1: ( ( ruleEString ) )
            // InternalBiLang.g:7341:2: ( ruleEString )
            {
            // InternalBiLang.g:7341:2: ( ruleEString )
            // InternalBiLang.g:7342:3: ruleEString
            {
             before(grammarAccess.getPolarPlotAccess().getColorsEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolarPlotAccess().getColorsEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__PolarPlot__ColorsAssignment_8_1"


    // $ANTLR start "rule__PolarPlot__ThicknessAssignment_9_1"
    // InternalBiLang.g:7351:1: rule__PolarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PolarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7355:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7356:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7356:2: ( ruleEFloat )
            // InternalBiLang.g:7357:3: ruleEFloat
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPolarPlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__PolarPlot__ThicknessAssignment_9_1"


    // $ANTLR start "rule__ScatterPlot__NameAssignment_1"
    // InternalBiLang.g:7366:1: rule__ScatterPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScatterPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7370:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7371:2: ( RULE_ID )
            {
            // InternalBiLang.g:7371:2: ( RULE_ID )
            // InternalBiLang.g:7372:3: RULE_ID
            {
             before(grammarAccess.getScatterPlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScatterPlotAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ScatterPlot__NameAssignment_1"


    // $ANTLR start "rule__ScatterPlot__XAxisAssignment_4"
    // InternalBiLang.g:7381:1: rule__ScatterPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__ScatterPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7385:1: ( ( ruleEString ) )
            // InternalBiLang.g:7386:2: ( ruleEString )
            {
            // InternalBiLang.g:7386:2: ( ruleEString )
            // InternalBiLang.g:7387:3: ruleEString
            {
             before(grammarAccess.getScatterPlotAccess().getXAxisEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScatterPlotAccess().getXAxisEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ScatterPlot__XAxisAssignment_4"


    // $ANTLR start "rule__ScatterPlot__YAxisAssignment_6"
    // InternalBiLang.g:7396:1: rule__ScatterPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__ScatterPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7400:1: ( ( ruleEString ) )
            // InternalBiLang.g:7401:2: ( ruleEString )
            {
            // InternalBiLang.g:7401:2: ( ruleEString )
            // InternalBiLang.g:7402:3: ruleEString
            {
             before(grammarAccess.getScatterPlotAccess().getYAxisEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScatterPlotAccess().getYAxisEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ScatterPlot__YAxisAssignment_6"


    // $ANTLR start "rule__ScatterPlot__LocationAssignment_7_1"
    // InternalBiLang.g:7411:1: rule__ScatterPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__ScatterPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7415:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7416:2: ( ruleEInt )
            {
            // InternalBiLang.g:7416:2: ( ruleEInt )
            // InternalBiLang.g:7417:3: ruleEInt
            {
             before(grammarAccess.getScatterPlotAccess().getLocationEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getScatterPlotAccess().getLocationEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__ScatterPlot__LocationAssignment_7_1"


    // $ANTLR start "rule__ScatterPlot__ColorsAssignment_8_1"
    // InternalBiLang.g:7426:1: rule__ScatterPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ScatterPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7430:1: ( ( ruleEString ) )
            // InternalBiLang.g:7431:2: ( ruleEString )
            {
            // InternalBiLang.g:7431:2: ( ruleEString )
            // InternalBiLang.g:7432:3: ruleEString
            {
             before(grammarAccess.getScatterPlotAccess().getColorsEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScatterPlotAccess().getColorsEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__ScatterPlot__ColorsAssignment_8_1"


    // $ANTLR start "rule__ScatterPlot__ThicknessAssignment_9_1"
    // InternalBiLang.g:7441:1: rule__ScatterPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__ScatterPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7445:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7446:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7446:2: ( ruleEFloat )
            // InternalBiLang.g:7447:3: ruleEFloat
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getScatterPlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__ScatterPlot__ThicknessAssignment_9_1"


    // $ANTLR start "rule__RadarPlot__NameAssignment_1"
    // InternalBiLang.g:7456:1: rule__RadarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RadarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7460:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7461:2: ( RULE_ID )
            {
            // InternalBiLang.g:7461:2: ( RULE_ID )
            // InternalBiLang.g:7462:3: RULE_ID
            {
             before(grammarAccess.getRadarPlotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRadarPlotAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RadarPlot__NameAssignment_1"


    // $ANTLR start "rule__RadarPlot__XAxisAssignment_4"
    // InternalBiLang.g:7471:1: rule__RadarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__RadarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7475:1: ( ( ruleEString ) )
            // InternalBiLang.g:7476:2: ( ruleEString )
            {
            // InternalBiLang.g:7476:2: ( ruleEString )
            // InternalBiLang.g:7477:3: ruleEString
            {
             before(grammarAccess.getRadarPlotAccess().getXAxisEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadarPlotAccess().getXAxisEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RadarPlot__XAxisAssignment_4"


    // $ANTLR start "rule__RadarPlot__YAxisAssignment_6"
    // InternalBiLang.g:7486:1: rule__RadarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__RadarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7490:1: ( ( ruleEString ) )
            // InternalBiLang.g:7491:2: ( ruleEString )
            {
            // InternalBiLang.g:7491:2: ( ruleEString )
            // InternalBiLang.g:7492:3: ruleEString
            {
             before(grammarAccess.getRadarPlotAccess().getYAxisEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadarPlotAccess().getYAxisEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RadarPlot__YAxisAssignment_6"


    // $ANTLR start "rule__RadarPlot__LocationAssignment_7_1"
    // InternalBiLang.g:7501:1: rule__RadarPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__RadarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7505:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7506:2: ( ruleEInt )
            {
            // InternalBiLang.g:7506:2: ( ruleEInt )
            // InternalBiLang.g:7507:3: ruleEInt
            {
             before(grammarAccess.getRadarPlotAccess().getLocationEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRadarPlotAccess().getLocationEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__RadarPlot__LocationAssignment_7_1"


    // $ANTLR start "rule__RadarPlot__ColorsAssignment_8_1"
    // InternalBiLang.g:7516:1: rule__RadarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__RadarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7520:1: ( ( ruleEString ) )
            // InternalBiLang.g:7521:2: ( ruleEString )
            {
            // InternalBiLang.g:7521:2: ( ruleEString )
            // InternalBiLang.g:7522:3: ruleEString
            {
             before(grammarAccess.getRadarPlotAccess().getColorsEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadarPlotAccess().getColorsEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__RadarPlot__ColorsAssignment_8_1"


    // $ANTLR start "rule__RadarPlot__ThicknessAssignment_9_1"
    // InternalBiLang.g:7531:1: rule__RadarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__RadarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7535:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7536:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7536:2: ( ruleEFloat )
            // InternalBiLang.g:7537:3: ruleEFloat
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRadarPlotAccess().getThicknessEFloatParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__RadarPlot__ThicknessAssignment_9_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000050000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000180000E0030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x01F8100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x01F8104000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01F8100000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000004040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});

}