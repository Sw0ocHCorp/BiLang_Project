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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'+'", "'-'", "'*'", "'/'", "'mean'", "'median'", "'std'", "'= '", "'!= '", "'='", "'<'", "'>'", "'Task'", "':'", "'load'", "'[dashboard:'", "']'", "'=>'", "'processing='", "','", "'filtering='", "'plots'", "'{'", "'}'", "'.csv'", "'null replacement->'", "'.xlsx'", "'('", "'l'", "'r'", "')'", "'.'", "'bar'", "'->'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'donut'", "'pie'", "'polar'", "'scatter'", "'radar'"
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
    public static final int T__57=57;
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
    // InternalBiLang.g:87:1: ruleFileExtractor : ( ( rule__FileExtractor__Alternatives ) ) ;
    public final void ruleFileExtractor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:91:2: ( ( ( rule__FileExtractor__Alternatives ) ) )
            // InternalBiLang.g:92:2: ( ( rule__FileExtractor__Alternatives ) )
            {
            // InternalBiLang.g:92:2: ( ( rule__FileExtractor__Alternatives ) )
            // InternalBiLang.g:93:3: ( rule__FileExtractor__Alternatives )
            {
             before(grammarAccess.getFileExtractorAccess().getAlternatives()); 
            // InternalBiLang.g:94:3: ( rule__FileExtractor__Alternatives )
            // InternalBiLang.g:94:4: rule__FileExtractor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FileExtractor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileExtractorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCsvExtractor"
    // InternalBiLang.g:253:1: entryRuleCsvExtractor : ruleCsvExtractor EOF ;
    public final void entryRuleCsvExtractor() throws RecognitionException {
        try {
            // InternalBiLang.g:254:1: ( ruleCsvExtractor EOF )
            // InternalBiLang.g:255:1: ruleCsvExtractor EOF
            {
             before(grammarAccess.getCsvExtractorRule()); 
            pushFollow(FOLLOW_1);
            ruleCsvExtractor();

            state._fsp--;

             after(grammarAccess.getCsvExtractorRule()); 
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
    // $ANTLR end "entryRuleCsvExtractor"


    // $ANTLR start "ruleCsvExtractor"
    // InternalBiLang.g:262:1: ruleCsvExtractor : ( ( rule__CsvExtractor__Group__0 ) ) ;
    public final void ruleCsvExtractor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:266:2: ( ( ( rule__CsvExtractor__Group__0 ) ) )
            // InternalBiLang.g:267:2: ( ( rule__CsvExtractor__Group__0 ) )
            {
            // InternalBiLang.g:267:2: ( ( rule__CsvExtractor__Group__0 ) )
            // InternalBiLang.g:268:3: ( rule__CsvExtractor__Group__0 )
            {
             before(grammarAccess.getCsvExtractorAccess().getGroup()); 
            // InternalBiLang.g:269:3: ( rule__CsvExtractor__Group__0 )
            // InternalBiLang.g:269:4: rule__CsvExtractor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCsvExtractorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCsvExtractor"


    // $ANTLR start "entryRuleExcelExtractor"
    // InternalBiLang.g:278:1: entryRuleExcelExtractor : ruleExcelExtractor EOF ;
    public final void entryRuleExcelExtractor() throws RecognitionException {
        try {
            // InternalBiLang.g:279:1: ( ruleExcelExtractor EOF )
            // InternalBiLang.g:280:1: ruleExcelExtractor EOF
            {
             before(grammarAccess.getExcelExtractorRule()); 
            pushFollow(FOLLOW_1);
            ruleExcelExtractor();

            state._fsp--;

             after(grammarAccess.getExcelExtractorRule()); 
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
    // $ANTLR end "entryRuleExcelExtractor"


    // $ANTLR start "ruleExcelExtractor"
    // InternalBiLang.g:287:1: ruleExcelExtractor : ( ( rule__ExcelExtractor__Group__0 ) ) ;
    public final void ruleExcelExtractor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:291:2: ( ( ( rule__ExcelExtractor__Group__0 ) ) )
            // InternalBiLang.g:292:2: ( ( rule__ExcelExtractor__Group__0 ) )
            {
            // InternalBiLang.g:292:2: ( ( rule__ExcelExtractor__Group__0 ) )
            // InternalBiLang.g:293:3: ( rule__ExcelExtractor__Group__0 )
            {
             before(grammarAccess.getExcelExtractorAccess().getGroup()); 
            // InternalBiLang.g:294:3: ( rule__ExcelExtractor__Group__0 )
            // InternalBiLang.g:294:4: rule__ExcelExtractor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExcelExtractorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExcelExtractor"


    // $ANTLR start "entryRuleNullReplacement"
    // InternalBiLang.g:303:1: entryRuleNullReplacement : ruleNullReplacement EOF ;
    public final void entryRuleNullReplacement() throws RecognitionException {
        try {
            // InternalBiLang.g:304:1: ( ruleNullReplacement EOF )
            // InternalBiLang.g:305:1: ruleNullReplacement EOF
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
    // InternalBiLang.g:312:1: ruleNullReplacement : ( ( rule__NullReplacement__Group__0 ) ) ;
    public final void ruleNullReplacement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:316:2: ( ( ( rule__NullReplacement__Group__0 ) ) )
            // InternalBiLang.g:317:2: ( ( rule__NullReplacement__Group__0 ) )
            {
            // InternalBiLang.g:317:2: ( ( rule__NullReplacement__Group__0 ) )
            // InternalBiLang.g:318:3: ( rule__NullReplacement__Group__0 )
            {
             before(grammarAccess.getNullReplacementAccess().getGroup()); 
            // InternalBiLang.g:319:3: ( rule__NullReplacement__Group__0 )
            // InternalBiLang.g:319:4: rule__NullReplacement__Group__0
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
    // InternalBiLang.g:328:1: entryRuleQuantitativeFiltering : ruleQuantitativeFiltering EOF ;
    public final void entryRuleQuantitativeFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:329:1: ( ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:330:1: ruleQuantitativeFiltering EOF
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
    // InternalBiLang.g:337:1: ruleQuantitativeFiltering : ( ( rule__QuantitativeFiltering__Group__0 ) ) ;
    public final void ruleQuantitativeFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:341:2: ( ( ( rule__QuantitativeFiltering__Group__0 ) ) )
            // InternalBiLang.g:342:2: ( ( rule__QuantitativeFiltering__Group__0 ) )
            {
            // InternalBiLang.g:342:2: ( ( rule__QuantitativeFiltering__Group__0 ) )
            // InternalBiLang.g:343:3: ( rule__QuantitativeFiltering__Group__0 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getGroup()); 
            // InternalBiLang.g:344:3: ( rule__QuantitativeFiltering__Group__0 )
            // InternalBiLang.g:344:4: rule__QuantitativeFiltering__Group__0
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
    // InternalBiLang.g:353:1: entryRuleQualitativeFiltering : ruleQualitativeFiltering EOF ;
    public final void entryRuleQualitativeFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:354:1: ( ruleQualitativeFiltering EOF )
            // InternalBiLang.g:355:1: ruleQualitativeFiltering EOF
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
    // InternalBiLang.g:362:1: ruleQualitativeFiltering : ( ( rule__QualitativeFiltering__Group__0 ) ) ;
    public final void ruleQualitativeFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:366:2: ( ( ( rule__QualitativeFiltering__Group__0 ) ) )
            // InternalBiLang.g:367:2: ( ( rule__QualitativeFiltering__Group__0 ) )
            {
            // InternalBiLang.g:367:2: ( ( rule__QualitativeFiltering__Group__0 ) )
            // InternalBiLang.g:368:3: ( rule__QualitativeFiltering__Group__0 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getGroup()); 
            // InternalBiLang.g:369:3: ( rule__QualitativeFiltering__Group__0 )
            // InternalBiLang.g:369:4: rule__QualitativeFiltering__Group__0
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
    // InternalBiLang.g:378:1: entryRuleMathOperation : ruleMathOperation EOF ;
    public final void entryRuleMathOperation() throws RecognitionException {
        try {
            // InternalBiLang.g:379:1: ( ruleMathOperation EOF )
            // InternalBiLang.g:380:1: ruleMathOperation EOF
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
    // InternalBiLang.g:387:1: ruleMathOperation : ( ( rule__MathOperation__Group__0 ) ) ;
    public final void ruleMathOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:391:2: ( ( ( rule__MathOperation__Group__0 ) ) )
            // InternalBiLang.g:392:2: ( ( rule__MathOperation__Group__0 ) )
            {
            // InternalBiLang.g:392:2: ( ( rule__MathOperation__Group__0 ) )
            // InternalBiLang.g:393:3: ( rule__MathOperation__Group__0 )
            {
             before(grammarAccess.getMathOperationAccess().getGroup()); 
            // InternalBiLang.g:394:3: ( rule__MathOperation__Group__0 )
            // InternalBiLang.g:394:4: rule__MathOperation__Group__0
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
    // InternalBiLang.g:403:1: entryRuleColReference : ruleColReference EOF ;
    public final void entryRuleColReference() throws RecognitionException {
        try {
            // InternalBiLang.g:404:1: ( ruleColReference EOF )
            // InternalBiLang.g:405:1: ruleColReference EOF
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
    // InternalBiLang.g:412:1: ruleColReference : ( ( rule__ColReference__Group__0 ) ) ;
    public final void ruleColReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:416:2: ( ( ( rule__ColReference__Group__0 ) ) )
            // InternalBiLang.g:417:2: ( ( rule__ColReference__Group__0 ) )
            {
            // InternalBiLang.g:417:2: ( ( rule__ColReference__Group__0 ) )
            // InternalBiLang.g:418:3: ( rule__ColReference__Group__0 )
            {
             before(grammarAccess.getColReferenceAccess().getGroup()); 
            // InternalBiLang.g:419:3: ( rule__ColReference__Group__0 )
            // InternalBiLang.g:419:4: rule__ColReference__Group__0
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
    // InternalBiLang.g:428:1: entryRuleStatisticalOperation : ruleStatisticalOperation EOF ;
    public final void entryRuleStatisticalOperation() throws RecognitionException {
        try {
            // InternalBiLang.g:429:1: ( ruleStatisticalOperation EOF )
            // InternalBiLang.g:430:1: ruleStatisticalOperation EOF
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
    // InternalBiLang.g:437:1: ruleStatisticalOperation : ( ( rule__StatisticalOperation__Group__0 ) ) ;
    public final void ruleStatisticalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:441:2: ( ( ( rule__StatisticalOperation__Group__0 ) ) )
            // InternalBiLang.g:442:2: ( ( rule__StatisticalOperation__Group__0 ) )
            {
            // InternalBiLang.g:442:2: ( ( rule__StatisticalOperation__Group__0 ) )
            // InternalBiLang.g:443:3: ( rule__StatisticalOperation__Group__0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getGroup()); 
            // InternalBiLang.g:444:3: ( rule__StatisticalOperation__Group__0 )
            // InternalBiLang.g:444:4: rule__StatisticalOperation__Group__0
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
    // InternalBiLang.g:453:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalBiLang.g:454:1: ( ruleEFloat EOF )
            // InternalBiLang.g:455:1: ruleEFloat EOF
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
    // InternalBiLang.g:462:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:466:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalBiLang.g:467:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalBiLang.g:467:2: ( ( rule__EFloat__Group__0 ) )
            // InternalBiLang.g:468:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalBiLang.g:469:3: ( rule__EFloat__Group__0 )
            // InternalBiLang.g:469:4: rule__EFloat__Group__0
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
    // InternalBiLang.g:478:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBiLang.g:479:1: ( ruleEInt EOF )
            // InternalBiLang.g:480:1: ruleEInt EOF
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
    // InternalBiLang.g:487:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:491:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBiLang.g:492:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBiLang.g:492:2: ( ( rule__EInt__Group__0 ) )
            // InternalBiLang.g:493:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBiLang.g:494:3: ( rule__EInt__Group__0 )
            // InternalBiLang.g:494:4: rule__EInt__Group__0
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
    // InternalBiLang.g:503:1: entryRuleBarPlot : ruleBarPlot EOF ;
    public final void entryRuleBarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:504:1: ( ruleBarPlot EOF )
            // InternalBiLang.g:505:1: ruleBarPlot EOF
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
    // InternalBiLang.g:512:1: ruleBarPlot : ( ( rule__BarPlot__Group__0 ) ) ;
    public final void ruleBarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:516:2: ( ( ( rule__BarPlot__Group__0 ) ) )
            // InternalBiLang.g:517:2: ( ( rule__BarPlot__Group__0 ) )
            {
            // InternalBiLang.g:517:2: ( ( rule__BarPlot__Group__0 ) )
            // InternalBiLang.g:518:3: ( rule__BarPlot__Group__0 )
            {
             before(grammarAccess.getBarPlotAccess().getGroup()); 
            // InternalBiLang.g:519:3: ( rule__BarPlot__Group__0 )
            // InternalBiLang.g:519:4: rule__BarPlot__Group__0
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
    // InternalBiLang.g:528:1: entryRuleLinePlot : ruleLinePlot EOF ;
    public final void entryRuleLinePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:529:1: ( ruleLinePlot EOF )
            // InternalBiLang.g:530:1: ruleLinePlot EOF
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
    // InternalBiLang.g:537:1: ruleLinePlot : ( ( rule__LinePlot__Group__0 ) ) ;
    public final void ruleLinePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:541:2: ( ( ( rule__LinePlot__Group__0 ) ) )
            // InternalBiLang.g:542:2: ( ( rule__LinePlot__Group__0 ) )
            {
            // InternalBiLang.g:542:2: ( ( rule__LinePlot__Group__0 ) )
            // InternalBiLang.g:543:3: ( rule__LinePlot__Group__0 )
            {
             before(grammarAccess.getLinePlotAccess().getGroup()); 
            // InternalBiLang.g:544:3: ( rule__LinePlot__Group__0 )
            // InternalBiLang.g:544:4: rule__LinePlot__Group__0
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
    // InternalBiLang.g:553:1: entryRuleDonutPlot : ruleDonutPlot EOF ;
    public final void entryRuleDonutPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:554:1: ( ruleDonutPlot EOF )
            // InternalBiLang.g:555:1: ruleDonutPlot EOF
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
    // InternalBiLang.g:562:1: ruleDonutPlot : ( ( rule__DonutPlot__Group__0 ) ) ;
    public final void ruleDonutPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:566:2: ( ( ( rule__DonutPlot__Group__0 ) ) )
            // InternalBiLang.g:567:2: ( ( rule__DonutPlot__Group__0 ) )
            {
            // InternalBiLang.g:567:2: ( ( rule__DonutPlot__Group__0 ) )
            // InternalBiLang.g:568:3: ( rule__DonutPlot__Group__0 )
            {
             before(grammarAccess.getDonutPlotAccess().getGroup()); 
            // InternalBiLang.g:569:3: ( rule__DonutPlot__Group__0 )
            // InternalBiLang.g:569:4: rule__DonutPlot__Group__0
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
    // InternalBiLang.g:578:1: entryRulePiePlot : rulePiePlot EOF ;
    public final void entryRulePiePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:579:1: ( rulePiePlot EOF )
            // InternalBiLang.g:580:1: rulePiePlot EOF
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
    // InternalBiLang.g:587:1: rulePiePlot : ( ( rule__PiePlot__Group__0 ) ) ;
    public final void rulePiePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:591:2: ( ( ( rule__PiePlot__Group__0 ) ) )
            // InternalBiLang.g:592:2: ( ( rule__PiePlot__Group__0 ) )
            {
            // InternalBiLang.g:592:2: ( ( rule__PiePlot__Group__0 ) )
            // InternalBiLang.g:593:3: ( rule__PiePlot__Group__0 )
            {
             before(grammarAccess.getPiePlotAccess().getGroup()); 
            // InternalBiLang.g:594:3: ( rule__PiePlot__Group__0 )
            // InternalBiLang.g:594:4: rule__PiePlot__Group__0
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
    // InternalBiLang.g:603:1: entryRulePolarPlot : rulePolarPlot EOF ;
    public final void entryRulePolarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:604:1: ( rulePolarPlot EOF )
            // InternalBiLang.g:605:1: rulePolarPlot EOF
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
    // InternalBiLang.g:612:1: rulePolarPlot : ( ( rule__PolarPlot__Group__0 ) ) ;
    public final void rulePolarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:616:2: ( ( ( rule__PolarPlot__Group__0 ) ) )
            // InternalBiLang.g:617:2: ( ( rule__PolarPlot__Group__0 ) )
            {
            // InternalBiLang.g:617:2: ( ( rule__PolarPlot__Group__0 ) )
            // InternalBiLang.g:618:3: ( rule__PolarPlot__Group__0 )
            {
             before(grammarAccess.getPolarPlotAccess().getGroup()); 
            // InternalBiLang.g:619:3: ( rule__PolarPlot__Group__0 )
            // InternalBiLang.g:619:4: rule__PolarPlot__Group__0
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
    // InternalBiLang.g:628:1: entryRuleScatterPlot : ruleScatterPlot EOF ;
    public final void entryRuleScatterPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:629:1: ( ruleScatterPlot EOF )
            // InternalBiLang.g:630:1: ruleScatterPlot EOF
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
    // InternalBiLang.g:637:1: ruleScatterPlot : ( ( rule__ScatterPlot__Group__0 ) ) ;
    public final void ruleScatterPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:641:2: ( ( ( rule__ScatterPlot__Group__0 ) ) )
            // InternalBiLang.g:642:2: ( ( rule__ScatterPlot__Group__0 ) )
            {
            // InternalBiLang.g:642:2: ( ( rule__ScatterPlot__Group__0 ) )
            // InternalBiLang.g:643:3: ( rule__ScatterPlot__Group__0 )
            {
             before(grammarAccess.getScatterPlotAccess().getGroup()); 
            // InternalBiLang.g:644:3: ( rule__ScatterPlot__Group__0 )
            // InternalBiLang.g:644:4: rule__ScatterPlot__Group__0
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
    // InternalBiLang.g:653:1: entryRuleRadarPlot : ruleRadarPlot EOF ;
    public final void entryRuleRadarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:654:1: ( ruleRadarPlot EOF )
            // InternalBiLang.g:655:1: ruleRadarPlot EOF
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
    // InternalBiLang.g:662:1: ruleRadarPlot : ( ( rule__RadarPlot__Group__0 ) ) ;
    public final void ruleRadarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:666:2: ( ( ( rule__RadarPlot__Group__0 ) ) )
            // InternalBiLang.g:667:2: ( ( rule__RadarPlot__Group__0 ) )
            {
            // InternalBiLang.g:667:2: ( ( rule__RadarPlot__Group__0 ) )
            // InternalBiLang.g:668:3: ( rule__RadarPlot__Group__0 )
            {
             before(grammarAccess.getRadarPlotAccess().getGroup()); 
            // InternalBiLang.g:669:3: ( rule__RadarPlot__Group__0 )
            // InternalBiLang.g:669:4: rule__RadarPlot__Group__0
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
    // InternalBiLang.g:678:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:682:1: ( ( ( rule__MathOperator__Alternatives ) ) )
            // InternalBiLang.g:683:2: ( ( rule__MathOperator__Alternatives ) )
            {
            // InternalBiLang.g:683:2: ( ( rule__MathOperator__Alternatives ) )
            // InternalBiLang.g:684:3: ( rule__MathOperator__Alternatives )
            {
             before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:685:3: ( rule__MathOperator__Alternatives )
            // InternalBiLang.g:685:4: rule__MathOperator__Alternatives
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
    // InternalBiLang.g:694:1: ruleStatisticalOperator : ( ( rule__StatisticalOperator__Alternatives ) ) ;
    public final void ruleStatisticalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:698:1: ( ( ( rule__StatisticalOperator__Alternatives ) ) )
            // InternalBiLang.g:699:2: ( ( rule__StatisticalOperator__Alternatives ) )
            {
            // InternalBiLang.g:699:2: ( ( rule__StatisticalOperator__Alternatives ) )
            // InternalBiLang.g:700:3: ( rule__StatisticalOperator__Alternatives )
            {
             before(grammarAccess.getStatisticalOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:701:3: ( rule__StatisticalOperator__Alternatives )
            // InternalBiLang.g:701:4: rule__StatisticalOperator__Alternatives
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
    // InternalBiLang.g:710:1: ruleQualitativeOperator : ( ( rule__QualitativeOperator__Alternatives ) ) ;
    public final void ruleQualitativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:714:1: ( ( ( rule__QualitativeOperator__Alternatives ) ) )
            // InternalBiLang.g:715:2: ( ( rule__QualitativeOperator__Alternatives ) )
            {
            // InternalBiLang.g:715:2: ( ( rule__QualitativeOperator__Alternatives ) )
            // InternalBiLang.g:716:3: ( rule__QualitativeOperator__Alternatives )
            {
             before(grammarAccess.getQualitativeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:717:3: ( rule__QualitativeOperator__Alternatives )
            // InternalBiLang.g:717:4: rule__QualitativeOperator__Alternatives
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
    // InternalBiLang.g:726:1: ruleQuantitativeOperator : ( ( rule__QuantitativeOperator__Alternatives ) ) ;
    public final void ruleQuantitativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:730:1: ( ( ( rule__QuantitativeOperator__Alternatives ) ) )
            // InternalBiLang.g:731:2: ( ( rule__QuantitativeOperator__Alternatives ) )
            {
            // InternalBiLang.g:731:2: ( ( rule__QuantitativeOperator__Alternatives ) )
            // InternalBiLang.g:732:3: ( rule__QuantitativeOperator__Alternatives )
            {
             before(grammarAccess.getQuantitativeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:733:3: ( rule__QuantitativeOperator__Alternatives )
            // InternalBiLang.g:733:4: rule__QuantitativeOperator__Alternatives
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


    // $ANTLR start "rule__FileExtractor__Alternatives"
    // InternalBiLang.g:741:1: rule__FileExtractor__Alternatives : ( ( ruleCsvExtractor ) | ( ruleExcelExtractor ) );
    public final void rule__FileExtractor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:745:1: ( ( ruleCsvExtractor ) | ( ruleExcelExtractor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==39) ) {
                    alt1=2;
                }
                else if ( (LA1_1==37) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_ID) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==39) ) {
                    alt1=2;
                }
                else if ( (LA1_2==37) ) {
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
                    // InternalBiLang.g:746:2: ( ruleCsvExtractor )
                    {
                    // InternalBiLang.g:746:2: ( ruleCsvExtractor )
                    // InternalBiLang.g:747:3: ruleCsvExtractor
                    {
                     before(grammarAccess.getFileExtractorAccess().getCsvExtractorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCsvExtractor();

                    state._fsp--;

                     after(grammarAccess.getFileExtractorAccess().getCsvExtractorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:752:2: ( ruleExcelExtractor )
                    {
                    // InternalBiLang.g:752:2: ( ruleExcelExtractor )
                    // InternalBiLang.g:753:3: ruleExcelExtractor
                    {
                     before(grammarAccess.getFileExtractorAccess().getExcelExtractorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExcelExtractor();

                    state._fsp--;

                     after(grammarAccess.getFileExtractorAccess().getExcelExtractorParserRuleCall_1()); 

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
    // $ANTLR end "rule__FileExtractor__Alternatives"


    // $ANTLR start "rule__FilteringStep__Alternatives"
    // InternalBiLang.g:762:1: rule__FilteringStep__Alternatives : ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) );
    public final void rule__FilteringStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:766:1: ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=22 && LA2_1<=24)) ) {
                    alt2=1;
                }
                else if ( ((LA2_1>=20 && LA2_1<=21)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=20 && LA2_2<=21)) ) {
                    alt2=2;
                }
                else if ( ((LA2_2>=22 && LA2_2<=24)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBiLang.g:767:2: ( ruleQuantitativeFiltering )
                    {
                    // InternalBiLang.g:767:2: ( ruleQuantitativeFiltering )
                    // InternalBiLang.g:768:3: ruleQuantitativeFiltering
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
                    // InternalBiLang.g:773:2: ( ruleQualitativeFiltering )
                    {
                    // InternalBiLang.g:773:2: ( ruleQualitativeFiltering )
                    // InternalBiLang.g:774:3: ruleQualitativeFiltering
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
    // InternalBiLang.g:783:1: rule__PreprocessingStep__Alternatives : ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) );
    public final void rule__PreprocessingStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:787:1: ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 17:
            case 18:
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBiLang.g:788:2: ( ruleMathOperation )
                    {
                    // InternalBiLang.g:788:2: ( ruleMathOperation )
                    // InternalBiLang.g:789:3: ruleMathOperation
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
                    // InternalBiLang.g:794:2: ( ruleColReference )
                    {
                    // InternalBiLang.g:794:2: ( ruleColReference )
                    // InternalBiLang.g:795:3: ruleColReference
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
                    // InternalBiLang.g:800:2: ( ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:800:2: ( ruleStatisticalOperation )
                    // InternalBiLang.g:801:3: ruleStatisticalOperation
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
    // InternalBiLang.g:810:1: rule__Plot__Alternatives : ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) );
    public final void rule__Plot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:814:1: ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt4=1;
                }
                break;
            case 52:
                {
                alt4=2;
                }
                break;
            case 53:
                {
                alt4=3;
                }
                break;
            case 56:
                {
                alt4=4;
                }
                break;
            case 55:
                {
                alt4=5;
                }
                break;
            case 57:
                {
                alt4=6;
                }
                break;
            case 54:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBiLang.g:815:2: ( ruleBarPlot )
                    {
                    // InternalBiLang.g:815:2: ( ruleBarPlot )
                    // InternalBiLang.g:816:3: ruleBarPlot
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
                    // InternalBiLang.g:821:2: ( ruleLinePlot )
                    {
                    // InternalBiLang.g:821:2: ( ruleLinePlot )
                    // InternalBiLang.g:822:3: ruleLinePlot
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
                    // InternalBiLang.g:827:2: ( ruleDonutPlot )
                    {
                    // InternalBiLang.g:827:2: ( ruleDonutPlot )
                    // InternalBiLang.g:828:3: ruleDonutPlot
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
                    // InternalBiLang.g:833:2: ( ruleScatterPlot )
                    {
                    // InternalBiLang.g:833:2: ( ruleScatterPlot )
                    // InternalBiLang.g:834:3: ruleScatterPlot
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
                    // InternalBiLang.g:839:2: ( rulePolarPlot )
                    {
                    // InternalBiLang.g:839:2: ( rulePolarPlot )
                    // InternalBiLang.g:840:3: rulePolarPlot
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
                    // InternalBiLang.g:845:2: ( ruleRadarPlot )
                    {
                    // InternalBiLang.g:845:2: ( ruleRadarPlot )
                    // InternalBiLang.g:846:3: ruleRadarPlot
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
                    // InternalBiLang.g:851:2: ( rulePiePlot )
                    {
                    // InternalBiLang.g:851:2: ( rulePiePlot )
                    // InternalBiLang.g:852:3: rulePiePlot
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
    // InternalBiLang.g:861:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:865:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBiLang.g:866:2: ( RULE_STRING )
                    {
                    // InternalBiLang.g:866:2: ( RULE_STRING )
                    // InternalBiLang.g:867:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:872:2: ( RULE_ID )
                    {
                    // InternalBiLang.g:872:2: ( RULE_ID )
                    // InternalBiLang.g:873:3: RULE_ID
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
    // InternalBiLang.g:882:1: rule__NullReplacement__Alternatives_2 : ( ( ( rule__NullReplacement__LabelAssignment_2_0 ) ) | ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) ) );
    public final void rule__NullReplacement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:886:1: ( ( ( rule__NullReplacement__LabelAssignment_2_0 ) ) | ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=17 && LA6_0<=19)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBiLang.g:887:2: ( ( rule__NullReplacement__LabelAssignment_2_0 ) )
                    {
                    // InternalBiLang.g:887:2: ( ( rule__NullReplacement__LabelAssignment_2_0 ) )
                    // InternalBiLang.g:888:3: ( rule__NullReplacement__LabelAssignment_2_0 )
                    {
                     before(grammarAccess.getNullReplacementAccess().getLabelAssignment_2_0()); 
                    // InternalBiLang.g:889:3: ( rule__NullReplacement__LabelAssignment_2_0 )
                    // InternalBiLang.g:889:4: rule__NullReplacement__LabelAssignment_2_0
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
                    // InternalBiLang.g:893:2: ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) )
                    {
                    // InternalBiLang.g:893:2: ( ( rule__NullReplacement__StatisticaloperationAssignment_2_1 ) )
                    // InternalBiLang.g:894:3: ( rule__NullReplacement__StatisticaloperationAssignment_2_1 )
                    {
                     before(grammarAccess.getNullReplacementAccess().getStatisticaloperationAssignment_2_1()); 
                    // InternalBiLang.g:895:3: ( rule__NullReplacement__StatisticaloperationAssignment_2_1 )
                    // InternalBiLang.g:895:4: rule__NullReplacement__StatisticaloperationAssignment_2_1
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
    // InternalBiLang.g:903:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:907:1: ( ( 'E' ) | ( 'e' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBiLang.g:908:2: ( 'E' )
                    {
                    // InternalBiLang.g:908:2: ( 'E' )
                    // InternalBiLang.g:909:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:914:2: ( 'e' )
                    {
                    // InternalBiLang.g:914:2: ( 'e' )
                    // InternalBiLang.g:915:3: 'e'
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
    // InternalBiLang.g:924:1: rule__MathOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:928:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBiLang.g:929:2: ( ( '+' ) )
                    {
                    // InternalBiLang.g:929:2: ( ( '+' ) )
                    // InternalBiLang.g:930:3: ( '+' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:931:3: ( '+' )
                    // InternalBiLang.g:931:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:935:2: ( ( '-' ) )
                    {
                    // InternalBiLang.g:935:2: ( ( '-' ) )
                    // InternalBiLang.g:936:3: ( '-' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:937:3: ( '-' )
                    // InternalBiLang.g:937:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:941:2: ( ( '*' ) )
                    {
                    // InternalBiLang.g:941:2: ( ( '*' ) )
                    // InternalBiLang.g:942:3: ( '*' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:943:3: ( '*' )
                    // InternalBiLang.g:943:4: '*'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:947:2: ( ( '/' ) )
                    {
                    // InternalBiLang.g:947:2: ( ( '/' ) )
                    // InternalBiLang.g:948:3: ( '/' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3()); 
                    // InternalBiLang.g:949:3: ( '/' )
                    // InternalBiLang.g:949:4: '/'
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
    // InternalBiLang.g:957:1: rule__StatisticalOperator__Alternatives : ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) );
    public final void rule__StatisticalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:961:1: ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalBiLang.g:962:2: ( ( 'mean' ) )
                    {
                    // InternalBiLang.g:962:2: ( ( 'mean' ) )
                    // InternalBiLang.g:963:3: ( 'mean' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:964:3: ( 'mean' )
                    // InternalBiLang.g:964:4: 'mean'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:968:2: ( ( 'median' ) )
                    {
                    // InternalBiLang.g:968:2: ( ( 'median' ) )
                    // InternalBiLang.g:969:3: ( 'median' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:970:3: ( 'median' )
                    // InternalBiLang.g:970:4: 'median'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:974:2: ( ( 'std' ) )
                    {
                    // InternalBiLang.g:974:2: ( ( 'std' ) )
                    // InternalBiLang.g:975:3: ( 'std' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:976:3: ( 'std' )
                    // InternalBiLang.g:976:4: 'std'
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
    // InternalBiLang.g:984:1: rule__QualitativeOperator__Alternatives : ( ( ( '= ' ) ) | ( ( '!= ' ) ) );
    public final void rule__QualitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:988:1: ( ( ( '= ' ) ) | ( ( '!= ' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBiLang.g:989:2: ( ( '= ' ) )
                    {
                    // InternalBiLang.g:989:2: ( ( '= ' ) )
                    // InternalBiLang.g:990:3: ( '= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:991:3: ( '= ' )
                    // InternalBiLang.g:991:4: '= '
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:995:2: ( ( '!= ' ) )
                    {
                    // InternalBiLang.g:995:2: ( ( '!= ' ) )
                    // InternalBiLang.g:996:3: ( '!= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:997:3: ( '!= ' )
                    // InternalBiLang.g:997:4: '!= '
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
    // InternalBiLang.g:1005:1: rule__QuantitativeOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__QuantitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1009:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBiLang.g:1010:2: ( ( '=' ) )
                    {
                    // InternalBiLang.g:1010:2: ( ( '=' ) )
                    // InternalBiLang.g:1011:3: ( '=' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:1012:3: ( '=' )
                    // InternalBiLang.g:1012:4: '='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1016:2: ( ( '<' ) )
                    {
                    // InternalBiLang.g:1016:2: ( ( '<' ) )
                    // InternalBiLang.g:1017:3: ( '<' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:1018:3: ( '<' )
                    // InternalBiLang.g:1018:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:1022:2: ( ( '>' ) )
                    {
                    // InternalBiLang.g:1022:2: ( ( '>' ) )
                    // InternalBiLang.g:1023:3: ( '>' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:1024:3: ( '>' )
                    // InternalBiLang.g:1024:4: '>'
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
    // InternalBiLang.g:1032:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1036:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBiLang.g:1037:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalBiLang.g:1044:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1048:1: ( ( 'Task' ) )
            // InternalBiLang.g:1049:1: ( 'Task' )
            {
            // InternalBiLang.g:1049:1: ( 'Task' )
            // InternalBiLang.g:1050:2: 'Task'
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
    // InternalBiLang.g:1059:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1063:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBiLang.g:1064:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalBiLang.g:1071:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1075:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBiLang.g:1076:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1076:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBiLang.g:1077:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1078:2: ( rule__Task__NameAssignment_1 )
            // InternalBiLang.g:1078:3: rule__Task__NameAssignment_1
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
    // InternalBiLang.g:1086:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1090:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalBiLang.g:1091:2: rule__Task__Group__2__Impl rule__Task__Group__3
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
    // InternalBiLang.g:1098:1: rule__Task__Group__2__Impl : ( ':' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1102:1: ( ( ':' ) )
            // InternalBiLang.g:1103:1: ( ':' )
            {
            // InternalBiLang.g:1103:1: ( ':' )
            // InternalBiLang.g:1104:2: ':'
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
    // InternalBiLang.g:1113:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1117:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalBiLang.g:1118:2: rule__Task__Group__3__Impl rule__Task__Group__4
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
    // InternalBiLang.g:1125:1: rule__Task__Group__3__Impl : ( 'load' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1129:1: ( ( 'load' ) )
            // InternalBiLang.g:1130:1: ( 'load' )
            {
            // InternalBiLang.g:1130:1: ( 'load' )
            // InternalBiLang.g:1131:2: 'load'
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
    // InternalBiLang.g:1140:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1144:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalBiLang.g:1145:2: rule__Task__Group__4__Impl rule__Task__Group__5
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
    // InternalBiLang.g:1152:1: rule__Task__Group__4__Impl : ( ( rule__Task__FileextractorAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1156:1: ( ( ( rule__Task__FileextractorAssignment_4 ) ) )
            // InternalBiLang.g:1157:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            {
            // InternalBiLang.g:1157:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            // InternalBiLang.g:1158:2: ( rule__Task__FileextractorAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_4()); 
            // InternalBiLang.g:1159:2: ( rule__Task__FileextractorAssignment_4 )
            // InternalBiLang.g:1159:3: rule__Task__FileextractorAssignment_4
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
    // InternalBiLang.g:1167:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1171:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalBiLang.g:1172:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalBiLang.g:1179:1: rule__Task__Group__5__Impl : ( ( rule__Task__DatafilteringAssignment_5 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1183:1: ( ( ( rule__Task__DatafilteringAssignment_5 )? ) )
            // InternalBiLang.g:1184:1: ( ( rule__Task__DatafilteringAssignment_5 )? )
            {
            // InternalBiLang.g:1184:1: ( ( rule__Task__DatafilteringAssignment_5 )? )
            // InternalBiLang.g:1185:2: ( rule__Task__DatafilteringAssignment_5 )?
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_5()); 
            // InternalBiLang.g:1186:2: ( rule__Task__DatafilteringAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBiLang.g:1186:3: rule__Task__DatafilteringAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__DatafilteringAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getDatafilteringAssignment_5()); 

            }


            }

        }
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
    // InternalBiLang.g:1194:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1198:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalBiLang.g:1199:2: rule__Task__Group__6__Impl rule__Task__Group__7
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
    // InternalBiLang.g:1206:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )* ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1210:1: ( ( ( rule__Task__Group_6__0 )* ) )
            // InternalBiLang.g:1211:1: ( ( rule__Task__Group_6__0 )* )
            {
            // InternalBiLang.g:1211:1: ( ( rule__Task__Group_6__0 )* )
            // InternalBiLang.g:1212:2: ( rule__Task__Group_6__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalBiLang.g:1213:2: ( rule__Task__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBiLang.g:1213:3: rule__Task__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Task__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalBiLang.g:1221:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1225:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalBiLang.g:1226:2: rule__Task__Group__7__Impl rule__Task__Group__8
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
    // InternalBiLang.g:1233:1: rule__Task__Group__7__Impl : ( '[dashboard:' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1237:1: ( ( '[dashboard:' ) )
            // InternalBiLang.g:1238:1: ( '[dashboard:' )
            {
            // InternalBiLang.g:1238:1: ( '[dashboard:' )
            // InternalBiLang.g:1239:2: '[dashboard:'
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
    // InternalBiLang.g:1248:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1252:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalBiLang.g:1253:2: rule__Task__Group__8__Impl rule__Task__Group__9
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
    // InternalBiLang.g:1260:1: rule__Task__Group__8__Impl : ( ( rule__Task__DashboardAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1264:1: ( ( ( rule__Task__DashboardAssignment_8 ) ) )
            // InternalBiLang.g:1265:1: ( ( rule__Task__DashboardAssignment_8 ) )
            {
            // InternalBiLang.g:1265:1: ( ( rule__Task__DashboardAssignment_8 ) )
            // InternalBiLang.g:1266:2: ( rule__Task__DashboardAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getDashboardAssignment_8()); 
            // InternalBiLang.g:1267:2: ( rule__Task__DashboardAssignment_8 )
            // InternalBiLang.g:1267:3: rule__Task__DashboardAssignment_8
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
    // InternalBiLang.g:1275:1: rule__Task__Group__9 : rule__Task__Group__9__Impl ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1279:1: ( rule__Task__Group__9__Impl )
            // InternalBiLang.g:1280:2: rule__Task__Group__9__Impl
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
    // InternalBiLang.g:1286:1: rule__Task__Group__9__Impl : ( ']' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1290:1: ( ( ']' ) )
            // InternalBiLang.g:1291:1: ( ']' )
            {
            // InternalBiLang.g:1291:1: ( ']' )
            // InternalBiLang.g:1292:2: ']'
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


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalBiLang.g:1302:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1306:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalBiLang.g:1307:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalBiLang.g:1314:1: rule__Task__Group_6__0__Impl : ( ( rule__Task__FileextractorAssignment_6_0 ) ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1318:1: ( ( ( rule__Task__FileextractorAssignment_6_0 ) ) )
            // InternalBiLang.g:1319:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            {
            // InternalBiLang.g:1319:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            // InternalBiLang.g:1320:2: ( rule__Task__FileextractorAssignment_6_0 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0()); 
            // InternalBiLang.g:1321:2: ( rule__Task__FileextractorAssignment_6_0 )
            // InternalBiLang.g:1321:3: rule__Task__FileextractorAssignment_6_0
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
    // InternalBiLang.g:1329:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1333:1: ( rule__Task__Group_6__1__Impl )
            // InternalBiLang.g:1334:2: rule__Task__Group_6__1__Impl
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
    // InternalBiLang.g:1340:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DatafilteringAssignment_6_1 )? ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1344:1: ( ( ( rule__Task__DatafilteringAssignment_6_1 )? ) )
            // InternalBiLang.g:1345:1: ( ( rule__Task__DatafilteringAssignment_6_1 )? )
            {
            // InternalBiLang.g:1345:1: ( ( rule__Task__DatafilteringAssignment_6_1 )? )
            // InternalBiLang.g:1346:2: ( rule__Task__DatafilteringAssignment_6_1 )?
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1()); 
            // InternalBiLang.g:1347:2: ( rule__Task__DatafilteringAssignment_6_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBiLang.g:1347:3: rule__Task__DatafilteringAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__DatafilteringAssignment_6_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataFiltering__Group__0"
    // InternalBiLang.g:1356:1: rule__DataFiltering__Group__0 : rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 ;
    public final void rule__DataFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1360:1: ( rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 )
            // InternalBiLang.g:1361:2: rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1
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
    // InternalBiLang.g:1368:1: rule__DataFiltering__Group__0__Impl : ( '=>' ) ;
    public final void rule__DataFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1372:1: ( ( '=>' ) )
            // InternalBiLang.g:1373:1: ( '=>' )
            {
            // InternalBiLang.g:1373:1: ( '=>' )
            // InternalBiLang.g:1374:2: '=>'
            {
             before(grammarAccess.getDataFilteringAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBiLang.g:1383:1: rule__DataFiltering__Group__1 : rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 ;
    public final void rule__DataFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1387:1: ( rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 )
            // InternalBiLang.g:1388:2: rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:1395:1: rule__DataFiltering__Group__1__Impl : ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) ;
    public final void rule__DataFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1399:1: ( ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) )
            // InternalBiLang.g:1400:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            {
            // InternalBiLang.g:1400:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            // InternalBiLang.g:1401:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_1()); 
            // InternalBiLang.g:1402:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            // InternalBiLang.g:1402:3: rule__DataFiltering__FileextractorAssignment_1
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
    // InternalBiLang.g:1410:1: rule__DataFiltering__Group__2 : rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 ;
    public final void rule__DataFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1414:1: ( rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 )
            // InternalBiLang.g:1415:2: rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:1422:1: rule__DataFiltering__Group__2__Impl : ( ( rule__DataFiltering__Group_2__0 )? ) ;
    public final void rule__DataFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1426:1: ( ( ( rule__DataFiltering__Group_2__0 )? ) )
            // InternalBiLang.g:1427:1: ( ( rule__DataFiltering__Group_2__0 )? )
            {
            // InternalBiLang.g:1427:1: ( ( rule__DataFiltering__Group_2__0 )? )
            // InternalBiLang.g:1428:2: ( rule__DataFiltering__Group_2__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2()); 
            // InternalBiLang.g:1429:2: ( rule__DataFiltering__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:1429:3: rule__DataFiltering__Group_2__0
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
    // InternalBiLang.g:1437:1: rule__DataFiltering__Group__3 : rule__DataFiltering__Group__3__Impl ;
    public final void rule__DataFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1441:1: ( rule__DataFiltering__Group__3__Impl )
            // InternalBiLang.g:1442:2: rule__DataFiltering__Group__3__Impl
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
    // InternalBiLang.g:1448:1: rule__DataFiltering__Group__3__Impl : ( ( rule__DataFiltering__Group_3__0 )? ) ;
    public final void rule__DataFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1452:1: ( ( ( rule__DataFiltering__Group_3__0 )? ) )
            // InternalBiLang.g:1453:1: ( ( rule__DataFiltering__Group_3__0 )? )
            {
            // InternalBiLang.g:1453:1: ( ( rule__DataFiltering__Group_3__0 )? )
            // InternalBiLang.g:1454:2: ( rule__DataFiltering__Group_3__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_3()); 
            // InternalBiLang.g:1455:2: ( rule__DataFiltering__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBiLang.g:1455:3: rule__DataFiltering__Group_3__0
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
    // InternalBiLang.g:1464:1: rule__DataFiltering__Group_2__0 : rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 ;
    public final void rule__DataFiltering__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1468:1: ( rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 )
            // InternalBiLang.g:1469:2: rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBiLang.g:1476:1: rule__DataFiltering__Group_2__0__Impl : ( 'processing=' ) ;
    public final void rule__DataFiltering__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1480:1: ( ( 'processing=' ) )
            // InternalBiLang.g:1481:1: ( 'processing=' )
            {
            // InternalBiLang.g:1481:1: ( 'processing=' )
            // InternalBiLang.g:1482:2: 'processing='
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBiLang.g:1491:1: rule__DataFiltering__Group_2__1 : rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 ;
    public final void rule__DataFiltering__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1495:1: ( rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 )
            // InternalBiLang.g:1496:2: rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalBiLang.g:1503:1: rule__DataFiltering__Group_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1507:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) ) )
            // InternalBiLang.g:1508:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) )
            {
            // InternalBiLang.g:1508:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) )
            // InternalBiLang.g:1509:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1()); 
            // InternalBiLang.g:1510:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1 )
            // InternalBiLang.g:1510:3: rule__DataFiltering__ProcessingstepAssignment_2_1
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
    // InternalBiLang.g:1518:1: rule__DataFiltering__Group_2__2 : rule__DataFiltering__Group_2__2__Impl ;
    public final void rule__DataFiltering__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1522:1: ( rule__DataFiltering__Group_2__2__Impl )
            // InternalBiLang.g:1523:2: rule__DataFiltering__Group_2__2__Impl
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
    // InternalBiLang.g:1529:1: rule__DataFiltering__Group_2__2__Impl : ( ( rule__DataFiltering__Group_2_2__0 )* ) ;
    public final void rule__DataFiltering__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1533:1: ( ( ( rule__DataFiltering__Group_2_2__0 )* ) )
            // InternalBiLang.g:1534:1: ( ( rule__DataFiltering__Group_2_2__0 )* )
            {
            // InternalBiLang.g:1534:1: ( ( rule__DataFiltering__Group_2_2__0 )* )
            // InternalBiLang.g:1535:2: ( rule__DataFiltering__Group_2_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_2()); 
            // InternalBiLang.g:1536:2: ( rule__DataFiltering__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBiLang.g:1536:3: rule__DataFiltering__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DataFiltering__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBiLang.g:1545:1: rule__DataFiltering__Group_2_2__0 : rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 ;
    public final void rule__DataFiltering__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1549:1: ( rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 )
            // InternalBiLang.g:1550:2: rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalBiLang.g:1557:1: rule__DataFiltering__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1561:1: ( ( ',' ) )
            // InternalBiLang.g:1562:1: ( ',' )
            {
            // InternalBiLang.g:1562:1: ( ',' )
            // InternalBiLang.g:1563:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_2_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBiLang.g:1572:1: rule__DataFiltering__Group_2_2__1 : rule__DataFiltering__Group_2_2__1__Impl ;
    public final void rule__DataFiltering__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1576:1: ( rule__DataFiltering__Group_2_2__1__Impl )
            // InternalBiLang.g:1577:2: rule__DataFiltering__Group_2_2__1__Impl
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
    // InternalBiLang.g:1583:1: rule__DataFiltering__Group_2_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1587:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) ) )
            // InternalBiLang.g:1588:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) )
            {
            // InternalBiLang.g:1588:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) )
            // InternalBiLang.g:1589:2: ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_2_1()); 
            // InternalBiLang.g:1590:2: ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 )
            // InternalBiLang.g:1590:3: rule__DataFiltering__ProcessingstepAssignment_2_2_1
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
    // InternalBiLang.g:1599:1: rule__DataFiltering__Group_3__0 : rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1 ;
    public final void rule__DataFiltering__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1603:1: ( rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1 )
            // InternalBiLang.g:1604:2: rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1
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
    // InternalBiLang.g:1611:1: rule__DataFiltering__Group_3__0__Impl : ( 'filtering=' ) ;
    public final void rule__DataFiltering__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1615:1: ( ( 'filtering=' ) )
            // InternalBiLang.g:1616:1: ( 'filtering=' )
            {
            // InternalBiLang.g:1616:1: ( 'filtering=' )
            // InternalBiLang.g:1617:2: 'filtering='
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBiLang.g:1626:1: rule__DataFiltering__Group_3__1 : rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2 ;
    public final void rule__DataFiltering__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1630:1: ( rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2 )
            // InternalBiLang.g:1631:2: rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalBiLang.g:1638:1: rule__DataFiltering__Group_3__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) ) ;
    public final void rule__DataFiltering__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1642:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) ) )
            // InternalBiLang.g:1643:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) )
            {
            // InternalBiLang.g:1643:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) )
            // InternalBiLang.g:1644:2: ( rule__DataFiltering__FilteringstepAssignment_3_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_1()); 
            // InternalBiLang.g:1645:2: ( rule__DataFiltering__FilteringstepAssignment_3_1 )
            // InternalBiLang.g:1645:3: rule__DataFiltering__FilteringstepAssignment_3_1
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
    // InternalBiLang.g:1653:1: rule__DataFiltering__Group_3__2 : rule__DataFiltering__Group_3__2__Impl ;
    public final void rule__DataFiltering__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1657:1: ( rule__DataFiltering__Group_3__2__Impl )
            // InternalBiLang.g:1658:2: rule__DataFiltering__Group_3__2__Impl
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
    // InternalBiLang.g:1664:1: rule__DataFiltering__Group_3__2__Impl : ( ( rule__DataFiltering__Group_3_2__0 )* ) ;
    public final void rule__DataFiltering__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1668:1: ( ( ( rule__DataFiltering__Group_3_2__0 )* ) )
            // InternalBiLang.g:1669:1: ( ( rule__DataFiltering__Group_3_2__0 )* )
            {
            // InternalBiLang.g:1669:1: ( ( rule__DataFiltering__Group_3_2__0 )* )
            // InternalBiLang.g:1670:2: ( rule__DataFiltering__Group_3_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_3_2()); 
            // InternalBiLang.g:1671:2: ( rule__DataFiltering__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBiLang.g:1671:3: rule__DataFiltering__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__DataFiltering__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalBiLang.g:1680:1: rule__DataFiltering__Group_3_2__0 : rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1 ;
    public final void rule__DataFiltering__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1684:1: ( rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1 )
            // InternalBiLang.g:1685:2: rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1
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
    // InternalBiLang.g:1692:1: rule__DataFiltering__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1696:1: ( ( ',' ) )
            // InternalBiLang.g:1697:1: ( ',' )
            {
            // InternalBiLang.g:1697:1: ( ',' )
            // InternalBiLang.g:1698:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_3_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBiLang.g:1707:1: rule__DataFiltering__Group_3_2__1 : rule__DataFiltering__Group_3_2__1__Impl ;
    public final void rule__DataFiltering__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1711:1: ( rule__DataFiltering__Group_3_2__1__Impl )
            // InternalBiLang.g:1712:2: rule__DataFiltering__Group_3_2__1__Impl
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
    // InternalBiLang.g:1718:1: rule__DataFiltering__Group_3_2__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) ) ;
    public final void rule__DataFiltering__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1722:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) ) )
            // InternalBiLang.g:1723:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) )
            {
            // InternalBiLang.g:1723:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) )
            // InternalBiLang.g:1724:2: ( rule__DataFiltering__FilteringstepAssignment_3_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_2_1()); 
            // InternalBiLang.g:1725:2: ( rule__DataFiltering__FilteringstepAssignment_3_2_1 )
            // InternalBiLang.g:1725:3: rule__DataFiltering__FilteringstepAssignment_3_2_1
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
    // InternalBiLang.g:1734:1: rule__DashBoard__Group__0 : rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 ;
    public final void rule__DashBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1738:1: ( rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 )
            // InternalBiLang.g:1739:2: rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1
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
    // InternalBiLang.g:1746:1: rule__DashBoard__Group__0__Impl : ( ( rule__DashBoard__NameAssignment_0 ) ) ;
    public final void rule__DashBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1750:1: ( ( ( rule__DashBoard__NameAssignment_0 ) ) )
            // InternalBiLang.g:1751:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            {
            // InternalBiLang.g:1751:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            // InternalBiLang.g:1752:2: ( rule__DashBoard__NameAssignment_0 )
            {
             before(grammarAccess.getDashBoardAccess().getNameAssignment_0()); 
            // InternalBiLang.g:1753:2: ( rule__DashBoard__NameAssignment_0 )
            // InternalBiLang.g:1753:3: rule__DashBoard__NameAssignment_0
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
    // InternalBiLang.g:1761:1: rule__DashBoard__Group__1 : rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 ;
    public final void rule__DashBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1765:1: ( rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 )
            // InternalBiLang.g:1766:2: rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2
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
    // InternalBiLang.g:1773:1: rule__DashBoard__Group__1__Impl : ( '=>' ) ;
    public final void rule__DashBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1777:1: ( ( '=>' ) )
            // InternalBiLang.g:1778:1: ( '=>' )
            {
            // InternalBiLang.g:1778:1: ( '=>' )
            // InternalBiLang.g:1779:2: '=>'
            {
             before(grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBiLang.g:1788:1: rule__DashBoard__Group__2 : rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 ;
    public final void rule__DashBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1792:1: ( rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 )
            // InternalBiLang.g:1793:2: rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__DashBoard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__3();

            state._fsp--;


            }

        }
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
    // InternalBiLang.g:1800:1: rule__DashBoard__Group__2__Impl : ( ( rule__DashBoard__FileextractorAssignment_2 ) ) ;
    public final void rule__DashBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1804:1: ( ( ( rule__DashBoard__FileextractorAssignment_2 ) ) )
            // InternalBiLang.g:1805:1: ( ( rule__DashBoard__FileextractorAssignment_2 ) )
            {
            // InternalBiLang.g:1805:1: ( ( rule__DashBoard__FileextractorAssignment_2 ) )
            // InternalBiLang.g:1806:2: ( rule__DashBoard__FileextractorAssignment_2 )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2()); 
            // InternalBiLang.g:1807:2: ( rule__DashBoard__FileextractorAssignment_2 )
            // InternalBiLang.g:1807:3: rule__DashBoard__FileextractorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__FileextractorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__DashBoard__Group__3"
    // InternalBiLang.g:1815:1: rule__DashBoard__Group__3 : rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 ;
    public final void rule__DashBoard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1819:1: ( rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 )
            // InternalBiLang.g:1820:2: rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__DashBoard__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__3"


    // $ANTLR start "rule__DashBoard__Group__3__Impl"
    // InternalBiLang.g:1827:1: rule__DashBoard__Group__3__Impl : ( 'plots' ) ;
    public final void rule__DashBoard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1831:1: ( ( 'plots' ) )
            // InternalBiLang.g:1832:1: ( 'plots' )
            {
            // InternalBiLang.g:1832:1: ( 'plots' )
            // InternalBiLang.g:1833:2: 'plots'
            {
             before(grammarAccess.getDashBoardAccess().getPlotsKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getPlotsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__3__Impl"


    // $ANTLR start "rule__DashBoard__Group__4"
    // InternalBiLang.g:1842:1: rule__DashBoard__Group__4 : rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 ;
    public final void rule__DashBoard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1846:1: ( rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 )
            // InternalBiLang.g:1847:2: rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__DashBoard__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__4"


    // $ANTLR start "rule__DashBoard__Group__4__Impl"
    // InternalBiLang.g:1854:1: rule__DashBoard__Group__4__Impl : ( '{' ) ;
    public final void rule__DashBoard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1858:1: ( ( '{' ) )
            // InternalBiLang.g:1859:1: ( '{' )
            {
            // InternalBiLang.g:1859:1: ( '{' )
            // InternalBiLang.g:1860:2: '{'
            {
             before(grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__4__Impl"


    // $ANTLR start "rule__DashBoard__Group__5"
    // InternalBiLang.g:1869:1: rule__DashBoard__Group__5 : rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6 ;
    public final void rule__DashBoard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1873:1: ( rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6 )
            // InternalBiLang.g:1874:2: rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__DashBoard__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__5"


    // $ANTLR start "rule__DashBoard__Group__5__Impl"
    // InternalBiLang.g:1881:1: rule__DashBoard__Group__5__Impl : ( ( rule__DashBoard__PlotAssignment_5 ) ) ;
    public final void rule__DashBoard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1885:1: ( ( ( rule__DashBoard__PlotAssignment_5 ) ) )
            // InternalBiLang.g:1886:1: ( ( rule__DashBoard__PlotAssignment_5 ) )
            {
            // InternalBiLang.g:1886:1: ( ( rule__DashBoard__PlotAssignment_5 ) )
            // InternalBiLang.g:1887:2: ( rule__DashBoard__PlotAssignment_5 )
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_5()); 
            // InternalBiLang.g:1888:2: ( rule__DashBoard__PlotAssignment_5 )
            // InternalBiLang.g:1888:3: rule__DashBoard__PlotAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__PlotAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getPlotAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__5__Impl"


    // $ANTLR start "rule__DashBoard__Group__6"
    // InternalBiLang.g:1896:1: rule__DashBoard__Group__6 : rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7 ;
    public final void rule__DashBoard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1900:1: ( rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7 )
            // InternalBiLang.g:1901:2: rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__DashBoard__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__6"


    // $ANTLR start "rule__DashBoard__Group__6__Impl"
    // InternalBiLang.g:1908:1: rule__DashBoard__Group__6__Impl : ( ( rule__DashBoard__PlotAssignment_6 )* ) ;
    public final void rule__DashBoard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1912:1: ( ( ( rule__DashBoard__PlotAssignment_6 )* ) )
            // InternalBiLang.g:1913:1: ( ( rule__DashBoard__PlotAssignment_6 )* )
            {
            // InternalBiLang.g:1913:1: ( ( rule__DashBoard__PlotAssignment_6 )* )
            // InternalBiLang.g:1914:2: ( rule__DashBoard__PlotAssignment_6 )*
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_6()); 
            // InternalBiLang.g:1915:2: ( rule__DashBoard__PlotAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45||(LA19_0>=52 && LA19_0<=57)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBiLang.g:1915:3: rule__DashBoard__PlotAssignment_6
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__DashBoard__PlotAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDashBoardAccess().getPlotAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__6__Impl"


    // $ANTLR start "rule__DashBoard__Group__7"
    // InternalBiLang.g:1923:1: rule__DashBoard__Group__7 : rule__DashBoard__Group__7__Impl ;
    public final void rule__DashBoard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1927:1: ( rule__DashBoard__Group__7__Impl )
            // InternalBiLang.g:1928:2: rule__DashBoard__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__7"


    // $ANTLR start "rule__DashBoard__Group__7__Impl"
    // InternalBiLang.g:1934:1: rule__DashBoard__Group__7__Impl : ( '}' ) ;
    public final void rule__DashBoard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1938:1: ( ( '}' ) )
            // InternalBiLang.g:1939:1: ( '}' )
            {
            // InternalBiLang.g:1939:1: ( '}' )
            // InternalBiLang.g:1940:2: '}'
            {
             before(grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group__7__Impl"


    // $ANTLR start "rule__CsvExtractor__Group__0"
    // InternalBiLang.g:1950:1: rule__CsvExtractor__Group__0 : rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1 ;
    public final void rule__CsvExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1954:1: ( rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1 )
            // InternalBiLang.g:1955:2: rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CsvExtractor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__0"


    // $ANTLR start "rule__CsvExtractor__Group__0__Impl"
    // InternalBiLang.g:1962:1: rule__CsvExtractor__Group__0__Impl : ( () ) ;
    public final void rule__CsvExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1966:1: ( ( () ) )
            // InternalBiLang.g:1967:1: ( () )
            {
            // InternalBiLang.g:1967:1: ( () )
            // InternalBiLang.g:1968:2: ()
            {
             before(grammarAccess.getCsvExtractorAccess().getCsvExtractorAction_0()); 
            // InternalBiLang.g:1969:2: ()
            // InternalBiLang.g:1969:3: 
            {
            }

             after(grammarAccess.getCsvExtractorAccess().getCsvExtractorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__0__Impl"


    // $ANTLR start "rule__CsvExtractor__Group__1"
    // InternalBiLang.g:1977:1: rule__CsvExtractor__Group__1 : rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2 ;
    public final void rule__CsvExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1981:1: ( rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2 )
            // InternalBiLang.g:1982:2: rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__CsvExtractor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__1"


    // $ANTLR start "rule__CsvExtractor__Group__1__Impl"
    // InternalBiLang.g:1989:1: rule__CsvExtractor__Group__1__Impl : ( ( rule__CsvExtractor__NameAssignment_1 ) ) ;
    public final void rule__CsvExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1993:1: ( ( ( rule__CsvExtractor__NameAssignment_1 ) ) )
            // InternalBiLang.g:1994:1: ( ( rule__CsvExtractor__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1994:1: ( ( rule__CsvExtractor__NameAssignment_1 ) )
            // InternalBiLang.g:1995:2: ( rule__CsvExtractor__NameAssignment_1 )
            {
             before(grammarAccess.getCsvExtractorAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1996:2: ( rule__CsvExtractor__NameAssignment_1 )
            // InternalBiLang.g:1996:3: rule__CsvExtractor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCsvExtractorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__1__Impl"


    // $ANTLR start "rule__CsvExtractor__Group__2"
    // InternalBiLang.g:2004:1: rule__CsvExtractor__Group__2 : rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3 ;
    public final void rule__CsvExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2008:1: ( rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3 )
            // InternalBiLang.g:2009:2: rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__CsvExtractor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__2"


    // $ANTLR start "rule__CsvExtractor__Group__2__Impl"
    // InternalBiLang.g:2016:1: rule__CsvExtractor__Group__2__Impl : ( '.csv' ) ;
    public final void rule__CsvExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2020:1: ( ( '.csv' ) )
            // InternalBiLang.g:2021:1: ( '.csv' )
            {
            // InternalBiLang.g:2021:1: ( '.csv' )
            // InternalBiLang.g:2022:2: '.csv'
            {
             before(grammarAccess.getCsvExtractorAccess().getCsvKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCsvExtractorAccess().getCsvKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__2__Impl"


    // $ANTLR start "rule__CsvExtractor__Group__3"
    // InternalBiLang.g:2031:1: rule__CsvExtractor__Group__3 : rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4 ;
    public final void rule__CsvExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2035:1: ( rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4 )
            // InternalBiLang.g:2036:2: rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CsvExtractor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__3"


    // $ANTLR start "rule__CsvExtractor__Group__3__Impl"
    // InternalBiLang.g:2043:1: rule__CsvExtractor__Group__3__Impl : ( '=>' ) ;
    public final void rule__CsvExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2047:1: ( ( '=>' ) )
            // InternalBiLang.g:2048:1: ( '=>' )
            {
            // InternalBiLang.g:2048:1: ( '=>' )
            // InternalBiLang.g:2049:2: '=>'
            {
             before(grammarAccess.getCsvExtractorAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCsvExtractorAccess().getEqualsSignGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__3__Impl"


    // $ANTLR start "rule__CsvExtractor__Group__4"
    // InternalBiLang.g:2058:1: rule__CsvExtractor__Group__4 : rule__CsvExtractor__Group__4__Impl rule__CsvExtractor__Group__5 ;
    public final void rule__CsvExtractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2062:1: ( rule__CsvExtractor__Group__4__Impl rule__CsvExtractor__Group__5 )
            // InternalBiLang.g:2063:2: rule__CsvExtractor__Group__4__Impl rule__CsvExtractor__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__CsvExtractor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__4"


    // $ANTLR start "rule__CsvExtractor__Group__4__Impl"
    // InternalBiLang.g:2070:1: rule__CsvExtractor__Group__4__Impl : ( ( rule__CsvExtractor__PathAssignment_4 ) ) ;
    public final void rule__CsvExtractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2074:1: ( ( ( rule__CsvExtractor__PathAssignment_4 ) ) )
            // InternalBiLang.g:2075:1: ( ( rule__CsvExtractor__PathAssignment_4 ) )
            {
            // InternalBiLang.g:2075:1: ( ( rule__CsvExtractor__PathAssignment_4 ) )
            // InternalBiLang.g:2076:2: ( rule__CsvExtractor__PathAssignment_4 )
            {
             before(grammarAccess.getCsvExtractorAccess().getPathAssignment_4()); 
            // InternalBiLang.g:2077:2: ( rule__CsvExtractor__PathAssignment_4 )
            // InternalBiLang.g:2077:3: rule__CsvExtractor__PathAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__PathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCsvExtractorAccess().getPathAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__4__Impl"


    // $ANTLR start "rule__CsvExtractor__Group__5"
    // InternalBiLang.g:2085:1: rule__CsvExtractor__Group__5 : rule__CsvExtractor__Group__5__Impl ;
    public final void rule__CsvExtractor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2089:1: ( rule__CsvExtractor__Group__5__Impl )
            // InternalBiLang.g:2090:2: rule__CsvExtractor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__5"


    // $ANTLR start "rule__CsvExtractor__Group__5__Impl"
    // InternalBiLang.g:2096:1: rule__CsvExtractor__Group__5__Impl : ( ( rule__CsvExtractor__Group_5__0 )? ) ;
    public final void rule__CsvExtractor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2100:1: ( ( ( rule__CsvExtractor__Group_5__0 )? ) )
            // InternalBiLang.g:2101:1: ( ( rule__CsvExtractor__Group_5__0 )? )
            {
            // InternalBiLang.g:2101:1: ( ( rule__CsvExtractor__Group_5__0 )? )
            // InternalBiLang.g:2102:2: ( rule__CsvExtractor__Group_5__0 )?
            {
             before(grammarAccess.getCsvExtractorAccess().getGroup_5()); 
            // InternalBiLang.g:2103:2: ( rule__CsvExtractor__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBiLang.g:2103:3: rule__CsvExtractor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CsvExtractor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCsvExtractorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group__5__Impl"


    // $ANTLR start "rule__CsvExtractor__Group_5__0"
    // InternalBiLang.g:2112:1: rule__CsvExtractor__Group_5__0 : rule__CsvExtractor__Group_5__0__Impl rule__CsvExtractor__Group_5__1 ;
    public final void rule__CsvExtractor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2116:1: ( rule__CsvExtractor__Group_5__0__Impl rule__CsvExtractor__Group_5__1 )
            // InternalBiLang.g:2117:2: rule__CsvExtractor__Group_5__0__Impl rule__CsvExtractor__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__CsvExtractor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5__0"


    // $ANTLR start "rule__CsvExtractor__Group_5__0__Impl"
    // InternalBiLang.g:2124:1: rule__CsvExtractor__Group_5__0__Impl : ( 'null replacement->' ) ;
    public final void rule__CsvExtractor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2128:1: ( ( 'null replacement->' ) )
            // InternalBiLang.g:2129:1: ( 'null replacement->' )
            {
            // InternalBiLang.g:2129:1: ( 'null replacement->' )
            // InternalBiLang.g:2130:2: 'null replacement->'
            {
             before(grammarAccess.getCsvExtractorAccess().getNullReplacementKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCsvExtractorAccess().getNullReplacementKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5__0__Impl"


    // $ANTLR start "rule__CsvExtractor__Group_5__1"
    // InternalBiLang.g:2139:1: rule__CsvExtractor__Group_5__1 : rule__CsvExtractor__Group_5__1__Impl rule__CsvExtractor__Group_5__2 ;
    public final void rule__CsvExtractor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2143:1: ( rule__CsvExtractor__Group_5__1__Impl rule__CsvExtractor__Group_5__2 )
            // InternalBiLang.g:2144:2: rule__CsvExtractor__Group_5__1__Impl rule__CsvExtractor__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__CsvExtractor__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5__1"


    // $ANTLR start "rule__CsvExtractor__Group_5__1__Impl"
    // InternalBiLang.g:2151:1: rule__CsvExtractor__Group_5__1__Impl : ( ( rule__CsvExtractor__NullreplacementAssignment_5_1 ) ) ;
    public final void rule__CsvExtractor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2155:1: ( ( ( rule__CsvExtractor__NullreplacementAssignment_5_1 ) ) )
            // InternalBiLang.g:2156:1: ( ( rule__CsvExtractor__NullreplacementAssignment_5_1 ) )
            {
            // InternalBiLang.g:2156:1: ( ( rule__CsvExtractor__NullreplacementAssignment_5_1 ) )
            // InternalBiLang.g:2157:2: ( rule__CsvExtractor__NullreplacementAssignment_5_1 )
            {
             before(grammarAccess.getCsvExtractorAccess().getNullreplacementAssignment_5_1()); 
            // InternalBiLang.g:2158:2: ( rule__CsvExtractor__NullreplacementAssignment_5_1 )
            // InternalBiLang.g:2158:3: rule__CsvExtractor__NullreplacementAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__NullreplacementAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCsvExtractorAccess().getNullreplacementAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5__1__Impl"


    // $ANTLR start "rule__CsvExtractor__Group_5__2"
    // InternalBiLang.g:2166:1: rule__CsvExtractor__Group_5__2 : rule__CsvExtractor__Group_5__2__Impl ;
    public final void rule__CsvExtractor__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2170:1: ( rule__CsvExtractor__Group_5__2__Impl )
            // InternalBiLang.g:2171:2: rule__CsvExtractor__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5__2"


    // $ANTLR start "rule__CsvExtractor__Group_5__2__Impl"
    // InternalBiLang.g:2177:1: rule__CsvExtractor__Group_5__2__Impl : ( ( rule__CsvExtractor__Group_5_2__0 )* ) ;
    public final void rule__CsvExtractor__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2181:1: ( ( ( rule__CsvExtractor__Group_5_2__0 )* ) )
            // InternalBiLang.g:2182:1: ( ( rule__CsvExtractor__Group_5_2__0 )* )
            {
            // InternalBiLang.g:2182:1: ( ( rule__CsvExtractor__Group_5_2__0 )* )
            // InternalBiLang.g:2183:2: ( rule__CsvExtractor__Group_5_2__0 )*
            {
             before(grammarAccess.getCsvExtractorAccess().getGroup_5_2()); 
            // InternalBiLang.g:2184:2: ( rule__CsvExtractor__Group_5_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBiLang.g:2184:3: rule__CsvExtractor__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__CsvExtractor__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCsvExtractorAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5__2__Impl"


    // $ANTLR start "rule__CsvExtractor__Group_5_2__0"
    // InternalBiLang.g:2193:1: rule__CsvExtractor__Group_5_2__0 : rule__CsvExtractor__Group_5_2__0__Impl rule__CsvExtractor__Group_5_2__1 ;
    public final void rule__CsvExtractor__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2197:1: ( rule__CsvExtractor__Group_5_2__0__Impl rule__CsvExtractor__Group_5_2__1 )
            // InternalBiLang.g:2198:2: rule__CsvExtractor__Group_5_2__0__Impl rule__CsvExtractor__Group_5_2__1
            {
            pushFollow(FOLLOW_6);
            rule__CsvExtractor__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5_2__0"


    // $ANTLR start "rule__CsvExtractor__Group_5_2__0__Impl"
    // InternalBiLang.g:2205:1: rule__CsvExtractor__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__CsvExtractor__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2209:1: ( ( ',' ) )
            // InternalBiLang.g:2210:1: ( ',' )
            {
            // InternalBiLang.g:2210:1: ( ',' )
            // InternalBiLang.g:2211:2: ','
            {
             before(grammarAccess.getCsvExtractorAccess().getCommaKeyword_5_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCsvExtractorAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5_2__0__Impl"


    // $ANTLR start "rule__CsvExtractor__Group_5_2__1"
    // InternalBiLang.g:2220:1: rule__CsvExtractor__Group_5_2__1 : rule__CsvExtractor__Group_5_2__1__Impl ;
    public final void rule__CsvExtractor__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2224:1: ( rule__CsvExtractor__Group_5_2__1__Impl )
            // InternalBiLang.g:2225:2: rule__CsvExtractor__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5_2__1"


    // $ANTLR start "rule__CsvExtractor__Group_5_2__1__Impl"
    // InternalBiLang.g:2231:1: rule__CsvExtractor__Group_5_2__1__Impl : ( ( rule__CsvExtractor__NullreplacementAssignment_5_2_1 ) ) ;
    public final void rule__CsvExtractor__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2235:1: ( ( ( rule__CsvExtractor__NullreplacementAssignment_5_2_1 ) ) )
            // InternalBiLang.g:2236:1: ( ( rule__CsvExtractor__NullreplacementAssignment_5_2_1 ) )
            {
            // InternalBiLang.g:2236:1: ( ( rule__CsvExtractor__NullreplacementAssignment_5_2_1 ) )
            // InternalBiLang.g:2237:2: ( rule__CsvExtractor__NullreplacementAssignment_5_2_1 )
            {
             before(grammarAccess.getCsvExtractorAccess().getNullreplacementAssignment_5_2_1()); 
            // InternalBiLang.g:2238:2: ( rule__CsvExtractor__NullreplacementAssignment_5_2_1 )
            // InternalBiLang.g:2238:3: rule__CsvExtractor__NullreplacementAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__NullreplacementAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCsvExtractorAccess().getNullreplacementAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__Group_5_2__1__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group__0"
    // InternalBiLang.g:2247:1: rule__ExcelExtractor__Group__0 : rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1 ;
    public final void rule__ExcelExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2251:1: ( rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1 )
            // InternalBiLang.g:2252:2: rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExcelExtractor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__0"


    // $ANTLR start "rule__ExcelExtractor__Group__0__Impl"
    // InternalBiLang.g:2259:1: rule__ExcelExtractor__Group__0__Impl : ( () ) ;
    public final void rule__ExcelExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2263:1: ( ( () ) )
            // InternalBiLang.g:2264:1: ( () )
            {
            // InternalBiLang.g:2264:1: ( () )
            // InternalBiLang.g:2265:2: ()
            {
             before(grammarAccess.getExcelExtractorAccess().getExcelExtractorAction_0()); 
            // InternalBiLang.g:2266:2: ()
            // InternalBiLang.g:2266:3: 
            {
            }

             after(grammarAccess.getExcelExtractorAccess().getExcelExtractorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__0__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group__1"
    // InternalBiLang.g:2274:1: rule__ExcelExtractor__Group__1 : rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2 ;
    public final void rule__ExcelExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2278:1: ( rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2 )
            // InternalBiLang.g:2279:2: rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ExcelExtractor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__1"


    // $ANTLR start "rule__ExcelExtractor__Group__1__Impl"
    // InternalBiLang.g:2286:1: rule__ExcelExtractor__Group__1__Impl : ( ( rule__ExcelExtractor__NameAssignment_1 ) ) ;
    public final void rule__ExcelExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2290:1: ( ( ( rule__ExcelExtractor__NameAssignment_1 ) ) )
            // InternalBiLang.g:2291:1: ( ( rule__ExcelExtractor__NameAssignment_1 ) )
            {
            // InternalBiLang.g:2291:1: ( ( rule__ExcelExtractor__NameAssignment_1 ) )
            // InternalBiLang.g:2292:2: ( rule__ExcelExtractor__NameAssignment_1 )
            {
             before(grammarAccess.getExcelExtractorAccess().getNameAssignment_1()); 
            // InternalBiLang.g:2293:2: ( rule__ExcelExtractor__NameAssignment_1 )
            // InternalBiLang.g:2293:3: rule__ExcelExtractor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExcelExtractorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__1__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group__2"
    // InternalBiLang.g:2301:1: rule__ExcelExtractor__Group__2 : rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3 ;
    public final void rule__ExcelExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2305:1: ( rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3 )
            // InternalBiLang.g:2306:2: rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ExcelExtractor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__2"


    // $ANTLR start "rule__ExcelExtractor__Group__2__Impl"
    // InternalBiLang.g:2313:1: rule__ExcelExtractor__Group__2__Impl : ( '.xlsx' ) ;
    public final void rule__ExcelExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2317:1: ( ( '.xlsx' ) )
            // InternalBiLang.g:2318:1: ( '.xlsx' )
            {
            // InternalBiLang.g:2318:1: ( '.xlsx' )
            // InternalBiLang.g:2319:2: '.xlsx'
            {
             before(grammarAccess.getExcelExtractorAccess().getXlsxKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExcelExtractorAccess().getXlsxKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__2__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group__3"
    // InternalBiLang.g:2328:1: rule__ExcelExtractor__Group__3 : rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4 ;
    public final void rule__ExcelExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2332:1: ( rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4 )
            // InternalBiLang.g:2333:2: rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ExcelExtractor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__3"


    // $ANTLR start "rule__ExcelExtractor__Group__3__Impl"
    // InternalBiLang.g:2340:1: rule__ExcelExtractor__Group__3__Impl : ( '=>' ) ;
    public final void rule__ExcelExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2344:1: ( ( '=>' ) )
            // InternalBiLang.g:2345:1: ( '=>' )
            {
            // InternalBiLang.g:2345:1: ( '=>' )
            // InternalBiLang.g:2346:2: '=>'
            {
             before(grammarAccess.getExcelExtractorAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExcelExtractorAccess().getEqualsSignGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__3__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group__4"
    // InternalBiLang.g:2355:1: rule__ExcelExtractor__Group__4 : rule__ExcelExtractor__Group__4__Impl rule__ExcelExtractor__Group__5 ;
    public final void rule__ExcelExtractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2359:1: ( rule__ExcelExtractor__Group__4__Impl rule__ExcelExtractor__Group__5 )
            // InternalBiLang.g:2360:2: rule__ExcelExtractor__Group__4__Impl rule__ExcelExtractor__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__ExcelExtractor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__4"


    // $ANTLR start "rule__ExcelExtractor__Group__4__Impl"
    // InternalBiLang.g:2367:1: rule__ExcelExtractor__Group__4__Impl : ( ( rule__ExcelExtractor__PathAssignment_4 ) ) ;
    public final void rule__ExcelExtractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2371:1: ( ( ( rule__ExcelExtractor__PathAssignment_4 ) ) )
            // InternalBiLang.g:2372:1: ( ( rule__ExcelExtractor__PathAssignment_4 ) )
            {
            // InternalBiLang.g:2372:1: ( ( rule__ExcelExtractor__PathAssignment_4 ) )
            // InternalBiLang.g:2373:2: ( rule__ExcelExtractor__PathAssignment_4 )
            {
             before(grammarAccess.getExcelExtractorAccess().getPathAssignment_4()); 
            // InternalBiLang.g:2374:2: ( rule__ExcelExtractor__PathAssignment_4 )
            // InternalBiLang.g:2374:3: rule__ExcelExtractor__PathAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__PathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExcelExtractorAccess().getPathAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__4__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group__5"
    // InternalBiLang.g:2382:1: rule__ExcelExtractor__Group__5 : rule__ExcelExtractor__Group__5__Impl ;
    public final void rule__ExcelExtractor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2386:1: ( rule__ExcelExtractor__Group__5__Impl )
            // InternalBiLang.g:2387:2: rule__ExcelExtractor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__5"


    // $ANTLR start "rule__ExcelExtractor__Group__5__Impl"
    // InternalBiLang.g:2393:1: rule__ExcelExtractor__Group__5__Impl : ( ( rule__ExcelExtractor__Group_5__0 )? ) ;
    public final void rule__ExcelExtractor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2397:1: ( ( ( rule__ExcelExtractor__Group_5__0 )? ) )
            // InternalBiLang.g:2398:1: ( ( rule__ExcelExtractor__Group_5__0 )? )
            {
            // InternalBiLang.g:2398:1: ( ( rule__ExcelExtractor__Group_5__0 )? )
            // InternalBiLang.g:2399:2: ( rule__ExcelExtractor__Group_5__0 )?
            {
             before(grammarAccess.getExcelExtractorAccess().getGroup_5()); 
            // InternalBiLang.g:2400:2: ( rule__ExcelExtractor__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBiLang.g:2400:3: rule__ExcelExtractor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExcelExtractor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExcelExtractorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group__5__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group_5__0"
    // InternalBiLang.g:2409:1: rule__ExcelExtractor__Group_5__0 : rule__ExcelExtractor__Group_5__0__Impl rule__ExcelExtractor__Group_5__1 ;
    public final void rule__ExcelExtractor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2413:1: ( rule__ExcelExtractor__Group_5__0__Impl rule__ExcelExtractor__Group_5__1 )
            // InternalBiLang.g:2414:2: rule__ExcelExtractor__Group_5__0__Impl rule__ExcelExtractor__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__ExcelExtractor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5__0"


    // $ANTLR start "rule__ExcelExtractor__Group_5__0__Impl"
    // InternalBiLang.g:2421:1: rule__ExcelExtractor__Group_5__0__Impl : ( 'null replacement->' ) ;
    public final void rule__ExcelExtractor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2425:1: ( ( 'null replacement->' ) )
            // InternalBiLang.g:2426:1: ( 'null replacement->' )
            {
            // InternalBiLang.g:2426:1: ( 'null replacement->' )
            // InternalBiLang.g:2427:2: 'null replacement->'
            {
             before(grammarAccess.getExcelExtractorAccess().getNullReplacementKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExcelExtractorAccess().getNullReplacementKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5__0__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group_5__1"
    // InternalBiLang.g:2436:1: rule__ExcelExtractor__Group_5__1 : rule__ExcelExtractor__Group_5__1__Impl rule__ExcelExtractor__Group_5__2 ;
    public final void rule__ExcelExtractor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2440:1: ( rule__ExcelExtractor__Group_5__1__Impl rule__ExcelExtractor__Group_5__2 )
            // InternalBiLang.g:2441:2: rule__ExcelExtractor__Group_5__1__Impl rule__ExcelExtractor__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__ExcelExtractor__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5__1"


    // $ANTLR start "rule__ExcelExtractor__Group_5__1__Impl"
    // InternalBiLang.g:2448:1: rule__ExcelExtractor__Group_5__1__Impl : ( ( rule__ExcelExtractor__NullreplacementAssignment_5_1 ) ) ;
    public final void rule__ExcelExtractor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2452:1: ( ( ( rule__ExcelExtractor__NullreplacementAssignment_5_1 ) ) )
            // InternalBiLang.g:2453:1: ( ( rule__ExcelExtractor__NullreplacementAssignment_5_1 ) )
            {
            // InternalBiLang.g:2453:1: ( ( rule__ExcelExtractor__NullreplacementAssignment_5_1 ) )
            // InternalBiLang.g:2454:2: ( rule__ExcelExtractor__NullreplacementAssignment_5_1 )
            {
             before(grammarAccess.getExcelExtractorAccess().getNullreplacementAssignment_5_1()); 
            // InternalBiLang.g:2455:2: ( rule__ExcelExtractor__NullreplacementAssignment_5_1 )
            // InternalBiLang.g:2455:3: rule__ExcelExtractor__NullreplacementAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__NullreplacementAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExcelExtractorAccess().getNullreplacementAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5__1__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group_5__2"
    // InternalBiLang.g:2463:1: rule__ExcelExtractor__Group_5__2 : rule__ExcelExtractor__Group_5__2__Impl ;
    public final void rule__ExcelExtractor__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2467:1: ( rule__ExcelExtractor__Group_5__2__Impl )
            // InternalBiLang.g:2468:2: rule__ExcelExtractor__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5__2"


    // $ANTLR start "rule__ExcelExtractor__Group_5__2__Impl"
    // InternalBiLang.g:2474:1: rule__ExcelExtractor__Group_5__2__Impl : ( ( rule__ExcelExtractor__Group_5_2__0 )* ) ;
    public final void rule__ExcelExtractor__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2478:1: ( ( ( rule__ExcelExtractor__Group_5_2__0 )* ) )
            // InternalBiLang.g:2479:1: ( ( rule__ExcelExtractor__Group_5_2__0 )* )
            {
            // InternalBiLang.g:2479:1: ( ( rule__ExcelExtractor__Group_5_2__0 )* )
            // InternalBiLang.g:2480:2: ( rule__ExcelExtractor__Group_5_2__0 )*
            {
             before(grammarAccess.getExcelExtractorAccess().getGroup_5_2()); 
            // InternalBiLang.g:2481:2: ( rule__ExcelExtractor__Group_5_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBiLang.g:2481:3: rule__ExcelExtractor__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ExcelExtractor__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getExcelExtractorAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5__2__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group_5_2__0"
    // InternalBiLang.g:2490:1: rule__ExcelExtractor__Group_5_2__0 : rule__ExcelExtractor__Group_5_2__0__Impl rule__ExcelExtractor__Group_5_2__1 ;
    public final void rule__ExcelExtractor__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2494:1: ( rule__ExcelExtractor__Group_5_2__0__Impl rule__ExcelExtractor__Group_5_2__1 )
            // InternalBiLang.g:2495:2: rule__ExcelExtractor__Group_5_2__0__Impl rule__ExcelExtractor__Group_5_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ExcelExtractor__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5_2__0"


    // $ANTLR start "rule__ExcelExtractor__Group_5_2__0__Impl"
    // InternalBiLang.g:2502:1: rule__ExcelExtractor__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ExcelExtractor__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2506:1: ( ( ',' ) )
            // InternalBiLang.g:2507:1: ( ',' )
            {
            // InternalBiLang.g:2507:1: ( ',' )
            // InternalBiLang.g:2508:2: ','
            {
             before(grammarAccess.getExcelExtractorAccess().getCommaKeyword_5_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExcelExtractorAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5_2__0__Impl"


    // $ANTLR start "rule__ExcelExtractor__Group_5_2__1"
    // InternalBiLang.g:2517:1: rule__ExcelExtractor__Group_5_2__1 : rule__ExcelExtractor__Group_5_2__1__Impl ;
    public final void rule__ExcelExtractor__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2521:1: ( rule__ExcelExtractor__Group_5_2__1__Impl )
            // InternalBiLang.g:2522:2: rule__ExcelExtractor__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5_2__1"


    // $ANTLR start "rule__ExcelExtractor__Group_5_2__1__Impl"
    // InternalBiLang.g:2528:1: rule__ExcelExtractor__Group_5_2__1__Impl : ( ( rule__ExcelExtractor__NullreplacementAssignment_5_2_1 ) ) ;
    public final void rule__ExcelExtractor__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2532:1: ( ( ( rule__ExcelExtractor__NullreplacementAssignment_5_2_1 ) ) )
            // InternalBiLang.g:2533:1: ( ( rule__ExcelExtractor__NullreplacementAssignment_5_2_1 ) )
            {
            // InternalBiLang.g:2533:1: ( ( rule__ExcelExtractor__NullreplacementAssignment_5_2_1 ) )
            // InternalBiLang.g:2534:2: ( rule__ExcelExtractor__NullreplacementAssignment_5_2_1 )
            {
             before(grammarAccess.getExcelExtractorAccess().getNullreplacementAssignment_5_2_1()); 
            // InternalBiLang.g:2535:2: ( rule__ExcelExtractor__NullreplacementAssignment_5_2_1 )
            // InternalBiLang.g:2535:3: rule__ExcelExtractor__NullreplacementAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__NullreplacementAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExcelExtractorAccess().getNullreplacementAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__Group_5_2__1__Impl"


    // $ANTLR start "rule__NullReplacement__Group__0"
    // InternalBiLang.g:2544:1: rule__NullReplacement__Group__0 : rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1 ;
    public final void rule__NullReplacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2548:1: ( rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1 )
            // InternalBiLang.g:2549:2: rule__NullReplacement__Group__0__Impl rule__NullReplacement__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalBiLang.g:2556:1: rule__NullReplacement__Group__0__Impl : ( ( rule__NullReplacement__ColNameAssignment_0 ) ) ;
    public final void rule__NullReplacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2560:1: ( ( ( rule__NullReplacement__ColNameAssignment_0 ) ) )
            // InternalBiLang.g:2561:1: ( ( rule__NullReplacement__ColNameAssignment_0 ) )
            {
            // InternalBiLang.g:2561:1: ( ( rule__NullReplacement__ColNameAssignment_0 ) )
            // InternalBiLang.g:2562:2: ( rule__NullReplacement__ColNameAssignment_0 )
            {
             before(grammarAccess.getNullReplacementAccess().getColNameAssignment_0()); 
            // InternalBiLang.g:2563:2: ( rule__NullReplacement__ColNameAssignment_0 )
            // InternalBiLang.g:2563:3: rule__NullReplacement__ColNameAssignment_0
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
    // InternalBiLang.g:2571:1: rule__NullReplacement__Group__1 : rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2 ;
    public final void rule__NullReplacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2575:1: ( rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2 )
            // InternalBiLang.g:2576:2: rule__NullReplacement__Group__1__Impl rule__NullReplacement__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalBiLang.g:2583:1: rule__NullReplacement__Group__1__Impl : ( '=' ) ;
    public final void rule__NullReplacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2587:1: ( ( '=' ) )
            // InternalBiLang.g:2588:1: ( '=' )
            {
            // InternalBiLang.g:2588:1: ( '=' )
            // InternalBiLang.g:2589:2: '='
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
    // InternalBiLang.g:2598:1: rule__NullReplacement__Group__2 : rule__NullReplacement__Group__2__Impl ;
    public final void rule__NullReplacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2602:1: ( rule__NullReplacement__Group__2__Impl )
            // InternalBiLang.g:2603:2: rule__NullReplacement__Group__2__Impl
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
    // InternalBiLang.g:2609:1: rule__NullReplacement__Group__2__Impl : ( ( rule__NullReplacement__Alternatives_2 ) ) ;
    public final void rule__NullReplacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2613:1: ( ( ( rule__NullReplacement__Alternatives_2 ) ) )
            // InternalBiLang.g:2614:1: ( ( rule__NullReplacement__Alternatives_2 ) )
            {
            // InternalBiLang.g:2614:1: ( ( rule__NullReplacement__Alternatives_2 ) )
            // InternalBiLang.g:2615:2: ( rule__NullReplacement__Alternatives_2 )
            {
             before(grammarAccess.getNullReplacementAccess().getAlternatives_2()); 
            // InternalBiLang.g:2616:2: ( rule__NullReplacement__Alternatives_2 )
            // InternalBiLang.g:2616:3: rule__NullReplacement__Alternatives_2
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
    // InternalBiLang.g:2625:1: rule__QuantitativeFiltering__Group__0 : rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 ;
    public final void rule__QuantitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2629:1: ( rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 )
            // InternalBiLang.g:2630:2: rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1
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
    // InternalBiLang.g:2637:1: rule__QuantitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QuantitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2641:1: ( ( () ) )
            // InternalBiLang.g:2642:1: ( () )
            {
            // InternalBiLang.g:2642:1: ( () )
            // InternalBiLang.g:2643:2: ()
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0()); 
            // InternalBiLang.g:2644:2: ()
            // InternalBiLang.g:2644:3: 
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
    // InternalBiLang.g:2652:1: rule__QuantitativeFiltering__Group__1 : rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 ;
    public final void rule__QuantitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2656:1: ( rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 )
            // InternalBiLang.g:2657:2: rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:2664:1: rule__QuantitativeFiltering__Group__1__Impl : ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QuantitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2668:1: ( ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:2669:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:2669:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:2670:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:2671:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:2671:3: rule__QuantitativeFiltering__AxisAssignment_1
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
    // InternalBiLang.g:2679:1: rule__QuantitativeFiltering__Group__2 : rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 ;
    public final void rule__QuantitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2683:1: ( rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 )
            // InternalBiLang.g:2684:2: rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:2691:1: rule__QuantitativeFiltering__Group__2__Impl : ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QuantitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2695:1: ( ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2696:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2696:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:2697:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2698:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:2698:3: rule__QuantitativeFiltering__OperatorAssignment_2
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
    // InternalBiLang.g:2706:1: rule__QuantitativeFiltering__Group__3 : rule__QuantitativeFiltering__Group__3__Impl ;
    public final void rule__QuantitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2710:1: ( rule__QuantitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:2711:2: rule__QuantitativeFiltering__Group__3__Impl
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
    // InternalBiLang.g:2717:1: rule__QuantitativeFiltering__Group__3__Impl : ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) ;
    public final void rule__QuantitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2721:1: ( ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) )
            // InternalBiLang.g:2722:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            {
            // InternalBiLang.g:2722:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            // InternalBiLang.g:2723:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_3()); 
            // InternalBiLang.g:2724:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            // InternalBiLang.g:2724:3: rule__QuantitativeFiltering__ValuesAssignment_3
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
    // InternalBiLang.g:2733:1: rule__QualitativeFiltering__Group__0 : rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 ;
    public final void rule__QualitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2737:1: ( rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 )
            // InternalBiLang.g:2738:2: rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1
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
    // InternalBiLang.g:2745:1: rule__QualitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QualitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2749:1: ( ( () ) )
            // InternalBiLang.g:2750:1: ( () )
            {
            // InternalBiLang.g:2750:1: ( () )
            // InternalBiLang.g:2751:2: ()
            {
             before(grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0()); 
            // InternalBiLang.g:2752:2: ()
            // InternalBiLang.g:2752:3: 
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
    // InternalBiLang.g:2760:1: rule__QualitativeFiltering__Group__1 : rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 ;
    public final void rule__QualitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2764:1: ( rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 )
            // InternalBiLang.g:2765:2: rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalBiLang.g:2772:1: rule__QualitativeFiltering__Group__1__Impl : ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QualitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2776:1: ( ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:2777:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:2777:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:2778:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:2779:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:2779:3: rule__QualitativeFiltering__AxisAssignment_1
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
    // InternalBiLang.g:2787:1: rule__QualitativeFiltering__Group__2 : rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 ;
    public final void rule__QualitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2791:1: ( rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 )
            // InternalBiLang.g:2792:2: rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3
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
    // InternalBiLang.g:2799:1: rule__QualitativeFiltering__Group__2__Impl : ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QualitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2803:1: ( ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2804:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2804:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:2805:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2806:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:2806:3: rule__QualitativeFiltering__OperatorAssignment_2
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
    // InternalBiLang.g:2814:1: rule__QualitativeFiltering__Group__3 : rule__QualitativeFiltering__Group__3__Impl ;
    public final void rule__QualitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2818:1: ( rule__QualitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:2819:2: rule__QualitativeFiltering__Group__3__Impl
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
    // InternalBiLang.g:2825:1: rule__QualitativeFiltering__Group__3__Impl : ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) ;
    public final void rule__QualitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2829:1: ( ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) )
            // InternalBiLang.g:2830:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            {
            // InternalBiLang.g:2830:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            // InternalBiLang.g:2831:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_3()); 
            // InternalBiLang.g:2832:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            // InternalBiLang.g:2832:3: rule__QualitativeFiltering__LabelsAssignment_3
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
    // InternalBiLang.g:2841:1: rule__MathOperation__Group__0 : rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 ;
    public final void rule__MathOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2845:1: ( rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 )
            // InternalBiLang.g:2846:2: rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalBiLang.g:2853:1: rule__MathOperation__Group__0__Impl : ( ( '(' )? ) ;
    public final void rule__MathOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2857:1: ( ( ( '(' )? ) )
            // InternalBiLang.g:2858:1: ( ( '(' )? )
            {
            // InternalBiLang.g:2858:1: ( ( '(' )? )
            // InternalBiLang.g:2859:2: ( '(' )?
            {
             before(grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_0()); 
            // InternalBiLang.g:2860:2: ( '(' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBiLang.g:2860:3: '('
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalBiLang.g:2868:1: rule__MathOperation__Group__1 : rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 ;
    public final void rule__MathOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2872:1: ( rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 )
            // InternalBiLang.g:2873:2: rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalBiLang.g:2880:1: rule__MathOperation__Group__1__Impl : ( 'l' ) ;
    public final void rule__MathOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2884:1: ( ( 'l' ) )
            // InternalBiLang.g:2885:1: ( 'l' )
            {
            // InternalBiLang.g:2885:1: ( 'l' )
            // InternalBiLang.g:2886:2: 'l'
            {
             before(grammarAccess.getMathOperationAccess().getLKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalBiLang.g:2895:1: rule__MathOperation__Group__2 : rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 ;
    public final void rule__MathOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2899:1: ( rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 )
            // InternalBiLang.g:2900:2: rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalBiLang.g:2907:1: rule__MathOperation__Group__2__Impl : ( ( rule__MathOperation__LsideAssignment_2 ) ) ;
    public final void rule__MathOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2911:1: ( ( ( rule__MathOperation__LsideAssignment_2 ) ) )
            // InternalBiLang.g:2912:1: ( ( rule__MathOperation__LsideAssignment_2 ) )
            {
            // InternalBiLang.g:2912:1: ( ( rule__MathOperation__LsideAssignment_2 ) )
            // InternalBiLang.g:2913:2: ( rule__MathOperation__LsideAssignment_2 )
            {
             before(grammarAccess.getMathOperationAccess().getLsideAssignment_2()); 
            // InternalBiLang.g:2914:2: ( rule__MathOperation__LsideAssignment_2 )
            // InternalBiLang.g:2914:3: rule__MathOperation__LsideAssignment_2
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
    // InternalBiLang.g:2922:1: rule__MathOperation__Group__3 : rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 ;
    public final void rule__MathOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2926:1: ( rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 )
            // InternalBiLang.g:2927:2: rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalBiLang.g:2934:1: rule__MathOperation__Group__3__Impl : ( ( rule__MathOperation__OperatorAssignment_3 ) ) ;
    public final void rule__MathOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2938:1: ( ( ( rule__MathOperation__OperatorAssignment_3 ) ) )
            // InternalBiLang.g:2939:1: ( ( rule__MathOperation__OperatorAssignment_3 ) )
            {
            // InternalBiLang.g:2939:1: ( ( rule__MathOperation__OperatorAssignment_3 ) )
            // InternalBiLang.g:2940:2: ( rule__MathOperation__OperatorAssignment_3 )
            {
             before(grammarAccess.getMathOperationAccess().getOperatorAssignment_3()); 
            // InternalBiLang.g:2941:2: ( rule__MathOperation__OperatorAssignment_3 )
            // InternalBiLang.g:2941:3: rule__MathOperation__OperatorAssignment_3
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
    // InternalBiLang.g:2949:1: rule__MathOperation__Group__4 : rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 ;
    public final void rule__MathOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2953:1: ( rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 )
            // InternalBiLang.g:2954:2: rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalBiLang.g:2961:1: rule__MathOperation__Group__4__Impl : ( 'r' ) ;
    public final void rule__MathOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2965:1: ( ( 'r' ) )
            // InternalBiLang.g:2966:1: ( 'r' )
            {
            // InternalBiLang.g:2966:1: ( 'r' )
            // InternalBiLang.g:2967:2: 'r'
            {
             before(grammarAccess.getMathOperationAccess().getRKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBiLang.g:2976:1: rule__MathOperation__Group__5 : rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 ;
    public final void rule__MathOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2980:1: ( rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 )
            // InternalBiLang.g:2981:2: rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalBiLang.g:2988:1: rule__MathOperation__Group__5__Impl : ( ( rule__MathOperation__RsideAssignment_5 ) ) ;
    public final void rule__MathOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2992:1: ( ( ( rule__MathOperation__RsideAssignment_5 ) ) )
            // InternalBiLang.g:2993:1: ( ( rule__MathOperation__RsideAssignment_5 ) )
            {
            // InternalBiLang.g:2993:1: ( ( rule__MathOperation__RsideAssignment_5 ) )
            // InternalBiLang.g:2994:2: ( rule__MathOperation__RsideAssignment_5 )
            {
             before(grammarAccess.getMathOperationAccess().getRsideAssignment_5()); 
            // InternalBiLang.g:2995:2: ( rule__MathOperation__RsideAssignment_5 )
            // InternalBiLang.g:2995:3: rule__MathOperation__RsideAssignment_5
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
    // InternalBiLang.g:3003:1: rule__MathOperation__Group__6 : rule__MathOperation__Group__6__Impl ;
    public final void rule__MathOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3007:1: ( rule__MathOperation__Group__6__Impl )
            // InternalBiLang.g:3008:2: rule__MathOperation__Group__6__Impl
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
    // InternalBiLang.g:3014:1: rule__MathOperation__Group__6__Impl : ( ( ')' )? ) ;
    public final void rule__MathOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3018:1: ( ( ( ')' )? ) )
            // InternalBiLang.g:3019:1: ( ( ')' )? )
            {
            // InternalBiLang.g:3019:1: ( ( ')' )? )
            // InternalBiLang.g:3020:2: ( ')' )?
            {
             before(grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_6()); 
            // InternalBiLang.g:3021:2: ( ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:3021:3: ')'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalBiLang.g:3030:1: rule__ColReference__Group__0 : rule__ColReference__Group__0__Impl rule__ColReference__Group__1 ;
    public final void rule__ColReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3034:1: ( rule__ColReference__Group__0__Impl rule__ColReference__Group__1 )
            // InternalBiLang.g:3035:2: rule__ColReference__Group__0__Impl rule__ColReference__Group__1
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
    // InternalBiLang.g:3042:1: rule__ColReference__Group__0__Impl : ( () ) ;
    public final void rule__ColReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3046:1: ( ( () ) )
            // InternalBiLang.g:3047:1: ( () )
            {
            // InternalBiLang.g:3047:1: ( () )
            // InternalBiLang.g:3048:2: ()
            {
             before(grammarAccess.getColReferenceAccess().getColReferenceAction_0()); 
            // InternalBiLang.g:3049:2: ()
            // InternalBiLang.g:3049:3: 
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
    // InternalBiLang.g:3057:1: rule__ColReference__Group__1 : rule__ColReference__Group__1__Impl ;
    public final void rule__ColReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3061:1: ( rule__ColReference__Group__1__Impl )
            // InternalBiLang.g:3062:2: rule__ColReference__Group__1__Impl
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
    // InternalBiLang.g:3068:1: rule__ColReference__Group__1__Impl : ( ( rule__ColReference__TargetAssignment_1 ) ) ;
    public final void rule__ColReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3072:1: ( ( ( rule__ColReference__TargetAssignment_1 ) ) )
            // InternalBiLang.g:3073:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            {
            // InternalBiLang.g:3073:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            // InternalBiLang.g:3074:2: ( rule__ColReference__TargetAssignment_1 )
            {
             before(grammarAccess.getColReferenceAccess().getTargetAssignment_1()); 
            // InternalBiLang.g:3075:2: ( rule__ColReference__TargetAssignment_1 )
            // InternalBiLang.g:3075:3: rule__ColReference__TargetAssignment_1
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
    // InternalBiLang.g:3084:1: rule__StatisticalOperation__Group__0 : rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 ;
    public final void rule__StatisticalOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3088:1: ( rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 )
            // InternalBiLang.g:3089:2: rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBiLang.g:3096:1: rule__StatisticalOperation__Group__0__Impl : ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) ;
    public final void rule__StatisticalOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3100:1: ( ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) )
            // InternalBiLang.g:3101:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            {
            // InternalBiLang.g:3101:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            // InternalBiLang.g:3102:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getOperatorAssignment_0()); 
            // InternalBiLang.g:3103:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            // InternalBiLang.g:3103:3: rule__StatisticalOperation__OperatorAssignment_0
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
    // InternalBiLang.g:3111:1: rule__StatisticalOperation__Group__1 : rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 ;
    public final void rule__StatisticalOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3115:1: ( rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 )
            // InternalBiLang.g:3116:2: rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2
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
    // InternalBiLang.g:3123:1: rule__StatisticalOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__StatisticalOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3127:1: ( ( '(' ) )
            // InternalBiLang.g:3128:1: ( '(' )
            {
            // InternalBiLang.g:3128:1: ( '(' )
            // InternalBiLang.g:3129:2: '('
            {
             before(grammarAccess.getStatisticalOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalBiLang.g:3138:1: rule__StatisticalOperation__Group__2 : rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 ;
    public final void rule__StatisticalOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3142:1: ( rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 )
            // InternalBiLang.g:3143:2: rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalBiLang.g:3150:1: rule__StatisticalOperation__Group__2__Impl : ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) ;
    public final void rule__StatisticalOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3154:1: ( ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) )
            // InternalBiLang.g:3155:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            {
            // InternalBiLang.g:3155:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            // InternalBiLang.g:3156:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getColreferenceAssignment_2()); 
            // InternalBiLang.g:3157:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            // InternalBiLang.g:3157:3: rule__StatisticalOperation__ColreferenceAssignment_2
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
    // InternalBiLang.g:3165:1: rule__StatisticalOperation__Group__3 : rule__StatisticalOperation__Group__3__Impl ;
    public final void rule__StatisticalOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3169:1: ( rule__StatisticalOperation__Group__3__Impl )
            // InternalBiLang.g:3170:2: rule__StatisticalOperation__Group__3__Impl
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
    // InternalBiLang.g:3176:1: rule__StatisticalOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__StatisticalOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3180:1: ( ( ')' ) )
            // InternalBiLang.g:3181:1: ( ')' )
            {
            // InternalBiLang.g:3181:1: ( ')' )
            // InternalBiLang.g:3182:2: ')'
            {
             before(grammarAccess.getStatisticalOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBiLang.g:3192:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3196:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalBiLang.g:3197:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:3204:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3208:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3209:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3209:1: ( ( '-' )? )
            // InternalBiLang.g:3210:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:3211:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:3211:3: '-'
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
    // InternalBiLang.g:3219:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3223:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalBiLang.g:3224:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:3231:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3235:1: ( ( ( RULE_INT )? ) )
            // InternalBiLang.g:3236:1: ( ( RULE_INT )? )
            {
            // InternalBiLang.g:3236:1: ( ( RULE_INT )? )
            // InternalBiLang.g:3237:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalBiLang.g:3238:2: ( RULE_INT )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:3238:3: RULE_INT
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
    // InternalBiLang.g:3246:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3250:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalBiLang.g:3251:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBiLang.g:3258:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3262:1: ( ( '.' ) )
            // InternalBiLang.g:3263:1: ( '.' )
            {
            // InternalBiLang.g:3263:1: ( '.' )
            // InternalBiLang.g:3264:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBiLang.g:3273:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3277:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalBiLang.g:3278:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:3285:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3289:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3290:1: ( RULE_INT )
            {
            // InternalBiLang.g:3290:1: ( RULE_INT )
            // InternalBiLang.g:3291:2: RULE_INT
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
    // InternalBiLang.g:3300:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3304:1: ( rule__EFloat__Group__4__Impl )
            // InternalBiLang.g:3305:2: rule__EFloat__Group__4__Impl
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
    // InternalBiLang.g:3311:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3315:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalBiLang.g:3316:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalBiLang.g:3316:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalBiLang.g:3317:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalBiLang.g:3318:2: ( rule__EFloat__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=11 && LA28_0<=12)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBiLang.g:3318:3: rule__EFloat__Group_4__0
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
    // InternalBiLang.g:3327:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3331:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalBiLang.g:3332:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:3339:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3343:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalBiLang.g:3344:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalBiLang.g:3344:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalBiLang.g:3345:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalBiLang.g:3346:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalBiLang.g:3346:3: rule__EFloat__Alternatives_4_0
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
    // InternalBiLang.g:3354:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3358:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalBiLang.g:3359:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:3366:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3370:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3371:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3371:1: ( ( '-' )? )
            // InternalBiLang.g:3372:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBiLang.g:3373:2: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBiLang.g:3373:3: '-'
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
    // InternalBiLang.g:3381:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3385:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalBiLang.g:3386:2: rule__EFloat__Group_4__2__Impl
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
    // InternalBiLang.g:3392:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3396:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3397:1: ( RULE_INT )
            {
            // InternalBiLang.g:3397:1: ( RULE_INT )
            // InternalBiLang.g:3398:2: RULE_INT
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
    // InternalBiLang.g:3408:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3412:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBiLang.g:3413:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalBiLang.g:3420:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3424:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3425:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3425:1: ( ( '-' )? )
            // InternalBiLang.g:3426:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:3427:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBiLang.g:3427:3: '-'
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
    // InternalBiLang.g:3435:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3439:1: ( rule__EInt__Group__1__Impl )
            // InternalBiLang.g:3440:2: rule__EInt__Group__1__Impl
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
    // InternalBiLang.g:3446:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3450:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3451:1: ( RULE_INT )
            {
            // InternalBiLang.g:3451:1: ( RULE_INT )
            // InternalBiLang.g:3452:2: RULE_INT
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
    // InternalBiLang.g:3462:1: rule__BarPlot__Group__0 : rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 ;
    public final void rule__BarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3466:1: ( rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 )
            // InternalBiLang.g:3467:2: rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:3474:1: rule__BarPlot__Group__0__Impl : ( () ) ;
    public final void rule__BarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3478:1: ( ( () ) )
            // InternalBiLang.g:3479:1: ( () )
            {
            // InternalBiLang.g:3479:1: ( () )
            // InternalBiLang.g:3480:2: ()
            {
             before(grammarAccess.getBarPlotAccess().getBarPlotAction_0()); 
            // InternalBiLang.g:3481:2: ()
            // InternalBiLang.g:3481:3: 
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
    // InternalBiLang.g:3489:1: rule__BarPlot__Group__1 : rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 ;
    public final void rule__BarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3493:1: ( rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 )
            // InternalBiLang.g:3494:2: rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2
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
    // InternalBiLang.g:3501:1: rule__BarPlot__Group__1__Impl : ( 'bar' ) ;
    public final void rule__BarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3505:1: ( ( 'bar' ) )
            // InternalBiLang.g:3506:1: ( 'bar' )
            {
            // InternalBiLang.g:3506:1: ( 'bar' )
            // InternalBiLang.g:3507:2: 'bar'
            {
             before(grammarAccess.getBarPlotAccess().getBarKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBiLang.g:3516:1: rule__BarPlot__Group__2 : rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 ;
    public final void rule__BarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3520:1: ( rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 )
            // InternalBiLang.g:3521:2: rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:3528:1: rule__BarPlot__Group__2__Impl : ( ( rule__BarPlot__NameAssignment_2 ) ) ;
    public final void rule__BarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3532:1: ( ( ( rule__BarPlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3533:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3533:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            // InternalBiLang.g:3534:2: ( rule__BarPlot__NameAssignment_2 )
            {
             before(grammarAccess.getBarPlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3535:2: ( rule__BarPlot__NameAssignment_2 )
            // InternalBiLang.g:3535:3: rule__BarPlot__NameAssignment_2
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
    // InternalBiLang.g:3543:1: rule__BarPlot__Group__3 : rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 ;
    public final void rule__BarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3547:1: ( rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 )
            // InternalBiLang.g:3548:2: rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:3555:1: rule__BarPlot__Group__3__Impl : ( '->' ) ;
    public final void rule__BarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3559:1: ( ( '->' ) )
            // InternalBiLang.g:3560:1: ( '->' )
            {
            // InternalBiLang.g:3560:1: ( '->' )
            // InternalBiLang.g:3561:2: '->'
            {
             before(grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:3570:1: rule__BarPlot__Group__4 : rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 ;
    public final void rule__BarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3574:1: ( rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 )
            // InternalBiLang.g:3575:2: rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5
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
    // InternalBiLang.g:3582:1: rule__BarPlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__BarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3586:1: ( ( 'xAx' ) )
            // InternalBiLang.g:3587:1: ( 'xAx' )
            {
            // InternalBiLang.g:3587:1: ( 'xAx' )
            // InternalBiLang.g:3588:2: 'xAx'
            {
             before(grammarAccess.getBarPlotAccess().getXAxKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:3597:1: rule__BarPlot__Group__5 : rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 ;
    public final void rule__BarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3601:1: ( rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 )
            // InternalBiLang.g:3602:2: rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3609:1: rule__BarPlot__Group__5__Impl : ( ( rule__BarPlot__XAxisAssignment_5 ) ) ;
    public final void rule__BarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3613:1: ( ( ( rule__BarPlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:3614:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:3614:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:3615:2: ( rule__BarPlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getBarPlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:3616:2: ( rule__BarPlot__XAxisAssignment_5 )
            // InternalBiLang.g:3616:3: rule__BarPlot__XAxisAssignment_5
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
    // InternalBiLang.g:3624:1: rule__BarPlot__Group__6 : rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 ;
    public final void rule__BarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3628:1: ( rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 )
            // InternalBiLang.g:3629:2: rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7
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
    // InternalBiLang.g:3636:1: rule__BarPlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__BarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3640:1: ( ( 'yA' ) )
            // InternalBiLang.g:3641:1: ( 'yA' )
            {
            // InternalBiLang.g:3641:1: ( 'yA' )
            // InternalBiLang.g:3642:2: 'yA'
            {
             before(grammarAccess.getBarPlotAccess().getYAKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:3651:1: rule__BarPlot__Group__7 : rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 ;
    public final void rule__BarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3655:1: ( rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 )
            // InternalBiLang.g:3656:2: rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:3663:1: rule__BarPlot__Group__7__Impl : ( ( rule__BarPlot__YAxisAssignment_7 ) ) ;
    public final void rule__BarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3667:1: ( ( ( rule__BarPlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3668:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3668:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3669:2: ( rule__BarPlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getBarPlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3670:2: ( rule__BarPlot__YAxisAssignment_7 )
            // InternalBiLang.g:3670:3: rule__BarPlot__YAxisAssignment_7
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
    // InternalBiLang.g:3678:1: rule__BarPlot__Group__8 : rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 ;
    public final void rule__BarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3682:1: ( rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 )
            // InternalBiLang.g:3683:2: rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:3690:1: rule__BarPlot__Group__8__Impl : ( ( rule__BarPlot__Group_8__0 )? ) ;
    public final void rule__BarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3694:1: ( ( ( rule__BarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:3695:1: ( ( rule__BarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3695:1: ( ( rule__BarPlot__Group_8__0 )? )
            // InternalBiLang.g:3696:2: ( rule__BarPlot__Group_8__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:3697:2: ( rule__BarPlot__Group_8__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBiLang.g:3697:3: rule__BarPlot__Group_8__0
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
    // InternalBiLang.g:3705:1: rule__BarPlot__Group__9 : rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 ;
    public final void rule__BarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3709:1: ( rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 )
            // InternalBiLang.g:3710:2: rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:3717:1: rule__BarPlot__Group__9__Impl : ( ( rule__BarPlot__Group_9__0 )? ) ;
    public final void rule__BarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3721:1: ( ( ( rule__BarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:3722:1: ( ( rule__BarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:3722:1: ( ( rule__BarPlot__Group_9__0 )? )
            // InternalBiLang.g:3723:2: ( rule__BarPlot__Group_9__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:3724:2: ( rule__BarPlot__Group_9__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBiLang.g:3724:3: rule__BarPlot__Group_9__0
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
    // InternalBiLang.g:3732:1: rule__BarPlot__Group__10 : rule__BarPlot__Group__10__Impl ;
    public final void rule__BarPlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3736:1: ( rule__BarPlot__Group__10__Impl )
            // InternalBiLang.g:3737:2: rule__BarPlot__Group__10__Impl
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
    // InternalBiLang.g:3743:1: rule__BarPlot__Group__10__Impl : ( ( rule__BarPlot__Group_10__0 )? ) ;
    public final void rule__BarPlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3747:1: ( ( ( rule__BarPlot__Group_10__0 )? ) )
            // InternalBiLang.g:3748:1: ( ( rule__BarPlot__Group_10__0 )? )
            {
            // InternalBiLang.g:3748:1: ( ( rule__BarPlot__Group_10__0 )? )
            // InternalBiLang.g:3749:2: ( rule__BarPlot__Group_10__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_10()); 
            // InternalBiLang.g:3750:2: ( rule__BarPlot__Group_10__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:3750:3: rule__BarPlot__Group_10__0
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
    // InternalBiLang.g:3759:1: rule__BarPlot__Group_8__0 : rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 ;
    public final void rule__BarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3763:1: ( rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 )
            // InternalBiLang.g:3764:2: rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:3771:1: rule__BarPlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__BarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3775:1: ( ( 'loc' ) )
            // InternalBiLang.g:3776:1: ( 'loc' )
            {
            // InternalBiLang.g:3776:1: ( 'loc' )
            // InternalBiLang.g:3777:2: 'loc'
            {
             before(grammarAccess.getBarPlotAccess().getLocKeyword_8_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:3786:1: rule__BarPlot__Group_8__1 : rule__BarPlot__Group_8__1__Impl ;
    public final void rule__BarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3790:1: ( rule__BarPlot__Group_8__1__Impl )
            // InternalBiLang.g:3791:2: rule__BarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:3797:1: rule__BarPlot__Group_8__1__Impl : ( ( rule__BarPlot__LocationAssignment_8_1 ) ) ;
    public final void rule__BarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3801:1: ( ( ( rule__BarPlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:3802:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:3802:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:3803:2: ( rule__BarPlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getBarPlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:3804:2: ( rule__BarPlot__LocationAssignment_8_1 )
            // InternalBiLang.g:3804:3: rule__BarPlot__LocationAssignment_8_1
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
    // InternalBiLang.g:3813:1: rule__BarPlot__Group_9__0 : rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 ;
    public final void rule__BarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3817:1: ( rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 )
            // InternalBiLang.g:3818:2: rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1
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
    // InternalBiLang.g:3825:1: rule__BarPlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__BarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3829:1: ( ( 'colors' ) )
            // InternalBiLang.g:3830:1: ( 'colors' )
            {
            // InternalBiLang.g:3830:1: ( 'colors' )
            // InternalBiLang.g:3831:2: 'colors'
            {
             before(grammarAccess.getBarPlotAccess().getColorsKeyword_9_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:3840:1: rule__BarPlot__Group_9__1 : rule__BarPlot__Group_9__1__Impl ;
    public final void rule__BarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3844:1: ( rule__BarPlot__Group_9__1__Impl )
            // InternalBiLang.g:3845:2: rule__BarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:3851:1: rule__BarPlot__Group_9__1__Impl : ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__BarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3855:1: ( ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:3856:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:3856:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:3857:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getBarPlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:3858:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:3858:3: rule__BarPlot__ColorsAssignment_9_1
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
    // InternalBiLang.g:3867:1: rule__BarPlot__Group_10__0 : rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 ;
    public final void rule__BarPlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3871:1: ( rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 )
            // InternalBiLang.g:3872:2: rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:3879:1: rule__BarPlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__BarPlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3883:1: ( ( 'thickness' ) )
            // InternalBiLang.g:3884:1: ( 'thickness' )
            {
            // InternalBiLang.g:3884:1: ( 'thickness' )
            // InternalBiLang.g:3885:2: 'thickness'
            {
             before(grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:3894:1: rule__BarPlot__Group_10__1 : rule__BarPlot__Group_10__1__Impl ;
    public final void rule__BarPlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3898:1: ( rule__BarPlot__Group_10__1__Impl )
            // InternalBiLang.g:3899:2: rule__BarPlot__Group_10__1__Impl
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
    // InternalBiLang.g:3905:1: rule__BarPlot__Group_10__1__Impl : ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__BarPlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3909:1: ( ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:3910:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:3910:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:3911:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:3912:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:3912:3: rule__BarPlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:3921:1: rule__LinePlot__Group__0 : rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 ;
    public final void rule__LinePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3925:1: ( rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 )
            // InternalBiLang.g:3926:2: rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalBiLang.g:3933:1: rule__LinePlot__Group__0__Impl : ( () ) ;
    public final void rule__LinePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3937:1: ( ( () ) )
            // InternalBiLang.g:3938:1: ( () )
            {
            // InternalBiLang.g:3938:1: ( () )
            // InternalBiLang.g:3939:2: ()
            {
             before(grammarAccess.getLinePlotAccess().getLinePlotAction_0()); 
            // InternalBiLang.g:3940:2: ()
            // InternalBiLang.g:3940:3: 
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
    // InternalBiLang.g:3948:1: rule__LinePlot__Group__1 : rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 ;
    public final void rule__LinePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3952:1: ( rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 )
            // InternalBiLang.g:3953:2: rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2
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
    // InternalBiLang.g:3960:1: rule__LinePlot__Group__1__Impl : ( 'line' ) ;
    public final void rule__LinePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3964:1: ( ( 'line' ) )
            // InternalBiLang.g:3965:1: ( 'line' )
            {
            // InternalBiLang.g:3965:1: ( 'line' )
            // InternalBiLang.g:3966:2: 'line'
            {
             before(grammarAccess.getLinePlotAccess().getLineKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBiLang.g:3975:1: rule__LinePlot__Group__2 : rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 ;
    public final void rule__LinePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3979:1: ( rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 )
            // InternalBiLang.g:3980:2: rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:3987:1: rule__LinePlot__Group__2__Impl : ( ( rule__LinePlot__NameAssignment_2 ) ) ;
    public final void rule__LinePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3991:1: ( ( ( rule__LinePlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3992:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3992:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            // InternalBiLang.g:3993:2: ( rule__LinePlot__NameAssignment_2 )
            {
             before(grammarAccess.getLinePlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3994:2: ( rule__LinePlot__NameAssignment_2 )
            // InternalBiLang.g:3994:3: rule__LinePlot__NameAssignment_2
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
    // InternalBiLang.g:4002:1: rule__LinePlot__Group__3 : rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 ;
    public final void rule__LinePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4006:1: ( rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 )
            // InternalBiLang.g:4007:2: rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:4014:1: rule__LinePlot__Group__3__Impl : ( '->' ) ;
    public final void rule__LinePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4018:1: ( ( '->' ) )
            // InternalBiLang.g:4019:1: ( '->' )
            {
            // InternalBiLang.g:4019:1: ( '->' )
            // InternalBiLang.g:4020:2: '->'
            {
             before(grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:4029:1: rule__LinePlot__Group__4 : rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 ;
    public final void rule__LinePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4033:1: ( rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 )
            // InternalBiLang.g:4034:2: rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5
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
    // InternalBiLang.g:4041:1: rule__LinePlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__LinePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4045:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4046:1: ( 'xAx' )
            {
            // InternalBiLang.g:4046:1: ( 'xAx' )
            // InternalBiLang.g:4047:2: 'xAx'
            {
             before(grammarAccess.getLinePlotAccess().getXAxKeyword_4()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:4056:1: rule__LinePlot__Group__5 : rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 ;
    public final void rule__LinePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4060:1: ( rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 )
            // InternalBiLang.g:4061:2: rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4068:1: rule__LinePlot__Group__5__Impl : ( ( rule__LinePlot__XAxisAssignment_5 ) ) ;
    public final void rule__LinePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4072:1: ( ( ( rule__LinePlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:4073:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:4073:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:4074:2: ( rule__LinePlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getLinePlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:4075:2: ( rule__LinePlot__XAxisAssignment_5 )
            // InternalBiLang.g:4075:3: rule__LinePlot__XAxisAssignment_5
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
    // InternalBiLang.g:4083:1: rule__LinePlot__Group__6 : rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 ;
    public final void rule__LinePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4087:1: ( rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 )
            // InternalBiLang.g:4088:2: rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7
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
    // InternalBiLang.g:4095:1: rule__LinePlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__LinePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4099:1: ( ( 'yA' ) )
            // InternalBiLang.g:4100:1: ( 'yA' )
            {
            // InternalBiLang.g:4100:1: ( 'yA' )
            // InternalBiLang.g:4101:2: 'yA'
            {
             before(grammarAccess.getLinePlotAccess().getYAKeyword_6()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:4110:1: rule__LinePlot__Group__7 : rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 ;
    public final void rule__LinePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4114:1: ( rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 )
            // InternalBiLang.g:4115:2: rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:4122:1: rule__LinePlot__Group__7__Impl : ( ( rule__LinePlot__YAxisAssignment_7 ) ) ;
    public final void rule__LinePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4126:1: ( ( ( rule__LinePlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:4127:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:4127:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:4128:2: ( rule__LinePlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getLinePlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:4129:2: ( rule__LinePlot__YAxisAssignment_7 )
            // InternalBiLang.g:4129:3: rule__LinePlot__YAxisAssignment_7
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
    // InternalBiLang.g:4137:1: rule__LinePlot__Group__8 : rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 ;
    public final void rule__LinePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4141:1: ( rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 )
            // InternalBiLang.g:4142:2: rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:4149:1: rule__LinePlot__Group__8__Impl : ( ( rule__LinePlot__Group_8__0 )? ) ;
    public final void rule__LinePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4153:1: ( ( ( rule__LinePlot__Group_8__0 )? ) )
            // InternalBiLang.g:4154:1: ( ( rule__LinePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4154:1: ( ( rule__LinePlot__Group_8__0 )? )
            // InternalBiLang.g:4155:2: ( rule__LinePlot__Group_8__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_8()); 
            // InternalBiLang.g:4156:2: ( rule__LinePlot__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:4156:3: rule__LinePlot__Group_8__0
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
    // InternalBiLang.g:4164:1: rule__LinePlot__Group__9 : rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 ;
    public final void rule__LinePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4168:1: ( rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 )
            // InternalBiLang.g:4169:2: rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:4176:1: rule__LinePlot__Group__9__Impl : ( ( rule__LinePlot__Group_9__0 )? ) ;
    public final void rule__LinePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4180:1: ( ( ( rule__LinePlot__Group_9__0 )? ) )
            // InternalBiLang.g:4181:1: ( ( rule__LinePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4181:1: ( ( rule__LinePlot__Group_9__0 )? )
            // InternalBiLang.g:4182:2: ( rule__LinePlot__Group_9__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_9()); 
            // InternalBiLang.g:4183:2: ( rule__LinePlot__Group_9__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:4183:3: rule__LinePlot__Group_9__0
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
    // InternalBiLang.g:4191:1: rule__LinePlot__Group__10 : rule__LinePlot__Group__10__Impl ;
    public final void rule__LinePlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4195:1: ( rule__LinePlot__Group__10__Impl )
            // InternalBiLang.g:4196:2: rule__LinePlot__Group__10__Impl
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
    // InternalBiLang.g:4202:1: rule__LinePlot__Group__10__Impl : ( ( rule__LinePlot__Group_10__0 )? ) ;
    public final void rule__LinePlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4206:1: ( ( ( rule__LinePlot__Group_10__0 )? ) )
            // InternalBiLang.g:4207:1: ( ( rule__LinePlot__Group_10__0 )? )
            {
            // InternalBiLang.g:4207:1: ( ( rule__LinePlot__Group_10__0 )? )
            // InternalBiLang.g:4208:2: ( rule__LinePlot__Group_10__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_10()); 
            // InternalBiLang.g:4209:2: ( rule__LinePlot__Group_10__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:4209:3: rule__LinePlot__Group_10__0
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
    // InternalBiLang.g:4218:1: rule__LinePlot__Group_8__0 : rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 ;
    public final void rule__LinePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4222:1: ( rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 )
            // InternalBiLang.g:4223:2: rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:4230:1: rule__LinePlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__LinePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4234:1: ( ( 'loc' ) )
            // InternalBiLang.g:4235:1: ( 'loc' )
            {
            // InternalBiLang.g:4235:1: ( 'loc' )
            // InternalBiLang.g:4236:2: 'loc'
            {
             before(grammarAccess.getLinePlotAccess().getLocKeyword_8_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:4245:1: rule__LinePlot__Group_8__1 : rule__LinePlot__Group_8__1__Impl ;
    public final void rule__LinePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4249:1: ( rule__LinePlot__Group_8__1__Impl )
            // InternalBiLang.g:4250:2: rule__LinePlot__Group_8__1__Impl
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
    // InternalBiLang.g:4256:1: rule__LinePlot__Group_8__1__Impl : ( ( rule__LinePlot__LocationAssignment_8_1 ) ) ;
    public final void rule__LinePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4260:1: ( ( ( rule__LinePlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:4261:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:4261:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:4262:2: ( rule__LinePlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:4263:2: ( rule__LinePlot__LocationAssignment_8_1 )
            // InternalBiLang.g:4263:3: rule__LinePlot__LocationAssignment_8_1
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
    // InternalBiLang.g:4272:1: rule__LinePlot__Group_9__0 : rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 ;
    public final void rule__LinePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4276:1: ( rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 )
            // InternalBiLang.g:4277:2: rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1
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
    // InternalBiLang.g:4284:1: rule__LinePlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__LinePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4288:1: ( ( 'colors' ) )
            // InternalBiLang.g:4289:1: ( 'colors' )
            {
            // InternalBiLang.g:4289:1: ( 'colors' )
            // InternalBiLang.g:4290:2: 'colors'
            {
             before(grammarAccess.getLinePlotAccess().getColorsKeyword_9_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:4299:1: rule__LinePlot__Group_9__1 : rule__LinePlot__Group_9__1__Impl ;
    public final void rule__LinePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4303:1: ( rule__LinePlot__Group_9__1__Impl )
            // InternalBiLang.g:4304:2: rule__LinePlot__Group_9__1__Impl
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
    // InternalBiLang.g:4310:1: rule__LinePlot__Group_9__1__Impl : ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__LinePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4314:1: ( ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:4315:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:4315:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:4316:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getLinePlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:4317:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:4317:3: rule__LinePlot__ColorsAssignment_9_1
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
    // InternalBiLang.g:4326:1: rule__LinePlot__Group_10__0 : rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 ;
    public final void rule__LinePlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4330:1: ( rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 )
            // InternalBiLang.g:4331:2: rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:4338:1: rule__LinePlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__LinePlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4342:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4343:1: ( 'thickness' )
            {
            // InternalBiLang.g:4343:1: ( 'thickness' )
            // InternalBiLang.g:4344:2: 'thickness'
            {
             before(grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:4353:1: rule__LinePlot__Group_10__1 : rule__LinePlot__Group_10__1__Impl ;
    public final void rule__LinePlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4357:1: ( rule__LinePlot__Group_10__1__Impl )
            // InternalBiLang.g:4358:2: rule__LinePlot__Group_10__1__Impl
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
    // InternalBiLang.g:4364:1: rule__LinePlot__Group_10__1__Impl : ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__LinePlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4368:1: ( ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:4369:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:4369:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:4370:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:4371:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:4371:3: rule__LinePlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:4380:1: rule__DonutPlot__Group__0 : rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 ;
    public final void rule__DonutPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4384:1: ( rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 )
            // InternalBiLang.g:4385:2: rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1
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
    // InternalBiLang.g:4392:1: rule__DonutPlot__Group__0__Impl : ( 'donut' ) ;
    public final void rule__DonutPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4396:1: ( ( 'donut' ) )
            // InternalBiLang.g:4397:1: ( 'donut' )
            {
            // InternalBiLang.g:4397:1: ( 'donut' )
            // InternalBiLang.g:4398:2: 'donut'
            {
             before(grammarAccess.getDonutPlotAccess().getDonutKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBiLang.g:4407:1: rule__DonutPlot__Group__1 : rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 ;
    public final void rule__DonutPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4411:1: ( rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 )
            // InternalBiLang.g:4412:2: rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:4419:1: rule__DonutPlot__Group__1__Impl : ( ( rule__DonutPlot__NameAssignment_1 ) ) ;
    public final void rule__DonutPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4423:1: ( ( ( rule__DonutPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4424:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4424:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            // InternalBiLang.g:4425:2: ( rule__DonutPlot__NameAssignment_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4426:2: ( rule__DonutPlot__NameAssignment_1 )
            // InternalBiLang.g:4426:3: rule__DonutPlot__NameAssignment_1
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
    // InternalBiLang.g:4434:1: rule__DonutPlot__Group__2 : rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 ;
    public final void rule__DonutPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4438:1: ( rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 )
            // InternalBiLang.g:4439:2: rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:4446:1: rule__DonutPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__DonutPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4450:1: ( ( '->' ) )
            // InternalBiLang.g:4451:1: ( '->' )
            {
            // InternalBiLang.g:4451:1: ( '->' )
            // InternalBiLang.g:4452:2: '->'
            {
             before(grammarAccess.getDonutPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:4461:1: rule__DonutPlot__Group__3 : rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 ;
    public final void rule__DonutPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4465:1: ( rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 )
            // InternalBiLang.g:4466:2: rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4
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
    // InternalBiLang.g:4473:1: rule__DonutPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__DonutPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4477:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4478:1: ( 'xAx' )
            {
            // InternalBiLang.g:4478:1: ( 'xAx' )
            // InternalBiLang.g:4479:2: 'xAx'
            {
             before(grammarAccess.getDonutPlotAccess().getXAxKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:4488:1: rule__DonutPlot__Group__4 : rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 ;
    public final void rule__DonutPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4492:1: ( rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 )
            // InternalBiLang.g:4493:2: rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4500:1: rule__DonutPlot__Group__4__Impl : ( ( rule__DonutPlot__XAxisAssignment_4 ) ) ;
    public final void rule__DonutPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4504:1: ( ( ( rule__DonutPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4505:1: ( ( rule__DonutPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4505:1: ( ( rule__DonutPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4506:2: ( rule__DonutPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getDonutPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4507:2: ( rule__DonutPlot__XAxisAssignment_4 )
            // InternalBiLang.g:4507:3: rule__DonutPlot__XAxisAssignment_4
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
    // InternalBiLang.g:4515:1: rule__DonutPlot__Group__5 : rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 ;
    public final void rule__DonutPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4519:1: ( rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 )
            // InternalBiLang.g:4520:2: rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6
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
    // InternalBiLang.g:4527:1: rule__DonutPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__DonutPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4531:1: ( ( 'yA' ) )
            // InternalBiLang.g:4532:1: ( 'yA' )
            {
            // InternalBiLang.g:4532:1: ( 'yA' )
            // InternalBiLang.g:4533:2: 'yA'
            {
             before(grammarAccess.getDonutPlotAccess().getYAKeyword_5()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:4542:1: rule__DonutPlot__Group__6 : rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7 ;
    public final void rule__DonutPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4546:1: ( rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7 )
            // InternalBiLang.g:4547:2: rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:4554:1: rule__DonutPlot__Group__6__Impl : ( ( rule__DonutPlot__YAxisAssignment_6 ) ) ;
    public final void rule__DonutPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4558:1: ( ( ( rule__DonutPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:4559:1: ( ( rule__DonutPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:4559:1: ( ( rule__DonutPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:4560:2: ( rule__DonutPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getDonutPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:4561:2: ( rule__DonutPlot__YAxisAssignment_6 )
            // InternalBiLang.g:4561:3: rule__DonutPlot__YAxisAssignment_6
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
    // InternalBiLang.g:4569:1: rule__DonutPlot__Group__7 : rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8 ;
    public final void rule__DonutPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4573:1: ( rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8 )
            // InternalBiLang.g:4574:2: rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:4581:1: rule__DonutPlot__Group__7__Impl : ( ( rule__DonutPlot__Group_7__0 )? ) ;
    public final void rule__DonutPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4585:1: ( ( ( rule__DonutPlot__Group_7__0 )? ) )
            // InternalBiLang.g:4586:1: ( ( rule__DonutPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:4586:1: ( ( rule__DonutPlot__Group_7__0 )? )
            // InternalBiLang.g:4587:2: ( rule__DonutPlot__Group_7__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_7()); 
            // InternalBiLang.g:4588:2: ( rule__DonutPlot__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:4588:3: rule__DonutPlot__Group_7__0
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
    // InternalBiLang.g:4596:1: rule__DonutPlot__Group__8 : rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9 ;
    public final void rule__DonutPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4600:1: ( rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9 )
            // InternalBiLang.g:4601:2: rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:4608:1: rule__DonutPlot__Group__8__Impl : ( ( rule__DonutPlot__Group_8__0 )? ) ;
    public final void rule__DonutPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4612:1: ( ( ( rule__DonutPlot__Group_8__0 )? ) )
            // InternalBiLang.g:4613:1: ( ( rule__DonutPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4613:1: ( ( rule__DonutPlot__Group_8__0 )? )
            // InternalBiLang.g:4614:2: ( rule__DonutPlot__Group_8__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_8()); 
            // InternalBiLang.g:4615:2: ( rule__DonutPlot__Group_8__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:4615:3: rule__DonutPlot__Group_8__0
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
    // InternalBiLang.g:4623:1: rule__DonutPlot__Group__9 : rule__DonutPlot__Group__9__Impl ;
    public final void rule__DonutPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4627:1: ( rule__DonutPlot__Group__9__Impl )
            // InternalBiLang.g:4628:2: rule__DonutPlot__Group__9__Impl
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
    // InternalBiLang.g:4634:1: rule__DonutPlot__Group__9__Impl : ( ( rule__DonutPlot__Group_9__0 )? ) ;
    public final void rule__DonutPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4638:1: ( ( ( rule__DonutPlot__Group_9__0 )? ) )
            // InternalBiLang.g:4639:1: ( ( rule__DonutPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4639:1: ( ( rule__DonutPlot__Group_9__0 )? )
            // InternalBiLang.g:4640:2: ( rule__DonutPlot__Group_9__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_9()); 
            // InternalBiLang.g:4641:2: ( rule__DonutPlot__Group_9__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:4641:3: rule__DonutPlot__Group_9__0
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
    // InternalBiLang.g:4650:1: rule__DonutPlot__Group_7__0 : rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1 ;
    public final void rule__DonutPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4654:1: ( rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1 )
            // InternalBiLang.g:4655:2: rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:4662:1: rule__DonutPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__DonutPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4666:1: ( ( 'loc' ) )
            // InternalBiLang.g:4667:1: ( 'loc' )
            {
            // InternalBiLang.g:4667:1: ( 'loc' )
            // InternalBiLang.g:4668:2: 'loc'
            {
             before(grammarAccess.getDonutPlotAccess().getLocKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:4677:1: rule__DonutPlot__Group_7__1 : rule__DonutPlot__Group_7__1__Impl ;
    public final void rule__DonutPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4681:1: ( rule__DonutPlot__Group_7__1__Impl )
            // InternalBiLang.g:4682:2: rule__DonutPlot__Group_7__1__Impl
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
    // InternalBiLang.g:4688:1: rule__DonutPlot__Group_7__1__Impl : ( ( rule__DonutPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__DonutPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4692:1: ( ( ( rule__DonutPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:4693:1: ( ( rule__DonutPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:4693:1: ( ( rule__DonutPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:4694:2: ( rule__DonutPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:4695:2: ( rule__DonutPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:4695:3: rule__DonutPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:4704:1: rule__DonutPlot__Group_8__0 : rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1 ;
    public final void rule__DonutPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4708:1: ( rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1 )
            // InternalBiLang.g:4709:2: rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1
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
    // InternalBiLang.g:4716:1: rule__DonutPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__DonutPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4720:1: ( ( 'colors' ) )
            // InternalBiLang.g:4721:1: ( 'colors' )
            {
            // InternalBiLang.g:4721:1: ( 'colors' )
            // InternalBiLang.g:4722:2: 'colors'
            {
             before(grammarAccess.getDonutPlotAccess().getColorsKeyword_8_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:4731:1: rule__DonutPlot__Group_8__1 : rule__DonutPlot__Group_8__1__Impl ;
    public final void rule__DonutPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4735:1: ( rule__DonutPlot__Group_8__1__Impl )
            // InternalBiLang.g:4736:2: rule__DonutPlot__Group_8__1__Impl
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
    // InternalBiLang.g:4742:1: rule__DonutPlot__Group_8__1__Impl : ( ( rule__DonutPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__DonutPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4746:1: ( ( ( rule__DonutPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:4747:1: ( ( rule__DonutPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:4747:1: ( ( rule__DonutPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:4748:2: ( rule__DonutPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:4749:2: ( rule__DonutPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:4749:3: rule__DonutPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:4758:1: rule__DonutPlot__Group_9__0 : rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1 ;
    public final void rule__DonutPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4762:1: ( rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1 )
            // InternalBiLang.g:4763:2: rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:4770:1: rule__DonutPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__DonutPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4774:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4775:1: ( 'thickness' )
            {
            // InternalBiLang.g:4775:1: ( 'thickness' )
            // InternalBiLang.g:4776:2: 'thickness'
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:4785:1: rule__DonutPlot__Group_9__1 : rule__DonutPlot__Group_9__1__Impl ;
    public final void rule__DonutPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4789:1: ( rule__DonutPlot__Group_9__1__Impl )
            // InternalBiLang.g:4790:2: rule__DonutPlot__Group_9__1__Impl
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
    // InternalBiLang.g:4796:1: rule__DonutPlot__Group_9__1__Impl : ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__DonutPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4800:1: ( ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:4801:1: ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:4801:1: ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:4802:2: ( rule__DonutPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:4803:2: ( rule__DonutPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:4803:3: rule__DonutPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:4812:1: rule__PiePlot__Group__0 : rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 ;
    public final void rule__PiePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4816:1: ( rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 )
            // InternalBiLang.g:4817:2: rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1
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
    // InternalBiLang.g:4824:1: rule__PiePlot__Group__0__Impl : ( 'pie' ) ;
    public final void rule__PiePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4828:1: ( ( 'pie' ) )
            // InternalBiLang.g:4829:1: ( 'pie' )
            {
            // InternalBiLang.g:4829:1: ( 'pie' )
            // InternalBiLang.g:4830:2: 'pie'
            {
             before(grammarAccess.getPiePlotAccess().getPieKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalBiLang.g:4839:1: rule__PiePlot__Group__1 : rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 ;
    public final void rule__PiePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4843:1: ( rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 )
            // InternalBiLang.g:4844:2: rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:4851:1: rule__PiePlot__Group__1__Impl : ( ( rule__PiePlot__NameAssignment_1 ) ) ;
    public final void rule__PiePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4855:1: ( ( ( rule__PiePlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4856:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4856:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            // InternalBiLang.g:4857:2: ( rule__PiePlot__NameAssignment_1 )
            {
             before(grammarAccess.getPiePlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4858:2: ( rule__PiePlot__NameAssignment_1 )
            // InternalBiLang.g:4858:3: rule__PiePlot__NameAssignment_1
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
    // InternalBiLang.g:4866:1: rule__PiePlot__Group__2 : rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 ;
    public final void rule__PiePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4870:1: ( rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 )
            // InternalBiLang.g:4871:2: rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:4878:1: rule__PiePlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PiePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4882:1: ( ( '->' ) )
            // InternalBiLang.g:4883:1: ( '->' )
            {
            // InternalBiLang.g:4883:1: ( '->' )
            // InternalBiLang.g:4884:2: '->'
            {
             before(grammarAccess.getPiePlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:4893:1: rule__PiePlot__Group__3 : rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 ;
    public final void rule__PiePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4897:1: ( rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 )
            // InternalBiLang.g:4898:2: rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4
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
    // InternalBiLang.g:4905:1: rule__PiePlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PiePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4909:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4910:1: ( 'xAx' )
            {
            // InternalBiLang.g:4910:1: ( 'xAx' )
            // InternalBiLang.g:4911:2: 'xAx'
            {
             before(grammarAccess.getPiePlotAccess().getXAxKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:4920:1: rule__PiePlot__Group__4 : rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 ;
    public final void rule__PiePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4924:1: ( rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 )
            // InternalBiLang.g:4925:2: rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4932:1: rule__PiePlot__Group__4__Impl : ( ( rule__PiePlot__XAxisAssignment_4 ) ) ;
    public final void rule__PiePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4936:1: ( ( ( rule__PiePlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4937:1: ( ( rule__PiePlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4937:1: ( ( rule__PiePlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4938:2: ( rule__PiePlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPiePlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4939:2: ( rule__PiePlot__XAxisAssignment_4 )
            // InternalBiLang.g:4939:3: rule__PiePlot__XAxisAssignment_4
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
    // InternalBiLang.g:4947:1: rule__PiePlot__Group__5 : rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 ;
    public final void rule__PiePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4951:1: ( rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 )
            // InternalBiLang.g:4952:2: rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6
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
    // InternalBiLang.g:4959:1: rule__PiePlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PiePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4963:1: ( ( 'yA' ) )
            // InternalBiLang.g:4964:1: ( 'yA' )
            {
            // InternalBiLang.g:4964:1: ( 'yA' )
            // InternalBiLang.g:4965:2: 'yA'
            {
             before(grammarAccess.getPiePlotAccess().getYAKeyword_5()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:4974:1: rule__PiePlot__Group__6 : rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7 ;
    public final void rule__PiePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4978:1: ( rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7 )
            // InternalBiLang.g:4979:2: rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:4986:1: rule__PiePlot__Group__6__Impl : ( ( rule__PiePlot__YAxisAssignment_6 ) ) ;
    public final void rule__PiePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4990:1: ( ( ( rule__PiePlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:4991:1: ( ( rule__PiePlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:4991:1: ( ( rule__PiePlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:4992:2: ( rule__PiePlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPiePlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:4993:2: ( rule__PiePlot__YAxisAssignment_6 )
            // InternalBiLang.g:4993:3: rule__PiePlot__YAxisAssignment_6
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
    // InternalBiLang.g:5001:1: rule__PiePlot__Group__7 : rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8 ;
    public final void rule__PiePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5005:1: ( rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8 )
            // InternalBiLang.g:5006:2: rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:5013:1: rule__PiePlot__Group__7__Impl : ( ( rule__PiePlot__Group_7__0 )? ) ;
    public final void rule__PiePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5017:1: ( ( ( rule__PiePlot__Group_7__0 )? ) )
            // InternalBiLang.g:5018:1: ( ( rule__PiePlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5018:1: ( ( rule__PiePlot__Group_7__0 )? )
            // InternalBiLang.g:5019:2: ( rule__PiePlot__Group_7__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_7()); 
            // InternalBiLang.g:5020:2: ( rule__PiePlot__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:5020:3: rule__PiePlot__Group_7__0
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
    // InternalBiLang.g:5028:1: rule__PiePlot__Group__8 : rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9 ;
    public final void rule__PiePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5032:1: ( rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9 )
            // InternalBiLang.g:5033:2: rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:5040:1: rule__PiePlot__Group__8__Impl : ( ( rule__PiePlot__Group_8__0 )? ) ;
    public final void rule__PiePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5044:1: ( ( ( rule__PiePlot__Group_8__0 )? ) )
            // InternalBiLang.g:5045:1: ( ( rule__PiePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5045:1: ( ( rule__PiePlot__Group_8__0 )? )
            // InternalBiLang.g:5046:2: ( rule__PiePlot__Group_8__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_8()); 
            // InternalBiLang.g:5047:2: ( rule__PiePlot__Group_8__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:5047:3: rule__PiePlot__Group_8__0
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
    // InternalBiLang.g:5055:1: rule__PiePlot__Group__9 : rule__PiePlot__Group__9__Impl ;
    public final void rule__PiePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5059:1: ( rule__PiePlot__Group__9__Impl )
            // InternalBiLang.g:5060:2: rule__PiePlot__Group__9__Impl
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
    // InternalBiLang.g:5066:1: rule__PiePlot__Group__9__Impl : ( ( rule__PiePlot__Group_9__0 )? ) ;
    public final void rule__PiePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5070:1: ( ( ( rule__PiePlot__Group_9__0 )? ) )
            // InternalBiLang.g:5071:1: ( ( rule__PiePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5071:1: ( ( rule__PiePlot__Group_9__0 )? )
            // InternalBiLang.g:5072:2: ( rule__PiePlot__Group_9__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_9()); 
            // InternalBiLang.g:5073:2: ( rule__PiePlot__Group_9__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==51) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:5073:3: rule__PiePlot__Group_9__0
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
    // InternalBiLang.g:5082:1: rule__PiePlot__Group_7__0 : rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1 ;
    public final void rule__PiePlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5086:1: ( rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1 )
            // InternalBiLang.g:5087:2: rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:5094:1: rule__PiePlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PiePlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5098:1: ( ( 'loc' ) )
            // InternalBiLang.g:5099:1: ( 'loc' )
            {
            // InternalBiLang.g:5099:1: ( 'loc' )
            // InternalBiLang.g:5100:2: 'loc'
            {
             before(grammarAccess.getPiePlotAccess().getLocKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:5109:1: rule__PiePlot__Group_7__1 : rule__PiePlot__Group_7__1__Impl ;
    public final void rule__PiePlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5113:1: ( rule__PiePlot__Group_7__1__Impl )
            // InternalBiLang.g:5114:2: rule__PiePlot__Group_7__1__Impl
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
    // InternalBiLang.g:5120:1: rule__PiePlot__Group_7__1__Impl : ( ( rule__PiePlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PiePlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5124:1: ( ( ( rule__PiePlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5125:1: ( ( rule__PiePlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5125:1: ( ( rule__PiePlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5126:2: ( rule__PiePlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPiePlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5127:2: ( rule__PiePlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5127:3: rule__PiePlot__LocationAssignment_7_1
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
    // InternalBiLang.g:5136:1: rule__PiePlot__Group_8__0 : rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1 ;
    public final void rule__PiePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5140:1: ( rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1 )
            // InternalBiLang.g:5141:2: rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1
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
    // InternalBiLang.g:5148:1: rule__PiePlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PiePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5152:1: ( ( 'colors' ) )
            // InternalBiLang.g:5153:1: ( 'colors' )
            {
            // InternalBiLang.g:5153:1: ( 'colors' )
            // InternalBiLang.g:5154:2: 'colors'
            {
             before(grammarAccess.getPiePlotAccess().getColorsKeyword_8_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:5163:1: rule__PiePlot__Group_8__1 : rule__PiePlot__Group_8__1__Impl ;
    public final void rule__PiePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5167:1: ( rule__PiePlot__Group_8__1__Impl )
            // InternalBiLang.g:5168:2: rule__PiePlot__Group_8__1__Impl
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
    // InternalBiLang.g:5174:1: rule__PiePlot__Group_8__1__Impl : ( ( rule__PiePlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PiePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5178:1: ( ( ( rule__PiePlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5179:1: ( ( rule__PiePlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5179:1: ( ( rule__PiePlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5180:2: ( rule__PiePlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPiePlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5181:2: ( rule__PiePlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5181:3: rule__PiePlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:5190:1: rule__PiePlot__Group_9__0 : rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1 ;
    public final void rule__PiePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5194:1: ( rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1 )
            // InternalBiLang.g:5195:2: rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:5202:1: rule__PiePlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PiePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5206:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5207:1: ( 'thickness' )
            {
            // InternalBiLang.g:5207:1: ( 'thickness' )
            // InternalBiLang.g:5208:2: 'thickness'
            {
             before(grammarAccess.getPiePlotAccess().getThicknessKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:5217:1: rule__PiePlot__Group_9__1 : rule__PiePlot__Group_9__1__Impl ;
    public final void rule__PiePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5221:1: ( rule__PiePlot__Group_9__1__Impl )
            // InternalBiLang.g:5222:2: rule__PiePlot__Group_9__1__Impl
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
    // InternalBiLang.g:5228:1: rule__PiePlot__Group_9__1__Impl : ( ( rule__PiePlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PiePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5232:1: ( ( ( rule__PiePlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5233:1: ( ( rule__PiePlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5233:1: ( ( rule__PiePlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5234:2: ( rule__PiePlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPiePlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5235:2: ( rule__PiePlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5235:3: rule__PiePlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:5244:1: rule__PolarPlot__Group__0 : rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 ;
    public final void rule__PolarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5248:1: ( rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 )
            // InternalBiLang.g:5249:2: rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1
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
    // InternalBiLang.g:5256:1: rule__PolarPlot__Group__0__Impl : ( 'polar' ) ;
    public final void rule__PolarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5260:1: ( ( 'polar' ) )
            // InternalBiLang.g:5261:1: ( 'polar' )
            {
            // InternalBiLang.g:5261:1: ( 'polar' )
            // InternalBiLang.g:5262:2: 'polar'
            {
             before(grammarAccess.getPolarPlotAccess().getPolarKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalBiLang.g:5271:1: rule__PolarPlot__Group__1 : rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 ;
    public final void rule__PolarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5275:1: ( rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 )
            // InternalBiLang.g:5276:2: rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:5283:1: rule__PolarPlot__Group__1__Impl : ( ( rule__PolarPlot__NameAssignment_1 ) ) ;
    public final void rule__PolarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5287:1: ( ( ( rule__PolarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5288:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5288:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5289:2: ( rule__PolarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5290:2: ( rule__PolarPlot__NameAssignment_1 )
            // InternalBiLang.g:5290:3: rule__PolarPlot__NameAssignment_1
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
    // InternalBiLang.g:5298:1: rule__PolarPlot__Group__2 : rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 ;
    public final void rule__PolarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5302:1: ( rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 )
            // InternalBiLang.g:5303:2: rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:5310:1: rule__PolarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PolarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5314:1: ( ( '->' ) )
            // InternalBiLang.g:5315:1: ( '->' )
            {
            // InternalBiLang.g:5315:1: ( '->' )
            // InternalBiLang.g:5316:2: '->'
            {
             before(grammarAccess.getPolarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:5325:1: rule__PolarPlot__Group__3 : rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 ;
    public final void rule__PolarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5329:1: ( rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 )
            // InternalBiLang.g:5330:2: rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4
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
    // InternalBiLang.g:5337:1: rule__PolarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PolarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5341:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5342:1: ( 'xAx' )
            {
            // InternalBiLang.g:5342:1: ( 'xAx' )
            // InternalBiLang.g:5343:2: 'xAx'
            {
             before(grammarAccess.getPolarPlotAccess().getXAxKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:5352:1: rule__PolarPlot__Group__4 : rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 ;
    public final void rule__PolarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5356:1: ( rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 )
            // InternalBiLang.g:5357:2: rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5364:1: rule__PolarPlot__Group__4__Impl : ( ( rule__PolarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__PolarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5368:1: ( ( ( rule__PolarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5369:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5369:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5370:2: ( rule__PolarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPolarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5371:2: ( rule__PolarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5371:3: rule__PolarPlot__XAxisAssignment_4
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
    // InternalBiLang.g:5379:1: rule__PolarPlot__Group__5 : rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 ;
    public final void rule__PolarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5383:1: ( rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 )
            // InternalBiLang.g:5384:2: rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6
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
    // InternalBiLang.g:5391:1: rule__PolarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PolarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5395:1: ( ( 'yA' ) )
            // InternalBiLang.g:5396:1: ( 'yA' )
            {
            // InternalBiLang.g:5396:1: ( 'yA' )
            // InternalBiLang.g:5397:2: 'yA'
            {
             before(grammarAccess.getPolarPlotAccess().getYAKeyword_5()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:5406:1: rule__PolarPlot__Group__6 : rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 ;
    public final void rule__PolarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5410:1: ( rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 )
            // InternalBiLang.g:5411:2: rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:5418:1: rule__PolarPlot__Group__6__Impl : ( ( rule__PolarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__PolarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5422:1: ( ( ( rule__PolarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5423:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5423:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5424:2: ( rule__PolarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPolarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5425:2: ( rule__PolarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5425:3: rule__PolarPlot__YAxisAssignment_6
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
    // InternalBiLang.g:5433:1: rule__PolarPlot__Group__7 : rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 ;
    public final void rule__PolarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5437:1: ( rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 )
            // InternalBiLang.g:5438:2: rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:5445:1: rule__PolarPlot__Group__7__Impl : ( ( rule__PolarPlot__Group_7__0 )? ) ;
    public final void rule__PolarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5449:1: ( ( ( rule__PolarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5450:1: ( ( rule__PolarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5450:1: ( ( rule__PolarPlot__Group_7__0 )? )
            // InternalBiLang.g:5451:2: ( rule__PolarPlot__Group_7__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5452:2: ( rule__PolarPlot__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:5452:3: rule__PolarPlot__Group_7__0
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
    // InternalBiLang.g:5460:1: rule__PolarPlot__Group__8 : rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 ;
    public final void rule__PolarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5464:1: ( rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 )
            // InternalBiLang.g:5465:2: rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:5472:1: rule__PolarPlot__Group__8__Impl : ( ( rule__PolarPlot__Group_8__0 )? ) ;
    public final void rule__PolarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5476:1: ( ( ( rule__PolarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5477:1: ( ( rule__PolarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5477:1: ( ( rule__PolarPlot__Group_8__0 )? )
            // InternalBiLang.g:5478:2: ( rule__PolarPlot__Group_8__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5479:2: ( rule__PolarPlot__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:5479:3: rule__PolarPlot__Group_8__0
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
    // InternalBiLang.g:5487:1: rule__PolarPlot__Group__9 : rule__PolarPlot__Group__9__Impl ;
    public final void rule__PolarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5491:1: ( rule__PolarPlot__Group__9__Impl )
            // InternalBiLang.g:5492:2: rule__PolarPlot__Group__9__Impl
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
    // InternalBiLang.g:5498:1: rule__PolarPlot__Group__9__Impl : ( ( rule__PolarPlot__Group_9__0 )? ) ;
    public final void rule__PolarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5502:1: ( ( ( rule__PolarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5503:1: ( ( rule__PolarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5503:1: ( ( rule__PolarPlot__Group_9__0 )? )
            // InternalBiLang.g:5504:2: ( rule__PolarPlot__Group_9__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5505:2: ( rule__PolarPlot__Group_9__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:5505:3: rule__PolarPlot__Group_9__0
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
    // InternalBiLang.g:5514:1: rule__PolarPlot__Group_7__0 : rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 ;
    public final void rule__PolarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5518:1: ( rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 )
            // InternalBiLang.g:5519:2: rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:5526:1: rule__PolarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PolarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5530:1: ( ( 'loc' ) )
            // InternalBiLang.g:5531:1: ( 'loc' )
            {
            // InternalBiLang.g:5531:1: ( 'loc' )
            // InternalBiLang.g:5532:2: 'loc'
            {
             before(grammarAccess.getPolarPlotAccess().getLocKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:5541:1: rule__PolarPlot__Group_7__1 : rule__PolarPlot__Group_7__1__Impl ;
    public final void rule__PolarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5545:1: ( rule__PolarPlot__Group_7__1__Impl )
            // InternalBiLang.g:5546:2: rule__PolarPlot__Group_7__1__Impl
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
    // InternalBiLang.g:5552:1: rule__PolarPlot__Group_7__1__Impl : ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PolarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5556:1: ( ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5557:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5557:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5558:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5559:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5559:3: rule__PolarPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:5568:1: rule__PolarPlot__Group_8__0 : rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 ;
    public final void rule__PolarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5572:1: ( rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 )
            // InternalBiLang.g:5573:2: rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1
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
    // InternalBiLang.g:5580:1: rule__PolarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PolarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5584:1: ( ( 'colors' ) )
            // InternalBiLang.g:5585:1: ( 'colors' )
            {
            // InternalBiLang.g:5585:1: ( 'colors' )
            // InternalBiLang.g:5586:2: 'colors'
            {
             before(grammarAccess.getPolarPlotAccess().getColorsKeyword_8_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:5595:1: rule__PolarPlot__Group_8__1 : rule__PolarPlot__Group_8__1__Impl ;
    public final void rule__PolarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5599:1: ( rule__PolarPlot__Group_8__1__Impl )
            // InternalBiLang.g:5600:2: rule__PolarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:5606:1: rule__PolarPlot__Group_8__1__Impl : ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PolarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5610:1: ( ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5611:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5611:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5612:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5613:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5613:3: rule__PolarPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:5622:1: rule__PolarPlot__Group_9__0 : rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 ;
    public final void rule__PolarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5626:1: ( rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 )
            // InternalBiLang.g:5627:2: rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:5634:1: rule__PolarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PolarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5638:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5639:1: ( 'thickness' )
            {
            // InternalBiLang.g:5639:1: ( 'thickness' )
            // InternalBiLang.g:5640:2: 'thickness'
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:5649:1: rule__PolarPlot__Group_9__1 : rule__PolarPlot__Group_9__1__Impl ;
    public final void rule__PolarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5653:1: ( rule__PolarPlot__Group_9__1__Impl )
            // InternalBiLang.g:5654:2: rule__PolarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:5660:1: rule__PolarPlot__Group_9__1__Impl : ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PolarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5664:1: ( ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5665:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5665:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5666:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5667:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5667:3: rule__PolarPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:5676:1: rule__ScatterPlot__Group__0 : rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 ;
    public final void rule__ScatterPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5680:1: ( rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 )
            // InternalBiLang.g:5681:2: rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1
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
    // InternalBiLang.g:5688:1: rule__ScatterPlot__Group__0__Impl : ( 'scatter' ) ;
    public final void rule__ScatterPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5692:1: ( ( 'scatter' ) )
            // InternalBiLang.g:5693:1: ( 'scatter' )
            {
            // InternalBiLang.g:5693:1: ( 'scatter' )
            // InternalBiLang.g:5694:2: 'scatter'
            {
             before(grammarAccess.getScatterPlotAccess().getScatterKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalBiLang.g:5703:1: rule__ScatterPlot__Group__1 : rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 ;
    public final void rule__ScatterPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5707:1: ( rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 )
            // InternalBiLang.g:5708:2: rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:5715:1: rule__ScatterPlot__Group__1__Impl : ( ( rule__ScatterPlot__NameAssignment_1 ) ) ;
    public final void rule__ScatterPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5719:1: ( ( ( rule__ScatterPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5720:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5720:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5721:2: ( rule__ScatterPlot__NameAssignment_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5722:2: ( rule__ScatterPlot__NameAssignment_1 )
            // InternalBiLang.g:5722:3: rule__ScatterPlot__NameAssignment_1
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
    // InternalBiLang.g:5730:1: rule__ScatterPlot__Group__2 : rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 ;
    public final void rule__ScatterPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5734:1: ( rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 )
            // InternalBiLang.g:5735:2: rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:5742:1: rule__ScatterPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__ScatterPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5746:1: ( ( '->' ) )
            // InternalBiLang.g:5747:1: ( '->' )
            {
            // InternalBiLang.g:5747:1: ( '->' )
            // InternalBiLang.g:5748:2: '->'
            {
             before(grammarAccess.getScatterPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:5757:1: rule__ScatterPlot__Group__3 : rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 ;
    public final void rule__ScatterPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5761:1: ( rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 )
            // InternalBiLang.g:5762:2: rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4
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
    // InternalBiLang.g:5769:1: rule__ScatterPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__ScatterPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5773:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5774:1: ( 'xAx' )
            {
            // InternalBiLang.g:5774:1: ( 'xAx' )
            // InternalBiLang.g:5775:2: 'xAx'
            {
             before(grammarAccess.getScatterPlotAccess().getXAxKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:5784:1: rule__ScatterPlot__Group__4 : rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 ;
    public final void rule__ScatterPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5788:1: ( rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 )
            // InternalBiLang.g:5789:2: rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5796:1: rule__ScatterPlot__Group__4__Impl : ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) ;
    public final void rule__ScatterPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5800:1: ( ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5801:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5801:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5802:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getScatterPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5803:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5803:3: rule__ScatterPlot__XAxisAssignment_4
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
    // InternalBiLang.g:5811:1: rule__ScatterPlot__Group__5 : rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 ;
    public final void rule__ScatterPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5815:1: ( rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 )
            // InternalBiLang.g:5816:2: rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6
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
    // InternalBiLang.g:5823:1: rule__ScatterPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__ScatterPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5827:1: ( ( 'yA' ) )
            // InternalBiLang.g:5828:1: ( 'yA' )
            {
            // InternalBiLang.g:5828:1: ( 'yA' )
            // InternalBiLang.g:5829:2: 'yA'
            {
             before(grammarAccess.getScatterPlotAccess().getYAKeyword_5()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:5838:1: rule__ScatterPlot__Group__6 : rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 ;
    public final void rule__ScatterPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5842:1: ( rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 )
            // InternalBiLang.g:5843:2: rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:5850:1: rule__ScatterPlot__Group__6__Impl : ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) ;
    public final void rule__ScatterPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5854:1: ( ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5855:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5855:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5856:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getScatterPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5857:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5857:3: rule__ScatterPlot__YAxisAssignment_6
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
    // InternalBiLang.g:5865:1: rule__ScatterPlot__Group__7 : rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 ;
    public final void rule__ScatterPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5869:1: ( rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 )
            // InternalBiLang.g:5870:2: rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:5877:1: rule__ScatterPlot__Group__7__Impl : ( ( rule__ScatterPlot__Group_7__0 )? ) ;
    public final void rule__ScatterPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5881:1: ( ( ( rule__ScatterPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5882:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5882:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            // InternalBiLang.g:5883:2: ( rule__ScatterPlot__Group_7__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5884:2: ( rule__ScatterPlot__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==49) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:5884:3: rule__ScatterPlot__Group_7__0
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
    // InternalBiLang.g:5892:1: rule__ScatterPlot__Group__8 : rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 ;
    public final void rule__ScatterPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5896:1: ( rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 )
            // InternalBiLang.g:5897:2: rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:5904:1: rule__ScatterPlot__Group__8__Impl : ( ( rule__ScatterPlot__Group_8__0 )? ) ;
    public final void rule__ScatterPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5908:1: ( ( ( rule__ScatterPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5909:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5909:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            // InternalBiLang.g:5910:2: ( rule__ScatterPlot__Group_8__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5911:2: ( rule__ScatterPlot__Group_8__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBiLang.g:5911:3: rule__ScatterPlot__Group_8__0
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
    // InternalBiLang.g:5919:1: rule__ScatterPlot__Group__9 : rule__ScatterPlot__Group__9__Impl ;
    public final void rule__ScatterPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5923:1: ( rule__ScatterPlot__Group__9__Impl )
            // InternalBiLang.g:5924:2: rule__ScatterPlot__Group__9__Impl
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
    // InternalBiLang.g:5930:1: rule__ScatterPlot__Group__9__Impl : ( ( rule__ScatterPlot__Group_9__0 )? ) ;
    public final void rule__ScatterPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5934:1: ( ( ( rule__ScatterPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5935:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5935:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            // InternalBiLang.g:5936:2: ( rule__ScatterPlot__Group_9__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5937:2: ( rule__ScatterPlot__Group_9__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBiLang.g:5937:3: rule__ScatterPlot__Group_9__0
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
    // InternalBiLang.g:5946:1: rule__ScatterPlot__Group_7__0 : rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 ;
    public final void rule__ScatterPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5950:1: ( rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 )
            // InternalBiLang.g:5951:2: rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:5958:1: rule__ScatterPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__ScatterPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5962:1: ( ( 'loc' ) )
            // InternalBiLang.g:5963:1: ( 'loc' )
            {
            // InternalBiLang.g:5963:1: ( 'loc' )
            // InternalBiLang.g:5964:2: 'loc'
            {
             before(grammarAccess.getScatterPlotAccess().getLocKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:5973:1: rule__ScatterPlot__Group_7__1 : rule__ScatterPlot__Group_7__1__Impl ;
    public final void rule__ScatterPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5977:1: ( rule__ScatterPlot__Group_7__1__Impl )
            // InternalBiLang.g:5978:2: rule__ScatterPlot__Group_7__1__Impl
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
    // InternalBiLang.g:5984:1: rule__ScatterPlot__Group_7__1__Impl : ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__ScatterPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5988:1: ( ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5989:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5989:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5990:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5991:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5991:3: rule__ScatterPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:6000:1: rule__ScatterPlot__Group_8__0 : rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 ;
    public final void rule__ScatterPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6004:1: ( rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 )
            // InternalBiLang.g:6005:2: rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1
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
    // InternalBiLang.g:6012:1: rule__ScatterPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__ScatterPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6016:1: ( ( 'colors' ) )
            // InternalBiLang.g:6017:1: ( 'colors' )
            {
            // InternalBiLang.g:6017:1: ( 'colors' )
            // InternalBiLang.g:6018:2: 'colors'
            {
             before(grammarAccess.getScatterPlotAccess().getColorsKeyword_8_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:6027:1: rule__ScatterPlot__Group_8__1 : rule__ScatterPlot__Group_8__1__Impl ;
    public final void rule__ScatterPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6031:1: ( rule__ScatterPlot__Group_8__1__Impl )
            // InternalBiLang.g:6032:2: rule__ScatterPlot__Group_8__1__Impl
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
    // InternalBiLang.g:6038:1: rule__ScatterPlot__Group_8__1__Impl : ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__ScatterPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6042:1: ( ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:6043:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:6043:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:6044:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:6045:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:6045:3: rule__ScatterPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:6054:1: rule__ScatterPlot__Group_9__0 : rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 ;
    public final void rule__ScatterPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6058:1: ( rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 )
            // InternalBiLang.g:6059:2: rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:6066:1: rule__ScatterPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__ScatterPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6070:1: ( ( 'thickness' ) )
            // InternalBiLang.g:6071:1: ( 'thickness' )
            {
            // InternalBiLang.g:6071:1: ( 'thickness' )
            // InternalBiLang.g:6072:2: 'thickness'
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:6081:1: rule__ScatterPlot__Group_9__1 : rule__ScatterPlot__Group_9__1__Impl ;
    public final void rule__ScatterPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6085:1: ( rule__ScatterPlot__Group_9__1__Impl )
            // InternalBiLang.g:6086:2: rule__ScatterPlot__Group_9__1__Impl
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
    // InternalBiLang.g:6092:1: rule__ScatterPlot__Group_9__1__Impl : ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__ScatterPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6096:1: ( ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:6097:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:6097:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:6098:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:6099:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:6099:3: rule__ScatterPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:6108:1: rule__RadarPlot__Group__0 : rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 ;
    public final void rule__RadarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6112:1: ( rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 )
            // InternalBiLang.g:6113:2: rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1
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
    // InternalBiLang.g:6120:1: rule__RadarPlot__Group__0__Impl : ( 'radar' ) ;
    public final void rule__RadarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6124:1: ( ( 'radar' ) )
            // InternalBiLang.g:6125:1: ( 'radar' )
            {
            // InternalBiLang.g:6125:1: ( 'radar' )
            // InternalBiLang.g:6126:2: 'radar'
            {
             before(grammarAccess.getRadarPlotAccess().getRadarKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalBiLang.g:6135:1: rule__RadarPlot__Group__1 : rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 ;
    public final void rule__RadarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6139:1: ( rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 )
            // InternalBiLang.g:6140:2: rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:6147:1: rule__RadarPlot__Group__1__Impl : ( ( rule__RadarPlot__NameAssignment_1 ) ) ;
    public final void rule__RadarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6151:1: ( ( ( rule__RadarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:6152:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:6152:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:6153:2: ( rule__RadarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:6154:2: ( rule__RadarPlot__NameAssignment_1 )
            // InternalBiLang.g:6154:3: rule__RadarPlot__NameAssignment_1
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
    // InternalBiLang.g:6162:1: rule__RadarPlot__Group__2 : rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 ;
    public final void rule__RadarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6166:1: ( rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 )
            // InternalBiLang.g:6167:2: rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:6174:1: rule__RadarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__RadarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6178:1: ( ( '->' ) )
            // InternalBiLang.g:6179:1: ( '->' )
            {
            // InternalBiLang.g:6179:1: ( '->' )
            // InternalBiLang.g:6180:2: '->'
            {
             before(grammarAccess.getRadarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:6189:1: rule__RadarPlot__Group__3 : rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 ;
    public final void rule__RadarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6193:1: ( rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 )
            // InternalBiLang.g:6194:2: rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4
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
    // InternalBiLang.g:6201:1: rule__RadarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__RadarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6205:1: ( ( 'xAx' ) )
            // InternalBiLang.g:6206:1: ( 'xAx' )
            {
            // InternalBiLang.g:6206:1: ( 'xAx' )
            // InternalBiLang.g:6207:2: 'xAx'
            {
             before(grammarAccess.getRadarPlotAccess().getXAxKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:6216:1: rule__RadarPlot__Group__4 : rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 ;
    public final void rule__RadarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6220:1: ( rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 )
            // InternalBiLang.g:6221:2: rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:6228:1: rule__RadarPlot__Group__4__Impl : ( ( rule__RadarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__RadarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6232:1: ( ( ( rule__RadarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:6233:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:6233:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:6234:2: ( rule__RadarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getRadarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:6235:2: ( rule__RadarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:6235:3: rule__RadarPlot__XAxisAssignment_4
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
    // InternalBiLang.g:6243:1: rule__RadarPlot__Group__5 : rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 ;
    public final void rule__RadarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6247:1: ( rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 )
            // InternalBiLang.g:6248:2: rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6
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
    // InternalBiLang.g:6255:1: rule__RadarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__RadarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6259:1: ( ( 'yA' ) )
            // InternalBiLang.g:6260:1: ( 'yA' )
            {
            // InternalBiLang.g:6260:1: ( 'yA' )
            // InternalBiLang.g:6261:2: 'yA'
            {
             before(grammarAccess.getRadarPlotAccess().getYAKeyword_5()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:6270:1: rule__RadarPlot__Group__6 : rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 ;
    public final void rule__RadarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6274:1: ( rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 )
            // InternalBiLang.g:6275:2: rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:6282:1: rule__RadarPlot__Group__6__Impl : ( ( rule__RadarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__RadarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6286:1: ( ( ( rule__RadarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:6287:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:6287:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:6288:2: ( rule__RadarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getRadarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:6289:2: ( rule__RadarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:6289:3: rule__RadarPlot__YAxisAssignment_6
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
    // InternalBiLang.g:6297:1: rule__RadarPlot__Group__7 : rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 ;
    public final void rule__RadarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6301:1: ( rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 )
            // InternalBiLang.g:6302:2: rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:6309:1: rule__RadarPlot__Group__7__Impl : ( ( rule__RadarPlot__Group_7__0 )? ) ;
    public final void rule__RadarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6313:1: ( ( ( rule__RadarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:6314:1: ( ( rule__RadarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:6314:1: ( ( rule__RadarPlot__Group_7__0 )? )
            // InternalBiLang.g:6315:2: ( rule__RadarPlot__Group_7__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:6316:2: ( rule__RadarPlot__Group_7__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==49) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBiLang.g:6316:3: rule__RadarPlot__Group_7__0
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
    // InternalBiLang.g:6324:1: rule__RadarPlot__Group__8 : rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 ;
    public final void rule__RadarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6328:1: ( rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 )
            // InternalBiLang.g:6329:2: rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:6336:1: rule__RadarPlot__Group__8__Impl : ( ( rule__RadarPlot__Group_8__0 )? ) ;
    public final void rule__RadarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6340:1: ( ( ( rule__RadarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:6341:1: ( ( rule__RadarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:6341:1: ( ( rule__RadarPlot__Group_8__0 )? )
            // InternalBiLang.g:6342:2: ( rule__RadarPlot__Group_8__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:6343:2: ( rule__RadarPlot__Group_8__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBiLang.g:6343:3: rule__RadarPlot__Group_8__0
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
    // InternalBiLang.g:6351:1: rule__RadarPlot__Group__9 : rule__RadarPlot__Group__9__Impl ;
    public final void rule__RadarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6355:1: ( rule__RadarPlot__Group__9__Impl )
            // InternalBiLang.g:6356:2: rule__RadarPlot__Group__9__Impl
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
    // InternalBiLang.g:6362:1: rule__RadarPlot__Group__9__Impl : ( ( rule__RadarPlot__Group_9__0 )? ) ;
    public final void rule__RadarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6366:1: ( ( ( rule__RadarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:6367:1: ( ( rule__RadarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:6367:1: ( ( rule__RadarPlot__Group_9__0 )? )
            // InternalBiLang.g:6368:2: ( rule__RadarPlot__Group_9__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:6369:2: ( rule__RadarPlot__Group_9__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBiLang.g:6369:3: rule__RadarPlot__Group_9__0
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
    // InternalBiLang.g:6378:1: rule__RadarPlot__Group_7__0 : rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 ;
    public final void rule__RadarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6382:1: ( rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 )
            // InternalBiLang.g:6383:2: rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:6390:1: rule__RadarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__RadarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6394:1: ( ( 'loc' ) )
            // InternalBiLang.g:6395:1: ( 'loc' )
            {
            // InternalBiLang.g:6395:1: ( 'loc' )
            // InternalBiLang.g:6396:2: 'loc'
            {
             before(grammarAccess.getRadarPlotAccess().getLocKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:6405:1: rule__RadarPlot__Group_7__1 : rule__RadarPlot__Group_7__1__Impl ;
    public final void rule__RadarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6409:1: ( rule__RadarPlot__Group_7__1__Impl )
            // InternalBiLang.g:6410:2: rule__RadarPlot__Group_7__1__Impl
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
    // InternalBiLang.g:6416:1: rule__RadarPlot__Group_7__1__Impl : ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__RadarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6420:1: ( ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:6421:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:6421:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:6422:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:6423:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:6423:3: rule__RadarPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:6432:1: rule__RadarPlot__Group_8__0 : rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 ;
    public final void rule__RadarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6436:1: ( rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 )
            // InternalBiLang.g:6437:2: rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1
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
    // InternalBiLang.g:6444:1: rule__RadarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__RadarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6448:1: ( ( 'colors' ) )
            // InternalBiLang.g:6449:1: ( 'colors' )
            {
            // InternalBiLang.g:6449:1: ( 'colors' )
            // InternalBiLang.g:6450:2: 'colors'
            {
             before(grammarAccess.getRadarPlotAccess().getColorsKeyword_8_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:6459:1: rule__RadarPlot__Group_8__1 : rule__RadarPlot__Group_8__1__Impl ;
    public final void rule__RadarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6463:1: ( rule__RadarPlot__Group_8__1__Impl )
            // InternalBiLang.g:6464:2: rule__RadarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:6470:1: rule__RadarPlot__Group_8__1__Impl : ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__RadarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6474:1: ( ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:6475:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:6475:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:6476:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:6477:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:6477:3: rule__RadarPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:6486:1: rule__RadarPlot__Group_9__0 : rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 ;
    public final void rule__RadarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6490:1: ( rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 )
            // InternalBiLang.g:6491:2: rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:6498:1: rule__RadarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__RadarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6502:1: ( ( 'thickness' ) )
            // InternalBiLang.g:6503:1: ( 'thickness' )
            {
            // InternalBiLang.g:6503:1: ( 'thickness' )
            // InternalBiLang.g:6504:2: 'thickness'
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:6513:1: rule__RadarPlot__Group_9__1 : rule__RadarPlot__Group_9__1__Impl ;
    public final void rule__RadarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6517:1: ( rule__RadarPlot__Group_9__1__Impl )
            // InternalBiLang.g:6518:2: rule__RadarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:6524:1: rule__RadarPlot__Group_9__1__Impl : ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__RadarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6528:1: ( ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:6529:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:6529:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:6530:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:6531:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:6531:3: rule__RadarPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:6540:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6544:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6545:2: ( RULE_ID )
            {
            // InternalBiLang.g:6545:2: ( RULE_ID )
            // InternalBiLang.g:6546:3: RULE_ID
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
    // InternalBiLang.g:6555:1: rule__Task__FileextractorAssignment_4 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6559:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:6560:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:6560:2: ( ruleFileExtractor )
            // InternalBiLang.g:6561:3: ruleFileExtractor
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


    // $ANTLR start "rule__Task__DatafilteringAssignment_5"
    // InternalBiLang.g:6570:1: rule__Task__DatafilteringAssignment_5 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6574:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6575:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6575:2: ( ruleDataFiltering )
            // InternalBiLang.g:6576:3: ruleDataFiltering
            {
             before(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DatafilteringAssignment_5"


    // $ANTLR start "rule__Task__FileextractorAssignment_6_0"
    // InternalBiLang.g:6585:1: rule__Task__FileextractorAssignment_6_0 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6589:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:6590:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:6590:2: ( ruleFileExtractor )
            // InternalBiLang.g:6591:3: ruleFileExtractor
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


    // $ANTLR start "rule__Task__DatafilteringAssignment_6_1"
    // InternalBiLang.g:6600:1: rule__Task__DatafilteringAssignment_6_1 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6604:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6605:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6605:2: ( ruleDataFiltering )
            // InternalBiLang.g:6606:3: ruleDataFiltering
            {
             before(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFiltering();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DatafilteringAssignment_6_1"


    // $ANTLR start "rule__Task__DashboardAssignment_8"
    // InternalBiLang.g:6615:1: rule__Task__DashboardAssignment_8 : ( ruleDashBoard ) ;
    public final void rule__Task__DashboardAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6619:1: ( ( ruleDashBoard ) )
            // InternalBiLang.g:6620:2: ( ruleDashBoard )
            {
            // InternalBiLang.g:6620:2: ( ruleDashBoard )
            // InternalBiLang.g:6621:3: ruleDashBoard
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


    // $ANTLR start "rule__DataFiltering__FileextractorAssignment_1"
    // InternalBiLang.g:6630:1: rule__DataFiltering__FileextractorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__DataFiltering__FileextractorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6634:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6635:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6635:2: ( ( ruleEString ) )
            // InternalBiLang.g:6636:3: ( ruleEString )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0()); 
            // InternalBiLang.g:6637:3: ( ruleEString )
            // InternalBiLang.g:6638:4: ruleEString
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
    // InternalBiLang.g:6649:1: rule__DataFiltering__ProcessingstepAssignment_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6653:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6654:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6654:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6655:3: rulePreprocessingStep
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
    // InternalBiLang.g:6664:1: rule__DataFiltering__ProcessingstepAssignment_2_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6668:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6669:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6669:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6670:3: rulePreprocessingStep
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
    // InternalBiLang.g:6679:1: rule__DataFiltering__FilteringstepAssignment_3_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6683:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:6684:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:6684:2: ( ruleFilteringStep )
            // InternalBiLang.g:6685:3: ruleFilteringStep
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
    // InternalBiLang.g:6694:1: rule__DataFiltering__FilteringstepAssignment_3_2_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6698:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:6699:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:6699:2: ( ruleFilteringStep )
            // InternalBiLang.g:6700:3: ruleFilteringStep
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
    // InternalBiLang.g:6709:1: rule__DashBoard__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DashBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6713:1: ( ( ruleEString ) )
            // InternalBiLang.g:6714:2: ( ruleEString )
            {
            // InternalBiLang.g:6714:2: ( ruleEString )
            // InternalBiLang.g:6715:3: ruleEString
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


    // $ANTLR start "rule__DashBoard__FileextractorAssignment_2"
    // InternalBiLang.g:6724:1: rule__DashBoard__FileextractorAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__FileextractorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6728:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6729:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6729:2: ( ( ruleEString ) )
            // InternalBiLang.g:6730:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0()); 
            // InternalBiLang.g:6731:3: ( ruleEString )
            // InternalBiLang.g:6732:4: ruleEString
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__FileextractorAssignment_2"


    // $ANTLR start "rule__DashBoard__PlotAssignment_5"
    // InternalBiLang.g:6743:1: rule__DashBoard__PlotAssignment_5 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6747:1: ( ( rulePlot ) )
            // InternalBiLang.g:6748:2: ( rulePlot )
            {
            // InternalBiLang.g:6748:2: ( rulePlot )
            // InternalBiLang.g:6749:3: rulePlot
            {
             before(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePlot();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__PlotAssignment_5"


    // $ANTLR start "rule__DashBoard__PlotAssignment_6"
    // InternalBiLang.g:6758:1: rule__DashBoard__PlotAssignment_6 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6762:1: ( ( rulePlot ) )
            // InternalBiLang.g:6763:2: ( rulePlot )
            {
            // InternalBiLang.g:6763:2: ( rulePlot )
            // InternalBiLang.g:6764:3: rulePlot
            {
             before(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePlot();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__PlotAssignment_6"


    // $ANTLR start "rule__CsvExtractor__NameAssignment_1"
    // InternalBiLang.g:6773:1: rule__CsvExtractor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CsvExtractor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6777:1: ( ( ruleEString ) )
            // InternalBiLang.g:6778:2: ( ruleEString )
            {
            // InternalBiLang.g:6778:2: ( ruleEString )
            // InternalBiLang.g:6779:3: ruleEString
            {
             before(grammarAccess.getCsvExtractorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsvExtractorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__NameAssignment_1"


    // $ANTLR start "rule__CsvExtractor__PathAssignment_4"
    // InternalBiLang.g:6788:1: rule__CsvExtractor__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__CsvExtractor__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6792:1: ( ( ruleEString ) )
            // InternalBiLang.g:6793:2: ( ruleEString )
            {
            // InternalBiLang.g:6793:2: ( ruleEString )
            // InternalBiLang.g:6794:3: ruleEString
            {
             before(grammarAccess.getCsvExtractorAccess().getPathEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsvExtractorAccess().getPathEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__PathAssignment_4"


    // $ANTLR start "rule__CsvExtractor__NullreplacementAssignment_5_1"
    // InternalBiLang.g:6803:1: rule__CsvExtractor__NullreplacementAssignment_5_1 : ( ruleNullReplacement ) ;
    public final void rule__CsvExtractor__NullreplacementAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6807:1: ( ( ruleNullReplacement ) )
            // InternalBiLang.g:6808:2: ( ruleNullReplacement )
            {
            // InternalBiLang.g:6808:2: ( ruleNullReplacement )
            // InternalBiLang.g:6809:3: ruleNullReplacement
            {
             before(grammarAccess.getCsvExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNullReplacement();

            state._fsp--;

             after(grammarAccess.getCsvExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__NullreplacementAssignment_5_1"


    // $ANTLR start "rule__CsvExtractor__NullreplacementAssignment_5_2_1"
    // InternalBiLang.g:6818:1: rule__CsvExtractor__NullreplacementAssignment_5_2_1 : ( ruleNullReplacement ) ;
    public final void rule__CsvExtractor__NullreplacementAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6822:1: ( ( ruleNullReplacement ) )
            // InternalBiLang.g:6823:2: ( ruleNullReplacement )
            {
            // InternalBiLang.g:6823:2: ( ruleNullReplacement )
            // InternalBiLang.g:6824:3: ruleNullReplacement
            {
             before(grammarAccess.getCsvExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNullReplacement();

            state._fsp--;

             after(grammarAccess.getCsvExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvExtractor__NullreplacementAssignment_5_2_1"


    // $ANTLR start "rule__ExcelExtractor__NameAssignment_1"
    // InternalBiLang.g:6833:1: rule__ExcelExtractor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExcelExtractor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6837:1: ( ( ruleEString ) )
            // InternalBiLang.g:6838:2: ( ruleEString )
            {
            // InternalBiLang.g:6838:2: ( ruleEString )
            // InternalBiLang.g:6839:3: ruleEString
            {
             before(grammarAccess.getExcelExtractorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExcelExtractorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__NameAssignment_1"


    // $ANTLR start "rule__ExcelExtractor__PathAssignment_4"
    // InternalBiLang.g:6848:1: rule__ExcelExtractor__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__ExcelExtractor__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6852:1: ( ( ruleEString ) )
            // InternalBiLang.g:6853:2: ( ruleEString )
            {
            // InternalBiLang.g:6853:2: ( ruleEString )
            // InternalBiLang.g:6854:3: ruleEString
            {
             before(grammarAccess.getExcelExtractorAccess().getPathEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExcelExtractorAccess().getPathEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__PathAssignment_4"


    // $ANTLR start "rule__ExcelExtractor__NullreplacementAssignment_5_1"
    // InternalBiLang.g:6863:1: rule__ExcelExtractor__NullreplacementAssignment_5_1 : ( ruleNullReplacement ) ;
    public final void rule__ExcelExtractor__NullreplacementAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6867:1: ( ( ruleNullReplacement ) )
            // InternalBiLang.g:6868:2: ( ruleNullReplacement )
            {
            // InternalBiLang.g:6868:2: ( ruleNullReplacement )
            // InternalBiLang.g:6869:3: ruleNullReplacement
            {
             before(grammarAccess.getExcelExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNullReplacement();

            state._fsp--;

             after(grammarAccess.getExcelExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__NullreplacementAssignment_5_1"


    // $ANTLR start "rule__ExcelExtractor__NullreplacementAssignment_5_2_1"
    // InternalBiLang.g:6878:1: rule__ExcelExtractor__NullreplacementAssignment_5_2_1 : ( ruleNullReplacement ) ;
    public final void rule__ExcelExtractor__NullreplacementAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6882:1: ( ( ruleNullReplacement ) )
            // InternalBiLang.g:6883:2: ( ruleNullReplacement )
            {
            // InternalBiLang.g:6883:2: ( ruleNullReplacement )
            // InternalBiLang.g:6884:3: ruleNullReplacement
            {
             before(grammarAccess.getExcelExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNullReplacement();

            state._fsp--;

             after(grammarAccess.getExcelExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExcelExtractor__NullreplacementAssignment_5_2_1"


    // $ANTLR start "rule__NullReplacement__ColNameAssignment_0"
    // InternalBiLang.g:6893:1: rule__NullReplacement__ColNameAssignment_0 : ( ruleEString ) ;
    public final void rule__NullReplacement__ColNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6897:1: ( ( ruleEString ) )
            // InternalBiLang.g:6898:2: ( ruleEString )
            {
            // InternalBiLang.g:6898:2: ( ruleEString )
            // InternalBiLang.g:6899:3: ruleEString
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
    // InternalBiLang.g:6908:1: rule__NullReplacement__LabelAssignment_2_0 : ( ruleEString ) ;
    public final void rule__NullReplacement__LabelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6912:1: ( ( ruleEString ) )
            // InternalBiLang.g:6913:2: ( ruleEString )
            {
            // InternalBiLang.g:6913:2: ( ruleEString )
            // InternalBiLang.g:6914:3: ruleEString
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
    // InternalBiLang.g:6923:1: rule__NullReplacement__StatisticaloperationAssignment_2_1 : ( ruleStatisticalOperation ) ;
    public final void rule__NullReplacement__StatisticaloperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6927:1: ( ( ruleStatisticalOperation ) )
            // InternalBiLang.g:6928:2: ( ruleStatisticalOperation )
            {
            // InternalBiLang.g:6928:2: ( ruleStatisticalOperation )
            // InternalBiLang.g:6929:3: ruleStatisticalOperation
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
    // InternalBiLang.g:6938:1: rule__QuantitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QuantitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6942:1: ( ( ruleEString ) )
            // InternalBiLang.g:6943:2: ( ruleEString )
            {
            // InternalBiLang.g:6943:2: ( ruleEString )
            // InternalBiLang.g:6944:3: ruleEString
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
    // InternalBiLang.g:6953:1: rule__QuantitativeFiltering__OperatorAssignment_2 : ( ruleQuantitativeOperator ) ;
    public final void rule__QuantitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6957:1: ( ( ruleQuantitativeOperator ) )
            // InternalBiLang.g:6958:2: ( ruleQuantitativeOperator )
            {
            // InternalBiLang.g:6958:2: ( ruleQuantitativeOperator )
            // InternalBiLang.g:6959:3: ruleQuantitativeOperator
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
    // InternalBiLang.g:6968:1: rule__QuantitativeFiltering__ValuesAssignment_3 : ( ruleEFloat ) ;
    public final void rule__QuantitativeFiltering__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6972:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6973:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6973:2: ( ruleEFloat )
            // InternalBiLang.g:6974:3: ruleEFloat
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
    // InternalBiLang.g:6983:1: rule__QualitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6987:1: ( ( ruleEString ) )
            // InternalBiLang.g:6988:2: ( ruleEString )
            {
            // InternalBiLang.g:6988:2: ( ruleEString )
            // InternalBiLang.g:6989:3: ruleEString
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
    // InternalBiLang.g:6998:1: rule__QualitativeFiltering__OperatorAssignment_2 : ( ruleQualitativeOperator ) ;
    public final void rule__QualitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7002:1: ( ( ruleQualitativeOperator ) )
            // InternalBiLang.g:7003:2: ( ruleQualitativeOperator )
            {
            // InternalBiLang.g:7003:2: ( ruleQualitativeOperator )
            // InternalBiLang.g:7004:3: ruleQualitativeOperator
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
    // InternalBiLang.g:7013:1: rule__QualitativeFiltering__LabelsAssignment_3 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__LabelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7017:1: ( ( ruleEString ) )
            // InternalBiLang.g:7018:2: ( ruleEString )
            {
            // InternalBiLang.g:7018:2: ( ruleEString )
            // InternalBiLang.g:7019:3: ruleEString
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
    // InternalBiLang.g:7028:1: rule__MathOperation__LsideAssignment_2 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__LsideAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7032:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:7033:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:7033:2: ( rulePreprocessingStep )
            // InternalBiLang.g:7034:3: rulePreprocessingStep
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
    // InternalBiLang.g:7043:1: rule__MathOperation__OperatorAssignment_3 : ( ruleMathOperator ) ;
    public final void rule__MathOperation__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7047:1: ( ( ruleMathOperator ) )
            // InternalBiLang.g:7048:2: ( ruleMathOperator )
            {
            // InternalBiLang.g:7048:2: ( ruleMathOperator )
            // InternalBiLang.g:7049:3: ruleMathOperator
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
    // InternalBiLang.g:7058:1: rule__MathOperation__RsideAssignment_5 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__RsideAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7062:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:7063:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:7063:2: ( rulePreprocessingStep )
            // InternalBiLang.g:7064:3: rulePreprocessingStep
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
    // InternalBiLang.g:7073:1: rule__ColReference__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__ColReference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7077:1: ( ( ruleEString ) )
            // InternalBiLang.g:7078:2: ( ruleEString )
            {
            // InternalBiLang.g:7078:2: ( ruleEString )
            // InternalBiLang.g:7079:3: ruleEString
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
    // InternalBiLang.g:7088:1: rule__StatisticalOperation__OperatorAssignment_0 : ( ruleStatisticalOperator ) ;
    public final void rule__StatisticalOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7092:1: ( ( ruleStatisticalOperator ) )
            // InternalBiLang.g:7093:2: ( ruleStatisticalOperator )
            {
            // InternalBiLang.g:7093:2: ( ruleStatisticalOperator )
            // InternalBiLang.g:7094:3: ruleStatisticalOperator
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
    // InternalBiLang.g:7103:1: rule__StatisticalOperation__ColreferenceAssignment_2 : ( ruleColReference ) ;
    public final void rule__StatisticalOperation__ColreferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7107:1: ( ( ruleColReference ) )
            // InternalBiLang.g:7108:2: ( ruleColReference )
            {
            // InternalBiLang.g:7108:2: ( ruleColReference )
            // InternalBiLang.g:7109:3: ruleColReference
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
    // InternalBiLang.g:7118:1: rule__BarPlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BarPlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7122:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7123:2: ( RULE_ID )
            {
            // InternalBiLang.g:7123:2: ( RULE_ID )
            // InternalBiLang.g:7124:3: RULE_ID
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
    // InternalBiLang.g:7133:1: rule__BarPlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__BarPlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7137:1: ( ( ruleEString ) )
            // InternalBiLang.g:7138:2: ( ruleEString )
            {
            // InternalBiLang.g:7138:2: ( ruleEString )
            // InternalBiLang.g:7139:3: ruleEString
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
    // InternalBiLang.g:7148:1: rule__BarPlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__BarPlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7152:1: ( ( ruleEString ) )
            // InternalBiLang.g:7153:2: ( ruleEString )
            {
            // InternalBiLang.g:7153:2: ( ruleEString )
            // InternalBiLang.g:7154:3: ruleEString
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
    // InternalBiLang.g:7163:1: rule__BarPlot__LocationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__BarPlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7167:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7168:2: ( ruleEInt )
            {
            // InternalBiLang.g:7168:2: ( ruleEInt )
            // InternalBiLang.g:7169:3: ruleEInt
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
    // InternalBiLang.g:7178:1: rule__BarPlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarPlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7182:1: ( ( ruleEString ) )
            // InternalBiLang.g:7183:2: ( ruleEString )
            {
            // InternalBiLang.g:7183:2: ( ruleEString )
            // InternalBiLang.g:7184:3: ruleEString
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
    // InternalBiLang.g:7193:1: rule__BarPlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__BarPlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7197:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7198:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7198:2: ( ruleEFloat )
            // InternalBiLang.g:7199:3: ruleEFloat
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
    // InternalBiLang.g:7208:1: rule__LinePlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinePlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7212:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7213:2: ( RULE_ID )
            {
            // InternalBiLang.g:7213:2: ( RULE_ID )
            // InternalBiLang.g:7214:3: RULE_ID
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
    // InternalBiLang.g:7223:1: rule__LinePlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__LinePlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7227:1: ( ( ruleEString ) )
            // InternalBiLang.g:7228:2: ( ruleEString )
            {
            // InternalBiLang.g:7228:2: ( ruleEString )
            // InternalBiLang.g:7229:3: ruleEString
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
    // InternalBiLang.g:7238:1: rule__LinePlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__LinePlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7242:1: ( ( ruleEString ) )
            // InternalBiLang.g:7243:2: ( ruleEString )
            {
            // InternalBiLang.g:7243:2: ( ruleEString )
            // InternalBiLang.g:7244:3: ruleEString
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
    // InternalBiLang.g:7253:1: rule__LinePlot__LocationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__LinePlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7257:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7258:2: ( ruleEInt )
            {
            // InternalBiLang.g:7258:2: ( ruleEInt )
            // InternalBiLang.g:7259:3: ruleEInt
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
    // InternalBiLang.g:7268:1: rule__LinePlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LinePlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7272:1: ( ( ruleEString ) )
            // InternalBiLang.g:7273:2: ( ruleEString )
            {
            // InternalBiLang.g:7273:2: ( ruleEString )
            // InternalBiLang.g:7274:3: ruleEString
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
    // InternalBiLang.g:7283:1: rule__LinePlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__LinePlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7287:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7288:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7288:2: ( ruleEFloat )
            // InternalBiLang.g:7289:3: ruleEFloat
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
    // InternalBiLang.g:7298:1: rule__DonutPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DonutPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7302:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7303:2: ( RULE_ID )
            {
            // InternalBiLang.g:7303:2: ( RULE_ID )
            // InternalBiLang.g:7304:3: RULE_ID
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
    // InternalBiLang.g:7313:1: rule__DonutPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__DonutPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7317:1: ( ( ruleEString ) )
            // InternalBiLang.g:7318:2: ( ruleEString )
            {
            // InternalBiLang.g:7318:2: ( ruleEString )
            // InternalBiLang.g:7319:3: ruleEString
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
    // InternalBiLang.g:7328:1: rule__DonutPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__DonutPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7332:1: ( ( ruleEString ) )
            // InternalBiLang.g:7333:2: ( ruleEString )
            {
            // InternalBiLang.g:7333:2: ( ruleEString )
            // InternalBiLang.g:7334:3: ruleEString
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
    // InternalBiLang.g:7343:1: rule__DonutPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__DonutPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7347:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7348:2: ( ruleEInt )
            {
            // InternalBiLang.g:7348:2: ( ruleEInt )
            // InternalBiLang.g:7349:3: ruleEInt
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
    // InternalBiLang.g:7358:1: rule__DonutPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__DonutPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7362:1: ( ( ruleEString ) )
            // InternalBiLang.g:7363:2: ( ruleEString )
            {
            // InternalBiLang.g:7363:2: ( ruleEString )
            // InternalBiLang.g:7364:3: ruleEString
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
    // InternalBiLang.g:7373:1: rule__DonutPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__DonutPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7377:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7378:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7378:2: ( ruleEFloat )
            // InternalBiLang.g:7379:3: ruleEFloat
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
    // InternalBiLang.g:7388:1: rule__PiePlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PiePlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7392:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7393:2: ( RULE_ID )
            {
            // InternalBiLang.g:7393:2: ( RULE_ID )
            // InternalBiLang.g:7394:3: RULE_ID
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
    // InternalBiLang.g:7403:1: rule__PiePlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PiePlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7407:1: ( ( ruleEString ) )
            // InternalBiLang.g:7408:2: ( ruleEString )
            {
            // InternalBiLang.g:7408:2: ( ruleEString )
            // InternalBiLang.g:7409:3: ruleEString
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
    // InternalBiLang.g:7418:1: rule__PiePlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PiePlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7422:1: ( ( ruleEString ) )
            // InternalBiLang.g:7423:2: ( ruleEString )
            {
            // InternalBiLang.g:7423:2: ( ruleEString )
            // InternalBiLang.g:7424:3: ruleEString
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
    // InternalBiLang.g:7433:1: rule__PiePlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__PiePlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7437:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7438:2: ( ruleEInt )
            {
            // InternalBiLang.g:7438:2: ( ruleEInt )
            // InternalBiLang.g:7439:3: ruleEInt
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
    // InternalBiLang.g:7448:1: rule__PiePlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PiePlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7452:1: ( ( ruleEString ) )
            // InternalBiLang.g:7453:2: ( ruleEString )
            {
            // InternalBiLang.g:7453:2: ( ruleEString )
            // InternalBiLang.g:7454:3: ruleEString
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
    // InternalBiLang.g:7463:1: rule__PiePlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PiePlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7467:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7468:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7468:2: ( ruleEFloat )
            // InternalBiLang.g:7469:3: ruleEFloat
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
    // InternalBiLang.g:7478:1: rule__PolarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PolarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7482:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7483:2: ( RULE_ID )
            {
            // InternalBiLang.g:7483:2: ( RULE_ID )
            // InternalBiLang.g:7484:3: RULE_ID
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
    // InternalBiLang.g:7493:1: rule__PolarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PolarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7497:1: ( ( ruleEString ) )
            // InternalBiLang.g:7498:2: ( ruleEString )
            {
            // InternalBiLang.g:7498:2: ( ruleEString )
            // InternalBiLang.g:7499:3: ruleEString
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
    // InternalBiLang.g:7508:1: rule__PolarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PolarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7512:1: ( ( ruleEString ) )
            // InternalBiLang.g:7513:2: ( ruleEString )
            {
            // InternalBiLang.g:7513:2: ( ruleEString )
            // InternalBiLang.g:7514:3: ruleEString
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
    // InternalBiLang.g:7523:1: rule__PolarPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__PolarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7527:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7528:2: ( ruleEInt )
            {
            // InternalBiLang.g:7528:2: ( ruleEInt )
            // InternalBiLang.g:7529:3: ruleEInt
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
    // InternalBiLang.g:7538:1: rule__PolarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PolarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7542:1: ( ( ruleEString ) )
            // InternalBiLang.g:7543:2: ( ruleEString )
            {
            // InternalBiLang.g:7543:2: ( ruleEString )
            // InternalBiLang.g:7544:3: ruleEString
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
    // InternalBiLang.g:7553:1: rule__PolarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PolarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7557:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7558:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7558:2: ( ruleEFloat )
            // InternalBiLang.g:7559:3: ruleEFloat
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
    // InternalBiLang.g:7568:1: rule__ScatterPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScatterPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7572:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7573:2: ( RULE_ID )
            {
            // InternalBiLang.g:7573:2: ( RULE_ID )
            // InternalBiLang.g:7574:3: RULE_ID
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
    // InternalBiLang.g:7583:1: rule__ScatterPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__ScatterPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7587:1: ( ( ruleEString ) )
            // InternalBiLang.g:7588:2: ( ruleEString )
            {
            // InternalBiLang.g:7588:2: ( ruleEString )
            // InternalBiLang.g:7589:3: ruleEString
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
    // InternalBiLang.g:7598:1: rule__ScatterPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__ScatterPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7602:1: ( ( ruleEString ) )
            // InternalBiLang.g:7603:2: ( ruleEString )
            {
            // InternalBiLang.g:7603:2: ( ruleEString )
            // InternalBiLang.g:7604:3: ruleEString
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
    // InternalBiLang.g:7613:1: rule__ScatterPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__ScatterPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7617:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7618:2: ( ruleEInt )
            {
            // InternalBiLang.g:7618:2: ( ruleEInt )
            // InternalBiLang.g:7619:3: ruleEInt
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
    // InternalBiLang.g:7628:1: rule__ScatterPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ScatterPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7632:1: ( ( ruleEString ) )
            // InternalBiLang.g:7633:2: ( ruleEString )
            {
            // InternalBiLang.g:7633:2: ( ruleEString )
            // InternalBiLang.g:7634:3: ruleEString
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
    // InternalBiLang.g:7643:1: rule__ScatterPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__ScatterPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7647:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7648:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7648:2: ( ruleEFloat )
            // InternalBiLang.g:7649:3: ruleEFloat
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
    // InternalBiLang.g:7658:1: rule__RadarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RadarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7662:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7663:2: ( RULE_ID )
            {
            // InternalBiLang.g:7663:2: ( RULE_ID )
            // InternalBiLang.g:7664:3: RULE_ID
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
    // InternalBiLang.g:7673:1: rule__RadarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__RadarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7677:1: ( ( ruleEString ) )
            // InternalBiLang.g:7678:2: ( ruleEString )
            {
            // InternalBiLang.g:7678:2: ( ruleEString )
            // InternalBiLang.g:7679:3: ruleEString
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
    // InternalBiLang.g:7688:1: rule__RadarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__RadarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7692:1: ( ( ruleEString ) )
            // InternalBiLang.g:7693:2: ( ruleEString )
            {
            // InternalBiLang.g:7693:2: ( ruleEString )
            // InternalBiLang.g:7694:3: ruleEString
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
    // InternalBiLang.g:7703:1: rule__RadarPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__RadarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7707:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7708:2: ( ruleEInt )
            {
            // InternalBiLang.g:7708:2: ( ruleEInt )
            // InternalBiLang.g:7709:3: ruleEInt
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
    // InternalBiLang.g:7718:1: rule__RadarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__RadarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7722:1: ( ( ruleEString ) )
            // InternalBiLang.g:7723:2: ( ruleEString )
            {
            // InternalBiLang.g:7723:2: ( ruleEString )
            // InternalBiLang.g:7724:3: ruleEString
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
    // InternalBiLang.g:7733:1: rule__RadarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__RadarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7737:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7738:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7738:2: ( ruleEFloat )
            // InternalBiLang.g:7739:3: ruleEFloat
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000300000E0030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x03F0200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x03F0201000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x03F0200000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000004040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});

}