package br.ufscar.dc.compiladores.t5.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufscar.dc.compiladores.t5.services.T5GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT5Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DECLARACOES'", "'ALGORITMO'", "'FIM_ALGORITMO'", "'declare'", "','", "'constante'", "':'", "'='", "'tipo'", "'procedimento'", "'('", "')'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", "'.'", "'['", "']'", "'registro'", "'fim_registro'", "'^'", "'literal'", "'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", "'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", "'..'", "'-'", "'nao'", "'+'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'e'", "'ou'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_REAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalT5Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalT5Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalT5Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalT5.g"; }



     	private T5GrammarAccess grammarAccess;

        public InternalT5Parser(TokenStream input, T5GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programa";
       	}

       	@Override
       	protected T5GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrograma"
    // InternalT5.g:64:1: entryRulePrograma returns [EObject current=null] : iv_rulePrograma= rulePrograma EOF ;
    public final EObject entryRulePrograma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrograma = null;


        try {
            // InternalT5.g:64:49: (iv_rulePrograma= rulePrograma EOF )
            // InternalT5.g:65:2: iv_rulePrograma= rulePrograma EOF
            {
             newCompositeNode(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrograma=rulePrograma();

            state._fsp--;

             current =iv_rulePrograma; 
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
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // InternalT5.g:71:1: rulePrograma returns [EObject current=null] : (otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO' ) ;
    public final EObject rulePrograma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declaracoes_1_0 = null;

        EObject lv_corpo_3_0 = null;



        	enterRule();

        try {
            // InternalT5.g:77:2: ( (otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO' ) )
            // InternalT5.g:78:2: (otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO' )
            {
            // InternalT5.g:78:2: (otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO' )
            // InternalT5.g:79:3: otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramaAccess().getDECLARACOESKeyword_0());
            		
            // InternalT5.g:83:3: ( (lv_declaracoes_1_0= ruleDeclaracao ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==17||(LA1_0>=20 && LA1_0<=21)||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT5.g:84:4: (lv_declaracoes_1_0= ruleDeclaracao )
            	    {
            	    // InternalT5.g:84:4: (lv_declaracoes_1_0= ruleDeclaracao )
            	    // InternalT5.g:85:5: lv_declaracoes_1_0= ruleDeclaracao
            	    {

            	    					newCompositeNode(grammarAccess.getProgramaAccess().getDeclaracoesDeclaracaoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declaracoes_1_0=ruleDeclaracao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declaracoes",
            	    						lv_declaracoes_1_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Declaracao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramaAccess().getALGORITMOKeyword_2());
            		
            // InternalT5.g:106:3: ( (lv_corpo_3_0= ruleCorpo ) )
            // InternalT5.g:107:4: (lv_corpo_3_0= ruleCorpo )
            {
            // InternalT5.g:107:4: (lv_corpo_3_0= ruleCorpo )
            // InternalT5.g:108:5: lv_corpo_3_0= ruleCorpo
            {

            					newCompositeNode(grammarAccess.getProgramaAccess().getCorpoCorpoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_corpo_3_0=ruleCorpo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramaRule());
            					}
            					set(
            						current,
            						"corpo",
            						lv_corpo_3_0,
            						"br.ufscar.dc.compiladores.t5.T5.Corpo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramaAccess().getFIM_ALGORITMOKeyword_4());
            		

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
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleDeclaracao"
    // InternalT5.g:133:1: entryRuleDeclaracao returns [EObject current=null] : iv_ruleDeclaracao= ruleDeclaracao EOF ;
    public final EObject entryRuleDeclaracao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracao = null;


        try {
            // InternalT5.g:133:51: (iv_ruleDeclaracao= ruleDeclaracao EOF )
            // InternalT5.g:134:2: iv_ruleDeclaracao= ruleDeclaracao EOF
            {
             newCompositeNode(grammarAccess.getDeclaracaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaracao=ruleDeclaracao();

            state._fsp--;

             current =iv_ruleDeclaracao; 
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
    // $ANTLR end "entryRuleDeclaracao"


    // $ANTLR start "ruleDeclaracao"
    // InternalT5.g:140:1: ruleDeclaracao returns [EObject current=null] : (this_DeclaracaoLocal_0= ruleDeclaracaoLocal | this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal ) ;
    public final EObject ruleDeclaracao() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracaoLocal_0 = null;

        EObject this_DeclaracaoGlobal_1 = null;



        	enterRule();

        try {
            // InternalT5.g:146:2: ( (this_DeclaracaoLocal_0= ruleDeclaracaoLocal | this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal ) )
            // InternalT5.g:147:2: (this_DeclaracaoLocal_0= ruleDeclaracaoLocal | this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal )
            {
            // InternalT5.g:147:2: (this_DeclaracaoLocal_0= ruleDeclaracaoLocal | this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15||LA2_0==17||LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21||LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalT5.g:148:3: this_DeclaracaoLocal_0= ruleDeclaracaoLocal
                    {

                    			newCompositeNode(grammarAccess.getDeclaracaoAccess().getDeclaracaoLocalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaracaoLocal_0=ruleDeclaracaoLocal();

                    state._fsp--;


                    			current = this_DeclaracaoLocal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalT5.g:157:3: this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal
                    {

                    			newCompositeNode(grammarAccess.getDeclaracaoAccess().getDeclaracaoGlobalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaracaoGlobal_1=ruleDeclaracaoGlobal();

                    state._fsp--;


                    			current = this_DeclaracaoGlobal_1;
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
    // $ANTLR end "ruleDeclaracao"


    // $ANTLR start "entryRuleDeclaracaoLocal"
    // InternalT5.g:169:1: entryRuleDeclaracaoLocal returns [EObject current=null] : iv_ruleDeclaracaoLocal= ruleDeclaracaoLocal EOF ;
    public final EObject entryRuleDeclaracaoLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracaoLocal = null;


        try {
            // InternalT5.g:169:56: (iv_ruleDeclaracaoLocal= ruleDeclaracaoLocal EOF )
            // InternalT5.g:170:2: iv_ruleDeclaracaoLocal= ruleDeclaracaoLocal EOF
            {
             newCompositeNode(grammarAccess.getDeclaracaoLocalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaracaoLocal=ruleDeclaracaoLocal();

            state._fsp--;

             current =iv_ruleDeclaracaoLocal; 
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
    // $ANTLR end "entryRuleDeclaracaoLocal"


    // $ANTLR start "ruleDeclaracaoLocal"
    // InternalT5.g:176:1: ruleDeclaracaoLocal returns [EObject current=null] : ( (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* ) | (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) ) | (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) ) ) ;
    public final EObject ruleDeclaracaoLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        EObject lv_variaveis_1_0 = null;

        EObject lv_variaveis_3_0 = null;

        AntlrDatatypeRuleToken lv_tipoBasico_7_0 = null;

        AntlrDatatypeRuleToken lv_valor_9_0 = null;

        EObject lv_tipoDef_13_0 = null;



        	enterRule();

        try {
            // InternalT5.g:182:2: ( ( (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* ) | (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) ) | (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) ) ) )
            // InternalT5.g:183:2: ( (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* ) | (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) ) | (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) ) )
            {
            // InternalT5.g:183:2: ( (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* ) | (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) ) | (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalT5.g:184:3: (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* )
                    {
                    // InternalT5.g:184:3: (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* )
                    // InternalT5.g:185:4: otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )*
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getDeclaracaoLocalAccess().getDeclareKeyword_0_0());
                    			
                    // InternalT5.g:189:4: ( (lv_variaveis_1_0= ruleVariavel ) )
                    // InternalT5.g:190:5: (lv_variaveis_1_0= ruleVariavel )
                    {
                    // InternalT5.g:190:5: (lv_variaveis_1_0= ruleVariavel )
                    // InternalT5.g:191:6: lv_variaveis_1_0= ruleVariavel
                    {

                    						newCompositeNode(grammarAccess.getDeclaracaoLocalAccess().getVariaveisVariavelParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_variaveis_1_0=ruleVariavel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaracaoLocalRule());
                    						}
                    						add(
                    							current,
                    							"variaveis",
                    							lv_variaveis_1_0,
                    							"br.ufscar.dc.compiladores.t5.T5.Variavel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT5.g:208:4: (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT5.g:209:5: otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getDeclaracaoLocalAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalT5.g:213:5: ( (lv_variaveis_3_0= ruleVariavel ) )
                    	    // InternalT5.g:214:6: (lv_variaveis_3_0= ruleVariavel )
                    	    {
                    	    // InternalT5.g:214:6: (lv_variaveis_3_0= ruleVariavel )
                    	    // InternalT5.g:215:7: lv_variaveis_3_0= ruleVariavel
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeclaracaoLocalAccess().getVariaveisVariavelParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_variaveis_3_0=ruleVariavel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeclaracaoLocalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variaveis",
                    	    								lv_variaveis_3_0,
                    	    								"br.ufscar.dc.compiladores.t5.T5.Variavel");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:235:3: (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) )
                    {
                    // InternalT5.g:235:3: (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) )
                    // InternalT5.g:236:4: otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeclaracaoLocalAccess().getConstanteKeyword_1_0());
                    			
                    // InternalT5.g:240:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalT5.g:241:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalT5.g:241:5: (lv_name_5_0= RULE_ID )
                    // InternalT5.g:242:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getDeclaracaoLocalAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclaracaoLocalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeclaracaoLocalAccess().getColonKeyword_1_2());
                    			
                    // InternalT5.g:262:4: ( (lv_tipoBasico_7_0= ruleTipoBasico ) )
                    // InternalT5.g:263:5: (lv_tipoBasico_7_0= ruleTipoBasico )
                    {
                    // InternalT5.g:263:5: (lv_tipoBasico_7_0= ruleTipoBasico )
                    // InternalT5.g:264:6: lv_tipoBasico_7_0= ruleTipoBasico
                    {

                    						newCompositeNode(grammarAccess.getDeclaracaoLocalAccess().getTipoBasicoTipoBasicoParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_tipoBasico_7_0=ruleTipoBasico();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaracaoLocalRule());
                    						}
                    						set(
                    							current,
                    							"tipoBasico",
                    							lv_tipoBasico_7_0,
                    							"br.ufscar.dc.compiladores.t5.T5.TipoBasico");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeclaracaoLocalAccess().getEqualsSignKeyword_1_4());
                    			
                    // InternalT5.g:285:4: ( (lv_valor_9_0= ruleValorConstante ) )
                    // InternalT5.g:286:5: (lv_valor_9_0= ruleValorConstante )
                    {
                    // InternalT5.g:286:5: (lv_valor_9_0= ruleValorConstante )
                    // InternalT5.g:287:6: lv_valor_9_0= ruleValorConstante
                    {

                    						newCompositeNode(grammarAccess.getDeclaracaoLocalAccess().getValorValorConstanteParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valor_9_0=ruleValorConstante();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaracaoLocalRule());
                    						}
                    						set(
                    							current,
                    							"valor",
                    							lv_valor_9_0,
                    							"br.ufscar.dc.compiladores.t5.T5.ValorConstante");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:306:3: (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) )
                    {
                    // InternalT5.g:306:3: (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) )
                    // InternalT5.g:307:4: otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) )
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeclaracaoLocalAccess().getTipoKeyword_2_0());
                    			
                    // InternalT5.g:311:4: ( (lv_name_11_0= RULE_ID ) )
                    // InternalT5.g:312:5: (lv_name_11_0= RULE_ID )
                    {
                    // InternalT5.g:312:5: (lv_name_11_0= RULE_ID )
                    // InternalT5.g:313:6: lv_name_11_0= RULE_ID
                    {
                    lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_name_11_0, grammarAccess.getDeclaracaoLocalAccess().getNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclaracaoLocalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_11_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getDeclaracaoLocalAccess().getColonKeyword_2_2());
                    			
                    // InternalT5.g:333:4: ( (lv_tipoDef_13_0= ruleTipo ) )
                    // InternalT5.g:334:5: (lv_tipoDef_13_0= ruleTipo )
                    {
                    // InternalT5.g:334:5: (lv_tipoDef_13_0= ruleTipo )
                    // InternalT5.g:335:6: lv_tipoDef_13_0= ruleTipo
                    {

                    						newCompositeNode(grammarAccess.getDeclaracaoLocalAccess().getTipoDefTipoParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tipoDef_13_0=ruleTipo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaracaoLocalRule());
                    						}
                    						set(
                    							current,
                    							"tipoDef",
                    							lv_tipoDef_13_0,
                    							"br.ufscar.dc.compiladores.t5.T5.Tipo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleDeclaracaoLocal"


    // $ANTLR start "entryRuleDeclaracaoGlobal"
    // InternalT5.g:357:1: entryRuleDeclaracaoGlobal returns [EObject current=null] : iv_ruleDeclaracaoGlobal= ruleDeclaracaoGlobal EOF ;
    public final EObject entryRuleDeclaracaoGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracaoGlobal = null;


        try {
            // InternalT5.g:357:57: (iv_ruleDeclaracaoGlobal= ruleDeclaracaoGlobal EOF )
            // InternalT5.g:358:2: iv_ruleDeclaracaoGlobal= ruleDeclaracaoGlobal EOF
            {
             newCompositeNode(grammarAccess.getDeclaracaoGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaracaoGlobal=ruleDeclaracaoGlobal();

            state._fsp--;

             current =iv_ruleDeclaracaoGlobal; 
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
    // $ANTLR end "entryRuleDeclaracaoGlobal"


    // $ANTLR start "ruleDeclaracaoGlobal"
    // InternalT5.g:364:1: ruleDeclaracaoGlobal returns [EObject current=null] : ( (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' ) | (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' ) ) ;
    public final EObject ruleDeclaracaoGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        EObject lv_parametros_3_0 = null;

        EObject lv_corpo_5_0 = null;

        EObject lv_parametros_10_0 = null;

        EObject lv_tipoRetorno_13_0 = null;

        EObject lv_corpo_14_0 = null;



        	enterRule();

        try {
            // InternalT5.g:370:2: ( ( (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' ) | (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' ) ) )
            // InternalT5.g:371:2: ( (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' ) | (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' ) )
            {
            // InternalT5.g:371:2: ( (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' ) | (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalT5.g:372:3: (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' )
                    {
                    // InternalT5.g:372:3: (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' )
                    // InternalT5.g:373:4: otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getDeclaracaoGlobalAccess().getProcedimentoKeyword_0_0());
                    			
                    // InternalT5.g:377:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalT5.g:378:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalT5.g:378:5: (lv_name_1_0= RULE_ID )
                    // InternalT5.g:379:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getDeclaracaoGlobalAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclaracaoGlobalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclaracaoGlobalAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalT5.g:399:4: ( (lv_parametros_3_0= ruleParametros ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID||LA5_0==39) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalT5.g:400:5: (lv_parametros_3_0= ruleParametros )
                            {
                            // InternalT5.g:400:5: (lv_parametros_3_0= ruleParametros )
                            // InternalT5.g:401:6: lv_parametros_3_0= ruleParametros
                            {

                            						newCompositeNode(grammarAccess.getDeclaracaoGlobalAccess().getParametrosParametrosParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_16);
                            lv_parametros_3_0=ruleParametros();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDeclaracaoGlobalRule());
                            						}
                            						set(
                            							current,
                            							"parametros",
                            							lv_parametros_3_0,
                            							"br.ufscar.dc.compiladores.t5.T5.Parametros");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeclaracaoGlobalAccess().getRightParenthesisKeyword_0_4());
                    			
                    // InternalT5.g:422:4: ( (lv_corpo_5_0= ruleCorpo ) )
                    // InternalT5.g:423:5: (lv_corpo_5_0= ruleCorpo )
                    {
                    // InternalT5.g:423:5: (lv_corpo_5_0= ruleCorpo )
                    // InternalT5.g:424:6: lv_corpo_5_0= ruleCorpo
                    {

                    						newCompositeNode(grammarAccess.getDeclaracaoGlobalAccess().getCorpoCorpoParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_corpo_5_0=ruleCorpo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaracaoGlobalRule());
                    						}
                    						set(
                    							current,
                    							"corpo",
                    							lv_corpo_5_0,
                    							"br.ufscar.dc.compiladores.t5.T5.Corpo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeclaracaoGlobalAccess().getFim_procedimentoKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:447:3: (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' )
                    {
                    // InternalT5.g:447:3: (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' )
                    // InternalT5.g:448:4: otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getDeclaracaoGlobalAccess().getFuncaoKeyword_1_0());
                    			
                    // InternalT5.g:452:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalT5.g:453:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalT5.g:453:5: (lv_name_8_0= RULE_ID )
                    // InternalT5.g:454:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getDeclaracaoGlobalAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclaracaoGlobalRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeclaracaoGlobalAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalT5.g:474:4: ( (lv_parametros_10_0= ruleParametros ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID||LA6_0==39) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalT5.g:475:5: (lv_parametros_10_0= ruleParametros )
                            {
                            // InternalT5.g:475:5: (lv_parametros_10_0= ruleParametros )
                            // InternalT5.g:476:6: lv_parametros_10_0= ruleParametros
                            {

                            						newCompositeNode(grammarAccess.getDeclaracaoGlobalAccess().getParametrosParametrosParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_16);
                            lv_parametros_10_0=ruleParametros();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDeclaracaoGlobalRule());
                            						}
                            						set(
                            							current,
                            							"parametros",
                            							lv_parametros_10_0,
                            							"br.ufscar.dc.compiladores.t5.T5.Parametros");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getDeclaracaoGlobalAccess().getRightParenthesisKeyword_1_4());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getDeclaracaoGlobalAccess().getColonKeyword_1_5());
                    			
                    // InternalT5.g:501:4: ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) )
                    // InternalT5.g:502:5: (lv_tipoRetorno_13_0= ruleTipoEstendido )
                    {
                    // InternalT5.g:502:5: (lv_tipoRetorno_13_0= ruleTipoEstendido )
                    // InternalT5.g:503:6: lv_tipoRetorno_13_0= ruleTipoEstendido
                    {

                    						newCompositeNode(grammarAccess.getDeclaracaoGlobalAccess().getTipoRetornoTipoEstendidoParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_tipoRetorno_13_0=ruleTipoEstendido();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaracaoGlobalRule());
                    						}
                    						set(
                    							current,
                    							"tipoRetorno",
                    							lv_tipoRetorno_13_0,
                    							"br.ufscar.dc.compiladores.t5.T5.TipoEstendido");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT5.g:520:4: ( (lv_corpo_14_0= ruleCorpo ) )
                    // InternalT5.g:521:5: (lv_corpo_14_0= ruleCorpo )
                    {
                    // InternalT5.g:521:5: (lv_corpo_14_0= ruleCorpo )
                    // InternalT5.g:522:6: lv_corpo_14_0= ruleCorpo
                    {

                    						newCompositeNode(grammarAccess.getDeclaracaoGlobalAccess().getCorpoCorpoParserRuleCall_1_7_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_corpo_14_0=ruleCorpo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaracaoGlobalRule());
                    						}
                    						set(
                    							current,
                    							"corpo",
                    							lv_corpo_14_0,
                    							"br.ufscar.dc.compiladores.t5.T5.Corpo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getDeclaracaoGlobalAccess().getFim_funcaoKeyword_1_8());
                    			

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
    // $ANTLR end "ruleDeclaracaoGlobal"


    // $ANTLR start "entryRuleVariavel"
    // InternalT5.g:548:1: entryRuleVariavel returns [EObject current=null] : iv_ruleVariavel= ruleVariavel EOF ;
    public final EObject entryRuleVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavel = null;


        try {
            // InternalT5.g:548:49: (iv_ruleVariavel= ruleVariavel EOF )
            // InternalT5.g:549:2: iv_ruleVariavel= ruleVariavel EOF
            {
             newCompositeNode(grammarAccess.getVariavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariavel=ruleVariavel();

            state._fsp--;

             current =iv_ruleVariavel; 
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
    // $ANTLR end "entryRuleVariavel"


    // $ANTLR start "ruleVariavel"
    // InternalT5.g:555:1: ruleVariavel returns [EObject current=null] : ( ( (lv_id_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) ) ) ;
    public final EObject ruleVariavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_tipoVar_2_0 = null;



        	enterRule();

        try {
            // InternalT5.g:561:2: ( ( ( (lv_id_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) ) ) )
            // InternalT5.g:562:2: ( ( (lv_id_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) ) )
            {
            // InternalT5.g:562:2: ( ( (lv_id_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) ) )
            // InternalT5.g:563:3: ( (lv_id_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) )
            {
            // InternalT5.g:563:3: ( (lv_id_0_0= ruleIdentificador ) )
            // InternalT5.g:564:4: (lv_id_0_0= ruleIdentificador )
            {
            // InternalT5.g:564:4: (lv_id_0_0= ruleIdentificador )
            // InternalT5.g:565:5: lv_id_0_0= ruleIdentificador
            {

            					newCompositeNode(grammarAccess.getVariavelAccess().getIdIdentificadorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_id_0_0=ruleIdentificador();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariavelRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.Identificador");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVariavelAccess().getColonKeyword_1());
            		
            // InternalT5.g:586:3: ( (lv_tipoVar_2_0= ruleTipo ) )
            // InternalT5.g:587:4: (lv_tipoVar_2_0= ruleTipo )
            {
            // InternalT5.g:587:4: (lv_tipoVar_2_0= ruleTipo )
            // InternalT5.g:588:5: lv_tipoVar_2_0= ruleTipo
            {

            					newCompositeNode(grammarAccess.getVariavelAccess().getTipoVarTipoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_tipoVar_2_0=ruleTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariavelRule());
            					}
            					set(
            						current,
            						"tipoVar",
            						lv_tipoVar_2_0,
            						"br.ufscar.dc.compiladores.t5.T5.Tipo");
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
    // $ANTLR end "ruleVariavel"


    // $ANTLR start "entryRuleIdentificador"
    // InternalT5.g:609:1: entryRuleIdentificador returns [EObject current=null] : iv_ruleIdentificador= ruleIdentificador EOF ;
    public final EObject entryRuleIdentificador() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentificador = null;


        try {
            // InternalT5.g:609:54: (iv_ruleIdentificador= ruleIdentificador EOF )
            // InternalT5.g:610:2: iv_ruleIdentificador= ruleIdentificador EOF
            {
             newCompositeNode(grammarAccess.getIdentificadorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentificador=ruleIdentificador();

            state._fsp--;

             current =iv_ruleIdentificador; 
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
    // $ANTLR end "entryRuleIdentificador"


    // $ANTLR start "ruleIdentificador"
    // InternalT5.g:616:1: ruleIdentificador returns [EObject current=null] : (this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID )* ( (lv_dimensoes_3_0= ruleDimensao ) )* ) ;
    public final EObject ruleIdentificador() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token this_ID_2=null;
        EObject lv_dimensoes_3_0 = null;



        	enterRule();

        try {
            // InternalT5.g:622:2: ( (this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID )* ( (lv_dimensoes_3_0= ruleDimensao ) )* ) )
            // InternalT5.g:623:2: (this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID )* ( (lv_dimensoes_3_0= ruleDimensao ) )* )
            {
            // InternalT5.g:623:2: (this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID )* ( (lv_dimensoes_3_0= ruleDimensao ) )* )
            // InternalT5.g:624:3: this_ID_0= RULE_ID (otherlv_1= '.' this_ID_2= RULE_ID )* ( (lv_dimensoes_3_0= ruleDimensao ) )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            			newLeafNode(this_ID_0, grammarAccess.getIdentificadorAccess().getIDTerminalRuleCall_0());
            		
            // InternalT5.g:628:3: (otherlv_1= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT5.g:629:4: otherlv_1= '.' this_ID_2= RULE_ID
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentificadorAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    				newLeafNode(this_ID_2, grammarAccess.getIdentificadorAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalT5.g:638:3: ( (lv_dimensoes_3_0= ruleDimensao ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalT5.g:639:4: (lv_dimensoes_3_0= ruleDimensao )
            	    {
            	    // InternalT5.g:639:4: (lv_dimensoes_3_0= ruleDimensao )
            	    // InternalT5.g:640:5: lv_dimensoes_3_0= ruleDimensao
            	    {

            	    					newCompositeNode(grammarAccess.getIdentificadorAccess().getDimensoesDimensaoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_dimensoes_3_0=ruleDimensao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIdentificadorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dimensoes",
            	    						lv_dimensoes_3_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Dimensao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleIdentificador"


    // $ANTLR start "entryRuleDimensao"
    // InternalT5.g:661:1: entryRuleDimensao returns [EObject current=null] : iv_ruleDimensao= ruleDimensao EOF ;
    public final EObject entryRuleDimensao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensao = null;


        try {
            // InternalT5.g:661:49: (iv_ruleDimensao= ruleDimensao EOF )
            // InternalT5.g:662:2: iv_ruleDimensao= ruleDimensao EOF
            {
             newCompositeNode(grammarAccess.getDimensaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimensao=ruleDimensao();

            state._fsp--;

             current =iv_ruleDimensao; 
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
    // $ANTLR end "entryRuleDimensao"


    // $ANTLR start "ruleDimensao"
    // InternalT5.g:668:1: ruleDimensao returns [EObject current=null] : (otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']' ) ;
    public final EObject ruleDimensao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:674:2: ( (otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']' ) )
            // InternalT5.g:675:2: (otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']' )
            {
            // InternalT5.g:675:2: (otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']' )
            // InternalT5.g:676:3: otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensaoAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalT5.g:680:3: ( (lv_exp_1_0= ruleExpressaoAritmetica ) )
            // InternalT5.g:681:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            {
            // InternalT5.g:681:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            // InternalT5.g:682:5: lv_exp_1_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getDimensaoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_exp_1_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensaoRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDimensaoAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleDimensao"


    // $ANTLR start "entryRuleTipo"
    // InternalT5.g:707:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // InternalT5.g:707:45: (iv_ruleTipo= ruleTipo EOF )
            // InternalT5.g:708:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo; 
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
    // $ANTLR end "entryRuleTipo"


    // $ANTLR start "ruleTipo"
    // InternalT5.g:714:1: ruleTipo returns [EObject current=null] : ( ( (lv_registro_0_0= ruleRegistro ) ) | ( (lv_tipoExt_1_0= ruleTipoEstendido ) ) ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject lv_registro_0_0 = null;

        EObject lv_tipoExt_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:720:2: ( ( ( (lv_registro_0_0= ruleRegistro ) ) | ( (lv_tipoExt_1_0= ruleTipoEstendido ) ) ) )
            // InternalT5.g:721:2: ( ( (lv_registro_0_0= ruleRegistro ) ) | ( (lv_tipoExt_1_0= ruleTipoEstendido ) ) )
            {
            // InternalT5.g:721:2: ( ( (lv_registro_0_0= ruleRegistro ) ) | ( (lv_tipoExt_1_0= ruleTipoEstendido ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||(LA10_0>=32 && LA10_0<=36)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalT5.g:722:3: ( (lv_registro_0_0= ruleRegistro ) )
                    {
                    // InternalT5.g:722:3: ( (lv_registro_0_0= ruleRegistro ) )
                    // InternalT5.g:723:4: (lv_registro_0_0= ruleRegistro )
                    {
                    // InternalT5.g:723:4: (lv_registro_0_0= ruleRegistro )
                    // InternalT5.g:724:5: lv_registro_0_0= ruleRegistro
                    {

                    					newCompositeNode(grammarAccess.getTipoAccess().getRegistroRegistroParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_registro_0_0=ruleRegistro();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTipoRule());
                    					}
                    					set(
                    						current,
                    						"registro",
                    						lv_registro_0_0,
                    						"br.ufscar.dc.compiladores.t5.T5.Registro");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:742:3: ( (lv_tipoExt_1_0= ruleTipoEstendido ) )
                    {
                    // InternalT5.g:742:3: ( (lv_tipoExt_1_0= ruleTipoEstendido ) )
                    // InternalT5.g:743:4: (lv_tipoExt_1_0= ruleTipoEstendido )
                    {
                    // InternalT5.g:743:4: (lv_tipoExt_1_0= ruleTipoEstendido )
                    // InternalT5.g:744:5: lv_tipoExt_1_0= ruleTipoEstendido
                    {

                    					newCompositeNode(grammarAccess.getTipoAccess().getTipoExtTipoEstendidoParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tipoExt_1_0=ruleTipoEstendido();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTipoRule());
                    					}
                    					set(
                    						current,
                    						"tipoExt",
                    						lv_tipoExt_1_0,
                    						"br.ufscar.dc.compiladores.t5.T5.TipoEstendido");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleTipo"


    // $ANTLR start "entryRuleRegistro"
    // InternalT5.g:765:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // InternalT5.g:765:49: (iv_ruleRegistro= ruleRegistro EOF )
            // InternalT5.g:766:2: iv_ruleRegistro= ruleRegistro EOF
            {
             newCompositeNode(grammarAccess.getRegistroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegistro=ruleRegistro();

            state._fsp--;

             current =iv_ruleRegistro; 
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
    // $ANTLR end "entryRuleRegistro"


    // $ANTLR start "ruleRegistro"
    // InternalT5.g:772:1: ruleRegistro returns [EObject current=null] : (otherlv_0= 'registro' ( (lv_campos_1_0= ruleVariavel ) )* otherlv_2= 'fim_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_campos_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:778:2: ( (otherlv_0= 'registro' ( (lv_campos_1_0= ruleVariavel ) )* otherlv_2= 'fim_registro' ) )
            // InternalT5.g:779:2: (otherlv_0= 'registro' ( (lv_campos_1_0= ruleVariavel ) )* otherlv_2= 'fim_registro' )
            {
            // InternalT5.g:779:2: (otherlv_0= 'registro' ( (lv_campos_1_0= ruleVariavel ) )* otherlv_2= 'fim_registro' )
            // InternalT5.g:780:3: otherlv_0= 'registro' ( (lv_campos_1_0= ruleVariavel ) )* otherlv_2= 'fim_registro'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRegistroAccess().getRegistroKeyword_0());
            		
            // InternalT5.g:784:3: ( (lv_campos_1_0= ruleVariavel ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT5.g:785:4: (lv_campos_1_0= ruleVariavel )
            	    {
            	    // InternalT5.g:785:4: (lv_campos_1_0= ruleVariavel )
            	    // InternalT5.g:786:5: lv_campos_1_0= ruleVariavel
            	    {

            	    					newCompositeNode(grammarAccess.getRegistroAccess().getCamposVariavelParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_campos_1_0=ruleVariavel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRegistroRule());
            	    					}
            	    					add(
            	    						current,
            	    						"campos",
            	    						lv_campos_1_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Variavel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRegistroAccess().getFim_registroKeyword_2());
            		

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
    // $ANTLR end "ruleRegistro"


    // $ANTLR start "entryRuleTipoEstendido"
    // InternalT5.g:811:1: entryRuleTipoEstendido returns [EObject current=null] : iv_ruleTipoEstendido= ruleTipoEstendido EOF ;
    public final EObject entryRuleTipoEstendido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoEstendido = null;


        try {
            // InternalT5.g:811:54: (iv_ruleTipoEstendido= ruleTipoEstendido EOF )
            // InternalT5.g:812:2: iv_ruleTipoEstendido= ruleTipoEstendido EOF
            {
             newCompositeNode(grammarAccess.getTipoEstendidoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoEstendido=ruleTipoEstendido();

            state._fsp--;

             current =iv_ruleTipoEstendido; 
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
    // $ANTLR end "entryRuleTipoEstendido"


    // $ANTLR start "ruleTipoEstendido"
    // InternalT5.g:818:1: ruleTipoEstendido returns [EObject current=null] : ( (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleTipoEstendido() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_basic_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:824:2: ( ( (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalT5.g:825:2: ( (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalT5.g:825:2: ( (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalT5.g:826:3: (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalT5.g:826:3: (otherlv_0= '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalT5.g:827:4: otherlv_0= '^'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getTipoEstendidoAccess().getCircumflexAccentKeyword_0());
                    			

                    }
                    break;

            }

            // InternalT5.g:832:3: ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=33 && LA13_0<=36)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalT5.g:833:4: ( (lv_basic_1_0= ruleTipoBasico ) )
                    {
                    // InternalT5.g:833:4: ( (lv_basic_1_0= ruleTipoBasico ) )
                    // InternalT5.g:834:5: (lv_basic_1_0= ruleTipoBasico )
                    {
                    // InternalT5.g:834:5: (lv_basic_1_0= ruleTipoBasico )
                    // InternalT5.g:835:6: lv_basic_1_0= ruleTipoBasico
                    {

                    						newCompositeNode(grammarAccess.getTipoEstendidoAccess().getBasicTipoBasicoParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_basic_1_0=ruleTipoBasico();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTipoEstendidoRule());
                    						}
                    						set(
                    							current,
                    							"basic",
                    							lv_basic_1_0,
                    							"br.ufscar.dc.compiladores.t5.T5.TipoBasico");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:853:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalT5.g:853:4: ( (otherlv_2= RULE_ID ) )
                    // InternalT5.g:854:5: (otherlv_2= RULE_ID )
                    {
                    // InternalT5.g:854:5: (otherlv_2= RULE_ID )
                    // InternalT5.g:855:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTipoEstendidoRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getTipoEstendidoAccess().getRefDeclaracaoCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleTipoEstendido"


    // $ANTLR start "entryRuleTipoBasico"
    // InternalT5.g:871:1: entryRuleTipoBasico returns [String current=null] : iv_ruleTipoBasico= ruleTipoBasico EOF ;
    public final String entryRuleTipoBasico() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoBasico = null;


        try {
            // InternalT5.g:871:50: (iv_ruleTipoBasico= ruleTipoBasico EOF )
            // InternalT5.g:872:2: iv_ruleTipoBasico= ruleTipoBasico EOF
            {
             newCompositeNode(grammarAccess.getTipoBasicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoBasico=ruleTipoBasico();

            state._fsp--;

             current =iv_ruleTipoBasico.getText(); 
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
    // $ANTLR end "entryRuleTipoBasico"


    // $ANTLR start "ruleTipoBasico"
    // InternalT5.g:878:1: ruleTipoBasico returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'literal' | kw= 'inteiro' | kw= 'real' | kw= 'logico' ) ;
    public final AntlrDatatypeRuleToken ruleTipoBasico() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5.g:884:2: ( (kw= 'literal' | kw= 'inteiro' | kw= 'real' | kw= 'logico' ) )
            // InternalT5.g:885:2: (kw= 'literal' | kw= 'inteiro' | kw= 'real' | kw= 'logico' )
            {
            // InternalT5.g:885:2: (kw= 'literal' | kw= 'inteiro' | kw= 'real' | kw= 'logico' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalT5.g:886:3: kw= 'literal'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBasicoAccess().getLiteralKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5.g:892:3: kw= 'inteiro'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBasicoAccess().getInteiroKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT5.g:898:3: kw= 'real'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBasicoAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT5.g:904:3: kw= 'logico'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBasicoAccess().getLogicoKeyword_3());
                    		

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
    // $ANTLR end "ruleTipoBasico"


    // $ANTLR start "entryRuleValorConstante"
    // InternalT5.g:913:1: entryRuleValorConstante returns [String current=null] : iv_ruleValorConstante= ruleValorConstante EOF ;
    public final String entryRuleValorConstante() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValorConstante = null;


        try {
            // InternalT5.g:913:54: (iv_ruleValorConstante= ruleValorConstante EOF )
            // InternalT5.g:914:2: iv_ruleValorConstante= ruleValorConstante EOF
            {
             newCompositeNode(grammarAccess.getValorConstanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValorConstante=ruleValorConstante();

            state._fsp--;

             current =iv_ruleValorConstante.getText(); 
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
    // $ANTLR end "entryRuleValorConstante"


    // $ANTLR start "ruleValorConstante"
    // InternalT5.g:920:1: ruleValorConstante returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_REAL_2= RULE_REAL | kw= 'verdadeiro' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken ruleValorConstante() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token this_REAL_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalT5.g:926:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_REAL_2= RULE_REAL | kw= 'verdadeiro' | kw= 'falso' ) )
            // InternalT5.g:927:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_REAL_2= RULE_REAL | kw= 'verdadeiro' | kw= 'falso' )
            {
            // InternalT5.g:927:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_REAL_2= RULE_REAL | kw= 'verdadeiro' | kw= 'falso' )
            int alt15=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
                {
                alt15=2;
                }
                break;
            case RULE_REAL:
                {
                alt15=3;
                }
                break;
            case 37:
                {
                alt15=4;
                }
                break;
            case 38:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalT5.g:928:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getValorConstanteAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5.g:936:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getValorConstanteAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT5.g:944:3: this_REAL_2= RULE_REAL
                    {
                    this_REAL_2=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    			current.merge(this_REAL_2);
                    		

                    			newLeafNode(this_REAL_2, grammarAccess.getValorConstanteAccess().getREALTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT5.g:952:3: kw= 'verdadeiro'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValorConstanteAccess().getVerdadeiroKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalT5.g:958:3: kw= 'falso'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValorConstanteAccess().getFalsoKeyword_4());
                    		

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
    // $ANTLR end "ruleValorConstante"


    // $ANTLR start "entryRuleParametros"
    // InternalT5.g:967:1: entryRuleParametros returns [EObject current=null] : iv_ruleParametros= ruleParametros EOF ;
    public final EObject entryRuleParametros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametros = null;


        try {
            // InternalT5.g:967:51: (iv_ruleParametros= ruleParametros EOF )
            // InternalT5.g:968:2: iv_ruleParametros= ruleParametros EOF
            {
             newCompositeNode(grammarAccess.getParametrosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametros=ruleParametros();

            state._fsp--;

             current =iv_ruleParametros; 
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
    // $ANTLR end "entryRuleParametros"


    // $ANTLR start "ruleParametros"
    // InternalT5.g:974:1: ruleParametros returns [EObject current=null] : ( ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )* ) ;
    public final EObject ruleParametros() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parametro_0_0 = null;

        EObject lv_parametro_2_0 = null;



        	enterRule();

        try {
            // InternalT5.g:980:2: ( ( ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )* ) )
            // InternalT5.g:981:2: ( ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )* )
            {
            // InternalT5.g:981:2: ( ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )* )
            // InternalT5.g:982:3: ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )*
            {
            // InternalT5.g:982:3: ( (lv_parametro_0_0= ruleParametro ) )
            // InternalT5.g:983:4: (lv_parametro_0_0= ruleParametro )
            {
            // InternalT5.g:983:4: (lv_parametro_0_0= ruleParametro )
            // InternalT5.g:984:5: lv_parametro_0_0= ruleParametro
            {

            					newCompositeNode(grammarAccess.getParametrosAccess().getParametroParametroParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_parametro_0_0=ruleParametro();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametrosRule());
            					}
            					add(
            						current,
            						"parametro",
            						lv_parametro_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.Parametro");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:1001:3: (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalT5.g:1002:4: otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_27); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParametrosAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalT5.g:1006:4: ( (lv_parametro_2_0= ruleParametro ) )
            	    // InternalT5.g:1007:5: (lv_parametro_2_0= ruleParametro )
            	    {
            	    // InternalT5.g:1007:5: (lv_parametro_2_0= ruleParametro )
            	    // InternalT5.g:1008:6: lv_parametro_2_0= ruleParametro
            	    {

            	    						newCompositeNode(grammarAccess.getParametrosAccess().getParametroParametroParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_parametro_2_0=ruleParametro();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParametrosRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parametro",
            	    							lv_parametro_2_0,
            	    							"br.ufscar.dc.compiladores.t5.T5.Parametro");
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
    // $ANTLR end "ruleParametros"


    // $ANTLR start "entryRuleParametro"
    // InternalT5.g:1030:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalT5.g:1030:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalT5.g:1031:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
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
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalT5.g:1037:1: ruleParametro returns [EObject current=null] : ( (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) ) ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ids_1_0 = null;

        EObject lv_ids_3_0 = null;

        EObject lv_tipoParam_5_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1043:2: ( ( (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) ) ) )
            // InternalT5.g:1044:2: ( (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) ) )
            {
            // InternalT5.g:1044:2: ( (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) ) )
            // InternalT5.g:1045:3: (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) )
            {
            // InternalT5.g:1045:3: (otherlv_0= 'var' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT5.g:1046:4: otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getParametroAccess().getVarKeyword_0());
                    			

                    }
                    break;

            }

            // InternalT5.g:1051:3: ( (lv_ids_1_0= ruleIdentificador ) )
            // InternalT5.g:1052:4: (lv_ids_1_0= ruleIdentificador )
            {
            // InternalT5.g:1052:4: (lv_ids_1_0= ruleIdentificador )
            // InternalT5.g:1053:5: lv_ids_1_0= ruleIdentificador
            {

            					newCompositeNode(grammarAccess.getParametroAccess().getIdsIdentificadorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_ids_1_0=ruleIdentificador();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametroRule());
            					}
            					add(
            						current,
            						"ids",
            						lv_ids_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.Identificador");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:1070:3: (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT5.g:1071:4: otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParametroAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalT5.g:1075:4: ( (lv_ids_3_0= ruleIdentificador ) )
            	    // InternalT5.g:1076:5: (lv_ids_3_0= ruleIdentificador )
            	    {
            	    // InternalT5.g:1076:5: (lv_ids_3_0= ruleIdentificador )
            	    // InternalT5.g:1077:6: lv_ids_3_0= ruleIdentificador
            	    {

            	    						newCompositeNode(grammarAccess.getParametroAccess().getIdsIdentificadorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_ids_3_0=ruleIdentificador();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParametroRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ids",
            	    							lv_ids_3_0,
            	    							"br.ufscar.dc.compiladores.t5.T5.Identificador");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getParametroAccess().getColonKeyword_3());
            		
            // InternalT5.g:1099:3: ( (lv_tipoParam_5_0= ruleTipoEstendido ) )
            // InternalT5.g:1100:4: (lv_tipoParam_5_0= ruleTipoEstendido )
            {
            // InternalT5.g:1100:4: (lv_tipoParam_5_0= ruleTipoEstendido )
            // InternalT5.g:1101:5: lv_tipoParam_5_0= ruleTipoEstendido
            {

            					newCompositeNode(grammarAccess.getParametroAccess().getTipoParamTipoEstendidoParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tipoParam_5_0=ruleTipoEstendido();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametroRule());
            					}
            					set(
            						current,
            						"tipoParam",
            						lv_tipoParam_5_0,
            						"br.ufscar.dc.compiladores.t5.T5.TipoEstendido");
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
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleCorpo"
    // InternalT5.g:1122:1: entryRuleCorpo returns [EObject current=null] : iv_ruleCorpo= ruleCorpo EOF ;
    public final EObject entryRuleCorpo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorpo = null;


        try {
            // InternalT5.g:1122:46: (iv_ruleCorpo= ruleCorpo EOF )
            // InternalT5.g:1123:2: iv_ruleCorpo= ruleCorpo EOF
            {
             newCompositeNode(grammarAccess.getCorpoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCorpo=ruleCorpo();

            state._fsp--;

             current =iv_ruleCorpo; 
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
    // $ANTLR end "entryRuleCorpo"


    // $ANTLR start "ruleCorpo"
    // InternalT5.g:1129:1: ruleCorpo returns [EObject current=null] : ( ( (lv_locais_0_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_1_0= ruleComando ) )* ) ;
    public final EObject ruleCorpo() throws RecognitionException {
        EObject current = null;

        EObject lv_locais_0_0 = null;

        EObject lv_comandos_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1135:2: ( ( ( (lv_locais_0_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_1_0= ruleComando ) )* ) )
            // InternalT5.g:1136:2: ( ( (lv_locais_0_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_1_0= ruleComando ) )* )
            {
            // InternalT5.g:1136:2: ( ( (lv_locais_0_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_1_0= ruleComando ) )* )
            // InternalT5.g:1137:3: ( (lv_locais_0_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_1_0= ruleComando ) )*
            {
            // InternalT5.g:1137:3: ( (lv_locais_0_0= ruleDeclaracaoLocal ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15||LA19_0==17||LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalT5.g:1138:4: (lv_locais_0_0= ruleDeclaracaoLocal )
            	    {
            	    // InternalT5.g:1138:4: (lv_locais_0_0= ruleDeclaracaoLocal )
            	    // InternalT5.g:1139:5: lv_locais_0_0= ruleDeclaracaoLocal
            	    {

            	    					newCompositeNode(grammarAccess.getCorpoAccess().getLocaisDeclaracaoLocalParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_locais_0_0=ruleDeclaracaoLocal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCorpoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"locais",
            	    						lv_locais_0_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.DeclaracaoLocal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalT5.g:1156:3: ( (lv_comandos_1_0= ruleComando ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==32||(LA20_0>=40 && LA20_0<=42)||LA20_0==46||LA20_0==49||LA20_0==52||LA20_0==54||LA20_0==56) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT5.g:1157:4: (lv_comandos_1_0= ruleComando )
            	    {
            	    // InternalT5.g:1157:4: (lv_comandos_1_0= ruleComando )
            	    // InternalT5.g:1158:5: lv_comandos_1_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getCorpoAccess().getComandosComandoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_comandos_1_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCorpoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_1_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleCorpo"


    // $ANTLR start "entryRuleComando"
    // InternalT5.g:1179:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalT5.g:1179:48: (iv_ruleComando= ruleComando EOF )
            // InternalT5.g:1180:2: iv_ruleComando= ruleComando EOF
            {
             newCompositeNode(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComando=ruleComando();

            state._fsp--;

             current =iv_ruleComando; 
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
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalT5.g:1186:1: ruleComando returns [EObject current=null] : (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject this_ComandoLeia_0 = null;

        EObject this_ComandoEscreva_1 = null;

        EObject this_ComandoSe_2 = null;

        EObject this_ComandoCaso_3 = null;

        EObject this_ComandoPara_4 = null;

        EObject this_ComandoEnquanto_5 = null;

        EObject this_ComandoFaca_6 = null;

        EObject this_ComandoAtribuicao_7 = null;

        EObject this_ComandoChamada_8 = null;

        EObject this_ComandoRetorne_9 = null;



        	enterRule();

        try {
            // InternalT5.g:1192:2: ( (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne ) )
            // InternalT5.g:1193:2: (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne )
            {
            // InternalT5.g:1193:2: (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne )
            int alt21=10;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalT5.g:1194:3: this_ComandoLeia_0= ruleComandoLeia
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoLeiaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoLeia_0=ruleComandoLeia();

                    state._fsp--;


                    			current = this_ComandoLeia_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalT5.g:1203:3: this_ComandoEscreva_1= ruleComandoEscreva
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoEscrevaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoEscreva_1=ruleComandoEscreva();

                    state._fsp--;


                    			current = this_ComandoEscreva_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalT5.g:1212:3: this_ComandoSe_2= ruleComandoSe
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoSeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoSe_2=ruleComandoSe();

                    state._fsp--;


                    			current = this_ComandoSe_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalT5.g:1221:3: this_ComandoCaso_3= ruleComandoCaso
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoCasoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoCaso_3=ruleComandoCaso();

                    state._fsp--;


                    			current = this_ComandoCaso_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalT5.g:1230:3: this_ComandoPara_4= ruleComandoPara
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoParaParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoPara_4=ruleComandoPara();

                    state._fsp--;


                    			current = this_ComandoPara_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalT5.g:1239:3: this_ComandoEnquanto_5= ruleComandoEnquanto
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoEnquantoParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoEnquanto_5=ruleComandoEnquanto();

                    state._fsp--;


                    			current = this_ComandoEnquanto_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalT5.g:1248:3: this_ComandoFaca_6= ruleComandoFaca
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoFacaParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoFaca_6=ruleComandoFaca();

                    state._fsp--;


                    			current = this_ComandoFaca_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalT5.g:1257:3: this_ComandoAtribuicao_7= ruleComandoAtribuicao
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoAtribuicaoParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoAtribuicao_7=ruleComandoAtribuicao();

                    state._fsp--;


                    			current = this_ComandoAtribuicao_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalT5.g:1266:3: this_ComandoChamada_8= ruleComandoChamada
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoChamadaParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoChamada_8=ruleComandoChamada();

                    state._fsp--;


                    			current = this_ComandoChamada_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalT5.g:1275:3: this_ComandoRetorne_9= ruleComandoRetorne
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandoRetorneParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandoRetorne_9=ruleComandoRetorne();

                    state._fsp--;


                    			current = this_ComandoRetorne_9;
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
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleComandoLeia"
    // InternalT5.g:1287:1: entryRuleComandoLeia returns [EObject current=null] : iv_ruleComandoLeia= ruleComandoLeia EOF ;
    public final EObject entryRuleComandoLeia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoLeia = null;


        try {
            // InternalT5.g:1287:52: (iv_ruleComandoLeia= ruleComandoLeia EOF )
            // InternalT5.g:1288:2: iv_ruleComandoLeia= ruleComandoLeia EOF
            {
             newCompositeNode(grammarAccess.getComandoLeiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoLeia=ruleComandoLeia();

            state._fsp--;

             current =iv_ruleComandoLeia; 
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
    // $ANTLR end "entryRuleComandoLeia"


    // $ANTLR start "ruleComandoLeia"
    // InternalT5.g:1294:1: ruleComandoLeia returns [EObject current=null] : (otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleComandoLeia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalT5.g:1300:2: ( (otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) )
            // InternalT5.g:1301:2: (otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            {
            // InternalT5.g:1301:2: (otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            // InternalT5.g:1302:3: otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoLeiaAccess().getLeiaKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getComandoLeiaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalT5.g:1310:3: (otherlv_2= '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalT5.g:1311:4: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_2());
                    			

                    }
                    break;

            }

            // InternalT5.g:1316:3: ( (otherlv_3= RULE_ID ) )
            // InternalT5.g:1317:4: (otherlv_3= RULE_ID )
            {
            // InternalT5.g:1317:4: (otherlv_3= RULE_ID )
            // InternalT5.g:1318:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoLeiaRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_3, grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoCrossReference_3_0());
            				

            }


            }

            // InternalT5.g:1329:3: (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalT5.g:1330:4: otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_31); 

            	    				newLeafNode(otherlv_4, grammarAccess.getComandoLeiaAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalT5.g:1334:4: (otherlv_5= '^' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==32) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalT5.g:1335:5: otherlv_5= '^'
            	            {
            	            otherlv_5=(Token)match(input,32,FOLLOW_7); 

            	            					newLeafNode(otherlv_5, grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_4_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalT5.g:1340:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalT5.g:1341:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalT5.g:1341:5: (otherlv_6= RULE_ID )
            	    // InternalT5.g:1342:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComandoLeiaRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    						newLeafNode(otherlv_6, grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoCrossReference_4_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComandoLeiaAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleComandoLeia"


    // $ANTLR start "entryRuleComandoEscreva"
    // InternalT5.g:1362:1: entryRuleComandoEscreva returns [EObject current=null] : iv_ruleComandoEscreva= ruleComandoEscreva EOF ;
    public final EObject entryRuleComandoEscreva() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoEscreva = null;


        try {
            // InternalT5.g:1362:55: (iv_ruleComandoEscreva= ruleComandoEscreva EOF )
            // InternalT5.g:1363:2: iv_ruleComandoEscreva= ruleComandoEscreva EOF
            {
             newCompositeNode(grammarAccess.getComandoEscrevaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoEscreva=ruleComandoEscreva();

            state._fsp--;

             current =iv_ruleComandoEscreva; 
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
    // $ANTLR end "entryRuleComandoEscreva"


    // $ANTLR start "ruleComandoEscreva"
    // InternalT5.g:1369:1: ruleComandoEscreva returns [EObject current=null] : (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleComandoEscreva() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_2_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1375:2: ( (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')' ) )
            // InternalT5.g:1376:2: (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')' )
            {
            // InternalT5.g:1376:2: (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')' )
            // InternalT5.g:1377:3: otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoEscrevaAccess().getEscrevaKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getComandoEscrevaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalT5.g:1385:3: ( (lv_exp_2_0= ruleExpressao ) )
            // InternalT5.g:1386:4: (lv_exp_2_0= ruleExpressao )
            {
            // InternalT5.g:1386:4: (lv_exp_2_0= ruleExpressao )
            // InternalT5.g:1387:5: lv_exp_2_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getComandoEscrevaAccess().getExpExpressaoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_exp_2_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoEscrevaRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"br.ufscar.dc.compiladores.t5.T5.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:1404:3: (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalT5.g:1405:4: otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_33); 

            	    				newLeafNode(otherlv_3, grammarAccess.getComandoEscrevaAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalT5.g:1409:4: ( (lv_exp_4_0= ruleExpressao ) )
            	    // InternalT5.g:1410:5: (lv_exp_4_0= ruleExpressao )
            	    {
            	    // InternalT5.g:1410:5: (lv_exp_4_0= ruleExpressao )
            	    // InternalT5.g:1411:6: lv_exp_4_0= ruleExpressao
            	    {

            	    						newCompositeNode(grammarAccess.getComandoEscrevaAccess().getExpExpressaoParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_exp_4_0=ruleExpressao();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComandoEscrevaRule());
            	    						}
            	    						set(
            	    							current,
            	    							"exp",
            	    							lv_exp_4_0,
            	    							"br.ufscar.dc.compiladores.t5.T5.Expressao");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComandoEscrevaAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleComandoEscreva"


    // $ANTLR start "entryRuleComandoSe"
    // InternalT5.g:1437:1: entryRuleComandoSe returns [EObject current=null] : iv_ruleComandoSe= ruleComandoSe EOF ;
    public final EObject entryRuleComandoSe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoSe = null;


        try {
            // InternalT5.g:1437:50: (iv_ruleComandoSe= ruleComandoSe EOF )
            // InternalT5.g:1438:2: iv_ruleComandoSe= ruleComandoSe EOF
            {
             newCompositeNode(grammarAccess.getComandoSeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoSe=ruleComandoSe();

            state._fsp--;

             current =iv_ruleComandoSe; 
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
    // $ANTLR end "entryRuleComandoSe"


    // $ANTLR start "ruleComandoSe"
    // InternalT5.g:1444:1: ruleComandoSe returns [EObject current=null] : (otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se' ) ;
    public final EObject ruleComandoSe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cond_1_0 = null;

        EObject lv_comandos_3_0 = null;

        EObject lv_comandosElse_5_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1450:2: ( (otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se' ) )
            // InternalT5.g:1451:2: (otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se' )
            {
            // InternalT5.g:1451:2: (otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se' )
            // InternalT5.g:1452:3: otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoSeAccess().getSeKeyword_0());
            		
            // InternalT5.g:1456:3: ( (lv_cond_1_0= ruleExpressao ) )
            // InternalT5.g:1457:4: (lv_cond_1_0= ruleExpressao )
            {
            // InternalT5.g:1457:4: (lv_cond_1_0= ruleExpressao )
            // InternalT5.g:1458:5: lv_cond_1_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getComandoSeAccess().getCondExpressaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_cond_1_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoSeRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoSeAccess().getEntaoKeyword_2());
            		
            // InternalT5.g:1479:3: ( (lv_comandos_3_0= ruleComando ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==32||(LA26_0>=40 && LA26_0<=42)||LA26_0==46||LA26_0==49||LA26_0==52||LA26_0==54||LA26_0==56) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalT5.g:1480:4: (lv_comandos_3_0= ruleComando )
            	    {
            	    // InternalT5.g:1480:4: (lv_comandos_3_0= ruleComando )
            	    // InternalT5.g:1481:5: lv_comandos_3_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getComandoSeAccess().getComandosComandoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_comandos_3_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComandoSeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_3_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalT5.g:1498:3: (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalT5.g:1499:4: otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )*
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getComandoSeAccess().getSenaoKeyword_4_0());
                    			
                    // InternalT5.g:1503:4: ( (lv_comandosElse_5_0= ruleComando ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID||LA27_0==32||(LA27_0>=40 && LA27_0<=42)||LA27_0==46||LA27_0==49||LA27_0==52||LA27_0==54||LA27_0==56) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalT5.g:1504:5: (lv_comandosElse_5_0= ruleComando )
                    	    {
                    	    // InternalT5.g:1504:5: (lv_comandosElse_5_0= ruleComando )
                    	    // InternalT5.g:1505:6: lv_comandosElse_5_0= ruleComando
                    	    {

                    	    						newCompositeNode(grammarAccess.getComandoSeAccess().getComandosElseComandoParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_36);
                    	    lv_comandosElse_5_0=ruleComando();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComandoSeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"comandosElse",
                    	    							lv_comandosElse_5_0,
                    	    							"br.ufscar.dc.compiladores.t5.T5.Comando");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComandoSeAccess().getFim_seKeyword_5());
            		

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
    // $ANTLR end "ruleComandoSe"


    // $ANTLR start "entryRuleComandoCaso"
    // InternalT5.g:1531:1: entryRuleComandoCaso returns [EObject current=null] : iv_ruleComandoCaso= ruleComandoCaso EOF ;
    public final EObject entryRuleComandoCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoCaso = null;


        try {
            // InternalT5.g:1531:52: (iv_ruleComandoCaso= ruleComandoCaso EOF )
            // InternalT5.g:1532:2: iv_ruleComandoCaso= ruleComandoCaso EOF
            {
             newCompositeNode(grammarAccess.getComandoCasoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoCaso=ruleComandoCaso();

            state._fsp--;

             current =iv_ruleComandoCaso; 
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
    // $ANTLR end "entryRuleComandoCaso"


    // $ANTLR start "ruleComandoCaso"
    // InternalT5.g:1538:1: ruleComandoCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso' ) ;
    public final EObject ruleComandoCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_exp_1_0 = null;

        EObject lv_selecao_3_0 = null;

        EObject lv_comandosElse_5_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1544:2: ( (otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso' ) )
            // InternalT5.g:1545:2: (otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso' )
            {
            // InternalT5.g:1545:2: (otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso' )
            // InternalT5.g:1546:3: otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoCasoAccess().getCasoKeyword_0());
            		
            // InternalT5.g:1550:3: ( (lv_exp_1_0= ruleExpressaoAritmetica ) )
            // InternalT5.g:1551:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            {
            // InternalT5.g:1551:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            // InternalT5.g:1552:5: lv_exp_1_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getComandoCasoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
            lv_exp_1_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoCasoRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoCasoAccess().getSejaKeyword_2());
            		
            // InternalT5.g:1573:3: ( (lv_selecao_3_0= ruleSelecao ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==58) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalT5.g:1574:4: (lv_selecao_3_0= ruleSelecao )
            	    {
            	    // InternalT5.g:1574:4: (lv_selecao_3_0= ruleSelecao )
            	    // InternalT5.g:1575:5: lv_selecao_3_0= ruleSelecao
            	    {

            	    					newCompositeNode(grammarAccess.getComandoCasoAccess().getSelecaoSelecaoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_selecao_3_0=ruleSelecao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComandoCasoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selecao",
            	    						lv_selecao_3_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Selecao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalT5.g:1592:3: (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalT5.g:1593:4: otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )*
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getComandoCasoAccess().getSenaoKeyword_4_0());
                    			
                    // InternalT5.g:1597:4: ( (lv_comandosElse_5_0= ruleComando ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID||LA30_0==32||(LA30_0>=40 && LA30_0<=42)||LA30_0==46||LA30_0==49||LA30_0==52||LA30_0==54||LA30_0==56) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalT5.g:1598:5: (lv_comandosElse_5_0= ruleComando )
                    	    {
                    	    // InternalT5.g:1598:5: (lv_comandosElse_5_0= ruleComando )
                    	    // InternalT5.g:1599:6: lv_comandosElse_5_0= ruleComando
                    	    {

                    	    						newCompositeNode(grammarAccess.getComandoCasoAccess().getComandosElseComandoParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_comandosElse_5_0=ruleComando();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComandoCasoRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"comandosElse",
                    	    							lv_comandosElse_5_0,
                    	    							"br.ufscar.dc.compiladores.t5.T5.Comando");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComandoCasoAccess().getFim_casoKeyword_5());
            		

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
    // $ANTLR end "ruleComandoCaso"


    // $ANTLR start "entryRuleComandoPara"
    // InternalT5.g:1625:1: entryRuleComandoPara returns [EObject current=null] : iv_ruleComandoPara= ruleComandoPara EOF ;
    public final EObject entryRuleComandoPara() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoPara = null;


        try {
            // InternalT5.g:1625:52: (iv_ruleComandoPara= ruleComandoPara EOF )
            // InternalT5.g:1626:2: iv_ruleComandoPara= ruleComandoPara EOF
            {
             newCompositeNode(grammarAccess.getComandoParaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoPara=ruleComandoPara();

            state._fsp--;

             current =iv_ruleComandoPara; 
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
    // $ANTLR end "entryRuleComandoPara"


    // $ANTLR start "ruleComandoPara"
    // InternalT5.g:1632:1: ruleComandoPara returns [EObject current=null] : (otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para' ) ;
    public final EObject ruleComandoPara() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_inicio_3_0 = null;

        EObject lv_fim_5_0 = null;

        EObject lv_comandos_7_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1638:2: ( (otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para' ) )
            // InternalT5.g:1639:2: (otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para' )
            {
            // InternalT5.g:1639:2: (otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para' )
            // InternalT5.g:1640:3: otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoParaAccess().getParaKeyword_0());
            		
            // InternalT5.g:1644:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalT5.g:1645:4: (lv_var_1_0= RULE_ID )
            {
            // InternalT5.g:1645:4: (lv_var_1_0= RULE_ID )
            // InternalT5.g:1646:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(lv_var_1_0, grammarAccess.getComandoParaAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoParaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoParaAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalT5.g:1666:3: ( (lv_inicio_3_0= ruleExpressaoAritmetica ) )
            // InternalT5.g:1667:4: (lv_inicio_3_0= ruleExpressaoAritmetica )
            {
            // InternalT5.g:1667:4: (lv_inicio_3_0= ruleExpressaoAritmetica )
            // InternalT5.g:1668:5: lv_inicio_3_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getComandoParaAccess().getInicioExpressaoAritmeticaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
            lv_inicio_3_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoParaRule());
            					}
            					set(
            						current,
            						"inicio",
            						lv_inicio_3_0,
            						"br.ufscar.dc.compiladores.t5.T5.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getComandoParaAccess().getAteKeyword_4());
            		
            // InternalT5.g:1689:3: ( (lv_fim_5_0= ruleExpressaoAritmetica ) )
            // InternalT5.g:1690:4: (lv_fim_5_0= ruleExpressaoAritmetica )
            {
            // InternalT5.g:1690:4: (lv_fim_5_0= ruleExpressaoAritmetica )
            // InternalT5.g:1691:5: lv_fim_5_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getComandoParaAccess().getFimExpressaoAritmeticaParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_42);
            lv_fim_5_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoParaRule());
            					}
            					set(
            						current,
            						"fim",
            						lv_fim_5_0,
            						"br.ufscar.dc.compiladores.t5.T5.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_43); 

            			newLeafNode(otherlv_6, grammarAccess.getComandoParaAccess().getFacaKeyword_6());
            		
            // InternalT5.g:1712:3: ( (lv_comandos_7_0= ruleComando ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==32||(LA32_0>=40 && LA32_0<=42)||LA32_0==46||LA32_0==49||LA32_0==52||LA32_0==54||LA32_0==56) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalT5.g:1713:4: (lv_comandos_7_0= ruleComando )
            	    {
            	    // InternalT5.g:1713:4: (lv_comandos_7_0= ruleComando )
            	    // InternalT5.g:1714:5: lv_comandos_7_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getComandoParaAccess().getComandosComandoParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_comandos_7_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComandoParaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_7_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_8=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getComandoParaAccess().getFim_paraKeyword_8());
            		

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
    // $ANTLR end "ruleComandoPara"


    // $ANTLR start "entryRuleComandoEnquanto"
    // InternalT5.g:1739:1: entryRuleComandoEnquanto returns [EObject current=null] : iv_ruleComandoEnquanto= ruleComandoEnquanto EOF ;
    public final EObject entryRuleComandoEnquanto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoEnquanto = null;


        try {
            // InternalT5.g:1739:56: (iv_ruleComandoEnquanto= ruleComandoEnquanto EOF )
            // InternalT5.g:1740:2: iv_ruleComandoEnquanto= ruleComandoEnquanto EOF
            {
             newCompositeNode(grammarAccess.getComandoEnquantoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoEnquanto=ruleComandoEnquanto();

            state._fsp--;

             current =iv_ruleComandoEnquanto; 
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
    // $ANTLR end "entryRuleComandoEnquanto"


    // $ANTLR start "ruleComandoEnquanto"
    // InternalT5.g:1746:1: ruleComandoEnquanto returns [EObject current=null] : (otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto' ) ;
    public final EObject ruleComandoEnquanto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_comandos_3_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1752:2: ( (otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto' ) )
            // InternalT5.g:1753:2: (otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto' )
            {
            // InternalT5.g:1753:2: (otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto' )
            // InternalT5.g:1754:3: otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoEnquantoAccess().getEnquantoKeyword_0());
            		
            // InternalT5.g:1758:3: ( (lv_cond_1_0= ruleExpressao ) )
            // InternalT5.g:1759:4: (lv_cond_1_0= ruleExpressao )
            {
            // InternalT5.g:1759:4: (lv_cond_1_0= ruleExpressao )
            // InternalT5.g:1760:5: lv_cond_1_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getComandoEnquantoAccess().getCondExpressaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
            lv_cond_1_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoEnquantoRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoEnquantoAccess().getFacaKeyword_2());
            		
            // InternalT5.g:1781:3: ( (lv_comandos_3_0= ruleComando ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==32||(LA33_0>=40 && LA33_0<=42)||LA33_0==46||LA33_0==49||LA33_0==52||LA33_0==54||LA33_0==56) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalT5.g:1782:4: (lv_comandos_3_0= ruleComando )
            	    {
            	    // InternalT5.g:1782:4: (lv_comandos_3_0= ruleComando )
            	    // InternalT5.g:1783:5: lv_comandos_3_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getComandoEnquantoAccess().getComandosComandoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_comandos_3_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComandoEnquantoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_3_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComandoEnquantoAccess().getFim_enquantoKeyword_4());
            		

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
    // $ANTLR end "ruleComandoEnquanto"


    // $ANTLR start "entryRuleComandoFaca"
    // InternalT5.g:1808:1: entryRuleComandoFaca returns [EObject current=null] : iv_ruleComandoFaca= ruleComandoFaca EOF ;
    public final EObject entryRuleComandoFaca() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoFaca = null;


        try {
            // InternalT5.g:1808:52: (iv_ruleComandoFaca= ruleComandoFaca EOF )
            // InternalT5.g:1809:2: iv_ruleComandoFaca= ruleComandoFaca EOF
            {
             newCompositeNode(grammarAccess.getComandoFacaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoFaca=ruleComandoFaca();

            state._fsp--;

             current =iv_ruleComandoFaca; 
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
    // $ANTLR end "entryRuleComandoFaca"


    // $ANTLR start "ruleComandoFaca"
    // InternalT5.g:1815:1: ruleComandoFaca returns [EObject current=null] : (otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) ) ) ;
    public final EObject ruleComandoFaca() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_comandos_1_0 = null;

        EObject lv_cond_3_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1821:2: ( (otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) ) ) )
            // InternalT5.g:1822:2: (otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) ) )
            {
            // InternalT5.g:1822:2: (otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) ) )
            // InternalT5.g:1823:3: otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoFacaAccess().getFacaKeyword_0());
            		
            // InternalT5.g:1827:3: ( (lv_comandos_1_0= ruleComando ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==32||(LA34_0>=40 && LA34_0<=42)||LA34_0==46||LA34_0==49||LA34_0==52||LA34_0==54||LA34_0==56) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalT5.g:1828:4: (lv_comandos_1_0= ruleComando )
            	    {
            	    // InternalT5.g:1828:4: (lv_comandos_1_0= ruleComando )
            	    // InternalT5.g:1829:5: lv_comandos_1_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getComandoFacaAccess().getComandosComandoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_45);
            	    lv_comandos_1_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComandoFacaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_1_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_2=(Token)match(input,51,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoFacaAccess().getAteKeyword_2());
            		
            // InternalT5.g:1850:3: ( (lv_cond_3_0= ruleExpressao ) )
            // InternalT5.g:1851:4: (lv_cond_3_0= ruleExpressao )
            {
            // InternalT5.g:1851:4: (lv_cond_3_0= ruleExpressao )
            // InternalT5.g:1852:5: lv_cond_3_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getComandoFacaAccess().getCondExpressaoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_cond_3_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoFacaRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_3_0,
            						"br.ufscar.dc.compiladores.t5.T5.Expressao");
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
    // $ANTLR end "ruleComandoFaca"


    // $ANTLR start "entryRuleComandoAtribuicao"
    // InternalT5.g:1873:1: entryRuleComandoAtribuicao returns [EObject current=null] : iv_ruleComandoAtribuicao= ruleComandoAtribuicao EOF ;
    public final EObject entryRuleComandoAtribuicao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoAtribuicao = null;


        try {
            // InternalT5.g:1873:58: (iv_ruleComandoAtribuicao= ruleComandoAtribuicao EOF )
            // InternalT5.g:1874:2: iv_ruleComandoAtribuicao= ruleComandoAtribuicao EOF
            {
             newCompositeNode(grammarAccess.getComandoAtribuicaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoAtribuicao=ruleComandoAtribuicao();

            state._fsp--;

             current =iv_ruleComandoAtribuicao; 
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
    // $ANTLR end "entryRuleComandoAtribuicao"


    // $ANTLR start "ruleComandoAtribuicao"
    // InternalT5.g:1880:1: ruleComandoAtribuicao returns [EObject current=null] : ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) ) ) ;
    public final EObject ruleComandoAtribuicao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_valor_3_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1886:2: ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) ) ) )
            // InternalT5.g:1887:2: ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) ) )
            {
            // InternalT5.g:1887:2: ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) ) )
            // InternalT5.g:1888:3: (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) )
            {
            // InternalT5.g:1888:3: (otherlv_0= '^' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalT5.g:1889:4: otherlv_0= '^'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getComandoAtribuicaoAccess().getCircumflexAccentKeyword_0());
                    			

                    }
                    break;

            }

            // InternalT5.g:1894:3: ( (otherlv_1= RULE_ID ) )
            // InternalT5.g:1895:4: (otherlv_1= RULE_ID )
            {
            // InternalT5.g:1895:4: (otherlv_1= RULE_ID )
            // InternalT5.g:1896:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoAtribuicaoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_1, grammarAccess.getComandoAtribuicaoAccess().getTargetDeclaracaoCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoAtribuicaoAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalT5.g:1911:3: ( (lv_valor_3_0= ruleExpressao ) )
            // InternalT5.g:1912:4: (lv_valor_3_0= ruleExpressao )
            {
            // InternalT5.g:1912:4: (lv_valor_3_0= ruleExpressao )
            // InternalT5.g:1913:5: lv_valor_3_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getComandoAtribuicaoAccess().getValorExpressaoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_valor_3_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoAtribuicaoRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_3_0,
            						"br.ufscar.dc.compiladores.t5.T5.Expressao");
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
    // $ANTLR end "ruleComandoAtribuicao"


    // $ANTLR start "entryRuleComandoChamada"
    // InternalT5.g:1934:1: entryRuleComandoChamada returns [EObject current=null] : iv_ruleComandoChamada= ruleComandoChamada EOF ;
    public final EObject entryRuleComandoChamada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoChamada = null;


        try {
            // InternalT5.g:1934:55: (iv_ruleComandoChamada= ruleComandoChamada EOF )
            // InternalT5.g:1935:2: iv_ruleComandoChamada= ruleComandoChamada EOF
            {
             newCompositeNode(grammarAccess.getComandoChamadaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoChamada=ruleComandoChamada();

            state._fsp--;

             current =iv_ruleComandoChamada; 
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
    // $ANTLR end "entryRuleComandoChamada"


    // $ANTLR start "ruleComandoChamada"
    // InternalT5.g:1941:1: ruleComandoChamada returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleComandoChamada() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalT5.g:1947:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' ) )
            // InternalT5.g:1948:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' )
            {
            // InternalT5.g:1948:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) ) )* )? otherlv_5= ')' )
            // InternalT5.g:1949:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_args_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) ) )* )? otherlv_5= ')'
            {
            // InternalT5.g:1949:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalT5.g:1950:4: (lv_name_0_0= RULE_ID )
            {
            // InternalT5.g:1950:4: (lv_name_0_0= RULE_ID )
            // InternalT5.g:1951:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComandoChamadaAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoChamadaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getComandoChamadaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalT5.g:1971:3: ( ( (lv_args_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_REAL)||LA37_0==22||LA37_0==32||LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalT5.g:1972:4: ( (lv_args_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) ) )*
                    {
                    // InternalT5.g:1972:4: ( (lv_args_2_0= ruleExpressao ) )
                    // InternalT5.g:1973:5: (lv_args_2_0= ruleExpressao )
                    {
                    // InternalT5.g:1973:5: (lv_args_2_0= ruleExpressao )
                    // InternalT5.g:1974:6: lv_args_2_0= ruleExpressao
                    {

                    						newCompositeNode(grammarAccess.getComandoChamadaAccess().getArgsExpressaoParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_args_2_0=ruleExpressao();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComandoChamadaRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_2_0,
                    							"br.ufscar.dc.compiladores.t5.T5.Expressao");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT5.g:1991:4: (otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalT5.g:1992:5: otherlv_3= ',' ( (lv_args_4_0= ruleExpressao ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_33); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getComandoChamadaAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalT5.g:1996:5: ( (lv_args_4_0= ruleExpressao ) )
                    	    // InternalT5.g:1997:6: (lv_args_4_0= ruleExpressao )
                    	    {
                    	    // InternalT5.g:1997:6: (lv_args_4_0= ruleExpressao )
                    	    // InternalT5.g:1998:7: lv_args_4_0= ruleExpressao
                    	    {

                    	    							newCompositeNode(grammarAccess.getComandoChamadaAccess().getArgsExpressaoParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_args_4_0=ruleExpressao();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComandoChamadaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_4_0,
                    	    								"br.ufscar.dc.compiladores.t5.T5.Expressao");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComandoChamadaAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleComandoChamada"


    // $ANTLR start "entryRuleComandoRetorne"
    // InternalT5.g:2025:1: entryRuleComandoRetorne returns [EObject current=null] : iv_ruleComandoRetorne= ruleComandoRetorne EOF ;
    public final EObject entryRuleComandoRetorne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoRetorne = null;


        try {
            // InternalT5.g:2025:55: (iv_ruleComandoRetorne= ruleComandoRetorne EOF )
            // InternalT5.g:2026:2: iv_ruleComandoRetorne= ruleComandoRetorne EOF
            {
             newCompositeNode(grammarAccess.getComandoRetorneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandoRetorne=ruleComandoRetorne();

            state._fsp--;

             current =iv_ruleComandoRetorne; 
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
    // $ANTLR end "entryRuleComandoRetorne"


    // $ANTLR start "ruleComandoRetorne"
    // InternalT5.g:2032:1: ruleComandoRetorne returns [EObject current=null] : (otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) ) ) ;
    public final EObject ruleComandoRetorne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2038:2: ( (otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) ) ) )
            // InternalT5.g:2039:2: (otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) ) )
            {
            // InternalT5.g:2039:2: (otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) ) )
            // InternalT5.g:2040:3: otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoRetorneAccess().getRetorneKeyword_0());
            		
            // InternalT5.g:2044:3: ( (lv_exp_1_0= ruleExpressao ) )
            // InternalT5.g:2045:4: (lv_exp_1_0= ruleExpressao )
            {
            // InternalT5.g:2045:4: (lv_exp_1_0= ruleExpressao )
            // InternalT5.g:2046:5: lv_exp_1_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getComandoRetorneAccess().getExpExpressaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_1_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoRetorneRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.Expressao");
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
    // $ANTLR end "ruleComandoRetorne"


    // $ANTLR start "entryRuleSelecao"
    // InternalT5.g:2067:1: entryRuleSelecao returns [EObject current=null] : iv_ruleSelecao= ruleSelecao EOF ;
    public final EObject entryRuleSelecao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelecao = null;


        try {
            // InternalT5.g:2067:48: (iv_ruleSelecao= ruleSelecao EOF )
            // InternalT5.g:2068:2: iv_ruleSelecao= ruleSelecao EOF
            {
             newCompositeNode(grammarAccess.getSelecaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelecao=ruleSelecao();

            state._fsp--;

             current =iv_ruleSelecao; 
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
    // $ANTLR end "entryRuleSelecao"


    // $ANTLR start "ruleSelecao"
    // InternalT5.g:2074:1: ruleSelecao returns [EObject current=null] : ( ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )* ) ;
    public final EObject ruleSelecao() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_itens_0_0 = null;

        EObject lv_comandos_2_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2080:2: ( ( ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )* ) )
            // InternalT5.g:2081:2: ( ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )* )
            {
            // InternalT5.g:2081:2: ( ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )* )
            // InternalT5.g:2082:3: ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )*
            {
            // InternalT5.g:2082:3: ( (lv_itens_0_0= ruleItemSelecao ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==58) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalT5.g:2083:4: (lv_itens_0_0= ruleItemSelecao )
            	    {
            	    // InternalT5.g:2083:4: (lv_itens_0_0= ruleItemSelecao )
            	    // InternalT5.g:2084:5: lv_itens_0_0= ruleItemSelecao
            	    {

            	    					newCompositeNode(grammarAccess.getSelecaoAccess().getItensItemSelecaoParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_47);
            	    lv_itens_0_0=ruleItemSelecao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelecaoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"itens",
            	    						lv_itens_0_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.ItemSelecao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            otherlv_1=(Token)match(input,18,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSelecaoAccess().getColonKeyword_1());
            		
            // InternalT5.g:2105:3: ( (lv_comandos_2_0= ruleComando ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==32||(LA39_0>=40 && LA39_0<=42)||LA39_0==46||LA39_0==49||LA39_0==52||LA39_0==54||LA39_0==56) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalT5.g:2106:4: (lv_comandos_2_0= ruleComando )
            	    {
            	    // InternalT5.g:2106:4: (lv_comandos_2_0= ruleComando )
            	    // InternalT5.g:2107:5: lv_comandos_2_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getSelecaoAccess().getComandosComandoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_comandos_2_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSelecaoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_2_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleSelecao"


    // $ANTLR start "entryRuleItemSelecao"
    // InternalT5.g:2128:1: entryRuleItemSelecao returns [EObject current=null] : iv_ruleItemSelecao= ruleItemSelecao EOF ;
    public final EObject entryRuleItemSelecao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemSelecao = null;


        try {
            // InternalT5.g:2128:52: (iv_ruleItemSelecao= ruleItemSelecao EOF )
            // InternalT5.g:2129:2: iv_ruleItemSelecao= ruleItemSelecao EOF
            {
             newCompositeNode(grammarAccess.getItemSelecaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemSelecao=ruleItemSelecao();

            state._fsp--;

             current =iv_ruleItemSelecao; 
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
    // $ANTLR end "entryRuleItemSelecao"


    // $ANTLR start "ruleItemSelecao"
    // InternalT5.g:2135:1: ruleItemSelecao returns [EObject current=null] : ( ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )* ) ;
    public final EObject ruleItemSelecao() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_faixas_0_0 = null;

        EObject lv_faixas_2_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2141:2: ( ( ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )* ) )
            // InternalT5.g:2142:2: ( ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )* )
            {
            // InternalT5.g:2142:2: ( ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )* )
            // InternalT5.g:2143:3: ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )*
            {
            // InternalT5.g:2143:3: ( (lv_faixas_0_0= ruleNumeroIntervalo ) )
            // InternalT5.g:2144:4: (lv_faixas_0_0= ruleNumeroIntervalo )
            {
            // InternalT5.g:2144:4: (lv_faixas_0_0= ruleNumeroIntervalo )
            // InternalT5.g:2145:5: lv_faixas_0_0= ruleNumeroIntervalo
            {

            					newCompositeNode(grammarAccess.getItemSelecaoAccess().getFaixasNumeroIntervaloParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_faixas_0_0=ruleNumeroIntervalo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemSelecaoRule());
            					}
            					add(
            						current,
            						"faixas",
            						lv_faixas_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.NumeroIntervalo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:2162:3: (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==16) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalT5.g:2163:4: otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_48); 

            	    				newLeafNode(otherlv_1, grammarAccess.getItemSelecaoAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalT5.g:2167:4: ( (lv_faixas_2_0= ruleNumeroIntervalo ) )
            	    // InternalT5.g:2168:5: (lv_faixas_2_0= ruleNumeroIntervalo )
            	    {
            	    // InternalT5.g:2168:5: (lv_faixas_2_0= ruleNumeroIntervalo )
            	    // InternalT5.g:2169:6: lv_faixas_2_0= ruleNumeroIntervalo
            	    {

            	    						newCompositeNode(grammarAccess.getItemSelecaoAccess().getFaixasNumeroIntervaloParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_faixas_2_0=ruleNumeroIntervalo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getItemSelecaoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"faixas",
            	    							lv_faixas_2_0,
            	    							"br.ufscar.dc.compiladores.t5.T5.NumeroIntervalo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleItemSelecao"


    // $ANTLR start "entryRuleNumeroIntervalo"
    // InternalT5.g:2191:1: entryRuleNumeroIntervalo returns [EObject current=null] : iv_ruleNumeroIntervalo= ruleNumeroIntervalo EOF ;
    public final EObject entryRuleNumeroIntervalo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroIntervalo = null;


        try {
            // InternalT5.g:2191:56: (iv_ruleNumeroIntervalo= ruleNumeroIntervalo EOF )
            // InternalT5.g:2192:2: iv_ruleNumeroIntervalo= ruleNumeroIntervalo EOF
            {
             newCompositeNode(grammarAccess.getNumeroIntervaloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumeroIntervalo=ruleNumeroIntervalo();

            state._fsp--;

             current =iv_ruleNumeroIntervalo; 
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
    // $ANTLR end "entryRuleNumeroIntervalo"


    // $ANTLR start "ruleNumeroIntervalo"
    // InternalT5.g:2198:1: ruleNumeroIntervalo returns [EObject current=null] : ( ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleNumeroIntervalo() throws RecognitionException {
        EObject current = null;

        Token lv_start_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;
        AntlrDatatypeRuleToken lv_sinal_0_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2204:2: ( ( ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )? ) )
            // InternalT5.g:2205:2: ( ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )? )
            {
            // InternalT5.g:2205:2: ( ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )? )
            // InternalT5.g:2206:3: ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )?
            {
            // InternalT5.g:2206:3: ( (lv_sinal_0_0= ruleOpUnario ) )
            // InternalT5.g:2207:4: (lv_sinal_0_0= ruleOpUnario )
            {
            // InternalT5.g:2207:4: (lv_sinal_0_0= ruleOpUnario )
            // InternalT5.g:2208:5: lv_sinal_0_0= ruleOpUnario
            {

            					newCompositeNode(grammarAccess.getNumeroIntervaloAccess().getSinalOpUnarioParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_49);
            lv_sinal_0_0=ruleOpUnario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumeroIntervaloRule());
            					}
            					set(
            						current,
            						"sinal",
            						lv_sinal_0_0 != null,
            						"br.ufscar.dc.compiladores.t5.T5.OpUnario");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:2225:3: ( (lv_start_1_0= RULE_INT ) )
            // InternalT5.g:2226:4: (lv_start_1_0= RULE_INT )
            {
            // InternalT5.g:2226:4: (lv_start_1_0= RULE_INT )
            // InternalT5.g:2227:5: lv_start_1_0= RULE_INT
            {
            lv_start_1_0=(Token)match(input,RULE_INT,FOLLOW_50); 

            					newLeafNode(lv_start_1_0, grammarAccess.getNumeroIntervaloAccess().getStartINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumeroIntervaloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalT5.g:2243:3: (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalT5.g:2244:4: otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_49); 

                    				newLeafNode(otherlv_2, grammarAccess.getNumeroIntervaloAccess().getFullStopFullStopKeyword_2_0());
                    			
                    // InternalT5.g:2248:4: ( (lv_end_3_0= RULE_INT ) )
                    // InternalT5.g:2249:5: (lv_end_3_0= RULE_INT )
                    {
                    // InternalT5.g:2249:5: (lv_end_3_0= RULE_INT )
                    // InternalT5.g:2250:6: lv_end_3_0= RULE_INT
                    {
                    lv_end_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_end_3_0, grammarAccess.getNumeroIntervaloAccess().getEndINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumeroIntervaloRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleNumeroIntervalo"


    // $ANTLR start "entryRuleOpUnario"
    // InternalT5.g:2271:1: entryRuleOpUnario returns [String current=null] : iv_ruleOpUnario= ruleOpUnario EOF ;
    public final String entryRuleOpUnario() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnario = null;


        try {
            // InternalT5.g:2271:48: (iv_ruleOpUnario= ruleOpUnario EOF )
            // InternalT5.g:2272:2: iv_ruleOpUnario= ruleOpUnario EOF
            {
             newCompositeNode(grammarAccess.getOpUnarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpUnario=ruleOpUnario();

            state._fsp--;

             current =iv_ruleOpUnario.getText(); 
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
    // $ANTLR end "entryRuleOpUnario"


    // $ANTLR start "ruleOpUnario"
    // InternalT5.g:2278:1: ruleOpUnario returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleOpUnario() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5.g:2284:2: (kw= '-' )
            // InternalT5.g:2285:2: kw= '-'
            {
            kw=(Token)match(input,58,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOpUnarioAccess().getHyphenMinusKeyword());
            	

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
    // $ANTLR end "ruleOpUnario"


    // $ANTLR start "entryRuleExpressaoAritmetica"
    // InternalT5.g:2293:1: entryRuleExpressaoAritmetica returns [EObject current=null] : iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF ;
    public final EObject entryRuleExpressaoAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressaoAritmetica = null;


        try {
            // InternalT5.g:2293:60: (iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF )
            // InternalT5.g:2294:2: iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpressaoAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressaoAritmetica=ruleExpressaoAritmetica();

            state._fsp--;

             current =iv_ruleExpressaoAritmetica; 
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
    // $ANTLR end "entryRuleExpressaoAritmetica"


    // $ANTLR start "ruleExpressaoAritmetica"
    // InternalT5.g:2300:1: ruleExpressaoAritmetica returns [EObject current=null] : ( ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )* ) ;
    public final EObject ruleExpressaoAritmetica() throws RecognitionException {
        EObject current = null;

        EObject lv_termos_0_0 = null;

        EObject lv_outros_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2306:2: ( ( ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )* ) )
            // InternalT5.g:2307:2: ( ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )* )
            {
            // InternalT5.g:2307:2: ( ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )* )
            // InternalT5.g:2308:3: ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )*
            {
            // InternalT5.g:2308:3: ( (lv_termos_0_0= ruleTermoAritmetico ) )
            // InternalT5.g:2309:4: (lv_termos_0_0= ruleTermoAritmetico )
            {
            // InternalT5.g:2309:4: (lv_termos_0_0= ruleTermoAritmetico )
            // InternalT5.g:2310:5: lv_termos_0_0= ruleTermoAritmetico
            {

            					newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getTermosTermoAritmeticoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_51);
            lv_termos_0_0=ruleTermoAritmetico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
            					}
            					add(
            						current,
            						"termos",
            						lv_termos_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.TermoAritmetico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:2327:3: ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==58) ) {
                    int LA42_2 = input.LA(2);

                    if ( ((LA42_2>=RULE_ID && LA42_2<=RULE_REAL)||LA42_2==22||LA42_2==32) ) {
                        alt42=1;
                    }


                }
                else if ( (LA42_0==60) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalT5.g:2328:4: (lv_outros_1_0= ruleOutroTermoAritmetico )
            	    {
            	    // InternalT5.g:2328:4: (lv_outros_1_0= ruleOutroTermoAritmetico )
            	    // InternalT5.g:2329:5: lv_outros_1_0= ruleOutroTermoAritmetico
            	    {

            	    					newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getOutrosOutroTermoAritmeticoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_outros_1_0=ruleOutroTermoAritmetico();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outros",
            	    						lv_outros_1_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.OutroTermoAritmetico");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // $ANTLR end "ruleExpressaoAritmetica"


    // $ANTLR start "entryRuleOutroTermoAritmetico"
    // InternalT5.g:2350:1: entryRuleOutroTermoAritmetico returns [EObject current=null] : iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF ;
    public final EObject entryRuleOutroTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutroTermoAritmetico = null;


        try {
            // InternalT5.g:2350:61: (iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF )
            // InternalT5.g:2351:2: iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF
            {
             newCompositeNode(grammarAccess.getOutroTermoAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutroTermoAritmetico=ruleOutroTermoAritmetico();

            state._fsp--;

             current =iv_ruleOutroTermoAritmetico; 
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
    // $ANTLR end "entryRuleOutroTermoAritmetico"


    // $ANTLR start "ruleOutroTermoAritmetico"
    // InternalT5.g:2357:1: ruleOutroTermoAritmetico returns [EObject current=null] : ( ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) ) ;
    public final EObject ruleOutroTermoAritmetico() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_termo_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2363:2: ( ( ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) ) )
            // InternalT5.g:2364:2: ( ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) )
            {
            // InternalT5.g:2364:2: ( ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) )
            // InternalT5.g:2365:3: ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) )
            {
            // InternalT5.g:2365:3: ( (lv_op_0_0= ruleOpArit1 ) )
            // InternalT5.g:2366:4: (lv_op_0_0= ruleOpArit1 )
            {
            // InternalT5.g:2366:4: (lv_op_0_0= ruleOpArit1 )
            // InternalT5.g:2367:5: lv_op_0_0= ruleOpArit1
            {

            					newCompositeNode(grammarAccess.getOutroTermoAritmeticoAccess().getOpOpArit1ParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_op_0_0=ruleOpArit1();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroTermoAritmeticoRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.OpArit1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:2384:3: ( (lv_termo_1_0= ruleTermoAritmetico ) )
            // InternalT5.g:2385:4: (lv_termo_1_0= ruleTermoAritmetico )
            {
            // InternalT5.g:2385:4: (lv_termo_1_0= ruleTermoAritmetico )
            // InternalT5.g:2386:5: lv_termo_1_0= ruleTermoAritmetico
            {

            					newCompositeNode(grammarAccess.getOutroTermoAritmeticoAccess().getTermoTermoAritmeticoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_termo_1_0=ruleTermoAritmetico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroTermoAritmeticoRule());
            					}
            					set(
            						current,
            						"termo",
            						lv_termo_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.TermoAritmetico");
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
    // $ANTLR end "ruleOutroTermoAritmetico"


    // $ANTLR start "entryRuleTermoAritmetico"
    // InternalT5.g:2407:1: entryRuleTermoAritmetico returns [EObject current=null] : iv_ruleTermoAritmetico= ruleTermoAritmetico EOF ;
    public final EObject entryRuleTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoAritmetico = null;


        try {
            // InternalT5.g:2407:56: (iv_ruleTermoAritmetico= ruleTermoAritmetico EOF )
            // InternalT5.g:2408:2: iv_ruleTermoAritmetico= ruleTermoAritmetico EOF
            {
             newCompositeNode(grammarAccess.getTermoAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermoAritmetico=ruleTermoAritmetico();

            state._fsp--;

             current =iv_ruleTermoAritmetico; 
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
    // $ANTLR end "entryRuleTermoAritmetico"


    // $ANTLR start "ruleTermoAritmetico"
    // InternalT5.g:2414:1: ruleTermoAritmetico returns [EObject current=null] : ( ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )* ) ;
    public final EObject ruleTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject lv_fatores_0_0 = null;

        EObject lv_outros_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2420:2: ( ( ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )* ) )
            // InternalT5.g:2421:2: ( ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )* )
            {
            // InternalT5.g:2421:2: ( ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )* )
            // InternalT5.g:2422:3: ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )*
            {
            // InternalT5.g:2422:3: ( (lv_fatores_0_0= ruleFatorAritmetico ) )
            // InternalT5.g:2423:4: (lv_fatores_0_0= ruleFatorAritmetico )
            {
            // InternalT5.g:2423:4: (lv_fatores_0_0= ruleFatorAritmetico )
            // InternalT5.g:2424:5: lv_fatores_0_0= ruleFatorAritmetico
            {

            					newCompositeNode(grammarAccess.getTermoAritmeticoAccess().getFatoresFatorAritmeticoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
            lv_fatores_0_0=ruleFatorAritmetico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoAritmeticoRule());
            					}
            					add(
            						current,
            						"fatores",
            						lv_fatores_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.FatorAritmetico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:2441:3: ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=61 && LA43_0<=62)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalT5.g:2442:4: (lv_outros_1_0= ruleOutroFatorAritmetico )
            	    {
            	    // InternalT5.g:2442:4: (lv_outros_1_0= ruleOutroFatorAritmetico )
            	    // InternalT5.g:2443:5: lv_outros_1_0= ruleOutroFatorAritmetico
            	    {

            	    					newCompositeNode(grammarAccess.getTermoAritmeticoAccess().getOutrosOutroFatorAritmeticoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_52);
            	    lv_outros_1_0=ruleOutroFatorAritmetico();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTermoAritmeticoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outros",
            	    						lv_outros_1_0,
            	    						"br.ufscar.dc.compiladores.t5.T5.OutroFatorAritmetico");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "ruleTermoAritmetico"


    // $ANTLR start "entryRuleOutroFatorAritmetico"
    // InternalT5.g:2464:1: entryRuleOutroFatorAritmetico returns [EObject current=null] : iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF ;
    public final EObject entryRuleOutroFatorAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutroFatorAritmetico = null;


        try {
            // InternalT5.g:2464:61: (iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF )
            // InternalT5.g:2465:2: iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF
            {
             newCompositeNode(grammarAccess.getOutroFatorAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutroFatorAritmetico=ruleOutroFatorAritmetico();

            state._fsp--;

             current =iv_ruleOutroFatorAritmetico; 
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
    // $ANTLR end "entryRuleOutroFatorAritmetico"


    // $ANTLR start "ruleOutroFatorAritmetico"
    // InternalT5.g:2471:1: ruleOutroFatorAritmetico returns [EObject current=null] : ( ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) ) ;
    public final EObject ruleOutroFatorAritmetico() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_fator_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2477:2: ( ( ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) ) )
            // InternalT5.g:2478:2: ( ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) )
            {
            // InternalT5.g:2478:2: ( ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) )
            // InternalT5.g:2479:3: ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) )
            {
            // InternalT5.g:2479:3: ( (lv_op_0_0= ruleOpArit2 ) )
            // InternalT5.g:2480:4: (lv_op_0_0= ruleOpArit2 )
            {
            // InternalT5.g:2480:4: (lv_op_0_0= ruleOpArit2 )
            // InternalT5.g:2481:5: lv_op_0_0= ruleOpArit2
            {

            					newCompositeNode(grammarAccess.getOutroFatorAritmeticoAccess().getOpOpArit2ParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_op_0_0=ruleOpArit2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroFatorAritmeticoRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.OpArit2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:2498:3: ( (lv_fator_1_0= ruleFatorAritmetico ) )
            // InternalT5.g:2499:4: (lv_fator_1_0= ruleFatorAritmetico )
            {
            // InternalT5.g:2499:4: (lv_fator_1_0= ruleFatorAritmetico )
            // InternalT5.g:2500:5: lv_fator_1_0= ruleFatorAritmetico
            {

            					newCompositeNode(grammarAccess.getOutroFatorAritmeticoAccess().getFatorFatorAritmeticoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_fator_1_0=ruleFatorAritmetico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutroFatorAritmeticoRule());
            					}
            					set(
            						current,
            						"fator",
            						lv_fator_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.FatorAritmetico");
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
    // $ANTLR end "ruleOutroFatorAritmetico"


    // $ANTLR start "entryRuleFatorAritmetico"
    // InternalT5.g:2521:1: entryRuleFatorAritmetico returns [EObject current=null] : iv_ruleFatorAritmetico= ruleFatorAritmetico EOF ;
    public final EObject entryRuleFatorAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFatorAritmetico = null;


        try {
            // InternalT5.g:2521:56: (iv_ruleFatorAritmetico= ruleFatorAritmetico EOF )
            // InternalT5.g:2522:2: iv_ruleFatorAritmetico= ruleFatorAritmetico EOF
            {
             newCompositeNode(grammarAccess.getFatorAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFatorAritmetico=ruleFatorAritmetico();

            state._fsp--;

             current =iv_ruleFatorAritmetico; 
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
    // $ANTLR end "entryRuleFatorAritmetico"


    // $ANTLR start "ruleFatorAritmetico"
    // InternalT5.g:2528:1: ruleFatorAritmetico returns [EObject current=null] : ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) ) | ( (lv_numero_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_REAL ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' ) | this_STRING_7= RULE_STRING ) ;
    public final EObject ruleFatorAritmetico() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_numero_2_0=null;
        Token lv_real_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_STRING_7=null;
        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2534:2: ( ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) ) | ( (lv_numero_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_REAL ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' ) | this_STRING_7= RULE_STRING ) )
            // InternalT5.g:2535:2: ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) ) | ( (lv_numero_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_REAL ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' ) | this_STRING_7= RULE_STRING )
            {
            // InternalT5.g:2535:2: ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) ) | ( (lv_numero_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_REAL ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' ) | this_STRING_7= RULE_STRING )
            int alt45=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 32:
                {
                alt45=1;
                }
                break;
            case RULE_INT:
                {
                alt45=2;
                }
                break;
            case RULE_REAL:
                {
                alt45=3;
                }
                break;
            case 22:
                {
                alt45=4;
                }
                break;
            case RULE_STRING:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalT5.g:2536:3: ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalT5.g:2536:3: ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) )
                    // InternalT5.g:2537:4: (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalT5.g:2537:4: (otherlv_0= '^' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==32) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalT5.g:2538:5: otherlv_0= '^'
                            {
                            otherlv_0=(Token)match(input,32,FOLLOW_7); 

                            					newLeafNode(otherlv_0, grammarAccess.getFatorAritmeticoAccess().getCircumflexAccentKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalT5.g:2543:4: ( (otherlv_1= RULE_ID ) )
                    // InternalT5.g:2544:5: (otherlv_1= RULE_ID )
                    {
                    // InternalT5.g:2544:5: (otherlv_1= RULE_ID )
                    // InternalT5.g:2545:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFatorAritmeticoRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getFatorAritmeticoAccess().getRefDeclaracaoCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:2558:3: ( (lv_numero_2_0= RULE_INT ) )
                    {
                    // InternalT5.g:2558:3: ( (lv_numero_2_0= RULE_INT ) )
                    // InternalT5.g:2559:4: (lv_numero_2_0= RULE_INT )
                    {
                    // InternalT5.g:2559:4: (lv_numero_2_0= RULE_INT )
                    // InternalT5.g:2560:5: lv_numero_2_0= RULE_INT
                    {
                    lv_numero_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_numero_2_0, grammarAccess.getFatorAritmeticoAccess().getNumeroINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFatorAritmeticoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"numero",
                    						lv_numero_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:2577:3: ( (lv_real_3_0= RULE_REAL ) )
                    {
                    // InternalT5.g:2577:3: ( (lv_real_3_0= RULE_REAL ) )
                    // InternalT5.g:2578:4: (lv_real_3_0= RULE_REAL )
                    {
                    // InternalT5.g:2578:4: (lv_real_3_0= RULE_REAL )
                    // InternalT5.g:2579:5: lv_real_3_0= RULE_REAL
                    {
                    lv_real_3_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    					newLeafNode(lv_real_3_0, grammarAccess.getFatorAritmeticoAccess().getRealREALTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFatorAritmeticoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_3_0,
                    						"br.ufscar.dc.compiladores.t5.T5.REAL");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:2596:3: (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' )
                    {
                    // InternalT5.g:2596:3: (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' )
                    // InternalT5.g:2597:4: otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getFatorAritmeticoAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalT5.g:2601:4: ( (lv_exp_5_0= ruleExpressaoAritmetica ) )
                    // InternalT5.g:2602:5: (lv_exp_5_0= ruleExpressaoAritmetica )
                    {
                    // InternalT5.g:2602:5: (lv_exp_5_0= ruleExpressaoAritmetica )
                    // InternalT5.g:2603:6: lv_exp_5_0= ruleExpressaoAritmetica
                    {

                    						newCompositeNode(grammarAccess.getFatorAritmeticoAccess().getExpExpressaoAritmeticaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_exp_5_0=ruleExpressaoAritmetica();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFatorAritmeticoRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_5_0,
                    							"br.ufscar.dc.compiladores.t5.T5.ExpressaoAritmetica");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFatorAritmeticoAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalT5.g:2626:3: this_STRING_7= RULE_STRING
                    {
                    this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			newLeafNode(this_STRING_7, grammarAccess.getFatorAritmeticoAccess().getSTRINGTerminalRuleCall_4());
                    		

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
    // $ANTLR end "ruleFatorAritmetico"


    // $ANTLR start "entryRuleExpressao"
    // InternalT5.g:2634:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalT5.g:2634:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalT5.g:2635:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao; 
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
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalT5.g:2641:1: ruleExpressao returns [EObject current=null] : ( ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )* ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject lv_logicos_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_logicos_2_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2647:2: ( ( ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )* ) )
            // InternalT5.g:2648:2: ( ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )* )
            {
            // InternalT5.g:2648:2: ( ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )* )
            // InternalT5.g:2649:3: ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )*
            {
            // InternalT5.g:2649:3: ( (lv_logicos_0_0= ruleTermoLogico ) )
            // InternalT5.g:2650:4: (lv_logicos_0_0= ruleTermoLogico )
            {
            // InternalT5.g:2650:4: (lv_logicos_0_0= ruleTermoLogico )
            // InternalT5.g:2651:5: lv_logicos_0_0= ruleTermoLogico
            {

            					newCompositeNode(grammarAccess.getExpressaoAccess().getLogicosTermoLogicoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
            lv_logicos_0_0=ruleTermoLogico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressaoRule());
            					}
            					add(
            						current,
            						"logicos",
            						lv_logicos_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.TermoLogico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:2668:3: ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=68 && LA46_0<=69)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalT5.g:2669:4: ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) )
            	    {
            	    // InternalT5.g:2669:4: ( (lv_op_1_0= ruleOpBool ) )
            	    // InternalT5.g:2670:5: (lv_op_1_0= ruleOpBool )
            	    {
            	    // InternalT5.g:2670:5: (lv_op_1_0= ruleOpBool )
            	    // InternalT5.g:2671:6: lv_op_1_0= ruleOpBool
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoAccess().getOpOpBoolParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_op_1_0=ruleOpBool();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_1_0,
            	    							"br.ufscar.dc.compiladores.t5.T5.OpBool");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalT5.g:2688:4: ( (lv_logicos_2_0= ruleTermoLogico ) )
            	    // InternalT5.g:2689:5: (lv_logicos_2_0= ruleTermoLogico )
            	    {
            	    // InternalT5.g:2689:5: (lv_logicos_2_0= ruleTermoLogico )
            	    // InternalT5.g:2690:6: lv_logicos_2_0= ruleTermoLogico
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoAccess().getLogicosTermoLogicoParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_53);
            	    lv_logicos_2_0=ruleTermoLogico();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"logicos",
            	    							lv_logicos_2_0,
            	    							"br.ufscar.dc.compiladores.t5.T5.TermoLogico");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleTermoLogico"
    // InternalT5.g:2712:1: entryRuleTermoLogico returns [EObject current=null] : iv_ruleTermoLogico= ruleTermoLogico EOF ;
    public final EObject entryRuleTermoLogico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoLogico = null;


        try {
            // InternalT5.g:2712:52: (iv_ruleTermoLogico= ruleTermoLogico EOF )
            // InternalT5.g:2713:2: iv_ruleTermoLogico= ruleTermoLogico EOF
            {
             newCompositeNode(grammarAccess.getTermoLogicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermoLogico=ruleTermoLogico();

            state._fsp--;

             current =iv_ruleTermoLogico; 
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
    // $ANTLR end "entryRuleTermoLogico"


    // $ANTLR start "ruleTermoLogico"
    // InternalT5.g:2719:1: ruleTermoLogico returns [EObject current=null] : ( (otherlv_0= 'nao' )? ( (lv_rel_1_0= ruleExpressaoRelacional ) ) ) ;
    public final EObject ruleTermoLogico() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rel_1_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2725:2: ( ( (otherlv_0= 'nao' )? ( (lv_rel_1_0= ruleExpressaoRelacional ) ) ) )
            // InternalT5.g:2726:2: ( (otherlv_0= 'nao' )? ( (lv_rel_1_0= ruleExpressaoRelacional ) ) )
            {
            // InternalT5.g:2726:2: ( (otherlv_0= 'nao' )? ( (lv_rel_1_0= ruleExpressaoRelacional ) ) )
            // InternalT5.g:2727:3: (otherlv_0= 'nao' )? ( (lv_rel_1_0= ruleExpressaoRelacional ) )
            {
            // InternalT5.g:2727:3: (otherlv_0= 'nao' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==59) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalT5.g:2728:4: otherlv_0= 'nao'
                    {
                    otherlv_0=(Token)match(input,59,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getTermoLogicoAccess().getNaoKeyword_0());
                    			

                    }
                    break;

            }

            // InternalT5.g:2733:3: ( (lv_rel_1_0= ruleExpressaoRelacional ) )
            // InternalT5.g:2734:4: (lv_rel_1_0= ruleExpressaoRelacional )
            {
            // InternalT5.g:2734:4: (lv_rel_1_0= ruleExpressaoRelacional )
            // InternalT5.g:2735:5: lv_rel_1_0= ruleExpressaoRelacional
            {

            					newCompositeNode(grammarAccess.getTermoLogicoAccess().getRelExpressaoRelacionalParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rel_1_0=ruleExpressaoRelacional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoLogicoRule());
            					}
            					set(
            						current,
            						"rel",
            						lv_rel_1_0,
            						"br.ufscar.dc.compiladores.t5.T5.ExpressaoRelacional");
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
    // $ANTLR end "ruleTermoLogico"


    // $ANTLR start "entryRuleExpressaoRelacional"
    // InternalT5.g:2756:1: entryRuleExpressaoRelacional returns [EObject current=null] : iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF ;
    public final EObject entryRuleExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressaoRelacional = null;


        try {
            // InternalT5.g:2756:60: (iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF )
            // InternalT5.g:2757:2: iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressaoRelacional=ruleExpressaoRelacional();

            state._fsp--;

             current =iv_ruleExpressaoRelacional; 
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
    // $ANTLR end "entryRuleExpressaoRelacional"


    // $ANTLR start "ruleExpressaoRelacional"
    // InternalT5.g:2763:1: ruleExpressaoRelacional returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )? ) ;
    public final EObject ruleExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalT5.g:2769:2: ( ( ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )? ) )
            // InternalT5.g:2770:2: ( ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )? )
            {
            // InternalT5.g:2770:2: ( ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )? )
            // InternalT5.g:2771:3: ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )?
            {
            // InternalT5.g:2771:3: ( (lv_left_0_0= ruleExpressaoAritmetica ) )
            // InternalT5.g:2772:4: (lv_left_0_0= ruleExpressaoAritmetica )
            {
            // InternalT5.g:2772:4: (lv_left_0_0= ruleExpressaoAritmetica )
            // InternalT5.g:2773:5: lv_left_0_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getLeftExpressaoAritmeticaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_54);
            lv_left_0_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"br.ufscar.dc.compiladores.t5.T5.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5.g:2790:3: ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19||(LA48_0>=63 && LA48_0<=67)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalT5.g:2791:4: ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) )
                    {
                    // InternalT5.g:2791:4: ( (lv_op_1_0= ruleOpRel ) )
                    // InternalT5.g:2792:5: (lv_op_1_0= ruleOpRel )
                    {
                    // InternalT5.g:2792:5: (lv_op_1_0= ruleOpRel )
                    // InternalT5.g:2793:6: lv_op_1_0= ruleOpRel
                    {

                    						newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getOpOpRelParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_op_1_0=ruleOpRel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"br.ufscar.dc.compiladores.t5.T5.OpRel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT5.g:2810:4: ( (lv_right_2_0= ruleExpressaoAritmetica ) )
                    // InternalT5.g:2811:5: (lv_right_2_0= ruleExpressaoAritmetica )
                    {
                    // InternalT5.g:2811:5: (lv_right_2_0= ruleExpressaoAritmetica )
                    // InternalT5.g:2812:6: lv_right_2_0= ruleExpressaoAritmetica
                    {

                    						newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getRightExpressaoAritmeticaParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleExpressaoAritmetica();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"br.ufscar.dc.compiladores.t5.T5.ExpressaoAritmetica");
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
    // $ANTLR end "ruleExpressaoRelacional"


    // $ANTLR start "entryRuleOpArit1"
    // InternalT5.g:2834:1: entryRuleOpArit1 returns [String current=null] : iv_ruleOpArit1= ruleOpArit1 EOF ;
    public final String entryRuleOpArit1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpArit1 = null;


        try {
            // InternalT5.g:2834:47: (iv_ruleOpArit1= ruleOpArit1 EOF )
            // InternalT5.g:2835:2: iv_ruleOpArit1= ruleOpArit1 EOF
            {
             newCompositeNode(grammarAccess.getOpArit1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpArit1=ruleOpArit1();

            state._fsp--;

             current =iv_ruleOpArit1.getText(); 
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
    // $ANTLR end "entryRuleOpArit1"


    // $ANTLR start "ruleOpArit1"
    // InternalT5.g:2841:1: ruleOpArit1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpArit1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5.g:2847:2: ( (kw= '+' | kw= '-' ) )
            // InternalT5.g:2848:2: (kw= '+' | kw= '-' )
            {
            // InternalT5.g:2848:2: (kw= '+' | kw= '-' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==58) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalT5.g:2849:3: kw= '+'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5.g:2855:3: kw= '-'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit1Access().getHyphenMinusKeyword_1());
                    		

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
    // $ANTLR end "ruleOpArit1"


    // $ANTLR start "entryRuleOpArit2"
    // InternalT5.g:2864:1: entryRuleOpArit2 returns [String current=null] : iv_ruleOpArit2= ruleOpArit2 EOF ;
    public final String entryRuleOpArit2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpArit2 = null;


        try {
            // InternalT5.g:2864:47: (iv_ruleOpArit2= ruleOpArit2 EOF )
            // InternalT5.g:2865:2: iv_ruleOpArit2= ruleOpArit2 EOF
            {
             newCompositeNode(grammarAccess.getOpArit2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpArit2=ruleOpArit2();

            state._fsp--;

             current =iv_ruleOpArit2.getText(); 
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
    // $ANTLR end "entryRuleOpArit2"


    // $ANTLR start "ruleOpArit2"
    // InternalT5.g:2871:1: ruleOpArit2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOpArit2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5.g:2877:2: ( (kw= '*' | kw= '/' ) )
            // InternalT5.g:2878:2: (kw= '*' | kw= '/' )
            {
            // InternalT5.g:2878:2: (kw= '*' | kw= '/' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            else if ( (LA50_0==62) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalT5.g:2879:3: kw= '*'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5.g:2885:3: kw= '/'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit2Access().getSolidusKeyword_1());
                    		

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
    // $ANTLR end "ruleOpArit2"


    // $ANTLR start "entryRuleOpRel"
    // InternalT5.g:2894:1: entryRuleOpRel returns [String current=null] : iv_ruleOpRel= ruleOpRel EOF ;
    public final String entryRuleOpRel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpRel = null;


        try {
            // InternalT5.g:2894:45: (iv_ruleOpRel= ruleOpRel EOF )
            // InternalT5.g:2895:2: iv_ruleOpRel= ruleOpRel EOF
            {
             newCompositeNode(grammarAccess.getOpRelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpRel=ruleOpRel();

            state._fsp--;

             current =iv_ruleOpRel.getText(); 
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
    // $ANTLR end "entryRuleOpRel"


    // $ANTLR start "ruleOpRel"
    // InternalT5.g:2901:1: ruleOpRel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleOpRel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5.g:2907:2: ( (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' ) )
            // InternalT5.g:2908:2: (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' )
            {
            // InternalT5.g:2908:2: (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt51=1;
                }
                break;
            case 64:
                {
                alt51=2;
                }
                break;
            case 65:
                {
                alt51=3;
                }
                break;
            case 66:
                {
                alt51=4;
                }
                break;
            case 67:
                {
                alt51=5;
                }
                break;
            case 19:
                {
                alt51=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalT5.g:2909:3: kw= '>'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5.g:2915:3: kw= '>='
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT5.g:2921:3: kw= '<'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT5.g:2927:3: kw= '<='
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalT5.g:2933:3: kw= '<>'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalT5.g:2939:3: kw= '='
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getEqualsSignKeyword_5());
                    		

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
    // $ANTLR end "ruleOpRel"


    // $ANTLR start "entryRuleOpBool"
    // InternalT5.g:2948:1: entryRuleOpBool returns [String current=null] : iv_ruleOpBool= ruleOpBool EOF ;
    public final String entryRuleOpBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpBool = null;


        try {
            // InternalT5.g:2948:46: (iv_ruleOpBool= ruleOpBool EOF )
            // InternalT5.g:2949:2: iv_ruleOpBool= ruleOpBool EOF
            {
             newCompositeNode(grammarAccess.getOpBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpBool=ruleOpBool();

            state._fsp--;

             current =iv_ruleOpBool.getText(); 
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
    // $ANTLR end "entryRuleOpBool"


    // $ANTLR start "ruleOpBool"
    // InternalT5.g:2955:1: ruleOpBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e' | kw= 'ou' ) ;
    public final AntlrDatatypeRuleToken ruleOpBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5.g:2961:2: ( (kw= 'e' | kw= 'ou' ) )
            // InternalT5.g:2962:2: (kw= 'e' | kw= 'ou' )
            {
            // InternalT5.g:2962:2: (kw= 'e' | kw= 'ou' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==68) ) {
                alt52=1;
            }
            else if ( (LA52_0==69) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalT5.g:2963:3: kw= 'e'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpBoolAccess().getEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5.g:2969:3: kw= 'ou'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpBoolAccess().getOuKeyword_1());
                    		

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
    // $ANTLR end "ruleOpBool"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\10\uffff\1\26\2\uffff";
    static final String dfa_3s = "\1\70\10\uffff\1\62\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\11";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\33\uffff\1\10\7\uffff\1\1\1\2\1\3\3\uffff\1\4\2\uffff\1\5\2\uffff\1\7\1\uffff\1\6\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\33\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1193:2: (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002328000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000232A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x015247010012C010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000060000000E0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001F40000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000800010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0152470101128010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0152470104128010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001004000F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001E00000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0152470100128012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0152470100000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x08000001004000F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0152770100000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0152670100000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0401100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0153470100000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0172470100000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x01D2470100000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x015A470100000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000100C000F0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1400000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000080002L,0x000000000000000FL});

}