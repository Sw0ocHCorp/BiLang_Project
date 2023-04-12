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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'PLUS'", "'MINUS'", "'MULTIPLY'", "'DIVIDING'", "'MEAN'", "'MEDIAN'", "'STD'", "'Task'", "':'", "'load'", "'[dashboard:'", "']'", "'filter'", "'=>'", "'filtering step='", "'processing step='", "','", "'plots'", "'{'", "'}'", "'df'", "'.csv'", "'.xlsx'", "'quanti axis->'", "'value'", "'quali axis->'", "'label'", "'l'", "'r'", "'('", "')'", "'-'", "'.'", "'bar'", "'->'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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


    // $ANTLR start "ruleMathOperator"
    // InternalBiLang.g:503:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:507:1: ( ( ( rule__MathOperator__Alternatives ) ) )
            // InternalBiLang.g:508:2: ( ( rule__MathOperator__Alternatives ) )
            {
            // InternalBiLang.g:508:2: ( ( rule__MathOperator__Alternatives ) )
            // InternalBiLang.g:509:3: ( rule__MathOperator__Alternatives )
            {
             before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:510:3: ( rule__MathOperator__Alternatives )
            // InternalBiLang.g:510:4: rule__MathOperator__Alternatives
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
    // InternalBiLang.g:519:1: ruleStatisticalOperator : ( ( rule__StatisticalOperator__Alternatives ) ) ;
    public final void ruleStatisticalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:523:1: ( ( ( rule__StatisticalOperator__Alternatives ) ) )
            // InternalBiLang.g:524:2: ( ( rule__StatisticalOperator__Alternatives ) )
            {
            // InternalBiLang.g:524:2: ( ( rule__StatisticalOperator__Alternatives ) )
            // InternalBiLang.g:525:3: ( rule__StatisticalOperator__Alternatives )
            {
             before(grammarAccess.getStatisticalOperatorAccess().getAlternatives()); 
            // InternalBiLang.g:526:3: ( rule__StatisticalOperator__Alternatives )
            // InternalBiLang.g:526:4: rule__StatisticalOperator__Alternatives
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


    // $ANTLR start "rule__FileExtractor__Alternatives"
    // InternalBiLang.g:534:1: rule__FileExtractor__Alternatives : ( ( ruleCsvExtractor ) | ( ruleExcelExtractor ) );
    public final void rule__FileExtractor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:538:1: ( ( ruleCsvExtractor ) | ( ruleExcelExtractor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==34) ) {
                    alt1=1;
                }
                else if ( (LA1_1==35) ) {
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

                if ( (LA1_2==34) ) {
                    alt1=1;
                }
                else if ( (LA1_2==35) ) {
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
                    // InternalBiLang.g:539:2: ( ruleCsvExtractor )
                    {
                    // InternalBiLang.g:539:2: ( ruleCsvExtractor )
                    // InternalBiLang.g:540:3: ruleCsvExtractor
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
                    // InternalBiLang.g:545:2: ( ruleExcelExtractor )
                    {
                    // InternalBiLang.g:545:2: ( ruleExcelExtractor )
                    // InternalBiLang.g:546:3: ruleExcelExtractor
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
    // InternalBiLang.g:555:1: rule__FilteringStep__Alternatives : ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) );
    public final void rule__FilteringStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:559:1: ( ( ruleQuantitativeFiltering ) | ( ruleQualitativeFiltering ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                alt2=1;
            }
            else if ( (LA2_0==38) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBiLang.g:560:2: ( ruleQuantitativeFiltering )
                    {
                    // InternalBiLang.g:560:2: ( ruleQuantitativeFiltering )
                    // InternalBiLang.g:561:3: ruleQuantitativeFiltering
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
                    // InternalBiLang.g:566:2: ( ruleQualitativeFiltering )
                    {
                    // InternalBiLang.g:566:2: ( ruleQualitativeFiltering )
                    // InternalBiLang.g:567:3: ruleQualitativeFiltering
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
    // InternalBiLang.g:576:1: rule__PreprocessingStep__Alternatives : ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) );
    public final void rule__PreprocessingStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:580:1: ( ( ruleMathOperation ) | ( ruleColReference ) | ( ruleStatisticalOperation ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 40:
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
                    // InternalBiLang.g:581:2: ( ruleMathOperation )
                    {
                    // InternalBiLang.g:581:2: ( ruleMathOperation )
                    // InternalBiLang.g:582:3: ruleMathOperation
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
                    // InternalBiLang.g:587:2: ( ruleColReference )
                    {
                    // InternalBiLang.g:587:2: ( ruleColReference )
                    // InternalBiLang.g:588:3: ruleColReference
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
                    // InternalBiLang.g:593:2: ( ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:593:2: ( ruleStatisticalOperation )
                    // InternalBiLang.g:594:3: ruleStatisticalOperation
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
    // InternalBiLang.g:603:1: rule__Plot__Alternatives : ( ( ruleBarPlot ) | ( ruleLinePlot ) );
    public final void rule__Plot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:607:1: ( ( ruleBarPlot ) | ( ruleLinePlot ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==46) ) {
                alt4=1;
            }
            else if ( (LA4_0==53) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBiLang.g:608:2: ( ruleBarPlot )
                    {
                    // InternalBiLang.g:608:2: ( ruleBarPlot )
                    // InternalBiLang.g:609:3: ruleBarPlot
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
                    // InternalBiLang.g:614:2: ( ruleLinePlot )
                    {
                    // InternalBiLang.g:614:2: ( ruleLinePlot )
                    // InternalBiLang.g:615:3: ruleLinePlot
                    {
                     before(grammarAccess.getPlotAccess().getLinePlotParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLinePlot();

                    state._fsp--;

                     after(grammarAccess.getPlotAccess().getLinePlotParserRuleCall_1()); 

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
    // InternalBiLang.g:624:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:628:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBiLang.g:629:2: ( RULE_STRING )
                    {
                    // InternalBiLang.g:629:2: ( RULE_STRING )
                    // InternalBiLang.g:630:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:635:2: ( RULE_ID )
                    {
                    // InternalBiLang.g:635:2: ( RULE_ID )
                    // InternalBiLang.g:636:3: RULE_ID
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
    // InternalBiLang.g:645:1: rule__DashBoard__Alternatives_2 : ( ( ( rule__DashBoard__Group_2_0__0 ) ) | ( ( rule__DashBoard__Group_2_1__0 ) ) );
    public final void rule__DashBoard__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:649:1: ( ( ( rule__DashBoard__Group_2_0__0 ) ) | ( ( rule__DashBoard__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBiLang.g:650:2: ( ( rule__DashBoard__Group_2_0__0 ) )
                    {
                    // InternalBiLang.g:650:2: ( ( rule__DashBoard__Group_2_0__0 ) )
                    // InternalBiLang.g:651:3: ( rule__DashBoard__Group_2_0__0 )
                    {
                     before(grammarAccess.getDashBoardAccess().getGroup_2_0()); 
                    // InternalBiLang.g:652:3: ( rule__DashBoard__Group_2_0__0 )
                    // InternalBiLang.g:652:4: rule__DashBoard__Group_2_0__0
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
                    // InternalBiLang.g:656:2: ( ( rule__DashBoard__Group_2_1__0 ) )
                    {
                    // InternalBiLang.g:656:2: ( ( rule__DashBoard__Group_2_1__0 ) )
                    // InternalBiLang.g:657:3: ( rule__DashBoard__Group_2_1__0 )
                    {
                     before(grammarAccess.getDashBoardAccess().getGroup_2_1()); 
                    // InternalBiLang.g:658:3: ( rule__DashBoard__Group_2_1__0 )
                    // InternalBiLang.g:658:4: rule__DashBoard__Group_2_1__0
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
    // InternalBiLang.g:666:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:670:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalBiLang.g:671:2: ( 'E' )
                    {
                    // InternalBiLang.g:671:2: ( 'E' )
                    // InternalBiLang.g:672:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:677:2: ( 'e' )
                    {
                    // InternalBiLang.g:677:2: ( 'e' )
                    // InternalBiLang.g:678:3: 'e'
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
    // InternalBiLang.g:687:1: rule__MathOperator__Alternatives : ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULTIPLY' ) ) | ( ( 'DIVIDING' ) ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:691:1: ( ( ( 'PLUS' ) ) | ( ( 'MINUS' ) ) | ( ( 'MULTIPLY' ) ) | ( ( 'DIVIDING' ) ) )
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
                    // InternalBiLang.g:692:2: ( ( 'PLUS' ) )
                    {
                    // InternalBiLang.g:692:2: ( ( 'PLUS' ) )
                    // InternalBiLang.g:693:3: ( 'PLUS' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:694:3: ( 'PLUS' )
                    // InternalBiLang.g:694:4: 'PLUS'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:698:2: ( ( 'MINUS' ) )
                    {
                    // InternalBiLang.g:698:2: ( ( 'MINUS' ) )
                    // InternalBiLang.g:699:3: ( 'MINUS' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:700:3: ( 'MINUS' )
                    // InternalBiLang.g:700:4: 'MINUS'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:704:2: ( ( 'MULTIPLY' ) )
                    {
                    // InternalBiLang.g:704:2: ( ( 'MULTIPLY' ) )
                    // InternalBiLang.g:705:3: ( 'MULTIPLY' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:706:3: ( 'MULTIPLY' )
                    // InternalBiLang.g:706:4: 'MULTIPLY'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:710:2: ( ( 'DIVIDING' ) )
                    {
                    // InternalBiLang.g:710:2: ( ( 'DIVIDING' ) )
                    // InternalBiLang.g:711:3: ( 'DIVIDING' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3()); 
                    // InternalBiLang.g:712:3: ( 'DIVIDING' )
                    // InternalBiLang.g:712:4: 'DIVIDING'
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
    // InternalBiLang.g:720:1: rule__StatisticalOperator__Alternatives : ( ( ( 'MEAN' ) ) | ( ( 'MEDIAN' ) ) | ( ( 'STD' ) ) );
    public final void rule__StatisticalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:724:1: ( ( ( 'MEAN' ) ) | ( ( 'MEDIAN' ) ) | ( ( 'STD' ) ) )
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
                    // InternalBiLang.g:725:2: ( ( 'MEAN' ) )
                    {
                    // InternalBiLang.g:725:2: ( ( 'MEAN' ) )
                    // InternalBiLang.g:726:3: ( 'MEAN' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 
                    // InternalBiLang.g:727:3: ( 'MEAN' )
                    // InternalBiLang.g:727:4: 'MEAN'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:731:2: ( ( 'MEDIAN' ) )
                    {
                    // InternalBiLang.g:731:2: ( ( 'MEDIAN' ) )
                    // InternalBiLang.g:732:3: ( 'MEDIAN' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 
                    // InternalBiLang.g:733:3: ( 'MEDIAN' )
                    // InternalBiLang.g:733:4: 'MEDIAN'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:737:2: ( ( 'STD' ) )
                    {
                    // InternalBiLang.g:737:2: ( ( 'STD' ) )
                    // InternalBiLang.g:738:3: ( 'STD' )
                    {
                     before(grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2()); 
                    // InternalBiLang.g:739:3: ( 'STD' )
                    // InternalBiLang.g:739:4: 'STD'
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


    // $ANTLR start "rule__Task__Group__0"
    // InternalBiLang.g:747:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:751:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalBiLang.g:752:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalBiLang.g:759:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:763:1: ( ( 'Task' ) )
            // InternalBiLang.g:764:1: ( 'Task' )
            {
            // InternalBiLang.g:764:1: ( 'Task' )
            // InternalBiLang.g:765:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBiLang.g:774:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:778:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalBiLang.g:779:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalBiLang.g:786:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:790:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalBiLang.g:791:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalBiLang.g:791:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalBiLang.g:792:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalBiLang.g:793:2: ( rule__Task__NameAssignment_1 )
            // InternalBiLang.g:793:3: rule__Task__NameAssignment_1
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
    // InternalBiLang.g:801:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:805:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalBiLang.g:806:2: rule__Task__Group__2__Impl rule__Task__Group__3
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
    // InternalBiLang.g:813:1: rule__Task__Group__2__Impl : ( ':' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:817:1: ( ( ':' ) )
            // InternalBiLang.g:818:1: ( ':' )
            {
            // InternalBiLang.g:818:1: ( ':' )
            // InternalBiLang.g:819:2: ':'
            {
             before(grammarAccess.getTaskAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBiLang.g:828:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:832:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalBiLang.g:833:2: rule__Task__Group__3__Impl rule__Task__Group__4
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
    // InternalBiLang.g:840:1: rule__Task__Group__3__Impl : ( 'load' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:844:1: ( ( 'load' ) )
            // InternalBiLang.g:845:1: ( 'load' )
            {
            // InternalBiLang.g:845:1: ( 'load' )
            // InternalBiLang.g:846:2: 'load'
            {
             before(grammarAccess.getTaskAccess().getLoadKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBiLang.g:855:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:859:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalBiLang.g:860:2: rule__Task__Group__4__Impl rule__Task__Group__5
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
    // InternalBiLang.g:867:1: rule__Task__Group__4__Impl : ( ( rule__Task__FileextractorAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:871:1: ( ( ( rule__Task__FileextractorAssignment_4 ) ) )
            // InternalBiLang.g:872:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            {
            // InternalBiLang.g:872:1: ( ( rule__Task__FileextractorAssignment_4 ) )
            // InternalBiLang.g:873:2: ( rule__Task__FileextractorAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_4()); 
            // InternalBiLang.g:874:2: ( rule__Task__FileextractorAssignment_4 )
            // InternalBiLang.g:874:3: rule__Task__FileextractorAssignment_4
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
    // InternalBiLang.g:882:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:886:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalBiLang.g:887:2: rule__Task__Group__5__Impl rule__Task__Group__6
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
    // InternalBiLang.g:894:1: rule__Task__Group__5__Impl : ( ( rule__Task__DatafilteringAssignment_5 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:898:1: ( ( ( rule__Task__DatafilteringAssignment_5 )? ) )
            // InternalBiLang.g:899:1: ( ( rule__Task__DatafilteringAssignment_5 )? )
            {
            // InternalBiLang.g:899:1: ( ( rule__Task__DatafilteringAssignment_5 )? )
            // InternalBiLang.g:900:2: ( rule__Task__DatafilteringAssignment_5 )?
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_5()); 
            // InternalBiLang.g:901:2: ( rule__Task__DatafilteringAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBiLang.g:901:3: rule__Task__DatafilteringAssignment_5
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
    // InternalBiLang.g:909:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:913:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalBiLang.g:914:2: rule__Task__Group__6__Impl rule__Task__Group__7
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
    // InternalBiLang.g:921:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )* ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:925:1: ( ( ( rule__Task__Group_6__0 )* ) )
            // InternalBiLang.g:926:1: ( ( rule__Task__Group_6__0 )* )
            {
            // InternalBiLang.g:926:1: ( ( rule__Task__Group_6__0 )* )
            // InternalBiLang.g:927:2: ( rule__Task__Group_6__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalBiLang.g:928:2: ( rule__Task__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBiLang.g:928:3: rule__Task__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Task__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalBiLang.g:936:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:940:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalBiLang.g:941:2: rule__Task__Group__7__Impl rule__Task__Group__8
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
    // InternalBiLang.g:948:1: rule__Task__Group__7__Impl : ( '[dashboard:' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:952:1: ( ( '[dashboard:' ) )
            // InternalBiLang.g:953:1: ( '[dashboard:' )
            {
            // InternalBiLang.g:953:1: ( '[dashboard:' )
            // InternalBiLang.g:954:2: '[dashboard:'
            {
             before(grammarAccess.getTaskAccess().getDashboardKeyword_7()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBiLang.g:963:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:967:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalBiLang.g:968:2: rule__Task__Group__8__Impl rule__Task__Group__9
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
    // InternalBiLang.g:975:1: rule__Task__Group__8__Impl : ( ( rule__Task__DashboardAssignment_8 ) ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:979:1: ( ( ( rule__Task__DashboardAssignment_8 ) ) )
            // InternalBiLang.g:980:1: ( ( rule__Task__DashboardAssignment_8 ) )
            {
            // InternalBiLang.g:980:1: ( ( rule__Task__DashboardAssignment_8 ) )
            // InternalBiLang.g:981:2: ( rule__Task__DashboardAssignment_8 )
            {
             before(grammarAccess.getTaskAccess().getDashboardAssignment_8()); 
            // InternalBiLang.g:982:2: ( rule__Task__DashboardAssignment_8 )
            // InternalBiLang.g:982:3: rule__Task__DashboardAssignment_8
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
    // InternalBiLang.g:990:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:994:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalBiLang.g:995:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__10();

            state._fsp--;


            }

        }
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
    // InternalBiLang.g:1002:1: rule__Task__Group__9__Impl : ( ( rule__Task__DashboardAssignment_9 )* ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1006:1: ( ( ( rule__Task__DashboardAssignment_9 )* ) )
            // InternalBiLang.g:1007:1: ( ( rule__Task__DashboardAssignment_9 )* )
            {
            // InternalBiLang.g:1007:1: ( ( rule__Task__DashboardAssignment_9 )* )
            // InternalBiLang.g:1008:2: ( rule__Task__DashboardAssignment_9 )*
            {
             before(grammarAccess.getTaskAccess().getDashboardAssignment_9()); 
            // InternalBiLang.g:1009:2: ( rule__Task__DashboardAssignment_9 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBiLang.g:1009:3: rule__Task__DashboardAssignment_9
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Task__DashboardAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getDashboardAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Task__Group__10"
    // InternalBiLang.g:1017:1: rule__Task__Group__10 : rule__Task__Group__10__Impl ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1021:1: ( rule__Task__Group__10__Impl )
            // InternalBiLang.g:1022:2: rule__Task__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10"


    // $ANTLR start "rule__Task__Group__10__Impl"
    // InternalBiLang.g:1028:1: rule__Task__Group__10__Impl : ( ']' ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1032:1: ( ( ']' ) )
            // InternalBiLang.g:1033:1: ( ']' )
            {
            // InternalBiLang.g:1033:1: ( ']' )
            // InternalBiLang.g:1034:2: ']'
            {
             before(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalBiLang.g:1044:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1048:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalBiLang.g:1049:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
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
    // InternalBiLang.g:1056:1: rule__Task__Group_6__0__Impl : ( ( rule__Task__FileextractorAssignment_6_0 ) ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1060:1: ( ( ( rule__Task__FileextractorAssignment_6_0 ) ) )
            // InternalBiLang.g:1061:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            {
            // InternalBiLang.g:1061:1: ( ( rule__Task__FileextractorAssignment_6_0 ) )
            // InternalBiLang.g:1062:2: ( rule__Task__FileextractorAssignment_6_0 )
            {
             before(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0()); 
            // InternalBiLang.g:1063:2: ( rule__Task__FileextractorAssignment_6_0 )
            // InternalBiLang.g:1063:3: rule__Task__FileextractorAssignment_6_0
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
    // InternalBiLang.g:1071:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1075:1: ( rule__Task__Group_6__1__Impl )
            // InternalBiLang.g:1076:2: rule__Task__Group_6__1__Impl
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
    // InternalBiLang.g:1082:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DatafilteringAssignment_6_1 )? ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1086:1: ( ( ( rule__Task__DatafilteringAssignment_6_1 )? ) )
            // InternalBiLang.g:1087:1: ( ( rule__Task__DatafilteringAssignment_6_1 )? )
            {
            // InternalBiLang.g:1087:1: ( ( rule__Task__DatafilteringAssignment_6_1 )? )
            // InternalBiLang.g:1088:2: ( rule__Task__DatafilteringAssignment_6_1 )?
            {
             before(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1()); 
            // InternalBiLang.g:1089:2: ( rule__Task__DatafilteringAssignment_6_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBiLang.g:1089:3: rule__Task__DatafilteringAssignment_6_1
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
    // InternalBiLang.g:1098:1: rule__DataFiltering__Group__0 : rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 ;
    public final void rule__DataFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1102:1: ( rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1 )
            // InternalBiLang.g:1103:2: rule__DataFiltering__Group__0__Impl rule__DataFiltering__Group__1
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
    // InternalBiLang.g:1110:1: rule__DataFiltering__Group__0__Impl : ( 'filter' ) ;
    public final void rule__DataFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1114:1: ( ( 'filter' ) )
            // InternalBiLang.g:1115:1: ( 'filter' )
            {
            // InternalBiLang.g:1115:1: ( 'filter' )
            // InternalBiLang.g:1116:2: 'filter'
            {
             before(grammarAccess.getDataFilteringAccess().getFilterKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getFilterKeyword_0()); 

            }


            }

        }
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
    // InternalBiLang.g:1125:1: rule__DataFiltering__Group__1 : rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 ;
    public final void rule__DataFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1129:1: ( rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2 )
            // InternalBiLang.g:1130:2: rule__DataFiltering__Group__1__Impl rule__DataFiltering__Group__2
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
    // InternalBiLang.g:1137:1: rule__DataFiltering__Group__1__Impl : ( ( rule__DataFiltering__NameAssignment_1 ) ) ;
    public final void rule__DataFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1141:1: ( ( ( rule__DataFiltering__NameAssignment_1 ) ) )
            // InternalBiLang.g:1142:1: ( ( rule__DataFiltering__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1142:1: ( ( rule__DataFiltering__NameAssignment_1 ) )
            // InternalBiLang.g:1143:2: ( rule__DataFiltering__NameAssignment_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1144:2: ( rule__DataFiltering__NameAssignment_1 )
            // InternalBiLang.g:1144:3: rule__DataFiltering__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalBiLang.g:1152:1: rule__DataFiltering__Group__2 : rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 ;
    public final void rule__DataFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1156:1: ( rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3 )
            // InternalBiLang.g:1157:2: rule__DataFiltering__Group__2__Impl rule__DataFiltering__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:1164:1: rule__DataFiltering__Group__2__Impl : ( '=>' ) ;
    public final void rule__DataFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1168:1: ( ( '=>' ) )
            // InternalBiLang.g:1169:1: ( '=>' )
            {
            // InternalBiLang.g:1169:1: ( '=>' )
            // InternalBiLang.g:1170:2: '=>'
            {
             before(grammarAccess.getDataFilteringAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
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
    // InternalBiLang.g:1179:1: rule__DataFiltering__Group__3 : rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4 ;
    public final void rule__DataFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1183:1: ( rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4 )
            // InternalBiLang.g:1184:2: rule__DataFiltering__Group__3__Impl rule__DataFiltering__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__DataFiltering__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__4();

            state._fsp--;


            }

        }
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
    // InternalBiLang.g:1191:1: rule__DataFiltering__Group__3__Impl : ( ( rule__DataFiltering__FileextractorAssignment_3 ) ) ;
    public final void rule__DataFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1195:1: ( ( ( rule__DataFiltering__FileextractorAssignment_3 ) ) )
            // InternalBiLang.g:1196:1: ( ( rule__DataFiltering__FileextractorAssignment_3 ) )
            {
            // InternalBiLang.g:1196:1: ( ( rule__DataFiltering__FileextractorAssignment_3 ) )
            // InternalBiLang.g:1197:2: ( rule__DataFiltering__FileextractorAssignment_3 )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_3()); 
            // InternalBiLang.g:1198:2: ( rule__DataFiltering__FileextractorAssignment_3 )
            // InternalBiLang.g:1198:3: rule__DataFiltering__FileextractorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__FileextractorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataFiltering__Group__4"
    // InternalBiLang.g:1206:1: rule__DataFiltering__Group__4 : rule__DataFiltering__Group__4__Impl rule__DataFiltering__Group__5 ;
    public final void rule__DataFiltering__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1210:1: ( rule__DataFiltering__Group__4__Impl rule__DataFiltering__Group__5 )
            // InternalBiLang.g:1211:2: rule__DataFiltering__Group__4__Impl rule__DataFiltering__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__DataFiltering__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__4"


    // $ANTLR start "rule__DataFiltering__Group__4__Impl"
    // InternalBiLang.g:1218:1: rule__DataFiltering__Group__4__Impl : ( ( rule__DataFiltering__Group_4__0 )? ) ;
    public final void rule__DataFiltering__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1222:1: ( ( ( rule__DataFiltering__Group_4__0 )? ) )
            // InternalBiLang.g:1223:1: ( ( rule__DataFiltering__Group_4__0 )? )
            {
            // InternalBiLang.g:1223:1: ( ( rule__DataFiltering__Group_4__0 )? )
            // InternalBiLang.g:1224:2: ( rule__DataFiltering__Group_4__0 )?
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_4()); 
            // InternalBiLang.g:1225:2: ( rule__DataFiltering__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBiLang.g:1225:3: rule__DataFiltering__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFiltering__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFilteringAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__4__Impl"


    // $ANTLR start "rule__DataFiltering__Group__5"
    // InternalBiLang.g:1233:1: rule__DataFiltering__Group__5 : rule__DataFiltering__Group__5__Impl rule__DataFiltering__Group__6 ;
    public final void rule__DataFiltering__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1237:1: ( rule__DataFiltering__Group__5__Impl rule__DataFiltering__Group__6 )
            // InternalBiLang.g:1238:2: rule__DataFiltering__Group__5__Impl rule__DataFiltering__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__DataFiltering__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__5"


    // $ANTLR start "rule__DataFiltering__Group__5__Impl"
    // InternalBiLang.g:1245:1: rule__DataFiltering__Group__5__Impl : ( 'filtering step=' ) ;
    public final void rule__DataFiltering__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1249:1: ( ( 'filtering step=' ) )
            // InternalBiLang.g:1250:1: ( 'filtering step=' )
            {
            // InternalBiLang.g:1250:1: ( 'filtering step=' )
            // InternalBiLang.g:1251:2: 'filtering step='
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringStepKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getFilteringStepKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__5__Impl"


    // $ANTLR start "rule__DataFiltering__Group__6"
    // InternalBiLang.g:1260:1: rule__DataFiltering__Group__6 : rule__DataFiltering__Group__6__Impl rule__DataFiltering__Group__7 ;
    public final void rule__DataFiltering__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1264:1: ( rule__DataFiltering__Group__6__Impl rule__DataFiltering__Group__7 )
            // InternalBiLang.g:1265:2: rule__DataFiltering__Group__6__Impl rule__DataFiltering__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__DataFiltering__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__6"


    // $ANTLR start "rule__DataFiltering__Group__6__Impl"
    // InternalBiLang.g:1272:1: rule__DataFiltering__Group__6__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_6 ) ) ;
    public final void rule__DataFiltering__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1276:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_6 ) ) )
            // InternalBiLang.g:1277:1: ( ( rule__DataFiltering__FilteringstepAssignment_6 ) )
            {
            // InternalBiLang.g:1277:1: ( ( rule__DataFiltering__FilteringstepAssignment_6 ) )
            // InternalBiLang.g:1278:2: ( rule__DataFiltering__FilteringstepAssignment_6 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_6()); 
            // InternalBiLang.g:1279:2: ( rule__DataFiltering__FilteringstepAssignment_6 )
            // InternalBiLang.g:1279:3: rule__DataFiltering__FilteringstepAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__FilteringstepAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__6__Impl"


    // $ANTLR start "rule__DataFiltering__Group__7"
    // InternalBiLang.g:1287:1: rule__DataFiltering__Group__7 : rule__DataFiltering__Group__7__Impl ;
    public final void rule__DataFiltering__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1291:1: ( rule__DataFiltering__Group__7__Impl )
            // InternalBiLang.g:1292:2: rule__DataFiltering__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__7"


    // $ANTLR start "rule__DataFiltering__Group__7__Impl"
    // InternalBiLang.g:1298:1: rule__DataFiltering__Group__7__Impl : ( ( rule__DataFiltering__Group_7__0 )* ) ;
    public final void rule__DataFiltering__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1302:1: ( ( ( rule__DataFiltering__Group_7__0 )* ) )
            // InternalBiLang.g:1303:1: ( ( rule__DataFiltering__Group_7__0 )* )
            {
            // InternalBiLang.g:1303:1: ( ( rule__DataFiltering__Group_7__0 )* )
            // InternalBiLang.g:1304:2: ( rule__DataFiltering__Group_7__0 )*
            {
             before(grammarAccess.getDataFilteringAccess().getGroup_7()); 
            // InternalBiLang.g:1305:2: ( rule__DataFiltering__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBiLang.g:1305:3: rule__DataFiltering__Group_7__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__DataFiltering__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group__7__Impl"


    // $ANTLR start "rule__DataFiltering__Group_4__0"
    // InternalBiLang.g:1314:1: rule__DataFiltering__Group_4__0 : rule__DataFiltering__Group_4__0__Impl rule__DataFiltering__Group_4__1 ;
    public final void rule__DataFiltering__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1318:1: ( rule__DataFiltering__Group_4__0__Impl rule__DataFiltering__Group_4__1 )
            // InternalBiLang.g:1319:2: rule__DataFiltering__Group_4__0__Impl rule__DataFiltering__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__DataFiltering__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_4__0"


    // $ANTLR start "rule__DataFiltering__Group_4__0__Impl"
    // InternalBiLang.g:1326:1: rule__DataFiltering__Group_4__0__Impl : ( 'processing step=' ) ;
    public final void rule__DataFiltering__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1330:1: ( ( 'processing step=' ) )
            // InternalBiLang.g:1331:1: ( 'processing step=' )
            {
            // InternalBiLang.g:1331:1: ( 'processing step=' )
            // InternalBiLang.g:1332:2: 'processing step='
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingStepKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getProcessingStepKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_4__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_4__1"
    // InternalBiLang.g:1341:1: rule__DataFiltering__Group_4__1 : rule__DataFiltering__Group_4__1__Impl rule__DataFiltering__Group_4__2 ;
    public final void rule__DataFiltering__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1345:1: ( rule__DataFiltering__Group_4__1__Impl rule__DataFiltering__Group_4__2 )
            // InternalBiLang.g:1346:2: rule__DataFiltering__Group_4__1__Impl rule__DataFiltering__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__DataFiltering__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_4__1"


    // $ANTLR start "rule__DataFiltering__Group_4__1__Impl"
    // InternalBiLang.g:1353:1: rule__DataFiltering__Group_4__1__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_4_1 ) ) ;
    public final void rule__DataFiltering__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1357:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_4_1 ) ) )
            // InternalBiLang.g:1358:1: ( ( rule__DataFiltering__ProcessingstepAssignment_4_1 ) )
            {
            // InternalBiLang.g:1358:1: ( ( rule__DataFiltering__ProcessingstepAssignment_4_1 ) )
            // InternalBiLang.g:1359:2: ( rule__DataFiltering__ProcessingstepAssignment_4_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_4_1()); 
            // InternalBiLang.g:1360:2: ( rule__DataFiltering__ProcessingstepAssignment_4_1 )
            // InternalBiLang.g:1360:3: rule__DataFiltering__ProcessingstepAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__ProcessingstepAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_4__1__Impl"


    // $ANTLR start "rule__DataFiltering__Group_4__2"
    // InternalBiLang.g:1368:1: rule__DataFiltering__Group_4__2 : rule__DataFiltering__Group_4__2__Impl ;
    public final void rule__DataFiltering__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1372:1: ( rule__DataFiltering__Group_4__2__Impl )
            // InternalBiLang.g:1373:2: rule__DataFiltering__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_4__2"


    // $ANTLR start "rule__DataFiltering__Group_4__2__Impl"
    // InternalBiLang.g:1379:1: rule__DataFiltering__Group_4__2__Impl : ( ( rule__DataFiltering__ProcessingstepAssignment_4_2 )* ) ;
    public final void rule__DataFiltering__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1383:1: ( ( ( rule__DataFiltering__ProcessingstepAssignment_4_2 )* ) )
            // InternalBiLang.g:1384:1: ( ( rule__DataFiltering__ProcessingstepAssignment_4_2 )* )
            {
            // InternalBiLang.g:1384:1: ( ( rule__DataFiltering__ProcessingstepAssignment_4_2 )* )
            // InternalBiLang.g:1385:2: ( rule__DataFiltering__ProcessingstepAssignment_4_2 )*
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_4_2()); 
            // InternalBiLang.g:1386:2: ( rule__DataFiltering__ProcessingstepAssignment_4_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=17 && LA16_0<=19)||LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBiLang.g:1386:3: rule__DataFiltering__ProcessingstepAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataFiltering__ProcessingstepAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_4__2__Impl"


    // $ANTLR start "rule__DataFiltering__Group_7__0"
    // InternalBiLang.g:1395:1: rule__DataFiltering__Group_7__0 : rule__DataFiltering__Group_7__0__Impl rule__DataFiltering__Group_7__1 ;
    public final void rule__DataFiltering__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1399:1: ( rule__DataFiltering__Group_7__0__Impl rule__DataFiltering__Group_7__1 )
            // InternalBiLang.g:1400:2: rule__DataFiltering__Group_7__0__Impl rule__DataFiltering__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__DataFiltering__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_7__0"


    // $ANTLR start "rule__DataFiltering__Group_7__0__Impl"
    // InternalBiLang.g:1407:1: rule__DataFiltering__Group_7__0__Impl : ( ',' ) ;
    public final void rule__DataFiltering__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1411:1: ( ( ',' ) )
            // InternalBiLang.g:1412:1: ( ',' )
            {
            // InternalBiLang.g:1412:1: ( ',' )
            // InternalBiLang.g:1413:2: ','
            {
             before(grammarAccess.getDataFilteringAccess().getCommaKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataFilteringAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_7__0__Impl"


    // $ANTLR start "rule__DataFiltering__Group_7__1"
    // InternalBiLang.g:1422:1: rule__DataFiltering__Group_7__1 : rule__DataFiltering__Group_7__1__Impl ;
    public final void rule__DataFiltering__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1426:1: ( rule__DataFiltering__Group_7__1__Impl )
            // InternalBiLang.g:1427:2: rule__DataFiltering__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_7__1"


    // $ANTLR start "rule__DataFiltering__Group_7__1__Impl"
    // InternalBiLang.g:1433:1: rule__DataFiltering__Group_7__1__Impl : ( ( rule__DataFiltering__FilteringstepAssignment_7_1 ) ) ;
    public final void rule__DataFiltering__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1437:1: ( ( ( rule__DataFiltering__FilteringstepAssignment_7_1 ) ) )
            // InternalBiLang.g:1438:1: ( ( rule__DataFiltering__FilteringstepAssignment_7_1 ) )
            {
            // InternalBiLang.g:1438:1: ( ( rule__DataFiltering__FilteringstepAssignment_7_1 ) )
            // InternalBiLang.g:1439:2: ( rule__DataFiltering__FilteringstepAssignment_7_1 )
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_7_1()); 
            // InternalBiLang.g:1440:2: ( rule__DataFiltering__FilteringstepAssignment_7_1 )
            // InternalBiLang.g:1440:3: rule__DataFiltering__FilteringstepAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFiltering__FilteringstepAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__Group_7__1__Impl"


    // $ANTLR start "rule__DashBoard__Group__0"
    // InternalBiLang.g:1449:1: rule__DashBoard__Group__0 : rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 ;
    public final void rule__DashBoard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1453:1: ( rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1 )
            // InternalBiLang.g:1454:2: rule__DashBoard__Group__0__Impl rule__DashBoard__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:1461:1: rule__DashBoard__Group__0__Impl : ( ( rule__DashBoard__NameAssignment_0 ) ) ;
    public final void rule__DashBoard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1465:1: ( ( ( rule__DashBoard__NameAssignment_0 ) ) )
            // InternalBiLang.g:1466:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            {
            // InternalBiLang.g:1466:1: ( ( rule__DashBoard__NameAssignment_0 ) )
            // InternalBiLang.g:1467:2: ( rule__DashBoard__NameAssignment_0 )
            {
             before(grammarAccess.getDashBoardAccess().getNameAssignment_0()); 
            // InternalBiLang.g:1468:2: ( rule__DashBoard__NameAssignment_0 )
            // InternalBiLang.g:1468:3: rule__DashBoard__NameAssignment_0
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
    // InternalBiLang.g:1476:1: rule__DashBoard__Group__1 : rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 ;
    public final void rule__DashBoard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1480:1: ( rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2 )
            // InternalBiLang.g:1481:2: rule__DashBoard__Group__1__Impl rule__DashBoard__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalBiLang.g:1488:1: rule__DashBoard__Group__1__Impl : ( '=>' ) ;
    public final void rule__DashBoard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1492:1: ( ( '=>' ) )
            // InternalBiLang.g:1493:1: ( '=>' )
            {
            // InternalBiLang.g:1493:1: ( '=>' )
            // InternalBiLang.g:1494:2: '=>'
            {
             before(grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBiLang.g:1503:1: rule__DashBoard__Group__2 : rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 ;
    public final void rule__DashBoard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1507:1: ( rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3 )
            // InternalBiLang.g:1508:2: rule__DashBoard__Group__2__Impl rule__DashBoard__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalBiLang.g:1515:1: rule__DashBoard__Group__2__Impl : ( ( rule__DashBoard__Alternatives_2 ) ) ;
    public final void rule__DashBoard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1519:1: ( ( ( rule__DashBoard__Alternatives_2 ) ) )
            // InternalBiLang.g:1520:1: ( ( rule__DashBoard__Alternatives_2 ) )
            {
            // InternalBiLang.g:1520:1: ( ( rule__DashBoard__Alternatives_2 ) )
            // InternalBiLang.g:1521:2: ( rule__DashBoard__Alternatives_2 )
            {
             before(grammarAccess.getDashBoardAccess().getAlternatives_2()); 
            // InternalBiLang.g:1522:2: ( rule__DashBoard__Alternatives_2 )
            // InternalBiLang.g:1522:3: rule__DashBoard__Alternatives_2
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
    // InternalBiLang.g:1530:1: rule__DashBoard__Group__3 : rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 ;
    public final void rule__DashBoard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1534:1: ( rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4 )
            // InternalBiLang.g:1535:2: rule__DashBoard__Group__3__Impl rule__DashBoard__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalBiLang.g:1542:1: rule__DashBoard__Group__3__Impl : ( 'plots' ) ;
    public final void rule__DashBoard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1546:1: ( ( 'plots' ) )
            // InternalBiLang.g:1547:1: ( 'plots' )
            {
            // InternalBiLang.g:1547:1: ( 'plots' )
            // InternalBiLang.g:1548:2: 'plots'
            {
             before(grammarAccess.getDashBoardAccess().getPlotsKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBiLang.g:1557:1: rule__DashBoard__Group__4 : rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 ;
    public final void rule__DashBoard__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1561:1: ( rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5 )
            // InternalBiLang.g:1562:2: rule__DashBoard__Group__4__Impl rule__DashBoard__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalBiLang.g:1569:1: rule__DashBoard__Group__4__Impl : ( '{' ) ;
    public final void rule__DashBoard__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1573:1: ( ( '{' ) )
            // InternalBiLang.g:1574:1: ( '{' )
            {
            // InternalBiLang.g:1574:1: ( '{' )
            // InternalBiLang.g:1575:2: '{'
            {
             before(grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBiLang.g:1584:1: rule__DashBoard__Group__5 : rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6 ;
    public final void rule__DashBoard__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1588:1: ( rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6 )
            // InternalBiLang.g:1589:2: rule__DashBoard__Group__5__Impl rule__DashBoard__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:1596:1: rule__DashBoard__Group__5__Impl : ( ( rule__DashBoard__PlotAssignment_5 ) ) ;
    public final void rule__DashBoard__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1600:1: ( ( ( rule__DashBoard__PlotAssignment_5 ) ) )
            // InternalBiLang.g:1601:1: ( ( rule__DashBoard__PlotAssignment_5 ) )
            {
            // InternalBiLang.g:1601:1: ( ( rule__DashBoard__PlotAssignment_5 ) )
            // InternalBiLang.g:1602:2: ( rule__DashBoard__PlotAssignment_5 )
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_5()); 
            // InternalBiLang.g:1603:2: ( rule__DashBoard__PlotAssignment_5 )
            // InternalBiLang.g:1603:3: rule__DashBoard__PlotAssignment_5
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
    // InternalBiLang.g:1611:1: rule__DashBoard__Group__6 : rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7 ;
    public final void rule__DashBoard__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1615:1: ( rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7 )
            // InternalBiLang.g:1616:2: rule__DashBoard__Group__6__Impl rule__DashBoard__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalBiLang.g:1623:1: rule__DashBoard__Group__6__Impl : ( ( rule__DashBoard__PlotAssignment_6 )* ) ;
    public final void rule__DashBoard__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1627:1: ( ( ( rule__DashBoard__PlotAssignment_6 )* ) )
            // InternalBiLang.g:1628:1: ( ( rule__DashBoard__PlotAssignment_6 )* )
            {
            // InternalBiLang.g:1628:1: ( ( rule__DashBoard__PlotAssignment_6 )* )
            // InternalBiLang.g:1629:2: ( rule__DashBoard__PlotAssignment_6 )*
            {
             before(grammarAccess.getDashBoardAccess().getPlotAssignment_6()); 
            // InternalBiLang.g:1630:2: ( rule__DashBoard__PlotAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46||LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBiLang.g:1630:3: rule__DashBoard__PlotAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DashBoard__PlotAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalBiLang.g:1638:1: rule__DashBoard__Group__7 : rule__DashBoard__Group__7__Impl ;
    public final void rule__DashBoard__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1642:1: ( rule__DashBoard__Group__7__Impl )
            // InternalBiLang.g:1643:2: rule__DashBoard__Group__7__Impl
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
    // InternalBiLang.g:1649:1: rule__DashBoard__Group__7__Impl : ( '}' ) ;
    public final void rule__DashBoard__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1653:1: ( ( '}' ) )
            // InternalBiLang.g:1654:1: ( '}' )
            {
            // InternalBiLang.g:1654:1: ( '}' )
            // InternalBiLang.g:1655:2: '}'
            {
             before(grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_7()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBiLang.g:1665:1: rule__DashBoard__Group_2_0__0 : rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1 ;
    public final void rule__DashBoard__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1669:1: ( rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1 )
            // InternalBiLang.g:1670:2: rule__DashBoard__Group_2_0__0__Impl rule__DashBoard__Group_2_0__1
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
    // InternalBiLang.g:1677:1: rule__DashBoard__Group_2_0__0__Impl : ( 'e' ) ;
    public final void rule__DashBoard__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1681:1: ( ( 'e' ) )
            // InternalBiLang.g:1682:1: ( 'e' )
            {
            // InternalBiLang.g:1682:1: ( 'e' )
            // InternalBiLang.g:1683:2: 'e'
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
    // InternalBiLang.g:1692:1: rule__DashBoard__Group_2_0__1 : rule__DashBoard__Group_2_0__1__Impl ;
    public final void rule__DashBoard__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1696:1: ( rule__DashBoard__Group_2_0__1__Impl )
            // InternalBiLang.g:1697:2: rule__DashBoard__Group_2_0__1__Impl
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
    // InternalBiLang.g:1703:1: rule__DashBoard__Group_2_0__1__Impl : ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) ) ;
    public final void rule__DashBoard__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1707:1: ( ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) ) )
            // InternalBiLang.g:1708:1: ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) )
            {
            // InternalBiLang.g:1708:1: ( ( rule__DashBoard__FileextractorAssignment_2_0_1 ) )
            // InternalBiLang.g:1709:2: ( rule__DashBoard__FileextractorAssignment_2_0_1 )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0_1()); 
            // InternalBiLang.g:1710:2: ( rule__DashBoard__FileextractorAssignment_2_0_1 )
            // InternalBiLang.g:1710:3: rule__DashBoard__FileextractorAssignment_2_0_1
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
    // InternalBiLang.g:1719:1: rule__DashBoard__Group_2_1__0 : rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1 ;
    public final void rule__DashBoard__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1723:1: ( rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1 )
            // InternalBiLang.g:1724:2: rule__DashBoard__Group_2_1__0__Impl rule__DashBoard__Group_2_1__1
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
    // InternalBiLang.g:1731:1: rule__DashBoard__Group_2_1__0__Impl : ( 'df' ) ;
    public final void rule__DashBoard__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1735:1: ( ( 'df' ) )
            // InternalBiLang.g:1736:1: ( 'df' )
            {
            // InternalBiLang.g:1736:1: ( 'df' )
            // InternalBiLang.g:1737:2: 'df'
            {
             before(grammarAccess.getDashBoardAccess().getDfKeyword_2_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBiLang.g:1746:1: rule__DashBoard__Group_2_1__1 : rule__DashBoard__Group_2_1__1__Impl ;
    public final void rule__DashBoard__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1750:1: ( rule__DashBoard__Group_2_1__1__Impl )
            // InternalBiLang.g:1751:2: rule__DashBoard__Group_2_1__1__Impl
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
    // InternalBiLang.g:1757:1: rule__DashBoard__Group_2_1__1__Impl : ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) ) ;
    public final void rule__DashBoard__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1761:1: ( ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) ) )
            // InternalBiLang.g:1762:1: ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) )
            {
            // InternalBiLang.g:1762:1: ( ( rule__DashBoard__DatafilteringAssignment_2_1_1 ) )
            // InternalBiLang.g:1763:2: ( rule__DashBoard__DatafilteringAssignment_2_1_1 )
            {
             before(grammarAccess.getDashBoardAccess().getDatafilteringAssignment_2_1_1()); 
            // InternalBiLang.g:1764:2: ( rule__DashBoard__DatafilteringAssignment_2_1_1 )
            // InternalBiLang.g:1764:3: rule__DashBoard__DatafilteringAssignment_2_1_1
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
    // InternalBiLang.g:1773:1: rule__CsvExtractor__Group__0 : rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1 ;
    public final void rule__CsvExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1777:1: ( rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1 )
            // InternalBiLang.g:1778:2: rule__CsvExtractor__Group__0__Impl rule__CsvExtractor__Group__1
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
    // InternalBiLang.g:1785:1: rule__CsvExtractor__Group__0__Impl : ( () ) ;
    public final void rule__CsvExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1789:1: ( ( () ) )
            // InternalBiLang.g:1790:1: ( () )
            {
            // InternalBiLang.g:1790:1: ( () )
            // InternalBiLang.g:1791:2: ()
            {
             before(grammarAccess.getCsvExtractorAccess().getCsvExtractorAction_0()); 
            // InternalBiLang.g:1792:2: ()
            // InternalBiLang.g:1792:3: 
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
    // InternalBiLang.g:1800:1: rule__CsvExtractor__Group__1 : rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2 ;
    public final void rule__CsvExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1804:1: ( rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2 )
            // InternalBiLang.g:1805:2: rule__CsvExtractor__Group__1__Impl rule__CsvExtractor__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalBiLang.g:1812:1: rule__CsvExtractor__Group__1__Impl : ( ( rule__CsvExtractor__NameAssignment_1 ) ) ;
    public final void rule__CsvExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1816:1: ( ( ( rule__CsvExtractor__NameAssignment_1 ) ) )
            // InternalBiLang.g:1817:1: ( ( rule__CsvExtractor__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1817:1: ( ( rule__CsvExtractor__NameAssignment_1 ) )
            // InternalBiLang.g:1818:2: ( rule__CsvExtractor__NameAssignment_1 )
            {
             before(grammarAccess.getCsvExtractorAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1819:2: ( rule__CsvExtractor__NameAssignment_1 )
            // InternalBiLang.g:1819:3: rule__CsvExtractor__NameAssignment_1
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
    // InternalBiLang.g:1827:1: rule__CsvExtractor__Group__2 : rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3 ;
    public final void rule__CsvExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1831:1: ( rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3 )
            // InternalBiLang.g:1832:2: rule__CsvExtractor__Group__2__Impl rule__CsvExtractor__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:1839:1: rule__CsvExtractor__Group__2__Impl : ( '.csv' ) ;
    public final void rule__CsvExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1843:1: ( ( '.csv' ) )
            // InternalBiLang.g:1844:1: ( '.csv' )
            {
            // InternalBiLang.g:1844:1: ( '.csv' )
            // InternalBiLang.g:1845:2: '.csv'
            {
             before(grammarAccess.getCsvExtractorAccess().getCsvKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalBiLang.g:1854:1: rule__CsvExtractor__Group__3 : rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4 ;
    public final void rule__CsvExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1858:1: ( rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4 )
            // InternalBiLang.g:1859:2: rule__CsvExtractor__Group__3__Impl rule__CsvExtractor__Group__4
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
    // InternalBiLang.g:1866:1: rule__CsvExtractor__Group__3__Impl : ( '=>' ) ;
    public final void rule__CsvExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1870:1: ( ( '=>' ) )
            // InternalBiLang.g:1871:1: ( '=>' )
            {
            // InternalBiLang.g:1871:1: ( '=>' )
            // InternalBiLang.g:1872:2: '=>'
            {
             before(grammarAccess.getCsvExtractorAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBiLang.g:1881:1: rule__CsvExtractor__Group__4 : rule__CsvExtractor__Group__4__Impl ;
    public final void rule__CsvExtractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1885:1: ( rule__CsvExtractor__Group__4__Impl )
            // InternalBiLang.g:1886:2: rule__CsvExtractor__Group__4__Impl
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
    // InternalBiLang.g:1892:1: rule__CsvExtractor__Group__4__Impl : ( ( rule__CsvExtractor__PathAssignment_4 ) ) ;
    public final void rule__CsvExtractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1896:1: ( ( ( rule__CsvExtractor__PathAssignment_4 ) ) )
            // InternalBiLang.g:1897:1: ( ( rule__CsvExtractor__PathAssignment_4 ) )
            {
            // InternalBiLang.g:1897:1: ( ( rule__CsvExtractor__PathAssignment_4 ) )
            // InternalBiLang.g:1898:2: ( rule__CsvExtractor__PathAssignment_4 )
            {
             before(grammarAccess.getCsvExtractorAccess().getPathAssignment_4()); 
            // InternalBiLang.g:1899:2: ( rule__CsvExtractor__PathAssignment_4 )
            // InternalBiLang.g:1899:3: rule__CsvExtractor__PathAssignment_4
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
    // InternalBiLang.g:1908:1: rule__ExcelExtractor__Group__0 : rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1 ;
    public final void rule__ExcelExtractor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1912:1: ( rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1 )
            // InternalBiLang.g:1913:2: rule__ExcelExtractor__Group__0__Impl rule__ExcelExtractor__Group__1
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
    // InternalBiLang.g:1920:1: rule__ExcelExtractor__Group__0__Impl : ( () ) ;
    public final void rule__ExcelExtractor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1924:1: ( ( () ) )
            // InternalBiLang.g:1925:1: ( () )
            {
            // InternalBiLang.g:1925:1: ( () )
            // InternalBiLang.g:1926:2: ()
            {
             before(grammarAccess.getExcelExtractorAccess().getExcelExtractorAction_0()); 
            // InternalBiLang.g:1927:2: ()
            // InternalBiLang.g:1927:3: 
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
    // InternalBiLang.g:1935:1: rule__ExcelExtractor__Group__1 : rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2 ;
    public final void rule__ExcelExtractor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1939:1: ( rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2 )
            // InternalBiLang.g:1940:2: rule__ExcelExtractor__Group__1__Impl rule__ExcelExtractor__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBiLang.g:1947:1: rule__ExcelExtractor__Group__1__Impl : ( ( rule__ExcelExtractor__NameAssignment_1 ) ) ;
    public final void rule__ExcelExtractor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1951:1: ( ( ( rule__ExcelExtractor__NameAssignment_1 ) ) )
            // InternalBiLang.g:1952:1: ( ( rule__ExcelExtractor__NameAssignment_1 ) )
            {
            // InternalBiLang.g:1952:1: ( ( rule__ExcelExtractor__NameAssignment_1 ) )
            // InternalBiLang.g:1953:2: ( rule__ExcelExtractor__NameAssignment_1 )
            {
             before(grammarAccess.getExcelExtractorAccess().getNameAssignment_1()); 
            // InternalBiLang.g:1954:2: ( rule__ExcelExtractor__NameAssignment_1 )
            // InternalBiLang.g:1954:3: rule__ExcelExtractor__NameAssignment_1
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
    // InternalBiLang.g:1962:1: rule__ExcelExtractor__Group__2 : rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3 ;
    public final void rule__ExcelExtractor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1966:1: ( rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3 )
            // InternalBiLang.g:1967:2: rule__ExcelExtractor__Group__2__Impl rule__ExcelExtractor__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalBiLang.g:1974:1: rule__ExcelExtractor__Group__2__Impl : ( '.xlsx' ) ;
    public final void rule__ExcelExtractor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1978:1: ( ( '.xlsx' ) )
            // InternalBiLang.g:1979:1: ( '.xlsx' )
            {
            // InternalBiLang.g:1979:1: ( '.xlsx' )
            // InternalBiLang.g:1980:2: '.xlsx'
            {
             before(grammarAccess.getExcelExtractorAccess().getXlsxKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalBiLang.g:1989:1: rule__ExcelExtractor__Group__3 : rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4 ;
    public final void rule__ExcelExtractor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:1993:1: ( rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4 )
            // InternalBiLang.g:1994:2: rule__ExcelExtractor__Group__3__Impl rule__ExcelExtractor__Group__4
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
    // InternalBiLang.g:2001:1: rule__ExcelExtractor__Group__3__Impl : ( '=>' ) ;
    public final void rule__ExcelExtractor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2005:1: ( ( '=>' ) )
            // InternalBiLang.g:2006:1: ( '=>' )
            {
            // InternalBiLang.g:2006:1: ( '=>' )
            // InternalBiLang.g:2007:2: '=>'
            {
             before(grammarAccess.getExcelExtractorAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBiLang.g:2016:1: rule__ExcelExtractor__Group__4 : rule__ExcelExtractor__Group__4__Impl ;
    public final void rule__ExcelExtractor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2020:1: ( rule__ExcelExtractor__Group__4__Impl )
            // InternalBiLang.g:2021:2: rule__ExcelExtractor__Group__4__Impl
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
    // InternalBiLang.g:2027:1: rule__ExcelExtractor__Group__4__Impl : ( ( rule__ExcelExtractor__PathAssignment_4 ) ) ;
    public final void rule__ExcelExtractor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2031:1: ( ( ( rule__ExcelExtractor__PathAssignment_4 ) ) )
            // InternalBiLang.g:2032:1: ( ( rule__ExcelExtractor__PathAssignment_4 ) )
            {
            // InternalBiLang.g:2032:1: ( ( rule__ExcelExtractor__PathAssignment_4 ) )
            // InternalBiLang.g:2033:2: ( rule__ExcelExtractor__PathAssignment_4 )
            {
             before(grammarAccess.getExcelExtractorAccess().getPathAssignment_4()); 
            // InternalBiLang.g:2034:2: ( rule__ExcelExtractor__PathAssignment_4 )
            // InternalBiLang.g:2034:3: rule__ExcelExtractor__PathAssignment_4
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
    // InternalBiLang.g:2043:1: rule__QuantitativeFiltering__Group__0 : rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 ;
    public final void rule__QuantitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2047:1: ( rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1 )
            // InternalBiLang.g:2048:2: rule__QuantitativeFiltering__Group__0__Impl rule__QuantitativeFiltering__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalBiLang.g:2055:1: rule__QuantitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QuantitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2059:1: ( ( () ) )
            // InternalBiLang.g:2060:1: ( () )
            {
            // InternalBiLang.g:2060:1: ( () )
            // InternalBiLang.g:2061:2: ()
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0()); 
            // InternalBiLang.g:2062:2: ()
            // InternalBiLang.g:2062:3: 
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
    // InternalBiLang.g:2070:1: rule__QuantitativeFiltering__Group__1 : rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 ;
    public final void rule__QuantitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2074:1: ( rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2 )
            // InternalBiLang.g:2075:2: rule__QuantitativeFiltering__Group__1__Impl rule__QuantitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:2082:1: rule__QuantitativeFiltering__Group__1__Impl : ( 'quanti axis->' ) ;
    public final void rule__QuantitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2086:1: ( ( 'quanti axis->' ) )
            // InternalBiLang.g:2087:1: ( 'quanti axis->' )
            {
            // InternalBiLang.g:2087:1: ( 'quanti axis->' )
            // InternalBiLang.g:2088:2: 'quanti axis->'
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getQuantiAxisKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQuantitativeFilteringAccess().getQuantiAxisKeyword_1()); 

            }


            }

        }
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
    // InternalBiLang.g:2097:1: rule__QuantitativeFiltering__Group__2 : rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 ;
    public final void rule__QuantitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2101:1: ( rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3 )
            // InternalBiLang.g:2102:2: rule__QuantitativeFiltering__Group__2__Impl rule__QuantitativeFiltering__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalBiLang.g:2109:1: rule__QuantitativeFiltering__Group__2__Impl : ( ( rule__QuantitativeFiltering__AxisAssignment_2 ) ) ;
    public final void rule__QuantitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2113:1: ( ( ( rule__QuantitativeFiltering__AxisAssignment_2 ) ) )
            // InternalBiLang.g:2114:1: ( ( rule__QuantitativeFiltering__AxisAssignment_2 ) )
            {
            // InternalBiLang.g:2114:1: ( ( rule__QuantitativeFiltering__AxisAssignment_2 ) )
            // InternalBiLang.g:2115:2: ( rule__QuantitativeFiltering__AxisAssignment_2 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_2()); 
            // InternalBiLang.g:2116:2: ( rule__QuantitativeFiltering__AxisAssignment_2 )
            // InternalBiLang.g:2116:3: rule__QuantitativeFiltering__AxisAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__AxisAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_2()); 

            }


            }

        }
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
    // InternalBiLang.g:2124:1: rule__QuantitativeFiltering__Group__3 : rule__QuantitativeFiltering__Group__3__Impl rule__QuantitativeFiltering__Group__4 ;
    public final void rule__QuantitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2128:1: ( rule__QuantitativeFiltering__Group__3__Impl rule__QuantitativeFiltering__Group__4 )
            // InternalBiLang.g:2129:2: rule__QuantitativeFiltering__Group__3__Impl rule__QuantitativeFiltering__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__QuantitativeFiltering__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__Group__4();

            state._fsp--;


            }

        }
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
    // InternalBiLang.g:2136:1: rule__QuantitativeFiltering__Group__3__Impl : ( 'value' ) ;
    public final void rule__QuantitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2140:1: ( ( 'value' ) )
            // InternalBiLang.g:2141:1: ( 'value' )
            {
            // InternalBiLang.g:2141:1: ( 'value' )
            // InternalBiLang.g:2142:2: 'value'
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValueKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getQuantitativeFilteringAccess().getValueKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuantitativeFiltering__Group__4"
    // InternalBiLang.g:2151:1: rule__QuantitativeFiltering__Group__4 : rule__QuantitativeFiltering__Group__4__Impl ;
    public final void rule__QuantitativeFiltering__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2155:1: ( rule__QuantitativeFiltering__Group__4__Impl )
            // InternalBiLang.g:2156:2: rule__QuantitativeFiltering__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantitativeFiltering__Group__4"


    // $ANTLR start "rule__QuantitativeFiltering__Group__4__Impl"
    // InternalBiLang.g:2162:1: rule__QuantitativeFiltering__Group__4__Impl : ( ( rule__QuantitativeFiltering__ValuesAssignment_4 ) ) ;
    public final void rule__QuantitativeFiltering__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2166:1: ( ( ( rule__QuantitativeFiltering__ValuesAssignment_4 ) ) )
            // InternalBiLang.g:2167:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_4 ) )
            {
            // InternalBiLang.g:2167:1: ( ( rule__QuantitativeFiltering__ValuesAssignment_4 ) )
            // InternalBiLang.g:2168:2: ( rule__QuantitativeFiltering__ValuesAssignment_4 )
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_4()); 
            // InternalBiLang.g:2169:2: ( rule__QuantitativeFiltering__ValuesAssignment_4 )
            // InternalBiLang.g:2169:3: rule__QuantitativeFiltering__ValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__QuantitativeFiltering__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantitativeFiltering__Group__4__Impl"


    // $ANTLR start "rule__QualitativeFiltering__Group__0"
    // InternalBiLang.g:2178:1: rule__QualitativeFiltering__Group__0 : rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 ;
    public final void rule__QualitativeFiltering__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2182:1: ( rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1 )
            // InternalBiLang.g:2183:2: rule__QualitativeFiltering__Group__0__Impl rule__QualitativeFiltering__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalBiLang.g:2190:1: rule__QualitativeFiltering__Group__0__Impl : ( () ) ;
    public final void rule__QualitativeFiltering__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2194:1: ( ( () ) )
            // InternalBiLang.g:2195:1: ( () )
            {
            // InternalBiLang.g:2195:1: ( () )
            // InternalBiLang.g:2196:2: ()
            {
             before(grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0()); 
            // InternalBiLang.g:2197:2: ()
            // InternalBiLang.g:2197:3: 
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
    // InternalBiLang.g:2205:1: rule__QualitativeFiltering__Group__1 : rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 ;
    public final void rule__QualitativeFiltering__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2209:1: ( rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2 )
            // InternalBiLang.g:2210:2: rule__QualitativeFiltering__Group__1__Impl rule__QualitativeFiltering__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalBiLang.g:2217:1: rule__QualitativeFiltering__Group__1__Impl : ( 'quali axis->' ) ;
    public final void rule__QualitativeFiltering__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2221:1: ( ( 'quali axis->' ) )
            // InternalBiLang.g:2222:1: ( 'quali axis->' )
            {
            // InternalBiLang.g:2222:1: ( 'quali axis->' )
            // InternalBiLang.g:2223:2: 'quali axis->'
            {
             before(grammarAccess.getQualitativeFilteringAccess().getQualiAxisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQualitativeFilteringAccess().getQualiAxisKeyword_1()); 

            }


            }

        }
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
    // InternalBiLang.g:2232:1: rule__QualitativeFiltering__Group__2 : rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 ;
    public final void rule__QualitativeFiltering__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2236:1: ( rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3 )
            // InternalBiLang.g:2237:2: rule__QualitativeFiltering__Group__2__Impl rule__QualitativeFiltering__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalBiLang.g:2244:1: rule__QualitativeFiltering__Group__2__Impl : ( ( rule__QualitativeFiltering__AxisAssignment_2 ) ) ;
    public final void rule__QualitativeFiltering__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2248:1: ( ( ( rule__QualitativeFiltering__AxisAssignment_2 ) ) )
            // InternalBiLang.g:2249:1: ( ( rule__QualitativeFiltering__AxisAssignment_2 ) )
            {
            // InternalBiLang.g:2249:1: ( ( rule__QualitativeFiltering__AxisAssignment_2 ) )
            // InternalBiLang.g:2250:2: ( rule__QualitativeFiltering__AxisAssignment_2 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_2()); 
            // InternalBiLang.g:2251:2: ( rule__QualitativeFiltering__AxisAssignment_2 )
            // InternalBiLang.g:2251:3: rule__QualitativeFiltering__AxisAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__AxisAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_2()); 

            }


            }

        }
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
    // InternalBiLang.g:2259:1: rule__QualitativeFiltering__Group__3 : rule__QualitativeFiltering__Group__3__Impl rule__QualitativeFiltering__Group__4 ;
    public final void rule__QualitativeFiltering__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2263:1: ( rule__QualitativeFiltering__Group__3__Impl rule__QualitativeFiltering__Group__4 )
            // InternalBiLang.g:2264:2: rule__QualitativeFiltering__Group__3__Impl rule__QualitativeFiltering__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__QualitativeFiltering__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__Group__4();

            state._fsp--;


            }

        }
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
    // InternalBiLang.g:2271:1: rule__QualitativeFiltering__Group__3__Impl : ( 'label' ) ;
    public final void rule__QualitativeFiltering__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2275:1: ( ( 'label' ) )
            // InternalBiLang.g:2276:1: ( 'label' )
            {
            // InternalBiLang.g:2276:1: ( 'label' )
            // InternalBiLang.g:2277:2: 'label'
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQualitativeFilteringAccess().getLabelKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__QualitativeFiltering__Group__4"
    // InternalBiLang.g:2286:1: rule__QualitativeFiltering__Group__4 : rule__QualitativeFiltering__Group__4__Impl ;
    public final void rule__QualitativeFiltering__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2290:1: ( rule__QualitativeFiltering__Group__4__Impl )
            // InternalBiLang.g:2291:2: rule__QualitativeFiltering__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitativeFiltering__Group__4"


    // $ANTLR start "rule__QualitativeFiltering__Group__4__Impl"
    // InternalBiLang.g:2297:1: rule__QualitativeFiltering__Group__4__Impl : ( ( rule__QualitativeFiltering__LabelsAssignment_4 ) ) ;
    public final void rule__QualitativeFiltering__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2301:1: ( ( ( rule__QualitativeFiltering__LabelsAssignment_4 ) ) )
            // InternalBiLang.g:2302:1: ( ( rule__QualitativeFiltering__LabelsAssignment_4 ) )
            {
            // InternalBiLang.g:2302:1: ( ( rule__QualitativeFiltering__LabelsAssignment_4 ) )
            // InternalBiLang.g:2303:2: ( rule__QualitativeFiltering__LabelsAssignment_4 )
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_4()); 
            // InternalBiLang.g:2304:2: ( rule__QualitativeFiltering__LabelsAssignment_4 )
            // InternalBiLang.g:2304:3: rule__QualitativeFiltering__LabelsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__QualitativeFiltering__LabelsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitativeFiltering__Group__4__Impl"


    // $ANTLR start "rule__MathOperation__Group__0"
    // InternalBiLang.g:2313:1: rule__MathOperation__Group__0 : rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 ;
    public final void rule__MathOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2317:1: ( rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1 )
            // InternalBiLang.g:2318:2: rule__MathOperation__Group__0__Impl rule__MathOperation__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalBiLang.g:2325:1: rule__MathOperation__Group__0__Impl : ( 'l' ) ;
    public final void rule__MathOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2329:1: ( ( 'l' ) )
            // InternalBiLang.g:2330:1: ( 'l' )
            {
            // InternalBiLang.g:2330:1: ( 'l' )
            // InternalBiLang.g:2331:2: 'l'
            {
             before(grammarAccess.getMathOperationAccess().getLKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMathOperationAccess().getLKeyword_0()); 

            }


            }

        }
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
    // InternalBiLang.g:2340:1: rule__MathOperation__Group__1 : rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 ;
    public final void rule__MathOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2344:1: ( rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2 )
            // InternalBiLang.g:2345:2: rule__MathOperation__Group__1__Impl rule__MathOperation__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalBiLang.g:2352:1: rule__MathOperation__Group__1__Impl : ( ( rule__MathOperation__LsideAssignment_1 ) ) ;
    public final void rule__MathOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2356:1: ( ( ( rule__MathOperation__LsideAssignment_1 ) ) )
            // InternalBiLang.g:2357:1: ( ( rule__MathOperation__LsideAssignment_1 ) )
            {
            // InternalBiLang.g:2357:1: ( ( rule__MathOperation__LsideAssignment_1 ) )
            // InternalBiLang.g:2358:2: ( rule__MathOperation__LsideAssignment_1 )
            {
             before(grammarAccess.getMathOperationAccess().getLsideAssignment_1()); 
            // InternalBiLang.g:2359:2: ( rule__MathOperation__LsideAssignment_1 )
            // InternalBiLang.g:2359:3: rule__MathOperation__LsideAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__LsideAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getLsideAssignment_1()); 

            }


            }

        }
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
    // InternalBiLang.g:2367:1: rule__MathOperation__Group__2 : rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 ;
    public final void rule__MathOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2371:1: ( rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3 )
            // InternalBiLang.g:2372:2: rule__MathOperation__Group__2__Impl rule__MathOperation__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalBiLang.g:2379:1: rule__MathOperation__Group__2__Impl : ( ( rule__MathOperation__OperatorAssignment_2 ) ) ;
    public final void rule__MathOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2383:1: ( ( ( rule__MathOperation__OperatorAssignment_2 ) ) )
            // InternalBiLang.g:2384:1: ( ( rule__MathOperation__OperatorAssignment_2 ) )
            {
            // InternalBiLang.g:2384:1: ( ( rule__MathOperation__OperatorAssignment_2 ) )
            // InternalBiLang.g:2385:2: ( rule__MathOperation__OperatorAssignment_2 )
            {
             before(grammarAccess.getMathOperationAccess().getOperatorAssignment_2()); 
            // InternalBiLang.g:2386:2: ( rule__MathOperation__OperatorAssignment_2 )
            // InternalBiLang.g:2386:3: rule__MathOperation__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getOperatorAssignment_2()); 

            }


            }

        }
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
    // InternalBiLang.g:2394:1: rule__MathOperation__Group__3 : rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 ;
    public final void rule__MathOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2398:1: ( rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4 )
            // InternalBiLang.g:2399:2: rule__MathOperation__Group__3__Impl rule__MathOperation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalBiLang.g:2406:1: rule__MathOperation__Group__3__Impl : ( 'r' ) ;
    public final void rule__MathOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2410:1: ( ( 'r' ) )
            // InternalBiLang.g:2411:1: ( 'r' )
            {
            // InternalBiLang.g:2411:1: ( 'r' )
            // InternalBiLang.g:2412:2: 'r'
            {
             before(grammarAccess.getMathOperationAccess().getRKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMathOperationAccess().getRKeyword_3()); 

            }


            }

        }
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
    // InternalBiLang.g:2421:1: rule__MathOperation__Group__4 : rule__MathOperation__Group__4__Impl ;
    public final void rule__MathOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2425:1: ( rule__MathOperation__Group__4__Impl )
            // InternalBiLang.g:2426:2: rule__MathOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalBiLang.g:2432:1: rule__MathOperation__Group__4__Impl : ( ( rule__MathOperation__RsideAssignment_4 ) ) ;
    public final void rule__MathOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2436:1: ( ( ( rule__MathOperation__RsideAssignment_4 ) ) )
            // InternalBiLang.g:2437:1: ( ( rule__MathOperation__RsideAssignment_4 ) )
            {
            // InternalBiLang.g:2437:1: ( ( rule__MathOperation__RsideAssignment_4 ) )
            // InternalBiLang.g:2438:2: ( rule__MathOperation__RsideAssignment_4 )
            {
             before(grammarAccess.getMathOperationAccess().getRsideAssignment_4()); 
            // InternalBiLang.g:2439:2: ( rule__MathOperation__RsideAssignment_4 )
            // InternalBiLang.g:2439:3: rule__MathOperation__RsideAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MathOperation__RsideAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMathOperationAccess().getRsideAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ColReference__Group__0"
    // InternalBiLang.g:2448:1: rule__ColReference__Group__0 : rule__ColReference__Group__0__Impl rule__ColReference__Group__1 ;
    public final void rule__ColReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2452:1: ( rule__ColReference__Group__0__Impl rule__ColReference__Group__1 )
            // InternalBiLang.g:2453:2: rule__ColReference__Group__0__Impl rule__ColReference__Group__1
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
    // InternalBiLang.g:2460:1: rule__ColReference__Group__0__Impl : ( () ) ;
    public final void rule__ColReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2464:1: ( ( () ) )
            // InternalBiLang.g:2465:1: ( () )
            {
            // InternalBiLang.g:2465:1: ( () )
            // InternalBiLang.g:2466:2: ()
            {
             before(grammarAccess.getColReferenceAccess().getColReferenceAction_0()); 
            // InternalBiLang.g:2467:2: ()
            // InternalBiLang.g:2467:3: 
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
    // InternalBiLang.g:2475:1: rule__ColReference__Group__1 : rule__ColReference__Group__1__Impl ;
    public final void rule__ColReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2479:1: ( rule__ColReference__Group__1__Impl )
            // InternalBiLang.g:2480:2: rule__ColReference__Group__1__Impl
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
    // InternalBiLang.g:2486:1: rule__ColReference__Group__1__Impl : ( ( rule__ColReference__TargetAssignment_1 ) ) ;
    public final void rule__ColReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2490:1: ( ( ( rule__ColReference__TargetAssignment_1 ) ) )
            // InternalBiLang.g:2491:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            {
            // InternalBiLang.g:2491:1: ( ( rule__ColReference__TargetAssignment_1 ) )
            // InternalBiLang.g:2492:2: ( rule__ColReference__TargetAssignment_1 )
            {
             before(grammarAccess.getColReferenceAccess().getTargetAssignment_1()); 
            // InternalBiLang.g:2493:2: ( rule__ColReference__TargetAssignment_1 )
            // InternalBiLang.g:2493:3: rule__ColReference__TargetAssignment_1
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
    // InternalBiLang.g:2502:1: rule__StatisticalOperation__Group__0 : rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 ;
    public final void rule__StatisticalOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2506:1: ( rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1 )
            // InternalBiLang.g:2507:2: rule__StatisticalOperation__Group__0__Impl rule__StatisticalOperation__Group__1
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
    // InternalBiLang.g:2514:1: rule__StatisticalOperation__Group__0__Impl : ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) ;
    public final void rule__StatisticalOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2518:1: ( ( ( rule__StatisticalOperation__OperatorAssignment_0 ) ) )
            // InternalBiLang.g:2519:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            {
            // InternalBiLang.g:2519:1: ( ( rule__StatisticalOperation__OperatorAssignment_0 ) )
            // InternalBiLang.g:2520:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getOperatorAssignment_0()); 
            // InternalBiLang.g:2521:2: ( rule__StatisticalOperation__OperatorAssignment_0 )
            // InternalBiLang.g:2521:3: rule__StatisticalOperation__OperatorAssignment_0
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
    // InternalBiLang.g:2529:1: rule__StatisticalOperation__Group__1 : rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 ;
    public final void rule__StatisticalOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2533:1: ( rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2 )
            // InternalBiLang.g:2534:2: rule__StatisticalOperation__Group__1__Impl rule__StatisticalOperation__Group__2
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
    // InternalBiLang.g:2541:1: rule__StatisticalOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__StatisticalOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2545:1: ( ( '(' ) )
            // InternalBiLang.g:2546:1: ( '(' )
            {
            // InternalBiLang.g:2546:1: ( '(' )
            // InternalBiLang.g:2547:2: '('
            {
             before(grammarAccess.getStatisticalOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalBiLang.g:2556:1: rule__StatisticalOperation__Group__2 : rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 ;
    public final void rule__StatisticalOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2560:1: ( rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3 )
            // InternalBiLang.g:2561:2: rule__StatisticalOperation__Group__2__Impl rule__StatisticalOperation__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalBiLang.g:2568:1: rule__StatisticalOperation__Group__2__Impl : ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) ;
    public final void rule__StatisticalOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2572:1: ( ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) ) )
            // InternalBiLang.g:2573:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            {
            // InternalBiLang.g:2573:1: ( ( rule__StatisticalOperation__ColreferenceAssignment_2 ) )
            // InternalBiLang.g:2574:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            {
             before(grammarAccess.getStatisticalOperationAccess().getColreferenceAssignment_2()); 
            // InternalBiLang.g:2575:2: ( rule__StatisticalOperation__ColreferenceAssignment_2 )
            // InternalBiLang.g:2575:3: rule__StatisticalOperation__ColreferenceAssignment_2
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
    // InternalBiLang.g:2583:1: rule__StatisticalOperation__Group__3 : rule__StatisticalOperation__Group__3__Impl ;
    public final void rule__StatisticalOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2587:1: ( rule__StatisticalOperation__Group__3__Impl )
            // InternalBiLang.g:2588:2: rule__StatisticalOperation__Group__3__Impl
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
    // InternalBiLang.g:2594:1: rule__StatisticalOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__StatisticalOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2598:1: ( ( ')' ) )
            // InternalBiLang.g:2599:1: ( ')' )
            {
            // InternalBiLang.g:2599:1: ( ')' )
            // InternalBiLang.g:2600:2: ')'
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
    // InternalBiLang.g:2610:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2614:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalBiLang.g:2615:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:2622:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2626:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:2627:1: ( ( '-' )? )
            {
            // InternalBiLang.g:2627:1: ( ( '-' )? )
            // InternalBiLang.g:2628:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalBiLang.g:2629:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBiLang.g:2629:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalBiLang.g:2637:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2641:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalBiLang.g:2642:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalBiLang.g:2649:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2653:1: ( ( ( RULE_INT )? ) )
            // InternalBiLang.g:2654:1: ( ( RULE_INT )? )
            {
            // InternalBiLang.g:2654:1: ( ( RULE_INT )? )
            // InternalBiLang.g:2655:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalBiLang.g:2656:2: ( RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBiLang.g:2656:3: RULE_INT
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
    // InternalBiLang.g:2664:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2668:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalBiLang.g:2669:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalBiLang.g:2676:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2680:1: ( ( '.' ) )
            // InternalBiLang.g:2681:1: ( '.' )
            {
            // InternalBiLang.g:2681:1: ( '.' )
            // InternalBiLang.g:2682:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBiLang.g:2691:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2695:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalBiLang.g:2696:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:2703:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2707:1: ( ( RULE_INT ) )
            // InternalBiLang.g:2708:1: ( RULE_INT )
            {
            // InternalBiLang.g:2708:1: ( RULE_INT )
            // InternalBiLang.g:2709:2: RULE_INT
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
    // InternalBiLang.g:2718:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2722:1: ( rule__EFloat__Group__4__Impl )
            // InternalBiLang.g:2723:2: rule__EFloat__Group__4__Impl
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
    // InternalBiLang.g:2729:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2733:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalBiLang.g:2734:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalBiLang.g:2734:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalBiLang.g:2735:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalBiLang.g:2736:2: ( rule__EFloat__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=11 && LA20_0<=12)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBiLang.g:2736:3: rule__EFloat__Group_4__0
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
    // InternalBiLang.g:2745:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2749:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalBiLang.g:2750:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:2757:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2761:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalBiLang.g:2762:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalBiLang.g:2762:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalBiLang.g:2763:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalBiLang.g:2764:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalBiLang.g:2764:3: rule__EFloat__Alternatives_4_0
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
    // InternalBiLang.g:2772:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2776:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalBiLang.g:2777:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalBiLang.g:2784:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2788:1: ( ( ( '-' )? ) )
            // InternalBiLang.g:2789:1: ( ( '-' )? )
            {
            // InternalBiLang.g:2789:1: ( ( '-' )? )
            // InternalBiLang.g:2790:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalBiLang.g:2791:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:2791:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalBiLang.g:2799:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2803:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalBiLang.g:2804:2: rule__EFloat__Group_4__2__Impl
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
    // InternalBiLang.g:2810:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2814:1: ( ( RULE_INT ) )
            // InternalBiLang.g:2815:1: ( RULE_INT )
            {
            // InternalBiLang.g:2815:1: ( RULE_INT )
            // InternalBiLang.g:2816:2: RULE_INT
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
    // InternalBiLang.g:2826:1: rule__BarPlot__Group__0 : rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 ;
    public final void rule__BarPlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2830:1: ( rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1 )
            // InternalBiLang.g:2831:2: rule__BarPlot__Group__0__Impl rule__BarPlot__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalBiLang.g:2838:1: rule__BarPlot__Group__0__Impl : ( () ) ;
    public final void rule__BarPlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2842:1: ( ( () ) )
            // InternalBiLang.g:2843:1: ( () )
            {
            // InternalBiLang.g:2843:1: ( () )
            // InternalBiLang.g:2844:2: ()
            {
             before(grammarAccess.getBarPlotAccess().getBarPlotAction_0()); 
            // InternalBiLang.g:2845:2: ()
            // InternalBiLang.g:2845:3: 
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
    // InternalBiLang.g:2853:1: rule__BarPlot__Group__1 : rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 ;
    public final void rule__BarPlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2857:1: ( rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2 )
            // InternalBiLang.g:2858:2: rule__BarPlot__Group__1__Impl rule__BarPlot__Group__2
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
    // InternalBiLang.g:2865:1: rule__BarPlot__Group__1__Impl : ( 'bar' ) ;
    public final void rule__BarPlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2869:1: ( ( 'bar' ) )
            // InternalBiLang.g:2870:1: ( 'bar' )
            {
            // InternalBiLang.g:2870:1: ( 'bar' )
            // InternalBiLang.g:2871:2: 'bar'
            {
             before(grammarAccess.getBarPlotAccess().getBarKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBiLang.g:2880:1: rule__BarPlot__Group__2 : rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 ;
    public final void rule__BarPlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2884:1: ( rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3 )
            // InternalBiLang.g:2885:2: rule__BarPlot__Group__2__Impl rule__BarPlot__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:2892:1: rule__BarPlot__Group__2__Impl : ( ( rule__BarPlot__NameAssignment_2 ) ) ;
    public final void rule__BarPlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2896:1: ( ( ( rule__BarPlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:2897:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:2897:1: ( ( rule__BarPlot__NameAssignment_2 ) )
            // InternalBiLang.g:2898:2: ( rule__BarPlot__NameAssignment_2 )
            {
             before(grammarAccess.getBarPlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:2899:2: ( rule__BarPlot__NameAssignment_2 )
            // InternalBiLang.g:2899:3: rule__BarPlot__NameAssignment_2
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
    // InternalBiLang.g:2907:1: rule__BarPlot__Group__3 : rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 ;
    public final void rule__BarPlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2911:1: ( rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4 )
            // InternalBiLang.g:2912:2: rule__BarPlot__Group__3__Impl rule__BarPlot__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:2919:1: rule__BarPlot__Group__3__Impl : ( '->' ) ;
    public final void rule__BarPlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2923:1: ( ( '->' ) )
            // InternalBiLang.g:2924:1: ( '->' )
            {
            // InternalBiLang.g:2924:1: ( '->' )
            // InternalBiLang.g:2925:2: '->'
            {
             before(grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:2934:1: rule__BarPlot__Group__4 : rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 ;
    public final void rule__BarPlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2938:1: ( rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5 )
            // InternalBiLang.g:2939:2: rule__BarPlot__Group__4__Impl rule__BarPlot__Group__5
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
    // InternalBiLang.g:2946:1: rule__BarPlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__BarPlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2950:1: ( ( 'xAx' ) )
            // InternalBiLang.g:2951:1: ( 'xAx' )
            {
            // InternalBiLang.g:2951:1: ( 'xAx' )
            // InternalBiLang.g:2952:2: 'xAx'
            {
             before(grammarAccess.getBarPlotAccess().getXAxKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:2961:1: rule__BarPlot__Group__5 : rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 ;
    public final void rule__BarPlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2965:1: ( rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6 )
            // InternalBiLang.g:2966:2: rule__BarPlot__Group__5__Impl rule__BarPlot__Group__6
            {
            pushFollow(FOLLOW_40);
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
    // InternalBiLang.g:2973:1: rule__BarPlot__Group__5__Impl : ( ( rule__BarPlot__XAxisAssignment_5 ) ) ;
    public final void rule__BarPlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2977:1: ( ( ( rule__BarPlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:2978:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:2978:1: ( ( rule__BarPlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:2979:2: ( rule__BarPlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getBarPlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:2980:2: ( rule__BarPlot__XAxisAssignment_5 )
            // InternalBiLang.g:2980:3: rule__BarPlot__XAxisAssignment_5
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
    // InternalBiLang.g:2988:1: rule__BarPlot__Group__6 : rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 ;
    public final void rule__BarPlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:2992:1: ( rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7 )
            // InternalBiLang.g:2993:2: rule__BarPlot__Group__6__Impl rule__BarPlot__Group__7
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
    // InternalBiLang.g:3000:1: rule__BarPlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__BarPlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3004:1: ( ( 'yA' ) )
            // InternalBiLang.g:3005:1: ( 'yA' )
            {
            // InternalBiLang.g:3005:1: ( 'yA' )
            // InternalBiLang.g:3006:2: 'yA'
            {
             before(grammarAccess.getBarPlotAccess().getYAKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:3015:1: rule__BarPlot__Group__7 : rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 ;
    public final void rule__BarPlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3019:1: ( rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8 )
            // InternalBiLang.g:3020:2: rule__BarPlot__Group__7__Impl rule__BarPlot__Group__8
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:3027:1: rule__BarPlot__Group__7__Impl : ( ( rule__BarPlot__YAxisAssignment_7 ) ) ;
    public final void rule__BarPlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3031:1: ( ( ( rule__BarPlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3032:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3032:1: ( ( rule__BarPlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3033:2: ( rule__BarPlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getBarPlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3034:2: ( rule__BarPlot__YAxisAssignment_7 )
            // InternalBiLang.g:3034:3: rule__BarPlot__YAxisAssignment_7
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
    // InternalBiLang.g:3042:1: rule__BarPlot__Group__8 : rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 ;
    public final void rule__BarPlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3046:1: ( rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9 )
            // InternalBiLang.g:3047:2: rule__BarPlot__Group__8__Impl rule__BarPlot__Group__9
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:3054:1: rule__BarPlot__Group__8__Impl : ( ( rule__BarPlot__Group_8__0 )? ) ;
    public final void rule__BarPlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3058:1: ( ( ( rule__BarPlot__Group_8__0 )? ) )
            // InternalBiLang.g:3059:1: ( ( rule__BarPlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3059:1: ( ( rule__BarPlot__Group_8__0 )? )
            // InternalBiLang.g:3060:2: ( rule__BarPlot__Group_8__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_8()); 
            // InternalBiLang.g:3061:2: ( rule__BarPlot__Group_8__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBiLang.g:3061:3: rule__BarPlot__Group_8__0
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
    // InternalBiLang.g:3069:1: rule__BarPlot__Group__9 : rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 ;
    public final void rule__BarPlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3073:1: ( rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10 )
            // InternalBiLang.g:3074:2: rule__BarPlot__Group__9__Impl rule__BarPlot__Group__10
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:3081:1: rule__BarPlot__Group__9__Impl : ( ( rule__BarPlot__Group_9__0 )? ) ;
    public final void rule__BarPlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3085:1: ( ( ( rule__BarPlot__Group_9__0 )? ) )
            // InternalBiLang.g:3086:1: ( ( rule__BarPlot__Group_9__0 )? )
            {
            // InternalBiLang.g:3086:1: ( ( rule__BarPlot__Group_9__0 )? )
            // InternalBiLang.g:3087:2: ( rule__BarPlot__Group_9__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_9()); 
            // InternalBiLang.g:3088:2: ( rule__BarPlot__Group_9__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==51) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBiLang.g:3088:3: rule__BarPlot__Group_9__0
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
    // InternalBiLang.g:3096:1: rule__BarPlot__Group__10 : rule__BarPlot__Group__10__Impl ;
    public final void rule__BarPlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3100:1: ( rule__BarPlot__Group__10__Impl )
            // InternalBiLang.g:3101:2: rule__BarPlot__Group__10__Impl
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
    // InternalBiLang.g:3107:1: rule__BarPlot__Group__10__Impl : ( ( rule__BarPlot__Group_10__0 )? ) ;
    public final void rule__BarPlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3111:1: ( ( ( rule__BarPlot__Group_10__0 )? ) )
            // InternalBiLang.g:3112:1: ( ( rule__BarPlot__Group_10__0 )? )
            {
            // InternalBiLang.g:3112:1: ( ( rule__BarPlot__Group_10__0 )? )
            // InternalBiLang.g:3113:2: ( rule__BarPlot__Group_10__0 )?
            {
             before(grammarAccess.getBarPlotAccess().getGroup_10()); 
            // InternalBiLang.g:3114:2: ( rule__BarPlot__Group_10__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBiLang.g:3114:3: rule__BarPlot__Group_10__0
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
    // InternalBiLang.g:3123:1: rule__BarPlot__Group_8__0 : rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 ;
    public final void rule__BarPlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3127:1: ( rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1 )
            // InternalBiLang.g:3128:2: rule__BarPlot__Group_8__0__Impl rule__BarPlot__Group_8__1
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
    // InternalBiLang.g:3135:1: rule__BarPlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__BarPlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3139:1: ( ( 'loc' ) )
            // InternalBiLang.g:3140:1: ( 'loc' )
            {
            // InternalBiLang.g:3140:1: ( 'loc' )
            // InternalBiLang.g:3141:2: 'loc'
            {
             before(grammarAccess.getBarPlotAccess().getLocKeyword_8_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:3150:1: rule__BarPlot__Group_8__1 : rule__BarPlot__Group_8__1__Impl ;
    public final void rule__BarPlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3154:1: ( rule__BarPlot__Group_8__1__Impl )
            // InternalBiLang.g:3155:2: rule__BarPlot__Group_8__1__Impl
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
    // InternalBiLang.g:3161:1: rule__BarPlot__Group_8__1__Impl : ( ( rule__BarPlot__LocationAssignment_8_1 ) ) ;
    public final void rule__BarPlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3165:1: ( ( ( rule__BarPlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:3166:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:3166:1: ( ( rule__BarPlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:3167:2: ( rule__BarPlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getBarPlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:3168:2: ( rule__BarPlot__LocationAssignment_8_1 )
            // InternalBiLang.g:3168:3: rule__BarPlot__LocationAssignment_8_1
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
    // InternalBiLang.g:3177:1: rule__BarPlot__Group_9__0 : rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 ;
    public final void rule__BarPlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3181:1: ( rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1 )
            // InternalBiLang.g:3182:2: rule__BarPlot__Group_9__0__Impl rule__BarPlot__Group_9__1
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
    // InternalBiLang.g:3189:1: rule__BarPlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__BarPlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3193:1: ( ( 'colors' ) )
            // InternalBiLang.g:3194:1: ( 'colors' )
            {
            // InternalBiLang.g:3194:1: ( 'colors' )
            // InternalBiLang.g:3195:2: 'colors'
            {
             before(grammarAccess.getBarPlotAccess().getColorsKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:3204:1: rule__BarPlot__Group_9__1 : rule__BarPlot__Group_9__1__Impl ;
    public final void rule__BarPlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3208:1: ( rule__BarPlot__Group_9__1__Impl )
            // InternalBiLang.g:3209:2: rule__BarPlot__Group_9__1__Impl
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
    // InternalBiLang.g:3215:1: rule__BarPlot__Group_9__1__Impl : ( ( rule__BarPlot__ColorAssignment_9_1 ) ) ;
    public final void rule__BarPlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3219:1: ( ( ( rule__BarPlot__ColorAssignment_9_1 ) ) )
            // InternalBiLang.g:3220:1: ( ( rule__BarPlot__ColorAssignment_9_1 ) )
            {
            // InternalBiLang.g:3220:1: ( ( rule__BarPlot__ColorAssignment_9_1 ) )
            // InternalBiLang.g:3221:2: ( rule__BarPlot__ColorAssignment_9_1 )
            {
             before(grammarAccess.getBarPlotAccess().getColorAssignment_9_1()); 
            // InternalBiLang.g:3222:2: ( rule__BarPlot__ColorAssignment_9_1 )
            // InternalBiLang.g:3222:3: rule__BarPlot__ColorAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__BarPlot__ColorAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBarPlotAccess().getColorAssignment_9_1()); 

            }


            }

        }
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
    // InternalBiLang.g:3231:1: rule__BarPlot__Group_10__0 : rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 ;
    public final void rule__BarPlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3235:1: ( rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1 )
            // InternalBiLang.g:3236:2: rule__BarPlot__Group_10__0__Impl rule__BarPlot__Group_10__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:3243:1: rule__BarPlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__BarPlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3247:1: ( ( 'thickness' ) )
            // InternalBiLang.g:3248:1: ( 'thickness' )
            {
            // InternalBiLang.g:3248:1: ( 'thickness' )
            // InternalBiLang.g:3249:2: 'thickness'
            {
             before(grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBiLang.g:3258:1: rule__BarPlot__Group_10__1 : rule__BarPlot__Group_10__1__Impl ;
    public final void rule__BarPlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3262:1: ( rule__BarPlot__Group_10__1__Impl )
            // InternalBiLang.g:3263:2: rule__BarPlot__Group_10__1__Impl
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
    // InternalBiLang.g:3269:1: rule__BarPlot__Group_10__1__Impl : ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__BarPlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3273:1: ( ( ( rule__BarPlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:3274:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:3274:1: ( ( rule__BarPlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:3275:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:3276:2: ( rule__BarPlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:3276:3: rule__BarPlot__ThicknessAssignment_10_1
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
    // InternalBiLang.g:3285:1: rule__LinePlot__Group__0 : rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 ;
    public final void rule__LinePlot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3289:1: ( rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1 )
            // InternalBiLang.g:3290:2: rule__LinePlot__Group__0__Impl rule__LinePlot__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalBiLang.g:3297:1: rule__LinePlot__Group__0__Impl : ( () ) ;
    public final void rule__LinePlot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3301:1: ( ( () ) )
            // InternalBiLang.g:3302:1: ( () )
            {
            // InternalBiLang.g:3302:1: ( () )
            // InternalBiLang.g:3303:2: ()
            {
             before(grammarAccess.getLinePlotAccess().getLinePlotAction_0()); 
            // InternalBiLang.g:3304:2: ()
            // InternalBiLang.g:3304:3: 
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
    // InternalBiLang.g:3312:1: rule__LinePlot__Group__1 : rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 ;
    public final void rule__LinePlot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3316:1: ( rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2 )
            // InternalBiLang.g:3317:2: rule__LinePlot__Group__1__Impl rule__LinePlot__Group__2
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
    // InternalBiLang.g:3324:1: rule__LinePlot__Group__1__Impl : ( 'line' ) ;
    public final void rule__LinePlot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3328:1: ( ( 'line' ) )
            // InternalBiLang.g:3329:1: ( 'line' )
            {
            // InternalBiLang.g:3329:1: ( 'line' )
            // InternalBiLang.g:3330:2: 'line'
            {
             before(grammarAccess.getLinePlotAccess().getLineKeyword_1()); 
            match(input,53,FOLLOW_2); 
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
    // InternalBiLang.g:3339:1: rule__LinePlot__Group__2 : rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 ;
    public final void rule__LinePlot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3343:1: ( rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3 )
            // InternalBiLang.g:3344:2: rule__LinePlot__Group__2__Impl rule__LinePlot__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalBiLang.g:3351:1: rule__LinePlot__Group__2__Impl : ( ( rule__LinePlot__NameAssignment_2 ) ) ;
    public final void rule__LinePlot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3355:1: ( ( ( rule__LinePlot__NameAssignment_2 ) ) )
            // InternalBiLang.g:3356:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            {
            // InternalBiLang.g:3356:1: ( ( rule__LinePlot__NameAssignment_2 ) )
            // InternalBiLang.g:3357:2: ( rule__LinePlot__NameAssignment_2 )
            {
             before(grammarAccess.getLinePlotAccess().getNameAssignment_2()); 
            // InternalBiLang.g:3358:2: ( rule__LinePlot__NameAssignment_2 )
            // InternalBiLang.g:3358:3: rule__LinePlot__NameAssignment_2
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
    // InternalBiLang.g:3366:1: rule__LinePlot__Group__3 : rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 ;
    public final void rule__LinePlot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3370:1: ( rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4 )
            // InternalBiLang.g:3371:2: rule__LinePlot__Group__3__Impl rule__LinePlot__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalBiLang.g:3378:1: rule__LinePlot__Group__3__Impl : ( '->' ) ;
    public final void rule__LinePlot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3382:1: ( ( '->' ) )
            // InternalBiLang.g:3383:1: ( '->' )
            {
            // InternalBiLang.g:3383:1: ( '->' )
            // InternalBiLang.g:3384:2: '->'
            {
             before(grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBiLang.g:3393:1: rule__LinePlot__Group__4 : rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 ;
    public final void rule__LinePlot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3397:1: ( rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5 )
            // InternalBiLang.g:3398:2: rule__LinePlot__Group__4__Impl rule__LinePlot__Group__5
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
    // InternalBiLang.g:3405:1: rule__LinePlot__Group__4__Impl : ( 'xAx' ) ;
    public final void rule__LinePlot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3409:1: ( ( 'xAx' ) )
            // InternalBiLang.g:3410:1: ( 'xAx' )
            {
            // InternalBiLang.g:3410:1: ( 'xAx' )
            // InternalBiLang.g:3411:2: 'xAx'
            {
             before(grammarAccess.getLinePlotAccess().getXAxKeyword_4()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBiLang.g:3420:1: rule__LinePlot__Group__5 : rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 ;
    public final void rule__LinePlot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3424:1: ( rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6 )
            // InternalBiLang.g:3425:2: rule__LinePlot__Group__5__Impl rule__LinePlot__Group__6
            {
            pushFollow(FOLLOW_40);
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
    // InternalBiLang.g:3432:1: rule__LinePlot__Group__5__Impl : ( ( rule__LinePlot__XAxisAssignment_5 ) ) ;
    public final void rule__LinePlot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3436:1: ( ( ( rule__LinePlot__XAxisAssignment_5 ) ) )
            // InternalBiLang.g:3437:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            {
            // InternalBiLang.g:3437:1: ( ( rule__LinePlot__XAxisAssignment_5 ) )
            // InternalBiLang.g:3438:2: ( rule__LinePlot__XAxisAssignment_5 )
            {
             before(grammarAccess.getLinePlotAccess().getXAxisAssignment_5()); 
            // InternalBiLang.g:3439:2: ( rule__LinePlot__XAxisAssignment_5 )
            // InternalBiLang.g:3439:3: rule__LinePlot__XAxisAssignment_5
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
    // InternalBiLang.g:3447:1: rule__LinePlot__Group__6 : rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 ;
    public final void rule__LinePlot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3451:1: ( rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7 )
            // InternalBiLang.g:3452:2: rule__LinePlot__Group__6__Impl rule__LinePlot__Group__7
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
    // InternalBiLang.g:3459:1: rule__LinePlot__Group__6__Impl : ( 'yA' ) ;
    public final void rule__LinePlot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3463:1: ( ( 'yA' ) )
            // InternalBiLang.g:3464:1: ( 'yA' )
            {
            // InternalBiLang.g:3464:1: ( 'yA' )
            // InternalBiLang.g:3465:2: 'yA'
            {
             before(grammarAccess.getLinePlotAccess().getYAKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBiLang.g:3474:1: rule__LinePlot__Group__7 : rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 ;
    public final void rule__LinePlot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3478:1: ( rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8 )
            // InternalBiLang.g:3479:2: rule__LinePlot__Group__7__Impl rule__LinePlot__Group__8
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:3486:1: rule__LinePlot__Group__7__Impl : ( ( rule__LinePlot__YAxisAssignment_7 ) ) ;
    public final void rule__LinePlot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3490:1: ( ( ( rule__LinePlot__YAxisAssignment_7 ) ) )
            // InternalBiLang.g:3491:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            {
            // InternalBiLang.g:3491:1: ( ( rule__LinePlot__YAxisAssignment_7 ) )
            // InternalBiLang.g:3492:2: ( rule__LinePlot__YAxisAssignment_7 )
            {
             before(grammarAccess.getLinePlotAccess().getYAxisAssignment_7()); 
            // InternalBiLang.g:3493:2: ( rule__LinePlot__YAxisAssignment_7 )
            // InternalBiLang.g:3493:3: rule__LinePlot__YAxisAssignment_7
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
    // InternalBiLang.g:3501:1: rule__LinePlot__Group__8 : rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 ;
    public final void rule__LinePlot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3505:1: ( rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9 )
            // InternalBiLang.g:3506:2: rule__LinePlot__Group__8__Impl rule__LinePlot__Group__9
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:3513:1: rule__LinePlot__Group__8__Impl : ( ( rule__LinePlot__Group_8__0 )? ) ;
    public final void rule__LinePlot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3517:1: ( ( ( rule__LinePlot__Group_8__0 )? ) )
            // InternalBiLang.g:3518:1: ( ( rule__LinePlot__Group_8__0 )? )
            {
            // InternalBiLang.g:3518:1: ( ( rule__LinePlot__Group_8__0 )? )
            // InternalBiLang.g:3519:2: ( rule__LinePlot__Group_8__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_8()); 
            // InternalBiLang.g:3520:2: ( rule__LinePlot__Group_8__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:3520:3: rule__LinePlot__Group_8__0
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
    // InternalBiLang.g:3528:1: rule__LinePlot__Group__9 : rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 ;
    public final void rule__LinePlot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3532:1: ( rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10 )
            // InternalBiLang.g:3533:2: rule__LinePlot__Group__9__Impl rule__LinePlot__Group__10
            {
            pushFollow(FOLLOW_41);
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
    // InternalBiLang.g:3540:1: rule__LinePlot__Group__9__Impl : ( ( rule__LinePlot__Group_9__0 )? ) ;
    public final void rule__LinePlot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3544:1: ( ( ( rule__LinePlot__Group_9__0 )? ) )
            // InternalBiLang.g:3545:1: ( ( rule__LinePlot__Group_9__0 )? )
            {
            // InternalBiLang.g:3545:1: ( ( rule__LinePlot__Group_9__0 )? )
            // InternalBiLang.g:3546:2: ( rule__LinePlot__Group_9__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_9()); 
            // InternalBiLang.g:3547:2: ( rule__LinePlot__Group_9__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:3547:3: rule__LinePlot__Group_9__0
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
    // InternalBiLang.g:3555:1: rule__LinePlot__Group__10 : rule__LinePlot__Group__10__Impl ;
    public final void rule__LinePlot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3559:1: ( rule__LinePlot__Group__10__Impl )
            // InternalBiLang.g:3560:2: rule__LinePlot__Group__10__Impl
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
    // InternalBiLang.g:3566:1: rule__LinePlot__Group__10__Impl : ( ( rule__LinePlot__Group_10__0 )? ) ;
    public final void rule__LinePlot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3570:1: ( ( ( rule__LinePlot__Group_10__0 )? ) )
            // InternalBiLang.g:3571:1: ( ( rule__LinePlot__Group_10__0 )? )
            {
            // InternalBiLang.g:3571:1: ( ( rule__LinePlot__Group_10__0 )? )
            // InternalBiLang.g:3572:2: ( rule__LinePlot__Group_10__0 )?
            {
             before(grammarAccess.getLinePlotAccess().getGroup_10()); 
            // InternalBiLang.g:3573:2: ( rule__LinePlot__Group_10__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:3573:3: rule__LinePlot__Group_10__0
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
    // InternalBiLang.g:3582:1: rule__LinePlot__Group_8__0 : rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 ;
    public final void rule__LinePlot__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3586:1: ( rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1 )
            // InternalBiLang.g:3587:2: rule__LinePlot__Group_8__0__Impl rule__LinePlot__Group_8__1
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
    // InternalBiLang.g:3594:1: rule__LinePlot__Group_8__0__Impl : ( 'loc' ) ;
    public final void rule__LinePlot__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3598:1: ( ( 'loc' ) )
            // InternalBiLang.g:3599:1: ( 'loc' )
            {
            // InternalBiLang.g:3599:1: ( 'loc' )
            // InternalBiLang.g:3600:2: 'loc'
            {
             before(grammarAccess.getLinePlotAccess().getLocKeyword_8_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalBiLang.g:3609:1: rule__LinePlot__Group_8__1 : rule__LinePlot__Group_8__1__Impl ;
    public final void rule__LinePlot__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3613:1: ( rule__LinePlot__Group_8__1__Impl )
            // InternalBiLang.g:3614:2: rule__LinePlot__Group_8__1__Impl
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
    // InternalBiLang.g:3620:1: rule__LinePlot__Group_8__1__Impl : ( ( rule__LinePlot__LocationAssignment_8_1 ) ) ;
    public final void rule__LinePlot__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3624:1: ( ( ( rule__LinePlot__LocationAssignment_8_1 ) ) )
            // InternalBiLang.g:3625:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            {
            // InternalBiLang.g:3625:1: ( ( rule__LinePlot__LocationAssignment_8_1 ) )
            // InternalBiLang.g:3626:2: ( rule__LinePlot__LocationAssignment_8_1 )
            {
             before(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1()); 
            // InternalBiLang.g:3627:2: ( rule__LinePlot__LocationAssignment_8_1 )
            // InternalBiLang.g:3627:3: rule__LinePlot__LocationAssignment_8_1
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
    // InternalBiLang.g:3636:1: rule__LinePlot__Group_9__0 : rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 ;
    public final void rule__LinePlot__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3640:1: ( rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1 )
            // InternalBiLang.g:3641:2: rule__LinePlot__Group_9__0__Impl rule__LinePlot__Group_9__1
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
    // InternalBiLang.g:3648:1: rule__LinePlot__Group_9__0__Impl : ( 'colors' ) ;
    public final void rule__LinePlot__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3652:1: ( ( 'colors' ) )
            // InternalBiLang.g:3653:1: ( 'colors' )
            {
            // InternalBiLang.g:3653:1: ( 'colors' )
            // InternalBiLang.g:3654:2: 'colors'
            {
             before(grammarAccess.getLinePlotAccess().getColorsKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalBiLang.g:3663:1: rule__LinePlot__Group_9__1 : rule__LinePlot__Group_9__1__Impl ;
    public final void rule__LinePlot__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3667:1: ( rule__LinePlot__Group_9__1__Impl )
            // InternalBiLang.g:3668:2: rule__LinePlot__Group_9__1__Impl
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
    // InternalBiLang.g:3674:1: rule__LinePlot__Group_9__1__Impl : ( ( rule__LinePlot__ColorAssignment_9_1 ) ) ;
    public final void rule__LinePlot__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3678:1: ( ( ( rule__LinePlot__ColorAssignment_9_1 ) ) )
            // InternalBiLang.g:3679:1: ( ( rule__LinePlot__ColorAssignment_9_1 ) )
            {
            // InternalBiLang.g:3679:1: ( ( rule__LinePlot__ColorAssignment_9_1 ) )
            // InternalBiLang.g:3680:2: ( rule__LinePlot__ColorAssignment_9_1 )
            {
             before(grammarAccess.getLinePlotAccess().getColorAssignment_9_1()); 
            // InternalBiLang.g:3681:2: ( rule__LinePlot__ColorAssignment_9_1 )
            // InternalBiLang.g:3681:3: rule__LinePlot__ColorAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__LinePlot__ColorAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getLinePlotAccess().getColorAssignment_9_1()); 

            }


            }

        }
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
    // InternalBiLang.g:3690:1: rule__LinePlot__Group_10__0 : rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 ;
    public final void rule__LinePlot__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3694:1: ( rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1 )
            // InternalBiLang.g:3695:2: rule__LinePlot__Group_10__0__Impl rule__LinePlot__Group_10__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalBiLang.g:3702:1: rule__LinePlot__Group_10__0__Impl : ( 'thickness' ) ;
    public final void rule__LinePlot__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3706:1: ( ( 'thickness' ) )
            // InternalBiLang.g:3707:1: ( 'thickness' )
            {
            // InternalBiLang.g:3707:1: ( 'thickness' )
            // InternalBiLang.g:3708:2: 'thickness'
            {
             before(grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalBiLang.g:3717:1: rule__LinePlot__Group_10__1 : rule__LinePlot__Group_10__1__Impl ;
    public final void rule__LinePlot__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3721:1: ( rule__LinePlot__Group_10__1__Impl )
            // InternalBiLang.g:3722:2: rule__LinePlot__Group_10__1__Impl
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
    // InternalBiLang.g:3728:1: rule__LinePlot__Group_10__1__Impl : ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) ;
    public final void rule__LinePlot__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3732:1: ( ( ( rule__LinePlot__ThicknessAssignment_10_1 ) ) )
            // InternalBiLang.g:3733:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            {
            // InternalBiLang.g:3733:1: ( ( rule__LinePlot__ThicknessAssignment_10_1 ) )
            // InternalBiLang.g:3734:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            {
             before(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1()); 
            // InternalBiLang.g:3735:2: ( rule__LinePlot__ThicknessAssignment_10_1 )
            // InternalBiLang.g:3735:3: rule__LinePlot__ThicknessAssignment_10_1
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


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalBiLang.g:3744:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3748:1: ( ( RULE_ID ) )
            // InternalBiLang.g:3749:2: ( RULE_ID )
            {
            // InternalBiLang.g:3749:2: ( RULE_ID )
            // InternalBiLang.g:3750:3: RULE_ID
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
    // InternalBiLang.g:3759:1: rule__Task__FileextractorAssignment_4 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3763:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:3764:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:3764:2: ( ruleFileExtractor )
            // InternalBiLang.g:3765:3: ruleFileExtractor
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
    // InternalBiLang.g:3774:1: rule__Task__DatafilteringAssignment_5 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3778:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:3779:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:3779:2: ( ruleDataFiltering )
            // InternalBiLang.g:3780:3: ruleDataFiltering
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
    // InternalBiLang.g:3789:1: rule__Task__FileextractorAssignment_6_0 : ( ruleFileExtractor ) ;
    public final void rule__Task__FileextractorAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3793:1: ( ( ruleFileExtractor ) )
            // InternalBiLang.g:3794:2: ( ruleFileExtractor )
            {
            // InternalBiLang.g:3794:2: ( ruleFileExtractor )
            // InternalBiLang.g:3795:3: ruleFileExtractor
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
    // InternalBiLang.g:3804:1: rule__Task__DatafilteringAssignment_6_1 : ( ruleDataFiltering ) ;
    public final void rule__Task__DatafilteringAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3808:1: ( ( ruleDataFiltering ) )
            // InternalBiLang.g:3809:2: ( ruleDataFiltering )
            {
            // InternalBiLang.g:3809:2: ( ruleDataFiltering )
            // InternalBiLang.g:3810:3: ruleDataFiltering
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
    // InternalBiLang.g:3819:1: rule__Task__DashboardAssignment_8 : ( ruleDashBoard ) ;
    public final void rule__Task__DashboardAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3823:1: ( ( ruleDashBoard ) )
            // InternalBiLang.g:3824:2: ( ruleDashBoard )
            {
            // InternalBiLang.g:3824:2: ( ruleDashBoard )
            // InternalBiLang.g:3825:3: ruleDashBoard
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


    // $ANTLR start "rule__Task__DashboardAssignment_9"
    // InternalBiLang.g:3834:1: rule__Task__DashboardAssignment_9 : ( ruleDashBoard ) ;
    public final void rule__Task__DashboardAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3838:1: ( ( ruleDashBoard ) )
            // InternalBiLang.g:3839:2: ( ruleDashBoard )
            {
            // InternalBiLang.g:3839:2: ( ruleDashBoard )
            // InternalBiLang.g:3840:3: ruleDashBoard
            {
             before(grammarAccess.getTaskAccess().getDashboardDashBoardParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDashBoard();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDashboardDashBoardParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DashboardAssignment_9"


    // $ANTLR start "rule__DataFiltering__NameAssignment_1"
    // InternalBiLang.g:3849:1: rule__DataFiltering__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DataFiltering__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3853:1: ( ( ruleEString ) )
            // InternalBiLang.g:3854:2: ( ruleEString )
            {
            // InternalBiLang.g:3854:2: ( ruleEString )
            // InternalBiLang.g:3855:3: ruleEString
            {
             before(grammarAccess.getDataFilteringAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__NameAssignment_1"


    // $ANTLR start "rule__DataFiltering__FileextractorAssignment_3"
    // InternalBiLang.g:3864:1: rule__DataFiltering__FileextractorAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__DataFiltering__FileextractorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3868:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:3869:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:3869:2: ( ( ruleEString ) )
            // InternalBiLang.g:3870:3: ( ruleEString )
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_3_0()); 
            // InternalBiLang.g:3871:3: ( ruleEString )
            // InternalBiLang.g:3872:4: ruleEString
            {
             before(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__FileextractorAssignment_3"


    // $ANTLR start "rule__DataFiltering__ProcessingstepAssignment_4_1"
    // InternalBiLang.g:3883:1: rule__DataFiltering__ProcessingstepAssignment_4_1 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3887:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:3888:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:3888:2: ( rulePreprocessingStep )
            // InternalBiLang.g:3889:3: rulePreprocessingStep
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__ProcessingstepAssignment_4_1"


    // $ANTLR start "rule__DataFiltering__ProcessingstepAssignment_4_2"
    // InternalBiLang.g:3898:1: rule__DataFiltering__ProcessingstepAssignment_4_2 : ( rulePreprocessingStep ) ;
    public final void rule__DataFiltering__ProcessingstepAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3902:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:3903:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:3903:2: ( rulePreprocessingStep )
            // InternalBiLang.g:3904:3: rulePreprocessingStep
            {
             before(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__ProcessingstepAssignment_4_2"


    // $ANTLR start "rule__DataFiltering__FilteringstepAssignment_6"
    // InternalBiLang.g:3913:1: rule__DataFiltering__FilteringstepAssignment_6 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3917:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:3918:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:3918:2: ( ruleFilteringStep )
            // InternalBiLang.g:3919:3: ruleFilteringStep
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFilteringStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__FilteringstepAssignment_6"


    // $ANTLR start "rule__DataFiltering__FilteringstepAssignment_7_1"
    // InternalBiLang.g:3928:1: rule__DataFiltering__FilteringstepAssignment_7_1 : ( ruleFilteringStep ) ;
    public final void rule__DataFiltering__FilteringstepAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3932:1: ( ( ruleFilteringStep ) )
            // InternalBiLang.g:3933:2: ( ruleFilteringStep )
            {
            // InternalBiLang.g:3933:2: ( ruleFilteringStep )
            // InternalBiLang.g:3934:3: ruleFilteringStep
            {
             before(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilteringStep();

            state._fsp--;

             after(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFiltering__FilteringstepAssignment_7_1"


    // $ANTLR start "rule__DashBoard__NameAssignment_0"
    // InternalBiLang.g:3943:1: rule__DashBoard__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__DashBoard__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3947:1: ( ( ruleEString ) )
            // InternalBiLang.g:3948:2: ( ruleEString )
            {
            // InternalBiLang.g:3948:2: ( ruleEString )
            // InternalBiLang.g:3949:3: ruleEString
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
    // InternalBiLang.g:3958:1: rule__DashBoard__FileextractorAssignment_2_0_1 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__FileextractorAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3962:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:3963:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:3963:2: ( ( ruleEString ) )
            // InternalBiLang.g:3964:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_1_0()); 
            // InternalBiLang.g:3965:3: ( ruleEString )
            // InternalBiLang.g:3966:4: ruleEString
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
    // InternalBiLang.g:3977:1: rule__DashBoard__DatafilteringAssignment_2_1_1 : ( ( ruleEString ) ) ;
    public final void rule__DashBoard__DatafilteringAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:3981:1: ( ( ( ruleEString ) ) )
            // InternalBiLang.g:3982:2: ( ( ruleEString ) )
            {
            // InternalBiLang.g:3982:2: ( ( ruleEString ) )
            // InternalBiLang.g:3983:3: ( ruleEString )
            {
             before(grammarAccess.getDashBoardAccess().getDatafilteringDataFilteringCrossReference_2_1_1_0()); 
            // InternalBiLang.g:3984:3: ( ruleEString )
            // InternalBiLang.g:3985:4: ruleEString
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
    // InternalBiLang.g:3996:1: rule__DashBoard__PlotAssignment_5 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4000:1: ( ( rulePlot ) )
            // InternalBiLang.g:4001:2: ( rulePlot )
            {
            // InternalBiLang.g:4001:2: ( rulePlot )
            // InternalBiLang.g:4002:3: rulePlot
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
    // InternalBiLang.g:4011:1: rule__DashBoard__PlotAssignment_6 : ( rulePlot ) ;
    public final void rule__DashBoard__PlotAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4015:1: ( ( rulePlot ) )
            // InternalBiLang.g:4016:2: ( rulePlot )
            {
            // InternalBiLang.g:4016:2: ( rulePlot )
            // InternalBiLang.g:4017:3: rulePlot
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
    // InternalBiLang.g:4026:1: rule__CsvExtractor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CsvExtractor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4030:1: ( ( ruleEString ) )
            // InternalBiLang.g:4031:2: ( ruleEString )
            {
            // InternalBiLang.g:4031:2: ( ruleEString )
            // InternalBiLang.g:4032:3: ruleEString
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
    // InternalBiLang.g:4041:1: rule__CsvExtractor__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__CsvExtractor__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4045:1: ( ( ruleEString ) )
            // InternalBiLang.g:4046:2: ( ruleEString )
            {
            // InternalBiLang.g:4046:2: ( ruleEString )
            // InternalBiLang.g:4047:3: ruleEString
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
    // InternalBiLang.g:4056:1: rule__ExcelExtractor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExcelExtractor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4060:1: ( ( ruleEString ) )
            // InternalBiLang.g:4061:2: ( ruleEString )
            {
            // InternalBiLang.g:4061:2: ( ruleEString )
            // InternalBiLang.g:4062:3: ruleEString
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
    // InternalBiLang.g:4071:1: rule__ExcelExtractor__PathAssignment_4 : ( ruleEString ) ;
    public final void rule__ExcelExtractor__PathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4075:1: ( ( ruleEString ) )
            // InternalBiLang.g:4076:2: ( ruleEString )
            {
            // InternalBiLang.g:4076:2: ( ruleEString )
            // InternalBiLang.g:4077:3: ruleEString
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


    // $ANTLR start "rule__QuantitativeFiltering__AxisAssignment_2"
    // InternalBiLang.g:4086:1: rule__QuantitativeFiltering__AxisAssignment_2 : ( ruleEString ) ;
    public final void rule__QuantitativeFiltering__AxisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4090:1: ( ( ruleEString ) )
            // InternalBiLang.g:4091:2: ( ruleEString )
            {
            // InternalBiLang.g:4091:2: ( ruleEString )
            // InternalBiLang.g:4092:3: ruleEString
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantitativeFiltering__AxisAssignment_2"


    // $ANTLR start "rule__QuantitativeFiltering__ValuesAssignment_4"
    // InternalBiLang.g:4101:1: rule__QuantitativeFiltering__ValuesAssignment_4 : ( ruleEString ) ;
    public final void rule__QuantitativeFiltering__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4105:1: ( ( ruleEString ) )
            // InternalBiLang.g:4106:2: ( ruleEString )
            {
            // InternalBiLang.g:4106:2: ( ruleEString )
            // InternalBiLang.g:4107:3: ruleEString
            {
             before(grammarAccess.getQuantitativeFilteringAccess().getValuesEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuantitativeFilteringAccess().getValuesEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantitativeFiltering__ValuesAssignment_4"


    // $ANTLR start "rule__QualitativeFiltering__AxisAssignment_2"
    // InternalBiLang.g:4116:1: rule__QualitativeFiltering__AxisAssignment_2 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__AxisAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4120:1: ( ( ruleEString ) )
            // InternalBiLang.g:4121:2: ( ruleEString )
            {
            // InternalBiLang.g:4121:2: ( ruleEString )
            // InternalBiLang.g:4122:3: ruleEString
            {
             before(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitativeFiltering__AxisAssignment_2"


    // $ANTLR start "rule__QualitativeFiltering__LabelsAssignment_4"
    // InternalBiLang.g:4131:1: rule__QualitativeFiltering__LabelsAssignment_4 : ( ruleEString ) ;
    public final void rule__QualitativeFiltering__LabelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4135:1: ( ( ruleEString ) )
            // InternalBiLang.g:4136:2: ( ruleEString )
            {
            // InternalBiLang.g:4136:2: ( ruleEString )
            // InternalBiLang.g:4137:3: ruleEString
            {
             before(grammarAccess.getQualitativeFilteringAccess().getLabelsEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualitativeFilteringAccess().getLabelsEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualitativeFiltering__LabelsAssignment_4"


    // $ANTLR start "rule__MathOperation__LsideAssignment_1"
    // InternalBiLang.g:4146:1: rule__MathOperation__LsideAssignment_1 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__LsideAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4150:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:4151:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:4151:2: ( rulePreprocessingStep )
            // InternalBiLang.g:4152:3: rulePreprocessingStep
            {
             before(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__LsideAssignment_1"


    // $ANTLR start "rule__MathOperation__OperatorAssignment_2"
    // InternalBiLang.g:4161:1: rule__MathOperation__OperatorAssignment_2 : ( ruleMathOperator ) ;
    public final void rule__MathOperation__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4165:1: ( ( ruleMathOperator ) )
            // InternalBiLang.g:4166:2: ( ruleMathOperator )
            {
            // InternalBiLang.g:4166:2: ( ruleMathOperator )
            // InternalBiLang.g:4167:3: ruleMathOperator
            {
             before(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__OperatorAssignment_2"


    // $ANTLR start "rule__MathOperation__RsideAssignment_4"
    // InternalBiLang.g:4176:1: rule__MathOperation__RsideAssignment_4 : ( rulePreprocessingStep ) ;
    public final void rule__MathOperation__RsideAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4180:1: ( ( rulePreprocessingStep ) )
            // InternalBiLang.g:4181:2: ( rulePreprocessingStep )
            {
            // InternalBiLang.g:4181:2: ( rulePreprocessingStep )
            // InternalBiLang.g:4182:3: rulePreprocessingStep
            {
             before(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePreprocessingStep();

            state._fsp--;

             after(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperation__RsideAssignment_4"


    // $ANTLR start "rule__ColReference__TargetAssignment_1"
    // InternalBiLang.g:4191:1: rule__ColReference__TargetAssignment_1 : ( ruleEString ) ;
    public final void rule__ColReference__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4195:1: ( ( ruleEString ) )
            // InternalBiLang.g:4196:2: ( ruleEString )
            {
            // InternalBiLang.g:4196:2: ( ruleEString )
            // InternalBiLang.g:4197:3: ruleEString
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
    // InternalBiLang.g:4206:1: rule__StatisticalOperation__OperatorAssignment_0 : ( ruleStatisticalOperator ) ;
    public final void rule__StatisticalOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4210:1: ( ( ruleStatisticalOperator ) )
            // InternalBiLang.g:4211:2: ( ruleStatisticalOperator )
            {
            // InternalBiLang.g:4211:2: ( ruleStatisticalOperator )
            // InternalBiLang.g:4212:3: ruleStatisticalOperator
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
    // InternalBiLang.g:4221:1: rule__StatisticalOperation__ColreferenceAssignment_2 : ( ruleColReference ) ;
    public final void rule__StatisticalOperation__ColreferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4225:1: ( ( ruleColReference ) )
            // InternalBiLang.g:4226:2: ( ruleColReference )
            {
            // InternalBiLang.g:4226:2: ( ruleColReference )
            // InternalBiLang.g:4227:3: ruleColReference
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
    // InternalBiLang.g:4236:1: rule__BarPlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BarPlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4240:1: ( ( RULE_ID ) )
            // InternalBiLang.g:4241:2: ( RULE_ID )
            {
            // InternalBiLang.g:4241:2: ( RULE_ID )
            // InternalBiLang.g:4242:3: RULE_ID
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
    // InternalBiLang.g:4251:1: rule__BarPlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__BarPlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4255:1: ( ( ruleEString ) )
            // InternalBiLang.g:4256:2: ( ruleEString )
            {
            // InternalBiLang.g:4256:2: ( ruleEString )
            // InternalBiLang.g:4257:3: ruleEString
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
    // InternalBiLang.g:4266:1: rule__BarPlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__BarPlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4270:1: ( ( ruleEString ) )
            // InternalBiLang.g:4271:2: ( ruleEString )
            {
            // InternalBiLang.g:4271:2: ( ruleEString )
            // InternalBiLang.g:4272:3: ruleEString
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
    // InternalBiLang.g:4281:1: rule__BarPlot__LocationAssignment_8_1 : ( ruleEString ) ;
    public final void rule__BarPlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4285:1: ( ( ruleEString ) )
            // InternalBiLang.g:4286:2: ( ruleEString )
            {
            // InternalBiLang.g:4286:2: ( ruleEString )
            // InternalBiLang.g:4287:3: ruleEString
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


    // $ANTLR start "rule__BarPlot__ColorAssignment_9_1"
    // InternalBiLang.g:4296:1: rule__BarPlot__ColorAssignment_9_1 : ( ruleEString ) ;
    public final void rule__BarPlot__ColorAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4300:1: ( ( ruleEString ) )
            // InternalBiLang.g:4301:2: ( ruleEString )
            {
            // InternalBiLang.g:4301:2: ( ruleEString )
            // InternalBiLang.g:4302:3: ruleEString
            {
             before(grammarAccess.getBarPlotAccess().getColorEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBarPlotAccess().getColorEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BarPlot__ColorAssignment_9_1"


    // $ANTLR start "rule__BarPlot__ThicknessAssignment_10_1"
    // InternalBiLang.g:4311:1: rule__BarPlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__BarPlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4315:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:4316:2: ( ruleEFloat )
            {
            // InternalBiLang.g:4316:2: ( ruleEFloat )
            // InternalBiLang.g:4317:3: ruleEFloat
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
    // InternalBiLang.g:4326:1: rule__LinePlot__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LinePlot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4330:1: ( ( RULE_ID ) )
            // InternalBiLang.g:4331:2: ( RULE_ID )
            {
            // InternalBiLang.g:4331:2: ( RULE_ID )
            // InternalBiLang.g:4332:3: RULE_ID
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
    // InternalBiLang.g:4341:1: rule__LinePlot__XAxisAssignment_5 : ( ruleEString ) ;
    public final void rule__LinePlot__XAxisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4345:1: ( ( ruleEString ) )
            // InternalBiLang.g:4346:2: ( ruleEString )
            {
            // InternalBiLang.g:4346:2: ( ruleEString )
            // InternalBiLang.g:4347:3: ruleEString
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
    // InternalBiLang.g:4356:1: rule__LinePlot__YAxisAssignment_7 : ( ruleEString ) ;
    public final void rule__LinePlot__YAxisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4360:1: ( ( ruleEString ) )
            // InternalBiLang.g:4361:2: ( ruleEString )
            {
            // InternalBiLang.g:4361:2: ( ruleEString )
            // InternalBiLang.g:4362:3: ruleEString
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
    // InternalBiLang.g:4371:1: rule__LinePlot__LocationAssignment_8_1 : ( ruleEString ) ;
    public final void rule__LinePlot__LocationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4375:1: ( ( ruleEString ) )
            // InternalBiLang.g:4376:2: ( ruleEString )
            {
            // InternalBiLang.g:4376:2: ( ruleEString )
            // InternalBiLang.g:4377:3: ruleEString
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


    // $ANTLR start "rule__LinePlot__ColorAssignment_9_1"
    // InternalBiLang.g:4386:1: rule__LinePlot__ColorAssignment_9_1 : ( ruleEString ) ;
    public final void rule__LinePlot__ColorAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4390:1: ( ( ruleEString ) )
            // InternalBiLang.g:4391:2: ( ruleEString )
            {
            // InternalBiLang.g:4391:2: ( ruleEString )
            // InternalBiLang.g:4392:3: ruleEString
            {
             before(grammarAccess.getLinePlotAccess().getColorEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinePlotAccess().getColorEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinePlot__ColorAssignment_9_1"


    // $ANTLR start "rule__LinePlot__ThicknessAssignment_10_1"
    // InternalBiLang.g:4401:1: rule__LinePlot__ThicknessAssignment_10_1 : ( ruleEFloat ) ;
    public final void rule__LinePlot__ThicknessAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBiLang.g:4405:1: ( ( ruleEFloat ) )
            // InternalBiLang.g:4406:2: ( ruleEFloat )
            {
            // InternalBiLang.g:4406:2: ( ruleEFloat )
            // InternalBiLang.g:4407:3: ruleEFloat
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002800030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000100000E0030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000100000E0032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020400100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020400000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000300000000040L});

}