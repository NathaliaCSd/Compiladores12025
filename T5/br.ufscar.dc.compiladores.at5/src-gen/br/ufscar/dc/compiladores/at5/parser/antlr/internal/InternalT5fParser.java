package br.ufscar.dc.compiladores.at5.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufscar.dc.compiladores.at5.services.T5fGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT5fParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DECLARACOES'", "'ALGORITMO'", "'FIM_ALGORITMO'", "'declare'", "','", "'constante'", "':'", "'='", "'tipo'", "'procedimento'", "'('", "')'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", "'.'", "'['", "']'", "'registro'", "'fim_registro'", "'^'", "'literal'", "'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", "'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'atribua'", "'chame'", "'retorne'", "'..'", "'-'", "'nao'", "'+'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'e'", "'ou'"
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
    public static final int T__70=70;
    public static final int T__71=71;
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


        public InternalT5fParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalT5fParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalT5fParser.tokenNames; }
    public String getGrammarFileName() { return "InternalT5f.g"; }



     	private T5fGrammarAccess grammarAccess;

        public InternalT5fParser(TokenStream input, T5fGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programa";
       	}

       	@Override
       	protected T5fGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrograma"
    // InternalT5f.g:64:1: entryRulePrograma returns [EObject current=null] : iv_rulePrograma= rulePrograma EOF ;
    public final EObject entryRulePrograma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrograma = null;


        try {
            // InternalT5f.g:64:49: (iv_rulePrograma= rulePrograma EOF )
            // InternalT5f.g:65:2: iv_rulePrograma= rulePrograma EOF
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
    // InternalT5f.g:71:1: rulePrograma returns [EObject current=null] : (otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO' ) ;
    public final EObject rulePrograma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_declaracoes_1_0 = null;

        EObject lv_corpo_3_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:77:2: ( (otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO' ) )
            // InternalT5f.g:78:2: (otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO' )
            {
            // InternalT5f.g:78:2: (otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO' )
            // InternalT5f.g:79:3: otherlv_0= 'DECLARACOES' ( (lv_declaracoes_1_0= ruleDeclaracao ) )+ otherlv_2= 'ALGORITMO' ( (lv_corpo_3_0= ruleCorpo ) ) otherlv_4= 'FIM_ALGORITMO'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramaAccess().getDECLARACOESKeyword_0());
            		
            // InternalT5f.g:83:3: ( (lv_declaracoes_1_0= ruleDeclaracao ) )+
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
            	    // InternalT5f.g:84:4: (lv_declaracoes_1_0= ruleDeclaracao )
            	    {
            	    // InternalT5f.g:84:4: (lv_declaracoes_1_0= ruleDeclaracao )
            	    // InternalT5f.g:85:5: lv_declaracoes_1_0= ruleDeclaracao
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.Declaracao");
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
            		
            // InternalT5f.g:106:3: ( (lv_corpo_3_0= ruleCorpo ) )
            // InternalT5f.g:107:4: (lv_corpo_3_0= ruleCorpo )
            {
            // InternalT5f.g:107:4: (lv_corpo_3_0= ruleCorpo )
            // InternalT5f.g:108:5: lv_corpo_3_0= ruleCorpo
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
            						"br.ufscar.dc.compiladores.at5.T5f.Corpo");
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
    // InternalT5f.g:133:1: entryRuleDeclaracao returns [EObject current=null] : iv_ruleDeclaracao= ruleDeclaracao EOF ;
    public final EObject entryRuleDeclaracao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracao = null;


        try {
            // InternalT5f.g:133:51: (iv_ruleDeclaracao= ruleDeclaracao EOF )
            // InternalT5f.g:134:2: iv_ruleDeclaracao= ruleDeclaracao EOF
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
    // InternalT5f.g:140:1: ruleDeclaracao returns [EObject current=null] : (this_DeclaracaoLocal_0= ruleDeclaracaoLocal | this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal ) ;
    public final EObject ruleDeclaracao() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaracaoLocal_0 = null;

        EObject this_DeclaracaoGlobal_1 = null;



        	enterRule();

        try {
            // InternalT5f.g:146:2: ( (this_DeclaracaoLocal_0= ruleDeclaracaoLocal | this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal ) )
            // InternalT5f.g:147:2: (this_DeclaracaoLocal_0= ruleDeclaracaoLocal | this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal )
            {
            // InternalT5f.g:147:2: (this_DeclaracaoLocal_0= ruleDeclaracaoLocal | this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal )
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
                    // InternalT5f.g:148:3: this_DeclaracaoLocal_0= ruleDeclaracaoLocal
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
                    // InternalT5f.g:157:3: this_DeclaracaoGlobal_1= ruleDeclaracaoGlobal
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
    // InternalT5f.g:169:1: entryRuleDeclaracaoLocal returns [EObject current=null] : iv_ruleDeclaracaoLocal= ruleDeclaracaoLocal EOF ;
    public final EObject entryRuleDeclaracaoLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracaoLocal = null;


        try {
            // InternalT5f.g:169:56: (iv_ruleDeclaracaoLocal= ruleDeclaracaoLocal EOF )
            // InternalT5f.g:170:2: iv_ruleDeclaracaoLocal= ruleDeclaracaoLocal EOF
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
    // InternalT5f.g:176:1: ruleDeclaracaoLocal returns [EObject current=null] : ( (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* ) | (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) ) | (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) ) ) ;
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
            // InternalT5f.g:182:2: ( ( (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* ) | (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) ) | (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) ) ) )
            // InternalT5f.g:183:2: ( (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* ) | (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) ) | (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) ) )
            {
            // InternalT5f.g:183:2: ( (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* ) | (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) ) | (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) ) )
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
                    // InternalT5f.g:184:3: (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* )
                    {
                    // InternalT5f.g:184:3: (otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )* )
                    // InternalT5f.g:185:4: otherlv_0= 'declare' ( (lv_variaveis_1_0= ruleVariavel ) ) (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )*
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getDeclaracaoLocalAccess().getDeclareKeyword_0_0());
                    			
                    // InternalT5f.g:189:4: ( (lv_variaveis_1_0= ruleVariavel ) )
                    // InternalT5f.g:190:5: (lv_variaveis_1_0= ruleVariavel )
                    {
                    // InternalT5f.g:190:5: (lv_variaveis_1_0= ruleVariavel )
                    // InternalT5f.g:191:6: lv_variaveis_1_0= ruleVariavel
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
                    							"br.ufscar.dc.compiladores.at5.T5f.Variavel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT5f.g:208:4: (otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT5f.g:209:5: otherlv_2= ',' ( (lv_variaveis_3_0= ruleVariavel ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getDeclaracaoLocalAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalT5f.g:213:5: ( (lv_variaveis_3_0= ruleVariavel ) )
                    	    // InternalT5f.g:214:6: (lv_variaveis_3_0= ruleVariavel )
                    	    {
                    	    // InternalT5f.g:214:6: (lv_variaveis_3_0= ruleVariavel )
                    	    // InternalT5f.g:215:7: lv_variaveis_3_0= ruleVariavel
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
                    	    								"br.ufscar.dc.compiladores.at5.T5f.Variavel");
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
                    // InternalT5f.g:235:3: (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) )
                    {
                    // InternalT5f.g:235:3: (otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) ) )
                    // InternalT5f.g:236:4: otherlv_4= 'constante' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' ( (lv_tipoBasico_7_0= ruleTipoBasico ) ) otherlv_8= '=' ( (lv_valor_9_0= ruleValorConstante ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeclaracaoLocalAccess().getConstanteKeyword_1_0());
                    			
                    // InternalT5f.g:240:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalT5f.g:241:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalT5f.g:241:5: (lv_name_5_0= RULE_ID )
                    // InternalT5f.g:242:6: lv_name_5_0= RULE_ID
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
                    							"br.ufscar.dc.compiladores.at5.T5f.ID");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeclaracaoLocalAccess().getColonKeyword_1_2());
                    			
                    // InternalT5f.g:262:4: ( (lv_tipoBasico_7_0= ruleTipoBasico ) )
                    // InternalT5f.g:263:5: (lv_tipoBasico_7_0= ruleTipoBasico )
                    {
                    // InternalT5f.g:263:5: (lv_tipoBasico_7_0= ruleTipoBasico )
                    // InternalT5f.g:264:6: lv_tipoBasico_7_0= ruleTipoBasico
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
                    							"br.ufscar.dc.compiladores.at5.T5f.TipoBasico");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeclaracaoLocalAccess().getEqualsSignKeyword_1_4());
                    			
                    // InternalT5f.g:285:4: ( (lv_valor_9_0= ruleValorConstante ) )
                    // InternalT5f.g:286:5: (lv_valor_9_0= ruleValorConstante )
                    {
                    // InternalT5f.g:286:5: (lv_valor_9_0= ruleValorConstante )
                    // InternalT5f.g:287:6: lv_valor_9_0= ruleValorConstante
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
                    							"br.ufscar.dc.compiladores.at5.T5f.ValorConstante");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalT5f.g:306:3: (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) )
                    {
                    // InternalT5f.g:306:3: (otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) ) )
                    // InternalT5f.g:307:4: otherlv_10= 'tipo' ( (lv_name_11_0= RULE_ID ) ) otherlv_12= ':' ( (lv_tipoDef_13_0= ruleTipo ) )
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeclaracaoLocalAccess().getTipoKeyword_2_0());
                    			
                    // InternalT5f.g:311:4: ( (lv_name_11_0= RULE_ID ) )
                    // InternalT5f.g:312:5: (lv_name_11_0= RULE_ID )
                    {
                    // InternalT5f.g:312:5: (lv_name_11_0= RULE_ID )
                    // InternalT5f.g:313:6: lv_name_11_0= RULE_ID
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
                    							"br.ufscar.dc.compiladores.at5.T5f.ID");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getDeclaracaoLocalAccess().getColonKeyword_2_2());
                    			
                    // InternalT5f.g:333:4: ( (lv_tipoDef_13_0= ruleTipo ) )
                    // InternalT5f.g:334:5: (lv_tipoDef_13_0= ruleTipo )
                    {
                    // InternalT5f.g:334:5: (lv_tipoDef_13_0= ruleTipo )
                    // InternalT5f.g:335:6: lv_tipoDef_13_0= ruleTipo
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
                    							"br.ufscar.dc.compiladores.at5.T5f.Tipo");
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
    // InternalT5f.g:357:1: entryRuleDeclaracaoGlobal returns [EObject current=null] : iv_ruleDeclaracaoGlobal= ruleDeclaracaoGlobal EOF ;
    public final EObject entryRuleDeclaracaoGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracaoGlobal = null;


        try {
            // InternalT5f.g:357:57: (iv_ruleDeclaracaoGlobal= ruleDeclaracaoGlobal EOF )
            // InternalT5f.g:358:2: iv_ruleDeclaracaoGlobal= ruleDeclaracaoGlobal EOF
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
    // InternalT5f.g:364:1: ruleDeclaracaoGlobal returns [EObject current=null] : ( (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' ) | (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' ) ) ;
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
            // InternalT5f.g:370:2: ( ( (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' ) | (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' ) ) )
            // InternalT5f.g:371:2: ( (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' ) | (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' ) )
            {
            // InternalT5f.g:371:2: ( (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' ) | (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' ) )
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
                    // InternalT5f.g:372:3: (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' )
                    {
                    // InternalT5f.g:372:3: (otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento' )
                    // InternalT5f.g:373:4: otherlv_0= 'procedimento' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametros_3_0= ruleParametros ) )? otherlv_4= ')' ( (lv_corpo_5_0= ruleCorpo ) ) otherlv_6= 'fim_procedimento'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getDeclaracaoGlobalAccess().getProcedimentoKeyword_0_0());
                    			
                    // InternalT5f.g:377:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalT5f.g:378:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalT5f.g:378:5: (lv_name_1_0= RULE_ID )
                    // InternalT5f.g:379:6: lv_name_1_0= RULE_ID
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
                    							"br.ufscar.dc.compiladores.at5.T5f.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclaracaoGlobalAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalT5f.g:399:4: ( (lv_parametros_3_0= ruleParametros ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_ID||LA5_0==39) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalT5f.g:400:5: (lv_parametros_3_0= ruleParametros )
                            {
                            // InternalT5f.g:400:5: (lv_parametros_3_0= ruleParametros )
                            // InternalT5f.g:401:6: lv_parametros_3_0= ruleParametros
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
                            							"br.ufscar.dc.compiladores.at5.T5f.Parametros");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeclaracaoGlobalAccess().getRightParenthesisKeyword_0_4());
                    			
                    // InternalT5f.g:422:4: ( (lv_corpo_5_0= ruleCorpo ) )
                    // InternalT5f.g:423:5: (lv_corpo_5_0= ruleCorpo )
                    {
                    // InternalT5f.g:423:5: (lv_corpo_5_0= ruleCorpo )
                    // InternalT5f.g:424:6: lv_corpo_5_0= ruleCorpo
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
                    							"br.ufscar.dc.compiladores.at5.T5f.Corpo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeclaracaoGlobalAccess().getFim_procedimentoKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalT5f.g:447:3: (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' )
                    {
                    // InternalT5f.g:447:3: (otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao' )
                    // InternalT5f.g:448:4: otherlv_7= 'funcao' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '(' ( (lv_parametros_10_0= ruleParametros ) )? otherlv_11= ')' otherlv_12= ':' ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) ) ( (lv_corpo_14_0= ruleCorpo ) ) otherlv_15= 'fim_funcao'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getDeclaracaoGlobalAccess().getFuncaoKeyword_1_0());
                    			
                    // InternalT5f.g:452:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalT5f.g:453:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalT5f.g:453:5: (lv_name_8_0= RULE_ID )
                    // InternalT5f.g:454:6: lv_name_8_0= RULE_ID
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
                    							"br.ufscar.dc.compiladores.at5.T5f.ID");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeclaracaoGlobalAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalT5f.g:474:4: ( (lv_parametros_10_0= ruleParametros ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID||LA6_0==39) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalT5f.g:475:5: (lv_parametros_10_0= ruleParametros )
                            {
                            // InternalT5f.g:475:5: (lv_parametros_10_0= ruleParametros )
                            // InternalT5f.g:476:6: lv_parametros_10_0= ruleParametros
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
                            							"br.ufscar.dc.compiladores.at5.T5f.Parametros");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getDeclaracaoGlobalAccess().getRightParenthesisKeyword_1_4());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getDeclaracaoGlobalAccess().getColonKeyword_1_5());
                    			
                    // InternalT5f.g:501:4: ( (lv_tipoRetorno_13_0= ruleTipoEstendido ) )
                    // InternalT5f.g:502:5: (lv_tipoRetorno_13_0= ruleTipoEstendido )
                    {
                    // InternalT5f.g:502:5: (lv_tipoRetorno_13_0= ruleTipoEstendido )
                    // InternalT5f.g:503:6: lv_tipoRetorno_13_0= ruleTipoEstendido
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
                    							"br.ufscar.dc.compiladores.at5.T5f.TipoEstendido");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT5f.g:520:4: ( (lv_corpo_14_0= ruleCorpo ) )
                    // InternalT5f.g:521:5: (lv_corpo_14_0= ruleCorpo )
                    {
                    // InternalT5f.g:521:5: (lv_corpo_14_0= ruleCorpo )
                    // InternalT5f.g:522:6: lv_corpo_14_0= ruleCorpo
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
                    							"br.ufscar.dc.compiladores.at5.T5f.Corpo");
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
    // InternalT5f.g:548:1: entryRuleVariavel returns [EObject current=null] : iv_ruleVariavel= ruleVariavel EOF ;
    public final EObject entryRuleVariavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariavel = null;


        try {
            // InternalT5f.g:548:49: (iv_ruleVariavel= ruleVariavel EOF )
            // InternalT5f.g:549:2: iv_ruleVariavel= ruleVariavel EOF
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
    // InternalT5f.g:555:1: ruleVariavel returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) ) ) ;
    public final EObject ruleVariavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_tipoVar_2_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:561:2: ( ( ( (lv_name_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) ) ) )
            // InternalT5f.g:562:2: ( ( (lv_name_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) ) )
            {
            // InternalT5f.g:562:2: ( ( (lv_name_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) ) )
            // InternalT5f.g:563:3: ( (lv_name_0_0= ruleIdentificador ) ) otherlv_1= ':' ( (lv_tipoVar_2_0= ruleTipo ) )
            {
            // InternalT5f.g:563:3: ( (lv_name_0_0= ruleIdentificador ) )
            // InternalT5f.g:564:4: (lv_name_0_0= ruleIdentificador )
            {
            // InternalT5f.g:564:4: (lv_name_0_0= ruleIdentificador )
            // InternalT5f.g:565:5: lv_name_0_0= ruleIdentificador
            {

            					newCompositeNode(grammarAccess.getVariavelAccess().getNameIdentificadorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleIdentificador();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariavelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"br.ufscar.dc.compiladores.at5.T5f.Identificador");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVariavelAccess().getColonKeyword_1());
            		
            // InternalT5f.g:586:3: ( (lv_tipoVar_2_0= ruleTipo ) )
            // InternalT5f.g:587:4: (lv_tipoVar_2_0= ruleTipo )
            {
            // InternalT5f.g:587:4: (lv_tipoVar_2_0= ruleTipo )
            // InternalT5f.g:588:5: lv_tipoVar_2_0= ruleTipo
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
            						"br.ufscar.dc.compiladores.at5.T5f.Tipo");
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
    // InternalT5f.g:609:1: entryRuleIdentificador returns [EObject current=null] : iv_ruleIdentificador= ruleIdentificador EOF ;
    public final EObject entryRuleIdentificador() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentificador = null;


        try {
            // InternalT5f.g:609:54: (iv_ruleIdentificador= ruleIdentificador EOF )
            // InternalT5f.g:610:2: iv_ruleIdentificador= ruleIdentificador EOF
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
    // InternalT5f.g:616:1: ruleIdentificador returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_parts_2_0= RULE_ID ) ) )* ( (lv_dimensoes_3_0= ruleDimensao ) )* ) ;
    public final EObject ruleIdentificador() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_parts_2_0=null;
        EObject lv_dimensoes_3_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:622:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_parts_2_0= RULE_ID ) ) )* ( (lv_dimensoes_3_0= ruleDimensao ) )* ) )
            // InternalT5f.g:623:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_parts_2_0= RULE_ID ) ) )* ( (lv_dimensoes_3_0= ruleDimensao ) )* )
            {
            // InternalT5f.g:623:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_parts_2_0= RULE_ID ) ) )* ( (lv_dimensoes_3_0= ruleDimensao ) )* )
            // InternalT5f.g:624:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_parts_2_0= RULE_ID ) ) )* ( (lv_dimensoes_3_0= ruleDimensao ) )*
            {
            // InternalT5f.g:624:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalT5f.g:625:4: (lv_name_0_0= RULE_ID )
            {
            // InternalT5f.g:625:4: (lv_name_0_0= RULE_ID )
            // InternalT5f.g:626:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIdentificadorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentificadorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"br.ufscar.dc.compiladores.at5.T5f.ID");
            				

            }


            }

            // InternalT5f.g:642:3: (otherlv_1= '.' ( (lv_parts_2_0= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalT5f.g:643:4: otherlv_1= '.' ( (lv_parts_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentificadorAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalT5f.g:647:4: ( (lv_parts_2_0= RULE_ID ) )
            	    // InternalT5f.g:648:5: (lv_parts_2_0= RULE_ID )
            	    {
            	    // InternalT5f.g:648:5: (lv_parts_2_0= RULE_ID )
            	    // InternalT5f.g:649:6: lv_parts_2_0= RULE_ID
            	    {
            	    lv_parts_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(lv_parts_2_0, grammarAccess.getIdentificadorAccess().getPartsIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIdentificadorRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"parts",
            	    							lv_parts_2_0,
            	    							"br.ufscar.dc.compiladores.at5.T5f.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalT5f.g:666:3: ( (lv_dimensoes_3_0= ruleDimensao ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalT5f.g:667:4: (lv_dimensoes_3_0= ruleDimensao )
            	    {
            	    // InternalT5f.g:667:4: (lv_dimensoes_3_0= ruleDimensao )
            	    // InternalT5f.g:668:5: lv_dimensoes_3_0= ruleDimensao
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.Dimensao");
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
    // InternalT5f.g:689:1: entryRuleDimensao returns [EObject current=null] : iv_ruleDimensao= ruleDimensao EOF ;
    public final EObject entryRuleDimensao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensao = null;


        try {
            // InternalT5f.g:689:49: (iv_ruleDimensao= ruleDimensao EOF )
            // InternalT5f.g:690:2: iv_ruleDimensao= ruleDimensao EOF
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
    // InternalT5f.g:696:1: ruleDimensao returns [EObject current=null] : (otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']' ) ;
    public final EObject ruleDimensao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:702:2: ( (otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']' ) )
            // InternalT5f.g:703:2: (otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']' )
            {
            // InternalT5f.g:703:2: (otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']' )
            // InternalT5f.g:704:3: otherlv_0= '[' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensaoAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalT5f.g:708:3: ( (lv_exp_1_0= ruleExpressaoAritmetica ) )
            // InternalT5f.g:709:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            {
            // InternalT5f.g:709:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            // InternalT5f.g:710:5: lv_exp_1_0= ruleExpressaoAritmetica
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
            						"br.ufscar.dc.compiladores.at5.T5f.ExpressaoAritmetica");
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
    // InternalT5f.g:735:1: entryRuleTipo returns [EObject current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final EObject entryRuleTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipo = null;


        try {
            // InternalT5f.g:735:45: (iv_ruleTipo= ruleTipo EOF )
            // InternalT5f.g:736:2: iv_ruleTipo= ruleTipo EOF
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
    // InternalT5f.g:742:1: ruleTipo returns [EObject current=null] : ( ( (lv_registro_0_0= ruleRegistro ) ) | ( (lv_tipoExt_1_0= ruleTipoEstendido ) ) ) ;
    public final EObject ruleTipo() throws RecognitionException {
        EObject current = null;

        EObject lv_registro_0_0 = null;

        EObject lv_tipoExt_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:748:2: ( ( ( (lv_registro_0_0= ruleRegistro ) ) | ( (lv_tipoExt_1_0= ruleTipoEstendido ) ) ) )
            // InternalT5f.g:749:2: ( ( (lv_registro_0_0= ruleRegistro ) ) | ( (lv_tipoExt_1_0= ruleTipoEstendido ) ) )
            {
            // InternalT5f.g:749:2: ( ( (lv_registro_0_0= ruleRegistro ) ) | ( (lv_tipoExt_1_0= ruleTipoEstendido ) ) )
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
                    // InternalT5f.g:750:3: ( (lv_registro_0_0= ruleRegistro ) )
                    {
                    // InternalT5f.g:750:3: ( (lv_registro_0_0= ruleRegistro ) )
                    // InternalT5f.g:751:4: (lv_registro_0_0= ruleRegistro )
                    {
                    // InternalT5f.g:751:4: (lv_registro_0_0= ruleRegistro )
                    // InternalT5f.g:752:5: lv_registro_0_0= ruleRegistro
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
                    						"br.ufscar.dc.compiladores.at5.T5f.Registro");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT5f.g:770:3: ( (lv_tipoExt_1_0= ruleTipoEstendido ) )
                    {
                    // InternalT5f.g:770:3: ( (lv_tipoExt_1_0= ruleTipoEstendido ) )
                    // InternalT5f.g:771:4: (lv_tipoExt_1_0= ruleTipoEstendido )
                    {
                    // InternalT5f.g:771:4: (lv_tipoExt_1_0= ruleTipoEstendido )
                    // InternalT5f.g:772:5: lv_tipoExt_1_0= ruleTipoEstendido
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
                    						"br.ufscar.dc.compiladores.at5.T5f.TipoEstendido");
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
    // InternalT5f.g:793:1: entryRuleRegistro returns [EObject current=null] : iv_ruleRegistro= ruleRegistro EOF ;
    public final EObject entryRuleRegistro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistro = null;


        try {
            // InternalT5f.g:793:49: (iv_ruleRegistro= ruleRegistro EOF )
            // InternalT5f.g:794:2: iv_ruleRegistro= ruleRegistro EOF
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
    // InternalT5f.g:800:1: ruleRegistro returns [EObject current=null] : ( () otherlv_1= 'registro' ( (lv_campos_2_0= ruleVariavel ) )* otherlv_3= 'fim_registro' ) ;
    public final EObject ruleRegistro() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_campos_2_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:806:2: ( ( () otherlv_1= 'registro' ( (lv_campos_2_0= ruleVariavel ) )* otherlv_3= 'fim_registro' ) )
            // InternalT5f.g:807:2: ( () otherlv_1= 'registro' ( (lv_campos_2_0= ruleVariavel ) )* otherlv_3= 'fim_registro' )
            {
            // InternalT5f.g:807:2: ( () otherlv_1= 'registro' ( (lv_campos_2_0= ruleVariavel ) )* otherlv_3= 'fim_registro' )
            // InternalT5f.g:808:3: () otherlv_1= 'registro' ( (lv_campos_2_0= ruleVariavel ) )* otherlv_3= 'fim_registro'
            {
            // InternalT5f.g:808:3: ()
            // InternalT5f.g:809:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegistroAccess().getRegistroAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getRegistroAccess().getRegistroKeyword_1());
            		
            // InternalT5f.g:819:3: ( (lv_campos_2_0= ruleVariavel ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalT5f.g:820:4: (lv_campos_2_0= ruleVariavel )
            	    {
            	    // InternalT5f.g:820:4: (lv_campos_2_0= ruleVariavel )
            	    // InternalT5f.g:821:5: lv_campos_2_0= ruleVariavel
            	    {

            	    					newCompositeNode(grammarAccess.getRegistroAccess().getCamposVariavelParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_campos_2_0=ruleVariavel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRegistroRule());
            	    					}
            	    					add(
            	    						current,
            	    						"campos",
            	    						lv_campos_2_0,
            	    						"br.ufscar.dc.compiladores.at5.T5f.Variavel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRegistroAccess().getFim_registroKeyword_3());
            		

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
    // InternalT5f.g:846:1: entryRuleTipoEstendido returns [EObject current=null] : iv_ruleTipoEstendido= ruleTipoEstendido EOF ;
    public final EObject entryRuleTipoEstendido() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoEstendido = null;


        try {
            // InternalT5f.g:846:54: (iv_ruleTipoEstendido= ruleTipoEstendido EOF )
            // InternalT5f.g:847:2: iv_ruleTipoEstendido= ruleTipoEstendido EOF
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
    // InternalT5f.g:853:1: ruleTipoEstendido returns [EObject current=null] : ( (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleTipoEstendido() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_basic_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:859:2: ( ( (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalT5f.g:860:2: ( (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalT5f.g:860:2: ( (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalT5f.g:861:3: (otherlv_0= '^' )? ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalT5f.g:861:3: (otherlv_0= '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalT5f.g:862:4: otherlv_0= '^'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getTipoEstendidoAccess().getCircumflexAccentKeyword_0());
                    			

                    }
                    break;

            }

            // InternalT5f.g:867:3: ( ( (lv_basic_1_0= ruleTipoBasico ) ) | ( (otherlv_2= RULE_ID ) ) )
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
                    // InternalT5f.g:868:4: ( (lv_basic_1_0= ruleTipoBasico ) )
                    {
                    // InternalT5f.g:868:4: ( (lv_basic_1_0= ruleTipoBasico ) )
                    // InternalT5f.g:869:5: (lv_basic_1_0= ruleTipoBasico )
                    {
                    // InternalT5f.g:869:5: (lv_basic_1_0= ruleTipoBasico )
                    // InternalT5f.g:870:6: lv_basic_1_0= ruleTipoBasico
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
                    							"br.ufscar.dc.compiladores.at5.T5f.TipoBasico");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT5f.g:888:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalT5f.g:888:4: ( (otherlv_2= RULE_ID ) )
                    // InternalT5f.g:889:5: (otherlv_2= RULE_ID )
                    {
                    // InternalT5f.g:889:5: (otherlv_2= RULE_ID )
                    // InternalT5f.g:890:6: otherlv_2= RULE_ID
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
    // InternalT5f.g:906:1: entryRuleTipoBasico returns [String current=null] : iv_ruleTipoBasico= ruleTipoBasico EOF ;
    public final String entryRuleTipoBasico() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoBasico = null;


        try {
            // InternalT5f.g:906:50: (iv_ruleTipoBasico= ruleTipoBasico EOF )
            // InternalT5f.g:907:2: iv_ruleTipoBasico= ruleTipoBasico EOF
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
    // InternalT5f.g:913:1: ruleTipoBasico returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'literal' | kw= 'inteiro' | kw= 'real' | kw= 'logico' ) ;
    public final AntlrDatatypeRuleToken ruleTipoBasico() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5f.g:919:2: ( (kw= 'literal' | kw= 'inteiro' | kw= 'real' | kw= 'logico' ) )
            // InternalT5f.g:920:2: (kw= 'literal' | kw= 'inteiro' | kw= 'real' | kw= 'logico' )
            {
            // InternalT5f.g:920:2: (kw= 'literal' | kw= 'inteiro' | kw= 'real' | kw= 'logico' )
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
                    // InternalT5f.g:921:3: kw= 'literal'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBasicoAccess().getLiteralKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5f.g:927:3: kw= 'inteiro'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBasicoAccess().getInteiroKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT5f.g:933:3: kw= 'real'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoBasicoAccess().getRealKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT5f.g:939:3: kw= 'logico'
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
    // InternalT5f.g:948:1: entryRuleValorConstante returns [String current=null] : iv_ruleValorConstante= ruleValorConstante EOF ;
    public final String entryRuleValorConstante() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValorConstante = null;


        try {
            // InternalT5f.g:948:54: (iv_ruleValorConstante= ruleValorConstante EOF )
            // InternalT5f.g:949:2: iv_ruleValorConstante= ruleValorConstante EOF
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
    // InternalT5f.g:955:1: ruleValorConstante returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_REAL_2= RULE_REAL | kw= 'verdadeiro' | kw= 'falso' ) ;
    public final AntlrDatatypeRuleToken ruleValorConstante() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token this_REAL_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalT5f.g:961:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_REAL_2= RULE_REAL | kw= 'verdadeiro' | kw= 'falso' ) )
            // InternalT5f.g:962:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_REAL_2= RULE_REAL | kw= 'verdadeiro' | kw= 'falso' )
            {
            // InternalT5f.g:962:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_REAL_2= RULE_REAL | kw= 'verdadeiro' | kw= 'falso' )
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
                    // InternalT5f.g:963:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getValorConstanteAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5f.g:971:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getValorConstanteAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT5f.g:979:3: this_REAL_2= RULE_REAL
                    {
                    this_REAL_2=(Token)match(input,RULE_REAL,FOLLOW_2); 

                    			current.merge(this_REAL_2);
                    		

                    			newLeafNode(this_REAL_2, grammarAccess.getValorConstanteAccess().getREALTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT5f.g:987:3: kw= 'verdadeiro'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getValorConstanteAccess().getVerdadeiroKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalT5f.g:993:3: kw= 'falso'
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
    // InternalT5f.g:1002:1: entryRuleParametros returns [EObject current=null] : iv_ruleParametros= ruleParametros EOF ;
    public final EObject entryRuleParametros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametros = null;


        try {
            // InternalT5f.g:1002:51: (iv_ruleParametros= ruleParametros EOF )
            // InternalT5f.g:1003:2: iv_ruleParametros= ruleParametros EOF
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
    // InternalT5f.g:1009:1: ruleParametros returns [EObject current=null] : ( ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )* ) ;
    public final EObject ruleParametros() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parametro_0_0 = null;

        EObject lv_parametro_2_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:1015:2: ( ( ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )* ) )
            // InternalT5f.g:1016:2: ( ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )* )
            {
            // InternalT5f.g:1016:2: ( ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )* )
            // InternalT5f.g:1017:3: ( (lv_parametro_0_0= ruleParametro ) ) (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )*
            {
            // InternalT5f.g:1017:3: ( (lv_parametro_0_0= ruleParametro ) )
            // InternalT5f.g:1018:4: (lv_parametro_0_0= ruleParametro )
            {
            // InternalT5f.g:1018:4: (lv_parametro_0_0= ruleParametro )
            // InternalT5f.g:1019:5: lv_parametro_0_0= ruleParametro
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
            						"br.ufscar.dc.compiladores.at5.T5f.Parametro");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:1036:3: (otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalT5f.g:1037:4: otherlv_1= ',' ( (lv_parametro_2_0= ruleParametro ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_27); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParametrosAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalT5f.g:1041:4: ( (lv_parametro_2_0= ruleParametro ) )
            	    // InternalT5f.g:1042:5: (lv_parametro_2_0= ruleParametro )
            	    {
            	    // InternalT5f.g:1042:5: (lv_parametro_2_0= ruleParametro )
            	    // InternalT5f.g:1043:6: lv_parametro_2_0= ruleParametro
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
            	    							"br.ufscar.dc.compiladores.at5.T5f.Parametro");
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
    // InternalT5f.g:1065:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalT5f.g:1065:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalT5f.g:1066:2: iv_ruleParametro= ruleParametro EOF
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
    // InternalT5f.g:1072:1: ruleParametro returns [EObject current=null] : ( (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) ) ) ;
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
            // InternalT5f.g:1078:2: ( ( (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) ) ) )
            // InternalT5f.g:1079:2: ( (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) ) )
            {
            // InternalT5f.g:1079:2: ( (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) ) )
            // InternalT5f.g:1080:3: (otherlv_0= 'var' )? ( (lv_ids_1_0= ruleIdentificador ) ) (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )* otherlv_4= ':' ( (lv_tipoParam_5_0= ruleTipoEstendido ) )
            {
            // InternalT5f.g:1080:3: (otherlv_0= 'var' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT5f.g:1081:4: otherlv_0= 'var'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getParametroAccess().getVarKeyword_0());
                    			

                    }
                    break;

            }

            // InternalT5f.g:1086:3: ( (lv_ids_1_0= ruleIdentificador ) )
            // InternalT5f.g:1087:4: (lv_ids_1_0= ruleIdentificador )
            {
            // InternalT5f.g:1087:4: (lv_ids_1_0= ruleIdentificador )
            // InternalT5f.g:1088:5: lv_ids_1_0= ruleIdentificador
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
            						"br.ufscar.dc.compiladores.at5.T5f.Identificador");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:1105:3: (otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT5f.g:1106:4: otherlv_2= ',' ( (lv_ids_3_0= ruleIdentificador ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParametroAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalT5f.g:1110:4: ( (lv_ids_3_0= ruleIdentificador ) )
            	    // InternalT5f.g:1111:5: (lv_ids_3_0= ruleIdentificador )
            	    {
            	    // InternalT5f.g:1111:5: (lv_ids_3_0= ruleIdentificador )
            	    // InternalT5f.g:1112:6: lv_ids_3_0= ruleIdentificador
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
            	    							"br.ufscar.dc.compiladores.at5.T5f.Identificador");
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
            		
            // InternalT5f.g:1134:3: ( (lv_tipoParam_5_0= ruleTipoEstendido ) )
            // InternalT5f.g:1135:4: (lv_tipoParam_5_0= ruleTipoEstendido )
            {
            // InternalT5f.g:1135:4: (lv_tipoParam_5_0= ruleTipoEstendido )
            // InternalT5f.g:1136:5: lv_tipoParam_5_0= ruleTipoEstendido
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
            						"br.ufscar.dc.compiladores.at5.T5f.TipoEstendido");
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
    // InternalT5f.g:1157:1: entryRuleCorpo returns [EObject current=null] : iv_ruleCorpo= ruleCorpo EOF ;
    public final EObject entryRuleCorpo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCorpo = null;


        try {
            // InternalT5f.g:1157:46: (iv_ruleCorpo= ruleCorpo EOF )
            // InternalT5f.g:1158:2: iv_ruleCorpo= ruleCorpo EOF
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
    // InternalT5f.g:1164:1: ruleCorpo returns [EObject current=null] : ( () ( (lv_locais_1_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_2_0= ruleComando ) )* ) ;
    public final EObject ruleCorpo() throws RecognitionException {
        EObject current = null;

        EObject lv_locais_1_0 = null;

        EObject lv_comandos_2_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:1170:2: ( ( () ( (lv_locais_1_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_2_0= ruleComando ) )* ) )
            // InternalT5f.g:1171:2: ( () ( (lv_locais_1_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_2_0= ruleComando ) )* )
            {
            // InternalT5f.g:1171:2: ( () ( (lv_locais_1_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_2_0= ruleComando ) )* )
            // InternalT5f.g:1172:3: () ( (lv_locais_1_0= ruleDeclaracaoLocal ) )* ( (lv_comandos_2_0= ruleComando ) )*
            {
            // InternalT5f.g:1172:3: ()
            // InternalT5f.g:1173:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCorpoAccess().getCorpoAction_0(),
            					current);
            			

            }

            // InternalT5f.g:1179:3: ( (lv_locais_1_0= ruleDeclaracaoLocal ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15||LA19_0==17||LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalT5f.g:1180:4: (lv_locais_1_0= ruleDeclaracaoLocal )
            	    {
            	    // InternalT5f.g:1180:4: (lv_locais_1_0= ruleDeclaracaoLocal )
            	    // InternalT5f.g:1181:5: lv_locais_1_0= ruleDeclaracaoLocal
            	    {

            	    					newCompositeNode(grammarAccess.getCorpoAccess().getLocaisDeclaracaoLocalParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_locais_1_0=ruleDeclaracaoLocal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCorpoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"locais",
            	    						lv_locais_1_0,
            	    						"br.ufscar.dc.compiladores.at5.T5f.DeclaracaoLocal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalT5f.g:1198:3: ( (lv_comandos_2_0= ruleComando ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=40 && LA20_0<=42)||LA20_0==46||LA20_0==49||LA20_0==52||LA20_0==54||(LA20_0>=56 && LA20_0<=58)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT5f.g:1199:4: (lv_comandos_2_0= ruleComando )
            	    {
            	    // InternalT5f.g:1199:4: (lv_comandos_2_0= ruleComando )
            	    // InternalT5f.g:1200:5: lv_comandos_2_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getCorpoAccess().getComandosComandoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_comandos_2_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCorpoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_2_0,
            	    						"br.ufscar.dc.compiladores.at5.T5f.Comando");
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
    // InternalT5f.g:1221:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalT5f.g:1221:48: (iv_ruleComando= ruleComando EOF )
            // InternalT5f.g:1222:2: iv_ruleComando= ruleComando EOF
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
    // InternalT5f.g:1228:1: ruleComando returns [EObject current=null] : (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne ) ;
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
            // InternalT5f.g:1234:2: ( (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne ) )
            // InternalT5f.g:1235:2: (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne )
            {
            // InternalT5f.g:1235:2: (this_ComandoLeia_0= ruleComandoLeia | this_ComandoEscreva_1= ruleComandoEscreva | this_ComandoSe_2= ruleComandoSe | this_ComandoCaso_3= ruleComandoCaso | this_ComandoPara_4= ruleComandoPara | this_ComandoEnquanto_5= ruleComandoEnquanto | this_ComandoFaca_6= ruleComandoFaca | this_ComandoAtribuicao_7= ruleComandoAtribuicao | this_ComandoChamada_8= ruleComandoChamada | this_ComandoRetorne_9= ruleComandoRetorne )
            int alt21=10;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            case 46:
                {
                alt21=4;
                }
                break;
            case 49:
                {
                alt21=5;
                }
                break;
            case 54:
                {
                alt21=6;
                }
                break;
            case 52:
                {
                alt21=7;
                }
                break;
            case 56:
                {
                alt21=8;
                }
                break;
            case 57:
                {
                alt21=9;
                }
                break;
            case 58:
                {
                alt21=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalT5f.g:1236:3: this_ComandoLeia_0= ruleComandoLeia
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
                    // InternalT5f.g:1245:3: this_ComandoEscreva_1= ruleComandoEscreva
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
                    // InternalT5f.g:1254:3: this_ComandoSe_2= ruleComandoSe
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
                    // InternalT5f.g:1263:3: this_ComandoCaso_3= ruleComandoCaso
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
                    // InternalT5f.g:1272:3: this_ComandoPara_4= ruleComandoPara
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
                    // InternalT5f.g:1281:3: this_ComandoEnquanto_5= ruleComandoEnquanto
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
                    // InternalT5f.g:1290:3: this_ComandoFaca_6= ruleComandoFaca
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
                    // InternalT5f.g:1299:3: this_ComandoAtribuicao_7= ruleComandoAtribuicao
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
                    // InternalT5f.g:1308:3: this_ComandoChamada_8= ruleComandoChamada
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
                    // InternalT5f.g:1317:3: this_ComandoRetorne_9= ruleComandoRetorne
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
    // InternalT5f.g:1329:1: entryRuleComandoLeia returns [EObject current=null] : iv_ruleComandoLeia= ruleComandoLeia EOF ;
    public final EObject entryRuleComandoLeia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoLeia = null;


        try {
            // InternalT5f.g:1329:52: (iv_ruleComandoLeia= ruleComandoLeia EOF )
            // InternalT5f.g:1330:2: iv_ruleComandoLeia= ruleComandoLeia EOF
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
    // InternalT5f.g:1336:1: ruleComandoLeia returns [EObject current=null] : (otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) ;
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
            // InternalT5f.g:1342:2: ( (otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) )
            // InternalT5f.g:1343:2: (otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            {
            // InternalT5f.g:1343:2: (otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            // InternalT5f.g:1344:3: otherlv_0= 'leia' otherlv_1= '(' (otherlv_2= '^' )? ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoLeiaAccess().getLeiaKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getComandoLeiaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalT5f.g:1352:3: (otherlv_2= '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalT5f.g:1353:4: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_2());
                    			

                    }
                    break;

            }

            // InternalT5f.g:1358:3: ( (otherlv_3= RULE_ID ) )
            // InternalT5f.g:1359:4: (otherlv_3= RULE_ID )
            {
            // InternalT5f.g:1359:4: (otherlv_3= RULE_ID )
            // InternalT5f.g:1360:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoLeiaRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); 

            					newLeafNode(otherlv_3, grammarAccess.getComandoLeiaAccess().getAlvoVariavelCrossReference_3_0());
            				

            }


            }

            // InternalT5f.g:1371:3: (otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalT5f.g:1372:4: otherlv_4= ',' (otherlv_5= '^' )? ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_31); 

            	    				newLeafNode(otherlv_4, grammarAccess.getComandoLeiaAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalT5f.g:1376:4: (otherlv_5= '^' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==32) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalT5f.g:1377:5: otherlv_5= '^'
            	            {
            	            otherlv_5=(Token)match(input,32,FOLLOW_7); 

            	            					newLeafNode(otherlv_5, grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_4_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalT5f.g:1382:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalT5f.g:1383:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalT5f.g:1383:5: (otherlv_6= RULE_ID )
            	    // InternalT5f.g:1384:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComandoLeiaRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    						newLeafNode(otherlv_6, grammarAccess.getComandoLeiaAccess().getAlvoVariavelCrossReference_4_2_0());
            	    					

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
    // InternalT5f.g:1404:1: entryRuleComandoEscreva returns [EObject current=null] : iv_ruleComandoEscreva= ruleComandoEscreva EOF ;
    public final EObject entryRuleComandoEscreva() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoEscreva = null;


        try {
            // InternalT5f.g:1404:55: (iv_ruleComandoEscreva= ruleComandoEscreva EOF )
            // InternalT5f.g:1405:2: iv_ruleComandoEscreva= ruleComandoEscreva EOF
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
    // InternalT5f.g:1411:1: ruleComandoEscreva returns [EObject current=null] : (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')' ) ;
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
            // InternalT5f.g:1417:2: ( (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')' ) )
            // InternalT5f.g:1418:2: (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')' )
            {
            // InternalT5f.g:1418:2: (otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')' )
            // InternalT5f.g:1419:3: otherlv_0= 'escreva' otherlv_1= '(' ( (lv_exp_2_0= ruleExpressao ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoEscrevaAccess().getEscrevaKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getComandoEscrevaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalT5f.g:1427:3: ( (lv_exp_2_0= ruleExpressao ) )
            // InternalT5f.g:1428:4: (lv_exp_2_0= ruleExpressao )
            {
            // InternalT5f.g:1428:4: (lv_exp_2_0= ruleExpressao )
            // InternalT5f.g:1429:5: lv_exp_2_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getComandoEscrevaAccess().getExpExpressaoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_exp_2_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComandoEscrevaRule());
            					}
            					add(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"br.ufscar.dc.compiladores.at5.T5f.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:1446:3: (otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==16) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalT5f.g:1447:4: otherlv_3= ',' ( (lv_exp_4_0= ruleExpressao ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_33); 

            	    				newLeafNode(otherlv_3, grammarAccess.getComandoEscrevaAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalT5f.g:1451:4: ( (lv_exp_4_0= ruleExpressao ) )
            	    // InternalT5f.g:1452:5: (lv_exp_4_0= ruleExpressao )
            	    {
            	    // InternalT5f.g:1452:5: (lv_exp_4_0= ruleExpressao )
            	    // InternalT5f.g:1453:6: lv_exp_4_0= ruleExpressao
            	    {

            	    						newCompositeNode(grammarAccess.getComandoEscrevaAccess().getExpExpressaoParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_exp_4_0=ruleExpressao();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComandoEscrevaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exp",
            	    							lv_exp_4_0,
            	    							"br.ufscar.dc.compiladores.at5.T5f.Expressao");
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
    // InternalT5f.g:1479:1: entryRuleComandoSe returns [EObject current=null] : iv_ruleComandoSe= ruleComandoSe EOF ;
    public final EObject entryRuleComandoSe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoSe = null;


        try {
            // InternalT5f.g:1479:50: (iv_ruleComandoSe= ruleComandoSe EOF )
            // InternalT5f.g:1480:2: iv_ruleComandoSe= ruleComandoSe EOF
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
    // InternalT5f.g:1486:1: ruleComandoSe returns [EObject current=null] : (otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se' ) ;
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
            // InternalT5f.g:1492:2: ( (otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se' ) )
            // InternalT5f.g:1493:2: (otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se' )
            {
            // InternalT5f.g:1493:2: (otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se' )
            // InternalT5f.g:1494:3: otherlv_0= 'se' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'entao' ( (lv_comandos_3_0= ruleComando ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_se'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoSeAccess().getSeKeyword_0());
            		
            // InternalT5f.g:1498:3: ( (lv_cond_1_0= ruleExpressao ) )
            // InternalT5f.g:1499:4: (lv_cond_1_0= ruleExpressao )
            {
            // InternalT5f.g:1499:4: (lv_cond_1_0= ruleExpressao )
            // InternalT5f.g:1500:5: lv_cond_1_0= ruleExpressao
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
            						"br.ufscar.dc.compiladores.at5.T5f.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoSeAccess().getEntaoKeyword_2());
            		
            // InternalT5f.g:1521:3: ( (lv_comandos_3_0= ruleComando ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=40 && LA26_0<=42)||LA26_0==46||LA26_0==49||LA26_0==52||LA26_0==54||(LA26_0>=56 && LA26_0<=58)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalT5f.g:1522:4: (lv_comandos_3_0= ruleComando )
            	    {
            	    // InternalT5f.g:1522:4: (lv_comandos_3_0= ruleComando )
            	    // InternalT5f.g:1523:5: lv_comandos_3_0= ruleComando
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // InternalT5f.g:1540:3: (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalT5f.g:1541:4: otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )*
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getComandoSeAccess().getSenaoKeyword_4_0());
                    			
                    // InternalT5f.g:1545:4: ( (lv_comandosElse_5_0= ruleComando ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=40 && LA27_0<=42)||LA27_0==46||LA27_0==49||LA27_0==52||LA27_0==54||(LA27_0>=56 && LA27_0<=58)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalT5f.g:1546:5: (lv_comandosElse_5_0= ruleComando )
                    	    {
                    	    // InternalT5f.g:1546:5: (lv_comandosElse_5_0= ruleComando )
                    	    // InternalT5f.g:1547:6: lv_comandosElse_5_0= ruleComando
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
                    	    							"br.ufscar.dc.compiladores.at5.T5f.Comando");
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
    // InternalT5f.g:1573:1: entryRuleComandoCaso returns [EObject current=null] : iv_ruleComandoCaso= ruleComandoCaso EOF ;
    public final EObject entryRuleComandoCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoCaso = null;


        try {
            // InternalT5f.g:1573:52: (iv_ruleComandoCaso= ruleComandoCaso EOF )
            // InternalT5f.g:1574:2: iv_ruleComandoCaso= ruleComandoCaso EOF
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
    // InternalT5f.g:1580:1: ruleComandoCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso' ) ;
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
            // InternalT5f.g:1586:2: ( (otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso' ) )
            // InternalT5f.g:1587:2: (otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso' )
            {
            // InternalT5f.g:1587:2: (otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso' )
            // InternalT5f.g:1588:3: otherlv_0= 'caso' ( (lv_exp_1_0= ruleExpressaoAritmetica ) ) otherlv_2= 'seja' ( (lv_selecao_3_0= ruleSelecao ) )* (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )? otherlv_6= 'fim_caso'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoCasoAccess().getCasoKeyword_0());
            		
            // InternalT5f.g:1592:3: ( (lv_exp_1_0= ruleExpressaoAritmetica ) )
            // InternalT5f.g:1593:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            {
            // InternalT5f.g:1593:4: (lv_exp_1_0= ruleExpressaoAritmetica )
            // InternalT5f.g:1594:5: lv_exp_1_0= ruleExpressaoAritmetica
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
            						"br.ufscar.dc.compiladores.at5.T5f.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,47,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoCasoAccess().getSejaKeyword_2());
            		
            // InternalT5f.g:1615:3: ( (lv_selecao_3_0= ruleSelecao ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==60) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalT5f.g:1616:4: (lv_selecao_3_0= ruleSelecao )
            	    {
            	    // InternalT5f.g:1616:4: (lv_selecao_3_0= ruleSelecao )
            	    // InternalT5f.g:1617:5: lv_selecao_3_0= ruleSelecao
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.Selecao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalT5f.g:1634:3: (otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalT5f.g:1635:4: otherlv_4= 'senao' ( (lv_comandosElse_5_0= ruleComando ) )*
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getComandoCasoAccess().getSenaoKeyword_4_0());
                    			
                    // InternalT5f.g:1639:4: ( (lv_comandosElse_5_0= ruleComando ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=40 && LA30_0<=42)||LA30_0==46||LA30_0==49||LA30_0==52||LA30_0==54||(LA30_0>=56 && LA30_0<=58)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalT5f.g:1640:5: (lv_comandosElse_5_0= ruleComando )
                    	    {
                    	    // InternalT5f.g:1640:5: (lv_comandosElse_5_0= ruleComando )
                    	    // InternalT5f.g:1641:6: lv_comandosElse_5_0= ruleComando
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
                    	    							"br.ufscar.dc.compiladores.at5.T5f.Comando");
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
    // InternalT5f.g:1667:1: entryRuleComandoPara returns [EObject current=null] : iv_ruleComandoPara= ruleComandoPara EOF ;
    public final EObject entryRuleComandoPara() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoPara = null;


        try {
            // InternalT5f.g:1667:52: (iv_ruleComandoPara= ruleComandoPara EOF )
            // InternalT5f.g:1668:2: iv_ruleComandoPara= ruleComandoPara EOF
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
    // InternalT5f.g:1674:1: ruleComandoPara returns [EObject current=null] : (otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para' ) ;
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
            // InternalT5f.g:1680:2: ( (otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para' ) )
            // InternalT5f.g:1681:2: (otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para' )
            {
            // InternalT5f.g:1681:2: (otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para' )
            // InternalT5f.g:1682:3: otherlv_0= 'para' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= '<-' ( (lv_inicio_3_0= ruleExpressaoAritmetica ) ) otherlv_4= 'ate' ( (lv_fim_5_0= ruleExpressaoAritmetica ) ) otherlv_6= 'faca' ( (lv_comandos_7_0= ruleComando ) )* otherlv_8= 'fim_para'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoParaAccess().getParaKeyword_0());
            		
            // InternalT5f.g:1686:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalT5f.g:1687:4: (lv_var_1_0= RULE_ID )
            {
            // InternalT5f.g:1687:4: (lv_var_1_0= RULE_ID )
            // InternalT5f.g:1688:5: lv_var_1_0= RULE_ID
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
            						"br.ufscar.dc.compiladores.at5.T5f.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoParaAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalT5f.g:1708:3: ( (lv_inicio_3_0= ruleExpressaoAritmetica ) )
            // InternalT5f.g:1709:4: (lv_inicio_3_0= ruleExpressaoAritmetica )
            {
            // InternalT5f.g:1709:4: (lv_inicio_3_0= ruleExpressaoAritmetica )
            // InternalT5f.g:1710:5: lv_inicio_3_0= ruleExpressaoAritmetica
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
            						"br.ufscar.dc.compiladores.at5.T5f.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getComandoParaAccess().getAteKeyword_4());
            		
            // InternalT5f.g:1731:3: ( (lv_fim_5_0= ruleExpressaoAritmetica ) )
            // InternalT5f.g:1732:4: (lv_fim_5_0= ruleExpressaoAritmetica )
            {
            // InternalT5f.g:1732:4: (lv_fim_5_0= ruleExpressaoAritmetica )
            // InternalT5f.g:1733:5: lv_fim_5_0= ruleExpressaoAritmetica
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
            						"br.ufscar.dc.compiladores.at5.T5f.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,52,FOLLOW_43); 

            			newLeafNode(otherlv_6, grammarAccess.getComandoParaAccess().getFacaKeyword_6());
            		
            // InternalT5f.g:1754:3: ( (lv_comandos_7_0= ruleComando ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=40 && LA32_0<=42)||LA32_0==46||LA32_0==49||LA32_0==52||LA32_0==54||(LA32_0>=56 && LA32_0<=58)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalT5f.g:1755:4: (lv_comandos_7_0= ruleComando )
            	    {
            	    // InternalT5f.g:1755:4: (lv_comandos_7_0= ruleComando )
            	    // InternalT5f.g:1756:5: lv_comandos_7_0= ruleComando
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.Comando");
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
    // InternalT5f.g:1781:1: entryRuleComandoEnquanto returns [EObject current=null] : iv_ruleComandoEnquanto= ruleComandoEnquanto EOF ;
    public final EObject entryRuleComandoEnquanto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoEnquanto = null;


        try {
            // InternalT5f.g:1781:56: (iv_ruleComandoEnquanto= ruleComandoEnquanto EOF )
            // InternalT5f.g:1782:2: iv_ruleComandoEnquanto= ruleComandoEnquanto EOF
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
    // InternalT5f.g:1788:1: ruleComandoEnquanto returns [EObject current=null] : (otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto' ) ;
    public final EObject ruleComandoEnquanto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_comandos_3_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:1794:2: ( (otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto' ) )
            // InternalT5f.g:1795:2: (otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto' )
            {
            // InternalT5f.g:1795:2: (otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto' )
            // InternalT5f.g:1796:3: otherlv_0= 'enquanto' ( (lv_cond_1_0= ruleExpressao ) ) otherlv_2= 'faca' ( (lv_comandos_3_0= ruleComando ) )* otherlv_4= 'fim_enquanto'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoEnquantoAccess().getEnquantoKeyword_0());
            		
            // InternalT5f.g:1800:3: ( (lv_cond_1_0= ruleExpressao ) )
            // InternalT5f.g:1801:4: (lv_cond_1_0= ruleExpressao )
            {
            // InternalT5f.g:1801:4: (lv_cond_1_0= ruleExpressao )
            // InternalT5f.g:1802:5: lv_cond_1_0= ruleExpressao
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
            						"br.ufscar.dc.compiladores.at5.T5f.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,52,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoEnquantoAccess().getFacaKeyword_2());
            		
            // InternalT5f.g:1823:3: ( (lv_comandos_3_0= ruleComando ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=40 && LA33_0<=42)||LA33_0==46||LA33_0==49||LA33_0==52||LA33_0==54||(LA33_0>=56 && LA33_0<=58)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalT5f.g:1824:4: (lv_comandos_3_0= ruleComando )
            	    {
            	    // InternalT5f.g:1824:4: (lv_comandos_3_0= ruleComando )
            	    // InternalT5f.g:1825:5: lv_comandos_3_0= ruleComando
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.Comando");
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
    // InternalT5f.g:1850:1: entryRuleComandoFaca returns [EObject current=null] : iv_ruleComandoFaca= ruleComandoFaca EOF ;
    public final EObject entryRuleComandoFaca() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoFaca = null;


        try {
            // InternalT5f.g:1850:52: (iv_ruleComandoFaca= ruleComandoFaca EOF )
            // InternalT5f.g:1851:2: iv_ruleComandoFaca= ruleComandoFaca EOF
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
    // InternalT5f.g:1857:1: ruleComandoFaca returns [EObject current=null] : (otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) ) ) ;
    public final EObject ruleComandoFaca() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_comandos_1_0 = null;

        EObject lv_cond_3_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:1863:2: ( (otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) ) ) )
            // InternalT5f.g:1864:2: (otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) ) )
            {
            // InternalT5f.g:1864:2: (otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) ) )
            // InternalT5f.g:1865:3: otherlv_0= 'faca' ( (lv_comandos_1_0= ruleComando ) )* otherlv_2= 'ate' ( (lv_cond_3_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoFacaAccess().getFacaKeyword_0());
            		
            // InternalT5f.g:1869:3: ( (lv_comandos_1_0= ruleComando ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=40 && LA34_0<=42)||LA34_0==46||LA34_0==49||LA34_0==52||LA34_0==54||(LA34_0>=56 && LA34_0<=58)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalT5f.g:1870:4: (lv_comandos_1_0= ruleComando )
            	    {
            	    // InternalT5f.g:1870:4: (lv_comandos_1_0= ruleComando )
            	    // InternalT5f.g:1871:5: lv_comandos_1_0= ruleComando
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.Comando");
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
            		
            // InternalT5f.g:1892:3: ( (lv_cond_3_0= ruleExpressao ) )
            // InternalT5f.g:1893:4: (lv_cond_3_0= ruleExpressao )
            {
            // InternalT5f.g:1893:4: (lv_cond_3_0= ruleExpressao )
            // InternalT5f.g:1894:5: lv_cond_3_0= ruleExpressao
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
            						"br.ufscar.dc.compiladores.at5.T5f.Expressao");
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
    // InternalT5f.g:1915:1: entryRuleComandoAtribuicao returns [EObject current=null] : iv_ruleComandoAtribuicao= ruleComandoAtribuicao EOF ;
    public final EObject entryRuleComandoAtribuicao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoAtribuicao = null;


        try {
            // InternalT5f.g:1915:58: (iv_ruleComandoAtribuicao= ruleComandoAtribuicao EOF )
            // InternalT5f.g:1916:2: iv_ruleComandoAtribuicao= ruleComandoAtribuicao EOF
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
    // InternalT5f.g:1922:1: ruleComandoAtribuicao returns [EObject current=null] : (otherlv_0= 'atribua' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) ) ) ;
    public final EObject ruleComandoAtribuicao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_valor_3_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:1928:2: ( (otherlv_0= 'atribua' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) ) ) )
            // InternalT5f.g:1929:2: (otherlv_0= 'atribua' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) ) )
            {
            // InternalT5f.g:1929:2: (otherlv_0= 'atribua' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) ) )
            // InternalT5f.g:1930:3: otherlv_0= 'atribua' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<-' ( (lv_valor_3_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoAtribuicaoAccess().getAtribuaKeyword_0());
            		
            // InternalT5f.g:1934:3: ( (otherlv_1= RULE_ID ) )
            // InternalT5f.g:1935:4: (otherlv_1= RULE_ID )
            {
            // InternalT5f.g:1935:4: (otherlv_1= RULE_ID )
            // InternalT5f.g:1936:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoAtribuicaoRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_1, grammarAccess.getComandoAtribuicaoAccess().getTargetVariavelCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoAtribuicaoAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalT5f.g:1951:3: ( (lv_valor_3_0= ruleExpressao ) )
            // InternalT5f.g:1952:4: (lv_valor_3_0= ruleExpressao )
            {
            // InternalT5f.g:1952:4: (lv_valor_3_0= ruleExpressao )
            // InternalT5f.g:1953:5: lv_valor_3_0= ruleExpressao
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
            						"br.ufscar.dc.compiladores.at5.T5f.Expressao");
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
    // InternalT5f.g:1974:1: entryRuleComandoChamada returns [EObject current=null] : iv_ruleComandoChamada= ruleComandoChamada EOF ;
    public final EObject entryRuleComandoChamada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoChamada = null;


        try {
            // InternalT5f.g:1974:55: (iv_ruleComandoChamada= ruleComandoChamada EOF )
            // InternalT5f.g:1975:2: iv_ruleComandoChamada= ruleComandoChamada EOF
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
    // InternalT5f.g:1981:1: ruleComandoChamada returns [EObject current=null] : (otherlv_0= 'chame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpressao ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleComandoChamada() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:1987:2: ( (otherlv_0= 'chame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpressao ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) ) )* )? otherlv_6= ')' ) )
            // InternalT5f.g:1988:2: (otherlv_0= 'chame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpressao ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) ) )* )? otherlv_6= ')' )
            {
            // InternalT5f.g:1988:2: (otherlv_0= 'chame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpressao ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) ) )* )? otherlv_6= ')' )
            // InternalT5f.g:1989:3: otherlv_0= 'chame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_args_3_0= ruleExpressao ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoChamadaAccess().getChameKeyword_0());
            		
            // InternalT5f.g:1993:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalT5f.g:1994:4: (lv_name_1_0= RULE_ID )
            {
            // InternalT5f.g:1994:4: (lv_name_1_0= RULE_ID )
            // InternalT5f.g:1995:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComandoChamadaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComandoChamadaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"br.ufscar.dc.compiladores.at5.T5f.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getComandoChamadaAccess().getLeftParenthesisKeyword_2());
            		
            // InternalT5f.g:2015:3: ( ( (lv_args_3_0= ruleExpressao ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_REAL)||LA36_0==22||LA36_0==32||LA36_0==61) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalT5f.g:2016:4: ( (lv_args_3_0= ruleExpressao ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) ) )*
                    {
                    // InternalT5f.g:2016:4: ( (lv_args_3_0= ruleExpressao ) )
                    // InternalT5f.g:2017:5: (lv_args_3_0= ruleExpressao )
                    {
                    // InternalT5f.g:2017:5: (lv_args_3_0= ruleExpressao )
                    // InternalT5f.g:2018:6: lv_args_3_0= ruleExpressao
                    {

                    						newCompositeNode(grammarAccess.getComandoChamadaAccess().getArgsExpressaoParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_args_3_0=ruleExpressao();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComandoChamadaRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_3_0,
                    							"br.ufscar.dc.compiladores.at5.T5f.Expressao");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT5f.g:2035:4: (otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==16) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalT5f.g:2036:5: otherlv_4= ',' ( (lv_args_5_0= ruleExpressao ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_33); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getComandoChamadaAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalT5f.g:2040:5: ( (lv_args_5_0= ruleExpressao ) )
                    	    // InternalT5f.g:2041:6: (lv_args_5_0= ruleExpressao )
                    	    {
                    	    // InternalT5f.g:2041:6: (lv_args_5_0= ruleExpressao )
                    	    // InternalT5f.g:2042:7: lv_args_5_0= ruleExpressao
                    	    {

                    	    							newCompositeNode(grammarAccess.getComandoChamadaAccess().getArgsExpressaoParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_32);
                    	    lv_args_5_0=ruleExpressao();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComandoChamadaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_5_0,
                    	    								"br.ufscar.dc.compiladores.at5.T5f.Expressao");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComandoChamadaAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalT5f.g:2069:1: entryRuleComandoRetorne returns [EObject current=null] : iv_ruleComandoRetorne= ruleComandoRetorne EOF ;
    public final EObject entryRuleComandoRetorne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandoRetorne = null;


        try {
            // InternalT5f.g:2069:55: (iv_ruleComandoRetorne= ruleComandoRetorne EOF )
            // InternalT5f.g:2070:2: iv_ruleComandoRetorne= ruleComandoRetorne EOF
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
    // InternalT5f.g:2076:1: ruleComandoRetorne returns [EObject current=null] : (otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) ) ) ;
    public final EObject ruleComandoRetorne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2082:2: ( (otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) ) ) )
            // InternalT5f.g:2083:2: (otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) ) )
            {
            // InternalT5f.g:2083:2: (otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) ) )
            // InternalT5f.g:2084:3: otherlv_0= 'retorne' ( (lv_exp_1_0= ruleExpressao ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getComandoRetorneAccess().getRetorneKeyword_0());
            		
            // InternalT5f.g:2088:3: ( (lv_exp_1_0= ruleExpressao ) )
            // InternalT5f.g:2089:4: (lv_exp_1_0= ruleExpressao )
            {
            // InternalT5f.g:2089:4: (lv_exp_1_0= ruleExpressao )
            // InternalT5f.g:2090:5: lv_exp_1_0= ruleExpressao
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
            						"br.ufscar.dc.compiladores.at5.T5f.Expressao");
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
    // InternalT5f.g:2111:1: entryRuleSelecao returns [EObject current=null] : iv_ruleSelecao= ruleSelecao EOF ;
    public final EObject entryRuleSelecao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelecao = null;


        try {
            // InternalT5f.g:2111:48: (iv_ruleSelecao= ruleSelecao EOF )
            // InternalT5f.g:2112:2: iv_ruleSelecao= ruleSelecao EOF
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
    // InternalT5f.g:2118:1: ruleSelecao returns [EObject current=null] : ( ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )* ) ;
    public final EObject ruleSelecao() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_itens_0_0 = null;

        EObject lv_comandos_2_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2124:2: ( ( ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )* ) )
            // InternalT5f.g:2125:2: ( ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )* )
            {
            // InternalT5f.g:2125:2: ( ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )* )
            // InternalT5f.g:2126:3: ( (lv_itens_0_0= ruleItemSelecao ) )+ otherlv_1= ':' ( (lv_comandos_2_0= ruleComando ) )*
            {
            // InternalT5f.g:2126:3: ( (lv_itens_0_0= ruleItemSelecao ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==60) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalT5f.g:2127:4: (lv_itens_0_0= ruleItemSelecao )
            	    {
            	    // InternalT5f.g:2127:4: (lv_itens_0_0= ruleItemSelecao )
            	    // InternalT5f.g:2128:5: lv_itens_0_0= ruleItemSelecao
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.ItemSelecao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            otherlv_1=(Token)match(input,18,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getSelecaoAccess().getColonKeyword_1());
            		
            // InternalT5f.g:2149:3: ( (lv_comandos_2_0= ruleComando ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=40 && LA38_0<=42)||LA38_0==46||LA38_0==49||LA38_0==52||LA38_0==54||(LA38_0>=56 && LA38_0<=58)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalT5f.g:2150:4: (lv_comandos_2_0= ruleComando )
            	    {
            	    // InternalT5f.g:2150:4: (lv_comandos_2_0= ruleComando )
            	    // InternalT5f.g:2151:5: lv_comandos_2_0= ruleComando
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalT5f.g:2172:1: entryRuleItemSelecao returns [EObject current=null] : iv_ruleItemSelecao= ruleItemSelecao EOF ;
    public final EObject entryRuleItemSelecao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemSelecao = null;


        try {
            // InternalT5f.g:2172:52: (iv_ruleItemSelecao= ruleItemSelecao EOF )
            // InternalT5f.g:2173:2: iv_ruleItemSelecao= ruleItemSelecao EOF
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
    // InternalT5f.g:2179:1: ruleItemSelecao returns [EObject current=null] : ( ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )* ) ;
    public final EObject ruleItemSelecao() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_faixas_0_0 = null;

        EObject lv_faixas_2_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2185:2: ( ( ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )* ) )
            // InternalT5f.g:2186:2: ( ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )* )
            {
            // InternalT5f.g:2186:2: ( ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )* )
            // InternalT5f.g:2187:3: ( (lv_faixas_0_0= ruleNumeroIntervalo ) ) (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )*
            {
            // InternalT5f.g:2187:3: ( (lv_faixas_0_0= ruleNumeroIntervalo ) )
            // InternalT5f.g:2188:4: (lv_faixas_0_0= ruleNumeroIntervalo )
            {
            // InternalT5f.g:2188:4: (lv_faixas_0_0= ruleNumeroIntervalo )
            // InternalT5f.g:2189:5: lv_faixas_0_0= ruleNumeroIntervalo
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
            						"br.ufscar.dc.compiladores.at5.T5f.NumeroIntervalo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:2206:3: (otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==16) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalT5f.g:2207:4: otherlv_1= ',' ( (lv_faixas_2_0= ruleNumeroIntervalo ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_48); 

            	    				newLeafNode(otherlv_1, grammarAccess.getItemSelecaoAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalT5f.g:2211:4: ( (lv_faixas_2_0= ruleNumeroIntervalo ) )
            	    // InternalT5f.g:2212:5: (lv_faixas_2_0= ruleNumeroIntervalo )
            	    {
            	    // InternalT5f.g:2212:5: (lv_faixas_2_0= ruleNumeroIntervalo )
            	    // InternalT5f.g:2213:6: lv_faixas_2_0= ruleNumeroIntervalo
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
            	    							"br.ufscar.dc.compiladores.at5.T5f.NumeroIntervalo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleItemSelecao"


    // $ANTLR start "entryRuleNumeroIntervalo"
    // InternalT5f.g:2235:1: entryRuleNumeroIntervalo returns [EObject current=null] : iv_ruleNumeroIntervalo= ruleNumeroIntervalo EOF ;
    public final EObject entryRuleNumeroIntervalo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeroIntervalo = null;


        try {
            // InternalT5f.g:2235:56: (iv_ruleNumeroIntervalo= ruleNumeroIntervalo EOF )
            // InternalT5f.g:2236:2: iv_ruleNumeroIntervalo= ruleNumeroIntervalo EOF
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
    // InternalT5f.g:2242:1: ruleNumeroIntervalo returns [EObject current=null] : ( ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleNumeroIntervalo() throws RecognitionException {
        EObject current = null;

        Token lv_start_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;
        AntlrDatatypeRuleToken lv_sinal_0_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2248:2: ( ( ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )? ) )
            // InternalT5f.g:2249:2: ( ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )? )
            {
            // InternalT5f.g:2249:2: ( ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )? )
            // InternalT5f.g:2250:3: ( (lv_sinal_0_0= ruleOpUnario ) ) ( (lv_start_1_0= RULE_INT ) ) (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )?
            {
            // InternalT5f.g:2250:3: ( (lv_sinal_0_0= ruleOpUnario ) )
            // InternalT5f.g:2251:4: (lv_sinal_0_0= ruleOpUnario )
            {
            // InternalT5f.g:2251:4: (lv_sinal_0_0= ruleOpUnario )
            // InternalT5f.g:2252:5: lv_sinal_0_0= ruleOpUnario
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
            						"br.ufscar.dc.compiladores.at5.T5f.OpUnario");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:2269:3: ( (lv_start_1_0= RULE_INT ) )
            // InternalT5f.g:2270:4: (lv_start_1_0= RULE_INT )
            {
            // InternalT5f.g:2270:4: (lv_start_1_0= RULE_INT )
            // InternalT5f.g:2271:5: lv_start_1_0= RULE_INT
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
            						"br.ufscar.dc.compiladores.at5.T5f.INT");
            				

            }


            }

            // InternalT5f.g:2287:3: (otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==59) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalT5f.g:2288:4: otherlv_2= '..' ( (lv_end_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_49); 

                    				newLeafNode(otherlv_2, grammarAccess.getNumeroIntervaloAccess().getFullStopFullStopKeyword_2_0());
                    			
                    // InternalT5f.g:2292:4: ( (lv_end_3_0= RULE_INT ) )
                    // InternalT5f.g:2293:5: (lv_end_3_0= RULE_INT )
                    {
                    // InternalT5f.g:2293:5: (lv_end_3_0= RULE_INT )
                    // InternalT5f.g:2294:6: lv_end_3_0= RULE_INT
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
                    							"br.ufscar.dc.compiladores.at5.T5f.INT");
                    					

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
    // InternalT5f.g:2315:1: entryRuleOpUnario returns [String current=null] : iv_ruleOpUnario= ruleOpUnario EOF ;
    public final String entryRuleOpUnario() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnario = null;


        try {
            // InternalT5f.g:2315:48: (iv_ruleOpUnario= ruleOpUnario EOF )
            // InternalT5f.g:2316:2: iv_ruleOpUnario= ruleOpUnario EOF
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
    // InternalT5f.g:2322:1: ruleOpUnario returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleOpUnario() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5f.g:2328:2: (kw= '-' )
            // InternalT5f.g:2329:2: kw= '-'
            {
            kw=(Token)match(input,60,FOLLOW_2); 

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
    // InternalT5f.g:2337:1: entryRuleExpressaoAritmetica returns [EObject current=null] : iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF ;
    public final EObject entryRuleExpressaoAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressaoAritmetica = null;


        try {
            // InternalT5f.g:2337:60: (iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF )
            // InternalT5f.g:2338:2: iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF
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
    // InternalT5f.g:2344:1: ruleExpressaoAritmetica returns [EObject current=null] : ( ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )* ) ;
    public final EObject ruleExpressaoAritmetica() throws RecognitionException {
        EObject current = null;

        EObject lv_termos_0_0 = null;

        EObject lv_outros_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2350:2: ( ( ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )* ) )
            // InternalT5f.g:2351:2: ( ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )* )
            {
            // InternalT5f.g:2351:2: ( ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )* )
            // InternalT5f.g:2352:3: ( (lv_termos_0_0= ruleTermoAritmetico ) ) ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )*
            {
            // InternalT5f.g:2352:3: ( (lv_termos_0_0= ruleTermoAritmetico ) )
            // InternalT5f.g:2353:4: (lv_termos_0_0= ruleTermoAritmetico )
            {
            // InternalT5f.g:2353:4: (lv_termos_0_0= ruleTermoAritmetico )
            // InternalT5f.g:2354:5: lv_termos_0_0= ruleTermoAritmetico
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
            						"br.ufscar.dc.compiladores.at5.T5f.TermoAritmetico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:2371:3: ( (lv_outros_1_0= ruleOutroTermoAritmetico ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==60) ) {
                    int LA41_2 = input.LA(2);

                    if ( ((LA41_2>=RULE_ID && LA41_2<=RULE_REAL)||LA41_2==22||LA41_2==32) ) {
                        alt41=1;
                    }


                }
                else if ( (LA41_0==62) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalT5f.g:2372:4: (lv_outros_1_0= ruleOutroTermoAritmetico )
            	    {
            	    // InternalT5f.g:2372:4: (lv_outros_1_0= ruleOutroTermoAritmetico )
            	    // InternalT5f.g:2373:5: lv_outros_1_0= ruleOutroTermoAritmetico
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.OutroTermoAritmetico");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalT5f.g:2394:1: entryRuleOutroTermoAritmetico returns [EObject current=null] : iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF ;
    public final EObject entryRuleOutroTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutroTermoAritmetico = null;


        try {
            // InternalT5f.g:2394:61: (iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF )
            // InternalT5f.g:2395:2: iv_ruleOutroTermoAritmetico= ruleOutroTermoAritmetico EOF
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
    // InternalT5f.g:2401:1: ruleOutroTermoAritmetico returns [EObject current=null] : ( ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) ) ;
    public final EObject ruleOutroTermoAritmetico() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_termo_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2407:2: ( ( ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) ) )
            // InternalT5f.g:2408:2: ( ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) )
            {
            // InternalT5f.g:2408:2: ( ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) ) )
            // InternalT5f.g:2409:3: ( (lv_op_0_0= ruleOpArit1 ) ) ( (lv_termo_1_0= ruleTermoAritmetico ) )
            {
            // InternalT5f.g:2409:3: ( (lv_op_0_0= ruleOpArit1 ) )
            // InternalT5f.g:2410:4: (lv_op_0_0= ruleOpArit1 )
            {
            // InternalT5f.g:2410:4: (lv_op_0_0= ruleOpArit1 )
            // InternalT5f.g:2411:5: lv_op_0_0= ruleOpArit1
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
            						"br.ufscar.dc.compiladores.at5.T5f.OpArit1");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:2428:3: ( (lv_termo_1_0= ruleTermoAritmetico ) )
            // InternalT5f.g:2429:4: (lv_termo_1_0= ruleTermoAritmetico )
            {
            // InternalT5f.g:2429:4: (lv_termo_1_0= ruleTermoAritmetico )
            // InternalT5f.g:2430:5: lv_termo_1_0= ruleTermoAritmetico
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
            						"br.ufscar.dc.compiladores.at5.T5f.TermoAritmetico");
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
    // InternalT5f.g:2451:1: entryRuleTermoAritmetico returns [EObject current=null] : iv_ruleTermoAritmetico= ruleTermoAritmetico EOF ;
    public final EObject entryRuleTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoAritmetico = null;


        try {
            // InternalT5f.g:2451:56: (iv_ruleTermoAritmetico= ruleTermoAritmetico EOF )
            // InternalT5f.g:2452:2: iv_ruleTermoAritmetico= ruleTermoAritmetico EOF
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
    // InternalT5f.g:2458:1: ruleTermoAritmetico returns [EObject current=null] : ( ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )* ) ;
    public final EObject ruleTermoAritmetico() throws RecognitionException {
        EObject current = null;

        EObject lv_fatores_0_0 = null;

        EObject lv_outros_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2464:2: ( ( ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )* ) )
            // InternalT5f.g:2465:2: ( ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )* )
            {
            // InternalT5f.g:2465:2: ( ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )* )
            // InternalT5f.g:2466:3: ( (lv_fatores_0_0= ruleFatorAritmetico ) ) ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )*
            {
            // InternalT5f.g:2466:3: ( (lv_fatores_0_0= ruleFatorAritmetico ) )
            // InternalT5f.g:2467:4: (lv_fatores_0_0= ruleFatorAritmetico )
            {
            // InternalT5f.g:2467:4: (lv_fatores_0_0= ruleFatorAritmetico )
            // InternalT5f.g:2468:5: lv_fatores_0_0= ruleFatorAritmetico
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
            						"br.ufscar.dc.compiladores.at5.T5f.FatorAritmetico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:2485:3: ( (lv_outros_1_0= ruleOutroFatorAritmetico ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=63 && LA42_0<=64)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalT5f.g:2486:4: (lv_outros_1_0= ruleOutroFatorAritmetico )
            	    {
            	    // InternalT5f.g:2486:4: (lv_outros_1_0= ruleOutroFatorAritmetico )
            	    // InternalT5f.g:2487:5: lv_outros_1_0= ruleOutroFatorAritmetico
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
            	    						"br.ufscar.dc.compiladores.at5.T5f.OutroFatorAritmetico");
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
    // $ANTLR end "ruleTermoAritmetico"


    // $ANTLR start "entryRuleOutroFatorAritmetico"
    // InternalT5f.g:2508:1: entryRuleOutroFatorAritmetico returns [EObject current=null] : iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF ;
    public final EObject entryRuleOutroFatorAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutroFatorAritmetico = null;


        try {
            // InternalT5f.g:2508:61: (iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF )
            // InternalT5f.g:2509:2: iv_ruleOutroFatorAritmetico= ruleOutroFatorAritmetico EOF
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
    // InternalT5f.g:2515:1: ruleOutroFatorAritmetico returns [EObject current=null] : ( ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) ) ;
    public final EObject ruleOutroFatorAritmetico() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_fator_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2521:2: ( ( ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) ) )
            // InternalT5f.g:2522:2: ( ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) )
            {
            // InternalT5f.g:2522:2: ( ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) ) )
            // InternalT5f.g:2523:3: ( (lv_op_0_0= ruleOpArit2 ) ) ( (lv_fator_1_0= ruleFatorAritmetico ) )
            {
            // InternalT5f.g:2523:3: ( (lv_op_0_0= ruleOpArit2 ) )
            // InternalT5f.g:2524:4: (lv_op_0_0= ruleOpArit2 )
            {
            // InternalT5f.g:2524:4: (lv_op_0_0= ruleOpArit2 )
            // InternalT5f.g:2525:5: lv_op_0_0= ruleOpArit2
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
            						"br.ufscar.dc.compiladores.at5.T5f.OpArit2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:2542:3: ( (lv_fator_1_0= ruleFatorAritmetico ) )
            // InternalT5f.g:2543:4: (lv_fator_1_0= ruleFatorAritmetico )
            {
            // InternalT5f.g:2543:4: (lv_fator_1_0= ruleFatorAritmetico )
            // InternalT5f.g:2544:5: lv_fator_1_0= ruleFatorAritmetico
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
            						"br.ufscar.dc.compiladores.at5.T5f.FatorAritmetico");
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
    // InternalT5f.g:2565:1: entryRuleFatorAritmetico returns [EObject current=null] : iv_ruleFatorAritmetico= ruleFatorAritmetico EOF ;
    public final EObject entryRuleFatorAritmetico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFatorAritmetico = null;


        try {
            // InternalT5f.g:2565:56: (iv_ruleFatorAritmetico= ruleFatorAritmetico EOF )
            // InternalT5f.g:2566:2: iv_ruleFatorAritmetico= ruleFatorAritmetico EOF
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
    // InternalT5f.g:2572:1: ruleFatorAritmetico returns [EObject current=null] : ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) ) | ( (lv_numero_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_REAL ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' ) | ( (lv_str_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleFatorAritmetico() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_numero_2_0=null;
        Token lv_real_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_str_7_0=null;
        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2578:2: ( ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) ) | ( (lv_numero_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_REAL ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' ) | ( (lv_str_7_0= RULE_STRING ) ) ) )
            // InternalT5f.g:2579:2: ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) ) | ( (lv_numero_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_REAL ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' ) | ( (lv_str_7_0= RULE_STRING ) ) )
            {
            // InternalT5f.g:2579:2: ( ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) ) | ( (lv_numero_2_0= RULE_INT ) ) | ( (lv_real_3_0= RULE_REAL ) ) | (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' ) | ( (lv_str_7_0= RULE_STRING ) ) )
            int alt44=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 32:
                {
                alt44=1;
                }
                break;
            case RULE_INT:
                {
                alt44=2;
                }
                break;
            case RULE_REAL:
                {
                alt44=3;
                }
                break;
            case 22:
                {
                alt44=4;
                }
                break;
            case RULE_STRING:
                {
                alt44=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalT5f.g:2580:3: ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalT5f.g:2580:3: ( (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) ) )
                    // InternalT5f.g:2581:4: (otherlv_0= '^' )? ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalT5f.g:2581:4: (otherlv_0= '^' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==32) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalT5f.g:2582:5: otherlv_0= '^'
                            {
                            otherlv_0=(Token)match(input,32,FOLLOW_7); 

                            					newLeafNode(otherlv_0, grammarAccess.getFatorAritmeticoAccess().getCircumflexAccentKeyword_0_0());
                            				

                            }
                            break;

                    }

                    // InternalT5f.g:2587:4: ( (otherlv_1= RULE_ID ) )
                    // InternalT5f.g:2588:5: (otherlv_1= RULE_ID )
                    {
                    // InternalT5f.g:2588:5: (otherlv_1= RULE_ID )
                    // InternalT5f.g:2589:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFatorAritmeticoRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getFatorAritmeticoAccess().getRefVariavelCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT5f.g:2602:3: ( (lv_numero_2_0= RULE_INT ) )
                    {
                    // InternalT5f.g:2602:3: ( (lv_numero_2_0= RULE_INT ) )
                    // InternalT5f.g:2603:4: (lv_numero_2_0= RULE_INT )
                    {
                    // InternalT5f.g:2603:4: (lv_numero_2_0= RULE_INT )
                    // InternalT5f.g:2604:5: lv_numero_2_0= RULE_INT
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
                    						"br.ufscar.dc.compiladores.at5.T5f.INT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalT5f.g:2621:3: ( (lv_real_3_0= RULE_REAL ) )
                    {
                    // InternalT5f.g:2621:3: ( (lv_real_3_0= RULE_REAL ) )
                    // InternalT5f.g:2622:4: (lv_real_3_0= RULE_REAL )
                    {
                    // InternalT5f.g:2622:4: (lv_real_3_0= RULE_REAL )
                    // InternalT5f.g:2623:5: lv_real_3_0= RULE_REAL
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
                    						"br.ufscar.dc.compiladores.at5.T5f.REAL");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalT5f.g:2640:3: (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' )
                    {
                    // InternalT5f.g:2640:3: (otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')' )
                    // InternalT5f.g:2641:4: otherlv_4= '(' ( (lv_exp_5_0= ruleExpressaoAritmetica ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getFatorAritmeticoAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalT5f.g:2645:4: ( (lv_exp_5_0= ruleExpressaoAritmetica ) )
                    // InternalT5f.g:2646:5: (lv_exp_5_0= ruleExpressaoAritmetica )
                    {
                    // InternalT5f.g:2646:5: (lv_exp_5_0= ruleExpressaoAritmetica )
                    // InternalT5f.g:2647:6: lv_exp_5_0= ruleExpressaoAritmetica
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
                    							"br.ufscar.dc.compiladores.at5.T5f.ExpressaoAritmetica");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getFatorAritmeticoAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalT5f.g:2670:3: ( (lv_str_7_0= RULE_STRING ) )
                    {
                    // InternalT5f.g:2670:3: ( (lv_str_7_0= RULE_STRING ) )
                    // InternalT5f.g:2671:4: (lv_str_7_0= RULE_STRING )
                    {
                    // InternalT5f.g:2671:4: (lv_str_7_0= RULE_STRING )
                    // InternalT5f.g:2672:5: lv_str_7_0= RULE_STRING
                    {
                    lv_str_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_str_7_0, grammarAccess.getFatorAritmeticoAccess().getStrSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFatorAritmeticoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"str",
                    						lv_str_7_0,
                    						"br.ufscar.dc.compiladores.at5.T5f.STRING");
                    				

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
    // $ANTLR end "ruleFatorAritmetico"


    // $ANTLR start "entryRuleExpressao"
    // InternalT5f.g:2692:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalT5f.g:2692:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalT5f.g:2693:2: iv_ruleExpressao= ruleExpressao EOF
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
    // InternalT5f.g:2699:1: ruleExpressao returns [EObject current=null] : ( ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )* ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject lv_logicos_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_logicos_2_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2705:2: ( ( ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )* ) )
            // InternalT5f.g:2706:2: ( ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )* )
            {
            // InternalT5f.g:2706:2: ( ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )* )
            // InternalT5f.g:2707:3: ( (lv_logicos_0_0= ruleTermoLogico ) ) ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )*
            {
            // InternalT5f.g:2707:3: ( (lv_logicos_0_0= ruleTermoLogico ) )
            // InternalT5f.g:2708:4: (lv_logicos_0_0= ruleTermoLogico )
            {
            // InternalT5f.g:2708:4: (lv_logicos_0_0= ruleTermoLogico )
            // InternalT5f.g:2709:5: lv_logicos_0_0= ruleTermoLogico
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
            						"br.ufscar.dc.compiladores.at5.T5f.TermoLogico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:2726:3: ( ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=70 && LA45_0<=71)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalT5f.g:2727:4: ( (lv_op_1_0= ruleOpBool ) ) ( (lv_logicos_2_0= ruleTermoLogico ) )
            	    {
            	    // InternalT5f.g:2727:4: ( (lv_op_1_0= ruleOpBool ) )
            	    // InternalT5f.g:2728:5: (lv_op_1_0= ruleOpBool )
            	    {
            	    // InternalT5f.g:2728:5: (lv_op_1_0= ruleOpBool )
            	    // InternalT5f.g:2729:6: lv_op_1_0= ruleOpBool
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoAccess().getOpOpBoolParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_op_1_0=ruleOpBool();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_1_0,
            	    							"br.ufscar.dc.compiladores.at5.T5f.OpBool");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalT5f.g:2746:4: ( (lv_logicos_2_0= ruleTermoLogico ) )
            	    // InternalT5f.g:2747:5: (lv_logicos_2_0= ruleTermoLogico )
            	    {
            	    // InternalT5f.g:2747:5: (lv_logicos_2_0= ruleTermoLogico )
            	    // InternalT5f.g:2748:6: lv_logicos_2_0= ruleTermoLogico
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
            	    							"br.ufscar.dc.compiladores.at5.T5f.TermoLogico");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalT5f.g:2770:1: entryRuleTermoLogico returns [EObject current=null] : iv_ruleTermoLogico= ruleTermoLogico EOF ;
    public final EObject entryRuleTermoLogico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoLogico = null;


        try {
            // InternalT5f.g:2770:52: (iv_ruleTermoLogico= ruleTermoLogico EOF )
            // InternalT5f.g:2771:2: iv_ruleTermoLogico= ruleTermoLogico EOF
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
    // InternalT5f.g:2777:1: ruleTermoLogico returns [EObject current=null] : ( ( (lv_nao_0_0= 'nao' ) )? ( (lv_rel_1_0= ruleExpressaoRelacional ) ) ) ;
    public final EObject ruleTermoLogico() throws RecognitionException {
        EObject current = null;

        Token lv_nao_0_0=null;
        EObject lv_rel_1_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2783:2: ( ( ( (lv_nao_0_0= 'nao' ) )? ( (lv_rel_1_0= ruleExpressaoRelacional ) ) ) )
            // InternalT5f.g:2784:2: ( ( (lv_nao_0_0= 'nao' ) )? ( (lv_rel_1_0= ruleExpressaoRelacional ) ) )
            {
            // InternalT5f.g:2784:2: ( ( (lv_nao_0_0= 'nao' ) )? ( (lv_rel_1_0= ruleExpressaoRelacional ) ) )
            // InternalT5f.g:2785:3: ( (lv_nao_0_0= 'nao' ) )? ( (lv_rel_1_0= ruleExpressaoRelacional ) )
            {
            // InternalT5f.g:2785:3: ( (lv_nao_0_0= 'nao' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalT5f.g:2786:4: (lv_nao_0_0= 'nao' )
                    {
                    // InternalT5f.g:2786:4: (lv_nao_0_0= 'nao' )
                    // InternalT5f.g:2787:5: lv_nao_0_0= 'nao'
                    {
                    lv_nao_0_0=(Token)match(input,61,FOLLOW_33); 

                    					newLeafNode(lv_nao_0_0, grammarAccess.getTermoLogicoAccess().getNaoNaoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTermoLogicoRule());
                    					}
                    					setWithLastConsumed(current, "nao", lv_nao_0_0 != null, "nao");
                    				

                    }


                    }
                    break;

            }

            // InternalT5f.g:2799:3: ( (lv_rel_1_0= ruleExpressaoRelacional ) )
            // InternalT5f.g:2800:4: (lv_rel_1_0= ruleExpressaoRelacional )
            {
            // InternalT5f.g:2800:4: (lv_rel_1_0= ruleExpressaoRelacional )
            // InternalT5f.g:2801:5: lv_rel_1_0= ruleExpressaoRelacional
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
            						"br.ufscar.dc.compiladores.at5.T5f.ExpressaoRelacional");
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
    // InternalT5f.g:2822:1: entryRuleExpressaoRelacional returns [EObject current=null] : iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF ;
    public final EObject entryRuleExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressaoRelacional = null;


        try {
            // InternalT5f.g:2822:60: (iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF )
            // InternalT5f.g:2823:2: iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF
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
    // InternalT5f.g:2829:1: ruleExpressaoRelacional returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )? ) ;
    public final EObject ruleExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalT5f.g:2835:2: ( ( ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )? ) )
            // InternalT5f.g:2836:2: ( ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )? )
            {
            // InternalT5f.g:2836:2: ( ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )? )
            // InternalT5f.g:2837:3: ( (lv_left_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )?
            {
            // InternalT5f.g:2837:3: ( (lv_left_0_0= ruleExpressaoAritmetica ) )
            // InternalT5f.g:2838:4: (lv_left_0_0= ruleExpressaoAritmetica )
            {
            // InternalT5f.g:2838:4: (lv_left_0_0= ruleExpressaoAritmetica )
            // InternalT5f.g:2839:5: lv_left_0_0= ruleExpressaoAritmetica
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
            						"br.ufscar.dc.compiladores.at5.T5f.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalT5f.g:2856:3: ( ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==19||(LA47_0>=65 && LA47_0<=69)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalT5f.g:2857:4: ( (lv_op_1_0= ruleOpRel ) ) ( (lv_right_2_0= ruleExpressaoAritmetica ) )
                    {
                    // InternalT5f.g:2857:4: ( (lv_op_1_0= ruleOpRel ) )
                    // InternalT5f.g:2858:5: (lv_op_1_0= ruleOpRel )
                    {
                    // InternalT5f.g:2858:5: (lv_op_1_0= ruleOpRel )
                    // InternalT5f.g:2859:6: lv_op_1_0= ruleOpRel
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
                    							"br.ufscar.dc.compiladores.at5.T5f.OpRel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalT5f.g:2876:4: ( (lv_right_2_0= ruleExpressaoAritmetica ) )
                    // InternalT5f.g:2877:5: (lv_right_2_0= ruleExpressaoAritmetica )
                    {
                    // InternalT5f.g:2877:5: (lv_right_2_0= ruleExpressaoAritmetica )
                    // InternalT5f.g:2878:6: lv_right_2_0= ruleExpressaoAritmetica
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
                    							"br.ufscar.dc.compiladores.at5.T5f.ExpressaoAritmetica");
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
    // InternalT5f.g:2900:1: entryRuleOpArit1 returns [String current=null] : iv_ruleOpArit1= ruleOpArit1 EOF ;
    public final String entryRuleOpArit1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpArit1 = null;


        try {
            // InternalT5f.g:2900:47: (iv_ruleOpArit1= ruleOpArit1 EOF )
            // InternalT5f.g:2901:2: iv_ruleOpArit1= ruleOpArit1 EOF
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
    // InternalT5f.g:2907:1: ruleOpArit1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpArit1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5f.g:2913:2: ( (kw= '+' | kw= '-' ) )
            // InternalT5f.g:2914:2: (kw= '+' | kw= '-' )
            {
            // InternalT5f.g:2914:2: (kw= '+' | kw= '-' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==62) ) {
                alt48=1;
            }
            else if ( (LA48_0==60) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalT5f.g:2915:3: kw= '+'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5f.g:2921:3: kw= '-'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

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
    // InternalT5f.g:2930:1: entryRuleOpArit2 returns [String current=null] : iv_ruleOpArit2= ruleOpArit2 EOF ;
    public final String entryRuleOpArit2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpArit2 = null;


        try {
            // InternalT5f.g:2930:47: (iv_ruleOpArit2= ruleOpArit2 EOF )
            // InternalT5f.g:2931:2: iv_ruleOpArit2= ruleOpArit2 EOF
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
    // InternalT5f.g:2937:1: ruleOpArit2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOpArit2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5f.g:2943:2: ( (kw= '*' | kw= '/' ) )
            // InternalT5f.g:2944:2: (kw= '*' | kw= '/' )
            {
            // InternalT5f.g:2944:2: (kw= '*' | kw= '/' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            else if ( (LA49_0==64) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalT5f.g:2945:3: kw= '*'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpArit2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5f.g:2951:3: kw= '/'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

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
    // InternalT5f.g:2960:1: entryRuleOpRel returns [String current=null] : iv_ruleOpRel= ruleOpRel EOF ;
    public final String entryRuleOpRel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpRel = null;


        try {
            // InternalT5f.g:2960:45: (iv_ruleOpRel= ruleOpRel EOF )
            // InternalT5f.g:2961:2: iv_ruleOpRel= ruleOpRel EOF
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
    // InternalT5f.g:2967:1: ruleOpRel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleOpRel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5f.g:2973:2: ( (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' ) )
            // InternalT5f.g:2974:2: (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' )
            {
            // InternalT5f.g:2974:2: (kw= '>' | kw= '>=' | kw= '<' | kw= '<=' | kw= '<>' | kw= '=' )
            int alt50=6;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt50=1;
                }
                break;
            case 66:
                {
                alt50=2;
                }
                break;
            case 67:
                {
                alt50=3;
                }
                break;
            case 68:
                {
                alt50=4;
                }
                break;
            case 69:
                {
                alt50=5;
                }
                break;
            case 19:
                {
                alt50=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalT5f.g:2975:3: kw= '>'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5f.g:2981:3: kw= '>='
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT5f.g:2987:3: kw= '<'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT5f.g:2993:3: kw= '<='
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalT5f.g:2999:3: kw= '<>'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalT5f.g:3005:3: kw= '='
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
    // InternalT5f.g:3014:1: entryRuleOpBool returns [String current=null] : iv_ruleOpBool= ruleOpBool EOF ;
    public final String entryRuleOpBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpBool = null;


        try {
            // InternalT5f.g:3014:46: (iv_ruleOpBool= ruleOpBool EOF )
            // InternalT5f.g:3015:2: iv_ruleOpBool= ruleOpBool EOF
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
    // InternalT5f.g:3021:1: ruleOpBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e' | kw= 'ou' ) ;
    public final AntlrDatatypeRuleToken ruleOpBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT5f.g:3027:2: ( (kw= 'e' | kw= 'ou' ) )
            // InternalT5f.g:3028:2: (kw= 'e' | kw= 'ou' )
            {
            // InternalT5f.g:3028:2: (kw= 'e' | kw= 'ou' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==70) ) {
                alt51=1;
            }
            else if ( (LA51_0==71) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalT5f.g:3029:3: kw= 'e'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpBoolAccess().getEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT5f.g:3035:3: kw= 'ou'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002328000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000232A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x075247000012C000L});
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
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0752470001128000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0752470004128000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001004000F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001E00000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0752470000128002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0752470000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x20000001004000F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0752770000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0752670000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x1001100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0753470000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0772470000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x07D2470000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x075A470000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000100C000F0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x5000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000080002L,0x000000000000003EL});

}