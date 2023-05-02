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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'+'", "'-'", "'*'", "'/'", "'mean'", "'median'", "'std'", "'= '", "'!= '", "'[]'", "']['", "'[['", "']]'", "'='", "'<'", "'>'", "'<='", "'>='", "'Task'", "':'", "'load'", "'dashboard:'", "'=>'", "'null replacement->'", "','", "'->'", "'filtering='", "'processing='", "'count='", "'{'", "'}='", "'plots'", "'}'", "'('", "'l'", "'r'", "')'", "'.'", "'bar'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'donut'", "'countID'", "'pie'", "'polar'", "'scatter'", "'radar'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
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


    // $ANTLR start "entryRuleCountPreprocessingStep"
    // InternalBiLang.g:228:1: entryRuleCountPreprocessingStep : ruleCountPreprocessingStep EOF ;
    public final void entryRuleCountPreprocessingStep() throws RecognitionException {
        try {
            // InternalBiLang.g:229:1: ( ruleCountPreprocessingStep EOF )
            // InternalBiLang.g:230:1: ruleCountPreprocessingStep EOF
            {
             before(grammarAccess.getCountPreprocessingStepRule()); 
            pushFollow(FOLLOW_1);
            ruleCountPreprocessingStep();

            state._fsp--;

             after(grammarAccess.getCountPreprocessingStepRule()); 
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
    // $ANTLR end "entryRuleCountPreprocessingStep"


    // $ANTLR start "ruleCountPreprocessingStep"
    // InternalBiLang.g:237:1: ruleCountPreprocessingStep : ( ( rule__CountPreprocessingStep__Group__0 ) ) ;
    public final void ruleCountPreprocessingStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:241:2: ( ( ( rule__CountPreprocessingStep__Group__0 ) ) )
            // InternalBiLang.g:242:2: ( ( rule__CountPreprocessingStep__Group__0 ) )
            {
            // InternalBiLang.g:242:2: ( ( rule__CountPreprocessingStep__Group__0 ) )
            // InternalBiLang.g:243:3: ( rule__CountPreprocessingStep__Group__0 )
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getGroup()); 
            // InternalBiLang.g:244:3: ( rule__CountPreprocessingStep__Group__0 )
            // InternalBiLang.g:244:4: rule__CountPreprocessingStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountPreprocessingStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountPreprocessingStep"


    // $ANTLR start "entryRuleCountQualiStatement"
    // InternalBiLang.g:253:1: entryRuleCountQualiStatement : ruleCountQualiStatement EOF ;
    public final void entryRuleCountQualiStatement() throws RecognitionException {
        try {
            // InternalBiLang.g:254:1: ( ruleCountQualiStatement EOF )
            // InternalBiLang.g:255:1: ruleCountQualiStatement EOF
            {
             before(grammarAccess.getCountQualiStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCountQualiStatement();

            state._fsp--;

             after(grammarAccess.getCountQualiStatementRule()); 
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
    // $ANTLR end "entryRuleCountQualiStatement"


    // $ANTLR start "ruleCountQualiStatement"
    // InternalBiLang.g:262:1: ruleCountQualiStatement : ( ( rule__CountQualiStatement__Group__0 ) ) ;
    public final void ruleCountQualiStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:266:2: ( ( ( rule__CountQualiStatement__Group__0 ) ) )
            // InternalBiLang.g:267:2: ( ( rule__CountQualiStatement__Group__0 ) )
            {
            // InternalBiLang.g:267:2: ( ( rule__CountQualiStatement__Group__0 ) )
            // InternalBiLang.g:268:3: ( rule__CountQualiStatement__Group__0 )
            {
             before(grammarAccess.getCountQualiStatementAccess().getGroup()); 
            // InternalBiLang.g:269:3: ( rule__CountQualiStatement__Group__0 )
            // InternalBiLang.g:269:4: rule__CountQualiStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountQualiStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountQualiStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountQualiStatement"


    // $ANTLR start "entryRuleCountQuantiStatement"
    // InternalBiLang.g:278:1: entryRuleCountQuantiStatement : ruleCountQuantiStatement EOF ;
    public final void entryRuleCountQuantiStatement() throws RecognitionException {
        try {
            // InternalBiLang.g:279:1: ( ruleCountQuantiStatement EOF )
            // InternalBiLang.g:280:1: ruleCountQuantiStatement EOF
            {
             before(grammarAccess.getCountQuantiStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCountQuantiStatement();

            state._fsp--;

             after(grammarAccess.getCountQuantiStatementRule()); 
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
    // $ANTLR end "entryRuleCountQuantiStatement"


    // $ANTLR start "ruleCountQuantiStatement"
    // InternalBiLang.g:287:1: ruleCountQuantiStatement : ( ( rule__CountQuantiStatement__Group__0 ) ) ;
    public final void ruleCountQuantiStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:291:2: ( ( ( rule__CountQuantiStatement__Group__0 ) ) )
            // InternalBiLang.g:292:2: ( ( rule__CountQuantiStatement__Group__0 ) )
            {
            // InternalBiLang.g:292:2: ( ( rule__CountQuantiStatement__Group__0 ) )
            // InternalBiLang.g:293:3: ( rule__CountQuantiStatement__Group__0 )
            {
             before(grammarAccess.getCountQuantiStatementAccess().getGroup()); 
            // InternalBiLang.g:294:3: ( rule__CountQuantiStatement__Group__0 )
            // InternalBiLang.g:294:4: rule__CountQuantiStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountQuantiStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountQuantiStatement"


    // $ANTLR start "entryRuleDashBoard"
    // InternalBiLang.g:303:1: entryRuleDashBoard : ruleDashBoard EOF ;
    public final void entryRuleDashBoard() throws RecognitionException {
        try {
            // InternalBiLang.g:304:1: ( ruleDashBoard EOF )
            // InternalBiLang.g:305:1: ruleDashBoard EOF
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
    // InternalBiLang.g:312:1: ruleDashBoard : ( ( rule__DashBoard__Group__0 ) ) ;
    public final void ruleDashBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:316:2: ( ( ( rule__DashBoard__Group__0 ) ) )
            // InternalBiLang.g:317:2: ( ( rule__DashBoard__Group__0 ) )
            {
            // InternalBiLang.g:317:2: ( ( rule__DashBoard__Group__0 ) )
            // InternalBiLang.g:318:3: ( rule__DashBoard__Group__0 )
            {
             before(grammarAccess.getDashBoardAccess().getGroup()); 
            // InternalBiLang.g:319:3: ( rule__DashBoard__Group__0 )
            // InternalBiLang.g:319:4: rule__DashBoard__Group__0
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
    // InternalBiLang.g:328:1: entryRuleNullReplacement : ruleNullReplacement EOF ;
    public final void entryRuleNullReplacement() throws RecognitionException {
        try {
            // InternalBiLang.g:329:1: ( ruleNullReplacement EOF )
            // InternalBiLang.g:330:1: ruleNullReplacement EOF
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
    // InternalBiLang.g:337:1: ruleNullReplacement : ( ( rule__NullReplacement__Group__0 ) ) ;
    public final void ruleNullReplacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:341:2: ( ( ( rule__NullReplacement__Group__0 ) ) )
            // InternalBiLang.g:342:2: ( ( rule__NullReplacement__Group__0 ) )
            {
            // InternalBiLang.g:342:2: ( ( rule__NullReplacement__Group__0 ) )
            // InternalBiLang.g:343:3: ( rule__NullReplacement__Group__0 )
            {
             before(grammarAccess.getNullReplacementAccess().getGroup()); 
            // InternalBiLang.g:344:3: ( rule__NullReplacement__Group__0 )
            // InternalBiLang.g:344:4: rule__NullReplacement__Group__0
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
    // InternalBiLang.g:353:1: entryRuleQuantitativeFiltering : ruleQuantitativeFiltering EOF ;
    public final void entryRuleQuantitativeFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:354:1: ( ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:355:1: ruleQuantitativeFiltering EOF
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
    // InternalBiLang.g:362:1: ruleQuantitativeFiltering : ( ( rule__QuantitativeFiltering__Group__0 ) ) ;
    public final void ruleQuantitativeFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:366:2: ( ( ( rule__QuantitativeFiltering__Group__0 ) ) )
            // InternalBiLang.g:367:2: ( ( rule__QuantitativeFiltering__Group__0 ) )
            {
            // InternalBiLang.g:367:2: ( ( rule__QuantitativeFiltering__Group__0 ) )
            // InternalBiLang.g:368:3: ( rule__QuantitativeFiltering__Group__0 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getGroup()); 
            // InternalBiLang.g:369:3: ( rule__QuantitativeFiltering__Group__0 )
            // InternalBiLang.g:369:4: rule__QuantitativeFiltering__Group__0
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
    // InternalBiLang.g:378:1: entryRuleQualitativeFiltering : ruleQualitativeFiltering EOF ;
    public final void entryRuleQualitativeFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:379:1: ( ruleQualitativeFiltering EOF )
            // InternalBiLang.g:380:1: ruleQualitativeFiltering EOF
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
    // InternalBiLang.g:387:1: ruleQualitativeFiltering : ( ( rule__QualitativeFiltering__Group__0 ) ) ;
    public final void ruleQualitativeFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:391:2: ( ( ( rule__QualitativeFiltering__Group__0 ) ) )
            // InternalBiLang.g:392:2: ( ( rule__QualitativeFiltering__Group__0 ) )
            {
            // InternalBiLang.g:392:2: ( ( rule__QualitativeFiltering__Group__0 ) )
            // InternalBiLang.g:393:3: ( rule__QualitativeFiltering__Group__0 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getGroup()); 
            // InternalBiLang.g:394:3: ( rule__QualitativeFiltering__Group__0 )
            // InternalBiLang.g:394:4: rule__QualitativeFiltering__Group__0
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
    // InternalBiLang.g:403:1: entryRuleMathOperation : ruleMathOperation EOF ;
    public final void entryRuleMathOperation() throws RecognitionException {
        try {
            // InternalBiLang.g:404:1: ( ruleMathOperation EOF )
            // InternalBiLang.g:405:1: ruleMathOperation EOF
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
    // InternalBiLang.g:412:1: ruleMathOperation : ( ( rule__MathOperation__Group__0 ) ) ;
    public final void ruleMathOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:416:2: ( ( ( rule__MathOperation__Group__0 ) ) )
            // InternalBiLang.g:417:2: ( ( rule__MathOperation__Group__0 ) )
            {
            // InternalBiLang.g:417:2: ( ( rule__MathOperation__Group__0 ) )
            // InternalBiLang.g:418:3: ( rule__MathOperation__Group__0 )
            {
             before(grammarAccess.getMathOperationAccess().getGroup()); 
            // InternalBiLang.g:419:3: ( rule__MathOperation__Group__0 )
            // InternalBiLang.g:419:4: rule__MathOperation__Group__0
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
    // InternalBiLang.g:428:1: entryRuleColReference : ruleColReference EOF ;
    public final void entryRuleColReference() throws RecognitionException {
        try {
            // InternalBiLang.g:429:1: ( ruleColReference EOF )
            // InternalBiLang.g:430:1: ruleColReference EOF
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
    // InternalBiLang.g:437:1: ruleColReference : ( ( rule__ColReference__Group__0 ) ) ;
    public final void ruleColReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:441:2: ( ( ( rule__ColReference__Group__0 ) ) )
            // InternalBiLang.g:442:2: ( ( rule__ColReference__Group__0 ) )
            {
            // InternalBiLang.g:442:2: ( ( rule__ColReference__Group__0 ) )
            // InternalBiLang.g:443:3: ( rule__ColReference__Group__0 )
            {
             before(grammarAccess.getColReferenceAccess().getGroup()); 
            // InternalBiLang.g:444:3: ( rule__ColReference__Group__0 )
            // InternalBiLang.g:444:4: rule__ColReference__Group__0
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
    // InternalBiLang.g:453:1: entryRuleStatisticalOperation : ruleStatisticalOperation EOF ;
    public final void entryRuleStatisticalOperation() throws RecognitionException {
        try {
            // InternalBiLang.g:454:1: ( ruleStatisticalOperation EOF )
            // InternalBiLang.g:455:1: ruleStatisticalOperation EOF
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
    // InternalBiLang.g:462:1: ruleStatisticalOperation : ( ( rule__StatisticalOperation__Group__0 ) ) ;
    public final void ruleStatisticalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:466:2: ( ( ( rule__StatisticalOperation__Group__0 ) ) )
            // InternalBiLang.g:467:2: ( ( rule__StatisticalOperation__Group__0 ) )
            {
            // InternalBiLang.g:467:2: ( ( rule__StatisticalOperation__Group__0 ) )
            // InternalBiLang.g:468:3: ( rule__StatisticalOperation__Group__0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getGroup()); 
            // InternalBiLang.g:469:3: ( rule__StatisticalOperation__Group__0 )
            // InternalBiLang.g:469:4: rule__StatisticalOperation__Group__0
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
    // InternalBiLang.g:478:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalBiLang.g:479:1: ( ruleEFloat EOF )
            // InternalBiLang.g:480:1: ruleEFloat EOF
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
    // InternalBiLang.g:487:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:491:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalBiLang.g:492:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalBiLang.g:492:2: ( ( rule__EFloat__Group__0 ) )
            // InternalBiLang.g:493:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalBiLang.g:494:3: ( rule__EFloat__Group__0 )
            // InternalBiLang.g:494:4: rule__EFloat__Group__0
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
    // InternalBiLang.g:503:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBiLang.g:504:1: ( ruleEInt EOF )
            // InternalBiLang.g:505:1: ruleEInt EOF
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
    // InternalBiLang.g:512:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:516:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBiLang.g:517:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBiLang.g:517:2: ( ( rule__EInt__Group__0 ) )
            // InternalBiLang.g:518:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBiLang.g:519:3: ( rule__EInt__Group__0 )
            // InternalBiLang.g:519:4: rule__EInt__Group__0
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
    // InternalBiLang.g:528:1: entryRuleBarPlot : ruleBarPlot EOF ;
    public final void entryRuleBarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:529:1: ( ruleBarPlot EOF )
            // InternalBiLang.g:530:1: ruleBarPlot EOF
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
    // InternalBiLang.g:537:1: ruleBarPlot : ( ( rule__BarPlot__Group__0 ) ) ;
    public final void ruleBarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:541:2: ( ( ( rule__BarPlot__Group__0 ) ) )
            // InternalBiLang.g:542:2: ( ( rule__BarPlot__Group__0 ) )
            {
            // InternalBiLang.g:542:2: ( ( rule__BarPlot__Group__0 ) )
            // InternalBiLang.g:543:3: ( rule__BarPlot__Group__0 )
            {
             before(grammarAccess.getBarPlotAccess().getGroup()); 
            // InternalBiLang.g:544:3: ( rule__BarPlot__Group__0 )
            // InternalBiLang.g:544:4: rule__BarPlot__Group__0
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
    // InternalBiLang.g:553:1: entryRuleLinePlot : ruleLinePlot EOF ;
    public final void entryRuleLinePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:554:1: ( ruleLinePlot EOF )
            // InternalBiLang.g:555:1: ruleLinePlot EOF
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
    // InternalBiLang.g:562:1: ruleLinePlot : ( ( rule__LinePlot__Group__0 ) ) ;
    public final void ruleLinePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:566:2: ( ( ( rule__LinePlot__Group__0 ) ) )
            // InternalBiLang.g:567:2: ( ( rule__LinePlot__Group__0 ) )
            {
            // InternalBiLang.g:567:2: ( ( rule__LinePlot__Group__0 ) )
            // InternalBiLang.g:568:3: ( rule__LinePlot__Group__0 )
            {
             before(grammarAccess.getLinePlotAccess().getGroup()); 
            // InternalBiLang.g:569:3: ( rule__LinePlot__Group__0 )
            // InternalBiLang.g:569:4: rule__LinePlot__Group__0
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
    // InternalBiLang.g:578:1: entryRuleDonutPlot : ruleDonutPlot EOF ;
    public final void entryRuleDonutPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:579:1: ( ruleDonutPlot EOF )
            // InternalBiLang.g:580:1: ruleDonutPlot EOF
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
    // InternalBiLang.g:587:1: ruleDonutPlot : ( ( rule__DonutPlot__Group__0 ) ) ;
    public final void ruleDonutPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:591:2: ( ( ( rule__DonutPlot__Group__0 ) ) )
            // InternalBiLang.g:592:2: ( ( rule__DonutPlot__Group__0 ) )
            {
            // InternalBiLang.g:592:2: ( ( rule__DonutPlot__Group__0 ) )
            // InternalBiLang.g:593:3: ( rule__DonutPlot__Group__0 )
            {
             before(grammarAccess.getDonutPlotAccess().getGroup()); 
            // InternalBiLang.g:594:3: ( rule__DonutPlot__Group__0 )
            // InternalBiLang.g:594:4: rule__DonutPlot__Group__0
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
    // InternalBiLang.g:603:1: entryRulePiePlot : rulePiePlot EOF ;
    public final void entryRulePiePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:604:1: ( rulePiePlot EOF )
            // InternalBiLang.g:605:1: rulePiePlot EOF
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
    // InternalBiLang.g:612:1: rulePiePlot : ( ( rule__PiePlot__Group__0 ) ) ;
    public final void rulePiePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:616:2: ( ( ( rule__PiePlot__Group__0 ) ) )
            // InternalBiLang.g:617:2: ( ( rule__PiePlot__Group__0 ) )
            {
            // InternalBiLang.g:617:2: ( ( rule__PiePlot__Group__0 ) )
            // InternalBiLang.g:618:3: ( rule__PiePlot__Group__0 )
            {
             before(grammarAccess.getPiePlotAccess().getGroup()); 
            // InternalBiLang.g:619:3: ( rule__PiePlot__Group__0 )
            // InternalBiLang.g:619:4: rule__PiePlot__Group__0
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
    // InternalBiLang.g:628:1: entryRulePolarPlot : rulePolarPlot EOF ;
    public final void entryRulePolarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:629:1: ( rulePolarPlot EOF )
            // InternalBiLang.g:630:1: rulePolarPlot EOF
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
    // InternalBiLang.g:637:1: rulePolarPlot : ( ( rule__PolarPlot__Group__0 ) ) ;
    public final void rulePolarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:641:2: ( ( ( rule__PolarPlot__Group__0 ) ) )
            // InternalBiLang.g:642:2: ( ( rule__PolarPlot__Group__0 ) )
            {
            // InternalBiLang.g:642:2: ( ( rule__PolarPlot__Group__0 ) )
            // InternalBiLang.g:643:3: ( rule__PolarPlot__Group__0 )
            {
             before(grammarAccess.getPolarPlotAccess().getGroup()); 
            // InternalBiLang.g:644:3: ( rule__PolarPlot__Group__0 )
            // InternalBiLang.g:644:4: rule__PolarPlot__Group__0
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
    // InternalBiLang.g:653:1: entryRuleScatterPlot : ruleScatterPlot EOF ;
    public final void entryRuleScatterPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:654:1: ( ruleScatterPlot EOF )
            // InternalBiLang.g:655:1: ruleScatterPlot EOF
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
    // InternalBiLang.g:662:1: ruleScatterPlot : ( ( rule__ScatterPlot__Group__0 ) ) ;
    public final void ruleScatterPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:666:2: ( ( ( rule__ScatterPlot__Group__0 ) ) )
            // InternalBiLang.g:667:2: ( ( rule__ScatterPlot__Group__0 ) )
            {
            // InternalBiLang.g:667:2: ( ( rule__ScatterPlot__Group__0 ) )
            // InternalBiLang.g:668:3: ( rule__ScatterPlot__Group__0 )
            {
             before(grammarAccess.getScatterPlotAccess().getGroup()); 
            // InternalBiLang.g:669:3: ( rule__ScatterPlot__Group__0 )
            // InternalBiLang.g:669:4: rule__ScatterPlot__Group__0
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
    // InternalBiLang.g:678:1: entryRuleRadarPlot : ruleRadarPlot EOF ;
    public final void entryRuleRadarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:679:1: ( ruleRadarPlot EOF )
            // InternalBiLang.g:680:1: ruleRadarPlot EOF
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
    // InternalBiLang.g:687:1: ruleRadarPlot : ( ( rule__RadarPlot__Group__0 ) ) ;
    public final void ruleRadarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:691:2: ( ( ( rule__RadarPlot__Group__0 ) ) )
            // InternalBiLang.g:692:2: ( ( rule__RadarPlot__Group__0 ) )
            {
            // InternalBiLang.g:692:2: ( ( rule__RadarPlot__Group__0 ) )
            // InternalBiLang.g:693:3: ( rule__RadarPlot__Group__0 )
            {
             before(grammarAccess.getRadarPlotAccess().getGroup()); 
            // InternalBiLang.g:694:3: ( rule__RadarPlot__Group__0 )
            // InternalBiLang.g:694:4: rule__RadarPlot__Group__0
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
    // InternalBiLang.g:703:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:707:1: ( ( ( rule__MathOperator__Alternatives ) ) )
            // InternalBiLang.g:708:2: ( ( rule__MathOperator__Alternatives ) )
            {
            // InternalBiLang.g:708:2: ( ( rule__MathOperator__Alternatives ) )
            // InternalBiLang.g:709:3: ( rule__MathOperator__Alternatives )
            {
             before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:710:3: ( rule__MathOperator__Alternatives )
            // InternalBiLang.g:710:4: rule__MathOperator__Alternatives
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
    // InternalBiLang.g:719:1: ruleStatisticalOperator : ( ( rule__StatisticalOperator__Alternatives ) ) ;
    public final void ruleStatisticalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:723:1: ( ( ( rule__StatisticalOperator__Alternatives ) ) )
            // InternalBiLang.g:724:2: ( ( rule__StatisticalOperator__Alternatives ) )
            {
            // InternalBiLang.g:724:2: ( ( rule__StatisticalOperator__Alternatives ) )
            // InternalBiLang.g:725:3: ( rule__StatisticalOperator__Alternatives )
            {
             before(grammarAccess.getStatisticalOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:726:3: ( rule__StatisticalOperator__Alternatives )
            // InternalBiLang.g:726:4: rule__StatisticalOperator__Alternatives
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
    // InternalBiLang.g:735:1: ruleQualitativeOperator : ( ( rule__QualitativeOperator__Alternatives ) ) ;
    public final void ruleQualitativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:739:1: ( ( ( rule__QualitativeOperator__Alternatives ) ) )
            // InternalBiLang.g:740:2: ( ( rule__QualitativeOperator__Alternatives ) )
            {
            // InternalBiLang.g:740:2: ( ( rule__QualitativeOperator__Alternatives ) )
            // InternalBiLang.g:741:3: ( rule__QualitativeOperator__Alternatives )
            {
             before(grammarAccess.getQualitativeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:742:3: ( rule__QualitativeOperator__Alternatives )
            // InternalBiLang.g:742:4: rule__QualitativeOperator__Alternatives
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


    // $ANTLR start "ruleRangeOperator"
    // InternalBiLang.g:751:1: ruleRangeOperator : ( ( rule__RangeOperator__Alternatives ) ) ;
    public final void ruleRangeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:755:1: ( ( ( rule__RangeOperator__Alternatives ) ) )
            // InternalBiLang.g:756:2: ( ( rule__RangeOperator__Alternatives ) )
            {
            // InternalBiLang.g:756:2: ( ( rule__RangeOperator__Alternatives ) )
            // InternalBiLang.g:757:3: ( rule__RangeOperator__Alternatives )
            {
             before(grammarAccess.getRangeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:758:3: ( rule__RangeOperator__Alternatives )
            // InternalBiLang.g:758:4: rule__RangeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RangeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRangeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRangeOperator"


    // $ANTLR start "ruleQuantitativeOperator"
    // InternalBiLang.g:767:1: ruleQuantitativeOperator : ( ( rule__QuantitativeOperator__Alternatives ) ) ;
    public final void ruleQuantitativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:771:1: ( ( ( rule__QuantitativeOperator__Alternatives ) ) )
            // InternalBiLang.g:772:2: ( ( rule__QuantitativeOperator__Alternatives ) )
            {
            // InternalBiLang.g:772:2: ( ( rule__QuantitativeOperator__Alternatives ) )
            // InternalBiLang.g:773:3: ( rule__QuantitativeOperator__Alternatives )
            {
             before(grammarAccess.getQuantitativeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:774:3: ( rule__QuantitativeOperator__Alternatives )
            // InternalBiLang.g:774:4: rule__QuantitativeOperator__Alternatives
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
    // InternalBiLang.g:782:1: rule__FilteringStep__Alternatives : ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) );
    public final void rule__FilteringStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:786:1: ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=26 && LA1_1<=30)) ) {
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
                else if ( ((LA1_2>=26 && LA1_2<=30)) ) {
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
                    // InternalBiLang.g:787:2: ( ruleQuantitativeFiltering )
                    {
                    // InternalBiLang.g:787:2: ( ruleQuantitativeFiltering )
                    // InternalBiLang.g:788:3: ruleQuantitativeFiltering
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
                    // InternalBiLang.g:793:2: ( ruleQualitativeFiltering )
                    {
                    // InternalBiLang.g:793:2: ( ruleQualitativeFiltering )
                    // InternalBiLang.g:794:3: ruleQualitativeFiltering
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
    // InternalBiLang.g:803:1: rule__PreprocessingStep__Alternatives : ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) );
    public final void rule__PreprocessingStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:807:1: ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_STRING && LA2_1<=RULE_ID)||(LA2_1>=13 && LA2_1<=16)||LA2_1==34||(LA2_1>=37 && LA2_1<=38)||LA2_1==41||LA2_1==49) ) {
                    alt2=2;
                }
                else if ( (LA2_1==26) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||(LA2_2>=RULE_STRING && LA2_2<=RULE_ID)||(LA2_2>=13 && LA2_2<=16)||LA2_2==34||(LA2_2>=37 && LA2_2<=38)||LA2_2==41||LA2_2==49) ) {
                    alt2=2;
                }
                else if ( (LA2_2==26) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 46:
            case 47:
                {
                alt2=1;
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
                    // InternalBiLang.g:808:2: ( ruleMathOperation )
                    {
                    // InternalBiLang.g:808:2: ( ruleMathOperation )
                    // InternalBiLang.g:809:3: ruleMathOperation
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
                    // InternalBiLang.g:814:2: ( ruleColReference )
                    {
                    // InternalBiLang.g:814:2: ( ruleColReference )
                    // InternalBiLang.g:815:3: ruleColReference
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
                    // InternalBiLang.g:820:2: ( ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:820:2: ( ruleStatisticalOperation )
                    // InternalBiLang.g:821:3: ruleStatisticalOperation
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
    // InternalBiLang.g:830:1: rule__Plot__Alternatives : ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) );
    public final void rule__Plot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:834:1: ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt3=1;
                }
                break;
            case 57:
                {
                alt3=2;
                }
                break;
            case 58:
                {
                alt3=3;
                }
                break;
            case 62:
                {
                alt3=4;
                }
                break;
            case 61:
                {
                alt3=5;
                }
                break;
            case 63:
                {
                alt3=6;
                }
                break;
            case 60:
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
                    // InternalBiLang.g:835:2: ( ruleBarPlot )
                    {
                    // InternalBiLang.g:835:2: ( ruleBarPlot )
                    // InternalBiLang.g:836:3: ruleBarPlot
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
                    // InternalBiLang.g:841:2: ( ruleLinePlot )
                    {
                    // InternalBiLang.g:841:2: ( ruleLinePlot )
                    // InternalBiLang.g:842:3: ruleLinePlot
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
                    // InternalBiLang.g:847:2: ( ruleDonutPlot )
                    {
                    // InternalBiLang.g:847:2: ( ruleDonutPlot )
                    // InternalBiLang.g:848:3: ruleDonutPlot
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
                    // InternalBiLang.g:853:2: ( ruleScatterPlot )
                    {
                    // InternalBiLang.g:853:2: ( ruleScatterPlot )
                    // InternalBiLang.g:854:3: ruleScatterPlot
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
                    // InternalBiLang.g:859:2: ( rulePolarPlot )
                    {
                    // InternalBiLang.g:859:2: ( rulePolarPlot )
                    // InternalBiLang.g:860:3: rulePolarPlot
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
                    // InternalBiLang.g:865:2: ( ruleRadarPlot )
                    {
                    // InternalBiLang.g:865:2: ( ruleRadarPlot )
                    // InternalBiLang.g:866:3: ruleRadarPlot
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
                    // InternalBiLang.g:871:2: ( rulePiePlot )
                    {
                    // InternalBiLang.g:871:2: ( rulePiePlot )
                    // InternalBiLang.g:872:3: rulePiePlot
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
    // InternalBiLang.g:881:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:885:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBiLang.g:886:2: ( RULE_STRING )
                    {
                    // InternalBiLang.g:886:2: ( RULE_STRING )
                    // InternalBiLang.g:887:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:892:2: ( RULE_ID )
                    {
                    // InternalBiLang.g:892:2: ( RULE_ID )
                    // InternalBiLang.g:893:3: RULE_ID
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


    // $ANTLR start "rule__CountPreprocessingStep__Alternatives_2"
    // InternalBiLang.g:902:1: rule__CountPreprocessingStep__Alternatives_2 : ( ( ( rule__CountPreprocessingStep__CountqualistatementAssignment_2_0 )* ) | ( ( rule__CountPreprocessingStep__CountquantistatementAssignment_2_1 )* ) );
    public final void rule__CountPreprocessingStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:906:1: ( ( ( rule__CountPreprocessingStep__CountqualistatementAssignment_2_0 )* ) | ( ( rule__CountPreprocessingStep__CountquantistatementAssignment_2_1 )* ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
                {
                alt7=1;
                }
                break;
            case 43:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
            case 14:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 50:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBiLang.g:907:2: ( ( rule__CountPreprocessingStep__CountqualistatementAssignment_2_0 )* )
                    {
                    // InternalBiLang.g:907:2: ( ( rule__CountPreprocessingStep__CountqualistatementAssignment_2_0 )* )
                    // InternalBiLang.g:908:3: ( rule__CountPreprocessingStep__CountqualistatementAssignment_2_0 )*
                    {
                     before(grammarAccess.getCountPreprocessingStepAccess().getCountqualistatementAssignment_2_0()); 
                    // InternalBiLang.g:909:3: ( rule__CountPreprocessingStep__CountqualistatementAssignment_2_0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=20 && LA5_0<=21)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBiLang.g:909:4: rule__CountPreprocessingStep__CountqualistatementAssignment_2_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__CountPreprocessingStep__CountqualistatementAssignment_2_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getCountPreprocessingStepAccess().getCountqualistatementAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:913:2: ( ( rule__CountPreprocessingStep__CountquantistatementAssignment_2_1 )* )
                    {
                    // InternalBiLang.g:913:2: ( ( rule__CountPreprocessingStep__CountquantistatementAssignment_2_1 )* )
                    // InternalBiLang.g:914:3: ( rule__CountPreprocessingStep__CountquantistatementAssignment_2_1 )*
                    {
                     before(grammarAccess.getCountPreprocessingStepAccess().getCountquantistatementAssignment_2_1()); 
                    // InternalBiLang.g:915:3: ( rule__CountPreprocessingStep__CountquantistatementAssignment_2_1 )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_INT||LA6_0==14||(LA6_0>=26 && LA6_0<=30)||LA6_0==50) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBiLang.g:915:4: rule__CountPreprocessingStep__CountquantistatementAssignment_2_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__CountPreprocessingStep__CountquantistatementAssignment_2_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getCountPreprocessingStepAccess().getCountquantistatementAssignment_2_1()); 

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
    // $ANTLR end "rule__CountPreprocessingStep__Alternatives_2"


    // $ANTLR start "rule__CountQuantiStatement__Alternatives_0"
    // InternalBiLang.g:923:1: rule__CountQuantiStatement__Alternatives_0 : ( ( ( rule__CountQuantiStatement__Group_0_0__0 ) ) | ( ( rule__CountQuantiStatement__Group_0_1__0 ) ) );
    public final void rule__CountQuantiStatement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:927:1: ( ( ( rule__CountQuantiStatement__Group_0_0__0 ) ) | ( ( rule__CountQuantiStatement__Group_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=26 && LA8_0<=30)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||LA8_0==14||LA8_0==50) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBiLang.g:928:2: ( ( rule__CountQuantiStatement__Group_0_0__0 ) )
                    {
                    // InternalBiLang.g:928:2: ( ( rule__CountQuantiStatement__Group_0_0__0 ) )
                    // InternalBiLang.g:929:3: ( rule__CountQuantiStatement__Group_0_0__0 )
                    {
                     before(grammarAccess.getCountQuantiStatementAccess().getGroup_0_0()); 
                    // InternalBiLang.g:930:3: ( rule__CountQuantiStatement__Group_0_0__0 )
                    // InternalBiLang.g:930:4: rule__CountQuantiStatement__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CountQuantiStatement__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCountQuantiStatementAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:934:2: ( ( rule__CountQuantiStatement__Group_0_1__0 ) )
                    {
                    // InternalBiLang.g:934:2: ( ( rule__CountQuantiStatement__Group_0_1__0 ) )
                    // InternalBiLang.g:935:3: ( rule__CountQuantiStatement__Group_0_1__0 )
                    {
                     before(grammarAccess.getCountQuantiStatementAccess().getGroup_0_1()); 
                    // InternalBiLang.g:936:3: ( rule__CountQuantiStatement__Group_0_1__0 )
                    // InternalBiLang.g:936:4: rule__CountQuantiStatement__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CountQuantiStatement__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCountQuantiStatementAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__CountQuantiStatement__Alternatives_0"


    // $ANTLR start "rule__NullReplacement__Alternatives_2"
    // InternalBiLang.g:944:1: rule__NullReplacement__Alternatives_2 : ( ( ( rule__NullReplacement__LabelAssignment_2_0 ) ) | ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) ) );
    public final void rule__NullReplacement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:948:1: ( ( ( rule__NullReplacement__LabelAssignment_2_0 ) ) | ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=17 && LA9_0<=19)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBiLang.g:949:2: ( ( rule__NullReplacement__LabelAssignment_2_0 ) )
                    {
                    // InternalBiLang.g:949:2: ( ( rule__NullReplacement__LabelAssignment_2_0 ) )
                    // InternalBiLang.g:950:3: ( rule__NullReplacement__LabelAssignment_2_0 )
                    {
                     before(grammarAccess.getNullReplacementAccess().getLabelAssignment_2_0()); 
                    // InternalBiLang.g:951:3: ( rule__NullReplacement__LabelAssignment_2_0 )
                    // InternalBiLang.g:951:4: rule__NullReplacement__LabelAssignment_2_0
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
                    // InternalBiLang.g:955:2: ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) )
                    {
                    // InternalBiLang.g:955:2: ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) )
                    // InternalBiLang.g:956:3: ( rule__NullReplacement__StatisticaloperationAssignment_2_1 )
                    {
                     before(grammarAccess.getNullReplacementAccess().getStatisticaloperationAssignment_2_1()); 
                    // InternalBiLang.g:957:3: ( rule__NullReplacement__StatisticaloperationAssignment_2_1 )
                    // InternalBiLang.g:957:4: rule__NullReplacement__StatisticaloperationAssignment_2_1
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
    // InternalBiLang.g:965:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:969:1: ( ( 'E' ) | ( 'e' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBiLang.g:970:2: ( 'E' )
                    {
                    // InternalBiLang.g:970:2: ( 'E' )
                    // InternalBiLang.g:971:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:976:2: ( 'e' )
                    {
                    // InternalBiLang.g:976:2: ( 'e' )
                    // InternalBiLang.g:977:3: 'e'
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


    // $ANTLR start "rule__DonutPlot__Alternatives_3"
    // InternalBiLang.g:986:1: rule__DonutPlot__Alternatives_3 : ( ( ( rule__DonutPlot__Group_3_0__0 ) ) | ( ( rule__DonutPlot__Group_3_1__0 ) ) );
    public final void rule__DonutPlot__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:990:1: ( ( ( rule__DonutPlot__Group_3_0__0 ) ) | ( ( rule__DonutPlot__Group_3_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==59) ) {
                alt11=1;
            }
            else if ( (LA11_0==52) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBiLang.g:991:2: ( ( rule__DonutPlot__Group_3_0__0 ) )
                    {
                    // InternalBiLang.g:991:2: ( ( rule__DonutPlot__Group_3_0__0 ) )
                    // InternalBiLang.g:992:3: ( rule__DonutPlot__Group_3_0__0 )
                    {
                     before(grammarAccess.getDonutPlotAccess().getGroup_3_0()); 
                    // InternalBiLang.g:993:3: ( rule__DonutPlot__Group_3_0__0 )
                    // InternalBiLang.g:993:4: rule__DonutPlot__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DonutPlot__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDonutPlotAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:997:2: ( ( rule__DonutPlot__Group_3_1__0 ) )
                    {
                    // InternalBiLang.g:997:2: ( ( rule__DonutPlot__Group_3_1__0 ) )
                    // InternalBiLang.g:998:3: ( rule__DonutPlot__Group_3_1__0 )
                    {
                     before(grammarAccess.getDonutPlotAccess().getGroup_3_1()); 
                    // InternalBiLang.g:999:3: ( rule__DonutPlot__Group_3_1__0 )
                    // InternalBiLang.g:999:4: rule__DonutPlot__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DonutPlot__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDonutPlotAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__DonutPlot__Alternatives_3"


    // $ANTLR start "rule__PiePlot__Alternatives_3"
    // InternalBiLang.g:1007:1: rule__PiePlot__Alternatives_3 : ( ( ( rule__PiePlot__Group_3_0__0 ) ) | ( ( rule__PiePlot__Group_3_1__0 ) ) );
    public final void rule__PiePlot__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1011:1: ( ( ( rule__PiePlot__Group_3_0__0 ) ) | ( ( rule__PiePlot__Group_3_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==59) ) {
                alt12=1;
            }
            else if ( (LA12_0==52) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBiLang.g:1012:2: ( ( rule__PiePlot__Group_3_0__0 ) )
                    {
                    // InternalBiLang.g:1012:2: ( ( rule__PiePlot__Group_3_0__0 ) )
                    // InternalBiLang.g:1013:3: ( rule__PiePlot__Group_3_0__0 )
                    {
                     before(grammarAccess.getPiePlotAccess().getGroup_3_0()); 
                    // InternalBiLang.g:1014:3: ( rule__PiePlot__Group_3_0__0 )
                    // InternalBiLang.g:1014:4: rule__PiePlot__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PiePlot__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPiePlotAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1018:2: ( ( rule__PiePlot__Group_3_1__0 ) )
                    {
                    // InternalBiLang.g:1018:2: ( ( rule__PiePlot__Group_3_1__0 ) )
                    // InternalBiLang.g:1019:3: ( rule__PiePlot__Group_3_1__0 )
                    {
                     before(grammarAccess.getPiePlotAccess().getGroup_3_1()); 
                    // InternalBiLang.g:1020:3: ( rule__PiePlot__Group_3_1__0 )
                    // InternalBiLang.g:1020:4: rule__PiePlot__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PiePlot__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPiePlotAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__PiePlot__Alternatives_3"


    // $ANTLR start "rule__MathOperator__Alternatives"
    // InternalBiLang.g:1028:1: rule__MathOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1032:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt13=1;
                }
                break;
            case 14:
                {
                alt13=2;
                }
                break;
            case 15:
                {
                alt13=3;
                }
                break;
            case 16:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalBiLang.g:1033:2: ( ( '+' ) )
                    {
                    // InternalBiLang.g:1033:2: ( ( '+' ) )
                    // InternalBiLang.g:1034:3: ( '+' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:1035:3: ( '+' )
                    // InternalBiLang.g:1035:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1039:2: ( ( '-' ) )
                    {
                    // InternalBiLang.g:1039:2: ( ( '-' ) )
                    // InternalBiLang.g:1040:3: ( '-' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:1041:3: ( '-' )
                    // InternalBiLang.g:1041:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:1045:2: ( ( '*' ) )
                    {
                    // InternalBiLang.g:1045:2: ( ( '*' ) )
                    // InternalBiLang.g:1046:3: ( '*' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:1047:3: ( '*' )
                    // InternalBiLang.g:1047:4: '*'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:1051:2: ( ( '/' ) )
                    {
                    // InternalBiLang.g:1051:2: ( ( '/' ) )
                    // InternalBiLang.g:1052:3: ( '/' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3()); 
                    // InternalBiLang.g:1053:3: ( '/' )
                    // InternalBiLang.g:1053:4: '/'
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
    // InternalBiLang.g:1061:1: rule__StatisticalOperator__Alternatives : ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) );
    public final void rule__StatisticalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1065:1: ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalBiLang.g:1066:2: ( ( 'mean' ) )
                    {
                    // InternalBiLang.g:1066:2: ( ( 'mean' ) )
                    // InternalBiLang.g:1067:3: ( 'mean' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:1068:3: ( 'mean' )
                    // InternalBiLang.g:1068:4: 'mean'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1072:2: ( ( 'median' ) )
                    {
                    // InternalBiLang.g:1072:2: ( ( 'median' ) )
                    // InternalBiLang.g:1073:3: ( 'median' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:1074:3: ( 'median' )
                    // InternalBiLang.g:1074:4: 'median'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:1078:2: ( ( 'std' ) )
                    {
                    // InternalBiLang.g:1078:2: ( ( 'std' ) )
                    // InternalBiLang.g:1079:3: ( 'std' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:1080:3: ( 'std' )
                    // InternalBiLang.g:1080:4: 'std'
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
    // InternalBiLang.g:1088:1: rule__QualitativeOperator__Alternatives : ( ( ( '= ' ) ) | ( ( '!= ' ) ) );
    public final void rule__QualitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1092:1: ( ( ( '= ' ) ) | ( ( '!= ' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:1093:2: ( ( '= ' ) )
                    {
                    // InternalBiLang.g:1093:2: ( ( '= ' ) )
                    // InternalBiLang.g:1094:3: ( '= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:1095:3: ( '= ' )
                    // InternalBiLang.g:1095:4: '= '
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1099:2: ( ( '!= ' ) )
                    {
                    // InternalBiLang.g:1099:2: ( ( '!= ' ) )
                    // InternalBiLang.g:1100:3: ( '!= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:1101:3: ( '!= ' )
                    // InternalBiLang.g:1101:4: '!= '
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


    // $ANTLR start "rule__RangeOperator__Alternatives"
    // InternalBiLang.g:1109:1: rule__RangeOperator__Alternatives : ( ( ( '[]' ) ) | ( ( '][' ) ) | ( ( '[[' ) ) | ( ( ']]' ) ) );
    public final void rule__RangeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1113:1: ( ( ( '[]' ) ) | ( ( '][' ) ) | ( ( '[[' ) ) | ( ( ']]' ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalBiLang.g:1114:2: ( ( '[]' ) )
                    {
                    // InternalBiLang.g:1114:2: ( ( '[]' ) )
                    // InternalBiLang.g:1115:3: ( '[]' )
                    {
                     before(grammarAccess.getRangeOperatorAccess().getLR_INCLUSIONEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:1116:3: ( '[]' )
                    // InternalBiLang.g:1116:4: '[]'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRangeOperatorAccess().getLR_INCLUSIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1120:2: ( ( '][' ) )
                    {
                    // InternalBiLang.g:1120:2: ( ( '][' ) )
                    // InternalBiLang.g:1121:3: ( '][' )
                    {
                     before(grammarAccess.getRangeOperatorAccess().getLR_EXCLUSIONEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:1122:3: ( '][' )
                    // InternalBiLang.g:1122:4: ']['
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRangeOperatorAccess().getLR_EXCLUSIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:1126:2: ( ( '[[' ) )
                    {
                    // InternalBiLang.g:1126:2: ( ( '[[' ) )
                    // InternalBiLang.g:1127:3: ( '[[' )
                    {
                     before(grammarAccess.getRangeOperatorAccess().getL_INCLUSIONEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:1128:3: ( '[[' )
                    // InternalBiLang.g:1128:4: '[['
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRangeOperatorAccess().getL_INCLUSIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:1132:2: ( ( ']]' ) )
                    {
                    // InternalBiLang.g:1132:2: ( ( ']]' ) )
                    // InternalBiLang.g:1133:3: ( ']]' )
                    {
                     before(grammarAccess.getRangeOperatorAccess().getR_INCLUSIONEnumLiteralDeclaration_3()); 
                    // InternalBiLang.g:1134:3: ( ']]' )
                    // InternalBiLang.g:1134:4: ']]'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRangeOperatorAccess().getR_INCLUSIONEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__RangeOperator__Alternatives"


    // $ANTLR start "rule__QuantitativeOperator__Alternatives"
    // InternalBiLang.g:1142:1: rule__QuantitativeOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__QuantitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1146:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt17=1;
                }
                break;
            case 27:
                {
                alt17=2;
                }
                break;
            case 28:
                {
                alt17=3;
                }
                break;
            case 29:
                {
                alt17=4;
                }
                break;
            case 30:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalBiLang.g:1147:2: ( ( '=' ) )
                    {
                    // InternalBiLang.g:1147:2: ( ( '=' ) )
                    // InternalBiLang.g:1148:3: ( '=' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:1149:3: ( '=' )
                    // InternalBiLang.g:1149:4: '='
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1153:2: ( ( '<' ) )
                    {
                    // InternalBiLang.g:1153:2: ( ( '<' ) )
                    // InternalBiLang.g:1154:3: ( '<' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:1155:3: ( '<' )
                    // InternalBiLang.g:1155:4: '<'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:1159:2: ( ( '>' ) )
                    {
                    // InternalBiLang.g:1159:2: ( ( '>' ) )
                    // InternalBiLang.g:1160:3: ( '>' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:1161:3: ( '>' )
                    // InternalBiLang.g:1161:4: '>'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:1165:2: ( ( '<=' ) )
                    {
                    // InternalBiLang.g:1165:2: ( ( '<=' ) )
                    // InternalBiLang.g:1166:3: ( '<=' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getINF_EQUALEnumLiteralDeclaration_3()); 
                    // InternalBiLang.g:1167:3: ( '<=' )
                    // InternalBiLang.g:1167:4: '<='
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getINF_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBiLang.g:1171:2: ( ( '>=' ) )
                    {
                    // InternalBiLang.g:1171:2: ( ( '>=' ) )
                    // InternalBiLang.g:1172:3: ( '>=' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getSUP_EQUALEnumLiteralDeclaration_4()); 
                    // InternalBiLang.g:1173:3: ( '>=' )
                    // InternalBiLang.g:1173:4: '>='
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getSUP_EQUALEnumLiteralDeclaration_4()); 

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
    // InternalBiLang.g:1181:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1185:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBiLang.g:1186:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBiLang.g:1193:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1197:1: ( ( 'Task' ) )
            // InternalBiLang.g:1198:1: ( 'Task' )
            {
            // InternalBiLang.g:1198:1: ( 'Task' )
            // InternalBiLang.g:1199:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBiLang.g:1208:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1212:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBiLang.g:1213:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:1220:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1224:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBiLang.g:1225:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1225:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBiLang.g:1226:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1227:2: ( rule__Task__NameAssignment_1 )
            // InternalBiLang.g:1227:3: rule__Task__NameAssignment_1
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
    // InternalBiLang.g:1235:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1239:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalBiLang.g:1240:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalBiLang.g:1247:1: rule__Task__Group__2__Impl : ( ':' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1251:1: ( ( ':' ) )
            // InternalBiLang.g:1252:1: ( ':' )
            {
            // InternalBiLang.g:1252:1: ( ':' )
            // InternalBiLang.g:1253:2: ':'
            {
             before(grammarAccess.getTaskAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBiLang.g:1262:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1266:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalBiLang.g:1267:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:1274:1: rule__Task__Group__3__Impl : ( 'load' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1278:1: ( ( 'load' ) )
            // InternalBiLang.g:1279:1: ( 'load' )
            {
            // InternalBiLang.g:1279:1: ( 'load' )
            // InternalBiLang.g:1280:2: 'load'
            {
             before(grammarAccess.getTaskAccess().getLoadKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBiLang.g:1289:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1293:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalBiLang.g:1294:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalBiLang.g:1301:1: rule__Task__Group__4__Impl : ( ( rule__Task__FileextractorAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1305:1: ( ( ( rule__Task__FileextractorAssignment_4 ) ) )
            // InternalBiLang.g:1306:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            {
            // InternalBiLang.g:1306:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            // InternalBiLang.g:1307:2: ( rule__Task__FileextractorAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_4()); 
            // InternalBiLang.g:1308:2: ( rule__Task__FileextractorAssignment_4 )
            // InternalBiLang.g:1308:3: rule__Task__FileextractorAssignment_4
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
    // InternalBiLang.g:1316:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1320:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalBiLang.g:1321:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalBiLang.g:1328:1: rule__Task__Group__5__Impl : ( ( rule__Task__Group_5__0 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1332:1: ( ( ( rule__Task__Group_5__0 )? ) )
            // InternalBiLang.g:1333:1: ( ( rule__Task__Group_5__0 )? )
            {
            // InternalBiLang.g:1333:1: ( ( rule__Task__Group_5__0 )? )
            // InternalBiLang.g:1334:2: ( rule__Task__Group_5__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_5()); 
            // InternalBiLang.g:1335:2: ( rule__Task__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBiLang.g:1335:3: rule__Task__Group_5__0
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
    // InternalBiLang.g:1343:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1347:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalBiLang.g:1348:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalBiLang.g:1355:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )* ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1359:1: ( ( ( rule__Task__Group_6__0 )* ) )
            // InternalBiLang.g:1360:1: ( ( rule__Task__Group_6__0 )* )
            {
            // InternalBiLang.g:1360:1: ( ( rule__Task__Group_6__0 )* )
            // InternalBiLang.g:1361:2: ( rule__Task__Group_6__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalBiLang.g:1362:2: ( rule__Task__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBiLang.g:1362:3: rule__Task__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Task__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalBiLang.g:1370:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1374:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalBiLang.g:1375:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:1382:1: rule__Task__Group__7__Impl : ( 'dashboard:' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1386:1: ( ( 'dashboard:' ) )
            // InternalBiLang.g:1387:1: ( 'dashboard:' )
            {
            // InternalBiLang.g:1387:1: ( 'dashboard:' )
            // InternalBiLang.g:1388:2: 'dashboard:'
            {
             before(grammarAccess.getTaskAccess().getDashboardKeyword_7()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBiLang.g:1397:1: rule__Task__Group__8 : rule__Task__Group__8__Impl ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1401:1: ( rule__Task__Group__8__Impl )
            // InternalBiLang.g:1402:2: rule__Task__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__8__Impl();

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
    // InternalBiLang.g:1408:1: rule__Task__Group__8__Impl : ( ( rule__Task__DashboardAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1412:1: ( ( ( rule__Task__DashboardAssignment_8 ) ) )
            // InternalBiLang.g:1413:1: ( ( rule__Task__DashboardAssignment_8 ) )
            {
            // InternalBiLang.g:1413:1: ( ( rule__Task__DashboardAssignment_8 ) )
            // InternalBiLang.g:1414:2: ( rule__Task__DashboardAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getDashboardAssignment_8()); 
            // InternalBiLang.g:1415:2: ( rule__Task__DashboardAssignment_8 )
            // InternalBiLang.g:1415:3: rule__Task__DashboardAssignment_8
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


    // $ANTLR start "rule__Task__Group_5__0"
    // InternalBiLang.g:1424:1: rule__Task__Group_5__0 : rule__Task__Group_5__0__Impl rule__Task__Group_5__1 ;
    public final void rule__Task__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1428:1: ( rule__Task__Group_5__0__Impl rule__Task__Group_5__1 )
            // InternalBiLang.g:1429:2: rule__Task__Group_5__0__Impl rule__Task__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:1436:1: rule__Task__Group_5__0__Impl : ( ( rule__Task__DatafilteringAssignment_5_0 ) ) ;
    public final void rule__Task__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1440:1: ( ( ( rule__Task__DatafilteringAssignment_5_0 ) ) )
            // InternalBiLang.g:1441:1: ( ( rule__Task__DatafilteringAssignment_5_0 ) )
            {
            // InternalBiLang.g:1441:1: ( ( rule__Task__DatafilteringAssignment_5_0 ) )
            // InternalBiLang.g:1442:2: ( rule__Task__DatafilteringAssignment_5_0 )
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_5_0()); 
            // InternalBiLang.g:1443:2: ( rule__Task__DatafilteringAssignment_5_0 )
            // InternalBiLang.g:1443:3: rule__Task__DatafilteringAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__DatafilteringAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDatafilteringAssignment_5_0()); 

            }


            }

        }
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
    // InternalBiLang.g:1451:1: rule__Task__Group_5__1 : rule__Task__Group_5__1__Impl ;
    public final void rule__Task__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1455:1: ( rule__Task__Group_5__1__Impl )
            // InternalBiLang.g:1456:2: rule__Task__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_5__1__Impl();

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
    // InternalBiLang.g:1462:1: rule__Task__Group_5__1__Impl : ( ( rule__Task__DatafilteringAssignment_5_1 )* ) ;
    public final void rule__Task__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1466:1: ( ( ( rule__Task__DatafilteringAssignment_5_1 )* ) )
            // InternalBiLang.g:1467:1: ( ( rule__Task__DatafilteringAssignment_5_1 )* )
            {
            // InternalBiLang.g:1467:1: ( ( rule__Task__DatafilteringAssignment_5_1 )* )
            // InternalBiLang.g:1468:2: ( rule__Task__DatafilteringAssignment_5_1 )*
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_5_1()); 
            // InternalBiLang.g:1469:2: ( rule__Task__DatafilteringAssignment_5_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBiLang.g:1469:3: rule__Task__DatafilteringAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Task__DatafilteringAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

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


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalBiLang.g:1478:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1482:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalBiLang.g:1483:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:1490:1: rule__Task__Group_6__0__Impl : ( ( rule__Task__FileextractorAssignment_6_0 ) ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1494:1: ( ( ( rule__Task__FileextractorAssignment_6_0 ) ) )
            // InternalBiLang.g:1495:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            {
            // InternalBiLang.g:1495:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            // InternalBiLang.g:1496:2: ( rule__Task__FileextractorAssignment_6_0 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0()); 
            // InternalBiLang.g:1497:2: ( rule__Task__FileextractorAssignment_6_0 )
            // InternalBiLang.g:1497:3: rule__Task__FileextractorAssignment_6_0
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
    // InternalBiLang.g:1505:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1509:1: ( rule__Task__Group_6__1__Impl )
            // InternalBiLang.g:1510:2: rule__Task__Group_6__1__Impl
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
    // InternalBiLang.g:1516:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__Group_6_1__0 )? ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1520:1: ( ( ( rule__Task__Group_6_1__0 )? ) )
            // InternalBiLang.g:1521:1: ( ( rule__Task__Group_6_1__0 )? )
            {
            // InternalBiLang.g:1521:1: ( ( rule__Task__Group_6_1__0 )? )
            // InternalBiLang.g:1522:2: ( rule__Task__Group_6_1__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6_1()); 
            // InternalBiLang.g:1523:2: ( rule__Task__Group_6_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:1523:3: rule__Task__Group_6_1__0
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
    // InternalBiLang.g:1532:1: rule__Task__Group_6_1__0 : rule__Task__Group_6_1__0__Impl rule__Task__Group_6_1__1 ;
    public final void rule__Task__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1536:1: ( rule__Task__Group_6_1__0__Impl rule__Task__Group_6_1__1 )
            // InternalBiLang.g:1537:2: rule__Task__Group_6_1__0__Impl rule__Task__Group_6_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:1544:1: rule__Task__Group_6_1__0__Impl : ( ( rule__Task__DatafilteringAssignment_6_1_0 ) ) ;
    public final void rule__Task__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1548:1: ( ( ( rule__Task__DatafilteringAssignment_6_1_0 ) ) )
            // InternalBiLang.g:1549:1: ( ( rule__Task__DatafilteringAssignment_6_1_0 ) )
            {
            // InternalBiLang.g:1549:1: ( ( rule__Task__DatafilteringAssignment_6_1_0 ) )
            // InternalBiLang.g:1550:2: ( rule__Task__DatafilteringAssignment_6_1_0 )
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1_0()); 
            // InternalBiLang.g:1551:2: ( rule__Task__DatafilteringAssignment_6_1_0 )
            // InternalBiLang.g:1551:3: rule__Task__DatafilteringAssignment_6_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Task__DatafilteringAssignment_6_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1_0()); 

            }


            }

        }
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
    // InternalBiLang.g:1559:1: rule__Task__Group_6_1__1 : rule__Task__Group_6_1__1__Impl ;
    public final void rule__Task__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1563:1: ( rule__Task__Group_6_1__1__Impl )
            // InternalBiLang.g:1564:2: rule__Task__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6_1__1__Impl();

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
    // InternalBiLang.g:1570:1: rule__Task__Group_6_1__1__Impl : ( ( rule__Task__DatafilteringAssignment_6_1_1 )* ) ;
    public final void rule__Task__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1574:1: ( ( ( rule__Task__DatafilteringAssignment_6_1_1 )* ) )
            // InternalBiLang.g:1575:1: ( ( rule__Task__DatafilteringAssignment_6_1_1 )* )
            {
            // InternalBiLang.g:1575:1: ( ( rule__Task__DatafilteringAssignment_6_1_1 )* )
            // InternalBiLang.g:1576:2: ( rule__Task__DatafilteringAssignment_6_1_1 )*
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1_1()); 
            // InternalBiLang.g:1577:2: ( rule__Task__DatafilteringAssignment_6_1_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalBiLang.g:1577:3: rule__Task__DatafilteringAssignment_6_1_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Task__DatafilteringAssignment_6_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

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


    // $ANTLR start "rule__FileExtractor__Group__0"
    // InternalBiLang.g:1586:1: rule__FileExtractor__Group__0 : rule__FileExtractor__Group__0__Impl rule__FileExtractor__Group__1 ;
    public final void rule__FileExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1590:1: ( rule__FileExtractor__Group__0__Impl rule__FileExtractor__Group__1 )
            // InternalBiLang.g:1591:2: rule__FileExtractor__Group__0__Impl rule__FileExtractor__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBiLang.g:1598:1: rule__FileExtractor__Group__0__Impl : ( ( rule__FileExtractor__NameAssignment_0 ) ) ;
    public final void rule__FileExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1602:1: ( ( ( rule__FileExtractor__NameAssignment_0 ) ) )
            // InternalBiLang.g:1603:1: ( ( rule__FileExtractor__NameAssignment_0 ) )
            {
            // InternalBiLang.g:1603:1: ( ( rule__FileExtractor__NameAssignment_0 ) )
            // InternalBiLang.g:1604:2: ( rule__FileExtractor__NameAssignment_0 )
            {
             before(grammarAccess.getFileExtractorAccess().getNameAssignment_0()); 
            // InternalBiLang.g:1605:2: ( rule__FileExtractor__NameAssignment_0 )
            // InternalBiLang.g:1605:3: rule__FileExtractor__NameAssignment_0
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
    // InternalBiLang.g:1613:1: rule__FileExtractor__Group__1 : rule__FileExtractor__Group__1__Impl rule__FileExtractor__Group__2 ;
    public final void rule__FileExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1617:1: ( rule__FileExtractor__Group__1__Impl rule__FileExtractor__Group__2 )
            // InternalBiLang.g:1618:2: rule__FileExtractor__Group__1__Impl rule__FileExtractor__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:1625:1: rule__FileExtractor__Group__1__Impl : ( '=>' ) ;
    public final void rule__FileExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1629:1: ( ( '=>' ) )
            // InternalBiLang.g:1630:1: ( '=>' )
            {
            // InternalBiLang.g:1630:1: ( '=>' )
            // InternalBiLang.g:1631:2: '=>'
            {
             before(grammarAccess.getFileExtractorAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBiLang.g:1640:1: rule__FileExtractor__Group__2 : rule__FileExtractor__Group__2__Impl rule__FileExtractor__Group__3 ;
    public final void rule__FileExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1644:1: ( rule__FileExtractor__Group__2__Impl rule__FileExtractor__Group__3 )
            // InternalBiLang.g:1645:2: rule__FileExtractor__Group__2__Impl rule__FileExtractor__Group__3
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
    // InternalBiLang.g:1652:1: rule__FileExtractor__Group__2__Impl : ( ( rule__FileExtractor__PathAssignment_2 ) ) ;
    public final void rule__FileExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1656:1: ( ( ( rule__FileExtractor__PathAssignment_2 ) ) )
            // InternalBiLang.g:1657:1: ( ( rule__FileExtractor__PathAssignment_2 ) )
            {
            // InternalBiLang.g:1657:1: ( ( rule__FileExtractor__PathAssignment_2 ) )
            // InternalBiLang.g:1658:2: ( rule__FileExtractor__PathAssignment_2 )
            {
             before(grammarAccess.getFileExtractorAccess().getPathAssignment_2()); 
            // InternalBiLang.g:1659:2: ( rule__FileExtractor__PathAssignment_2 )
            // InternalBiLang.g:1659:3: rule__FileExtractor__PathAssignment_2
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
    // InternalBiLang.g:1667:1: rule__FileExtractor__Group__3 : rule__FileExtractor__Group__3__Impl ;
    public final void rule__FileExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1671:1: ( rule__FileExtractor__Group__3__Impl )
            // InternalBiLang.g:1672:2: rule__FileExtractor__Group__3__Impl
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
    // InternalBiLang.g:1678:1: rule__FileExtractor__Group__3__Impl : ( ( rule__FileExtractor__Group_3__0 )? ) ;
    public final void rule__FileExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1682:1: ( ( ( rule__FileExtractor__Group_3__0 )? ) )
            // InternalBiLang.g:1683:1: ( ( rule__FileExtractor__Group_3__0 )? )
            {
            // InternalBiLang.g:1683:1: ( ( rule__FileExtractor__Group_3__0 )? )
            // InternalBiLang.g:1684:2: ( rule__FileExtractor__Group_3__0 )?
            {
             before(grammarAccess.getFileExtractorAccess().getGroup_3()); 
            // InternalBiLang.g:1685:2: ( rule__FileExtractor__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBiLang.g:1685:3: rule__FileExtractor__Group_3__0
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
    // InternalBiLang.g:1694:1: rule__FileExtractor__Group_3__0 : rule__FileExtractor__Group_3__0__Impl rule__FileExtractor__Group_3__1 ;
    public final void rule__FileExtractor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1698:1: ( rule__FileExtractor__Group_3__0__Impl rule__FileExtractor__Group_3__1 )
            // InternalBiLang.g:1699:2: rule__FileExtractor__Group_3__0__Impl rule__FileExtractor__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:1706:1: rule__FileExtractor__Group_3__0__Impl : ( 'null replacement->' ) ;
    public final void rule__FileExtractor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1710:1: ( ( 'null replacement->' ) )
            // InternalBiLang.g:1711:1: ( 'null replacement->' )
            {
            // InternalBiLang.g:1711:1: ( 'null replacement->' )
            // InternalBiLang.g:1712:2: 'null replacement->'
            {
             before(grammarAccess.getFileExtractorAccess().getNullReplacementKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalBiLang.g:1721:1: rule__FileExtractor__Group_3__1 : rule__FileExtractor__Group_3__1__Impl rule__FileExtractor__Group_3__2 ;
    public final void rule__FileExtractor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1725:1: ( rule__FileExtractor__Group_3__1__Impl rule__FileExtractor__Group_3__2 )
            // InternalBiLang.g:1726:2: rule__FileExtractor__Group_3__1__Impl rule__FileExtractor__Group_3__2
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
    // InternalBiLang.g:1733:1: rule__FileExtractor__Group_3__1__Impl : ( ( rule__FileExtractor__NullreplacementAssignment_3_1 ) ) ;
    public final void rule__FileExtractor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1737:1: ( ( ( rule__FileExtractor__NullreplacementAssignment_3_1 ) ) )
            // InternalBiLang.g:1738:1: ( ( rule__FileExtractor__NullreplacementAssignment_3_1 ) )
            {
            // InternalBiLang.g:1738:1: ( ( rule__FileExtractor__NullreplacementAssignment_3_1 ) )
            // InternalBiLang.g:1739:2: ( rule__FileExtractor__NullreplacementAssignment_3_1 )
            {
             before(grammarAccess.getFileExtractorAccess().getNullreplacementAssignment_3_1()); 
            // InternalBiLang.g:1740:2: ( rule__FileExtractor__NullreplacementAssignment_3_1 )
            // InternalBiLang.g:1740:3: rule__FileExtractor__NullreplacementAssignment_3_1
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
    // InternalBiLang.g:1748:1: rule__FileExtractor__Group_3__2 : rule__FileExtractor__Group_3__2__Impl ;
    public final void rule__FileExtractor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1752:1: ( rule__FileExtractor__Group_3__2__Impl )
            // InternalBiLang.g:1753:2: rule__FileExtractor__Group_3__2__Impl
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
    // InternalBiLang.g:1759:1: rule__FileExtractor__Group_3__2__Impl : ( ( rule__FileExtractor__Group_3_2__0 )* ) ;
    public final void rule__FileExtractor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1763:1: ( ( ( rule__FileExtractor__Group_3_2__0 )* ) )
            // InternalBiLang.g:1764:1: ( ( rule__FileExtractor__Group_3_2__0 )* )
            {
            // InternalBiLang.g:1764:1: ( ( rule__FileExtractor__Group_3_2__0 )* )
            // InternalBiLang.g:1765:2: ( rule__FileExtractor__Group_3_2__0 )*
            {
             before(grammarAccess.getFileExtractorAccess().getGroup_3_2()); 
            // InternalBiLang.g:1766:2: ( rule__FileExtractor__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBiLang.g:1766:3: rule__FileExtractor__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FileExtractor__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalBiLang.g:1775:1: rule__FileExtractor__Group_3_2__0 : rule__FileExtractor__Group_3_2__0__Impl rule__FileExtractor__Group_3_2__1 ;
    public final void rule__FileExtractor__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1779:1: ( rule__FileExtractor__Group_3_2__0__Impl rule__FileExtractor__Group_3_2__1 )
            // InternalBiLang.g:1780:2: rule__FileExtractor__Group_3_2__0__Impl rule__FileExtractor__Group_3_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:1787:1: rule__FileExtractor__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__FileExtractor__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1791:1: ( ( ',' ) )
            // InternalBiLang.g:1792:1: ( ',' )
            {
            // InternalBiLang.g:1792:1: ( ',' )
            // InternalBiLang.g:1793:2: ','
            {
             before(grammarAccess.getFileExtractorAccess().getCommaKeyword_3_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalBiLang.g:1802:1: rule__FileExtractor__Group_3_2__1 : rule__FileExtractor__Group_3_2__1__Impl ;
    public final void rule__FileExtractor__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1806:1: ( rule__FileExtractor__Group_3_2__1__Impl )
            // InternalBiLang.g:1807:2: rule__FileExtractor__Group_3_2__1__Impl
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
    // InternalBiLang.g:1813:1: rule__FileExtractor__Group_3_2__1__Impl : ( ( rule__FileExtractor__NullreplacementAssignment_3_2_1 ) ) ;
    public final void rule__FileExtractor__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1817:1: ( ( ( rule__FileExtractor__NullreplacementAssignment_3_2_1 ) ) )
            // InternalBiLang.g:1818:1: ( ( rule__FileExtractor__NullreplacementAssignment_3_2_1 ) )
            {
            // InternalBiLang.g:1818:1: ( ( rule__FileExtractor__NullreplacementAssignment_3_2_1 ) )
            // InternalBiLang.g:1819:2: ( rule__FileExtractor__NullreplacementAssignment_3_2_1 )
            {
             before(grammarAccess.getFileExtractorAccess().getNullreplacementAssignment_3_2_1()); 
            // InternalBiLang.g:1820:2: ( rule__FileExtractor__NullreplacementAssignment_3_2_1 )
            // InternalBiLang.g:1820:3: rule__FileExtractor__NullreplacementAssignment_3_2_1
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
    // InternalBiLang.g:1829:1: rule__DataFiltering__Group__0 : rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 ;
    public final void rule__DataFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1833:1: ( rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 )
            // InternalBiLang.g:1834:2: rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:1841:1: rule__DataFiltering__Group__0__Impl : ( '->' ) ;
    public final void rule__DataFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1845:1: ( ( '->' ) )
            // InternalBiLang.g:1846:1: ( '->' )
            {
            // InternalBiLang.g:1846:1: ( '->' )
            // InternalBiLang.g:1847:2: '->'
            {
             before(grammarAccess.getDataFilteringAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
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
    // InternalBiLang.g:1856:1: rule__DataFiltering__Group__1 : rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 ;
    public final void rule__DataFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1860:1: ( rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 )
            // InternalBiLang.g:1861:2: rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2
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
    // InternalBiLang.g:1868:1: rule__DataFiltering__Group__1__Impl : ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) ;
    public final void rule__DataFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1872:1: ( ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) )
            // InternalBiLang.g:1873:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            {
            // InternalBiLang.g:1873:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            // InternalBiLang.g:1874:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_1()); 
            // InternalBiLang.g:1875:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            // InternalBiLang.g:1875:3: rule__DataFiltering__FileextractorAssignment_1
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
    // InternalBiLang.g:1883:1: rule__DataFiltering__Group__2 : rule__DataFiltering__Group__2__Impl ;
    public final void rule__DataFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1887:1: ( rule__DataFiltering__Group__2__Impl )
            // InternalBiLang.g:1888:2: rule__DataFiltering__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__2__Impl();

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
    // InternalBiLang.g:1894:1: rule__DataFiltering__Group__2__Impl : ( ( rule__DataFiltering__Group_2__0 ) ) ;
    public final void rule__DataFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1898:1: ( ( ( rule__DataFiltering__Group_2__0 ) ) )
            // InternalBiLang.g:1899:1: ( ( rule__DataFiltering__Group_2__0 ) )
            {
            // InternalBiLang.g:1899:1: ( ( rule__DataFiltering__Group_2__0 ) )
            // InternalBiLang.g:1900:2: ( rule__DataFiltering__Group_2__0 )
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2()); 
            // InternalBiLang.g:1901:2: ( rule__DataFiltering__Group_2__0 )
            // InternalBiLang.g:1901:3: rule__DataFiltering__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2__0();

            state._fsp--;


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


    // $ANTLR start "rule__DataFiltering__Group_2__0"
    // InternalBiLang.g:1910:1: rule__DataFiltering__Group_2__0 : rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 ;
    public final void rule__DataFiltering__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1914:1: ( rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 )
            // InternalBiLang.g:1915:2: rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalBiLang.g:1922:1: rule__DataFiltering__Group_2__0__Impl : ( ( rule__DataFiltering__Group_2_0__0 )? ) ;
    public final void rule__DataFiltering__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1926:1: ( ( ( rule__DataFiltering__Group_2_0__0 )? ) )
            // InternalBiLang.g:1927:1: ( ( rule__DataFiltering__Group_2_0__0 )? )
            {
            // InternalBiLang.g:1927:1: ( ( rule__DataFiltering__Group_2_0__0 )? )
            // InternalBiLang.g:1928:2: ( rule__DataFiltering__Group_2_0__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_0()); 
            // InternalBiLang.g:1929:2: ( rule__DataFiltering__Group_2_0__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:1929:3: rule__DataFiltering__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Group_2_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getGroup_2_0()); 

            }


            }

        }
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
    // InternalBiLang.g:1937:1: rule__DataFiltering__Group_2__1 : rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 ;
    public final void rule__DataFiltering__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1941:1: ( rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 )
            // InternalBiLang.g:1942:2: rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalBiLang.g:1949:1: rule__DataFiltering__Group_2__1__Impl : ( ( rule__DataFiltering__Group_2_1__0 )? ) ;
    public final void rule__DataFiltering__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1953:1: ( ( ( rule__DataFiltering__Group_2_1__0 )? ) )
            // InternalBiLang.g:1954:1: ( ( rule__DataFiltering__Group_2_1__0 )? )
            {
            // InternalBiLang.g:1954:1: ( ( rule__DataFiltering__Group_2_1__0 )? )
            // InternalBiLang.g:1955:2: ( rule__DataFiltering__Group_2_1__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_1()); 
            // InternalBiLang.g:1956:2: ( rule__DataFiltering__Group_2_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:1956:3: rule__DataFiltering__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getGroup_2_1()); 

            }


            }

        }
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
    // InternalBiLang.g:1964:1: rule__DataFiltering__Group_2__2 : rule__DataFiltering__Group_2__2__Impl ;
    public final void rule__DataFiltering__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1968:1: ( rule__DataFiltering__Group_2__2__Impl )
            // InternalBiLang.g:1969:2: rule__DataFiltering__Group_2__2__Impl
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
    // InternalBiLang.g:1975:1: rule__DataFiltering__Group_2__2__Impl : ( ( rule__DataFiltering__Group_2_2__0 )? ) ;
    public final void rule__DataFiltering__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1979:1: ( ( ( rule__DataFiltering__Group_2_2__0 )? ) )
            // InternalBiLang.g:1980:1: ( ( rule__DataFiltering__Group_2_2__0 )? )
            {
            // InternalBiLang.g:1980:1: ( ( rule__DataFiltering__Group_2_2__0 )? )
            // InternalBiLang.g:1981:2: ( rule__DataFiltering__Group_2_2__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_2()); 
            // InternalBiLang.g:1982:2: ( rule__DataFiltering__Group_2_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:1982:3: rule__DataFiltering__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

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


    // $ANTLR start "rule__DataFiltering__Group_2_0__0"
    // InternalBiLang.g:1991:1: rule__DataFiltering__Group_2_0__0 : rule__DataFiltering__Group_2_0__0__Impl rule__DataFiltering__Group_2_0__1 ;
    public final void rule__DataFiltering__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1995:1: ( rule__DataFiltering__Group_2_0__0__Impl rule__DataFiltering__Group_2_0__1 )
            // InternalBiLang.g:1996:2: rule__DataFiltering__Group_2_0__0__Impl rule__DataFiltering__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__DataFiltering__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_0__1();

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
    // $ANTLR end "rule__DataFiltering__Group_2_0__0"


    // $ANTLR start "rule__DataFiltering__Group_2_0__0__Impl"
    // InternalBiLang.g:2003:1: rule__DataFiltering__Group_2_0__0__Impl : ( 'filtering=' ) ;
    public final void rule__DataFiltering__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2007:1: ( ( 'filtering=' ) )
            // InternalBiLang.g:2008:1: ( 'filtering=' )
            {
            // InternalBiLang.g:2008:1: ( 'filtering=' )
            // InternalBiLang.g:2009:2: 'filtering='
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringKeyword_2_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getFilteringKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_0__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_0__1"
    // InternalBiLang.g:2018:1: rule__DataFiltering__Group_2_0__1 : rule__DataFiltering__Group_2_0__1__Impl rule__DataFiltering__Group_2_0__2 ;
    public final void rule__DataFiltering__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2022:1: ( rule__DataFiltering__Group_2_0__1__Impl rule__DataFiltering__Group_2_0__2 )
            // InternalBiLang.g:2023:2: rule__DataFiltering__Group_2_0__1__Impl rule__DataFiltering__Group_2_0__2
            {
            pushFollow(FOLLOW_15);
            rule__DataFiltering__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_0__2();

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
    // $ANTLR end "rule__DataFiltering__Group_2_0__1"


    // $ANTLR start "rule__DataFiltering__Group_2_0__1__Impl"
    // InternalBiLang.g:2030:1: rule__DataFiltering__Group_2_0__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_2_0_1 ) ) ;
    public final void rule__DataFiltering__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2034:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_2_0_1 ) ) )
            // InternalBiLang.g:2035:1: ( ( rule__DataFiltering__FilteringstepAssignment_2_0_1 ) )
            {
            // InternalBiLang.g:2035:1: ( ( rule__DataFiltering__FilteringstepAssignment_2_0_1 ) )
            // InternalBiLang.g:2036:2: ( rule__DataFiltering__FilteringstepAssignment_2_0_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_2_0_1()); 
            // InternalBiLang.g:2037:2: ( rule__DataFiltering__FilteringstepAssignment_2_0_1 )
            // InternalBiLang.g:2037:3: rule__DataFiltering__FilteringstepAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__FilteringstepAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_0__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_0__2"
    // InternalBiLang.g:2045:1: rule__DataFiltering__Group_2_0__2 : rule__DataFiltering__Group_2_0__2__Impl ;
    public final void rule__DataFiltering__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2049:1: ( rule__DataFiltering__Group_2_0__2__Impl )
            // InternalBiLang.g:2050:2: rule__DataFiltering__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_2_0__2"


    // $ANTLR start "rule__DataFiltering__Group_2_0__2__Impl"
    // InternalBiLang.g:2056:1: rule__DataFiltering__Group_2_0__2__Impl : ( ( rule__DataFiltering__Group_2_0_2__0 )* ) ;
    public final void rule__DataFiltering__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2060:1: ( ( ( rule__DataFiltering__Group_2_0_2__0 )* ) )
            // InternalBiLang.g:2061:1: ( ( rule__DataFiltering__Group_2_0_2__0 )* )
            {
            // InternalBiLang.g:2061:1: ( ( rule__DataFiltering__Group_2_0_2__0 )* )
            // InternalBiLang.g:2062:2: ( rule__DataFiltering__Group_2_0_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_0_2()); 
            // InternalBiLang.g:2063:2: ( rule__DataFiltering__Group_2_0_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBiLang.g:2063:3: rule__DataFiltering__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DataFiltering__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_0__2__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_0_2__0"
    // InternalBiLang.g:2072:1: rule__DataFiltering__Group_2_0_2__0 : rule__DataFiltering__Group_2_0_2__0__Impl rule__DataFiltering__Group_2_0_2__1 ;
    public final void rule__DataFiltering__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2076:1: ( rule__DataFiltering__Group_2_0_2__0__Impl rule__DataFiltering__Group_2_0_2__1 )
            // InternalBiLang.g:2077:2: rule__DataFiltering__Group_2_0_2__0__Impl rule__DataFiltering__Group_2_0_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DataFiltering__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_0_2__1();

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
    // $ANTLR end "rule__DataFiltering__Group_2_0_2__0"


    // $ANTLR start "rule__DataFiltering__Group_2_0_2__0__Impl"
    // InternalBiLang.g:2084:1: rule__DataFiltering__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2088:1: ( ( ',' ) )
            // InternalBiLang.g:2089:1: ( ',' )
            {
            // InternalBiLang.g:2089:1: ( ',' )
            // InternalBiLang.g:2090:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_0_2__1"
    // InternalBiLang.g:2099:1: rule__DataFiltering__Group_2_0_2__1 : rule__DataFiltering__Group_2_0_2__1__Impl ;
    public final void rule__DataFiltering__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2103:1: ( rule__DataFiltering__Group_2_0_2__1__Impl )
            // InternalBiLang.g:2104:2: rule__DataFiltering__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_0_2__1__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_2_0_2__1"


    // $ANTLR start "rule__DataFiltering__Group_2_0_2__1__Impl"
    // InternalBiLang.g:2110:1: rule__DataFiltering__Group_2_0_2__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_2_0_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2114:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_2_0_2_1 ) ) )
            // InternalBiLang.g:2115:1: ( ( rule__DataFiltering__FilteringstepAssignment_2_0_2_1 ) )
            {
            // InternalBiLang.g:2115:1: ( ( rule__DataFiltering__FilteringstepAssignment_2_0_2_1 ) )
            // InternalBiLang.g:2116:2: ( rule__DataFiltering__FilteringstepAssignment_2_0_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_2_0_2_1()); 
            // InternalBiLang.g:2117:2: ( rule__DataFiltering__FilteringstepAssignment_2_0_2_1 )
            // InternalBiLang.g:2117:3: rule__DataFiltering__FilteringstepAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__FilteringstepAssignment_2_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_1__0"
    // InternalBiLang.g:2126:1: rule__DataFiltering__Group_2_1__0 : rule__DataFiltering__Group_2_1__0__Impl rule__DataFiltering__Group_2_1__1 ;
    public final void rule__DataFiltering__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2130:1: ( rule__DataFiltering__Group_2_1__0__Impl rule__DataFiltering__Group_2_1__1 )
            // InternalBiLang.g:2131:2: rule__DataFiltering__Group_2_1__0__Impl rule__DataFiltering__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__DataFiltering__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_1__1();

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
    // $ANTLR end "rule__DataFiltering__Group_2_1__0"


    // $ANTLR start "rule__DataFiltering__Group_2_1__0__Impl"
    // InternalBiLang.g:2138:1: rule__DataFiltering__Group_2_1__0__Impl : ( 'processing=' ) ;
    public final void rule__DataFiltering__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2142:1: ( ( 'processing=' ) )
            // InternalBiLang.g:2143:1: ( 'processing=' )
            {
            // InternalBiLang.g:2143:1: ( 'processing=' )
            // InternalBiLang.g:2144:2: 'processing='
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingKeyword_2_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getProcessingKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_1__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_1__1"
    // InternalBiLang.g:2153:1: rule__DataFiltering__Group_2_1__1 : rule__DataFiltering__Group_2_1__1__Impl rule__DataFiltering__Group_2_1__2 ;
    public final void rule__DataFiltering__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2157:1: ( rule__DataFiltering__Group_2_1__1__Impl rule__DataFiltering__Group_2_1__2 )
            // InternalBiLang.g:2158:2: rule__DataFiltering__Group_2_1__1__Impl rule__DataFiltering__Group_2_1__2
            {
            pushFollow(FOLLOW_15);
            rule__DataFiltering__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_1__2();

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
    // $ANTLR end "rule__DataFiltering__Group_2_1__1"


    // $ANTLR start "rule__DataFiltering__Group_2_1__1__Impl"
    // InternalBiLang.g:2165:1: rule__DataFiltering__Group_2_1__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_1_1 ) ) ;
    public final void rule__DataFiltering__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2169:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_1_1 ) ) )
            // InternalBiLang.g:2170:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1_1 ) )
            {
            // InternalBiLang.g:2170:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1_1 ) )
            // InternalBiLang.g:2171:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1_1()); 
            // InternalBiLang.g:2172:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1_1 )
            // InternalBiLang.g:2172:3: rule__DataFiltering__ProcessingstepAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__ProcessingstepAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_1__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_1__2"
    // InternalBiLang.g:2180:1: rule__DataFiltering__Group_2_1__2 : rule__DataFiltering__Group_2_1__2__Impl ;
    public final void rule__DataFiltering__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2184:1: ( rule__DataFiltering__Group_2_1__2__Impl )
            // InternalBiLang.g:2185:2: rule__DataFiltering__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_2_1__2"


    // $ANTLR start "rule__DataFiltering__Group_2_1__2__Impl"
    // InternalBiLang.g:2191:1: rule__DataFiltering__Group_2_1__2__Impl : ( ( rule__DataFiltering__Group_2_1_2__0 )* ) ;
    public final void rule__DataFiltering__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2195:1: ( ( ( rule__DataFiltering__Group_2_1_2__0 )* ) )
            // InternalBiLang.g:2196:1: ( ( rule__DataFiltering__Group_2_1_2__0 )* )
            {
            // InternalBiLang.g:2196:1: ( ( rule__DataFiltering__Group_2_1_2__0 )* )
            // InternalBiLang.g:2197:2: ( rule__DataFiltering__Group_2_1_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_1_2()); 
            // InternalBiLang.g:2198:2: ( rule__DataFiltering__Group_2_1_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBiLang.g:2198:3: rule__DataFiltering__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DataFiltering__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_1__2__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_1_2__0"
    // InternalBiLang.g:2207:1: rule__DataFiltering__Group_2_1_2__0 : rule__DataFiltering__Group_2_1_2__0__Impl rule__DataFiltering__Group_2_1_2__1 ;
    public final void rule__DataFiltering__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2211:1: ( rule__DataFiltering__Group_2_1_2__0__Impl rule__DataFiltering__Group_2_1_2__1 )
            // InternalBiLang.g:2212:2: rule__DataFiltering__Group_2_1_2__0__Impl rule__DataFiltering__Group_2_1_2__1
            {
            pushFollow(FOLLOW_18);
            rule__DataFiltering__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_1_2__1();

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
    // $ANTLR end "rule__DataFiltering__Group_2_1_2__0"


    // $ANTLR start "rule__DataFiltering__Group_2_1_2__0__Impl"
    // InternalBiLang.g:2219:1: rule__DataFiltering__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2223:1: ( ( ',' ) )
            // InternalBiLang.g:2224:1: ( ',' )
            {
            // InternalBiLang.g:2224:1: ( ',' )
            // InternalBiLang.g:2225:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_1_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_1_2__1"
    // InternalBiLang.g:2234:1: rule__DataFiltering__Group_2_1_2__1 : rule__DataFiltering__Group_2_1_2__1__Impl ;
    public final void rule__DataFiltering__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2238:1: ( rule__DataFiltering__Group_2_1_2__1__Impl )
            // InternalBiLang.g:2239:2: rule__DataFiltering__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_2_1_2__1"


    // $ANTLR start "rule__DataFiltering__Group_2_1_2__1__Impl"
    // InternalBiLang.g:2245:1: rule__DataFiltering__Group_2_1_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_1_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2249:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_1_2_1 ) ) )
            // InternalBiLang.g:2250:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1_2_1 ) )
            {
            // InternalBiLang.g:2250:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1_2_1 ) )
            // InternalBiLang.g:2251:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1_2_1()); 
            // InternalBiLang.g:2252:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1_2_1 )
            // InternalBiLang.g:2252:3: rule__DataFiltering__ProcessingstepAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__ProcessingstepAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_2__0"
    // InternalBiLang.g:2261:1: rule__DataFiltering__Group_2_2__0 : rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 ;
    public final void rule__DataFiltering__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2265:1: ( rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 )
            // InternalBiLang.g:2266:2: rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:2273:1: rule__DataFiltering__Group_2_2__0__Impl : ( 'count=' ) ;
    public final void rule__DataFiltering__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2277:1: ( ( 'count=' ) )
            // InternalBiLang.g:2278:1: ( 'count=' )
            {
            // InternalBiLang.g:2278:1: ( 'count=' )
            // InternalBiLang.g:2279:2: 'count='
            {
             before(grammarAccess.getDataFilteringAccess().getCountKeyword_2_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCountKeyword_2_2_0()); 

            }


            }

        }
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
    // InternalBiLang.g:2288:1: rule__DataFiltering__Group_2_2__1 : rule__DataFiltering__Group_2_2__1__Impl rule__DataFiltering__Group_2_2__2 ;
    public final void rule__DataFiltering__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2292:1: ( rule__DataFiltering__Group_2_2__1__Impl rule__DataFiltering__Group_2_2__2 )
            // InternalBiLang.g:2293:2: rule__DataFiltering__Group_2_2__1__Impl rule__DataFiltering__Group_2_2__2
            {
            pushFollow(FOLLOW_15);
            rule__DataFiltering__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_2__2();

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
    // InternalBiLang.g:2300:1: rule__DataFiltering__Group_2_2__1__Impl : ( ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2304:1: ( ( ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1 ) ) )
            // InternalBiLang.g:2305:1: ( ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1 ) )
            {
            // InternalBiLang.g:2305:1: ( ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1 ) )
            // InternalBiLang.g:2306:2: ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepAssignment_2_2_1()); 
            // InternalBiLang.g:2307:2: ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1 )
            // InternalBiLang.g:2307:3: rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepAssignment_2_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataFiltering__Group_2_2__2"
    // InternalBiLang.g:2315:1: rule__DataFiltering__Group_2_2__2 : rule__DataFiltering__Group_2_2__2__Impl ;
    public final void rule__DataFiltering__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2319:1: ( rule__DataFiltering__Group_2_2__2__Impl )
            // InternalBiLang.g:2320:2: rule__DataFiltering__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_2__2__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_2_2__2"


    // $ANTLR start "rule__DataFiltering__Group_2_2__2__Impl"
    // InternalBiLang.g:2326:1: rule__DataFiltering__Group_2_2__2__Impl : ( ( rule__DataFiltering__Group_2_2_2__0 )* ) ;
    public final void rule__DataFiltering__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2330:1: ( ( ( rule__DataFiltering__Group_2_2_2__0 )* ) )
            // InternalBiLang.g:2331:1: ( ( rule__DataFiltering__Group_2_2_2__0 )* )
            {
            // InternalBiLang.g:2331:1: ( ( rule__DataFiltering__Group_2_2_2__0 )* )
            // InternalBiLang.g:2332:2: ( rule__DataFiltering__Group_2_2_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_2_2()); 
            // InternalBiLang.g:2333:2: ( rule__DataFiltering__Group_2_2_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBiLang.g:2333:3: rule__DataFiltering__Group_2_2_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__DataFiltering__Group_2_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getGroup_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_2__2__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_2_2__0"
    // InternalBiLang.g:2342:1: rule__DataFiltering__Group_2_2_2__0 : rule__DataFiltering__Group_2_2_2__0__Impl rule__DataFiltering__Group_2_2_2__1 ;
    public final void rule__DataFiltering__Group_2_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2346:1: ( rule__DataFiltering__Group_2_2_2__0__Impl rule__DataFiltering__Group_2_2_2__1 )
            // InternalBiLang.g:2347:2: rule__DataFiltering__Group_2_2_2__0__Impl rule__DataFiltering__Group_2_2_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DataFiltering__Group_2_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_2_2__1();

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
    // $ANTLR end "rule__DataFiltering__Group_2_2_2__0"


    // $ANTLR start "rule__DataFiltering__Group_2_2_2__0__Impl"
    // InternalBiLang.g:2354:1: rule__DataFiltering__Group_2_2_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_2_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2358:1: ( ( ',' ) )
            // InternalBiLang.g:2359:1: ( ',' )
            {
            // InternalBiLang.g:2359:1: ( ',' )
            // InternalBiLang.g:2360:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_2_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_2_2__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_2_2_2__1"
    // InternalBiLang.g:2369:1: rule__DataFiltering__Group_2_2_2__1 : rule__DataFiltering__Group_2_2_2__1__Impl ;
    public final void rule__DataFiltering__Group_2_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2373:1: ( rule__DataFiltering__Group_2_2_2__1__Impl )
            // InternalBiLang.g:2374:2: rule__DataFiltering__Group_2_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_2_2_2__1__Impl();

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
    // $ANTLR end "rule__DataFiltering__Group_2_2_2__1"


    // $ANTLR start "rule__DataFiltering__Group_2_2_2__1__Impl"
    // InternalBiLang.g:2380:1: rule__DataFiltering__Group_2_2_2__1__Impl : ( ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2384:1: ( ( ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1 ) ) )
            // InternalBiLang.g:2385:1: ( ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1 ) )
            {
            // InternalBiLang.g:2385:1: ( ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1 ) )
            // InternalBiLang.g:2386:2: ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepAssignment_2_2_2_1()); 
            // InternalBiLang.g:2387:2: ( rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1 )
            // InternalBiLang.g:2387:3: rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepAssignment_2_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_2_2_2__1__Impl"


    // $ANTLR start "rule__CountPreprocessingStep__Group__0"
    // InternalBiLang.g:2396:1: rule__CountPreprocessingStep__Group__0 : rule__CountPreprocessingStep__Group__0__Impl rule__CountPreprocessingStep__Group__1 ;
    public final void rule__CountPreprocessingStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2400:1: ( rule__CountPreprocessingStep__Group__0__Impl rule__CountPreprocessingStep__Group__1 )
            // InternalBiLang.g:2401:2: rule__CountPreprocessingStep__Group__0__Impl rule__CountPreprocessingStep__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__CountPreprocessingStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__Group__1();

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
    // $ANTLR end "rule__CountPreprocessingStep__Group__0"


    // $ANTLR start "rule__CountPreprocessingStep__Group__0__Impl"
    // InternalBiLang.g:2408:1: rule__CountPreprocessingStep__Group__0__Impl : ( ( rule__CountPreprocessingStep__AxisAssignment_0 ) ) ;
    public final void rule__CountPreprocessingStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2412:1: ( ( ( rule__CountPreprocessingStep__AxisAssignment_0 ) ) )
            // InternalBiLang.g:2413:1: ( ( rule__CountPreprocessingStep__AxisAssignment_0 ) )
            {
            // InternalBiLang.g:2413:1: ( ( rule__CountPreprocessingStep__AxisAssignment_0 ) )
            // InternalBiLang.g:2414:2: ( rule__CountPreprocessingStep__AxisAssignment_0 )
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getAxisAssignment_0()); 
            // InternalBiLang.g:2415:2: ( rule__CountPreprocessingStep__AxisAssignment_0 )
            // InternalBiLang.g:2415:3: rule__CountPreprocessingStep__AxisAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__AxisAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCountPreprocessingStepAccess().getAxisAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__Group__0__Impl"


    // $ANTLR start "rule__CountPreprocessingStep__Group__1"
    // InternalBiLang.g:2423:1: rule__CountPreprocessingStep__Group__1 : rule__CountPreprocessingStep__Group__1__Impl rule__CountPreprocessingStep__Group__2 ;
    public final void rule__CountPreprocessingStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2427:1: ( rule__CountPreprocessingStep__Group__1__Impl rule__CountPreprocessingStep__Group__2 )
            // InternalBiLang.g:2428:2: rule__CountPreprocessingStep__Group__1__Impl rule__CountPreprocessingStep__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CountPreprocessingStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__Group__2();

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
    // $ANTLR end "rule__CountPreprocessingStep__Group__1"


    // $ANTLR start "rule__CountPreprocessingStep__Group__1__Impl"
    // InternalBiLang.g:2435:1: rule__CountPreprocessingStep__Group__1__Impl : ( '{' ) ;
    public final void rule__CountPreprocessingStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2439:1: ( ( '{' ) )
            // InternalBiLang.g:2440:1: ( '{' )
            {
            // InternalBiLang.g:2440:1: ( '{' )
            // InternalBiLang.g:2441:2: '{'
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCountPreprocessingStepAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__Group__1__Impl"


    // $ANTLR start "rule__CountPreprocessingStep__Group__2"
    // InternalBiLang.g:2450:1: rule__CountPreprocessingStep__Group__2 : rule__CountPreprocessingStep__Group__2__Impl rule__CountPreprocessingStep__Group__3 ;
    public final void rule__CountPreprocessingStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2454:1: ( rule__CountPreprocessingStep__Group__2__Impl rule__CountPreprocessingStep__Group__3 )
            // InternalBiLang.g:2455:2: rule__CountPreprocessingStep__Group__2__Impl rule__CountPreprocessingStep__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__CountPreprocessingStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__Group__3();

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
    // $ANTLR end "rule__CountPreprocessingStep__Group__2"


    // $ANTLR start "rule__CountPreprocessingStep__Group__2__Impl"
    // InternalBiLang.g:2462:1: rule__CountPreprocessingStep__Group__2__Impl : ( ( rule__CountPreprocessingStep__Alternatives_2 ) ) ;
    public final void rule__CountPreprocessingStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2466:1: ( ( ( rule__CountPreprocessingStep__Alternatives_2 ) ) )
            // InternalBiLang.g:2467:1: ( ( rule__CountPreprocessingStep__Alternatives_2 ) )
            {
            // InternalBiLang.g:2467:1: ( ( rule__CountPreprocessingStep__Alternatives_2 ) )
            // InternalBiLang.g:2468:2: ( rule__CountPreprocessingStep__Alternatives_2 )
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getAlternatives_2()); 
            // InternalBiLang.g:2469:2: ( rule__CountPreprocessingStep__Alternatives_2 )
            // InternalBiLang.g:2469:3: rule__CountPreprocessingStep__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCountPreprocessingStepAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__Group__2__Impl"


    // $ANTLR start "rule__CountPreprocessingStep__Group__3"
    // InternalBiLang.g:2477:1: rule__CountPreprocessingStep__Group__3 : rule__CountPreprocessingStep__Group__3__Impl rule__CountPreprocessingStep__Group__4 ;
    public final void rule__CountPreprocessingStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2481:1: ( rule__CountPreprocessingStep__Group__3__Impl rule__CountPreprocessingStep__Group__4 )
            // InternalBiLang.g:2482:2: rule__CountPreprocessingStep__Group__3__Impl rule__CountPreprocessingStep__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__CountPreprocessingStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__Group__4();

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
    // $ANTLR end "rule__CountPreprocessingStep__Group__3"


    // $ANTLR start "rule__CountPreprocessingStep__Group__3__Impl"
    // InternalBiLang.g:2489:1: rule__CountPreprocessingStep__Group__3__Impl : ( '}=' ) ;
    public final void rule__CountPreprocessingStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2493:1: ( ( '}=' ) )
            // InternalBiLang.g:2494:1: ( '}=' )
            {
            // InternalBiLang.g:2494:1: ( '}=' )
            // InternalBiLang.g:2495:2: '}='
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getRightCurlyBracketEqualsSignKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCountPreprocessingStepAccess().getRightCurlyBracketEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__Group__3__Impl"


    // $ANTLR start "rule__CountPreprocessingStep__Group__4"
    // InternalBiLang.g:2504:1: rule__CountPreprocessingStep__Group__4 : rule__CountPreprocessingStep__Group__4__Impl ;
    public final void rule__CountPreprocessingStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2508:1: ( rule__CountPreprocessingStep__Group__4__Impl )
            // InternalBiLang.g:2509:2: rule__CountPreprocessingStep__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__Group__4__Impl();

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
    // $ANTLR end "rule__CountPreprocessingStep__Group__4"


    // $ANTLR start "rule__CountPreprocessingStep__Group__4__Impl"
    // InternalBiLang.g:2515:1: rule__CountPreprocessingStep__Group__4__Impl : ( ( rule__CountPreprocessingStep__ReferenceAssignment_4 ) ) ;
    public final void rule__CountPreprocessingStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2519:1: ( ( ( rule__CountPreprocessingStep__ReferenceAssignment_4 ) ) )
            // InternalBiLang.g:2520:1: ( ( rule__CountPreprocessingStep__ReferenceAssignment_4 ) )
            {
            // InternalBiLang.g:2520:1: ( ( rule__CountPreprocessingStep__ReferenceAssignment_4 ) )
            // InternalBiLang.g:2521:2: ( rule__CountPreprocessingStep__ReferenceAssignment_4 )
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getReferenceAssignment_4()); 
            // InternalBiLang.g:2522:2: ( rule__CountPreprocessingStep__ReferenceAssignment_4 )
            // InternalBiLang.g:2522:3: rule__CountPreprocessingStep__ReferenceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CountPreprocessingStep__ReferenceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCountPreprocessingStepAccess().getReferenceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__Group__4__Impl"


    // $ANTLR start "rule__CountQualiStatement__Group__0"
    // InternalBiLang.g:2531:1: rule__CountQualiStatement__Group__0 : rule__CountQualiStatement__Group__0__Impl rule__CountQualiStatement__Group__1 ;
    public final void rule__CountQualiStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2535:1: ( rule__CountQualiStatement__Group__0__Impl rule__CountQualiStatement__Group__1 )
            // InternalBiLang.g:2536:2: rule__CountQualiStatement__Group__0__Impl rule__CountQualiStatement__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CountQualiStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountQualiStatement__Group__1();

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
    // $ANTLR end "rule__CountQualiStatement__Group__0"


    // $ANTLR start "rule__CountQualiStatement__Group__0__Impl"
    // InternalBiLang.g:2543:1: rule__CountQualiStatement__Group__0__Impl : ( ( rule__CountQualiStatement__QualiOperatorAssignment_0 ) ) ;
    public final void rule__CountQualiStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2547:1: ( ( ( rule__CountQualiStatement__QualiOperatorAssignment_0 ) ) )
            // InternalBiLang.g:2548:1: ( ( rule__CountQualiStatement__QualiOperatorAssignment_0 ) )
            {
            // InternalBiLang.g:2548:1: ( ( rule__CountQualiStatement__QualiOperatorAssignment_0 ) )
            // InternalBiLang.g:2549:2: ( rule__CountQualiStatement__QualiOperatorAssignment_0 )
            {
             before(grammarAccess.getCountQualiStatementAccess().getQualiOperatorAssignment_0()); 
            // InternalBiLang.g:2550:2: ( rule__CountQualiStatement__QualiOperatorAssignment_0 )
            // InternalBiLang.g:2550:3: rule__CountQualiStatement__QualiOperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CountQualiStatement__QualiOperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCountQualiStatementAccess().getQualiOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQualiStatement__Group__0__Impl"


    // $ANTLR start "rule__CountQualiStatement__Group__1"
    // InternalBiLang.g:2558:1: rule__CountQualiStatement__Group__1 : rule__CountQualiStatement__Group__1__Impl rule__CountQualiStatement__Group__2 ;
    public final void rule__CountQualiStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2562:1: ( rule__CountQualiStatement__Group__1__Impl rule__CountQualiStatement__Group__2 )
            // InternalBiLang.g:2563:2: rule__CountQualiStatement__Group__1__Impl rule__CountQualiStatement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CountQualiStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountQualiStatement__Group__2();

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
    // $ANTLR end "rule__CountQualiStatement__Group__1"


    // $ANTLR start "rule__CountQualiStatement__Group__1__Impl"
    // InternalBiLang.g:2570:1: rule__CountQualiStatement__Group__1__Impl : ( ( rule__CountQualiStatement__LabelAssignment_1 ) ) ;
    public final void rule__CountQualiStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2574:1: ( ( ( rule__CountQualiStatement__LabelAssignment_1 ) ) )
            // InternalBiLang.g:2575:1: ( ( rule__CountQualiStatement__LabelAssignment_1 ) )
            {
            // InternalBiLang.g:2575:1: ( ( rule__CountQualiStatement__LabelAssignment_1 ) )
            // InternalBiLang.g:2576:2: ( rule__CountQualiStatement__LabelAssignment_1 )
            {
             before(grammarAccess.getCountQualiStatementAccess().getLabelAssignment_1()); 
            // InternalBiLang.g:2577:2: ( rule__CountQualiStatement__LabelAssignment_1 )
            // InternalBiLang.g:2577:3: rule__CountQualiStatement__LabelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CountQualiStatement__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCountQualiStatementAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQualiStatement__Group__1__Impl"


    // $ANTLR start "rule__CountQualiStatement__Group__2"
    // InternalBiLang.g:2585:1: rule__CountQualiStatement__Group__2 : rule__CountQualiStatement__Group__2__Impl rule__CountQualiStatement__Group__3 ;
    public final void rule__CountQualiStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2589:1: ( rule__CountQualiStatement__Group__2__Impl rule__CountQualiStatement__Group__3 )
            // InternalBiLang.g:2590:2: rule__CountQualiStatement__Group__2__Impl rule__CountQualiStatement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CountQualiStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountQualiStatement__Group__3();

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
    // $ANTLR end "rule__CountQualiStatement__Group__2"


    // $ANTLR start "rule__CountQualiStatement__Group__2__Impl"
    // InternalBiLang.g:2597:1: rule__CountQualiStatement__Group__2__Impl : ( '->' ) ;
    public final void rule__CountQualiStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2601:1: ( ( '->' ) )
            // InternalBiLang.g:2602:1: ( '->' )
            {
            // InternalBiLang.g:2602:1: ( '->' )
            // InternalBiLang.g:2603:2: '->'
            {
             before(grammarAccess.getCountQualiStatementAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCountQualiStatementAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQualiStatement__Group__2__Impl"


    // $ANTLR start "rule__CountQualiStatement__Group__3"
    // InternalBiLang.g:2612:1: rule__CountQualiStatement__Group__3 : rule__CountQualiStatement__Group__3__Impl ;
    public final void rule__CountQualiStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2616:1: ( rule__CountQualiStatement__Group__3__Impl )
            // InternalBiLang.g:2617:2: rule__CountQualiStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountQualiStatement__Group__3__Impl();

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
    // $ANTLR end "rule__CountQualiStatement__Group__3"


    // $ANTLR start "rule__CountQualiStatement__Group__3__Impl"
    // InternalBiLang.g:2623:1: rule__CountQualiStatement__Group__3__Impl : ( ( rule__CountQualiStatement__StatementAssignment_3 ) ) ;
    public final void rule__CountQualiStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2627:1: ( ( ( rule__CountQualiStatement__StatementAssignment_3 ) ) )
            // InternalBiLang.g:2628:1: ( ( rule__CountQualiStatement__StatementAssignment_3 ) )
            {
            // InternalBiLang.g:2628:1: ( ( rule__CountQualiStatement__StatementAssignment_3 ) )
            // InternalBiLang.g:2629:2: ( rule__CountQualiStatement__StatementAssignment_3 )
            {
             before(grammarAccess.getCountQualiStatementAccess().getStatementAssignment_3()); 
            // InternalBiLang.g:2630:2: ( rule__CountQualiStatement__StatementAssignment_3 )
            // InternalBiLang.g:2630:3: rule__CountQualiStatement__StatementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CountQualiStatement__StatementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCountQualiStatementAccess().getStatementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQualiStatement__Group__3__Impl"


    // $ANTLR start "rule__CountQuantiStatement__Group__0"
    // InternalBiLang.g:2639:1: rule__CountQuantiStatement__Group__0 : rule__CountQuantiStatement__Group__0__Impl rule__CountQuantiStatement__Group__1 ;
    public final void rule__CountQuantiStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2643:1: ( rule__CountQuantiStatement__Group__0__Impl rule__CountQuantiStatement__Group__1 )
            // InternalBiLang.g:2644:2: rule__CountQuantiStatement__Group__0__Impl rule__CountQuantiStatement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CountQuantiStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group__1();

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
    // $ANTLR end "rule__CountQuantiStatement__Group__0"


    // $ANTLR start "rule__CountQuantiStatement__Group__0__Impl"
    // InternalBiLang.g:2651:1: rule__CountQuantiStatement__Group__0__Impl : ( ( rule__CountQuantiStatement__Alternatives_0 ) ) ;
    public final void rule__CountQuantiStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2655:1: ( ( ( rule__CountQuantiStatement__Alternatives_0 ) ) )
            // InternalBiLang.g:2656:1: ( ( rule__CountQuantiStatement__Alternatives_0 ) )
            {
            // InternalBiLang.g:2656:1: ( ( rule__CountQuantiStatement__Alternatives_0 ) )
            // InternalBiLang.g:2657:2: ( rule__CountQuantiStatement__Alternatives_0 )
            {
             before(grammarAccess.getCountQuantiStatementAccess().getAlternatives_0()); 
            // InternalBiLang.g:2658:2: ( rule__CountQuantiStatement__Alternatives_0 )
            // InternalBiLang.g:2658:3: rule__CountQuantiStatement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCountQuantiStatementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__Group__0__Impl"


    // $ANTLR start "rule__CountQuantiStatement__Group__1"
    // InternalBiLang.g:2666:1: rule__CountQuantiStatement__Group__1 : rule__CountQuantiStatement__Group__1__Impl rule__CountQuantiStatement__Group__2 ;
    public final void rule__CountQuantiStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2670:1: ( rule__CountQuantiStatement__Group__1__Impl rule__CountQuantiStatement__Group__2 )
            // InternalBiLang.g:2671:2: rule__CountQuantiStatement__Group__1__Impl rule__CountQuantiStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CountQuantiStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group__2();

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
    // $ANTLR end "rule__CountQuantiStatement__Group__1"


    // $ANTLR start "rule__CountQuantiStatement__Group__1__Impl"
    // InternalBiLang.g:2678:1: rule__CountQuantiStatement__Group__1__Impl : ( '->' ) ;
    public final void rule__CountQuantiStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2682:1: ( ( '->' ) )
            // InternalBiLang.g:2683:1: ( '->' )
            {
            // InternalBiLang.g:2683:1: ( '->' )
            // InternalBiLang.g:2684:2: '->'
            {
             before(grammarAccess.getCountQuantiStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCountQuantiStatementAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__Group__1__Impl"


    // $ANTLR start "rule__CountQuantiStatement__Group__2"
    // InternalBiLang.g:2693:1: rule__CountQuantiStatement__Group__2 : rule__CountQuantiStatement__Group__2__Impl ;
    public final void rule__CountQuantiStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2697:1: ( rule__CountQuantiStatement__Group__2__Impl )
            // InternalBiLang.g:2698:2: rule__CountQuantiStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group__2__Impl();

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
    // $ANTLR end "rule__CountQuantiStatement__Group__2"


    // $ANTLR start "rule__CountQuantiStatement__Group__2__Impl"
    // InternalBiLang.g:2704:1: rule__CountQuantiStatement__Group__2__Impl : ( ( rule__CountQuantiStatement__StatementAssignment_2 ) ) ;
    public final void rule__CountQuantiStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2708:1: ( ( ( rule__CountQuantiStatement__StatementAssignment_2 ) ) )
            // InternalBiLang.g:2709:1: ( ( rule__CountQuantiStatement__StatementAssignment_2 ) )
            {
            // InternalBiLang.g:2709:1: ( ( rule__CountQuantiStatement__StatementAssignment_2 ) )
            // InternalBiLang.g:2710:2: ( rule__CountQuantiStatement__StatementAssignment_2 )
            {
             before(grammarAccess.getCountQuantiStatementAccess().getStatementAssignment_2()); 
            // InternalBiLang.g:2711:2: ( rule__CountQuantiStatement__StatementAssignment_2 )
            // InternalBiLang.g:2711:3: rule__CountQuantiStatement__StatementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__StatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCountQuantiStatementAccess().getStatementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__Group__2__Impl"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_0__0"
    // InternalBiLang.g:2720:1: rule__CountQuantiStatement__Group_0_0__0 : rule__CountQuantiStatement__Group_0_0__0__Impl rule__CountQuantiStatement__Group_0_0__1 ;
    public final void rule__CountQuantiStatement__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2724:1: ( rule__CountQuantiStatement__Group_0_0__0__Impl rule__CountQuantiStatement__Group_0_0__1 )
            // InternalBiLang.g:2725:2: rule__CountQuantiStatement__Group_0_0__0__Impl rule__CountQuantiStatement__Group_0_0__1
            {
            pushFollow(FOLLOW_22);
            rule__CountQuantiStatement__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group_0_0__1();

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
    // $ANTLR end "rule__CountQuantiStatement__Group_0_0__0"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_0__0__Impl"
    // InternalBiLang.g:2732:1: rule__CountQuantiStatement__Group_0_0__0__Impl : ( ( rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0 ) ) ;
    public final void rule__CountQuantiStatement__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2736:1: ( ( ( rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0 ) ) )
            // InternalBiLang.g:2737:1: ( ( rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0 ) )
            {
            // InternalBiLang.g:2737:1: ( ( rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0 ) )
            // InternalBiLang.g:2738:2: ( rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0 )
            {
             before(grammarAccess.getCountQuantiStatementAccess().getQuantiOperatorAssignment_0_0_0()); 
            // InternalBiLang.g:2739:2: ( rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0 )
            // InternalBiLang.g:2739:3: rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCountQuantiStatementAccess().getQuantiOperatorAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__Group_0_0__0__Impl"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_0__1"
    // InternalBiLang.g:2747:1: rule__CountQuantiStatement__Group_0_0__1 : rule__CountQuantiStatement__Group_0_0__1__Impl ;
    public final void rule__CountQuantiStatement__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2751:1: ( rule__CountQuantiStatement__Group_0_0__1__Impl )
            // InternalBiLang.g:2752:2: rule__CountQuantiStatement__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group_0_0__1__Impl();

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
    // $ANTLR end "rule__CountQuantiStatement__Group_0_0__1"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_0__1__Impl"
    // InternalBiLang.g:2758:1: rule__CountQuantiStatement__Group_0_0__1__Impl : ( ( rule__CountQuantiStatement__RSideAssignment_0_0_1 ) ) ;
    public final void rule__CountQuantiStatement__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2762:1: ( ( ( rule__CountQuantiStatement__RSideAssignment_0_0_1 ) ) )
            // InternalBiLang.g:2763:1: ( ( rule__CountQuantiStatement__RSideAssignment_0_0_1 ) )
            {
            // InternalBiLang.g:2763:1: ( ( rule__CountQuantiStatement__RSideAssignment_0_0_1 ) )
            // InternalBiLang.g:2764:2: ( rule__CountQuantiStatement__RSideAssignment_0_0_1 )
            {
             before(grammarAccess.getCountQuantiStatementAccess().getRSideAssignment_0_0_1()); 
            // InternalBiLang.g:2765:2: ( rule__CountQuantiStatement__RSideAssignment_0_0_1 )
            // InternalBiLang.g:2765:3: rule__CountQuantiStatement__RSideAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__RSideAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCountQuantiStatementAccess().getRSideAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__Group_0_0__1__Impl"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_1__0"
    // InternalBiLang.g:2774:1: rule__CountQuantiStatement__Group_0_1__0 : rule__CountQuantiStatement__Group_0_1__0__Impl rule__CountQuantiStatement__Group_0_1__1 ;
    public final void rule__CountQuantiStatement__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2778:1: ( rule__CountQuantiStatement__Group_0_1__0__Impl rule__CountQuantiStatement__Group_0_1__1 )
            // InternalBiLang.g:2779:2: rule__CountQuantiStatement__Group_0_1__0__Impl rule__CountQuantiStatement__Group_0_1__1
            {
            pushFollow(FOLLOW_23);
            rule__CountQuantiStatement__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group_0_1__1();

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
    // $ANTLR end "rule__CountQuantiStatement__Group_0_1__0"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_1__0__Impl"
    // InternalBiLang.g:2786:1: rule__CountQuantiStatement__Group_0_1__0__Impl : ( ( rule__CountQuantiStatement__LSideAssignment_0_1_0 ) ) ;
    public final void rule__CountQuantiStatement__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2790:1: ( ( ( rule__CountQuantiStatement__LSideAssignment_0_1_0 ) ) )
            // InternalBiLang.g:2791:1: ( ( rule__CountQuantiStatement__LSideAssignment_0_1_0 ) )
            {
            // InternalBiLang.g:2791:1: ( ( rule__CountQuantiStatement__LSideAssignment_0_1_0 ) )
            // InternalBiLang.g:2792:2: ( rule__CountQuantiStatement__LSideAssignment_0_1_0 )
            {
             before(grammarAccess.getCountQuantiStatementAccess().getLSideAssignment_0_1_0()); 
            // InternalBiLang.g:2793:2: ( rule__CountQuantiStatement__LSideAssignment_0_1_0 )
            // InternalBiLang.g:2793:3: rule__CountQuantiStatement__LSideAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__LSideAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCountQuantiStatementAccess().getLSideAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__Group_0_1__0__Impl"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_1__1"
    // InternalBiLang.g:2801:1: rule__CountQuantiStatement__Group_0_1__1 : rule__CountQuantiStatement__Group_0_1__1__Impl rule__CountQuantiStatement__Group_0_1__2 ;
    public final void rule__CountQuantiStatement__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2805:1: ( rule__CountQuantiStatement__Group_0_1__1__Impl rule__CountQuantiStatement__Group_0_1__2 )
            // InternalBiLang.g:2806:2: rule__CountQuantiStatement__Group_0_1__1__Impl rule__CountQuantiStatement__Group_0_1__2
            {
            pushFollow(FOLLOW_22);
            rule__CountQuantiStatement__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group_0_1__2();

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
    // $ANTLR end "rule__CountQuantiStatement__Group_0_1__1"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_1__1__Impl"
    // InternalBiLang.g:2813:1: rule__CountQuantiStatement__Group_0_1__1__Impl : ( ( rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1 ) ) ;
    public final void rule__CountQuantiStatement__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2817:1: ( ( ( rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1 ) ) )
            // InternalBiLang.g:2818:1: ( ( rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1 ) )
            {
            // InternalBiLang.g:2818:1: ( ( rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1 ) )
            // InternalBiLang.g:2819:2: ( rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1 )
            {
             before(grammarAccess.getCountQuantiStatementAccess().getRangeOperatorAssignment_0_1_1()); 
            // InternalBiLang.g:2820:2: ( rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1 )
            // InternalBiLang.g:2820:3: rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCountQuantiStatementAccess().getRangeOperatorAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__Group_0_1__1__Impl"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_1__2"
    // InternalBiLang.g:2828:1: rule__CountQuantiStatement__Group_0_1__2 : rule__CountQuantiStatement__Group_0_1__2__Impl ;
    public final void rule__CountQuantiStatement__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2832:1: ( rule__CountQuantiStatement__Group_0_1__2__Impl )
            // InternalBiLang.g:2833:2: rule__CountQuantiStatement__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__CountQuantiStatement__Group_0_1__2"


    // $ANTLR start "rule__CountQuantiStatement__Group_0_1__2__Impl"
    // InternalBiLang.g:2839:1: rule__CountQuantiStatement__Group_0_1__2__Impl : ( ( rule__CountQuantiStatement__RSideAssignment_0_1_2 ) ) ;
    public final void rule__CountQuantiStatement__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2843:1: ( ( ( rule__CountQuantiStatement__RSideAssignment_0_1_2 ) ) )
            // InternalBiLang.g:2844:1: ( ( rule__CountQuantiStatement__RSideAssignment_0_1_2 ) )
            {
            // InternalBiLang.g:2844:1: ( ( rule__CountQuantiStatement__RSideAssignment_0_1_2 ) )
            // InternalBiLang.g:2845:2: ( rule__CountQuantiStatement__RSideAssignment_0_1_2 )
            {
             before(grammarAccess.getCountQuantiStatementAccess().getRSideAssignment_0_1_2()); 
            // InternalBiLang.g:2846:2: ( rule__CountQuantiStatement__RSideAssignment_0_1_2 )
            // InternalBiLang.g:2846:3: rule__CountQuantiStatement__RSideAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CountQuantiStatement__RSideAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCountQuantiStatementAccess().getRSideAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__Group_0_1__2__Impl"


    // $ANTLR start "rule__DashBoard__Group__0"
    // InternalBiLang.g:2855:1: rule__DashBoard__Group__0 : rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 ;
    public final void rule__DashBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2859:1: ( rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 )
            // InternalBiLang.g:2860:2: rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBiLang.g:2867:1: rule__DashBoard__Group__0__Impl : ( ( rule__DashBoard__NameAssignment_0 ) ) ;
    public final void rule__DashBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2871:1: ( ( ( rule__DashBoard__NameAssignment_0 ) ) )
            // InternalBiLang.g:2872:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            {
            // InternalBiLang.g:2872:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            // InternalBiLang.g:2873:2: ( rule__DashBoard__NameAssignment_0 )
            {
             before(grammarAccess.getDashBoardAccess().getNameAssignment_0()); 
            // InternalBiLang.g:2874:2: ( rule__DashBoard__NameAssignment_0 )
            // InternalBiLang.g:2874:3: rule__DashBoard__NameAssignment_0
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
    // InternalBiLang.g:2882:1: rule__DashBoard__Group__1 : rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 ;
    public final void rule__DashBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2886:1: ( rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 )
            // InternalBiLang.g:2887:2: rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:2894:1: rule__DashBoard__Group__1__Impl : ( '=>' ) ;
    public final void rule__DashBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2898:1: ( ( '=>' ) )
            // InternalBiLang.g:2899:1: ( '=>' )
            {
            // InternalBiLang.g:2899:1: ( '=>' )
            // InternalBiLang.g:2900:2: '=>'
            {
             before(grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBiLang.g:2909:1: rule__DashBoard__Group__2 : rule__DashBoard__Group__2__Impl ;
    public final void rule__DashBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2913:1: ( rule__DashBoard__Group__2__Impl )
            // InternalBiLang.g:2914:2: rule__DashBoard__Group__2__Impl
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
    // InternalBiLang.g:2920:1: rule__DashBoard__Group__2__Impl : ( ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* ) ) ;
    public final void rule__DashBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2924:1: ( ( ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* ) ) )
            // InternalBiLang.g:2925:1: ( ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* ) )
            {
            // InternalBiLang.g:2925:1: ( ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* ) )
            // InternalBiLang.g:2926:2: ( ( rule__DashBoard__Group_2__0 ) ) ( ( rule__DashBoard__Group_2__0 )* )
            {
            // InternalBiLang.g:2926:2: ( ( rule__DashBoard__Group_2__0 ) )
            // InternalBiLang.g:2927:3: ( rule__DashBoard__Group_2__0 )
            {
             before(grammarAccess.getDashBoardAccess().getGroup_2()); 
            // InternalBiLang.g:2928:3: ( rule__DashBoard__Group_2__0 )
            // InternalBiLang.g:2928:4: rule__DashBoard__Group_2__0
            {
            pushFollow(FOLLOW_10);
            rule__DashBoard__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getGroup_2()); 

            }

            // InternalBiLang.g:2931:2: ( ( rule__DashBoard__Group_2__0 )* )
            // InternalBiLang.g:2932:3: ( rule__DashBoard__Group_2__0 )*
            {
             before(grammarAccess.getDashBoardAccess().getGroup_2()); 
            // InternalBiLang.g:2933:3: ( rule__DashBoard__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBiLang.g:2933:4: rule__DashBoard__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DashBoard__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalBiLang.g:2943:1: rule__DashBoard__Group_2__0 : rule__DashBoard__Group_2__0__Impl rule__DashBoard__Group_2__1 ;
    public final void rule__DashBoard__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2947:1: ( rule__DashBoard__Group_2__0__Impl rule__DashBoard__Group_2__1 )
            // InternalBiLang.g:2948:2: rule__DashBoard__Group_2__0__Impl rule__DashBoard__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:2955:1: rule__DashBoard__Group_2__0__Impl : ( ( rule__DashBoard__FileextractorAssignment_2_0 ) ) ;
    public final void rule__DashBoard__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2959:1: ( ( ( rule__DashBoard__FileextractorAssignment_2_0 ) ) )
            // InternalBiLang.g:2960:1: ( ( rule__DashBoard__FileextractorAssignment_2_0 ) )
            {
            // InternalBiLang.g:2960:1: ( ( rule__DashBoard__FileextractorAssignment_2_0 ) )
            // InternalBiLang.g:2961:2: ( rule__DashBoard__FileextractorAssignment_2_0 )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0()); 
            // InternalBiLang.g:2962:2: ( rule__DashBoard__FileextractorAssignment_2_0 )
            // InternalBiLang.g:2962:3: rule__DashBoard__FileextractorAssignment_2_0
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
    // InternalBiLang.g:2970:1: rule__DashBoard__Group_2__1 : rule__DashBoard__Group_2__1__Impl rule__DashBoard__Group_2__2 ;
    public final void rule__DashBoard__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2974:1: ( rule__DashBoard__Group_2__1__Impl rule__DashBoard__Group_2__2 )
            // InternalBiLang.g:2975:2: rule__DashBoard__Group_2__1__Impl rule__DashBoard__Group_2__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalBiLang.g:2982:1: rule__DashBoard__Group_2__1__Impl : ( 'plots' ) ;
    public final void rule__DashBoard__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2986:1: ( ( 'plots' ) )
            // InternalBiLang.g:2987:1: ( 'plots' )
            {
            // InternalBiLang.g:2987:1: ( 'plots' )
            // InternalBiLang.g:2988:2: 'plots'
            {
             before(grammarAccess.getDashBoardAccess().getPlotsKeyword_2_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBiLang.g:2997:1: rule__DashBoard__Group_2__2 : rule__DashBoard__Group_2__2__Impl rule__DashBoard__Group_2__3 ;
    public final void rule__DashBoard__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3001:1: ( rule__DashBoard__Group_2__2__Impl rule__DashBoard__Group_2__3 )
            // InternalBiLang.g:3002:2: rule__DashBoard__Group_2__2__Impl rule__DashBoard__Group_2__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:3009:1: rule__DashBoard__Group_2__2__Impl : ( '{' ) ;
    public final void rule__DashBoard__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3013:1: ( ( '{' ) )
            // InternalBiLang.g:3014:1: ( '{' )
            {
            // InternalBiLang.g:3014:1: ( '{' )
            // InternalBiLang.g:3015:2: '{'
            {
             before(grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBiLang.g:3024:1: rule__DashBoard__Group_2__3 : rule__DashBoard__Group_2__3__Impl rule__DashBoard__Group_2__4 ;
    public final void rule__DashBoard__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3028:1: ( rule__DashBoard__Group_2__3__Impl rule__DashBoard__Group_2__4 )
            // InternalBiLang.g:3029:2: rule__DashBoard__Group_2__3__Impl rule__DashBoard__Group_2__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalBiLang.g:3036:1: rule__DashBoard__Group_2__3__Impl : ( ( rule__DashBoard__PlotAssignment_2_3 ) ) ;
    public final void rule__DashBoard__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3040:1: ( ( ( rule__DashBoard__PlotAssignment_2_3 ) ) )
            // InternalBiLang.g:3041:1: ( ( rule__DashBoard__PlotAssignment_2_3 ) )
            {
            // InternalBiLang.g:3041:1: ( ( rule__DashBoard__PlotAssignment_2_3 ) )
            // InternalBiLang.g:3042:2: ( rule__DashBoard__PlotAssignment_2_3 )
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_2_3()); 
            // InternalBiLang.g:3043:2: ( rule__DashBoard__PlotAssignment_2_3 )
            // InternalBiLang.g:3043:3: rule__DashBoard__PlotAssignment_2_3
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
    // InternalBiLang.g:3051:1: rule__DashBoard__Group_2__4 : rule__DashBoard__Group_2__4__Impl rule__DashBoard__Group_2__5 ;
    public final void rule__DashBoard__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3055:1: ( rule__DashBoard__Group_2__4__Impl rule__DashBoard__Group_2__5 )
            // InternalBiLang.g:3056:2: rule__DashBoard__Group_2__4__Impl rule__DashBoard__Group_2__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalBiLang.g:3063:1: rule__DashBoard__Group_2__4__Impl : ( ( rule__DashBoard__PlotAssignment_2_4 )* ) ;
    public final void rule__DashBoard__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3067:1: ( ( ( rule__DashBoard__PlotAssignment_2_4 )* ) )
            // InternalBiLang.g:3068:1: ( ( rule__DashBoard__PlotAssignment_2_4 )* )
            {
            // InternalBiLang.g:3068:1: ( ( rule__DashBoard__PlotAssignment_2_4 )* )
            // InternalBiLang.g:3069:2: ( rule__DashBoard__PlotAssignment_2_4 )*
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_2_4()); 
            // InternalBiLang.g:3070:2: ( rule__DashBoard__PlotAssignment_2_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==51||(LA32_0>=57 && LA32_0<=58)||(LA32_0>=60 && LA32_0<=63)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalBiLang.g:3070:3: rule__DashBoard__PlotAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__DashBoard__PlotAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalBiLang.g:3078:1: rule__DashBoard__Group_2__5 : rule__DashBoard__Group_2__5__Impl ;
    public final void rule__DashBoard__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3082:1: ( rule__DashBoard__Group_2__5__Impl )
            // InternalBiLang.g:3083:2: rule__DashBoard__Group_2__5__Impl
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
    // InternalBiLang.g:3089:1: rule__DashBoard__Group_2__5__Impl : ( '}' ) ;
    public final void rule__DashBoard__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3093:1: ( ( '}' ) )
            // InternalBiLang.g:3094:1: ( '}' )
            {
            // InternalBiLang.g:3094:1: ( '}' )
            // InternalBiLang.g:3095:2: '}'
            {
             before(grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_2_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBiLang.g:3105:1: rule__NullReplacement__Group__0 : rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1 ;
    public final void rule__NullReplacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3109:1: ( rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1 )
            // InternalBiLang.g:3110:2: rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalBiLang.g:3117:1: rule__NullReplacement__Group__0__Impl : ( ( rule__NullReplacement__ColNameAssignment_0 ) ) ;
    public final void rule__NullReplacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3121:1: ( ( ( rule__NullReplacement__ColNameAssignment_0 ) ) )
            // InternalBiLang.g:3122:1: ( ( rule__NullReplacement__ColNameAssignment_0 ) )
            {
            // InternalBiLang.g:3122:1: ( ( rule__NullReplacement__ColNameAssignment_0 ) )
            // InternalBiLang.g:3123:2: ( rule__NullReplacement__ColNameAssignment_0 )
            {
             before(grammarAccess.getNullReplacementAccess().getColNameAssignment_0()); 
            // InternalBiLang.g:3124:2: ( rule__NullReplacement__ColNameAssignment_0 )
            // InternalBiLang.g:3124:3: rule__NullReplacement__ColNameAssignment_0
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
    // InternalBiLang.g:3132:1: rule__NullReplacement__Group__1 : rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2 ;
    public final void rule__NullReplacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3136:1: ( rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2 )
            // InternalBiLang.g:3137:2: rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2
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
    // InternalBiLang.g:3144:1: rule__NullReplacement__Group__1__Impl : ( '=' ) ;
    public final void rule__NullReplacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3148:1: ( ( '=' ) )
            // InternalBiLang.g:3149:1: ( '=' )
            {
            // InternalBiLang.g:3149:1: ( '=' )
            // InternalBiLang.g:3150:2: '='
            {
             before(grammarAccess.getNullReplacementAccess().getEqualsSignKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBiLang.g:3159:1: rule__NullReplacement__Group__2 : rule__NullReplacement__Group__2__Impl ;
    public final void rule__NullReplacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3163:1: ( rule__NullReplacement__Group__2__Impl )
            // InternalBiLang.g:3164:2: rule__NullReplacement__Group__2__Impl
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
    // InternalBiLang.g:3170:1: rule__NullReplacement__Group__2__Impl : ( ( rule__NullReplacement__Alternatives_2 ) ) ;
    public final void rule__NullReplacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3174:1: ( ( ( rule__NullReplacement__Alternatives_2 ) ) )
            // InternalBiLang.g:3175:1: ( ( rule__NullReplacement__Alternatives_2 ) )
            {
            // InternalBiLang.g:3175:1: ( ( rule__NullReplacement__Alternatives_2 ) )
            // InternalBiLang.g:3176:2: ( rule__NullReplacement__Alternatives_2 )
            {
             before(grammarAccess.getNullReplacementAccess().getAlternatives_2()); 
            // InternalBiLang.g:3177:2: ( rule__NullReplacement__Alternatives_2 )
            // InternalBiLang.g:3177:3: rule__NullReplacement__Alternatives_2
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
    // InternalBiLang.g:3186:1: rule__QuantitativeFiltering__Group__0 : rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 ;
    public final void rule__QuantitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3190:1: ( rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 )
            // InternalBiLang.g:3191:2: rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:3198:1: rule__QuantitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QuantitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3202:1: ( ( () ) )
            // InternalBiLang.g:3203:1: ( () )
            {
            // InternalBiLang.g:3203:1: ( () )
            // InternalBiLang.g:3204:2: ()
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0()); 
            // InternalBiLang.g:3205:2: ()
            // InternalBiLang.g:3205:3: 
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
    // InternalBiLang.g:3213:1: rule__QuantitativeFiltering__Group__1 : rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 ;
    public final void rule__QuantitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3217:1: ( rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 )
            // InternalBiLang.g:3218:2: rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalBiLang.g:3225:1: rule__QuantitativeFiltering__Group__1__Impl : ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QuantitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3229:1: ( ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:3230:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:3230:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:3231:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:3232:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:3232:3: rule__QuantitativeFiltering__AxisAssignment_1
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
    // InternalBiLang.g:3240:1: rule__QuantitativeFiltering__Group__2 : rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 ;
    public final void rule__QuantitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3244:1: ( rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 )
            // InternalBiLang.g:3245:2: rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:3252:1: rule__QuantitativeFiltering__Group__2__Impl : ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QuantitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3256:1: ( ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:3257:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:3257:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:3258:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:3259:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:3259:3: rule__QuantitativeFiltering__OperatorAssignment_2
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
    // InternalBiLang.g:3267:1: rule__QuantitativeFiltering__Group__3 : rule__QuantitativeFiltering__Group__3__Impl ;
    public final void rule__QuantitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3271:1: ( rule__QuantitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:3272:2: rule__QuantitativeFiltering__Group__3__Impl
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
    // InternalBiLang.g:3278:1: rule__QuantitativeFiltering__Group__3__Impl : ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) ;
    public final void rule__QuantitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3282:1: ( ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) )
            // InternalBiLang.g:3283:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            {
            // InternalBiLang.g:3283:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            // InternalBiLang.g:3284:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_3()); 
            // InternalBiLang.g:3285:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            // InternalBiLang.g:3285:3: rule__QuantitativeFiltering__ValuesAssignment_3
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
    // InternalBiLang.g:3294:1: rule__QualitativeFiltering__Group__0 : rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 ;
    public final void rule__QualitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3298:1: ( rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 )
            // InternalBiLang.g:3299:2: rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:3306:1: rule__QualitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QualitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3310:1: ( ( () ) )
            // InternalBiLang.g:3311:1: ( () )
            {
            // InternalBiLang.g:3311:1: ( () )
            // InternalBiLang.g:3312:2: ()
            {
             before(grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0()); 
            // InternalBiLang.g:3313:2: ()
            // InternalBiLang.g:3313:3: 
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
    // InternalBiLang.g:3321:1: rule__QualitativeFiltering__Group__1 : rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 ;
    public final void rule__QualitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3325:1: ( rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 )
            // InternalBiLang.g:3326:2: rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalBiLang.g:3333:1: rule__QualitativeFiltering__Group__1__Impl : ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QualitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3337:1: ( ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:3338:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:3338:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:3339:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:3340:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:3340:3: rule__QualitativeFiltering__AxisAssignment_1
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
    // InternalBiLang.g:3348:1: rule__QualitativeFiltering__Group__2 : rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 ;
    public final void rule__QualitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3352:1: ( rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 )
            // InternalBiLang.g:3353:2: rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:3360:1: rule__QualitativeFiltering__Group__2__Impl : ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QualitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3364:1: ( ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:3365:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:3365:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:3366:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:3367:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:3367:3: rule__QualitativeFiltering__OperatorAssignment_2
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
    // InternalBiLang.g:3375:1: rule__QualitativeFiltering__Group__3 : rule__QualitativeFiltering__Group__3__Impl ;
    public final void rule__QualitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3379:1: ( rule__QualitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:3380:2: rule__QualitativeFiltering__Group__3__Impl
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
    // InternalBiLang.g:3386:1: rule__QualitativeFiltering__Group__3__Impl : ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) ;
    public final void rule__QualitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3390:1: ( ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) )
            // InternalBiLang.g:3391:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            {
            // InternalBiLang.g:3391:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            // InternalBiLang.g:3392:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_3()); 
            // InternalBiLang.g:3393:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            // InternalBiLang.g:3393:3: rule__QualitativeFiltering__LabelsAssignment_3
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
    // InternalBiLang.g:3402:1: rule__MathOperation__Group__0 : rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 ;
    public final void rule__MathOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3406:1: ( rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 )
            // InternalBiLang.g:3407:2: rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBiLang.g:3414:1: rule__MathOperation__Group__0__Impl : ( ( rule__MathOperation__Group_0__0 )? ) ;
    public final void rule__MathOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3418:1: ( ( ( rule__MathOperation__Group_0__0 )? ) )
            // InternalBiLang.g:3419:1: ( ( rule__MathOperation__Group_0__0 )? )
            {
            // InternalBiLang.g:3419:1: ( ( rule__MathOperation__Group_0__0 )? )
            // InternalBiLang.g:3420:2: ( rule__MathOperation__Group_0__0 )?
            {
             before(grammarAccess.getMathOperationAccess().getGroup_0()); 
            // InternalBiLang.g:3421:2: ( rule__MathOperation__Group_0__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:3421:3: rule__MathOperation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MathOperation__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMathOperationAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalBiLang.g:3429:1: rule__MathOperation__Group__1 : rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 ;
    public final void rule__MathOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3433:1: ( rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 )
            // InternalBiLang.g:3434:2: rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalBiLang.g:3441:1: rule__MathOperation__Group__1__Impl : ( ( '(' )? ) ;
    public final void rule__MathOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3445:1: ( ( ( '(' )? ) )
            // InternalBiLang.g:3446:1: ( ( '(' )? )
            {
            // InternalBiLang.g:3446:1: ( ( '(' )? )
            // InternalBiLang.g:3447:2: ( '(' )?
            {
             before(grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_1()); 
            // InternalBiLang.g:3448:2: ( '(' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:3448:3: '('
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // InternalBiLang.g:3456:1: rule__MathOperation__Group__2 : rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 ;
    public final void rule__MathOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3460:1: ( rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 )
            // InternalBiLang.g:3461:2: rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalBiLang.g:3468:1: rule__MathOperation__Group__2__Impl : ( 'l' ) ;
    public final void rule__MathOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3472:1: ( ( 'l' ) )
            // InternalBiLang.g:3473:1: ( 'l' )
            {
            // InternalBiLang.g:3473:1: ( 'l' )
            // InternalBiLang.g:3474:2: 'l'
            {
             before(grammarAccess.getMathOperationAccess().getLKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMathOperationAccess().getLKeyword_2()); 

            }


            }

        }
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
    // InternalBiLang.g:3483:1: rule__MathOperation__Group__3 : rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 ;
    public final void rule__MathOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3487:1: ( rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 )
            // InternalBiLang.g:3488:2: rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalBiLang.g:3495:1: rule__MathOperation__Group__3__Impl : ( ( rule__MathOperation__LsideAssignment_3 ) ) ;
    public final void rule__MathOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3499:1: ( ( ( rule__MathOperation__LsideAssignment_3 ) ) )
            // InternalBiLang.g:3500:1: ( ( rule__MathOperation__LsideAssignment_3 ) )
            {
            // InternalBiLang.g:3500:1: ( ( rule__MathOperation__LsideAssignment_3 ) )
            // InternalBiLang.g:3501:2: ( rule__MathOperation__LsideAssignment_3 )
            {
             before(grammarAccess.getMathOperationAccess().getLsideAssignment_3()); 
            // InternalBiLang.g:3502:2: ( rule__MathOperation__LsideAssignment_3 )
            // InternalBiLang.g:3502:3: rule__MathOperation__LsideAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__LsideAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getLsideAssignment_3()); 

            }


            }

        }
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
    // InternalBiLang.g:3510:1: rule__MathOperation__Group__4 : rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 ;
    public final void rule__MathOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3514:1: ( rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 )
            // InternalBiLang.g:3515:2: rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:3522:1: rule__MathOperation__Group__4__Impl : ( ( rule__MathOperation__OperatorAssignment_4 ) ) ;
    public final void rule__MathOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3526:1: ( ( ( rule__MathOperation__OperatorAssignment_4 ) ) )
            // InternalBiLang.g:3527:1: ( ( rule__MathOperation__OperatorAssignment_4 ) )
            {
            // InternalBiLang.g:3527:1: ( ( rule__MathOperation__OperatorAssignment_4 ) )
            // InternalBiLang.g:3528:2: ( rule__MathOperation__OperatorAssignment_4 )
            {
             before(grammarAccess.getMathOperationAccess().getOperatorAssignment_4()); 
            // InternalBiLang.g:3529:2: ( rule__MathOperation__OperatorAssignment_4 )
            // InternalBiLang.g:3529:3: rule__MathOperation__OperatorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__OperatorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getOperatorAssignment_4()); 

            }


            }

        }
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
    // InternalBiLang.g:3537:1: rule__MathOperation__Group__5 : rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 ;
    public final void rule__MathOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3541:1: ( rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 )
            // InternalBiLang.g:3542:2: rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalBiLang.g:3549:1: rule__MathOperation__Group__5__Impl : ( 'r' ) ;
    public final void rule__MathOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3553:1: ( ( 'r' ) )
            // InternalBiLang.g:3554:1: ( 'r' )
            {
            // InternalBiLang.g:3554:1: ( 'r' )
            // InternalBiLang.g:3555:2: 'r'
            {
             before(grammarAccess.getMathOperationAccess().getRKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMathOperationAccess().getRKeyword_5()); 

            }


            }

        }
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
    // InternalBiLang.g:3564:1: rule__MathOperation__Group__6 : rule__MathOperation__Group__6__Impl rule__MathOperation__Group__7 ;
    public final void rule__MathOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3568:1: ( rule__MathOperation__Group__6__Impl rule__MathOperation__Group__7 )
            // InternalBiLang.g:3569:2: rule__MathOperation__Group__6__Impl rule__MathOperation__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__MathOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__7();

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
    // InternalBiLang.g:3576:1: rule__MathOperation__Group__6__Impl : ( ( rule__MathOperation__RsideAssignment_6 ) ) ;
    public final void rule__MathOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3580:1: ( ( ( rule__MathOperation__RsideAssignment_6 ) ) )
            // InternalBiLang.g:3581:1: ( ( rule__MathOperation__RsideAssignment_6 ) )
            {
            // InternalBiLang.g:3581:1: ( ( rule__MathOperation__RsideAssignment_6 ) )
            // InternalBiLang.g:3582:2: ( rule__MathOperation__RsideAssignment_6 )
            {
             before(grammarAccess.getMathOperationAccess().getRsideAssignment_6()); 
            // InternalBiLang.g:3583:2: ( rule__MathOperation__RsideAssignment_6 )
            // InternalBiLang.g:3583:3: rule__MathOperation__RsideAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__RsideAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getRsideAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__MathOperation__Group__7"
    // InternalBiLang.g:3591:1: rule__MathOperation__Group__7 : rule__MathOperation__Group__7__Impl ;
    public final void rule__MathOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3595:1: ( rule__MathOperation__Group__7__Impl )
            // InternalBiLang.g:3596:2: rule__MathOperation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__7__Impl();

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
    // $ANTLR end "rule__MathOperation__Group__7"


    // $ANTLR start "rule__MathOperation__Group__7__Impl"
    // InternalBiLang.g:3602:1: rule__MathOperation__Group__7__Impl : ( ( ')' )? ) ;
    public final void rule__MathOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3606:1: ( ( ( ')' )? ) )
            // InternalBiLang.g:3607:1: ( ( ')' )? )
            {
            // InternalBiLang.g:3607:1: ( ( ')' )? )
            // InternalBiLang.g:3608:2: ( ')' )?
            {
             before(grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_7()); 
            // InternalBiLang.g:3609:2: ( ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:3609:3: ')'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__Group__7__Impl"


    // $ANTLR start "rule__MathOperation__Group_0__0"
    // InternalBiLang.g:3618:1: rule__MathOperation__Group_0__0 : rule__MathOperation__Group_0__0__Impl rule__MathOperation__Group_0__1 ;
    public final void rule__MathOperation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3622:1: ( rule__MathOperation__Group_0__0__Impl rule__MathOperation__Group_0__1 )
            // InternalBiLang.g:3623:2: rule__MathOperation__Group_0__0__Impl rule__MathOperation__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__MathOperation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathOperation__Group_0__1();

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
    // $ANTLR end "rule__MathOperation__Group_0__0"


    // $ANTLR start "rule__MathOperation__Group_0__0__Impl"
    // InternalBiLang.g:3630:1: rule__MathOperation__Group_0__0__Impl : ( ( rule__MathOperation__NewColNameAssignment_0_0 ) ) ;
    public final void rule__MathOperation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3634:1: ( ( ( rule__MathOperation__NewColNameAssignment_0_0 ) ) )
            // InternalBiLang.g:3635:1: ( ( rule__MathOperation__NewColNameAssignment_0_0 ) )
            {
            // InternalBiLang.g:3635:1: ( ( rule__MathOperation__NewColNameAssignment_0_0 ) )
            // InternalBiLang.g:3636:2: ( rule__MathOperation__NewColNameAssignment_0_0 )
            {
             before(grammarAccess.getMathOperationAccess().getNewColNameAssignment_0_0()); 
            // InternalBiLang.g:3637:2: ( rule__MathOperation__NewColNameAssignment_0_0 )
            // InternalBiLang.g:3637:3: rule__MathOperation__NewColNameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__NewColNameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getNewColNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__Group_0__0__Impl"


    // $ANTLR start "rule__MathOperation__Group_0__1"
    // InternalBiLang.g:3645:1: rule__MathOperation__Group_0__1 : rule__MathOperation__Group_0__1__Impl ;
    public final void rule__MathOperation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3649:1: ( rule__MathOperation__Group_0__1__Impl )
            // InternalBiLang.g:3650:2: rule__MathOperation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__Group_0__1__Impl();

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
    // $ANTLR end "rule__MathOperation__Group_0__1"


    // $ANTLR start "rule__MathOperation__Group_0__1__Impl"
    // InternalBiLang.g:3656:1: rule__MathOperation__Group_0__1__Impl : ( '=' ) ;
    public final void rule__MathOperation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3660:1: ( ( '=' ) )
            // InternalBiLang.g:3661:1: ( '=' )
            {
            // InternalBiLang.g:3661:1: ( '=' )
            // InternalBiLang.g:3662:2: '='
            {
             before(grammarAccess.getMathOperationAccess().getEqualsSignKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMathOperationAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__Group_0__1__Impl"


    // $ANTLR start "rule__ColReference__Group__0"
    // InternalBiLang.g:3672:1: rule__ColReference__Group__0 : rule__ColReference__Group__0__Impl rule__ColReference__Group__1 ;
    public final void rule__ColReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3676:1: ( rule__ColReference__Group__0__Impl rule__ColReference__Group__1 )
            // InternalBiLang.g:3677:2: rule__ColReference__Group__0__Impl rule__ColReference__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:3684:1: rule__ColReference__Group__0__Impl : ( () ) ;
    public final void rule__ColReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3688:1: ( ( () ) )
            // InternalBiLang.g:3689:1: ( () )
            {
            // InternalBiLang.g:3689:1: ( () )
            // InternalBiLang.g:3690:2: ()
            {
             before(grammarAccess.getColReferenceAccess().getColReferenceAction_0()); 
            // InternalBiLang.g:3691:2: ()
            // InternalBiLang.g:3691:3: 
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
    // InternalBiLang.g:3699:1: rule__ColReference__Group__1 : rule__ColReference__Group__1__Impl ;
    public final void rule__ColReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3703:1: ( rule__ColReference__Group__1__Impl )
            // InternalBiLang.g:3704:2: rule__ColReference__Group__1__Impl
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
    // InternalBiLang.g:3710:1: rule__ColReference__Group__1__Impl : ( ( rule__ColReference__TargetAssignment_1 ) ) ;
    public final void rule__ColReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3714:1: ( ( ( rule__ColReference__TargetAssignment_1 ) ) )
            // InternalBiLang.g:3715:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            {
            // InternalBiLang.g:3715:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            // InternalBiLang.g:3716:2: ( rule__ColReference__TargetAssignment_1 )
            {
             before(grammarAccess.getColReferenceAccess().getTargetAssignment_1()); 
            // InternalBiLang.g:3717:2: ( rule__ColReference__TargetAssignment_1 )
            // InternalBiLang.g:3717:3: rule__ColReference__TargetAssignment_1
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
    // InternalBiLang.g:3726:1: rule__StatisticalOperation__Group__0 : rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 ;
    public final void rule__StatisticalOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3730:1: ( rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 )
            // InternalBiLang.g:3731:2: rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:3738:1: rule__StatisticalOperation__Group__0__Impl : ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) ;
    public final void rule__StatisticalOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3742:1: ( ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) )
            // InternalBiLang.g:3743:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            {
            // InternalBiLang.g:3743:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            // InternalBiLang.g:3744:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getOperatorAssignment_0()); 
            // InternalBiLang.g:3745:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            // InternalBiLang.g:3745:3: rule__StatisticalOperation__OperatorAssignment_0
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
    // InternalBiLang.g:3753:1: rule__StatisticalOperation__Group__1 : rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 ;
    public final void rule__StatisticalOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3757:1: ( rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 )
            // InternalBiLang.g:3758:2: rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:3765:1: rule__StatisticalOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__StatisticalOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3769:1: ( ( '(' ) )
            // InternalBiLang.g:3770:1: ( '(' )
            {
            // InternalBiLang.g:3770:1: ( '(' )
            // InternalBiLang.g:3771:2: '('
            {
             before(grammarAccess.getStatisticalOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:3780:1: rule__StatisticalOperation__Group__2 : rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 ;
    public final void rule__StatisticalOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3784:1: ( rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 )
            // InternalBiLang.g:3785:2: rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:3792:1: rule__StatisticalOperation__Group__2__Impl : ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) ;
    public final void rule__StatisticalOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3796:1: ( ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) )
            // InternalBiLang.g:3797:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            {
            // InternalBiLang.g:3797:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            // InternalBiLang.g:3798:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getColreferenceAssignment_2()); 
            // InternalBiLang.g:3799:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            // InternalBiLang.g:3799:3: rule__StatisticalOperation__ColreferenceAssignment_2
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
    // InternalBiLang.g:3807:1: rule__StatisticalOperation__Group__3 : rule__StatisticalOperation__Group__3__Impl ;
    public final void rule__StatisticalOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3811:1: ( rule__StatisticalOperation__Group__3__Impl )
            // InternalBiLang.g:3812:2: rule__StatisticalOperation__Group__3__Impl
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
    // InternalBiLang.g:3818:1: rule__StatisticalOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__StatisticalOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3822:1: ( ( ')' ) )
            // InternalBiLang.g:3823:1: ( ')' )
            {
            // InternalBiLang.g:3823:1: ( ')' )
            // InternalBiLang.g:3824:2: ')'
            {
             before(grammarAccess.getStatisticalOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:3834:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3838:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalBiLang.g:3839:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:3846:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3850:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3851:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3851:1: ( ( '-' )? )
            // InternalBiLang.g:3852:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:3853:2: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:3853:3: '-'
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
    // InternalBiLang.g:3861:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3865:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalBiLang.g:3866:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:3873:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3877:1: ( ( ( RULE_INT )? ) )
            // InternalBiLang.g:3878:1: ( ( RULE_INT )? )
            {
            // InternalBiLang.g:3878:1: ( ( RULE_INT )? )
            // InternalBiLang.g:3879:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalBiLang.g:3880:2: ( RULE_INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:3880:3: RULE_INT
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
    // InternalBiLang.g:3888:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3892:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalBiLang.g:3893:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:3900:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3904:1: ( ( '.' ) )
            // InternalBiLang.g:3905:1: ( '.' )
            {
            // InternalBiLang.g:3905:1: ( '.' )
            // InternalBiLang.g:3906:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:3915:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3919:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalBiLang.g:3920:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:3927:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3931:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3932:1: ( RULE_INT )
            {
            // InternalBiLang.g:3932:1: ( RULE_INT )
            // InternalBiLang.g:3933:2: RULE_INT
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
    // InternalBiLang.g:3942:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3946:1: ( rule__EFloat__Group__4__Impl )
            // InternalBiLang.g:3947:2: rule__EFloat__Group__4__Impl
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
    // InternalBiLang.g:3953:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3957:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalBiLang.g:3958:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalBiLang.g:3958:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalBiLang.g:3959:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalBiLang.g:3960:2: ( rule__EFloat__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=11 && LA38_0<=12)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:3960:3: rule__EFloat__Group_4__0
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
    // InternalBiLang.g:3969:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3973:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalBiLang.g:3974:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3981:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3985:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalBiLang.g:3986:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalBiLang.g:3986:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalBiLang.g:3987:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalBiLang.g:3988:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalBiLang.g:3988:3: rule__EFloat__Alternatives_4_0
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
    // InternalBiLang.g:3996:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4000:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalBiLang.g:4001:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4008:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4012:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:4013:1: ( ( '-' )? )
            {
            // InternalBiLang.g:4013:1: ( ( '-' )? )
            // InternalBiLang.g:4014:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBiLang.g:4015:2: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:4015:3: '-'
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
    // InternalBiLang.g:4023:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4027:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalBiLang.g:4028:2: rule__EFloat__Group_4__2__Impl
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
    // InternalBiLang.g:4034:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4038:1: ( ( RULE_INT ) )
            // InternalBiLang.g:4039:1: ( RULE_INT )
            {
            // InternalBiLang.g:4039:1: ( RULE_INT )
            // InternalBiLang.g:4040:2: RULE_INT
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
    // InternalBiLang.g:4050:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4054:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBiLang.g:4055:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:4062:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4066:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:4067:1: ( ( '-' )? )
            {
            // InternalBiLang.g:4067:1: ( ( '-' )? )
            // InternalBiLang.g:4068:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:4069:2: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:4069:3: '-'
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
    // InternalBiLang.g:4077:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4081:1: ( rule__EInt__Group__1__Impl )
            // InternalBiLang.g:4082:2: rule__EInt__Group__1__Impl
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
    // InternalBiLang.g:4088:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4092:1: ( ( RULE_INT ) )
            // InternalBiLang.g:4093:1: ( RULE_INT )
            {
            // InternalBiLang.g:4093:1: ( RULE_INT )
            // InternalBiLang.g:4094:2: RULE_INT
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
    // InternalBiLang.g:4104:1: rule__BarPlot__Group__0 : rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 ;
    public final void rule__BarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4108:1: ( rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 )
            // InternalBiLang.g:4109:2: rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:4116:1: rule__BarPlot__Group__0__Impl : ( () ) ;
    public final void rule__BarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4120:1: ( ( () ) )
            // InternalBiLang.g:4121:1: ( () )
            {
            // InternalBiLang.g:4121:1: ( () )
            // InternalBiLang.g:4122:2: ()
            {
             before(grammarAccess.getBarPlotAccess().getBarPlotAction_0()); 
            // InternalBiLang.g:4123:2: ()
            // InternalBiLang.g:4123:3: 
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
    // InternalBiLang.g:4131:1: rule__BarPlot__Group__1 : rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 ;
    public final void rule__BarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4135:1: ( rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 )
            // InternalBiLang.g:4136:2: rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBiLang.g:4143:1: rule__BarPlot__Group__1__Impl : ( 'bar' ) ;
    public final void rule__BarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4147:1: ( ( 'bar' ) )
            // InternalBiLang.g:4148:1: ( 'bar' )
            {
            // InternalBiLang.g:4148:1: ( 'bar' )
            // InternalBiLang.g:4149:2: 'bar'
            {
             before(grammarAccess.getBarPlotAccess().getBarKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:4158:1: rule__BarPlot__Group__2 : rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 ;
    public final void rule__BarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4162:1: ( rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 )
            // InternalBiLang.g:4163:2: rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:4170:1: rule__BarPlot__Group__2__Impl : ( ( rule__BarPlot__NameAssignment_2 ) ) ;
    public final void rule__BarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4174:1: ( ( ( rule__BarPlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:4175:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:4175:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            // InternalBiLang.g:4176:2: ( rule__BarPlot__NameAssignment_2 )
            {
             before(grammarAccess.getBarPlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:4177:2: ( rule__BarPlot__NameAssignment_2 )
            // InternalBiLang.g:4177:3: rule__BarPlot__NameAssignment_2
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
    // InternalBiLang.g:4185:1: rule__BarPlot__Group__3 : rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 ;
    public final void rule__BarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4189:1: ( rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 )
            // InternalBiLang.g:4190:2: rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalBiLang.g:4197:1: rule__BarPlot__Group__3__Impl : ( '->' ) ;
    public final void rule__BarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4201:1: ( ( '->' ) )
            // InternalBiLang.g:4202:1: ( '->' )
            {
            // InternalBiLang.g:4202:1: ( '->' )
            // InternalBiLang.g:4203:2: '->'
            {
             before(grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBiLang.g:4212:1: rule__BarPlot__Group__4 : rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 ;
    public final void rule__BarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4216:1: ( rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 )
            // InternalBiLang.g:4217:2: rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:4224:1: rule__BarPlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__BarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4228:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4229:1: ( 'xAx' )
            {
            // InternalBiLang.g:4229:1: ( 'xAx' )
            // InternalBiLang.g:4230:2: 'xAx'
            {
             before(grammarAccess.getBarPlotAccess().getXAxKeyword_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBiLang.g:4239:1: rule__BarPlot__Group__5 : rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 ;
    public final void rule__BarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4243:1: ( rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 )
            // InternalBiLang.g:4244:2: rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:4251:1: rule__BarPlot__Group__5__Impl : ( ( rule__BarPlot__XAxisAssignment_5 ) ) ;
    public final void rule__BarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4255:1: ( ( ( rule__BarPlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:4256:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:4256:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:4257:2: ( rule__BarPlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getBarPlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:4258:2: ( rule__BarPlot__XAxisAssignment_5 )
            // InternalBiLang.g:4258:3: rule__BarPlot__XAxisAssignment_5
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
    // InternalBiLang.g:4266:1: rule__BarPlot__Group__6 : rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 ;
    public final void rule__BarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4270:1: ( rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 )
            // InternalBiLang.g:4271:2: rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:4278:1: rule__BarPlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__BarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4282:1: ( ( 'yA' ) )
            // InternalBiLang.g:4283:1: ( 'yA' )
            {
            // InternalBiLang.g:4283:1: ( 'yA' )
            // InternalBiLang.g:4284:2: 'yA'
            {
             before(grammarAccess.getBarPlotAccess().getYAKeyword_6()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBiLang.g:4293:1: rule__BarPlot__Group__7 : rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 ;
    public final void rule__BarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4297:1: ( rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 )
            // InternalBiLang.g:4298:2: rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:4305:1: rule__BarPlot__Group__7__Impl : ( ( rule__BarPlot__YAxisAssignment_7 ) ) ;
    public final void rule__BarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4309:1: ( ( ( rule__BarPlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:4310:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:4310:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:4311:2: ( rule__BarPlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getBarPlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:4312:2: ( rule__BarPlot__YAxisAssignment_7 )
            // InternalBiLang.g:4312:3: rule__BarPlot__YAxisAssignment_7
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
    // InternalBiLang.g:4320:1: rule__BarPlot__Group__8 : rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 ;
    public final void rule__BarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4324:1: ( rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 )
            // InternalBiLang.g:4325:2: rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:4332:1: rule__BarPlot__Group__8__Impl : ( ( rule__BarPlot__Group_8__0 )? ) ;
    public final void rule__BarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4336:1: ( ( ( rule__BarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:4337:1: ( ( rule__BarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4337:1: ( ( rule__BarPlot__Group_8__0 )? )
            // InternalBiLang.g:4338:2: ( rule__BarPlot__Group_8__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:4339:2: ( rule__BarPlot__Group_8__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:4339:3: rule__BarPlot__Group_8__0
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
    // InternalBiLang.g:4347:1: rule__BarPlot__Group__9 : rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 ;
    public final void rule__BarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4351:1: ( rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 )
            // InternalBiLang.g:4352:2: rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:4359:1: rule__BarPlot__Group__9__Impl : ( ( rule__BarPlot__Group_9__0 )? ) ;
    public final void rule__BarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4363:1: ( ( ( rule__BarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:4364:1: ( ( rule__BarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4364:1: ( ( rule__BarPlot__Group_9__0 )? )
            // InternalBiLang.g:4365:2: ( rule__BarPlot__Group_9__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:4366:2: ( rule__BarPlot__Group_9__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:4366:3: rule__BarPlot__Group_9__0
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
    // InternalBiLang.g:4374:1: rule__BarPlot__Group__10 : rule__BarPlot__Group__10__Impl ;
    public final void rule__BarPlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4378:1: ( rule__BarPlot__Group__10__Impl )
            // InternalBiLang.g:4379:2: rule__BarPlot__Group__10__Impl
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
    // InternalBiLang.g:4385:1: rule__BarPlot__Group__10__Impl : ( ( rule__BarPlot__Group_10__0 )? ) ;
    public final void rule__BarPlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4389:1: ( ( ( rule__BarPlot__Group_10__0 )? ) )
            // InternalBiLang.g:4390:1: ( ( rule__BarPlot__Group_10__0 )? )
            {
            // InternalBiLang.g:4390:1: ( ( rule__BarPlot__Group_10__0 )? )
            // InternalBiLang.g:4391:2: ( rule__BarPlot__Group_10__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_10()); 
            // InternalBiLang.g:4392:2: ( rule__BarPlot__Group_10__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:4392:3: rule__BarPlot__Group_10__0
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
    // InternalBiLang.g:4401:1: rule__BarPlot__Group_8__0 : rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 ;
    public final void rule__BarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4405:1: ( rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 )
            // InternalBiLang.g:4406:2: rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4413:1: rule__BarPlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__BarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4417:1: ( ( 'loc' ) )
            // InternalBiLang.g:4418:1: ( 'loc' )
            {
            // InternalBiLang.g:4418:1: ( 'loc' )
            // InternalBiLang.g:4419:2: 'loc'
            {
             before(grammarAccess.getBarPlotAccess().getLocKeyword_8_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBiLang.g:4428:1: rule__BarPlot__Group_8__1 : rule__BarPlot__Group_8__1__Impl ;
    public final void rule__BarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4432:1: ( rule__BarPlot__Group_8__1__Impl )
            // InternalBiLang.g:4433:2: rule__BarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:4439:1: rule__BarPlot__Group_8__1__Impl : ( ( rule__BarPlot__LocationAssignment_8_1 ) ) ;
    public final void rule__BarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4443:1: ( ( ( rule__BarPlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:4444:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:4444:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:4445:2: ( rule__BarPlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getBarPlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:4446:2: ( rule__BarPlot__LocationAssignment_8_1 )
            // InternalBiLang.g:4446:3: rule__BarPlot__LocationAssignment_8_1
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
    // InternalBiLang.g:4455:1: rule__BarPlot__Group_9__0 : rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 ;
    public final void rule__BarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4459:1: ( rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 )
            // InternalBiLang.g:4460:2: rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:4467:1: rule__BarPlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__BarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4471:1: ( ( 'colors' ) )
            // InternalBiLang.g:4472:1: ( 'colors' )
            {
            // InternalBiLang.g:4472:1: ( 'colors' )
            // InternalBiLang.g:4473:2: 'colors'
            {
             before(grammarAccess.getBarPlotAccess().getColorsKeyword_9_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBiLang.g:4482:1: rule__BarPlot__Group_9__1 : rule__BarPlot__Group_9__1__Impl ;
    public final void rule__BarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4486:1: ( rule__BarPlot__Group_9__1__Impl )
            // InternalBiLang.g:4487:2: rule__BarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:4493:1: rule__BarPlot__Group_9__1__Impl : ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__BarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4497:1: ( ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:4498:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:4498:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:4499:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getBarPlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:4500:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:4500:3: rule__BarPlot__ColorsAssignment_9_1
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
    // InternalBiLang.g:4509:1: rule__BarPlot__Group_10__0 : rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 ;
    public final void rule__BarPlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4513:1: ( rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 )
            // InternalBiLang.g:4514:2: rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:4521:1: rule__BarPlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__BarPlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4525:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4526:1: ( 'thickness' )
            {
            // InternalBiLang.g:4526:1: ( 'thickness' )
            // InternalBiLang.g:4527:2: 'thickness'
            {
             before(grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBiLang.g:4536:1: rule__BarPlot__Group_10__1 : rule__BarPlot__Group_10__1__Impl ;
    public final void rule__BarPlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4540:1: ( rule__BarPlot__Group_10__1__Impl )
            // InternalBiLang.g:4541:2: rule__BarPlot__Group_10__1__Impl
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
    // InternalBiLang.g:4547:1: rule__BarPlot__Group_10__1__Impl : ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__BarPlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4551:1: ( ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:4552:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:4552:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:4553:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:4554:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:4554:3: rule__BarPlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:4563:1: rule__LinePlot__Group__0 : rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 ;
    public final void rule__LinePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4567:1: ( rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 )
            // InternalBiLang.g:4568:2: rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalBiLang.g:4575:1: rule__LinePlot__Group__0__Impl : ( () ) ;
    public final void rule__LinePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4579:1: ( ( () ) )
            // InternalBiLang.g:4580:1: ( () )
            {
            // InternalBiLang.g:4580:1: ( () )
            // InternalBiLang.g:4581:2: ()
            {
             before(grammarAccess.getLinePlotAccess().getLinePlotAction_0()); 
            // InternalBiLang.g:4582:2: ()
            // InternalBiLang.g:4582:3: 
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
    // InternalBiLang.g:4590:1: rule__LinePlot__Group__1 : rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 ;
    public final void rule__LinePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4594:1: ( rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 )
            // InternalBiLang.g:4595:2: rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBiLang.g:4602:1: rule__LinePlot__Group__1__Impl : ( 'line' ) ;
    public final void rule__LinePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4606:1: ( ( 'line' ) )
            // InternalBiLang.g:4607:1: ( 'line' )
            {
            // InternalBiLang.g:4607:1: ( 'line' )
            // InternalBiLang.g:4608:2: 'line'
            {
             before(grammarAccess.getLinePlotAccess().getLineKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBiLang.g:4617:1: rule__LinePlot__Group__2 : rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 ;
    public final void rule__LinePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4621:1: ( rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 )
            // InternalBiLang.g:4622:2: rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:4629:1: rule__LinePlot__Group__2__Impl : ( ( rule__LinePlot__NameAssignment_2 ) ) ;
    public final void rule__LinePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4633:1: ( ( ( rule__LinePlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:4634:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:4634:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            // InternalBiLang.g:4635:2: ( rule__LinePlot__NameAssignment_2 )
            {
             before(grammarAccess.getLinePlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:4636:2: ( rule__LinePlot__NameAssignment_2 )
            // InternalBiLang.g:4636:3: rule__LinePlot__NameAssignment_2
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
    // InternalBiLang.g:4644:1: rule__LinePlot__Group__3 : rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 ;
    public final void rule__LinePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4648:1: ( rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 )
            // InternalBiLang.g:4649:2: rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalBiLang.g:4656:1: rule__LinePlot__Group__3__Impl : ( '->' ) ;
    public final void rule__LinePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4660:1: ( ( '->' ) )
            // InternalBiLang.g:4661:1: ( '->' )
            {
            // InternalBiLang.g:4661:1: ( '->' )
            // InternalBiLang.g:4662:2: '->'
            {
             before(grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBiLang.g:4671:1: rule__LinePlot__Group__4 : rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 ;
    public final void rule__LinePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4675:1: ( rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 )
            // InternalBiLang.g:4676:2: rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:4683:1: rule__LinePlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__LinePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4687:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4688:1: ( 'xAx' )
            {
            // InternalBiLang.g:4688:1: ( 'xAx' )
            // InternalBiLang.g:4689:2: 'xAx'
            {
             before(grammarAccess.getLinePlotAccess().getXAxKeyword_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBiLang.g:4698:1: rule__LinePlot__Group__5 : rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 ;
    public final void rule__LinePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4702:1: ( rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 )
            // InternalBiLang.g:4703:2: rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:4710:1: rule__LinePlot__Group__5__Impl : ( ( rule__LinePlot__XAxisAssignment_5 ) ) ;
    public final void rule__LinePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4714:1: ( ( ( rule__LinePlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:4715:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:4715:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:4716:2: ( rule__LinePlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getLinePlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:4717:2: ( rule__LinePlot__XAxisAssignment_5 )
            // InternalBiLang.g:4717:3: rule__LinePlot__XAxisAssignment_5
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
    // InternalBiLang.g:4725:1: rule__LinePlot__Group__6 : rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 ;
    public final void rule__LinePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4729:1: ( rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 )
            // InternalBiLang.g:4730:2: rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:4737:1: rule__LinePlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__LinePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4741:1: ( ( 'yA' ) )
            // InternalBiLang.g:4742:1: ( 'yA' )
            {
            // InternalBiLang.g:4742:1: ( 'yA' )
            // InternalBiLang.g:4743:2: 'yA'
            {
             before(grammarAccess.getLinePlotAccess().getYAKeyword_6()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBiLang.g:4752:1: rule__LinePlot__Group__7 : rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 ;
    public final void rule__LinePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4756:1: ( rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 )
            // InternalBiLang.g:4757:2: rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:4764:1: rule__LinePlot__Group__7__Impl : ( ( rule__LinePlot__YAxisAssignment_7 ) ) ;
    public final void rule__LinePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4768:1: ( ( ( rule__LinePlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:4769:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:4769:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:4770:2: ( rule__LinePlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getLinePlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:4771:2: ( rule__LinePlot__YAxisAssignment_7 )
            // InternalBiLang.g:4771:3: rule__LinePlot__YAxisAssignment_7
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
    // InternalBiLang.g:4779:1: rule__LinePlot__Group__8 : rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 ;
    public final void rule__LinePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4783:1: ( rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 )
            // InternalBiLang.g:4784:2: rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:4791:1: rule__LinePlot__Group__8__Impl : ( ( rule__LinePlot__Group_8__0 )? ) ;
    public final void rule__LinePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4795:1: ( ( ( rule__LinePlot__Group_8__0 )? ) )
            // InternalBiLang.g:4796:1: ( ( rule__LinePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4796:1: ( ( rule__LinePlot__Group_8__0 )? )
            // InternalBiLang.g:4797:2: ( rule__LinePlot__Group_8__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_8()); 
            // InternalBiLang.g:4798:2: ( rule__LinePlot__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==54) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:4798:3: rule__LinePlot__Group_8__0
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
    // InternalBiLang.g:4806:1: rule__LinePlot__Group__9 : rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 ;
    public final void rule__LinePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4810:1: ( rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 )
            // InternalBiLang.g:4811:2: rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:4818:1: rule__LinePlot__Group__9__Impl : ( ( rule__LinePlot__Group_9__0 )? ) ;
    public final void rule__LinePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4822:1: ( ( ( rule__LinePlot__Group_9__0 )? ) )
            // InternalBiLang.g:4823:1: ( ( rule__LinePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4823:1: ( ( rule__LinePlot__Group_9__0 )? )
            // InternalBiLang.g:4824:2: ( rule__LinePlot__Group_9__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_9()); 
            // InternalBiLang.g:4825:2: ( rule__LinePlot__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:4825:3: rule__LinePlot__Group_9__0
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
    // InternalBiLang.g:4833:1: rule__LinePlot__Group__10 : rule__LinePlot__Group__10__Impl ;
    public final void rule__LinePlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4837:1: ( rule__LinePlot__Group__10__Impl )
            // InternalBiLang.g:4838:2: rule__LinePlot__Group__10__Impl
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
    // InternalBiLang.g:4844:1: rule__LinePlot__Group__10__Impl : ( ( rule__LinePlot__Group_10__0 )? ) ;
    public final void rule__LinePlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4848:1: ( ( ( rule__LinePlot__Group_10__0 )? ) )
            // InternalBiLang.g:4849:1: ( ( rule__LinePlot__Group_10__0 )? )
            {
            // InternalBiLang.g:4849:1: ( ( rule__LinePlot__Group_10__0 )? )
            // InternalBiLang.g:4850:2: ( rule__LinePlot__Group_10__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_10()); 
            // InternalBiLang.g:4851:2: ( rule__LinePlot__Group_10__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:4851:3: rule__LinePlot__Group_10__0
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
    // InternalBiLang.g:4860:1: rule__LinePlot__Group_8__0 : rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 ;
    public final void rule__LinePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4864:1: ( rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 )
            // InternalBiLang.g:4865:2: rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4872:1: rule__LinePlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__LinePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4876:1: ( ( 'loc' ) )
            // InternalBiLang.g:4877:1: ( 'loc' )
            {
            // InternalBiLang.g:4877:1: ( 'loc' )
            // InternalBiLang.g:4878:2: 'loc'
            {
             before(grammarAccess.getLinePlotAccess().getLocKeyword_8_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBiLang.g:4887:1: rule__LinePlot__Group_8__1 : rule__LinePlot__Group_8__1__Impl ;
    public final void rule__LinePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4891:1: ( rule__LinePlot__Group_8__1__Impl )
            // InternalBiLang.g:4892:2: rule__LinePlot__Group_8__1__Impl
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
    // InternalBiLang.g:4898:1: rule__LinePlot__Group_8__1__Impl : ( ( rule__LinePlot__LocationAssignment_8_1 ) ) ;
    public final void rule__LinePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4902:1: ( ( ( rule__LinePlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:4903:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:4903:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:4904:2: ( rule__LinePlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:4905:2: ( rule__LinePlot__LocationAssignment_8_1 )
            // InternalBiLang.g:4905:3: rule__LinePlot__LocationAssignment_8_1
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
    // InternalBiLang.g:4914:1: rule__LinePlot__Group_9__0 : rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 ;
    public final void rule__LinePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4918:1: ( rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 )
            // InternalBiLang.g:4919:2: rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:4926:1: rule__LinePlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__LinePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4930:1: ( ( 'colors' ) )
            // InternalBiLang.g:4931:1: ( 'colors' )
            {
            // InternalBiLang.g:4931:1: ( 'colors' )
            // InternalBiLang.g:4932:2: 'colors'
            {
             before(grammarAccess.getLinePlotAccess().getColorsKeyword_9_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBiLang.g:4941:1: rule__LinePlot__Group_9__1 : rule__LinePlot__Group_9__1__Impl ;
    public final void rule__LinePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4945:1: ( rule__LinePlot__Group_9__1__Impl )
            // InternalBiLang.g:4946:2: rule__LinePlot__Group_9__1__Impl
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
    // InternalBiLang.g:4952:1: rule__LinePlot__Group_9__1__Impl : ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__LinePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4956:1: ( ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:4957:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:4957:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:4958:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getLinePlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:4959:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:4959:3: rule__LinePlot__ColorsAssignment_9_1
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
    // InternalBiLang.g:4968:1: rule__LinePlot__Group_10__0 : rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 ;
    public final void rule__LinePlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4972:1: ( rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 )
            // InternalBiLang.g:4973:2: rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:4980:1: rule__LinePlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__LinePlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4984:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4985:1: ( 'thickness' )
            {
            // InternalBiLang.g:4985:1: ( 'thickness' )
            // InternalBiLang.g:4986:2: 'thickness'
            {
             before(grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBiLang.g:4995:1: rule__LinePlot__Group_10__1 : rule__LinePlot__Group_10__1__Impl ;
    public final void rule__LinePlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4999:1: ( rule__LinePlot__Group_10__1__Impl )
            // InternalBiLang.g:5000:2: rule__LinePlot__Group_10__1__Impl
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
    // InternalBiLang.g:5006:1: rule__LinePlot__Group_10__1__Impl : ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__LinePlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5010:1: ( ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:5011:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:5011:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:5012:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:5013:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:5013:3: rule__LinePlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:5022:1: rule__DonutPlot__Group__0 : rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 ;
    public final void rule__DonutPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5026:1: ( rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 )
            // InternalBiLang.g:5027:2: rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBiLang.g:5034:1: rule__DonutPlot__Group__0__Impl : ( 'donut' ) ;
    public final void rule__DonutPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5038:1: ( ( 'donut' ) )
            // InternalBiLang.g:5039:1: ( 'donut' )
            {
            // InternalBiLang.g:5039:1: ( 'donut' )
            // InternalBiLang.g:5040:2: 'donut'
            {
             before(grammarAccess.getDonutPlotAccess().getDonutKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalBiLang.g:5049:1: rule__DonutPlot__Group__1 : rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 ;
    public final void rule__DonutPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5053:1: ( rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 )
            // InternalBiLang.g:5054:2: rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:5061:1: rule__DonutPlot__Group__1__Impl : ( ( rule__DonutPlot__NameAssignment_1 ) ) ;
    public final void rule__DonutPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5065:1: ( ( ( rule__DonutPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5066:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5066:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5067:2: ( rule__DonutPlot__NameAssignment_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5068:2: ( rule__DonutPlot__NameAssignment_1 )
            // InternalBiLang.g:5068:3: rule__DonutPlot__NameAssignment_1
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
    // InternalBiLang.g:5076:1: rule__DonutPlot__Group__2 : rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 ;
    public final void rule__DonutPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5080:1: ( rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 )
            // InternalBiLang.g:5081:2: rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalBiLang.g:5088:1: rule__DonutPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__DonutPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5092:1: ( ( '->' ) )
            // InternalBiLang.g:5093:1: ( '->' )
            {
            // InternalBiLang.g:5093:1: ( '->' )
            // InternalBiLang.g:5094:2: '->'
            {
             before(grammarAccess.getDonutPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBiLang.g:5103:1: rule__DonutPlot__Group__3 : rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 ;
    public final void rule__DonutPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5107:1: ( rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 )
            // InternalBiLang.g:5108:2: rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:5115:1: rule__DonutPlot__Group__3__Impl : ( ( rule__DonutPlot__Alternatives_3 ) ) ;
    public final void rule__DonutPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5119:1: ( ( ( rule__DonutPlot__Alternatives_3 ) ) )
            // InternalBiLang.g:5120:1: ( ( rule__DonutPlot__Alternatives_3 ) )
            {
            // InternalBiLang.g:5120:1: ( ( rule__DonutPlot__Alternatives_3 ) )
            // InternalBiLang.g:5121:2: ( rule__DonutPlot__Alternatives_3 )
            {
             before(grammarAccess.getDonutPlotAccess().getAlternatives_3()); 
            // InternalBiLang.g:5122:2: ( rule__DonutPlot__Alternatives_3 )
            // InternalBiLang.g:5122:3: rule__DonutPlot__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalBiLang.g:5130:1: rule__DonutPlot__Group__4 : rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 ;
    public final void rule__DonutPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5134:1: ( rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 )
            // InternalBiLang.g:5135:2: rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:5142:1: rule__DonutPlot__Group__4__Impl : ( ( rule__DonutPlot__Group_4__0 )? ) ;
    public final void rule__DonutPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5146:1: ( ( ( rule__DonutPlot__Group_4__0 )? ) )
            // InternalBiLang.g:5147:1: ( ( rule__DonutPlot__Group_4__0 )? )
            {
            // InternalBiLang.g:5147:1: ( ( rule__DonutPlot__Group_4__0 )? )
            // InternalBiLang.g:5148:2: ( rule__DonutPlot__Group_4__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_4()); 
            // InternalBiLang.g:5149:2: ( rule__DonutPlot__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBiLang.g:5149:3: rule__DonutPlot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DonutPlot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDonutPlotAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalBiLang.g:5157:1: rule__DonutPlot__Group__5 : rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 ;
    public final void rule__DonutPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5161:1: ( rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 )
            // InternalBiLang.g:5162:2: rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:5169:1: rule__DonutPlot__Group__5__Impl : ( ( rule__DonutPlot__Group_5__0 )? ) ;
    public final void rule__DonutPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5173:1: ( ( ( rule__DonutPlot__Group_5__0 )? ) )
            // InternalBiLang.g:5174:1: ( ( rule__DonutPlot__Group_5__0 )? )
            {
            // InternalBiLang.g:5174:1: ( ( rule__DonutPlot__Group_5__0 )? )
            // InternalBiLang.g:5175:2: ( rule__DonutPlot__Group_5__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_5()); 
            // InternalBiLang.g:5176:2: ( rule__DonutPlot__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==55) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBiLang.g:5176:3: rule__DonutPlot__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DonutPlot__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDonutPlotAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalBiLang.g:5184:1: rule__DonutPlot__Group__6 : rule__DonutPlot__Group__6__Impl ;
    public final void rule__DonutPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5188:1: ( rule__DonutPlot__Group__6__Impl )
            // InternalBiLang.g:5189:2: rule__DonutPlot__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group__6__Impl();

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
    // InternalBiLang.g:5195:1: rule__DonutPlot__Group__6__Impl : ( ( rule__DonutPlot__Group_6__0 )? ) ;
    public final void rule__DonutPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5199:1: ( ( ( rule__DonutPlot__Group_6__0 )? ) )
            // InternalBiLang.g:5200:1: ( ( rule__DonutPlot__Group_6__0 )? )
            {
            // InternalBiLang.g:5200:1: ( ( rule__DonutPlot__Group_6__0 )? )
            // InternalBiLang.g:5201:2: ( rule__DonutPlot__Group_6__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_6()); 
            // InternalBiLang.g:5202:2: ( rule__DonutPlot__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==56) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBiLang.g:5202:3: rule__DonutPlot__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DonutPlot__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDonutPlotAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__DonutPlot__Group_3_0__0"
    // InternalBiLang.g:5211:1: rule__DonutPlot__Group_3_0__0 : rule__DonutPlot__Group_3_0__0__Impl rule__DonutPlot__Group_3_0__1 ;
    public final void rule__DonutPlot__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5215:1: ( rule__DonutPlot__Group_3_0__0__Impl rule__DonutPlot__Group_3_0__1 )
            // InternalBiLang.g:5216:2: rule__DonutPlot__Group_3_0__0__Impl rule__DonutPlot__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__DonutPlot__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_3_0__1();

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
    // $ANTLR end "rule__DonutPlot__Group_3_0__0"


    // $ANTLR start "rule__DonutPlot__Group_3_0__0__Impl"
    // InternalBiLang.g:5223:1: rule__DonutPlot__Group_3_0__0__Impl : ( 'countID' ) ;
    public final void rule__DonutPlot__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5227:1: ( ( 'countID' ) )
            // InternalBiLang.g:5228:1: ( 'countID' )
            {
            // InternalBiLang.g:5228:1: ( 'countID' )
            // InternalBiLang.g:5229:2: 'countID'
            {
             before(grammarAccess.getDonutPlotAccess().getCountIDKeyword_3_0_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getCountIDKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_3_0__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group_3_0__1"
    // InternalBiLang.g:5238:1: rule__DonutPlot__Group_3_0__1 : rule__DonutPlot__Group_3_0__1__Impl ;
    public final void rule__DonutPlot__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5242:1: ( rule__DonutPlot__Group_3_0__1__Impl )
            // InternalBiLang.g:5243:2: rule__DonutPlot__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group_3_0__1"


    // $ANTLR start "rule__DonutPlot__Group_3_0__1__Impl"
    // InternalBiLang.g:5249:1: rule__DonutPlot__Group_3_0__1__Impl : ( ( rule__DonutPlot__CountIDAssignment_3_0_1 ) ) ;
    public final void rule__DonutPlot__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5253:1: ( ( ( rule__DonutPlot__CountIDAssignment_3_0_1 ) ) )
            // InternalBiLang.g:5254:1: ( ( rule__DonutPlot__CountIDAssignment_3_0_1 ) )
            {
            // InternalBiLang.g:5254:1: ( ( rule__DonutPlot__CountIDAssignment_3_0_1 ) )
            // InternalBiLang.g:5255:2: ( rule__DonutPlot__CountIDAssignment_3_0_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getCountIDAssignment_3_0_1()); 
            // InternalBiLang.g:5256:2: ( rule__DonutPlot__CountIDAssignment_3_0_1 )
            // InternalBiLang.g:5256:3: rule__DonutPlot__CountIDAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__CountIDAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getCountIDAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_3_0__1__Impl"


    // $ANTLR start "rule__DonutPlot__Group_3_1__0"
    // InternalBiLang.g:5265:1: rule__DonutPlot__Group_3_1__0 : rule__DonutPlot__Group_3_1__0__Impl rule__DonutPlot__Group_3_1__1 ;
    public final void rule__DonutPlot__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5269:1: ( rule__DonutPlot__Group_3_1__0__Impl rule__DonutPlot__Group_3_1__1 )
            // InternalBiLang.g:5270:2: rule__DonutPlot__Group_3_1__0__Impl rule__DonutPlot__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DonutPlot__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_3_1__1();

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
    // $ANTLR end "rule__DonutPlot__Group_3_1__0"


    // $ANTLR start "rule__DonutPlot__Group_3_1__0__Impl"
    // InternalBiLang.g:5277:1: rule__DonutPlot__Group_3_1__0__Impl : ( 'xAx' ) ;
    public final void rule__DonutPlot__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5281:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5282:1: ( 'xAx' )
            {
            // InternalBiLang.g:5282:1: ( 'xAx' )
            // InternalBiLang.g:5283:2: 'xAx'
            {
             before(grammarAccess.getDonutPlotAccess().getXAxKeyword_3_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getXAxKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_3_1__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group_3_1__1"
    // InternalBiLang.g:5292:1: rule__DonutPlot__Group_3_1__1 : rule__DonutPlot__Group_3_1__1__Impl rule__DonutPlot__Group_3_1__2 ;
    public final void rule__DonutPlot__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5296:1: ( rule__DonutPlot__Group_3_1__1__Impl rule__DonutPlot__Group_3_1__2 )
            // InternalBiLang.g:5297:2: rule__DonutPlot__Group_3_1__1__Impl rule__DonutPlot__Group_3_1__2
            {
            pushFollow(FOLLOW_41);
            rule__DonutPlot__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_3_1__2();

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
    // $ANTLR end "rule__DonutPlot__Group_3_1__1"


    // $ANTLR start "rule__DonutPlot__Group_3_1__1__Impl"
    // InternalBiLang.g:5304:1: rule__DonutPlot__Group_3_1__1__Impl : ( ( rule__DonutPlot__XAxisAssignment_3_1_1 ) ) ;
    public final void rule__DonutPlot__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5308:1: ( ( ( rule__DonutPlot__XAxisAssignment_3_1_1 ) ) )
            // InternalBiLang.g:5309:1: ( ( rule__DonutPlot__XAxisAssignment_3_1_1 ) )
            {
            // InternalBiLang.g:5309:1: ( ( rule__DonutPlot__XAxisAssignment_3_1_1 ) )
            // InternalBiLang.g:5310:2: ( rule__DonutPlot__XAxisAssignment_3_1_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getXAxisAssignment_3_1_1()); 
            // InternalBiLang.g:5311:2: ( rule__DonutPlot__XAxisAssignment_3_1_1 )
            // InternalBiLang.g:5311:3: rule__DonutPlot__XAxisAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__XAxisAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getXAxisAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_3_1__1__Impl"


    // $ANTLR start "rule__DonutPlot__Group_3_1__2"
    // InternalBiLang.g:5319:1: rule__DonutPlot__Group_3_1__2 : rule__DonutPlot__Group_3_1__2__Impl rule__DonutPlot__Group_3_1__3 ;
    public final void rule__DonutPlot__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5323:1: ( rule__DonutPlot__Group_3_1__2__Impl rule__DonutPlot__Group_3_1__3 )
            // InternalBiLang.g:5324:2: rule__DonutPlot__Group_3_1__2__Impl rule__DonutPlot__Group_3_1__3
            {
            pushFollow(FOLLOW_8);
            rule__DonutPlot__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_3_1__3();

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
    // $ANTLR end "rule__DonutPlot__Group_3_1__2"


    // $ANTLR start "rule__DonutPlot__Group_3_1__2__Impl"
    // InternalBiLang.g:5331:1: rule__DonutPlot__Group_3_1__2__Impl : ( 'yA' ) ;
    public final void rule__DonutPlot__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5335:1: ( ( 'yA' ) )
            // InternalBiLang.g:5336:1: ( 'yA' )
            {
            // InternalBiLang.g:5336:1: ( 'yA' )
            // InternalBiLang.g:5337:2: 'yA'
            {
             before(grammarAccess.getDonutPlotAccess().getYAKeyword_3_1_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getYAKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_3_1__2__Impl"


    // $ANTLR start "rule__DonutPlot__Group_3_1__3"
    // InternalBiLang.g:5346:1: rule__DonutPlot__Group_3_1__3 : rule__DonutPlot__Group_3_1__3__Impl ;
    public final void rule__DonutPlot__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5350:1: ( rule__DonutPlot__Group_3_1__3__Impl )
            // InternalBiLang.g:5351:2: rule__DonutPlot__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group_3_1__3"


    // $ANTLR start "rule__DonutPlot__Group_3_1__3__Impl"
    // InternalBiLang.g:5357:1: rule__DonutPlot__Group_3_1__3__Impl : ( ( rule__DonutPlot__YAxisAssignment_3_1_3 ) ) ;
    public final void rule__DonutPlot__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5361:1: ( ( ( rule__DonutPlot__YAxisAssignment_3_1_3 ) ) )
            // InternalBiLang.g:5362:1: ( ( rule__DonutPlot__YAxisAssignment_3_1_3 ) )
            {
            // InternalBiLang.g:5362:1: ( ( rule__DonutPlot__YAxisAssignment_3_1_3 ) )
            // InternalBiLang.g:5363:2: ( rule__DonutPlot__YAxisAssignment_3_1_3 )
            {
             before(grammarAccess.getDonutPlotAccess().getYAxisAssignment_3_1_3()); 
            // InternalBiLang.g:5364:2: ( rule__DonutPlot__YAxisAssignment_3_1_3 )
            // InternalBiLang.g:5364:3: rule__DonutPlot__YAxisAssignment_3_1_3
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__YAxisAssignment_3_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getYAxisAssignment_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_3_1__3__Impl"


    // $ANTLR start "rule__DonutPlot__Group_4__0"
    // InternalBiLang.g:5373:1: rule__DonutPlot__Group_4__0 : rule__DonutPlot__Group_4__0__Impl rule__DonutPlot__Group_4__1 ;
    public final void rule__DonutPlot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5377:1: ( rule__DonutPlot__Group_4__0__Impl rule__DonutPlot__Group_4__1 )
            // InternalBiLang.g:5378:2: rule__DonutPlot__Group_4__0__Impl rule__DonutPlot__Group_4__1
            {
            pushFollow(FOLLOW_38);
            rule__DonutPlot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_4__1();

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
    // $ANTLR end "rule__DonutPlot__Group_4__0"


    // $ANTLR start "rule__DonutPlot__Group_4__0__Impl"
    // InternalBiLang.g:5385:1: rule__DonutPlot__Group_4__0__Impl : ( 'loc' ) ;
    public final void rule__DonutPlot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5389:1: ( ( 'loc' ) )
            // InternalBiLang.g:5390:1: ( 'loc' )
            {
            // InternalBiLang.g:5390:1: ( 'loc' )
            // InternalBiLang.g:5391:2: 'loc'
            {
             before(grammarAccess.getDonutPlotAccess().getLocKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getLocKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_4__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group_4__1"
    // InternalBiLang.g:5400:1: rule__DonutPlot__Group_4__1 : rule__DonutPlot__Group_4__1__Impl ;
    public final void rule__DonutPlot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5404:1: ( rule__DonutPlot__Group_4__1__Impl )
            // InternalBiLang.g:5405:2: rule__DonutPlot__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_4__1__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group_4__1"


    // $ANTLR start "rule__DonutPlot__Group_4__1__Impl"
    // InternalBiLang.g:5411:1: rule__DonutPlot__Group_4__1__Impl : ( ( rule__DonutPlot__LocationAssignment_4_1 ) ) ;
    public final void rule__DonutPlot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5415:1: ( ( ( rule__DonutPlot__LocationAssignment_4_1 ) ) )
            // InternalBiLang.g:5416:1: ( ( rule__DonutPlot__LocationAssignment_4_1 ) )
            {
            // InternalBiLang.g:5416:1: ( ( rule__DonutPlot__LocationAssignment_4_1 ) )
            // InternalBiLang.g:5417:2: ( rule__DonutPlot__LocationAssignment_4_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getLocationAssignment_4_1()); 
            // InternalBiLang.g:5418:2: ( rule__DonutPlot__LocationAssignment_4_1 )
            // InternalBiLang.g:5418:3: rule__DonutPlot__LocationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__LocationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getLocationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_4__1__Impl"


    // $ANTLR start "rule__DonutPlot__Group_5__0"
    // InternalBiLang.g:5427:1: rule__DonutPlot__Group_5__0 : rule__DonutPlot__Group_5__0__Impl rule__DonutPlot__Group_5__1 ;
    public final void rule__DonutPlot__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5431:1: ( rule__DonutPlot__Group_5__0__Impl rule__DonutPlot__Group_5__1 )
            // InternalBiLang.g:5432:2: rule__DonutPlot__Group_5__0__Impl rule__DonutPlot__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__DonutPlot__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_5__1();

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
    // $ANTLR end "rule__DonutPlot__Group_5__0"


    // $ANTLR start "rule__DonutPlot__Group_5__0__Impl"
    // InternalBiLang.g:5439:1: rule__DonutPlot__Group_5__0__Impl : ( 'colors' ) ;
    public final void rule__DonutPlot__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5443:1: ( ( 'colors' ) )
            // InternalBiLang.g:5444:1: ( 'colors' )
            {
            // InternalBiLang.g:5444:1: ( 'colors' )
            // InternalBiLang.g:5445:2: 'colors'
            {
             before(grammarAccess.getDonutPlotAccess().getColorsKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getColorsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_5__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group_5__1"
    // InternalBiLang.g:5454:1: rule__DonutPlot__Group_5__1 : rule__DonutPlot__Group_5__1__Impl ;
    public final void rule__DonutPlot__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5458:1: ( rule__DonutPlot__Group_5__1__Impl )
            // InternalBiLang.g:5459:2: rule__DonutPlot__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_5__1__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group_5__1"


    // $ANTLR start "rule__DonutPlot__Group_5__1__Impl"
    // InternalBiLang.g:5465:1: rule__DonutPlot__Group_5__1__Impl : ( ( rule__DonutPlot__ColorsAssignment_5_1 ) ) ;
    public final void rule__DonutPlot__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5469:1: ( ( ( rule__DonutPlot__ColorsAssignment_5_1 ) ) )
            // InternalBiLang.g:5470:1: ( ( rule__DonutPlot__ColorsAssignment_5_1 ) )
            {
            // InternalBiLang.g:5470:1: ( ( rule__DonutPlot__ColorsAssignment_5_1 ) )
            // InternalBiLang.g:5471:2: ( rule__DonutPlot__ColorsAssignment_5_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getColorsAssignment_5_1()); 
            // InternalBiLang.g:5472:2: ( rule__DonutPlot__ColorsAssignment_5_1 )
            // InternalBiLang.g:5472:3: rule__DonutPlot__ColorsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__ColorsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getColorsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_5__1__Impl"


    // $ANTLR start "rule__DonutPlot__Group_6__0"
    // InternalBiLang.g:5481:1: rule__DonutPlot__Group_6__0 : rule__DonutPlot__Group_6__0__Impl rule__DonutPlot__Group_6__1 ;
    public final void rule__DonutPlot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5485:1: ( rule__DonutPlot__Group_6__0__Impl rule__DonutPlot__Group_6__1 )
            // InternalBiLang.g:5486:2: rule__DonutPlot__Group_6__0__Impl rule__DonutPlot__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__DonutPlot__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_6__1();

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
    // $ANTLR end "rule__DonutPlot__Group_6__0"


    // $ANTLR start "rule__DonutPlot__Group_6__0__Impl"
    // InternalBiLang.g:5493:1: rule__DonutPlot__Group_6__0__Impl : ( 'thickness' ) ;
    public final void rule__DonutPlot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5497:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5498:1: ( 'thickness' )
            {
            // InternalBiLang.g:5498:1: ( 'thickness' )
            // InternalBiLang.g:5499:2: 'thickness'
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessKeyword_6_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDonutPlotAccess().getThicknessKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_6__0__Impl"


    // $ANTLR start "rule__DonutPlot__Group_6__1"
    // InternalBiLang.g:5508:1: rule__DonutPlot__Group_6__1 : rule__DonutPlot__Group_6__1__Impl ;
    public final void rule__DonutPlot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5512:1: ( rule__DonutPlot__Group_6__1__Impl )
            // InternalBiLang.g:5513:2: rule__DonutPlot__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__Group_6__1__Impl();

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
    // $ANTLR end "rule__DonutPlot__Group_6__1"


    // $ANTLR start "rule__DonutPlot__Group_6__1__Impl"
    // InternalBiLang.g:5519:1: rule__DonutPlot__Group_6__1__Impl : ( ( rule__DonutPlot__ThicknessAssignment_6_1 ) ) ;
    public final void rule__DonutPlot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5523:1: ( ( ( rule__DonutPlot__ThicknessAssignment_6_1 ) ) )
            // InternalBiLang.g:5524:1: ( ( rule__DonutPlot__ThicknessAssignment_6_1 ) )
            {
            // InternalBiLang.g:5524:1: ( ( rule__DonutPlot__ThicknessAssignment_6_1 ) )
            // InternalBiLang.g:5525:2: ( rule__DonutPlot__ThicknessAssignment_6_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessAssignment_6_1()); 
            // InternalBiLang.g:5526:2: ( rule__DonutPlot__ThicknessAssignment_6_1 )
            // InternalBiLang.g:5526:3: rule__DonutPlot__ThicknessAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DonutPlot__ThicknessAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDonutPlotAccess().getThicknessAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__Group_6__1__Impl"


    // $ANTLR start "rule__PiePlot__Group__0"
    // InternalBiLang.g:5535:1: rule__PiePlot__Group__0 : rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 ;
    public final void rule__PiePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5539:1: ( rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 )
            // InternalBiLang.g:5540:2: rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBiLang.g:5547:1: rule__PiePlot__Group__0__Impl : ( 'pie' ) ;
    public final void rule__PiePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5551:1: ( ( 'pie' ) )
            // InternalBiLang.g:5552:1: ( 'pie' )
            {
            // InternalBiLang.g:5552:1: ( 'pie' )
            // InternalBiLang.g:5553:2: 'pie'
            {
             before(grammarAccess.getPiePlotAccess().getPieKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalBiLang.g:5562:1: rule__PiePlot__Group__1 : rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 ;
    public final void rule__PiePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5566:1: ( rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 )
            // InternalBiLang.g:5567:2: rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:5574:1: rule__PiePlot__Group__1__Impl : ( ( rule__PiePlot__NameAssignment_1 ) ) ;
    public final void rule__PiePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5578:1: ( ( ( rule__PiePlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5579:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5579:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            // InternalBiLang.g:5580:2: ( rule__PiePlot__NameAssignment_1 )
            {
             before(grammarAccess.getPiePlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5581:2: ( rule__PiePlot__NameAssignment_1 )
            // InternalBiLang.g:5581:3: rule__PiePlot__NameAssignment_1
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
    // InternalBiLang.g:5589:1: rule__PiePlot__Group__2 : rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 ;
    public final void rule__PiePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5593:1: ( rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 )
            // InternalBiLang.g:5594:2: rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalBiLang.g:5601:1: rule__PiePlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PiePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5605:1: ( ( '->' ) )
            // InternalBiLang.g:5606:1: ( '->' )
            {
            // InternalBiLang.g:5606:1: ( '->' )
            // InternalBiLang.g:5607:2: '->'
            {
             before(grammarAccess.getPiePlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBiLang.g:5616:1: rule__PiePlot__Group__3 : rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 ;
    public final void rule__PiePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5620:1: ( rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 )
            // InternalBiLang.g:5621:2: rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:5628:1: rule__PiePlot__Group__3__Impl : ( ( rule__PiePlot__Alternatives_3 ) ) ;
    public final void rule__PiePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5632:1: ( ( ( rule__PiePlot__Alternatives_3 ) ) )
            // InternalBiLang.g:5633:1: ( ( rule__PiePlot__Alternatives_3 ) )
            {
            // InternalBiLang.g:5633:1: ( ( rule__PiePlot__Alternatives_3 ) )
            // InternalBiLang.g:5634:2: ( rule__PiePlot__Alternatives_3 )
            {
             before(grammarAccess.getPiePlotAccess().getAlternatives_3()); 
            // InternalBiLang.g:5635:2: ( rule__PiePlot__Alternatives_3 )
            // InternalBiLang.g:5635:3: rule__PiePlot__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getAlternatives_3()); 

            }


            }

        }
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
    // InternalBiLang.g:5643:1: rule__PiePlot__Group__4 : rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 ;
    public final void rule__PiePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5647:1: ( rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 )
            // InternalBiLang.g:5648:2: rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:5655:1: rule__PiePlot__Group__4__Impl : ( ( rule__PiePlot__Group_4__0 )? ) ;
    public final void rule__PiePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5659:1: ( ( ( rule__PiePlot__Group_4__0 )? ) )
            // InternalBiLang.g:5660:1: ( ( rule__PiePlot__Group_4__0 )? )
            {
            // InternalBiLang.g:5660:1: ( ( rule__PiePlot__Group_4__0 )? )
            // InternalBiLang.g:5661:2: ( rule__PiePlot__Group_4__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_4()); 
            // InternalBiLang.g:5662:2: ( rule__PiePlot__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBiLang.g:5662:3: rule__PiePlot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PiePlot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPiePlotAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalBiLang.g:5670:1: rule__PiePlot__Group__5 : rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 ;
    public final void rule__PiePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5674:1: ( rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 )
            // InternalBiLang.g:5675:2: rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:5682:1: rule__PiePlot__Group__5__Impl : ( ( rule__PiePlot__Group_5__0 )? ) ;
    public final void rule__PiePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5686:1: ( ( ( rule__PiePlot__Group_5__0 )? ) )
            // InternalBiLang.g:5687:1: ( ( rule__PiePlot__Group_5__0 )? )
            {
            // InternalBiLang.g:5687:1: ( ( rule__PiePlot__Group_5__0 )? )
            // InternalBiLang.g:5688:2: ( rule__PiePlot__Group_5__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_5()); 
            // InternalBiLang.g:5689:2: ( rule__PiePlot__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBiLang.g:5689:3: rule__PiePlot__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PiePlot__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPiePlotAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalBiLang.g:5697:1: rule__PiePlot__Group__6 : rule__PiePlot__Group__6__Impl ;
    public final void rule__PiePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5701:1: ( rule__PiePlot__Group__6__Impl )
            // InternalBiLang.g:5702:2: rule__PiePlot__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group__6__Impl();

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
    // InternalBiLang.g:5708:1: rule__PiePlot__Group__6__Impl : ( ( rule__PiePlot__Group_6__0 )? ) ;
    public final void rule__PiePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5712:1: ( ( ( rule__PiePlot__Group_6__0 )? ) )
            // InternalBiLang.g:5713:1: ( ( rule__PiePlot__Group_6__0 )? )
            {
            // InternalBiLang.g:5713:1: ( ( rule__PiePlot__Group_6__0 )? )
            // InternalBiLang.g:5714:2: ( rule__PiePlot__Group_6__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_6()); 
            // InternalBiLang.g:5715:2: ( rule__PiePlot__Group_6__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==56) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBiLang.g:5715:3: rule__PiePlot__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PiePlot__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPiePlotAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__PiePlot__Group_3_0__0"
    // InternalBiLang.g:5724:1: rule__PiePlot__Group_3_0__0 : rule__PiePlot__Group_3_0__0__Impl rule__PiePlot__Group_3_0__1 ;
    public final void rule__PiePlot__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5728:1: ( rule__PiePlot__Group_3_0__0__Impl rule__PiePlot__Group_3_0__1 )
            // InternalBiLang.g:5729:2: rule__PiePlot__Group_3_0__0__Impl rule__PiePlot__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
            rule__PiePlot__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_3_0__1();

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
    // $ANTLR end "rule__PiePlot__Group_3_0__0"


    // $ANTLR start "rule__PiePlot__Group_3_0__0__Impl"
    // InternalBiLang.g:5736:1: rule__PiePlot__Group_3_0__0__Impl : ( 'countID' ) ;
    public final void rule__PiePlot__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5740:1: ( ( 'countID' ) )
            // InternalBiLang.g:5741:1: ( 'countID' )
            {
            // InternalBiLang.g:5741:1: ( 'countID' )
            // InternalBiLang.g:5742:2: 'countID'
            {
             before(grammarAccess.getPiePlotAccess().getCountIDKeyword_3_0_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getCountIDKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_3_0__0__Impl"


    // $ANTLR start "rule__PiePlot__Group_3_0__1"
    // InternalBiLang.g:5751:1: rule__PiePlot__Group_3_0__1 : rule__PiePlot__Group_3_0__1__Impl ;
    public final void rule__PiePlot__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5755:1: ( rule__PiePlot__Group_3_0__1__Impl )
            // InternalBiLang.g:5756:2: rule__PiePlot__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__PiePlot__Group_3_0__1"


    // $ANTLR start "rule__PiePlot__Group_3_0__1__Impl"
    // InternalBiLang.g:5762:1: rule__PiePlot__Group_3_0__1__Impl : ( ( rule__PiePlot__CountIDAssignment_3_0_1 ) ) ;
    public final void rule__PiePlot__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5766:1: ( ( ( rule__PiePlot__CountIDAssignment_3_0_1 ) ) )
            // InternalBiLang.g:5767:1: ( ( rule__PiePlot__CountIDAssignment_3_0_1 ) )
            {
            // InternalBiLang.g:5767:1: ( ( rule__PiePlot__CountIDAssignment_3_0_1 ) )
            // InternalBiLang.g:5768:2: ( rule__PiePlot__CountIDAssignment_3_0_1 )
            {
             before(grammarAccess.getPiePlotAccess().getCountIDAssignment_3_0_1()); 
            // InternalBiLang.g:5769:2: ( rule__PiePlot__CountIDAssignment_3_0_1 )
            // InternalBiLang.g:5769:3: rule__PiePlot__CountIDAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__CountIDAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getCountIDAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_3_0__1__Impl"


    // $ANTLR start "rule__PiePlot__Group_3_1__0"
    // InternalBiLang.g:5778:1: rule__PiePlot__Group_3_1__0 : rule__PiePlot__Group_3_1__0__Impl rule__PiePlot__Group_3_1__1 ;
    public final void rule__PiePlot__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5782:1: ( rule__PiePlot__Group_3_1__0__Impl rule__PiePlot__Group_3_1__1 )
            // InternalBiLang.g:5783:2: rule__PiePlot__Group_3_1__0__Impl rule__PiePlot__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__PiePlot__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_3_1__1();

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
    // $ANTLR end "rule__PiePlot__Group_3_1__0"


    // $ANTLR start "rule__PiePlot__Group_3_1__0__Impl"
    // InternalBiLang.g:5790:1: rule__PiePlot__Group_3_1__0__Impl : ( 'xAx' ) ;
    public final void rule__PiePlot__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5794:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5795:1: ( 'xAx' )
            {
            // InternalBiLang.g:5795:1: ( 'xAx' )
            // InternalBiLang.g:5796:2: 'xAx'
            {
             before(grammarAccess.getPiePlotAccess().getXAxKeyword_3_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getXAxKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_3_1__0__Impl"


    // $ANTLR start "rule__PiePlot__Group_3_1__1"
    // InternalBiLang.g:5805:1: rule__PiePlot__Group_3_1__1 : rule__PiePlot__Group_3_1__1__Impl rule__PiePlot__Group_3_1__2 ;
    public final void rule__PiePlot__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5809:1: ( rule__PiePlot__Group_3_1__1__Impl rule__PiePlot__Group_3_1__2 )
            // InternalBiLang.g:5810:2: rule__PiePlot__Group_3_1__1__Impl rule__PiePlot__Group_3_1__2
            {
            pushFollow(FOLLOW_41);
            rule__PiePlot__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_3_1__2();

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
    // $ANTLR end "rule__PiePlot__Group_3_1__1"


    // $ANTLR start "rule__PiePlot__Group_3_1__1__Impl"
    // InternalBiLang.g:5817:1: rule__PiePlot__Group_3_1__1__Impl : ( ( rule__PiePlot__XAxisAssignment_3_1_1 ) ) ;
    public final void rule__PiePlot__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5821:1: ( ( ( rule__PiePlot__XAxisAssignment_3_1_1 ) ) )
            // InternalBiLang.g:5822:1: ( ( rule__PiePlot__XAxisAssignment_3_1_1 ) )
            {
            // InternalBiLang.g:5822:1: ( ( rule__PiePlot__XAxisAssignment_3_1_1 ) )
            // InternalBiLang.g:5823:2: ( rule__PiePlot__XAxisAssignment_3_1_1 )
            {
             before(grammarAccess.getPiePlotAccess().getXAxisAssignment_3_1_1()); 
            // InternalBiLang.g:5824:2: ( rule__PiePlot__XAxisAssignment_3_1_1 )
            // InternalBiLang.g:5824:3: rule__PiePlot__XAxisAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__XAxisAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getXAxisAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_3_1__1__Impl"


    // $ANTLR start "rule__PiePlot__Group_3_1__2"
    // InternalBiLang.g:5832:1: rule__PiePlot__Group_3_1__2 : rule__PiePlot__Group_3_1__2__Impl rule__PiePlot__Group_3_1__3 ;
    public final void rule__PiePlot__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5836:1: ( rule__PiePlot__Group_3_1__2__Impl rule__PiePlot__Group_3_1__3 )
            // InternalBiLang.g:5837:2: rule__PiePlot__Group_3_1__2__Impl rule__PiePlot__Group_3_1__3
            {
            pushFollow(FOLLOW_8);
            rule__PiePlot__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_3_1__3();

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
    // $ANTLR end "rule__PiePlot__Group_3_1__2"


    // $ANTLR start "rule__PiePlot__Group_3_1__2__Impl"
    // InternalBiLang.g:5844:1: rule__PiePlot__Group_3_1__2__Impl : ( 'yA' ) ;
    public final void rule__PiePlot__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5848:1: ( ( 'yA' ) )
            // InternalBiLang.g:5849:1: ( 'yA' )
            {
            // InternalBiLang.g:5849:1: ( 'yA' )
            // InternalBiLang.g:5850:2: 'yA'
            {
             before(grammarAccess.getPiePlotAccess().getYAKeyword_3_1_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getYAKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_3_1__2__Impl"


    // $ANTLR start "rule__PiePlot__Group_3_1__3"
    // InternalBiLang.g:5859:1: rule__PiePlot__Group_3_1__3 : rule__PiePlot__Group_3_1__3__Impl ;
    public final void rule__PiePlot__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5863:1: ( rule__PiePlot__Group_3_1__3__Impl )
            // InternalBiLang.g:5864:2: rule__PiePlot__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__PiePlot__Group_3_1__3"


    // $ANTLR start "rule__PiePlot__Group_3_1__3__Impl"
    // InternalBiLang.g:5870:1: rule__PiePlot__Group_3_1__3__Impl : ( ( rule__PiePlot__YAxisAssignment_3_1_3 ) ) ;
    public final void rule__PiePlot__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5874:1: ( ( ( rule__PiePlot__YAxisAssignment_3_1_3 ) ) )
            // InternalBiLang.g:5875:1: ( ( rule__PiePlot__YAxisAssignment_3_1_3 ) )
            {
            // InternalBiLang.g:5875:1: ( ( rule__PiePlot__YAxisAssignment_3_1_3 ) )
            // InternalBiLang.g:5876:2: ( rule__PiePlot__YAxisAssignment_3_1_3 )
            {
             before(grammarAccess.getPiePlotAccess().getYAxisAssignment_3_1_3()); 
            // InternalBiLang.g:5877:2: ( rule__PiePlot__YAxisAssignment_3_1_3 )
            // InternalBiLang.g:5877:3: rule__PiePlot__YAxisAssignment_3_1_3
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__YAxisAssignment_3_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getYAxisAssignment_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_3_1__3__Impl"


    // $ANTLR start "rule__PiePlot__Group_4__0"
    // InternalBiLang.g:5886:1: rule__PiePlot__Group_4__0 : rule__PiePlot__Group_4__0__Impl rule__PiePlot__Group_4__1 ;
    public final void rule__PiePlot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5890:1: ( rule__PiePlot__Group_4__0__Impl rule__PiePlot__Group_4__1 )
            // InternalBiLang.g:5891:2: rule__PiePlot__Group_4__0__Impl rule__PiePlot__Group_4__1
            {
            pushFollow(FOLLOW_38);
            rule__PiePlot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_4__1();

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
    // $ANTLR end "rule__PiePlot__Group_4__0"


    // $ANTLR start "rule__PiePlot__Group_4__0__Impl"
    // InternalBiLang.g:5898:1: rule__PiePlot__Group_4__0__Impl : ( 'loc' ) ;
    public final void rule__PiePlot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5902:1: ( ( 'loc' ) )
            // InternalBiLang.g:5903:1: ( 'loc' )
            {
            // InternalBiLang.g:5903:1: ( 'loc' )
            // InternalBiLang.g:5904:2: 'loc'
            {
             before(grammarAccess.getPiePlotAccess().getLocKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getLocKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_4__0__Impl"


    // $ANTLR start "rule__PiePlot__Group_4__1"
    // InternalBiLang.g:5913:1: rule__PiePlot__Group_4__1 : rule__PiePlot__Group_4__1__Impl ;
    public final void rule__PiePlot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5917:1: ( rule__PiePlot__Group_4__1__Impl )
            // InternalBiLang.g:5918:2: rule__PiePlot__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_4__1__Impl();

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
    // $ANTLR end "rule__PiePlot__Group_4__1"


    // $ANTLR start "rule__PiePlot__Group_4__1__Impl"
    // InternalBiLang.g:5924:1: rule__PiePlot__Group_4__1__Impl : ( ( rule__PiePlot__LocationAssignment_4_1 ) ) ;
    public final void rule__PiePlot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5928:1: ( ( ( rule__PiePlot__LocationAssignment_4_1 ) ) )
            // InternalBiLang.g:5929:1: ( ( rule__PiePlot__LocationAssignment_4_1 ) )
            {
            // InternalBiLang.g:5929:1: ( ( rule__PiePlot__LocationAssignment_4_1 ) )
            // InternalBiLang.g:5930:2: ( rule__PiePlot__LocationAssignment_4_1 )
            {
             before(grammarAccess.getPiePlotAccess().getLocationAssignment_4_1()); 
            // InternalBiLang.g:5931:2: ( rule__PiePlot__LocationAssignment_4_1 )
            // InternalBiLang.g:5931:3: rule__PiePlot__LocationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__LocationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getLocationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_4__1__Impl"


    // $ANTLR start "rule__PiePlot__Group_5__0"
    // InternalBiLang.g:5940:1: rule__PiePlot__Group_5__0 : rule__PiePlot__Group_5__0__Impl rule__PiePlot__Group_5__1 ;
    public final void rule__PiePlot__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5944:1: ( rule__PiePlot__Group_5__0__Impl rule__PiePlot__Group_5__1 )
            // InternalBiLang.g:5945:2: rule__PiePlot__Group_5__0__Impl rule__PiePlot__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__PiePlot__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_5__1();

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
    // $ANTLR end "rule__PiePlot__Group_5__0"


    // $ANTLR start "rule__PiePlot__Group_5__0__Impl"
    // InternalBiLang.g:5952:1: rule__PiePlot__Group_5__0__Impl : ( 'colors' ) ;
    public final void rule__PiePlot__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5956:1: ( ( 'colors' ) )
            // InternalBiLang.g:5957:1: ( 'colors' )
            {
            // InternalBiLang.g:5957:1: ( 'colors' )
            // InternalBiLang.g:5958:2: 'colors'
            {
             before(grammarAccess.getPiePlotAccess().getColorsKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getColorsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_5__0__Impl"


    // $ANTLR start "rule__PiePlot__Group_5__1"
    // InternalBiLang.g:5967:1: rule__PiePlot__Group_5__1 : rule__PiePlot__Group_5__1__Impl ;
    public final void rule__PiePlot__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5971:1: ( rule__PiePlot__Group_5__1__Impl )
            // InternalBiLang.g:5972:2: rule__PiePlot__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_5__1__Impl();

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
    // $ANTLR end "rule__PiePlot__Group_5__1"


    // $ANTLR start "rule__PiePlot__Group_5__1__Impl"
    // InternalBiLang.g:5978:1: rule__PiePlot__Group_5__1__Impl : ( ( rule__PiePlot__ColorsAssignment_5_1 ) ) ;
    public final void rule__PiePlot__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5982:1: ( ( ( rule__PiePlot__ColorsAssignment_5_1 ) ) )
            // InternalBiLang.g:5983:1: ( ( rule__PiePlot__ColorsAssignment_5_1 ) )
            {
            // InternalBiLang.g:5983:1: ( ( rule__PiePlot__ColorsAssignment_5_1 ) )
            // InternalBiLang.g:5984:2: ( rule__PiePlot__ColorsAssignment_5_1 )
            {
             before(grammarAccess.getPiePlotAccess().getColorsAssignment_5_1()); 
            // InternalBiLang.g:5985:2: ( rule__PiePlot__ColorsAssignment_5_1 )
            // InternalBiLang.g:5985:3: rule__PiePlot__ColorsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__ColorsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getColorsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_5__1__Impl"


    // $ANTLR start "rule__PiePlot__Group_6__0"
    // InternalBiLang.g:5994:1: rule__PiePlot__Group_6__0 : rule__PiePlot__Group_6__0__Impl rule__PiePlot__Group_6__1 ;
    public final void rule__PiePlot__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5998:1: ( rule__PiePlot__Group_6__0__Impl rule__PiePlot__Group_6__1 )
            // InternalBiLang.g:5999:2: rule__PiePlot__Group_6__0__Impl rule__PiePlot__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__PiePlot__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_6__1();

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
    // $ANTLR end "rule__PiePlot__Group_6__0"


    // $ANTLR start "rule__PiePlot__Group_6__0__Impl"
    // InternalBiLang.g:6006:1: rule__PiePlot__Group_6__0__Impl : ( 'thickness' ) ;
    public final void rule__PiePlot__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6010:1: ( ( 'thickness' ) )
            // InternalBiLang.g:6011:1: ( 'thickness' )
            {
            // InternalBiLang.g:6011:1: ( 'thickness' )
            // InternalBiLang.g:6012:2: 'thickness'
            {
             before(grammarAccess.getPiePlotAccess().getThicknessKeyword_6_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getPiePlotAccess().getThicknessKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_6__0__Impl"


    // $ANTLR start "rule__PiePlot__Group_6__1"
    // InternalBiLang.g:6021:1: rule__PiePlot__Group_6__1 : rule__PiePlot__Group_6__1__Impl ;
    public final void rule__PiePlot__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6025:1: ( rule__PiePlot__Group_6__1__Impl )
            // InternalBiLang.g:6026:2: rule__PiePlot__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__Group_6__1__Impl();

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
    // $ANTLR end "rule__PiePlot__Group_6__1"


    // $ANTLR start "rule__PiePlot__Group_6__1__Impl"
    // InternalBiLang.g:6032:1: rule__PiePlot__Group_6__1__Impl : ( ( rule__PiePlot__ThicknessAssignment_6_1 ) ) ;
    public final void rule__PiePlot__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6036:1: ( ( ( rule__PiePlot__ThicknessAssignment_6_1 ) ) )
            // InternalBiLang.g:6037:1: ( ( rule__PiePlot__ThicknessAssignment_6_1 ) )
            {
            // InternalBiLang.g:6037:1: ( ( rule__PiePlot__ThicknessAssignment_6_1 ) )
            // InternalBiLang.g:6038:2: ( rule__PiePlot__ThicknessAssignment_6_1 )
            {
             before(grammarAccess.getPiePlotAccess().getThicknessAssignment_6_1()); 
            // InternalBiLang.g:6039:2: ( rule__PiePlot__ThicknessAssignment_6_1 )
            // InternalBiLang.g:6039:3: rule__PiePlot__ThicknessAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PiePlot__ThicknessAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPiePlotAccess().getThicknessAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__Group_6__1__Impl"


    // $ANTLR start "rule__PolarPlot__Group__0"
    // InternalBiLang.g:6048:1: rule__PolarPlot__Group__0 : rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 ;
    public final void rule__PolarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6052:1: ( rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 )
            // InternalBiLang.g:6053:2: rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBiLang.g:6060:1: rule__PolarPlot__Group__0__Impl : ( 'polar' ) ;
    public final void rule__PolarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6064:1: ( ( 'polar' ) )
            // InternalBiLang.g:6065:1: ( 'polar' )
            {
            // InternalBiLang.g:6065:1: ( 'polar' )
            // InternalBiLang.g:6066:2: 'polar'
            {
             before(grammarAccess.getPolarPlotAccess().getPolarKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalBiLang.g:6075:1: rule__PolarPlot__Group__1 : rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 ;
    public final void rule__PolarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6079:1: ( rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 )
            // InternalBiLang.g:6080:2: rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:6087:1: rule__PolarPlot__Group__1__Impl : ( ( rule__PolarPlot__NameAssignment_1 ) ) ;
    public final void rule__PolarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6091:1: ( ( ( rule__PolarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:6092:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:6092:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:6093:2: ( rule__PolarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:6094:2: ( rule__PolarPlot__NameAssignment_1 )
            // InternalBiLang.g:6094:3: rule__PolarPlot__NameAssignment_1
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
    // InternalBiLang.g:6102:1: rule__PolarPlot__Group__2 : rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 ;
    public final void rule__PolarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6106:1: ( rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 )
            // InternalBiLang.g:6107:2: rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBiLang.g:6114:1: rule__PolarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PolarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6118:1: ( ( '->' ) )
            // InternalBiLang.g:6119:1: ( '->' )
            {
            // InternalBiLang.g:6119:1: ( '->' )
            // InternalBiLang.g:6120:2: '->'
            {
             before(grammarAccess.getPolarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBiLang.g:6129:1: rule__PolarPlot__Group__3 : rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 ;
    public final void rule__PolarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6133:1: ( rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 )
            // InternalBiLang.g:6134:2: rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:6141:1: rule__PolarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PolarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6145:1: ( ( 'xAx' ) )
            // InternalBiLang.g:6146:1: ( 'xAx' )
            {
            // InternalBiLang.g:6146:1: ( 'xAx' )
            // InternalBiLang.g:6147:2: 'xAx'
            {
             before(grammarAccess.getPolarPlotAccess().getXAxKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBiLang.g:6156:1: rule__PolarPlot__Group__4 : rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 ;
    public final void rule__PolarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6160:1: ( rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 )
            // InternalBiLang.g:6161:2: rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:6168:1: rule__PolarPlot__Group__4__Impl : ( ( rule__PolarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__PolarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6172:1: ( ( ( rule__PolarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:6173:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:6173:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:6174:2: ( rule__PolarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPolarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:6175:2: ( rule__PolarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:6175:3: rule__PolarPlot__XAxisAssignment_4
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
    // InternalBiLang.g:6183:1: rule__PolarPlot__Group__5 : rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 ;
    public final void rule__PolarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6187:1: ( rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 )
            // InternalBiLang.g:6188:2: rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:6195:1: rule__PolarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PolarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6199:1: ( ( 'yA' ) )
            // InternalBiLang.g:6200:1: ( 'yA' )
            {
            // InternalBiLang.g:6200:1: ( 'yA' )
            // InternalBiLang.g:6201:2: 'yA'
            {
             before(grammarAccess.getPolarPlotAccess().getYAKeyword_5()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBiLang.g:6210:1: rule__PolarPlot__Group__6 : rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 ;
    public final void rule__PolarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6214:1: ( rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 )
            // InternalBiLang.g:6215:2: rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:6222:1: rule__PolarPlot__Group__6__Impl : ( ( rule__PolarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__PolarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6226:1: ( ( ( rule__PolarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:6227:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:6227:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:6228:2: ( rule__PolarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPolarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:6229:2: ( rule__PolarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:6229:3: rule__PolarPlot__YAxisAssignment_6
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
    // InternalBiLang.g:6237:1: rule__PolarPlot__Group__7 : rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 ;
    public final void rule__PolarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6241:1: ( rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 )
            // InternalBiLang.g:6242:2: rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:6249:1: rule__PolarPlot__Group__7__Impl : ( ( rule__PolarPlot__Group_7__0 )? ) ;
    public final void rule__PolarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6253:1: ( ( ( rule__PolarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:6254:1: ( ( rule__PolarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:6254:1: ( ( rule__PolarPlot__Group_7__0 )? )
            // InternalBiLang.g:6255:2: ( rule__PolarPlot__Group_7__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:6256:2: ( rule__PolarPlot__Group_7__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBiLang.g:6256:3: rule__PolarPlot__Group_7__0
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
    // InternalBiLang.g:6264:1: rule__PolarPlot__Group__8 : rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 ;
    public final void rule__PolarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6268:1: ( rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 )
            // InternalBiLang.g:6269:2: rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:6276:1: rule__PolarPlot__Group__8__Impl : ( ( rule__PolarPlot__Group_8__0 )? ) ;
    public final void rule__PolarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6280:1: ( ( ( rule__PolarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:6281:1: ( ( rule__PolarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:6281:1: ( ( rule__PolarPlot__Group_8__0 )? )
            // InternalBiLang.g:6282:2: ( rule__PolarPlot__Group_8__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:6283:2: ( rule__PolarPlot__Group_8__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==55) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBiLang.g:6283:3: rule__PolarPlot__Group_8__0
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
    // InternalBiLang.g:6291:1: rule__PolarPlot__Group__9 : rule__PolarPlot__Group__9__Impl ;
    public final void rule__PolarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6295:1: ( rule__PolarPlot__Group__9__Impl )
            // InternalBiLang.g:6296:2: rule__PolarPlot__Group__9__Impl
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
    // InternalBiLang.g:6302:1: rule__PolarPlot__Group__9__Impl : ( ( rule__PolarPlot__Group_9__0 )? ) ;
    public final void rule__PolarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6306:1: ( ( ( rule__PolarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:6307:1: ( ( rule__PolarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:6307:1: ( ( rule__PolarPlot__Group_9__0 )? )
            // InternalBiLang.g:6308:2: ( rule__PolarPlot__Group_9__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:6309:2: ( rule__PolarPlot__Group_9__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBiLang.g:6309:3: rule__PolarPlot__Group_9__0
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
    // InternalBiLang.g:6318:1: rule__PolarPlot__Group_7__0 : rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 ;
    public final void rule__PolarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6322:1: ( rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 )
            // InternalBiLang.g:6323:2: rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:6330:1: rule__PolarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PolarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6334:1: ( ( 'loc' ) )
            // InternalBiLang.g:6335:1: ( 'loc' )
            {
            // InternalBiLang.g:6335:1: ( 'loc' )
            // InternalBiLang.g:6336:2: 'loc'
            {
             before(grammarAccess.getPolarPlotAccess().getLocKeyword_7_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBiLang.g:6345:1: rule__PolarPlot__Group_7__1 : rule__PolarPlot__Group_7__1__Impl ;
    public final void rule__PolarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6349:1: ( rule__PolarPlot__Group_7__1__Impl )
            // InternalBiLang.g:6350:2: rule__PolarPlot__Group_7__1__Impl
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
    // InternalBiLang.g:6356:1: rule__PolarPlot__Group_7__1__Impl : ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PolarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6360:1: ( ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:6361:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:6361:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:6362:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:6363:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:6363:3: rule__PolarPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:6372:1: rule__PolarPlot__Group_8__0 : rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 ;
    public final void rule__PolarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6376:1: ( rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 )
            // InternalBiLang.g:6377:2: rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:6384:1: rule__PolarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PolarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6388:1: ( ( 'colors' ) )
            // InternalBiLang.g:6389:1: ( 'colors' )
            {
            // InternalBiLang.g:6389:1: ( 'colors' )
            // InternalBiLang.g:6390:2: 'colors'
            {
             before(grammarAccess.getPolarPlotAccess().getColorsKeyword_8_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBiLang.g:6399:1: rule__PolarPlot__Group_8__1 : rule__PolarPlot__Group_8__1__Impl ;
    public final void rule__PolarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6403:1: ( rule__PolarPlot__Group_8__1__Impl )
            // InternalBiLang.g:6404:2: rule__PolarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:6410:1: rule__PolarPlot__Group_8__1__Impl : ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PolarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6414:1: ( ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:6415:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:6415:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:6416:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:6417:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:6417:3: rule__PolarPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:6426:1: rule__PolarPlot__Group_9__0 : rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 ;
    public final void rule__PolarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6430:1: ( rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 )
            // InternalBiLang.g:6431:2: rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:6438:1: rule__PolarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PolarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6442:1: ( ( 'thickness' ) )
            // InternalBiLang.g:6443:1: ( 'thickness' )
            {
            // InternalBiLang.g:6443:1: ( 'thickness' )
            // InternalBiLang.g:6444:2: 'thickness'
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessKeyword_9_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBiLang.g:6453:1: rule__PolarPlot__Group_9__1 : rule__PolarPlot__Group_9__1__Impl ;
    public final void rule__PolarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6457:1: ( rule__PolarPlot__Group_9__1__Impl )
            // InternalBiLang.g:6458:2: rule__PolarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:6464:1: rule__PolarPlot__Group_9__1__Impl : ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PolarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6468:1: ( ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:6469:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:6469:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:6470:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:6471:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:6471:3: rule__PolarPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:6480:1: rule__ScatterPlot__Group__0 : rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 ;
    public final void rule__ScatterPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6484:1: ( rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 )
            // InternalBiLang.g:6485:2: rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBiLang.g:6492:1: rule__ScatterPlot__Group__0__Impl : ( 'scatter' ) ;
    public final void rule__ScatterPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6496:1: ( ( 'scatter' ) )
            // InternalBiLang.g:6497:1: ( 'scatter' )
            {
            // InternalBiLang.g:6497:1: ( 'scatter' )
            // InternalBiLang.g:6498:2: 'scatter'
            {
             before(grammarAccess.getScatterPlotAccess().getScatterKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalBiLang.g:6507:1: rule__ScatterPlot__Group__1 : rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 ;
    public final void rule__ScatterPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6511:1: ( rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 )
            // InternalBiLang.g:6512:2: rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:6519:1: rule__ScatterPlot__Group__1__Impl : ( ( rule__ScatterPlot__NameAssignment_1 ) ) ;
    public final void rule__ScatterPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6523:1: ( ( ( rule__ScatterPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:6524:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:6524:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            // InternalBiLang.g:6525:2: ( rule__ScatterPlot__NameAssignment_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:6526:2: ( rule__ScatterPlot__NameAssignment_1 )
            // InternalBiLang.g:6526:3: rule__ScatterPlot__NameAssignment_1
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
    // InternalBiLang.g:6534:1: rule__ScatterPlot__Group__2 : rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 ;
    public final void rule__ScatterPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6538:1: ( rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 )
            // InternalBiLang.g:6539:2: rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBiLang.g:6546:1: rule__ScatterPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__ScatterPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6550:1: ( ( '->' ) )
            // InternalBiLang.g:6551:1: ( '->' )
            {
            // InternalBiLang.g:6551:1: ( '->' )
            // InternalBiLang.g:6552:2: '->'
            {
             before(grammarAccess.getScatterPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBiLang.g:6561:1: rule__ScatterPlot__Group__3 : rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 ;
    public final void rule__ScatterPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6565:1: ( rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 )
            // InternalBiLang.g:6566:2: rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:6573:1: rule__ScatterPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__ScatterPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6577:1: ( ( 'xAx' ) )
            // InternalBiLang.g:6578:1: ( 'xAx' )
            {
            // InternalBiLang.g:6578:1: ( 'xAx' )
            // InternalBiLang.g:6579:2: 'xAx'
            {
             before(grammarAccess.getScatterPlotAccess().getXAxKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBiLang.g:6588:1: rule__ScatterPlot__Group__4 : rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 ;
    public final void rule__ScatterPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6592:1: ( rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 )
            // InternalBiLang.g:6593:2: rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:6600:1: rule__ScatterPlot__Group__4__Impl : ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) ;
    public final void rule__ScatterPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6604:1: ( ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:6605:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:6605:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:6606:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getScatterPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:6607:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            // InternalBiLang.g:6607:3: rule__ScatterPlot__XAxisAssignment_4
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
    // InternalBiLang.g:6615:1: rule__ScatterPlot__Group__5 : rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 ;
    public final void rule__ScatterPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6619:1: ( rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 )
            // InternalBiLang.g:6620:2: rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:6627:1: rule__ScatterPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__ScatterPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6631:1: ( ( 'yA' ) )
            // InternalBiLang.g:6632:1: ( 'yA' )
            {
            // InternalBiLang.g:6632:1: ( 'yA' )
            // InternalBiLang.g:6633:2: 'yA'
            {
             before(grammarAccess.getScatterPlotAccess().getYAKeyword_5()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBiLang.g:6642:1: rule__ScatterPlot__Group__6 : rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 ;
    public final void rule__ScatterPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6646:1: ( rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 )
            // InternalBiLang.g:6647:2: rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:6654:1: rule__ScatterPlot__Group__6__Impl : ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) ;
    public final void rule__ScatterPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6658:1: ( ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:6659:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:6659:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:6660:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getScatterPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:6661:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            // InternalBiLang.g:6661:3: rule__ScatterPlot__YAxisAssignment_6
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
    // InternalBiLang.g:6669:1: rule__ScatterPlot__Group__7 : rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 ;
    public final void rule__ScatterPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6673:1: ( rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 )
            // InternalBiLang.g:6674:2: rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:6681:1: rule__ScatterPlot__Group__7__Impl : ( ( rule__ScatterPlot__Group_7__0 )? ) ;
    public final void rule__ScatterPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6685:1: ( ( ( rule__ScatterPlot__Group_7__0 )? ) )
            // InternalBiLang.g:6686:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:6686:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            // InternalBiLang.g:6687:2: ( rule__ScatterPlot__Group_7__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_7()); 
            // InternalBiLang.g:6688:2: ( rule__ScatterPlot__Group_7__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==54) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBiLang.g:6688:3: rule__ScatterPlot__Group_7__0
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
    // InternalBiLang.g:6696:1: rule__ScatterPlot__Group__8 : rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 ;
    public final void rule__ScatterPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6700:1: ( rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 )
            // InternalBiLang.g:6701:2: rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:6708:1: rule__ScatterPlot__Group__8__Impl : ( ( rule__ScatterPlot__Group_8__0 )? ) ;
    public final void rule__ScatterPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6712:1: ( ( ( rule__ScatterPlot__Group_8__0 )? ) )
            // InternalBiLang.g:6713:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:6713:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            // InternalBiLang.g:6714:2: ( rule__ScatterPlot__Group_8__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_8()); 
            // InternalBiLang.g:6715:2: ( rule__ScatterPlot__Group_8__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalBiLang.g:6715:3: rule__ScatterPlot__Group_8__0
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
    // InternalBiLang.g:6723:1: rule__ScatterPlot__Group__9 : rule__ScatterPlot__Group__9__Impl ;
    public final void rule__ScatterPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6727:1: ( rule__ScatterPlot__Group__9__Impl )
            // InternalBiLang.g:6728:2: rule__ScatterPlot__Group__9__Impl
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
    // InternalBiLang.g:6734:1: rule__ScatterPlot__Group__9__Impl : ( ( rule__ScatterPlot__Group_9__0 )? ) ;
    public final void rule__ScatterPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6738:1: ( ( ( rule__ScatterPlot__Group_9__0 )? ) )
            // InternalBiLang.g:6739:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:6739:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            // InternalBiLang.g:6740:2: ( rule__ScatterPlot__Group_9__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_9()); 
            // InternalBiLang.g:6741:2: ( rule__ScatterPlot__Group_9__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBiLang.g:6741:3: rule__ScatterPlot__Group_9__0
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
    // InternalBiLang.g:6750:1: rule__ScatterPlot__Group_7__0 : rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 ;
    public final void rule__ScatterPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6754:1: ( rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 )
            // InternalBiLang.g:6755:2: rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:6762:1: rule__ScatterPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__ScatterPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6766:1: ( ( 'loc' ) )
            // InternalBiLang.g:6767:1: ( 'loc' )
            {
            // InternalBiLang.g:6767:1: ( 'loc' )
            // InternalBiLang.g:6768:2: 'loc'
            {
             before(grammarAccess.getScatterPlotAccess().getLocKeyword_7_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBiLang.g:6777:1: rule__ScatterPlot__Group_7__1 : rule__ScatterPlot__Group_7__1__Impl ;
    public final void rule__ScatterPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6781:1: ( rule__ScatterPlot__Group_7__1__Impl )
            // InternalBiLang.g:6782:2: rule__ScatterPlot__Group_7__1__Impl
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
    // InternalBiLang.g:6788:1: rule__ScatterPlot__Group_7__1__Impl : ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__ScatterPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6792:1: ( ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:6793:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:6793:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:6794:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:6795:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:6795:3: rule__ScatterPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:6804:1: rule__ScatterPlot__Group_8__0 : rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 ;
    public final void rule__ScatterPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6808:1: ( rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 )
            // InternalBiLang.g:6809:2: rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:6816:1: rule__ScatterPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__ScatterPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6820:1: ( ( 'colors' ) )
            // InternalBiLang.g:6821:1: ( 'colors' )
            {
            // InternalBiLang.g:6821:1: ( 'colors' )
            // InternalBiLang.g:6822:2: 'colors'
            {
             before(grammarAccess.getScatterPlotAccess().getColorsKeyword_8_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBiLang.g:6831:1: rule__ScatterPlot__Group_8__1 : rule__ScatterPlot__Group_8__1__Impl ;
    public final void rule__ScatterPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6835:1: ( rule__ScatterPlot__Group_8__1__Impl )
            // InternalBiLang.g:6836:2: rule__ScatterPlot__Group_8__1__Impl
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
    // InternalBiLang.g:6842:1: rule__ScatterPlot__Group_8__1__Impl : ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__ScatterPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6846:1: ( ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:6847:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:6847:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:6848:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:6849:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:6849:3: rule__ScatterPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:6858:1: rule__ScatterPlot__Group_9__0 : rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 ;
    public final void rule__ScatterPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6862:1: ( rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 )
            // InternalBiLang.g:6863:2: rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:6870:1: rule__ScatterPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__ScatterPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6874:1: ( ( 'thickness' ) )
            // InternalBiLang.g:6875:1: ( 'thickness' )
            {
            // InternalBiLang.g:6875:1: ( 'thickness' )
            // InternalBiLang.g:6876:2: 'thickness'
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessKeyword_9_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBiLang.g:6885:1: rule__ScatterPlot__Group_9__1 : rule__ScatterPlot__Group_9__1__Impl ;
    public final void rule__ScatterPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6889:1: ( rule__ScatterPlot__Group_9__1__Impl )
            // InternalBiLang.g:6890:2: rule__ScatterPlot__Group_9__1__Impl
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
    // InternalBiLang.g:6896:1: rule__ScatterPlot__Group_9__1__Impl : ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__ScatterPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6900:1: ( ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:6901:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:6901:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:6902:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:6903:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:6903:3: rule__ScatterPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:6912:1: rule__RadarPlot__Group__0 : rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 ;
    public final void rule__RadarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6916:1: ( rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 )
            // InternalBiLang.g:6917:2: rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalBiLang.g:6924:1: rule__RadarPlot__Group__0__Impl : ( 'radar' ) ;
    public final void rule__RadarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6928:1: ( ( 'radar' ) )
            // InternalBiLang.g:6929:1: ( 'radar' )
            {
            // InternalBiLang.g:6929:1: ( 'radar' )
            // InternalBiLang.g:6930:2: 'radar'
            {
             before(grammarAccess.getRadarPlotAccess().getRadarKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalBiLang.g:6939:1: rule__RadarPlot__Group__1 : rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 ;
    public final void rule__RadarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6943:1: ( rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 )
            // InternalBiLang.g:6944:2: rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:6951:1: rule__RadarPlot__Group__1__Impl : ( ( rule__RadarPlot__NameAssignment_1 ) ) ;
    public final void rule__RadarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6955:1: ( ( ( rule__RadarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:6956:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:6956:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:6957:2: ( rule__RadarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:6958:2: ( rule__RadarPlot__NameAssignment_1 )
            // InternalBiLang.g:6958:3: rule__RadarPlot__NameAssignment_1
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
    // InternalBiLang.g:6966:1: rule__RadarPlot__Group__2 : rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 ;
    public final void rule__RadarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6970:1: ( rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 )
            // InternalBiLang.g:6971:2: rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBiLang.g:6978:1: rule__RadarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__RadarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6982:1: ( ( '->' ) )
            // InternalBiLang.g:6983:1: ( '->' )
            {
            // InternalBiLang.g:6983:1: ( '->' )
            // InternalBiLang.g:6984:2: '->'
            {
             before(grammarAccess.getRadarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBiLang.g:6993:1: rule__RadarPlot__Group__3 : rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 ;
    public final void rule__RadarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6997:1: ( rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 )
            // InternalBiLang.g:6998:2: rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:7005:1: rule__RadarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__RadarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7009:1: ( ( 'xAx' ) )
            // InternalBiLang.g:7010:1: ( 'xAx' )
            {
            // InternalBiLang.g:7010:1: ( 'xAx' )
            // InternalBiLang.g:7011:2: 'xAx'
            {
             before(grammarAccess.getRadarPlotAccess().getXAxKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBiLang.g:7020:1: rule__RadarPlot__Group__4 : rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 ;
    public final void rule__RadarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7024:1: ( rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 )
            // InternalBiLang.g:7025:2: rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:7032:1: rule__RadarPlot__Group__4__Impl : ( ( rule__RadarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__RadarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7036:1: ( ( ( rule__RadarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:7037:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:7037:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:7038:2: ( rule__RadarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getRadarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:7039:2: ( rule__RadarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:7039:3: rule__RadarPlot__XAxisAssignment_4
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
    // InternalBiLang.g:7047:1: rule__RadarPlot__Group__5 : rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 ;
    public final void rule__RadarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7051:1: ( rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 )
            // InternalBiLang.g:7052:2: rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:7059:1: rule__RadarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__RadarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7063:1: ( ( 'yA' ) )
            // InternalBiLang.g:7064:1: ( 'yA' )
            {
            // InternalBiLang.g:7064:1: ( 'yA' )
            // InternalBiLang.g:7065:2: 'yA'
            {
             before(grammarAccess.getRadarPlotAccess().getYAKeyword_5()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBiLang.g:7074:1: rule__RadarPlot__Group__6 : rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 ;
    public final void rule__RadarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7078:1: ( rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 )
            // InternalBiLang.g:7079:2: rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:7086:1: rule__RadarPlot__Group__6__Impl : ( ( rule__RadarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__RadarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7090:1: ( ( ( rule__RadarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:7091:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:7091:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:7092:2: ( rule__RadarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getRadarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:7093:2: ( rule__RadarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:7093:3: rule__RadarPlot__YAxisAssignment_6
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
    // InternalBiLang.g:7101:1: rule__RadarPlot__Group__7 : rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 ;
    public final void rule__RadarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7105:1: ( rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 )
            // InternalBiLang.g:7106:2: rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:7113:1: rule__RadarPlot__Group__7__Impl : ( ( rule__RadarPlot__Group_7__0 )? ) ;
    public final void rule__RadarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7117:1: ( ( ( rule__RadarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:7118:1: ( ( rule__RadarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:7118:1: ( ( rule__RadarPlot__Group_7__0 )? )
            // InternalBiLang.g:7119:2: ( rule__RadarPlot__Group_7__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:7120:2: ( rule__RadarPlot__Group_7__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBiLang.g:7120:3: rule__RadarPlot__Group_7__0
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
    // InternalBiLang.g:7128:1: rule__RadarPlot__Group__8 : rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 ;
    public final void rule__RadarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7132:1: ( rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 )
            // InternalBiLang.g:7133:2: rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:7140:1: rule__RadarPlot__Group__8__Impl : ( ( rule__RadarPlot__Group_8__0 )? ) ;
    public final void rule__RadarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7144:1: ( ( ( rule__RadarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:7145:1: ( ( rule__RadarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:7145:1: ( ( rule__RadarPlot__Group_8__0 )? )
            // InternalBiLang.g:7146:2: ( rule__RadarPlot__Group_8__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:7147:2: ( rule__RadarPlot__Group_8__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==55) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBiLang.g:7147:3: rule__RadarPlot__Group_8__0
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
    // InternalBiLang.g:7155:1: rule__RadarPlot__Group__9 : rule__RadarPlot__Group__9__Impl ;
    public final void rule__RadarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7159:1: ( rule__RadarPlot__Group__9__Impl )
            // InternalBiLang.g:7160:2: rule__RadarPlot__Group__9__Impl
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
    // InternalBiLang.g:7166:1: rule__RadarPlot__Group__9__Impl : ( ( rule__RadarPlot__Group_9__0 )? ) ;
    public final void rule__RadarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7170:1: ( ( ( rule__RadarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:7171:1: ( ( rule__RadarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:7171:1: ( ( rule__RadarPlot__Group_9__0 )? )
            // InternalBiLang.g:7172:2: ( rule__RadarPlot__Group_9__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:7173:2: ( rule__RadarPlot__Group_9__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==56) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalBiLang.g:7173:3: rule__RadarPlot__Group_9__0
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
    // InternalBiLang.g:7182:1: rule__RadarPlot__Group_7__0 : rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 ;
    public final void rule__RadarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7186:1: ( rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 )
            // InternalBiLang.g:7187:2: rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:7194:1: rule__RadarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__RadarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7198:1: ( ( 'loc' ) )
            // InternalBiLang.g:7199:1: ( 'loc' )
            {
            // InternalBiLang.g:7199:1: ( 'loc' )
            // InternalBiLang.g:7200:2: 'loc'
            {
             before(grammarAccess.getRadarPlotAccess().getLocKeyword_7_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBiLang.g:7209:1: rule__RadarPlot__Group_7__1 : rule__RadarPlot__Group_7__1__Impl ;
    public final void rule__RadarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7213:1: ( rule__RadarPlot__Group_7__1__Impl )
            // InternalBiLang.g:7214:2: rule__RadarPlot__Group_7__1__Impl
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
    // InternalBiLang.g:7220:1: rule__RadarPlot__Group_7__1__Impl : ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__RadarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7224:1: ( ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:7225:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:7225:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:7226:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:7227:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:7227:3: rule__RadarPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:7236:1: rule__RadarPlot__Group_8__0 : rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 ;
    public final void rule__RadarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7240:1: ( rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 )
            // InternalBiLang.g:7241:2: rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalBiLang.g:7248:1: rule__RadarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__RadarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7252:1: ( ( 'colors' ) )
            // InternalBiLang.g:7253:1: ( 'colors' )
            {
            // InternalBiLang.g:7253:1: ( 'colors' )
            // InternalBiLang.g:7254:2: 'colors'
            {
             before(grammarAccess.getRadarPlotAccess().getColorsKeyword_8_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBiLang.g:7263:1: rule__RadarPlot__Group_8__1 : rule__RadarPlot__Group_8__1__Impl ;
    public final void rule__RadarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7267:1: ( rule__RadarPlot__Group_8__1__Impl )
            // InternalBiLang.g:7268:2: rule__RadarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:7274:1: rule__RadarPlot__Group_8__1__Impl : ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__RadarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7278:1: ( ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:7279:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:7279:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:7280:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:7281:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:7281:3: rule__RadarPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:7290:1: rule__RadarPlot__Group_9__0 : rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 ;
    public final void rule__RadarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7294:1: ( rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 )
            // InternalBiLang.g:7295:2: rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:7302:1: rule__RadarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__RadarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7306:1: ( ( 'thickness' ) )
            // InternalBiLang.g:7307:1: ( 'thickness' )
            {
            // InternalBiLang.g:7307:1: ( 'thickness' )
            // InternalBiLang.g:7308:2: 'thickness'
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessKeyword_9_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBiLang.g:7317:1: rule__RadarPlot__Group_9__1 : rule__RadarPlot__Group_9__1__Impl ;
    public final void rule__RadarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7321:1: ( rule__RadarPlot__Group_9__1__Impl )
            // InternalBiLang.g:7322:2: rule__RadarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:7328:1: rule__RadarPlot__Group_9__1__Impl : ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__RadarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7332:1: ( ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:7333:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:7333:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:7334:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:7335:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:7335:3: rule__RadarPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:7344:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7348:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7349:2: ( RULE_ID )
            {
            // InternalBiLang.g:7349:2: ( RULE_ID )
            // InternalBiLang.g:7350:3: RULE_ID
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
    // InternalBiLang.g:7359:1: rule__Task__FileextractorAssignment_4 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7363:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:7364:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:7364:2: ( ruleFileExtractor )
            // InternalBiLang.g:7365:3: ruleFileExtractor
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


    // $ANTLR start "rule__Task__DatafilteringAssignment_5_0"
    // InternalBiLang.g:7374:1: rule__Task__DatafilteringAssignment_5_0 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7378:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:7379:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:7379:2: ( ruleDataFiltering )
            // InternalBiLang.g:7380:3: ruleDataFiltering
            {
             before(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DatafilteringAssignment_5_0"


    // $ANTLR start "rule__Task__DatafilteringAssignment_5_1"
    // InternalBiLang.g:7389:1: rule__Task__DatafilteringAssignment_5_1 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7393:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:7394:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:7394:2: ( ruleDataFiltering )
            // InternalBiLang.g:7395:3: ruleDataFiltering
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


    // $ANTLR start "rule__Task__FileextractorAssignment_6_0"
    // InternalBiLang.g:7404:1: rule__Task__FileextractorAssignment_6_0 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7408:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:7409:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:7409:2: ( ruleFileExtractor )
            // InternalBiLang.g:7410:3: ruleFileExtractor
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


    // $ANTLR start "rule__Task__DatafilteringAssignment_6_1_0"
    // InternalBiLang.g:7419:1: rule__Task__DatafilteringAssignment_6_1_0 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7423:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:7424:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:7424:2: ( ruleDataFiltering )
            // InternalBiLang.g:7425:3: ruleDataFiltering
            {
             before(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DatafilteringAssignment_6_1_0"


    // $ANTLR start "rule__Task__DatafilteringAssignment_6_1_1"
    // InternalBiLang.g:7434:1: rule__Task__DatafilteringAssignment_6_1_1 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7438:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:7439:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:7439:2: ( ruleDataFiltering )
            // InternalBiLang.g:7440:3: ruleDataFiltering
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


    // $ANTLR start "rule__Task__DashboardAssignment_8"
    // InternalBiLang.g:7449:1: rule__Task__DashboardAssignment_8 : ( ruleDashBoard ) ;
    public final void rule__Task__DashboardAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7453:1: ( ( ruleDashBoard ) )
            // InternalBiLang.g:7454:2: ( ruleDashBoard )
            {
            // InternalBiLang.g:7454:2: ( ruleDashBoard )
            // InternalBiLang.g:7455:3: ruleDashBoard
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
    // InternalBiLang.g:7464:1: rule__FileExtractor__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__FileExtractor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7468:1: ( ( ruleEString ) )
            // InternalBiLang.g:7469:2: ( ruleEString )
            {
            // InternalBiLang.g:7469:2: ( ruleEString )
            // InternalBiLang.g:7470:3: ruleEString
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
    // InternalBiLang.g:7479:1: rule__FileExtractor__PathAssignment_2 : ( ruleEString ) ;
    public final void rule__FileExtractor__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7483:1: ( ( ruleEString ) )
            // InternalBiLang.g:7484:2: ( ruleEString )
            {
            // InternalBiLang.g:7484:2: ( ruleEString )
            // InternalBiLang.g:7485:3: ruleEString
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
    // InternalBiLang.g:7494:1: rule__FileExtractor__NullreplacementAssignment_3_1 : ( ruleNullReplacement ) ;
    public final void rule__FileExtractor__NullreplacementAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7498:1: ( ( ruleNullReplacement ) )
            // InternalBiLang.g:7499:2: ( ruleNullReplacement )
            {
            // InternalBiLang.g:7499:2: ( ruleNullReplacement )
            // InternalBiLang.g:7500:3: ruleNullReplacement
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
    // InternalBiLang.g:7509:1: rule__FileExtractor__NullreplacementAssignment_3_2_1 : ( ruleNullReplacement ) ;
    public final void rule__FileExtractor__NullreplacementAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7513:1: ( ( ruleNullReplacement ) )
            // InternalBiLang.g:7514:2: ( ruleNullReplacement )
            {
            // InternalBiLang.g:7514:2: ( ruleNullReplacement )
            // InternalBiLang.g:7515:3: ruleNullReplacement
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
    // InternalBiLang.g:7524:1: rule__DataFiltering__FileextractorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__DataFiltering__FileextractorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7528:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:7529:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:7529:2: ( ( ruleEString ) )
            // InternalBiLang.g:7530:3: ( ruleEString )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0()); 
            // InternalBiLang.g:7531:3: ( ruleEString )
            // InternalBiLang.g:7532:4: ruleEString
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


    // $ANTLR start "rule__DataFiltering__FilteringstepAssignment_2_0_1"
    // InternalBiLang.g:7543:1: rule__DataFiltering__FilteringstepAssignment_2_0_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7547:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:7548:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:7548:2: ( ruleFilteringStep )
            // InternalBiLang.g:7549:3: ruleFilteringStep
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilteringStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__FilteringstepAssignment_2_0_1"


    // $ANTLR start "rule__DataFiltering__FilteringstepAssignment_2_0_2_1"
    // InternalBiLang.g:7558:1: rule__DataFiltering__FilteringstepAssignment_2_0_2_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7562:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:7563:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:7563:2: ( ruleFilteringStep )
            // InternalBiLang.g:7564:3: ruleFilteringStep
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_2_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilteringStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__FilteringstepAssignment_2_0_2_1"


    // $ANTLR start "rule__DataFiltering__ProcessingstepAssignment_2_1_1"
    // InternalBiLang.g:7573:1: rule__DataFiltering__ProcessingstepAssignment_2_1_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7577:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:7578:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:7578:2: ( rulePreprocessingStep )
            // InternalBiLang.g:7579:3: rulePreprocessingStep
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__ProcessingstepAssignment_2_1_1"


    // $ANTLR start "rule__DataFiltering__ProcessingstepAssignment_2_1_2_1"
    // InternalBiLang.g:7588:1: rule__DataFiltering__ProcessingstepAssignment_2_1_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7592:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:7593:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:7593:2: ( rulePreprocessingStep )
            // InternalBiLang.g:7594:3: rulePreprocessingStep
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__ProcessingstepAssignment_2_1_2_1"


    // $ANTLR start "rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1"
    // InternalBiLang.g:7603:1: rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1 : ( ruleCountPreprocessingStep ) ;
    public final void rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7607:1: ( ( ruleCountPreprocessingStep ) )
            // InternalBiLang.g:7608:2: ( ruleCountPreprocessingStep )
            {
            // InternalBiLang.g:7608:2: ( ruleCountPreprocessingStep )
            // InternalBiLang.g:7609:3: ruleCountPreprocessingStep
            {
             before(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepCountPreprocessingStepParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCountPreprocessingStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepCountPreprocessingStepParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__CountpreprocessingstepAssignment_2_2_1"


    // $ANTLR start "rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1"
    // InternalBiLang.g:7618:1: rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1 : ( ruleCountPreprocessingStep ) ;
    public final void rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7622:1: ( ( ruleCountPreprocessingStep ) )
            // InternalBiLang.g:7623:2: ( ruleCountPreprocessingStep )
            {
            // InternalBiLang.g:7623:2: ( ruleCountPreprocessingStep )
            // InternalBiLang.g:7624:3: ruleCountPreprocessingStep
            {
             before(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepCountPreprocessingStepParserRuleCall_2_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCountPreprocessingStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepCountPreprocessingStepParserRuleCall_2_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__CountpreprocessingstepAssignment_2_2_2_1"


    // $ANTLR start "rule__CountPreprocessingStep__AxisAssignment_0"
    // InternalBiLang.g:7633:1: rule__CountPreprocessingStep__AxisAssignment_0 : ( ruleEString ) ;
    public final void rule__CountPreprocessingStep__AxisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7637:1: ( ( ruleEString ) )
            // InternalBiLang.g:7638:2: ( ruleEString )
            {
            // InternalBiLang.g:7638:2: ( ruleEString )
            // InternalBiLang.g:7639:3: ruleEString
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getAxisEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCountPreprocessingStepAccess().getAxisEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__AxisAssignment_0"


    // $ANTLR start "rule__CountPreprocessingStep__CountqualistatementAssignment_2_0"
    // InternalBiLang.g:7648:1: rule__CountPreprocessingStep__CountqualistatementAssignment_2_0 : ( ruleCountQualiStatement ) ;
    public final void rule__CountPreprocessingStep__CountqualistatementAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7652:1: ( ( ruleCountQualiStatement ) )
            // InternalBiLang.g:7653:2: ( ruleCountQualiStatement )
            {
            // InternalBiLang.g:7653:2: ( ruleCountQualiStatement )
            // InternalBiLang.g:7654:3: ruleCountQualiStatement
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getCountqualistatementCountQualiStatementParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCountQualiStatement();

            state._fsp--;

             after(grammarAccess.getCountPreprocessingStepAccess().getCountqualistatementCountQualiStatementParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__CountqualistatementAssignment_2_0"


    // $ANTLR start "rule__CountPreprocessingStep__CountquantistatementAssignment_2_1"
    // InternalBiLang.g:7663:1: rule__CountPreprocessingStep__CountquantistatementAssignment_2_1 : ( ruleCountQuantiStatement ) ;
    public final void rule__CountPreprocessingStep__CountquantistatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7667:1: ( ( ruleCountQuantiStatement ) )
            // InternalBiLang.g:7668:2: ( ruleCountQuantiStatement )
            {
            // InternalBiLang.g:7668:2: ( ruleCountQuantiStatement )
            // InternalBiLang.g:7669:3: ruleCountQuantiStatement
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getCountquantistatementCountQuantiStatementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCountQuantiStatement();

            state._fsp--;

             after(grammarAccess.getCountPreprocessingStepAccess().getCountquantistatementCountQuantiStatementParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__CountquantistatementAssignment_2_1"


    // $ANTLR start "rule__CountPreprocessingStep__ReferenceAssignment_4"
    // InternalBiLang.g:7678:1: rule__CountPreprocessingStep__ReferenceAssignment_4 : ( ruleEString ) ;
    public final void rule__CountPreprocessingStep__ReferenceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7682:1: ( ( ruleEString ) )
            // InternalBiLang.g:7683:2: ( ruleEString )
            {
            // InternalBiLang.g:7683:2: ( ruleEString )
            // InternalBiLang.g:7684:3: ruleEString
            {
             before(grammarAccess.getCountPreprocessingStepAccess().getReferenceEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCountPreprocessingStepAccess().getReferenceEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountPreprocessingStep__ReferenceAssignment_4"


    // $ANTLR start "rule__CountQualiStatement__QualiOperatorAssignment_0"
    // InternalBiLang.g:7693:1: rule__CountQualiStatement__QualiOperatorAssignment_0 : ( ruleQualitativeOperator ) ;
    public final void rule__CountQualiStatement__QualiOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7697:1: ( ( ruleQualitativeOperator ) )
            // InternalBiLang.g:7698:2: ( ruleQualitativeOperator )
            {
            // InternalBiLang.g:7698:2: ( ruleQualitativeOperator )
            // InternalBiLang.g:7699:3: ruleQualitativeOperator
            {
             before(grammarAccess.getCountQualiStatementAccess().getQualiOperatorQualitativeOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualitativeOperator();

            state._fsp--;

             after(grammarAccess.getCountQualiStatementAccess().getQualiOperatorQualitativeOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQualiStatement__QualiOperatorAssignment_0"


    // $ANTLR start "rule__CountQualiStatement__LabelAssignment_1"
    // InternalBiLang.g:7708:1: rule__CountQualiStatement__LabelAssignment_1 : ( ruleEString ) ;
    public final void rule__CountQualiStatement__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7712:1: ( ( ruleEString ) )
            // InternalBiLang.g:7713:2: ( ruleEString )
            {
            // InternalBiLang.g:7713:2: ( ruleEString )
            // InternalBiLang.g:7714:3: ruleEString
            {
             before(grammarAccess.getCountQualiStatementAccess().getLabelEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCountQualiStatementAccess().getLabelEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQualiStatement__LabelAssignment_1"


    // $ANTLR start "rule__CountQualiStatement__StatementAssignment_3"
    // InternalBiLang.g:7723:1: rule__CountQualiStatement__StatementAssignment_3 : ( ruleEString ) ;
    public final void rule__CountQualiStatement__StatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7727:1: ( ( ruleEString ) )
            // InternalBiLang.g:7728:2: ( ruleEString )
            {
            // InternalBiLang.g:7728:2: ( ruleEString )
            // InternalBiLang.g:7729:3: ruleEString
            {
             before(grammarAccess.getCountQualiStatementAccess().getStatementEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCountQualiStatementAccess().getStatementEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQualiStatement__StatementAssignment_3"


    // $ANTLR start "rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0"
    // InternalBiLang.g:7738:1: rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0 : ( ruleQuantitativeOperator ) ;
    public final void rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7742:1: ( ( ruleQuantitativeOperator ) )
            // InternalBiLang.g:7743:2: ( ruleQuantitativeOperator )
            {
            // InternalBiLang.g:7743:2: ( ruleQuantitativeOperator )
            // InternalBiLang.g:7744:3: ruleQuantitativeOperator
            {
             before(grammarAccess.getCountQuantiStatementAccess().getQuantiOperatorQuantitativeOperatorEnumRuleCall_0_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantitativeOperator();

            state._fsp--;

             after(grammarAccess.getCountQuantiStatementAccess().getQuantiOperatorQuantitativeOperatorEnumRuleCall_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__QuantiOperatorAssignment_0_0_0"


    // $ANTLR start "rule__CountQuantiStatement__RSideAssignment_0_0_1"
    // InternalBiLang.g:7753:1: rule__CountQuantiStatement__RSideAssignment_0_0_1 : ( ruleEFloat ) ;
    public final void rule__CountQuantiStatement__RSideAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7757:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7758:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7758:2: ( ruleEFloat )
            // InternalBiLang.g:7759:3: ruleEFloat
            {
             before(grammarAccess.getCountQuantiStatementAccess().getRSideEFloatParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getCountQuantiStatementAccess().getRSideEFloatParserRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__RSideAssignment_0_0_1"


    // $ANTLR start "rule__CountQuantiStatement__LSideAssignment_0_1_0"
    // InternalBiLang.g:7768:1: rule__CountQuantiStatement__LSideAssignment_0_1_0 : ( ruleEFloat ) ;
    public final void rule__CountQuantiStatement__LSideAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7772:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7773:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7773:2: ( ruleEFloat )
            // InternalBiLang.g:7774:3: ruleEFloat
            {
             before(grammarAccess.getCountQuantiStatementAccess().getLSideEFloatParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getCountQuantiStatementAccess().getLSideEFloatParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__LSideAssignment_0_1_0"


    // $ANTLR start "rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1"
    // InternalBiLang.g:7783:1: rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1 : ( ruleRangeOperator ) ;
    public final void rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7787:1: ( ( ruleRangeOperator ) )
            // InternalBiLang.g:7788:2: ( ruleRangeOperator )
            {
            // InternalBiLang.g:7788:2: ( ruleRangeOperator )
            // InternalBiLang.g:7789:3: ruleRangeOperator
            {
             before(grammarAccess.getCountQuantiStatementAccess().getRangeOperatorRangeOperatorEnumRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRangeOperator();

            state._fsp--;

             after(grammarAccess.getCountQuantiStatementAccess().getRangeOperatorRangeOperatorEnumRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__RangeOperatorAssignment_0_1_1"


    // $ANTLR start "rule__CountQuantiStatement__RSideAssignment_0_1_2"
    // InternalBiLang.g:7798:1: rule__CountQuantiStatement__RSideAssignment_0_1_2 : ( ruleEFloat ) ;
    public final void rule__CountQuantiStatement__RSideAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7802:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7803:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7803:2: ( ruleEFloat )
            // InternalBiLang.g:7804:3: ruleEFloat
            {
             before(grammarAccess.getCountQuantiStatementAccess().getRSideEFloatParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getCountQuantiStatementAccess().getRSideEFloatParserRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__RSideAssignment_0_1_2"


    // $ANTLR start "rule__CountQuantiStatement__StatementAssignment_2"
    // InternalBiLang.g:7813:1: rule__CountQuantiStatement__StatementAssignment_2 : ( ruleEString ) ;
    public final void rule__CountQuantiStatement__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7817:1: ( ( ruleEString ) )
            // InternalBiLang.g:7818:2: ( ruleEString )
            {
            // InternalBiLang.g:7818:2: ( ruleEString )
            // InternalBiLang.g:7819:3: ruleEString
            {
             before(grammarAccess.getCountQuantiStatementAccess().getStatementEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCountQuantiStatementAccess().getStatementEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountQuantiStatement__StatementAssignment_2"


    // $ANTLR start "rule__DashBoard__NameAssignment_0"
    // InternalBiLang.g:7828:1: rule__DashBoard__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DashBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7832:1: ( ( ruleEString ) )
            // InternalBiLang.g:7833:2: ( ruleEString )
            {
            // InternalBiLang.g:7833:2: ( ruleEString )
            // InternalBiLang.g:7834:3: ruleEString
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
    // InternalBiLang.g:7843:1: rule__DashBoard__FileextractorAssignment_2_0 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__FileextractorAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7847:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:7848:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:7848:2: ( ( ruleEString ) )
            // InternalBiLang.g:7849:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_0()); 
            // InternalBiLang.g:7850:3: ( ruleEString )
            // InternalBiLang.g:7851:4: ruleEString
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
    // InternalBiLang.g:7862:1: rule__DashBoard__PlotAssignment_2_3 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7866:1: ( ( rulePlot ) )
            // InternalBiLang.g:7867:2: ( rulePlot )
            {
            // InternalBiLang.g:7867:2: ( rulePlot )
            // InternalBiLang.g:7868:3: rulePlot
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
    // InternalBiLang.g:7877:1: rule__DashBoard__PlotAssignment_2_4 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7881:1: ( ( rulePlot ) )
            // InternalBiLang.g:7882:2: ( rulePlot )
            {
            // InternalBiLang.g:7882:2: ( rulePlot )
            // InternalBiLang.g:7883:3: rulePlot
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
    // InternalBiLang.g:7892:1: rule__NullReplacement__ColNameAssignment_0 : ( ruleEString ) ;
    public final void rule__NullReplacement__ColNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7896:1: ( ( ruleEString ) )
            // InternalBiLang.g:7897:2: ( ruleEString )
            {
            // InternalBiLang.g:7897:2: ( ruleEString )
            // InternalBiLang.g:7898:3: ruleEString
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
    // InternalBiLang.g:7907:1: rule__NullReplacement__LabelAssignment_2_0 : ( ruleEString ) ;
    public final void rule__NullReplacement__LabelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7911:1: ( ( ruleEString ) )
            // InternalBiLang.g:7912:2: ( ruleEString )
            {
            // InternalBiLang.g:7912:2: ( ruleEString )
            // InternalBiLang.g:7913:3: ruleEString
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
    // InternalBiLang.g:7922:1: rule__NullReplacement__StatisticaloperationAssignment_2_1 : ( ruleStatisticalOperation ) ;
    public final void rule__NullReplacement__StatisticaloperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7926:1: ( ( ruleStatisticalOperation ) )
            // InternalBiLang.g:7927:2: ( ruleStatisticalOperation )
            {
            // InternalBiLang.g:7927:2: ( ruleStatisticalOperation )
            // InternalBiLang.g:7928:3: ruleStatisticalOperation
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
    // InternalBiLang.g:7937:1: rule__QuantitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QuantitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7941:1: ( ( ruleEString ) )
            // InternalBiLang.g:7942:2: ( ruleEString )
            {
            // InternalBiLang.g:7942:2: ( ruleEString )
            // InternalBiLang.g:7943:3: ruleEString
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
    // InternalBiLang.g:7952:1: rule__QuantitativeFiltering__OperatorAssignment_2 : ( ruleQuantitativeOperator ) ;
    public final void rule__QuantitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7956:1: ( ( ruleQuantitativeOperator ) )
            // InternalBiLang.g:7957:2: ( ruleQuantitativeOperator )
            {
            // InternalBiLang.g:7957:2: ( ruleQuantitativeOperator )
            // InternalBiLang.g:7958:3: ruleQuantitativeOperator
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
    // InternalBiLang.g:7967:1: rule__QuantitativeFiltering__ValuesAssignment_3 : ( ruleEFloat ) ;
    public final void rule__QuantitativeFiltering__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7971:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7972:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7972:2: ( ruleEFloat )
            // InternalBiLang.g:7973:3: ruleEFloat
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
    // InternalBiLang.g:7982:1: rule__QualitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7986:1: ( ( ruleEString ) )
            // InternalBiLang.g:7987:2: ( ruleEString )
            {
            // InternalBiLang.g:7987:2: ( ruleEString )
            // InternalBiLang.g:7988:3: ruleEString
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
    // InternalBiLang.g:7997:1: rule__QualitativeFiltering__OperatorAssignment_2 : ( ruleQualitativeOperator ) ;
    public final void rule__QualitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8001:1: ( ( ruleQualitativeOperator ) )
            // InternalBiLang.g:8002:2: ( ruleQualitativeOperator )
            {
            // InternalBiLang.g:8002:2: ( ruleQualitativeOperator )
            // InternalBiLang.g:8003:3: ruleQualitativeOperator
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
    // InternalBiLang.g:8012:1: rule__QualitativeFiltering__LabelsAssignment_3 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__LabelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8016:1: ( ( ruleEString ) )
            // InternalBiLang.g:8017:2: ( ruleEString )
            {
            // InternalBiLang.g:8017:2: ( ruleEString )
            // InternalBiLang.g:8018:3: ruleEString
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


    // $ANTLR start "rule__MathOperation__NewColNameAssignment_0_0"
    // InternalBiLang.g:8027:1: rule__MathOperation__NewColNameAssignment_0_0 : ( ruleEString ) ;
    public final void rule__MathOperation__NewColNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8031:1: ( ( ruleEString ) )
            // InternalBiLang.g:8032:2: ( ruleEString )
            {
            // InternalBiLang.g:8032:2: ( ruleEString )
            // InternalBiLang.g:8033:3: ruleEString
            {
             before(grammarAccess.getMathOperationAccess().getNewColNameEStringParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getNewColNameEStringParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__NewColNameAssignment_0_0"


    // $ANTLR start "rule__MathOperation__LsideAssignment_3"
    // InternalBiLang.g:8042:1: rule__MathOperation__LsideAssignment_3 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__LsideAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8046:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:8047:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:8047:2: ( rulePreprocessingStep )
            // InternalBiLang.g:8048:3: rulePreprocessingStep
            {
             before(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__LsideAssignment_3"


    // $ANTLR start "rule__MathOperation__OperatorAssignment_4"
    // InternalBiLang.g:8057:1: rule__MathOperation__OperatorAssignment_4 : ( ruleMathOperator ) ;
    public final void rule__MathOperation__OperatorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8061:1: ( ( ruleMathOperator ) )
            // InternalBiLang.g:8062:2: ( ruleMathOperator )
            {
            // InternalBiLang.g:8062:2: ( ruleMathOperator )
            // InternalBiLang.g:8063:3: ruleMathOperator
            {
             before(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__OperatorAssignment_4"


    // $ANTLR start "rule__MathOperation__RsideAssignment_6"
    // InternalBiLang.g:8072:1: rule__MathOperation__RsideAssignment_6 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__RsideAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8076:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:8077:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:8077:2: ( rulePreprocessingStep )
            // InternalBiLang.g:8078:3: rulePreprocessingStep
            {
             before(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__RsideAssignment_6"


    // $ANTLR start "rule__ColReference__TargetAssignment_1"
    // InternalBiLang.g:8087:1: rule__ColReference__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__ColReference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8091:1: ( ( ruleEString ) )
            // InternalBiLang.g:8092:2: ( ruleEString )
            {
            // InternalBiLang.g:8092:2: ( ruleEString )
            // InternalBiLang.g:8093:3: ruleEString
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
    // InternalBiLang.g:8102:1: rule__StatisticalOperation__OperatorAssignment_0 : ( ruleStatisticalOperator ) ;
    public final void rule__StatisticalOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8106:1: ( ( ruleStatisticalOperator ) )
            // InternalBiLang.g:8107:2: ( ruleStatisticalOperator )
            {
            // InternalBiLang.g:8107:2: ( ruleStatisticalOperator )
            // InternalBiLang.g:8108:3: ruleStatisticalOperator
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
    // InternalBiLang.g:8117:1: rule__StatisticalOperation__ColreferenceAssignment_2 : ( ruleColReference ) ;
    public final void rule__StatisticalOperation__ColreferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8121:1: ( ( ruleColReference ) )
            // InternalBiLang.g:8122:2: ( ruleColReference )
            {
            // InternalBiLang.g:8122:2: ( ruleColReference )
            // InternalBiLang.g:8123:3: ruleColReference
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
    // InternalBiLang.g:8132:1: rule__BarPlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BarPlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8136:1: ( ( RULE_ID ) )
            // InternalBiLang.g:8137:2: ( RULE_ID )
            {
            // InternalBiLang.g:8137:2: ( RULE_ID )
            // InternalBiLang.g:8138:3: RULE_ID
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
    // InternalBiLang.g:8147:1: rule__BarPlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__BarPlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8151:1: ( ( ruleEString ) )
            // InternalBiLang.g:8152:2: ( ruleEString )
            {
            // InternalBiLang.g:8152:2: ( ruleEString )
            // InternalBiLang.g:8153:3: ruleEString
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
    // InternalBiLang.g:8162:1: rule__BarPlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__BarPlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8166:1: ( ( ruleEString ) )
            // InternalBiLang.g:8167:2: ( ruleEString )
            {
            // InternalBiLang.g:8167:2: ( ruleEString )
            // InternalBiLang.g:8168:3: ruleEString
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
    // InternalBiLang.g:8177:1: rule__BarPlot__LocationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__BarPlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8181:1: ( ( ruleEInt ) )
            // InternalBiLang.g:8182:2: ( ruleEInt )
            {
            // InternalBiLang.g:8182:2: ( ruleEInt )
            // InternalBiLang.g:8183:3: ruleEInt
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
    // InternalBiLang.g:8192:1: rule__BarPlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarPlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8196:1: ( ( ruleEString ) )
            // InternalBiLang.g:8197:2: ( ruleEString )
            {
            // InternalBiLang.g:8197:2: ( ruleEString )
            // InternalBiLang.g:8198:3: ruleEString
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
    // InternalBiLang.g:8207:1: rule__BarPlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__BarPlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8211:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:8212:2: ( ruleEFloat )
            {
            // InternalBiLang.g:8212:2: ( ruleEFloat )
            // InternalBiLang.g:8213:3: ruleEFloat
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
    // InternalBiLang.g:8222:1: rule__LinePlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinePlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8226:1: ( ( RULE_ID ) )
            // InternalBiLang.g:8227:2: ( RULE_ID )
            {
            // InternalBiLang.g:8227:2: ( RULE_ID )
            // InternalBiLang.g:8228:3: RULE_ID
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
    // InternalBiLang.g:8237:1: rule__LinePlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__LinePlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8241:1: ( ( ruleEString ) )
            // InternalBiLang.g:8242:2: ( ruleEString )
            {
            // InternalBiLang.g:8242:2: ( ruleEString )
            // InternalBiLang.g:8243:3: ruleEString
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
    // InternalBiLang.g:8252:1: rule__LinePlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__LinePlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8256:1: ( ( ruleEString ) )
            // InternalBiLang.g:8257:2: ( ruleEString )
            {
            // InternalBiLang.g:8257:2: ( ruleEString )
            // InternalBiLang.g:8258:3: ruleEString
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
    // InternalBiLang.g:8267:1: rule__LinePlot__LocationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__LinePlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8271:1: ( ( ruleEInt ) )
            // InternalBiLang.g:8272:2: ( ruleEInt )
            {
            // InternalBiLang.g:8272:2: ( ruleEInt )
            // InternalBiLang.g:8273:3: ruleEInt
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
    // InternalBiLang.g:8282:1: rule__LinePlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LinePlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8286:1: ( ( ruleEString ) )
            // InternalBiLang.g:8287:2: ( ruleEString )
            {
            // InternalBiLang.g:8287:2: ( ruleEString )
            // InternalBiLang.g:8288:3: ruleEString
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
    // InternalBiLang.g:8297:1: rule__LinePlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__LinePlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8301:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:8302:2: ( ruleEFloat )
            {
            // InternalBiLang.g:8302:2: ( ruleEFloat )
            // InternalBiLang.g:8303:3: ruleEFloat
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
    // InternalBiLang.g:8312:1: rule__DonutPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DonutPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8316:1: ( ( RULE_ID ) )
            // InternalBiLang.g:8317:2: ( RULE_ID )
            {
            // InternalBiLang.g:8317:2: ( RULE_ID )
            // InternalBiLang.g:8318:3: RULE_ID
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


    // $ANTLR start "rule__DonutPlot__CountIDAssignment_3_0_1"
    // InternalBiLang.g:8327:1: rule__DonutPlot__CountIDAssignment_3_0_1 : ( ruleEString ) ;
    public final void rule__DonutPlot__CountIDAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8331:1: ( ( ruleEString ) )
            // InternalBiLang.g:8332:2: ( ruleEString )
            {
            // InternalBiLang.g:8332:2: ( ruleEString )
            // InternalBiLang.g:8333:3: ruleEString
            {
             before(grammarAccess.getDonutPlotAccess().getCountIDEStringParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getCountIDEStringParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__CountIDAssignment_3_0_1"


    // $ANTLR start "rule__DonutPlot__XAxisAssignment_3_1_1"
    // InternalBiLang.g:8342:1: rule__DonutPlot__XAxisAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DonutPlot__XAxisAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8346:1: ( ( ruleEString ) )
            // InternalBiLang.g:8347:2: ( ruleEString )
            {
            // InternalBiLang.g:8347:2: ( ruleEString )
            // InternalBiLang.g:8348:3: ruleEString
            {
             before(grammarAccess.getDonutPlotAccess().getXAxisEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getXAxisEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__XAxisAssignment_3_1_1"


    // $ANTLR start "rule__DonutPlot__YAxisAssignment_3_1_3"
    // InternalBiLang.g:8357:1: rule__DonutPlot__YAxisAssignment_3_1_3 : ( ruleEString ) ;
    public final void rule__DonutPlot__YAxisAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8361:1: ( ( ruleEString ) )
            // InternalBiLang.g:8362:2: ( ruleEString )
            {
            // InternalBiLang.g:8362:2: ( ruleEString )
            // InternalBiLang.g:8363:3: ruleEString
            {
             before(grammarAccess.getDonutPlotAccess().getYAxisEStringParserRuleCall_3_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getYAxisEStringParserRuleCall_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__YAxisAssignment_3_1_3"


    // $ANTLR start "rule__DonutPlot__LocationAssignment_4_1"
    // InternalBiLang.g:8372:1: rule__DonutPlot__LocationAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__DonutPlot__LocationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8376:1: ( ( ruleEInt ) )
            // InternalBiLang.g:8377:2: ( ruleEInt )
            {
            // InternalBiLang.g:8377:2: ( ruleEInt )
            // InternalBiLang.g:8378:3: ruleEInt
            {
             before(grammarAccess.getDonutPlotAccess().getLocationEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getLocationEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__LocationAssignment_4_1"


    // $ANTLR start "rule__DonutPlot__ColorsAssignment_5_1"
    // InternalBiLang.g:8387:1: rule__DonutPlot__ColorsAssignment_5_1 : ( ruleEString ) ;
    public final void rule__DonutPlot__ColorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8391:1: ( ( ruleEString ) )
            // InternalBiLang.g:8392:2: ( ruleEString )
            {
            // InternalBiLang.g:8392:2: ( ruleEString )
            // InternalBiLang.g:8393:3: ruleEString
            {
             before(grammarAccess.getDonutPlotAccess().getColorsEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getColorsEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__ColorsAssignment_5_1"


    // $ANTLR start "rule__DonutPlot__ThicknessAssignment_6_1"
    // InternalBiLang.g:8402:1: rule__DonutPlot__ThicknessAssignment_6_1 : ( ruleEFloat ) ;
    public final void rule__DonutPlot__ThicknessAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8406:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:8407:2: ( ruleEFloat )
            {
            // InternalBiLang.g:8407:2: ( ruleEFloat )
            // InternalBiLang.g:8408:3: ruleEFloat
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessEFloatParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getThicknessEFloatParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DonutPlot__ThicknessAssignment_6_1"


    // $ANTLR start "rule__PiePlot__NameAssignment_1"
    // InternalBiLang.g:8417:1: rule__PiePlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PiePlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8421:1: ( ( RULE_ID ) )
            // InternalBiLang.g:8422:2: ( RULE_ID )
            {
            // InternalBiLang.g:8422:2: ( RULE_ID )
            // InternalBiLang.g:8423:3: RULE_ID
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


    // $ANTLR start "rule__PiePlot__CountIDAssignment_3_0_1"
    // InternalBiLang.g:8432:1: rule__PiePlot__CountIDAssignment_3_0_1 : ( ruleEString ) ;
    public final void rule__PiePlot__CountIDAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8436:1: ( ( ruleEString ) )
            // InternalBiLang.g:8437:2: ( ruleEString )
            {
            // InternalBiLang.g:8437:2: ( ruleEString )
            // InternalBiLang.g:8438:3: ruleEString
            {
             before(grammarAccess.getPiePlotAccess().getCountIDEStringParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getCountIDEStringParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__CountIDAssignment_3_0_1"


    // $ANTLR start "rule__PiePlot__XAxisAssignment_3_1_1"
    // InternalBiLang.g:8447:1: rule__PiePlot__XAxisAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__PiePlot__XAxisAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8451:1: ( ( ruleEString ) )
            // InternalBiLang.g:8452:2: ( ruleEString )
            {
            // InternalBiLang.g:8452:2: ( ruleEString )
            // InternalBiLang.g:8453:3: ruleEString
            {
             before(grammarAccess.getPiePlotAccess().getXAxisEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getXAxisEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__XAxisAssignment_3_1_1"


    // $ANTLR start "rule__PiePlot__YAxisAssignment_3_1_3"
    // InternalBiLang.g:8462:1: rule__PiePlot__YAxisAssignment_3_1_3 : ( ruleEString ) ;
    public final void rule__PiePlot__YAxisAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8466:1: ( ( ruleEString ) )
            // InternalBiLang.g:8467:2: ( ruleEString )
            {
            // InternalBiLang.g:8467:2: ( ruleEString )
            // InternalBiLang.g:8468:3: ruleEString
            {
             before(grammarAccess.getPiePlotAccess().getYAxisEStringParserRuleCall_3_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getYAxisEStringParserRuleCall_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__YAxisAssignment_3_1_3"


    // $ANTLR start "rule__PiePlot__LocationAssignment_4_1"
    // InternalBiLang.g:8477:1: rule__PiePlot__LocationAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__PiePlot__LocationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8481:1: ( ( ruleEInt ) )
            // InternalBiLang.g:8482:2: ( ruleEInt )
            {
            // InternalBiLang.g:8482:2: ( ruleEInt )
            // InternalBiLang.g:8483:3: ruleEInt
            {
             before(grammarAccess.getPiePlotAccess().getLocationEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getLocationEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__LocationAssignment_4_1"


    // $ANTLR start "rule__PiePlot__ColorsAssignment_5_1"
    // InternalBiLang.g:8492:1: rule__PiePlot__ColorsAssignment_5_1 : ( ruleEString ) ;
    public final void rule__PiePlot__ColorsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8496:1: ( ( ruleEString ) )
            // InternalBiLang.g:8497:2: ( ruleEString )
            {
            // InternalBiLang.g:8497:2: ( ruleEString )
            // InternalBiLang.g:8498:3: ruleEString
            {
             before(grammarAccess.getPiePlotAccess().getColorsEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getColorsEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__ColorsAssignment_5_1"


    // $ANTLR start "rule__PiePlot__ThicknessAssignment_6_1"
    // InternalBiLang.g:8507:1: rule__PiePlot__ThicknessAssignment_6_1 : ( ruleEFloat ) ;
    public final void rule__PiePlot__ThicknessAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8511:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:8512:2: ( ruleEFloat )
            {
            // InternalBiLang.g:8512:2: ( ruleEFloat )
            // InternalBiLang.g:8513:3: ruleEFloat
            {
             before(grammarAccess.getPiePlotAccess().getThicknessEFloatParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getThicknessEFloatParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PiePlot__ThicknessAssignment_6_1"


    // $ANTLR start "rule__PolarPlot__NameAssignment_1"
    // InternalBiLang.g:8522:1: rule__PolarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PolarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8526:1: ( ( RULE_ID ) )
            // InternalBiLang.g:8527:2: ( RULE_ID )
            {
            // InternalBiLang.g:8527:2: ( RULE_ID )
            // InternalBiLang.g:8528:3: RULE_ID
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
    // InternalBiLang.g:8537:1: rule__PolarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PolarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8541:1: ( ( ruleEString ) )
            // InternalBiLang.g:8542:2: ( ruleEString )
            {
            // InternalBiLang.g:8542:2: ( ruleEString )
            // InternalBiLang.g:8543:3: ruleEString
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
    // InternalBiLang.g:8552:1: rule__PolarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PolarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8556:1: ( ( ruleEString ) )
            // InternalBiLang.g:8557:2: ( ruleEString )
            {
            // InternalBiLang.g:8557:2: ( ruleEString )
            // InternalBiLang.g:8558:3: ruleEString
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
    // InternalBiLang.g:8567:1: rule__PolarPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__PolarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8571:1: ( ( ruleEInt ) )
            // InternalBiLang.g:8572:2: ( ruleEInt )
            {
            // InternalBiLang.g:8572:2: ( ruleEInt )
            // InternalBiLang.g:8573:3: ruleEInt
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
    // InternalBiLang.g:8582:1: rule__PolarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PolarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8586:1: ( ( ruleEString ) )
            // InternalBiLang.g:8587:2: ( ruleEString )
            {
            // InternalBiLang.g:8587:2: ( ruleEString )
            // InternalBiLang.g:8588:3: ruleEString
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
    // InternalBiLang.g:8597:1: rule__PolarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PolarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8601:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:8602:2: ( ruleEFloat )
            {
            // InternalBiLang.g:8602:2: ( ruleEFloat )
            // InternalBiLang.g:8603:3: ruleEFloat
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
    // InternalBiLang.g:8612:1: rule__ScatterPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScatterPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8616:1: ( ( RULE_ID ) )
            // InternalBiLang.g:8617:2: ( RULE_ID )
            {
            // InternalBiLang.g:8617:2: ( RULE_ID )
            // InternalBiLang.g:8618:3: RULE_ID
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
    // InternalBiLang.g:8627:1: rule__ScatterPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__ScatterPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8631:1: ( ( ruleEString ) )
            // InternalBiLang.g:8632:2: ( ruleEString )
            {
            // InternalBiLang.g:8632:2: ( ruleEString )
            // InternalBiLang.g:8633:3: ruleEString
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
    // InternalBiLang.g:8642:1: rule__ScatterPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__ScatterPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8646:1: ( ( ruleEString ) )
            // InternalBiLang.g:8647:2: ( ruleEString )
            {
            // InternalBiLang.g:8647:2: ( ruleEString )
            // InternalBiLang.g:8648:3: ruleEString
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
    // InternalBiLang.g:8657:1: rule__ScatterPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__ScatterPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8661:1: ( ( ruleEInt ) )
            // InternalBiLang.g:8662:2: ( ruleEInt )
            {
            // InternalBiLang.g:8662:2: ( ruleEInt )
            // InternalBiLang.g:8663:3: ruleEInt
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
    // InternalBiLang.g:8672:1: rule__ScatterPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ScatterPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8676:1: ( ( ruleEString ) )
            // InternalBiLang.g:8677:2: ( ruleEString )
            {
            // InternalBiLang.g:8677:2: ( ruleEString )
            // InternalBiLang.g:8678:3: ruleEString
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
    // InternalBiLang.g:8687:1: rule__ScatterPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__ScatterPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8691:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:8692:2: ( ruleEFloat )
            {
            // InternalBiLang.g:8692:2: ( ruleEFloat )
            // InternalBiLang.g:8693:3: ruleEFloat
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
    // InternalBiLang.g:8702:1: rule__RadarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RadarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8706:1: ( ( RULE_ID ) )
            // InternalBiLang.g:8707:2: ( RULE_ID )
            {
            // InternalBiLang.g:8707:2: ( RULE_ID )
            // InternalBiLang.g:8708:3: RULE_ID
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
    // InternalBiLang.g:8717:1: rule__RadarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__RadarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8721:1: ( ( ruleEString ) )
            // InternalBiLang.g:8722:2: ( ruleEString )
            {
            // InternalBiLang.g:8722:2: ( ruleEString )
            // InternalBiLang.g:8723:3: ruleEString
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
    // InternalBiLang.g:8732:1: rule__RadarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__RadarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8736:1: ( ( ruleEString ) )
            // InternalBiLang.g:8737:2: ( ruleEString )
            {
            // InternalBiLang.g:8737:2: ( ruleEString )
            // InternalBiLang.g:8738:3: ruleEString
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
    // InternalBiLang.g:8747:1: rule__RadarPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__RadarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8751:1: ( ( ruleEInt ) )
            // InternalBiLang.g:8752:2: ( ruleEInt )
            {
            // InternalBiLang.g:8752:2: ( ruleEInt )
            // InternalBiLang.g:8753:3: ruleEInt
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
    // InternalBiLang.g:8762:1: rule__RadarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__RadarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8766:1: ( ( ruleEString ) )
            // InternalBiLang.g:8767:2: ( ruleEString )
            {
            // InternalBiLang.g:8767:2: ( ruleEString )
            // InternalBiLang.g:8768:3: ruleEString
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
    // InternalBiLang.g:8777:1: rule__RadarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__RadarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:8781:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:8782:2: ( ruleEFloat )
            {
            // InternalBiLang.g:8782:2: ( ruleEFloat )
            // InternalBiLang.g:8783:3: ruleEFloat
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000400007C004042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004400000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000C000000E0030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000400007C304040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000400007C004040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xF608000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xF608200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF608000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000C00000000030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0810000000000000L});

}