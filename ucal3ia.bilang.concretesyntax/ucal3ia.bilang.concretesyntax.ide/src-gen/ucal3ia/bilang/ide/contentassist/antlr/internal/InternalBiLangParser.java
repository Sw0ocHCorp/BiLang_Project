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


    // $ANTLR start "rule__FileExtractor__Alternatives"
    // InternalBiLang.g:691:1: rule__FileExtractor__Alternatives : ( ( ruleCsvExtractor ) | ( ruleExcelExtractor ) );
    public final void rule__FileExtractor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:695:1: ( ( ruleCsvExtractor ) | ( ruleExcelExtractor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==39) ) {
                    alt1=2;
                }
                else if ( (LA1_1==38) ) {
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
                    // InternalBiLang.g:696:2: ( ruleCsvExtractor )
                    {
                    // InternalBiLang.g:696:2: ( ruleCsvExtractor )
                    // InternalBiLang.g:697:3: ruleCsvExtractor
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
                    // InternalBiLang.g:702:2: ( ruleExcelExtractor )
                    {
                    // InternalBiLang.g:702:2: ( ruleExcelExtractor )
                    // InternalBiLang.g:703:3: ruleExcelExtractor
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
    // InternalBiLang.g:712:1: rule__FilteringStep__Alternatives : ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) );
    public final void rule__FilteringStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:716:1: ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) )
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
                    // InternalBiLang.g:717:2: ( ruleQuantitativeFiltering )
                    {
                    // InternalBiLang.g:717:2: ( ruleQuantitativeFiltering )
                    // InternalBiLang.g:718:3: ruleQuantitativeFiltering
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
                    // InternalBiLang.g:723:2: ( ruleQualitativeFiltering )
                    {
                    // InternalBiLang.g:723:2: ( ruleQualitativeFiltering )
                    // InternalBiLang.g:724:3: ruleQualitativeFiltering
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
    // InternalBiLang.g:733:1: rule__PreprocessingStep__Alternatives : ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) );
    public final void rule__PreprocessingStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:737:1: ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) )
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
                    // InternalBiLang.g:738:2: ( ruleMathOperation )
                    {
                    // InternalBiLang.g:738:2: ( ruleMathOperation )
                    // InternalBiLang.g:739:3: ruleMathOperation
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
                    // InternalBiLang.g:744:2: ( ruleColReference )
                    {
                    // InternalBiLang.g:744:2: ( ruleColReference )
                    // InternalBiLang.g:745:3: ruleColReference
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
                    // InternalBiLang.g:750:2: ( ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:750:2: ( ruleStatisticalOperation )
                    // InternalBiLang.g:751:3: ruleStatisticalOperation
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
    // InternalBiLang.g:760:1: rule__Plot__Alternatives : ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) );
    public final void rule__Plot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:764:1: ( ( ruleBarPlot ) | ( ruleLinePlot ) | ( ruleDonutPlot ) | ( ruleScatterPlot ) | ( rulePolarPlot ) | ( ruleRadarPlot ) | ( rulePiePlot ) )
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
                    // InternalBiLang.g:765:2: ( ruleBarPlot )
                    {
                    // InternalBiLang.g:765:2: ( ruleBarPlot )
                    // InternalBiLang.g:766:3: ruleBarPlot
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
                    // InternalBiLang.g:771:2: ( ruleLinePlot )
                    {
                    // InternalBiLang.g:771:2: ( ruleLinePlot )
                    // InternalBiLang.g:772:3: ruleLinePlot
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
                    // InternalBiLang.g:777:2: ( ruleDonutPlot )
                    {
                    // InternalBiLang.g:777:2: ( ruleDonutPlot )
                    // InternalBiLang.g:778:3: ruleDonutPlot
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
                    // InternalBiLang.g:783:2: ( ruleScatterPlot )
                    {
                    // InternalBiLang.g:783:2: ( ruleScatterPlot )
                    // InternalBiLang.g:784:3: ruleScatterPlot
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
                    // InternalBiLang.g:789:2: ( rulePolarPlot )
                    {
                    // InternalBiLang.g:789:2: ( rulePolarPlot )
                    // InternalBiLang.g:790:3: rulePolarPlot
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
                    // InternalBiLang.g:795:2: ( ruleRadarPlot )
                    {
                    // InternalBiLang.g:795:2: ( ruleRadarPlot )
                    // InternalBiLang.g:796:3: ruleRadarPlot
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
                    // InternalBiLang.g:801:2: ( rulePiePlot )
                    {
                    // InternalBiLang.g:801:2: ( rulePiePlot )
                    // InternalBiLang.g:802:3: rulePiePlot
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
    // InternalBiLang.g:811:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:815:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBiLang.g:816:2: ( RULE_STRING )
                    {
                    // InternalBiLang.g:816:2: ( RULE_STRING )
                    // InternalBiLang.g:817:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:822:2: ( RULE_ID )
                    {
                    // InternalBiLang.g:822:2: ( RULE_ID )
                    // InternalBiLang.g:823:3: RULE_ID
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
    // InternalBiLang.g:832:1: rule__DashBoard__Alternatives_2 : ( ( ( rule__DashBoard__Group_2_0__0 ) ) | ( ( rule__DashBoard__Group_2_1__0 ) ) );
    public final void rule__DashBoard__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:836:1: ( ( ( rule__DashBoard__Group_2_0__0 ) ) | ( ( rule__DashBoard__Group_2_1__0 ) ) )
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
                    // InternalBiLang.g:837:2: ( ( rule__DashBoard__Group_2_0__0 ) )
                    {
                    // InternalBiLang.g:837:2: ( ( rule__DashBoard__Group_2_0__0 ) )
                    // InternalBiLang.g:838:3: ( rule__DashBoard__Group_2_0__0 )
                    {
                     before(grammarAccess.getDashBoardAccess().getGroup_2_0()); 
                    // InternalBiLang.g:839:3: ( rule__DashBoard__Group_2_0__0 )
                    // InternalBiLang.g:839:4: rule__DashBoard__Group_2_0__0
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
                    // InternalBiLang.g:843:2: ( ( rule__DashBoard__Group_2_1__0 ) )
                    {
                    // InternalBiLang.g:843:2: ( ( rule__DashBoard__Group_2_1__0 ) )
                    // InternalBiLang.g:844:3: ( rule__DashBoard__Group_2_1__0 )
                    {
                     before(grammarAccess.getDashBoardAccess().getGroup_2_1()); 
                    // InternalBiLang.g:845:3: ( rule__DashBoard__Group_2_1__0 )
                    // InternalBiLang.g:845:4: rule__DashBoard__Group_2_1__0
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
    // InternalBiLang.g:853:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:857:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalBiLang.g:858:2: ( 'E' )
                    {
                    // InternalBiLang.g:858:2: ( 'E' )
                    // InternalBiLang.g:859:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:864:2: ( 'e' )
                    {
                    // InternalBiLang.g:864:2: ( 'e' )
                    // InternalBiLang.g:865:3: 'e'
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
    // InternalBiLang.g:874:1: rule__MathOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:878:1: ( ( ( '+' ) ) | ( ( '-' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
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
                    // InternalBiLang.g:879:2: ( ( '+' ) )
                    {
                    // InternalBiLang.g:879:2: ( ( '+' ) )
                    // InternalBiLang.g:880:3: ( '+' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:881:3: ( '+' )
                    // InternalBiLang.g:881:4: '+'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:885:2: ( ( '-' ) )
                    {
                    // InternalBiLang.g:885:2: ( ( '-' ) )
                    // InternalBiLang.g:886:3: ( '-' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:887:3: ( '-' )
                    // InternalBiLang.g:887:4: '-'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:891:2: ( ( '*' ) )
                    {
                    // InternalBiLang.g:891:2: ( ( '*' ) )
                    // InternalBiLang.g:892:3: ( '*' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:893:3: ( '*' )
                    // InternalBiLang.g:893:4: '*'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:897:2: ( ( '/' ) )
                    {
                    // InternalBiLang.g:897:2: ( ( '/' ) )
                    // InternalBiLang.g:898:3: ( '/' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3()); 
                    // InternalBiLang.g:899:3: ( '/' )
                    // InternalBiLang.g:899:4: '/'
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
    // InternalBiLang.g:907:1: rule__StatisticalOperator__Alternatives : ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) );
    public final void rule__StatisticalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:911:1: ( ( ( 'mean' ) ) | ( ( 'median' ) ) | ( ( 'std' ) ) )
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
                    // InternalBiLang.g:912:2: ( ( 'mean' ) )
                    {
                    // InternalBiLang.g:912:2: ( ( 'mean' ) )
                    // InternalBiLang.g:913:3: ( 'mean' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:914:3: ( 'mean' )
                    // InternalBiLang.g:914:4: 'mean'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:918:2: ( ( 'median' ) )
                    {
                    // InternalBiLang.g:918:2: ( ( 'median' ) )
                    // InternalBiLang.g:919:3: ( 'median' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:920:3: ( 'median' )
                    // InternalBiLang.g:920:4: 'median'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:924:2: ( ( 'std' ) )
                    {
                    // InternalBiLang.g:924:2: ( ( 'std' ) )
                    // InternalBiLang.g:925:3: ( 'std' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:926:3: ( 'std' )
                    // InternalBiLang.g:926:4: 'std'
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
    // InternalBiLang.g:934:1: rule__QualitativeOperator__Alternatives : ( ( ( '= ' ) ) | ( ( '!= ' ) ) );
    public final void rule__QualitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:938:1: ( ( ( '= ' ) ) | ( ( '!= ' ) ) )
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
                    // InternalBiLang.g:939:2: ( ( '= ' ) )
                    {
                    // InternalBiLang.g:939:2: ( ( '= ' ) )
                    // InternalBiLang.g:940:3: ( '= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:941:3: ( '= ' )
                    // InternalBiLang.g:941:4: '= '
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:945:2: ( ( '!= ' ) )
                    {
                    // InternalBiLang.g:945:2: ( ( '!= ' ) )
                    // InternalBiLang.g:946:3: ( '!= ' )
                    {
                     before(grammarAccess.getQualitativeOperatorAccess().getNOTEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:947:3: ( '!= ' )
                    // InternalBiLang.g:947:4: '!= '
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
    // InternalBiLang.g:955:1: rule__QuantitativeOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) );
    public final void rule__QuantitativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:959:1: ( ( ( '=' ) ) | ( ( '<' ) ) | ( ( '>' ) ) )
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
                    // InternalBiLang.g:960:2: ( ( '=' ) )
                    {
                    // InternalBiLang.g:960:2: ( ( '=' ) )
                    // InternalBiLang.g:961:3: ( '=' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:962:3: ( '=' )
                    // InternalBiLang.g:962:4: '='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:966:2: ( ( '<' ) )
                    {
                    // InternalBiLang.g:966:2: ( ( '<' ) )
                    // InternalBiLang.g:967:3: ( '<' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:968:3: ( '<' )
                    // InternalBiLang.g:968:4: '<'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:972:2: ( ( '>' ) )
                    {
                    // InternalBiLang.g:972:2: ( ( '>' ) )
                    // InternalBiLang.g:973:3: ( '>' )
                    {
                     before(grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:974:3: ( '>' )
                    // InternalBiLang.g:974:4: '>'
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
    // InternalBiLang.g:982:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:986:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBiLang.g:987:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalBiLang.g:994:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:998:1: ( ( 'Task' ) )
            // InternalBiLang.g:999:1: ( 'Task' )
            {
            // InternalBiLang.g:999:1: ( 'Task' )
            // InternalBiLang.g:1000:2: 'Task'
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
    // InternalBiLang.g:1009:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1013:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBiLang.g:1014:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalBiLang.g:1021:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1025:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBiLang.g:1026:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1026:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBiLang.g:1027:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1028:2: ( rule__Task__NameAssignment_1 )
            // InternalBiLang.g:1028:3: rule__Task__NameAssignment_1
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
    // InternalBiLang.g:1036:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1040:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalBiLang.g:1041:2: rule__Task__Group__2__Impl rule__Task__Group__3
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
    // InternalBiLang.g:1048:1: rule__Task__Group__2__Impl : ( ':' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1052:1: ( ( ':' ) )
            // InternalBiLang.g:1053:1: ( ':' )
            {
            // InternalBiLang.g:1053:1: ( ':' )
            // InternalBiLang.g:1054:2: ':'
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
    // InternalBiLang.g:1063:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1067:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalBiLang.g:1068:2: rule__Task__Group__3__Impl rule__Task__Group__4
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
    // InternalBiLang.g:1075:1: rule__Task__Group__3__Impl : ( 'load' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1079:1: ( ( 'load' ) )
            // InternalBiLang.g:1080:1: ( 'load' )
            {
            // InternalBiLang.g:1080:1: ( 'load' )
            // InternalBiLang.g:1081:2: 'load'
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
    // InternalBiLang.g:1090:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1094:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalBiLang.g:1095:2: rule__Task__Group__4__Impl rule__Task__Group__5
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
    // InternalBiLang.g:1102:1: rule__Task__Group__4__Impl : ( ( rule__Task__FileextractorAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1106:1: ( ( ( rule__Task__FileextractorAssignment_4 ) ) )
            // InternalBiLang.g:1107:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            {
            // InternalBiLang.g:1107:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            // InternalBiLang.g:1108:2: ( rule__Task__FileextractorAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_4()); 
            // InternalBiLang.g:1109:2: ( rule__Task__FileextractorAssignment_4 )
            // InternalBiLang.g:1109:3: rule__Task__FileextractorAssignment_4
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
    // InternalBiLang.g:1117:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1121:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalBiLang.g:1122:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalBiLang.g:1129:1: rule__Task__Group__5__Impl : ( ( rule__Task__DatafilteringAssignment_5 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1133:1: ( ( ( rule__Task__DatafilteringAssignment_5 )? ) )
            // InternalBiLang.g:1134:1: ( ( rule__Task__DatafilteringAssignment_5 )? )
            {
            // InternalBiLang.g:1134:1: ( ( rule__Task__DatafilteringAssignment_5 )? )
            // InternalBiLang.g:1135:2: ( rule__Task__DatafilteringAssignment_5 )?
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_5()); 
            // InternalBiLang.g:1136:2: ( rule__Task__DatafilteringAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBiLang.g:1136:3: rule__Task__DatafilteringAssignment_5
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
    // InternalBiLang.g:1144:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1148:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalBiLang.g:1149:2: rule__Task__Group__6__Impl rule__Task__Group__7
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
    // InternalBiLang.g:1156:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )* ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1160:1: ( ( ( rule__Task__Group_6__0 )* ) )
            // InternalBiLang.g:1161:1: ( ( rule__Task__Group_6__0 )* )
            {
            // InternalBiLang.g:1161:1: ( ( rule__Task__Group_6__0 )* )
            // InternalBiLang.g:1162:2: ( rule__Task__Group_6__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalBiLang.g:1163:2: ( rule__Task__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBiLang.g:1163:3: rule__Task__Group_6__0
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
    // InternalBiLang.g:1171:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1175:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalBiLang.g:1176:2: rule__Task__Group__7__Impl rule__Task__Group__8
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
    // InternalBiLang.g:1183:1: rule__Task__Group__7__Impl : ( '[dashboard:' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1187:1: ( ( '[dashboard:' ) )
            // InternalBiLang.g:1188:1: ( '[dashboard:' )
            {
            // InternalBiLang.g:1188:1: ( '[dashboard:' )
            // InternalBiLang.g:1189:2: '[dashboard:'
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
    // InternalBiLang.g:1198:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1202:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalBiLang.g:1203:2: rule__Task__Group__8__Impl rule__Task__Group__9
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
    // InternalBiLang.g:1210:1: rule__Task__Group__8__Impl : ( ( rule__Task__DashboardAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1214:1: ( ( ( rule__Task__DashboardAssignment_8 ) ) )
            // InternalBiLang.g:1215:1: ( ( rule__Task__DashboardAssignment_8 ) )
            {
            // InternalBiLang.g:1215:1: ( ( rule__Task__DashboardAssignment_8 ) )
            // InternalBiLang.g:1216:2: ( rule__Task__DashboardAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getDashboardAssignment_8()); 
            // InternalBiLang.g:1217:2: ( rule__Task__DashboardAssignment_8 )
            // InternalBiLang.g:1217:3: rule__Task__DashboardAssignment_8
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
    // InternalBiLang.g:1225:1: rule__Task__Group__9 : rule__Task__Group__9__Impl ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1229:1: ( rule__Task__Group__9__Impl )
            // InternalBiLang.g:1230:2: rule__Task__Group__9__Impl
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
    // InternalBiLang.g:1236:1: rule__Task__Group__9__Impl : ( ']' ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1240:1: ( ( ']' ) )
            // InternalBiLang.g:1241:1: ( ']' )
            {
            // InternalBiLang.g:1241:1: ( ']' )
            // InternalBiLang.g:1242:2: ']'
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
    // InternalBiLang.g:1252:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1256:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalBiLang.g:1257:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
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
    // InternalBiLang.g:1264:1: rule__Task__Group_6__0__Impl : ( ( rule__Task__FileextractorAssignment_6_0 ) ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1268:1: ( ( ( rule__Task__FileextractorAssignment_6_0 ) ) )
            // InternalBiLang.g:1269:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            {
            // InternalBiLang.g:1269:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            // InternalBiLang.g:1270:2: ( rule__Task__FileextractorAssignment_6_0 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0()); 
            // InternalBiLang.g:1271:2: ( rule__Task__FileextractorAssignment_6_0 )
            // InternalBiLang.g:1271:3: rule__Task__FileextractorAssignment_6_0
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
    // InternalBiLang.g:1279:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1283:1: ( rule__Task__Group_6__1__Impl )
            // InternalBiLang.g:1284:2: rule__Task__Group_6__1__Impl
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
    // InternalBiLang.g:1290:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DatafilteringAssignment_6_1 )? ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1294:1: ( ( ( rule__Task__DatafilteringAssignment_6_1 )? ) )
            // InternalBiLang.g:1295:1: ( ( rule__Task__DatafilteringAssignment_6_1 )? )
            {
            // InternalBiLang.g:1295:1: ( ( rule__Task__DatafilteringAssignment_6_1 )? )
            // InternalBiLang.g:1296:2: ( rule__Task__DatafilteringAssignment_6_1 )?
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1()); 
            // InternalBiLang.g:1297:2: ( rule__Task__DatafilteringAssignment_6_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBiLang.g:1297:3: rule__Task__DatafilteringAssignment_6_1
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
    // InternalBiLang.g:1306:1: rule__DataFiltering__Group__0 : rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 ;
    public final void rule__DataFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1310:1: ( rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 )
            // InternalBiLang.g:1311:2: rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1
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
    // InternalBiLang.g:1318:1: rule__DataFiltering__Group__0__Impl : ( '=>' ) ;
    public final void rule__DataFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1322:1: ( ( '=>' ) )
            // InternalBiLang.g:1323:1: ( '=>' )
            {
            // InternalBiLang.g:1323:1: ( '=>' )
            // InternalBiLang.g:1324:2: '=>'
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
    // InternalBiLang.g:1333:1: rule__DataFiltering__Group__1 : rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 ;
    public final void rule__DataFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1337:1: ( rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 )
            // InternalBiLang.g:1338:2: rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2
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
    // InternalBiLang.g:1345:1: rule__DataFiltering__Group__1__Impl : ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) ;
    public final void rule__DataFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1349:1: ( ( ( rule__DataFiltering__FileextractorAssignment_1 ) ) )
            // InternalBiLang.g:1350:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            {
            // InternalBiLang.g:1350:1: ( ( rule__DataFiltering__FileextractorAssignment_1 ) )
            // InternalBiLang.g:1351:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_1()); 
            // InternalBiLang.g:1352:2: ( rule__DataFiltering__FileextractorAssignment_1 )
            // InternalBiLang.g:1352:3: rule__DataFiltering__FileextractorAssignment_1
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
    // InternalBiLang.g:1360:1: rule__DataFiltering__Group__2 : rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 ;
    public final void rule__DataFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1364:1: ( rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 )
            // InternalBiLang.g:1365:2: rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3
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
    // InternalBiLang.g:1372:1: rule__DataFiltering__Group__2__Impl : ( ( rule__DataFiltering__Group_2__0 )? ) ;
    public final void rule__DataFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1376:1: ( ( ( rule__DataFiltering__Group_2__0 )? ) )
            // InternalBiLang.g:1377:1: ( ( rule__DataFiltering__Group_2__0 )? )
            {
            // InternalBiLang.g:1377:1: ( ( rule__DataFiltering__Group_2__0 )? )
            // InternalBiLang.g:1378:2: ( rule__DataFiltering__Group_2__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2()); 
            // InternalBiLang.g:1379:2: ( rule__DataFiltering__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:1379:3: rule__DataFiltering__Group_2__0
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
    // InternalBiLang.g:1387:1: rule__DataFiltering__Group__3 : rule__DataFiltering__Group__3__Impl ;
    public final void rule__DataFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1391:1: ( rule__DataFiltering__Group__3__Impl )
            // InternalBiLang.g:1392:2: rule__DataFiltering__Group__3__Impl
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
    // InternalBiLang.g:1398:1: rule__DataFiltering__Group__3__Impl : ( ( rule__DataFiltering__Group_3__0 )? ) ;
    public final void rule__DataFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1402:1: ( ( ( rule__DataFiltering__Group_3__0 )? ) )
            // InternalBiLang.g:1403:1: ( ( rule__DataFiltering__Group_3__0 )? )
            {
            // InternalBiLang.g:1403:1: ( ( rule__DataFiltering__Group_3__0 )? )
            // InternalBiLang.g:1404:2: ( rule__DataFiltering__Group_3__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_3()); 
            // InternalBiLang.g:1405:2: ( rule__DataFiltering__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBiLang.g:1405:3: rule__DataFiltering__Group_3__0
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
    // InternalBiLang.g:1414:1: rule__DataFiltering__Group_2__0 : rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 ;
    public final void rule__DataFiltering__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1418:1: ( rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1 )
            // InternalBiLang.g:1419:2: rule__DataFiltering__Group_2__0__Impl rule__DataFiltering__Group_2__1
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
    // InternalBiLang.g:1426:1: rule__DataFiltering__Group_2__0__Impl : ( 'processing=' ) ;
    public final void rule__DataFiltering__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1430:1: ( ( 'processing=' ) )
            // InternalBiLang.g:1431:1: ( 'processing=' )
            {
            // InternalBiLang.g:1431:1: ( 'processing=' )
            // InternalBiLang.g:1432:2: 'processing='
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
    // InternalBiLang.g:1441:1: rule__DataFiltering__Group_2__1 : rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 ;
    public final void rule__DataFiltering__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1445:1: ( rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2 )
            // InternalBiLang.g:1446:2: rule__DataFiltering__Group_2__1__Impl rule__DataFiltering__Group_2__2
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
    // InternalBiLang.g:1453:1: rule__DataFiltering__Group_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1457:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) ) )
            // InternalBiLang.g:1458:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) )
            {
            // InternalBiLang.g:1458:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_1 ) )
            // InternalBiLang.g:1459:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1()); 
            // InternalBiLang.g:1460:2: ( rule__DataFiltering__ProcessingstepAssignment_2_1 )
            // InternalBiLang.g:1460:3: rule__DataFiltering__ProcessingstepAssignment_2_1
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
    // InternalBiLang.g:1468:1: rule__DataFiltering__Group_2__2 : rule__DataFiltering__Group_2__2__Impl ;
    public final void rule__DataFiltering__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1472:1: ( rule__DataFiltering__Group_2__2__Impl )
            // InternalBiLang.g:1473:2: rule__DataFiltering__Group_2__2__Impl
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
    // InternalBiLang.g:1479:1: rule__DataFiltering__Group_2__2__Impl : ( ( rule__DataFiltering__Group_2_2__0 )* ) ;
    public final void rule__DataFiltering__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1483:1: ( ( ( rule__DataFiltering__Group_2_2__0 )* ) )
            // InternalBiLang.g:1484:1: ( ( rule__DataFiltering__Group_2_2__0 )* )
            {
            // InternalBiLang.g:1484:1: ( ( rule__DataFiltering__Group_2_2__0 )* )
            // InternalBiLang.g:1485:2: ( rule__DataFiltering__Group_2_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_2_2()); 
            // InternalBiLang.g:1486:2: ( rule__DataFiltering__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBiLang.g:1486:3: rule__DataFiltering__Group_2_2__0
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
    // InternalBiLang.g:1495:1: rule__DataFiltering__Group_2_2__0 : rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 ;
    public final void rule__DataFiltering__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1499:1: ( rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1 )
            // InternalBiLang.g:1500:2: rule__DataFiltering__Group_2_2__0__Impl rule__DataFiltering__Group_2_2__1
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
    // InternalBiLang.g:1507:1: rule__DataFiltering__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1511:1: ( ( ',' ) )
            // InternalBiLang.g:1512:1: ( ',' )
            {
            // InternalBiLang.g:1512:1: ( ',' )
            // InternalBiLang.g:1513:2: ','
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
    // InternalBiLang.g:1522:1: rule__DataFiltering__Group_2_2__1 : rule__DataFiltering__Group_2_2__1__Impl ;
    public final void rule__DataFiltering__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1526:1: ( rule__DataFiltering__Group_2_2__1__Impl )
            // InternalBiLang.g:1527:2: rule__DataFiltering__Group_2_2__1__Impl
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
    // InternalBiLang.g:1533:1: rule__DataFiltering__Group_2_2__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) ) ;
    public final void rule__DataFiltering__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1537:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) ) )
            // InternalBiLang.g:1538:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) )
            {
            // InternalBiLang.g:1538:1: ( ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 ) )
            // InternalBiLang.g:1539:2: ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_2_1()); 
            // InternalBiLang.g:1540:2: ( rule__DataFiltering__ProcessingstepAssignment_2_2_1 )
            // InternalBiLang.g:1540:3: rule__DataFiltering__ProcessingstepAssignment_2_2_1
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
    // InternalBiLang.g:1549:1: rule__DataFiltering__Group_3__0 : rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1 ;
    public final void rule__DataFiltering__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1553:1: ( rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1 )
            // InternalBiLang.g:1554:2: rule__DataFiltering__Group_3__0__Impl rule__DataFiltering__Group_3__1
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
    // InternalBiLang.g:1561:1: rule__DataFiltering__Group_3__0__Impl : ( 'filtering=' ) ;
    public final void rule__DataFiltering__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1565:1: ( ( 'filtering=' ) )
            // InternalBiLang.g:1566:1: ( 'filtering=' )
            {
            // InternalBiLang.g:1566:1: ( 'filtering=' )
            // InternalBiLang.g:1567:2: 'filtering='
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
    // InternalBiLang.g:1576:1: rule__DataFiltering__Group_3__1 : rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2 ;
    public final void rule__DataFiltering__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1580:1: ( rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2 )
            // InternalBiLang.g:1581:2: rule__DataFiltering__Group_3__1__Impl rule__DataFiltering__Group_3__2
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
    // InternalBiLang.g:1588:1: rule__DataFiltering__Group_3__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) ) ;
    public final void rule__DataFiltering__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1592:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) ) )
            // InternalBiLang.g:1593:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) )
            {
            // InternalBiLang.g:1593:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_1 ) )
            // InternalBiLang.g:1594:2: ( rule__DataFiltering__FilteringstepAssignment_3_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_1()); 
            // InternalBiLang.g:1595:2: ( rule__DataFiltering__FilteringstepAssignment_3_1 )
            // InternalBiLang.g:1595:3: rule__DataFiltering__FilteringstepAssignment_3_1
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
    // InternalBiLang.g:1603:1: rule__DataFiltering__Group_3__2 : rule__DataFiltering__Group_3__2__Impl ;
    public final void rule__DataFiltering__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1607:1: ( rule__DataFiltering__Group_3__2__Impl )
            // InternalBiLang.g:1608:2: rule__DataFiltering__Group_3__2__Impl
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
    // InternalBiLang.g:1614:1: rule__DataFiltering__Group_3__2__Impl : ( ( rule__DataFiltering__Group_3_2__0 )* ) ;
    public final void rule__DataFiltering__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1618:1: ( ( ( rule__DataFiltering__Group_3_2__0 )* ) )
            // InternalBiLang.g:1619:1: ( ( rule__DataFiltering__Group_3_2__0 )* )
            {
            // InternalBiLang.g:1619:1: ( ( rule__DataFiltering__Group_3_2__0 )* )
            // InternalBiLang.g:1620:2: ( rule__DataFiltering__Group_3_2__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_3_2()); 
            // InternalBiLang.g:1621:2: ( rule__DataFiltering__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBiLang.g:1621:3: rule__DataFiltering__Group_3_2__0
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
    // InternalBiLang.g:1630:1: rule__DataFiltering__Group_3_2__0 : rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1 ;
    public final void rule__DataFiltering__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1634:1: ( rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1 )
            // InternalBiLang.g:1635:2: rule__DataFiltering__Group_3_2__0__Impl rule__DataFiltering__Group_3_2__1
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
    // InternalBiLang.g:1642:1: rule__DataFiltering__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1646:1: ( ( ',' ) )
            // InternalBiLang.g:1647:1: ( ',' )
            {
            // InternalBiLang.g:1647:1: ( ',' )
            // InternalBiLang.g:1648:2: ','
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
    // InternalBiLang.g:1657:1: rule__DataFiltering__Group_3_2__1 : rule__DataFiltering__Group_3_2__1__Impl ;
    public final void rule__DataFiltering__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1661:1: ( rule__DataFiltering__Group_3_2__1__Impl )
            // InternalBiLang.g:1662:2: rule__DataFiltering__Group_3_2__1__Impl
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
    // InternalBiLang.g:1668:1: rule__DataFiltering__Group_3_2__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) ) ;
    public final void rule__DataFiltering__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1672:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) ) )
            // InternalBiLang.g:1673:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) )
            {
            // InternalBiLang.g:1673:1: ( ( rule__DataFiltering__FilteringstepAssignment_3_2_1 ) )
            // InternalBiLang.g:1674:2: ( rule__DataFiltering__FilteringstepAssignment_3_2_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_3_2_1()); 
            // InternalBiLang.g:1675:2: ( rule__DataFiltering__FilteringstepAssignment_3_2_1 )
            // InternalBiLang.g:1675:3: rule__DataFiltering__FilteringstepAssignment_3_2_1
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
    // InternalBiLang.g:1684:1: rule__DashBoard__Group__0 : rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 ;
    public final void rule__DashBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1688:1: ( rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 )
            // InternalBiLang.g:1689:2: rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1
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
    // InternalBiLang.g:1696:1: rule__DashBoard__Group__0__Impl : ( ( rule__DashBoard__NameAssignment_0 ) ) ;
    public final void rule__DashBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1700:1: ( ( ( rule__DashBoard__NameAssignment_0 ) ) )
            // InternalBiLang.g:1701:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            {
            // InternalBiLang.g:1701:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            // InternalBiLang.g:1702:2: ( rule__DashBoard__NameAssignment_0 )
            {
             before(grammarAccess.getDashBoardAccess().getNameAssignment_0()); 
            // InternalBiLang.g:1703:2: ( rule__DashBoard__NameAssignment_0 )
            // InternalBiLang.g:1703:3: rule__DashBoard__NameAssignment_0
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
    // InternalBiLang.g:1711:1: rule__DashBoard__Group__1 : rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 ;
    public final void rule__DashBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1715:1: ( rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 )
            // InternalBiLang.g:1716:2: rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2
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
    // InternalBiLang.g:1723:1: rule__DashBoard__Group__1__Impl : ( '=>' ) ;
    public final void rule__DashBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1727:1: ( ( '=>' ) )
            // InternalBiLang.g:1728:1: ( '=>' )
            {
            // InternalBiLang.g:1728:1: ( '=>' )
            // InternalBiLang.g:1729:2: '=>'
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
    // InternalBiLang.g:1738:1: rule__DashBoard__Group__2 : rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 ;
    public final void rule__DashBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1742:1: ( rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 )
            // InternalBiLang.g:1743:2: rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3
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
    // InternalBiLang.g:1750:1: rule__DashBoard__Group__2__Impl : ( ( rule__DashBoard__Alternatives_2 ) ) ;
    public final void rule__DashBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1754:1: ( ( ( rule__DashBoard__Alternatives_2 ) ) )
            // InternalBiLang.g:1755:1: ( ( rule__DashBoard__Alternatives_2 ) )
            {
            // InternalBiLang.g:1755:1: ( ( rule__DashBoard__Alternatives_2 ) )
            // InternalBiLang.g:1756:2: ( rule__DashBoard__Alternatives_2 )
            {
             before(grammarAccess.getDashBoardAccess().getAlternatives_2()); 
            // InternalBiLang.g:1757:2: ( rule__DashBoard__Alternatives_2 )
            // InternalBiLang.g:1757:3: rule__DashBoard__Alternatives_2
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
    // InternalBiLang.g:1765:1: rule__DashBoard__Group__3 : rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 ;
    public final void rule__DashBoard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1769:1: ( rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 )
            // InternalBiLang.g:1770:2: rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4
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
    // InternalBiLang.g:1777:1: rule__DashBoard__Group__3__Impl : ( 'plots' ) ;
    public final void rule__DashBoard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1781:1: ( ( 'plots' ) )
            // InternalBiLang.g:1782:1: ( 'plots' )
            {
            // InternalBiLang.g:1782:1: ( 'plots' )
            // InternalBiLang.g:1783:2: 'plots'
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
    // InternalBiLang.g:1792:1: rule__DashBoard__Group__4 : rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 ;
    public final void rule__DashBoard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1796:1: ( rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 )
            // InternalBiLang.g:1797:2: rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5
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
    // InternalBiLang.g:1804:1: rule__DashBoard__Group__4__Impl : ( '{' ) ;
    public final void rule__DashBoard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1808:1: ( ( '{' ) )
            // InternalBiLang.g:1809:1: ( '{' )
            {
            // InternalBiLang.g:1809:1: ( '{' )
            // InternalBiLang.g:1810:2: '{'
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
    // InternalBiLang.g:1819:1: rule__DashBoard__Group__5 : rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6 ;
    public final void rule__DashBoard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1823:1: ( rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6 )
            // InternalBiLang.g:1824:2: rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6
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
    // InternalBiLang.g:1831:1: rule__DashBoard__Group__5__Impl : ( ( rule__DashBoard__PlotAssignment_5 ) ) ;
    public final void rule__DashBoard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1835:1: ( ( ( rule__DashBoard__PlotAssignment_5 ) ) )
            // InternalBiLang.g:1836:1: ( ( rule__DashBoard__PlotAssignment_5 ) )
            {
            // InternalBiLang.g:1836:1: ( ( rule__DashBoard__PlotAssignment_5 ) )
            // InternalBiLang.g:1837:2: ( rule__DashBoard__PlotAssignment_5 )
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_5()); 
            // InternalBiLang.g:1838:2: ( rule__DashBoard__PlotAssignment_5 )
            // InternalBiLang.g:1838:3: rule__DashBoard__PlotAssignment_5
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
    // InternalBiLang.g:1846:1: rule__DashBoard__Group__6 : rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7 ;
    public final void rule__DashBoard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1850:1: ( rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7 )
            // InternalBiLang.g:1851:2: rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7
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
    // InternalBiLang.g:1858:1: rule__DashBoard__Group__6__Impl : ( ( rule__DashBoard__PlotAssignment_6 )* ) ;
    public final void rule__DashBoard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1862:1: ( ( ( rule__DashBoard__PlotAssignment_6 )* ) )
            // InternalBiLang.g:1863:1: ( ( rule__DashBoard__PlotAssignment_6 )* )
            {
            // InternalBiLang.g:1863:1: ( ( rule__DashBoard__PlotAssignment_6 )* )
            // InternalBiLang.g:1864:2: ( rule__DashBoard__PlotAssignment_6 )*
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_6()); 
            // InternalBiLang.g:1865:2: ( rule__DashBoard__PlotAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45||(LA19_0>=52 && LA19_0<=57)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBiLang.g:1865:3: rule__DashBoard__PlotAssignment_6
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
    // InternalBiLang.g:1873:1: rule__DashBoard__Group__7 : rule__DashBoard__Group__7__Impl ;
    public final void rule__DashBoard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1877:1: ( rule__DashBoard__Group__7__Impl )
            // InternalBiLang.g:1878:2: rule__DashBoard__Group__7__Impl
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
    // InternalBiLang.g:1884:1: rule__DashBoard__Group__7__Impl : ( '}' ) ;
    public final void rule__DashBoard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1888:1: ( ( '}' ) )
            // InternalBiLang.g:1889:1: ( '}' )
            {
            // InternalBiLang.g:1889:1: ( '}' )
            // InternalBiLang.g:1890:2: '}'
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
    // InternalBiLang.g:1900:1: rule__DashBoard__Group_2_0__0 : rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1 ;
    public final void rule__DashBoard__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1904:1: ( rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1 )
            // InternalBiLang.g:1905:2: rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1
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
    // InternalBiLang.g:1912:1: rule__DashBoard__Group_2_0__0__Impl : ( 'e' ) ;
    public final void rule__DashBoard__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1916:1: ( ( 'e' ) )
            // InternalBiLang.g:1917:1: ( 'e' )
            {
            // InternalBiLang.g:1917:1: ( 'e' )
            // InternalBiLang.g:1918:2: 'e'
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
    // InternalBiLang.g:1927:1: rule__DashBoard__Group_2_0__1 : rule__DashBoard__Group_2_0__1__Impl ;
    public final void rule__DashBoard__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1931:1: ( rule__DashBoard__Group_2_0__1__Impl )
            // InternalBiLang.g:1932:2: rule__DashBoard__Group_2_0__1__Impl
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
    // InternalBiLang.g:1938:1: rule__DashBoard__Group_2_0__1__Impl : ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) ) ;
    public final void rule__DashBoard__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1942:1: ( ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) ) )
            // InternalBiLang.g:1943:1: ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) )
            {
            // InternalBiLang.g:1943:1: ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) )
            // InternalBiLang.g:1944:2: ( rule__DashBoard__FileextractorAssignment_2_0_1 )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0_1()); 
            // InternalBiLang.g:1945:2: ( rule__DashBoard__FileextractorAssignment_2_0_1 )
            // InternalBiLang.g:1945:3: rule__DashBoard__FileextractorAssignment_2_0_1
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
    // InternalBiLang.g:1954:1: rule__DashBoard__Group_2_1__0 : rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1 ;
    public final void rule__DashBoard__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1958:1: ( rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1 )
            // InternalBiLang.g:1959:2: rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1
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
    // InternalBiLang.g:1966:1: rule__DashBoard__Group_2_1__0__Impl : ( 'df' ) ;
    public final void rule__DashBoard__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1970:1: ( ( 'df' ) )
            // InternalBiLang.g:1971:1: ( 'df' )
            {
            // InternalBiLang.g:1971:1: ( 'df' )
            // InternalBiLang.g:1972:2: 'df'
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
    // InternalBiLang.g:1981:1: rule__DashBoard__Group_2_1__1 : rule__DashBoard__Group_2_1__1__Impl ;
    public final void rule__DashBoard__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1985:1: ( rule__DashBoard__Group_2_1__1__Impl )
            // InternalBiLang.g:1986:2: rule__DashBoard__Group_2_1__1__Impl
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
    // InternalBiLang.g:1992:1: rule__DashBoard__Group_2_1__1__Impl : ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) ) ;
    public final void rule__DashBoard__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1996:1: ( ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) ) )
            // InternalBiLang.g:1997:1: ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) )
            {
            // InternalBiLang.g:1997:1: ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) )
            // InternalBiLang.g:1998:2: ( rule__DashBoard__DatafilteringAssignment_2_1_1 )
            {
             before(grammarAccess.getDashBoardAccess().getDatafilteringAssignment_2_1_1()); 
            // InternalBiLang.g:1999:2: ( rule__DashBoard__DatafilteringAssignment_2_1_1 )
            // InternalBiLang.g:1999:3: rule__DashBoard__DatafilteringAssignment_2_1_1
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
    // InternalBiLang.g:2008:1: rule__CsvExtractor__Group__0 : rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1 ;
    public final void rule__CsvExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2012:1: ( rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1 )
            // InternalBiLang.g:2013:2: rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1
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
    // InternalBiLang.g:2020:1: rule__CsvExtractor__Group__0__Impl : ( () ) ;
    public final void rule__CsvExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2024:1: ( ( () ) )
            // InternalBiLang.g:2025:1: ( () )
            {
            // InternalBiLang.g:2025:1: ( () )
            // InternalBiLang.g:2026:2: ()
            {
             before(grammarAccess.getCsvExtractorAccess().getCsvExtractorAction_0()); 
            // InternalBiLang.g:2027:2: ()
            // InternalBiLang.g:2027:3: 
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
    // InternalBiLang.g:2035:1: rule__CsvExtractor__Group__1 : rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2 ;
    public final void rule__CsvExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2039:1: ( rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2 )
            // InternalBiLang.g:2040:2: rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2
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
    // InternalBiLang.g:2047:1: rule__CsvExtractor__Group__1__Impl : ( ( rule__CsvExtractor__NameAssignment_1 ) ) ;
    public final void rule__CsvExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2051:1: ( ( ( rule__CsvExtractor__NameAssignment_1 ) ) )
            // InternalBiLang.g:2052:1: ( ( rule__CsvExtractor__NameAssignment_1 ) )
            {
            // InternalBiLang.g:2052:1: ( ( rule__CsvExtractor__NameAssignment_1 ) )
            // InternalBiLang.g:2053:2: ( rule__CsvExtractor__NameAssignment_1 )
            {
             before(grammarAccess.getCsvExtractorAccess().getNameAssignment_1()); 
            // InternalBiLang.g:2054:2: ( rule__CsvExtractor__NameAssignment_1 )
            // InternalBiLang.g:2054:3: rule__CsvExtractor__NameAssignment_1
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
    // InternalBiLang.g:2062:1: rule__CsvExtractor__Group__2 : rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3 ;
    public final void rule__CsvExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2066:1: ( rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3 )
            // InternalBiLang.g:2067:2: rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3
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
    // InternalBiLang.g:2074:1: rule__CsvExtractor__Group__2__Impl : ( '.csv' ) ;
    public final void rule__CsvExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2078:1: ( ( '.csv' ) )
            // InternalBiLang.g:2079:1: ( '.csv' )
            {
            // InternalBiLang.g:2079:1: ( '.csv' )
            // InternalBiLang.g:2080:2: '.csv'
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
    // InternalBiLang.g:2089:1: rule__CsvExtractor__Group__3 : rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4 ;
    public final void rule__CsvExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2093:1: ( rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4 )
            // InternalBiLang.g:2094:2: rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4
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
    // InternalBiLang.g:2101:1: rule__CsvExtractor__Group__3__Impl : ( '=>' ) ;
    public final void rule__CsvExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2105:1: ( ( '=>' ) )
            // InternalBiLang.g:2106:1: ( '=>' )
            {
            // InternalBiLang.g:2106:1: ( '=>' )
            // InternalBiLang.g:2107:2: '=>'
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
    // InternalBiLang.g:2116:1: rule__CsvExtractor__Group__4 : rule__CsvExtractor__Group__4__Impl ;
    public final void rule__CsvExtractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2120:1: ( rule__CsvExtractor__Group__4__Impl )
            // InternalBiLang.g:2121:2: rule__CsvExtractor__Group__4__Impl
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
    // InternalBiLang.g:2127:1: rule__CsvExtractor__Group__4__Impl : ( ( rule__CsvExtractor__PathAssignment_4 ) ) ;
    public final void rule__CsvExtractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2131:1: ( ( ( rule__CsvExtractor__PathAssignment_4 ) ) )
            // InternalBiLang.g:2132:1: ( ( rule__CsvExtractor__PathAssignment_4 ) )
            {
            // InternalBiLang.g:2132:1: ( ( rule__CsvExtractor__PathAssignment_4 ) )
            // InternalBiLang.g:2133:2: ( rule__CsvExtractor__PathAssignment_4 )
            {
             before(grammarAccess.getCsvExtractorAccess().getPathAssignment_4()); 
            // InternalBiLang.g:2134:2: ( rule__CsvExtractor__PathAssignment_4 )
            // InternalBiLang.g:2134:3: rule__CsvExtractor__PathAssignment_4
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
    // InternalBiLang.g:2143:1: rule__ExcelExtractor__Group__0 : rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1 ;
    public final void rule__ExcelExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2147:1: ( rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1 )
            // InternalBiLang.g:2148:2: rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1
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
    // InternalBiLang.g:2155:1: rule__ExcelExtractor__Group__0__Impl : ( () ) ;
    public final void rule__ExcelExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2159:1: ( ( () ) )
            // InternalBiLang.g:2160:1: ( () )
            {
            // InternalBiLang.g:2160:1: ( () )
            // InternalBiLang.g:2161:2: ()
            {
             before(grammarAccess.getExcelExtractorAccess().getExcelExtractorAction_0()); 
            // InternalBiLang.g:2162:2: ()
            // InternalBiLang.g:2162:3: 
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
    // InternalBiLang.g:2170:1: rule__ExcelExtractor__Group__1 : rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2 ;
    public final void rule__ExcelExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2174:1: ( rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2 )
            // InternalBiLang.g:2175:2: rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2
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
    // InternalBiLang.g:2182:1: rule__ExcelExtractor__Group__1__Impl : ( ( rule__ExcelExtractor__NameAssignment_1 ) ) ;
    public final void rule__ExcelExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2186:1: ( ( ( rule__ExcelExtractor__NameAssignment_1 ) ) )
            // InternalBiLang.g:2187:1: ( ( rule__ExcelExtractor__NameAssignment_1 ) )
            {
            // InternalBiLang.g:2187:1: ( ( rule__ExcelExtractor__NameAssignment_1 ) )
            // InternalBiLang.g:2188:2: ( rule__ExcelExtractor__NameAssignment_1 )
            {
             before(grammarAccess.getExcelExtractorAccess().getNameAssignment_1()); 
            // InternalBiLang.g:2189:2: ( rule__ExcelExtractor__NameAssignment_1 )
            // InternalBiLang.g:2189:3: rule__ExcelExtractor__NameAssignment_1
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
    // InternalBiLang.g:2197:1: rule__ExcelExtractor__Group__2 : rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3 ;
    public final void rule__ExcelExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2201:1: ( rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3 )
            // InternalBiLang.g:2202:2: rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3
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
    // InternalBiLang.g:2209:1: rule__ExcelExtractor__Group__2__Impl : ( '.xlsx' ) ;
    public final void rule__ExcelExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2213:1: ( ( '.xlsx' ) )
            // InternalBiLang.g:2214:1: ( '.xlsx' )
            {
            // InternalBiLang.g:2214:1: ( '.xlsx' )
            // InternalBiLang.g:2215:2: '.xlsx'
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
    // InternalBiLang.g:2224:1: rule__ExcelExtractor__Group__3 : rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4 ;
    public final void rule__ExcelExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2228:1: ( rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4 )
            // InternalBiLang.g:2229:2: rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4
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
    // InternalBiLang.g:2236:1: rule__ExcelExtractor__Group__3__Impl : ( '=>' ) ;
    public final void rule__ExcelExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2240:1: ( ( '=>' ) )
            // InternalBiLang.g:2241:1: ( '=>' )
            {
            // InternalBiLang.g:2241:1: ( '=>' )
            // InternalBiLang.g:2242:2: '=>'
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
    // InternalBiLang.g:2251:1: rule__ExcelExtractor__Group__4 : rule__ExcelExtractor__Group__4__Impl ;
    public final void rule__ExcelExtractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2255:1: ( rule__ExcelExtractor__Group__4__Impl )
            // InternalBiLang.g:2256:2: rule__ExcelExtractor__Group__4__Impl
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
    // InternalBiLang.g:2262:1: rule__ExcelExtractor__Group__4__Impl : ( ( rule__ExcelExtractor__PathAssignment_4 ) ) ;
    public final void rule__ExcelExtractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2266:1: ( ( ( rule__ExcelExtractor__PathAssignment_4 ) ) )
            // InternalBiLang.g:2267:1: ( ( rule__ExcelExtractor__PathAssignment_4 ) )
            {
            // InternalBiLang.g:2267:1: ( ( rule__ExcelExtractor__PathAssignment_4 ) )
            // InternalBiLang.g:2268:2: ( rule__ExcelExtractor__PathAssignment_4 )
            {
             before(grammarAccess.getExcelExtractorAccess().getPathAssignment_4()); 
            // InternalBiLang.g:2269:2: ( rule__ExcelExtractor__PathAssignment_4 )
            // InternalBiLang.g:2269:3: rule__ExcelExtractor__PathAssignment_4
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
    // InternalBiLang.g:2278:1: rule__QuantitativeFiltering__Group__0 : rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 ;
    public final void rule__QuantitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2282:1: ( rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 )
            // InternalBiLang.g:2283:2: rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1
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
    // InternalBiLang.g:2290:1: rule__QuantitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QuantitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2294:1: ( ( () ) )
            // InternalBiLang.g:2295:1: ( () )
            {
            // InternalBiLang.g:2295:1: ( () )
            // InternalBiLang.g:2296:2: ()
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0()); 
            // InternalBiLang.g:2297:2: ()
            // InternalBiLang.g:2297:3: 
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
    // InternalBiLang.g:2305:1: rule__QuantitativeFiltering__Group__1 : rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 ;
    public final void rule__QuantitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2309:1: ( rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 )
            // InternalBiLang.g:2310:2: rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2
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
    // InternalBiLang.g:2317:1: rule__QuantitativeFiltering__Group__1__Impl : ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QuantitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2321:1: ( ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:2322:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:2322:1: ( ( rule__QuantitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:2323:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:2324:2: ( rule__QuantitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:2324:3: rule__QuantitativeFiltering__AxisAssignment_1
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
    // InternalBiLang.g:2332:1: rule__QuantitativeFiltering__Group__2 : rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 ;
    public final void rule__QuantitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2336:1: ( rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 )
            // InternalBiLang.g:2337:2: rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3
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
    // InternalBiLang.g:2344:1: rule__QuantitativeFiltering__Group__2__Impl : ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QuantitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2348:1: ( ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2349:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2349:1: ( ( rule__QuantitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:2350:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2351:2: ( rule__QuantitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:2351:3: rule__QuantitativeFiltering__OperatorAssignment_2
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
    // InternalBiLang.g:2359:1: rule__QuantitativeFiltering__Group__3 : rule__QuantitativeFiltering__Group__3__Impl ;
    public final void rule__QuantitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2363:1: ( rule__QuantitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:2364:2: rule__QuantitativeFiltering__Group__3__Impl
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
    // InternalBiLang.g:2370:1: rule__QuantitativeFiltering__Group__3__Impl : ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) ;
    public final void rule__QuantitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2374:1: ( ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) ) )
            // InternalBiLang.g:2375:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            {
            // InternalBiLang.g:2375:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_3 ) )
            // InternalBiLang.g:2376:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_3()); 
            // InternalBiLang.g:2377:2: ( rule__QuantitativeFiltering__ValuesAssignment_3 )
            // InternalBiLang.g:2377:3: rule__QuantitativeFiltering__ValuesAssignment_3
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
    // InternalBiLang.g:2386:1: rule__QualitativeFiltering__Group__0 : rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 ;
    public final void rule__QualitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2390:1: ( rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 )
            // InternalBiLang.g:2391:2: rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1
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
    // InternalBiLang.g:2398:1: rule__QualitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QualitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2402:1: ( ( () ) )
            // InternalBiLang.g:2403:1: ( () )
            {
            // InternalBiLang.g:2403:1: ( () )
            // InternalBiLang.g:2404:2: ()
            {
             before(grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0()); 
            // InternalBiLang.g:2405:2: ()
            // InternalBiLang.g:2405:3: 
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
    // InternalBiLang.g:2413:1: rule__QualitativeFiltering__Group__1 : rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 ;
    public final void rule__QualitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2417:1: ( rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 )
            // InternalBiLang.g:2418:2: rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2
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
    // InternalBiLang.g:2425:1: rule__QualitativeFiltering__Group__1__Impl : ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) ;
    public final void rule__QualitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2429:1: ( ( ( rule__QualitativeFiltering__AxisAssignment_1 ) ) )
            // InternalBiLang.g:2430:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            {
            // InternalBiLang.g:2430:1: ( ( rule__QualitativeFiltering__AxisAssignment_1 ) )
            // InternalBiLang.g:2431:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_1()); 
            // InternalBiLang.g:2432:2: ( rule__QualitativeFiltering__AxisAssignment_1 )
            // InternalBiLang.g:2432:3: rule__QualitativeFiltering__AxisAssignment_1
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
    // InternalBiLang.g:2440:1: rule__QualitativeFiltering__Group__2 : rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 ;
    public final void rule__QualitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2444:1: ( rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 )
            // InternalBiLang.g:2445:2: rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3
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
    // InternalBiLang.g:2452:1: rule__QualitativeFiltering__Group__2__Impl : ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) ;
    public final void rule__QualitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2456:1: ( ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2457:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2457:1: ( ( rule__QualitativeFiltering__OperatorAssignment_2 ) )
            // InternalBiLang.g:2458:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2459:2: ( rule__QualitativeFiltering__OperatorAssignment_2 )
            // InternalBiLang.g:2459:3: rule__QualitativeFiltering__OperatorAssignment_2
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
    // InternalBiLang.g:2467:1: rule__QualitativeFiltering__Group__3 : rule__QualitativeFiltering__Group__3__Impl ;
    public final void rule__QualitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2471:1: ( rule__QualitativeFiltering__Group__3__Impl )
            // InternalBiLang.g:2472:2: rule__QualitativeFiltering__Group__3__Impl
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
    // InternalBiLang.g:2478:1: rule__QualitativeFiltering__Group__3__Impl : ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) ;
    public final void rule__QualitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2482:1: ( ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) ) )
            // InternalBiLang.g:2483:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            {
            // InternalBiLang.g:2483:1: ( ( rule__QualitativeFiltering__LabelsAssignment_3 ) )
            // InternalBiLang.g:2484:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_3()); 
            // InternalBiLang.g:2485:2: ( rule__QualitativeFiltering__LabelsAssignment_3 )
            // InternalBiLang.g:2485:3: rule__QualitativeFiltering__LabelsAssignment_3
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
    // InternalBiLang.g:2494:1: rule__MathOperation__Group__0 : rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 ;
    public final void rule__MathOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2498:1: ( rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 )
            // InternalBiLang.g:2499:2: rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1
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
    // InternalBiLang.g:2506:1: rule__MathOperation__Group__0__Impl : ( ( '(' )? ) ;
    public final void rule__MathOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2510:1: ( ( ( '(' )? ) )
            // InternalBiLang.g:2511:1: ( ( '(' )? )
            {
            // InternalBiLang.g:2511:1: ( ( '(' )? )
            // InternalBiLang.g:2512:2: ( '(' )?
            {
             before(grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_0()); 
            // InternalBiLang.g:2513:2: ( '(' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBiLang.g:2513:3: '('
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
    // InternalBiLang.g:2521:1: rule__MathOperation__Group__1 : rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 ;
    public final void rule__MathOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2525:1: ( rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 )
            // InternalBiLang.g:2526:2: rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2
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
    // InternalBiLang.g:2533:1: rule__MathOperation__Group__1__Impl : ( 'l' ) ;
    public final void rule__MathOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2537:1: ( ( 'l' ) )
            // InternalBiLang.g:2538:1: ( 'l' )
            {
            // InternalBiLang.g:2538:1: ( 'l' )
            // InternalBiLang.g:2539:2: 'l'
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
    // InternalBiLang.g:2548:1: rule__MathOperation__Group__2 : rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 ;
    public final void rule__MathOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2552:1: ( rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 )
            // InternalBiLang.g:2553:2: rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3
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
    // InternalBiLang.g:2560:1: rule__MathOperation__Group__2__Impl : ( ( rule__MathOperation__LsideAssignment_2 ) ) ;
    public final void rule__MathOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2564:1: ( ( ( rule__MathOperation__LsideAssignment_2 ) ) )
            // InternalBiLang.g:2565:1: ( ( rule__MathOperation__LsideAssignment_2 ) )
            {
            // InternalBiLang.g:2565:1: ( ( rule__MathOperation__LsideAssignment_2 ) )
            // InternalBiLang.g:2566:2: ( rule__MathOperation__LsideAssignment_2 )
            {
             before(grammarAccess.getMathOperationAccess().getLsideAssignment_2()); 
            // InternalBiLang.g:2567:2: ( rule__MathOperation__LsideAssignment_2 )
            // InternalBiLang.g:2567:3: rule__MathOperation__LsideAssignment_2
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
    // InternalBiLang.g:2575:1: rule__MathOperation__Group__3 : rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 ;
    public final void rule__MathOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2579:1: ( rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 )
            // InternalBiLang.g:2580:2: rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4
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
    // InternalBiLang.g:2587:1: rule__MathOperation__Group__3__Impl : ( ( rule__MathOperation__OperatorAssignment_3 ) ) ;
    public final void rule__MathOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2591:1: ( ( ( rule__MathOperation__OperatorAssignment_3 ) ) )
            // InternalBiLang.g:2592:1: ( ( rule__MathOperation__OperatorAssignment_3 ) )
            {
            // InternalBiLang.g:2592:1: ( ( rule__MathOperation__OperatorAssignment_3 ) )
            // InternalBiLang.g:2593:2: ( rule__MathOperation__OperatorAssignment_3 )
            {
             before(grammarAccess.getMathOperationAccess().getOperatorAssignment_3()); 
            // InternalBiLang.g:2594:2: ( rule__MathOperation__OperatorAssignment_3 )
            // InternalBiLang.g:2594:3: rule__MathOperation__OperatorAssignment_3
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
    // InternalBiLang.g:2602:1: rule__MathOperation__Group__4 : rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 ;
    public final void rule__MathOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2606:1: ( rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5 )
            // InternalBiLang.g:2607:2: rule__MathOperation__Group__4__Impl rule__MathOperation__Group__5
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
    // InternalBiLang.g:2614:1: rule__MathOperation__Group__4__Impl : ( 'r' ) ;
    public final void rule__MathOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2618:1: ( ( 'r' ) )
            // InternalBiLang.g:2619:1: ( 'r' )
            {
            // InternalBiLang.g:2619:1: ( 'r' )
            // InternalBiLang.g:2620:2: 'r'
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
    // InternalBiLang.g:2629:1: rule__MathOperation__Group__5 : rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 ;
    public final void rule__MathOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2633:1: ( rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6 )
            // InternalBiLang.g:2634:2: rule__MathOperation__Group__5__Impl rule__MathOperation__Group__6
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
    // InternalBiLang.g:2641:1: rule__MathOperation__Group__5__Impl : ( ( rule__MathOperation__RsideAssignment_5 ) ) ;
    public final void rule__MathOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2645:1: ( ( ( rule__MathOperation__RsideAssignment_5 ) ) )
            // InternalBiLang.g:2646:1: ( ( rule__MathOperation__RsideAssignment_5 ) )
            {
            // InternalBiLang.g:2646:1: ( ( rule__MathOperation__RsideAssignment_5 ) )
            // InternalBiLang.g:2647:2: ( rule__MathOperation__RsideAssignment_5 )
            {
             before(grammarAccess.getMathOperationAccess().getRsideAssignment_5()); 
            // InternalBiLang.g:2648:2: ( rule__MathOperation__RsideAssignment_5 )
            // InternalBiLang.g:2648:3: rule__MathOperation__RsideAssignment_5
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
    // InternalBiLang.g:2656:1: rule__MathOperation__Group__6 : rule__MathOperation__Group__6__Impl ;
    public final void rule__MathOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2660:1: ( rule__MathOperation__Group__6__Impl )
            // InternalBiLang.g:2661:2: rule__MathOperation__Group__6__Impl
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
    // InternalBiLang.g:2667:1: rule__MathOperation__Group__6__Impl : ( ( ')' )? ) ;
    public final void rule__MathOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2671:1: ( ( ( ')' )? ) )
            // InternalBiLang.g:2672:1: ( ( ')' )? )
            {
            // InternalBiLang.g:2672:1: ( ( ')' )? )
            // InternalBiLang.g:2673:2: ( ')' )?
            {
             before(grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_6()); 
            // InternalBiLang.g:2674:2: ( ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:2674:3: ')'
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
    // InternalBiLang.g:2683:1: rule__ColReference__Group__0 : rule__ColReference__Group__0__Impl rule__ColReference__Group__1 ;
    public final void rule__ColReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2687:1: ( rule__ColReference__Group__0__Impl rule__ColReference__Group__1 )
            // InternalBiLang.g:2688:2: rule__ColReference__Group__0__Impl rule__ColReference__Group__1
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
    // InternalBiLang.g:2695:1: rule__ColReference__Group__0__Impl : ( () ) ;
    public final void rule__ColReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2699:1: ( ( () ) )
            // InternalBiLang.g:2700:1: ( () )
            {
            // InternalBiLang.g:2700:1: ( () )
            // InternalBiLang.g:2701:2: ()
            {
             before(grammarAccess.getColReferenceAccess().getColReferenceAction_0()); 
            // InternalBiLang.g:2702:2: ()
            // InternalBiLang.g:2702:3: 
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
    // InternalBiLang.g:2710:1: rule__ColReference__Group__1 : rule__ColReference__Group__1__Impl ;
    public final void rule__ColReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2714:1: ( rule__ColReference__Group__1__Impl )
            // InternalBiLang.g:2715:2: rule__ColReference__Group__1__Impl
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
    // InternalBiLang.g:2721:1: rule__ColReference__Group__1__Impl : ( ( rule__ColReference__TargetAssignment_1 ) ) ;
    public final void rule__ColReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2725:1: ( ( ( rule__ColReference__TargetAssignment_1 ) ) )
            // InternalBiLang.g:2726:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            {
            // InternalBiLang.g:2726:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            // InternalBiLang.g:2727:2: ( rule__ColReference__TargetAssignment_1 )
            {
             before(grammarAccess.getColReferenceAccess().getTargetAssignment_1()); 
            // InternalBiLang.g:2728:2: ( rule__ColReference__TargetAssignment_1 )
            // InternalBiLang.g:2728:3: rule__ColReference__TargetAssignment_1
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
    // InternalBiLang.g:2737:1: rule__StatisticalOperation__Group__0 : rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 ;
    public final void rule__StatisticalOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2741:1: ( rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 )
            // InternalBiLang.g:2742:2: rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1
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
    // InternalBiLang.g:2749:1: rule__StatisticalOperation__Group__0__Impl : ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) ;
    public final void rule__StatisticalOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2753:1: ( ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) )
            // InternalBiLang.g:2754:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            {
            // InternalBiLang.g:2754:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            // InternalBiLang.g:2755:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getOperatorAssignment_0()); 
            // InternalBiLang.g:2756:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            // InternalBiLang.g:2756:3: rule__StatisticalOperation__OperatorAssignment_0
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
    // InternalBiLang.g:2764:1: rule__StatisticalOperation__Group__1 : rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 ;
    public final void rule__StatisticalOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2768:1: ( rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 )
            // InternalBiLang.g:2769:2: rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2
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
    // InternalBiLang.g:2776:1: rule__StatisticalOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__StatisticalOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2780:1: ( ( '(' ) )
            // InternalBiLang.g:2781:1: ( '(' )
            {
            // InternalBiLang.g:2781:1: ( '(' )
            // InternalBiLang.g:2782:2: '('
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
    // InternalBiLang.g:2791:1: rule__StatisticalOperation__Group__2 : rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 ;
    public final void rule__StatisticalOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2795:1: ( rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 )
            // InternalBiLang.g:2796:2: rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3
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
    // InternalBiLang.g:2803:1: rule__StatisticalOperation__Group__2__Impl : ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) ;
    public final void rule__StatisticalOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2807:1: ( ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) )
            // InternalBiLang.g:2808:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            {
            // InternalBiLang.g:2808:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            // InternalBiLang.g:2809:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getColreferenceAssignment_2()); 
            // InternalBiLang.g:2810:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            // InternalBiLang.g:2810:3: rule__StatisticalOperation__ColreferenceAssignment_2
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
    // InternalBiLang.g:2818:1: rule__StatisticalOperation__Group__3 : rule__StatisticalOperation__Group__3__Impl ;
    public final void rule__StatisticalOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2822:1: ( rule__StatisticalOperation__Group__3__Impl )
            // InternalBiLang.g:2823:2: rule__StatisticalOperation__Group__3__Impl
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
    // InternalBiLang.g:2829:1: rule__StatisticalOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__StatisticalOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2833:1: ( ( ')' ) )
            // InternalBiLang.g:2834:1: ( ')' )
            {
            // InternalBiLang.g:2834:1: ( ')' )
            // InternalBiLang.g:2835:2: ')'
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
    // InternalBiLang.g:2845:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2849:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalBiLang.g:2850:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalBiLang.g:2857:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2861:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:2862:1: ( ( '-' )? )
            {
            // InternalBiLang.g:2862:1: ( ( '-' )? )
            // InternalBiLang.g:2863:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:2864:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBiLang.g:2864:3: '-'
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
    // InternalBiLang.g:2872:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2876:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalBiLang.g:2877:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalBiLang.g:2884:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2888:1: ( ( ( RULE_INT )? ) )
            // InternalBiLang.g:2889:1: ( ( RULE_INT )? )
            {
            // InternalBiLang.g:2889:1: ( ( RULE_INT )? )
            // InternalBiLang.g:2890:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalBiLang.g:2891:2: ( RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBiLang.g:2891:3: RULE_INT
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
    // InternalBiLang.g:2899:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2903:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalBiLang.g:2904:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
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
    // InternalBiLang.g:2911:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2915:1: ( ( '.' ) )
            // InternalBiLang.g:2916:1: ( '.' )
            {
            // InternalBiLang.g:2916:1: ( '.' )
            // InternalBiLang.g:2917:2: '.'
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
    // InternalBiLang.g:2926:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2930:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalBiLang.g:2931:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
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
    // InternalBiLang.g:2938:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2942:1: ( ( RULE_INT ) )
            // InternalBiLang.g:2943:1: ( RULE_INT )
            {
            // InternalBiLang.g:2943:1: ( RULE_INT )
            // InternalBiLang.g:2944:2: RULE_INT
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
    // InternalBiLang.g:2953:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2957:1: ( rule__EFloat__Group__4__Impl )
            // InternalBiLang.g:2958:2: rule__EFloat__Group__4__Impl
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
    // InternalBiLang.g:2964:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2968:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalBiLang.g:2969:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalBiLang.g:2969:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalBiLang.g:2970:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalBiLang.g:2971:2: ( rule__EFloat__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=11 && LA24_0<=12)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBiLang.g:2971:3: rule__EFloat__Group_4__0
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
    // InternalBiLang.g:2980:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2984:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalBiLang.g:2985:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
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
    // InternalBiLang.g:2992:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2996:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalBiLang.g:2997:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalBiLang.g:2997:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalBiLang.g:2998:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalBiLang.g:2999:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalBiLang.g:2999:3: rule__EFloat__Alternatives_4_0
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
    // InternalBiLang.g:3007:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3011:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalBiLang.g:3012:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
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
    // InternalBiLang.g:3019:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3023:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:3024:1: ( ( '-' )? )
            {
            // InternalBiLang.g:3024:1: ( ( '-' )? )
            // InternalBiLang.g:3025:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBiLang.g:3026:2: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:3026:3: '-'
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
    // InternalBiLang.g:3034:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3038:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalBiLang.g:3039:2: rule__EFloat__Group_4__2__Impl
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
    // InternalBiLang.g:3045:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3049:1: ( ( RULE_INT ) )
            // InternalBiLang.g:3050:1: ( RULE_INT )
            {
            // InternalBiLang.g:3050:1: ( RULE_INT )
            // InternalBiLang.g:3051:2: RULE_INT
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


    // $ANTLR start "rule__BarPlot__Group__0"
    // InternalBiLang.g:3061:1: rule__BarPlot__Group__0 : rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 ;
    public final void rule__BarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3065:1: ( rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 )
            // InternalBiLang.g:3066:2: rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1
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
    // InternalBiLang.g:3073:1: rule__BarPlot__Group__0__Impl : ( () ) ;
    public final void rule__BarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3077:1: ( ( () ) )
            // InternalBiLang.g:3078:1: ( () )
            {
            // InternalBiLang.g:3078:1: ( () )
            // InternalBiLang.g:3079:2: ()
            {
             before(grammarAccess.getBarPlotAccess().getBarPlotAction_0()); 
            // InternalBiLang.g:3080:2: ()
            // InternalBiLang.g:3080:3: 
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
    // InternalBiLang.g:3088:1: rule__BarPlot__Group__1 : rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 ;
    public final void rule__BarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3092:1: ( rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 )
            // InternalBiLang.g:3093:2: rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2
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
    // InternalBiLang.g:3100:1: rule__BarPlot__Group__1__Impl : ( 'bar' ) ;
    public final void rule__BarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3104:1: ( ( 'bar' ) )
            // InternalBiLang.g:3105:1: ( 'bar' )
            {
            // InternalBiLang.g:3105:1: ( 'bar' )
            // InternalBiLang.g:3106:2: 'bar'
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
    // InternalBiLang.g:3115:1: rule__BarPlot__Group__2 : rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 ;
    public final void rule__BarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3119:1: ( rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 )
            // InternalBiLang.g:3120:2: rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3
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
    // InternalBiLang.g:3127:1: rule__BarPlot__Group__2__Impl : ( ( rule__BarPlot__NameAssignment_2 ) ) ;
    public final void rule__BarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3131:1: ( ( ( rule__BarPlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3132:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3132:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            // InternalBiLang.g:3133:2: ( rule__BarPlot__NameAssignment_2 )
            {
             before(grammarAccess.getBarPlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3134:2: ( rule__BarPlot__NameAssignment_2 )
            // InternalBiLang.g:3134:3: rule__BarPlot__NameAssignment_2
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
    // InternalBiLang.g:3142:1: rule__BarPlot__Group__3 : rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 ;
    public final void rule__BarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3146:1: ( rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 )
            // InternalBiLang.g:3147:2: rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4
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
    // InternalBiLang.g:3154:1: rule__BarPlot__Group__3__Impl : ( '->' ) ;
    public final void rule__BarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3158:1: ( ( '->' ) )
            // InternalBiLang.g:3159:1: ( '->' )
            {
            // InternalBiLang.g:3159:1: ( '->' )
            // InternalBiLang.g:3160:2: '->'
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
    // InternalBiLang.g:3169:1: rule__BarPlot__Group__4 : rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 ;
    public final void rule__BarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3173:1: ( rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 )
            // InternalBiLang.g:3174:2: rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5
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
    // InternalBiLang.g:3181:1: rule__BarPlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__BarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3185:1: ( ( 'xAx' ) )
            // InternalBiLang.g:3186:1: ( 'xAx' )
            {
            // InternalBiLang.g:3186:1: ( 'xAx' )
            // InternalBiLang.g:3187:2: 'xAx'
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
    // InternalBiLang.g:3196:1: rule__BarPlot__Group__5 : rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 ;
    public final void rule__BarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3200:1: ( rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 )
            // InternalBiLang.g:3201:2: rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6
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
    // InternalBiLang.g:3208:1: rule__BarPlot__Group__5__Impl : ( ( rule__BarPlot__XAxisAssignment_5 ) ) ;
    public final void rule__BarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3212:1: ( ( ( rule__BarPlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:3213:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:3213:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:3214:2: ( rule__BarPlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getBarPlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:3215:2: ( rule__BarPlot__XAxisAssignment_5 )
            // InternalBiLang.g:3215:3: rule__BarPlot__XAxisAssignment_5
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
    // InternalBiLang.g:3223:1: rule__BarPlot__Group__6 : rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 ;
    public final void rule__BarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3227:1: ( rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 )
            // InternalBiLang.g:3228:2: rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7
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
    // InternalBiLang.g:3235:1: rule__BarPlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__BarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3239:1: ( ( 'yA' ) )
            // InternalBiLang.g:3240:1: ( 'yA' )
            {
            // InternalBiLang.g:3240:1: ( 'yA' )
            // InternalBiLang.g:3241:2: 'yA'
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
    // InternalBiLang.g:3250:1: rule__BarPlot__Group__7 : rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 ;
    public final void rule__BarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3254:1: ( rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 )
            // InternalBiLang.g:3255:2: rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8
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
    // InternalBiLang.g:3262:1: rule__BarPlot__Group__7__Impl : ( ( rule__BarPlot__YAxisAssignment_7 ) ) ;
    public final void rule__BarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3266:1: ( ( ( rule__BarPlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3267:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3267:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3268:2: ( rule__BarPlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getBarPlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3269:2: ( rule__BarPlot__YAxisAssignment_7 )
            // InternalBiLang.g:3269:3: rule__BarPlot__YAxisAssignment_7
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
    // InternalBiLang.g:3277:1: rule__BarPlot__Group__8 : rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 ;
    public final void rule__BarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3281:1: ( rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 )
            // InternalBiLang.g:3282:2: rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9
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
    // InternalBiLang.g:3289:1: rule__BarPlot__Group__8__Impl : ( ( rule__BarPlot__Group_8__0 )? ) ;
    public final void rule__BarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3293:1: ( ( ( rule__BarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:3294:1: ( ( rule__BarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3294:1: ( ( rule__BarPlot__Group_8__0 )? )
            // InternalBiLang.g:3295:2: ( rule__BarPlot__Group_8__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:3296:2: ( rule__BarPlot__Group_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:3296:3: rule__BarPlot__Group_8__0
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
    // InternalBiLang.g:3304:1: rule__BarPlot__Group__9 : rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 ;
    public final void rule__BarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3308:1: ( rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 )
            // InternalBiLang.g:3309:2: rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10
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
    // InternalBiLang.g:3316:1: rule__BarPlot__Group__9__Impl : ( ( rule__BarPlot__Group_9__0 )? ) ;
    public final void rule__BarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3320:1: ( ( ( rule__BarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:3321:1: ( ( rule__BarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:3321:1: ( ( rule__BarPlot__Group_9__0 )? )
            // InternalBiLang.g:3322:2: ( rule__BarPlot__Group_9__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:3323:2: ( rule__BarPlot__Group_9__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:3323:3: rule__BarPlot__Group_9__0
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
    // InternalBiLang.g:3331:1: rule__BarPlot__Group__10 : rule__BarPlot__Group__10__Impl ;
    public final void rule__BarPlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3335:1: ( rule__BarPlot__Group__10__Impl )
            // InternalBiLang.g:3336:2: rule__BarPlot__Group__10__Impl
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
    // InternalBiLang.g:3342:1: rule__BarPlot__Group__10__Impl : ( ( rule__BarPlot__Group_10__0 )? ) ;
    public final void rule__BarPlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3346:1: ( ( ( rule__BarPlot__Group_10__0 )? ) )
            // InternalBiLang.g:3347:1: ( ( rule__BarPlot__Group_10__0 )? )
            {
            // InternalBiLang.g:3347:1: ( ( rule__BarPlot__Group_10__0 )? )
            // InternalBiLang.g:3348:2: ( rule__BarPlot__Group_10__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_10()); 
            // InternalBiLang.g:3349:2: ( rule__BarPlot__Group_10__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBiLang.g:3349:3: rule__BarPlot__Group_10__0
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
    // InternalBiLang.g:3358:1: rule__BarPlot__Group_8__0 : rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 ;
    public final void rule__BarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3362:1: ( rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 )
            // InternalBiLang.g:3363:2: rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:3370:1: rule__BarPlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__BarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3374:1: ( ( 'loc' ) )
            // InternalBiLang.g:3375:1: ( 'loc' )
            {
            // InternalBiLang.g:3375:1: ( 'loc' )
            // InternalBiLang.g:3376:2: 'loc'
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
    // InternalBiLang.g:3385:1: rule__BarPlot__Group_8__1 : rule__BarPlot__Group_8__1__Impl ;
    public final void rule__BarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3389:1: ( rule__BarPlot__Group_8__1__Impl )
            // InternalBiLang.g:3390:2: rule__BarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:3396:1: rule__BarPlot__Group_8__1__Impl : ( ( rule__BarPlot__LocationAssignment_8_1 ) ) ;
    public final void rule__BarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3400:1: ( ( ( rule__BarPlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:3401:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:3401:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:3402:2: ( rule__BarPlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getBarPlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:3403:2: ( rule__BarPlot__LocationAssignment_8_1 )
            // InternalBiLang.g:3403:3: rule__BarPlot__LocationAssignment_8_1
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
    // InternalBiLang.g:3412:1: rule__BarPlot__Group_9__0 : rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 ;
    public final void rule__BarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3416:1: ( rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 )
            // InternalBiLang.g:3417:2: rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1
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
    // InternalBiLang.g:3424:1: rule__BarPlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__BarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3428:1: ( ( 'colors' ) )
            // InternalBiLang.g:3429:1: ( 'colors' )
            {
            // InternalBiLang.g:3429:1: ( 'colors' )
            // InternalBiLang.g:3430:2: 'colors'
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
    // InternalBiLang.g:3439:1: rule__BarPlot__Group_9__1 : rule__BarPlot__Group_9__1__Impl ;
    public final void rule__BarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3443:1: ( rule__BarPlot__Group_9__1__Impl )
            // InternalBiLang.g:3444:2: rule__BarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:3450:1: rule__BarPlot__Group_9__1__Impl : ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__BarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3454:1: ( ( ( rule__BarPlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:3455:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:3455:1: ( ( rule__BarPlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:3456:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getBarPlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:3457:2: ( rule__BarPlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:3457:3: rule__BarPlot__ColorsAssignment_9_1
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
    // InternalBiLang.g:3466:1: rule__BarPlot__Group_10__0 : rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 ;
    public final void rule__BarPlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3470:1: ( rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 )
            // InternalBiLang.g:3471:2: rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1
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
    // InternalBiLang.g:3478:1: rule__BarPlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__BarPlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3482:1: ( ( 'thickness' ) )
            // InternalBiLang.g:3483:1: ( 'thickness' )
            {
            // InternalBiLang.g:3483:1: ( 'thickness' )
            // InternalBiLang.g:3484:2: 'thickness'
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
    // InternalBiLang.g:3493:1: rule__BarPlot__Group_10__1 : rule__BarPlot__Group_10__1__Impl ;
    public final void rule__BarPlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3497:1: ( rule__BarPlot__Group_10__1__Impl )
            // InternalBiLang.g:3498:2: rule__BarPlot__Group_10__1__Impl
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
    // InternalBiLang.g:3504:1: rule__BarPlot__Group_10__1__Impl : ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__BarPlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3508:1: ( ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:3509:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:3509:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:3510:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:3511:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:3511:3: rule__BarPlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:3520:1: rule__LinePlot__Group__0 : rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 ;
    public final void rule__LinePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3524:1: ( rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 )
            // InternalBiLang.g:3525:2: rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1
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
    // InternalBiLang.g:3532:1: rule__LinePlot__Group__0__Impl : ( () ) ;
    public final void rule__LinePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3536:1: ( ( () ) )
            // InternalBiLang.g:3537:1: ( () )
            {
            // InternalBiLang.g:3537:1: ( () )
            // InternalBiLang.g:3538:2: ()
            {
             before(grammarAccess.getLinePlotAccess().getLinePlotAction_0()); 
            // InternalBiLang.g:3539:2: ()
            // InternalBiLang.g:3539:3: 
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
    // InternalBiLang.g:3547:1: rule__LinePlot__Group__1 : rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 ;
    public final void rule__LinePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3551:1: ( rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 )
            // InternalBiLang.g:3552:2: rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2
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
    // InternalBiLang.g:3559:1: rule__LinePlot__Group__1__Impl : ( 'line' ) ;
    public final void rule__LinePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3563:1: ( ( 'line' ) )
            // InternalBiLang.g:3564:1: ( 'line' )
            {
            // InternalBiLang.g:3564:1: ( 'line' )
            // InternalBiLang.g:3565:2: 'line'
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
    // InternalBiLang.g:3574:1: rule__LinePlot__Group__2 : rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 ;
    public final void rule__LinePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3578:1: ( rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 )
            // InternalBiLang.g:3579:2: rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3
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
    // InternalBiLang.g:3586:1: rule__LinePlot__Group__2__Impl : ( ( rule__LinePlot__NameAssignment_2 ) ) ;
    public final void rule__LinePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3590:1: ( ( ( rule__LinePlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3591:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3591:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            // InternalBiLang.g:3592:2: ( rule__LinePlot__NameAssignment_2 )
            {
             before(grammarAccess.getLinePlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3593:2: ( rule__LinePlot__NameAssignment_2 )
            // InternalBiLang.g:3593:3: rule__LinePlot__NameAssignment_2
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
    // InternalBiLang.g:3601:1: rule__LinePlot__Group__3 : rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 ;
    public final void rule__LinePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3605:1: ( rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 )
            // InternalBiLang.g:3606:2: rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4
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
    // InternalBiLang.g:3613:1: rule__LinePlot__Group__3__Impl : ( '->' ) ;
    public final void rule__LinePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3617:1: ( ( '->' ) )
            // InternalBiLang.g:3618:1: ( '->' )
            {
            // InternalBiLang.g:3618:1: ( '->' )
            // InternalBiLang.g:3619:2: '->'
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
    // InternalBiLang.g:3628:1: rule__LinePlot__Group__4 : rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 ;
    public final void rule__LinePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3632:1: ( rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 )
            // InternalBiLang.g:3633:2: rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5
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
    // InternalBiLang.g:3640:1: rule__LinePlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__LinePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3644:1: ( ( 'xAx' ) )
            // InternalBiLang.g:3645:1: ( 'xAx' )
            {
            // InternalBiLang.g:3645:1: ( 'xAx' )
            // InternalBiLang.g:3646:2: 'xAx'
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
    // InternalBiLang.g:3655:1: rule__LinePlot__Group__5 : rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 ;
    public final void rule__LinePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3659:1: ( rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 )
            // InternalBiLang.g:3660:2: rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6
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
    // InternalBiLang.g:3667:1: rule__LinePlot__Group__5__Impl : ( ( rule__LinePlot__XAxisAssignment_5 ) ) ;
    public final void rule__LinePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3671:1: ( ( ( rule__LinePlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:3672:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:3672:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:3673:2: ( rule__LinePlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getLinePlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:3674:2: ( rule__LinePlot__XAxisAssignment_5 )
            // InternalBiLang.g:3674:3: rule__LinePlot__XAxisAssignment_5
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
    // InternalBiLang.g:3682:1: rule__LinePlot__Group__6 : rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 ;
    public final void rule__LinePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3686:1: ( rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 )
            // InternalBiLang.g:3687:2: rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7
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
    // InternalBiLang.g:3694:1: rule__LinePlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__LinePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3698:1: ( ( 'yA' ) )
            // InternalBiLang.g:3699:1: ( 'yA' )
            {
            // InternalBiLang.g:3699:1: ( 'yA' )
            // InternalBiLang.g:3700:2: 'yA'
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
    // InternalBiLang.g:3709:1: rule__LinePlot__Group__7 : rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 ;
    public final void rule__LinePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3713:1: ( rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 )
            // InternalBiLang.g:3714:2: rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8
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
    // InternalBiLang.g:3721:1: rule__LinePlot__Group__7__Impl : ( ( rule__LinePlot__YAxisAssignment_7 ) ) ;
    public final void rule__LinePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3725:1: ( ( ( rule__LinePlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3726:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3726:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3727:2: ( rule__LinePlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getLinePlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3728:2: ( rule__LinePlot__YAxisAssignment_7 )
            // InternalBiLang.g:3728:3: rule__LinePlot__YAxisAssignment_7
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
    // InternalBiLang.g:3736:1: rule__LinePlot__Group__8 : rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 ;
    public final void rule__LinePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3740:1: ( rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 )
            // InternalBiLang.g:3741:2: rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9
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
    // InternalBiLang.g:3748:1: rule__LinePlot__Group__8__Impl : ( ( rule__LinePlot__Group_8__0 )? ) ;
    public final void rule__LinePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3752:1: ( ( ( rule__LinePlot__Group_8__0 )? ) )
            // InternalBiLang.g:3753:1: ( ( rule__LinePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3753:1: ( ( rule__LinePlot__Group_8__0 )? )
            // InternalBiLang.g:3754:2: ( rule__LinePlot__Group_8__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_8()); 
            // InternalBiLang.g:3755:2: ( rule__LinePlot__Group_8__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBiLang.g:3755:3: rule__LinePlot__Group_8__0
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
    // InternalBiLang.g:3763:1: rule__LinePlot__Group__9 : rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 ;
    public final void rule__LinePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3767:1: ( rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 )
            // InternalBiLang.g:3768:2: rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10
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
    // InternalBiLang.g:3775:1: rule__LinePlot__Group__9__Impl : ( ( rule__LinePlot__Group_9__0 )? ) ;
    public final void rule__LinePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3779:1: ( ( ( rule__LinePlot__Group_9__0 )? ) )
            // InternalBiLang.g:3780:1: ( ( rule__LinePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:3780:1: ( ( rule__LinePlot__Group_9__0 )? )
            // InternalBiLang.g:3781:2: ( rule__LinePlot__Group_9__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_9()); 
            // InternalBiLang.g:3782:2: ( rule__LinePlot__Group_9__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBiLang.g:3782:3: rule__LinePlot__Group_9__0
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
    // InternalBiLang.g:3790:1: rule__LinePlot__Group__10 : rule__LinePlot__Group__10__Impl ;
    public final void rule__LinePlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3794:1: ( rule__LinePlot__Group__10__Impl )
            // InternalBiLang.g:3795:2: rule__LinePlot__Group__10__Impl
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
    // InternalBiLang.g:3801:1: rule__LinePlot__Group__10__Impl : ( ( rule__LinePlot__Group_10__0 )? ) ;
    public final void rule__LinePlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3805:1: ( ( ( rule__LinePlot__Group_10__0 )? ) )
            // InternalBiLang.g:3806:1: ( ( rule__LinePlot__Group_10__0 )? )
            {
            // InternalBiLang.g:3806:1: ( ( rule__LinePlot__Group_10__0 )? )
            // InternalBiLang.g:3807:2: ( rule__LinePlot__Group_10__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_10()); 
            // InternalBiLang.g:3808:2: ( rule__LinePlot__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBiLang.g:3808:3: rule__LinePlot__Group_10__0
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
    // InternalBiLang.g:3817:1: rule__LinePlot__Group_8__0 : rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 ;
    public final void rule__LinePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3821:1: ( rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 )
            // InternalBiLang.g:3822:2: rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:3829:1: rule__LinePlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__LinePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3833:1: ( ( 'loc' ) )
            // InternalBiLang.g:3834:1: ( 'loc' )
            {
            // InternalBiLang.g:3834:1: ( 'loc' )
            // InternalBiLang.g:3835:2: 'loc'
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
    // InternalBiLang.g:3844:1: rule__LinePlot__Group_8__1 : rule__LinePlot__Group_8__1__Impl ;
    public final void rule__LinePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3848:1: ( rule__LinePlot__Group_8__1__Impl )
            // InternalBiLang.g:3849:2: rule__LinePlot__Group_8__1__Impl
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
    // InternalBiLang.g:3855:1: rule__LinePlot__Group_8__1__Impl : ( ( rule__LinePlot__LocationAssignment_8_1 ) ) ;
    public final void rule__LinePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3859:1: ( ( ( rule__LinePlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:3860:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:3860:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:3861:2: ( rule__LinePlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:3862:2: ( rule__LinePlot__LocationAssignment_8_1 )
            // InternalBiLang.g:3862:3: rule__LinePlot__LocationAssignment_8_1
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
    // InternalBiLang.g:3871:1: rule__LinePlot__Group_9__0 : rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 ;
    public final void rule__LinePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3875:1: ( rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 )
            // InternalBiLang.g:3876:2: rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1
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
    // InternalBiLang.g:3883:1: rule__LinePlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__LinePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3887:1: ( ( 'colors' ) )
            // InternalBiLang.g:3888:1: ( 'colors' )
            {
            // InternalBiLang.g:3888:1: ( 'colors' )
            // InternalBiLang.g:3889:2: 'colors'
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
    // InternalBiLang.g:3898:1: rule__LinePlot__Group_9__1 : rule__LinePlot__Group_9__1__Impl ;
    public final void rule__LinePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3902:1: ( rule__LinePlot__Group_9__1__Impl )
            // InternalBiLang.g:3903:2: rule__LinePlot__Group_9__1__Impl
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
    // InternalBiLang.g:3909:1: rule__LinePlot__Group_9__1__Impl : ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) ;
    public final void rule__LinePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3913:1: ( ( ( rule__LinePlot__ColorsAssignment_9_1 ) ) )
            // InternalBiLang.g:3914:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            {
            // InternalBiLang.g:3914:1: ( ( rule__LinePlot__ColorsAssignment_9_1 ) )
            // InternalBiLang.g:3915:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            {
             before(grammarAccess.getLinePlotAccess().getColorsAssignment_9_1()); 
            // InternalBiLang.g:3916:2: ( rule__LinePlot__ColorsAssignment_9_1 )
            // InternalBiLang.g:3916:3: rule__LinePlot__ColorsAssignment_9_1
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
    // InternalBiLang.g:3925:1: rule__LinePlot__Group_10__0 : rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 ;
    public final void rule__LinePlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3929:1: ( rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 )
            // InternalBiLang.g:3930:2: rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1
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
    // InternalBiLang.g:3937:1: rule__LinePlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__LinePlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3941:1: ( ( 'thickness' ) )
            // InternalBiLang.g:3942:1: ( 'thickness' )
            {
            // InternalBiLang.g:3942:1: ( 'thickness' )
            // InternalBiLang.g:3943:2: 'thickness'
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
    // InternalBiLang.g:3952:1: rule__LinePlot__Group_10__1 : rule__LinePlot__Group_10__1__Impl ;
    public final void rule__LinePlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3956:1: ( rule__LinePlot__Group_10__1__Impl )
            // InternalBiLang.g:3957:2: rule__LinePlot__Group_10__1__Impl
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
    // InternalBiLang.g:3963:1: rule__LinePlot__Group_10__1__Impl : ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__LinePlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3967:1: ( ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:3968:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:3968:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:3969:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:3970:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:3970:3: rule__LinePlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:3979:1: rule__DonutPlot__Group__0 : rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 ;
    public final void rule__DonutPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3983:1: ( rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1 )
            // InternalBiLang.g:3984:2: rule__DonutPlot__Group__0__Impl rule__DonutPlot__Group__1
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
    // InternalBiLang.g:3991:1: rule__DonutPlot__Group__0__Impl : ( 'donut' ) ;
    public final void rule__DonutPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3995:1: ( ( 'donut' ) )
            // InternalBiLang.g:3996:1: ( 'donut' )
            {
            // InternalBiLang.g:3996:1: ( 'donut' )
            // InternalBiLang.g:3997:2: 'donut'
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
    // InternalBiLang.g:4006:1: rule__DonutPlot__Group__1 : rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 ;
    public final void rule__DonutPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4010:1: ( rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2 )
            // InternalBiLang.g:4011:2: rule__DonutPlot__Group__1__Impl rule__DonutPlot__Group__2
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
    // InternalBiLang.g:4018:1: rule__DonutPlot__Group__1__Impl : ( ( rule__DonutPlot__NameAssignment_1 ) ) ;
    public final void rule__DonutPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4022:1: ( ( ( rule__DonutPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4023:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4023:1: ( ( rule__DonutPlot__NameAssignment_1 ) )
            // InternalBiLang.g:4024:2: ( rule__DonutPlot__NameAssignment_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4025:2: ( rule__DonutPlot__NameAssignment_1 )
            // InternalBiLang.g:4025:3: rule__DonutPlot__NameAssignment_1
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
    // InternalBiLang.g:4033:1: rule__DonutPlot__Group__2 : rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 ;
    public final void rule__DonutPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4037:1: ( rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3 )
            // InternalBiLang.g:4038:2: rule__DonutPlot__Group__2__Impl rule__DonutPlot__Group__3
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
    // InternalBiLang.g:4045:1: rule__DonutPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__DonutPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4049:1: ( ( '->' ) )
            // InternalBiLang.g:4050:1: ( '->' )
            {
            // InternalBiLang.g:4050:1: ( '->' )
            // InternalBiLang.g:4051:2: '->'
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
    // InternalBiLang.g:4060:1: rule__DonutPlot__Group__3 : rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 ;
    public final void rule__DonutPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4064:1: ( rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4 )
            // InternalBiLang.g:4065:2: rule__DonutPlot__Group__3__Impl rule__DonutPlot__Group__4
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
    // InternalBiLang.g:4072:1: rule__DonutPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__DonutPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4076:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4077:1: ( 'xAx' )
            {
            // InternalBiLang.g:4077:1: ( 'xAx' )
            // InternalBiLang.g:4078:2: 'xAx'
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
    // InternalBiLang.g:4087:1: rule__DonutPlot__Group__4 : rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 ;
    public final void rule__DonutPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4091:1: ( rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5 )
            // InternalBiLang.g:4092:2: rule__DonutPlot__Group__4__Impl rule__DonutPlot__Group__5
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
    // InternalBiLang.g:4099:1: rule__DonutPlot__Group__4__Impl : ( ( rule__DonutPlot__XAxisAssignment_4 ) ) ;
    public final void rule__DonutPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4103:1: ( ( ( rule__DonutPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4104:1: ( ( rule__DonutPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4104:1: ( ( rule__DonutPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4105:2: ( rule__DonutPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getDonutPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4106:2: ( rule__DonutPlot__XAxisAssignment_4 )
            // InternalBiLang.g:4106:3: rule__DonutPlot__XAxisAssignment_4
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
    // InternalBiLang.g:4114:1: rule__DonutPlot__Group__5 : rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 ;
    public final void rule__DonutPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4118:1: ( rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6 )
            // InternalBiLang.g:4119:2: rule__DonutPlot__Group__5__Impl rule__DonutPlot__Group__6
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
    // InternalBiLang.g:4126:1: rule__DonutPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__DonutPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4130:1: ( ( 'yA' ) )
            // InternalBiLang.g:4131:1: ( 'yA' )
            {
            // InternalBiLang.g:4131:1: ( 'yA' )
            // InternalBiLang.g:4132:2: 'yA'
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
    // InternalBiLang.g:4141:1: rule__DonutPlot__Group__6 : rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7 ;
    public final void rule__DonutPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4145:1: ( rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7 )
            // InternalBiLang.g:4146:2: rule__DonutPlot__Group__6__Impl rule__DonutPlot__Group__7
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
    // InternalBiLang.g:4153:1: rule__DonutPlot__Group__6__Impl : ( ( rule__DonutPlot__YAxisAssignment_6 ) ) ;
    public final void rule__DonutPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4157:1: ( ( ( rule__DonutPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:4158:1: ( ( rule__DonutPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:4158:1: ( ( rule__DonutPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:4159:2: ( rule__DonutPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getDonutPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:4160:2: ( rule__DonutPlot__YAxisAssignment_6 )
            // InternalBiLang.g:4160:3: rule__DonutPlot__YAxisAssignment_6
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
    // InternalBiLang.g:4168:1: rule__DonutPlot__Group__7 : rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8 ;
    public final void rule__DonutPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4172:1: ( rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8 )
            // InternalBiLang.g:4173:2: rule__DonutPlot__Group__7__Impl rule__DonutPlot__Group__8
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
    // InternalBiLang.g:4180:1: rule__DonutPlot__Group__7__Impl : ( ( rule__DonutPlot__Group_7__0 )? ) ;
    public final void rule__DonutPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4184:1: ( ( ( rule__DonutPlot__Group_7__0 )? ) )
            // InternalBiLang.g:4185:1: ( ( rule__DonutPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:4185:1: ( ( rule__DonutPlot__Group_7__0 )? )
            // InternalBiLang.g:4186:2: ( rule__DonutPlot__Group_7__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_7()); 
            // InternalBiLang.g:4187:2: ( rule__DonutPlot__Group_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBiLang.g:4187:3: rule__DonutPlot__Group_7__0
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
    // InternalBiLang.g:4195:1: rule__DonutPlot__Group__8 : rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9 ;
    public final void rule__DonutPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4199:1: ( rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9 )
            // InternalBiLang.g:4200:2: rule__DonutPlot__Group__8__Impl rule__DonutPlot__Group__9
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
    // InternalBiLang.g:4207:1: rule__DonutPlot__Group__8__Impl : ( ( rule__DonutPlot__Group_8__0 )? ) ;
    public final void rule__DonutPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4211:1: ( ( ( rule__DonutPlot__Group_8__0 )? ) )
            // InternalBiLang.g:4212:1: ( ( rule__DonutPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4212:1: ( ( rule__DonutPlot__Group_8__0 )? )
            // InternalBiLang.g:4213:2: ( rule__DonutPlot__Group_8__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_8()); 
            // InternalBiLang.g:4214:2: ( rule__DonutPlot__Group_8__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:4214:3: rule__DonutPlot__Group_8__0
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
    // InternalBiLang.g:4222:1: rule__DonutPlot__Group__9 : rule__DonutPlot__Group__9__Impl ;
    public final void rule__DonutPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4226:1: ( rule__DonutPlot__Group__9__Impl )
            // InternalBiLang.g:4227:2: rule__DonutPlot__Group__9__Impl
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
    // InternalBiLang.g:4233:1: rule__DonutPlot__Group__9__Impl : ( ( rule__DonutPlot__Group_9__0 )? ) ;
    public final void rule__DonutPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4237:1: ( ( ( rule__DonutPlot__Group_9__0 )? ) )
            // InternalBiLang.g:4238:1: ( ( rule__DonutPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4238:1: ( ( rule__DonutPlot__Group_9__0 )? )
            // InternalBiLang.g:4239:2: ( rule__DonutPlot__Group_9__0 )?
            {
             before(grammarAccess.getDonutPlotAccess().getGroup_9()); 
            // InternalBiLang.g:4240:2: ( rule__DonutPlot__Group_9__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:4240:3: rule__DonutPlot__Group_9__0
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
    // InternalBiLang.g:4249:1: rule__DonutPlot__Group_7__0 : rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1 ;
    public final void rule__DonutPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4253:1: ( rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1 )
            // InternalBiLang.g:4254:2: rule__DonutPlot__Group_7__0__Impl rule__DonutPlot__Group_7__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:4261:1: rule__DonutPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__DonutPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4265:1: ( ( 'loc' ) )
            // InternalBiLang.g:4266:1: ( 'loc' )
            {
            // InternalBiLang.g:4266:1: ( 'loc' )
            // InternalBiLang.g:4267:2: 'loc'
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
    // InternalBiLang.g:4276:1: rule__DonutPlot__Group_7__1 : rule__DonutPlot__Group_7__1__Impl ;
    public final void rule__DonutPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4280:1: ( rule__DonutPlot__Group_7__1__Impl )
            // InternalBiLang.g:4281:2: rule__DonutPlot__Group_7__1__Impl
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
    // InternalBiLang.g:4287:1: rule__DonutPlot__Group_7__1__Impl : ( ( rule__DonutPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__DonutPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4291:1: ( ( ( rule__DonutPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:4292:1: ( ( rule__DonutPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:4292:1: ( ( rule__DonutPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:4293:2: ( rule__DonutPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:4294:2: ( rule__DonutPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:4294:3: rule__DonutPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:4303:1: rule__DonutPlot__Group_8__0 : rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1 ;
    public final void rule__DonutPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4307:1: ( rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1 )
            // InternalBiLang.g:4308:2: rule__DonutPlot__Group_8__0__Impl rule__DonutPlot__Group_8__1
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
    // InternalBiLang.g:4315:1: rule__DonutPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__DonutPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4319:1: ( ( 'colors' ) )
            // InternalBiLang.g:4320:1: ( 'colors' )
            {
            // InternalBiLang.g:4320:1: ( 'colors' )
            // InternalBiLang.g:4321:2: 'colors'
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
    // InternalBiLang.g:4330:1: rule__DonutPlot__Group_8__1 : rule__DonutPlot__Group_8__1__Impl ;
    public final void rule__DonutPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4334:1: ( rule__DonutPlot__Group_8__1__Impl )
            // InternalBiLang.g:4335:2: rule__DonutPlot__Group_8__1__Impl
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
    // InternalBiLang.g:4341:1: rule__DonutPlot__Group_8__1__Impl : ( ( rule__DonutPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__DonutPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4345:1: ( ( ( rule__DonutPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:4346:1: ( ( rule__DonutPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:4346:1: ( ( rule__DonutPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:4347:2: ( rule__DonutPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:4348:2: ( rule__DonutPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:4348:3: rule__DonutPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:4357:1: rule__DonutPlot__Group_9__0 : rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1 ;
    public final void rule__DonutPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4361:1: ( rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1 )
            // InternalBiLang.g:4362:2: rule__DonutPlot__Group_9__0__Impl rule__DonutPlot__Group_9__1
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
    // InternalBiLang.g:4369:1: rule__DonutPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__DonutPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4373:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4374:1: ( 'thickness' )
            {
            // InternalBiLang.g:4374:1: ( 'thickness' )
            // InternalBiLang.g:4375:2: 'thickness'
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
    // InternalBiLang.g:4384:1: rule__DonutPlot__Group_9__1 : rule__DonutPlot__Group_9__1__Impl ;
    public final void rule__DonutPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4388:1: ( rule__DonutPlot__Group_9__1__Impl )
            // InternalBiLang.g:4389:2: rule__DonutPlot__Group_9__1__Impl
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
    // InternalBiLang.g:4395:1: rule__DonutPlot__Group_9__1__Impl : ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__DonutPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4399:1: ( ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:4400:1: ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:4400:1: ( ( rule__DonutPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:4401:2: ( rule__DonutPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getDonutPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:4402:2: ( rule__DonutPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:4402:3: rule__DonutPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:4411:1: rule__PiePlot__Group__0 : rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 ;
    public final void rule__PiePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4415:1: ( rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1 )
            // InternalBiLang.g:4416:2: rule__PiePlot__Group__0__Impl rule__PiePlot__Group__1
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
    // InternalBiLang.g:4423:1: rule__PiePlot__Group__0__Impl : ( 'pie' ) ;
    public final void rule__PiePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4427:1: ( ( 'pie' ) )
            // InternalBiLang.g:4428:1: ( 'pie' )
            {
            // InternalBiLang.g:4428:1: ( 'pie' )
            // InternalBiLang.g:4429:2: 'pie'
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
    // InternalBiLang.g:4438:1: rule__PiePlot__Group__1 : rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 ;
    public final void rule__PiePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4442:1: ( rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2 )
            // InternalBiLang.g:4443:2: rule__PiePlot__Group__1__Impl rule__PiePlot__Group__2
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
    // InternalBiLang.g:4450:1: rule__PiePlot__Group__1__Impl : ( ( rule__PiePlot__NameAssignment_1 ) ) ;
    public final void rule__PiePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4454:1: ( ( ( rule__PiePlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4455:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4455:1: ( ( rule__PiePlot__NameAssignment_1 ) )
            // InternalBiLang.g:4456:2: ( rule__PiePlot__NameAssignment_1 )
            {
             before(grammarAccess.getPiePlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4457:2: ( rule__PiePlot__NameAssignment_1 )
            // InternalBiLang.g:4457:3: rule__PiePlot__NameAssignment_1
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
    // InternalBiLang.g:4465:1: rule__PiePlot__Group__2 : rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 ;
    public final void rule__PiePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4469:1: ( rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3 )
            // InternalBiLang.g:4470:2: rule__PiePlot__Group__2__Impl rule__PiePlot__Group__3
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
    // InternalBiLang.g:4477:1: rule__PiePlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PiePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4481:1: ( ( '->' ) )
            // InternalBiLang.g:4482:1: ( '->' )
            {
            // InternalBiLang.g:4482:1: ( '->' )
            // InternalBiLang.g:4483:2: '->'
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
    // InternalBiLang.g:4492:1: rule__PiePlot__Group__3 : rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 ;
    public final void rule__PiePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4496:1: ( rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4 )
            // InternalBiLang.g:4497:2: rule__PiePlot__Group__3__Impl rule__PiePlot__Group__4
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
    // InternalBiLang.g:4504:1: rule__PiePlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PiePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4508:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4509:1: ( 'xAx' )
            {
            // InternalBiLang.g:4509:1: ( 'xAx' )
            // InternalBiLang.g:4510:2: 'xAx'
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
    // InternalBiLang.g:4519:1: rule__PiePlot__Group__4 : rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 ;
    public final void rule__PiePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4523:1: ( rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5 )
            // InternalBiLang.g:4524:2: rule__PiePlot__Group__4__Impl rule__PiePlot__Group__5
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
    // InternalBiLang.g:4531:1: rule__PiePlot__Group__4__Impl : ( ( rule__PiePlot__XAxisAssignment_4 ) ) ;
    public final void rule__PiePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4535:1: ( ( ( rule__PiePlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4536:1: ( ( rule__PiePlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4536:1: ( ( rule__PiePlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4537:2: ( rule__PiePlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPiePlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4538:2: ( rule__PiePlot__XAxisAssignment_4 )
            // InternalBiLang.g:4538:3: rule__PiePlot__XAxisAssignment_4
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
    // InternalBiLang.g:4546:1: rule__PiePlot__Group__5 : rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 ;
    public final void rule__PiePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4550:1: ( rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6 )
            // InternalBiLang.g:4551:2: rule__PiePlot__Group__5__Impl rule__PiePlot__Group__6
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
    // InternalBiLang.g:4558:1: rule__PiePlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PiePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4562:1: ( ( 'yA' ) )
            // InternalBiLang.g:4563:1: ( 'yA' )
            {
            // InternalBiLang.g:4563:1: ( 'yA' )
            // InternalBiLang.g:4564:2: 'yA'
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
    // InternalBiLang.g:4573:1: rule__PiePlot__Group__6 : rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7 ;
    public final void rule__PiePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4577:1: ( rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7 )
            // InternalBiLang.g:4578:2: rule__PiePlot__Group__6__Impl rule__PiePlot__Group__7
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
    // InternalBiLang.g:4585:1: rule__PiePlot__Group__6__Impl : ( ( rule__PiePlot__YAxisAssignment_6 ) ) ;
    public final void rule__PiePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4589:1: ( ( ( rule__PiePlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:4590:1: ( ( rule__PiePlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:4590:1: ( ( rule__PiePlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:4591:2: ( rule__PiePlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPiePlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:4592:2: ( rule__PiePlot__YAxisAssignment_6 )
            // InternalBiLang.g:4592:3: rule__PiePlot__YAxisAssignment_6
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
    // InternalBiLang.g:4600:1: rule__PiePlot__Group__7 : rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8 ;
    public final void rule__PiePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4604:1: ( rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8 )
            // InternalBiLang.g:4605:2: rule__PiePlot__Group__7__Impl rule__PiePlot__Group__8
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
    // InternalBiLang.g:4612:1: rule__PiePlot__Group__7__Impl : ( ( rule__PiePlot__Group_7__0 )? ) ;
    public final void rule__PiePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4616:1: ( ( ( rule__PiePlot__Group_7__0 )? ) )
            // InternalBiLang.g:4617:1: ( ( rule__PiePlot__Group_7__0 )? )
            {
            // InternalBiLang.g:4617:1: ( ( rule__PiePlot__Group_7__0 )? )
            // InternalBiLang.g:4618:2: ( rule__PiePlot__Group_7__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_7()); 
            // InternalBiLang.g:4619:2: ( rule__PiePlot__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:4619:3: rule__PiePlot__Group_7__0
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
    // InternalBiLang.g:4627:1: rule__PiePlot__Group__8 : rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9 ;
    public final void rule__PiePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4631:1: ( rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9 )
            // InternalBiLang.g:4632:2: rule__PiePlot__Group__8__Impl rule__PiePlot__Group__9
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
    // InternalBiLang.g:4639:1: rule__PiePlot__Group__8__Impl : ( ( rule__PiePlot__Group_8__0 )? ) ;
    public final void rule__PiePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4643:1: ( ( ( rule__PiePlot__Group_8__0 )? ) )
            // InternalBiLang.g:4644:1: ( ( rule__PiePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:4644:1: ( ( rule__PiePlot__Group_8__0 )? )
            // InternalBiLang.g:4645:2: ( rule__PiePlot__Group_8__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_8()); 
            // InternalBiLang.g:4646:2: ( rule__PiePlot__Group_8__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:4646:3: rule__PiePlot__Group_8__0
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
    // InternalBiLang.g:4654:1: rule__PiePlot__Group__9 : rule__PiePlot__Group__9__Impl ;
    public final void rule__PiePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4658:1: ( rule__PiePlot__Group__9__Impl )
            // InternalBiLang.g:4659:2: rule__PiePlot__Group__9__Impl
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
    // InternalBiLang.g:4665:1: rule__PiePlot__Group__9__Impl : ( ( rule__PiePlot__Group_9__0 )? ) ;
    public final void rule__PiePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4669:1: ( ( ( rule__PiePlot__Group_9__0 )? ) )
            // InternalBiLang.g:4670:1: ( ( rule__PiePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:4670:1: ( ( rule__PiePlot__Group_9__0 )? )
            // InternalBiLang.g:4671:2: ( rule__PiePlot__Group_9__0 )?
            {
             before(grammarAccess.getPiePlotAccess().getGroup_9()); 
            // InternalBiLang.g:4672:2: ( rule__PiePlot__Group_9__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==51) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:4672:3: rule__PiePlot__Group_9__0
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
    // InternalBiLang.g:4681:1: rule__PiePlot__Group_7__0 : rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1 ;
    public final void rule__PiePlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4685:1: ( rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1 )
            // InternalBiLang.g:4686:2: rule__PiePlot__Group_7__0__Impl rule__PiePlot__Group_7__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:4693:1: rule__PiePlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PiePlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4697:1: ( ( 'loc' ) )
            // InternalBiLang.g:4698:1: ( 'loc' )
            {
            // InternalBiLang.g:4698:1: ( 'loc' )
            // InternalBiLang.g:4699:2: 'loc'
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
    // InternalBiLang.g:4708:1: rule__PiePlot__Group_7__1 : rule__PiePlot__Group_7__1__Impl ;
    public final void rule__PiePlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4712:1: ( rule__PiePlot__Group_7__1__Impl )
            // InternalBiLang.g:4713:2: rule__PiePlot__Group_7__1__Impl
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
    // InternalBiLang.g:4719:1: rule__PiePlot__Group_7__1__Impl : ( ( rule__PiePlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PiePlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4723:1: ( ( ( rule__PiePlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:4724:1: ( ( rule__PiePlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:4724:1: ( ( rule__PiePlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:4725:2: ( rule__PiePlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPiePlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:4726:2: ( rule__PiePlot__LocationAssignment_7_1 )
            // InternalBiLang.g:4726:3: rule__PiePlot__LocationAssignment_7_1
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
    // InternalBiLang.g:4735:1: rule__PiePlot__Group_8__0 : rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1 ;
    public final void rule__PiePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4739:1: ( rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1 )
            // InternalBiLang.g:4740:2: rule__PiePlot__Group_8__0__Impl rule__PiePlot__Group_8__1
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
    // InternalBiLang.g:4747:1: rule__PiePlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PiePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4751:1: ( ( 'colors' ) )
            // InternalBiLang.g:4752:1: ( 'colors' )
            {
            // InternalBiLang.g:4752:1: ( 'colors' )
            // InternalBiLang.g:4753:2: 'colors'
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
    // InternalBiLang.g:4762:1: rule__PiePlot__Group_8__1 : rule__PiePlot__Group_8__1__Impl ;
    public final void rule__PiePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4766:1: ( rule__PiePlot__Group_8__1__Impl )
            // InternalBiLang.g:4767:2: rule__PiePlot__Group_8__1__Impl
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
    // InternalBiLang.g:4773:1: rule__PiePlot__Group_8__1__Impl : ( ( rule__PiePlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PiePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4777:1: ( ( ( rule__PiePlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:4778:1: ( ( rule__PiePlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:4778:1: ( ( rule__PiePlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:4779:2: ( rule__PiePlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPiePlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:4780:2: ( rule__PiePlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:4780:3: rule__PiePlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:4789:1: rule__PiePlot__Group_9__0 : rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1 ;
    public final void rule__PiePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4793:1: ( rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1 )
            // InternalBiLang.g:4794:2: rule__PiePlot__Group_9__0__Impl rule__PiePlot__Group_9__1
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
    // InternalBiLang.g:4801:1: rule__PiePlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PiePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4805:1: ( ( 'thickness' ) )
            // InternalBiLang.g:4806:1: ( 'thickness' )
            {
            // InternalBiLang.g:4806:1: ( 'thickness' )
            // InternalBiLang.g:4807:2: 'thickness'
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
    // InternalBiLang.g:4816:1: rule__PiePlot__Group_9__1 : rule__PiePlot__Group_9__1__Impl ;
    public final void rule__PiePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4820:1: ( rule__PiePlot__Group_9__1__Impl )
            // InternalBiLang.g:4821:2: rule__PiePlot__Group_9__1__Impl
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
    // InternalBiLang.g:4827:1: rule__PiePlot__Group_9__1__Impl : ( ( rule__PiePlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PiePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4831:1: ( ( ( rule__PiePlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:4832:1: ( ( rule__PiePlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:4832:1: ( ( rule__PiePlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:4833:2: ( rule__PiePlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPiePlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:4834:2: ( rule__PiePlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:4834:3: rule__PiePlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:4843:1: rule__PolarPlot__Group__0 : rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 ;
    public final void rule__PolarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4847:1: ( rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1 )
            // InternalBiLang.g:4848:2: rule__PolarPlot__Group__0__Impl rule__PolarPlot__Group__1
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
    // InternalBiLang.g:4855:1: rule__PolarPlot__Group__0__Impl : ( 'polar' ) ;
    public final void rule__PolarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4859:1: ( ( 'polar' ) )
            // InternalBiLang.g:4860:1: ( 'polar' )
            {
            // InternalBiLang.g:4860:1: ( 'polar' )
            // InternalBiLang.g:4861:2: 'polar'
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
    // InternalBiLang.g:4870:1: rule__PolarPlot__Group__1 : rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 ;
    public final void rule__PolarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4874:1: ( rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2 )
            // InternalBiLang.g:4875:2: rule__PolarPlot__Group__1__Impl rule__PolarPlot__Group__2
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
    // InternalBiLang.g:4882:1: rule__PolarPlot__Group__1__Impl : ( ( rule__PolarPlot__NameAssignment_1 ) ) ;
    public final void rule__PolarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4886:1: ( ( ( rule__PolarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:4887:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:4887:1: ( ( rule__PolarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:4888:2: ( rule__PolarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:4889:2: ( rule__PolarPlot__NameAssignment_1 )
            // InternalBiLang.g:4889:3: rule__PolarPlot__NameAssignment_1
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
    // InternalBiLang.g:4897:1: rule__PolarPlot__Group__2 : rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 ;
    public final void rule__PolarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4901:1: ( rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3 )
            // InternalBiLang.g:4902:2: rule__PolarPlot__Group__2__Impl rule__PolarPlot__Group__3
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
    // InternalBiLang.g:4909:1: rule__PolarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__PolarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4913:1: ( ( '->' ) )
            // InternalBiLang.g:4914:1: ( '->' )
            {
            // InternalBiLang.g:4914:1: ( '->' )
            // InternalBiLang.g:4915:2: '->'
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
    // InternalBiLang.g:4924:1: rule__PolarPlot__Group__3 : rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 ;
    public final void rule__PolarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4928:1: ( rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4 )
            // InternalBiLang.g:4929:2: rule__PolarPlot__Group__3__Impl rule__PolarPlot__Group__4
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
    // InternalBiLang.g:4936:1: rule__PolarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__PolarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4940:1: ( ( 'xAx' ) )
            // InternalBiLang.g:4941:1: ( 'xAx' )
            {
            // InternalBiLang.g:4941:1: ( 'xAx' )
            // InternalBiLang.g:4942:2: 'xAx'
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
    // InternalBiLang.g:4951:1: rule__PolarPlot__Group__4 : rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 ;
    public final void rule__PolarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4955:1: ( rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5 )
            // InternalBiLang.g:4956:2: rule__PolarPlot__Group__4__Impl rule__PolarPlot__Group__5
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
    // InternalBiLang.g:4963:1: rule__PolarPlot__Group__4__Impl : ( ( rule__PolarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__PolarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4967:1: ( ( ( rule__PolarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:4968:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:4968:1: ( ( rule__PolarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:4969:2: ( rule__PolarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getPolarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:4970:2: ( rule__PolarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:4970:3: rule__PolarPlot__XAxisAssignment_4
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
    // InternalBiLang.g:4978:1: rule__PolarPlot__Group__5 : rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 ;
    public final void rule__PolarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4982:1: ( rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6 )
            // InternalBiLang.g:4983:2: rule__PolarPlot__Group__5__Impl rule__PolarPlot__Group__6
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
    // InternalBiLang.g:4990:1: rule__PolarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__PolarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4994:1: ( ( 'yA' ) )
            // InternalBiLang.g:4995:1: ( 'yA' )
            {
            // InternalBiLang.g:4995:1: ( 'yA' )
            // InternalBiLang.g:4996:2: 'yA'
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
    // InternalBiLang.g:5005:1: rule__PolarPlot__Group__6 : rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 ;
    public final void rule__PolarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5009:1: ( rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7 )
            // InternalBiLang.g:5010:2: rule__PolarPlot__Group__6__Impl rule__PolarPlot__Group__7
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
    // InternalBiLang.g:5017:1: rule__PolarPlot__Group__6__Impl : ( ( rule__PolarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__PolarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5021:1: ( ( ( rule__PolarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5022:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5022:1: ( ( rule__PolarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5023:2: ( rule__PolarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getPolarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5024:2: ( rule__PolarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5024:3: rule__PolarPlot__YAxisAssignment_6
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
    // InternalBiLang.g:5032:1: rule__PolarPlot__Group__7 : rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 ;
    public final void rule__PolarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5036:1: ( rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8 )
            // InternalBiLang.g:5037:2: rule__PolarPlot__Group__7__Impl rule__PolarPlot__Group__8
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
    // InternalBiLang.g:5044:1: rule__PolarPlot__Group__7__Impl : ( ( rule__PolarPlot__Group_7__0 )? ) ;
    public final void rule__PolarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5048:1: ( ( ( rule__PolarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5049:1: ( ( rule__PolarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5049:1: ( ( rule__PolarPlot__Group_7__0 )? )
            // InternalBiLang.g:5050:2: ( rule__PolarPlot__Group_7__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5051:2: ( rule__PolarPlot__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:5051:3: rule__PolarPlot__Group_7__0
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
    // InternalBiLang.g:5059:1: rule__PolarPlot__Group__8 : rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 ;
    public final void rule__PolarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5063:1: ( rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9 )
            // InternalBiLang.g:5064:2: rule__PolarPlot__Group__8__Impl rule__PolarPlot__Group__9
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
    // InternalBiLang.g:5071:1: rule__PolarPlot__Group__8__Impl : ( ( rule__PolarPlot__Group_8__0 )? ) ;
    public final void rule__PolarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5075:1: ( ( ( rule__PolarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5076:1: ( ( rule__PolarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5076:1: ( ( rule__PolarPlot__Group_8__0 )? )
            // InternalBiLang.g:5077:2: ( rule__PolarPlot__Group_8__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5078:2: ( rule__PolarPlot__Group_8__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:5078:3: rule__PolarPlot__Group_8__0
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
    // InternalBiLang.g:5086:1: rule__PolarPlot__Group__9 : rule__PolarPlot__Group__9__Impl ;
    public final void rule__PolarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5090:1: ( rule__PolarPlot__Group__9__Impl )
            // InternalBiLang.g:5091:2: rule__PolarPlot__Group__9__Impl
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
    // InternalBiLang.g:5097:1: rule__PolarPlot__Group__9__Impl : ( ( rule__PolarPlot__Group_9__0 )? ) ;
    public final void rule__PolarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5101:1: ( ( ( rule__PolarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5102:1: ( ( rule__PolarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5102:1: ( ( rule__PolarPlot__Group_9__0 )? )
            // InternalBiLang.g:5103:2: ( rule__PolarPlot__Group_9__0 )?
            {
             before(grammarAccess.getPolarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5104:2: ( rule__PolarPlot__Group_9__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:5104:3: rule__PolarPlot__Group_9__0
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
    // InternalBiLang.g:5113:1: rule__PolarPlot__Group_7__0 : rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 ;
    public final void rule__PolarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5117:1: ( rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1 )
            // InternalBiLang.g:5118:2: rule__PolarPlot__Group_7__0__Impl rule__PolarPlot__Group_7__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:5125:1: rule__PolarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__PolarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5129:1: ( ( 'loc' ) )
            // InternalBiLang.g:5130:1: ( 'loc' )
            {
            // InternalBiLang.g:5130:1: ( 'loc' )
            // InternalBiLang.g:5131:2: 'loc'
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
    // InternalBiLang.g:5140:1: rule__PolarPlot__Group_7__1 : rule__PolarPlot__Group_7__1__Impl ;
    public final void rule__PolarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5144:1: ( rule__PolarPlot__Group_7__1__Impl )
            // InternalBiLang.g:5145:2: rule__PolarPlot__Group_7__1__Impl
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
    // InternalBiLang.g:5151:1: rule__PolarPlot__Group_7__1__Impl : ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__PolarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5155:1: ( ( ( rule__PolarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5156:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5156:1: ( ( rule__PolarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5157:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5158:2: ( rule__PolarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5158:3: rule__PolarPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:5167:1: rule__PolarPlot__Group_8__0 : rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 ;
    public final void rule__PolarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5171:1: ( rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1 )
            // InternalBiLang.g:5172:2: rule__PolarPlot__Group_8__0__Impl rule__PolarPlot__Group_8__1
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
    // InternalBiLang.g:5179:1: rule__PolarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__PolarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5183:1: ( ( 'colors' ) )
            // InternalBiLang.g:5184:1: ( 'colors' )
            {
            // InternalBiLang.g:5184:1: ( 'colors' )
            // InternalBiLang.g:5185:2: 'colors'
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
    // InternalBiLang.g:5194:1: rule__PolarPlot__Group_8__1 : rule__PolarPlot__Group_8__1__Impl ;
    public final void rule__PolarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5198:1: ( rule__PolarPlot__Group_8__1__Impl )
            // InternalBiLang.g:5199:2: rule__PolarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:5205:1: rule__PolarPlot__Group_8__1__Impl : ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__PolarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5209:1: ( ( ( rule__PolarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5210:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5210:1: ( ( rule__PolarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5211:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5212:2: ( rule__PolarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5212:3: rule__PolarPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:5221:1: rule__PolarPlot__Group_9__0 : rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 ;
    public final void rule__PolarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5225:1: ( rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1 )
            // InternalBiLang.g:5226:2: rule__PolarPlot__Group_9__0__Impl rule__PolarPlot__Group_9__1
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
    // InternalBiLang.g:5233:1: rule__PolarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__PolarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5237:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5238:1: ( 'thickness' )
            {
            // InternalBiLang.g:5238:1: ( 'thickness' )
            // InternalBiLang.g:5239:2: 'thickness'
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
    // InternalBiLang.g:5248:1: rule__PolarPlot__Group_9__1 : rule__PolarPlot__Group_9__1__Impl ;
    public final void rule__PolarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5252:1: ( rule__PolarPlot__Group_9__1__Impl )
            // InternalBiLang.g:5253:2: rule__PolarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:5259:1: rule__PolarPlot__Group_9__1__Impl : ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__PolarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5263:1: ( ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5264:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5264:1: ( ( rule__PolarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5265:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getPolarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5266:2: ( rule__PolarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5266:3: rule__PolarPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:5275:1: rule__ScatterPlot__Group__0 : rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 ;
    public final void rule__ScatterPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5279:1: ( rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1 )
            // InternalBiLang.g:5280:2: rule__ScatterPlot__Group__0__Impl rule__ScatterPlot__Group__1
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
    // InternalBiLang.g:5287:1: rule__ScatterPlot__Group__0__Impl : ( 'scatter' ) ;
    public final void rule__ScatterPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5291:1: ( ( 'scatter' ) )
            // InternalBiLang.g:5292:1: ( 'scatter' )
            {
            // InternalBiLang.g:5292:1: ( 'scatter' )
            // InternalBiLang.g:5293:2: 'scatter'
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
    // InternalBiLang.g:5302:1: rule__ScatterPlot__Group__1 : rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 ;
    public final void rule__ScatterPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5306:1: ( rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2 )
            // InternalBiLang.g:5307:2: rule__ScatterPlot__Group__1__Impl rule__ScatterPlot__Group__2
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
    // InternalBiLang.g:5314:1: rule__ScatterPlot__Group__1__Impl : ( ( rule__ScatterPlot__NameAssignment_1 ) ) ;
    public final void rule__ScatterPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5318:1: ( ( ( rule__ScatterPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5319:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5319:1: ( ( rule__ScatterPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5320:2: ( rule__ScatterPlot__NameAssignment_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5321:2: ( rule__ScatterPlot__NameAssignment_1 )
            // InternalBiLang.g:5321:3: rule__ScatterPlot__NameAssignment_1
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
    // InternalBiLang.g:5329:1: rule__ScatterPlot__Group__2 : rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 ;
    public final void rule__ScatterPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5333:1: ( rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3 )
            // InternalBiLang.g:5334:2: rule__ScatterPlot__Group__2__Impl rule__ScatterPlot__Group__3
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
    // InternalBiLang.g:5341:1: rule__ScatterPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__ScatterPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5345:1: ( ( '->' ) )
            // InternalBiLang.g:5346:1: ( '->' )
            {
            // InternalBiLang.g:5346:1: ( '->' )
            // InternalBiLang.g:5347:2: '->'
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
    // InternalBiLang.g:5356:1: rule__ScatterPlot__Group__3 : rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 ;
    public final void rule__ScatterPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5360:1: ( rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4 )
            // InternalBiLang.g:5361:2: rule__ScatterPlot__Group__3__Impl rule__ScatterPlot__Group__4
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
    // InternalBiLang.g:5368:1: rule__ScatterPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__ScatterPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5372:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5373:1: ( 'xAx' )
            {
            // InternalBiLang.g:5373:1: ( 'xAx' )
            // InternalBiLang.g:5374:2: 'xAx'
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
    // InternalBiLang.g:5383:1: rule__ScatterPlot__Group__4 : rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 ;
    public final void rule__ScatterPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5387:1: ( rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5 )
            // InternalBiLang.g:5388:2: rule__ScatterPlot__Group__4__Impl rule__ScatterPlot__Group__5
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
    // InternalBiLang.g:5395:1: rule__ScatterPlot__Group__4__Impl : ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) ;
    public final void rule__ScatterPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5399:1: ( ( ( rule__ScatterPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5400:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5400:1: ( ( rule__ScatterPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5401:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getScatterPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5402:2: ( rule__ScatterPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5402:3: rule__ScatterPlot__XAxisAssignment_4
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
    // InternalBiLang.g:5410:1: rule__ScatterPlot__Group__5 : rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 ;
    public final void rule__ScatterPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5414:1: ( rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6 )
            // InternalBiLang.g:5415:2: rule__ScatterPlot__Group__5__Impl rule__ScatterPlot__Group__6
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
    // InternalBiLang.g:5422:1: rule__ScatterPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__ScatterPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5426:1: ( ( 'yA' ) )
            // InternalBiLang.g:5427:1: ( 'yA' )
            {
            // InternalBiLang.g:5427:1: ( 'yA' )
            // InternalBiLang.g:5428:2: 'yA'
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
    // InternalBiLang.g:5437:1: rule__ScatterPlot__Group__6 : rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 ;
    public final void rule__ScatterPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5441:1: ( rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7 )
            // InternalBiLang.g:5442:2: rule__ScatterPlot__Group__6__Impl rule__ScatterPlot__Group__7
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
    // InternalBiLang.g:5449:1: rule__ScatterPlot__Group__6__Impl : ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) ;
    public final void rule__ScatterPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5453:1: ( ( ( rule__ScatterPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5454:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5454:1: ( ( rule__ScatterPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5455:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getScatterPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5456:2: ( rule__ScatterPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5456:3: rule__ScatterPlot__YAxisAssignment_6
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
    // InternalBiLang.g:5464:1: rule__ScatterPlot__Group__7 : rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 ;
    public final void rule__ScatterPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5468:1: ( rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8 )
            // InternalBiLang.g:5469:2: rule__ScatterPlot__Group__7__Impl rule__ScatterPlot__Group__8
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
    // InternalBiLang.g:5476:1: rule__ScatterPlot__Group__7__Impl : ( ( rule__ScatterPlot__Group_7__0 )? ) ;
    public final void rule__ScatterPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5480:1: ( ( ( rule__ScatterPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5481:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5481:1: ( ( rule__ScatterPlot__Group_7__0 )? )
            // InternalBiLang.g:5482:2: ( rule__ScatterPlot__Group_7__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5483:2: ( rule__ScatterPlot__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:5483:3: rule__ScatterPlot__Group_7__0
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
    // InternalBiLang.g:5491:1: rule__ScatterPlot__Group__8 : rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 ;
    public final void rule__ScatterPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5495:1: ( rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9 )
            // InternalBiLang.g:5496:2: rule__ScatterPlot__Group__8__Impl rule__ScatterPlot__Group__9
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
    // InternalBiLang.g:5503:1: rule__ScatterPlot__Group__8__Impl : ( ( rule__ScatterPlot__Group_8__0 )? ) ;
    public final void rule__ScatterPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5507:1: ( ( ( rule__ScatterPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5508:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5508:1: ( ( rule__ScatterPlot__Group_8__0 )? )
            // InternalBiLang.g:5509:2: ( rule__ScatterPlot__Group_8__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5510:2: ( rule__ScatterPlot__Group_8__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:5510:3: rule__ScatterPlot__Group_8__0
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
    // InternalBiLang.g:5518:1: rule__ScatterPlot__Group__9 : rule__ScatterPlot__Group__9__Impl ;
    public final void rule__ScatterPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5522:1: ( rule__ScatterPlot__Group__9__Impl )
            // InternalBiLang.g:5523:2: rule__ScatterPlot__Group__9__Impl
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
    // InternalBiLang.g:5529:1: rule__ScatterPlot__Group__9__Impl : ( ( rule__ScatterPlot__Group_9__0 )? ) ;
    public final void rule__ScatterPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5533:1: ( ( ( rule__ScatterPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5534:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5534:1: ( ( rule__ScatterPlot__Group_9__0 )? )
            // InternalBiLang.g:5535:2: ( rule__ScatterPlot__Group_9__0 )?
            {
             before(grammarAccess.getScatterPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5536:2: ( rule__ScatterPlot__Group_9__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:5536:3: rule__ScatterPlot__Group_9__0
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
    // InternalBiLang.g:5545:1: rule__ScatterPlot__Group_7__0 : rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 ;
    public final void rule__ScatterPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5549:1: ( rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1 )
            // InternalBiLang.g:5550:2: rule__ScatterPlot__Group_7__0__Impl rule__ScatterPlot__Group_7__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:5557:1: rule__ScatterPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__ScatterPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5561:1: ( ( 'loc' ) )
            // InternalBiLang.g:5562:1: ( 'loc' )
            {
            // InternalBiLang.g:5562:1: ( 'loc' )
            // InternalBiLang.g:5563:2: 'loc'
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
    // InternalBiLang.g:5572:1: rule__ScatterPlot__Group_7__1 : rule__ScatterPlot__Group_7__1__Impl ;
    public final void rule__ScatterPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5576:1: ( rule__ScatterPlot__Group_7__1__Impl )
            // InternalBiLang.g:5577:2: rule__ScatterPlot__Group_7__1__Impl
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
    // InternalBiLang.g:5583:1: rule__ScatterPlot__Group_7__1__Impl : ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__ScatterPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5587:1: ( ( ( rule__ScatterPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:5588:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:5588:1: ( ( rule__ScatterPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:5589:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:5590:2: ( rule__ScatterPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:5590:3: rule__ScatterPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:5599:1: rule__ScatterPlot__Group_8__0 : rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 ;
    public final void rule__ScatterPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5603:1: ( rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1 )
            // InternalBiLang.g:5604:2: rule__ScatterPlot__Group_8__0__Impl rule__ScatterPlot__Group_8__1
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
    // InternalBiLang.g:5611:1: rule__ScatterPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__ScatterPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5615:1: ( ( 'colors' ) )
            // InternalBiLang.g:5616:1: ( 'colors' )
            {
            // InternalBiLang.g:5616:1: ( 'colors' )
            // InternalBiLang.g:5617:2: 'colors'
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
    // InternalBiLang.g:5626:1: rule__ScatterPlot__Group_8__1 : rule__ScatterPlot__Group_8__1__Impl ;
    public final void rule__ScatterPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5630:1: ( rule__ScatterPlot__Group_8__1__Impl )
            // InternalBiLang.g:5631:2: rule__ScatterPlot__Group_8__1__Impl
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
    // InternalBiLang.g:5637:1: rule__ScatterPlot__Group_8__1__Impl : ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__ScatterPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5641:1: ( ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:5642:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:5642:1: ( ( rule__ScatterPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:5643:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:5644:2: ( rule__ScatterPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:5644:3: rule__ScatterPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:5653:1: rule__ScatterPlot__Group_9__0 : rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 ;
    public final void rule__ScatterPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5657:1: ( rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1 )
            // InternalBiLang.g:5658:2: rule__ScatterPlot__Group_9__0__Impl rule__ScatterPlot__Group_9__1
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
    // InternalBiLang.g:5665:1: rule__ScatterPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__ScatterPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5669:1: ( ( 'thickness' ) )
            // InternalBiLang.g:5670:1: ( 'thickness' )
            {
            // InternalBiLang.g:5670:1: ( 'thickness' )
            // InternalBiLang.g:5671:2: 'thickness'
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
    // InternalBiLang.g:5680:1: rule__ScatterPlot__Group_9__1 : rule__ScatterPlot__Group_9__1__Impl ;
    public final void rule__ScatterPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5684:1: ( rule__ScatterPlot__Group_9__1__Impl )
            // InternalBiLang.g:5685:2: rule__ScatterPlot__Group_9__1__Impl
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
    // InternalBiLang.g:5691:1: rule__ScatterPlot__Group_9__1__Impl : ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__ScatterPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5695:1: ( ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:5696:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:5696:1: ( ( rule__ScatterPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:5697:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getScatterPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:5698:2: ( rule__ScatterPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:5698:3: rule__ScatterPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:5707:1: rule__RadarPlot__Group__0 : rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 ;
    public final void rule__RadarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5711:1: ( rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1 )
            // InternalBiLang.g:5712:2: rule__RadarPlot__Group__0__Impl rule__RadarPlot__Group__1
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
    // InternalBiLang.g:5719:1: rule__RadarPlot__Group__0__Impl : ( 'radar' ) ;
    public final void rule__RadarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5723:1: ( ( 'radar' ) )
            // InternalBiLang.g:5724:1: ( 'radar' )
            {
            // InternalBiLang.g:5724:1: ( 'radar' )
            // InternalBiLang.g:5725:2: 'radar'
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
    // InternalBiLang.g:5734:1: rule__RadarPlot__Group__1 : rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 ;
    public final void rule__RadarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5738:1: ( rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2 )
            // InternalBiLang.g:5739:2: rule__RadarPlot__Group__1__Impl rule__RadarPlot__Group__2
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
    // InternalBiLang.g:5746:1: rule__RadarPlot__Group__1__Impl : ( ( rule__RadarPlot__NameAssignment_1 ) ) ;
    public final void rule__RadarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5750:1: ( ( ( rule__RadarPlot__NameAssignment_1 ) ) )
            // InternalBiLang.g:5751:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            {
            // InternalBiLang.g:5751:1: ( ( rule__RadarPlot__NameAssignment_1 ) )
            // InternalBiLang.g:5752:2: ( rule__RadarPlot__NameAssignment_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getNameAssignment_1()); 
            // InternalBiLang.g:5753:2: ( rule__RadarPlot__NameAssignment_1 )
            // InternalBiLang.g:5753:3: rule__RadarPlot__NameAssignment_1
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
    // InternalBiLang.g:5761:1: rule__RadarPlot__Group__2 : rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 ;
    public final void rule__RadarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5765:1: ( rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3 )
            // InternalBiLang.g:5766:2: rule__RadarPlot__Group__2__Impl rule__RadarPlot__Group__3
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
    // InternalBiLang.g:5773:1: rule__RadarPlot__Group__2__Impl : ( '->' ) ;
    public final void rule__RadarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5777:1: ( ( '->' ) )
            // InternalBiLang.g:5778:1: ( '->' )
            {
            // InternalBiLang.g:5778:1: ( '->' )
            // InternalBiLang.g:5779:2: '->'
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
    // InternalBiLang.g:5788:1: rule__RadarPlot__Group__3 : rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 ;
    public final void rule__RadarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5792:1: ( rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4 )
            // InternalBiLang.g:5793:2: rule__RadarPlot__Group__3__Impl rule__RadarPlot__Group__4
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
    // InternalBiLang.g:5800:1: rule__RadarPlot__Group__3__Impl : ( 'xAx' ) ;
    public final void rule__RadarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5804:1: ( ( 'xAx' ) )
            // InternalBiLang.g:5805:1: ( 'xAx' )
            {
            // InternalBiLang.g:5805:1: ( 'xAx' )
            // InternalBiLang.g:5806:2: 'xAx'
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
    // InternalBiLang.g:5815:1: rule__RadarPlot__Group__4 : rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 ;
    public final void rule__RadarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5819:1: ( rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5 )
            // InternalBiLang.g:5820:2: rule__RadarPlot__Group__4__Impl rule__RadarPlot__Group__5
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
    // InternalBiLang.g:5827:1: rule__RadarPlot__Group__4__Impl : ( ( rule__RadarPlot__XAxisAssignment_4 ) ) ;
    public final void rule__RadarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5831:1: ( ( ( rule__RadarPlot__XAxisAssignment_4 ) ) )
            // InternalBiLang.g:5832:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            {
            // InternalBiLang.g:5832:1: ( ( rule__RadarPlot__XAxisAssignment_4 ) )
            // InternalBiLang.g:5833:2: ( rule__RadarPlot__XAxisAssignment_4 )
            {
             before(grammarAccess.getRadarPlotAccess().getXAxisAssignment_4()); 
            // InternalBiLang.g:5834:2: ( rule__RadarPlot__XAxisAssignment_4 )
            // InternalBiLang.g:5834:3: rule__RadarPlot__XAxisAssignment_4
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
    // InternalBiLang.g:5842:1: rule__RadarPlot__Group__5 : rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 ;
    public final void rule__RadarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5846:1: ( rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6 )
            // InternalBiLang.g:5847:2: rule__RadarPlot__Group__5__Impl rule__RadarPlot__Group__6
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
    // InternalBiLang.g:5854:1: rule__RadarPlot__Group__5__Impl : ( 'yA' ) ;
    public final void rule__RadarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5858:1: ( ( 'yA' ) )
            // InternalBiLang.g:5859:1: ( 'yA' )
            {
            // InternalBiLang.g:5859:1: ( 'yA' )
            // InternalBiLang.g:5860:2: 'yA'
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
    // InternalBiLang.g:5869:1: rule__RadarPlot__Group__6 : rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 ;
    public final void rule__RadarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5873:1: ( rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7 )
            // InternalBiLang.g:5874:2: rule__RadarPlot__Group__6__Impl rule__RadarPlot__Group__7
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
    // InternalBiLang.g:5881:1: rule__RadarPlot__Group__6__Impl : ( ( rule__RadarPlot__YAxisAssignment_6 ) ) ;
    public final void rule__RadarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5885:1: ( ( ( rule__RadarPlot__YAxisAssignment_6 ) ) )
            // InternalBiLang.g:5886:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            {
            // InternalBiLang.g:5886:1: ( ( rule__RadarPlot__YAxisAssignment_6 ) )
            // InternalBiLang.g:5887:2: ( rule__RadarPlot__YAxisAssignment_6 )
            {
             before(grammarAccess.getRadarPlotAccess().getYAxisAssignment_6()); 
            // InternalBiLang.g:5888:2: ( rule__RadarPlot__YAxisAssignment_6 )
            // InternalBiLang.g:5888:3: rule__RadarPlot__YAxisAssignment_6
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
    // InternalBiLang.g:5896:1: rule__RadarPlot__Group__7 : rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 ;
    public final void rule__RadarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5900:1: ( rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8 )
            // InternalBiLang.g:5901:2: rule__RadarPlot__Group__7__Impl rule__RadarPlot__Group__8
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
    // InternalBiLang.g:5908:1: rule__RadarPlot__Group__7__Impl : ( ( rule__RadarPlot__Group_7__0 )? ) ;
    public final void rule__RadarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5912:1: ( ( ( rule__RadarPlot__Group_7__0 )? ) )
            // InternalBiLang.g:5913:1: ( ( rule__RadarPlot__Group_7__0 )? )
            {
            // InternalBiLang.g:5913:1: ( ( rule__RadarPlot__Group_7__0 )? )
            // InternalBiLang.g:5914:2: ( rule__RadarPlot__Group_7__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_7()); 
            // InternalBiLang.g:5915:2: ( rule__RadarPlot__Group_7__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:5915:3: rule__RadarPlot__Group_7__0
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
    // InternalBiLang.g:5923:1: rule__RadarPlot__Group__8 : rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 ;
    public final void rule__RadarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5927:1: ( rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9 )
            // InternalBiLang.g:5928:2: rule__RadarPlot__Group__8__Impl rule__RadarPlot__Group__9
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
    // InternalBiLang.g:5935:1: rule__RadarPlot__Group__8__Impl : ( ( rule__RadarPlot__Group_8__0 )? ) ;
    public final void rule__RadarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5939:1: ( ( ( rule__RadarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:5940:1: ( ( rule__RadarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:5940:1: ( ( rule__RadarPlot__Group_8__0 )? )
            // InternalBiLang.g:5941:2: ( rule__RadarPlot__Group_8__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:5942:2: ( rule__RadarPlot__Group_8__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:5942:3: rule__RadarPlot__Group_8__0
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
    // InternalBiLang.g:5950:1: rule__RadarPlot__Group__9 : rule__RadarPlot__Group__9__Impl ;
    public final void rule__RadarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5954:1: ( rule__RadarPlot__Group__9__Impl )
            // InternalBiLang.g:5955:2: rule__RadarPlot__Group__9__Impl
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
    // InternalBiLang.g:5961:1: rule__RadarPlot__Group__9__Impl : ( ( rule__RadarPlot__Group_9__0 )? ) ;
    public final void rule__RadarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5965:1: ( ( ( rule__RadarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:5966:1: ( ( rule__RadarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:5966:1: ( ( rule__RadarPlot__Group_9__0 )? )
            // InternalBiLang.g:5967:2: ( rule__RadarPlot__Group_9__0 )?
            {
             before(grammarAccess.getRadarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:5968:2: ( rule__RadarPlot__Group_9__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:5968:3: rule__RadarPlot__Group_9__0
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
    // InternalBiLang.g:5977:1: rule__RadarPlot__Group_7__0 : rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 ;
    public final void rule__RadarPlot__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5981:1: ( rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1 )
            // InternalBiLang.g:5982:2: rule__RadarPlot__Group_7__0__Impl rule__RadarPlot__Group_7__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:5989:1: rule__RadarPlot__Group_7__0__Impl : ( 'loc' ) ;
    public final void rule__RadarPlot__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:5993:1: ( ( 'loc' ) )
            // InternalBiLang.g:5994:1: ( 'loc' )
            {
            // InternalBiLang.g:5994:1: ( 'loc' )
            // InternalBiLang.g:5995:2: 'loc'
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
    // InternalBiLang.g:6004:1: rule__RadarPlot__Group_7__1 : rule__RadarPlot__Group_7__1__Impl ;
    public final void rule__RadarPlot__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6008:1: ( rule__RadarPlot__Group_7__1__Impl )
            // InternalBiLang.g:6009:2: rule__RadarPlot__Group_7__1__Impl
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
    // InternalBiLang.g:6015:1: rule__RadarPlot__Group_7__1__Impl : ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) ;
    public final void rule__RadarPlot__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6019:1: ( ( ( rule__RadarPlot__LocationAssignment_7_1 ) ) )
            // InternalBiLang.g:6020:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            {
            // InternalBiLang.g:6020:1: ( ( rule__RadarPlot__LocationAssignment_7_1 ) )
            // InternalBiLang.g:6021:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getLocationAssignment_7_1()); 
            // InternalBiLang.g:6022:2: ( rule__RadarPlot__LocationAssignment_7_1 )
            // InternalBiLang.g:6022:3: rule__RadarPlot__LocationAssignment_7_1
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
    // InternalBiLang.g:6031:1: rule__RadarPlot__Group_8__0 : rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 ;
    public final void rule__RadarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6035:1: ( rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1 )
            // InternalBiLang.g:6036:2: rule__RadarPlot__Group_8__0__Impl rule__RadarPlot__Group_8__1
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
    // InternalBiLang.g:6043:1: rule__RadarPlot__Group_8__0__Impl : ( 'colors' ) ;
    public final void rule__RadarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6047:1: ( ( 'colors' ) )
            // InternalBiLang.g:6048:1: ( 'colors' )
            {
            // InternalBiLang.g:6048:1: ( 'colors' )
            // InternalBiLang.g:6049:2: 'colors'
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
    // InternalBiLang.g:6058:1: rule__RadarPlot__Group_8__1 : rule__RadarPlot__Group_8__1__Impl ;
    public final void rule__RadarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6062:1: ( rule__RadarPlot__Group_8__1__Impl )
            // InternalBiLang.g:6063:2: rule__RadarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:6069:1: rule__RadarPlot__Group_8__1__Impl : ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) ;
    public final void rule__RadarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6073:1: ( ( ( rule__RadarPlot__ColorsAssignment_8_1 ) ) )
            // InternalBiLang.g:6074:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            {
            // InternalBiLang.g:6074:1: ( ( rule__RadarPlot__ColorsAssignment_8_1 ) )
            // InternalBiLang.g:6075:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getColorsAssignment_8_1()); 
            // InternalBiLang.g:6076:2: ( rule__RadarPlot__ColorsAssignment_8_1 )
            // InternalBiLang.g:6076:3: rule__RadarPlot__ColorsAssignment_8_1
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
    // InternalBiLang.g:6085:1: rule__RadarPlot__Group_9__0 : rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 ;
    public final void rule__RadarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6089:1: ( rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1 )
            // InternalBiLang.g:6090:2: rule__RadarPlot__Group_9__0__Impl rule__RadarPlot__Group_9__1
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
    // InternalBiLang.g:6097:1: rule__RadarPlot__Group_9__0__Impl : ( 'thickness' ) ;
    public final void rule__RadarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6101:1: ( ( 'thickness' ) )
            // InternalBiLang.g:6102:1: ( 'thickness' )
            {
            // InternalBiLang.g:6102:1: ( 'thickness' )
            // InternalBiLang.g:6103:2: 'thickness'
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
    // InternalBiLang.g:6112:1: rule__RadarPlot__Group_9__1 : rule__RadarPlot__Group_9__1__Impl ;
    public final void rule__RadarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6116:1: ( rule__RadarPlot__Group_9__1__Impl )
            // InternalBiLang.g:6117:2: rule__RadarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:6123:1: rule__RadarPlot__Group_9__1__Impl : ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) ;
    public final void rule__RadarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6127:1: ( ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) ) )
            // InternalBiLang.g:6128:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            {
            // InternalBiLang.g:6128:1: ( ( rule__RadarPlot__ThicknessAssignment_9_1 ) )
            // InternalBiLang.g:6129:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            {
             before(grammarAccess.getRadarPlotAccess().getThicknessAssignment_9_1()); 
            // InternalBiLang.g:6130:2: ( rule__RadarPlot__ThicknessAssignment_9_1 )
            // InternalBiLang.g:6130:3: rule__RadarPlot__ThicknessAssignment_9_1
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
    // InternalBiLang.g:6139:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6143:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6144:2: ( RULE_ID )
            {
            // InternalBiLang.g:6144:2: ( RULE_ID )
            // InternalBiLang.g:6145:3: RULE_ID
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
    // InternalBiLang.g:6154:1: rule__Task__FileextractorAssignment_4 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6158:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:6159:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:6159:2: ( ruleFileExtractor )
            // InternalBiLang.g:6160:3: ruleFileExtractor
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
    // InternalBiLang.g:6169:1: rule__Task__DatafilteringAssignment_5 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6173:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6174:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6174:2: ( ruleDataFiltering )
            // InternalBiLang.g:6175:3: ruleDataFiltering
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
    // InternalBiLang.g:6184:1: rule__Task__FileextractorAssignment_6_0 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6188:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:6189:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:6189:2: ( ruleFileExtractor )
            // InternalBiLang.g:6190:3: ruleFileExtractor
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
    // InternalBiLang.g:6199:1: rule__Task__DatafilteringAssignment_6_1 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6203:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:6204:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:6204:2: ( ruleDataFiltering )
            // InternalBiLang.g:6205:3: ruleDataFiltering
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
    // InternalBiLang.g:6214:1: rule__Task__DashboardAssignment_8 : ( ruleDashBoard ) ;
    public final void rule__Task__DashboardAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6218:1: ( ( ruleDashBoard ) )
            // InternalBiLang.g:6219:2: ( ruleDashBoard )
            {
            // InternalBiLang.g:6219:2: ( ruleDashBoard )
            // InternalBiLang.g:6220:3: ruleDashBoard
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
    // InternalBiLang.g:6229:1: rule__DataFiltering__FileextractorAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__DataFiltering__FileextractorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6233:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6234:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6234:2: ( ( ruleEString ) )
            // InternalBiLang.g:6235:3: ( ruleEString )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0()); 
            // InternalBiLang.g:6236:3: ( ruleEString )
            // InternalBiLang.g:6237:4: ruleEString
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
    // InternalBiLang.g:6248:1: rule__DataFiltering__ProcessingstepAssignment_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6252:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6253:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6253:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6254:3: rulePreprocessingStep
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
    // InternalBiLang.g:6263:1: rule__DataFiltering__ProcessingstepAssignment_2_2_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6267:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6268:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6268:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6269:3: rulePreprocessingStep
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
    // InternalBiLang.g:6278:1: rule__DataFiltering__FilteringstepAssignment_3_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6282:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:6283:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:6283:2: ( ruleFilteringStep )
            // InternalBiLang.g:6284:3: ruleFilteringStep
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
    // InternalBiLang.g:6293:1: rule__DataFiltering__FilteringstepAssignment_3_2_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6297:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:6298:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:6298:2: ( ruleFilteringStep )
            // InternalBiLang.g:6299:3: ruleFilteringStep
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
    // InternalBiLang.g:6308:1: rule__DashBoard__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DashBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6312:1: ( ( ruleEString ) )
            // InternalBiLang.g:6313:2: ( ruleEString )
            {
            // InternalBiLang.g:6313:2: ( ruleEString )
            // InternalBiLang.g:6314:3: ruleEString
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
    // InternalBiLang.g:6323:1: rule__DashBoard__FileextractorAssignment_2_0_1 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__FileextractorAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6327:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6328:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6328:2: ( ( ruleEString ) )
            // InternalBiLang.g:6329:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_1_0()); 
            // InternalBiLang.g:6330:3: ( ruleEString )
            // InternalBiLang.g:6331:4: ruleEString
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
    // InternalBiLang.g:6342:1: rule__DashBoard__DatafilteringAssignment_2_1_1 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__DatafilteringAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6346:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:6347:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:6347:2: ( ( ruleEString ) )
            // InternalBiLang.g:6348:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getDatafilteringDataFilteringCrossReference_2_1_1_0()); 
            // InternalBiLang.g:6349:3: ( ruleEString )
            // InternalBiLang.g:6350:4: ruleEString
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
    // InternalBiLang.g:6361:1: rule__DashBoard__PlotAssignment_5 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6365:1: ( ( rulePlot ) )
            // InternalBiLang.g:6366:2: ( rulePlot )
            {
            // InternalBiLang.g:6366:2: ( rulePlot )
            // InternalBiLang.g:6367:3: rulePlot
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
    // InternalBiLang.g:6376:1: rule__DashBoard__PlotAssignment_6 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6380:1: ( ( rulePlot ) )
            // InternalBiLang.g:6381:2: ( rulePlot )
            {
            // InternalBiLang.g:6381:2: ( rulePlot )
            // InternalBiLang.g:6382:3: rulePlot
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
    // InternalBiLang.g:6391:1: rule__CsvExtractor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CsvExtractor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6395:1: ( ( ruleEString ) )
            // InternalBiLang.g:6396:2: ( ruleEString )
            {
            // InternalBiLang.g:6396:2: ( ruleEString )
            // InternalBiLang.g:6397:3: ruleEString
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
    // InternalBiLang.g:6406:1: rule__CsvExtractor__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__CsvExtractor__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6410:1: ( ( ruleEString ) )
            // InternalBiLang.g:6411:2: ( ruleEString )
            {
            // InternalBiLang.g:6411:2: ( ruleEString )
            // InternalBiLang.g:6412:3: ruleEString
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
    // InternalBiLang.g:6421:1: rule__ExcelExtractor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExcelExtractor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6425:1: ( ( ruleEString ) )
            // InternalBiLang.g:6426:2: ( ruleEString )
            {
            // InternalBiLang.g:6426:2: ( ruleEString )
            // InternalBiLang.g:6427:3: ruleEString
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
    // InternalBiLang.g:6436:1: rule__ExcelExtractor__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__ExcelExtractor__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6440:1: ( ( ruleEString ) )
            // InternalBiLang.g:6441:2: ( ruleEString )
            {
            // InternalBiLang.g:6441:2: ( ruleEString )
            // InternalBiLang.g:6442:3: ruleEString
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
    // InternalBiLang.g:6451:1: rule__QuantitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QuantitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6455:1: ( ( ruleEString ) )
            // InternalBiLang.g:6456:2: ( ruleEString )
            {
            // InternalBiLang.g:6456:2: ( ruleEString )
            // InternalBiLang.g:6457:3: ruleEString
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
    // InternalBiLang.g:6466:1: rule__QuantitativeFiltering__OperatorAssignment_2 : ( ruleQuantitativeOperator ) ;
    public final void rule__QuantitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6470:1: ( ( ruleQuantitativeOperator ) )
            // InternalBiLang.g:6471:2: ( ruleQuantitativeOperator )
            {
            // InternalBiLang.g:6471:2: ( ruleQuantitativeOperator )
            // InternalBiLang.g:6472:3: ruleQuantitativeOperator
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
    // InternalBiLang.g:6481:1: rule__QuantitativeFiltering__ValuesAssignment_3 : ( ruleEFloat ) ;
    public final void rule__QuantitativeFiltering__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6485:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6486:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6486:2: ( ruleEFloat )
            // InternalBiLang.g:6487:3: ruleEFloat
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
    // InternalBiLang.g:6496:1: rule__QualitativeFiltering__AxisAssignment_1 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6500:1: ( ( ruleEString ) )
            // InternalBiLang.g:6501:2: ( ruleEString )
            {
            // InternalBiLang.g:6501:2: ( ruleEString )
            // InternalBiLang.g:6502:3: ruleEString
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
    // InternalBiLang.g:6511:1: rule__QualitativeFiltering__OperatorAssignment_2 : ( ruleQualitativeOperator ) ;
    public final void rule__QualitativeFiltering__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6515:1: ( ( ruleQualitativeOperator ) )
            // InternalBiLang.g:6516:2: ( ruleQualitativeOperator )
            {
            // InternalBiLang.g:6516:2: ( ruleQualitativeOperator )
            // InternalBiLang.g:6517:3: ruleQualitativeOperator
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
    // InternalBiLang.g:6526:1: rule__QualitativeFiltering__LabelsAssignment_3 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__LabelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6530:1: ( ( ruleEString ) )
            // InternalBiLang.g:6531:2: ( ruleEString )
            {
            // InternalBiLang.g:6531:2: ( ruleEString )
            // InternalBiLang.g:6532:3: ruleEString
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
    // InternalBiLang.g:6541:1: rule__MathOperation__LsideAssignment_2 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__LsideAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6545:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6546:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6546:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6547:3: rulePreprocessingStep
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
    // InternalBiLang.g:6556:1: rule__MathOperation__OperatorAssignment_3 : ( ruleMathOperator ) ;
    public final void rule__MathOperation__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6560:1: ( ( ruleMathOperator ) )
            // InternalBiLang.g:6561:2: ( ruleMathOperator )
            {
            // InternalBiLang.g:6561:2: ( ruleMathOperator )
            // InternalBiLang.g:6562:3: ruleMathOperator
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
    // InternalBiLang.g:6571:1: rule__MathOperation__RsideAssignment_5 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__RsideAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6575:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:6576:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:6576:2: ( rulePreprocessingStep )
            // InternalBiLang.g:6577:3: rulePreprocessingStep
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
    // InternalBiLang.g:6586:1: rule__ColReference__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__ColReference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6590:1: ( ( ruleEString ) )
            // InternalBiLang.g:6591:2: ( ruleEString )
            {
            // InternalBiLang.g:6591:2: ( ruleEString )
            // InternalBiLang.g:6592:3: ruleEString
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
    // InternalBiLang.g:6601:1: rule__StatisticalOperation__OperatorAssignment_0 : ( ruleStatisticalOperator ) ;
    public final void rule__StatisticalOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6605:1: ( ( ruleStatisticalOperator ) )
            // InternalBiLang.g:6606:2: ( ruleStatisticalOperator )
            {
            // InternalBiLang.g:6606:2: ( ruleStatisticalOperator )
            // InternalBiLang.g:6607:3: ruleStatisticalOperator
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
    // InternalBiLang.g:6616:1: rule__StatisticalOperation__ColreferenceAssignment_2 : ( ruleColReference ) ;
    public final void rule__StatisticalOperation__ColreferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6620:1: ( ( ruleColReference ) )
            // InternalBiLang.g:6621:2: ( ruleColReference )
            {
            // InternalBiLang.g:6621:2: ( ruleColReference )
            // InternalBiLang.g:6622:3: ruleColReference
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
    // InternalBiLang.g:6631:1: rule__BarPlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BarPlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6635:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6636:2: ( RULE_ID )
            {
            // InternalBiLang.g:6636:2: ( RULE_ID )
            // InternalBiLang.g:6637:3: RULE_ID
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
    // InternalBiLang.g:6646:1: rule__BarPlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__BarPlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6650:1: ( ( ruleEString ) )
            // InternalBiLang.g:6651:2: ( ruleEString )
            {
            // InternalBiLang.g:6651:2: ( ruleEString )
            // InternalBiLang.g:6652:3: ruleEString
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
    // InternalBiLang.g:6661:1: rule__BarPlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__BarPlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6665:1: ( ( ruleEString ) )
            // InternalBiLang.g:6666:2: ( ruleEString )
            {
            // InternalBiLang.g:6666:2: ( ruleEString )
            // InternalBiLang.g:6667:3: ruleEString
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
    // InternalBiLang.g:6676:1: rule__BarPlot__LocationAssignment_8_1 : ( ruleEString ) ;
    public final void rule__BarPlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6680:1: ( ( ruleEString ) )
            // InternalBiLang.g:6681:2: ( ruleEString )
            {
            // InternalBiLang.g:6681:2: ( ruleEString )
            // InternalBiLang.g:6682:3: ruleEString
            {
             before(grammarAccess.getBarPlotAccess().getLocationEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarPlotAccess().getLocationEStringParserRuleCall_8_1_0()); 

            }


            }

        }
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
    // InternalBiLang.g:6691:1: rule__BarPlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarPlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6695:1: ( ( ruleEString ) )
            // InternalBiLang.g:6696:2: ( ruleEString )
            {
            // InternalBiLang.g:6696:2: ( ruleEString )
            // InternalBiLang.g:6697:3: ruleEString
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
    // InternalBiLang.g:6706:1: rule__BarPlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__BarPlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6710:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6711:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6711:2: ( ruleEFloat )
            // InternalBiLang.g:6712:3: ruleEFloat
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
    // InternalBiLang.g:6721:1: rule__LinePlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinePlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6725:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6726:2: ( RULE_ID )
            {
            // InternalBiLang.g:6726:2: ( RULE_ID )
            // InternalBiLang.g:6727:3: RULE_ID
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
    // InternalBiLang.g:6736:1: rule__LinePlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__LinePlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6740:1: ( ( ruleEString ) )
            // InternalBiLang.g:6741:2: ( ruleEString )
            {
            // InternalBiLang.g:6741:2: ( ruleEString )
            // InternalBiLang.g:6742:3: ruleEString
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
    // InternalBiLang.g:6751:1: rule__LinePlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__LinePlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6755:1: ( ( ruleEString ) )
            // InternalBiLang.g:6756:2: ( ruleEString )
            {
            // InternalBiLang.g:6756:2: ( ruleEString )
            // InternalBiLang.g:6757:3: ruleEString
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
    // InternalBiLang.g:6766:1: rule__LinePlot__LocationAssignment_8_1 : ( ruleEString ) ;
    public final void rule__LinePlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6770:1: ( ( ruleEString ) )
            // InternalBiLang.g:6771:2: ( ruleEString )
            {
            // InternalBiLang.g:6771:2: ( ruleEString )
            // InternalBiLang.g:6772:3: ruleEString
            {
             before(grammarAccess.getLinePlotAccess().getLocationEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinePlotAccess().getLocationEStringParserRuleCall_8_1_0()); 

            }


            }

        }
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
    // InternalBiLang.g:6781:1: rule__LinePlot__ColorsAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LinePlot__ColorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6785:1: ( ( ruleEString ) )
            // InternalBiLang.g:6786:2: ( ruleEString )
            {
            // InternalBiLang.g:6786:2: ( ruleEString )
            // InternalBiLang.g:6787:3: ruleEString
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
    // InternalBiLang.g:6796:1: rule__LinePlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__LinePlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6800:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6801:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6801:2: ( ruleEFloat )
            // InternalBiLang.g:6802:3: ruleEFloat
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
    // InternalBiLang.g:6811:1: rule__DonutPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DonutPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6815:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6816:2: ( RULE_ID )
            {
            // InternalBiLang.g:6816:2: ( RULE_ID )
            // InternalBiLang.g:6817:3: RULE_ID
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
    // InternalBiLang.g:6826:1: rule__DonutPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__DonutPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6830:1: ( ( ruleEString ) )
            // InternalBiLang.g:6831:2: ( ruleEString )
            {
            // InternalBiLang.g:6831:2: ( ruleEString )
            // InternalBiLang.g:6832:3: ruleEString
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
    // InternalBiLang.g:6841:1: rule__DonutPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__DonutPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6845:1: ( ( ruleEString ) )
            // InternalBiLang.g:6846:2: ( ruleEString )
            {
            // InternalBiLang.g:6846:2: ( ruleEString )
            // InternalBiLang.g:6847:3: ruleEString
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
    // InternalBiLang.g:6856:1: rule__DonutPlot__LocationAssignment_7_1 : ( ruleEString ) ;
    public final void rule__DonutPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6860:1: ( ( ruleEString ) )
            // InternalBiLang.g:6861:2: ( ruleEString )
            {
            // InternalBiLang.g:6861:2: ( ruleEString )
            // InternalBiLang.g:6862:3: ruleEString
            {
             before(grammarAccess.getDonutPlotAccess().getLocationEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonutPlotAccess().getLocationEStringParserRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalBiLang.g:6871:1: rule__DonutPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__DonutPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6875:1: ( ( ruleEString ) )
            // InternalBiLang.g:6876:2: ( ruleEString )
            {
            // InternalBiLang.g:6876:2: ( ruleEString )
            // InternalBiLang.g:6877:3: ruleEString
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
    // InternalBiLang.g:6886:1: rule__DonutPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__DonutPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6890:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6891:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6891:2: ( ruleEFloat )
            // InternalBiLang.g:6892:3: ruleEFloat
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
    // InternalBiLang.g:6901:1: rule__PiePlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PiePlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6905:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6906:2: ( RULE_ID )
            {
            // InternalBiLang.g:6906:2: ( RULE_ID )
            // InternalBiLang.g:6907:3: RULE_ID
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
    // InternalBiLang.g:6916:1: rule__PiePlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PiePlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6920:1: ( ( ruleEString ) )
            // InternalBiLang.g:6921:2: ( ruleEString )
            {
            // InternalBiLang.g:6921:2: ( ruleEString )
            // InternalBiLang.g:6922:3: ruleEString
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
    // InternalBiLang.g:6931:1: rule__PiePlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PiePlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6935:1: ( ( ruleEString ) )
            // InternalBiLang.g:6936:2: ( ruleEString )
            {
            // InternalBiLang.g:6936:2: ( ruleEString )
            // InternalBiLang.g:6937:3: ruleEString
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
    // InternalBiLang.g:6946:1: rule__PiePlot__LocationAssignment_7_1 : ( ruleEString ) ;
    public final void rule__PiePlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6950:1: ( ( ruleEString ) )
            // InternalBiLang.g:6951:2: ( ruleEString )
            {
            // InternalBiLang.g:6951:2: ( ruleEString )
            // InternalBiLang.g:6952:3: ruleEString
            {
             before(grammarAccess.getPiePlotAccess().getLocationEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPiePlotAccess().getLocationEStringParserRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalBiLang.g:6961:1: rule__PiePlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PiePlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6965:1: ( ( ruleEString ) )
            // InternalBiLang.g:6966:2: ( ruleEString )
            {
            // InternalBiLang.g:6966:2: ( ruleEString )
            // InternalBiLang.g:6967:3: ruleEString
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
    // InternalBiLang.g:6976:1: rule__PiePlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PiePlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6980:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:6981:2: ( ruleEFloat )
            {
            // InternalBiLang.g:6981:2: ( ruleEFloat )
            // InternalBiLang.g:6982:3: ruleEFloat
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
    // InternalBiLang.g:6991:1: rule__PolarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PolarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:6995:1: ( ( RULE_ID ) )
            // InternalBiLang.g:6996:2: ( RULE_ID )
            {
            // InternalBiLang.g:6996:2: ( RULE_ID )
            // InternalBiLang.g:6997:3: RULE_ID
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
    // InternalBiLang.g:7006:1: rule__PolarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__PolarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7010:1: ( ( ruleEString ) )
            // InternalBiLang.g:7011:2: ( ruleEString )
            {
            // InternalBiLang.g:7011:2: ( ruleEString )
            // InternalBiLang.g:7012:3: ruleEString
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
    // InternalBiLang.g:7021:1: rule__PolarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__PolarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7025:1: ( ( ruleEString ) )
            // InternalBiLang.g:7026:2: ( ruleEString )
            {
            // InternalBiLang.g:7026:2: ( ruleEString )
            // InternalBiLang.g:7027:3: ruleEString
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
    // InternalBiLang.g:7036:1: rule__PolarPlot__LocationAssignment_7_1 : ( ruleEString ) ;
    public final void rule__PolarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7040:1: ( ( ruleEString ) )
            // InternalBiLang.g:7041:2: ( ruleEString )
            {
            // InternalBiLang.g:7041:2: ( ruleEString )
            // InternalBiLang.g:7042:3: ruleEString
            {
             before(grammarAccess.getPolarPlotAccess().getLocationEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPolarPlotAccess().getLocationEStringParserRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalBiLang.g:7051:1: rule__PolarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PolarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7055:1: ( ( ruleEString ) )
            // InternalBiLang.g:7056:2: ( ruleEString )
            {
            // InternalBiLang.g:7056:2: ( ruleEString )
            // InternalBiLang.g:7057:3: ruleEString
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
    // InternalBiLang.g:7066:1: rule__PolarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__PolarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7070:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7071:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7071:2: ( ruleEFloat )
            // InternalBiLang.g:7072:3: ruleEFloat
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
    // InternalBiLang.g:7081:1: rule__ScatterPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScatterPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7085:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7086:2: ( RULE_ID )
            {
            // InternalBiLang.g:7086:2: ( RULE_ID )
            // InternalBiLang.g:7087:3: RULE_ID
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
    // InternalBiLang.g:7096:1: rule__ScatterPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__ScatterPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7100:1: ( ( ruleEString ) )
            // InternalBiLang.g:7101:2: ( ruleEString )
            {
            // InternalBiLang.g:7101:2: ( ruleEString )
            // InternalBiLang.g:7102:3: ruleEString
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
    // InternalBiLang.g:7111:1: rule__ScatterPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__ScatterPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7115:1: ( ( ruleEString ) )
            // InternalBiLang.g:7116:2: ( ruleEString )
            {
            // InternalBiLang.g:7116:2: ( ruleEString )
            // InternalBiLang.g:7117:3: ruleEString
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
    // InternalBiLang.g:7126:1: rule__ScatterPlot__LocationAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ScatterPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7130:1: ( ( ruleEString ) )
            // InternalBiLang.g:7131:2: ( ruleEString )
            {
            // InternalBiLang.g:7131:2: ( ruleEString )
            // InternalBiLang.g:7132:3: ruleEString
            {
             before(grammarAccess.getScatterPlotAccess().getLocationEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getScatterPlotAccess().getLocationEStringParserRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalBiLang.g:7141:1: rule__ScatterPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ScatterPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7145:1: ( ( ruleEString ) )
            // InternalBiLang.g:7146:2: ( ruleEString )
            {
            // InternalBiLang.g:7146:2: ( ruleEString )
            // InternalBiLang.g:7147:3: ruleEString
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
    // InternalBiLang.g:7156:1: rule__ScatterPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__ScatterPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7160:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7161:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7161:2: ( ruleEFloat )
            // InternalBiLang.g:7162:3: ruleEFloat
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
    // InternalBiLang.g:7171:1: rule__RadarPlot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RadarPlot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7175:1: ( ( RULE_ID ) )
            // InternalBiLang.g:7176:2: ( RULE_ID )
            {
            // InternalBiLang.g:7176:2: ( RULE_ID )
            // InternalBiLang.g:7177:3: RULE_ID
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
    // InternalBiLang.g:7186:1: rule__RadarPlot__XAxisAssignment_4 : ( ruleEString ) ;
    public final void rule__RadarPlot__XAxisAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7190:1: ( ( ruleEString ) )
            // InternalBiLang.g:7191:2: ( ruleEString )
            {
            // InternalBiLang.g:7191:2: ( ruleEString )
            // InternalBiLang.g:7192:3: ruleEString
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
    // InternalBiLang.g:7201:1: rule__RadarPlot__YAxisAssignment_6 : ( ruleEString ) ;
    public final void rule__RadarPlot__YAxisAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7205:1: ( ( ruleEString ) )
            // InternalBiLang.g:7206:2: ( ruleEString )
            {
            // InternalBiLang.g:7206:2: ( ruleEString )
            // InternalBiLang.g:7207:3: ruleEString
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
    // InternalBiLang.g:7216:1: rule__RadarPlot__LocationAssignment_7_1 : ( ruleEString ) ;
    public final void rule__RadarPlot__LocationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7220:1: ( ( ruleEString ) )
            // InternalBiLang.g:7221:2: ( ruleEString )
            {
            // InternalBiLang.g:7221:2: ( ruleEString )
            // InternalBiLang.g:7222:3: ruleEString
            {
             before(grammarAccess.getRadarPlotAccess().getLocationEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRadarPlotAccess().getLocationEStringParserRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalBiLang.g:7231:1: rule__RadarPlot__ColorsAssignment_8_1 : ( ruleEString ) ;
    public final void rule__RadarPlot__ColorsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7235:1: ( ( ruleEString ) )
            // InternalBiLang.g:7236:2: ( ruleEString )
            {
            // InternalBiLang.g:7236:2: ( ruleEString )
            // InternalBiLang.g:7237:3: ruleEString
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
    // InternalBiLang.g:7246:1: rule__RadarPlot__ThicknessAssignment_9_1 : ( ruleEFloat ) ;
    public final void rule__RadarPlot__ThicknessAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:7250:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:7251:2: ( ruleEFloat )
            {
            // InternalBiLang.g:7251:2: ( ruleEFloat )
            // InternalBiLang.g:7252:3: ruleEFloat
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