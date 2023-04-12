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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "':'", "'load'", "'[dashboard:'", "']'", "'filter'", "'=>'", "'processing step='", "'filtering step='", "','", "'e'", "'df'", "'plots'", "'{'", "'}'", "'.csv'", "'.xlsx'", "'quanti axis->'", "'value'", "'quali axis->'", "'label'", "'l'", "'r'", "'('", "')'", "'-'", "'.'", "'E'", "'bar'", "'->'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'PLUS'", "'MINUS'", "'MULTIPLY'", "'DIVIDING'", "'MEAN'", "'MEDIAN'", "'STD'"
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
    // InternalBiLang.g:72:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) ( (lv_dashboard_10_0= ruleDashBoard ) )* otherlv_11= ']' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_fileextractor_4_0 = null;

        EObject lv_datafiltering_5_0 = null;

        EObject lv_fileextractor_6_0 = null;

        EObject lv_datafiltering_7_0 = null;

        EObject lv_dashboard_9_0 = null;

        EObject lv_dashboard_10_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:78:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) ( (lv_dashboard_10_0= ruleDashBoard ) )* otherlv_11= ']' ) )
            // InternalBiLang.g:79:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) ( (lv_dashboard_10_0= ruleDashBoard ) )* otherlv_11= ']' )
            {
            // InternalBiLang.g:79:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) ( (lv_dashboard_10_0= ruleDashBoard ) )* otherlv_11= ']' )
            // InternalBiLang.g:80:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( (lv_datafiltering_5_0= ruleDataFiltering ) )? ( ( (lv_fileextractor_6_0= ruleFileExtractor ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )? )* otherlv_8= '[dashboard:' ( (lv_dashboard_9_0= ruleDashBoard ) ) ( (lv_dashboard_10_0= ruleDashBoard ) )* otherlv_11= ']'
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
            					add(
            						current,
            						"dashboard",
            						lv_dashboard_9_0,
            						"ucal3ia.bilang.BiLang.DashBoard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:211:3: ( (lv_dashboard_10_0= ruleDashBoard ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBiLang.g:212:4: (lv_dashboard_10_0= ruleDashBoard )
            	    {
            	    // InternalBiLang.g:212:4: (lv_dashboard_10_0= ruleDashBoard )
            	    // InternalBiLang.g:213:5: lv_dashboard_10_0= ruleDashBoard
            	    {

            	    					newCompositeNode(grammarAccess.getTaskAccess().getDashboardDashBoardParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_dashboard_10_0=ruleDashBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dashboard",
            	    						lv_dashboard_10_0,
            	    						"ucal3ia.bilang.BiLang.DashBoard");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_10());
            		

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
    // InternalBiLang.g:238:1: entryRuleFileExtractor returns [EObject current=null] : iv_ruleFileExtractor= ruleFileExtractor EOF ;
    public final EObject entryRuleFileExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileExtractor = null;


        try {
            // InternalBiLang.g:238:54: (iv_ruleFileExtractor= ruleFileExtractor EOF )
            // InternalBiLang.g:239:2: iv_ruleFileExtractor= ruleFileExtractor EOF
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
    // InternalBiLang.g:245:1: ruleFileExtractor returns [EObject current=null] : (this_CsvExtractor_0= ruleCsvExtractor | this_ExcelExtractor_1= ruleExcelExtractor ) ;
    public final EObject ruleFileExtractor() throws RecognitionException {
        EObject current = null;

        EObject this_CsvExtractor_0 = null;

        EObject this_ExcelExtractor_1 = null;



        	enterRule();

        try {
            // InternalBiLang.g:251:2: ( (this_CsvExtractor_0= ruleCsvExtractor | this_ExcelExtractor_1= ruleExcelExtractor ) )
            // InternalBiLang.g:252:2: (this_CsvExtractor_0= ruleCsvExtractor | this_ExcelExtractor_1= ruleExcelExtractor )
            {
            // InternalBiLang.g:252:2: (this_CsvExtractor_0= ruleCsvExtractor | this_ExcelExtractor_1= ruleExcelExtractor )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==26) ) {
                    alt5=1;
                }
                else if ( (LA5_1==27) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==26) ) {
                    alt5=1;
                }
                else if ( (LA5_2==27) ) {
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
                    // InternalBiLang.g:253:3: this_CsvExtractor_0= ruleCsvExtractor
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
                    // InternalBiLang.g:262:3: this_ExcelExtractor_1= ruleExcelExtractor
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
    // InternalBiLang.g:274:1: entryRuleFilteringStep returns [EObject current=null] : iv_ruleFilteringStep= ruleFilteringStep EOF ;
    public final EObject entryRuleFilteringStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteringStep = null;


        try {
            // InternalBiLang.g:274:54: (iv_ruleFilteringStep= ruleFilteringStep EOF )
            // InternalBiLang.g:275:2: iv_ruleFilteringStep= ruleFilteringStep EOF
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
    // InternalBiLang.g:281:1: ruleFilteringStep returns [EObject current=null] : (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering ) ;
    public final EObject ruleFilteringStep() throws RecognitionException {
        EObject current = null;

        EObject this_QuantitativeFiltering_0 = null;

        EObject this_QualitativeFiltering_1 = null;



        	enterRule();

        try {
            // InternalBiLang.g:287:2: ( (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering ) )
            // InternalBiLang.g:288:2: (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering )
            {
            // InternalBiLang.g:288:2: (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBiLang.g:289:3: this_QuantitativeFiltering_0= ruleQuantitativeFiltering
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
                    // InternalBiLang.g:298:3: this_QualitativeFiltering_1= ruleQualitativeFiltering
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
    // InternalBiLang.g:310:1: entryRulePreprocessingStep returns [EObject current=null] : iv_rulePreprocessingStep= rulePreprocessingStep EOF ;
    public final EObject entryRulePreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreprocessingStep = null;


        try {
            // InternalBiLang.g:310:58: (iv_rulePreprocessingStep= rulePreprocessingStep EOF )
            // InternalBiLang.g:311:2: iv_rulePreprocessingStep= rulePreprocessingStep EOF
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
    // InternalBiLang.g:317:1: rulePreprocessingStep returns [EObject current=null] : (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation ) ;
    public final EObject rulePreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject this_MathOperation_0 = null;

        EObject this_ColReference_1 = null;

        EObject this_StatisticalOperation_2 = null;



        	enterRule();

        try {
            // InternalBiLang.g:323:2: ( (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation ) )
            // InternalBiLang.g:324:2: (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation )
            {
            // InternalBiLang.g:324:2: (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case 51:
            case 52:
            case 53:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalBiLang.g:325:3: this_MathOperation_0= ruleMathOperation
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
                    // InternalBiLang.g:334:3: this_ColReference_1= ruleColReference
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
                    // InternalBiLang.g:343:3: this_StatisticalOperation_2= ruleStatisticalOperation
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
    // InternalBiLang.g:355:1: entryRulePlot returns [EObject current=null] : iv_rulePlot= rulePlot EOF ;
    public final EObject entryRulePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlot = null;


        try {
            // InternalBiLang.g:355:45: (iv_rulePlot= rulePlot EOF )
            // InternalBiLang.g:356:2: iv_rulePlot= rulePlot EOF
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
    // InternalBiLang.g:362:1: rulePlot returns [EObject current=null] : (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot ) ;
    public final EObject rulePlot() throws RecognitionException {
        EObject current = null;

        EObject this_BarPlot_0 = null;

        EObject this_LinePlot_1 = null;



        	enterRule();

        try {
            // InternalBiLang.g:368:2: ( (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot ) )
            // InternalBiLang.g:369:2: (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot )
            {
            // InternalBiLang.g:369:2: (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            else if ( (LA8_0==46) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBiLang.g:370:3: this_BarPlot_0= ruleBarPlot
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
                    // InternalBiLang.g:379:3: this_LinePlot_1= ruleLinePlot
                    {

                    			newCompositeNode(grammarAccess.getPlotAccess().getLinePlotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LinePlot_1=ruleLinePlot();

                    state._fsp--;


                    			current = this_LinePlot_1;
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
    // InternalBiLang.g:391:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBiLang.g:391:47: (iv_ruleEString= ruleEString EOF )
            // InternalBiLang.g:392:2: iv_ruleEString= ruleEString EOF
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
    // InternalBiLang.g:398:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:404:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBiLang.g:405:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBiLang.g:405:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBiLang.g:406:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBiLang.g:414:3: this_ID_1= RULE_ID
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
    // InternalBiLang.g:425:1: entryRuleDataFiltering returns [EObject current=null] : iv_ruleDataFiltering= ruleDataFiltering EOF ;
    public final EObject entryRuleDataFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFiltering = null;


        try {
            // InternalBiLang.g:425:54: (iv_ruleDataFiltering= ruleDataFiltering EOF )
            // InternalBiLang.g:426:2: iv_ruleDataFiltering= ruleDataFiltering EOF
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
    // InternalBiLang.g:432:1: ruleDataFiltering returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=>' ( ( ruleEString ) ) (otherlv_4= 'processing step=' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) ( (lv_processingstep_6_0= rulePreprocessingStep ) )* )? otherlv_7= 'filtering step=' ( (lv_filteringstep_8_0= ruleFilteringStep ) ) (otherlv_9= ',' ( (lv_filteringstep_10_0= ruleFilteringStep ) ) )* ) ;
    public final EObject ruleDataFiltering() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_processingstep_5_0 = null;

        EObject lv_processingstep_6_0 = null;

        EObject lv_filteringstep_8_0 = null;

        EObject lv_filteringstep_10_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:438:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=>' ( ( ruleEString ) ) (otherlv_4= 'processing step=' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) ( (lv_processingstep_6_0= rulePreprocessingStep ) )* )? otherlv_7= 'filtering step=' ( (lv_filteringstep_8_0= ruleFilteringStep ) ) (otherlv_9= ',' ( (lv_filteringstep_10_0= ruleFilteringStep ) ) )* ) )
            // InternalBiLang.g:439:2: (otherlv_0= 'filter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=>' ( ( ruleEString ) ) (otherlv_4= 'processing step=' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) ( (lv_processingstep_6_0= rulePreprocessingStep ) )* )? otherlv_7= 'filtering step=' ( (lv_filteringstep_8_0= ruleFilteringStep ) ) (otherlv_9= ',' ( (lv_filteringstep_10_0= ruleFilteringStep ) ) )* )
            {
            // InternalBiLang.g:439:2: (otherlv_0= 'filter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=>' ( ( ruleEString ) ) (otherlv_4= 'processing step=' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) ( (lv_processingstep_6_0= rulePreprocessingStep ) )* )? otherlv_7= 'filtering step=' ( (lv_filteringstep_8_0= ruleFilteringStep ) ) (otherlv_9= ',' ( (lv_filteringstep_10_0= ruleFilteringStep ) ) )* )
            // InternalBiLang.g:440:3: otherlv_0= 'filter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=>' ( ( ruleEString ) ) (otherlv_4= 'processing step=' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) ( (lv_processingstep_6_0= rulePreprocessingStep ) )* )? otherlv_7= 'filtering step=' ( (lv_filteringstep_8_0= ruleFilteringStep ) ) (otherlv_9= ',' ( (lv_filteringstep_10_0= ruleFilteringStep ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFilteringAccess().getFilterKeyword_0());
            		
            // InternalBiLang.g:444:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBiLang.g:445:4: (lv_name_1_0= ruleEString )
            {
            // InternalBiLang.g:445:4: (lv_name_1_0= ruleEString )
            // InternalBiLang.g:446:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataFilteringAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataFilteringRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDataFilteringAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalBiLang.g:467:3: ( ( ruleEString ) )
            // InternalBiLang.g:468:4: ( ruleEString )
            {
            // InternalBiLang.g:468:4: ( ruleEString )
            // InternalBiLang.g:469:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFilteringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_3_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:483:3: (otherlv_4= 'processing step=' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) ( (lv_processingstep_6_0= rulePreprocessingStep ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBiLang.g:484:4: otherlv_4= 'processing step=' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) ( (lv_processingstep_6_0= rulePreprocessingStep ) )*
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataFilteringAccess().getProcessingStepKeyword_4_0());
                    			
                    // InternalBiLang.g:488:4: ( (lv_processingstep_5_0= rulePreprocessingStep ) )
                    // InternalBiLang.g:489:5: (lv_processingstep_5_0= rulePreprocessingStep )
                    {
                    // InternalBiLang.g:489:5: (lv_processingstep_5_0= rulePreprocessingStep )
                    // InternalBiLang.g:490:6: lv_processingstep_5_0= rulePreprocessingStep
                    {

                    						newCompositeNode(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalBiLang.g:507:4: ( (lv_processingstep_6_0= rulePreprocessingStep ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==32||(LA10_0>=51 && LA10_0<=53)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBiLang.g:508:5: (lv_processingstep_6_0= rulePreprocessingStep )
                    	    {
                    	    // InternalBiLang.g:508:5: (lv_processingstep_6_0= rulePreprocessingStep )
                    	    // InternalBiLang.g:509:6: lv_processingstep_6_0= rulePreprocessingStep
                    	    {

                    	    						newCompositeNode(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_processingstep_6_0=rulePreprocessingStep();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"processingstep",
                    	    							lv_processingstep_6_0,
                    	    							"ucal3ia.bilang.BiLang.PreprocessingStep");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getDataFilteringAccess().getFilteringStepKeyword_5());
            		
            // InternalBiLang.g:531:3: ( (lv_filteringstep_8_0= ruleFilteringStep ) )
            // InternalBiLang.g:532:4: (lv_filteringstep_8_0= ruleFilteringStep )
            {
            // InternalBiLang.g:532:4: (lv_filteringstep_8_0= ruleFilteringStep )
            // InternalBiLang.g:533:5: lv_filteringstep_8_0= ruleFilteringStep
            {

            					newCompositeNode(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_filteringstep_8_0=ruleFilteringStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataFilteringRule());
            					}
            					add(
            						current,
            						"filteringstep",
            						lv_filteringstep_8_0,
            						"ucal3ia.bilang.BiLang.FilteringStep");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:550:3: (otherlv_9= ',' ( (lv_filteringstep_10_0= ruleFilteringStep ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBiLang.g:551:4: otherlv_9= ',' ( (lv_filteringstep_10_0= ruleFilteringStep ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_14); 

            	    				newLeafNode(otherlv_9, grammarAccess.getDataFilteringAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBiLang.g:555:4: ( (lv_filteringstep_10_0= ruleFilteringStep ) )
            	    // InternalBiLang.g:556:5: (lv_filteringstep_10_0= ruleFilteringStep )
            	    {
            	    // InternalBiLang.g:556:5: (lv_filteringstep_10_0= ruleFilteringStep )
            	    // InternalBiLang.g:557:6: lv_filteringstep_10_0= ruleFilteringStep
            	    {

            	    						newCompositeNode(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_filteringstep_10_0=ruleFilteringStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataFilteringRule());
            	    						}
            	    						add(
            	    							current,
            	    							"filteringstep",
            	    							lv_filteringstep_10_0,
            	    							"ucal3ia.bilang.BiLang.FilteringStep");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // InternalBiLang.g:579:1: entryRuleDashBoard returns [EObject current=null] : iv_ruleDashBoard= ruleDashBoard EOF ;
    public final EObject entryRuleDashBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashBoard = null;


        try {
            // InternalBiLang.g:579:50: (iv_ruleDashBoard= ruleDashBoard EOF )
            // InternalBiLang.g:580:2: iv_ruleDashBoard= ruleDashBoard EOF
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
    // InternalBiLang.g:586:1: ruleDashBoard returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}' ) ;
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
            // InternalBiLang.g:592:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}' ) )
            // InternalBiLang.g:593:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}' )
            {
            // InternalBiLang.g:593:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}' )
            // InternalBiLang.g:594:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) ) otherlv_6= 'plots' otherlv_7= '{' ( (lv_plot_8_0= rulePlot ) ) ( (lv_plot_9_0= rulePlot ) )* otherlv_10= '}'
            {
            // InternalBiLang.g:594:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBiLang.g:595:4: (lv_name_0_0= ruleEString )
            {
            // InternalBiLang.g:595:4: (lv_name_0_0= ruleEString )
            // InternalBiLang.g:596:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDashBoardAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalBiLang.g:617:3: ( (otherlv_2= 'e' ( ( ruleEString ) ) ) | (otherlv_4= 'df' ( ( ruleEString ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==22) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBiLang.g:618:4: (otherlv_2= 'e' ( ( ruleEString ) ) )
                    {
                    // InternalBiLang.g:618:4: (otherlv_2= 'e' ( ( ruleEString ) ) )
                    // InternalBiLang.g:619:5: otherlv_2= 'e' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getDashBoardAccess().getEKeyword_2_0_0());
                    				
                    // InternalBiLang.g:623:5: ( ( ruleEString ) )
                    // InternalBiLang.g:624:6: ( ruleEString )
                    {
                    // InternalBiLang.g:624:6: ( ruleEString )
                    // InternalBiLang.g:625:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDashBoardRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_1_0());
                    						
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:641:4: (otherlv_4= 'df' ( ( ruleEString ) ) )
                    {
                    // InternalBiLang.g:641:4: (otherlv_4= 'df' ( ( ruleEString ) ) )
                    // InternalBiLang.g:642:5: otherlv_4= 'df' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_6); 

                    					newLeafNode(otherlv_4, grammarAccess.getDashBoardAccess().getDfKeyword_2_1_0());
                    				
                    // InternalBiLang.g:646:5: ( ( ruleEString ) )
                    // InternalBiLang.g:647:6: ( ruleEString )
                    {
                    // InternalBiLang.g:647:6: ( ruleEString )
                    // InternalBiLang.g:648:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDashBoardRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getDashBoardAccess().getDatafilteringDataFilteringCrossReference_2_1_1_0());
                    						
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getDashBoardAccess().getPlotsKeyword_3());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBiLang.g:672:3: ( (lv_plot_8_0= rulePlot ) )
            // InternalBiLang.g:673:4: (lv_plot_8_0= rulePlot )
            {
            // InternalBiLang.g:673:4: (lv_plot_8_0= rulePlot )
            // InternalBiLang.g:674:5: lv_plot_8_0= rulePlot
            {

            					newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalBiLang.g:691:3: ( (lv_plot_9_0= rulePlot ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39||LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBiLang.g:692:4: (lv_plot_9_0= rulePlot )
            	    {
            	    // InternalBiLang.g:692:4: (lv_plot_9_0= rulePlot )
            	    // InternalBiLang.g:693:5: lv_plot_9_0= rulePlot
            	    {

            	    					newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_20);
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

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

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
    // InternalBiLang.g:718:1: entryRuleCsvExtractor returns [EObject current=null] : iv_ruleCsvExtractor= ruleCsvExtractor EOF ;
    public final EObject entryRuleCsvExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvExtractor = null;


        try {
            // InternalBiLang.g:718:53: (iv_ruleCsvExtractor= ruleCsvExtractor EOF )
            // InternalBiLang.g:719:2: iv_ruleCsvExtractor= ruleCsvExtractor EOF
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
    // InternalBiLang.g:725:1: ruleCsvExtractor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) ) ;
    public final EObject ruleCsvExtractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:731:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) ) )
            // InternalBiLang.g:732:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) )
            {
            // InternalBiLang.g:732:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) )
            // InternalBiLang.g:733:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) )
            {
            // InternalBiLang.g:733:3: ()
            // InternalBiLang.g:734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCsvExtractorAccess().getCsvExtractorAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:740:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBiLang.g:741:4: (lv_name_1_0= ruleEString )
            {
            // InternalBiLang.g:741:4: (lv_name_1_0= ruleEString )
            // InternalBiLang.g:742:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsvExtractorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getCsvExtractorAccess().getCsvKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCsvExtractorAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalBiLang.g:767:3: ( (lv_path_4_0= ruleEString ) )
            // InternalBiLang.g:768:4: (lv_path_4_0= ruleEString )
            {
            // InternalBiLang.g:768:4: (lv_path_4_0= ruleEString )
            // InternalBiLang.g:769:5: lv_path_4_0= ruleEString
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
    // InternalBiLang.g:790:1: entryRuleExcelExtractor returns [EObject current=null] : iv_ruleExcelExtractor= ruleExcelExtractor EOF ;
    public final EObject entryRuleExcelExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExcelExtractor = null;


        try {
            // InternalBiLang.g:790:55: (iv_ruleExcelExtractor= ruleExcelExtractor EOF )
            // InternalBiLang.g:791:2: iv_ruleExcelExtractor= ruleExcelExtractor EOF
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
    // InternalBiLang.g:797:1: ruleExcelExtractor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) ) ;
    public final EObject ruleExcelExtractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:803:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) ) )
            // InternalBiLang.g:804:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) )
            {
            // InternalBiLang.g:804:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) )
            // InternalBiLang.g:805:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) )
            {
            // InternalBiLang.g:805:3: ()
            // InternalBiLang.g:806:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExcelExtractorAccess().getExcelExtractorAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:812:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBiLang.g:813:4: (lv_name_1_0= ruleEString )
            {
            // InternalBiLang.g:813:4: (lv_name_1_0= ruleEString )
            // InternalBiLang.g:814:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExcelExtractorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getExcelExtractorAccess().getXlsxKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExcelExtractorAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalBiLang.g:839:3: ( (lv_path_4_0= ruleEString ) )
            // InternalBiLang.g:840:4: (lv_path_4_0= ruleEString )
            {
            // InternalBiLang.g:840:4: (lv_path_4_0= ruleEString )
            // InternalBiLang.g:841:5: lv_path_4_0= ruleEString
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
    // InternalBiLang.g:862:1: entryRuleQuantitativeFiltering returns [EObject current=null] : iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF ;
    public final EObject entryRuleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativeFiltering = null;


        try {
            // InternalBiLang.g:862:62: (iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:863:2: iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF
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
    // InternalBiLang.g:869:1: ruleQuantitativeFiltering returns [EObject current=null] : ( () otherlv_1= 'quanti axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'value' ( (lv_values_4_0= ruleEString ) ) ) ;
    public final EObject ruleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_axis_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:875:2: ( ( () otherlv_1= 'quanti axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'value' ( (lv_values_4_0= ruleEString ) ) ) )
            // InternalBiLang.g:876:2: ( () otherlv_1= 'quanti axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'value' ( (lv_values_4_0= ruleEString ) ) )
            {
            // InternalBiLang.g:876:2: ( () otherlv_1= 'quanti axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'value' ( (lv_values_4_0= ruleEString ) ) )
            // InternalBiLang.g:877:3: () otherlv_1= 'quanti axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'value' ( (lv_values_4_0= ruleEString ) )
            {
            // InternalBiLang.g:877:3: ()
            // InternalBiLang.g:878:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getQuantitativeFilteringAccess().getQuantiAxisKeyword_1());
            		
            // InternalBiLang.g:888:3: ( (lv_axis_2_0= ruleEString ) )
            // InternalBiLang.g:889:4: (lv_axis_2_0= ruleEString )
            {
            // InternalBiLang.g:889:4: (lv_axis_2_0= ruleEString )
            // InternalBiLang.g:890:5: lv_axis_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_axis_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantitativeFilteringRule());
            					}
            					set(
            						current,
            						"axis",
            						lv_axis_2_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantitativeFilteringAccess().getValueKeyword_3());
            		
            // InternalBiLang.g:911:3: ( (lv_values_4_0= ruleEString ) )
            // InternalBiLang.g:912:4: (lv_values_4_0= ruleEString )
            {
            // InternalBiLang.g:912:4: (lv_values_4_0= ruleEString )
            // InternalBiLang.g:913:5: lv_values_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getValuesEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_values_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantitativeFilteringRule());
            					}
            					set(
            						current,
            						"values",
            						lv_values_4_0,
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
    // $ANTLR end "ruleQuantitativeFiltering"


    // $ANTLR start "entryRuleQualitativeFiltering"
    // InternalBiLang.g:934:1: entryRuleQualitativeFiltering returns [EObject current=null] : iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF ;
    public final EObject entryRuleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeFiltering = null;


        try {
            // InternalBiLang.g:934:61: (iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF )
            // InternalBiLang.g:935:2: iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF
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
    // InternalBiLang.g:941:1: ruleQualitativeFiltering returns [EObject current=null] : ( () otherlv_1= 'quali axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_labels_4_0= ruleEString ) ) ) ;
    public final EObject ruleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_axis_2_0 = null;

        AntlrDatatypeRuleToken lv_labels_4_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:947:2: ( ( () otherlv_1= 'quali axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_labels_4_0= ruleEString ) ) ) )
            // InternalBiLang.g:948:2: ( () otherlv_1= 'quali axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_labels_4_0= ruleEString ) ) )
            {
            // InternalBiLang.g:948:2: ( () otherlv_1= 'quali axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_labels_4_0= ruleEString ) ) )
            // InternalBiLang.g:949:3: () otherlv_1= 'quali axis->' ( (lv_axis_2_0= ruleEString ) ) otherlv_3= 'label' ( (lv_labels_4_0= ruleEString ) )
            {
            // InternalBiLang.g:949:3: ()
            // InternalBiLang.g:950:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getQualitativeFilteringAccess().getQualiAxisKeyword_1());
            		
            // InternalBiLang.g:960:3: ( (lv_axis_2_0= ruleEString ) )
            // InternalBiLang.g:961:4: (lv_axis_2_0= ruleEString )
            {
            // InternalBiLang.g:961:4: (lv_axis_2_0= ruleEString )
            // InternalBiLang.g:962:5: lv_axis_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_axis_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualitativeFilteringRule());
            					}
            					set(
            						current,
            						"axis",
            						lv_axis_2_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getQualitativeFilteringAccess().getLabelKeyword_3());
            		
            // InternalBiLang.g:983:3: ( (lv_labels_4_0= ruleEString ) )
            // InternalBiLang.g:984:4: (lv_labels_4_0= ruleEString )
            {
            // InternalBiLang.g:984:4: (lv_labels_4_0= ruleEString )
            // InternalBiLang.g:985:5: lv_labels_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualitativeFilteringAccess().getLabelsEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_labels_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualitativeFilteringRule());
            					}
            					set(
            						current,
            						"labels",
            						lv_labels_4_0,
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
    // InternalBiLang.g:1006:1: entryRuleMathOperation returns [EObject current=null] : iv_ruleMathOperation= ruleMathOperation EOF ;
    public final EObject entryRuleMathOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathOperation = null;


        try {
            // InternalBiLang.g:1006:54: (iv_ruleMathOperation= ruleMathOperation EOF )
            // InternalBiLang.g:1007:2: iv_ruleMathOperation= ruleMathOperation EOF
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
    // InternalBiLang.g:1013:1: ruleMathOperation returns [EObject current=null] : (otherlv_0= 'l' ( (lv_lside_1_0= rulePreprocessingStep ) ) ( (lv_operator_2_0= ruleMathOperator ) ) otherlv_3= 'r' ( (lv_rside_4_0= rulePreprocessingStep ) ) ) ;
    public final EObject ruleMathOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_lside_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rside_4_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1019:2: ( (otherlv_0= 'l' ( (lv_lside_1_0= rulePreprocessingStep ) ) ( (lv_operator_2_0= ruleMathOperator ) ) otherlv_3= 'r' ( (lv_rside_4_0= rulePreprocessingStep ) ) ) )
            // InternalBiLang.g:1020:2: (otherlv_0= 'l' ( (lv_lside_1_0= rulePreprocessingStep ) ) ( (lv_operator_2_0= ruleMathOperator ) ) otherlv_3= 'r' ( (lv_rside_4_0= rulePreprocessingStep ) ) )
            {
            // InternalBiLang.g:1020:2: (otherlv_0= 'l' ( (lv_lside_1_0= rulePreprocessingStep ) ) ( (lv_operator_2_0= ruleMathOperator ) ) otherlv_3= 'r' ( (lv_rside_4_0= rulePreprocessingStep ) ) )
            // InternalBiLang.g:1021:3: otherlv_0= 'l' ( (lv_lside_1_0= rulePreprocessingStep ) ) ( (lv_operator_2_0= ruleMathOperator ) ) otherlv_3= 'r' ( (lv_rside_4_0= rulePreprocessingStep ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMathOperationAccess().getLKeyword_0());
            		
            // InternalBiLang.g:1025:3: ( (lv_lside_1_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1026:4: (lv_lside_1_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1026:4: (lv_lside_1_0= rulePreprocessingStep )
            // InternalBiLang.g:1027:5: lv_lside_1_0= rulePreprocessingStep
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_lside_1_0=rulePreprocessingStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"lside",
            						lv_lside_1_0,
            						"ucal3ia.bilang.BiLang.PreprocessingStep");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1044:3: ( (lv_operator_2_0= ruleMathOperator ) )
            // InternalBiLang.g:1045:4: (lv_operator_2_0= ruleMathOperator )
            {
            // InternalBiLang.g:1045:4: (lv_operator_2_0= ruleMathOperator )
            // InternalBiLang.g:1046:5: lv_operator_2_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_operator_2_0=ruleMathOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"ucal3ia.bilang.BiLang.MathOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMathOperationAccess().getRKeyword_3());
            		
            // InternalBiLang.g:1067:3: ( (lv_rside_4_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1068:4: (lv_rside_4_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1068:4: (lv_rside_4_0= rulePreprocessingStep )
            // InternalBiLang.g:1069:5: lv_rside_4_0= rulePreprocessingStep
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_rside_4_0=rulePreprocessingStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"rside",
            						lv_rside_4_0,
            						"ucal3ia.bilang.BiLang.PreprocessingStep");
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
    // $ANTLR end "ruleMathOperation"


    // $ANTLR start "entryRuleColReference"
    // InternalBiLang.g:1090:1: entryRuleColReference returns [EObject current=null] : iv_ruleColReference= ruleColReference EOF ;
    public final EObject entryRuleColReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColReference = null;


        try {
            // InternalBiLang.g:1090:53: (iv_ruleColReference= ruleColReference EOF )
            // InternalBiLang.g:1091:2: iv_ruleColReference= ruleColReference EOF
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
    // InternalBiLang.g:1097:1: ruleColReference returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject ruleColReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1103:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalBiLang.g:1104:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalBiLang.g:1104:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalBiLang.g:1105:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalBiLang.g:1105:3: ()
            // InternalBiLang.g:1106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColReferenceAccess().getColReferenceAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1112:3: ( (lv_target_1_0= ruleEString ) )
            // InternalBiLang.g:1113:4: (lv_target_1_0= ruleEString )
            {
            // InternalBiLang.g:1113:4: (lv_target_1_0= ruleEString )
            // InternalBiLang.g:1114:5: lv_target_1_0= ruleEString
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
    // InternalBiLang.g:1135:1: entryRuleStatisticalOperation returns [EObject current=null] : iv_ruleStatisticalOperation= ruleStatisticalOperation EOF ;
    public final EObject entryRuleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatisticalOperation = null;


        try {
            // InternalBiLang.g:1135:61: (iv_ruleStatisticalOperation= ruleStatisticalOperation EOF )
            // InternalBiLang.g:1136:2: iv_ruleStatisticalOperation= ruleStatisticalOperation EOF
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
    // InternalBiLang.g:1142:1: ruleStatisticalOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_colreference_2_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1148:2: ( ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) )
            // InternalBiLang.g:1149:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            {
            // InternalBiLang.g:1149:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            // InternalBiLang.g:1150:3: ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')'
            {
            // InternalBiLang.g:1150:3: ( (lv_operator_0_0= ruleStatisticalOperator ) )
            // InternalBiLang.g:1151:4: (lv_operator_0_0= ruleStatisticalOperator )
            {
            // InternalBiLang.g:1151:4: (lv_operator_0_0= ruleStatisticalOperator )
            // InternalBiLang.g:1152:5: lv_operator_0_0= ruleStatisticalOperator
            {

            					newCompositeNode(grammarAccess.getStatisticalOperationAccess().getOperatorStatisticalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_1=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStatisticalOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBiLang.g:1173:3: ( (lv_colreference_2_0= ruleColReference ) )
            // InternalBiLang.g:1174:4: (lv_colreference_2_0= ruleColReference )
            {
            // InternalBiLang.g:1174:4: (lv_colreference_2_0= ruleColReference )
            // InternalBiLang.g:1175:5: lv_colreference_2_0= ruleColReference
            {

            					newCompositeNode(grammarAccess.getStatisticalOperationAccess().getColreferenceColReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

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
    // InternalBiLang.g:1200:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBiLang.g:1200:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBiLang.g:1201:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBiLang.g:1207:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBiLang.g:1213:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBiLang.g:1214:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBiLang.g:1214:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBiLang.g:1215:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBiLang.g:1215:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:1216:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBiLang.g:1222:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBiLang.g:1223:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_30); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,37,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_32); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBiLang.g:1243:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21||LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBiLang.g:1244:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBiLang.g:1244:4: (kw= 'E' | kw= 'e' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==38) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==21) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalBiLang.g:1245:5: kw= 'E'
                            {
                            kw=(Token)match(input,38,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBiLang.g:1251:5: kw= 'e'
                            {
                            kw=(Token)match(input,21,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBiLang.g:1257:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==36) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalBiLang.g:1258:5: kw= '-'
                            {
                            kw=(Token)match(input,36,FOLLOW_31); 

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
    // InternalBiLang.g:1276:1: entryRuleBarPlot returns [EObject current=null] : iv_ruleBarPlot= ruleBarPlot EOF ;
    public final EObject entryRuleBarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarPlot = null;


        try {
            // InternalBiLang.g:1276:48: (iv_ruleBarPlot= ruleBarPlot EOF )
            // InternalBiLang.g:1277:2: iv_ruleBarPlot= ruleBarPlot EOF
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
    // InternalBiLang.g:1283:1: ruleBarPlot returns [EObject current=null] : ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
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

        AntlrDatatypeRuleToken lv_color_11_0 = null;

        AntlrDatatypeRuleToken lv_thickness_13_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1289:2: ( ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1290:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1290:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1291:3: () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1291:3: ()
            // InternalBiLang.g:1292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBarPlotAccess().getBarPlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBarPlotAccess().getBarKeyword_1());
            		
            // InternalBiLang.g:1302:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1303:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1303:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1304:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_3=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getBarPlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1328:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1329:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1329:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1330:5: lv_xAxis_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarPlotAccess().getXAxisEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_6=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getBarPlotAccess().getYAKeyword_6());
            		
            // InternalBiLang.g:1351:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1352:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1352:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1353:5: lv_yAxis_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarPlotAccess().getYAxisEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalBiLang.g:1370:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBiLang.g:1371:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getBarPlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1375:4: ( (lv_location_9_0= ruleEString ) )
                    // InternalBiLang.g:1376:5: (lv_location_9_0= ruleEString )
                    {
                    // InternalBiLang.g:1376:5: (lv_location_9_0= ruleEString )
                    // InternalBiLang.g:1377:6: lv_location_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getLocationEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalBiLang.g:1395:3: (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:1396:4: otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getBarPlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1400:4: ( (lv_color_11_0= ruleEString ) )
                    // InternalBiLang.g:1401:5: (lv_color_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1401:5: (lv_color_11_0= ruleEString )
                    // InternalBiLang.g:1402:6: lv_color_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getColorEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_color_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarPlotRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_11_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1420:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBiLang.g:1421:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_40); 

                    				newLeafNode(otherlv_12, grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1425:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1426:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1426:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1427:6: lv_thickness_13_0= ruleEFloat
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
    // InternalBiLang.g:1449:1: entryRuleLinePlot returns [EObject current=null] : iv_ruleLinePlot= ruleLinePlot EOF ;
    public final EObject entryRuleLinePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinePlot = null;


        try {
            // InternalBiLang.g:1449:49: (iv_ruleLinePlot= ruleLinePlot EOF )
            // InternalBiLang.g:1450:2: iv_ruleLinePlot= ruleLinePlot EOF
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
    // InternalBiLang.g:1456:1: ruleLinePlot returns [EObject current=null] : ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
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

        AntlrDatatypeRuleToken lv_color_11_0 = null;

        AntlrDatatypeRuleToken lv_thickness_13_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1462:2: ( ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1463:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1463:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1464:3: () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )? (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1464:3: ()
            // InternalBiLang.g:1465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinePlotAccess().getLinePlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinePlotAccess().getLineKeyword_1());
            		
            // InternalBiLang.g:1475:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1476:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1476:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1477:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            otherlv_3=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinePlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1501:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1502:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1502:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1503:5: lv_xAxis_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinePlotAccess().getXAxisEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_6=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getLinePlotAccess().getYAKeyword_6());
            		
            // InternalBiLang.g:1524:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1525:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1525:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1526:5: lv_yAxis_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinePlotAccess().getYAxisEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalBiLang.g:1543:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBiLang.g:1544:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinePlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1548:4: ( (lv_location_9_0= ruleEString ) )
                    // InternalBiLang.g:1549:5: (lv_location_9_0= ruleEString )
                    {
                    // InternalBiLang.g:1549:5: (lv_location_9_0= ruleEString )
                    // InternalBiLang.g:1550:6: lv_location_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getLocationEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

            // InternalBiLang.g:1568:3: (otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBiLang.g:1569:4: otherlv_10= 'colors' ( (lv_color_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,44,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getLinePlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1573:4: ( (lv_color_11_0= ruleEString ) )
                    // InternalBiLang.g:1574:5: (lv_color_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1574:5: (lv_color_11_0= ruleEString )
                    // InternalBiLang.g:1575:6: lv_color_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getColorEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_color_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinePlotRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_11_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1593:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:1594:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_40); 

                    				newLeafNode(otherlv_12, grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1598:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1599:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1599:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1600:6: lv_thickness_13_0= ruleEFloat
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


    // $ANTLR start "ruleMathOperator"
    // InternalBiLang.g:1622:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULTIPLY' ) | (enumLiteral_3= 'DIVIDING' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBiLang.g:1628:2: ( ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULTIPLY' ) | (enumLiteral_3= 'DIVIDING' ) ) )
            // InternalBiLang.g:1629:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULTIPLY' ) | (enumLiteral_3= 'DIVIDING' ) )
            {
            // InternalBiLang.g:1629:2: ( (enumLiteral_0= 'PLUS' ) | (enumLiteral_1= 'MINUS' ) | (enumLiteral_2= 'MULTIPLY' ) | (enumLiteral_3= 'DIVIDING' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt26=1;
                }
                break;
            case 48:
                {
                alt26=2;
                }
                break;
            case 49:
                {
                alt26=3;
                }
                break;
            case 50:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:1630:3: (enumLiteral_0= 'PLUS' )
                    {
                    // InternalBiLang.g:1630:3: (enumLiteral_0= 'PLUS' )
                    // InternalBiLang.g:1631:4: enumLiteral_0= 'PLUS'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1638:3: (enumLiteral_1= 'MINUS' )
                    {
                    // InternalBiLang.g:1638:3: (enumLiteral_1= 'MINUS' )
                    // InternalBiLang.g:1639:4: enumLiteral_1= 'MINUS'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:1646:3: (enumLiteral_2= 'MULTIPLY' )
                    {
                    // InternalBiLang.g:1646:3: (enumLiteral_2= 'MULTIPLY' )
                    // InternalBiLang.g:1647:4: enumLiteral_2= 'MULTIPLY'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:1654:3: (enumLiteral_3= 'DIVIDING' )
                    {
                    // InternalBiLang.g:1654:3: (enumLiteral_3= 'DIVIDING' )
                    // InternalBiLang.g:1655:4: enumLiteral_3= 'DIVIDING'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

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
    // InternalBiLang.g:1665:1: ruleStatisticalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'MEAN' ) | (enumLiteral_1= 'MEDIAN' ) | (enumLiteral_2= 'STD' ) ) ;
    public final Enumerator ruleStatisticalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBiLang.g:1671:2: ( ( (enumLiteral_0= 'MEAN' ) | (enumLiteral_1= 'MEDIAN' ) | (enumLiteral_2= 'STD' ) ) )
            // InternalBiLang.g:1672:2: ( (enumLiteral_0= 'MEAN' ) | (enumLiteral_1= 'MEDIAN' ) | (enumLiteral_2= 'STD' ) )
            {
            // InternalBiLang.g:1672:2: ( (enumLiteral_0= 'MEAN' ) | (enumLiteral_1= 'MEDIAN' ) | (enumLiteral_2= 'STD' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt27=1;
                }
                break;
            case 52:
                {
                alt27=2;
                }
                break;
            case 53:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:1673:3: (enumLiteral_0= 'MEAN' )
                    {
                    // InternalBiLang.g:1673:3: (enumLiteral_0= 'MEAN' )
                    // InternalBiLang.g:1674:4: enumLiteral_0= 'MEAN'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1681:3: (enumLiteral_1= 'MEDIAN' )
                    {
                    // InternalBiLang.g:1681:3: (enumLiteral_1= 'MEDIAN' )
                    // InternalBiLang.g:1682:4: enumLiteral_1= 'MEDIAN'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:1689:3: (enumLiteral_2= 'STD' )
                    {
                    // InternalBiLang.g:1689:3: (enumLiteral_2= 'STD' )
                    // InternalBiLang.g:1690:4: enumLiteral_2= 'STD'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0038000100000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0038000100080030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000408002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000200002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000003000000040L});

}