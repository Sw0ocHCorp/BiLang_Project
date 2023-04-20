package ucal3ia.bilang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ucal3ia.bilang.services.BiLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBiLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "':'", "'load'", "'[dashboard:'", "']'", "'=>'", "'processing='", "','", "'filtering='", "'e'", "'df'", "'plots'", "'{'", "'}'", "'.csv'", "'.xlsx'", "'('", "'l'", "'r'", "')'", "'-'", "'.'", "'E'", "'bar'", "'->'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'donut'", "'pie'", "'polar'", "'scatter'", "'radar'", "'+'", "'*'", "'/'", "'mean'", "'median'", "'std'", "'= '", "'!= '", "'='", "'<'", "'>'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

        public InternalBiLangParser(TokenStream input, BiLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Task";
       	}

       	@Override
       	protected BiLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTask"
    // InternalBiLang.g:65:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalBiLang.g:65:45: (iv_ruleTask= ruleTask EOF )
            // InternalBiLang.g:66:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalBiLang.g:72:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) otherlv_10= ']' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_fileextractor_4_0 = null;

        EObject lv_datafiltering_5_0 = null;

        EObject lv_fileextractor_6_0 = null;

        EObject lv_datafiltering_7_0 = null;

        EObject lv_dashboard_9_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:78:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) otherlv_10= ']' ) )
            // InternalBiLang.g:79:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) otherlv_10= ']' )
            {
            // InternalBiLang.g:79:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) otherlv_10= ']' )
            // InternalBiLang.g:80:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalBiLang.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getLoadKeyword_3());
            		
            // InternalBiLang.g:110:3: ( (lv_fileextractor_4_0= ruleFileExtractor ) )
            // InternalBiLang.g:111:4: (lv_fileextractor_4_0= ruleFileExtractor )
            {
            // InternalBiLang.g:111:4: (lv_fileextractor_4_0= ruleFileExtractor )
            // InternalBiLang.g:112:5: lv_fileextractor_4_0= ruleFileExtractor
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getFileextractorFileExtractorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_fileextractor_4_0=ruleFileExtractor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					add(
            						current,
            						"fileextractor",
            						lv_fileextractor_4_0,
            						"ucal3ia.bilang.BiLang.FileExtractor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:129:3: ( (lv_datafiltering_5_0= ruleDataFiltering ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBiLang.g:130:4: (lv_datafiltering_5_0= ruleDataFiltering )
                    {
                    // InternalBiLang.g:130:4: (lv_datafiltering_5_0= ruleDataFiltering )
                    // InternalBiLang.g:131:5: lv_datafiltering_5_0= ruleDataFiltering
                    {

                    					newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_datafiltering_5_0=ruleDataFiltering();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskRule());
                    					}
                    					add(
                    						current,
                    						"datafiltering",
                    						lv_datafiltering_5_0,
                    						"ucal3ia.bilang.BiLang.DataFiltering");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBiLang.g:148:3: ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBiLang.g:149:4: ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )?
            	    {
            	    // InternalBiLang.g:149:4: ( (lv_fileextractor_6_0= ruleFileExtractor ) )
            	    // InternalBiLang.g:150:5: (lv_fileextractor_6_0= ruleFileExtractor )
            	    {
            	    // InternalBiLang.g:150:5: (lv_fileextractor_6_0= ruleFileExtractor )
            	    // InternalBiLang.g:151:6: lv_fileextractor_6_0= ruleFileExtractor
            	    {

            	    						newCompositeNode(grammarAccess.getTaskAccess().getFileextractorFileExtractorParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_fileextractor_6_0=ruleFileExtractor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fileextractor",
            	    							lv_fileextractor_6_0,
            	    							"ucal3ia.bilang.BiLang.FileExtractor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBiLang.g:168:4: ( (lv_datafiltering_7_0= ruleDataFiltering ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==16) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalBiLang.g:169:5: (lv_datafiltering_7_0= ruleDataFiltering )
            	            {
            	            // InternalBiLang.g:169:5: (lv_datafiltering_7_0= ruleDataFiltering )
            	            // InternalBiLang.g:170:6: lv_datafiltering_7_0= ruleDataFiltering
            	            {

            	            						newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_0());
            	            					
            	            pushFollow(FOLLOW_8);
            	            lv_datafiltering_7_0=ruleDataFiltering();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getTaskRule());
            	            						}
            	            						add(
            	            							current,
            	            							"datafiltering",
            	            							lv_datafiltering_7_0,
            	            							"ucal3ia.bilang.BiLang.DataFiltering");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getDashboardKeyword_7());
            		
            // InternalBiLang.g:192:3: ( (lv_dashboard_9_0= ruleDashBoard ) )
            // InternalBiLang.g:193:4: (lv_dashboard_9_0= ruleDashBoard )
            {
            // InternalBiLang.g:193:4: (lv_dashboard_9_0= ruleDashBoard )
            // InternalBiLang.g:194:5: lv_dashboard_9_0= ruleDashBoard
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getDashboardDashBoardParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_dashboard_9_0=ruleDashBoard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"dashboard",
            						lv_dashboard_9_0,
            						"ucal3ia.bilang.BiLang.DashBoard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleFileExtractor"
    // InternalBiLang.g:219:1: entryRuleFileExtractor returns [EObject current=null] : iv_ruleFileExtractor= ruleFileExtractor EOF ;
    public final EObject entryRuleFileExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileExtractor = null;


        try {
            // InternalBiLang.g:219:54: (iv_ruleFileExtractor= ruleFileExtractor EOF )
            // InternalBiLang.g:220:2: iv_ruleFileExtractor= ruleFileExtractor EOF
            {
             newCompositeNode(grammarAccess.getFileExtractorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileExtractor=ruleFileExtractor();

            state._fsp--;

             current =iv_ruleFileExtractor; 
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
    // $ANTLR end "entryRuleFileExtractor"


    // $ANTLR start "ruleFileExtractor"
    // InternalBiLang.g:226:1: ruleFileExtractor returns [EObject current=null] : (this_CsvExtractor_0= ruleCsvExtractor | this_ExcelExtractor_1= ruleExcelExtractor ) ;
    public final EObject ruleFileExtractor() throws RecognitionException {
        EObject current = null;

        EObject this_CsvExtractor_0 = null;

        EObject this_ExcelExtractor_1 = null;



        	enterRule();

        try {
            // InternalBiLang.g:232:2: ( (this_CsvExtractor_0= ruleCsvExtractor | this_ExcelExtractor_1= ruleExcelExtractor ) )
            // InternalBiLang.g:233:2: (this_CsvExtractor_0= ruleCsvExtractor | this_ExcelExtractor_1= ruleExcelExtractor )
            {
            // InternalBiLang.g:233:2: (this_CsvExtractor_0= ruleCsvExtractor | this_ExcelExtractor_1= ruleExcelExtractor )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=1;
                }
                else if ( (LA4_1==26) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==25) ) {
                    alt4=1;
                }
                else if ( (LA4_2==26) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBiLang.g:234:3: this_CsvExtractor_0= ruleCsvExtractor
                    {

                    			newCompositeNode(grammarAccess.getFileExtractorAccess().getCsvExtractorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CsvExtractor_0=ruleCsvExtractor();

                    state._fsp--;


                    			current = this_CsvExtractor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBiLang.g:243:3: this_ExcelExtractor_1= ruleExcelExtractor
                    {

                    			newCompositeNode(grammarAccess.getFileExtractorAccess().getExcelExtractorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExcelExtractor_1=ruleExcelExtractor();

                    state._fsp--;


                    			current = this_ExcelExtractor_1;
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
    // $ANTLR end "ruleFileExtractor"


    // $ANTLR start "entryRuleFilteringStep"
    // InternalBiLang.g:255:1: entryRuleFilteringStep returns [EObject current=null] : iv_ruleFilteringStep= ruleFilteringStep EOF ;
    public final EObject entryRuleFilteringStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteringStep = null;


        try {
            // InternalBiLang.g:255:54: (iv_ruleFilteringStep= ruleFilteringStep EOF )
            // InternalBiLang.g:256:2: iv_ruleFilteringStep= ruleFilteringStep EOF
            {
             newCompositeNode(grammarAccess.getFilteringStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilteringStep=ruleFilteringStep();

            state._fsp--;

             current =iv_ruleFilteringStep; 
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
    // $ANTLR end "entryRuleFilteringStep"


    // $ANTLR start "ruleFilteringStep"
    // InternalBiLang.g:262:1: ruleFilteringStep returns [EObject current=null] : (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering ) ;
    public final EObject ruleFilteringStep() throws RecognitionException {
        EObject current = null;

        EObject this_QuantitativeFiltering_0 = null;

        EObject this_QualitativeFiltering_1 = null;



        	enterRule();

        try {
            // InternalBiLang.g:268:2: ( (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering ) )
            // InternalBiLang.g:269:2: (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering )
            {
            // InternalBiLang.g:269:2: (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=53 && LA5_1<=54)) ) {
                    alt5=2;
                }
                else if ( ((LA5_1>=55 && LA5_1<=57)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=55 && LA5_2<=57)) ) {
                    alt5=1;
                }
                else if ( ((LA5_2>=53 && LA5_2<=54)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBiLang.g:270:3: this_QuantitativeFiltering_0= ruleQuantitativeFiltering
                    {

                    			newCompositeNode(grammarAccess.getFilteringStepAccess().getQuantitativeFilteringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QuantitativeFiltering_0=ruleQuantitativeFiltering();

                    state._fsp--;


                    			current = this_QuantitativeFiltering_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBiLang.g:279:3: this_QualitativeFiltering_1= ruleQualitativeFiltering
                    {

                    			newCompositeNode(grammarAccess.getFilteringStepAccess().getQualitativeFilteringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualitativeFiltering_1=ruleQualitativeFiltering();

                    state._fsp--;


                    			current = this_QualitativeFiltering_1;
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
    // $ANTLR end "ruleFilteringStep"


    // $ANTLR start "entryRulePreprocessingStep"
    // InternalBiLang.g:291:1: entryRulePreprocessingStep returns [EObject current=null] : iv_rulePreprocessingStep= rulePreprocessingStep EOF ;
    public final EObject entryRulePreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreprocessingStep = null;


        try {
            // InternalBiLang.g:291:58: (iv_rulePreprocessingStep= rulePreprocessingStep EOF )
            // InternalBiLang.g:292:2: iv_rulePreprocessingStep= rulePreprocessingStep EOF
            {
             newCompositeNode(grammarAccess.getPreprocessingStepRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreprocessingStep=rulePreprocessingStep();

            state._fsp--;

             current =iv_rulePreprocessingStep; 
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
    // $ANTLR end "entryRulePreprocessingStep"


    // $ANTLR start "rulePreprocessingStep"
    // InternalBiLang.g:298:1: rulePreprocessingStep returns [EObject current=null] : (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation ) ;
    public final EObject rulePreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject this_MathOperation_0 = null;

        EObject this_ColReference_1 = null;

        EObject this_StatisticalOperation_2 = null;



        	enterRule();

        try {
            // InternalBiLang.g:304:2: ( (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation ) )
            // InternalBiLang.g:305:2: (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation )
            {
            // InternalBiLang.g:305:2: (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt6=2;
                }
                break;
            case 50:
            case 51:
            case 52:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBiLang.g:306:3: this_MathOperation_0= ruleMathOperation
                    {

                    			newCompositeNode(grammarAccess.getPreprocessingStepAccess().getMathOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MathOperation_0=ruleMathOperation();

                    state._fsp--;


                    			current = this_MathOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBiLang.g:315:3: this_ColReference_1= ruleColReference
                    {

                    			newCompositeNode(grammarAccess.getPreprocessingStepAccess().getColReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColReference_1=ruleColReference();

                    state._fsp--;


                    			current = this_ColReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBiLang.g:324:3: this_StatisticalOperation_2= ruleStatisticalOperation
                    {

                    			newCompositeNode(grammarAccess.getPreprocessingStepAccess().getStatisticalOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StatisticalOperation_2=ruleStatisticalOperation();

                    state._fsp--;


                    			current = this_StatisticalOperation_2;
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
    // $ANTLR end "rulePreprocessingStep"


    // $ANTLR start "entryRulePlot"
    // InternalBiLang.g:336:1: entryRulePlot returns [EObject current=null] : iv_rulePlot= rulePlot EOF ;
    public final EObject entryRulePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlot = null;


        try {
            // InternalBiLang.g:336:45: (iv_rulePlot= rulePlot EOF )
            // InternalBiLang.g:337:2: iv_rulePlot= rulePlot EOF
            {
             newCompositeNode(grammarAccess.getPlotRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlot=rulePlot();

            state._fsp--;

             current =iv_rulePlot; 
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
    // $ANTLR end "entryRulePlot"


    // $ANTLR start "rulePlot"
    // InternalBiLang.g:343:1: rulePlot returns [EObject current=null] : (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot ) ;
    public final EObject rulePlot() throws RecognitionException {
        EObject current = null;

        EObject this_BarPlot_0 = null;

        EObject this_LinePlot_1 = null;

        EObject this_DonutPlot_2 = null;

        EObject this_ScatterPlot_3 = null;

        EObject this_PolarPlot_4 = null;

        EObject this_RadarPlot_5 = null;

        EObject this_PiePlot_6 = null;



        	enterRule();

        try {
            // InternalBiLang.g:349:2: ( (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot ) )
            // InternalBiLang.g:350:2: (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot )
            {
            // InternalBiLang.g:350:2: (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            case 45:
                {
                alt7=4;
                }
                break;
            case 44:
                {
                alt7=5;
                }
                break;
            case 46:
                {
                alt7=6;
                }
                break;
            case 43:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBiLang.g:351:3: this_BarPlot_0= ruleBarPlot
                    {

                    			newCompositeNode(grammarAccess.getPlotAccess().getBarPlotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BarPlot_0=ruleBarPlot();

                    state._fsp--;


                    			current = this_BarPlot_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBiLang.g:360:3: this_LinePlot_1= ruleLinePlot
                    {

                    			newCompositeNode(grammarAccess.getPlotAccess().getLinePlotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LinePlot_1=ruleLinePlot();

                    state._fsp--;


                    			current = this_LinePlot_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBiLang.g:369:3: this_DonutPlot_2= ruleDonutPlot
                    {

                    			newCompositeNode(grammarAccess.getPlotAccess().getDonutPlotParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DonutPlot_2=ruleDonutPlot();

                    state._fsp--;


                    			current = this_DonutPlot_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBiLang.g:378:3: this_ScatterPlot_3= ruleScatterPlot
                    {

                    			newCompositeNode(grammarAccess.getPlotAccess().getScatterPlotParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScatterPlot_3=ruleScatterPlot();

                    state._fsp--;


                    			current = this_ScatterPlot_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBiLang.g:387:3: this_PolarPlot_4= rulePolarPlot
                    {

                    			newCompositeNode(grammarAccess.getPlotAccess().getPolarPlotParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PolarPlot_4=rulePolarPlot();

                    state._fsp--;


                    			current = this_PolarPlot_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBiLang.g:396:3: this_RadarPlot_5= ruleRadarPlot
                    {

                    			newCompositeNode(grammarAccess.getPlotAccess().getRadarPlotParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadarPlot_5=ruleRadarPlot();

                    state._fsp--;


                    			current = this_RadarPlot_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalBiLang.g:405:3: this_PiePlot_6= rulePiePlot
                    {

                    			newCompositeNode(grammarAccess.getPlotAccess().getPiePlotParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PiePlot_6=rulePiePlot();

                    state._fsp--;


                    			current = this_PiePlot_6;
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
    // $ANTLR end "rulePlot"


    // $ANTLR start "entryRuleEString"
    // InternalBiLang.g:417:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBiLang.g:417:47: (iv_ruleEString= ruleEString EOF )
            // InternalBiLang.g:418:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBiLang.g:424:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:430:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBiLang.g:431:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBiLang.g:431:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBiLang.g:432:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBiLang.g:440:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDataFiltering"
    // InternalBiLang.g:451:1: entryRuleDataFiltering returns [EObject current=null] : iv_ruleDataFiltering= ruleDataFiltering EOF ;
    public final EObject entryRuleDataFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFiltering = null;


        try {
            // InternalBiLang.g:451:54: (iv_ruleDataFiltering= ruleDataFiltering EOF )
            // InternalBiLang.g:452:2: iv_ruleDataFiltering= ruleDataFiltering EOF
            {
             newCompositeNode(grammarAccess.getDataFilteringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFiltering=ruleDataFiltering();

            state._fsp--;

             current =iv_ruleDataFiltering; 
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
    // $ANTLR end "entryRuleDataFiltering"


    // $ANTLR start "ruleDataFiltering"
    // InternalBiLang.g:458:1: ruleDataFiltering returns [EObject current=null] : (otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )? ) ;
    public final EObject ruleDataFiltering() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_processingstep_3_0 = null;

        EObject lv_processingstep_5_0 = null;

        EObject lv_filteringstep_7_0 = null;

        EObject lv_filteringstep_9_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:464:2: ( (otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )? ) )
            // InternalBiLang.g:465:2: (otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )? )
            {
            // InternalBiLang.g:465:2: (otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )? )
            // InternalBiLang.g:466:3: otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFilteringAccess().getEqualsSignGreaterThanSignKeyword_0());
            		
            // InternalBiLang.g:470:3: ( ( ruleEString ) )
            // InternalBiLang.g:471:4: ( ruleEString )
            {
            // InternalBiLang.g:471:4: ( ruleEString )
            // InternalBiLang.g:472:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFilteringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:486:3: (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBiLang.g:487:4: otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )*
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataFilteringAccess().getProcessingKeyword_2_0());
                    			
                    // InternalBiLang.g:491:4: ( (lv_processingstep_3_0= rulePreprocessingStep ) )
                    // InternalBiLang.g:492:5: (lv_processingstep_3_0= rulePreprocessingStep )
                    {
                    // InternalBiLang.g:492:5: (lv_processingstep_3_0= rulePreprocessingStep )
                    // InternalBiLang.g:493:6: lv_processingstep_3_0= rulePreprocessingStep
                    {

                    						newCompositeNode(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_processingstep_3_0=rulePreprocessingStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    						}
                    						add(
                    							current,
                    							"processingstep",
                    							lv_processingstep_3_0,
                    							"ucal3ia.bilang.BiLang.PreprocessingStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBiLang.g:510:4: (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBiLang.g:511:5: otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_11); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDataFilteringAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBiLang.g:515:5: ( (lv_processingstep_5_0= rulePreprocessingStep ) )
                    	    // InternalBiLang.g:516:6: (lv_processingstep_5_0= rulePreprocessingStep )
                    	    {
                    	    // InternalBiLang.g:516:6: (lv_processingstep_5_0= rulePreprocessingStep )
                    	    // InternalBiLang.g:517:7: lv_processingstep_5_0= rulePreprocessingStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_processingstep_5_0=rulePreprocessingStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"processingstep",
                    	    								lv_processingstep_5_0,
                    	    								"ucal3ia.bilang.BiLang.PreprocessingStep");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBiLang.g:536:3: (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBiLang.g:537:4: otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )*
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataFilteringAccess().getFilteringKeyword_3_0());
                    			
                    // InternalBiLang.g:541:4: ( (lv_filteringstep_7_0= ruleFilteringStep ) )
                    // InternalBiLang.g:542:5: (lv_filteringstep_7_0= ruleFilteringStep )
                    {
                    // InternalBiLang.g:542:5: (lv_filteringstep_7_0= ruleFilteringStep )
                    // InternalBiLang.g:543:6: lv_filteringstep_7_0= ruleFilteringStep
                    {

                    						newCompositeNode(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_filteringstep_7_0=ruleFilteringStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    						}
                    						add(
                    							current,
                    							"filteringstep",
                    							lv_filteringstep_7_0,
                    							"ucal3ia.bilang.BiLang.FilteringStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBiLang.g:560:4: (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBiLang.g:561:5: otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDataFilteringAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalBiLang.g:565:5: ( (lv_filteringstep_9_0= ruleFilteringStep ) )
                    	    // InternalBiLang.g:566:6: (lv_filteringstep_9_0= ruleFilteringStep )
                    	    {
                    	    // InternalBiLang.g:566:6: (lv_filteringstep_9_0= ruleFilteringStep )
                    	    // InternalBiLang.g:567:7: lv_filteringstep_9_0= ruleFilteringStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_filteringstep_9_0=ruleFilteringStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"filteringstep",
                    	    								lv_filteringstep_9_0,
                    	    								"ucal3ia.bilang.BiLang.FilteringStep");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleDataFiltering"


    // $ANTLR start "entryRuleDashBoard"
    // InternalBiLang.g:590:1: entryRuleDashBoard returns [EObject current=null] : iv_ruleDashBoard= ruleDashBoard EOF ;
    public final EObject entryRuleDashBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashBoard = null;


        try {
            // InternalBiLang.g:590:50: (iv_ruleDashBoard= ruleDashBoard EOF )
            // InternalBiLang.g:591:2: iv_ruleDashBoard= ruleDashBoard EOF
            {
             newCompositeNode(grammarAccess.getDashBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDashBoard=ruleDashBoard();

            state._fsp--;

             current =iv_ruleDashBoard; 
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
    // $ANTLR end "entryRuleDashBoard"


    // $ANTLR start "ruleDashBoard"
    // InternalBiLang.g:597:1: ruleDashBoard returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}' ) ;
    public final EObject ruleDashBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_plot_8_0 = null;

        EObject lv_plot_9_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:603:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}' ) )
            // InternalBiLang.g:604:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}' )
            {
            // InternalBiLang.g:604:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}' )
            // InternalBiLang.g:605:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}'
            {
            // InternalBiLang.g:605:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBiLang.g:606:4: (lv_name_0_0= ruleEString )
            {
            // InternalBiLang.g:606:4: (lv_name_0_0= ruleEString )
            // InternalBiLang.g:607:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDashBoardAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashBoardRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalBiLang.g:628:3: ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBiLang.g:629:4: (otherlv_2= 'e' ( ( ruleEString ) ) )
                    {
                    // InternalBiLang.g:629:4: (otherlv_2= 'e' ( ( ruleEString ) ) )
                    // InternalBiLang.g:630:5: otherlv_2= 'e' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getDashBoardAccess().getEKeyword_2_0_0());
                    				
                    // InternalBiLang.g:634:5: ( ( ruleEString ) )
                    // InternalBiLang.g:635:6: ( ruleEString )
                    {
                    // InternalBiLang.g:635:6: ( ruleEString )
                    // InternalBiLang.g:636:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDashBoardRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:652:4: (otherlv_4= 'df' ( ( ruleEString ) ) )
                    {
                    // InternalBiLang.g:652:4: (otherlv_4= 'df' ( ( ruleEString ) ) )
                    // InternalBiLang.g:653:5: otherlv_4= 'df' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getDashBoardAccess().getDfKeyword_2_1_0());
                    				
                    // InternalBiLang.g:657:5: ( ( ruleEString ) )
                    // InternalBiLang.g:658:6: ( ruleEString )
                    {
                    // InternalBiLang.g:658:6: ( ruleEString )
                    // InternalBiLang.g:659:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDashBoardRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getDashBoardAccess().getDatafilteringDataFilteringCrossReference_2_1_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getDashBoardAccess().getPlotsKeyword_3());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBiLang.g:683:3: ( (lv_plot_8_0= rulePlot ) )
            // InternalBiLang.g:684:4: (lv_plot_8_0= rulePlot )
            {
            // InternalBiLang.g:684:4: (lv_plot_8_0= rulePlot )
            // InternalBiLang.g:685:5: lv_plot_8_0= rulePlot
            {

            					newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_plot_8_0=rulePlot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashBoardRule());
            					}
            					add(
            						current,
            						"plot",
            						lv_plot_8_0,
            						"ucal3ia.bilang.BiLang.Plot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:702:3: ( (lv_plot_9_0= rulePlot ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34||(LA14_0>=41 && LA14_0<=46)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBiLang.g:703:4: (lv_plot_9_0= rulePlot )
            	    {
            	    // InternalBiLang.g:703:4: (lv_plot_9_0= rulePlot )
            	    // InternalBiLang.g:704:5: lv_plot_9_0= rulePlot
            	    {

            	    					newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_plot_9_0=rulePlot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDashBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"plot",
            	    						lv_plot_9_0,
            	    						"ucal3ia.bilang.BiLang.Plot");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDashBoard"


    // $ANTLR start "entryRuleCsvExtractor"
    // InternalBiLang.g:729:1: entryRuleCsvExtractor returns [EObject current=null] : iv_ruleCsvExtractor= ruleCsvExtractor EOF ;
    public final EObject entryRuleCsvExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvExtractor = null;


        try {
            // InternalBiLang.g:729:53: (iv_ruleCsvExtractor= ruleCsvExtractor EOF )
            // InternalBiLang.g:730:2: iv_ruleCsvExtractor= ruleCsvExtractor EOF
            {
             newCompositeNode(grammarAccess.getCsvExtractorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvExtractor=ruleCsvExtractor();

            state._fsp--;

             current =iv_ruleCsvExtractor; 
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
    // $ANTLR end "entryRuleCsvExtractor"


    // $ANTLR start "ruleCsvExtractor"
    // InternalBiLang.g:736:1: ruleCsvExtractor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) ) ;
    public final EObject ruleCsvExtractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:742:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) ) )
            // InternalBiLang.g:743:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) )
            {
            // InternalBiLang.g:743:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) )
            // InternalBiLang.g:744:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) )
            {
            // InternalBiLang.g:744:3: ()
            // InternalBiLang.g:745:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCsvExtractorAccess().getCsvExtractorAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:751:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBiLang.g:752:4: (lv_name_1_0= ruleEString )
            {
            // InternalBiLang.g:752:4: (lv_name_1_0= ruleEString )
            // InternalBiLang.g:753:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsvExtractorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCsvExtractorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCsvExtractorAccess().getCsvKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCsvExtractorAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalBiLang.g:778:3: ( (lv_path_4_0= ruleEString ) )
            // InternalBiLang.g:779:4: (lv_path_4_0= ruleEString )
            {
            // InternalBiLang.g:779:4: (lv_path_4_0= ruleEString )
            // InternalBiLang.g:780:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsvExtractorAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCsvExtractorRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"ucal3ia.bilang.BiLang.EString");
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
    // $ANTLR end "ruleCsvExtractor"


    // $ANTLR start "entryRuleExcelExtractor"
    // InternalBiLang.g:801:1: entryRuleExcelExtractor returns [EObject current=null] : iv_ruleExcelExtractor= ruleExcelExtractor EOF ;
    public final EObject entryRuleExcelExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExcelExtractor = null;


        try {
            // InternalBiLang.g:801:55: (iv_ruleExcelExtractor= ruleExcelExtractor EOF )
            // InternalBiLang.g:802:2: iv_ruleExcelExtractor= ruleExcelExtractor EOF
            {
             newCompositeNode(grammarAccess.getExcelExtractorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExcelExtractor=ruleExcelExtractor();

            state._fsp--;

             current =iv_ruleExcelExtractor; 
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
    // $ANTLR end "entryRuleExcelExtractor"


    // $ANTLR start "ruleExcelExtractor"
    // InternalBiLang.g:808:1: ruleExcelExtractor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) ) ;
    public final EObject ruleExcelExtractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:814:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) ) )
            // InternalBiLang.g:815:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) )
            {
            // InternalBiLang.g:815:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) )
            // InternalBiLang.g:816:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) )
            {
            // InternalBiLang.g:816:3: ()
            // InternalBiLang.g:817:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExcelExtractorAccess().getExcelExtractorAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:823:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBiLang.g:824:4: (lv_name_1_0= ruleEString )
            {
            // InternalBiLang.g:824:4: (lv_name_1_0= ruleEString )
            // InternalBiLang.g:825:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExcelExtractorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExcelExtractorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getExcelExtractorAccess().getXlsxKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExcelExtractorAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalBiLang.g:850:3: ( (lv_path_4_0= ruleEString ) )
            // InternalBiLang.g:851:4: (lv_path_4_0= ruleEString )
            {
            // InternalBiLang.g:851:4: (lv_path_4_0= ruleEString )
            // InternalBiLang.g:852:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExcelExtractorAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExcelExtractorRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"ucal3ia.bilang.BiLang.EString");
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
    // $ANTLR end "ruleExcelExtractor"


    // $ANTLR start "entryRuleQuantitativeFiltering"
    // InternalBiLang.g:873:1: entryRuleQuantitativeFiltering returns [EObject current=null] : iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF ;
    public final EObject entryRuleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativeFiltering = null;


        try {
            // InternalBiLang.g:873:62: (iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:874:2: iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF
            {
             newCompositeNode(grammarAccess.getQuantitativeFilteringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantitativeFiltering=ruleQuantitativeFiltering();

            state._fsp--;

             current =iv_ruleQuantitativeFiltering; 
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
    // $ANTLR end "entryRuleQuantitativeFiltering"


    // $ANTLR start "ruleQuantitativeFiltering"
    // InternalBiLang.g:880:1: ruleQuantitativeFiltering returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) ) ;
    public final EObject ruleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_axis_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:886:2: ( ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) ) )
            // InternalBiLang.g:887:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) )
            {
            // InternalBiLang.g:887:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) )
            // InternalBiLang.g:888:3: () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) )
            {
            // InternalBiLang.g:888:3: ()
            // InternalBiLang.g:889:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:895:3: ( (lv_axis_1_0= ruleEString ) )
            // InternalBiLang.g:896:4: (lv_axis_1_0= ruleEString )
            {
            // InternalBiLang.g:896:4: (lv_axis_1_0= ruleEString )
            // InternalBiLang.g:897:5: lv_axis_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_axis_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantitativeFilteringRule());
            					}
            					set(
            						current,
            						"axis",
            						lv_axis_1_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:914:3: ( (lv_operator_2_0= ruleQuantitativeOperator ) )
            // InternalBiLang.g:915:4: (lv_operator_2_0= ruleQuantitativeOperator )
            {
            // InternalBiLang.g:915:4: (lv_operator_2_0= ruleQuantitativeOperator )
            // InternalBiLang.g:916:5: lv_operator_2_0= ruleQuantitativeOperator
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getOperatorQuantitativeOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_operator_2_0=ruleQuantitativeOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantitativeFilteringRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"ucal3ia.bilang.BiLang.QuantitativeOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:933:3: ( (lv_values_3_0= ruleEFloat ) )
            // InternalBiLang.g:934:4: (lv_values_3_0= ruleEFloat )
            {
            // InternalBiLang.g:934:4: (lv_values_3_0= ruleEFloat )
            // InternalBiLang.g:935:5: lv_values_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getValuesEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_values_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantitativeFilteringRule());
            					}
            					set(
            						current,
            						"values",
            						lv_values_3_0,
            						"ucal3ia.bilang.BiLang.EFloat");
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
    // $ANTLR end "ruleQuantitativeFiltering"


    // $ANTLR start "entryRuleQualitativeFiltering"
    // InternalBiLang.g:956:1: entryRuleQualitativeFiltering returns [EObject current=null] : iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF ;
    public final EObject entryRuleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeFiltering = null;


        try {
            // InternalBiLang.g:956:61: (iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF )
            // InternalBiLang.g:957:2: iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF
            {
             newCompositeNode(grammarAccess.getQualitativeFilteringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualitativeFiltering=ruleQualitativeFiltering();

            state._fsp--;

             current =iv_ruleQualitativeFiltering; 
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
    // $ANTLR end "entryRuleQualitativeFiltering"


    // $ANTLR start "ruleQualitativeFiltering"
    // InternalBiLang.g:963:1: ruleQualitativeFiltering returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) ) ;
    public final EObject ruleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_axis_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:969:2: ( ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) ) )
            // InternalBiLang.g:970:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) )
            {
            // InternalBiLang.g:970:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) )
            // InternalBiLang.g:971:3: () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) )
            {
            // InternalBiLang.g:971:3: ()
            // InternalBiLang.g:972:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:978:3: ( (lv_axis_1_0= ruleEString ) )
            // InternalBiLang.g:979:4: (lv_axis_1_0= ruleEString )
            {
            // InternalBiLang.g:979:4: (lv_axis_1_0= ruleEString )
            // InternalBiLang.g:980:5: lv_axis_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_axis_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualitativeFilteringRule());
            					}
            					set(
            						current,
            						"axis",
            						lv_axis_1_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:997:3: ( (lv_operator_2_0= ruleQualitativeOperator ) )
            // InternalBiLang.g:998:4: (lv_operator_2_0= ruleQualitativeOperator )
            {
            // InternalBiLang.g:998:4: (lv_operator_2_0= ruleQualitativeOperator )
            // InternalBiLang.g:999:5: lv_operator_2_0= ruleQualitativeOperator
            {

            					newCompositeNode(grammarAccess.getQualitativeFilteringAccess().getOperatorQualitativeOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_operator_2_0=ruleQualitativeOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualitativeFilteringRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"ucal3ia.bilang.BiLang.QualitativeOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1016:3: ( (lv_labels_3_0= ruleEString ) )
            // InternalBiLang.g:1017:4: (lv_labels_3_0= ruleEString )
            {
            // InternalBiLang.g:1017:4: (lv_labels_3_0= ruleEString )
            // InternalBiLang.g:1018:5: lv_labels_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualitativeFilteringAccess().getLabelsEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_labels_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualitativeFilteringRule());
            					}
            					set(
            						current,
            						"labels",
            						lv_labels_3_0,
            						"ucal3ia.bilang.BiLang.EString");
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
    // $ANTLR end "ruleQualitativeFiltering"


    // $ANTLR start "entryRuleMathOperation"
    // InternalBiLang.g:1039:1: entryRuleMathOperation returns [EObject current=null] : iv_ruleMathOperation= ruleMathOperation EOF ;
    public final EObject entryRuleMathOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathOperation = null;


        try {
            // InternalBiLang.g:1039:54: (iv_ruleMathOperation= ruleMathOperation EOF )
            // InternalBiLang.g:1040:2: iv_ruleMathOperation= ruleMathOperation EOF
            {
             newCompositeNode(grammarAccess.getMathOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathOperation=ruleMathOperation();

            state._fsp--;

             current =iv_ruleMathOperation; 
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
    // $ANTLR end "entryRuleMathOperation"


    // $ANTLR start "ruleMathOperation"
    // InternalBiLang.g:1046:1: ruleMathOperation returns [EObject current=null] : ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? ) ;
    public final EObject ruleMathOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lside_2_0 = null;

        Enumerator lv_operator_3_0 = null;

        EObject lv_rside_5_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1052:2: ( ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? ) )
            // InternalBiLang.g:1053:2: ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? )
            {
            // InternalBiLang.g:1053:2: ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? )
            // InternalBiLang.g:1054:3: (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )?
            {
            // InternalBiLang.g:1054:3: (otherlv_0= '(' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:1055:4: otherlv_0= '('
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMathOperationAccess().getLKeyword_1());
            		
            // InternalBiLang.g:1064:3: ( (lv_lside_2_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1065:4: (lv_lside_2_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1065:4: (lv_lside_2_0= rulePreprocessingStep )
            // InternalBiLang.g:1066:5: lv_lside_2_0= rulePreprocessingStep
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_lside_2_0=rulePreprocessingStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"lside",
            						lv_lside_2_0,
            						"ucal3ia.bilang.BiLang.PreprocessingStep");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1083:3: ( (lv_operator_3_0= ruleMathOperator ) )
            // InternalBiLang.g:1084:4: (lv_operator_3_0= ruleMathOperator )
            {
            // InternalBiLang.g:1084:4: (lv_operator_3_0= ruleMathOperator )
            // InternalBiLang.g:1085:5: lv_operator_3_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_operator_3_0=ruleMathOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"ucal3ia.bilang.BiLang.MathOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMathOperationAccess().getRKeyword_4());
            		
            // InternalBiLang.g:1106:3: ( (lv_rside_5_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1107:4: (lv_rside_5_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1107:4: (lv_rside_5_0= rulePreprocessingStep )
            // InternalBiLang.g:1108:5: lv_rside_5_0= rulePreprocessingStep
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_rside_5_0=rulePreprocessingStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"rside",
            						lv_rside_5_0,
            						"ucal3ia.bilang.BiLang.PreprocessingStep");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1125:3: (otherlv_6= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBiLang.g:1126:4: otherlv_6= ')'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_6());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleMathOperation"


    // $ANTLR start "entryRuleColReference"
    // InternalBiLang.g:1135:1: entryRuleColReference returns [EObject current=null] : iv_ruleColReference= ruleColReference EOF ;
    public final EObject entryRuleColReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColReference = null;


        try {
            // InternalBiLang.g:1135:53: (iv_ruleColReference= ruleColReference EOF )
            // InternalBiLang.g:1136:2: iv_ruleColReference= ruleColReference EOF
            {
             newCompositeNode(grammarAccess.getColReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColReference=ruleColReference();

            state._fsp--;

             current =iv_ruleColReference; 
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
    // $ANTLR end "entryRuleColReference"


    // $ANTLR start "ruleColReference"
    // InternalBiLang.g:1142:1: ruleColReference returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject ruleColReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1148:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalBiLang.g:1149:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalBiLang.g:1149:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalBiLang.g:1150:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalBiLang.g:1150:3: ()
            // InternalBiLang.g:1151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColReferenceAccess().getColReferenceAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1157:3: ( (lv_target_1_0= ruleEString ) )
            // InternalBiLang.g:1158:4: (lv_target_1_0= ruleEString )
            {
            // InternalBiLang.g:1158:4: (lv_target_1_0= ruleEString )
            // InternalBiLang.g:1159:5: lv_target_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColReferenceAccess().getTargetEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColReferenceRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_1_0,
            						"ucal3ia.bilang.BiLang.EString");
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
    // $ANTLR end "ruleColReference"


    // $ANTLR start "entryRuleStatisticalOperation"
    // InternalBiLang.g:1180:1: entryRuleStatisticalOperation returns [EObject current=null] : iv_ruleStatisticalOperation= ruleStatisticalOperation EOF ;
    public final EObject entryRuleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatisticalOperation = null;


        try {
            // InternalBiLang.g:1180:61: (iv_ruleStatisticalOperation= ruleStatisticalOperation EOF )
            // InternalBiLang.g:1181:2: iv_ruleStatisticalOperation= ruleStatisticalOperation EOF
            {
             newCompositeNode(grammarAccess.getStatisticalOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatisticalOperation=ruleStatisticalOperation();

            state._fsp--;

             current =iv_ruleStatisticalOperation; 
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
    // $ANTLR end "entryRuleStatisticalOperation"


    // $ANTLR start "ruleStatisticalOperation"
    // InternalBiLang.g:1187:1: ruleStatisticalOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_colreference_2_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1193:2: ( ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) )
            // InternalBiLang.g:1194:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            {
            // InternalBiLang.g:1194:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            // InternalBiLang.g:1195:3: ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')'
            {
            // InternalBiLang.g:1195:3: ( (lv_operator_0_0= ruleStatisticalOperator ) )
            // InternalBiLang.g:1196:4: (lv_operator_0_0= ruleStatisticalOperator )
            {
            // InternalBiLang.g:1196:4: (lv_operator_0_0= ruleStatisticalOperator )
            // InternalBiLang.g:1197:5: lv_operator_0_0= ruleStatisticalOperator
            {

            					newCompositeNode(grammarAccess.getStatisticalOperationAccess().getOperatorStatisticalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_operator_0_0=ruleStatisticalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatisticalOperationRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"ucal3ia.bilang.BiLang.StatisticalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStatisticalOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBiLang.g:1218:3: ( (lv_colreference_2_0= ruleColReference ) )
            // InternalBiLang.g:1219:4: (lv_colreference_2_0= ruleColReference )
            {
            // InternalBiLang.g:1219:4: (lv_colreference_2_0= ruleColReference )
            // InternalBiLang.g:1220:5: lv_colreference_2_0= ruleColReference
            {

            					newCompositeNode(grammarAccess.getStatisticalOperationAccess().getColreferenceColReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_colreference_2_0=ruleColReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatisticalOperationRule());
            					}
            					set(
            						current,
            						"colreference",
            						lv_colreference_2_0,
            						"ucal3ia.bilang.BiLang.ColReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStatisticalOperationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleStatisticalOperation"


    // $ANTLR start "entryRuleEFloat"
    // InternalBiLang.g:1245:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBiLang.g:1245:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBiLang.g:1246:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalBiLang.g:1252:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBiLang.g:1258:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBiLang.g:1259:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBiLang.g:1259:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBiLang.g:1260:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBiLang.g:1260:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBiLang.g:1261:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBiLang.g:1267:3: (this_INT_1= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBiLang.g:1268:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_32); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_34); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBiLang.g:1288:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20||LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:1289:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBiLang.g:1289:4: (kw= 'E' | kw= 'e' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==33) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==20) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalBiLang.g:1290:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBiLang.g:1296:5: kw= 'e'
                            {
                            kw=(Token)match(input,20,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBiLang.g:1302:4: (kw= '-' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==31) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalBiLang.g:1303:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleBarPlot"
    // InternalBiLang.g:1321:1: entryRuleBarPlot returns [EObject current=null] : iv_ruleBarPlot= ruleBarPlot EOF ;
    public final EObject entryRuleBarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarPlot = null;


        try {
            // InternalBiLang.g:1321:48: (iv_ruleBarPlot= ruleBarPlot EOF )
            // InternalBiLang.g:1322:2: iv_ruleBarPlot= ruleBarPlot EOF
            {
             newCompositeNode(grammarAccess.getBarPlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBarPlot=ruleBarPlot();

            state._fsp--;

             current =iv_ruleBarPlot; 
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
    // $ANTLR end "entryRuleBarPlot"


    // $ANTLR start "ruleBarPlot"
    // InternalBiLang.g:1328:1: ruleBarPlot returns [EObject current=null] : ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
    public final EObject ruleBarPlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_xAxis_5_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_7_0 = null;

        AntlrDatatypeRuleToken lv_location_9_0 = null;

        AntlrDatatypeRuleToken lv_colors_11_0 = null;

        AntlrDatatypeRuleToken lv_thickness_13_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1334:2: ( ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1335:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1335:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1336:3: () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1336:3: ()
            // InternalBiLang.g:1337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBarPlotAccess().getBarPlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBarPlotAccess().getBarKeyword_1());
            		
            // InternalBiLang.g:1347:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1348:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1348:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1349:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBarPlotAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBarPlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getBarPlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1373:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1374:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1374:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1375:5: lv_xAxis_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarPlotAccess().getXAxisEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
            lv_xAxis_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarPlotRule());
            					}
            					set(
            						current,
            						"xAxis",
            						lv_xAxis_5_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getBarPlotAccess().getYAKeyword_6());
            		
            // InternalBiLang.g:1396:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1397:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1397:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1398:5: lv_yAxis_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarPlotAccess().getYAxisEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_39);
            lv_yAxis_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBarPlotRule());
            					}
            					set(
            						current,
            						"yAxis",
            						lv_yAxis_7_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1415:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBiLang.g:1416:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getBarPlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1420:4: ( (lv_location_9_0= ruleEString ) )
                    // InternalBiLang.g:1421:5: (lv_location_9_0= ruleEString )
                    {
                    // InternalBiLang.g:1421:5: (lv_location_9_0= ruleEString )
                    // InternalBiLang.g:1422:6: lv_location_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getLocationEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_location_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_9_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1440:3: (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBiLang.g:1441:4: otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getBarPlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1445:4: ( (lv_colors_11_0= ruleEString ) )
                    // InternalBiLang.g:1446:5: (lv_colors_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1446:5: (lv_colors_11_0= ruleEString )
                    // InternalBiLang.g:1447:6: lv_colors_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getColorsEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_colors_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarPlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_11_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1465:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBiLang.g:1466:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1470:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1471:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1471:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1472:6: lv_thickness_13_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getThicknessEFloatParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_13_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarPlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_13_0,
                    							"ucal3ia.bilang.BiLang.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleBarPlot"


    // $ANTLR start "entryRuleLinePlot"
    // InternalBiLang.g:1494:1: entryRuleLinePlot returns [EObject current=null] : iv_ruleLinePlot= ruleLinePlot EOF ;
    public final EObject entryRuleLinePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinePlot = null;


        try {
            // InternalBiLang.g:1494:49: (iv_ruleLinePlot= ruleLinePlot EOF )
            // InternalBiLang.g:1495:2: iv_ruleLinePlot= ruleLinePlot EOF
            {
             newCompositeNode(grammarAccess.getLinePlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinePlot=ruleLinePlot();

            state._fsp--;

             current =iv_ruleLinePlot; 
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
    // $ANTLR end "entryRuleLinePlot"


    // $ANTLR start "ruleLinePlot"
    // InternalBiLang.g:1501:1: ruleLinePlot returns [EObject current=null] : ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
    public final EObject ruleLinePlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_xAxis_5_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_7_0 = null;

        AntlrDatatypeRuleToken lv_location_9_0 = null;

        AntlrDatatypeRuleToken lv_colors_11_0 = null;

        AntlrDatatypeRuleToken lv_thickness_13_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1507:2: ( ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1508:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1508:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1509:3: () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1509:3: ()
            // InternalBiLang.g:1510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinePlotAccess().getLinePlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinePlotAccess().getLineKeyword_1());
            		
            // InternalBiLang.g:1520:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1521:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1521:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1522:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLinePlotAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinePlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinePlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1546:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1547:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1547:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1548:5: lv_xAxis_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinePlotAccess().getXAxisEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
            lv_xAxis_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinePlotRule());
            					}
            					set(
            						current,
            						"xAxis",
            						lv_xAxis_5_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getLinePlotAccess().getYAKeyword_6());
            		
            // InternalBiLang.g:1569:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1570:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1570:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1571:5: lv_yAxis_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinePlotAccess().getYAxisEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_39);
            lv_yAxis_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinePlotRule());
            					}
            					set(
            						current,
            						"yAxis",
            						lv_yAxis_7_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1588:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:1589:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinePlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1593:4: ( (lv_location_9_0= ruleEString ) )
                    // InternalBiLang.g:1594:5: (lv_location_9_0= ruleEString )
                    {
                    // InternalBiLang.g:1594:5: (lv_location_9_0= ruleEString )
                    // InternalBiLang.g:1595:6: lv_location_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getLocationEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_location_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinePlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_9_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1613:3: (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:1614:4: otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getLinePlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1618:4: ( (lv_colors_11_0= ruleEString ) )
                    // InternalBiLang.g:1619:5: (lv_colors_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1619:5: (lv_colors_11_0= ruleEString )
                    // InternalBiLang.g:1620:6: lv_colors_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getColorsEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_colors_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinePlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_11_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1638:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:1639:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1643:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1644:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1644:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1645:6: lv_thickness_13_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getThicknessEFloatParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_13_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinePlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_13_0,
                    							"ucal3ia.bilang.BiLang.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleLinePlot"


    // $ANTLR start "entryRuleDonutPlot"
    // InternalBiLang.g:1667:1: entryRuleDonutPlot returns [EObject current=null] : iv_ruleDonutPlot= ruleDonutPlot EOF ;
    public final EObject entryRuleDonutPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDonutPlot = null;


        try {
            // InternalBiLang.g:1667:50: (iv_ruleDonutPlot= ruleDonutPlot EOF )
            // InternalBiLang.g:1668:2: iv_ruleDonutPlot= ruleDonutPlot EOF
            {
             newCompositeNode(grammarAccess.getDonutPlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDonutPlot=ruleDonutPlot();

            state._fsp--;

             current =iv_ruleDonutPlot; 
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
    // $ANTLR end "entryRuleDonutPlot"


    // $ANTLR start "ruleDonutPlot"
    // InternalBiLang.g:1674:1: ruleDonutPlot returns [EObject current=null] : (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
    public final EObject ruleDonutPlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_xAxis_4_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_6_0 = null;

        AntlrDatatypeRuleToken lv_location_8_0 = null;

        AntlrDatatypeRuleToken lv_colors_10_0 = null;

        AntlrDatatypeRuleToken lv_thickness_12_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1680:2: ( (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1681:2: (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1681:2: (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1682:3: otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDonutPlotAccess().getDonutKeyword_0());
            		
            // InternalBiLang.g:1686:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:1687:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:1687:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:1688:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDonutPlotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDonutPlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getDonutPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDonutPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:1712:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:1713:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:1713:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:1714:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDonutPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
            lv_xAxis_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDonutPlotRule());
            					}
            					set(
            						current,
            						"xAxis",
            						lv_xAxis_4_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDonutPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:1735:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:1736:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:1736:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:1737:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDonutPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_39);
            lv_yAxis_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDonutPlotRule());
            					}
            					set(
            						current,
            						"yAxis",
            						lv_yAxis_6_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1754:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBiLang.g:1755:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getDonutPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:1759:4: ( (lv_location_8_0= ruleEString ) )
                    // InternalBiLang.g:1760:5: (lv_location_8_0= ruleEString )
                    {
                    // InternalBiLang.g:1760:5: (lv_location_8_0= ruleEString )
                    // InternalBiLang.g:1761:6: lv_location_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDonutPlotAccess().getLocationEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_location_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1779:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBiLang.g:1780:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getDonutPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:1784:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:1785:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:1785:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:1786:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDonutPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_colors_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_10_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1804:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBiLang.g:1805:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getDonutPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:1809:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:1810:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1810:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:1811:6: lv_thickness_12_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getDonutPlotAccess().getThicknessEFloatParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_12_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_12_0,
                    							"ucal3ia.bilang.BiLang.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleDonutPlot"


    // $ANTLR start "entryRulePiePlot"
    // InternalBiLang.g:1833:1: entryRulePiePlot returns [EObject current=null] : iv_rulePiePlot= rulePiePlot EOF ;
    public final EObject entryRulePiePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiePlot = null;


        try {
            // InternalBiLang.g:1833:48: (iv_rulePiePlot= rulePiePlot EOF )
            // InternalBiLang.g:1834:2: iv_rulePiePlot= rulePiePlot EOF
            {
             newCompositeNode(grammarAccess.getPiePlotRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePiePlot=rulePiePlot();

            state._fsp--;

             current =iv_rulePiePlot; 
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
    // $ANTLR end "entryRulePiePlot"


    // $ANTLR start "rulePiePlot"
    // InternalBiLang.g:1840:1: rulePiePlot returns [EObject current=null] : (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
    public final EObject rulePiePlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_xAxis_4_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_6_0 = null;

        AntlrDatatypeRuleToken lv_location_8_0 = null;

        AntlrDatatypeRuleToken lv_colors_10_0 = null;

        AntlrDatatypeRuleToken lv_thickness_12_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1846:2: ( (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1847:2: (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1847:2: (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1848:3: otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPiePlotAccess().getPieKeyword_0());
            		
            // InternalBiLang.g:1852:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:1853:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:1853:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:1854:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPiePlotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPiePlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getPiePlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPiePlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:1878:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:1879:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:1879:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:1880:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPiePlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
            lv_xAxis_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPiePlotRule());
            					}
            					set(
            						current,
            						"xAxis",
            						lv_xAxis_4_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPiePlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:1901:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:1902:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:1902:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:1903:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPiePlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_39);
            lv_yAxis_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPiePlotRule());
            					}
            					set(
            						current,
            						"yAxis",
            						lv_yAxis_6_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1920:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBiLang.g:1921:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getPiePlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:1925:4: ( (lv_location_8_0= ruleEString ) )
                    // InternalBiLang.g:1926:5: (lv_location_8_0= ruleEString )
                    {
                    // InternalBiLang.g:1926:5: (lv_location_8_0= ruleEString )
                    // InternalBiLang.g:1927:6: lv_location_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPiePlotAccess().getLocationEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_location_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1945:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBiLang.g:1946:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPiePlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:1950:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:1951:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:1951:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:1952:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPiePlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_colors_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_10_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1970:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:1971:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getPiePlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:1975:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:1976:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1976:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:1977:6: lv_thickness_12_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getPiePlotAccess().getThicknessEFloatParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_12_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_12_0,
                    							"ucal3ia.bilang.BiLang.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePiePlot"


    // $ANTLR start "entryRulePolarPlot"
    // InternalBiLang.g:1999:1: entryRulePolarPlot returns [EObject current=null] : iv_rulePolarPlot= rulePolarPlot EOF ;
    public final EObject entryRulePolarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolarPlot = null;


        try {
            // InternalBiLang.g:1999:50: (iv_rulePolarPlot= rulePolarPlot EOF )
            // InternalBiLang.g:2000:2: iv_rulePolarPlot= rulePolarPlot EOF
            {
             newCompositeNode(grammarAccess.getPolarPlotRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolarPlot=rulePolarPlot();

            state._fsp--;

             current =iv_rulePolarPlot; 
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
    // $ANTLR end "entryRulePolarPlot"


    // $ANTLR start "rulePolarPlot"
    // InternalBiLang.g:2006:1: rulePolarPlot returns [EObject current=null] : (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
    public final EObject rulePolarPlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_xAxis_4_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_6_0 = null;

        AntlrDatatypeRuleToken lv_location_8_0 = null;

        AntlrDatatypeRuleToken lv_colors_10_0 = null;

        AntlrDatatypeRuleToken lv_thickness_12_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:2012:2: ( (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2013:2: (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2013:2: (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2014:3: otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolarPlotAccess().getPolarKeyword_0());
            		
            // InternalBiLang.g:2018:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2019:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2019:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2020:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPolarPlotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolarPlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getPolarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPolarPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2044:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2045:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2045:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2046:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolarPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
            lv_xAxis_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolarPlotRule());
            					}
            					set(
            						current,
            						"xAxis",
            						lv_xAxis_4_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPolarPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2067:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2068:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2068:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2069:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolarPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_39);
            lv_yAxis_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPolarPlotRule());
            					}
            					set(
            						current,
            						"yAxis",
            						lv_yAxis_6_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:2086:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:2087:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getPolarPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2091:4: ( (lv_location_8_0= ruleEString ) )
                    // InternalBiLang.g:2092:5: (lv_location_8_0= ruleEString )
                    {
                    // InternalBiLang.g:2092:5: (lv_location_8_0= ruleEString )
                    // InternalBiLang.g:2093:6: lv_location_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPolarPlotAccess().getLocationEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_location_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPolarPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2111:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:2112:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPolarPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2116:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2117:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2117:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2118:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPolarPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_colors_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPolarPlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_10_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2136:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:2137:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getPolarPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2141:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2142:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2142:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2143:6: lv_thickness_12_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getPolarPlotAccess().getThicknessEFloatParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_12_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPolarPlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_12_0,
                    							"ucal3ia.bilang.BiLang.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePolarPlot"


    // $ANTLR start "entryRuleScatterPlot"
    // InternalBiLang.g:2165:1: entryRuleScatterPlot returns [EObject current=null] : iv_ruleScatterPlot= ruleScatterPlot EOF ;
    public final EObject entryRuleScatterPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScatterPlot = null;


        try {
            // InternalBiLang.g:2165:52: (iv_ruleScatterPlot= ruleScatterPlot EOF )
            // InternalBiLang.g:2166:2: iv_ruleScatterPlot= ruleScatterPlot EOF
            {
             newCompositeNode(grammarAccess.getScatterPlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScatterPlot=ruleScatterPlot();

            state._fsp--;

             current =iv_ruleScatterPlot; 
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
    // $ANTLR end "entryRuleScatterPlot"


    // $ANTLR start "ruleScatterPlot"
    // InternalBiLang.g:2172:1: ruleScatterPlot returns [EObject current=null] : (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
    public final EObject ruleScatterPlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_xAxis_4_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_6_0 = null;

        AntlrDatatypeRuleToken lv_location_8_0 = null;

        AntlrDatatypeRuleToken lv_colors_10_0 = null;

        AntlrDatatypeRuleToken lv_thickness_12_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:2178:2: ( (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2179:2: (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2179:2: (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2180:3: otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScatterPlotAccess().getScatterKeyword_0());
            		
            // InternalBiLang.g:2184:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2185:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2185:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2186:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScatterPlotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScatterPlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getScatterPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getScatterPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2210:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2211:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2211:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2212:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScatterPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
            lv_xAxis_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScatterPlotRule());
            					}
            					set(
            						current,
            						"xAxis",
            						lv_xAxis_4_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getScatterPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2233:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2234:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2234:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2235:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScatterPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_39);
            lv_yAxis_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScatterPlotRule());
            					}
            					set(
            						current,
            						"yAxis",
            						lv_yAxis_6_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:2252:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:2253:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getScatterPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2257:4: ( (lv_location_8_0= ruleEString ) )
                    // InternalBiLang.g:2258:5: (lv_location_8_0= ruleEString )
                    {
                    // InternalBiLang.g:2258:5: (lv_location_8_0= ruleEString )
                    // InternalBiLang.g:2259:6: lv_location_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScatterPlotAccess().getLocationEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_location_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2277:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:2278:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getScatterPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2282:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2283:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2283:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2284:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScatterPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_colors_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterPlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_10_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2302:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:2303:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getScatterPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2307:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2308:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2308:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2309:6: lv_thickness_12_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getScatterPlotAccess().getThicknessEFloatParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_12_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterPlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_12_0,
                    							"ucal3ia.bilang.BiLang.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleScatterPlot"


    // $ANTLR start "entryRuleRadarPlot"
    // InternalBiLang.g:2331:1: entryRuleRadarPlot returns [EObject current=null] : iv_ruleRadarPlot= ruleRadarPlot EOF ;
    public final EObject entryRuleRadarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadarPlot = null;


        try {
            // InternalBiLang.g:2331:50: (iv_ruleRadarPlot= ruleRadarPlot EOF )
            // InternalBiLang.g:2332:2: iv_ruleRadarPlot= ruleRadarPlot EOF
            {
             newCompositeNode(grammarAccess.getRadarPlotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadarPlot=ruleRadarPlot();

            state._fsp--;

             current =iv_ruleRadarPlot; 
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
    // $ANTLR end "entryRuleRadarPlot"


    // $ANTLR start "ruleRadarPlot"
    // InternalBiLang.g:2338:1: ruleRadarPlot returns [EObject current=null] : (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
    public final EObject ruleRadarPlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_xAxis_4_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_6_0 = null;

        AntlrDatatypeRuleToken lv_location_8_0 = null;

        AntlrDatatypeRuleToken lv_colors_10_0 = null;

        AntlrDatatypeRuleToken lv_thickness_12_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:2344:2: ( (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2345:2: (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2345:2: (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2346:3: otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRadarPlotAccess().getRadarKeyword_0());
            		
            // InternalBiLang.g:2350:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2351:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2351:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2352:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRadarPlotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadarPlotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getRadarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRadarPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2376:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2377:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2377:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2378:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
            lv_xAxis_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarPlotRule());
            					}
            					set(
            						current,
            						"xAxis",
            						lv_xAxis_4_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRadarPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2399:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2400:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2400:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2401:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_39);
            lv_yAxis_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadarPlotRule());
            					}
            					set(
            						current,
            						"yAxis",
            						lv_yAxis_6_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:2418:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:2419:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getRadarPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2423:4: ( (lv_location_8_0= ruleEString ) )
                    // InternalBiLang.g:2424:5: (lv_location_8_0= ruleEString )
                    {
                    // InternalBiLang.g:2424:5: (lv_location_8_0= ruleEString )
                    // InternalBiLang.g:2425:6: lv_location_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadarPlotAccess().getLocationEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_location_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadarPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2443:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:2444:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getRadarPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2448:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2449:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2449:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2450:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadarPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_colors_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadarPlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_10_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2468:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:2469:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_23); 

                    				newLeafNode(otherlv_11, grammarAccess.getRadarPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2473:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2474:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2474:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2475:6: lv_thickness_12_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getRadarPlotAccess().getThicknessEFloatParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_12_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadarPlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_12_0,
                    							"ucal3ia.bilang.BiLang.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleRadarPlot"


    // $ANTLR start "ruleMathOperator"
    // InternalBiLang.g:2497:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBiLang.g:2503:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalBiLang.g:2504:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalBiLang.g:2504:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt43=1;
                }
                break;
            case 31:
                {
                alt43=2;
                }
                break;
            case 48:
                {
                alt43=3;
                }
                break;
            case 49:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:2505:3: (enumLiteral_0= '+' )
                    {
                    // InternalBiLang.g:2505:3: (enumLiteral_0= '+' )
                    // InternalBiLang.g:2506:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2513:3: (enumLiteral_1= '-' )
                    {
                    // InternalBiLang.g:2513:3: (enumLiteral_1= '-' )
                    // InternalBiLang.g:2514:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2521:3: (enumLiteral_2= '*' )
                    {
                    // InternalBiLang.g:2521:3: (enumLiteral_2= '*' )
                    // InternalBiLang.g:2522:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:2529:3: (enumLiteral_3= '/' )
                    {
                    // InternalBiLang.g:2529:3: (enumLiteral_3= '/' )
                    // InternalBiLang.g:2530:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMathOperatorAccess().getDIVIDINGEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "ruleStatisticalOperator"
    // InternalBiLang.g:2540:1: ruleStatisticalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) ) ;
    public final Enumerator ruleStatisticalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBiLang.g:2546:2: ( ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) ) )
            // InternalBiLang.g:2547:2: ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) )
            {
            // InternalBiLang.g:2547:2: ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt44=1;
                }
                break;
            case 51:
                {
                alt44=2;
                }
                break;
            case 52:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:2548:3: (enumLiteral_0= 'mean' )
                    {
                    // InternalBiLang.g:2548:3: (enumLiteral_0= 'mean' )
                    // InternalBiLang.g:2549:4: enumLiteral_0= 'mean'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2556:3: (enumLiteral_1= 'median' )
                    {
                    // InternalBiLang.g:2556:3: (enumLiteral_1= 'median' )
                    // InternalBiLang.g:2557:4: enumLiteral_1= 'median'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2564:3: (enumLiteral_2= 'std' )
                    {
                    // InternalBiLang.g:2564:3: (enumLiteral_2= 'std' )
                    // InternalBiLang.g:2565:4: enumLiteral_2= 'std'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStatisticalOperatorAccess().getSTDEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleStatisticalOperator"


    // $ANTLR start "ruleQualitativeOperator"
    // InternalBiLang.g:2575:1: ruleQualitativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) ) ;
    public final Enumerator ruleQualitativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:2581:2: ( ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) ) )
            // InternalBiLang.g:2582:2: ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) )
            {
            // InternalBiLang.g:2582:2: ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            else if ( (LA45_0==54) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:2583:3: (enumLiteral_0= '= ' )
                    {
                    // InternalBiLang.g:2583:3: (enumLiteral_0= '= ' )
                    // InternalBiLang.g:2584:4: enumLiteral_0= '= '
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2591:3: (enumLiteral_1= '!= ' )
                    {
                    // InternalBiLang.g:2591:3: (enumLiteral_1= '!= ' )
                    // InternalBiLang.g:2592:4: enumLiteral_1= '!= '
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getQualitativeOperatorAccess().getNOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQualitativeOperatorAccess().getNOTEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleQualitativeOperator"


    // $ANTLR start "ruleQuantitativeOperator"
    // InternalBiLang.g:2602:1: ruleQuantitativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleQuantitativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBiLang.g:2608:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // InternalBiLang.g:2609:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // InternalBiLang.g:2609:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt46=1;
                }
                break;
            case 56:
                {
                alt46=2;
                }
                break;
            case 57:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:2610:3: (enumLiteral_0= '=' )
                    {
                    // InternalBiLang.g:2610:3: (enumLiteral_0= '=' )
                    // InternalBiLang.g:2611:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2618:3: (enumLiteral_1= '<' )
                    {
                    // InternalBiLang.g:2618:3: (enumLiteral_1= '<' )
                    // InternalBiLang.g:2619:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2626:3: (enumLiteral_2= '>' )
                    {
                    // InternalBiLang.g:2626:3: (enumLiteral_2= '>' )
                    // InternalBiLang.g:2627:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleQuantitativeOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x001C000018000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00007E0400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00007E0401000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003800080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200100002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000002L});

}