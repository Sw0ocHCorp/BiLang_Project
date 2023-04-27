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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Task'", "':'", "'load'", "'['", "']'", "'[dashboard:'", "'=>'", "'null replacement->'", "','", "'processing='", "'filtering='", "'plots'", "'{'", "'}'", "'='", "'('", "'l'", "'r'", "')'", "'-'", "'.'", "'E'", "'e'", "'bar'", "'->'", "'xAx'", "'yA'", "'loc'", "'colors'", "'thickness'", "'line'", "'donut'", "'pie'", "'polar'", "'scatter'", "'radar'", "'+'", "'*'", "'/'", "'mean'", "'median'", "'std'", "'= '", "'!= '", "'<'", "'>'"
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
    // InternalBiLang.g:72:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) (otherlv_5= '[' ( (lv_datafiltering_6_0= ruleDataFiltering ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )* otherlv_8= ']' )? ( ( (lv_fileextractor_9_0= ruleFileExtractor ) ) (otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']' )? )* otherlv_14= '[dashboard:' ( (lv_dashboard_15_0= ruleDashBoard ) ) otherlv_16= ']' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_fileextractor_4_0 = null;

        EObject lv_datafiltering_6_0 = null;

        EObject lv_datafiltering_7_0 = null;

        EObject lv_fileextractor_9_0 = null;

        EObject lv_datafiltering_11_0 = null;

        EObject lv_datafiltering_12_0 = null;

        EObject lv_dashboard_15_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:78:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) (otherlv_5= '[' ( (lv_datafiltering_6_0= ruleDataFiltering ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )* otherlv_8= ']' )? ( ( (lv_fileextractor_9_0= ruleFileExtractor ) ) (otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']' )? )* otherlv_14= '[dashboard:' ( (lv_dashboard_15_0= ruleDashBoard ) ) otherlv_16= ']' ) )
            // InternalBiLang.g:79:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) (otherlv_5= '[' ( (lv_datafiltering_6_0= ruleDataFiltering ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )* otherlv_8= ']' )? ( ( (lv_fileextractor_9_0= ruleFileExtractor ) ) (otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']' )? )* otherlv_14= '[dashboard:' ( (lv_dashboard_15_0= ruleDashBoard ) ) otherlv_16= ']' )
            {
            // InternalBiLang.g:79:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) (otherlv_5= '[' ( (lv_datafiltering_6_0= ruleDataFiltering ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )* otherlv_8= ']' )? ( ( (lv_fileextractor_9_0= ruleFileExtractor ) ) (otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']' )? )* otherlv_14= '[dashboard:' ( (lv_dashboard_15_0= ruleDashBoard ) ) otherlv_16= ']' )
            // InternalBiLang.g:80:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= 'load' ( (lv_fileextractor_4_0= ruleFileExtractor ) ) (otherlv_5= '[' ( (lv_datafiltering_6_0= ruleDataFiltering ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )* otherlv_8= ']' )? ( ( (lv_fileextractor_9_0= ruleFileExtractor ) ) (otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']' )? )* otherlv_14= '[dashboard:' ( (lv_dashboard_15_0= ruleDashBoard ) ) otherlv_16= ']'
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

            // InternalBiLang.g:129:3: (otherlv_5= '[' ( (lv_datafiltering_6_0= ruleDataFiltering ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )* otherlv_8= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBiLang.g:130:4: otherlv_5= '[' ( (lv_datafiltering_6_0= ruleDataFiltering ) ) ( (lv_datafiltering_7_0= ruleDataFiltering ) )* otherlv_8= ']'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalBiLang.g:134:4: ( (lv_datafiltering_6_0= ruleDataFiltering ) )
                    // InternalBiLang.g:135:5: (lv_datafiltering_6_0= ruleDataFiltering )
                    {
                    // InternalBiLang.g:135:5: (lv_datafiltering_6_0= ruleDataFiltering )
                    // InternalBiLang.g:136:6: lv_datafiltering_6_0= ruleDataFiltering
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalBiLang.g:153:4: ( (lv_datafiltering_7_0= ruleDataFiltering ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBiLang.g:154:5: (lv_datafiltering_7_0= ruleDataFiltering )
                    	    {
                    	    // InternalBiLang.g:154:5: (lv_datafiltering_7_0= ruleDataFiltering )
                    	    // InternalBiLang.g:155:6: lv_datafiltering_7_0= ruleDataFiltering
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
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

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalBiLang.g:177:3: ( ( (lv_fileextractor_9_0= ruleFileExtractor ) ) (otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']' )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBiLang.g:178:4: ( (lv_fileextractor_9_0= ruleFileExtractor ) ) (otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']' )?
            	    {
            	    // InternalBiLang.g:178:4: ( (lv_fileextractor_9_0= ruleFileExtractor ) )
            	    // InternalBiLang.g:179:5: (lv_fileextractor_9_0= ruleFileExtractor )
            	    {
            	    // InternalBiLang.g:179:5: (lv_fileextractor_9_0= ruleFileExtractor )
            	    // InternalBiLang.g:180:6: lv_fileextractor_9_0= ruleFileExtractor
            	    {

            	    						newCompositeNode(grammarAccess.getTaskAccess().getFileextractorFileExtractorParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_fileextractor_9_0=ruleFileExtractor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fileextractor",
            	    							lv_fileextractor_9_0,
            	    							"ucal3ia.bilang.BiLang.FileExtractor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBiLang.g:197:4: (otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalBiLang.g:198:5: otherlv_10= '[' ( (lv_datafiltering_11_0= ruleDataFiltering ) ) ( (lv_datafiltering_12_0= ruleDataFiltering ) )* otherlv_13= ']'
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_8); 

            	            					newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getLeftSquareBracketKeyword_6_1_0());
            	            				
            	            // InternalBiLang.g:202:5: ( (lv_datafiltering_11_0= ruleDataFiltering ) )
            	            // InternalBiLang.g:203:6: (lv_datafiltering_11_0= ruleDataFiltering )
            	            {
            	            // InternalBiLang.g:203:6: (lv_datafiltering_11_0= ruleDataFiltering )
            	            // InternalBiLang.g:204:7: lv_datafiltering_11_0= ruleDataFiltering
            	            {

            	            							newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_1_0());
            	            						
            	            pushFollow(FOLLOW_9);
            	            lv_datafiltering_11_0=ruleDataFiltering();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getTaskRule());
            	            							}
            	            							add(
            	            								current,
            	            								"datafiltering",
            	            								lv_datafiltering_11_0,
            	            								"ucal3ia.bilang.BiLang.DataFiltering");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }

            	            // InternalBiLang.g:221:5: ( (lv_datafiltering_12_0= ruleDataFiltering ) )*
            	            loop3:
            	            do {
            	                int alt3=2;
            	                int LA3_0 = input.LA(1);

            	                if ( (LA3_0==17) ) {
            	                    alt3=1;
            	                }


            	                switch (alt3) {
            	            	case 1 :
            	            	    // InternalBiLang.g:222:6: (lv_datafiltering_12_0= ruleDataFiltering )
            	            	    {
            	            	    // InternalBiLang.g:222:6: (lv_datafiltering_12_0= ruleDataFiltering )
            	            	    // InternalBiLang.g:223:7: lv_datafiltering_12_0= ruleDataFiltering
            	            	    {

            	            	    							newCompositeNode(grammarAccess.getTaskAccess().getDatafilteringDataFilteringParserRuleCall_6_1_2_0());
            	            	    						
            	            	    pushFollow(FOLLOW_9);
            	            	    lv_datafiltering_12_0=ruleDataFiltering();

            	            	    state._fsp--;


            	            	    							if (current==null) {
            	            	    								current = createModelElementForParent(grammarAccess.getTaskRule());
            	            	    							}
            	            	    							add(
            	            	    								current,
            	            	    								"datafiltering",
            	            	    								lv_datafiltering_12_0,
            	            	    								"ucal3ia.bilang.BiLang.DataFiltering");
            	            	    							afterParserOrEnumRuleCall();
            	            	    						

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop3;
            	                }
            	            } while (true);

            	            otherlv_13=(Token)match(input,15,FOLLOW_10); 

            	            					newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_6_1_3());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getDashboardKeyword_7());
            		
            // InternalBiLang.g:250:3: ( (lv_dashboard_15_0= ruleDashBoard ) )
            // InternalBiLang.g:251:4: (lv_dashboard_15_0= ruleDashBoard )
            {
            // InternalBiLang.g:251:4: (lv_dashboard_15_0= ruleDashBoard )
            // InternalBiLang.g:252:5: lv_dashboard_15_0= ruleDashBoard
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getDashboardDashBoardParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_dashboard_15_0=ruleDashBoard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"dashboard",
            						lv_dashboard_15_0,
            						"ucal3ia.bilang.BiLang.DashBoard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getRightSquareBracketKeyword_9());
            		

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
    // InternalBiLang.g:277:1: entryRuleFileExtractor returns [EObject current=null] : iv_ruleFileExtractor= ruleFileExtractor EOF ;
    public final EObject entryRuleFileExtractor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileExtractor = null;


        try {
            // InternalBiLang.g:277:54: (iv_ruleFileExtractor= ruleFileExtractor EOF )
            // InternalBiLang.g:278:2: iv_ruleFileExtractor= ruleFileExtractor EOF
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
    // InternalBiLang.g:284:1: ruleFileExtractor returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )? ) ;
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
            // InternalBiLang.g:290:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )? ) )
            // InternalBiLang.g:291:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )? )
            {
            // InternalBiLang.g:291:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )? )
            // InternalBiLang.g:292:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( (lv_path_2_0= ruleEString ) ) (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )?
            {
            // InternalBiLang.g:292:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBiLang.g:293:4: (lv_name_0_0= ruleEString )
            {
            // InternalBiLang.g:293:4: (lv_name_0_0= ruleEString )
            // InternalBiLang.g:294:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFileExtractorAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalBiLang.g:315:3: ( (lv_path_2_0= ruleEString ) )
            // InternalBiLang.g:316:4: (lv_path_2_0= ruleEString )
            {
            // InternalBiLang.g:316:4: (lv_path_2_0= ruleEString )
            // InternalBiLang.g:317:5: lv_path_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFileExtractorAccess().getPathEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalBiLang.g:334:3: (otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBiLang.g:335:4: otherlv_3= 'null replacement->' ( (lv_nullreplacement_4_0= ruleNullReplacement ) ) (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getFileExtractorAccess().getNullReplacementKeyword_3_0());
                    			
                    // InternalBiLang.g:339:4: ( (lv_nullreplacement_4_0= ruleNullReplacement ) )
                    // InternalBiLang.g:340:5: (lv_nullreplacement_4_0= ruleNullReplacement )
                    {
                    // InternalBiLang.g:340:5: (lv_nullreplacement_4_0= ruleNullReplacement )
                    // InternalBiLang.g:341:6: lv_nullreplacement_4_0= ruleNullReplacement
                    {

                    						newCompositeNode(grammarAccess.getFileExtractorAccess().getNullreplacementNullReplacementParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalBiLang.g:358:4: (otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBiLang.g:359:5: otherlv_5= ',' ( (lv_nullreplacement_6_0= ruleNullReplacement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFileExtractorAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalBiLang.g:363:5: ( (lv_nullreplacement_6_0= ruleNullReplacement ) )
                    	    // InternalBiLang.g:364:6: (lv_nullreplacement_6_0= ruleNullReplacement )
                    	    {
                    	    // InternalBiLang.g:364:6: (lv_nullreplacement_6_0= ruleNullReplacement )
                    	    // InternalBiLang.g:365:7: lv_nullreplacement_6_0= ruleNullReplacement
                    	    {

                    	    							newCompositeNode(grammarAccess.getFileExtractorAccess().getNullreplacementNullReplacementParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
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
    // InternalBiLang.g:388:1: entryRuleFilteringStep returns [EObject current=null] : iv_ruleFilteringStep= ruleFilteringStep EOF ;
    public final EObject entryRuleFilteringStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteringStep = null;


        try {
            // InternalBiLang.g:388:54: (iv_ruleFilteringStep= ruleFilteringStep EOF )
            // InternalBiLang.g:389:2: iv_ruleFilteringStep= ruleFilteringStep EOF
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
    // InternalBiLang.g:395:1: ruleFilteringStep returns [EObject current=null] : (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering ) ;
    public final EObject ruleFilteringStep() throws RecognitionException {
        EObject current = null;

        EObject this_QuantitativeFiltering_0 = null;

        EObject this_QualitativeFiltering_1 = null;



        	enterRule();

        try {
            // InternalBiLang.g:401:2: ( (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering ) )
            // InternalBiLang.g:402:2: (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering )
            {
            // InternalBiLang.g:402:2: (this_QuantitativeFiltering_0= ruleQuantitativeFiltering | this_QualitativeFiltering_1= ruleQualitativeFiltering )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=53 && LA8_1<=54)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==25||(LA8_1>=55 && LA8_1<=56)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=53 && LA8_2<=54)) ) {
                    alt8=2;
                }
                else if ( (LA8_2==25||(LA8_2>=55 && LA8_2<=56)) ) {
                    alt8=1;
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
                    // InternalBiLang.g:403:3: this_QuantitativeFiltering_0= ruleQuantitativeFiltering
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
                    // InternalBiLang.g:412:3: this_QualitativeFiltering_1= ruleQualitativeFiltering
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
    // InternalBiLang.g:424:1: entryRulePreprocessingStep returns [EObject current=null] : iv_rulePreprocessingStep= rulePreprocessingStep EOF ;
    public final EObject entryRulePreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreprocessingStep = null;


        try {
            // InternalBiLang.g:424:58: (iv_rulePreprocessingStep= rulePreprocessingStep EOF )
            // InternalBiLang.g:425:2: iv_rulePreprocessingStep= rulePreprocessingStep EOF
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
    // InternalBiLang.g:431:1: rulePreprocessingStep returns [EObject current=null] : (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation ) ;
    public final EObject rulePreprocessingStep() throws RecognitionException {
        EObject current = null;

        EObject this_MathOperation_0 = null;

        EObject this_ColReference_1 = null;

        EObject this_StatisticalOperation_2 = null;



        	enterRule();

        try {
            // InternalBiLang.g:437:2: ( (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation ) )
            // InternalBiLang.g:438:2: (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation )
            {
            // InternalBiLang.g:438:2: (this_MathOperation_0= ruleMathOperation | this_ColReference_1= ruleColReference | this_StatisticalOperation_2= ruleStatisticalOperation )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case 50:
            case 51:
            case 52:
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
                    // InternalBiLang.g:439:3: this_MathOperation_0= ruleMathOperation
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
                    // InternalBiLang.g:448:3: this_ColReference_1= ruleColReference
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
                    // InternalBiLang.g:457:3: this_StatisticalOperation_2= ruleStatisticalOperation
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
    // InternalBiLang.g:469:1: entryRulePlot returns [EObject current=null] : iv_rulePlot= rulePlot EOF ;
    public final EObject entryRulePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlot = null;


        try {
            // InternalBiLang.g:469:45: (iv_rulePlot= rulePlot EOF )
            // InternalBiLang.g:470:2: iv_rulePlot= rulePlot EOF
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
    // InternalBiLang.g:476:1: rulePlot returns [EObject current=null] : (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot ) ;
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
            // InternalBiLang.g:482:2: ( (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot ) )
            // InternalBiLang.g:483:2: (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot )
            {
            // InternalBiLang.g:483:2: (this_BarPlot_0= ruleBarPlot | this_LinePlot_1= ruleLinePlot | this_DonutPlot_2= ruleDonutPlot | this_ScatterPlot_3= ruleScatterPlot | this_PolarPlot_4= rulePolarPlot | this_RadarPlot_5= ruleRadarPlot | this_PiePlot_6= rulePiePlot )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 34:
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
            case 45:
                {
                alt10=4;
                }
                break;
            case 44:
                {
                alt10=5;
                }
                break;
            case 46:
                {
                alt10=6;
                }
                break;
            case 43:
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
                    // InternalBiLang.g:484:3: this_BarPlot_0= ruleBarPlot
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
                    // InternalBiLang.g:493:3: this_LinePlot_1= ruleLinePlot
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
                    // InternalBiLang.g:502:3: this_DonutPlot_2= ruleDonutPlot
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
                    // InternalBiLang.g:511:3: this_ScatterPlot_3= ruleScatterPlot
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
                    // InternalBiLang.g:520:3: this_PolarPlot_4= rulePolarPlot
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
                    // InternalBiLang.g:529:3: this_RadarPlot_5= ruleRadarPlot
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
                    // InternalBiLang.g:538:3: this_PiePlot_6= rulePiePlot
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
    // InternalBiLang.g:550:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBiLang.g:550:47: (iv_ruleEString= ruleEString EOF )
            // InternalBiLang.g:551:2: iv_ruleEString= ruleEString EOF
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
    // InternalBiLang.g:557:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:563:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBiLang.g:564:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBiLang.g:564:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalBiLang.g:565:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBiLang.g:573:3: this_ID_1= RULE_ID
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
    // InternalBiLang.g:584:1: entryRuleDataFiltering returns [EObject current=null] : iv_ruleDataFiltering= ruleDataFiltering EOF ;
    public final EObject entryRuleDataFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFiltering = null;


        try {
            // InternalBiLang.g:584:54: (iv_ruleDataFiltering= ruleDataFiltering EOF )
            // InternalBiLang.g:585:2: iv_ruleDataFiltering= ruleDataFiltering EOF
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
    // InternalBiLang.g:591:1: ruleDataFiltering returns [EObject current=null] : (otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )? ) ;
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
            // InternalBiLang.g:597:2: ( (otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )? ) )
            // InternalBiLang.g:598:2: (otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )? )
            {
            // InternalBiLang.g:598:2: (otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )? )
            // InternalBiLang.g:599:3: otherlv_0= '=>' ( ( ruleEString ) ) (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )? (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFilteringAccess().getEqualsSignGreaterThanSignKeyword_0());
            		
            // InternalBiLang.g:603:3: ( ( ruleEString ) )
            // InternalBiLang.g:604:4: ( ruleEString )
            {
            // InternalBiLang.g:604:4: ( ruleEString )
            // InternalBiLang.g:605:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFilteringRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDataFilteringAccess().getFileextractorFileExtractorCrossReference_1_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBiLang.g:619:3: (otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBiLang.g:620:4: otherlv_2= 'processing=' ( (lv_processingstep_3_0= rulePreprocessingStep ) ) (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataFilteringAccess().getProcessingKeyword_2_0());
                    			
                    // InternalBiLang.g:624:4: ( (lv_processingstep_3_0= rulePreprocessingStep ) )
                    // InternalBiLang.g:625:5: (lv_processingstep_3_0= rulePreprocessingStep )
                    {
                    // InternalBiLang.g:625:5: (lv_processingstep_3_0= rulePreprocessingStep )
                    // InternalBiLang.g:626:6: lv_processingstep_3_0= rulePreprocessingStep
                    {

                    						newCompositeNode(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalBiLang.g:643:4: (otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBiLang.g:644:5: otherlv_4= ',' ( (lv_processingstep_5_0= rulePreprocessingStep ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDataFilteringAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBiLang.g:648:5: ( (lv_processingstep_5_0= rulePreprocessingStep ) )
                    	    // InternalBiLang.g:649:6: (lv_processingstep_5_0= rulePreprocessingStep )
                    	    {
                    	    // InternalBiLang.g:649:6: (lv_processingstep_5_0= rulePreprocessingStep )
                    	    // InternalBiLang.g:650:7: lv_processingstep_5_0= rulePreprocessingStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataFilteringAccess().getProcessingstepPreprocessingStepParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBiLang.g:669:3: (otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBiLang.g:670:4: otherlv_6= 'filtering=' ( (lv_filteringstep_7_0= ruleFilteringStep ) ) (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )*
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataFilteringAccess().getFilteringKeyword_3_0());
                    			
                    // InternalBiLang.g:674:4: ( (lv_filteringstep_7_0= ruleFilteringStep ) )
                    // InternalBiLang.g:675:5: (lv_filteringstep_7_0= ruleFilteringStep )
                    {
                    // InternalBiLang.g:675:5: (lv_filteringstep_7_0= ruleFilteringStep )
                    // InternalBiLang.g:676:6: lv_filteringstep_7_0= ruleFilteringStep
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

                    // InternalBiLang.g:693:4: (otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==19) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBiLang.g:694:5: otherlv_8= ',' ( (lv_filteringstep_9_0= ruleFilteringStep ) )
                    	    {
                    	    otherlv_8=(Token)match(input,19,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDataFilteringAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalBiLang.g:698:5: ( (lv_filteringstep_9_0= ruleFilteringStep ) )
                    	    // InternalBiLang.g:699:6: (lv_filteringstep_9_0= ruleFilteringStep )
                    	    {
                    	    // InternalBiLang.g:699:6: (lv_filteringstep_9_0= ruleFilteringStep )
                    	    // InternalBiLang.g:700:7: lv_filteringstep_9_0= ruleFilteringStep
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
    // $ANTLR end "ruleDataFiltering"


    // $ANTLR start "entryRuleDashBoard"
    // InternalBiLang.g:723:1: entryRuleDashBoard returns [EObject current=null] : iv_ruleDashBoard= ruleDashBoard EOF ;
    public final EObject entryRuleDashBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashBoard = null;


        try {
            // InternalBiLang.g:723:50: (iv_ruleDashBoard= ruleDashBoard EOF )
            // InternalBiLang.g:724:2: iv_ruleDashBoard= ruleDashBoard EOF
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
    // InternalBiLang.g:730:1: ruleDashBoard returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+ ) ;
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
            // InternalBiLang.g:736:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+ ) )
            // InternalBiLang.g:737:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+ )
            {
            // InternalBiLang.g:737:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+ )
            // InternalBiLang.g:738:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=>' ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+
            {
            // InternalBiLang.g:738:3: ( (lv_name_0_0= ruleEString ) )
            // InternalBiLang.g:739:4: (lv_name_0_0= ruleEString )
            {
            // InternalBiLang.g:739:4: (lv_name_0_0= ruleEString )
            // InternalBiLang.g:740:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDashBoardAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalBiLang.g:761:3: ( ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBiLang.g:762:4: ( ( ruleEString ) ) otherlv_3= 'plots' otherlv_4= '{' ( (lv_plot_5_0= rulePlot ) ) ( (lv_plot_6_0= rulePlot ) )* otherlv_7= '}'
            	    {
            	    // InternalBiLang.g:762:4: ( ( ruleEString ) )
            	    // InternalBiLang.g:763:5: ( ruleEString )
            	    {
            	    // InternalBiLang.g:763:5: ( ruleEString )
            	    // InternalBiLang.g:764:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDashBoardRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDashBoardAccess().getFileextractorFileExtractorCrossReference_2_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDashBoardAccess().getPlotsKeyword_2_1());
            	    			
            	    otherlv_4=(Token)match(input,23,FOLLOW_19); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDashBoardAccess().getLeftCurlyBracketKeyword_2_2());
            	    			
            	    // InternalBiLang.g:786:4: ( (lv_plot_5_0= rulePlot ) )
            	    // InternalBiLang.g:787:5: (lv_plot_5_0= rulePlot )
            	    {
            	    // InternalBiLang.g:787:5: (lv_plot_5_0= rulePlot )
            	    // InternalBiLang.g:788:6: lv_plot_5_0= rulePlot
            	    {

            	    						newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            	    // InternalBiLang.g:805:4: ( (lv_plot_6_0= rulePlot ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==34||(LA16_0>=41 && LA16_0<=46)) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalBiLang.g:806:5: (lv_plot_6_0= rulePlot )
            	    	    {
            	    	    // InternalBiLang.g:806:5: (lv_plot_6_0= rulePlot )
            	    	    // InternalBiLang.g:807:6: lv_plot_6_0= rulePlot
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDashBoardAccess().getPlotPlotParserRuleCall_2_4_0());
            	    	    					
            	    	    pushFollow(FOLLOW_20);
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
            	    	    break loop16;
            	        }
            	    } while (true);

            	    otherlv_7=(Token)match(input,24,FOLLOW_21); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDashBoardAccess().getRightCurlyBracketKeyword_2_5());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalBiLang.g:833:1: entryRuleNullReplacement returns [EObject current=null] : iv_ruleNullReplacement= ruleNullReplacement EOF ;
    public final EObject entryRuleNullReplacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullReplacement = null;


        try {
            // InternalBiLang.g:833:56: (iv_ruleNullReplacement= ruleNullReplacement EOF )
            // InternalBiLang.g:834:2: iv_ruleNullReplacement= ruleNullReplacement EOF
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
    // InternalBiLang.g:840:1: ruleNullReplacement returns [EObject current=null] : ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) ) ;
    public final EObject ruleNullReplacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_colName_0_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        EObject lv_statisticaloperation_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:846:2: ( ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) ) )
            // InternalBiLang.g:847:2: ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) )
            {
            // InternalBiLang.g:847:2: ( ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) ) )
            // InternalBiLang.g:848:3: ( (lv_colName_0_0= ruleEString ) ) otherlv_1= '=' ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) )
            {
            // InternalBiLang.g:848:3: ( (lv_colName_0_0= ruleEString ) )
            // InternalBiLang.g:849:4: (lv_colName_0_0= ruleEString )
            {
            // InternalBiLang.g:849:4: (lv_colName_0_0= ruleEString )
            // InternalBiLang.g:850:5: lv_colName_0_0= ruleEString
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

            otherlv_1=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getNullReplacementAccess().getEqualsSignKeyword_1());
            		
            // InternalBiLang.g:871:3: ( ( (lv_label_2_0= ruleEString ) ) | ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=50 && LA18_0<=52)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBiLang.g:872:4: ( (lv_label_2_0= ruleEString ) )
                    {
                    // InternalBiLang.g:872:4: ( (lv_label_2_0= ruleEString ) )
                    // InternalBiLang.g:873:5: (lv_label_2_0= ruleEString )
                    {
                    // InternalBiLang.g:873:5: (lv_label_2_0= ruleEString )
                    // InternalBiLang.g:874:6: lv_label_2_0= ruleEString
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
                    // InternalBiLang.g:892:4: ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) )
                    {
                    // InternalBiLang.g:892:4: ( (lv_statisticaloperation_3_0= ruleStatisticalOperation ) )
                    // InternalBiLang.g:893:5: (lv_statisticaloperation_3_0= ruleStatisticalOperation )
                    {
                    // InternalBiLang.g:893:5: (lv_statisticaloperation_3_0= ruleStatisticalOperation )
                    // InternalBiLang.g:894:6: lv_statisticaloperation_3_0= ruleStatisticalOperation
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
    // InternalBiLang.g:916:1: entryRuleQuantitativeFiltering returns [EObject current=null] : iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF ;
    public final EObject entryRuleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativeFiltering = null;


        try {
            // InternalBiLang.g:916:62: (iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF )
            // InternalBiLang.g:917:2: iv_ruleQuantitativeFiltering= ruleQuantitativeFiltering EOF
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
    // InternalBiLang.g:923:1: ruleQuantitativeFiltering returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) ) ;
    public final EObject ruleQuantitativeFiltering() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_axis_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:929:2: ( ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) ) )
            // InternalBiLang.g:930:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) )
            {
            // InternalBiLang.g:930:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) ) )
            // InternalBiLang.g:931:3: () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQuantitativeOperator ) ) ( (lv_values_3_0= ruleEFloat ) )
            {
            // InternalBiLang.g:931:3: ()
            // InternalBiLang.g:932:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantitativeFilteringAccess().getQuantitativeFilteringAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:938:3: ( (lv_axis_1_0= ruleEString ) )
            // InternalBiLang.g:939:4: (lv_axis_1_0= ruleEString )
            {
            // InternalBiLang.g:939:4: (lv_axis_1_0= ruleEString )
            // InternalBiLang.g:940:5: lv_axis_1_0= ruleEString
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

            // InternalBiLang.g:957:3: ( (lv_operator_2_0= ruleQuantitativeOperator ) )
            // InternalBiLang.g:958:4: (lv_operator_2_0= ruleQuantitativeOperator )
            {
            // InternalBiLang.g:958:4: (lv_operator_2_0= ruleQuantitativeOperator )
            // InternalBiLang.g:959:5: lv_operator_2_0= ruleQuantitativeOperator
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

            // InternalBiLang.g:976:3: ( (lv_values_3_0= ruleEFloat ) )
            // InternalBiLang.g:977:4: (lv_values_3_0= ruleEFloat )
            {
            // InternalBiLang.g:977:4: (lv_values_3_0= ruleEFloat )
            // InternalBiLang.g:978:5: lv_values_3_0= ruleEFloat
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
    // InternalBiLang.g:999:1: entryRuleQualitativeFiltering returns [EObject current=null] : iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF ;
    public final EObject entryRuleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeFiltering = null;


        try {
            // InternalBiLang.g:999:61: (iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF )
            // InternalBiLang.g:1000:2: iv_ruleQualitativeFiltering= ruleQualitativeFiltering EOF
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
    // InternalBiLang.g:1006:1: ruleQualitativeFiltering returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) ) ;
    public final EObject ruleQualitativeFiltering() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_axis_1_0 = null;

        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_labels_3_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1012:2: ( ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) ) )
            // InternalBiLang.g:1013:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) )
            {
            // InternalBiLang.g:1013:2: ( () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) ) )
            // InternalBiLang.g:1014:3: () ( (lv_axis_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleQualitativeOperator ) ) ( (lv_labels_3_0= ruleEString ) )
            {
            // InternalBiLang.g:1014:3: ()
            // InternalBiLang.g:1015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualitativeFilteringAccess().getQualitativeFilteringAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1021:3: ( (lv_axis_1_0= ruleEString ) )
            // InternalBiLang.g:1022:4: (lv_axis_1_0= ruleEString )
            {
            // InternalBiLang.g:1022:4: (lv_axis_1_0= ruleEString )
            // InternalBiLang.g:1023:5: lv_axis_1_0= ruleEString
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

            // InternalBiLang.g:1040:3: ( (lv_operator_2_0= ruleQualitativeOperator ) )
            // InternalBiLang.g:1041:4: (lv_operator_2_0= ruleQualitativeOperator )
            {
            // InternalBiLang.g:1041:4: (lv_operator_2_0= ruleQualitativeOperator )
            // InternalBiLang.g:1042:5: lv_operator_2_0= ruleQualitativeOperator
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

            // InternalBiLang.g:1059:3: ( (lv_labels_3_0= ruleEString ) )
            // InternalBiLang.g:1060:4: (lv_labels_3_0= ruleEString )
            {
            // InternalBiLang.g:1060:4: (lv_labels_3_0= ruleEString )
            // InternalBiLang.g:1061:5: lv_labels_3_0= ruleEString
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
    // InternalBiLang.g:1082:1: entryRuleMathOperation returns [EObject current=null] : iv_ruleMathOperation= ruleMathOperation EOF ;
    public final EObject entryRuleMathOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathOperation = null;


        try {
            // InternalBiLang.g:1082:54: (iv_ruleMathOperation= ruleMathOperation EOF )
            // InternalBiLang.g:1083:2: iv_ruleMathOperation= ruleMathOperation EOF
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
    // InternalBiLang.g:1089:1: ruleMathOperation returns [EObject current=null] : ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? ) ;
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
            // InternalBiLang.g:1095:2: ( ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? ) )
            // InternalBiLang.g:1096:2: ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? )
            {
            // InternalBiLang.g:1096:2: ( (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )? )
            // InternalBiLang.g:1097:3: (otherlv_0= '(' )? otherlv_1= 'l' ( (lv_lside_2_0= rulePreprocessingStep ) ) ( (lv_operator_3_0= ruleMathOperator ) ) otherlv_4= 'r' ( (lv_rside_5_0= rulePreprocessingStep ) ) (otherlv_6= ')' )?
            {
            // InternalBiLang.g:1097:3: (otherlv_0= '(' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBiLang.g:1098:4: otherlv_0= '('
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getMathOperationAccess().getLeftParenthesisKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMathOperationAccess().getLKeyword_1());
            		
            // InternalBiLang.g:1107:3: ( (lv_lside_2_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1108:4: (lv_lside_2_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1108:4: (lv_lside_2_0= rulePreprocessingStep )
            // InternalBiLang.g:1109:5: lv_lside_2_0= rulePreprocessingStep
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

            // InternalBiLang.g:1126:3: ( (lv_operator_3_0= ruleMathOperator ) )
            // InternalBiLang.g:1127:4: (lv_operator_3_0= ruleMathOperator )
            {
            // InternalBiLang.g:1127:4: (lv_operator_3_0= ruleMathOperator )
            // InternalBiLang.g:1128:5: lv_operator_3_0= ruleMathOperator
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

            otherlv_4=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getMathOperationAccess().getRKeyword_4());
            		
            // InternalBiLang.g:1149:3: ( (lv_rside_5_0= rulePreprocessingStep ) )
            // InternalBiLang.g:1150:4: (lv_rside_5_0= rulePreprocessingStep )
            {
            // InternalBiLang.g:1150:4: (lv_rside_5_0= rulePreprocessingStep )
            // InternalBiLang.g:1151:5: lv_rside_5_0= rulePreprocessingStep
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

            // InternalBiLang.g:1168:3: (otherlv_6= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBiLang.g:1169:4: otherlv_6= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalBiLang.g:1178:1: entryRuleColReference returns [EObject current=null] : iv_ruleColReference= ruleColReference EOF ;
    public final EObject entryRuleColReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColReference = null;


        try {
            // InternalBiLang.g:1178:53: (iv_ruleColReference= ruleColReference EOF )
            // InternalBiLang.g:1179:2: iv_ruleColReference= ruleColReference EOF
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
    // InternalBiLang.g:1185:1: ruleColReference returns [EObject current=null] : ( () ( (lv_target_1_0= ruleEString ) ) ) ;
    public final EObject ruleColReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_target_1_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1191:2: ( ( () ( (lv_target_1_0= ruleEString ) ) ) )
            // InternalBiLang.g:1192:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            {
            // InternalBiLang.g:1192:2: ( () ( (lv_target_1_0= ruleEString ) ) )
            // InternalBiLang.g:1193:3: () ( (lv_target_1_0= ruleEString ) )
            {
            // InternalBiLang.g:1193:3: ()
            // InternalBiLang.g:1194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColReferenceAccess().getColReferenceAction_0(),
            					current);
            			

            }

            // InternalBiLang.g:1200:3: ( (lv_target_1_0= ruleEString ) )
            // InternalBiLang.g:1201:4: (lv_target_1_0= ruleEString )
            {
            // InternalBiLang.g:1201:4: (lv_target_1_0= ruleEString )
            // InternalBiLang.g:1202:5: lv_target_1_0= ruleEString
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
    // InternalBiLang.g:1223:1: entryRuleStatisticalOperation returns [EObject current=null] : iv_ruleStatisticalOperation= ruleStatisticalOperation EOF ;
    public final EObject entryRuleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatisticalOperation = null;


        try {
            // InternalBiLang.g:1223:61: (iv_ruleStatisticalOperation= ruleStatisticalOperation EOF )
            // InternalBiLang.g:1224:2: iv_ruleStatisticalOperation= ruleStatisticalOperation EOF
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
    // InternalBiLang.g:1230:1: ruleStatisticalOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleStatisticalOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_colreference_2_0 = null;



        	enterRule();

        try {
            // InternalBiLang.g:1236:2: ( ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' ) )
            // InternalBiLang.g:1237:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            {
            // InternalBiLang.g:1237:2: ( ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')' )
            // InternalBiLang.g:1238:3: ( (lv_operator_0_0= ruleStatisticalOperator ) ) otherlv_1= '(' ( (lv_colreference_2_0= ruleColReference ) ) otherlv_3= ')'
            {
            // InternalBiLang.g:1238:3: ( (lv_operator_0_0= ruleStatisticalOperator ) )
            // InternalBiLang.g:1239:4: (lv_operator_0_0= ruleStatisticalOperator )
            {
            // InternalBiLang.g:1239:4: (lv_operator_0_0= ruleStatisticalOperator )
            // InternalBiLang.g:1240:5: lv_operator_0_0= ruleStatisticalOperator
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

            otherlv_1=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStatisticalOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBiLang.g:1261:3: ( (lv_colreference_2_0= ruleColReference ) )
            // InternalBiLang.g:1262:4: (lv_colreference_2_0= ruleColReference )
            {
            // InternalBiLang.g:1262:4: (lv_colreference_2_0= ruleColReference )
            // InternalBiLang.g:1263:5: lv_colreference_2_0= ruleColReference
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

            otherlv_3=(Token)match(input,29,FOLLOW_2); 

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
    // InternalBiLang.g:1288:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalBiLang.g:1288:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalBiLang.g:1289:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalBiLang.g:1295:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalBiLang.g:1301:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBiLang.g:1302:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBiLang.g:1302:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBiLang.g:1303:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalBiLang.g:1303:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBiLang.g:1304:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalBiLang.g:1310:3: (this_INT_1= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBiLang.g:1311:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_33); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_34); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_35); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalBiLang.g:1331:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=32 && LA25_0<=33)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBiLang.g:1332:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBiLang.g:1332:4: (kw= 'E' | kw= 'e' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==33) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalBiLang.g:1333:5: kw= 'E'
                            {
                            kw=(Token)match(input,32,FOLLOW_36); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBiLang.g:1339:5: kw= 'e'
                            {
                            kw=(Token)match(input,33,FOLLOW_36); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalBiLang.g:1345:4: (kw= '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==30) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalBiLang.g:1346:5: kw= '-'
                            {
                            kw=(Token)match(input,30,FOLLOW_34); 

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
    // InternalBiLang.g:1364:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBiLang.g:1364:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBiLang.g:1365:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBiLang.g:1371:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:1377:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBiLang.g:1378:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBiLang.g:1378:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBiLang.g:1379:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBiLang.g:1379:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBiLang.g:1380:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_34); 

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
    // InternalBiLang.g:1397:1: entryRuleBarPlot returns [EObject current=null] : iv_ruleBarPlot= ruleBarPlot EOF ;
    public final EObject entryRuleBarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarPlot = null;


        try {
            // InternalBiLang.g:1397:48: (iv_ruleBarPlot= ruleBarPlot EOF )
            // InternalBiLang.g:1398:2: iv_ruleBarPlot= ruleBarPlot EOF
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
    // InternalBiLang.g:1404:1: ruleBarPlot returns [EObject current=null] : ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1410:2: ( ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1411:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1411:2: ( () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1412:3: () otherlv_1= 'bar' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1412:3: ()
            // InternalBiLang.g:1413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBarPlotAccess().getBarPlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBarPlotAccess().getBarKeyword_1());
            		
            // InternalBiLang.g:1423:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1424:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1424:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1425:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getBarPlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getBarPlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1449:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1450:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1450:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1451:5: lv_xAxis_5_0= ruleEString
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

            otherlv_6=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getBarPlotAccess().getYAKeyword_6());
            		
            // InternalBiLang.g:1472:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1473:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1473:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1474:5: lv_yAxis_7_0= ruleEString
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

            // InternalBiLang.g:1491:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBiLang.g:1492:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getBarPlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1496:4: ( (lv_location_9_0= ruleEInt ) )
                    // InternalBiLang.g:1497:5: (lv_location_9_0= ruleEInt )
                    {
                    // InternalBiLang.g:1497:5: (lv_location_9_0= ruleEInt )
                    // InternalBiLang.g:1498:6: lv_location_9_0= ruleEInt
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

            // InternalBiLang.g:1516:3: (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBiLang.g:1517:4: otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getBarPlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1521:4: ( (lv_colors_11_0= ruleEString ) )
                    // InternalBiLang.g:1522:5: (lv_colors_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1522:5: (lv_colors_11_0= ruleEString )
                    // InternalBiLang.g:1523:6: lv_colors_11_0= ruleEString
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

            // InternalBiLang.g:1541:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBiLang.g:1542:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getBarPlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1546:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1547:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1547:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1548:6: lv_thickness_13_0= ruleEFloat
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
    // InternalBiLang.g:1570:1: entryRuleLinePlot returns [EObject current=null] : iv_ruleLinePlot= ruleLinePlot EOF ;
    public final EObject entryRuleLinePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinePlot = null;


        try {
            // InternalBiLang.g:1570:49: (iv_ruleLinePlot= ruleLinePlot EOF )
            // InternalBiLang.g:1571:2: iv_ruleLinePlot= ruleLinePlot EOF
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
    // InternalBiLang.g:1577:1: ruleLinePlot returns [EObject current=null] : ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1583:2: ( ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1584:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1584:2: ( () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1585:3: () otherlv_1= 'line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '->' otherlv_4= 'xAx' ( (lv_xAxis_5_0= ruleEString ) ) otherlv_6= 'yA' ( (lv_yAxis_7_0= ruleEString ) ) (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )? (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )? (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            {
            // InternalBiLang.g:1585:3: ()
            // InternalBiLang.g:1586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinePlotAccess().getLinePlotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinePlotAccess().getLineKeyword_1());
            		
            // InternalBiLang.g:1596:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBiLang.g:1597:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBiLang.g:1597:4: (lv_name_2_0= RULE_ID )
            // InternalBiLang.g:1598:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getLinePlotAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLinePlotAccess().getXAxKeyword_4());
            		
            // InternalBiLang.g:1622:3: ( (lv_xAxis_5_0= ruleEString ) )
            // InternalBiLang.g:1623:4: (lv_xAxis_5_0= ruleEString )
            {
            // InternalBiLang.g:1623:4: (lv_xAxis_5_0= ruleEString )
            // InternalBiLang.g:1624:5: lv_xAxis_5_0= ruleEString
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

            otherlv_6=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getLinePlotAccess().getYAKeyword_6());
            		
            // InternalBiLang.g:1645:3: ( (lv_yAxis_7_0= ruleEString ) )
            // InternalBiLang.g:1646:4: (lv_yAxis_7_0= ruleEString )
            {
            // InternalBiLang.g:1646:4: (lv_yAxis_7_0= ruleEString )
            // InternalBiLang.g:1647:5: lv_yAxis_7_0= ruleEString
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

            // InternalBiLang.g:1664:3: (otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBiLang.g:1665:4: otherlv_8= 'loc' ( (lv_location_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getLinePlotAccess().getLocKeyword_8_0());
                    			
                    // InternalBiLang.g:1669:4: ( (lv_location_9_0= ruleEInt ) )
                    // InternalBiLang.g:1670:5: (lv_location_9_0= ruleEInt )
                    {
                    // InternalBiLang.g:1670:5: (lv_location_9_0= ruleEInt )
                    // InternalBiLang.g:1671:6: lv_location_9_0= ruleEInt
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

            // InternalBiLang.g:1689:3: (otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBiLang.g:1690:4: otherlv_10= 'colors' ( (lv_colors_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getLinePlotAccess().getColorsKeyword_9_0());
                    			
                    // InternalBiLang.g:1694:4: ( (lv_colors_11_0= ruleEString ) )
                    // InternalBiLang.g:1695:5: (lv_colors_11_0= ruleEString )
                    {
                    // InternalBiLang.g:1695:5: (lv_colors_11_0= ruleEString )
                    // InternalBiLang.g:1696:6: lv_colors_11_0= ruleEString
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

            // InternalBiLang.g:1714:3: (otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBiLang.g:1715:4: otherlv_12= 'thickness' ( (lv_thickness_13_0= ruleEFloat ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getLinePlotAccess().getThicknessKeyword_10_0());
                    			
                    // InternalBiLang.g:1719:4: ( (lv_thickness_13_0= ruleEFloat ) )
                    // InternalBiLang.g:1720:5: (lv_thickness_13_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1720:5: (lv_thickness_13_0= ruleEFloat )
                    // InternalBiLang.g:1721:6: lv_thickness_13_0= ruleEFloat
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
    // InternalBiLang.g:1743:1: entryRuleDonutPlot returns [EObject current=null] : iv_ruleDonutPlot= ruleDonutPlot EOF ;
    public final EObject entryRuleDonutPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDonutPlot = null;


        try {
            // InternalBiLang.g:1743:50: (iv_ruleDonutPlot= ruleDonutPlot EOF )
            // InternalBiLang.g:1744:2: iv_ruleDonutPlot= ruleDonutPlot EOF
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
    // InternalBiLang.g:1750:1: ruleDonutPlot returns [EObject current=null] : (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1756:2: ( (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1757:2: (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1757:2: (otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1758:3: otherlv_0= 'donut' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDonutPlotAccess().getDonutKeyword_0());
            		
            // InternalBiLang.g:1762:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:1763:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:1763:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:1764:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getDonutPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDonutPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:1788:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:1789:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:1789:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:1790:5: lv_xAxis_4_0= ruleEString
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

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getDonutPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:1811:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:1812:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:1812:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:1813:5: lv_yAxis_6_0= ruleEString
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

            // InternalBiLang.g:1830:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBiLang.g:1831:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getDonutPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:1835:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:1836:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:1836:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:1837:6: lv_location_8_0= ruleEInt
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

            // InternalBiLang.g:1855:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBiLang.g:1856:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getDonutPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:1860:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:1861:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:1861:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:1862:6: lv_colors_10_0= ruleEString
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

            // InternalBiLang.g:1880:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalBiLang.g:1881:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getDonutPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:1885:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:1886:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:1886:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:1887:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:1909:1: entryRulePiePlot returns [EObject current=null] : iv_rulePiePlot= rulePiePlot EOF ;
    public final EObject entryRulePiePlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiePlot = null;


        try {
            // InternalBiLang.g:1909:48: (iv_rulePiePlot= rulePiePlot EOF )
            // InternalBiLang.g:1910:2: iv_rulePiePlot= rulePiePlot EOF
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
    // InternalBiLang.g:1916:1: rulePiePlot returns [EObject current=null] : (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:1922:2: ( (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:1923:2: (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:1923:2: (otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:1924:3: otherlv_0= 'pie' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPiePlotAccess().getPieKeyword_0());
            		
            // InternalBiLang.g:1928:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:1929:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:1929:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:1930:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getPiePlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPiePlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:1954:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:1955:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:1955:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:1956:5: lv_xAxis_4_0= ruleEString
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

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPiePlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:1977:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:1978:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:1978:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:1979:5: lv_yAxis_6_0= ruleEString
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

            // InternalBiLang.g:1996:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBiLang.g:1997:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getPiePlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2001:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2002:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2002:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2003:6: lv_location_8_0= ruleEInt
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

            // InternalBiLang.g:2021:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBiLang.g:2022:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPiePlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2026:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2027:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2027:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2028:6: lv_colors_10_0= ruleEString
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

            // InternalBiLang.g:2046:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBiLang.g:2047:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getPiePlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2051:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2052:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2052:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2053:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2075:1: entryRulePolarPlot returns [EObject current=null] : iv_rulePolarPlot= rulePolarPlot EOF ;
    public final EObject entryRulePolarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolarPlot = null;


        try {
            // InternalBiLang.g:2075:50: (iv_rulePolarPlot= rulePolarPlot EOF )
            // InternalBiLang.g:2076:2: iv_rulePolarPlot= rulePolarPlot EOF
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
    // InternalBiLang.g:2082:1: rulePolarPlot returns [EObject current=null] : (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2088:2: ( (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2089:2: (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2089:2: (otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2090:3: otherlv_0= 'polar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPolarPlotAccess().getPolarKeyword_0());
            		
            // InternalBiLang.g:2094:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2095:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2095:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2096:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getPolarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPolarPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2120:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2121:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2121:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2122:5: lv_xAxis_4_0= ruleEString
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

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getPolarPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2143:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2144:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2144:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2145:5: lv_yAxis_6_0= ruleEString
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

            // InternalBiLang.g:2162:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBiLang.g:2163:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getPolarPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2167:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2168:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2168:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2169:6: lv_location_8_0= ruleEInt
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

            // InternalBiLang.g:2187:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBiLang.g:2188:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPolarPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2192:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2193:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2193:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2194:6: lv_colors_10_0= ruleEString
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

            // InternalBiLang.g:2212:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBiLang.g:2213:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getPolarPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2217:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2218:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2218:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2219:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2241:1: entryRuleScatterPlot returns [EObject current=null] : iv_ruleScatterPlot= ruleScatterPlot EOF ;
    public final EObject entryRuleScatterPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScatterPlot = null;


        try {
            // InternalBiLang.g:2241:52: (iv_ruleScatterPlot= ruleScatterPlot EOF )
            // InternalBiLang.g:2242:2: iv_ruleScatterPlot= ruleScatterPlot EOF
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
    // InternalBiLang.g:2248:1: ruleScatterPlot returns [EObject current=null] : (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2254:2: ( (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2255:2: (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2255:2: (otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2256:3: otherlv_0= 'scatter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScatterPlotAccess().getScatterKeyword_0());
            		
            // InternalBiLang.g:2260:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2261:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2261:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2262:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getScatterPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getScatterPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2286:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2287:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2287:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2288:5: lv_xAxis_4_0= ruleEString
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

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getScatterPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2309:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2310:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2310:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2311:5: lv_yAxis_6_0= ruleEString
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

            // InternalBiLang.g:2328:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalBiLang.g:2329:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getScatterPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2333:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2334:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2334:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2335:6: lv_location_8_0= ruleEInt
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

            // InternalBiLang.g:2353:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalBiLang.g:2354:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getScatterPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2358:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2359:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2359:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2360:6: lv_colors_10_0= ruleEString
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

            // InternalBiLang.g:2378:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==40) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBiLang.g:2379:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getScatterPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2383:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2384:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2384:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2385:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2407:1: entryRuleRadarPlot returns [EObject current=null] : iv_ruleRadarPlot= ruleRadarPlot EOF ;
    public final EObject entryRuleRadarPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadarPlot = null;


        try {
            // InternalBiLang.g:2407:50: (iv_ruleRadarPlot= ruleRadarPlot EOF )
            // InternalBiLang.g:2408:2: iv_ruleRadarPlot= ruleRadarPlot EOF
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
    // InternalBiLang.g:2414:1: ruleRadarPlot returns [EObject current=null] : (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) ;
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
            // InternalBiLang.g:2420:2: ( (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? ) )
            // InternalBiLang.g:2421:2: (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            {
            // InternalBiLang.g:2421:2: (otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )? )
            // InternalBiLang.g:2422:3: otherlv_0= 'radar' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' otherlv_3= 'xAx' ( (lv_xAxis_4_0= ruleEString ) ) otherlv_5= 'yA' ( (lv_yAxis_6_0= ruleEString ) ) (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )? (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )? (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRadarPlotAccess().getRadarKeyword_0());
            		
            // InternalBiLang.g:2426:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBiLang.g:2427:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBiLang.g:2427:4: (lv_name_1_0= RULE_ID )
            // InternalBiLang.g:2428:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getRadarPlotAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRadarPlotAccess().getXAxKeyword_3());
            		
            // InternalBiLang.g:2452:3: ( (lv_xAxis_4_0= ruleEString ) )
            // InternalBiLang.g:2453:4: (lv_xAxis_4_0= ruleEString )
            {
            // InternalBiLang.g:2453:4: (lv_xAxis_4_0= ruleEString )
            // InternalBiLang.g:2454:5: lv_xAxis_4_0= ruleEString
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

            otherlv_5=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRadarPlotAccess().getYAKeyword_5());
            		
            // InternalBiLang.g:2475:3: ( (lv_yAxis_6_0= ruleEString ) )
            // InternalBiLang.g:2476:4: (lv_yAxis_6_0= ruleEString )
            {
            // InternalBiLang.g:2476:4: (lv_yAxis_6_0= ruleEString )
            // InternalBiLang.g:2477:5: lv_yAxis_6_0= ruleEString
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

            // InternalBiLang.g:2494:3: (otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBiLang.g:2495:4: otherlv_7= 'loc' ( (lv_location_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getRadarPlotAccess().getLocKeyword_7_0());
                    			
                    // InternalBiLang.g:2499:4: ( (lv_location_8_0= ruleEInt ) )
                    // InternalBiLang.g:2500:5: (lv_location_8_0= ruleEInt )
                    {
                    // InternalBiLang.g:2500:5: (lv_location_8_0= ruleEInt )
                    // InternalBiLang.g:2501:6: lv_location_8_0= ruleEInt
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

            // InternalBiLang.g:2519:3: (otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalBiLang.g:2520:4: otherlv_9= 'colors' ( (lv_colors_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getRadarPlotAccess().getColorsKeyword_8_0());
                    			
                    // InternalBiLang.g:2524:4: ( (lv_colors_10_0= ruleEString ) )
                    // InternalBiLang.g:2525:5: (lv_colors_10_0= ruleEString )
                    {
                    // InternalBiLang.g:2525:5: (lv_colors_10_0= ruleEString )
                    // InternalBiLang.g:2526:6: lv_colors_10_0= ruleEString
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

            // InternalBiLang.g:2544:3: (otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==40) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBiLang.g:2545:4: otherlv_11= 'thickness' ( (lv_thickness_12_0= ruleEFloat ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getRadarPlotAccess().getThicknessKeyword_9_0());
                    			
                    // InternalBiLang.g:2549:4: ( (lv_thickness_12_0= ruleEFloat ) )
                    // InternalBiLang.g:2550:5: (lv_thickness_12_0= ruleEFloat )
                    {
                    // InternalBiLang.g:2550:5: (lv_thickness_12_0= ruleEFloat )
                    // InternalBiLang.g:2551:6: lv_thickness_12_0= ruleEFloat
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
    // InternalBiLang.g:2573:1: ruleMathOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleMathOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBiLang.g:2579:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalBiLang.g:2580:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalBiLang.g:2580:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt48=1;
                }
                break;
            case 30:
                {
                alt48=2;
                }
                break;
            case 48:
                {
                alt48=3;
                }
                break;
            case 49:
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
                    // InternalBiLang.g:2581:3: (enumLiteral_0= '+' )
                    {
                    // InternalBiLang.g:2581:3: (enumLiteral_0= '+' )
                    // InternalBiLang.g:2582:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMathOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2589:3: (enumLiteral_1= '-' )
                    {
                    // InternalBiLang.g:2589:3: (enumLiteral_1= '-' )
                    // InternalBiLang.g:2590:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMathOperatorAccess().getMINUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2597:3: (enumLiteral_2= '*' )
                    {
                    // InternalBiLang.g:2597:3: (enumLiteral_2= '*' )
                    // InternalBiLang.g:2598:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMathOperatorAccess().getMULTIPLYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBiLang.g:2605:3: (enumLiteral_3= '/' )
                    {
                    // InternalBiLang.g:2605:3: (enumLiteral_3= '/' )
                    // InternalBiLang.g:2606:4: enumLiteral_3= '/'
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
    // InternalBiLang.g:2616:1: ruleStatisticalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) ) ;
    public final Enumerator ruleStatisticalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBiLang.g:2622:2: ( ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) ) )
            // InternalBiLang.g:2623:2: ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) )
            {
            // InternalBiLang.g:2623:2: ( (enumLiteral_0= 'mean' ) | (enumLiteral_1= 'median' ) | (enumLiteral_2= 'std' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt49=1;
                }
                break;
            case 51:
                {
                alt49=2;
                }
                break;
            case 52:
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
                    // InternalBiLang.g:2624:3: (enumLiteral_0= 'mean' )
                    {
                    // InternalBiLang.g:2624:3: (enumLiteral_0= 'mean' )
                    // InternalBiLang.g:2625:4: enumLiteral_0= 'mean'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatisticalOperatorAccess().getMEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2632:3: (enumLiteral_1= 'median' )
                    {
                    // InternalBiLang.g:2632:3: (enumLiteral_1= 'median' )
                    // InternalBiLang.g:2633:4: enumLiteral_1= 'median'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatisticalOperatorAccess().getMEDIANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2640:3: (enumLiteral_2= 'std' )
                    {
                    // InternalBiLang.g:2640:3: (enumLiteral_2= 'std' )
                    // InternalBiLang.g:2641:4: enumLiteral_2= 'std'
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
    // InternalBiLang.g:2651:1: ruleQualitativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) ) ;
    public final Enumerator ruleQualitativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBiLang.g:2657:2: ( ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) ) )
            // InternalBiLang.g:2658:2: ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) )
            {
            // InternalBiLang.g:2658:2: ( (enumLiteral_0= '= ' ) | (enumLiteral_1= '!= ' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==53) ) {
                alt50=1;
            }
            else if ( (LA50_0==54) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalBiLang.g:2659:3: (enumLiteral_0= '= ' )
                    {
                    // InternalBiLang.g:2659:3: (enumLiteral_0= '= ' )
                    // InternalBiLang.g:2660:4: enumLiteral_0= '= '
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQualitativeOperatorAccess().getEQUALSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2667:3: (enumLiteral_1= '!= ' )
                    {
                    // InternalBiLang.g:2667:3: (enumLiteral_1= '!= ' )
                    // InternalBiLang.g:2668:4: enumLiteral_1= '!= '
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
    // InternalBiLang.g:2678:1: ruleQuantitativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleQuantitativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalBiLang.g:2684:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // InternalBiLang.g:2685:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // InternalBiLang.g:2685:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt51=1;
                }
                break;
            case 55:
                {
                alt51=2;
                }
                break;
            case 56:
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
                    // InternalBiLang.g:2686:3: (enumLiteral_0= '=' )
                    {
                    // InternalBiLang.g:2686:3: (enumLiteral_0= '=' )
                    // InternalBiLang.g:2687:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantitativeOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBiLang.g:2694:3: (enumLiteral_1= '<' )
                    {
                    // InternalBiLang.g:2694:3: (enumLiteral_1= '<' )
                    // InternalBiLang.g:2695:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantitativeOperatorAccess().getINFERIOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBiLang.g:2702:3: (enumLiteral_2= '>' )
                    {
                    // InternalBiLang.g:2702:3: (enumLiteral_2= '>' )
                    // InternalBiLang.g:2703:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x001C00000C000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00007E0400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00007E0401000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0180000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0003800040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000002L});

}