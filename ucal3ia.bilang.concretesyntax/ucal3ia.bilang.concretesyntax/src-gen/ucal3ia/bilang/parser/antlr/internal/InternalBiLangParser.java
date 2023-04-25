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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "':'", "'load'", "'[dashboard:'", "']'", "'=>'", "'processing='", "','", "'filtering='", "'plots'", "'{'", "'}'", "'.csv'", "'null replacement->'", "'.xlsx'", "'='", "'('", "'l'", "'r'", "')'", "'-'", "'.'", "'E'", "'e'", "'bar'", "'->'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'donut'", "'pie'", "'polar'", "'scatter'", "'radar'", "'+'", "'*'", "'/'", "'mean'", "'median'", "'std'", "'= '", "'!= '", "'<'", "'>'"
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

                if ( (LA4_1==23) ) {
                    alt4=1;
                }
                else if ( (LA4_1==25) ) {
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

                if ( (LA4_2==23) ) {
                    alt4=1;
                }
                else if ( (LA4_2==25) ) {
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

                if ( ((LA5_1>=54 && LA5_1<=55)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==26||(LA5_1>=56 && LA5_1<=57)) ) {
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

                if ( ((LA5_2>=54 && LA5_2<=55)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==26||(LA5_2>=56 && LA5_2<=57)) ) {
                    alt5=1;
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
            case 51:
            case 52:
            case 53:
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
            case 35:
                {
                alt7=1;
                }
                break;
            case 42:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 46:
                {
                alt7=4;
                }
                break;
            case 45:
                {
                alt7=5;
                }
                break;
            case 47:
                {
                alt7=6;
                }
                break;
            case 44:
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
    // InternalBiLang.g:597:1: ruleDashBoard returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' ) ;
    public final EObject ruleDashBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_plot_5_0 = null;

        EObject lv_plot_6_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:603:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' ) )
            // InternalBiLang.g:604:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )
            {
            // InternalBiLang.g:604:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )
            // InternalBiLang.g:605:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}'
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

            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalBiLang.g:628:3: ( ( ruleEString ) )
            // InternalBiLang.g:629:4: ( ruleEString )
            {
            // InternalBiLang.g:629:4: ( ruleEString )
            // InternalBiLang.g:630:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDashBoardRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDashBoardAccess().getPlotsKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBiLang.g:652:3: ( (lv_plot_5_0= rulePlot ) )
            // InternalBiLang.g:653:4: (lv_plot_5_0= rulePlot )
            {
            // InternalBiLang.g:653:4: (lv_plot_5_0= rulePlot )
            // InternalBiLang.g:654:5: lv_plot_5_0= rulePlot
            {

            					newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_plot_5_0=rulePlot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDashBoardRule());
            					}
            					add(
            						current,
            						"plot",
            						lv_plot_5_0,
            						"ucal3ia.bilang.BiLang.Plot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:671:3: ( (lv_plot_6_0= rulePlot ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35||(LA13_0>=42 && LA13_0<=47)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBiLang.g:672:4: (lv_plot_6_0= rulePlot )
            	    {
            	    // InternalBiLang.g:672:4: (lv_plot_6_0= rulePlot )
            	    // InternalBiLang.g:673:5: lv_plot_6_0= rulePlot
            	    {

            	    					newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_plot_6_0=rulePlot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDashBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"plot",
            	    						lv_plot_6_0,
            	    						"ucal3ia.bilang.BiLang.Plot");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalBiLang.g:698:1: entryRuleCsvExtractor returns [EObject current=null] : iv_ruleCsvExtractor= ruleCsvExtractor EOF ;
    public final EObject entryRuleCsvExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvExtractor = null;


        try {
            // InternalBiLang.g:698:53: (iv_ruleCsvExtractor= ruleCsvExtractor EOF )
            // InternalBiLang.g:699:2: iv_ruleCsvExtractor= ruleCsvExtractor EOF
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
    // InternalBiLang.g:705:1: ruleCsvExtractor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )? ) ;
    public final EObject ruleCsvExtractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;

        EObject lv_nullreplacement_6_0 = null;

        EObject lv_nullreplacement_8_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:711:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )? ) )
            // InternalBiLang.g:712:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )? )
            {
            // InternalBiLang.g:712:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )? )
            // InternalBiLang.g:713:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.csv' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )?
            {
            // InternalBiLang.g:713:3: ()
            // InternalBiLang.g:714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCsvExtractorAccess().getCsvExtractorAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:720:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBiLang.g:721:4: (lv_name_1_0= ruleEString )
            {
            // InternalBiLang.g:721:4: (lv_name_1_0= ruleEString )
            // InternalBiLang.g:722:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsvExtractorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCsvExtractorAccess().getCsvKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCsvExtractorAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalBiLang.g:747:3: ( (lv_path_4_0= ruleEString ) )
            // InternalBiLang.g:748:4: (lv_path_4_0= ruleEString )
            {
            // InternalBiLang.g:748:4: (lv_path_4_0= ruleEString )
            // InternalBiLang.g:749:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsvExtractorAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalBiLang.g:766:3: (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:767:4: otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getCsvExtractorAccess().getNullReplacementKeyword_5_0());
                    			
                    // InternalBiLang.g:771:4: ( (lv_nullreplacement_6_0= ruleNullReplacement ) )
                    // InternalBiLang.g:772:5: (lv_nullreplacement_6_0= ruleNullReplacement )
                    {
                    // InternalBiLang.g:772:5: (lv_nullreplacement_6_0= ruleNullReplacement )
                    // InternalBiLang.g:773:6: lv_nullreplacement_6_0= ruleNullReplacement
                    {

                    						newCompositeNode(grammarAccess.getCsvExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nullreplacement_6_0=ruleNullReplacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCsvExtractorRule());
                    						}
                    						add(
                    							current,
                    							"nullreplacement",
                    							lv_nullreplacement_6_0,
                    							"ucal3ia.bilang.BiLang.NullReplacement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBiLang.g:790:4: (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBiLang.g:791:5: otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCsvExtractorAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalBiLang.g:795:5: ( (lv_nullreplacement_8_0= ruleNullReplacement ) )
                    	    // InternalBiLang.g:796:6: (lv_nullreplacement_8_0= ruleNullReplacement )
                    	    {
                    	    // InternalBiLang.g:796:6: (lv_nullreplacement_8_0= ruleNullReplacement )
                    	    // InternalBiLang.g:797:7: lv_nullreplacement_8_0= ruleNullReplacement
                    	    {

                    	    							newCompositeNode(grammarAccess.getCsvExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_nullreplacement_8_0=ruleNullReplacement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCsvExtractorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nullreplacement",
                    	    								lv_nullreplacement_8_0,
                    	    								"ucal3ia.bilang.BiLang.NullReplacement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
    // $ANTLR end "ruleCsvExtractor"


    // $ANTLR start "entryRuleExcelExtractor"
    // InternalBiLang.g:820:1: entryRuleExcelExtractor returns [EObject current=null] : iv_ruleExcelExtractor= ruleExcelExtractor EOF ;
    public final EObject entryRuleExcelExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExcelExtractor = null;


        try {
            // InternalBiLang.g:820:55: (iv_ruleExcelExtractor= ruleExcelExtractor EOF )
            // InternalBiLang.g:821:2: iv_ruleExcelExtractor= ruleExcelExtractor EOF
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
    // InternalBiLang.g:827:1: ruleExcelExtractor returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )? ) ;
    public final EObject ruleExcelExtractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;

        EObject lv_nullreplacement_6_0 = null;

        EObject lv_nullreplacement_8_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:833:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )? ) )
            // InternalBiLang.g:834:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )? )
            {
            // InternalBiLang.g:834:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )? )
            // InternalBiLang.g:835:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '.xlsx' otherlv_3= '=>' ( (lv_path_4_0= ruleEString ) ) (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )?
            {
            // InternalBiLang.g:835:3: ()
            // InternalBiLang.g:836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExcelExtractorAccess().getExcelExtractorAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:842:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBiLang.g:843:4: (lv_name_1_0= ruleEString )
            {
            // InternalBiLang.g:843:4: (lv_name_1_0= ruleEString )
            // InternalBiLang.g:844:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getExcelExtractorAccess().getXlsxKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getExcelExtractorAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalBiLang.g:869:3: ( (lv_path_4_0= ruleEString ) )
            // InternalBiLang.g:870:4: (lv_path_4_0= ruleEString )
            {
            // InternalBiLang.g:870:4: (lv_path_4_0= ruleEString )
            // InternalBiLang.g:871:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExcelExtractorAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalBiLang.g:888:3: (otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBiLang.g:889:4: otherlv_5= 'null replacement->' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getExcelExtractorAccess().getNullReplacementKeyword_5_0());
                    			
                    // InternalBiLang.g:893:4: ( (lv_nullreplacement_6_0= ruleNullReplacement ) )
                    // InternalBiLang.g:894:5: (lv_nullreplacement_6_0= ruleNullReplacement )
                    {
                    // InternalBiLang.g:894:5: (lv_nullreplacement_6_0= ruleNullReplacement )
                    // InternalBiLang.g:895:6: lv_nullreplacement_6_0= ruleNullReplacement
                    {

                    						newCompositeNode(grammarAccess.getExcelExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_nullreplacement_6_0=ruleNullReplacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExcelExtractorRule());
                    						}
                    						add(
                    							current,
                    							"nullreplacement",
                    							lv_nullreplacement_6_0,
                    							"ucal3ia.bilang.BiLang.NullReplacement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBiLang.g:912:4: (otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBiLang.g:913:5: otherlv_7= ',' ( (lv_nullreplacement_8_0= ruleNullReplacement ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getExcelExtractorAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalBiLang.g:917:5: ( (lv_nullreplacement_8_0= ruleNullReplacement ) )
                    	    // InternalBiLang.g:918:6: (lv_nullreplacement_8_0= ruleNullReplacement )
                    	    {
                    	    // InternalBiLang.g:918:6: (lv_nullreplacement_8_0= ruleNullReplacement )
                    	    // InternalBiLang.g:919:7: lv_nullreplacement_8_0= ruleNullReplacement
                    	    {

                    	    							newCompositeNode(grammarAccess.getExcelExtractorAccess().getNullreplacementNullReplacementParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_nullreplacement_8_0=ruleNullReplacement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExcelExtractorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nullreplacement",
                    	    								lv_nullreplacement_8_0,
                    	    								"ucal3ia.bilang.BiLang.NullReplacement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
    // $ANTLR end "ruleExcelExtractor"


    // $ANTLR start "entryRuleNullReplacement"
    // InternalBiLang.g:942:1: entryRuleNullReplacement returns [EObject current=null] : iv_ruleNullReplacement= ruleNullReplacement EOF ;
    public final EObject entryRuleNullReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullReplacement = null;


        try {
            // InternalBiLang.g:942:56: (iv_ruleNullReplacement= ruleNullReplacement EOF )
            // InternalBiLang.g:943:2: iv_ruleNullReplacement= ruleNullReplacement EOF
            {
             newCompositeNode(grammarAccess.getNullReplacementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullReplacement=ruleNullReplacement();

            state._fsp--;

             current =iv_ruleNullReplacement; 
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
    // $ANTLR end "entryRuleNullReplacement"


    // $ANTLR start "ruleNullReplacement"
    // InternalBiLang.g:949:1: ruleNullReplacement returns [EObject current=null] : ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) ) ;
    public final EObject ruleNullReplacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_colName_0_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        EObject lv_statisticaloperation_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:955:2: ( ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) ) )
            // InternalBiLang.g:956:2: ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) )
            {
            // InternalBiLang.g:956:2: ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) )
            // InternalBiLang.g:957:3: ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) )
            {
            // InternalBiLang.g:957:3: ( (lv_colName_0_0= ruleEString ) )
            // InternalBiLang.g:958:4: (lv_colName_0_0= ruleEString )
            {
            // InternalBiLang.g:958:4: (lv_colName_0_0= ruleEString )
            // InternalBiLang.g:959:5: lv_colName_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNullReplacementAccess().getColNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_colName_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNullReplacementRule());
            					}
            					set(
            						current,
            						"colName",
            						lv_colName_0_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getNullReplacementAccess().getEqualsSignKeyword_1());
            		
            // InternalBiLang.g:980:3: ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=51 && LA18_0<=53)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBiLang.g:981:4: ( (lv_label_2_0= ruleEString ) )
                    {
                    // InternalBiLang.g:981:4: ( (lv_label_2_0= ruleEString ) )
                    // InternalBiLang.g:982:5: (lv_label_2_0= ruleEString )
                    {
                    // InternalBiLang.g:982:5: (lv_label_2_0= ruleEString )
                    // InternalBiLang.g:983:6: lv_label_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNullReplacementAccess().getLabelEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_label_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNullReplacementRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_2_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:1001:4: ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) )
                    {
                    // InternalBiLang.g:1001:4: ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) )
                    // InternalBiLang.g:1002:5: (lv_statisticaloperation_3_0= ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:1002:5: (lv_statisticaloperation_3_0= ruleStatisticalOperation )
                    // InternalBiLang.g:1003:6: lv_statisticaloperation_3_0= ruleStatisticalOperation
                    {

                    						newCompositeNode(grammarAccess.getNullReplacementAccess().getStatisticaloperationStatisticalOperationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_statisticaloperation_3_0=ruleStatisticalOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNullReplacementRule());
                    						}
                    						set(
                    							current,
                    							"statisticaloperation",
                    							lv_statisticaloperation_3_0,
                    							"ucal3ia.bilang.BiLang.StatisticalOperation");
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
    // $ANTLR end "ruleNullReplacement"


    // $ANTLR start "entryRuleQuantitativeFiltering"
    // InternalBiLang.g:1025:1: entryRuleQuantitativeFiltering returns [EObject current=null] : iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF ;
    public final EObject entryRuleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativeFiltering = null;


        try {
            // InternalBiLang.g:1025:62: (iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:1026:2: iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF
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
    // InternalBiLang.g:1032:1: ruleQuantitativeFiltering returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) ) ;
    public final EObject ruleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_axis_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1038:2: ( ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) ) )
            // InternalBiLang.g:1039:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) )
            {
            // InternalBiLang.g:1039:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) )
            // InternalBiLang.g:1040:3: () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) )
            {
            // InternalBiLang.g:1040:3: ()
            // InternalBiLang.g:1041:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1047:3: ( (lv_axis_1_0= ruleEString ) )
            // InternalBiLang.g:1048:4: (lv_axis_1_0= ruleEString )
            {
            // InternalBiLang.g:1048:4: (lv_axis_1_0= ruleEString )
            // InternalBiLang.g:1049:5: lv_axis_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalBiLang.g:1066:3: ( (lv_operator_2_0= ruleQuantitativeOperator ) )
            // InternalBiLang.g:1067:4: (lv_operator_2_0= ruleQuantitativeOperator )
            {
            // InternalBiLang.g:1067:4: (lv_operator_2_0= ruleQuantitativeOperator )
            // InternalBiLang.g:1068:5: lv_operator_2_0= ruleQuantitativeOperator
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getOperatorQuantitativeOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalBiLang.g:1085:3: ( (lv_values_3_0= ruleEFloat ) )
            // InternalBiLang.g:1086:4: (lv_values_3_0= ruleEFloat )
            {
            // InternalBiLang.g:1086:4: (lv_values_3_0= ruleEFloat )
            // InternalBiLang.g:1087:5: lv_values_3_0= ruleEFloat
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
    // InternalBiLang.g:1108:1: entryRuleQualitativeFiltering returns [EObject current=null] : iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF ;
    public final EObject entryRuleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeFiltering = null;


        try {
            // InternalBiLang.g:1108:61: (iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF )
            // InternalBiLang.g:1109:2: iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF
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
    // InternalBiLang.g:1115:1: ruleQualitativeFiltering returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) ) ;
    public final EObject ruleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_axis_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1121:2: ( ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) ) )
            // InternalBiLang.g:1122:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) )
            {
            // InternalBiLang.g:1122:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) )
            // InternalBiLang.g:1123:3: () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) )
            {
            // InternalBiLang.g:1123:3: ()
            // InternalBiLang.g:1124:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1130:3: ( (lv_axis_1_0= ruleEString ) )
            // InternalBiLang.g:1131:4: (lv_axis_1_0= ruleEString )
            {
            // InternalBiLang.g:1131:4: (lv_axis_1_0= ruleEString )
            // InternalBiLang.g:1132:5: lv_axis_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalBiLang.g:1149:3: ( (lv_operator_2_0= ruleQualitativeOperator ) )
            // InternalBiLang.g:1150:4: (lv_operator_2_0= ruleQualitativeOperator )
            {
            // InternalBiLang.g:1150:4: (lv_operator_2_0= ruleQualitativeOperator )
            // InternalBiLang.g:1151:5: lv_operator_2_0= ruleQualitativeOperator
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

            // InternalBiLang.g:1168:3: ( (lv_labels_3_0= ruleEString ) )
            // InternalBiLang.g:1169:4: (lv_labels_3_0= ruleEString )
            {
            // InternalBiLang.g:1169:4: (lv_labels_3_0= ruleEString )
            // InternalBiLang.g:1170:5: lv_labels_3_0= ruleEString
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
    // InternalBiLang.g:1191:1: entryRuleMathOperation returns [EObject current=null] : iv_ruleMathOperation= ruleMathOperation EOF ;
    public final EObject entryRuleMathOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathOperation = null;


        try {
            // InternalBiLang.g:1191:54: (iv_ruleMathOperation= ruleMathOperation EOF )
            // InternalBiLang.g:1192:2: iv_ruleMathOperation= ruleMathOperation EOF
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
    // InternalBiLang.g:1198:1: ruleMathOperation returns [EObject current=null] : ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? ) ;
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
            // InternalBiLang.g:1204:2: ( ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? ) )
            // InternalBiLang.g:1205:2: ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? )
            {
            // InternalBiLang.g:1205:2: ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? )
            // InternalBiLang.g:1206:3: (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )?
            {
            // InternalBiLang.g:1206:3: (otherlv_0= '(' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBiLang.g:1207:4: otherlv_0= '('
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMathOperationAccess().getLKeyword_1());
            		
            // InternalBiLang.g:1216:3: ( (lv_lside_2_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1217:4: (lv_lside_2_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1217:4: (lv_lside_2_0= rulePreprocessingStep )
            // InternalBiLang.g:1218:5: lv_lside_2_0= rulePreprocessingStep
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalBiLang.g:1235:3: ( (lv_operator_3_0= ruleMathOperator ) )
            // InternalBiLang.g:1236:4: (lv_operator_3_0= ruleMathOperator )
            {
            // InternalBiLang.g:1236:4: (lv_operator_3_0= ruleMathOperator )
            // InternalBiLang.g:1237:5: lv_operator_3_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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
            		
            // InternalBiLang.g:1258:3: ( (lv_rside_5_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1259:4: (lv_rside_5_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1259:4: (lv_rside_5_0= rulePreprocessingStep )
            // InternalBiLang.g:1260:5: lv_rside_5_0= rulePreprocessingStep
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalBiLang.g:1277:3: (otherlv_6= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBiLang.g:1278:4: otherlv_6= ')'
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
    // InternalBiLang.g:1287:1: entryRuleColReference returns [EObject current=null] : iv_ruleColReference= ruleColReference EOF ;
    public final EObject entryRuleColReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColReference = null;


        try {
            // InternalBiLang.g:1287:53: (iv_ruleColReference= ruleColReference EOF )
            // InternalBiLang.g:1288:2: iv_ruleColReference= ruleColReference EOF
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
    // InternalBiLang.g:1294:1: ruleColReference returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject ruleColReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1300:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalBiLang.g:1301:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalBiLang.g:1301:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalBiLang.g:1302:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalBiLang.g:1302:3: ()
            // InternalBiLang.g:1303:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColReferenceAccess().getColReferenceAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1309:3: ( (lv_target_1_0= ruleEString ) )
            // InternalBiLang.g:1310:4: (lv_target_1_0= ruleEString )
            {
            // InternalBiLang.g:1310:4: (lv_target_1_0= ruleEString )
            // InternalBiLang.g:1311:5: lv_target_1_0= ruleEString
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
    // InternalBiLang.g:1332:1: entryRuleStatisticalOperation returns [EObject current=null] : iv_ruleStatisticalOperation= ruleStatisticalOperation EOF ;
    public final EObject entryRuleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatisticalOperation = null;


        try {
            // InternalBiLang.g:1332:61: (iv_ruleStatisticalOperation= ruleStatisticalOperation EOF )
            // InternalBiLang.g:1333:2: iv_ruleStatisticalOperation= ruleStatisticalOperation EOF
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
    // InternalBiLang.g:1339:1: ruleStatisticalOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_colreference_2_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1345:2: ( ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) )
            // InternalBiLang.g:1346:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            {
            // InternalBiLang.g:1346:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            // InternalBiLang.g:1347:3: ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')'
            {
            // InternalBiLang.g:1347:3: ( (lv_operator_0_0= ruleStatisticalOperator ) )
            // InternalBiLang.g:1348:4: (lv_operator_0_0= ruleStatisticalOperator )
            {
            // InternalBiLang.g:1348:4: (lv_operator_0_0= ruleStatisticalOperator )
            // InternalBiLang.g:1349:5: lv_operator_0_0= ruleStatisticalOperator
            {

            					newCompositeNode(grammarAccess.getStatisticalOperationAccess().getOperatorStatisticalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
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
            		
            // InternalBiLang.g:1370:3: ( (lv_colreference_2_0= ruleColReference ) )
            // InternalBiLang.g:1371:4: (lv_colreference_2_0= ruleColReference )
            {
            // InternalBiLang.g:1371:4: (lv_colreference_2_0= ruleColReference )
            // InternalBiLang.g:1372:5: lv_colreference_2_0= ruleColReference
            {

            					newCompositeNode(grammarAccess.getStatisticalOperationAccess().getColreferenceColReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
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
    // InternalBiLang.g:1397:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBiLang.g:1397:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBiLang.g:1398:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBiLang.g:1404:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBiLang.g:1410:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBiLang.g:1411:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBiLang.g:1411:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBiLang.g:1412:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBiLang.g:1412:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:1413:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBiLang.g:1419:3: (this_INT_1= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBiLang.g:1420:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_33); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_34); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_35); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBiLang.g:1440:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=33 && LA25_0<=34)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:1441:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBiLang.g:1441:4: (kw= 'E' | kw= 'e' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==33) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==34) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalBiLang.g:1442:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_36); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBiLang.g:1448:5: kw= 'e'
                            {
                            kw=(Token)match(input,34,FOLLOW_36); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBiLang.g:1454:4: (kw= '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==31) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalBiLang.g:1455:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_34); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalBiLang.g:1473:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBiLang.g:1473:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBiLang.g:1474:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBiLang.g:1480:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:1486:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBiLang.g:1487:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBiLang.g:1487:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBiLang.g:1488:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBiLang.g:1488:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:1489:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleBarPlot"
    // InternalBiLang.g:1506:1: entryRuleBarPlot returns [EObject current=null] : iv_ruleBarPlot= ruleBarPlot EOF ;
    public final EObject entryRuleBarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarPlot = null;


        try {
            // InternalBiLang.g:1506:48: (iv_ruleBarPlot= ruleBarPlot EOF )
            // InternalBiLang.g:1507:2: iv_ruleBarPlot= ruleBarPlot EOF
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
    // InternalBiLang.g:1513:1: ruleBarPlot returns [EObject current=null] : ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1519:2: ( ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1520:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1520:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1521:3: () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1521:3: ()
            // InternalBiLang.g:1522:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBarPlotAccess().getBarPlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBarPlotAccess().getBarKeyword_1());
            		
            // InternalBiLang.g:1532:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1533:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1533:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1534:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getBarPlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1558:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1559:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1559:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1560:5: lv_xAxis_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarPlotAccess().getXAxisEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_6=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getBarPlotAccess().getYAKeyword_6());
            		
            // InternalBiLang.g:1581:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1582:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1582:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1583:5: lv_yAxis_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarPlotAccess().getYAxisEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBiLang.g:1600:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:1601:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getBarPlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1605:4: ( (lv_location_9_0= ruleEInt ) )
                    // InternalBiLang.g:1606:5: (lv_location_9_0= ruleEInt )
                    {
                    // InternalBiLang.g:1606:5: (lv_location_9_0= ruleEInt )
                    // InternalBiLang.g:1607:6: lv_location_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getLocationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_location_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBarPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_9_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1625:3: (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBiLang.g:1626:4: otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getBarPlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1630:4: ( (lv_colors_11_0= ruleEString ) )
                    // InternalBiLang.g:1631:5: (lv_colors_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1631:5: (lv_colors_11_0= ruleEString )
                    // InternalBiLang.g:1632:6: lv_colors_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getColorsEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalBiLang.g:1650:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBiLang.g:1651:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1655:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1656:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1656:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1657:6: lv_thickness_13_0= ruleEFloat
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
    // InternalBiLang.g:1679:1: entryRuleLinePlot returns [EObject current=null] : iv_ruleLinePlot= ruleLinePlot EOF ;
    public final EObject entryRuleLinePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinePlot = null;


        try {
            // InternalBiLang.g:1679:49: (iv_ruleLinePlot= ruleLinePlot EOF )
            // InternalBiLang.g:1680:2: iv_ruleLinePlot= ruleLinePlot EOF
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
    // InternalBiLang.g:1686:1: ruleLinePlot returns [EObject current=null] : ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1692:2: ( ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1693:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1693:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1694:3: () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1694:3: ()
            // InternalBiLang.g:1695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinePlotAccess().getLinePlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinePlotAccess().getLineKeyword_1());
            		
            // InternalBiLang.g:1705:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1706:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1706:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1707:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_3=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinePlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1731:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1732:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1732:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1733:5: lv_xAxis_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinePlotAccess().getXAxisEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_6=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getLinePlotAccess().getYAKeyword_6());
            		
            // InternalBiLang.g:1754:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1755:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1755:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1756:5: lv_yAxis_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinePlotAccess().getYAxisEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBiLang.g:1773:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBiLang.g:1774:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinePlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1778:4: ( (lv_location_9_0= ruleEInt ) )
                    // InternalBiLang.g:1779:5: (lv_location_9_0= ruleEInt )
                    {
                    // InternalBiLang.g:1779:5: (lv_location_9_0= ruleEInt )
                    // InternalBiLang.g:1780:6: lv_location_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getLocationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_location_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinePlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_9_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1798:3: (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBiLang.g:1799:4: otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getLinePlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1803:4: ( (lv_colors_11_0= ruleEString ) )
                    // InternalBiLang.g:1804:5: (lv_colors_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1804:5: (lv_colors_11_0= ruleEString )
                    // InternalBiLang.g:1805:6: lv_colors_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getColorsEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalBiLang.g:1823:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBiLang.g:1824:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1828:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1829:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1829:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1830:6: lv_thickness_13_0= ruleEFloat
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
    // InternalBiLang.g:1852:1: entryRuleDonutPlot returns [EObject current=null] : iv_ruleDonutPlot= ruleDonutPlot EOF ;
    public final EObject entryRuleDonutPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDonutPlot = null;


        try {
            // InternalBiLang.g:1852:50: (iv_ruleDonutPlot= ruleDonutPlot EOF )
            // InternalBiLang.g:1853:2: iv_ruleDonutPlot= ruleDonutPlot EOF
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
    // InternalBiLang.g:1859:1: ruleDonutPlot returns [EObject current=null] : (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1865:2: ( (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1866:2: (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1866:2: (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1867:3: otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDonutPlotAccess().getDonutKeyword_0());
            		
            // InternalBiLang.g:1871:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:1872:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:1872:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:1873:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getDonutPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDonutPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:1897:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:1898:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:1898:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:1899:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDonutPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_5=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDonutPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:1920:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:1921:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:1921:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:1922:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDonutPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBiLang.g:1939:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:1940:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getDonutPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:1944:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:1945:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:1945:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:1946:6: lv_location_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDonutPlotAccess().getLocationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_location_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:1964:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:1965:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getDonutPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:1969:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:1970:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:1970:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:1971:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDonutPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalBiLang.g:1989:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:1990:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getDonutPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:1994:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:1995:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1995:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:1996:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2018:1: entryRulePiePlot returns [EObject current=null] : iv_rulePiePlot= rulePiePlot EOF ;
    public final EObject entryRulePiePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiePlot = null;


        try {
            // InternalBiLang.g:2018:48: (iv_rulePiePlot= rulePiePlot EOF )
            // InternalBiLang.g:2019:2: iv_rulePiePlot= rulePiePlot EOF
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
    // InternalBiLang.g:2025:1: rulePiePlot returns [EObject current=null] : (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2031:2: ( (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2032:2: (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2032:2: (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2033:3: otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPiePlotAccess().getPieKeyword_0());
            		
            // InternalBiLang.g:2037:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2038:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2038:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2039:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getPiePlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPiePlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2063:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2064:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2064:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2065:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPiePlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_5=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPiePlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2086:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2087:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2087:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2088:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPiePlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBiLang.g:2105:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:2106:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getPiePlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2110:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2111:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2111:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2112:6: lv_location_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPiePlotAccess().getLocationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_location_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2130:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:2131:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPiePlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2135:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2136:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2136:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2137:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPiePlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalBiLang.g:2155:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:2156:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getPiePlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2160:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2161:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2161:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2162:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2184:1: entryRulePolarPlot returns [EObject current=null] : iv_rulePolarPlot= rulePolarPlot EOF ;
    public final EObject entryRulePolarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolarPlot = null;


        try {
            // InternalBiLang.g:2184:50: (iv_rulePolarPlot= rulePolarPlot EOF )
            // InternalBiLang.g:2185:2: iv_rulePolarPlot= rulePolarPlot EOF
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
    // InternalBiLang.g:2191:1: rulePolarPlot returns [EObject current=null] : (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2197:2: ( (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2198:2: (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2198:2: (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2199:3: otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolarPlotAccess().getPolarKeyword_0());
            		
            // InternalBiLang.g:2203:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2204:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2204:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2205:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getPolarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPolarPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2229:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2230:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2230:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2231:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolarPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_5=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPolarPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2252:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2253:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2253:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2254:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolarPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBiLang.g:2271:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:2272:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getPolarPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2276:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2277:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2277:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2278:6: lv_location_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPolarPlotAccess().getLocationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_location_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPolarPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2296:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:2297:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPolarPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2301:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2302:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2302:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2303:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPolarPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalBiLang.g:2321:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:2322:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getPolarPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2326:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2327:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2327:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2328:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2350:1: entryRuleScatterPlot returns [EObject current=null] : iv_ruleScatterPlot= ruleScatterPlot EOF ;
    public final EObject entryRuleScatterPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScatterPlot = null;


        try {
            // InternalBiLang.g:2350:52: (iv_ruleScatterPlot= ruleScatterPlot EOF )
            // InternalBiLang.g:2351:2: iv_ruleScatterPlot= ruleScatterPlot EOF
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
    // InternalBiLang.g:2357:1: ruleScatterPlot returns [EObject current=null] : (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2363:2: ( (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2364:2: (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2364:2: (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2365:3: otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScatterPlotAccess().getScatterKeyword_0());
            		
            // InternalBiLang.g:2369:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2370:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2370:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2371:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getScatterPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getScatterPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2395:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2396:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2396:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2397:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScatterPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_5=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getScatterPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2418:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2419:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2419:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2420:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScatterPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBiLang.g:2437:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:2438:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getScatterPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2442:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2443:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2443:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2444:6: lv_location_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getScatterPlotAccess().getLocationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_location_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScatterPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2462:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:2463:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getScatterPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2467:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2468:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2468:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2469:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScatterPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalBiLang.g:2487:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:2488:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getScatterPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2492:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2493:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2493:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2494:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2516:1: entryRuleRadarPlot returns [EObject current=null] : iv_ruleRadarPlot= ruleRadarPlot EOF ;
    public final EObject entryRuleRadarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadarPlot = null;


        try {
            // InternalBiLang.g:2516:50: (iv_ruleRadarPlot= ruleRadarPlot EOF )
            // InternalBiLang.g:2517:2: iv_ruleRadarPlot= ruleRadarPlot EOF
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
    // InternalBiLang.g:2523:1: ruleRadarPlot returns [EObject current=null] : (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2529:2: ( (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2530:2: (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2530:2: (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2531:3: otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRadarPlotAccess().getRadarKeyword_0());
            		
            // InternalBiLang.g:2535:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2536:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2536:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2537:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getRadarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRadarPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2561:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2562:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2562:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2563:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_5=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRadarPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2584:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2585:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2585:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2586:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_40);
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

            // InternalBiLang.g:2603:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:2604:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getRadarPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2608:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2609:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2609:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2610:6: lv_location_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRadarPlotAccess().getLocationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_location_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadarPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_8_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2628:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:2629:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getRadarPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2633:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2634:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2634:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2635:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadarPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalBiLang.g:2653:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBiLang.g:2654:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getRadarPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2658:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2659:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2659:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2660:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2682:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBiLang.g:2688:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalBiLang.g:2689:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalBiLang.g:2689:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt48=1;
                }
                break;
            case 31:
                {
                alt48=2;
                }
                break;
            case 49:
                {
                alt48=3;
                }
                break;
            case 50:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalBiLang.g:2690:3: (enumLiteral_0= '+' )
                    {
                    // InternalBiLang.g:2690:3: (enumLiteral_0= '+' )
                    // InternalBiLang.g:2691:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2698:3: (enumLiteral_1= '-' )
                    {
                    // InternalBiLang.g:2698:3: (enumLiteral_1= '-' )
                    // InternalBiLang.g:2699:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2706:3: (enumLiteral_2= '*' )
                    {
                    // InternalBiLang.g:2706:3: (enumLiteral_2= '*' )
                    // InternalBiLang.g:2707:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:2714:3: (enumLiteral_3= '/' )
                    {
                    // InternalBiLang.g:2714:3: (enumLiteral_3= '/' )
                    // InternalBiLang.g:2715:4: enumLiteral_3= '/'
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
    // InternalBiLang.g:2725:1: ruleStatisticalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) ) ;
    public final Enumerator ruleStatisticalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBiLang.g:2731:2: ( ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) ) )
            // InternalBiLang.g:2732:2: ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) )
            {
            // InternalBiLang.g:2732:2: ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt49=1;
                }
                break;
            case 52:
                {
                alt49=2;
                }
                break;
            case 53:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalBiLang.g:2733:3: (enumLiteral_0= 'mean' )
                    {
                    // InternalBiLang.g:2733:3: (enumLiteral_0= 'mean' )
                    // InternalBiLang.g:2734:4: enumLiteral_0= 'mean'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2741:3: (enumLiteral_1= 'median' )
                    {
                    // InternalBiLang.g:2741:3: (enumLiteral_1= 'median' )
                    // InternalBiLang.g:2742:4: enumLiteral_1= 'median'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2749:3: (enumLiteral_2= 'std' )
                    {
                    // InternalBiLang.g:2749:3: (enumLiteral_2= 'std' )
                    // InternalBiLang.g:2750:4: enumLiteral_2= 'std'
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


    // $ANTLR start "ruleQualitativeOperator"
    // InternalBiLang.g:2760:1: ruleQualitativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) ) ;
    public final Enumerator ruleQualitativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:2766:2: ( ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) ) )
            // InternalBiLang.g:2767:2: ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) )
            {
            // InternalBiLang.g:2767:2: ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            else if ( (LA50_0==55) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalBiLang.g:2768:3: (enumLiteral_0= '= ' )
                    {
                    // InternalBiLang.g:2768:3: (enumLiteral_0= '= ' )
                    // InternalBiLang.g:2769:4: enumLiteral_0= '= '
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2776:3: (enumLiteral_1= '!= ' )
                    {
                    // InternalBiLang.g:2776:3: (enumLiteral_1= '!= ' )
                    // InternalBiLang.g:2777:4: enumLiteral_1= '!= '
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalBiLang.g:2787:1: ruleQuantitativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleQuantitativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBiLang.g:2793:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // InternalBiLang.g:2794:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // InternalBiLang.g:2794:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt51=1;
                }
                break;
            case 56:
                {
                alt51=2;
                }
                break;
            case 57:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalBiLang.g:2795:3: (enumLiteral_0= '=' )
                    {
                    // InternalBiLang.g:2795:3: (enumLiteral_0= '=' )
                    // InternalBiLang.g:2796:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2803:3: (enumLiteral_1= '<' )
                    {
                    // InternalBiLang.g:2803:3: (enumLiteral_1= '<' )
                    // InternalBiLang.g:2804:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2811:3: (enumLiteral_2= '>' )
                    {
                    // InternalBiLang.g:2811:3: (enumLiteral_2= '>' )
                    // InternalBiLang.g:2812:4: enumLiteral_2= '>'
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0038000018000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000FC0800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000FC0800400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0300000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000180000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0007000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000002L});

}