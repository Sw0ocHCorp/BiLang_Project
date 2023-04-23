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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'+'", "'-'", "'*'", "'/'", "'mean'", "'median'", "'std'", "'= '", "'!= '", "'='", "'<'", "'>'", "'Task'", "':'", "'load'", "'[dashboard:'", "']'", "'=>'", "'processing='", "','", "'filtering='", "'plots'", "'{'", "'}'", "'df'", "'.csv'", "'.xlsx'", "'('", "'l'", "'r'", "')'", "'.'", "'bar'", "'->'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'donut'", "'pie'", "'polar'", "'scatter'", "'radar'"
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


    // $ANTLR start "entryRuleQuantitativeFiltering"
    // InternalBiLang.g:303:1: entryRuleQuantitativeFiltering : ruleQuantitativeFiltering EOF ;
    public final void entryRuleQuantitativeFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:304:1: ( ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:305:1: ruleQuantitativeFiltering EOF
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
    // InternalBiLang.g:312:1: ruleQuantitativeFiltering : ( ( rule__QuantitativeFiltering__Group__0 ) ) ;
    public final void ruleQuantitativeFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:316:2: ( ( ( rule__QuantitativeFiltering__Group__0 ) ) )
            // InternalBiLang.g:317:2: ( ( rule__QuantitativeFiltering__Group__0 ) )
            {
            // InternalBiLang.g:317:2: ( ( rule__QuantitativeFiltering__Group__0 ) )
            // InternalBiLang.g:318:3: ( rule__QuantitativeFiltering__Group__0 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getGroup()); 
            // InternalBiLang.g:319:3: ( rule__QuantitativeFiltering__Group__0 )
            // InternalBiLang.g:319:4: rule__QuantitativeFiltering__Group__0
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
    // InternalBiLang.g:328:1: entryRuleQualitativeFiltering : ruleQualitativeFiltering EOF ;
    public final void entryRuleQualitativeFiltering() throws RecognitionException {
        try {
            // InternalBiLang.g:329:1: ( ruleQualitativeFiltering EOF )
            // InternalBiLang.g:330:1: ruleQualitativeFiltering EOF
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
    // InternalBiLang.g:337:1: ruleQualitativeFiltering : ( ( rule__QualitativeFiltering__Group__0 ) ) ;
    public final void ruleQualitativeFiltering() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:341:2: ( ( ( rule__QualitativeFiltering__Group__0 ) ) )
            // InternalBiLang.g:342:2: ( ( rule__QualitativeFiltering__Group__0 ) )
            {
            // InternalBiLang.g:342:2: ( ( rule__QualitativeFiltering__Group__0 ) )
            // InternalBiLang.g:343:3: ( rule__QualitativeFiltering__Group__0 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getGroup()); 
            // InternalBiLang.g:344:3: ( rule__QualitativeFiltering__Group__0 )
            // InternalBiLang.g:344:4: rule__QualitativeFiltering__Group__0
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
    // InternalBiLang.g:353:1: entryRuleMathOperation : ruleMathOperation EOF ;
    public final void entryRuleMathOperation() throws RecognitionException {
        try {
            // InternalBiLang.g:354:1: ( ruleMathOperation EOF )
            // InternalBiLang.g:355:1: ruleMathOperation EOF
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
    // InternalBiLang.g:362:1: ruleMathOperation : ( ( rule__MathOperation__Group__0 ) ) ;
    public final void ruleMathOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:366:2: ( ( ( rule__MathOperation__Group__0 ) ) )
            // InternalBiLang.g:367:2: ( ( rule__MathOperation__Group__0 ) )
            {
            // InternalBiLang.g:367:2: ( ( rule__MathOperation__Group__0 ) )
            // InternalBiLang.g:368:3: ( rule__MathOperation__Group__0 )
            {
             before(grammarAccess.getMathOperationAccess().getGroup()); 
            // InternalBiLang.g:369:3: ( rule__MathOperation__Group__0 )
            // InternalBiLang.g:369:4: rule__MathOperation__Group__0
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
    // InternalBiLang.g:378:1: entryRuleColReference : ruleColReference EOF ;
    public final void entryRuleColReference() throws RecognitionException {
        try {
            // InternalBiLang.g:379:1: ( ruleColReference EOF )
            // InternalBiLang.g:380:1: ruleColReference EOF
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
    // InternalBiLang.g:387:1: ruleColReference : ( ( rule__ColReference__Group__0 ) ) ;
    public final void ruleColReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:391:2: ( ( ( rule__ColReference__Group__0 ) ) )
            // InternalBiLang.g:392:2: ( ( rule__ColReference__Group__0 ) )
            {
            // InternalBiLang.g:392:2: ( ( rule__ColReference__Group__0 ) )
            // InternalBiLang.g:393:3: ( rule__ColReference__Group__0 )
            {
             before(grammarAccess.getColReferenceAccess().getGroup()); 
            // InternalBiLang.g:394:3: ( rule__ColReference__Group__0 )
            // InternalBiLang.g:394:4: rule__ColReference__Group__0
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
    // InternalBiLang.g:403:1: entryRuleStatisticalOperation : ruleStatisticalOperation EOF ;
    public final void entryRuleStatisticalOperation() throws RecognitionException {
        try {
            // InternalBiLang.g:404:1: ( ruleStatisticalOperation EOF )
            // InternalBiLang.g:405:1: ruleStatisticalOperation EOF
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
    // InternalBiLang.g:412:1: ruleStatisticalOperation : ( ( rule__StatisticalOperation__Group__0 ) ) ;
    public final void ruleStatisticalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:416:2: ( ( ( rule__StatisticalOperation__Group__0 ) ) )
            // InternalBiLang.g:417:2: ( ( rule__StatisticalOperation__Group__0 ) )
            {
            // InternalBiLang.g:417:2: ( ( rule__StatisticalOperation__Group__0 ) )
            // InternalBiLang.g:418:3: ( rule__StatisticalOperation__Group__0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getGroup()); 
            // InternalBiLang.g:419:3: ( rule__StatisticalOperation__Group__0 )
            // InternalBiLang.g:419:4: rule__StatisticalOperation__Group__0
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
    // InternalBiLang.g:428:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalBiLang.g:429:1: ( ruleEFloat EOF )
            // InternalBiLang.g:430:1: ruleEFloat EOF
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
    // InternalBiLang.g:437:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:441:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalBiLang.g:442:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalBiLang.g:442:2: ( ( rule__EFloat__Group__0 ) )
            // InternalBiLang.g:443:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalBiLang.g:444:3: ( rule__EFloat__Group__0 )
            // InternalBiLang.g:444:4: rule__EFloat__Group__0
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
    // InternalBiLang.g:453:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBiLang.g:454:1: ( ruleEInt EOF )
            // InternalBiLang.g:455:1: ruleEInt EOF
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
    // InternalBiLang.g:462:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:466:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBiLang.g:467:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBiLang.g:467:2: ( ( rule__EInt__Group__0 ) )
            // InternalBiLang.g:468:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBiLang.g:469:3: ( rule__EInt__Group__0 )
            // InternalBiLang.g:469:4: rule__EInt__Group__0
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
    // InternalBiLang.g:478:1: entryRuleBarPlot : ruleBarPlot EOF ;
    public final void entryRuleBarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:479:1: ( ruleBarPlot EOF )
            // InternalBiLang.g:480:1: ruleBarPlot EOF
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
    // InternalBiLang.g:487:1: ruleBarPlot : ( ( rule__BarPlot__Group__0 ) ) ;
    public final void ruleBarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:491:2: ( ( ( rule__BarPlot__Group__0 ) ) )
            // InternalBiLang.g:492:2: ( ( rule__BarPlot__Group__0 ) )
            {
            // InternalBiLang.g:492:2: ( ( rule__BarPlot__Group__0 ) )
            // InternalBiLang.g:493:3: ( rule__BarPlot__Group__0 )
            {
             before(grammarAccess.getBarPlotAccess().getGroup()); 
            // InternalBiLang.g:494:3: ( rule__BarPlot__Group__0 )
            // InternalBiLang.g:494:4: rule__BarPlot__Group__0
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
    // InternalBiLang.g:503:1: entryRuleLinePlot : ruleLinePlot EOF ;
    public final void entryRuleLinePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:504:1: ( ruleLinePlot EOF )
            // InternalBiLang.g:505:1: ruleLinePlot EOF
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
    // InternalBiLang.g:512:1: ruleLinePlot : ( ( rule__LinePlot__Group__0 ) ) ;
    public final void ruleLinePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:516:2: ( ( ( rule__LinePlot__Group__0 ) ) )
            // InternalBiLang.g:517:2: ( ( rule__LinePlot__Group__0 ) )
            {
            // InternalBiLang.g:517:2: ( ( rule__LinePlot__Group__0 ) )
            // InternalBiLang.g:518:3: ( rule__LinePlot__Group__0 )
            {
             before(grammarAccess.getLinePlotAccess().getGroup()); 
            // InternalBiLang.g:519:3: ( rule__LinePlot__Group__0 )
            // InternalBiLang.g:519:4: rule__LinePlot__Group__0
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
    // InternalBiLang.g:528:1: entryRuleDonutPlot : ruleDonutPlot EOF ;
    public final void entryRuleDonutPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:529:1: ( ruleDonutPlot EOF )
            // InternalBiLang.g:530:1: ruleDonutPlot EOF
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
    // InternalBiLang.g:537:1: ruleDonutPlot : ( ( rule__DonutPlot__Group__0 ) ) ;
    public final void ruleDonutPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:541:2: ( ( ( rule__DonutPlot__Group__0 ) ) )
            // InternalBiLang.g:542:2: ( ( rule__DonutPlot__Group__0 ) )
            {
            // InternalBiLang.g:542:2: ( ( rule__DonutPlot__Group__0 ) )
            // InternalBiLang.g:543:3: ( rule__DonutPlot__Group__0 )
            {
             before(grammarAccess.getDonutPlotAccess().getGroup()); 
            // InternalBiLang.g:544:3: ( rule__DonutPlot__Group__0 )
            // InternalBiLang.g:544:4: rule__DonutPlot__Group__0
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
    // InternalBiLang.g:553:1: entryRulePiePlot : rulePiePlot EOF ;
    public final void entryRulePiePlot() throws RecognitionException {
        try {
            // InternalBiLang.g:554:1: ( rulePiePlot EOF )
            // InternalBiLang.g:555:1: rulePiePlot EOF
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
    // InternalBiLang.g:562:1: rulePiePlot : ( ( rule__PiePlot__Group__0 ) ) ;
    public final void rulePiePlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:566:2: ( ( ( rule__PiePlot__Group__0 ) ) )
            // InternalBiLang.g:567:2: ( ( rule__PiePlot__Group__0 ) )
            {
            // InternalBiLang.g:567:2: ( ( rule__PiePlot__Group__0 ) )
            // InternalBiLang.g:568:3: ( rule__PiePlot__Group__0 )
            {
             before(grammarAccess.getPiePlotAccess().getGroup()); 
            // InternalBiLang.g:569:3: ( rule__PiePlot__Group__0 )
            // InternalBiLang.g:569:4: rule__PiePlot__Group__0
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
    // InternalBiLang.g:578:1: entryRulePolarPlot : rulePolarPlot EOF ;
    public final void entryRulePolarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:579:1: ( rulePolarPlot EOF )
            // InternalBiLang.g:580:1: rulePolarPlot EOF
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
    // InternalBiLang.g:587:1: rulePolarPlot : ( ( rule__PolarPlot__Group__0 ) ) ;
    public final void rulePolarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:591:2: ( ( ( rule__PolarPlot__Group__0 ) ) )
            // InternalBiLang.g:592:2: ( ( rule__PolarPlot__Group__0 ) )
            {
            // InternalBiLang.g:592:2: ( ( rule__PolarPlot__Group__0 ) )
            // InternalBiLang.g:593:3: ( rule__PolarPlot__Group__0 )
            {
             before(grammarAccess.getPolarPlotAccess().getGroup()); 
            // InternalBiLang.g:594:3: ( rule__PolarPlot__Group__0 )
            // InternalBiLang.g:594:4: rule__PolarPlot__Group__0
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
    // InternalBiLang.g:603:1: entryRuleScatterPlot : ruleScatterPlot EOF ;
    public final void entryRuleScatterPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:604:1: ( ruleScatterPlot EOF )
            // InternalBiLang.g:605:1: ruleScatterPlot EOF
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
    // InternalBiLang.g:612:1: ruleScatterPlot : ( ( rule__ScatterPlot__Group__0 ) ) ;
    public final void ruleScatterPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:616:2: ( ( ( rule__ScatterPlot__Group__0 ) ) )
            // InternalBiLang.g:617:2: ( ( rule__ScatterPlot__Group__0 ) )
            {
            // InternalBiLang.g:617:2: ( ( rule__ScatterPlot__Group__0 ) )
            // InternalBiLang.g:618:3: ( rule__ScatterPlot__Group__0 )
            {
             before(grammarAccess.getScatterPlotAccess().getGroup()); 
            // InternalBiLang.g:619:3: ( rule__ScatterPlot__Group__0 )
            // InternalBiLang.g:619:4: rule__ScatterPlot__Group__0
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
    // InternalBiLang.g:628:1: entryRuleRadarPlot : ruleRadarPlot EOF ;
    public final void entryRuleRadarPlot() throws RecognitionException {
        try {
            // InternalBiLang.g:629:1: ( ruleRadarPlot EOF )
            // InternalBiLang.g:630:1: ruleRadarPlot EOF
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
    // InternalBiLang.g:637:1: ruleRadarPlot : ( ( rule__RadarPlot__Group__0 ) ) ;
    public final void ruleRadarPlot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:641:2: ( ( ( rule__RadarPlot__Group__0 ) ) )
            // InternalBiLang.g:642:2: ( ( rule__RadarPlot__Group__0 ) )
            {
            // InternalBiLang.g:642:2: ( ( rule__RadarPlot__Group__0 ) )
            // InternalBiLang.g:643:3: ( rule__RadarPlot__Group__0 )
            {
             before(grammarAccess.getRadarPlotAccess().getGroup()); 
            // InternalBiLang.g:644:3: ( rule__RadarPlot__Group__0 )
            // InternalBiLang.g:644:4: rule__RadarPlot__Group__0
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
    // InternalBiLang.g:653:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:657:1: ( ( ( rule__MathOperator__Alternatives ) ) )
            // InternalBiLang.g:658:2: ( ( rule__MathOperator__Alternatives ) )
            {
            // InternalBiLang.g:658:2: ( ( rule__MathOperator__Alternatives ) )
            // InternalBiLang.g:659:3: ( rule__MathOperator__Alternatives )
            {
             before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:660:3: ( rule__MathOperator__Alternatives )
            // InternalBiLang.g:660:4: rule__MathOperator__Alternatives
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
    // InternalBiLang.g:669:1: ruleStatisticalOperator : ( ( rule__StatisticalOperator__Alternatives ) ) ;
    public final void ruleStatisticalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:673:1: ( ( ( rule__StatisticalOperator__Alternatives ) ) )
            // InternalBiLang.g:674:2: ( ( rule__StatisticalOperator__Alternatives ) )
            {
            // InternalBiLang.g:674:2: ( ( rule__StatisticalOperator__Alternatives ) )
            // InternalBiLang.g:675:3: ( rule__StatisticalOperator__Alternatives )
            {
             before(grammarAccess.getStatisticalOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:676:3: ( rule__StatisticalOperator__Alternatives )
            // InternalBiLang.g:676:4: rule__StatisticalOperator__Alternatives
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
    // InternalBiLang.g:685:1: ruleQualitativeOperator : ( ( rule__QualitativeOperator__Alternatives ) ) ;
    public final void ruleQualitativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:689:1: ( ( ( rule__QualitativeOperator__Alternatives ) ) )
            // InternalBiLang.g:690:2: ( ( rule__QualitativeOperator__Alternatives ) )
            {
            // InternalBiLang.g:690:2: ( ( rule__QualitativeOperator__Alternatives ) )
            // InternalBiLang.g:691:3: ( rule__QualitativeOperator__Alternatives )
            {
             before(grammarAccess.getQualitativeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:692:3: ( rule__QualitativeOperator__Alternatives )
            // InternalBiLang.g:692:4: rule__QualitativeOperator__Alternatives
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
    // InternalBiLang.g:701:1: ruleQuantitativeOperator : ( ( rule__QuantitativeOperator__Alternatives ) ) ;
    public final void ruleQuantitativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:705:1: ( ( ( rule__QuantitativeOperator__Alternatives ) ) )
            // InternalBiLang.g:706:2: ( ( rule__QuantitativeOperator__Alternatives ) )
            {
            // InternalBiLang.g:706:2: ( ( rule__QuantitativeOperator__Alternatives ) )
            // InternalBiLang.g:707:3: ( rule__QuantitativeOperator__Alternatives )
            {
             before(grammarAccess.getQuantitativeOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:708:3: ( rule__QuantitativeOperator__Alternatives )
            // InternalBiLang.g:708:4: rule__QuantitativeOperator__Alternatives
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
    // InternalBiLang.g:716:1: rule__FileExtractor__Alternatives : ( ( ruleCsvExtractor ) | ( ruleExcelExtractor ) );
    public final void rule__FileExtractor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:720:1: ( ( ruleCsvExtractor ) | ( ruleExcelExtractor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==38) ) {
                    alt1=1;
                }
                else if ( (LA1_1==39) ) {
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

                if ( (LA1_2==38) ) {
                    alt1=1;
                }
                else if ( (LA1_2==39) ) {
                    alt1=2;
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
                    // InternalBiLang.g:721:2: ( ruleCsvExtractor )
                    {
                    // InternalBiLang.g:721:2: ( ruleCsvExtractor )
                    // InternalBiLang.g:722:3: ruleCsvExtractor
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
                    // InternalBiLang.g:727:2: ( ruleExcelExtractor )
                    {
                    // InternalBiLang.g:727:2: ( ruleExcelExtractor )
                    // InternalBiLang.g:728:3: ruleExcelExtractor
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
    // InternalBiLang.g:737:1: rule__FilteringStep__Alternatives : ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) );
    public final void rule__FilteringStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:741:1: ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=20 && LA2_1<=21)) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=22 && LA2_1<=24)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=22 && LA2_2<=24)) ) {
                    alt2=1;
                }
                else if ( ((LA2_2>=20 && LA2_2<=21)) ) {
                    alt2=2;
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
                    // InternalBiLang.g:742:2: ( ruleQuantitativeFiltering )
                    {
                    // InternalBiLang.g:742:2: ( ruleQuantitativeFiltering )
                    // InternalBiLang.g:743:3: ruleQuantitativeFiltering
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
                    // InternalBiLang.g:748:2: ( ruleQualitativeFiltering )
                    {
                    // InternalBiLang.g:748:2: ( ruleQualitativeFiltering )
                    // InternalBiLang.g:749:3: ruleQualitativeFiltering
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
    // InternalBiLang.g:758:1: rule__PreprocessingStep__Alternatives : ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) );
    public final void rule__PreprocessingStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:762:1: ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) )
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
                    // InternalBiLang.g:763:2: ( ruleMathOperation )
                    {
                    // InternalBiLang.g:763:2: ( ruleMathOperation )
                    // InternalBiLang.g:764:3: ruleMathOperation
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
                    // InternalBiLang.g:769:2: ( ruleColReference )
                    {
                    // InternalBiLang.g:769:2: ( ruleColReference )
                    // InternalBiLang.g:770:3: ruleColReference
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
                    // InternalBiLang.g:775:2: ( ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:775:2: ( ruleStatisticalOperation )
                    // InternalBiLang.g:776:3: ruleStatisticalOperation
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
    // InternalBiLang.g:785:1: rule__Plot__Alternatives : ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) );
    public final void rule__Plot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:789:1: ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) )
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
                    // InternalBiLang.g:790:2: ( ruleBarPlot )
                    {
                    // InternalBiLang.g:790:2: ( ruleBarPlot )
                    // InternalBiLang.g:791:3: ruleBarPlot
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
                    // InternalBiLang.g:796:2: ( ruleLinePlot )
                    {
                    // InternalBiLang.g:796:2: ( ruleLinePlot )
                    // InternalBiLang.g:797:3: ruleLinePlot
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
                    // InternalBiLang.g:802:2: ( ruleDonutPlot )
                    {
                    // InternalBiLang.g:802:2: ( ruleDonutPlot )
                    // InternalBiLang.g:803:3: ruleDonutPlot
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
                    // InternalBiLang.g:808:2: ( ruleScatterPlot )
                    {
                    // InternalBiLang.g:808:2: ( ruleScatterPlot )
                    // InternalBiLang.g:809:3: ruleScatterPlot
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
                    // InternalBiLang.g:814:2: ( rulePolarPlot )
                    {
                    // InternalBiLang.g:814:2: ( rulePolarPlot )
                    // InternalBiLang.g:815:3: rulePolarPlot
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
                    // InternalBiLang.g:820:2: ( ruleRadarPlot )
                    {
                    // InternalBiLang.g:820:2: ( ruleRadarPlot )
                    // InternalBiLang.g:821:3: ruleRadarPlot
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
                    // InternalBiLang.g:826:2: ( rulePiePlot )
                    {
                    // InternalBiLang.g:826:2: ( rulePiePlot )
                    // InternalBiLang.g:827:3: rulePiePlot
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
    // InternalBiLang.g:836:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:840:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBiLang.g:841:2: ( RULE_STRING )
                    {
                    // InternalBiLang.g:841:2: ( RULE_STRING )
                    // InternalBiLang.g:842:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:847:2: ( RULE_ID )
                    {
                    // InternalBiLang.g:847:2: ( RULE_ID )
                    // InternalBiLang.g:848:3: RULE_ID
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


    // $ANTLR start "rule__DashBoard__Alternatives_2"
    // InternalBiLang.g:857:1: rule__DashBoard__Alternatives_2 : ( ( ( rule__DashBoard__Group_2_0__0 ) ) | ( ( rule__DashBoard__Group_2_1__0 ) ) );
    public final void rule__DashBoard__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:861:1: ( ( ( rule__DashBoard__Group_2_0__0 ) ) | ( ( rule__DashBoard__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==37) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBiLang.g:862:2: ( ( rule__DashBoard__Group_2_0__0 ) )
                    {
                    // InternalBiLang.g:862:2: ( ( rule__DashBoard__Group_2_0__0 ) )
                    // InternalBiLang.g:863:3: ( rule__DashBoard__Group_2_0__0 )
                    {
                     before(grammarAccess.getDashBoardAccess().getGroup_2_0()); 
                    // InternalBiLang.g:864:3: ( rule__DashBoard__Group_2_0__0 )
                    // InternalBiLang.g:864:4: rule__DashBoard__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DashBoard__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDashBoardAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:868:2: ( ( rule__DashBoard__Group_2_1__0 ) )
                    {
                    // InternalBiLang.g:868:2: ( ( rule__DashBoard__Group_2_1__0 ) )
                    // InternalBiLang.g:869:3: ( rule__DashBoard__Group_2_1__0 )
                    {
                     before(grammarAccess.getDashBoardAccess().getGroup_2_1()); 
                    // InternalBiLang.g:870:3: ( rule__DashBoard__Group_2_1__0 )
                    // InternalBiLang.g:870:4: rule__DashBoard__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DashBoard__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDashBoardAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__DashBoard__Alternatives_2"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalBiLang.g:878:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:882:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalBiLang.g:883:2: ( 'E' )
                    {
                    // InternalBiLang.g:883:2: ( 'E' )
                    // InternalBiLang.g:884:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:889:2: ( 'e' )
                    {
                    // InternalBiLang.g:889:2: ( 'e' )
                    // InternalBiLang.g:890:3: 'e'
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
    // InternalBiLang.g:899:1: rule__MathOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:903:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
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
                    // InternalBiLang.g:904:2: ( ( '+' ) )
                    {
                    // InternalBiLang.g:904:2: ( ( '+' ) )
                    // InternalBiLang.g:905:3: ( '+' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:906:3: ( '+' )
                    // InternalBiLang.g:906:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:910:2: ( ( '-' ) )
                    {
                    // InternalBiLang.g:910:2: ( ( '-' ) )
                    // InternalBiLang.g:911:3: ( '-' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:912:3: ( '-' )
                    // InternalBiLang.g:912:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:916:2: ( ( '*' ) )
                    {
                    // InternalBiLang.g:916:2: ( ( '*' ) )
                    // InternalBiLang.g:917:3: ( '*' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:918:3: ( '*' )
                    // InternalBiLang.g:918:4: '*'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:922:2: ( ( '/' ) )
                    {
                    // InternalBiLang.g:922:2: ( ( '/' ) )
                    // InternalBiLang.g:923:3: ( '/' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3()); 
                    // InternalBiLang.g:924:3: ( '/' )
                    // InternalBiLang.g:924:4: '/'
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
    // InternalBiLang.g:932:1: rule__StatisticalOperator__Alternatives : ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) );
    public final void rule__StatisticalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:936:1: ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) )
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
                    // InternalBiLang.g:937:2: ( ( 'mean' ) )
                    {
                    // InternalBiLang.g:937:2: ( ( 'mean' ) )
                    // InternalBiLang.g:938:3: ( 'mean' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:939:3: ( 'mean' )
                    // InternalBiLang.g:939:4: 'mean'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:943:2: ( ( 'median' ) )
                    {
                    // InternalBiLang.g:943:2: ( ( 'median' ) )
                    // InternalBiLang.g:944:3: ( 'median' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:945:3: ( 'median' )
                    // InternalBiLang.g:945:4: 'median'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:949:2: ( ( 'std' ) )
                    {
                    // InternalBiLang.g:949:2: ( ( 'std' ) )
                    // InternalBiLang.g:950:3: ( 'std' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:951:3: ( 'std' )
                    // InternalBiLang.g:951:4: 'std'
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
    // InternalBiLang.g:959:1: rule__QualitativeOperator__Alternatives : ( ( ( '= ' ) ) | ( ( '!= ' ) ) );
    public final void rule__QualitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:963:1: ( ( ( '= ' ) ) | ( ( '!= ' ) ) )
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
                    // InternalBiLang.g:964:2: ( ( '= ' ) )
                    {
                    // InternalBiLang.g:964:2: ( ( '= ' ) )
                    // InternalBiLang.g:965:3: ( '= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:966:3: ( '= ' )
                    // InternalBiLang.g:966:4: '= '
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:970:2: ( ( '!= ' ) )
                    {
                    // InternalBiLang.g:970:2: ( ( '!= ' ) )
                    // InternalBiLang.g:971:3: ( '!= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:972:3: ( '!= ' )
                    // InternalBiLang.g:972:4: '!= '
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
    // InternalBiLang.g:980:1: rule__QuantitativeOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__QuantitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:984:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) )
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
                    // InternalBiLang.g:985:2: ( ( '=' ) )
                    {
                    // InternalBiLang.g:985:2: ( ( '=' ) )
                    // InternalBiLang.g:986:3: ( '=' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:987:3: ( '=' )
                    // InternalBiLang.g:987:4: '='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:991:2: ( ( '<' ) )
                    {
                    // InternalBiLang.g:991:2: ( ( '<' ) )
                    // InternalBiLang.g:992:3: ( '<' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:993:3: ( '<' )
                    // InternalBiLang.g:993:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:997:2: ( ( '>' ) )
                    {
                    // InternalBiLang.g:997:2: ( ( '>' ) )
                    // InternalBiLang.g:998:3: ( '>' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:999:3: ( '>' )
                    // InternalBiLang.g:999:4: '>'
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
    // InternalBiLang.g:1007:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1011:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBiLang.g:1012:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalBiLang.g:1019:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1023:1: ( ( 'Task' ) )
            // InternalBiLang.g:1024:1: ( 'Task' )
            {
            // InternalBiLang.g:1024:1: ( 'Task' )
            // InternalBiLang.g:1025:2: 'Task'
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
    // InternalBiLang.g:1034:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1038:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBiLang.g:1039:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalBiLang.g:1046:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1050:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBiLang.g:1051:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1051:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBiLang.g:1052:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1053:2: ( rule__Task__NameAssignment_1 )
            // InternalBiLang.g:1053:3: rule__Task__NameAssignment_1
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
    // InternalBiLang.g:1061:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1065:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalBiLang.g:1066:2: rule__Task__Group__2__Impl rule__Task__Group__3
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
    // InternalBiLang.g:1073:1: rule__Task__Group__2__Impl : ( ':' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1077:1: ( ( ':' ) )
            // InternalBiLang.g:1078:1: ( ':' )
            {
            // InternalBiLang.g:1078:1: ( ':' )
            // InternalBiLang.g:1079:2: ':'
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
    // InternalBiLang.g:1088:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1092:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalBiLang.g:1093:2: rule__Task__Group__3__Impl rule__Task__Group__4
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
    // InternalBiLang.g:1100:1: rule__Task__Group__3__Impl : ( 'load' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1104:1: ( ( 'load' ) )
            // InternalBiLang.g:1105:1: ( 'load' )
            {
            // InternalBiLang.g:1105:1: ( 'load' )
            // InternalBiLang.g:1106:2: 'load'
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
    // InternalBiLang.g:1115:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1119:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalBiLang.g:1120:2: rule__Task__Group__4__Impl rule__Task__Group__5
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
    // InternalBiLang.g:1127:1: rule__Task__Group__4__Impl : ( ( rule__Task__FileextractorAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1131:1: ( ( ( rule__Task__FileextractorAssignment_4 ) ) )
            // InternalBiLang.g:1132:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            {
            // InternalBiLang.g:1132:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            // InternalBiLang.g:1133:2: ( rule__Task__FileextractorAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_4()); 
            // InternalBiLang.g:1134:2: ( rule__Task__FileextractorAssignment_4 )
            // InternalBiLang.g:1134:3: rule__Task__FileextractorAssignment_4
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
    // InternalBiLang.g:1142:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1146:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalBiLang.g:1147:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalBiLang.g:1154:1: rule__Task__Group__5__Impl : ( ( rule__Task__DatafilteringAssignment_5 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1158:1: ( ( ( rule__Task__DatafilteringAssignment_5 )? ) )
            // InternalBiLang.g:1159:1: ( ( rule__Task__DatafilteringAssignment_5 )? )
            {
            // InternalBiLang.g:1159:1: ( ( rule__Task__DatafilteringAssignment_5 )? )
            // InternalBiLang.g:1160:2: ( rule__Task__DatafilteringAssignment_5 )?
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_5()); 
            // InternalBiLang.g:1161:2: ( rule__Task__DatafilteringAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBiLang.g:1161:3: rule__Task__DatafilteringAssignment_5
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
    // InternalBiLang.g:1169:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1173:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalBiLang.g:1174:2: rule__Task__Group__6__Impl rule__Task__Group__7
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
    // InternalBiLang.g:1181:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )* ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1185:1: ( ( ( rule__Task__Group_6__0 )* ) )
            // InternalBiLang.g:1186:1: ( ( rule__Task__Group_6__0 )* )
            {
            // InternalBiLang.g:1186:1: ( ( rule__Task__Group_6__0 )* )
            // InternalBiLang.g:1187:2: ( rule__Task__Group_6__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalBiLang.g:1188:2: ( rule__Task__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBiLang.g:1188:3: rule__Task__Group_6__0
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
    // InternalBiLang.g:1196:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1200:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalBiLang.g:1201:2: rule__Task__Group__7__Impl rule__Task__Group__8
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
    // InternalBiLang.g:1208:1: rule__Task__Group__7__Impl : ( '[dashboard:' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1212:1: ( ( '[dashboard:' ) )
            // InternalBiLang.g:1213:1: ( '[dashboard:' )
            {
            // InternalBiLang.g:1213:1: ( '[dashboard:' )
            // InternalBiLang.g:1214:2: '[dashboard:'
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
    // InternalBiLang.g:1223:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1227:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalBiLang.g:1228:2: rule__Task__Group__8__Impl rule__Task__Group__9
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
    // InternalBiLang.g:1235:1: rule__Task__Group__8__Impl : ( ( rule__Task__DashboardAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1239:1: ( ( ( rule__Task__DashboardAssignment_8 ) ) )
            // InternalBiLang.g:1240:1: ( ( rule__Task__DashboardAssignment_8 ) )
            {
            // InternalBiLang.g:1240:1: ( ( rule__Task__DashboardAssignment_8 ) )
            // InternalBiLang.g:1241:2: ( rule__Task__DashboardAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getDashboardAssignment_8()); 
            // InternalBiLang.g:1242:2: ( rule__Task__DashboardAssignment_8 )
            // InternalBiLang.g:1242:3: rule__Task__DashboardAssignment_8
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
    // InternalBiLang.g:1250:1: rule__Task__Group__9 : rule__Task__Group__9__Impl ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1254:1: ( rule__Task__Group__9__Impl )
            // InternalBiLang.g:1255:2: rule__Task__Group__9__Impl
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
    // InternalBiLang.g:1261:1: rule__Task__Group__9__Impl : ( ']' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1265:1: ( ( ']' ) )
            // InternalBiLang.g:1266:1: ( ']' )
            {
            // InternalBiLang.g:1266:1: ( ']' )
            // InternalBiLang.g:1267:2: ']'
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
    // InternalBiLang.g:1277:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1281:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalBiLang.g:1282:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
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
    // InternalBiLang.g:1289:1: rule__Task__Group_6__0__Impl : ( ( rule__Task__FileextractorAssignment_6_0 ) ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1293:1: ( ( ( rule__Task__FileextractorAssignment_6_0 ) ) )
            // InternalBiLang.g:1294:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            {
            // InternalBiLang.g:1294:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            // InternalBiLang.g:1295:2: ( rule__Task__FileextractorAssignment_6_0 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0()); 
            // InternalBiLang.g:1296:2: ( rule__Task__FileextractorAssignment_6_0 )
            // InternalBiLang.g:1296:3: rule__Task__FileextractorAssignment_6_0
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
    // InternalBiLang.g:1304:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1308:1: ( rule__Task__Group_6__1__Impl )
            // InternalBiLang.g:1309:2: rule__Task__Group_6__1__Impl
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
    // InternalBiLang.g:1315:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DatafilteringAssignment_6_1 )? ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1319:1: ( ( ( rule__Task__DatafilteringAssignment_6_1 )? ) )
            // InternalBiLang.g:1320:1: ( ( rule__Task__DatafilteringAssignment_6_1 )? )
            {
            // InternalBiLang.g:1320:1: ( ( rule__Task__DatafilteringAssignment_6_1 )? )
            // InternalBiLang.g:1321:2: ( rule__Task__DatafilteringAssignment_6_1 )?
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1()); 
            // InternalBiLang.g:1322:2: ( rule__Task__DatafilteringAssignment_6_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBiLang.g:1322:3: rule__Task__DatafilteringAssignment_6_1
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
    // InternalBiLang.g:1331:1: rule__DataFiltering__Group__0 : rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 ;
    public final void rule__DataFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1335:1: ( rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 )
            // InternalBiLang.g:1336:2: rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1
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
    // InternalBiLang.g:1343:1: rule__DataFiltering__Group__0__Impl : ( '=>' ) ;
    public final void rule__DataFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1347:1: ( ( '=>' ) )
            // InternalBiLang.g:1348:1: ( '=>' )
            {
            // InternalBiLang.g:1348:1: ( '=>' )
            // InternalBiLang.g:1349:2: '=>'
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
    // InternalBiLang.g:1358:1: rule__DataFiltering__Group__1 : rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 ;
    public final void rule__DataFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1362:1: ( rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 )
            // InternalBiLang.g:1363:2: rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2
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
    // InternalBiLang.g:1370:1: rule__DataFiltering__Group__1__Impl : ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) ;
    public final void rule__DataFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1374:1: ( ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) )
            // InternalBiLang.g:1375:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            {
            // InternalBiLang.g:1375:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            // InternalBiLang.g:1376:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_1()); 
            // InternalBiLang.g:1377:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            // InternalBiLang.g:1377:3: rule__DataFiltering__FileextractorAssignment_1
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
    // InternalBiLang.g:1385:1: rule__DataFiltering__Group__2 : rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 ;
    public final void rule__DataFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1389:1: ( rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 )
            // InternalBiLang.g:1390:2: rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3
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
    // InternalBiLang.g:1397:1: rule__DataFiltering__Group__2__Impl : ( ( rule__DataFiltering__Group_2__0 )? ) ;
    public final void rule__DataFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1401:1: ( ( ( rule__DataFiltering__Group_2__0 )? ) )
            // InternalBiLang.g:1402:1: ( ( rule__DataFiltering__Group_2__0 )? )
            {
            // InternalBiLang.g:1402:1: ( ( rule__DataFiltering__Group_2__0 )? )
            // InternalBiLang.g:1403:2: ( rule__DataFiltering__Group_2__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2()); 
            // InternalBiLang.g:1404:2: ( rule__DataFiltering__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:1404:3: rule__DataFiltering__Group_2__0
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
    // InternalBiLang.g:1412:1: rule__DataFiltering__Group__3 : rule__DataFiltering__Group__3__Impl ;
    public final void rule__DataFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1416:1: ( rule__DataFiltering__Group__3__Impl )
            // InternalBiLang.g:1417:2: rule__DataFiltering__Group__3__Impl
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
    // InternalBiLang.g:1423:1: rule__DataFiltering__Group__3__Impl : ( ( rule__DataFiltering__Group_3__0 )? ) ;
    public final void rule__DataFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1427:1: ( ( ( rule__DataFiltering__Group_3__0 )? ) )
            // InternalBiLang.g:1428:1: ( ( rule__DataFiltering__Group_3__0 )? )
            {
            // InternalBiLang.g:1428:1: ( ( rule__DataFiltering__Group_3__0 )? )
            // InternalBiLang.g:1429:2: ( rule__DataFiltering__Group_3__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_3()); 
            // InternalBiLang.g:1430:2: ( rule__DataFiltering__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBiLang.g:1430:3: rule__DataFiltering__Group_3__0
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
    // InternalBiLang.g:1439:1: rule__DataFiltering__Group_2__0 : rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 ;
    public final void rule__DataFiltering__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1443:1: ( rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 )
            // InternalBiLang.g:1444:2: rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1
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
    // InternalBiLang.g:1451:1: rule__DataFiltering__Group_2__0__Impl : ( 'processing=' ) ;
    public final void rule__DataFiltering__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1455:1: ( ( 'processing=' ) )
            // InternalBiLang.g:1456:1: ( 'processing=' )
            {
            // InternalBiLang.g:1456:1: ( 'processing=' )
            // InternalBiLang.g:1457:2: 'processing='
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
    // InternalBiLang.g:1466:1: rule__DataFiltering__Group_2__1 : rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 ;
    public final void rule__DataFiltering__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1470:1: ( rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 )
            // InternalBiLang.g:1471:2: rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2
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
    // InternalBiLang.g:1478:1: rule__DataFiltering__Group_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1482:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) ) )
            // InternalBiLang.g:1483:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) )
            {
            // InternalBiLang.g:1483:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) )
            // InternalBiLang.g:1484:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1()); 
            // InternalBiLang.g:1485:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1 )
            // InternalBiLang.g:1485:3: rule__DataFiltering__ProcessingstepAssignment_2_1
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
    // InternalBiLang.g:1493:1: rule__DataFiltering__Group_2__2 : rule__DataFiltering__Group_2__2__Impl ;
    public final void rule__DataFiltering__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1497:1: ( rule__DataFiltering__Group_2__2__Impl )
            // InternalBiLang.g:1498:2: rule__DataFiltering__Group_2__2__Impl
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
    // InternalBiLang.g:1504:1: rule__DataFiltering__Group_2__2__Impl : ( ( rule__DataFiltering__Group_2_2__0 )* ) ;
    public final void rule__DataFiltering__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1508:1: ( ( ( rule__DataFiltering__Group_2_2__0 )* ) )
            // InternalBiLang.g:1509:1: ( ( rule__DataFiltering__Group_2_2__0 )* )
            {
            // InternalBiLang.g:1509:1: ( ( rule__DataFiltering__Group_2_2__0 )* )
            // InternalBiLang.g:1510:2: ( rule__DataFiltering__Group_2_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_2()); 
            // InternalBiLang.g:1511:2: ( rule__DataFiltering__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBiLang.g:1511:3: rule__DataFiltering__Group_2_2__0
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
    // InternalBiLang.g:1520:1: rule__DataFiltering__Group_2_2__0 : rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 ;
    public final void rule__DataFiltering__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1524:1: ( rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 )
            // InternalBiLang.g:1525:2: rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1
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
    // InternalBiLang.g:1532:1: rule__DataFiltering__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1536:1: ( ( ',' ) )
            // InternalBiLang.g:1537:1: ( ',' )
            {
            // InternalBiLang.g:1537:1: ( ',' )
            // InternalBiLang.g:1538:2: ','
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
    // InternalBiLang.g:1547:1: rule__DataFiltering__Group_2_2__1 : rule__DataFiltering__Group_2_2__1__Impl ;
    public final void rule__DataFiltering__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1551:1: ( rule__DataFiltering__Group_2_2__1__Impl )
            // InternalBiLang.g:1552:2: rule__DataFiltering__Group_2_2__1__Impl
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
    // InternalBiLang.g:1558:1: rule__DataFiltering__Group_2_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1562:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) ) )
            // InternalBiLang.g:1563:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) )
            {
            // InternalBiLang.g:1563:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) )
            // InternalBiLang.g:1564:2: ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_2_1()); 
            // InternalBiLang.g:1565:2: ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 )
            // InternalBiLang.g:1565:3: rule__DataFiltering__ProcessingstepAssignment_2_2_1
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
    // InternalBiLang.g:1574:1: rule__DataFiltering__Group_3__0 : rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1 ;
    public final void rule__DataFiltering__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1578:1: ( rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1 )
            // InternalBiLang.g:1579:2: rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1
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
    // InternalBiLang.g:1586:1: rule__DataFiltering__Group_3__0__Impl : ( 'filtering=' ) ;
    public final void rule__DataFiltering__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1590:1: ( ( 'filtering=' ) )
            // InternalBiLang.g:1591:1: ( 'filtering=' )
            {
            // InternalBiLang.g:1591:1: ( 'filtering=' )
            // InternalBiLang.g:1592:2: 'filtering='
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
    // InternalBiLang.g:1601:1: rule__DataFiltering__Group_3__1 : rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2 ;
    public final void rule__DataFiltering__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1605:1: ( rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2 )
            // InternalBiLang.g:1606:2: rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2
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
    // InternalBiLang.g:1613:1: rule__DataFiltering__Group_3__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) ) ;
    public final void rule__DataFiltering__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1617:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) ) )
            // InternalBiLang.g:1618:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) )
            {
            // InternalBiLang.g:1618:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) )
            // InternalBiLang.g:1619:2: ( rule__DataFiltering__FilteringstepAssignment_3_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_1()); 
            // InternalBiLang.g:1620:2: ( rule__DataFiltering__FilteringstepAssignment_3_1 )
            // InternalBiLang.g:1620:3: rule__DataFiltering__FilteringstepAssignment_3_1
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
    // InternalBiLang.g:1628:1: rule__DataFiltering__Group_3__2 : rule__DataFiltering__Group_3__2__Impl ;
    public final void rule__DataFiltering__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1632:1: ( rule__DataFiltering__Group_3__2__Impl )
            // InternalBiLang.g:1633:2: rule__DataFiltering__Group_3__2__Impl
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
    // InternalBiLang.g:1639:1: rule__DataFiltering__Group_3__2__Impl : ( ( rule__DataFiltering__Group_3_2__0 )* ) ;
    public final void rule__DataFiltering__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1643:1: ( ( ( rule__DataFiltering__Group_3_2__0 )* ) )
            // InternalBiLang.g:1644:1: ( ( rule__DataFiltering__Group_3_2__0 )* )
            {
            // InternalBiLang.g:1644:1: ( ( rule__DataFiltering__Group_3_2__0 )* )
            // InternalBiLang.g:1645:2: ( rule__DataFiltering__Group_3_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_3_2()); 
            // InternalBiLang.g:1646:2: ( rule__DataFiltering__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBiLang.g:1646:3: rule__DataFiltering__Group_3_2__0
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
    // InternalBiLang.g:1655:1: rule__DataFiltering__Group_3_2__0 : rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1 ;
    public final void rule__DataFiltering__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1659:1: ( rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1 )
            // InternalBiLang.g:1660:2: rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1
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
    // InternalBiLang.g:1667:1: rule__DataFiltering__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1671:1: ( ( ',' ) )
            // InternalBiLang.g:1672:1: ( ',' )
            {
            // InternalBiLang.g:1672:1: ( ',' )
            // InternalBiLang.g:1673:2: ','
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
    // InternalBiLang.g:1682:1: rule__DataFiltering__Group_3_2__1 : rule__DataFiltering__Group_3_2__1__Impl ;
    public final void rule__DataFiltering__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1686:1: ( rule__DataFiltering__Group_3_2__1__Impl )
            // InternalBiLang.g:1687:2: rule__DataFiltering__Group_3_2__1__Impl
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
    // InternalBiLang.g:1693:1: rule__DataFiltering__Group_3_2__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) ) ;
    public final void rule__DataFiltering__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1697:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) ) )
            // InternalBiLang.g:1698:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) )
            {
            // InternalBiLang.g:1698:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) )
            // InternalBiLang.g:1699:2: ( rule__DataFiltering__FilteringstepAssignment_3_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_2_1()); 
            // InternalBiLang.g:1700:2: ( rule__DataFiltering__FilteringstepAssignment_3_2_1 )
            // InternalBiLang.g:1700:3: rule__DataFiltering__FilteringstepAssignment_3_2_1
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
    // InternalBiLang.g:1709:1: rule__DashBoard__Group__0 : rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 ;
    public final void rule__DashBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1713:1: ( rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 )
            // InternalBiLang.g:1714:2: rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1
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
    // InternalBiLang.g:1721:1: rule__DashBoard__Group__0__Impl : ( ( rule__DashBoard__NameAssignment_0 ) ) ;
    public final void rule__DashBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1725:1: ( ( ( rule__DashBoard__NameAssignment_0 ) ) )
            // InternalBiLang.g:1726:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            {
            // InternalBiLang.g:1726:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            // InternalBiLang.g:1727:2: ( rule__DashBoard__NameAssignment_0 )
            {
             before(grammarAccess.getDashBoardAccess().getNameAssignment_0()); 
            // InternalBiLang.g:1728:2: ( rule__DashBoard__NameAssignment_0 )
            // InternalBiLang.g:1728:3: rule__DashBoard__NameAssignment_0
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
    // InternalBiLang.g:1736:1: rule__DashBoard__Group__1 : rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 ;
    public final void rule__DashBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1740:1: ( rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 )
            // InternalBiLang.g:1741:2: rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalBiLang.g:1748:1: rule__DashBoard__Group__1__Impl : ( '=>' ) ;
    public final void rule__DashBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1752:1: ( ( '=>' ) )
            // InternalBiLang.g:1753:1: ( '=>' )
            {
            // InternalBiLang.g:1753:1: ( '=>' )
            // InternalBiLang.g:1754:2: '=>'
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
    // InternalBiLang.g:1763:1: rule__DashBoard__Group__2 : rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 ;
    public final void rule__DashBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1767:1: ( rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 )
            // InternalBiLang.g:1768:2: rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalBiLang.g:1775:1: rule__DashBoard__Group__2__Impl : ( ( rule__DashBoard__Alternatives_2 ) ) ;
    public final void rule__DashBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1779:1: ( ( ( rule__DashBoard__Alternatives_2 ) ) )
            // InternalBiLang.g:1780:1: ( ( rule__DashBoard__Alternatives_2 ) )
            {
            // InternalBiLang.g:1780:1: ( ( rule__DashBoard__Alternatives_2 ) )
            // InternalBiLang.g:1781:2: ( rule__DashBoard__Alternatives_2 )
            {
             before(grammarAccess.getDashBoardAccess().getAlternatives_2()); 
            // InternalBiLang.g:1782:2: ( rule__DashBoard__Alternatives_2 )
            // InternalBiLang.g:1782:3: rule__DashBoard__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalBiLang.g:1790:1: rule__DashBoard__Group__3 : rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 ;
    public final void rule__DashBoard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1794:1: ( rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 )
            // InternalBiLang.g:1795:2: rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalBiLang.g:1802:1: rule__DashBoard__Group__3__Impl : ( 'plots' ) ;
    public final void rule__DashBoard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1806:1: ( ( 'plots' ) )
            // InternalBiLang.g:1807:1: ( 'plots' )
            {
            // InternalBiLang.g:1807:1: ( 'plots' )
            // InternalBiLang.g:1808:2: 'plots'
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
    // InternalBiLang.g:1817:1: rule__DashBoard__Group__4 : rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 ;
    public final void rule__DashBoard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1821:1: ( rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 )
            // InternalBiLang.g:1822:2: rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalBiLang.g:1829:1: rule__DashBoard__Group__4__Impl : ( '{' ) ;
    public final void rule__DashBoard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1833:1: ( ( '{' ) )
            // InternalBiLang.g:1834:1: ( '{' )
            {
            // InternalBiLang.g:1834:1: ( '{' )
            // InternalBiLang.g:1835:2: '{'
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
    // InternalBiLang.g:1844:1: rule__DashBoard__Group__5 : rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6 ;
    public final void rule__DashBoard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1848:1: ( rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6 )
            // InternalBiLang.g:1849:2: rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalBiLang.g:1856:1: rule__DashBoard__Group__5__Impl : ( ( rule__DashBoard__PlotAssignment_5 ) ) ;
    public final void rule__DashBoard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1860:1: ( ( ( rule__DashBoard__PlotAssignment_5 ) ) )
            // InternalBiLang.g:1861:1: ( ( rule__DashBoard__PlotAssignment_5 ) )
            {
            // InternalBiLang.g:1861:1: ( ( rule__DashBoard__PlotAssignment_5 ) )
            // InternalBiLang.g:1862:2: ( rule__DashBoard__PlotAssignment_5 )
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_5()); 
            // InternalBiLang.g:1863:2: ( rule__DashBoard__PlotAssignment_5 )
            // InternalBiLang.g:1863:3: rule__DashBoard__PlotAssignment_5
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
    // InternalBiLang.g:1871:1: rule__DashBoard__Group__6 : rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7 ;
    public final void rule__DashBoard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1875:1: ( rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7 )
            // InternalBiLang.g:1876:2: rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalBiLang.g:1883:1: rule__DashBoard__Group__6__Impl : ( ( rule__DashBoard__PlotAssignment_6 )* ) ;
    public final void rule__DashBoard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1887:1: ( ( ( rule__DashBoard__PlotAssignment_6 )* ) )
            // InternalBiLang.g:1888:1: ( ( rule__DashBoard__PlotAssignment_6 )* )
            {
            // InternalBiLang.g:1888:1: ( ( rule__DashBoard__PlotAssignment_6 )* )
            // InternalBiLang.g:1889:2: ( rule__DashBoard__PlotAssignment_6 )*
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_6()); 
            // InternalBiLang.g:1890:2: ( rule__DashBoard__PlotAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45||(LA19_0>=52 && LA19_0<=57)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBiLang.g:1890:3: rule__DashBoard__PlotAssignment_6
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalBiLang.g:1898:1: rule__DashBoard__Group__7 : rule__DashBoard__Group__7__Impl ;
    public final void rule__DashBoard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1902:1: ( rule__DashBoard__Group__7__Impl )
            // InternalBiLang.g:1903:2: rule__DashBoard__Group__7__Impl
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
    // InternalBiLang.g:1909:1: rule__DashBoard__Group__7__Impl : ( '}' ) ;
    public final void rule__DashBoard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1913:1: ( ( '}' ) )
            // InternalBiLang.g:1914:1: ( '}' )
            {
            // InternalBiLang.g:1914:1: ( '}' )
            // InternalBiLang.g:1915:2: '}'
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


    // $ANTLR start "rule__DashBoard__Group_2_0__0"
    // InternalBiLang.g:1925:1: rule__DashBoard__Group_2_0__0 : rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1 ;
    public final void rule__DashBoard__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1929:1: ( rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1 )
            // InternalBiLang.g:1930:2: rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1
            {
            pushFollow(FOLLOW_6);
            rule__DashBoard__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group_2_0__0"


    // $ANTLR start "rule__DashBoard__Group_2_0__0__Impl"
    // InternalBiLang.g:1937:1: rule__DashBoard__Group_2_0__0__Impl : ( 'e' ) ;
    public final void rule__DashBoard__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1941:1: ( ( 'e' ) )
            // InternalBiLang.g:1942:1: ( 'e' )
            {
            // InternalBiLang.g:1942:1: ( 'e' )
            // InternalBiLang.g:1943:2: 'e'
            {
             before(grammarAccess.getDashBoardAccess().getEKeyword_2_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getEKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group_2_0__0__Impl"


    // $ANTLR start "rule__DashBoard__Group_2_0__1"
    // InternalBiLang.g:1952:1: rule__DashBoard__Group_2_0__1 : rule__DashBoard__Group_2_0__1__Impl ;
    public final void rule__DashBoard__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1956:1: ( rule__DashBoard__Group_2_0__1__Impl )
            // InternalBiLang.g:1957:2: rule__DashBoard__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group_2_0__1"


    // $ANTLR start "rule__DashBoard__Group_2_0__1__Impl"
    // InternalBiLang.g:1963:1: rule__DashBoard__Group_2_0__1__Impl : ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) ) ;
    public final void rule__DashBoard__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1967:1: ( ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) ) )
            // InternalBiLang.g:1968:1: ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) )
            {
            // InternalBiLang.g:1968:1: ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) )
            // InternalBiLang.g:1969:2: ( rule__DashBoard__FileextractorAssignment_2_0_1 )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0_1()); 
            // InternalBiLang.g:1970:2: ( rule__DashBoard__FileextractorAssignment_2_0_1 )
            // InternalBiLang.g:1970:3: rule__DashBoard__FileextractorAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__FileextractorAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group_2_0__1__Impl"


    // $ANTLR start "rule__DashBoard__Group_2_1__0"
    // InternalBiLang.g:1979:1: rule__DashBoard__Group_2_1__0 : rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1 ;
    public final void rule__DashBoard__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1983:1: ( rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1 )
            // InternalBiLang.g:1984:2: rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__DashBoard__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group_2_1__0"


    // $ANTLR start "rule__DashBoard__Group_2_1__0__Impl"
    // InternalBiLang.g:1991:1: rule__DashBoard__Group_2_1__0__Impl : ( 'df' ) ;
    public final void rule__DashBoard__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1995:1: ( ( 'df' ) )
            // InternalBiLang.g:1996:1: ( 'df' )
            {
            // InternalBiLang.g:1996:1: ( 'df' )
            // InternalBiLang.g:1997:2: 'df'
            {
             before(grammarAccess.getDashBoardAccess().getDfKeyword_2_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDashBoardAccess().getDfKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group_2_1__0__Impl"


    // $ANTLR start "rule__DashBoard__Group_2_1__1"
    // InternalBiLang.g:2006:1: rule__DashBoard__Group_2_1__1 : rule__DashBoard__Group_2_1__1__Impl ;
    public final void rule__DashBoard__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2010:1: ( rule__DashBoard__Group_2_1__1__Impl )
            // InternalBiLang.g:2011:2: rule__DashBoard__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group_2_1__1"


    // $ANTLR start "rule__DashBoard__Group_2_1__1__Impl"
    // InternalBiLang.g:2017:1: rule__DashBoard__Group_2_1__1__Impl : ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) ) ;
    public final void rule__DashBoard__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2021:1: ( ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) ) )
            // InternalBiLang.g:2022:1: ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) )
            {
            // InternalBiLang.g:2022:1: ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) )
            // InternalBiLang.g:2023:2: ( rule__DashBoard__DatafilteringAssignment_2_1_1 )
            {
             before(grammarAccess.getDashBoardAccess().getDatafilteringAssignment_2_1_1()); 
            // InternalBiLang.g:2024:2: ( rule__DashBoard__DatafilteringAssignment_2_1_1 )
            // InternalBiLang.g:2024:3: rule__DashBoard__DatafilteringAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DashBoard__DatafilteringAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDashBoardAccess().getDatafilteringAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__Group_2_1__1__Impl"


    // $ANTLR start "rule__CsvExtractor__Group__0"
    // InternalBiLang.g:2033:1: rule__CsvExtractor__Group__0 : rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1 ;
    public final void rule__CsvExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2037:1: ( rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1 )
            // InternalBiLang.g:2038:2: rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1
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
    // InternalBiLang.g:2045:1: rule__CsvExtractor__Group__0__Impl : ( () ) ;
    public final void rule__CsvExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2049:1: ( ( () ) )
            // InternalBiLang.g:2050:1: ( () )
            {
            // InternalBiLang.g:2050:1: ( () )
            // InternalBiLang.g:2051:2: ()
            {
             before(grammarAccess.getCsvExtractorAccess().getCsvExtractorAction_0()); 
            // InternalBiLang.g:2052:2: ()
            // InternalBiLang.g:2052:3: 
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
    // InternalBiLang.g:2060:1: rule__CsvExtractor__Group__1 : rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2 ;
    public final void rule__CsvExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2064:1: ( rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2 )
            // InternalBiLang.g:2065:2: rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalBiLang.g:2072:1: rule__CsvExtractor__Group__1__Impl : ( ( rule__CsvExtractor__NameAssignment_1 ) ) ;
    public final void rule__CsvExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2076:1: ( ( ( rule__CsvExtractor__NameAssignment_1 ) ) )
            // InternalBiLang.g:2077:1: ( ( rule__CsvExtractor__NameAssignment_1 ) )
            {
            // InternalBiLang.g:2077:1: ( ( rule__CsvExtractor__NameAssignment_1 ) )
            // InternalBiLang.g:2078:2: ( rule__CsvExtractor__NameAssignment_1 )
            {
             before(grammarAccess.getCsvExtractorAccess().getNameAssignment_1()); 
            // InternalBiLang.g:2079:2: ( rule__CsvExtractor__NameAssignment_1 )
            // InternalBiLang.g:2079:3: rule__CsvExtractor__NameAssignment_1
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
    // InternalBiLang.g:2087:1: rule__CsvExtractor__Group__2 : rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3 ;
    public final void rule__CsvExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2091:1: ( rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3 )
            // InternalBiLang.g:2092:2: rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3
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
    // InternalBiLang.g:2099:1: rule__CsvExtractor__Group__2__Impl : ( '.csv' ) ;
    public final void rule__CsvExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2103:1: ( ( '.csv' ) )
            // InternalBiLang.g:2104:1: ( '.csv' )
            {
            // InternalBiLang.g:2104:1: ( '.csv' )
            // InternalBiLang.g:2105:2: '.csv'
            {
             before(grammarAccess.getCsvExtractorAccess().getCsvKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalBiLang.g:2114:1: rule__CsvExtractor__Group__3 : rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4 ;
    public final void rule__CsvExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2118:1: ( rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4 )
            // InternalBiLang.g:2119:2: rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4
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
    // InternalBiLang.g:2126:1: rule__CsvExtractor__Group__3__Impl : ( '=>' ) ;
    public final void rule__CsvExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2130:1: ( ( '=>' ) )
            // InternalBiLang.g:2131:1: ( '=>' )
            {
            // InternalBiLang.g:2131:1: ( '=>' )
            // InternalBiLang.g:2132:2: '=>'
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
    // InternalBiLang.g:2141:1: rule__CsvExtractor__Group__4 : rule__CsvExtractor__Group__4__Impl ;
    public final void rule__CsvExtractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2145:1: ( rule__CsvExtractor__Group__4__Impl )
            // InternalBiLang.g:2146:2: rule__CsvExtractor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvExtractor__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalBiLang.g:2152:1: rule__CsvExtractor__Group__4__Impl : ( ( rule__CsvExtractor__PathAssignment_4 ) ) ;
    public final void rule__CsvExtractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2156:1: ( ( ( rule__CsvExtractor__PathAssignment_4 ) ) )
            // InternalBiLang.g:2157:1: ( ( rule__CsvExtractor__PathAssignment_4 ) )
            {
            // InternalBiLang.g:2157:1: ( ( rule__CsvExtractor__PathAssignment_4 ) )
            // InternalBiLang.g:2158:2: ( rule__CsvExtractor__PathAssignment_4 )
            {
             before(grammarAccess.getCsvExtractorAccess().getPathAssignment_4()); 
            // InternalBiLang.g:2159:2: ( rule__CsvExtractor__PathAssignment_4 )
            // InternalBiLang.g:2159:3: rule__CsvExtractor__PathAssignment_4
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


    // $ANTLR start "rule__ExcelExtractor__Group__0"
    // InternalBiLang.g:2168:1: rule__ExcelExtractor__Group__0 : rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1 ;
    public final void rule__ExcelExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2172:1: ( rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1 )
            // InternalBiLang.g:2173:2: rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1
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
    // InternalBiLang.g:2180:1: rule__ExcelExtractor__Group__0__Impl : ( () ) ;
    public final void rule__ExcelExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2184:1: ( ( () ) )
            // InternalBiLang.g:2185:1: ( () )
            {
            // InternalBiLang.g:2185:1: ( () )
            // InternalBiLang.g:2186:2: ()
            {
             before(grammarAccess.getExcelExtractorAccess().getExcelExtractorAction_0()); 
            // InternalBiLang.g:2187:2: ()
            // InternalBiLang.g:2187:3: 
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
    // InternalBiLang.g:2195:1: rule__ExcelExtractor__Group__1 : rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2 ;
    public final void rule__ExcelExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2199:1: ( rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2 )
            // InternalBiLang.g:2200:2: rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2
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
    // InternalBiLang.g:2207:1: rule__ExcelExtractor__Group__1__Impl : ( ( rule__ExcelExtractor__NameAssignment_1 ) ) ;
    public final void rule__ExcelExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2211:1: ( ( ( rule__ExcelExtractor__NameAssignment_1 ) ) )
            // InternalBiLang.g:2212:1: ( ( rule__ExcelExtractor__NameAssignment_1 ) )
            {
            // InternalBiLang.g:2212:1: ( ( rule__ExcelExtractor__NameAssignment_1 ) )
            // InternalBiLang.g:2213:2: ( rule__ExcelExtractor__NameAssignment_1 )
            {
             before(grammarAccess.getExcelExtractorAccess().getNameAssignment_1()); 
            // InternalBiLang.g:2214:2: ( rule__ExcelExtractor__NameAssignment_1 )
            // InternalBiLang.g:2214:3: rule__ExcelExtractor__NameAssignment_1
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
    // InternalBiLang.g:2222:1: rule__ExcelExtractor__Group__2 : rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3 ;
    public final void rule__ExcelExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2226:1: ( rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3 )
            // InternalBiLang.g:2227:2: rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3
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
    // InternalBiLang.g:2234:1: rule__ExcelExtractor__Group__2__Impl : ( '.xlsx' ) ;
    public final void rule__ExcelExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2238:1: ( ( '.xlsx' ) )
            // InternalBiLang.g:2239:1: ( '.xlsx' )
            {
            // InternalBiLang.g:2239:1: ( '.xlsx' )
            // InternalBiLang.g:2240:2: '.xlsx'
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
    // InternalBiLang.g:2249:1: rule__ExcelExtractor__Group__3 : rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4 ;
    public final void rule__ExcelExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2253:1: ( rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4 )
            // InternalBiLang.g:2254:2: rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4
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
    // InternalBiLang.g:2261:1: rule__ExcelExtractor__Group__3__Impl : ( '=>' ) ;
    public final void rule__ExcelExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2265:1: ( ( '=>' ) )
            // InternalBiLang.g:2266:1: ( '=>' )
            {
            // InternalBiLang.g:2266:1: ( '=>' )
            // InternalBiLang.g:2267:2: '=>'
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
    // InternalBiLang.g:2276:1: rule__ExcelExtractor__Group__4 : rule__ExcelExtractor__Group__4__Impl ;
    public final void rule__ExcelExtractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2280:1: ( rule__ExcelExtractor__Group__4__Impl )
            // InternalBiLang.g:2281:2: rule__ExcelExtractor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExcelExtractor__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalBiLang.g:2287:1: rule__ExcelExtractor__Group__4__Impl : ( ( rule__ExcelExtractor__PathAssignment_4 ) ) ;
    public final void rule__ExcelExtractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2291:1: ( ( ( rule__ExcelExtractor__PathAssignment_4 ) ) )
            // InternalBiLang.g:2292:1: ( ( rule__ExcelExtractor__PathAssignment_4 ) )
            {
            // InternalBiLang.g:2292:1: ( ( rule__ExcelExtractor__PathAssignment_4 ) )
            // InternalBiLang.g:2293:2: ( rule__ExcelExtractor__PathAssignment_4 )
            {
             before(grammarAccess.getExcelExtractorAccess().getPathAssignment_4()); 
            // InternalBiLang.g:2294:2: ( rule__ExcelExtractor__PathAssignment_4 )
            // InternalBiLang.g:2294:3: rule__ExcelExtractor__PathAssignment_4
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


    // $ANTLR start "rule__QuantitativeFiltering__Group__0"
    // InternalBiLang.g:2303:1: rule__QuantitativeFiltering__Group__0 : rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 ;
    public final void rule__QuantitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2307:1: ( rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 )
            // InternalBiLang.g:2308:2: rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1
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
    // InternalBiLang.g:2315:1: rule__QuantitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QuantitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2319:1: ( ( () ) )
            // InternalBiLang.g:2320:1: ( () )
            {
            // InternalBiLang.g:2320:1: ( () )
            // InternalBiLang.g:2321:2: ()
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0()); 
            // InternalBiLang.g:2322:2: ()
            // InternalBiLang.g:2322:3: 
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
    // InternalBiLang.g:2330:1: rule__QuantitativeFiltering__Group__1 : rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 ;
    public final void rule__QuantitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2334:1: ( rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 )
            // InternalBiLang.g:2335:2: rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalBiLang.g:2342:1: rule__QuantitativeFiltering__Group__1__Impl : ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QuantitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2346:1: ( ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:2347:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:2347:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:2348:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:2349:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:2349:3: rule__QuantitativeFiltering__AxisAssignment_1
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
    // InternalBiLang.g:2357:1: rule__QuantitativeFiltering__Group__2 : rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 ;
    public final void rule__QuantitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2361:1: ( rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 )
            // InternalBiLang.g:2362:2: rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:2369:1: rule__QuantitativeFiltering__Group__2__Impl : ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QuantitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2373:1: ( ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2374:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2374:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:2375:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2376:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:2376:3: rule__QuantitativeFiltering__OperatorAssignment_2
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
    // InternalBiLang.g:2384:1: rule__QuantitativeFiltering__Group__3 : rule__QuantitativeFiltering__Group__3__Impl ;
    public final void rule__QuantitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2388:1: ( rule__QuantitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:2389:2: rule__QuantitativeFiltering__Group__3__Impl
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
    // InternalBiLang.g:2395:1: rule__QuantitativeFiltering__Group__3__Impl : ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) ;
    public final void rule__QuantitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2399:1: ( ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) )
            // InternalBiLang.g:2400:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            {
            // InternalBiLang.g:2400:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            // InternalBiLang.g:2401:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_3()); 
            // InternalBiLang.g:2402:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            // InternalBiLang.g:2402:3: rule__QuantitativeFiltering__ValuesAssignment_3
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
    // InternalBiLang.g:2411:1: rule__QualitativeFiltering__Group__0 : rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 ;
    public final void rule__QualitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2415:1: ( rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 )
            // InternalBiLang.g:2416:2: rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1
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
    // InternalBiLang.g:2423:1: rule__QualitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QualitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2427:1: ( ( () ) )
            // InternalBiLang.g:2428:1: ( () )
            {
            // InternalBiLang.g:2428:1: ( () )
            // InternalBiLang.g:2429:2: ()
            {
             before(grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0()); 
            // InternalBiLang.g:2430:2: ()
            // InternalBiLang.g:2430:3: 
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
    // InternalBiLang.g:2438:1: rule__QualitativeFiltering__Group__1 : rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 ;
    public final void rule__QualitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2442:1: ( rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 )
            // InternalBiLang.g:2443:2: rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:2450:1: rule__QualitativeFiltering__Group__1__Impl : ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QualitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2454:1: ( ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:2455:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:2455:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:2456:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:2457:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:2457:3: rule__QualitativeFiltering__AxisAssignment_1
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
    // InternalBiLang.g:2465:1: rule__QualitativeFiltering__Group__2 : rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 ;
    public final void rule__QualitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2469:1: ( rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 )
            // InternalBiLang.g:2470:2: rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3
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
    // InternalBiLang.g:2477:1: rule__QualitativeFiltering__Group__2__Impl : ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QualitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2481:1: ( ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2482:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2482:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:2483:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2484:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:2484:3: rule__QualitativeFiltering__OperatorAssignment_2
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
    // InternalBiLang.g:2492:1: rule__QualitativeFiltering__Group__3 : rule__QualitativeFiltering__Group__3__Impl ;
    public final void rule__QualitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2496:1: ( rule__QualitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:2497:2: rule__QualitativeFiltering__Group__3__Impl
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
    // InternalBiLang.g:2503:1: rule__QualitativeFiltering__Group__3__Impl : ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) ;
    public final void rule__QualitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2507:1: ( ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) )
            // InternalBiLang.g:2508:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            {
            // InternalBiLang.g:2508:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            // InternalBiLang.g:2509:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_3()); 
            // InternalBiLang.g:2510:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            // InternalBiLang.g:2510:3: rule__QualitativeFiltering__LabelsAssignment_3
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
    // InternalBiLang.g:2519:1: rule__MathOperation__Group__0 : rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 ;
    public final void rule__MathOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2523:1: ( rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 )
            // InternalBiLang.g:2524:2: rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBiLang.g:2531:1: rule__MathOperation__Group__0__Impl : ( ( '(' )? ) ;
    public final void rule__MathOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2535:1: ( ( ( '(' )? ) )
            // InternalBiLang.g:2536:1: ( ( '(' )? )
            {
            // InternalBiLang.g:2536:1: ( ( '(' )? )
            // InternalBiLang.g:2537:2: ( '(' )?
            {
             before(grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_0()); 
            // InternalBiLang.g:2538:2: ( '(' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBiLang.g:2538:3: '('
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
    // InternalBiLang.g:2546:1: rule__MathOperation__Group__1 : rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 ;
    public final void rule__MathOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2550:1: ( rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 )
            // InternalBiLang.g:2551:2: rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2
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
    // InternalBiLang.g:2558:1: rule__MathOperation__Group__1__Impl : ( 'l' ) ;
    public final void rule__MathOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2562:1: ( ( 'l' ) )
            // InternalBiLang.g:2563:1: ( 'l' )
            {
            // InternalBiLang.g:2563:1: ( 'l' )
            // InternalBiLang.g:2564:2: 'l'
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
    // InternalBiLang.g:2573:1: rule__MathOperation__Group__2 : rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 ;
    public final void rule__MathOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2577:1: ( rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 )
            // InternalBiLang.g:2578:2: rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalBiLang.g:2585:1: rule__MathOperation__Group__2__Impl : ( ( rule__MathOperation__LsideAssignment_2 ) ) ;
    public final void rule__MathOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2589:1: ( ( ( rule__MathOperation__LsideAssignment_2 ) ) )
            // InternalBiLang.g:2590:1: ( ( rule__MathOperation__LsideAssignment_2 ) )
            {
            // InternalBiLang.g:2590:1: ( ( rule__MathOperation__LsideAssignment_2 ) )
            // InternalBiLang.g:2591:2: ( rule__MathOperation__LsideAssignment_2 )
            {
             before(grammarAccess.getMathOperationAccess().getLsideAssignment_2()); 
            // InternalBiLang.g:2592:2: ( rule__MathOperation__LsideAssignment_2 )
            // InternalBiLang.g:2592:3: rule__MathOperation__LsideAssignment_2
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
    // InternalBiLang.g:2600:1: rule__MathOperation__Group__3 : rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 ;
    public final void rule__MathOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2604:1: ( rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 )
            // InternalBiLang.g:2605:2: rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalBiLang.g:2612:1: rule__MathOperation__Group__3__Impl : ( ( rule__MathOperation__OperatorAssignment_3 ) ) ;
    public final void rule__MathOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2616:1: ( ( ( rule__MathOperation__OperatorAssignment_3 ) ) )
            // InternalBiLang.g:2617:1: ( ( rule__MathOperation__OperatorAssignment_3 ) )
            {
            // InternalBiLang.g:2617:1: ( ( rule__MathOperation__OperatorAssignment_3 ) )
            // InternalBiLang.g:2618:2: ( rule__MathOperation__OperatorAssignment_3 )
            {
             before(grammarAccess.getMathOperationAccess().getOperatorAssignment_3()); 
            // InternalBiLang.g:2619:2: ( rule__MathOperation__OperatorAssignment_3 )
            // InternalBiLang.g:2619:3: rule__MathOperation__OperatorAssignment_3
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
    // InternalBiLang.g:2627:1: rule__MathOperation__Group__4 : rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 ;
    public final void rule__MathOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2631:1: ( rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 )
            // InternalBiLang.g:2632:2: rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5
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
    // InternalBiLang.g:2639:1: rule__MathOperation__Group__4__Impl : ( 'r' ) ;
    public final void rule__MathOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2643:1: ( ( 'r' ) )
            // InternalBiLang.g:2644:1: ( 'r' )
            {
            // InternalBiLang.g:2644:1: ( 'r' )
            // InternalBiLang.g:2645:2: 'r'
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
    // InternalBiLang.g:2654:1: rule__MathOperation__Group__5 : rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 ;
    public final void rule__MathOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2658:1: ( rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 )
            // InternalBiLang.g:2659:2: rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalBiLang.g:2666:1: rule__MathOperation__Group__5__Impl : ( ( rule__MathOperation__RsideAssignment_5 ) ) ;
    public final void rule__MathOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2670:1: ( ( ( rule__MathOperation__RsideAssignment_5 ) ) )
            // InternalBiLang.g:2671:1: ( ( rule__MathOperation__RsideAssignment_5 ) )
            {
            // InternalBiLang.g:2671:1: ( ( rule__MathOperation__RsideAssignment_5 ) )
            // InternalBiLang.g:2672:2: ( rule__MathOperation__RsideAssignment_5 )
            {
             before(grammarAccess.getMathOperationAccess().getRsideAssignment_5()); 
            // InternalBiLang.g:2673:2: ( rule__MathOperation__RsideAssignment_5 )
            // InternalBiLang.g:2673:3: rule__MathOperation__RsideAssignment_5
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
    // InternalBiLang.g:2681:1: rule__MathOperation__Group__6 : rule__MathOperation__Group__6__Impl ;
    public final void rule__MathOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2685:1: ( rule__MathOperation__Group__6__Impl )
            // InternalBiLang.g:2686:2: rule__MathOperation__Group__6__Impl
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
    // InternalBiLang.g:2692:1: rule__MathOperation__Group__6__Impl : ( ( ')' )? ) ;
    public final void rule__MathOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2696:1: ( ( ( ')' )? ) )
            // InternalBiLang.g:2697:1: ( ( ')' )? )
            {
            // InternalBiLang.g:2697:1: ( ( ')' )? )
            // InternalBiLang.g:2698:2: ( ')' )?
            {
             before(grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_6()); 
            // InternalBiLang.g:2699:2: ( ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:2699:3: ')'
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
    // InternalBiLang.g:2708:1: rule__ColReference__Group__0 : rule__ColReference__Group__0__Impl rule__ColReference__Group__1 ;
    public final void rule__ColReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2712:1: ( rule__ColReference__Group__0__Impl rule__ColReference__Group__1 )
            // InternalBiLang.g:2713:2: rule__ColReference__Group__0__Impl rule__ColReference__Group__1
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
    // InternalBiLang.g:2720:1: rule__ColReference__Group__0__Impl : ( () ) ;
    public final void rule__ColReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2724:1: ( ( () ) )
            // InternalBiLang.g:2725:1: ( () )
            {
            // InternalBiLang.g:2725:1: ( () )
            // InternalBiLang.g:2726:2: ()
            {
             before(grammarAccess.getColReferenceAccess().getColReferenceAction_0()); 
            // InternalBiLang.g:2727:2: ()
            // InternalBiLang.g:2727:3: 
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
    // InternalBiLang.g:2735:1: rule__ColReference__Group__1 : rule__ColReference__Group__1__Impl ;
    public final void rule__ColReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2739:1: ( rule__ColReference__Group__1__Impl )
            // InternalBiLang.g:2740:2: rule__ColReference__Group__1__Impl
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
    // InternalBiLang.g:2746:1: rule__ColReference__Group__1__Impl : ( ( rule__ColReference__TargetAssignment_1 ) ) ;
    public final void rule__ColReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2750:1: ( ( ( rule__ColReference__TargetAssignment_1 ) ) )
            // InternalBiLang.g:2751:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            {
            // InternalBiLang.g:2751:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            // InternalBiLang.g:2752:2: ( rule__ColReference__TargetAssignment_1 )
            {
             before(grammarAccess.getColReferenceAccess().getTargetAssignment_1()); 
            // InternalBiLang.g:2753:2: ( rule__ColReference__TargetAssignment_1 )
            // InternalBiLang.g:2753:3: rule__ColReference__TargetAssignment_1
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
    // InternalBiLang.g:2762:1: rule__StatisticalOperation__Group__0 : rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 ;
    public final void rule__StatisticalOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2766:1: ( rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 )
            // InternalBiLang.g:2767:2: rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalBiLang.g:2774:1: rule__StatisticalOperation__Group__0__Impl : ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) ;
    public final void rule__StatisticalOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2778:1: ( ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) )
            // InternalBiLang.g:2779:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            {
            // InternalBiLang.g:2779:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            // InternalBiLang.g:2780:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getOperatorAssignment_0()); 
            // InternalBiLang.g:2781:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            // InternalBiLang.g:2781:3: rule__StatisticalOperation__OperatorAssignment_0
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
    // InternalBiLang.g:2789:1: rule__StatisticalOperation__Group__1 : rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 ;
    public final void rule__StatisticalOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2793:1: ( rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 )
            // InternalBiLang.g:2794:2: rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2
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
    // InternalBiLang.g:2801:1: rule__StatisticalOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__StatisticalOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2805:1: ( ( '(' ) )
            // InternalBiLang.g:2806:1: ( '(' )
            {
            // InternalBiLang.g:2806:1: ( '(' )
            // InternalBiLang.g:2807:2: '('
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
    // InternalBiLang.g:2816:1: rule__StatisticalOperation__Group__2 : rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 ;
    public final void rule__StatisticalOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2820:1: ( rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 )
            // InternalBiLang.g:2821:2: rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalBiLang.g:2828:1: rule__StatisticalOperation__Group__2__Impl : ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) ;
    public final void rule__StatisticalOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2832:1: ( ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) )
            // InternalBiLang.g:2833:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            {
            // InternalBiLang.g:2833:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            // InternalBiLang.g:2834:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getColreferenceAssignment_2()); 
            // InternalBiLang.g:2835:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            // InternalBiLang.g:2835:3: rule__StatisticalOperation__ColreferenceAssignment_2
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
    // InternalBiLang.g:2843:1: rule__StatisticalOperation__Group__3 : rule__StatisticalOperation__Group__3__Impl ;
    public final void rule__StatisticalOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2847:1: ( rule__StatisticalOperation__Group__3__Impl )
            // InternalBiLang.g:2848:2: rule__StatisticalOperation__Group__3__Impl
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
    // InternalBiLang.g:2854:1: rule__StatisticalOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__StatisticalOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2858:1: ( ( ')' ) )
            // InternalBiLang.g:2859:1: ( ')' )
            {
            // InternalBiLang.g:2859:1: ( ')' )
            // InternalBiLang.g:2860:2: ')'
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
    // InternalBiLang.g:2870:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2874:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalBiLang.g:2875:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:2882:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2886:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:2887:1: ( ( '-' )? )
            {
            // InternalBiLang.g:2887:1: ( ( '-' )? )
            // InternalBiLang.g:2888:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:2889:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBiLang.g:2889:3: '-'
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
    // InternalBiLang.g:2897:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2901:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalBiLang.g:2902:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:2909:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2913:1: ( ( ( RULE_INT )? ) )
            // InternalBiLang.g:2914:1: ( ( RULE_INT )? )
            {
            // InternalBiLang.g:2914:1: ( ( RULE_INT )? )
            // InternalBiLang.g:2915:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalBiLang.g:2916:2: ( RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBiLang.g:2916:3: RULE_INT
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
    // InternalBiLang.g:2924:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2928:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalBiLang.g:2929:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalBiLang.g:2936:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2940:1: ( ( '.' ) )
            // InternalBiLang.g:2941:1: ( '.' )
            {
            // InternalBiLang.g:2941:1: ( '.' )
            // InternalBiLang.g:2942:2: '.'
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
    // InternalBiLang.g:2951:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2955:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalBiLang.g:2956:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalBiLang.g:2963:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2967:1: ( ( RULE_INT ) )
            // InternalBiLang.g:2968:1: ( RULE_INT )
            {
            // InternalBiLang.g:2968:1: ( RULE_INT )
            // InternalBiLang.g:2969:2: RULE_INT
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
    // InternalBiLang.g:2978:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2982:1: ( rule__EFloat__Group__4__Impl )
            // InternalBiLang.g:2983:2: rule__EFloat__Group__4__Impl
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
    // InternalBiLang.g:2989:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2993:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalBiLang.g:2994:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalBiLang.g:2994:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalBiLang.g:2995:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalBiLang.g:2996:2: ( rule__EFloat__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=11 && LA24_0<=12)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBiLang.g:2996:3: rule__EFloat__Group_4__0
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
    // InternalBiLang.g:3005:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3009:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalBiLang.g:3010:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:3017:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3021:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalBiLang.g:3022:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalBiLang.g:3022:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalBiLang.g:3023:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalBiLang.g:3024:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalBiLang.g:3024:3: rule__EFloat__Alternatives_4_0
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
    // InternalBiLang.g:3032:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3036:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalBiLang.g:3037:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:3044:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3048:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3049:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3049:1: ( ( '-' )? )
            // InternalBiLang.g:3050:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBiLang.g:3051:2: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:3051:3: '-'
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
    // InternalBiLang.g:3059:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3063:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalBiLang.g:3064:2: rule__EFloat__Group_4__2__Impl
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
    // InternalBiLang.g:3070:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3074:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3075:1: ( RULE_INT )
            {
            // InternalBiLang.g:3075:1: ( RULE_INT )
            // InternalBiLang.g:3076:2: RULE_INT
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
    // InternalBiLang.g:3086:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3090:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBiLang.g:3091:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalBiLang.g:3098:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3102:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3103:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3103:1: ( ( '-' )? )
            // InternalBiLang.g:3104:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:3105:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:3105:3: '-'
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
    // InternalBiLang.g:3113:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3117:1: ( rule__EInt__Group__1__Impl )
            // InternalBiLang.g:3118:2: rule__EInt__Group__1__Impl
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
    // InternalBiLang.g:3124:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3128:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3129:1: ( RULE_INT )
            {
            // InternalBiLang.g:3129:1: ( RULE_INT )
            // InternalBiLang.g:3130:2: RULE_INT
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
    // InternalBiLang.g:3140:1: rule__BarPlot__Group__0 : rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 ;
    public final void rule__BarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3144:1: ( rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 )
            // InternalBiLang.g:3145:2: rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:3152:1: rule__BarPlot__Group__0__Impl : ( () ) ;
    public final void rule__BarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3156:1: ( ( () ) )
            // InternalBiLang.g:3157:1: ( () )
            {
            // InternalBiLang.g:3157:1: ( () )
            // InternalBiLang.g:3158:2: ()
            {
             before(grammarAccess.getBarPlotAccess().getBarPlotAction_0()); 
            // InternalBiLang.g:3159:2: ()
            // InternalBiLang.g:3159:3: 
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
    // InternalBiLang.g:3167:1: rule__BarPlot__Group__1 : rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 ;
    public final void rule__BarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3171:1: ( rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 )
            // InternalBiLang.g:3172:2: rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2
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
    // InternalBiLang.g:3179:1: rule__BarPlot__Group__1__Impl : ( 'bar' ) ;
    public final void rule__BarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3183:1: ( ( 'bar' ) )
            // InternalBiLang.g:3184:1: ( 'bar' )
            {
            // InternalBiLang.g:3184:1: ( 'bar' )
            // InternalBiLang.g:3185:2: 'bar'
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
    // InternalBiLang.g:3194:1: rule__BarPlot__Group__2 : rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 ;
    public final void rule__BarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3198:1: ( rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 )
            // InternalBiLang.g:3199:2: rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:3206:1: rule__BarPlot__Group__2__Impl : ( ( rule__BarPlot__NameAssignment_2 ) ) ;
    public final void rule__BarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3210:1: ( ( ( rule__BarPlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3211:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3211:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            // InternalBiLang.g:3212:2: ( rule__BarPlot__NameAssignment_2 )
            {
             before(grammarAccess.getBarPlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3213:2: ( rule__BarPlot__NameAssignment_2 )
            // InternalBiLang.g:3213:3: rule__BarPlot__NameAssignment_2
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
    // InternalBiLang.g:3221:1: rule__BarPlot__Group__3 : rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 ;
    public final void rule__BarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3225:1: ( rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 )
            // InternalBiLang.g:3226:2: rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:3233:1: rule__BarPlot__Group__3__Impl : ( '->' ) ;
    public final void rule__BarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3237:1: ( ( '->' ) )
            // InternalBiLang.g:3238:1: ( '->' )
            {
            // InternalBiLang.g:3238:1: ( '->' )
            // InternalBiLang.g:3239:2: '->'
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
    // InternalBiLang.g:3248:1: rule__BarPlot__Group__4 : rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 ;
    public final void rule__BarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3252:1: ( rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 )
            // InternalBiLang.g:3253:2: rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5
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
    // InternalBiLang.g:3260:1: rule__BarPlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__BarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3264:1: ( ( 'xAx' ) )
            // InternalBiLang.g:3265:1: ( 'xAx' )
            {
            // InternalBiLang.g:3265:1: ( 'xAx' )
            // InternalBiLang.g:3266:2: 'xAx'
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
    // InternalBiLang.g:3275:1: rule__BarPlot__Group__5 : rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 ;
    public final void rule__BarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3279:1: ( rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 )
            // InternalBiLang.g:3280:2: rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:3287:1: rule__BarPlot__Group__5__Impl : ( ( rule__BarPlot__XAxisAssignment_5 ) ) ;
    public final void rule__BarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3291:1: ( ( ( rule__BarPlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:3292:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:3292:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:3293:2: ( rule__BarPlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getBarPlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:3294:2: ( rule__BarPlot__XAxisAssignment_5 )
            // InternalBiLang.g:3294:3: rule__BarPlot__XAxisAssignment_5
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
    // InternalBiLang.g:3302:1: rule__BarPlot__Group__6 : rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 ;
    public final void rule__BarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3306:1: ( rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 )
            // InternalBiLang.g:3307:2: rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7
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
    // InternalBiLang.g:3314:1: rule__BarPlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__BarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3318:1: ( ( 'yA' ) )
            // InternalBiLang.g:3319:1: ( 'yA' )
            {
            // InternalBiLang.g:3319:1: ( 'yA' )
            // InternalBiLang.g:3320:2: 'yA'
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
    // InternalBiLang.g:3329:1: rule__BarPlot__Group__7 : rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 ;
    public final void rule__BarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3333:1: ( rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 )
            // InternalBiLang.g:3334:2: rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3341:1: rule__BarPlot__Group__7__Impl : ( ( rule__BarPlot__YAxisAssignment_7 ) ) ;
    public final void rule__BarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3345:1: ( ( ( rule__BarPlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3346:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3346:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3347:2: ( rule__BarPlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getBarPlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3348:2: ( rule__BarPlot__YAxisAssignment_7 )
            // InternalBiLang.g:3348:3: rule__BarPlot__YAxisAssignment_7
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
    // InternalBiLang.g:3356:1: rule__BarPlot__Group__8 : rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 ;
    public final void rule__BarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3360:1: ( rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 )
            // InternalBiLang.g:3361:2: rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3368:1: rule__BarPlot__Group__8__Impl : ( ( rule__BarPlot__Group_8__0 )? ) ;
    public final void rule__BarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3372:1: ( ( ( rule__BarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:3373:1: ( ( rule__BarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3373:1: ( ( rule__BarPlot__Group_8__0 )? )
            // InternalBiLang.g:3374:2: ( rule__BarPlot__Group_8__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:3375:2: ( rule__BarPlot__Group_8__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:3375:3: rule__BarPlot__Group_8__0
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
    // InternalBiLang.g:3383:1: rule__BarPlot__Group__9 : rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 ;
    public final void rule__BarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3387:1: ( rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 )
            // InternalBiLang.g:3388:2: rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3395:1: rule__BarPlot__Group__9__Impl : ( ( rule__BarPlot__Group_9__0 )? ) ;
    public final void rule__BarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3399:1: ( ( ( rule__BarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:3400:1: ( ( rule__BarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:3400:1: ( ( rule__BarPlot__Group_9__0 )? )
            // InternalBiLang.g:3401:2: ( rule__BarPlot__Group_9__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:3402:2: ( rule__BarPlot__Group_9__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBiLang.g:3402:3: rule__BarPlot__Group_9__0
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
    // InternalBiLang.g:3410:1: rule__BarPlot__Group__10 : rule__BarPlot__Group__10__Impl ;
    public final void rule__BarPlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3414:1: ( rule__BarPlot__Group__10__Impl )
            // InternalBiLang.g:3415:2: rule__BarPlot__Group__10__Impl
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
    // InternalBiLang.g:3421:1: rule__BarPlot__Group__10__Impl : ( ( rule__BarPlot__Group_10__0 )? ) ;
    public final void rule__BarPlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3425:1: ( ( ( rule__BarPlot__Group_10__0 )? ) )
            // InternalBiLang.g:3426:1: ( ( rule__BarPlot__Group_10__0 )? )
            {
            // InternalBiLang.g:3426:1: ( ( rule__BarPlot__Group_10__0 )? )
            // InternalBiLang.g:3427:2: ( rule__BarPlot__Group_10__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_10()); 
            // InternalBiLang.g:3428:2: ( rule__BarPlot__Group_10__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBiLang.g:3428:3: rule__BarPlot__Group_10__0
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
    // InternalBiLang.g:3437:1: rule__BarPlot__Group_8__0 : rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 ;
    public final void rule__BarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3441:1: ( rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 )
            // InternalBiLang.g:3442:2: rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:3449:1: rule__BarPlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__BarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3453:1: ( ( 'loc' ) )
            // InternalBiLang.g:3454:1: ( 'loc' )
            {
            // InternalBiLang.g:3454:1: ( 'loc' )
            // InternalBiLang.g:3455:2: 'loc'
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
    // InternalBiLang.g:3464:1: rule__BarPlot__Group_8__1 : rule__BarPlot__Group_8__1__Impl ;
    public final void rule__BarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3468:1: ( rule__BarPlot__Group_8__1__Impl )
            // InternalBiLang.g:3469:2: rule__BarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:3475:1: rule__BarPlot__Group_8__1__Impl : ( ( rule__BarPlot__LocationAssignment_8_1 ) ) ;
    public final void rule__BarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3479:1: ( ( ( rule__BarPlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:3480:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:3480:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:3481:2: ( rule__BarPlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getBarPlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:3482:2: ( rule__BarPlot__LocationAssignment_8_1 )
            // InternalBiLang.g:3482:3: rule__BarPlot__LocationAssignment_8_1
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
    // InternalBiLang.g:3491:1: rule__BarPlot__Group_9__0 : rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 ;
    public final void rule__BarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3495:1: ( rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 )
            // InternalBiLang.g:3496:2: rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1
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
    // InternalBiLang.g:3503:1: rule__BarPlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__BarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3507:1: ( ( 'colors' ) )
            // InternalBiLang.g:3508:1: ( 'colors' )
            {
            // InternalBiLang.g:3508:1: ( 'colors' )
            // InternalBiLang.g:3509:2: 'colors'
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
    // InternalBiLang.g:3518:1: rule__BarPlot__Group_9__1 : rule__BarPlot__Group_9__1__Impl ;
    public final void rule__BarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3522:1: ( rule__BarPlot__Group_9__1__Impl )
            // InternalBiLang.g:3523:2: rule__BarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:3529:1: rule__BarPlot__Group_9__1__Impl : ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__BarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3533:1: ( ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:3534:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:3534:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:3535:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getBarPlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:3536:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:3536:3: rule__BarPlot__ColorsAssignment_9_1
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
    // InternalBiLang.g:3545:1: rule__BarPlot__Group_10__0 : rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 ;
    public final void rule__BarPlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3549:1: ( rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 )
            // InternalBiLang.g:3550:2: rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:3557:1: rule__BarPlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__BarPlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3561:1: ( ( 'thickness' ) )
            // InternalBiLang.g:3562:1: ( 'thickness' )
            {
            // InternalBiLang.g:3562:1: ( 'thickness' )
            // InternalBiLang.g:3563:2: 'thickness'
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
    // InternalBiLang.g:3572:1: rule__BarPlot__Group_10__1 : rule__BarPlot__Group_10__1__Impl ;
    public final void rule__BarPlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3576:1: ( rule__BarPlot__Group_10__1__Impl )
            // InternalBiLang.g:3577:2: rule__BarPlot__Group_10__1__Impl
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
    // InternalBiLang.g:3583:1: rule__BarPlot__Group_10__1__Impl : ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__BarPlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3587:1: ( ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:3588:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:3588:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:3589:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:3590:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:3590:3: rule__BarPlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:3599:1: rule__LinePlot__Group__0 : rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 ;
    public final void rule__LinePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3603:1: ( rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 )
            // InternalBiLang.g:3604:2: rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:3611:1: rule__LinePlot__Group__0__Impl : ( () ) ;
    public final void rule__LinePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3615:1: ( ( () ) )
            // InternalBiLang.g:3616:1: ( () )
            {
            // InternalBiLang.g:3616:1: ( () )
            // InternalBiLang.g:3617:2: ()
            {
             before(grammarAccess.getLinePlotAccess().getLinePlotAction_0()); 
            // InternalBiLang.g:3618:2: ()
            // InternalBiLang.g:3618:3: 
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
    // InternalBiLang.g:3626:1: rule__LinePlot__Group__1 : rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 ;
    public final void rule__LinePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3630:1: ( rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 )
            // InternalBiLang.g:3631:2: rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2
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
    // InternalBiLang.g:3638:1: rule__LinePlot__Group__1__Impl : ( 'line' ) ;
    public final void rule__LinePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3642:1: ( ( 'line' ) )
            // InternalBiLang.g:3643:1: ( 'line' )
            {
            // InternalBiLang.g:3643:1: ( 'line' )
            // InternalBiLang.g:3644:2: 'line'
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
    // InternalBiLang.g:3653:1: rule__LinePlot__Group__2 : rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 ;
    public final void rule__LinePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3657:1: ( rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 )
            // InternalBiLang.g:3658:2: rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:3665:1: rule__LinePlot__Group__2__Impl : ( ( rule__LinePlot__NameAssignment_2 ) ) ;
    public final void rule__LinePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3669:1: ( ( ( rule__LinePlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3670:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3670:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            // InternalBiLang.g:3671:2: ( rule__LinePlot__NameAssignment_2 )
            {
             before(grammarAccess.getLinePlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3672:2: ( rule__LinePlot__NameAssignment_2 )
            // InternalBiLang.g:3672:3: rule__LinePlot__NameAssignment_2
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
    // InternalBiLang.g:3680:1: rule__LinePlot__Group__3 : rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 ;
    public final void rule__LinePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3684:1: ( rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 )
            // InternalBiLang.g:3685:2: rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:3692:1: rule__LinePlot__Group__3__Impl : ( '->' ) ;
    public final void rule__LinePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3696:1: ( ( '->' ) )
            // InternalBiLang.g:3697:1: ( '->' )
            {
            // InternalBiLang.g:3697:1: ( '->' )
            // InternalBiLang.g:3698:2: '->'
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
    // InternalBiLang.g:3707:1: rule__LinePlot__Group__4 : rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 ;
    public final void rule__LinePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3711:1: ( rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 )
            // InternalBiLang.g:3712:2: rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5
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
    // InternalBiLang.g:3719:1: rule__LinePlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__LinePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3723:1: ( ( 'xAx' ) )
            // InternalBiLang.g:3724:1: ( 'xAx' )
            {
            // InternalBiLang.g:3724:1: ( 'xAx' )
            // InternalBiLang.g:3725:2: 'xAx'
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
    // InternalBiLang.g:3734:1: rule__LinePlot__Group__5 : rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 ;
    public final void rule__LinePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3738:1: ( rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 )
            // InternalBiLang.g:3739:2: rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:3746:1: rule__LinePlot__Group__5__Impl : ( ( rule__LinePlot__XAxisAssignment_5 ) ) ;
    public final void rule__LinePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3750:1: ( ( ( rule__LinePlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:3751:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:3751:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:3752:2: ( rule__LinePlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getLinePlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:3753:2: ( rule__LinePlot__XAxisAssignment_5 )
            // InternalBiLang.g:3753:3: rule__LinePlot__XAxisAssignment_5
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
    // InternalBiLang.g:3761:1: rule__LinePlot__Group__6 : rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 ;
    public final void rule__LinePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3765:1: ( rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 )
            // InternalBiLang.g:3766:2: rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7
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
    // InternalBiLang.g:3773:1: rule__LinePlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__LinePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3777:1: ( ( 'yA' ) )
            // InternalBiLang.g:3778:1: ( 'yA' )
            {
            // InternalBiLang.g:3778:1: ( 'yA' )
            // InternalBiLang.g:3779:2: 'yA'
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
    // InternalBiLang.g:3788:1: rule__LinePlot__Group__7 : rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 ;
    public final void rule__LinePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3792:1: ( rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 )
            // InternalBiLang.g:3793:2: rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3800:1: rule__LinePlot__Group__7__Impl : ( ( rule__LinePlot__YAxisAssignment_7 ) ) ;
    public final void rule__LinePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3804:1: ( ( ( rule__LinePlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3805:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3805:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3806:2: ( rule__LinePlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getLinePlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3807:2: ( rule__LinePlot__YAxisAssignment_7 )
            // InternalBiLang.g:3807:3: rule__LinePlot__YAxisAssignment_7
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
    // InternalBiLang.g:3815:1: rule__LinePlot__Group__8 : rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 ;
    public final void rule__LinePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3819:1: ( rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 )
            // InternalBiLang.g:3820:2: rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3827:1: rule__LinePlot__Group__8__Impl : ( ( rule__LinePlot__Group_8__0 )? ) ;
    public final void rule__LinePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3831:1: ( ( ( rule__LinePlot__Group_8__0 )? ) )
            // InternalBiLang.g:3832:1: ( ( rule__LinePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3832:1: ( ( rule__LinePlot__Group_8__0 )? )
            // InternalBiLang.g:3833:2: ( rule__LinePlot__Group_8__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_8()); 
            // InternalBiLang.g:3834:2: ( rule__LinePlot__Group_8__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBiLang.g:3834:3: rule__LinePlot__Group_8__0
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
    // InternalBiLang.g:3842:1: rule__LinePlot__Group__9 : rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 ;
    public final void rule__LinePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3846:1: ( rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 )
            // InternalBiLang.g:3847:2: rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3854:1: rule__LinePlot__Group__9__Impl : ( ( rule__LinePlot__Group_9__0 )? ) ;
    public final void rule__LinePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3858:1: ( ( ( rule__LinePlot__Group_9__0 )? ) )
            // InternalBiLang.g:3859:1: ( ( rule__LinePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:3859:1: ( ( rule__LinePlot__Group_9__0 )? )
            // InternalBiLang.g:3860:2: ( rule__LinePlot__Group_9__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_9()); 
            // InternalBiLang.g:3861:2: ( rule__LinePlot__Group_9__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBiLang.g:3861:3: rule__LinePlot__Group_9__0
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
    // InternalBiLang.g:3869:1: rule__LinePlot__Group__10 : rule__LinePlot__Group__10__Impl ;
    public final void rule__LinePlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3873:1: ( rule__LinePlot__Group__10__Impl )
            // InternalBiLang.g:3874:2: rule__LinePlot__Group__10__Impl
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
    // InternalBiLang.g:3880:1: rule__LinePlot__Group__10__Impl : ( ( rule__LinePlot__Group_10__0 )? ) ;
    public final void rule__LinePlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3884:1: ( ( ( rule__LinePlot__Group_10__0 )? ) )
            // InternalBiLang.g:3885:1: ( ( rule__LinePlot__Group_10__0 )? )
            {
            // InternalBiLang.g:3885:1: ( ( rule__LinePlot__Group_10__0 )? )
            // InternalBiLang.g:3886:2: ( rule__LinePlot__Group_10__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_10()); 
            // InternalBiLang.g:3887:2: ( rule__LinePlot__Group_10__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBiLang.g:3887:3: rule__LinePlot__Group_10__0
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
    // InternalBiLang.g:3896:1: rule__LinePlot__Group_8__0 : rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 ;
    public final void rule__LinePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3900:1: ( rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 )
            // InternalBiLang.g:3901:2: rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:3908:1: rule__LinePlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__LinePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3912:1: ( ( 'loc' ) )
            // InternalBiLang.g:3913:1: ( 'loc' )
            {
            // InternalBiLang.g:3913:1: ( 'loc' )
            // InternalBiLang.g:3914:2: 'loc'
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
    // InternalBiLang.g:3923:1: rule__LinePlot__Group_8__1 : rule__LinePlot__Group_8__1__Impl ;
    public final void rule__LinePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3927:1: ( rule__LinePlot__Group_8__1__Impl )
            // InternalBiLang.g:3928:2: rule__LinePlot__Group_8__1__Impl
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
    // InternalBiLang.g:3934:1: rule__LinePlot__Group_8__1__Impl : ( ( rule__LinePlot__LocationAssignment_8_1 ) ) ;
    public final void rule__LinePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3938:1: ( ( ( rule__LinePlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:3939:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:3939:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:3940:2: ( rule__LinePlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:3941:2: ( rule__LinePlot__LocationAssignment_8_1 )
            // InternalBiLang.g:3941:3: rule__LinePlot__LocationAssignment_8_1
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
    // InternalBiLang.g:3950:1: rule__LinePlot__Group_9__0 : rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 ;
    public final void rule__LinePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3954:1: ( rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 )
            // InternalBiLang.g:3955:2: rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1
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
    // InternalBiLang.g:3962:1: rule__LinePlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__LinePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3966:1: ( ( 'colors' ) )
            // InternalBiLang.g:3967:1: ( 'colors' )
            {
            // InternalBiLang.g:3967:1: ( 'colors' )
            // InternalBiLang.g:3968:2: 'colors'
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
    // InternalBiLang.g:3977:1: rule__LinePlot__Group_9__1 : rule__LinePlot__Group_9__1__Impl ;
    public final void rule__LinePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3981:1: ( rule__LinePlot__Group_9__1__Impl )
            // InternalBiLang.g:3982:2: rule__LinePlot__Group_9__1__Impl
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
    // InternalBiLang.g:3988:1: rule__LinePlot__Group_9__1__Impl : ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__LinePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3992:1: ( ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:3993:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:3993:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:3994:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getLinePlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:3995:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:3995:3: rule__LinePlot__ColorsAssignment_9_1
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
    // InternalBiLang.g:4004:1: rule__LinePlot__Group_10__0 : rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 ;
    public final void rule__LinePlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4008:1: ( rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 )
            // InternalBiLang.g:4009:2: rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:4016:1: rule__LinePlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__LinePlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4020:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4021:1: ( 'thickness' )
            {
            // InternalBiLang.g:4021:1: ( 'thickness' )
            // InternalBiLang.g:4022:2: 'thickness'
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
    // InternalBiLang.g:4031:1: rule__LinePlot__Group_10__1 : rule__LinePlot__Group_10__1__Impl ;
    public final void rule__LinePlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4035:1: ( rule__LinePlot__Group_10__1__Impl )
            // InternalBiLang.g:4036:2: rule__LinePlot__Group_10__1__Impl
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
    // InternalBiLang.g:4042:1: rule__LinePlot__Group_10__1__Impl : ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__LinePlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4046:1: ( ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:4047:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:4047:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:4048:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:4049:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:4049:3: rule__LinePlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:4058:1: rule__DonutPlot__Group__0 : rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 ;
    public final void rule__DonutPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4062:1: ( rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 )
            // InternalBiLang.g:4063:2: rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1
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
    // InternalBiLang.g:4070:1: rule__DonutPlot__Group__0__Impl : ( 'donut' ) ;
    public final void rule__DonutPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4074:1: ( ( 'donut' ) )
            // InternalBiLang.g:4075:1: ( 'donut' )
            {
            // InternalBiLang.g:4075:1: ( 'donut' )
            // InternalBiLang.g:4076:2: 'donut'
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
    // InternalBiLang.g:4085:1: rule__DonutPlot__Group__1 : rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 ;
    public final void rule__DonutPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4089:1: ( rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 )
            // InternalBiLang.g:4090:2: rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:4097:1: rule__DonutPlot__Group__1__Impl : ( ( rule__DonutPlot__NameAssignment_1 ) ) ;
    public final void rule__DonutPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4101:1: ( ( ( rule__DonutPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4102:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4102:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            // InternalBiLang.g:4103:2: ( rule__DonutPlot__NameAssignment_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4104:2: ( rule__DonutPlot__NameAssignment_1 )
            // InternalBiLang.g:4104:3: rule__DonutPlot__NameAssignment_1
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
    // InternalBiLang.g:4112:1: rule__DonutPlot__Group__2 : rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 ;
    public final void rule__DonutPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4116:1: ( rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 )
            // InternalBiLang.g:4117:2: rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:4124:1: rule__DonutPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__DonutPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4128:1: ( ( '->' ) )
            // InternalBiLang.g:4129:1: ( '->' )
            {
            // InternalBiLang.g:4129:1: ( '->' )
            // InternalBiLang.g:4130:2: '->'
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
    // InternalBiLang.g:4139:1: rule__DonutPlot__Group__3 : rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 ;
    public final void rule__DonutPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4143:1: ( rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 )
            // InternalBiLang.g:4144:2: rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4
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
    // InternalBiLang.g:4151:1: rule__DonutPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__DonutPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4155:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4156:1: ( 'xAx' )
            {
            // InternalBiLang.g:4156:1: ( 'xAx' )
            // InternalBiLang.g:4157:2: 'xAx'
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
    // InternalBiLang.g:4166:1: rule__DonutPlot__Group__4 : rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 ;
    public final void rule__DonutPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4170:1: ( rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 )
            // InternalBiLang.g:4171:2: rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:4178:1: rule__DonutPlot__Group__4__Impl : ( ( rule__DonutPlot__XAxisAssignment_4 ) ) ;
    public final void rule__DonutPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4182:1: ( ( ( rule__DonutPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4183:1: ( ( rule__DonutPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4183:1: ( ( rule__DonutPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4184:2: ( rule__DonutPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getDonutPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4185:2: ( rule__DonutPlot__XAxisAssignment_4 )
            // InternalBiLang.g:4185:3: rule__DonutPlot__XAxisAssignment_4
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
    // InternalBiLang.g:4193:1: rule__DonutPlot__Group__5 : rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 ;
    public final void rule__DonutPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4197:1: ( rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 )
            // InternalBiLang.g:4198:2: rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6
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
    // InternalBiLang.g:4205:1: rule__DonutPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__DonutPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4209:1: ( ( 'yA' ) )
            // InternalBiLang.g:4210:1: ( 'yA' )
            {
            // InternalBiLang.g:4210:1: ( 'yA' )
            // InternalBiLang.g:4211:2: 'yA'
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
    // InternalBiLang.g:4220:1: rule__DonutPlot__Group__6 : rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7 ;
    public final void rule__DonutPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4224:1: ( rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7 )
            // InternalBiLang.g:4225:2: rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4232:1: rule__DonutPlot__Group__6__Impl : ( ( rule__DonutPlot__YAxisAssignment_6 ) ) ;
    public final void rule__DonutPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4236:1: ( ( ( rule__DonutPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:4237:1: ( ( rule__DonutPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:4237:1: ( ( rule__DonutPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:4238:2: ( rule__DonutPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getDonutPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:4239:2: ( rule__DonutPlot__YAxisAssignment_6 )
            // InternalBiLang.g:4239:3: rule__DonutPlot__YAxisAssignment_6
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
    // InternalBiLang.g:4247:1: rule__DonutPlot__Group__7 : rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8 ;
    public final void rule__DonutPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4251:1: ( rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8 )
            // InternalBiLang.g:4252:2: rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4259:1: rule__DonutPlot__Group__7__Impl : ( ( rule__DonutPlot__Group_7__0 )? ) ;
    public final void rule__DonutPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4263:1: ( ( ( rule__DonutPlot__Group_7__0 )? ) )
            // InternalBiLang.g:4264:1: ( ( rule__DonutPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:4264:1: ( ( rule__DonutPlot__Group_7__0 )? )
            // InternalBiLang.g:4265:2: ( rule__DonutPlot__Group_7__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_7()); 
            // InternalBiLang.g:4266:2: ( rule__DonutPlot__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:4266:3: rule__DonutPlot__Group_7__0
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
    // InternalBiLang.g:4274:1: rule__DonutPlot__Group__8 : rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9 ;
    public final void rule__DonutPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4278:1: ( rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9 )
            // InternalBiLang.g:4279:2: rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4286:1: rule__DonutPlot__Group__8__Impl : ( ( rule__DonutPlot__Group_8__0 )? ) ;
    public final void rule__DonutPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4290:1: ( ( ( rule__DonutPlot__Group_8__0 )? ) )
            // InternalBiLang.g:4291:1: ( ( rule__DonutPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4291:1: ( ( rule__DonutPlot__Group_8__0 )? )
            // InternalBiLang.g:4292:2: ( rule__DonutPlot__Group_8__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_8()); 
            // InternalBiLang.g:4293:2: ( rule__DonutPlot__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:4293:3: rule__DonutPlot__Group_8__0
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
    // InternalBiLang.g:4301:1: rule__DonutPlot__Group__9 : rule__DonutPlot__Group__9__Impl ;
    public final void rule__DonutPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4305:1: ( rule__DonutPlot__Group__9__Impl )
            // InternalBiLang.g:4306:2: rule__DonutPlot__Group__9__Impl
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
    // InternalBiLang.g:4312:1: rule__DonutPlot__Group__9__Impl : ( ( rule__DonutPlot__Group_9__0 )? ) ;
    public final void rule__DonutPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4316:1: ( ( ( rule__DonutPlot__Group_9__0 )? ) )
            // InternalBiLang.g:4317:1: ( ( rule__DonutPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4317:1: ( ( rule__DonutPlot__Group_9__0 )? )
            // InternalBiLang.g:4318:2: ( rule__DonutPlot__Group_9__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_9()); 
            // InternalBiLang.g:4319:2: ( rule__DonutPlot__Group_9__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:4319:3: rule__DonutPlot__Group_9__0
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
    // InternalBiLang.g:4328:1: rule__DonutPlot__Group_7__0 : rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1 ;
    public final void rule__DonutPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4332:1: ( rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1 )
            // InternalBiLang.g:4333:2: rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:4340:1: rule__DonutPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__DonutPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4344:1: ( ( 'loc' ) )
            // InternalBiLang.g:4345:1: ( 'loc' )
            {
            // InternalBiLang.g:4345:1: ( 'loc' )
            // InternalBiLang.g:4346:2: 'loc'
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
    // InternalBiLang.g:4355:1: rule__DonutPlot__Group_7__1 : rule__DonutPlot__Group_7__1__Impl ;
    public final void rule__DonutPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4359:1: ( rule__DonutPlot__Group_7__1__Impl )
            // InternalBiLang.g:4360:2: rule__DonutPlot__Group_7__1__Impl
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
    // InternalBiLang.g:4366:1: rule__DonutPlot__Group_7__1__Impl : ( ( rule__DonutPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__DonutPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4370:1: ( ( ( rule__DonutPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:4371:1: ( ( rule__DonutPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:4371:1: ( ( rule__DonutPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:4372:2: ( rule__DonutPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:4373:2: ( rule__DonutPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:4373:3: rule__DonutPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:4382:1: rule__DonutPlot__Group_8__0 : rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1 ;
    public final void rule__DonutPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4386:1: ( rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1 )
            // InternalBiLang.g:4387:2: rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1
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
    // InternalBiLang.g:4394:1: rule__DonutPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__DonutPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4398:1: ( ( 'colors' ) )
            // InternalBiLang.g:4399:1: ( 'colors' )
            {
            // InternalBiLang.g:4399:1: ( 'colors' )
            // InternalBiLang.g:4400:2: 'colors'
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
    // InternalBiLang.g:4409:1: rule__DonutPlot__Group_8__1 : rule__DonutPlot__Group_8__1__Impl ;
    public final void rule__DonutPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4413:1: ( rule__DonutPlot__Group_8__1__Impl )
            // InternalBiLang.g:4414:2: rule__DonutPlot__Group_8__1__Impl
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
    // InternalBiLang.g:4420:1: rule__DonutPlot__Group_8__1__Impl : ( ( rule__DonutPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__DonutPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4424:1: ( ( ( rule__DonutPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:4425:1: ( ( rule__DonutPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:4425:1: ( ( rule__DonutPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:4426:2: ( rule__DonutPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:4427:2: ( rule__DonutPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:4427:3: rule__DonutPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:4436:1: rule__DonutPlot__Group_9__0 : rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1 ;
    public final void rule__DonutPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4440:1: ( rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1 )
            // InternalBiLang.g:4441:2: rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:4448:1: rule__DonutPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__DonutPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4452:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4453:1: ( 'thickness' )
            {
            // InternalBiLang.g:4453:1: ( 'thickness' )
            // InternalBiLang.g:4454:2: 'thickness'
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
    // InternalBiLang.g:4463:1: rule__DonutPlot__Group_9__1 : rule__DonutPlot__Group_9__1__Impl ;
    public final void rule__DonutPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4467:1: ( rule__DonutPlot__Group_9__1__Impl )
            // InternalBiLang.g:4468:2: rule__DonutPlot__Group_9__1__Impl
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
    // InternalBiLang.g:4474:1: rule__DonutPlot__Group_9__1__Impl : ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__DonutPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4478:1: ( ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:4479:1: ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:4479:1: ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:4480:2: ( rule__DonutPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:4481:2: ( rule__DonutPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:4481:3: rule__DonutPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:4490:1: rule__PiePlot__Group__0 : rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 ;
    public final void rule__PiePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4494:1: ( rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 )
            // InternalBiLang.g:4495:2: rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1
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
    // InternalBiLang.g:4502:1: rule__PiePlot__Group__0__Impl : ( 'pie' ) ;
    public final void rule__PiePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4506:1: ( ( 'pie' ) )
            // InternalBiLang.g:4507:1: ( 'pie' )
            {
            // InternalBiLang.g:4507:1: ( 'pie' )
            // InternalBiLang.g:4508:2: 'pie'
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
    // InternalBiLang.g:4517:1: rule__PiePlot__Group__1 : rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 ;
    public final void rule__PiePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4521:1: ( rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 )
            // InternalBiLang.g:4522:2: rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:4529:1: rule__PiePlot__Group__1__Impl : ( ( rule__PiePlot__NameAssignment_1 ) ) ;
    public final void rule__PiePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4533:1: ( ( ( rule__PiePlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4534:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4534:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            // InternalBiLang.g:4535:2: ( rule__PiePlot__NameAssignment_1 )
            {
             before(grammarAccess.getPiePlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4536:2: ( rule__PiePlot__NameAssignment_1 )
            // InternalBiLang.g:4536:3: rule__PiePlot__NameAssignment_1
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
    // InternalBiLang.g:4544:1: rule__PiePlot__Group__2 : rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 ;
    public final void rule__PiePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4548:1: ( rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 )
            // InternalBiLang.g:4549:2: rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:4556:1: rule__PiePlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PiePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4560:1: ( ( '->' ) )
            // InternalBiLang.g:4561:1: ( '->' )
            {
            // InternalBiLang.g:4561:1: ( '->' )
            // InternalBiLang.g:4562:2: '->'
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
    // InternalBiLang.g:4571:1: rule__PiePlot__Group__3 : rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 ;
    public final void rule__PiePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4575:1: ( rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 )
            // InternalBiLang.g:4576:2: rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4
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
    // InternalBiLang.g:4583:1: rule__PiePlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PiePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4587:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4588:1: ( 'xAx' )
            {
            // InternalBiLang.g:4588:1: ( 'xAx' )
            // InternalBiLang.g:4589:2: 'xAx'
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
    // InternalBiLang.g:4598:1: rule__PiePlot__Group__4 : rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 ;
    public final void rule__PiePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4602:1: ( rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 )
            // InternalBiLang.g:4603:2: rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:4610:1: rule__PiePlot__Group__4__Impl : ( ( rule__PiePlot__XAxisAssignment_4 ) ) ;
    public final void rule__PiePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4614:1: ( ( ( rule__PiePlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4615:1: ( ( rule__PiePlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4615:1: ( ( rule__PiePlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4616:2: ( rule__PiePlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPiePlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4617:2: ( rule__PiePlot__XAxisAssignment_4 )
            // InternalBiLang.g:4617:3: rule__PiePlot__XAxisAssignment_4
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
    // InternalBiLang.g:4625:1: rule__PiePlot__Group__5 : rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 ;
    public final void rule__PiePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4629:1: ( rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 )
            // InternalBiLang.g:4630:2: rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6
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
    // InternalBiLang.g:4637:1: rule__PiePlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PiePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4641:1: ( ( 'yA' ) )
            // InternalBiLang.g:4642:1: ( 'yA' )
            {
            // InternalBiLang.g:4642:1: ( 'yA' )
            // InternalBiLang.g:4643:2: 'yA'
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
    // InternalBiLang.g:4652:1: rule__PiePlot__Group__6 : rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7 ;
    public final void rule__PiePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4656:1: ( rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7 )
            // InternalBiLang.g:4657:2: rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4664:1: rule__PiePlot__Group__6__Impl : ( ( rule__PiePlot__YAxisAssignment_6 ) ) ;
    public final void rule__PiePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4668:1: ( ( ( rule__PiePlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:4669:1: ( ( rule__PiePlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:4669:1: ( ( rule__PiePlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:4670:2: ( rule__PiePlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPiePlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:4671:2: ( rule__PiePlot__YAxisAssignment_6 )
            // InternalBiLang.g:4671:3: rule__PiePlot__YAxisAssignment_6
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
    // InternalBiLang.g:4679:1: rule__PiePlot__Group__7 : rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8 ;
    public final void rule__PiePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4683:1: ( rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8 )
            // InternalBiLang.g:4684:2: rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4691:1: rule__PiePlot__Group__7__Impl : ( ( rule__PiePlot__Group_7__0 )? ) ;
    public final void rule__PiePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4695:1: ( ( ( rule__PiePlot__Group_7__0 )? ) )
            // InternalBiLang.g:4696:1: ( ( rule__PiePlot__Group_7__0 )? )
            {
            // InternalBiLang.g:4696:1: ( ( rule__PiePlot__Group_7__0 )? )
            // InternalBiLang.g:4697:2: ( rule__PiePlot__Group_7__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_7()); 
            // InternalBiLang.g:4698:2: ( rule__PiePlot__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:4698:3: rule__PiePlot__Group_7__0
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
    // InternalBiLang.g:4706:1: rule__PiePlot__Group__8 : rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9 ;
    public final void rule__PiePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4710:1: ( rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9 )
            // InternalBiLang.g:4711:2: rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:4718:1: rule__PiePlot__Group__8__Impl : ( ( rule__PiePlot__Group_8__0 )? ) ;
    public final void rule__PiePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4722:1: ( ( ( rule__PiePlot__Group_8__0 )? ) )
            // InternalBiLang.g:4723:1: ( ( rule__PiePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4723:1: ( ( rule__PiePlot__Group_8__0 )? )
            // InternalBiLang.g:4724:2: ( rule__PiePlot__Group_8__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_8()); 
            // InternalBiLang.g:4725:2: ( rule__PiePlot__Group_8__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:4725:3: rule__PiePlot__Group_8__0
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
    // InternalBiLang.g:4733:1: rule__PiePlot__Group__9 : rule__PiePlot__Group__9__Impl ;
    public final void rule__PiePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4737:1: ( rule__PiePlot__Group__9__Impl )
            // InternalBiLang.g:4738:2: rule__PiePlot__Group__9__Impl
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
    // InternalBiLang.g:4744:1: rule__PiePlot__Group__9__Impl : ( ( rule__PiePlot__Group_9__0 )? ) ;
    public final void rule__PiePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4748:1: ( ( ( rule__PiePlot__Group_9__0 )? ) )
            // InternalBiLang.g:4749:1: ( ( rule__PiePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4749:1: ( ( rule__PiePlot__Group_9__0 )? )
            // InternalBiLang.g:4750:2: ( rule__PiePlot__Group_9__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_9()); 
            // InternalBiLang.g:4751:2: ( rule__PiePlot__Group_9__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:4751:3: rule__PiePlot__Group_9__0
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
    // InternalBiLang.g:4760:1: rule__PiePlot__Group_7__0 : rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1 ;
    public final void rule__PiePlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4764:1: ( rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1 )
            // InternalBiLang.g:4765:2: rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:4772:1: rule__PiePlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PiePlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4776:1: ( ( 'loc' ) )
            // InternalBiLang.g:4777:1: ( 'loc' )
            {
            // InternalBiLang.g:4777:1: ( 'loc' )
            // InternalBiLang.g:4778:2: 'loc'
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
    // InternalBiLang.g:4787:1: rule__PiePlot__Group_7__1 : rule__PiePlot__Group_7__1__Impl ;
    public final void rule__PiePlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4791:1: ( rule__PiePlot__Group_7__1__Impl )
            // InternalBiLang.g:4792:2: rule__PiePlot__Group_7__1__Impl
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
    // InternalBiLang.g:4798:1: rule__PiePlot__Group_7__1__Impl : ( ( rule__PiePlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PiePlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4802:1: ( ( ( rule__PiePlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:4803:1: ( ( rule__PiePlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:4803:1: ( ( rule__PiePlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:4804:2: ( rule__PiePlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPiePlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:4805:2: ( rule__PiePlot__LocationAssignment_7_1 )
            // InternalBiLang.g:4805:3: rule__PiePlot__LocationAssignment_7_1
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
    // InternalBiLang.g:4814:1: rule__PiePlot__Group_8__0 : rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1 ;
    public final void rule__PiePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4818:1: ( rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1 )
            // InternalBiLang.g:4819:2: rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1
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
    // InternalBiLang.g:4826:1: rule__PiePlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PiePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4830:1: ( ( 'colors' ) )
            // InternalBiLang.g:4831:1: ( 'colors' )
            {
            // InternalBiLang.g:4831:1: ( 'colors' )
            // InternalBiLang.g:4832:2: 'colors'
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
    // InternalBiLang.g:4841:1: rule__PiePlot__Group_8__1 : rule__PiePlot__Group_8__1__Impl ;
    public final void rule__PiePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4845:1: ( rule__PiePlot__Group_8__1__Impl )
            // InternalBiLang.g:4846:2: rule__PiePlot__Group_8__1__Impl
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
    // InternalBiLang.g:4852:1: rule__PiePlot__Group_8__1__Impl : ( ( rule__PiePlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PiePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4856:1: ( ( ( rule__PiePlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:4857:1: ( ( rule__PiePlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:4857:1: ( ( rule__PiePlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:4858:2: ( rule__PiePlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPiePlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:4859:2: ( rule__PiePlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:4859:3: rule__PiePlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:4868:1: rule__PiePlot__Group_9__0 : rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1 ;
    public final void rule__PiePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4872:1: ( rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1 )
            // InternalBiLang.g:4873:2: rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:4880:1: rule__PiePlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PiePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4884:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4885:1: ( 'thickness' )
            {
            // InternalBiLang.g:4885:1: ( 'thickness' )
            // InternalBiLang.g:4886:2: 'thickness'
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
    // InternalBiLang.g:4895:1: rule__PiePlot__Group_9__1 : rule__PiePlot__Group_9__1__Impl ;
    public final void rule__PiePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4899:1: ( rule__PiePlot__Group_9__1__Impl )
            // InternalBiLang.g:4900:2: rule__PiePlot__Group_9__1__Impl
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
    // InternalBiLang.g:4906:1: rule__PiePlot__Group_9__1__Impl : ( ( rule__PiePlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PiePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4910:1: ( ( ( rule__PiePlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:4911:1: ( ( rule__PiePlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:4911:1: ( ( rule__PiePlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:4912:2: ( rule__PiePlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPiePlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:4913:2: ( rule__PiePlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:4913:3: rule__PiePlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:4922:1: rule__PolarPlot__Group__0 : rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 ;
    public final void rule__PolarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4926:1: ( rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 )
            // InternalBiLang.g:4927:2: rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1
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
    // InternalBiLang.g:4934:1: rule__PolarPlot__Group__0__Impl : ( 'polar' ) ;
    public final void rule__PolarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4938:1: ( ( 'polar' ) )
            // InternalBiLang.g:4939:1: ( 'polar' )
            {
            // InternalBiLang.g:4939:1: ( 'polar' )
            // InternalBiLang.g:4940:2: 'polar'
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
    // InternalBiLang.g:4949:1: rule__PolarPlot__Group__1 : rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 ;
    public final void rule__PolarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4953:1: ( rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 )
            // InternalBiLang.g:4954:2: rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:4961:1: rule__PolarPlot__Group__1__Impl : ( ( rule__PolarPlot__NameAssignment_1 ) ) ;
    public final void rule__PolarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4965:1: ( ( ( rule__PolarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4966:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4966:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:4967:2: ( rule__PolarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4968:2: ( rule__PolarPlot__NameAssignment_1 )
            // InternalBiLang.g:4968:3: rule__PolarPlot__NameAssignment_1
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
    // InternalBiLang.g:4976:1: rule__PolarPlot__Group__2 : rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 ;
    public final void rule__PolarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4980:1: ( rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 )
            // InternalBiLang.g:4981:2: rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:4988:1: rule__PolarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PolarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4992:1: ( ( '->' ) )
            // InternalBiLang.g:4993:1: ( '->' )
            {
            // InternalBiLang.g:4993:1: ( '->' )
            // InternalBiLang.g:4994:2: '->'
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
    // InternalBiLang.g:5003:1: rule__PolarPlot__Group__3 : rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 ;
    public final void rule__PolarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5007:1: ( rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 )
            // InternalBiLang.g:5008:2: rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4
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
    // InternalBiLang.g:5015:1: rule__PolarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PolarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5019:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5020:1: ( 'xAx' )
            {
            // InternalBiLang.g:5020:1: ( 'xAx' )
            // InternalBiLang.g:5021:2: 'xAx'
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
    // InternalBiLang.g:5030:1: rule__PolarPlot__Group__4 : rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 ;
    public final void rule__PolarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5034:1: ( rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 )
            // InternalBiLang.g:5035:2: rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:5042:1: rule__PolarPlot__Group__4__Impl : ( ( rule__PolarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__PolarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5046:1: ( ( ( rule__PolarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5047:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5047:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5048:2: ( rule__PolarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPolarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5049:2: ( rule__PolarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5049:3: rule__PolarPlot__XAxisAssignment_4
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
    // InternalBiLang.g:5057:1: rule__PolarPlot__Group__5 : rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 ;
    public final void rule__PolarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5061:1: ( rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 )
            // InternalBiLang.g:5062:2: rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6
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
    // InternalBiLang.g:5069:1: rule__PolarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PolarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5073:1: ( ( 'yA' ) )
            // InternalBiLang.g:5074:1: ( 'yA' )
            {
            // InternalBiLang.g:5074:1: ( 'yA' )
            // InternalBiLang.g:5075:2: 'yA'
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
    // InternalBiLang.g:5084:1: rule__PolarPlot__Group__6 : rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 ;
    public final void rule__PolarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5088:1: ( rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 )
            // InternalBiLang.g:5089:2: rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5096:1: rule__PolarPlot__Group__6__Impl : ( ( rule__PolarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__PolarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5100:1: ( ( ( rule__PolarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5101:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5101:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5102:2: ( rule__PolarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPolarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5103:2: ( rule__PolarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5103:3: rule__PolarPlot__YAxisAssignment_6
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
    // InternalBiLang.g:5111:1: rule__PolarPlot__Group__7 : rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 ;
    public final void rule__PolarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5115:1: ( rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 )
            // InternalBiLang.g:5116:2: rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5123:1: rule__PolarPlot__Group__7__Impl : ( ( rule__PolarPlot__Group_7__0 )? ) ;
    public final void rule__PolarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5127:1: ( ( ( rule__PolarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5128:1: ( ( rule__PolarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5128:1: ( ( rule__PolarPlot__Group_7__0 )? )
            // InternalBiLang.g:5129:2: ( rule__PolarPlot__Group_7__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5130:2: ( rule__PolarPlot__Group_7__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:5130:3: rule__PolarPlot__Group_7__0
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
    // InternalBiLang.g:5138:1: rule__PolarPlot__Group__8 : rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 ;
    public final void rule__PolarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5142:1: ( rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 )
            // InternalBiLang.g:5143:2: rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5150:1: rule__PolarPlot__Group__8__Impl : ( ( rule__PolarPlot__Group_8__0 )? ) ;
    public final void rule__PolarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5154:1: ( ( ( rule__PolarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5155:1: ( ( rule__PolarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5155:1: ( ( rule__PolarPlot__Group_8__0 )? )
            // InternalBiLang.g:5156:2: ( rule__PolarPlot__Group_8__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5157:2: ( rule__PolarPlot__Group_8__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:5157:3: rule__PolarPlot__Group_8__0
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
    // InternalBiLang.g:5165:1: rule__PolarPlot__Group__9 : rule__PolarPlot__Group__9__Impl ;
    public final void rule__PolarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5169:1: ( rule__PolarPlot__Group__9__Impl )
            // InternalBiLang.g:5170:2: rule__PolarPlot__Group__9__Impl
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
    // InternalBiLang.g:5176:1: rule__PolarPlot__Group__9__Impl : ( ( rule__PolarPlot__Group_9__0 )? ) ;
    public final void rule__PolarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5180:1: ( ( ( rule__PolarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5181:1: ( ( rule__PolarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5181:1: ( ( rule__PolarPlot__Group_9__0 )? )
            // InternalBiLang.g:5182:2: ( rule__PolarPlot__Group_9__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5183:2: ( rule__PolarPlot__Group_9__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:5183:3: rule__PolarPlot__Group_9__0
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
    // InternalBiLang.g:5192:1: rule__PolarPlot__Group_7__0 : rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 ;
    public final void rule__PolarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5196:1: ( rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 )
            // InternalBiLang.g:5197:2: rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:5204:1: rule__PolarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PolarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5208:1: ( ( 'loc' ) )
            // InternalBiLang.g:5209:1: ( 'loc' )
            {
            // InternalBiLang.g:5209:1: ( 'loc' )
            // InternalBiLang.g:5210:2: 'loc'
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
    // InternalBiLang.g:5219:1: rule__PolarPlot__Group_7__1 : rule__PolarPlot__Group_7__1__Impl ;
    public final void rule__PolarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5223:1: ( rule__PolarPlot__Group_7__1__Impl )
            // InternalBiLang.g:5224:2: rule__PolarPlot__Group_7__1__Impl
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
    // InternalBiLang.g:5230:1: rule__PolarPlot__Group_7__1__Impl : ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PolarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5234:1: ( ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5235:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5235:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5236:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5237:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5237:3: rule__PolarPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:5246:1: rule__PolarPlot__Group_8__0 : rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 ;
    public final void rule__PolarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5250:1: ( rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 )
            // InternalBiLang.g:5251:2: rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1
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
    // InternalBiLang.g:5258:1: rule__PolarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PolarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5262:1: ( ( 'colors' ) )
            // InternalBiLang.g:5263:1: ( 'colors' )
            {
            // InternalBiLang.g:5263:1: ( 'colors' )
            // InternalBiLang.g:5264:2: 'colors'
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
    // InternalBiLang.g:5273:1: rule__PolarPlot__Group_8__1 : rule__PolarPlot__Group_8__1__Impl ;
    public final void rule__PolarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5277:1: ( rule__PolarPlot__Group_8__1__Impl )
            // InternalBiLang.g:5278:2: rule__PolarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:5284:1: rule__PolarPlot__Group_8__1__Impl : ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PolarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5288:1: ( ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5289:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5289:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5290:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5291:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5291:3: rule__PolarPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:5300:1: rule__PolarPlot__Group_9__0 : rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 ;
    public final void rule__PolarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5304:1: ( rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 )
            // InternalBiLang.g:5305:2: rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:5312:1: rule__PolarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PolarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5316:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5317:1: ( 'thickness' )
            {
            // InternalBiLang.g:5317:1: ( 'thickness' )
            // InternalBiLang.g:5318:2: 'thickness'
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
    // InternalBiLang.g:5327:1: rule__PolarPlot__Group_9__1 : rule__PolarPlot__Group_9__1__Impl ;
    public final void rule__PolarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5331:1: ( rule__PolarPlot__Group_9__1__Impl )
            // InternalBiLang.g:5332:2: rule__PolarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:5338:1: rule__PolarPlot__Group_9__1__Impl : ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PolarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5342:1: ( ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5343:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5343:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5344:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5345:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5345:3: rule__PolarPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:5354:1: rule__ScatterPlot__Group__0 : rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 ;
    public final void rule__ScatterPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5358:1: ( rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 )
            // InternalBiLang.g:5359:2: rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1
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
    // InternalBiLang.g:5366:1: rule__ScatterPlot__Group__0__Impl : ( 'scatter' ) ;
    public final void rule__ScatterPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5370:1: ( ( 'scatter' ) )
            // InternalBiLang.g:5371:1: ( 'scatter' )
            {
            // InternalBiLang.g:5371:1: ( 'scatter' )
            // InternalBiLang.g:5372:2: 'scatter'
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
    // InternalBiLang.g:5381:1: rule__ScatterPlot__Group__1 : rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 ;
    public final void rule__ScatterPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5385:1: ( rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 )
            // InternalBiLang.g:5386:2: rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:5393:1: rule__ScatterPlot__Group__1__Impl : ( ( rule__ScatterPlot__NameAssignment_1 ) ) ;
    public final void rule__ScatterPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5397:1: ( ( ( rule__ScatterPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5398:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5398:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5399:2: ( rule__ScatterPlot__NameAssignment_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5400:2: ( rule__ScatterPlot__NameAssignment_1 )
            // InternalBiLang.g:5400:3: rule__ScatterPlot__NameAssignment_1
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
    // InternalBiLang.g:5408:1: rule__ScatterPlot__Group__2 : rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 ;
    public final void rule__ScatterPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5412:1: ( rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 )
            // InternalBiLang.g:5413:2: rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:5420:1: rule__ScatterPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__ScatterPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5424:1: ( ( '->' ) )
            // InternalBiLang.g:5425:1: ( '->' )
            {
            // InternalBiLang.g:5425:1: ( '->' )
            // InternalBiLang.g:5426:2: '->'
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
    // InternalBiLang.g:5435:1: rule__ScatterPlot__Group__3 : rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 ;
    public final void rule__ScatterPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5439:1: ( rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 )
            // InternalBiLang.g:5440:2: rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4
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
    // InternalBiLang.g:5447:1: rule__ScatterPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__ScatterPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5451:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5452:1: ( 'xAx' )
            {
            // InternalBiLang.g:5452:1: ( 'xAx' )
            // InternalBiLang.g:5453:2: 'xAx'
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
    // InternalBiLang.g:5462:1: rule__ScatterPlot__Group__4 : rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 ;
    public final void rule__ScatterPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5466:1: ( rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 )
            // InternalBiLang.g:5467:2: rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:5474:1: rule__ScatterPlot__Group__4__Impl : ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) ;
    public final void rule__ScatterPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5478:1: ( ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5479:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5479:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5480:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getScatterPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5481:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5481:3: rule__ScatterPlot__XAxisAssignment_4
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
    // InternalBiLang.g:5489:1: rule__ScatterPlot__Group__5 : rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 ;
    public final void rule__ScatterPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5493:1: ( rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 )
            // InternalBiLang.g:5494:2: rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6
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
    // InternalBiLang.g:5501:1: rule__ScatterPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__ScatterPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5505:1: ( ( 'yA' ) )
            // InternalBiLang.g:5506:1: ( 'yA' )
            {
            // InternalBiLang.g:5506:1: ( 'yA' )
            // InternalBiLang.g:5507:2: 'yA'
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
    // InternalBiLang.g:5516:1: rule__ScatterPlot__Group__6 : rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 ;
    public final void rule__ScatterPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5520:1: ( rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 )
            // InternalBiLang.g:5521:2: rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5528:1: rule__ScatterPlot__Group__6__Impl : ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) ;
    public final void rule__ScatterPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5532:1: ( ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5533:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5533:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5534:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getScatterPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5535:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5535:3: rule__ScatterPlot__YAxisAssignment_6
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
    // InternalBiLang.g:5543:1: rule__ScatterPlot__Group__7 : rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 ;
    public final void rule__ScatterPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5547:1: ( rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 )
            // InternalBiLang.g:5548:2: rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5555:1: rule__ScatterPlot__Group__7__Impl : ( ( rule__ScatterPlot__Group_7__0 )? ) ;
    public final void rule__ScatterPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5559:1: ( ( ( rule__ScatterPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5560:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5560:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            // InternalBiLang.g:5561:2: ( rule__ScatterPlot__Group_7__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5562:2: ( rule__ScatterPlot__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:5562:3: rule__ScatterPlot__Group_7__0
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
    // InternalBiLang.g:5570:1: rule__ScatterPlot__Group__8 : rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 ;
    public final void rule__ScatterPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5574:1: ( rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 )
            // InternalBiLang.g:5575:2: rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5582:1: rule__ScatterPlot__Group__8__Impl : ( ( rule__ScatterPlot__Group_8__0 )? ) ;
    public final void rule__ScatterPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5586:1: ( ( ( rule__ScatterPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5587:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5587:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            // InternalBiLang.g:5588:2: ( rule__ScatterPlot__Group_8__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5589:2: ( rule__ScatterPlot__Group_8__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:5589:3: rule__ScatterPlot__Group_8__0
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
    // InternalBiLang.g:5597:1: rule__ScatterPlot__Group__9 : rule__ScatterPlot__Group__9__Impl ;
    public final void rule__ScatterPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5601:1: ( rule__ScatterPlot__Group__9__Impl )
            // InternalBiLang.g:5602:2: rule__ScatterPlot__Group__9__Impl
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
    // InternalBiLang.g:5608:1: rule__ScatterPlot__Group__9__Impl : ( ( rule__ScatterPlot__Group_9__0 )? ) ;
    public final void rule__ScatterPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5612:1: ( ( ( rule__ScatterPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5613:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5613:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            // InternalBiLang.g:5614:2: ( rule__ScatterPlot__Group_9__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5615:2: ( rule__ScatterPlot__Group_9__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:5615:3: rule__ScatterPlot__Group_9__0
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
    // InternalBiLang.g:5624:1: rule__ScatterPlot__Group_7__0 : rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 ;
    public final void rule__ScatterPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5628:1: ( rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 )
            // InternalBiLang.g:5629:2: rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:5636:1: rule__ScatterPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__ScatterPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5640:1: ( ( 'loc' ) )
            // InternalBiLang.g:5641:1: ( 'loc' )
            {
            // InternalBiLang.g:5641:1: ( 'loc' )
            // InternalBiLang.g:5642:2: 'loc'
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
    // InternalBiLang.g:5651:1: rule__ScatterPlot__Group_7__1 : rule__ScatterPlot__Group_7__1__Impl ;
    public final void rule__ScatterPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5655:1: ( rule__ScatterPlot__Group_7__1__Impl )
            // InternalBiLang.g:5656:2: rule__ScatterPlot__Group_7__1__Impl
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
    // InternalBiLang.g:5662:1: rule__ScatterPlot__Group_7__1__Impl : ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__ScatterPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5666:1: ( ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5667:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5667:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5668:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5669:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5669:3: rule__ScatterPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:5678:1: rule__ScatterPlot__Group_8__0 : rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 ;
    public final void rule__ScatterPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5682:1: ( rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 )
            // InternalBiLang.g:5683:2: rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1
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
    // InternalBiLang.g:5690:1: rule__ScatterPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__ScatterPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5694:1: ( ( 'colors' ) )
            // InternalBiLang.g:5695:1: ( 'colors' )
            {
            // InternalBiLang.g:5695:1: ( 'colors' )
            // InternalBiLang.g:5696:2: 'colors'
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
    // InternalBiLang.g:5705:1: rule__ScatterPlot__Group_8__1 : rule__ScatterPlot__Group_8__1__Impl ;
    public final void rule__ScatterPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5709:1: ( rule__ScatterPlot__Group_8__1__Impl )
            // InternalBiLang.g:5710:2: rule__ScatterPlot__Group_8__1__Impl
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
    // InternalBiLang.g:5716:1: rule__ScatterPlot__Group_8__1__Impl : ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__ScatterPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5720:1: ( ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5721:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5721:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5722:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5723:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5723:3: rule__ScatterPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:5732:1: rule__ScatterPlot__Group_9__0 : rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 ;
    public final void rule__ScatterPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5736:1: ( rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 )
            // InternalBiLang.g:5737:2: rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:5744:1: rule__ScatterPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__ScatterPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5748:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5749:1: ( 'thickness' )
            {
            // InternalBiLang.g:5749:1: ( 'thickness' )
            // InternalBiLang.g:5750:2: 'thickness'
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
    // InternalBiLang.g:5759:1: rule__ScatterPlot__Group_9__1 : rule__ScatterPlot__Group_9__1__Impl ;
    public final void rule__ScatterPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5763:1: ( rule__ScatterPlot__Group_9__1__Impl )
            // InternalBiLang.g:5764:2: rule__ScatterPlot__Group_9__1__Impl
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
    // InternalBiLang.g:5770:1: rule__ScatterPlot__Group_9__1__Impl : ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__ScatterPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5774:1: ( ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5775:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5775:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5776:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5777:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5777:3: rule__ScatterPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:5786:1: rule__RadarPlot__Group__0 : rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 ;
    public final void rule__RadarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5790:1: ( rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 )
            // InternalBiLang.g:5791:2: rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1
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
    // InternalBiLang.g:5798:1: rule__RadarPlot__Group__0__Impl : ( 'radar' ) ;
    public final void rule__RadarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5802:1: ( ( 'radar' ) )
            // InternalBiLang.g:5803:1: ( 'radar' )
            {
            // InternalBiLang.g:5803:1: ( 'radar' )
            // InternalBiLang.g:5804:2: 'radar'
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
    // InternalBiLang.g:5813:1: rule__RadarPlot__Group__1 : rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 ;
    public final void rule__RadarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5817:1: ( rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 )
            // InternalBiLang.g:5818:2: rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:5825:1: rule__RadarPlot__Group__1__Impl : ( ( rule__RadarPlot__NameAssignment_1 ) ) ;
    public final void rule__RadarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5829:1: ( ( ( rule__RadarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5830:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5830:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5831:2: ( rule__RadarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5832:2: ( rule__RadarPlot__NameAssignment_1 )
            // InternalBiLang.g:5832:3: rule__RadarPlot__NameAssignment_1
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
    // InternalBiLang.g:5840:1: rule__RadarPlot__Group__2 : rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 ;
    public final void rule__RadarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5844:1: ( rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 )
            // InternalBiLang.g:5845:2: rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:5852:1: rule__RadarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__RadarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5856:1: ( ( '->' ) )
            // InternalBiLang.g:5857:1: ( '->' )
            {
            // InternalBiLang.g:5857:1: ( '->' )
            // InternalBiLang.g:5858:2: '->'
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
    // InternalBiLang.g:5867:1: rule__RadarPlot__Group__3 : rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 ;
    public final void rule__RadarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5871:1: ( rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 )
            // InternalBiLang.g:5872:2: rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4
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
    // InternalBiLang.g:5879:1: rule__RadarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__RadarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5883:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5884:1: ( 'xAx' )
            {
            // InternalBiLang.g:5884:1: ( 'xAx' )
            // InternalBiLang.g:5885:2: 'xAx'
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
    // InternalBiLang.g:5894:1: rule__RadarPlot__Group__4 : rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 ;
    public final void rule__RadarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5898:1: ( rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 )
            // InternalBiLang.g:5899:2: rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:5906:1: rule__RadarPlot__Group__4__Impl : ( ( rule__RadarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__RadarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5910:1: ( ( ( rule__RadarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5911:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5911:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5912:2: ( rule__RadarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getRadarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5913:2: ( rule__RadarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5913:3: rule__RadarPlot__XAxisAssignment_4
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
    // InternalBiLang.g:5921:1: rule__RadarPlot__Group__5 : rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 ;
    public final void rule__RadarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5925:1: ( rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 )
            // InternalBiLang.g:5926:2: rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6
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
    // InternalBiLang.g:5933:1: rule__RadarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__RadarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5937:1: ( ( 'yA' ) )
            // InternalBiLang.g:5938:1: ( 'yA' )
            {
            // InternalBiLang.g:5938:1: ( 'yA' )
            // InternalBiLang.g:5939:2: 'yA'
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
    // InternalBiLang.g:5948:1: rule__RadarPlot__Group__6 : rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 ;
    public final void rule__RadarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5952:1: ( rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 )
            // InternalBiLang.g:5953:2: rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5960:1: rule__RadarPlot__Group__6__Impl : ( ( rule__RadarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__RadarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5964:1: ( ( ( rule__RadarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5965:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5965:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5966:2: ( rule__RadarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getRadarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5967:2: ( rule__RadarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5967:3: rule__RadarPlot__YAxisAssignment_6
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
    // InternalBiLang.g:5975:1: rule__RadarPlot__Group__7 : rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 ;
    public final void rule__RadarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5979:1: ( rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 )
            // InternalBiLang.g:5980:2: rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:5987:1: rule__RadarPlot__Group__7__Impl : ( ( rule__RadarPlot__Group_7__0 )? ) ;
    public final void rule__RadarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5991:1: ( ( ( rule__RadarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5992:1: ( ( rule__RadarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5992:1: ( ( rule__RadarPlot__Group_7__0 )? )
            // InternalBiLang.g:5993:2: ( rule__RadarPlot__Group_7__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5994:2: ( rule__RadarPlot__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:5994:3: rule__RadarPlot__Group_7__0
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
    // InternalBiLang.g:6002:1: rule__RadarPlot__Group__8 : rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 ;
    public final void rule__RadarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6006:1: ( rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 )
            // InternalBiLang.g:6007:2: rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:6014:1: rule__RadarPlot__Group__8__Impl : ( ( rule__RadarPlot__Group_8__0 )? ) ;
    public final void rule__RadarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6018:1: ( ( ( rule__RadarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:6019:1: ( ( rule__RadarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:6019:1: ( ( rule__RadarPlot__Group_8__0 )? )
            // InternalBiLang.g:6020:2: ( rule__RadarPlot__Group_8__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:6021:2: ( rule__RadarPlot__Group_8__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:6021:3: rule__RadarPlot__Group_8__0
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
    // InternalBiLang.g:6029:1: rule__RadarPlot__Group__9 : rule__RadarPlot__Group__9__Impl ;
    public final void rule__RadarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6033:1: ( rule__RadarPlot__Group__9__Impl )
            // InternalBiLang.g:6034:2: rule__RadarPlot__Group__9__Impl
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
    // InternalBiLang.g:6040:1: rule__RadarPlot__Group__9__Impl : ( ( rule__RadarPlot__Group_9__0 )? ) ;
    public final void rule__RadarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6044:1: ( ( ( rule__RadarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:6045:1: ( ( rule__RadarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:6045:1: ( ( rule__RadarPlot__Group_9__0 )? )
            // InternalBiLang.g:6046:2: ( rule__RadarPlot__Group_9__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:6047:2: ( rule__RadarPlot__Group_9__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBiLang.g:6047:3: rule__RadarPlot__Group_9__0
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
    // InternalBiLang.g:6056:1: rule__RadarPlot__Group_7__0 : rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 ;
    public final void rule__RadarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6060:1: ( rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 )
            // InternalBiLang.g:6061:2: rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:6068:1: rule__RadarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__RadarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6072:1: ( ( 'loc' ) )
            // InternalBiLang.g:6073:1: ( 'loc' )
            {
            // InternalBiLang.g:6073:1: ( 'loc' )
            // InternalBiLang.g:6074:2: 'loc'
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
    // InternalBiLang.g:6083:1: rule__RadarPlot__Group_7__1 : rule__RadarPlot__Group_7__1__Impl ;
    public final void rule__RadarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6087:1: ( rule__RadarPlot__Group_7__1__Impl )
            // InternalBiLang.g:6088:2: rule__RadarPlot__Group_7__1__Impl
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
    // InternalBiLang.g:6094:1: rule__RadarPlot__Group_7__1__Impl : ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__RadarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6098:1: ( ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:6099:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:6099:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:6100:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:6101:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:6101:3: rule__RadarPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:6110:1: rule__RadarPlot__Group_8__0 : rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 ;
    public final void rule__RadarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6114:1: ( rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 )
            // InternalBiLang.g:6115:2: rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1
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
    // InternalBiLang.g:6122:1: rule__RadarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__RadarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6126:1: ( ( 'colors' ) )
            // InternalBiLang.g:6127:1: ( 'colors' )
            {
            // InternalBiLang.g:6127:1: ( 'colors' )
            // InternalBiLang.g:6128:2: 'colors'
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
    // InternalBiLang.g:6137:1: rule__RadarPlot__Group_8__1 : rule__RadarPlot__Group_8__1__Impl ;
    public final void rule__RadarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6141:1: ( rule__RadarPlot__Group_8__1__Impl )
            // InternalBiLang.g:6142:2: rule__RadarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:6148:1: rule__RadarPlot__Group_8__1__Impl : ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__RadarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6152:1: ( ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:6153:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:6153:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:6154:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:6155:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:6155:3: rule__RadarPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:6164:1: rule__RadarPlot__Group_9__0 : rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 ;
    public final void rule__RadarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6168:1: ( rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 )
            // InternalBiLang.g:6169:2: rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:6176:1: rule__RadarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__RadarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6180:1: ( ( 'thickness' ) )
            // InternalBiLang.g:6181:1: ( 'thickness' )
            {
            // InternalBiLang.g:6181:1: ( 'thickness' )
            // InternalBiLang.g:6182:2: 'thickness'
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
    // InternalBiLang.g:6191:1: rule__RadarPlot__Group_9__1 : rule__RadarPlot__Group_9__1__Impl ;
    public final void rule__RadarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6195:1: ( rule__RadarPlot__Group_9__1__Impl )
            // InternalBiLang.g:6196:2: rule__RadarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:6202:1: rule__RadarPlot__Group_9__1__Impl : ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__RadarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6206:1: ( ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:6207:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:6207:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:6208:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:6209:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:6209:3: rule__RadarPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:6218:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6222:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6223:2: ( RULE_ID )
            {
            // InternalBiLang.g:6223:2: ( RULE_ID )
            // InternalBiLang.g:6224:3: RULE_ID
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
    // InternalBiLang.g:6233:1: rule__Task__FileextractorAssignment_4 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6237:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:6238:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:6238:2: ( ruleFileExtractor )
            // InternalBiLang.g:6239:3: ruleFileExtractor
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
    // InternalBiLang.g:6248:1: rule__Task__DatafilteringAssignment_5 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6252:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6253:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6253:2: ( ruleDataFiltering )
            // InternalBiLang.g:6254:3: ruleDataFiltering
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
    // InternalBiLang.g:6263:1: rule__Task__FileextractorAssignment_6_0 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6267:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:6268:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:6268:2: ( ruleFileExtractor )
            // InternalBiLang.g:6269:3: ruleFileExtractor
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
    // InternalBiLang.g:6278:1: rule__Task__DatafilteringAssignment_6_1 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6282:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6283:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6283:2: ( ruleDataFiltering )
            // InternalBiLang.g:6284:3: ruleDataFiltering
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
    // InternalBiLang.g:6293:1: rule__Task__DashboardAssignment_8 : ( ruleDashBoard ) ;
    public final void rule__Task__DashboardAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6297:1: ( ( ruleDashBoard ) )
            // InternalBiLang.g:6298:2: ( ruleDashBoard )
            {
            // InternalBiLang.g:6298:2: ( ruleDashBoard )
            // InternalBiLang.g:6299:3: ruleDashBoard
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
    // InternalBiLang.g:6308:1: rule__DataFiltering__FileextractorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__DataFiltering__FileextractorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6312:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6313:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6313:2: ( ( ruleEString ) )
            // InternalBiLang.g:6314:3: ( ruleEString )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0()); 
            // InternalBiLang.g:6315:3: ( ruleEString )
            // InternalBiLang.g:6316:4: ruleEString
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
    // InternalBiLang.g:6327:1: rule__DataFiltering__ProcessingstepAssignment_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6331:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6332:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6332:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6333:3: rulePreprocessingStep
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
    // InternalBiLang.g:6342:1: rule__DataFiltering__ProcessingstepAssignment_2_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6346:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6347:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6347:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6348:3: rulePreprocessingStep
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
    // InternalBiLang.g:6357:1: rule__DataFiltering__FilteringstepAssignment_3_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6361:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:6362:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:6362:2: ( ruleFilteringStep )
            // InternalBiLang.g:6363:3: ruleFilteringStep
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
    // InternalBiLang.g:6372:1: rule__DataFiltering__FilteringstepAssignment_3_2_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6376:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:6377:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:6377:2: ( ruleFilteringStep )
            // InternalBiLang.g:6378:3: ruleFilteringStep
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
    // InternalBiLang.g:6387:1: rule__DashBoard__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DashBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6391:1: ( ( ruleEString ) )
            // InternalBiLang.g:6392:2: ( ruleEString )
            {
            // InternalBiLang.g:6392:2: ( ruleEString )
            // InternalBiLang.g:6393:3: ruleEString
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


    // $ANTLR start "rule__DashBoard__FileextractorAssignment_2_0_1"
    // InternalBiLang.g:6402:1: rule__DashBoard__FileextractorAssignment_2_0_1 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__FileextractorAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6406:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6407:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6407:2: ( ( ruleEString ) )
            // InternalBiLang.g:6408:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_1_0()); 
            // InternalBiLang.g:6409:3: ( ruleEString )
            // InternalBiLang.g:6410:4: ruleEString
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorEStringParserRuleCall_2_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorEStringParserRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__FileextractorAssignment_2_0_1"


    // $ANTLR start "rule__DashBoard__DatafilteringAssignment_2_1_1"
    // InternalBiLang.g:6421:1: rule__DashBoard__DatafilteringAssignment_2_1_1 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__DatafilteringAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6425:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6426:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6426:2: ( ( ruleEString ) )
            // InternalBiLang.g:6427:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getDatafilteringDataFilteringCrossReference_2_1_1_0()); 
            // InternalBiLang.g:6428:3: ( ruleEString )
            // InternalBiLang.g:6429:4: ruleEString
            {
             before(grammarAccess.getDashBoardAccess().getDatafilteringDataFilteringEStringParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDashBoardAccess().getDatafilteringDataFilteringEStringParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getDashBoardAccess().getDatafilteringDataFilteringCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashBoard__DatafilteringAssignment_2_1_1"


    // $ANTLR start "rule__DashBoard__PlotAssignment_5"
    // InternalBiLang.g:6440:1: rule__DashBoard__PlotAssignment_5 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6444:1: ( ( rulePlot ) )
            // InternalBiLang.g:6445:2: ( rulePlot )
            {
            // InternalBiLang.g:6445:2: ( rulePlot )
            // InternalBiLang.g:6446:3: rulePlot
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
    // InternalBiLang.g:6455:1: rule__DashBoard__PlotAssignment_6 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6459:1: ( ( rulePlot ) )
            // InternalBiLang.g:6460:2: ( rulePlot )
            {
            // InternalBiLang.g:6460:2: ( rulePlot )
            // InternalBiLang.g:6461:3: rulePlot
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
    // InternalBiLang.g:6470:1: rule__CsvExtractor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CsvExtractor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6474:1: ( ( ruleEString ) )
            // InternalBiLang.g:6475:2: ( ruleEString )
            {
            // InternalBiLang.g:6475:2: ( ruleEString )
            // InternalBiLang.g:6476:3: ruleEString
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
    // InternalBiLang.g:6485:1: rule__CsvExtractor__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__CsvExtractor__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6489:1: ( ( ruleEString ) )
            // InternalBiLang.g:6490:2: ( ruleEString )
            {
            // InternalBiLang.g:6490:2: ( ruleEString )
            // InternalBiLang.g:6491:3: ruleEString
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


    // $ANTLR start "rule__ExcelExtractor__NameAssignment_1"
    // InternalBiLang.g:6500:1: rule__ExcelExtractor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExcelExtractor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6504:1: ( ( ruleEString ) )
            // InternalBiLang.g:6505:2: ( ruleEString )
            {
            // InternalBiLang.g:6505:2: ( ruleEString )
            // InternalBiLang.g:6506:3: ruleEString
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
    // InternalBiLang.g:6515:1: rule__ExcelExtractor__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__ExcelExtractor__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6519:1: ( ( ruleEString ) )
            // InternalBiLang.g:6520:2: ( ruleEString )
            {
            // InternalBiLang.g:6520:2: ( ruleEString )
            // InternalBiLang.g:6521:3: ruleEString
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


    // $ANTLR start "rule__QuantitativeFiltering__AxisAssignment_1"
    // InternalBiLang.g:6530:1: rule__QuantitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QuantitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6534:1: ( ( ruleEString ) )
            // InternalBiLang.g:6535:2: ( ruleEString )
            {
            // InternalBiLang.g:6535:2: ( ruleEString )
            // InternalBiLang.g:6536:3: ruleEString
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
    // InternalBiLang.g:6545:1: rule__QuantitativeFiltering__OperatorAssignment_2 : ( ruleQuantitativeOperator ) ;
    public final void rule__QuantitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6549:1: ( ( ruleQuantitativeOperator ) )
            // InternalBiLang.g:6550:2: ( ruleQuantitativeOperator )
            {
            // InternalBiLang.g:6550:2: ( ruleQuantitativeOperator )
            // InternalBiLang.g:6551:3: ruleQuantitativeOperator
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
    // InternalBiLang.g:6560:1: rule__QuantitativeFiltering__ValuesAssignment_3 : ( ruleEFloat ) ;
    public final void rule__QuantitativeFiltering__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6564:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6565:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6565:2: ( ruleEFloat )
            // InternalBiLang.g:6566:3: ruleEFloat
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
    // InternalBiLang.g:6575:1: rule__QualitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6579:1: ( ( ruleEString ) )
            // InternalBiLang.g:6580:2: ( ruleEString )
            {
            // InternalBiLang.g:6580:2: ( ruleEString )
            // InternalBiLang.g:6581:3: ruleEString
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
    // InternalBiLang.g:6590:1: rule__QualitativeFiltering__OperatorAssignment_2 : ( ruleQualitativeOperator ) ;
    public final void rule__QualitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6594:1: ( ( ruleQualitativeOperator ) )
            // InternalBiLang.g:6595:2: ( ruleQualitativeOperator )
            {
            // InternalBiLang.g:6595:2: ( ruleQualitativeOperator )
            // InternalBiLang.g:6596:3: ruleQualitativeOperator
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
    // InternalBiLang.g:6605:1: rule__QualitativeFiltering__LabelsAssignment_3 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__LabelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6609:1: ( ( ruleEString ) )
            // InternalBiLang.g:6610:2: ( ruleEString )
            {
            // InternalBiLang.g:6610:2: ( ruleEString )
            // InternalBiLang.g:6611:3: ruleEString
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
    // InternalBiLang.g:6620:1: rule__MathOperation__LsideAssignment_2 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__LsideAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6624:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6625:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6625:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6626:3: rulePreprocessingStep
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
    // InternalBiLang.g:6635:1: rule__MathOperation__OperatorAssignment_3 : ( ruleMathOperator ) ;
    public final void rule__MathOperation__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6639:1: ( ( ruleMathOperator ) )
            // InternalBiLang.g:6640:2: ( ruleMathOperator )
            {
            // InternalBiLang.g:6640:2: ( ruleMathOperator )
            // InternalBiLang.g:6641:3: ruleMathOperator
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
    // InternalBiLang.g:6650:1: rule__MathOperation__RsideAssignment_5 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__RsideAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6654:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6655:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6655:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6656:3: rulePreprocessingStep
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
    // InternalBiLang.g:6665:1: rule__ColReference__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__ColReference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6669:1: ( ( ruleEString ) )
            // InternalBiLang.g:6670:2: ( ruleEString )
            {
            // InternalBiLang.g:6670:2: ( ruleEString )
            // InternalBiLang.g:6671:3: ruleEString
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
    // InternalBiLang.g:6680:1: rule__StatisticalOperation__OperatorAssignment_0 : ( ruleStatisticalOperator ) ;
    public final void rule__StatisticalOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6684:1: ( ( ruleStatisticalOperator ) )
            // InternalBiLang.g:6685:2: ( ruleStatisticalOperator )
            {
            // InternalBiLang.g:6685:2: ( ruleStatisticalOperator )
            // InternalBiLang.g:6686:3: ruleStatisticalOperator
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
    // InternalBiLang.g:6695:1: rule__StatisticalOperation__ColreferenceAssignment_2 : ( ruleColReference ) ;
    public final void rule__StatisticalOperation__ColreferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6699:1: ( ( ruleColReference ) )
            // InternalBiLang.g:6700:2: ( ruleColReference )
            {
            // InternalBiLang.g:6700:2: ( ruleColReference )
            // InternalBiLang.g:6701:3: ruleColReference
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
    // InternalBiLang.g:6710:1: rule__BarPlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BarPlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6714:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6715:2: ( RULE_ID )
            {
            // InternalBiLang.g:6715:2: ( RULE_ID )
            // InternalBiLang.g:6716:3: RULE_ID
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
    // InternalBiLang.g:6725:1: rule__BarPlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__BarPlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6729:1: ( ( ruleEString ) )
            // InternalBiLang.g:6730:2: ( ruleEString )
            {
            // InternalBiLang.g:6730:2: ( ruleEString )
            // InternalBiLang.g:6731:3: ruleEString
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
    // InternalBiLang.g:6740:1: rule__BarPlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__BarPlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6744:1: ( ( ruleEString ) )
            // InternalBiLang.g:6745:2: ( ruleEString )
            {
            // InternalBiLang.g:6745:2: ( ruleEString )
            // InternalBiLang.g:6746:3: ruleEString
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
    // InternalBiLang.g:6755:1: rule__BarPlot__LocationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__BarPlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6759:1: ( ( ruleEInt ) )
            // InternalBiLang.g:6760:2: ( ruleEInt )
            {
            // InternalBiLang.g:6760:2: ( ruleEInt )
            // InternalBiLang.g:6761:3: ruleEInt
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
    // InternalBiLang.g:6770:1: rule__BarPlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarPlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6774:1: ( ( ruleEString ) )
            // InternalBiLang.g:6775:2: ( ruleEString )
            {
            // InternalBiLang.g:6775:2: ( ruleEString )
            // InternalBiLang.g:6776:3: ruleEString
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
    // InternalBiLang.g:6785:1: rule__BarPlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__BarPlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6789:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6790:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6790:2: ( ruleEFloat )
            // InternalBiLang.g:6791:3: ruleEFloat
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
    // InternalBiLang.g:6800:1: rule__LinePlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinePlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6804:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6805:2: ( RULE_ID )
            {
            // InternalBiLang.g:6805:2: ( RULE_ID )
            // InternalBiLang.g:6806:3: RULE_ID
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
    // InternalBiLang.g:6815:1: rule__LinePlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__LinePlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6819:1: ( ( ruleEString ) )
            // InternalBiLang.g:6820:2: ( ruleEString )
            {
            // InternalBiLang.g:6820:2: ( ruleEString )
            // InternalBiLang.g:6821:3: ruleEString
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
    // InternalBiLang.g:6830:1: rule__LinePlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__LinePlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6834:1: ( ( ruleEString ) )
            // InternalBiLang.g:6835:2: ( ruleEString )
            {
            // InternalBiLang.g:6835:2: ( ruleEString )
            // InternalBiLang.g:6836:3: ruleEString
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
    // InternalBiLang.g:6845:1: rule__LinePlot__LocationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__LinePlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6849:1: ( ( ruleEInt ) )
            // InternalBiLang.g:6850:2: ( ruleEInt )
            {
            // InternalBiLang.g:6850:2: ( ruleEInt )
            // InternalBiLang.g:6851:3: ruleEInt
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
    // InternalBiLang.g:6860:1: rule__LinePlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LinePlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6864:1: ( ( ruleEString ) )
            // InternalBiLang.g:6865:2: ( ruleEString )
            {
            // InternalBiLang.g:6865:2: ( ruleEString )
            // InternalBiLang.g:6866:3: ruleEString
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
    // InternalBiLang.g:6875:1: rule__LinePlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__LinePlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6879:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6880:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6880:2: ( ruleEFloat )
            // InternalBiLang.g:6881:3: ruleEFloat
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
    // InternalBiLang.g:6890:1: rule__DonutPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DonutPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6894:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6895:2: ( RULE_ID )
            {
            // InternalBiLang.g:6895:2: ( RULE_ID )
            // InternalBiLang.g:6896:3: RULE_ID
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
    // InternalBiLang.g:6905:1: rule__DonutPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__DonutPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6909:1: ( ( ruleEString ) )
            // InternalBiLang.g:6910:2: ( ruleEString )
            {
            // InternalBiLang.g:6910:2: ( ruleEString )
            // InternalBiLang.g:6911:3: ruleEString
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
    // InternalBiLang.g:6920:1: rule__DonutPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__DonutPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6924:1: ( ( ruleEString ) )
            // InternalBiLang.g:6925:2: ( ruleEString )
            {
            // InternalBiLang.g:6925:2: ( ruleEString )
            // InternalBiLang.g:6926:3: ruleEString
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
    // InternalBiLang.g:6935:1: rule__DonutPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__DonutPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6939:1: ( ( ruleEInt ) )
            // InternalBiLang.g:6940:2: ( ruleEInt )
            {
            // InternalBiLang.g:6940:2: ( ruleEInt )
            // InternalBiLang.g:6941:3: ruleEInt
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
    // InternalBiLang.g:6950:1: rule__DonutPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__DonutPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6954:1: ( ( ruleEString ) )
            // InternalBiLang.g:6955:2: ( ruleEString )
            {
            // InternalBiLang.g:6955:2: ( ruleEString )
            // InternalBiLang.g:6956:3: ruleEString
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
    // InternalBiLang.g:6965:1: rule__DonutPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__DonutPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6969:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6970:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6970:2: ( ruleEFloat )
            // InternalBiLang.g:6971:3: ruleEFloat
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
    // InternalBiLang.g:6980:1: rule__PiePlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PiePlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6984:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6985:2: ( RULE_ID )
            {
            // InternalBiLang.g:6985:2: ( RULE_ID )
            // InternalBiLang.g:6986:3: RULE_ID
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
    // InternalBiLang.g:6995:1: rule__PiePlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PiePlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6999:1: ( ( ruleEString ) )
            // InternalBiLang.g:7000:2: ( ruleEString )
            {
            // InternalBiLang.g:7000:2: ( ruleEString )
            // InternalBiLang.g:7001:3: ruleEString
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
    // InternalBiLang.g:7010:1: rule__PiePlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PiePlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7014:1: ( ( ruleEString ) )
            // InternalBiLang.g:7015:2: ( ruleEString )
            {
            // InternalBiLang.g:7015:2: ( ruleEString )
            // InternalBiLang.g:7016:3: ruleEString
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
    // InternalBiLang.g:7025:1: rule__PiePlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__PiePlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7029:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7030:2: ( ruleEInt )
            {
            // InternalBiLang.g:7030:2: ( ruleEInt )
            // InternalBiLang.g:7031:3: ruleEInt
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
    // InternalBiLang.g:7040:1: rule__PiePlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PiePlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7044:1: ( ( ruleEString ) )
            // InternalBiLang.g:7045:2: ( ruleEString )
            {
            // InternalBiLang.g:7045:2: ( ruleEString )
            // InternalBiLang.g:7046:3: ruleEString
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
    // InternalBiLang.g:7055:1: rule__PiePlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PiePlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7059:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7060:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7060:2: ( ruleEFloat )
            // InternalBiLang.g:7061:3: ruleEFloat
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
    // InternalBiLang.g:7070:1: rule__PolarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PolarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7074:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7075:2: ( RULE_ID )
            {
            // InternalBiLang.g:7075:2: ( RULE_ID )
            // InternalBiLang.g:7076:3: RULE_ID
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
    // InternalBiLang.g:7085:1: rule__PolarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PolarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7089:1: ( ( ruleEString ) )
            // InternalBiLang.g:7090:2: ( ruleEString )
            {
            // InternalBiLang.g:7090:2: ( ruleEString )
            // InternalBiLang.g:7091:3: ruleEString
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
    // InternalBiLang.g:7100:1: rule__PolarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PolarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7104:1: ( ( ruleEString ) )
            // InternalBiLang.g:7105:2: ( ruleEString )
            {
            // InternalBiLang.g:7105:2: ( ruleEString )
            // InternalBiLang.g:7106:3: ruleEString
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
    // InternalBiLang.g:7115:1: rule__PolarPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__PolarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7119:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7120:2: ( ruleEInt )
            {
            // InternalBiLang.g:7120:2: ( ruleEInt )
            // InternalBiLang.g:7121:3: ruleEInt
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
    // InternalBiLang.g:7130:1: rule__PolarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PolarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7134:1: ( ( ruleEString ) )
            // InternalBiLang.g:7135:2: ( ruleEString )
            {
            // InternalBiLang.g:7135:2: ( ruleEString )
            // InternalBiLang.g:7136:3: ruleEString
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
    // InternalBiLang.g:7145:1: rule__PolarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PolarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7149:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7150:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7150:2: ( ruleEFloat )
            // InternalBiLang.g:7151:3: ruleEFloat
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
    // InternalBiLang.g:7160:1: rule__ScatterPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScatterPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7164:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7165:2: ( RULE_ID )
            {
            // InternalBiLang.g:7165:2: ( RULE_ID )
            // InternalBiLang.g:7166:3: RULE_ID
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
    // InternalBiLang.g:7175:1: rule__ScatterPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__ScatterPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7179:1: ( ( ruleEString ) )
            // InternalBiLang.g:7180:2: ( ruleEString )
            {
            // InternalBiLang.g:7180:2: ( ruleEString )
            // InternalBiLang.g:7181:3: ruleEString
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
    // InternalBiLang.g:7190:1: rule__ScatterPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__ScatterPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7194:1: ( ( ruleEString ) )
            // InternalBiLang.g:7195:2: ( ruleEString )
            {
            // InternalBiLang.g:7195:2: ( ruleEString )
            // InternalBiLang.g:7196:3: ruleEString
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
    // InternalBiLang.g:7205:1: rule__ScatterPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__ScatterPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7209:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7210:2: ( ruleEInt )
            {
            // InternalBiLang.g:7210:2: ( ruleEInt )
            // InternalBiLang.g:7211:3: ruleEInt
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
    // InternalBiLang.g:7220:1: rule__ScatterPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ScatterPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7224:1: ( ( ruleEString ) )
            // InternalBiLang.g:7225:2: ( ruleEString )
            {
            // InternalBiLang.g:7225:2: ( ruleEString )
            // InternalBiLang.g:7226:3: ruleEString
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
    // InternalBiLang.g:7235:1: rule__ScatterPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__ScatterPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7239:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7240:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7240:2: ( ruleEFloat )
            // InternalBiLang.g:7241:3: ruleEFloat
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
    // InternalBiLang.g:7250:1: rule__RadarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RadarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7254:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7255:2: ( RULE_ID )
            {
            // InternalBiLang.g:7255:2: ( RULE_ID )
            // InternalBiLang.g:7256:3: RULE_ID
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
    // InternalBiLang.g:7265:1: rule__RadarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__RadarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7269:1: ( ( ruleEString ) )
            // InternalBiLang.g:7270:2: ( ruleEString )
            {
            // InternalBiLang.g:7270:2: ( ruleEString )
            // InternalBiLang.g:7271:3: ruleEString
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
    // InternalBiLang.g:7280:1: rule__RadarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__RadarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7284:1: ( ( ruleEString ) )
            // InternalBiLang.g:7285:2: ( ruleEString )
            {
            // InternalBiLang.g:7285:2: ( ruleEString )
            // InternalBiLang.g:7286:3: ruleEString
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
    // InternalBiLang.g:7295:1: rule__RadarPlot__LocationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__RadarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7299:1: ( ( ruleEInt ) )
            // InternalBiLang.g:7300:2: ( ruleEInt )
            {
            // InternalBiLang.g:7300:2: ( ruleEInt )
            // InternalBiLang.g:7301:3: ruleEInt
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
    // InternalBiLang.g:7310:1: rule__RadarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__RadarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7314:1: ( ( ruleEString ) )
            // InternalBiLang.g:7315:2: ( ruleEString )
            {
            // InternalBiLang.g:7315:2: ( ruleEString )
            // InternalBiLang.g:7316:3: ruleEString
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
    // InternalBiLang.g:7325:1: rule__RadarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__RadarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7329:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7330:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7330:2: ( ruleEFloat )
            // InternalBiLang.g:7331:3: ruleEFloat
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x03F0200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x03F0201000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x03F0200000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000004040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});

}