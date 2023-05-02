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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "':'", "'load'", "'dashboard:'", "'=>'", "'null replacement->'", "','", "'->'", "'filtering='", "'processing='", "'count='", "'{'", "'}='", "'plots'", "'}'", "'='", "'('", "'l'", "'r'", "')'", "'-'", "'.'", "'E'", "'e'", "'bar'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'donut'", "'countID'", "'pie'", "'polar'", "'scatter'", "'radar'", "'+'", "'*'", "'/'", "'mean'", "'median'", "'std'", "'= '", "'!= '", "'[]'", "']['", "'[['", "']]'", "'<'", "'>'", "'<='", "'>='"
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
    public static final int T__62=62;
    public static final int T__63=63;
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
    // InternalBiLang.g:72:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_5_0= ruleDataFiltering ) ) ( (lv_datafiltering_6_0= ruleDataFiltering ) )* )? ( ( (lv_fileextractor_7_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )* )? )* otherlv_10= 'dashboard:' ( (lv_dashboard_11_0= ruleDashBoard ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_10=null;
        EObject lv_fileextractor_4_0 = null;

        EObject lv_datafiltering_5_0 = null;

        EObject lv_datafiltering_6_0 = null;

        EObject lv_fileextractor_7_0 = null;

        EObject lv_datafiltering_8_0 = null;

        EObject lv_datafiltering_9_0 = null;

        EObject lv_dashboard_11_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:78:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_5_0= ruleDataFiltering ) ) ( (lv_datafiltering_6_0= ruleDataFiltering ) )* )? ( ( (lv_fileextractor_7_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )* )? )* otherlv_10= 'dashboard:' ( (lv_dashboard_11_0= ruleDashBoard ) ) ) )
            // InternalBiLang.g:79:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_5_0= ruleDataFiltering ) ) ( (lv_datafiltering_6_0= ruleDataFiltering ) )* )? ( ( (lv_fileextractor_7_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )* )? )* otherlv_10= 'dashboard:' ( (lv_dashboard_11_0= ruleDashBoard ) ) )
            {
            // InternalBiLang.g:79:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_5_0= ruleDataFiltering ) ) ( (lv_datafiltering_6_0= ruleDataFiltering ) )* )? ( ( (lv_fileextractor_7_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )* )? )* otherlv_10= 'dashboard:' ( (lv_dashboard_11_0= ruleDashBoard ) ) )
            // InternalBiLang.g:80:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_5_0= ruleDataFiltering ) ) ( (lv_datafiltering_6_0= ruleDataFiltering ) )* )? ( ( (lv_fileextractor_7_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )* )? )* otherlv_10= 'dashboard:' ( (lv_dashboard_11_0= ruleDashBoard ) )
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

            // InternalBiLang.g:129:3: ( ( (lv_datafiltering_5_0= ruleDataFiltering ) ) ( (lv_datafiltering_6_0= ruleDataFiltering ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBiLang.g:130:4: ( (lv_datafiltering_5_0= ruleDataFiltering ) ) ( (lv_datafiltering_6_0= ruleDataFiltering ) )*
                    {
                    // InternalBiLang.g:130:4: ( (lv_datafiltering_5_0= ruleDataFiltering ) )
                    // InternalBiLang.g:131:5: (lv_datafiltering_5_0= ruleDataFiltering )
                    {
                    // InternalBiLang.g:131:5: (lv_datafiltering_5_0= ruleDataFiltering )
                    // InternalBiLang.g:132:6: lv_datafiltering_5_0= ruleDataFiltering
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalBiLang.g:149:4: ( (lv_datafiltering_6_0= ruleDataFiltering ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBiLang.g:150:5: (lv_datafiltering_6_0= ruleDataFiltering )
                    	    {
                    	    // InternalBiLang.g:150:5: (lv_datafiltering_6_0= ruleDataFiltering )
                    	    // InternalBiLang.g:151:6: lv_datafiltering_6_0= ruleDataFiltering
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_datafiltering_6_0=ruleDataFiltering();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"datafiltering",
                    	    							lv_datafiltering_6_0,
                    	    							"ucal3ia.bilang.BiLang.DataFiltering");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBiLang.g:169:3: ( ( (lv_fileextractor_7_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )* )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBiLang.g:170:4: ( (lv_fileextractor_7_0= ruleFileExtractor ) ) ( ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )* )?
            	    {
            	    // InternalBiLang.g:170:4: ( (lv_fileextractor_7_0= ruleFileExtractor ) )
            	    // InternalBiLang.g:171:5: (lv_fileextractor_7_0= ruleFileExtractor )
            	    {
            	    // InternalBiLang.g:171:5: (lv_fileextractor_7_0= ruleFileExtractor )
            	    // InternalBiLang.g:172:6: lv_fileextractor_7_0= ruleFileExtractor
            	    {

            	    						newCompositeNode(grammarAccess.getTaskAccess().getFileextractorFileExtractorParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_fileextractor_7_0=ruleFileExtractor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fileextractor",
            	    							lv_fileextractor_7_0,
            	    							"ucal3ia.bilang.BiLang.FileExtractor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBiLang.g:189:4: ( ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )* )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==18) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalBiLang.g:190:5: ( (lv_datafiltering_8_0= ruleDataFiltering ) ) ( (lv_datafiltering_9_0= ruleDataFiltering ) )*
            	            {
            	            // InternalBiLang.g:190:5: ( (lv_datafiltering_8_0= ruleDataFiltering ) )
            	            // InternalBiLang.g:191:6: (lv_datafiltering_8_0= ruleDataFiltering )
            	            {
            	            // InternalBiLang.g:191:6: (lv_datafiltering_8_0= ruleDataFiltering )
            	            // InternalBiLang.g:192:7: lv_datafiltering_8_0= ruleDataFiltering
            	            {

            	            							newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_0_0());
            	            						
            	            pushFollow(FOLLOW_7);
            	            lv_datafiltering_8_0=ruleDataFiltering();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTaskRule());
            	            							}
            	            							add(
            	            								current,
            	            								"datafiltering",
            	            								lv_datafiltering_8_0,
            	            								"ucal3ia.bilang.BiLang.DataFiltering");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }

            	            // InternalBiLang.g:209:5: ( (lv_datafiltering_9_0= ruleDataFiltering ) )*
            	            loop3:
            	            do {
            	                int alt3=2;
            	                int LA3_0 = input.LA(1);

            	                if ( (LA3_0==18) ) {
            	                    alt3=1;
            	                }


            	                switch (alt3) {
            	            	case 1 :
            	            	    // InternalBiLang.g:210:6: (lv_datafiltering_9_0= ruleDataFiltering )
            	            	    {
            	            	    // InternalBiLang.g:210:6: (lv_datafiltering_9_0= ruleDataFiltering )
            	            	    // InternalBiLang.g:211:7: lv_datafiltering_9_0= ruleDataFiltering
            	            	    {

            	            	    							newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_1_0());
            	            	    						
            	            	    pushFollow(FOLLOW_7);
            	            	    lv_datafiltering_9_0=ruleDataFiltering();

            	            	    state._fsp--;


            	            	    							if (current==null) {
            	            	    								current = createModelElementForParent(grammarAccess.getTaskRule());
            	            	    							}
            	            	    							add(
            	            	    								current,
            	            	    								"datafiltering",
            	            	    								lv_datafiltering_9_0,
            	            	    								"ucal3ia.bilang.BiLang.DataFiltering");
            	            	    							afterParserOrEnumRuleCall();
            	            	    						

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop3;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getDashboardKeyword_7());
            		
            // InternalBiLang.g:234:3: ( (lv_dashboard_11_0= ruleDashBoard ) )
            // InternalBiLang.g:235:4: (lv_dashboard_11_0= ruleDashBoard )
            {
            // InternalBiLang.g:235:4: (lv_dashboard_11_0= ruleDashBoard )
            // InternalBiLang.g:236:5: lv_dashboard_11_0= ruleDashBoard
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getDashboardDashBoardParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_dashboard_11_0=ruleDashBoard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"dashboard",
            						lv_dashboard_11_0,
            						"ucal3ia.bilang.BiLang.DashBoard");
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleFileExtractor"
    // InternalBiLang.g:257:1: entryRuleFileExtractor returns [EObject current=null] : iv_ruleFileExtractor= ruleFileExtractor EOF ;
    public final EObject entryRuleFileExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileExtractor = null;


        try {
            // InternalBiLang.g:257:54: (iv_ruleFileExtractor= ruleFileExtractor EOF )
            // InternalBiLang.g:258:2: iv_ruleFileExtractor= ruleFileExtractor EOF
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
    // InternalBiLang.g:264:1: ruleFileExtractor returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )? ) ;
    public final EObject ruleFileExtractor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_path_2_0 = null;

        EObject lv_nullreplacement_4_0 = null;

        EObject lv_nullreplacement_6_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:270:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )? ) )
            // InternalBiLang.g:271:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )? )
            {
            // InternalBiLang.g:271:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )? )
            // InternalBiLang.g:272:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )?
            {
            // InternalBiLang.g:272:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBiLang.g:273:4: (lv_name_0_0= ruleEString )
            {
            // InternalBiLang.g:273:4: (lv_name_0_0= ruleEString )
            // InternalBiLang.g:274:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFileExtractorAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileExtractorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFileExtractorAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalBiLang.g:295:3: ( (lv_path_2_0= ruleEString ) )
            // InternalBiLang.g:296:4: (lv_path_2_0= ruleEString )
            {
            // InternalBiLang.g:296:4: (lv_path_2_0= ruleEString )
            // InternalBiLang.g:297:5: lv_path_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFileExtractorAccess().getPathEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_path_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileExtractorRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_2_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:314:3: (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBiLang.g:315:4: otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )*
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getFileExtractorAccess().getNullReplacementKeyword_3_0());
                    			
                    // InternalBiLang.g:319:4: ( (lv_nullreplacement_4_0= ruleNullReplacement ) )
                    // InternalBiLang.g:320:5: (lv_nullreplacement_4_0= ruleNullReplacement )
                    {
                    // InternalBiLang.g:320:5: (lv_nullreplacement_4_0= ruleNullReplacement )
                    // InternalBiLang.g:321:6: lv_nullreplacement_4_0= ruleNullReplacement
                    {

                    						newCompositeNode(grammarAccess.getFileExtractorAccess().getNullreplacementNullReplacementParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_nullreplacement_4_0=ruleNullReplacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileExtractorRule());
                    						}
                    						add(
                    							current,
                    							"nullreplacement",
                    							lv_nullreplacement_4_0,
                    							"ucal3ia.bilang.BiLang.NullReplacement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBiLang.g:338:4: (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBiLang.g:339:5: otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFileExtractorAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalBiLang.g:343:5: ( (lv_nullreplacement_6_0= ruleNullReplacement ) )
                    	    // InternalBiLang.g:344:6: (lv_nullreplacement_6_0= ruleNullReplacement )
                    	    {
                    	    // InternalBiLang.g:344:6: (lv_nullreplacement_6_0= ruleNullReplacement )
                    	    // InternalBiLang.g:345:7: lv_nullreplacement_6_0= ruleNullReplacement
                    	    {

                    	    							newCompositeNode(grammarAccess.getFileExtractorAccess().getNullreplacementNullReplacementParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_nullreplacement_6_0=ruleNullReplacement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFileExtractorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nullreplacement",
                    	    								lv_nullreplacement_6_0,
                    	    								"ucal3ia.bilang.BiLang.NullReplacement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // $ANTLR end "ruleFileExtractor"


    // $ANTLR start "entryRuleFilteringStep"
    // InternalBiLang.g:368:1: entryRuleFilteringStep returns [EObject current=null] : iv_ruleFilteringStep= ruleFilteringStep EOF ;
    public final EObject entryRuleFilteringStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteringStep = null;


        try {
            // InternalBiLang.g:368:54: (iv_ruleFilteringStep= ruleFilteringStep EOF )
            // InternalBiLang.g:369:2: iv_ruleFilteringStep= ruleFilteringStep EOF
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
    // InternalBiLang.g:375:1: ruleFilteringStep returns [EObject current=null] : (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering ) ;
    public final EObject ruleFilteringStep() throws RecognitionException {
        EObject current = null;

        EObject this_QuantitativeFiltering_0 = null;

        EObject this_QualitativeFiltering_1 = null;



        	enterRule();

        try {
            // InternalBiLang.g:381:2: ( (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering ) )
            // InternalBiLang.g:382:2: (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering )
            {
            // InternalBiLang.g:382:2: (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==26||(LA8_1>=60 && LA8_1<=63)) ) {
                    alt8=1;
                }
                else if ( ((LA8_1>=54 && LA8_1<=55)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==26||(LA8_2>=60 && LA8_2<=63)) ) {
                    alt8=1;
                }
                else if ( ((LA8_2>=54 && LA8_2<=55)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBiLang.g:383:3: this_QuantitativeFiltering_0= ruleQuantitativeFiltering
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
                    // InternalBiLang.g:392:3: this_QualitativeFiltering_1= ruleQualitativeFiltering
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
    // InternalBiLang.g:404:1: entryRulePreprocessingStep returns [EObject current=null] : iv_rulePreprocessingStep= rulePreprocessingStep EOF ;
    public final EObject entryRulePreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreprocessingStep = null;


        try {
            // InternalBiLang.g:404:58: (iv_rulePreprocessingStep= rulePreprocessingStep EOF )
            // InternalBiLang.g:405:2: iv_rulePreprocessingStep= rulePreprocessingStep EOF
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
    // InternalBiLang.g:411:1: rulePreprocessingStep returns [EObject current=null] : (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation ) ;
    public final EObject rulePreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject this_MathOperation_0 = null;

        EObject this_ColReference_1 = null;

        EObject this_StatisticalOperation_2 = null;



        	enterRule();

        try {
            // InternalBiLang.g:417:2: ( (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation ) )
            // InternalBiLang.g:418:2: (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation )
            {
            // InternalBiLang.g:418:2: (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==26) ) {
                    alt9=1;
                }
                else if ( (LA9_1==EOF||(LA9_1>=RULE_ID && LA9_1<=RULE_STRING)||LA9_1==14||(LA9_1>=17 && LA9_1<=18)||LA9_1==21||(LA9_1>=30 && LA9_1<=31)||(LA9_1>=48 && LA9_1<=50)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==26) ) {
                    alt9=1;
                }
                else if ( (LA9_2==EOF||(LA9_2>=RULE_ID && LA9_2<=RULE_STRING)||LA9_2==14||(LA9_2>=17 && LA9_2<=18)||LA9_2==21||(LA9_2>=30 && LA9_2<=31)||(LA9_2>=48 && LA9_2<=50)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
            case 28:
                {
                alt9=1;
                }
                break;
            case 51:
            case 52:
            case 53:
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
                    // InternalBiLang.g:419:3: this_MathOperation_0= ruleMathOperation
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
                    // InternalBiLang.g:428:3: this_ColReference_1= ruleColReference
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
                    // InternalBiLang.g:437:3: this_StatisticalOperation_2= ruleStatisticalOperation
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
    // InternalBiLang.g:449:1: entryRulePlot returns [EObject current=null] : iv_rulePlot= rulePlot EOF ;
    public final EObject entryRulePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlot = null;


        try {
            // InternalBiLang.g:449:45: (iv_rulePlot= rulePlot EOF )
            // InternalBiLang.g:450:2: iv_rulePlot= rulePlot EOF
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
    // InternalBiLang.g:456:1: rulePlot returns [EObject current=null] : (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot ) ;
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
            // InternalBiLang.g:462:2: ( (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot ) )
            // InternalBiLang.g:463:2: (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot )
            {
            // InternalBiLang.g:463:2: (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 46:
                {
                alt10=4;
                }
                break;
            case 45:
                {
                alt10=5;
                }
                break;
            case 47:
                {
                alt10=6;
                }
                break;
            case 44:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBiLang.g:464:3: this_BarPlot_0= ruleBarPlot
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
                    // InternalBiLang.g:473:3: this_LinePlot_1= ruleLinePlot
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
                    // InternalBiLang.g:482:3: this_DonutPlot_2= ruleDonutPlot
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
                    // InternalBiLang.g:491:3: this_ScatterPlot_3= ruleScatterPlot
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
                    // InternalBiLang.g:500:3: this_PolarPlot_4= rulePolarPlot
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
                    // InternalBiLang.g:509:3: this_RadarPlot_5= ruleRadarPlot
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
                    // InternalBiLang.g:518:3: this_PiePlot_6= rulePiePlot
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
    // InternalBiLang.g:530:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBiLang.g:530:47: (iv_ruleEString= ruleEString EOF )
            // InternalBiLang.g:531:2: iv_ruleEString= ruleEString EOF
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
    // InternalBiLang.g:537:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:543:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBiLang.g:544:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBiLang.g:544:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBiLang.g:545:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBiLang.g:553:3: this_ID_1= RULE_ID
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
    // InternalBiLang.g:564:1: entryRuleDataFiltering returns [EObject current=null] : iv_ruleDataFiltering= ruleDataFiltering EOF ;
    public final EObject entryRuleDataFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFiltering = null;


        try {
            // InternalBiLang.g:564:54: (iv_ruleDataFiltering= ruleDataFiltering EOF )
            // InternalBiLang.g:565:2: iv_ruleDataFiltering= ruleDataFiltering EOF
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
    // InternalBiLang.g:571:1: ruleDataFiltering returns [EObject current=null] : (otherlv_0= '->' ( ( ruleEString ) ) ( (otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )* )? (otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )* )? (otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )* )? ) ) ;
    public final EObject ruleDataFiltering() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_filteringstep_3_0 = null;

        EObject lv_filteringstep_5_0 = null;

        EObject lv_processingstep_7_0 = null;

        EObject lv_processingstep_9_0 = null;

        EObject lv_countpreprocessingstep_11_0 = null;

        EObject lv_countpreprocessingstep_13_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:577:2: ( (otherlv_0= '->' ( ( ruleEString ) ) ( (otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )* )? (otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )* )? (otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )* )? ) ) )
            // InternalBiLang.g:578:2: (otherlv_0= '->' ( ( ruleEString ) ) ( (otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )* )? (otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )* )? (otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )* )? ) )
            {
            // InternalBiLang.g:578:2: (otherlv_0= '->' ( ( ruleEString ) ) ( (otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )* )? (otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )* )? (otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )* )? ) )
            // InternalBiLang.g:579:3: otherlv_0= '->' ( ( ruleEString ) ) ( (otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )* )? (otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )* )? (otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )* )? )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFilteringAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalBiLang.g:583:3: ( ( ruleEString ) )
            // InternalBiLang.g:584:4: ( ruleEString )
            {
            // InternalBiLang.g:584:4: ( ruleEString )
            // InternalBiLang.g:585:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFilteringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:599:3: ( (otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )* )? (otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )* )? (otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )* )? )
            // InternalBiLang.g:600:4: (otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )* )? (otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )* )? (otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )* )?
            {
            // InternalBiLang.g:600:4: (otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBiLang.g:601:5: otherlv_2= 'filtering=' ( (lv_filteringstep_3_0= ruleFilteringStep ) ) (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )*
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getDataFilteringAccess().getFilteringKeyword_2_0_0());
                    				
                    // InternalBiLang.g:605:5: ( (lv_filteringstep_3_0= ruleFilteringStep ) )
                    // InternalBiLang.g:606:6: (lv_filteringstep_3_0= ruleFilteringStep )
                    {
                    // InternalBiLang.g:606:6: (lv_filteringstep_3_0= ruleFilteringStep )
                    // InternalBiLang.g:607:7: lv_filteringstep_3_0= ruleFilteringStep
                    {

                    							newCompositeNode(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_filteringstep_3_0=ruleFilteringStep();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    							}
                    							add(
                    								current,
                    								"filteringstep",
                    								lv_filteringstep_3_0,
                    								"ucal3ia.bilang.BiLang.FilteringStep");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBiLang.g:624:5: (otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBiLang.g:625:6: otherlv_4= ',' ( (lv_filteringstep_5_0= ruleFilteringStep ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_6); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getDataFilteringAccess().getCommaKeyword_2_0_2_0());
                    	    					
                    	    // InternalBiLang.g:629:6: ( (lv_filteringstep_5_0= ruleFilteringStep ) )
                    	    // InternalBiLang.g:630:7: (lv_filteringstep_5_0= ruleFilteringStep )
                    	    {
                    	    // InternalBiLang.g:630:7: (lv_filteringstep_5_0= ruleFilteringStep )
                    	    // InternalBiLang.g:631:8: lv_filteringstep_5_0= ruleFilteringStep
                    	    {

                    	    								newCompositeNode(grammarAccess.getDataFilteringAccess().getFilteringstepFilteringStepParserRuleCall_2_0_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_12);
                    	    lv_filteringstep_5_0=ruleFilteringStep();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"filteringstep",
                    	    									lv_filteringstep_5_0,
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
                    break;

            }

            // InternalBiLang.g:650:4: (otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:651:5: otherlv_6= 'processing=' ( (lv_processingstep_7_0= rulePreprocessingStep ) ) (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )*
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_13); 

                    					newLeafNode(otherlv_6, grammarAccess.getDataFilteringAccess().getProcessingKeyword_2_1_0());
                    				
                    // InternalBiLang.g:655:5: ( (lv_processingstep_7_0= rulePreprocessingStep ) )
                    // InternalBiLang.g:656:6: (lv_processingstep_7_0= rulePreprocessingStep )
                    {
                    // InternalBiLang.g:656:6: (lv_processingstep_7_0= rulePreprocessingStep )
                    // InternalBiLang.g:657:7: lv_processingstep_7_0= rulePreprocessingStep
                    {

                    							newCompositeNode(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_processingstep_7_0=rulePreprocessingStep();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    							}
                    							add(
                    								current,
                    								"processingstep",
                    								lv_processingstep_7_0,
                    								"ucal3ia.bilang.BiLang.PreprocessingStep");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBiLang.g:674:5: (otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBiLang.g:675:6: otherlv_8= ',' ( (lv_processingstep_9_0= rulePreprocessingStep ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_13); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getDataFilteringAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalBiLang.g:679:6: ( (lv_processingstep_9_0= rulePreprocessingStep ) )
                    	    // InternalBiLang.g:680:7: (lv_processingstep_9_0= rulePreprocessingStep )
                    	    {
                    	    // InternalBiLang.g:680:7: (lv_processingstep_9_0= rulePreprocessingStep )
                    	    // InternalBiLang.g:681:8: lv_processingstep_9_0= rulePreprocessingStep
                    	    {

                    	    								newCompositeNode(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
                    	    lv_processingstep_9_0=rulePreprocessingStep();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"processingstep",
                    	    									lv_processingstep_9_0,
                    	    									"ucal3ia.bilang.BiLang.PreprocessingStep");
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

            // InternalBiLang.g:700:4: (otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBiLang.g:701:5: otherlv_10= 'count=' ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) ) (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )*
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_6); 

                    					newLeafNode(otherlv_10, grammarAccess.getDataFilteringAccess().getCountKeyword_2_2_0());
                    				
                    // InternalBiLang.g:705:5: ( (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep ) )
                    // InternalBiLang.g:706:6: (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep )
                    {
                    // InternalBiLang.g:706:6: (lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep )
                    // InternalBiLang.g:707:7: lv_countpreprocessingstep_11_0= ruleCountPreprocessingStep
                    {

                    							newCompositeNode(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepCountPreprocessingStepParserRuleCall_2_2_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_countpreprocessingstep_11_0=ruleCountPreprocessingStep();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    							}
                    							add(
                    								current,
                    								"countpreprocessingstep",
                    								lv_countpreprocessingstep_11_0,
                    								"ucal3ia.bilang.BiLang.CountPreprocessingStep");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBiLang.g:724:5: (otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==17) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBiLang.g:725:6: otherlv_12= ',' ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_6); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getDataFilteringAccess().getCommaKeyword_2_2_2_0());
                    	    					
                    	    // InternalBiLang.g:729:6: ( (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep ) )
                    	    // InternalBiLang.g:730:7: (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep )
                    	    {
                    	    // InternalBiLang.g:730:7: (lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep )
                    	    // InternalBiLang.g:731:8: lv_countpreprocessingstep_13_0= ruleCountPreprocessingStep
                    	    {

                    	    								newCompositeNode(grammarAccess.getDataFilteringAccess().getCountpreprocessingstepCountPreprocessingStepParserRuleCall_2_2_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_countpreprocessingstep_13_0=ruleCountPreprocessingStep();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getDataFilteringRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"countpreprocessingstep",
                    	    									lv_countpreprocessingstep_13_0,
                    	    									"ucal3ia.bilang.BiLang.CountPreprocessingStep");
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


    // $ANTLR start "entryRuleCountPreprocessingStep"
    // InternalBiLang.g:755:1: entryRuleCountPreprocessingStep returns [EObject current=null] : iv_ruleCountPreprocessingStep= ruleCountPreprocessingStep EOF ;
    public final EObject entryRuleCountPreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountPreprocessingStep = null;


        try {
            // InternalBiLang.g:755:63: (iv_ruleCountPreprocessingStep= ruleCountPreprocessingStep EOF )
            // InternalBiLang.g:756:2: iv_ruleCountPreprocessingStep= ruleCountPreprocessingStep EOF
            {
             newCompositeNode(grammarAccess.getCountPreprocessingStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountPreprocessingStep=ruleCountPreprocessingStep();

            state._fsp--;

             current =iv_ruleCountPreprocessingStep; 
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
    // $ANTLR end "entryRuleCountPreprocessingStep"


    // $ANTLR start "ruleCountPreprocessingStep"
    // InternalBiLang.g:762:1: ruleCountPreprocessingStep returns [EObject current=null] : ( ( (lv_axis_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_countqualistatement_2_0= ruleCountQualiStatement ) )* | ( (lv_countquantistatement_3_0= ruleCountQuantiStatement ) )* ) otherlv_4= '}=' ( (lv_reference_5_0= ruleEString ) ) ) ;
    public final EObject ruleCountPreprocessingStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_axis_0_0 = null;

        EObject lv_countqualistatement_2_0 = null;

        EObject lv_countquantistatement_3_0 = null;

        AntlrDatatypeRuleToken lv_reference_5_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:768:2: ( ( ( (lv_axis_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_countqualistatement_2_0= ruleCountQualiStatement ) )* | ( (lv_countquantistatement_3_0= ruleCountQuantiStatement ) )* ) otherlv_4= '}=' ( (lv_reference_5_0= ruleEString ) ) ) )
            // InternalBiLang.g:769:2: ( ( (lv_axis_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_countqualistatement_2_0= ruleCountQualiStatement ) )* | ( (lv_countquantistatement_3_0= ruleCountQuantiStatement ) )* ) otherlv_4= '}=' ( (lv_reference_5_0= ruleEString ) ) )
            {
            // InternalBiLang.g:769:2: ( ( (lv_axis_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_countqualistatement_2_0= ruleCountQualiStatement ) )* | ( (lv_countquantistatement_3_0= ruleCountQuantiStatement ) )* ) otherlv_4= '}=' ( (lv_reference_5_0= ruleEString ) ) )
            // InternalBiLang.g:770:3: ( (lv_axis_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_countqualistatement_2_0= ruleCountQualiStatement ) )* | ( (lv_countquantistatement_3_0= ruleCountQuantiStatement ) )* ) otherlv_4= '}=' ( (lv_reference_5_0= ruleEString ) )
            {
            // InternalBiLang.g:770:3: ( (lv_axis_0_0= ruleEString ) )
            // InternalBiLang.g:771:4: (lv_axis_0_0= ruleEString )
            {
            // InternalBiLang.g:771:4: (lv_axis_0_0= ruleEString )
            // InternalBiLang.g:772:5: lv_axis_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCountPreprocessingStepAccess().getAxisEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_axis_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountPreprocessingStepRule());
            					}
            					set(
            						current,
            						"axis",
            						lv_axis_0_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getCountPreprocessingStepAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBiLang.g:793:3: ( ( (lv_countqualistatement_2_0= ruleCountQualiStatement ) )* | ( (lv_countquantistatement_3_0= ruleCountQuantiStatement ) )* )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
                {
                alt20=1;
                }
                break;
            case 23:
                {
                alt20=1;
                }
                break;
            case RULE_INT:
            case 26:
            case 31:
            case 32:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalBiLang.g:794:4: ( (lv_countqualistatement_2_0= ruleCountQualiStatement ) )*
                    {
                    // InternalBiLang.g:794:4: ( (lv_countqualistatement_2_0= ruleCountQualiStatement ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=54 && LA18_0<=55)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBiLang.g:795:5: (lv_countqualistatement_2_0= ruleCountQualiStatement )
                    	    {
                    	    // InternalBiLang.g:795:5: (lv_countqualistatement_2_0= ruleCountQualiStatement )
                    	    // InternalBiLang.g:796:6: lv_countqualistatement_2_0= ruleCountQualiStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getCountPreprocessingStepAccess().getCountqualistatementCountQualiStatementParserRuleCall_2_0_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_countqualistatement_2_0=ruleCountQualiStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCountPreprocessingStepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"countqualistatement",
                    	    							lv_countqualistatement_2_0,
                    	    							"ucal3ia.bilang.BiLang.CountQualiStatement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:814:4: ( (lv_countquantistatement_3_0= ruleCountQuantiStatement ) )*
                    {
                    // InternalBiLang.g:814:4: ( (lv_countquantistatement_3_0= ruleCountQuantiStatement ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_INT||LA19_0==26||(LA19_0>=31 && LA19_0<=32)||(LA19_0>=60 && LA19_0<=63)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalBiLang.g:815:5: (lv_countquantistatement_3_0= ruleCountQuantiStatement )
                    	    {
                    	    // InternalBiLang.g:815:5: (lv_countquantistatement_3_0= ruleCountQuantiStatement )
                    	    // InternalBiLang.g:816:6: lv_countquantistatement_3_0= ruleCountQuantiStatement
                    	    {

                    	    						newCompositeNode(grammarAccess.getCountPreprocessingStepAccess().getCountquantistatementCountQuantiStatementParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_countquantistatement_3_0=ruleCountQuantiStatement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCountPreprocessingStepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"countquantistatement",
                    	    							lv_countquantistatement_3_0,
                    	    							"ucal3ia.bilang.BiLang.CountQuantiStatement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getCountPreprocessingStepAccess().getRightCurlyBracketEqualsSignKeyword_3());
            		
            // InternalBiLang.g:838:3: ( (lv_reference_5_0= ruleEString ) )
            // InternalBiLang.g:839:4: (lv_reference_5_0= ruleEString )
            {
            // InternalBiLang.g:839:4: (lv_reference_5_0= ruleEString )
            // InternalBiLang.g:840:5: lv_reference_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCountPreprocessingStepAccess().getReferenceEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_reference_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountPreprocessingStepRule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_5_0,
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
    // $ANTLR end "ruleCountPreprocessingStep"


    // $ANTLR start "entryRuleCountQualiStatement"
    // InternalBiLang.g:861:1: entryRuleCountQualiStatement returns [EObject current=null] : iv_ruleCountQualiStatement= ruleCountQualiStatement EOF ;
    public final EObject entryRuleCountQualiStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountQualiStatement = null;


        try {
            // InternalBiLang.g:861:60: (iv_ruleCountQualiStatement= ruleCountQualiStatement EOF )
            // InternalBiLang.g:862:2: iv_ruleCountQualiStatement= ruleCountQualiStatement EOF
            {
             newCompositeNode(grammarAccess.getCountQualiStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountQualiStatement=ruleCountQualiStatement();

            state._fsp--;

             current =iv_ruleCountQualiStatement; 
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
    // $ANTLR end "entryRuleCountQualiStatement"


    // $ANTLR start "ruleCountQualiStatement"
    // InternalBiLang.g:868:1: ruleCountQualiStatement returns [EObject current=null] : ( ( (lv_qualiOperator_0_0= ruleQualitativeOperator ) ) ( (lv_label_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_statement_3_0= ruleEString ) ) ) ;
    public final EObject ruleCountQualiStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_qualiOperator_0_0 = null;

        AntlrDatatypeRuleToken lv_label_1_0 = null;

        AntlrDatatypeRuleToken lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:874:2: ( ( ( (lv_qualiOperator_0_0= ruleQualitativeOperator ) ) ( (lv_label_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_statement_3_0= ruleEString ) ) ) )
            // InternalBiLang.g:875:2: ( ( (lv_qualiOperator_0_0= ruleQualitativeOperator ) ) ( (lv_label_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_statement_3_0= ruleEString ) ) )
            {
            // InternalBiLang.g:875:2: ( ( (lv_qualiOperator_0_0= ruleQualitativeOperator ) ) ( (lv_label_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_statement_3_0= ruleEString ) ) )
            // InternalBiLang.g:876:3: ( (lv_qualiOperator_0_0= ruleQualitativeOperator ) ) ( (lv_label_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_statement_3_0= ruleEString ) )
            {
            // InternalBiLang.g:876:3: ( (lv_qualiOperator_0_0= ruleQualitativeOperator ) )
            // InternalBiLang.g:877:4: (lv_qualiOperator_0_0= ruleQualitativeOperator )
            {
            // InternalBiLang.g:877:4: (lv_qualiOperator_0_0= ruleQualitativeOperator )
            // InternalBiLang.g:878:5: lv_qualiOperator_0_0= ruleQualitativeOperator
            {

            					newCompositeNode(grammarAccess.getCountQualiStatementAccess().getQualiOperatorQualitativeOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_qualiOperator_0_0=ruleQualitativeOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountQualiStatementRule());
            					}
            					set(
            						current,
            						"qualiOperator",
            						lv_qualiOperator_0_0,
            						"ucal3ia.bilang.BiLang.QualitativeOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:895:3: ( (lv_label_1_0= ruleEString ) )
            // InternalBiLang.g:896:4: (lv_label_1_0= ruleEString )
            {
            // InternalBiLang.g:896:4: (lv_label_1_0= ruleEString )
            // InternalBiLang.g:897:5: lv_label_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCountQualiStatementAccess().getLabelEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_label_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountQualiStatementRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"ucal3ia.bilang.BiLang.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCountQualiStatementAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalBiLang.g:918:3: ( (lv_statement_3_0= ruleEString ) )
            // InternalBiLang.g:919:4: (lv_statement_3_0= ruleEString )
            {
            // InternalBiLang.g:919:4: (lv_statement_3_0= ruleEString )
            // InternalBiLang.g:920:5: lv_statement_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCountQualiStatementAccess().getStatementEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountQualiStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
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
    // $ANTLR end "ruleCountQualiStatement"


    // $ANTLR start "entryRuleCountQuantiStatement"
    // InternalBiLang.g:941:1: entryRuleCountQuantiStatement returns [EObject current=null] : iv_ruleCountQuantiStatement= ruleCountQuantiStatement EOF ;
    public final EObject entryRuleCountQuantiStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountQuantiStatement = null;


        try {
            // InternalBiLang.g:941:61: (iv_ruleCountQuantiStatement= ruleCountQuantiStatement EOF )
            // InternalBiLang.g:942:2: iv_ruleCountQuantiStatement= ruleCountQuantiStatement EOF
            {
             newCompositeNode(grammarAccess.getCountQuantiStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountQuantiStatement=ruleCountQuantiStatement();

            state._fsp--;

             current =iv_ruleCountQuantiStatement; 
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
    // $ANTLR end "entryRuleCountQuantiStatement"


    // $ANTLR start "ruleCountQuantiStatement"
    // InternalBiLang.g:948:1: ruleCountQuantiStatement returns [EObject current=null] : ( ( ( ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) ) ) | ( ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) ) ) ) otherlv_5= '->' ( (lv_statement_6_0= ruleEString ) ) ) ;
    public final EObject ruleCountQuantiStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Enumerator lv_quantiOperator_0_0 = null;

        AntlrDatatypeRuleToken lv_rSide_1_0 = null;

        AntlrDatatypeRuleToken lv_lSide_2_0 = null;

        Enumerator lv_rangeOperator_3_0 = null;

        AntlrDatatypeRuleToken lv_rSide_4_0 = null;

        AntlrDatatypeRuleToken lv_statement_6_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:954:2: ( ( ( ( ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) ) ) | ( ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) ) ) ) otherlv_5= '->' ( (lv_statement_6_0= ruleEString ) ) ) )
            // InternalBiLang.g:955:2: ( ( ( ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) ) ) | ( ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) ) ) ) otherlv_5= '->' ( (lv_statement_6_0= ruleEString ) ) )
            {
            // InternalBiLang.g:955:2: ( ( ( ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) ) ) | ( ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) ) ) ) otherlv_5= '->' ( (lv_statement_6_0= ruleEString ) ) )
            // InternalBiLang.g:956:3: ( ( ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) ) ) | ( ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) ) ) ) otherlv_5= '->' ( (lv_statement_6_0= ruleEString ) )
            {
            // InternalBiLang.g:956:3: ( ( ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) ) ) | ( ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26||(LA21_0>=60 && LA21_0<=63)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_INT||(LA21_0>=31 && LA21_0<=32)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:957:4: ( ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) ) )
                    {
                    // InternalBiLang.g:957:4: ( ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) ) )
                    // InternalBiLang.g:958:5: ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) ) ( (lv_rSide_1_0= ruleEFloat ) )
                    {
                    // InternalBiLang.g:958:5: ( (lv_quantiOperator_0_0= ruleQuantitativeOperator ) )
                    // InternalBiLang.g:959:6: (lv_quantiOperator_0_0= ruleQuantitativeOperator )
                    {
                    // InternalBiLang.g:959:6: (lv_quantiOperator_0_0= ruleQuantitativeOperator )
                    // InternalBiLang.g:960:7: lv_quantiOperator_0_0= ruleQuantitativeOperator
                    {

                    							newCompositeNode(grammarAccess.getCountQuantiStatementAccess().getQuantiOperatorQuantitativeOperatorEnumRuleCall_0_0_0_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_quantiOperator_0_0=ruleQuantitativeOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCountQuantiStatementRule());
                    							}
                    							set(
                    								current,
                    								"quantiOperator",
                    								lv_quantiOperator_0_0,
                    								"ucal3ia.bilang.BiLang.QuantitativeOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBiLang.g:977:5: ( (lv_rSide_1_0= ruleEFloat ) )
                    // InternalBiLang.g:978:6: (lv_rSide_1_0= ruleEFloat )
                    {
                    // InternalBiLang.g:978:6: (lv_rSide_1_0= ruleEFloat )
                    // InternalBiLang.g:979:7: lv_rSide_1_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getCountQuantiStatementAccess().getRSideEFloatParserRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_rSide_1_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCountQuantiStatementRule());
                    							}
                    							set(
                    								current,
                    								"rSide",
                    								lv_rSide_1_0,
                    								"ucal3ia.bilang.BiLang.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:998:4: ( ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) ) )
                    {
                    // InternalBiLang.g:998:4: ( ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) ) )
                    // InternalBiLang.g:999:5: ( (lv_lSide_2_0= ruleEFloat ) ) ( (lv_rangeOperator_3_0= ruleRangeOperator ) ) ( (lv_rSide_4_0= ruleEFloat ) )
                    {
                    // InternalBiLang.g:999:5: ( (lv_lSide_2_0= ruleEFloat ) )
                    // InternalBiLang.g:1000:6: (lv_lSide_2_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1000:6: (lv_lSide_2_0= ruleEFloat )
                    // InternalBiLang.g:1001:7: lv_lSide_2_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getCountQuantiStatementAccess().getLSideEFloatParserRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_lSide_2_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCountQuantiStatementRule());
                    							}
                    							set(
                    								current,
                    								"lSide",
                    								lv_lSide_2_0,
                    								"ucal3ia.bilang.BiLang.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBiLang.g:1018:5: ( (lv_rangeOperator_3_0= ruleRangeOperator ) )
                    // InternalBiLang.g:1019:6: (lv_rangeOperator_3_0= ruleRangeOperator )
                    {
                    // InternalBiLang.g:1019:6: (lv_rangeOperator_3_0= ruleRangeOperator )
                    // InternalBiLang.g:1020:7: lv_rangeOperator_3_0= ruleRangeOperator
                    {

                    							newCompositeNode(grammarAccess.getCountQuantiStatementAccess().getRangeOperatorRangeOperatorEnumRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_rangeOperator_3_0=ruleRangeOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCountQuantiStatementRule());
                    							}
                    							set(
                    								current,
                    								"rangeOperator",
                    								lv_rangeOperator_3_0,
                    								"ucal3ia.bilang.BiLang.RangeOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBiLang.g:1037:5: ( (lv_rSide_4_0= ruleEFloat ) )
                    // InternalBiLang.g:1038:6: (lv_rSide_4_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1038:6: (lv_rSide_4_0= ruleEFloat )
                    // InternalBiLang.g:1039:7: lv_rSide_4_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getCountQuantiStatementAccess().getRSideEFloatParserRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_rSide_4_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCountQuantiStatementRule());
                    							}
                    							set(
                    								current,
                    								"rSide",
                    								lv_rSide_4_0,
                    								"ucal3ia.bilang.BiLang.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCountQuantiStatementAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalBiLang.g:1062:3: ( (lv_statement_6_0= ruleEString ) )
            // InternalBiLang.g:1063:4: (lv_statement_6_0= ruleEString )
            {
            // InternalBiLang.g:1063:4: (lv_statement_6_0= ruleEString )
            // InternalBiLang.g:1064:5: lv_statement_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCountQuantiStatementAccess().getStatementEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCountQuantiStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_6_0,
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
    // $ANTLR end "ruleCountQuantiStatement"


    // $ANTLR start "entryRuleDashBoard"
    // InternalBiLang.g:1085:1: entryRuleDashBoard returns [EObject current=null] : iv_ruleDashBoard= ruleDashBoard EOF ;
    public final EObject entryRuleDashBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashBoard = null;


        try {
            // InternalBiLang.g:1085:50: (iv_ruleDashBoard= ruleDashBoard EOF )
            // InternalBiLang.g:1086:2: iv_ruleDashBoard= ruleDashBoard EOF
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
    // InternalBiLang.g:1092:1: ruleDashBoard returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+ ) ;
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
            // InternalBiLang.g:1098:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+ ) )
            // InternalBiLang.g:1099:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+ )
            {
            // InternalBiLang.g:1099:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+ )
            // InternalBiLang.g:1100:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+
            {
            // InternalBiLang.g:1100:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBiLang.g:1101:4: (lv_name_0_0= ruleEString )
            {
            // InternalBiLang.g:1101:4: (lv_name_0_0= ruleEString )
            // InternalBiLang.g:1102:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDashBoardAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalBiLang.g:1123:3: ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalBiLang.g:1124:4: ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}'
            	    {
            	    // InternalBiLang.g:1124:4: ( ( ruleEString ) )
            	    // InternalBiLang.g:1125:5: ( ruleEString )
            	    {
            	    // InternalBiLang.g:1125:5: ( ruleEString )
            	    // InternalBiLang.g:1126:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDashBoardRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,24,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDashBoardAccess().getPlotsKeyword_2_1());
            	    			
            	    otherlv_4=(Token)match(input,22,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_2_2());
            	    			
            	    // InternalBiLang.g:1148:4: ( (lv_plot_5_0= rulePlot ) )
            	    // InternalBiLang.g:1149:5: (lv_plot_5_0= rulePlot )
            	    {
            	    // InternalBiLang.g:1149:5: (lv_plot_5_0= rulePlot )
            	    // InternalBiLang.g:1150:6: lv_plot_5_0= rulePlot
            	    {

            	    						newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            	    // InternalBiLang.g:1167:4: ( (lv_plot_6_0= rulePlot ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==35||(LA22_0>=41 && LA22_0<=42)||(LA22_0>=44 && LA22_0<=47)) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalBiLang.g:1168:5: (lv_plot_6_0= rulePlot )
            	    	    {
            	    	    // InternalBiLang.g:1168:5: (lv_plot_6_0= rulePlot )
            	    	    // InternalBiLang.g:1169:6: lv_plot_6_0= rulePlot
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_2_4_0());
            	    	    					
            	    	    pushFollow(FOLLOW_24);
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
            	    	    break loop22;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,25,FOLLOW_25); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_2_5());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // $ANTLR end "ruleDashBoard"


    // $ANTLR start "entryRuleNullReplacement"
    // InternalBiLang.g:1195:1: entryRuleNullReplacement returns [EObject current=null] : iv_ruleNullReplacement= ruleNullReplacement EOF ;
    public final EObject entryRuleNullReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullReplacement = null;


        try {
            // InternalBiLang.g:1195:56: (iv_ruleNullReplacement= ruleNullReplacement EOF )
            // InternalBiLang.g:1196:2: iv_ruleNullReplacement= ruleNullReplacement EOF
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
    // InternalBiLang.g:1202:1: ruleNullReplacement returns [EObject current=null] : ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) ) ;
    public final EObject ruleNullReplacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_colName_0_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        EObject lv_statisticaloperation_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1208:2: ( ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) ) )
            // InternalBiLang.g:1209:2: ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) )
            {
            // InternalBiLang.g:1209:2: ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) )
            // InternalBiLang.g:1210:3: ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) )
            {
            // InternalBiLang.g:1210:3: ( (lv_colName_0_0= ruleEString ) )
            // InternalBiLang.g:1211:4: (lv_colName_0_0= ruleEString )
            {
            // InternalBiLang.g:1211:4: (lv_colName_0_0= ruleEString )
            // InternalBiLang.g:1212:5: lv_colName_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNullReplacementAccess().getColNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_1=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNullReplacementAccess().getEqualsSignKeyword_1());
            		
            // InternalBiLang.g:1233:3: ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=51 && LA24_0<=53)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalBiLang.g:1234:4: ( (lv_label_2_0= ruleEString ) )
                    {
                    // InternalBiLang.g:1234:4: ( (lv_label_2_0= ruleEString ) )
                    // InternalBiLang.g:1235:5: (lv_label_2_0= ruleEString )
                    {
                    // InternalBiLang.g:1235:5: (lv_label_2_0= ruleEString )
                    // InternalBiLang.g:1236:6: lv_label_2_0= ruleEString
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
                    // InternalBiLang.g:1254:4: ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) )
                    {
                    // InternalBiLang.g:1254:4: ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) )
                    // InternalBiLang.g:1255:5: (lv_statisticaloperation_3_0= ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:1255:5: (lv_statisticaloperation_3_0= ruleStatisticalOperation )
                    // InternalBiLang.g:1256:6: lv_statisticaloperation_3_0= ruleStatisticalOperation
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
    // InternalBiLang.g:1278:1: entryRuleQuantitativeFiltering returns [EObject current=null] : iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF ;
    public final EObject entryRuleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativeFiltering = null;


        try {
            // InternalBiLang.g:1278:62: (iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:1279:2: iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF
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
    // InternalBiLang.g:1285:1: ruleQuantitativeFiltering returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) ) ;
    public final EObject ruleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_axis_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1291:2: ( ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) ) )
            // InternalBiLang.g:1292:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) )
            {
            // InternalBiLang.g:1292:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) )
            // InternalBiLang.g:1293:3: () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) )
            {
            // InternalBiLang.g:1293:3: ()
            // InternalBiLang.g:1294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1300:3: ( (lv_axis_1_0= ruleEString ) )
            // InternalBiLang.g:1301:4: (lv_axis_1_0= ruleEString )
            {
            // InternalBiLang.g:1301:4: (lv_axis_1_0= ruleEString )
            // InternalBiLang.g:1302:5: lv_axis_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalBiLang.g:1319:3: ( (lv_operator_2_0= ruleQuantitativeOperator ) )
            // InternalBiLang.g:1320:4: (lv_operator_2_0= ruleQuantitativeOperator )
            {
            // InternalBiLang.g:1320:4: (lv_operator_2_0= ruleQuantitativeOperator )
            // InternalBiLang.g:1321:5: lv_operator_2_0= ruleQuantitativeOperator
            {

            					newCompositeNode(grammarAccess.getQuantitativeFilteringAccess().getOperatorQuantitativeOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalBiLang.g:1338:3: ( (lv_values_3_0= ruleEFloat ) )
            // InternalBiLang.g:1339:4: (lv_values_3_0= ruleEFloat )
            {
            // InternalBiLang.g:1339:4: (lv_values_3_0= ruleEFloat )
            // InternalBiLang.g:1340:5: lv_values_3_0= ruleEFloat
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
    // InternalBiLang.g:1361:1: entryRuleQualitativeFiltering returns [EObject current=null] : iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF ;
    public final EObject entryRuleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeFiltering = null;


        try {
            // InternalBiLang.g:1361:61: (iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF )
            // InternalBiLang.g:1362:2: iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF
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
    // InternalBiLang.g:1368:1: ruleQualitativeFiltering returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) ) ;
    public final EObject ruleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_axis_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1374:2: ( ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) ) )
            // InternalBiLang.g:1375:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) )
            {
            // InternalBiLang.g:1375:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) )
            // InternalBiLang.g:1376:3: () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) )
            {
            // InternalBiLang.g:1376:3: ()
            // InternalBiLang.g:1377:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1383:3: ( (lv_axis_1_0= ruleEString ) )
            // InternalBiLang.g:1384:4: (lv_axis_1_0= ruleEString )
            {
            // InternalBiLang.g:1384:4: (lv_axis_1_0= ruleEString )
            // InternalBiLang.g:1385:5: lv_axis_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalBiLang.g:1402:3: ( (lv_operator_2_0= ruleQualitativeOperator ) )
            // InternalBiLang.g:1403:4: (lv_operator_2_0= ruleQualitativeOperator )
            {
            // InternalBiLang.g:1403:4: (lv_operator_2_0= ruleQualitativeOperator )
            // InternalBiLang.g:1404:5: lv_operator_2_0= ruleQualitativeOperator
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

            // InternalBiLang.g:1421:3: ( (lv_labels_3_0= ruleEString ) )
            // InternalBiLang.g:1422:4: (lv_labels_3_0= ruleEString )
            {
            // InternalBiLang.g:1422:4: (lv_labels_3_0= ruleEString )
            // InternalBiLang.g:1423:5: lv_labels_3_0= ruleEString
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
    // InternalBiLang.g:1444:1: entryRuleMathOperation returns [EObject current=null] : iv_ruleMathOperation= ruleMathOperation EOF ;
    public final EObject entryRuleMathOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathOperation = null;


        try {
            // InternalBiLang.g:1444:54: (iv_ruleMathOperation= ruleMathOperation EOF )
            // InternalBiLang.g:1445:2: iv_ruleMathOperation= ruleMathOperation EOF
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
    // InternalBiLang.g:1451:1: ruleMathOperation returns [EObject current=null] : ( ( ( (lv_newColName_0_0= ruleEString ) ) otherlv_1= '=' )? (otherlv_2= '(' )? otherlv_3= 'l' ( (lv_lside_4_0= rulePreprocessingStep ) ) ( (lv_operator_5_0= ruleMathOperator ) ) otherlv_6= 'r' ( (lv_rside_7_0= rulePreprocessingStep ) ) (otherlv_8= ')' )? ) ;
    public final EObject ruleMathOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_newColName_0_0 = null;

        EObject lv_lside_4_0 = null;

        Enumerator lv_operator_5_0 = null;

        EObject lv_rside_7_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1457:2: ( ( ( ( (lv_newColName_0_0= ruleEString ) ) otherlv_1= '=' )? (otherlv_2= '(' )? otherlv_3= 'l' ( (lv_lside_4_0= rulePreprocessingStep ) ) ( (lv_operator_5_0= ruleMathOperator ) ) otherlv_6= 'r' ( (lv_rside_7_0= rulePreprocessingStep ) ) (otherlv_8= ')' )? ) )
            // InternalBiLang.g:1458:2: ( ( ( (lv_newColName_0_0= ruleEString ) ) otherlv_1= '=' )? (otherlv_2= '(' )? otherlv_3= 'l' ( (lv_lside_4_0= rulePreprocessingStep ) ) ( (lv_operator_5_0= ruleMathOperator ) ) otherlv_6= 'r' ( (lv_rside_7_0= rulePreprocessingStep ) ) (otherlv_8= ')' )? )
            {
            // InternalBiLang.g:1458:2: ( ( ( (lv_newColName_0_0= ruleEString ) ) otherlv_1= '=' )? (otherlv_2= '(' )? otherlv_3= 'l' ( (lv_lside_4_0= rulePreprocessingStep ) ) ( (lv_operator_5_0= ruleMathOperator ) ) otherlv_6= 'r' ( (lv_rside_7_0= rulePreprocessingStep ) ) (otherlv_8= ')' )? )
            // InternalBiLang.g:1459:3: ( ( (lv_newColName_0_0= ruleEString ) ) otherlv_1= '=' )? (otherlv_2= '(' )? otherlv_3= 'l' ( (lv_lside_4_0= rulePreprocessingStep ) ) ( (lv_operator_5_0= ruleMathOperator ) ) otherlv_6= 'r' ( (lv_rside_7_0= rulePreprocessingStep ) ) (otherlv_8= ')' )?
            {
            // InternalBiLang.g:1459:3: ( ( (lv_newColName_0_0= ruleEString ) ) otherlv_1= '=' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:1460:4: ( (lv_newColName_0_0= ruleEString ) ) otherlv_1= '='
                    {
                    // InternalBiLang.g:1460:4: ( (lv_newColName_0_0= ruleEString ) )
                    // InternalBiLang.g:1461:5: (lv_newColName_0_0= ruleEString )
                    {
                    // InternalBiLang.g:1461:5: (lv_newColName_0_0= ruleEString )
                    // InternalBiLang.g:1462:6: lv_newColName_0_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMathOperationAccess().getNewColNameEStringParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_newColName_0_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMathOperationRule());
                    						}
                    						set(
                    							current,
                    							"newColName",
                    							lv_newColName_0_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getMathOperationAccess().getEqualsSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalBiLang.g:1484:3: (otherlv_2= '(' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:1485:4: otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getMathOperationAccess().getLKeyword_2());
            		
            // InternalBiLang.g:1494:3: ( (lv_lside_4_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1495:4: (lv_lside_4_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1495:4: (lv_lside_4_0= rulePreprocessingStep )
            // InternalBiLang.g:1496:5: lv_lside_4_0= rulePreprocessingStep
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_lside_4_0=rulePreprocessingStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"lside",
            						lv_lside_4_0,
            						"ucal3ia.bilang.BiLang.PreprocessingStep");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1513:3: ( (lv_operator_5_0= ruleMathOperator ) )
            // InternalBiLang.g:1514:4: (lv_operator_5_0= ruleMathOperator )
            {
            // InternalBiLang.g:1514:4: (lv_operator_5_0= ruleMathOperator )
            // InternalBiLang.g:1515:5: lv_operator_5_0= ruleMathOperator
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
            lv_operator_5_0=ruleMathOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_5_0,
            						"ucal3ia.bilang.BiLang.MathOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getMathOperationAccess().getRKeyword_5());
            		
            // InternalBiLang.g:1536:3: ( (lv_rside_7_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1537:4: (lv_rside_7_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1537:4: (lv_rside_7_0= rulePreprocessingStep )
            // InternalBiLang.g:1538:5: lv_rside_7_0= rulePreprocessingStep
            {

            					newCompositeNode(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_rside_7_0=rulePreprocessingStep();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathOperationRule());
            					}
            					set(
            						current,
            						"rside",
            						lv_rside_7_0,
            						"ucal3ia.bilang.BiLang.PreprocessingStep");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:1555:3: (otherlv_8= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:1556:4: otherlv_8= ')'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getMathOperationAccess().getRightParenthesisKeyword_7());
                    			

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
    // InternalBiLang.g:1565:1: entryRuleColReference returns [EObject current=null] : iv_ruleColReference= ruleColReference EOF ;
    public final EObject entryRuleColReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColReference = null;


        try {
            // InternalBiLang.g:1565:53: (iv_ruleColReference= ruleColReference EOF )
            // InternalBiLang.g:1566:2: iv_ruleColReference= ruleColReference EOF
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
    // InternalBiLang.g:1572:1: ruleColReference returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject ruleColReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1578:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalBiLang.g:1579:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalBiLang.g:1579:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalBiLang.g:1580:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalBiLang.g:1580:3: ()
            // InternalBiLang.g:1581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColReferenceAccess().getColReferenceAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1587:3: ( (lv_target_1_0= ruleEString ) )
            // InternalBiLang.g:1588:4: (lv_target_1_0= ruleEString )
            {
            // InternalBiLang.g:1588:4: (lv_target_1_0= ruleEString )
            // InternalBiLang.g:1589:5: lv_target_1_0= ruleEString
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
    // InternalBiLang.g:1610:1: entryRuleStatisticalOperation returns [EObject current=null] : iv_ruleStatisticalOperation= ruleStatisticalOperation EOF ;
    public final EObject entryRuleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatisticalOperation = null;


        try {
            // InternalBiLang.g:1610:61: (iv_ruleStatisticalOperation= ruleStatisticalOperation EOF )
            // InternalBiLang.g:1611:2: iv_ruleStatisticalOperation= ruleStatisticalOperation EOF
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
    // InternalBiLang.g:1617:1: ruleStatisticalOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_colreference_2_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1623:2: ( ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) )
            // InternalBiLang.g:1624:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            {
            // InternalBiLang.g:1624:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            // InternalBiLang.g:1625:3: ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')'
            {
            // InternalBiLang.g:1625:3: ( (lv_operator_0_0= ruleStatisticalOperator ) )
            // InternalBiLang.g:1626:4: (lv_operator_0_0= ruleStatisticalOperator )
            {
            // InternalBiLang.g:1626:4: (lv_operator_0_0= ruleStatisticalOperator )
            // InternalBiLang.g:1627:5: lv_operator_0_0= ruleStatisticalOperator
            {

            					newCompositeNode(grammarAccess.getStatisticalOperationAccess().getOperatorStatisticalOperatorEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
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
            		
            // InternalBiLang.g:1648:3: ( (lv_colreference_2_0= ruleColReference ) )
            // InternalBiLang.g:1649:4: (lv_colreference_2_0= ruleColReference )
            {
            // InternalBiLang.g:1649:4: (lv_colreference_2_0= ruleColReference )
            // InternalBiLang.g:1650:5: lv_colreference_2_0= ruleColReference
            {

            					newCompositeNode(grammarAccess.getStatisticalOperationAccess().getColreferenceColReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
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
    // InternalBiLang.g:1675:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBiLang.g:1675:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBiLang.g:1676:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBiLang.g:1682:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBiLang.g:1688:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBiLang.g:1689:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBiLang.g:1689:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBiLang.g:1690:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBiLang.g:1690:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBiLang.g:1691:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBiLang.g:1697:3: (this_INT_1= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBiLang.g:1698:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_37); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_38); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_39); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBiLang.g:1718:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=33 && LA32_0<=34)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBiLang.g:1719:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBiLang.g:1719:4: (kw= 'E' | kw= 'e' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==33) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==34) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalBiLang.g:1720:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBiLang.g:1726:5: kw= 'e'
                            {
                            kw=(Token)match(input,34,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBiLang.g:1732:4: (kw= '-' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==31) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalBiLang.g:1733:5: kw= '-'
                            {
                            kw=(Token)match(input,31,FOLLOW_38); 

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
    // InternalBiLang.g:1751:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBiLang.g:1751:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBiLang.g:1752:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBiLang.g:1758:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:1764:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBiLang.g:1765:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBiLang.g:1765:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBiLang.g:1766:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBiLang.g:1766:3: (kw= '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:1767:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_38); 

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
    // InternalBiLang.g:1784:1: entryRuleBarPlot returns [EObject current=null] : iv_ruleBarPlot= ruleBarPlot EOF ;
    public final EObject entryRuleBarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarPlot = null;


        try {
            // InternalBiLang.g:1784:48: (iv_ruleBarPlot= ruleBarPlot EOF )
            // InternalBiLang.g:1785:2: iv_ruleBarPlot= ruleBarPlot EOF
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
    // InternalBiLang.g:1791:1: ruleBarPlot returns [EObject current=null] : ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1797:2: ( ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1798:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1798:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1799:3: () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1799:3: ()
            // InternalBiLang.g:1800:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBarPlotAccess().getBarPlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBarPlotAccess().getBarKeyword_1());
            		
            // InternalBiLang.g:1810:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1811:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1811:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1812:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getBarPlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1836:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1837:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1837:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1838:5: lv_xAxis_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarPlotAccess().getXAxisEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalBiLang.g:1859:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1860:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1860:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1861:5: lv_yAxis_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBarPlotAccess().getYAxisEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalBiLang.g:1878:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:1879:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getBarPlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1883:4: ( (lv_location_9_0= ruleEInt ) )
                    // InternalBiLang.g:1884:5: (lv_location_9_0= ruleEInt )
                    {
                    // InternalBiLang.g:1884:5: (lv_location_9_0= ruleEInt )
                    // InternalBiLang.g:1885:6: lv_location_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getLocationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalBiLang.g:1903:3: (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:1904:4: otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getBarPlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1908:4: ( (lv_colors_11_0= ruleEString ) )
                    // InternalBiLang.g:1909:5: (lv_colors_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1909:5: (lv_colors_11_0= ruleEString )
                    // InternalBiLang.g:1910:6: lv_colors_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBarPlotAccess().getColorsEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalBiLang.g:1928:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:1929:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1933:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1934:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1934:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1935:6: lv_thickness_13_0= ruleEFloat
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
    // InternalBiLang.g:1957:1: entryRuleLinePlot returns [EObject current=null] : iv_ruleLinePlot= ruleLinePlot EOF ;
    public final EObject entryRuleLinePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinePlot = null;


        try {
            // InternalBiLang.g:1957:49: (iv_ruleLinePlot= ruleLinePlot EOF )
            // InternalBiLang.g:1958:2: iv_ruleLinePlot= ruleLinePlot EOF
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
    // InternalBiLang.g:1964:1: ruleLinePlot returns [EObject current=null] : ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1970:2: ( ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1971:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1971:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1972:3: () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1972:3: ()
            // InternalBiLang.g:1973:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinePlotAccess().getLinePlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinePlotAccess().getLineKeyword_1());
            		
            // InternalBiLang.g:1983:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1984:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1984:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1985:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinePlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:2009:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:2010:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:2010:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:2011:5: lv_xAxis_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinePlotAccess().getXAxisEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalBiLang.g:2032:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:2033:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:2033:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:2034:5: lv_yAxis_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLinePlotAccess().getYAxisEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalBiLang.g:2051:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:2052:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinePlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:2056:4: ( (lv_location_9_0= ruleEInt ) )
                    // InternalBiLang.g:2057:5: (lv_location_9_0= ruleEInt )
                    {
                    // InternalBiLang.g:2057:5: (lv_location_9_0= ruleEInt )
                    // InternalBiLang.g:2058:6: lv_location_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getLocationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalBiLang.g:2076:3: (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:2077:4: otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getLinePlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:2081:4: ( (lv_colors_11_0= ruleEString ) )
                    // InternalBiLang.g:2082:5: (lv_colors_11_0= ruleEString )
                    {
                    // InternalBiLang.g:2082:5: (lv_colors_11_0= ruleEString )
                    // InternalBiLang.g:2083:6: lv_colors_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLinePlotAccess().getColorsEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalBiLang.g:2101:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:2102:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:2106:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:2107:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2107:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:2108:6: lv_thickness_13_0= ruleEFloat
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
    // InternalBiLang.g:2130:1: entryRuleDonutPlot returns [EObject current=null] : iv_ruleDonutPlot= ruleDonutPlot EOF ;
    public final EObject entryRuleDonutPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDonutPlot = null;


        try {
            // InternalBiLang.g:2130:50: (iv_ruleDonutPlot= ruleDonutPlot EOF )
            // InternalBiLang.g:2131:2: iv_ruleDonutPlot= ruleDonutPlot EOF
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
    // InternalBiLang.g:2137:1: ruleDonutPlot returns [EObject current=null] : (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )? ) ;
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
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_countID_4_0 = null;

        AntlrDatatypeRuleToken lv_xAxis_6_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_8_0 = null;

        AntlrDatatypeRuleToken lv_location_10_0 = null;

        AntlrDatatypeRuleToken lv_colors_12_0 = null;

        AntlrDatatypeRuleToken lv_thickness_14_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:2143:2: ( (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2144:2: (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2144:2: (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2145:3: otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDonutPlotAccess().getDonutKeyword_0());
            		
            // InternalBiLang.g:2149:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2150:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2150:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2151:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getDonutPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalBiLang.g:2171:3: ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            else if ( (LA40_0==36) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:2172:4: (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) )
                    {
                    // InternalBiLang.g:2172:4: (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) )
                    // InternalBiLang.g:2173:5: otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getDonutPlotAccess().getCountIDKeyword_3_0_0());
                    				
                    // InternalBiLang.g:2177:5: ( (lv_countID_4_0= ruleEString ) )
                    // InternalBiLang.g:2178:6: (lv_countID_4_0= ruleEString )
                    {
                    // InternalBiLang.g:2178:6: (lv_countID_4_0= ruleEString )
                    // InternalBiLang.g:2179:7: lv_countID_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDonutPlotAccess().getCountIDEStringParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_43);
                    lv_countID_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    							}
                    							set(
                    								current,
                    								"countID",
                    								lv_countID_4_0,
                    								"ucal3ia.bilang.BiLang.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2198:4: (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) )
                    {
                    // InternalBiLang.g:2198:4: (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) )
                    // InternalBiLang.g:2199:5: otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getDonutPlotAccess().getXAxKeyword_3_1_0());
                    				
                    // InternalBiLang.g:2203:5: ( (lv_xAxis_6_0= ruleEString ) )
                    // InternalBiLang.g:2204:6: (lv_xAxis_6_0= ruleEString )
                    {
                    // InternalBiLang.g:2204:6: (lv_xAxis_6_0= ruleEString )
                    // InternalBiLang.g:2205:7: lv_xAxis_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDonutPlotAccess().getXAxisEStringParserRuleCall_3_1_1_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_xAxis_6_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    							}
                    							set(
                    								current,
                    								"xAxis",
                    								lv_xAxis_6_0,
                    								"ucal3ia.bilang.BiLang.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,37,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getDonutPlotAccess().getYAKeyword_3_1_2());
                    				
                    // InternalBiLang.g:2226:5: ( (lv_yAxis_8_0= ruleEString ) )
                    // InternalBiLang.g:2227:6: (lv_yAxis_8_0= ruleEString )
                    {
                    // InternalBiLang.g:2227:6: (lv_yAxis_8_0= ruleEString )
                    // InternalBiLang.g:2228:7: lv_yAxis_8_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getDonutPlotAccess().getYAxisEStringParserRuleCall_3_1_3_0());
                    						
                    pushFollow(FOLLOW_43);
                    lv_yAxis_8_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    							}
                    							set(
                    								current,
                    								"yAxis",
                    								lv_yAxis_8_0,
                    								"ucal3ia.bilang.BiLang.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2247:3: (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:2248:4: otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getDonutPlotAccess().getLocKeyword_4_0());
                    			
                    // InternalBiLang.g:2252:4: ( (lv_location_10_0= ruleEInt ) )
                    // InternalBiLang.g:2253:5: (lv_location_10_0= ruleEInt )
                    {
                    // InternalBiLang.g:2253:5: (lv_location_10_0= ruleEInt )
                    // InternalBiLang.g:2254:6: lv_location_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDonutPlotAccess().getLocationEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_location_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_10_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2272:3: (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:2273:4: otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getDonutPlotAccess().getColorsKeyword_5_0());
                    			
                    // InternalBiLang.g:2277:4: ( (lv_colors_12_0= ruleEString ) )
                    // InternalBiLang.g:2278:5: (lv_colors_12_0= ruleEString )
                    {
                    // InternalBiLang.g:2278:5: (lv_colors_12_0= ruleEString )
                    // InternalBiLang.g:2279:6: lv_colors_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDonutPlotAccess().getColorsEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_colors_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_12_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2297:3: (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:2298:4: otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) )
                    {
                    otherlv_13=(Token)match(input,40,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getDonutPlotAccess().getThicknessKeyword_6_0());
                    			
                    // InternalBiLang.g:2302:4: ( (lv_thickness_14_0= ruleEFloat ) )
                    // InternalBiLang.g:2303:5: (lv_thickness_14_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2303:5: (lv_thickness_14_0= ruleEFloat )
                    // InternalBiLang.g:2304:6: lv_thickness_14_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getDonutPlotAccess().getThicknessEFloatParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_14_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDonutPlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_14_0,
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
    // InternalBiLang.g:2326:1: entryRulePiePlot returns [EObject current=null] : iv_rulePiePlot= rulePiePlot EOF ;
    public final EObject entryRulePiePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiePlot = null;


        try {
            // InternalBiLang.g:2326:48: (iv_rulePiePlot= rulePiePlot EOF )
            // InternalBiLang.g:2327:2: iv_rulePiePlot= rulePiePlot EOF
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
    // InternalBiLang.g:2333:1: rulePiePlot returns [EObject current=null] : (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )? ) ;
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
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_countID_4_0 = null;

        AntlrDatatypeRuleToken lv_xAxis_6_0 = null;

        AntlrDatatypeRuleToken lv_yAxis_8_0 = null;

        AntlrDatatypeRuleToken lv_location_10_0 = null;

        AntlrDatatypeRuleToken lv_colors_12_0 = null;

        AntlrDatatypeRuleToken lv_thickness_14_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:2339:2: ( (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2340:2: (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2340:2: (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2341:3: otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) ) (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )? (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )? (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPiePlotAccess().getPieKeyword_0());
            		
            // InternalBiLang.g:2345:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2346:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2346:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2347:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getPiePlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalBiLang.g:2367:3: ( (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) ) | (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            else if ( (LA44_0==36) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:2368:4: (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) )
                    {
                    // InternalBiLang.g:2368:4: (otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) ) )
                    // InternalBiLang.g:2369:5: otherlv_3= 'countID' ( (lv_countID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_6); 

                    					newLeafNode(otherlv_3, grammarAccess.getPiePlotAccess().getCountIDKeyword_3_0_0());
                    				
                    // InternalBiLang.g:2373:5: ( (lv_countID_4_0= ruleEString ) )
                    // InternalBiLang.g:2374:6: (lv_countID_4_0= ruleEString )
                    {
                    // InternalBiLang.g:2374:6: (lv_countID_4_0= ruleEString )
                    // InternalBiLang.g:2375:7: lv_countID_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPiePlotAccess().getCountIDEStringParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_43);
                    lv_countID_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    							}
                    							set(
                    								current,
                    								"countID",
                    								lv_countID_4_0,
                    								"ucal3ia.bilang.BiLang.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2394:4: (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) )
                    {
                    // InternalBiLang.g:2394:4: (otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) ) )
                    // InternalBiLang.g:2395:5: otherlv_5= 'xAx' ( (lv_xAxis_6_0= ruleEString ) ) otherlv_7= 'yA' ( (lv_yAxis_8_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getPiePlotAccess().getXAxKeyword_3_1_0());
                    				
                    // InternalBiLang.g:2399:5: ( (lv_xAxis_6_0= ruleEString ) )
                    // InternalBiLang.g:2400:6: (lv_xAxis_6_0= ruleEString )
                    {
                    // InternalBiLang.g:2400:6: (lv_xAxis_6_0= ruleEString )
                    // InternalBiLang.g:2401:7: lv_xAxis_6_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPiePlotAccess().getXAxisEStringParserRuleCall_3_1_1_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_xAxis_6_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    							}
                    							set(
                    								current,
                    								"xAxis",
                    								lv_xAxis_6_0,
                    								"ucal3ia.bilang.BiLang.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,37,FOLLOW_6); 

                    					newLeafNode(otherlv_7, grammarAccess.getPiePlotAccess().getYAKeyword_3_1_2());
                    				
                    // InternalBiLang.g:2422:5: ( (lv_yAxis_8_0= ruleEString ) )
                    // InternalBiLang.g:2423:6: (lv_yAxis_8_0= ruleEString )
                    {
                    // InternalBiLang.g:2423:6: (lv_yAxis_8_0= ruleEString )
                    // InternalBiLang.g:2424:7: lv_yAxis_8_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPiePlotAccess().getYAxisEStringParserRuleCall_3_1_3_0());
                    						
                    pushFollow(FOLLOW_43);
                    lv_yAxis_8_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    							}
                    							set(
                    								current,
                    								"yAxis",
                    								lv_yAxis_8_0,
                    								"ucal3ia.bilang.BiLang.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2443:3: (otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:2444:4: otherlv_9= 'loc' ( (lv_location_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getPiePlotAccess().getLocKeyword_4_0());
                    			
                    // InternalBiLang.g:2448:4: ( (lv_location_10_0= ruleEInt ) )
                    // InternalBiLang.g:2449:5: (lv_location_10_0= ruleEInt )
                    {
                    // InternalBiLang.g:2449:5: (lv_location_10_0= ruleEInt )
                    // InternalBiLang.g:2450:6: lv_location_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPiePlotAccess().getLocationEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_location_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    						}
                    						set(
                    							current,
                    							"location",
                    							lv_location_10_0,
                    							"ucal3ia.bilang.BiLang.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2468:3: (otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:2469:4: otherlv_11= 'colors' ( (lv_colors_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getPiePlotAccess().getColorsKeyword_5_0());
                    			
                    // InternalBiLang.g:2473:4: ( (lv_colors_12_0= ruleEString ) )
                    // InternalBiLang.g:2474:5: (lv_colors_12_0= ruleEString )
                    {
                    // InternalBiLang.g:2474:5: (lv_colors_12_0= ruleEString )
                    // InternalBiLang.g:2475:6: lv_colors_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPiePlotAccess().getColorsEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_colors_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    						}
                    						set(
                    							current,
                    							"colors",
                    							lv_colors_12_0,
                    							"ucal3ia.bilang.BiLang.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBiLang.g:2493:3: (otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBiLang.g:2494:4: otherlv_13= 'thickness' ( (lv_thickness_14_0= ruleEFloat ) )
                    {
                    otherlv_13=(Token)match(input,40,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getPiePlotAccess().getThicknessKeyword_6_0());
                    			
                    // InternalBiLang.g:2498:4: ( (lv_thickness_14_0= ruleEFloat ) )
                    // InternalBiLang.g:2499:5: (lv_thickness_14_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2499:5: (lv_thickness_14_0= ruleEFloat )
                    // InternalBiLang.g:2500:6: lv_thickness_14_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getPiePlotAccess().getThicknessEFloatParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_thickness_14_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPiePlotRule());
                    						}
                    						set(
                    							current,
                    							"thickness",
                    							lv_thickness_14_0,
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
    // InternalBiLang.g:2522:1: entryRulePolarPlot returns [EObject current=null] : iv_rulePolarPlot= rulePolarPlot EOF ;
    public final EObject entryRulePolarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolarPlot = null;


        try {
            // InternalBiLang.g:2522:50: (iv_rulePolarPlot= rulePolarPlot EOF )
            // InternalBiLang.g:2523:2: iv_rulePolarPlot= rulePolarPlot EOF
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
    // InternalBiLang.g:2529:1: rulePolarPlot returns [EObject current=null] : (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2535:2: ( (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2536:2: (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2536:2: (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2537:3: otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolarPlotAccess().getPolarKeyword_0());
            		
            // InternalBiLang.g:2541:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2542:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2542:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2543:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getPolarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPolarPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2567:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2568:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2568:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2569:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolarPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalBiLang.g:2590:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2591:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2591:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2592:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPolarPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalBiLang.g:2609:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalBiLang.g:2610:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_40); 

                    				newLeafNode(otherlv_7, grammarAccess.getPolarPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2614:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2615:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2615:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2616:6: lv_location_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPolarPlotAccess().getLocationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalBiLang.g:2634:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBiLang.g:2635:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPolarPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2639:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2640:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2640:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2641:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPolarPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalBiLang.g:2659:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==40) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBiLang.g:2660:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getPolarPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2664:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2665:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2665:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2666:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2688:1: entryRuleScatterPlot returns [EObject current=null] : iv_ruleScatterPlot= ruleScatterPlot EOF ;
    public final EObject entryRuleScatterPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScatterPlot = null;


        try {
            // InternalBiLang.g:2688:52: (iv_ruleScatterPlot= ruleScatterPlot EOF )
            // InternalBiLang.g:2689:2: iv_ruleScatterPlot= ruleScatterPlot EOF
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
    // InternalBiLang.g:2695:1: ruleScatterPlot returns [EObject current=null] : (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2701:2: ( (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2702:2: (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2702:2: (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2703:3: otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScatterPlotAccess().getScatterKeyword_0());
            		
            // InternalBiLang.g:2707:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2708:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2708:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2709:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getScatterPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getScatterPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2733:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2734:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2734:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2735:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScatterPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalBiLang.g:2756:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2757:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2757:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2758:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScatterPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalBiLang.g:2775:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBiLang.g:2776:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_40); 

                    				newLeafNode(otherlv_7, grammarAccess.getScatterPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2780:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2781:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2781:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2782:6: lv_location_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getScatterPlotAccess().getLocationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalBiLang.g:2800:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==39) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBiLang.g:2801:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getScatterPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2805:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2806:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2806:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2807:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScatterPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalBiLang.g:2825:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==40) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBiLang.g:2826:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getScatterPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2830:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2831:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2831:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2832:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2854:1: entryRuleRadarPlot returns [EObject current=null] : iv_ruleRadarPlot= ruleRadarPlot EOF ;
    public final EObject entryRuleRadarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadarPlot = null;


        try {
            // InternalBiLang.g:2854:50: (iv_ruleRadarPlot= ruleRadarPlot EOF )
            // InternalBiLang.g:2855:2: iv_ruleRadarPlot= ruleRadarPlot EOF
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
    // InternalBiLang.g:2861:1: ruleRadarPlot returns [EObject current=null] : (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2867:2: ( (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2868:2: (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2868:2: (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2869:3: otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRadarPlotAccess().getRadarKeyword_0());
            		
            // InternalBiLang.g:2873:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2874:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2874:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2875:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getRadarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRadarPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2899:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2900:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2900:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2901:5: lv_xAxis_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarPlotAccess().getXAxisEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalBiLang.g:2922:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2923:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2923:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2924:5: lv_yAxis_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRadarPlotAccess().getYAxisEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalBiLang.g:2941:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==38) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalBiLang.g:2942:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_40); 

                    				newLeafNode(otherlv_7, grammarAccess.getRadarPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2946:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2947:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2947:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2948:6: lv_location_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRadarPlotAccess().getLocationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalBiLang.g:2966:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBiLang.g:2967:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getRadarPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2971:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2972:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2972:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2973:6: lv_colors_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadarPlotAccess().getColorsEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalBiLang.g:2991:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==40) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBiLang.g:2992:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getRadarPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2996:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2997:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2997:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2998:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:3020:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBiLang.g:3026:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalBiLang.g:3027:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalBiLang.g:3027:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt57=1;
                }
                break;
            case 31:
                {
                alt57=2;
                }
                break;
            case 49:
                {
                alt57=3;
                }
                break;
            case 50:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalBiLang.g:3028:3: (enumLiteral_0= '+' )
                    {
                    // InternalBiLang.g:3028:3: (enumLiteral_0= '+' )
                    // InternalBiLang.g:3029:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:3036:3: (enumLiteral_1= '-' )
                    {
                    // InternalBiLang.g:3036:3: (enumLiteral_1= '-' )
                    // InternalBiLang.g:3037:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:3044:3: (enumLiteral_2= '*' )
                    {
                    // InternalBiLang.g:3044:3: (enumLiteral_2= '*' )
                    // InternalBiLang.g:3045:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:3052:3: (enumLiteral_3= '/' )
                    {
                    // InternalBiLang.g:3052:3: (enumLiteral_3= '/' )
                    // InternalBiLang.g:3053:4: enumLiteral_3= '/'
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
    // InternalBiLang.g:3063:1: ruleStatisticalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) ) ;
    public final Enumerator ruleStatisticalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBiLang.g:3069:2: ( ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) ) )
            // InternalBiLang.g:3070:2: ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) )
            {
            // InternalBiLang.g:3070:2: ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt58=1;
                }
                break;
            case 52:
                {
                alt58=2;
                }
                break;
            case 53:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalBiLang.g:3071:3: (enumLiteral_0= 'mean' )
                    {
                    // InternalBiLang.g:3071:3: (enumLiteral_0= 'mean' )
                    // InternalBiLang.g:3072:4: enumLiteral_0= 'mean'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:3079:3: (enumLiteral_1= 'median' )
                    {
                    // InternalBiLang.g:3079:3: (enumLiteral_1= 'median' )
                    // InternalBiLang.g:3080:4: enumLiteral_1= 'median'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:3087:3: (enumLiteral_2= 'std' )
                    {
                    // InternalBiLang.g:3087:3: (enumLiteral_2= 'std' )
                    // InternalBiLang.g:3088:4: enumLiteral_2= 'std'
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
    // InternalBiLang.g:3098:1: ruleQualitativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) ) ;
    public final Enumerator ruleQualitativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:3104:2: ( ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) ) )
            // InternalBiLang.g:3105:2: ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) )
            {
            // InternalBiLang.g:3105:2: ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            else if ( (LA59_0==55) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalBiLang.g:3106:3: (enumLiteral_0= '= ' )
                    {
                    // InternalBiLang.g:3106:3: (enumLiteral_0= '= ' )
                    // InternalBiLang.g:3107:4: enumLiteral_0= '= '
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:3114:3: (enumLiteral_1= '!= ' )
                    {
                    // InternalBiLang.g:3114:3: (enumLiteral_1= '!= ' )
                    // InternalBiLang.g:3115:4: enumLiteral_1= '!= '
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


    // $ANTLR start "ruleRangeOperator"
    // InternalBiLang.g:3125:1: ruleRangeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '[]' ) | (enumLiteral_1= '][' ) | (enumLiteral_2= '[[' ) | (enumLiteral_3= ']]' ) ) ;
    public final Enumerator ruleRangeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBiLang.g:3131:2: ( ( (enumLiteral_0= '[]' ) | (enumLiteral_1= '][' ) | (enumLiteral_2= '[[' ) | (enumLiteral_3= ']]' ) ) )
            // InternalBiLang.g:3132:2: ( (enumLiteral_0= '[]' ) | (enumLiteral_1= '][' ) | (enumLiteral_2= '[[' ) | (enumLiteral_3= ']]' ) )
            {
            // InternalBiLang.g:3132:2: ( (enumLiteral_0= '[]' ) | (enumLiteral_1= '][' ) | (enumLiteral_2= '[[' ) | (enumLiteral_3= ']]' ) )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt60=1;
                }
                break;
            case 57:
                {
                alt60=2;
                }
                break;
            case 58:
                {
                alt60=3;
                }
                break;
            case 59:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalBiLang.g:3133:3: (enumLiteral_0= '[]' )
                    {
                    // InternalBiLang.g:3133:3: (enumLiteral_0= '[]' )
                    // InternalBiLang.g:3134:4: enumLiteral_0= '[]'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorAccess().getLR_INCLUSIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRangeOperatorAccess().getLR_INCLUSIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:3141:3: (enumLiteral_1= '][' )
                    {
                    // InternalBiLang.g:3141:3: (enumLiteral_1= '][' )
                    // InternalBiLang.g:3142:4: enumLiteral_1= ']['
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorAccess().getLR_EXCLUSIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRangeOperatorAccess().getLR_EXCLUSIONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:3149:3: (enumLiteral_2= '[[' )
                    {
                    // InternalBiLang.g:3149:3: (enumLiteral_2= '[[' )
                    // InternalBiLang.g:3150:4: enumLiteral_2= '[['
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorAccess().getL_INCLUSIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRangeOperatorAccess().getL_INCLUSIONEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:3157:3: (enumLiteral_3= ']]' )
                    {
                    // InternalBiLang.g:3157:3: (enumLiteral_3= ']]' )
                    // InternalBiLang.g:3158:4: enumLiteral_3= ']]'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getRangeOperatorAccess().getR_INCLUSIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRangeOperatorAccess().getR_INCLUSIONEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleRangeOperator"


    // $ANTLR start "ruleQuantitativeOperator"
    // InternalBiLang.g:3168:1: ruleQuantitativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) ;
    public final Enumerator ruleQuantitativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalBiLang.g:3174:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) ) )
            // InternalBiLang.g:3175:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            {
            // InternalBiLang.g:3175:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>=' ) )
            int alt61=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt61=1;
                }
                break;
            case 60:
                {
                alt61=2;
                }
                break;
            case 61:
                {
                alt61=3;
                }
                break;
            case 62:
                {
                alt61=4;
                }
                break;
            case 63:
                {
                alt61=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalBiLang.g:3176:3: (enumLiteral_0= '=' )
                    {
                    // InternalBiLang.g:3176:3: (enumLiteral_0= '=' )
                    // InternalBiLang.g:3177:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:3184:3: (enumLiteral_1= '<' )
                    {
                    // InternalBiLang.g:3184:3: (enumLiteral_1= '<' )
                    // InternalBiLang.g:3185:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:3192:3: (enumLiteral_2= '>' )
                    {
                    // InternalBiLang.g:3192:3: (enumLiteral_2= '>' )
                    // InternalBiLang.g:3193:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQuantitativeOperatorAccess().getSUPERIOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:3200:3: (enumLiteral_3= '<=' )
                    {
                    // InternalBiLang.g:3200:3: (enumLiteral_3= '<=' )
                    // InternalBiLang.g:3201:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getINF_EQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQuantitativeOperatorAccess().getINF_EQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBiLang.g:3208:3: (enumLiteral_4= '>=' )
                    {
                    // InternalBiLang.g:3208:3: (enumLiteral_4= '>=' )
                    // InternalBiLang.g:3209:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getSUP_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getQuantitativeOperatorAccess().getSUP_EQUALEnumLiteralDeclaration_4());
                    			

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000044030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000320002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0038000018000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xF0C0000184800040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00C0000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xF000000184800040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xF000000184000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000F60800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000F60802000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0007000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000081000000000L});

}