package br.ufscar.dc.compiladores.t5.ide.contentassist.antlr.internal;

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
import br.ufscar.dc.compiladores.t5.services.T5GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT5Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'literal'", "'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", "'+'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'='", "'e'", "'ou'", "'DECLARACOES'", "'ALGORITMO'", "'FIM_ALGORITMO'", "'declare'", "','", "'constante'", "':'", "'tipo'", "'procedimento'", "'('", "')'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", "'.'", "'['", "']'", "'registro'", "'fim_registro'", "'^'", "'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'senao'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", "'..'", "'nao'"
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
    public static final int RULE_ID=7;
    public static final int RULE_REAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(T5GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePrograma"
    // InternalT5.g:53:1: entryRulePrograma : rulePrograma EOF ;
    public final void entryRulePrograma() throws RecognitionException {
        try {
            // InternalT5.g:54:1: ( rulePrograma EOF )
            // InternalT5.g:55:1: rulePrograma EOF
            {
             before(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            rulePrograma();

            state._fsp--;

             after(grammarAccess.getProgramaRule()); 
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
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // InternalT5.g:62:1: rulePrograma : ( ( rule__Programa__Group__0 ) ) ;
    public final void rulePrograma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:66:2: ( ( ( rule__Programa__Group__0 ) ) )
            // InternalT5.g:67:2: ( ( rule__Programa__Group__0 ) )
            {
            // InternalT5.g:67:2: ( ( rule__Programa__Group__0 ) )
            // InternalT5.g:68:3: ( rule__Programa__Group__0 )
            {
             before(grammarAccess.getProgramaAccess().getGroup()); 
            // InternalT5.g:69:3: ( rule__Programa__Group__0 )
            // InternalT5.g:69:4: rule__Programa__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Programa__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleDeclaracao"
    // InternalT5.g:78:1: entryRuleDeclaracao : ruleDeclaracao EOF ;
    public final void entryRuleDeclaracao() throws RecognitionException {
        try {
            // InternalT5.g:79:1: ( ruleDeclaracao EOF )
            // InternalT5.g:80:1: ruleDeclaracao EOF
            {
             before(grammarAccess.getDeclaracaoRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaracao();

            state._fsp--;

             after(grammarAccess.getDeclaracaoRule()); 
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
    // $ANTLR end "entryRuleDeclaracao"


    // $ANTLR start "ruleDeclaracao"
    // InternalT5.g:87:1: ruleDeclaracao : ( ( rule__Declaracao__Alternatives ) ) ;
    public final void ruleDeclaracao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:91:2: ( ( ( rule__Declaracao__Alternatives ) ) )
            // InternalT5.g:92:2: ( ( rule__Declaracao__Alternatives ) )
            {
            // InternalT5.g:92:2: ( ( rule__Declaracao__Alternatives ) )
            // InternalT5.g:93:3: ( rule__Declaracao__Alternatives )
            {
             before(grammarAccess.getDeclaracaoAccess().getAlternatives()); 
            // InternalT5.g:94:3: ( rule__Declaracao__Alternatives )
            // InternalT5.g:94:4: rule__Declaracao__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaracao__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaracao"


    // $ANTLR start "entryRuleDeclaracaoLocal"
    // InternalT5.g:103:1: entryRuleDeclaracaoLocal : ruleDeclaracaoLocal EOF ;
    public final void entryRuleDeclaracaoLocal() throws RecognitionException {
        try {
            // InternalT5.g:104:1: ( ruleDeclaracaoLocal EOF )
            // InternalT5.g:105:1: ruleDeclaracaoLocal EOF
            {
             before(grammarAccess.getDeclaracaoLocalRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaracaoLocal();

            state._fsp--;

             after(grammarAccess.getDeclaracaoLocalRule()); 
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
    // $ANTLR end "entryRuleDeclaracaoLocal"


    // $ANTLR start "ruleDeclaracaoLocal"
    // InternalT5.g:112:1: ruleDeclaracaoLocal : ( ( rule__DeclaracaoLocal__Alternatives ) ) ;
    public final void ruleDeclaracaoLocal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:116:2: ( ( ( rule__DeclaracaoLocal__Alternatives ) ) )
            // InternalT5.g:117:2: ( ( rule__DeclaracaoLocal__Alternatives ) )
            {
            // InternalT5.g:117:2: ( ( rule__DeclaracaoLocal__Alternatives ) )
            // InternalT5.g:118:3: ( rule__DeclaracaoLocal__Alternatives )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getAlternatives()); 
            // InternalT5.g:119:3: ( rule__DeclaracaoLocal__Alternatives )
            // InternalT5.g:119:4: rule__DeclaracaoLocal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoLocalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaracaoLocal"


    // $ANTLR start "entryRuleDeclaracaoGlobal"
    // InternalT5.g:128:1: entryRuleDeclaracaoGlobal : ruleDeclaracaoGlobal EOF ;
    public final void entryRuleDeclaracaoGlobal() throws RecognitionException {
        try {
            // InternalT5.g:129:1: ( ruleDeclaracaoGlobal EOF )
            // InternalT5.g:130:1: ruleDeclaracaoGlobal EOF
            {
             before(grammarAccess.getDeclaracaoGlobalRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaracaoGlobal();

            state._fsp--;

             after(grammarAccess.getDeclaracaoGlobalRule()); 
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
    // $ANTLR end "entryRuleDeclaracaoGlobal"


    // $ANTLR start "ruleDeclaracaoGlobal"
    // InternalT5.g:137:1: ruleDeclaracaoGlobal : ( ( rule__DeclaracaoGlobal__Alternatives ) ) ;
    public final void ruleDeclaracaoGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:141:2: ( ( ( rule__DeclaracaoGlobal__Alternatives ) ) )
            // InternalT5.g:142:2: ( ( rule__DeclaracaoGlobal__Alternatives ) )
            {
            // InternalT5.g:142:2: ( ( rule__DeclaracaoGlobal__Alternatives ) )
            // InternalT5.g:143:3: ( rule__DeclaracaoGlobal__Alternatives )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getAlternatives()); 
            // InternalT5.g:144:3: ( rule__DeclaracaoGlobal__Alternatives )
            // InternalT5.g:144:4: rule__DeclaracaoGlobal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoGlobalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaracaoGlobal"


    // $ANTLR start "entryRuleVariavel"
    // InternalT5.g:153:1: entryRuleVariavel : ruleVariavel EOF ;
    public final void entryRuleVariavel() throws RecognitionException {
        try {
            // InternalT5.g:154:1: ( ruleVariavel EOF )
            // InternalT5.g:155:1: ruleVariavel EOF
            {
             before(grammarAccess.getVariavelRule()); 
            pushFollow(FOLLOW_1);
            ruleVariavel();

            state._fsp--;

             after(grammarAccess.getVariavelRule()); 
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
    // $ANTLR end "entryRuleVariavel"


    // $ANTLR start "ruleVariavel"
    // InternalT5.g:162:1: ruleVariavel : ( ( rule__Variavel__Group__0 ) ) ;
    public final void ruleVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:166:2: ( ( ( rule__Variavel__Group__0 ) ) )
            // InternalT5.g:167:2: ( ( rule__Variavel__Group__0 ) )
            {
            // InternalT5.g:167:2: ( ( rule__Variavel__Group__0 ) )
            // InternalT5.g:168:3: ( rule__Variavel__Group__0 )
            {
             before(grammarAccess.getVariavelAccess().getGroup()); 
            // InternalT5.g:169:3: ( rule__Variavel__Group__0 )
            // InternalT5.g:169:4: rule__Variavel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariavel"


    // $ANTLR start "entryRuleIdentificador"
    // InternalT5.g:178:1: entryRuleIdentificador : ruleIdentificador EOF ;
    public final void entryRuleIdentificador() throws RecognitionException {
        try {
            // InternalT5.g:179:1: ( ruleIdentificador EOF )
            // InternalT5.g:180:1: ruleIdentificador EOF
            {
             before(grammarAccess.getIdentificadorRule()); 
            pushFollow(FOLLOW_1);
            ruleIdentificador();

            state._fsp--;

             after(grammarAccess.getIdentificadorRule()); 
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
    // $ANTLR end "entryRuleIdentificador"


    // $ANTLR start "ruleIdentificador"
    // InternalT5.g:187:1: ruleIdentificador : ( ( rule__Identificador__Group__0 ) ) ;
    public final void ruleIdentificador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:191:2: ( ( ( rule__Identificador__Group__0 ) ) )
            // InternalT5.g:192:2: ( ( rule__Identificador__Group__0 ) )
            {
            // InternalT5.g:192:2: ( ( rule__Identificador__Group__0 ) )
            // InternalT5.g:193:3: ( rule__Identificador__Group__0 )
            {
             before(grammarAccess.getIdentificadorAccess().getGroup()); 
            // InternalT5.g:194:3: ( rule__Identificador__Group__0 )
            // InternalT5.g:194:4: rule__Identificador__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identificador__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentificadorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentificador"


    // $ANTLR start "entryRuleDimensao"
    // InternalT5.g:203:1: entryRuleDimensao : ruleDimensao EOF ;
    public final void entryRuleDimensao() throws RecognitionException {
        try {
            // InternalT5.g:204:1: ( ruleDimensao EOF )
            // InternalT5.g:205:1: ruleDimensao EOF
            {
             before(grammarAccess.getDimensaoRule()); 
            pushFollow(FOLLOW_1);
            ruleDimensao();

            state._fsp--;

             after(grammarAccess.getDimensaoRule()); 
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
    // $ANTLR end "entryRuleDimensao"


    // $ANTLR start "ruleDimensao"
    // InternalT5.g:212:1: ruleDimensao : ( ( rule__Dimensao__Group__0 ) ) ;
    public final void ruleDimensao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:216:2: ( ( ( rule__Dimensao__Group__0 ) ) )
            // InternalT5.g:217:2: ( ( rule__Dimensao__Group__0 ) )
            {
            // InternalT5.g:217:2: ( ( rule__Dimensao__Group__0 ) )
            // InternalT5.g:218:3: ( rule__Dimensao__Group__0 )
            {
             before(grammarAccess.getDimensaoAccess().getGroup()); 
            // InternalT5.g:219:3: ( rule__Dimensao__Group__0 )
            // InternalT5.g:219:4: rule__Dimensao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dimensao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimensao"


    // $ANTLR start "entryRuleTipo"
    // InternalT5.g:228:1: entryRuleTipo : ruleTipo EOF ;
    public final void entryRuleTipo() throws RecognitionException {
        try {
            // InternalT5.g:229:1: ( ruleTipo EOF )
            // InternalT5.g:230:1: ruleTipo EOF
            {
             before(grammarAccess.getTipoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getTipoRule()); 
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
    // $ANTLR end "entryRuleTipo"


    // $ANTLR start "ruleTipo"
    // InternalT5.g:237:1: ruleTipo : ( ( rule__Tipo__Alternatives ) ) ;
    public final void ruleTipo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:241:2: ( ( ( rule__Tipo__Alternatives ) ) )
            // InternalT5.g:242:2: ( ( rule__Tipo__Alternatives ) )
            {
            // InternalT5.g:242:2: ( ( rule__Tipo__Alternatives ) )
            // InternalT5.g:243:3: ( rule__Tipo__Alternatives )
            {
             before(grammarAccess.getTipoAccess().getAlternatives()); 
            // InternalT5.g:244:3: ( rule__Tipo__Alternatives )
            // InternalT5.g:244:4: rule__Tipo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tipo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipo"


    // $ANTLR start "entryRuleRegistro"
    // InternalT5.g:253:1: entryRuleRegistro : ruleRegistro EOF ;
    public final void entryRuleRegistro() throws RecognitionException {
        try {
            // InternalT5.g:254:1: ( ruleRegistro EOF )
            // InternalT5.g:255:1: ruleRegistro EOF
            {
             before(grammarAccess.getRegistroRule()); 
            pushFollow(FOLLOW_1);
            ruleRegistro();

            state._fsp--;

             after(grammarAccess.getRegistroRule()); 
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
    // $ANTLR end "entryRuleRegistro"


    // $ANTLR start "ruleRegistro"
    // InternalT5.g:262:1: ruleRegistro : ( ( rule__Registro__Group__0 ) ) ;
    public final void ruleRegistro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:266:2: ( ( ( rule__Registro__Group__0 ) ) )
            // InternalT5.g:267:2: ( ( rule__Registro__Group__0 ) )
            {
            // InternalT5.g:267:2: ( ( rule__Registro__Group__0 ) )
            // InternalT5.g:268:3: ( rule__Registro__Group__0 )
            {
             before(grammarAccess.getRegistroAccess().getGroup()); 
            // InternalT5.g:269:3: ( rule__Registro__Group__0 )
            // InternalT5.g:269:4: rule__Registro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Registro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegistroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegistro"


    // $ANTLR start "entryRuleTipoEstendido"
    // InternalT5.g:278:1: entryRuleTipoEstendido : ruleTipoEstendido EOF ;
    public final void entryRuleTipoEstendido() throws RecognitionException {
        try {
            // InternalT5.g:279:1: ( ruleTipoEstendido EOF )
            // InternalT5.g:280:1: ruleTipoEstendido EOF
            {
             before(grammarAccess.getTipoEstendidoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoEstendido();

            state._fsp--;

             after(grammarAccess.getTipoEstendidoRule()); 
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
    // $ANTLR end "entryRuleTipoEstendido"


    // $ANTLR start "ruleTipoEstendido"
    // InternalT5.g:287:1: ruleTipoEstendido : ( ( rule__TipoEstendido__Group__0 ) ) ;
    public final void ruleTipoEstendido() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:291:2: ( ( ( rule__TipoEstendido__Group__0 ) ) )
            // InternalT5.g:292:2: ( ( rule__TipoEstendido__Group__0 ) )
            {
            // InternalT5.g:292:2: ( ( rule__TipoEstendido__Group__0 ) )
            // InternalT5.g:293:3: ( rule__TipoEstendido__Group__0 )
            {
             before(grammarAccess.getTipoEstendidoAccess().getGroup()); 
            // InternalT5.g:294:3: ( rule__TipoEstendido__Group__0 )
            // InternalT5.g:294:4: rule__TipoEstendido__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TipoEstendido__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTipoEstendidoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoEstendido"


    // $ANTLR start "entryRuleTipoBasico"
    // InternalT5.g:303:1: entryRuleTipoBasico : ruleTipoBasico EOF ;
    public final void entryRuleTipoBasico() throws RecognitionException {
        try {
            // InternalT5.g:304:1: ( ruleTipoBasico EOF )
            // InternalT5.g:305:1: ruleTipoBasico EOF
            {
             before(grammarAccess.getTipoBasicoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoBasico();

            state._fsp--;

             after(grammarAccess.getTipoBasicoRule()); 
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
    // $ANTLR end "entryRuleTipoBasico"


    // $ANTLR start "ruleTipoBasico"
    // InternalT5.g:312:1: ruleTipoBasico : ( ( rule__TipoBasico__Alternatives ) ) ;
    public final void ruleTipoBasico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:316:2: ( ( ( rule__TipoBasico__Alternatives ) ) )
            // InternalT5.g:317:2: ( ( rule__TipoBasico__Alternatives ) )
            {
            // InternalT5.g:317:2: ( ( rule__TipoBasico__Alternatives ) )
            // InternalT5.g:318:3: ( rule__TipoBasico__Alternatives )
            {
             before(grammarAccess.getTipoBasicoAccess().getAlternatives()); 
            // InternalT5.g:319:3: ( rule__TipoBasico__Alternatives )
            // InternalT5.g:319:4: rule__TipoBasico__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoBasico__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoBasicoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoBasico"


    // $ANTLR start "entryRuleValorConstante"
    // InternalT5.g:328:1: entryRuleValorConstante : ruleValorConstante EOF ;
    public final void entryRuleValorConstante() throws RecognitionException {
        try {
            // InternalT5.g:329:1: ( ruleValorConstante EOF )
            // InternalT5.g:330:1: ruleValorConstante EOF
            {
             before(grammarAccess.getValorConstanteRule()); 
            pushFollow(FOLLOW_1);
            ruleValorConstante();

            state._fsp--;

             after(grammarAccess.getValorConstanteRule()); 
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
    // $ANTLR end "entryRuleValorConstante"


    // $ANTLR start "ruleValorConstante"
    // InternalT5.g:337:1: ruleValorConstante : ( ( rule__ValorConstante__Alternatives ) ) ;
    public final void ruleValorConstante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:341:2: ( ( ( rule__ValorConstante__Alternatives ) ) )
            // InternalT5.g:342:2: ( ( rule__ValorConstante__Alternatives ) )
            {
            // InternalT5.g:342:2: ( ( rule__ValorConstante__Alternatives ) )
            // InternalT5.g:343:3: ( rule__ValorConstante__Alternatives )
            {
             before(grammarAccess.getValorConstanteAccess().getAlternatives()); 
            // InternalT5.g:344:3: ( rule__ValorConstante__Alternatives )
            // InternalT5.g:344:4: rule__ValorConstante__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValorConstante__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValorConstanteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValorConstante"


    // $ANTLR start "entryRuleParametros"
    // InternalT5.g:353:1: entryRuleParametros : ruleParametros EOF ;
    public final void entryRuleParametros() throws RecognitionException {
        try {
            // InternalT5.g:354:1: ( ruleParametros EOF )
            // InternalT5.g:355:1: ruleParametros EOF
            {
             before(grammarAccess.getParametrosRule()); 
            pushFollow(FOLLOW_1);
            ruleParametros();

            state._fsp--;

             after(grammarAccess.getParametrosRule()); 
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
    // $ANTLR end "entryRuleParametros"


    // $ANTLR start "ruleParametros"
    // InternalT5.g:362:1: ruleParametros : ( ( rule__Parametros__Group__0 ) ) ;
    public final void ruleParametros() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:366:2: ( ( ( rule__Parametros__Group__0 ) ) )
            // InternalT5.g:367:2: ( ( rule__Parametros__Group__0 ) )
            {
            // InternalT5.g:367:2: ( ( rule__Parametros__Group__0 ) )
            // InternalT5.g:368:3: ( rule__Parametros__Group__0 )
            {
             before(grammarAccess.getParametrosAccess().getGroup()); 
            // InternalT5.g:369:3: ( rule__Parametros__Group__0 )
            // InternalT5.g:369:4: rule__Parametros__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parametros__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametrosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametros"


    // $ANTLR start "entryRuleParametro"
    // InternalT5.g:378:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalT5.g:379:1: ( ruleParametro EOF )
            // InternalT5.g:380:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
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
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalT5.g:387:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:391:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalT5.g:392:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalT5.g:392:2: ( ( rule__Parametro__Group__0 ) )
            // InternalT5.g:393:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalT5.g:394:3: ( rule__Parametro__Group__0 )
            // InternalT5.g:394:4: rule__Parametro__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleCorpo"
    // InternalT5.g:403:1: entryRuleCorpo : ruleCorpo EOF ;
    public final void entryRuleCorpo() throws RecognitionException {
        try {
            // InternalT5.g:404:1: ( ruleCorpo EOF )
            // InternalT5.g:405:1: ruleCorpo EOF
            {
             before(grammarAccess.getCorpoRule()); 
            pushFollow(FOLLOW_1);
            ruleCorpo();

            state._fsp--;

             after(grammarAccess.getCorpoRule()); 
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
    // $ANTLR end "entryRuleCorpo"


    // $ANTLR start "ruleCorpo"
    // InternalT5.g:412:1: ruleCorpo : ( ( rule__Corpo__Group__0 ) ) ;
    public final void ruleCorpo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:416:2: ( ( ( rule__Corpo__Group__0 ) ) )
            // InternalT5.g:417:2: ( ( rule__Corpo__Group__0 ) )
            {
            // InternalT5.g:417:2: ( ( rule__Corpo__Group__0 ) )
            // InternalT5.g:418:3: ( rule__Corpo__Group__0 )
            {
             before(grammarAccess.getCorpoAccess().getGroup()); 
            // InternalT5.g:419:3: ( rule__Corpo__Group__0 )
            // InternalT5.g:419:4: rule__Corpo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Corpo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCorpoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCorpo"


    // $ANTLR start "entryRuleComando"
    // InternalT5.g:428:1: entryRuleComando : ruleComando EOF ;
    public final void entryRuleComando() throws RecognitionException {
        try {
            // InternalT5.g:429:1: ( ruleComando EOF )
            // InternalT5.g:430:1: ruleComando EOF
            {
             before(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoRule()); 
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
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalT5.g:437:1: ruleComando : ( ( rule__Comando__Alternatives ) ) ;
    public final void ruleComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:441:2: ( ( ( rule__Comando__Alternatives ) ) )
            // InternalT5.g:442:2: ( ( rule__Comando__Alternatives ) )
            {
            // InternalT5.g:442:2: ( ( rule__Comando__Alternatives ) )
            // InternalT5.g:443:3: ( rule__Comando__Alternatives )
            {
             before(grammarAccess.getComandoAccess().getAlternatives()); 
            // InternalT5.g:444:3: ( rule__Comando__Alternatives )
            // InternalT5.g:444:4: rule__Comando__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comando__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComandoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleComandoLeia"
    // InternalT5.g:453:1: entryRuleComandoLeia : ruleComandoLeia EOF ;
    public final void entryRuleComandoLeia() throws RecognitionException {
        try {
            // InternalT5.g:454:1: ( ruleComandoLeia EOF )
            // InternalT5.g:455:1: ruleComandoLeia EOF
            {
             before(grammarAccess.getComandoLeiaRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoLeia();

            state._fsp--;

             after(grammarAccess.getComandoLeiaRule()); 
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
    // $ANTLR end "entryRuleComandoLeia"


    // $ANTLR start "ruleComandoLeia"
    // InternalT5.g:462:1: ruleComandoLeia : ( ( rule__ComandoLeia__Group__0 ) ) ;
    public final void ruleComandoLeia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:466:2: ( ( ( rule__ComandoLeia__Group__0 ) ) )
            // InternalT5.g:467:2: ( ( rule__ComandoLeia__Group__0 ) )
            {
            // InternalT5.g:467:2: ( ( rule__ComandoLeia__Group__0 ) )
            // InternalT5.g:468:3: ( rule__ComandoLeia__Group__0 )
            {
             before(grammarAccess.getComandoLeiaAccess().getGroup()); 
            // InternalT5.g:469:3: ( rule__ComandoLeia__Group__0 )
            // InternalT5.g:469:4: rule__ComandoLeia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoLeiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoLeia"


    // $ANTLR start "entryRuleComandoEscreva"
    // InternalT5.g:478:1: entryRuleComandoEscreva : ruleComandoEscreva EOF ;
    public final void entryRuleComandoEscreva() throws RecognitionException {
        try {
            // InternalT5.g:479:1: ( ruleComandoEscreva EOF )
            // InternalT5.g:480:1: ruleComandoEscreva EOF
            {
             before(grammarAccess.getComandoEscrevaRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoEscreva();

            state._fsp--;

             after(grammarAccess.getComandoEscrevaRule()); 
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
    // $ANTLR end "entryRuleComandoEscreva"


    // $ANTLR start "ruleComandoEscreva"
    // InternalT5.g:487:1: ruleComandoEscreva : ( ( rule__ComandoEscreva__Group__0 ) ) ;
    public final void ruleComandoEscreva() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:491:2: ( ( ( rule__ComandoEscreva__Group__0 ) ) )
            // InternalT5.g:492:2: ( ( rule__ComandoEscreva__Group__0 ) )
            {
            // InternalT5.g:492:2: ( ( rule__ComandoEscreva__Group__0 ) )
            // InternalT5.g:493:3: ( rule__ComandoEscreva__Group__0 )
            {
             before(grammarAccess.getComandoEscrevaAccess().getGroup()); 
            // InternalT5.g:494:3: ( rule__ComandoEscreva__Group__0 )
            // InternalT5.g:494:4: rule__ComandoEscreva__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoEscrevaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoEscreva"


    // $ANTLR start "entryRuleComandoSe"
    // InternalT5.g:503:1: entryRuleComandoSe : ruleComandoSe EOF ;
    public final void entryRuleComandoSe() throws RecognitionException {
        try {
            // InternalT5.g:504:1: ( ruleComandoSe EOF )
            // InternalT5.g:505:1: ruleComandoSe EOF
            {
             before(grammarAccess.getComandoSeRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoSe();

            state._fsp--;

             after(grammarAccess.getComandoSeRule()); 
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
    // $ANTLR end "entryRuleComandoSe"


    // $ANTLR start "ruleComandoSe"
    // InternalT5.g:512:1: ruleComandoSe : ( ( rule__ComandoSe__Group__0 ) ) ;
    public final void ruleComandoSe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:516:2: ( ( ( rule__ComandoSe__Group__0 ) ) )
            // InternalT5.g:517:2: ( ( rule__ComandoSe__Group__0 ) )
            {
            // InternalT5.g:517:2: ( ( rule__ComandoSe__Group__0 ) )
            // InternalT5.g:518:3: ( rule__ComandoSe__Group__0 )
            {
             before(grammarAccess.getComandoSeAccess().getGroup()); 
            // InternalT5.g:519:3: ( rule__ComandoSe__Group__0 )
            // InternalT5.g:519:4: rule__ComandoSe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoSeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoSe"


    // $ANTLR start "entryRuleComandoCaso"
    // InternalT5.g:528:1: entryRuleComandoCaso : ruleComandoCaso EOF ;
    public final void entryRuleComandoCaso() throws RecognitionException {
        try {
            // InternalT5.g:529:1: ( ruleComandoCaso EOF )
            // InternalT5.g:530:1: ruleComandoCaso EOF
            {
             before(grammarAccess.getComandoCasoRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoCaso();

            state._fsp--;

             after(grammarAccess.getComandoCasoRule()); 
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
    // $ANTLR end "entryRuleComandoCaso"


    // $ANTLR start "ruleComandoCaso"
    // InternalT5.g:537:1: ruleComandoCaso : ( ( rule__ComandoCaso__Group__0 ) ) ;
    public final void ruleComandoCaso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:541:2: ( ( ( rule__ComandoCaso__Group__0 ) ) )
            // InternalT5.g:542:2: ( ( rule__ComandoCaso__Group__0 ) )
            {
            // InternalT5.g:542:2: ( ( rule__ComandoCaso__Group__0 ) )
            // InternalT5.g:543:3: ( rule__ComandoCaso__Group__0 )
            {
             before(grammarAccess.getComandoCasoAccess().getGroup()); 
            // InternalT5.g:544:3: ( rule__ComandoCaso__Group__0 )
            // InternalT5.g:544:4: rule__ComandoCaso__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoCasoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoCaso"


    // $ANTLR start "entryRuleComandoPara"
    // InternalT5.g:553:1: entryRuleComandoPara : ruleComandoPara EOF ;
    public final void entryRuleComandoPara() throws RecognitionException {
        try {
            // InternalT5.g:554:1: ( ruleComandoPara EOF )
            // InternalT5.g:555:1: ruleComandoPara EOF
            {
             before(grammarAccess.getComandoParaRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoPara();

            state._fsp--;

             after(grammarAccess.getComandoParaRule()); 
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
    // $ANTLR end "entryRuleComandoPara"


    // $ANTLR start "ruleComandoPara"
    // InternalT5.g:562:1: ruleComandoPara : ( ( rule__ComandoPara__Group__0 ) ) ;
    public final void ruleComandoPara() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:566:2: ( ( ( rule__ComandoPara__Group__0 ) ) )
            // InternalT5.g:567:2: ( ( rule__ComandoPara__Group__0 ) )
            {
            // InternalT5.g:567:2: ( ( rule__ComandoPara__Group__0 ) )
            // InternalT5.g:568:3: ( rule__ComandoPara__Group__0 )
            {
             before(grammarAccess.getComandoParaAccess().getGroup()); 
            // InternalT5.g:569:3: ( rule__ComandoPara__Group__0 )
            // InternalT5.g:569:4: rule__ComandoPara__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoParaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoPara"


    // $ANTLR start "entryRuleComandoEnquanto"
    // InternalT5.g:578:1: entryRuleComandoEnquanto : ruleComandoEnquanto EOF ;
    public final void entryRuleComandoEnquanto() throws RecognitionException {
        try {
            // InternalT5.g:579:1: ( ruleComandoEnquanto EOF )
            // InternalT5.g:580:1: ruleComandoEnquanto EOF
            {
             before(grammarAccess.getComandoEnquantoRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoEnquanto();

            state._fsp--;

             after(grammarAccess.getComandoEnquantoRule()); 
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
    // $ANTLR end "entryRuleComandoEnquanto"


    // $ANTLR start "ruleComandoEnquanto"
    // InternalT5.g:587:1: ruleComandoEnquanto : ( ( rule__ComandoEnquanto__Group__0 ) ) ;
    public final void ruleComandoEnquanto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:591:2: ( ( ( rule__ComandoEnquanto__Group__0 ) ) )
            // InternalT5.g:592:2: ( ( rule__ComandoEnquanto__Group__0 ) )
            {
            // InternalT5.g:592:2: ( ( rule__ComandoEnquanto__Group__0 ) )
            // InternalT5.g:593:3: ( rule__ComandoEnquanto__Group__0 )
            {
             before(grammarAccess.getComandoEnquantoAccess().getGroup()); 
            // InternalT5.g:594:3: ( rule__ComandoEnquanto__Group__0 )
            // InternalT5.g:594:4: rule__ComandoEnquanto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEnquanto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoEnquantoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoEnquanto"


    // $ANTLR start "entryRuleComandoFaca"
    // InternalT5.g:603:1: entryRuleComandoFaca : ruleComandoFaca EOF ;
    public final void entryRuleComandoFaca() throws RecognitionException {
        try {
            // InternalT5.g:604:1: ( ruleComandoFaca EOF )
            // InternalT5.g:605:1: ruleComandoFaca EOF
            {
             before(grammarAccess.getComandoFacaRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoFaca();

            state._fsp--;

             after(grammarAccess.getComandoFacaRule()); 
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
    // $ANTLR end "entryRuleComandoFaca"


    // $ANTLR start "ruleComandoFaca"
    // InternalT5.g:612:1: ruleComandoFaca : ( ( rule__ComandoFaca__Group__0 ) ) ;
    public final void ruleComandoFaca() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:616:2: ( ( ( rule__ComandoFaca__Group__0 ) ) )
            // InternalT5.g:617:2: ( ( rule__ComandoFaca__Group__0 ) )
            {
            // InternalT5.g:617:2: ( ( rule__ComandoFaca__Group__0 ) )
            // InternalT5.g:618:3: ( rule__ComandoFaca__Group__0 )
            {
             before(grammarAccess.getComandoFacaAccess().getGroup()); 
            // InternalT5.g:619:3: ( rule__ComandoFaca__Group__0 )
            // InternalT5.g:619:4: rule__ComandoFaca__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoFaca__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoFacaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoFaca"


    // $ANTLR start "entryRuleComandoAtribuicao"
    // InternalT5.g:628:1: entryRuleComandoAtribuicao : ruleComandoAtribuicao EOF ;
    public final void entryRuleComandoAtribuicao() throws RecognitionException {
        try {
            // InternalT5.g:629:1: ( ruleComandoAtribuicao EOF )
            // InternalT5.g:630:1: ruleComandoAtribuicao EOF
            {
             before(grammarAccess.getComandoAtribuicaoRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoAtribuicao();

            state._fsp--;

             after(grammarAccess.getComandoAtribuicaoRule()); 
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
    // $ANTLR end "entryRuleComandoAtribuicao"


    // $ANTLR start "ruleComandoAtribuicao"
    // InternalT5.g:637:1: ruleComandoAtribuicao : ( ( rule__ComandoAtribuicao__Group__0 ) ) ;
    public final void ruleComandoAtribuicao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:641:2: ( ( ( rule__ComandoAtribuicao__Group__0 ) ) )
            // InternalT5.g:642:2: ( ( rule__ComandoAtribuicao__Group__0 ) )
            {
            // InternalT5.g:642:2: ( ( rule__ComandoAtribuicao__Group__0 ) )
            // InternalT5.g:643:3: ( rule__ComandoAtribuicao__Group__0 )
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getGroup()); 
            // InternalT5.g:644:3: ( rule__ComandoAtribuicao__Group__0 )
            // InternalT5.g:644:4: rule__ComandoAtribuicao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoAtribuicao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoAtribuicaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoAtribuicao"


    // $ANTLR start "entryRuleComandoChamada"
    // InternalT5.g:653:1: entryRuleComandoChamada : ruleComandoChamada EOF ;
    public final void entryRuleComandoChamada() throws RecognitionException {
        try {
            // InternalT5.g:654:1: ( ruleComandoChamada EOF )
            // InternalT5.g:655:1: ruleComandoChamada EOF
            {
             before(grammarAccess.getComandoChamadaRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoChamada();

            state._fsp--;

             after(grammarAccess.getComandoChamadaRule()); 
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
    // $ANTLR end "entryRuleComandoChamada"


    // $ANTLR start "ruleComandoChamada"
    // InternalT5.g:662:1: ruleComandoChamada : ( ( rule__ComandoChamada__Group__0 ) ) ;
    public final void ruleComandoChamada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:666:2: ( ( ( rule__ComandoChamada__Group__0 ) ) )
            // InternalT5.g:667:2: ( ( rule__ComandoChamada__Group__0 ) )
            {
            // InternalT5.g:667:2: ( ( rule__ComandoChamada__Group__0 ) )
            // InternalT5.g:668:3: ( rule__ComandoChamada__Group__0 )
            {
             before(grammarAccess.getComandoChamadaAccess().getGroup()); 
            // InternalT5.g:669:3: ( rule__ComandoChamada__Group__0 )
            // InternalT5.g:669:4: rule__ComandoChamada__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoChamadaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoChamada"


    // $ANTLR start "entryRuleComandoRetorne"
    // InternalT5.g:678:1: entryRuleComandoRetorne : ruleComandoRetorne EOF ;
    public final void entryRuleComandoRetorne() throws RecognitionException {
        try {
            // InternalT5.g:679:1: ( ruleComandoRetorne EOF )
            // InternalT5.g:680:1: ruleComandoRetorne EOF
            {
             before(grammarAccess.getComandoRetorneRule()); 
            pushFollow(FOLLOW_1);
            ruleComandoRetorne();

            state._fsp--;

             after(grammarAccess.getComandoRetorneRule()); 
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
    // $ANTLR end "entryRuleComandoRetorne"


    // $ANTLR start "ruleComandoRetorne"
    // InternalT5.g:687:1: ruleComandoRetorne : ( ( rule__ComandoRetorne__Group__0 ) ) ;
    public final void ruleComandoRetorne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:691:2: ( ( ( rule__ComandoRetorne__Group__0 ) ) )
            // InternalT5.g:692:2: ( ( rule__ComandoRetorne__Group__0 ) )
            {
            // InternalT5.g:692:2: ( ( rule__ComandoRetorne__Group__0 ) )
            // InternalT5.g:693:3: ( rule__ComandoRetorne__Group__0 )
            {
             before(grammarAccess.getComandoRetorneAccess().getGroup()); 
            // InternalT5.g:694:3: ( rule__ComandoRetorne__Group__0 )
            // InternalT5.g:694:4: rule__ComandoRetorne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoRetorne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComandoRetorneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandoRetorne"


    // $ANTLR start "entryRuleSelecao"
    // InternalT5.g:703:1: entryRuleSelecao : ruleSelecao EOF ;
    public final void entryRuleSelecao() throws RecognitionException {
        try {
            // InternalT5.g:704:1: ( ruleSelecao EOF )
            // InternalT5.g:705:1: ruleSelecao EOF
            {
             before(grammarAccess.getSelecaoRule()); 
            pushFollow(FOLLOW_1);
            ruleSelecao();

            state._fsp--;

             after(grammarAccess.getSelecaoRule()); 
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
    // $ANTLR end "entryRuleSelecao"


    // $ANTLR start "ruleSelecao"
    // InternalT5.g:712:1: ruleSelecao : ( ( rule__Selecao__Group__0 ) ) ;
    public final void ruleSelecao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:716:2: ( ( ( rule__Selecao__Group__0 ) ) )
            // InternalT5.g:717:2: ( ( rule__Selecao__Group__0 ) )
            {
            // InternalT5.g:717:2: ( ( rule__Selecao__Group__0 ) )
            // InternalT5.g:718:3: ( rule__Selecao__Group__0 )
            {
             before(grammarAccess.getSelecaoAccess().getGroup()); 
            // InternalT5.g:719:3: ( rule__Selecao__Group__0 )
            // InternalT5.g:719:4: rule__Selecao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelecaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelecao"


    // $ANTLR start "entryRuleItemSelecao"
    // InternalT5.g:728:1: entryRuleItemSelecao : ruleItemSelecao EOF ;
    public final void entryRuleItemSelecao() throws RecognitionException {
        try {
            // InternalT5.g:729:1: ( ruleItemSelecao EOF )
            // InternalT5.g:730:1: ruleItemSelecao EOF
            {
             before(grammarAccess.getItemSelecaoRule()); 
            pushFollow(FOLLOW_1);
            ruleItemSelecao();

            state._fsp--;

             after(grammarAccess.getItemSelecaoRule()); 
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
    // $ANTLR end "entryRuleItemSelecao"


    // $ANTLR start "ruleItemSelecao"
    // InternalT5.g:737:1: ruleItemSelecao : ( ( rule__ItemSelecao__Group__0 ) ) ;
    public final void ruleItemSelecao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:741:2: ( ( ( rule__ItemSelecao__Group__0 ) ) )
            // InternalT5.g:742:2: ( ( rule__ItemSelecao__Group__0 ) )
            {
            // InternalT5.g:742:2: ( ( rule__ItemSelecao__Group__0 ) )
            // InternalT5.g:743:3: ( rule__ItemSelecao__Group__0 )
            {
             before(grammarAccess.getItemSelecaoAccess().getGroup()); 
            // InternalT5.g:744:3: ( rule__ItemSelecao__Group__0 )
            // InternalT5.g:744:4: rule__ItemSelecao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemSelecao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemSelecaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemSelecao"


    // $ANTLR start "entryRuleNumeroIntervalo"
    // InternalT5.g:753:1: entryRuleNumeroIntervalo : ruleNumeroIntervalo EOF ;
    public final void entryRuleNumeroIntervalo() throws RecognitionException {
        try {
            // InternalT5.g:754:1: ( ruleNumeroIntervalo EOF )
            // InternalT5.g:755:1: ruleNumeroIntervalo EOF
            {
             before(grammarAccess.getNumeroIntervaloRule()); 
            pushFollow(FOLLOW_1);
            ruleNumeroIntervalo();

            state._fsp--;

             after(grammarAccess.getNumeroIntervaloRule()); 
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
    // $ANTLR end "entryRuleNumeroIntervalo"


    // $ANTLR start "ruleNumeroIntervalo"
    // InternalT5.g:762:1: ruleNumeroIntervalo : ( ( rule__NumeroIntervalo__Group__0 ) ) ;
    public final void ruleNumeroIntervalo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:766:2: ( ( ( rule__NumeroIntervalo__Group__0 ) ) )
            // InternalT5.g:767:2: ( ( rule__NumeroIntervalo__Group__0 ) )
            {
            // InternalT5.g:767:2: ( ( rule__NumeroIntervalo__Group__0 ) )
            // InternalT5.g:768:3: ( rule__NumeroIntervalo__Group__0 )
            {
             before(grammarAccess.getNumeroIntervaloAccess().getGroup()); 
            // InternalT5.g:769:3: ( rule__NumeroIntervalo__Group__0 )
            // InternalT5.g:769:4: rule__NumeroIntervalo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumeroIntervaloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumeroIntervalo"


    // $ANTLR start "entryRuleOpUnario"
    // InternalT5.g:778:1: entryRuleOpUnario : ruleOpUnario EOF ;
    public final void entryRuleOpUnario() throws RecognitionException {
        try {
            // InternalT5.g:779:1: ( ruleOpUnario EOF )
            // InternalT5.g:780:1: ruleOpUnario EOF
            {
             before(grammarAccess.getOpUnarioRule()); 
            pushFollow(FOLLOW_1);
            ruleOpUnario();

            state._fsp--;

             after(grammarAccess.getOpUnarioRule()); 
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
    // $ANTLR end "entryRuleOpUnario"


    // $ANTLR start "ruleOpUnario"
    // InternalT5.g:787:1: ruleOpUnario : ( '-' ) ;
    public final void ruleOpUnario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:791:2: ( ( '-' ) )
            // InternalT5.g:792:2: ( '-' )
            {
            // InternalT5.g:792:2: ( '-' )
            // InternalT5.g:793:3: '-'
            {
             before(grammarAccess.getOpUnarioAccess().getHyphenMinusKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOpUnarioAccess().getHyphenMinusKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpUnario"


    // $ANTLR start "entryRuleExpressaoAritmetica"
    // InternalT5.g:803:1: entryRuleExpressaoAritmetica : ruleExpressaoAritmetica EOF ;
    public final void entryRuleExpressaoAritmetica() throws RecognitionException {
        try {
            // InternalT5.g:804:1: ( ruleExpressaoAritmetica EOF )
            // InternalT5.g:805:1: ruleExpressaoAritmetica EOF
            {
             before(grammarAccess.getExpressaoAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getExpressaoAritmeticaRule()); 
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
    // $ANTLR end "entryRuleExpressaoAritmetica"


    // $ANTLR start "ruleExpressaoAritmetica"
    // InternalT5.g:812:1: ruleExpressaoAritmetica : ( ( rule__ExpressaoAritmetica__Group__0 ) ) ;
    public final void ruleExpressaoAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:816:2: ( ( ( rule__ExpressaoAritmetica__Group__0 ) ) )
            // InternalT5.g:817:2: ( ( rule__ExpressaoAritmetica__Group__0 ) )
            {
            // InternalT5.g:817:2: ( ( rule__ExpressaoAritmetica__Group__0 ) )
            // InternalT5.g:818:3: ( rule__ExpressaoAritmetica__Group__0 )
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getGroup()); 
            // InternalT5.g:819:3: ( rule__ExpressaoAritmetica__Group__0 )
            // InternalT5.g:819:4: rule__ExpressaoAritmetica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoAritmetica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAritmeticaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressaoAritmetica"


    // $ANTLR start "entryRuleOutroTermoAritmetico"
    // InternalT5.g:828:1: entryRuleOutroTermoAritmetico : ruleOutroTermoAritmetico EOF ;
    public final void entryRuleOutroTermoAritmetico() throws RecognitionException {
        try {
            // InternalT5.g:829:1: ( ruleOutroTermoAritmetico EOF )
            // InternalT5.g:830:1: ruleOutroTermoAritmetico EOF
            {
             before(grammarAccess.getOutroTermoAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            ruleOutroTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getOutroTermoAritmeticoRule()); 
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
    // $ANTLR end "entryRuleOutroTermoAritmetico"


    // $ANTLR start "ruleOutroTermoAritmetico"
    // InternalT5.g:837:1: ruleOutroTermoAritmetico : ( ( rule__OutroTermoAritmetico__Group__0 ) ) ;
    public final void ruleOutroTermoAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:841:2: ( ( ( rule__OutroTermoAritmetico__Group__0 ) ) )
            // InternalT5.g:842:2: ( ( rule__OutroTermoAritmetico__Group__0 ) )
            {
            // InternalT5.g:842:2: ( ( rule__OutroTermoAritmetico__Group__0 ) )
            // InternalT5.g:843:3: ( rule__OutroTermoAritmetico__Group__0 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getGroup()); 
            // InternalT5.g:844:3: ( rule__OutroTermoAritmetico__Group__0 )
            // InternalT5.g:844:4: rule__OutroTermoAritmetico__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoAritmeticoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutroTermoAritmetico"


    // $ANTLR start "entryRuleTermoAritmetico"
    // InternalT5.g:853:1: entryRuleTermoAritmetico : ruleTermoAritmetico EOF ;
    public final void entryRuleTermoAritmetico() throws RecognitionException {
        try {
            // InternalT5.g:854:1: ( ruleTermoAritmetico EOF )
            // InternalT5.g:855:1: ruleTermoAritmetico EOF
            {
             before(grammarAccess.getTermoAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            ruleTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getTermoAritmeticoRule()); 
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
    // $ANTLR end "entryRuleTermoAritmetico"


    // $ANTLR start "ruleTermoAritmetico"
    // InternalT5.g:862:1: ruleTermoAritmetico : ( ( rule__TermoAritmetico__Group__0 ) ) ;
    public final void ruleTermoAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:866:2: ( ( ( rule__TermoAritmetico__Group__0 ) ) )
            // InternalT5.g:867:2: ( ( rule__TermoAritmetico__Group__0 ) )
            {
            // InternalT5.g:867:2: ( ( rule__TermoAritmetico__Group__0 ) )
            // InternalT5.g:868:3: ( rule__TermoAritmetico__Group__0 )
            {
             before(grammarAccess.getTermoAritmeticoAccess().getGroup()); 
            // InternalT5.g:869:3: ( rule__TermoAritmetico__Group__0 )
            // InternalT5.g:869:4: rule__TermoAritmetico__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermoAritmetico__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermoAritmeticoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermoAritmetico"


    // $ANTLR start "entryRuleOutroFatorAritmetico"
    // InternalT5.g:878:1: entryRuleOutroFatorAritmetico : ruleOutroFatorAritmetico EOF ;
    public final void entryRuleOutroFatorAritmetico() throws RecognitionException {
        try {
            // InternalT5.g:879:1: ( ruleOutroFatorAritmetico EOF )
            // InternalT5.g:880:1: ruleOutroFatorAritmetico EOF
            {
             before(grammarAccess.getOutroFatorAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            ruleOutroFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getOutroFatorAritmeticoRule()); 
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
    // $ANTLR end "entryRuleOutroFatorAritmetico"


    // $ANTLR start "ruleOutroFatorAritmetico"
    // InternalT5.g:887:1: ruleOutroFatorAritmetico : ( ( rule__OutroFatorAritmetico__Group__0 ) ) ;
    public final void ruleOutroFatorAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:891:2: ( ( ( rule__OutroFatorAritmetico__Group__0 ) ) )
            // InternalT5.g:892:2: ( ( rule__OutroFatorAritmetico__Group__0 ) )
            {
            // InternalT5.g:892:2: ( ( rule__OutroFatorAritmetico__Group__0 ) )
            // InternalT5.g:893:3: ( rule__OutroFatorAritmetico__Group__0 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getGroup()); 
            // InternalT5.g:894:3: ( rule__OutroFatorAritmetico__Group__0 )
            // InternalT5.g:894:4: rule__OutroFatorAritmetico__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutroFatorAritmeticoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutroFatorAritmetico"


    // $ANTLR start "entryRuleFatorAritmetico"
    // InternalT5.g:903:1: entryRuleFatorAritmetico : ruleFatorAritmetico EOF ;
    public final void entryRuleFatorAritmetico() throws RecognitionException {
        try {
            // InternalT5.g:904:1: ( ruleFatorAritmetico EOF )
            // InternalT5.g:905:1: ruleFatorAritmetico EOF
            {
             before(grammarAccess.getFatorAritmeticoRule()); 
            pushFollow(FOLLOW_1);
            ruleFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getFatorAritmeticoRule()); 
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
    // $ANTLR end "entryRuleFatorAritmetico"


    // $ANTLR start "ruleFatorAritmetico"
    // InternalT5.g:912:1: ruleFatorAritmetico : ( ( rule__FatorAritmetico__Alternatives ) ) ;
    public final void ruleFatorAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:916:2: ( ( ( rule__FatorAritmetico__Alternatives ) ) )
            // InternalT5.g:917:2: ( ( rule__FatorAritmetico__Alternatives ) )
            {
            // InternalT5.g:917:2: ( ( rule__FatorAritmetico__Alternatives ) )
            // InternalT5.g:918:3: ( rule__FatorAritmetico__Alternatives )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getAlternatives()); 
            // InternalT5.g:919:3: ( rule__FatorAritmetico__Alternatives )
            // InternalT5.g:919:4: rule__FatorAritmetico__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFatorAritmeticoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFatorAritmetico"


    // $ANTLR start "entryRuleExpressao"
    // InternalT5.g:928:1: entryRuleExpressao : ruleExpressao EOF ;
    public final void entryRuleExpressao() throws RecognitionException {
        try {
            // InternalT5.g:929:1: ( ruleExpressao EOF )
            // InternalT5.g:930:1: ruleExpressao EOF
            {
             before(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getExpressaoRule()); 
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
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalT5.g:937:1: ruleExpressao : ( ( rule__Expressao__Group__0 ) ) ;
    public final void ruleExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:941:2: ( ( ( rule__Expressao__Group__0 ) ) )
            // InternalT5.g:942:2: ( ( rule__Expressao__Group__0 ) )
            {
            // InternalT5.g:942:2: ( ( rule__Expressao__Group__0 ) )
            // InternalT5.g:943:3: ( rule__Expressao__Group__0 )
            {
             before(grammarAccess.getExpressaoAccess().getGroup()); 
            // InternalT5.g:944:3: ( rule__Expressao__Group__0 )
            // InternalT5.g:944:4: rule__Expressao__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleTermoLogico"
    // InternalT5.g:953:1: entryRuleTermoLogico : ruleTermoLogico EOF ;
    public final void entryRuleTermoLogico() throws RecognitionException {
        try {
            // InternalT5.g:954:1: ( ruleTermoLogico EOF )
            // InternalT5.g:955:1: ruleTermoLogico EOF
            {
             before(grammarAccess.getTermoLogicoRule()); 
            pushFollow(FOLLOW_1);
            ruleTermoLogico();

            state._fsp--;

             after(grammarAccess.getTermoLogicoRule()); 
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
    // $ANTLR end "entryRuleTermoLogico"


    // $ANTLR start "ruleTermoLogico"
    // InternalT5.g:962:1: ruleTermoLogico : ( ( rule__TermoLogico__Group__0 ) ) ;
    public final void ruleTermoLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:966:2: ( ( ( rule__TermoLogico__Group__0 ) ) )
            // InternalT5.g:967:2: ( ( rule__TermoLogico__Group__0 ) )
            {
            // InternalT5.g:967:2: ( ( rule__TermoLogico__Group__0 ) )
            // InternalT5.g:968:3: ( rule__TermoLogico__Group__0 )
            {
             before(grammarAccess.getTermoLogicoAccess().getGroup()); 
            // InternalT5.g:969:3: ( rule__TermoLogico__Group__0 )
            // InternalT5.g:969:4: rule__TermoLogico__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermoLogico__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermoLogicoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermoLogico"


    // $ANTLR start "entryRuleExpressaoRelacional"
    // InternalT5.g:978:1: entryRuleExpressaoRelacional : ruleExpressaoRelacional EOF ;
    public final void entryRuleExpressaoRelacional() throws RecognitionException {
        try {
            // InternalT5.g:979:1: ( ruleExpressaoRelacional EOF )
            // InternalT5.g:980:1: ruleExpressaoRelacional EOF
            {
             before(grammarAccess.getExpressaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            ruleExpressaoRelacional();

            state._fsp--;

             after(grammarAccess.getExpressaoRelacionalRule()); 
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
    // $ANTLR end "entryRuleExpressaoRelacional"


    // $ANTLR start "ruleExpressaoRelacional"
    // InternalT5.g:987:1: ruleExpressaoRelacional : ( ( rule__ExpressaoRelacional__Group__0 ) ) ;
    public final void ruleExpressaoRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:991:2: ( ( ( rule__ExpressaoRelacional__Group__0 ) ) )
            // InternalT5.g:992:2: ( ( rule__ExpressaoRelacional__Group__0 ) )
            {
            // InternalT5.g:992:2: ( ( rule__ExpressaoRelacional__Group__0 ) )
            // InternalT5.g:993:3: ( rule__ExpressaoRelacional__Group__0 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getGroup()); 
            // InternalT5.g:994:3: ( rule__ExpressaoRelacional__Group__0 )
            // InternalT5.g:994:4: rule__ExpressaoRelacional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoRelacionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressaoRelacional"


    // $ANTLR start "entryRuleOpArit1"
    // InternalT5.g:1003:1: entryRuleOpArit1 : ruleOpArit1 EOF ;
    public final void entryRuleOpArit1() throws RecognitionException {
        try {
            // InternalT5.g:1004:1: ( ruleOpArit1 EOF )
            // InternalT5.g:1005:1: ruleOpArit1 EOF
            {
             before(grammarAccess.getOpArit1Rule()); 
            pushFollow(FOLLOW_1);
            ruleOpArit1();

            state._fsp--;

             after(grammarAccess.getOpArit1Rule()); 
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
    // $ANTLR end "entryRuleOpArit1"


    // $ANTLR start "ruleOpArit1"
    // InternalT5.g:1012:1: ruleOpArit1 : ( ( rule__OpArit1__Alternatives ) ) ;
    public final void ruleOpArit1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1016:2: ( ( ( rule__OpArit1__Alternatives ) ) )
            // InternalT5.g:1017:2: ( ( rule__OpArit1__Alternatives ) )
            {
            // InternalT5.g:1017:2: ( ( rule__OpArit1__Alternatives ) )
            // InternalT5.g:1018:3: ( rule__OpArit1__Alternatives )
            {
             before(grammarAccess.getOpArit1Access().getAlternatives()); 
            // InternalT5.g:1019:3: ( rule__OpArit1__Alternatives )
            // InternalT5.g:1019:4: rule__OpArit1__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpArit1__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpArit1Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpArit1"


    // $ANTLR start "entryRuleOpArit2"
    // InternalT5.g:1028:1: entryRuleOpArit2 : ruleOpArit2 EOF ;
    public final void entryRuleOpArit2() throws RecognitionException {
        try {
            // InternalT5.g:1029:1: ( ruleOpArit2 EOF )
            // InternalT5.g:1030:1: ruleOpArit2 EOF
            {
             before(grammarAccess.getOpArit2Rule()); 
            pushFollow(FOLLOW_1);
            ruleOpArit2();

            state._fsp--;

             after(grammarAccess.getOpArit2Rule()); 
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
    // $ANTLR end "entryRuleOpArit2"


    // $ANTLR start "ruleOpArit2"
    // InternalT5.g:1037:1: ruleOpArit2 : ( ( rule__OpArit2__Alternatives ) ) ;
    public final void ruleOpArit2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1041:2: ( ( ( rule__OpArit2__Alternatives ) ) )
            // InternalT5.g:1042:2: ( ( rule__OpArit2__Alternatives ) )
            {
            // InternalT5.g:1042:2: ( ( rule__OpArit2__Alternatives ) )
            // InternalT5.g:1043:3: ( rule__OpArit2__Alternatives )
            {
             before(grammarAccess.getOpArit2Access().getAlternatives()); 
            // InternalT5.g:1044:3: ( rule__OpArit2__Alternatives )
            // InternalT5.g:1044:4: rule__OpArit2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpArit2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpArit2Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpArit2"


    // $ANTLR start "entryRuleOpRel"
    // InternalT5.g:1053:1: entryRuleOpRel : ruleOpRel EOF ;
    public final void entryRuleOpRel() throws RecognitionException {
        try {
            // InternalT5.g:1054:1: ( ruleOpRel EOF )
            // InternalT5.g:1055:1: ruleOpRel EOF
            {
             before(grammarAccess.getOpRelRule()); 
            pushFollow(FOLLOW_1);
            ruleOpRel();

            state._fsp--;

             after(grammarAccess.getOpRelRule()); 
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
    // $ANTLR end "entryRuleOpRel"


    // $ANTLR start "ruleOpRel"
    // InternalT5.g:1062:1: ruleOpRel : ( ( rule__OpRel__Alternatives ) ) ;
    public final void ruleOpRel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1066:2: ( ( ( rule__OpRel__Alternatives ) ) )
            // InternalT5.g:1067:2: ( ( rule__OpRel__Alternatives ) )
            {
            // InternalT5.g:1067:2: ( ( rule__OpRel__Alternatives ) )
            // InternalT5.g:1068:3: ( rule__OpRel__Alternatives )
            {
             before(grammarAccess.getOpRelAccess().getAlternatives()); 
            // InternalT5.g:1069:3: ( rule__OpRel__Alternatives )
            // InternalT5.g:1069:4: rule__OpRel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpRel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpRelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpRel"


    // $ANTLR start "entryRuleOpBool"
    // InternalT5.g:1078:1: entryRuleOpBool : ruleOpBool EOF ;
    public final void entryRuleOpBool() throws RecognitionException {
        try {
            // InternalT5.g:1079:1: ( ruleOpBool EOF )
            // InternalT5.g:1080:1: ruleOpBool EOF
            {
             before(grammarAccess.getOpBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleOpBool();

            state._fsp--;

             after(grammarAccess.getOpBoolRule()); 
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
    // $ANTLR end "entryRuleOpBool"


    // $ANTLR start "ruleOpBool"
    // InternalT5.g:1087:1: ruleOpBool : ( ( rule__OpBool__Alternatives ) ) ;
    public final void ruleOpBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1091:2: ( ( ( rule__OpBool__Alternatives ) ) )
            // InternalT5.g:1092:2: ( ( rule__OpBool__Alternatives ) )
            {
            // InternalT5.g:1092:2: ( ( rule__OpBool__Alternatives ) )
            // InternalT5.g:1093:3: ( rule__OpBool__Alternatives )
            {
             before(grammarAccess.getOpBoolAccess().getAlternatives()); 
            // InternalT5.g:1094:3: ( rule__OpBool__Alternatives )
            // InternalT5.g:1094:4: rule__OpBool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OpBool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpBool"


    // $ANTLR start "rule__Declaracao__Alternatives"
    // InternalT5.g:1102:1: rule__Declaracao__Alternatives : ( ( ruleDeclaracaoLocal ) | ( ruleDeclaracaoGlobal ) );
    public final void rule__Declaracao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1106:1: ( ( ruleDeclaracaoLocal ) | ( ruleDeclaracaoGlobal ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==33||LA1_0==35||LA1_0==37) ) {
                alt1=1;
            }
            else if ( (LA1_0==38||LA1_0==42) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalT5.g:1107:2: ( ruleDeclaracaoLocal )
                    {
                    // InternalT5.g:1107:2: ( ruleDeclaracaoLocal )
                    // InternalT5.g:1108:3: ruleDeclaracaoLocal
                    {
                     before(grammarAccess.getDeclaracaoAccess().getDeclaracaoLocalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclaracaoLocal();

                    state._fsp--;

                     after(grammarAccess.getDeclaracaoAccess().getDeclaracaoLocalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1113:2: ( ruleDeclaracaoGlobal )
                    {
                    // InternalT5.g:1113:2: ( ruleDeclaracaoGlobal )
                    // InternalT5.g:1114:3: ruleDeclaracaoGlobal
                    {
                     before(grammarAccess.getDeclaracaoAccess().getDeclaracaoGlobalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclaracaoGlobal();

                    state._fsp--;

                     after(grammarAccess.getDeclaracaoAccess().getDeclaracaoGlobalParserRuleCall_1()); 

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
    // $ANTLR end "rule__Declaracao__Alternatives"


    // $ANTLR start "rule__DeclaracaoLocal__Alternatives"
    // InternalT5.g:1123:1: rule__DeclaracaoLocal__Alternatives : ( ( ( rule__DeclaracaoLocal__Group_0__0 ) ) | ( ( rule__DeclaracaoLocal__Group_1__0 ) ) | ( ( rule__DeclaracaoLocal__Group_2__0 ) ) );
    public final void rule__DeclaracaoLocal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1127:1: ( ( ( rule__DeclaracaoLocal__Group_0__0 ) ) | ( ( rule__DeclaracaoLocal__Group_1__0 ) ) | ( ( rule__DeclaracaoLocal__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalT5.g:1128:2: ( ( rule__DeclaracaoLocal__Group_0__0 ) )
                    {
                    // InternalT5.g:1128:2: ( ( rule__DeclaracaoLocal__Group_0__0 ) )
                    // InternalT5.g:1129:3: ( rule__DeclaracaoLocal__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaracaoLocalAccess().getGroup_0()); 
                    // InternalT5.g:1130:3: ( rule__DeclaracaoLocal__Group_0__0 )
                    // InternalT5.g:1130:4: rule__DeclaracaoLocal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaracaoLocal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaracaoLocalAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1134:2: ( ( rule__DeclaracaoLocal__Group_1__0 ) )
                    {
                    // InternalT5.g:1134:2: ( ( rule__DeclaracaoLocal__Group_1__0 ) )
                    // InternalT5.g:1135:3: ( rule__DeclaracaoLocal__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaracaoLocalAccess().getGroup_1()); 
                    // InternalT5.g:1136:3: ( rule__DeclaracaoLocal__Group_1__0 )
                    // InternalT5.g:1136:4: rule__DeclaracaoLocal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaracaoLocal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaracaoLocalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1140:2: ( ( rule__DeclaracaoLocal__Group_2__0 ) )
                    {
                    // InternalT5.g:1140:2: ( ( rule__DeclaracaoLocal__Group_2__0 ) )
                    // InternalT5.g:1141:3: ( rule__DeclaracaoLocal__Group_2__0 )
                    {
                     before(grammarAccess.getDeclaracaoLocalAccess().getGroup_2()); 
                    // InternalT5.g:1142:3: ( rule__DeclaracaoLocal__Group_2__0 )
                    // InternalT5.g:1142:4: rule__DeclaracaoLocal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaracaoLocal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaracaoLocalAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DeclaracaoLocal__Alternatives"


    // $ANTLR start "rule__DeclaracaoGlobal__Alternatives"
    // InternalT5.g:1150:1: rule__DeclaracaoGlobal__Alternatives : ( ( ( rule__DeclaracaoGlobal__Group_0__0 ) ) | ( ( rule__DeclaracaoGlobal__Group_1__0 ) ) );
    public final void rule__DeclaracaoGlobal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1154:1: ( ( ( rule__DeclaracaoGlobal__Group_0__0 ) ) | ( ( rule__DeclaracaoGlobal__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            else if ( (LA3_0==42) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalT5.g:1155:2: ( ( rule__DeclaracaoGlobal__Group_0__0 ) )
                    {
                    // InternalT5.g:1155:2: ( ( rule__DeclaracaoGlobal__Group_0__0 ) )
                    // InternalT5.g:1156:3: ( rule__DeclaracaoGlobal__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaracaoGlobalAccess().getGroup_0()); 
                    // InternalT5.g:1157:3: ( rule__DeclaracaoGlobal__Group_0__0 )
                    // InternalT5.g:1157:4: rule__DeclaracaoGlobal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaracaoGlobal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaracaoGlobalAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1161:2: ( ( rule__DeclaracaoGlobal__Group_1__0 ) )
                    {
                    // InternalT5.g:1161:2: ( ( rule__DeclaracaoGlobal__Group_1__0 ) )
                    // InternalT5.g:1162:3: ( rule__DeclaracaoGlobal__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaracaoGlobalAccess().getGroup_1()); 
                    // InternalT5.g:1163:3: ( rule__DeclaracaoGlobal__Group_1__0 )
                    // InternalT5.g:1163:4: rule__DeclaracaoGlobal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaracaoGlobal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaracaoGlobalAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DeclaracaoGlobal__Alternatives"


    // $ANTLR start "rule__Tipo__Alternatives"
    // InternalT5.g:1171:1: rule__Tipo__Alternatives : ( ( ( rule__Tipo__RegistroAssignment_0 ) ) | ( ( rule__Tipo__TipoExtAssignment_1 ) ) );
    public final void rule__Tipo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1175:1: ( ( ( rule__Tipo__RegistroAssignment_0 ) ) | ( ( rule__Tipo__TipoExtAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||(LA4_0>=13 && LA4_0<=16)||LA4_0==49) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalT5.g:1176:2: ( ( rule__Tipo__RegistroAssignment_0 ) )
                    {
                    // InternalT5.g:1176:2: ( ( rule__Tipo__RegistroAssignment_0 ) )
                    // InternalT5.g:1177:3: ( rule__Tipo__RegistroAssignment_0 )
                    {
                     before(grammarAccess.getTipoAccess().getRegistroAssignment_0()); 
                    // InternalT5.g:1178:3: ( rule__Tipo__RegistroAssignment_0 )
                    // InternalT5.g:1178:4: rule__Tipo__RegistroAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tipo__RegistroAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTipoAccess().getRegistroAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1182:2: ( ( rule__Tipo__TipoExtAssignment_1 ) )
                    {
                    // InternalT5.g:1182:2: ( ( rule__Tipo__TipoExtAssignment_1 ) )
                    // InternalT5.g:1183:3: ( rule__Tipo__TipoExtAssignment_1 )
                    {
                     before(grammarAccess.getTipoAccess().getTipoExtAssignment_1()); 
                    // InternalT5.g:1184:3: ( rule__Tipo__TipoExtAssignment_1 )
                    // InternalT5.g:1184:4: rule__Tipo__TipoExtAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tipo__TipoExtAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTipoAccess().getTipoExtAssignment_1()); 

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
    // $ANTLR end "rule__Tipo__Alternatives"


    // $ANTLR start "rule__TipoEstendido__Alternatives_1"
    // InternalT5.g:1192:1: rule__TipoEstendido__Alternatives_1 : ( ( ( rule__TipoEstendido__BasicAssignment_1_0 ) ) | ( ( rule__TipoEstendido__RefAssignment_1_1 ) ) );
    public final void rule__TipoEstendido__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1196:1: ( ( ( rule__TipoEstendido__BasicAssignment_1_0 ) ) | ( ( rule__TipoEstendido__RefAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=16)) ) {
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
                    // InternalT5.g:1197:2: ( ( rule__TipoEstendido__BasicAssignment_1_0 ) )
                    {
                    // InternalT5.g:1197:2: ( ( rule__TipoEstendido__BasicAssignment_1_0 ) )
                    // InternalT5.g:1198:3: ( rule__TipoEstendido__BasicAssignment_1_0 )
                    {
                     before(grammarAccess.getTipoEstendidoAccess().getBasicAssignment_1_0()); 
                    // InternalT5.g:1199:3: ( rule__TipoEstendido__BasicAssignment_1_0 )
                    // InternalT5.g:1199:4: rule__TipoEstendido__BasicAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TipoEstendido__BasicAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTipoEstendidoAccess().getBasicAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1203:2: ( ( rule__TipoEstendido__RefAssignment_1_1 ) )
                    {
                    // InternalT5.g:1203:2: ( ( rule__TipoEstendido__RefAssignment_1_1 ) )
                    // InternalT5.g:1204:3: ( rule__TipoEstendido__RefAssignment_1_1 )
                    {
                     before(grammarAccess.getTipoEstendidoAccess().getRefAssignment_1_1()); 
                    // InternalT5.g:1205:3: ( rule__TipoEstendido__RefAssignment_1_1 )
                    // InternalT5.g:1205:4: rule__TipoEstendido__RefAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TipoEstendido__RefAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTipoEstendidoAccess().getRefAssignment_1_1()); 

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
    // $ANTLR end "rule__TipoEstendido__Alternatives_1"


    // $ANTLR start "rule__TipoBasico__Alternatives"
    // InternalT5.g:1213:1: rule__TipoBasico__Alternatives : ( ( 'literal' ) | ( 'inteiro' ) | ( 'real' ) | ( 'logico' ) );
    public final void rule__TipoBasico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1217:1: ( ( 'literal' ) | ( 'inteiro' ) | ( 'real' ) | ( 'logico' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalT5.g:1218:2: ( 'literal' )
                    {
                    // InternalT5.g:1218:2: ( 'literal' )
                    // InternalT5.g:1219:3: 'literal'
                    {
                     before(grammarAccess.getTipoBasicoAccess().getLiteralKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTipoBasicoAccess().getLiteralKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1224:2: ( 'inteiro' )
                    {
                    // InternalT5.g:1224:2: ( 'inteiro' )
                    // InternalT5.g:1225:3: 'inteiro'
                    {
                     before(grammarAccess.getTipoBasicoAccess().getInteiroKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTipoBasicoAccess().getInteiroKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1230:2: ( 'real' )
                    {
                    // InternalT5.g:1230:2: ( 'real' )
                    // InternalT5.g:1231:3: 'real'
                    {
                     before(grammarAccess.getTipoBasicoAccess().getRealKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTipoBasicoAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:1236:2: ( 'logico' )
                    {
                    // InternalT5.g:1236:2: ( 'logico' )
                    // InternalT5.g:1237:3: 'logico'
                    {
                     before(grammarAccess.getTipoBasicoAccess().getLogicoKeyword_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTipoBasicoAccess().getLogicoKeyword_3()); 

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
    // $ANTLR end "rule__TipoBasico__Alternatives"


    // $ANTLR start "rule__ValorConstante__Alternatives"
    // InternalT5.g:1246:1: rule__ValorConstante__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_REAL ) | ( 'verdadeiro' ) | ( 'falso' ) );
    public final void rule__ValorConstante__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1250:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_REAL ) | ( 'verdadeiro' ) | ( 'falso' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_REAL:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalT5.g:1251:2: ( RULE_STRING )
                    {
                    // InternalT5.g:1251:2: ( RULE_STRING )
                    // InternalT5.g:1252:3: RULE_STRING
                    {
                     before(grammarAccess.getValorConstanteAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1257:2: ( RULE_INT )
                    {
                    // InternalT5.g:1257:2: ( RULE_INT )
                    // InternalT5.g:1258:3: RULE_INT
                    {
                     before(grammarAccess.getValorConstanteAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1263:2: ( RULE_REAL )
                    {
                    // InternalT5.g:1263:2: ( RULE_REAL )
                    // InternalT5.g:1264:3: RULE_REAL
                    {
                     before(grammarAccess.getValorConstanteAccess().getREALTerminalRuleCall_2()); 
                    match(input,RULE_REAL,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getREALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:1269:2: ( 'verdadeiro' )
                    {
                    // InternalT5.g:1269:2: ( 'verdadeiro' )
                    // InternalT5.g:1270:3: 'verdadeiro'
                    {
                     before(grammarAccess.getValorConstanteAccess().getVerdadeiroKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getVerdadeiroKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT5.g:1275:2: ( 'falso' )
                    {
                    // InternalT5.g:1275:2: ( 'falso' )
                    // InternalT5.g:1276:3: 'falso'
                    {
                     before(grammarAccess.getValorConstanteAccess().getFalsoKeyword_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getFalsoKeyword_4()); 

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
    // $ANTLR end "rule__ValorConstante__Alternatives"


    // $ANTLR start "rule__Comando__Alternatives"
    // InternalT5.g:1285:1: rule__Comando__Alternatives : ( ( ruleComandoLeia ) | ( ruleComandoEscreva ) | ( ruleComandoSe ) | ( ruleComandoCaso ) | ( ruleComandoPara ) | ( ruleComandoEnquanto ) | ( ruleComandoFaca ) | ( ruleComandoAtribuicao ) | ( ruleComandoChamada ) | ( ruleComandoRetorne ) );
    public final void rule__Comando__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1289:1: ( ( ruleComandoLeia ) | ( ruleComandoEscreva ) | ( ruleComandoSe ) | ( ruleComandoCaso ) | ( ruleComandoPara ) | ( ruleComandoEnquanto ) | ( ruleComandoFaca ) | ( ruleComandoAtribuicao ) | ( ruleComandoChamada ) | ( ruleComandoRetorne ) )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalT5.g:1290:2: ( ruleComandoLeia )
                    {
                    // InternalT5.g:1290:2: ( ruleComandoLeia )
                    // InternalT5.g:1291:3: ruleComandoLeia
                    {
                     before(grammarAccess.getComandoAccess().getComandoLeiaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoLeia();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoLeiaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1296:2: ( ruleComandoEscreva )
                    {
                    // InternalT5.g:1296:2: ( ruleComandoEscreva )
                    // InternalT5.g:1297:3: ruleComandoEscreva
                    {
                     before(grammarAccess.getComandoAccess().getComandoEscrevaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoEscreva();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoEscrevaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1302:2: ( ruleComandoSe )
                    {
                    // InternalT5.g:1302:2: ( ruleComandoSe )
                    // InternalT5.g:1303:3: ruleComandoSe
                    {
                     before(grammarAccess.getComandoAccess().getComandoSeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoSe();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoSeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:1308:2: ( ruleComandoCaso )
                    {
                    // InternalT5.g:1308:2: ( ruleComandoCaso )
                    // InternalT5.g:1309:3: ruleComandoCaso
                    {
                     before(grammarAccess.getComandoAccess().getComandoCasoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoCaso();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoCasoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT5.g:1314:2: ( ruleComandoPara )
                    {
                    // InternalT5.g:1314:2: ( ruleComandoPara )
                    // InternalT5.g:1315:3: ruleComandoPara
                    {
                     before(grammarAccess.getComandoAccess().getComandoParaParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoPara();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoParaParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT5.g:1320:2: ( ruleComandoEnquanto )
                    {
                    // InternalT5.g:1320:2: ( ruleComandoEnquanto )
                    // InternalT5.g:1321:3: ruleComandoEnquanto
                    {
                     before(grammarAccess.getComandoAccess().getComandoEnquantoParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoEnquanto();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoEnquantoParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalT5.g:1326:2: ( ruleComandoFaca )
                    {
                    // InternalT5.g:1326:2: ( ruleComandoFaca )
                    // InternalT5.g:1327:3: ruleComandoFaca
                    {
                     before(grammarAccess.getComandoAccess().getComandoFacaParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoFaca();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoFacaParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalT5.g:1332:2: ( ruleComandoAtribuicao )
                    {
                    // InternalT5.g:1332:2: ( ruleComandoAtribuicao )
                    // InternalT5.g:1333:3: ruleComandoAtribuicao
                    {
                     before(grammarAccess.getComandoAccess().getComandoAtribuicaoParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoAtribuicao();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoAtribuicaoParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalT5.g:1338:2: ( ruleComandoChamada )
                    {
                    // InternalT5.g:1338:2: ( ruleComandoChamada )
                    // InternalT5.g:1339:3: ruleComandoChamada
                    {
                     before(grammarAccess.getComandoAccess().getComandoChamadaParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoChamada();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoChamadaParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalT5.g:1344:2: ( ruleComandoRetorne )
                    {
                    // InternalT5.g:1344:2: ( ruleComandoRetorne )
                    // InternalT5.g:1345:3: ruleComandoRetorne
                    {
                     before(grammarAccess.getComandoAccess().getComandoRetorneParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleComandoRetorne();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandoRetorneParserRuleCall_9()); 

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
    // $ANTLR end "rule__Comando__Alternatives"


    // $ANTLR start "rule__FatorAritmetico__Alternatives"
    // InternalT5.g:1354:1: rule__FatorAritmetico__Alternatives : ( ( ( rule__FatorAritmetico__Group_0__0 ) ) | ( ( rule__FatorAritmetico__NumeroAssignment_1 ) ) | ( ( rule__FatorAritmetico__RealAssignment_2 ) ) | ( ( rule__FatorAritmetico__Group_3__0 ) ) | ( RULE_STRING ) );
    public final void rule__FatorAritmetico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1358:1: ( ( ( rule__FatorAritmetico__Group_0__0 ) ) | ( ( rule__FatorAritmetico__NumeroAssignment_1 ) ) | ( ( rule__FatorAritmetico__RealAssignment_2 ) ) | ( ( rule__FatorAritmetico__Group_3__0 ) ) | ( RULE_STRING ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 49:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_REAL:
                {
                alt9=3;
                }
                break;
            case 39:
                {
                alt9=4;
                }
                break;
            case RULE_STRING:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalT5.g:1359:2: ( ( rule__FatorAritmetico__Group_0__0 ) )
                    {
                    // InternalT5.g:1359:2: ( ( rule__FatorAritmetico__Group_0__0 ) )
                    // InternalT5.g:1360:3: ( rule__FatorAritmetico__Group_0__0 )
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getGroup_0()); 
                    // InternalT5.g:1361:3: ( rule__FatorAritmetico__Group_0__0 )
                    // InternalT5.g:1361:4: rule__FatorAritmetico__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FatorAritmetico__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFatorAritmeticoAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1365:2: ( ( rule__FatorAritmetico__NumeroAssignment_1 ) )
                    {
                    // InternalT5.g:1365:2: ( ( rule__FatorAritmetico__NumeroAssignment_1 ) )
                    // InternalT5.g:1366:3: ( rule__FatorAritmetico__NumeroAssignment_1 )
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getNumeroAssignment_1()); 
                    // InternalT5.g:1367:3: ( rule__FatorAritmetico__NumeroAssignment_1 )
                    // InternalT5.g:1367:4: rule__FatorAritmetico__NumeroAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FatorAritmetico__NumeroAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFatorAritmeticoAccess().getNumeroAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1371:2: ( ( rule__FatorAritmetico__RealAssignment_2 ) )
                    {
                    // InternalT5.g:1371:2: ( ( rule__FatorAritmetico__RealAssignment_2 ) )
                    // InternalT5.g:1372:3: ( rule__FatorAritmetico__RealAssignment_2 )
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getRealAssignment_2()); 
                    // InternalT5.g:1373:3: ( rule__FatorAritmetico__RealAssignment_2 )
                    // InternalT5.g:1373:4: rule__FatorAritmetico__RealAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FatorAritmetico__RealAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFatorAritmeticoAccess().getRealAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:1377:2: ( ( rule__FatorAritmetico__Group_3__0 ) )
                    {
                    // InternalT5.g:1377:2: ( ( rule__FatorAritmetico__Group_3__0 ) )
                    // InternalT5.g:1378:3: ( rule__FatorAritmetico__Group_3__0 )
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getGroup_3()); 
                    // InternalT5.g:1379:3: ( rule__FatorAritmetico__Group_3__0 )
                    // InternalT5.g:1379:4: rule__FatorAritmetico__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FatorAritmetico__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFatorAritmeticoAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT5.g:1383:2: ( RULE_STRING )
                    {
                    // InternalT5.g:1383:2: ( RULE_STRING )
                    // InternalT5.g:1384:3: RULE_STRING
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getSTRINGTerminalRuleCall_4()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getFatorAritmeticoAccess().getSTRINGTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__FatorAritmetico__Alternatives"


    // $ANTLR start "rule__OpArit1__Alternatives"
    // InternalT5.g:1393:1: rule__OpArit1__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__OpArit1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1397:1: ( ( '+' ) | ( '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalT5.g:1398:2: ( '+' )
                    {
                    // InternalT5.g:1398:2: ( '+' )
                    // InternalT5.g:1399:3: '+'
                    {
                     before(grammarAccess.getOpArit1Access().getPlusSignKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOpArit1Access().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1404:2: ( '-' )
                    {
                    // InternalT5.g:1404:2: ( '-' )
                    // InternalT5.g:1405:3: '-'
                    {
                     before(grammarAccess.getOpArit1Access().getHyphenMinusKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOpArit1Access().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__OpArit1__Alternatives"


    // $ANTLR start "rule__OpArit2__Alternatives"
    // InternalT5.g:1414:1: rule__OpArit2__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__OpArit2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1418:1: ( ( '*' ) | ( '/' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalT5.g:1419:2: ( '*' )
                    {
                    // InternalT5.g:1419:2: ( '*' )
                    // InternalT5.g:1420:3: '*'
                    {
                     before(grammarAccess.getOpArit2Access().getAsteriskKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOpArit2Access().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1425:2: ( '/' )
                    {
                    // InternalT5.g:1425:2: ( '/' )
                    // InternalT5.g:1426:3: '/'
                    {
                     before(grammarAccess.getOpArit2Access().getSolidusKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOpArit2Access().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__OpArit2__Alternatives"


    // $ANTLR start "rule__OpRel__Alternatives"
    // InternalT5.g:1435:1: rule__OpRel__Alternatives : ( ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) | ( '<>' ) | ( '=' ) );
    public final void rule__OpRel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1439:1: ( ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) | ( '<>' ) | ( '=' ) )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            case 26:
                {
                alt12=5;
                }
                break;
            case 27:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalT5.g:1440:2: ( '>' )
                    {
                    // InternalT5.g:1440:2: ( '>' )
                    // InternalT5.g:1441:3: '>'
                    {
                     before(grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1446:2: ( '>=' )
                    {
                    // InternalT5.g:1446:2: ( '>=' )
                    // InternalT5.g:1447:3: '>='
                    {
                     before(grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1452:2: ( '<' )
                    {
                    // InternalT5.g:1452:2: ( '<' )
                    // InternalT5.g:1453:3: '<'
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:1458:2: ( '<=' )
                    {
                    // InternalT5.g:1458:2: ( '<=' )
                    // InternalT5.g:1459:3: '<='
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT5.g:1464:2: ( '<>' )
                    {
                    // InternalT5.g:1464:2: ( '<>' )
                    // InternalT5.g:1465:3: '<>'
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT5.g:1470:2: ( '=' )
                    {
                    // InternalT5.g:1470:2: ( '=' )
                    // InternalT5.g:1471:3: '='
                    {
                     before(grammarAccess.getOpRelAccess().getEqualsSignKeyword_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__OpRel__Alternatives"


    // $ANTLR start "rule__OpBool__Alternatives"
    // InternalT5.g:1480:1: rule__OpBool__Alternatives : ( ( 'e' ) | ( 'ou' ) );
    public final void rule__OpBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1484:1: ( ( 'e' ) | ( 'ou' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalT5.g:1485:2: ( 'e' )
                    {
                    // InternalT5.g:1485:2: ( 'e' )
                    // InternalT5.g:1486:3: 'e'
                    {
                     before(grammarAccess.getOpBoolAccess().getEKeyword_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getOpBoolAccess().getEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1491:2: ( 'ou' )
                    {
                    // InternalT5.g:1491:2: ( 'ou' )
                    // InternalT5.g:1492:3: 'ou'
                    {
                     before(grammarAccess.getOpBoolAccess().getOuKeyword_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getOpBoolAccess().getOuKeyword_1()); 

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
    // $ANTLR end "rule__OpBool__Alternatives"


    // $ANTLR start "rule__Programa__Group__0"
    // InternalT5.g:1501:1: rule__Programa__Group__0 : rule__Programa__Group__0__Impl rule__Programa__Group__1 ;
    public final void rule__Programa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1505:1: ( rule__Programa__Group__0__Impl rule__Programa__Group__1 )
            // InternalT5.g:1506:2: rule__Programa__Group__0__Impl rule__Programa__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Programa__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__0"


    // $ANTLR start "rule__Programa__Group__0__Impl"
    // InternalT5.g:1513:1: rule__Programa__Group__0__Impl : ( 'DECLARACOES' ) ;
    public final void rule__Programa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1517:1: ( ( 'DECLARACOES' ) )
            // InternalT5.g:1518:1: ( 'DECLARACOES' )
            {
            // InternalT5.g:1518:1: ( 'DECLARACOES' )
            // InternalT5.g:1519:2: 'DECLARACOES'
            {
             before(grammarAccess.getProgramaAccess().getDECLARACOESKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProgramaAccess().getDECLARACOESKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__0__Impl"


    // $ANTLR start "rule__Programa__Group__1"
    // InternalT5.g:1528:1: rule__Programa__Group__1 : rule__Programa__Group__1__Impl rule__Programa__Group__2 ;
    public final void rule__Programa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1532:1: ( rule__Programa__Group__1__Impl rule__Programa__Group__2 )
            // InternalT5.g:1533:2: rule__Programa__Group__1__Impl rule__Programa__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Programa__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__1"


    // $ANTLR start "rule__Programa__Group__1__Impl"
    // InternalT5.g:1540:1: rule__Programa__Group__1__Impl : ( ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* ) ) ;
    public final void rule__Programa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1544:1: ( ( ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* ) ) )
            // InternalT5.g:1545:1: ( ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* ) )
            {
            // InternalT5.g:1545:1: ( ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* ) )
            // InternalT5.g:1546:2: ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* )
            {
            // InternalT5.g:1546:2: ( ( rule__Programa__DeclaracoesAssignment_1 ) )
            // InternalT5.g:1547:3: ( rule__Programa__DeclaracoesAssignment_1 )
            {
             before(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_1()); 
            // InternalT5.g:1548:3: ( rule__Programa__DeclaracoesAssignment_1 )
            // InternalT5.g:1548:4: rule__Programa__DeclaracoesAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Programa__DeclaracoesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_1()); 

            }

            // InternalT5.g:1551:2: ( ( rule__Programa__DeclaracoesAssignment_1 )* )
            // InternalT5.g:1552:3: ( rule__Programa__DeclaracoesAssignment_1 )*
            {
             before(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_1()); 
            // InternalT5.g:1553:3: ( rule__Programa__DeclaracoesAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33||LA14_0==35||(LA14_0>=37 && LA14_0<=38)||LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT5.g:1553:4: rule__Programa__DeclaracoesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Programa__DeclaracoesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__1__Impl"


    // $ANTLR start "rule__Programa__Group__2"
    // InternalT5.g:1562:1: rule__Programa__Group__2 : rule__Programa__Group__2__Impl rule__Programa__Group__3 ;
    public final void rule__Programa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1566:1: ( rule__Programa__Group__2__Impl rule__Programa__Group__3 )
            // InternalT5.g:1567:2: rule__Programa__Group__2__Impl rule__Programa__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Programa__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__2"


    // $ANTLR start "rule__Programa__Group__2__Impl"
    // InternalT5.g:1574:1: rule__Programa__Group__2__Impl : ( 'ALGORITMO' ) ;
    public final void rule__Programa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1578:1: ( ( 'ALGORITMO' ) )
            // InternalT5.g:1579:1: ( 'ALGORITMO' )
            {
            // InternalT5.g:1579:1: ( 'ALGORITMO' )
            // InternalT5.g:1580:2: 'ALGORITMO'
            {
             before(grammarAccess.getProgramaAccess().getALGORITMOKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProgramaAccess().getALGORITMOKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__2__Impl"


    // $ANTLR start "rule__Programa__Group__3"
    // InternalT5.g:1589:1: rule__Programa__Group__3 : rule__Programa__Group__3__Impl rule__Programa__Group__4 ;
    public final void rule__Programa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1593:1: ( rule__Programa__Group__3__Impl rule__Programa__Group__4 )
            // InternalT5.g:1594:2: rule__Programa__Group__3__Impl rule__Programa__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Programa__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programa__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__3"


    // $ANTLR start "rule__Programa__Group__3__Impl"
    // InternalT5.g:1601:1: rule__Programa__Group__3__Impl : ( ( rule__Programa__CorpoAssignment_3 ) ) ;
    public final void rule__Programa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1605:1: ( ( ( rule__Programa__CorpoAssignment_3 ) ) )
            // InternalT5.g:1606:1: ( ( rule__Programa__CorpoAssignment_3 ) )
            {
            // InternalT5.g:1606:1: ( ( rule__Programa__CorpoAssignment_3 ) )
            // InternalT5.g:1607:2: ( rule__Programa__CorpoAssignment_3 )
            {
             before(grammarAccess.getProgramaAccess().getCorpoAssignment_3()); 
            // InternalT5.g:1608:2: ( rule__Programa__CorpoAssignment_3 )
            // InternalT5.g:1608:3: rule__Programa__CorpoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Programa__CorpoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramaAccess().getCorpoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__3__Impl"


    // $ANTLR start "rule__Programa__Group__4"
    // InternalT5.g:1616:1: rule__Programa__Group__4 : rule__Programa__Group__4__Impl ;
    public final void rule__Programa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1620:1: ( rule__Programa__Group__4__Impl )
            // InternalT5.g:1621:2: rule__Programa__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programa__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__4"


    // $ANTLR start "rule__Programa__Group__4__Impl"
    // InternalT5.g:1627:1: rule__Programa__Group__4__Impl : ( 'FIM_ALGORITMO' ) ;
    public final void rule__Programa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1631:1: ( ( 'FIM_ALGORITMO' ) )
            // InternalT5.g:1632:1: ( 'FIM_ALGORITMO' )
            {
            // InternalT5.g:1632:1: ( 'FIM_ALGORITMO' )
            // InternalT5.g:1633:2: 'FIM_ALGORITMO'
            {
             before(grammarAccess.getProgramaAccess().getFIM_ALGORITMOKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProgramaAccess().getFIM_ALGORITMOKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__Group__4__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0__0"
    // InternalT5.g:1643:1: rule__DeclaracaoLocal__Group_0__0 : rule__DeclaracaoLocal__Group_0__0__Impl rule__DeclaracaoLocal__Group_0__1 ;
    public final void rule__DeclaracaoLocal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1647:1: ( rule__DeclaracaoLocal__Group_0__0__Impl rule__DeclaracaoLocal__Group_0__1 )
            // InternalT5.g:1648:2: rule__DeclaracaoLocal__Group_0__0__Impl rule__DeclaracaoLocal__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclaracaoLocal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0__0"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0__0__Impl"
    // InternalT5.g:1655:1: rule__DeclaracaoLocal__Group_0__0__Impl : ( 'declare' ) ;
    public final void rule__DeclaracaoLocal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1659:1: ( ( 'declare' ) )
            // InternalT5.g:1660:1: ( 'declare' )
            {
            // InternalT5.g:1660:1: ( 'declare' )
            // InternalT5.g:1661:2: 'declare'
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getDeclareKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getDeclareKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0__0__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0__1"
    // InternalT5.g:1670:1: rule__DeclaracaoLocal__Group_0__1 : rule__DeclaracaoLocal__Group_0__1__Impl rule__DeclaracaoLocal__Group_0__2 ;
    public final void rule__DeclaracaoLocal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1674:1: ( rule__DeclaracaoLocal__Group_0__1__Impl rule__DeclaracaoLocal__Group_0__2 )
            // InternalT5.g:1675:2: rule__DeclaracaoLocal__Group_0__1__Impl rule__DeclaracaoLocal__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__DeclaracaoLocal__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0__1"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0__1__Impl"
    // InternalT5.g:1682:1: rule__DeclaracaoLocal__Group_0__1__Impl : ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 ) ) ;
    public final void rule__DeclaracaoLocal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1686:1: ( ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 ) ) )
            // InternalT5.g:1687:1: ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 ) )
            {
            // InternalT5.g:1687:1: ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 ) )
            // InternalT5.g:1688:2: ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getVariaveisAssignment_0_1()); 
            // InternalT5.g:1689:2: ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 )
            // InternalT5.g:1689:3: rule__DeclaracaoLocal__VariaveisAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__VariaveisAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoLocalAccess().getVariaveisAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0__1__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0__2"
    // InternalT5.g:1697:1: rule__DeclaracaoLocal__Group_0__2 : rule__DeclaracaoLocal__Group_0__2__Impl ;
    public final void rule__DeclaracaoLocal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1701:1: ( rule__DeclaracaoLocal__Group_0__2__Impl )
            // InternalT5.g:1702:2: rule__DeclaracaoLocal__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0__2"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0__2__Impl"
    // InternalT5.g:1708:1: rule__DeclaracaoLocal__Group_0__2__Impl : ( ( rule__DeclaracaoLocal__Group_0_2__0 )* ) ;
    public final void rule__DeclaracaoLocal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1712:1: ( ( ( rule__DeclaracaoLocal__Group_0_2__0 )* ) )
            // InternalT5.g:1713:1: ( ( rule__DeclaracaoLocal__Group_0_2__0 )* )
            {
            // InternalT5.g:1713:1: ( ( rule__DeclaracaoLocal__Group_0_2__0 )* )
            // InternalT5.g:1714:2: ( rule__DeclaracaoLocal__Group_0_2__0 )*
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getGroup_0_2()); 
            // InternalT5.g:1715:2: ( rule__DeclaracaoLocal__Group_0_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalT5.g:1715:3: rule__DeclaracaoLocal__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DeclaracaoLocal__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDeclaracaoLocalAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0__2__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0_2__0"
    // InternalT5.g:1724:1: rule__DeclaracaoLocal__Group_0_2__0 : rule__DeclaracaoLocal__Group_0_2__0__Impl rule__DeclaracaoLocal__Group_0_2__1 ;
    public final void rule__DeclaracaoLocal__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1728:1: ( rule__DeclaracaoLocal__Group_0_2__0__Impl rule__DeclaracaoLocal__Group_0_2__1 )
            // InternalT5.g:1729:2: rule__DeclaracaoLocal__Group_0_2__0__Impl rule__DeclaracaoLocal__Group_0_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclaracaoLocal__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0_2__0"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0_2__0__Impl"
    // InternalT5.g:1736:1: rule__DeclaracaoLocal__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__DeclaracaoLocal__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1740:1: ( ( ',' ) )
            // InternalT5.g:1741:1: ( ',' )
            {
            // InternalT5.g:1741:1: ( ',' )
            // InternalT5.g:1742:2: ','
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getCommaKeyword_0_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getCommaKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0_2__0__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0_2__1"
    // InternalT5.g:1751:1: rule__DeclaracaoLocal__Group_0_2__1 : rule__DeclaracaoLocal__Group_0_2__1__Impl ;
    public final void rule__DeclaracaoLocal__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1755:1: ( rule__DeclaracaoLocal__Group_0_2__1__Impl )
            // InternalT5.g:1756:2: rule__DeclaracaoLocal__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0_2__1"


    // $ANTLR start "rule__DeclaracaoLocal__Group_0_2__1__Impl"
    // InternalT5.g:1762:1: rule__DeclaracaoLocal__Group_0_2__1__Impl : ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 ) ) ;
    public final void rule__DeclaracaoLocal__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1766:1: ( ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 ) ) )
            // InternalT5.g:1767:1: ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 ) )
            {
            // InternalT5.g:1767:1: ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 ) )
            // InternalT5.g:1768:2: ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getVariaveisAssignment_0_2_1()); 
            // InternalT5.g:1769:2: ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 )
            // InternalT5.g:1769:3: rule__DeclaracaoLocal__VariaveisAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__VariaveisAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoLocalAccess().getVariaveisAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_0_2__1__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__0"
    // InternalT5.g:1778:1: rule__DeclaracaoLocal__Group_1__0 : rule__DeclaracaoLocal__Group_1__0__Impl rule__DeclaracaoLocal__Group_1__1 ;
    public final void rule__DeclaracaoLocal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1782:1: ( rule__DeclaracaoLocal__Group_1__0__Impl rule__DeclaracaoLocal__Group_1__1 )
            // InternalT5.g:1783:2: rule__DeclaracaoLocal__Group_1__0__Impl rule__DeclaracaoLocal__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclaracaoLocal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__0"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__0__Impl"
    // InternalT5.g:1790:1: rule__DeclaracaoLocal__Group_1__0__Impl : ( 'constante' ) ;
    public final void rule__DeclaracaoLocal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1794:1: ( ( 'constante' ) )
            // InternalT5.g:1795:1: ( 'constante' )
            {
            // InternalT5.g:1795:1: ( 'constante' )
            // InternalT5.g:1796:2: 'constante'
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getConstanteKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getConstanteKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__0__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__1"
    // InternalT5.g:1805:1: rule__DeclaracaoLocal__Group_1__1 : rule__DeclaracaoLocal__Group_1__1__Impl rule__DeclaracaoLocal__Group_1__2 ;
    public final void rule__DeclaracaoLocal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1809:1: ( rule__DeclaracaoLocal__Group_1__1__Impl rule__DeclaracaoLocal__Group_1__2 )
            // InternalT5.g:1810:2: rule__DeclaracaoLocal__Group_1__1__Impl rule__DeclaracaoLocal__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__DeclaracaoLocal__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__1"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__1__Impl"
    // InternalT5.g:1817:1: rule__DeclaracaoLocal__Group_1__1__Impl : ( ( rule__DeclaracaoLocal__NameAssignment_1_1 ) ) ;
    public final void rule__DeclaracaoLocal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1821:1: ( ( ( rule__DeclaracaoLocal__NameAssignment_1_1 ) ) )
            // InternalT5.g:1822:1: ( ( rule__DeclaracaoLocal__NameAssignment_1_1 ) )
            {
            // InternalT5.g:1822:1: ( ( rule__DeclaracaoLocal__NameAssignment_1_1 ) )
            // InternalT5.g:1823:2: ( rule__DeclaracaoLocal__NameAssignment_1_1 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getNameAssignment_1_1()); 
            // InternalT5.g:1824:2: ( rule__DeclaracaoLocal__NameAssignment_1_1 )
            // InternalT5.g:1824:3: rule__DeclaracaoLocal__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoLocalAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__1__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__2"
    // InternalT5.g:1832:1: rule__DeclaracaoLocal__Group_1__2 : rule__DeclaracaoLocal__Group_1__2__Impl rule__DeclaracaoLocal__Group_1__3 ;
    public final void rule__DeclaracaoLocal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1836:1: ( rule__DeclaracaoLocal__Group_1__2__Impl rule__DeclaracaoLocal__Group_1__3 )
            // InternalT5.g:1837:2: rule__DeclaracaoLocal__Group_1__2__Impl rule__DeclaracaoLocal__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__DeclaracaoLocal__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__2"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__2__Impl"
    // InternalT5.g:1844:1: rule__DeclaracaoLocal__Group_1__2__Impl : ( ':' ) ;
    public final void rule__DeclaracaoLocal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1848:1: ( ( ':' ) )
            // InternalT5.g:1849:1: ( ':' )
            {
            // InternalT5.g:1849:1: ( ':' )
            // InternalT5.g:1850:2: ':'
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getColonKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__2__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__3"
    // InternalT5.g:1859:1: rule__DeclaracaoLocal__Group_1__3 : rule__DeclaracaoLocal__Group_1__3__Impl rule__DeclaracaoLocal__Group_1__4 ;
    public final void rule__DeclaracaoLocal__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1863:1: ( rule__DeclaracaoLocal__Group_1__3__Impl rule__DeclaracaoLocal__Group_1__4 )
            // InternalT5.g:1864:2: rule__DeclaracaoLocal__Group_1__3__Impl rule__DeclaracaoLocal__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__DeclaracaoLocal__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__3"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__3__Impl"
    // InternalT5.g:1871:1: rule__DeclaracaoLocal__Group_1__3__Impl : ( ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 ) ) ;
    public final void rule__DeclaracaoLocal__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1875:1: ( ( ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 ) ) )
            // InternalT5.g:1876:1: ( ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 ) )
            {
            // InternalT5.g:1876:1: ( ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 ) )
            // InternalT5.g:1877:2: ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getTipoBasicoAssignment_1_3()); 
            // InternalT5.g:1878:2: ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 )
            // InternalT5.g:1878:3: rule__DeclaracaoLocal__TipoBasicoAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__TipoBasicoAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoLocalAccess().getTipoBasicoAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__3__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__4"
    // InternalT5.g:1886:1: rule__DeclaracaoLocal__Group_1__4 : rule__DeclaracaoLocal__Group_1__4__Impl rule__DeclaracaoLocal__Group_1__5 ;
    public final void rule__DeclaracaoLocal__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1890:1: ( rule__DeclaracaoLocal__Group_1__4__Impl rule__DeclaracaoLocal__Group_1__5 )
            // InternalT5.g:1891:2: rule__DeclaracaoLocal__Group_1__4__Impl rule__DeclaracaoLocal__Group_1__5
            {
            pushFollow(FOLLOW_14);
            rule__DeclaracaoLocal__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__4"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__4__Impl"
    // InternalT5.g:1898:1: rule__DeclaracaoLocal__Group_1__4__Impl : ( '=' ) ;
    public final void rule__DeclaracaoLocal__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1902:1: ( ( '=' ) )
            // InternalT5.g:1903:1: ( '=' )
            {
            // InternalT5.g:1903:1: ( '=' )
            // InternalT5.g:1904:2: '='
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getEqualsSignKeyword_1_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getEqualsSignKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__4__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__5"
    // InternalT5.g:1913:1: rule__DeclaracaoLocal__Group_1__5 : rule__DeclaracaoLocal__Group_1__5__Impl ;
    public final void rule__DeclaracaoLocal__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1917:1: ( rule__DeclaracaoLocal__Group_1__5__Impl )
            // InternalT5.g:1918:2: rule__DeclaracaoLocal__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__5"


    // $ANTLR start "rule__DeclaracaoLocal__Group_1__5__Impl"
    // InternalT5.g:1924:1: rule__DeclaracaoLocal__Group_1__5__Impl : ( ( rule__DeclaracaoLocal__ValorAssignment_1_5 ) ) ;
    public final void rule__DeclaracaoLocal__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1928:1: ( ( ( rule__DeclaracaoLocal__ValorAssignment_1_5 ) ) )
            // InternalT5.g:1929:1: ( ( rule__DeclaracaoLocal__ValorAssignment_1_5 ) )
            {
            // InternalT5.g:1929:1: ( ( rule__DeclaracaoLocal__ValorAssignment_1_5 ) )
            // InternalT5.g:1930:2: ( rule__DeclaracaoLocal__ValorAssignment_1_5 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getValorAssignment_1_5()); 
            // InternalT5.g:1931:2: ( rule__DeclaracaoLocal__ValorAssignment_1_5 )
            // InternalT5.g:1931:3: rule__DeclaracaoLocal__ValorAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__ValorAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoLocalAccess().getValorAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_1__5__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_2__0"
    // InternalT5.g:1940:1: rule__DeclaracaoLocal__Group_2__0 : rule__DeclaracaoLocal__Group_2__0__Impl rule__DeclaracaoLocal__Group_2__1 ;
    public final void rule__DeclaracaoLocal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1944:1: ( rule__DeclaracaoLocal__Group_2__0__Impl rule__DeclaracaoLocal__Group_2__1 )
            // InternalT5.g:1945:2: rule__DeclaracaoLocal__Group_2__0__Impl rule__DeclaracaoLocal__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclaracaoLocal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_2__0"


    // $ANTLR start "rule__DeclaracaoLocal__Group_2__0__Impl"
    // InternalT5.g:1952:1: rule__DeclaracaoLocal__Group_2__0__Impl : ( 'tipo' ) ;
    public final void rule__DeclaracaoLocal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1956:1: ( ( 'tipo' ) )
            // InternalT5.g:1957:1: ( 'tipo' )
            {
            // InternalT5.g:1957:1: ( 'tipo' )
            // InternalT5.g:1958:2: 'tipo'
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getTipoKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getTipoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_2__0__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_2__1"
    // InternalT5.g:1967:1: rule__DeclaracaoLocal__Group_2__1 : rule__DeclaracaoLocal__Group_2__1__Impl rule__DeclaracaoLocal__Group_2__2 ;
    public final void rule__DeclaracaoLocal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1971:1: ( rule__DeclaracaoLocal__Group_2__1__Impl rule__DeclaracaoLocal__Group_2__2 )
            // InternalT5.g:1972:2: rule__DeclaracaoLocal__Group_2__1__Impl rule__DeclaracaoLocal__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__DeclaracaoLocal__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_2__1"


    // $ANTLR start "rule__DeclaracaoLocal__Group_2__1__Impl"
    // InternalT5.g:1979:1: rule__DeclaracaoLocal__Group_2__1__Impl : ( ( rule__DeclaracaoLocal__NameAssignment_2_1 ) ) ;
    public final void rule__DeclaracaoLocal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1983:1: ( ( ( rule__DeclaracaoLocal__NameAssignment_2_1 ) ) )
            // InternalT5.g:1984:1: ( ( rule__DeclaracaoLocal__NameAssignment_2_1 ) )
            {
            // InternalT5.g:1984:1: ( ( rule__DeclaracaoLocal__NameAssignment_2_1 ) )
            // InternalT5.g:1985:2: ( rule__DeclaracaoLocal__NameAssignment_2_1 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getNameAssignment_2_1()); 
            // InternalT5.g:1986:2: ( rule__DeclaracaoLocal__NameAssignment_2_1 )
            // InternalT5.g:1986:3: rule__DeclaracaoLocal__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoLocalAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_2__1__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_2__2"
    // InternalT5.g:1994:1: rule__DeclaracaoLocal__Group_2__2 : rule__DeclaracaoLocal__Group_2__2__Impl rule__DeclaracaoLocal__Group_2__3 ;
    public final void rule__DeclaracaoLocal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1998:1: ( rule__DeclaracaoLocal__Group_2__2__Impl rule__DeclaracaoLocal__Group_2__3 )
            // InternalT5.g:1999:2: rule__DeclaracaoLocal__Group_2__2__Impl rule__DeclaracaoLocal__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__DeclaracaoLocal__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_2__2"


    // $ANTLR start "rule__DeclaracaoLocal__Group_2__2__Impl"
    // InternalT5.g:2006:1: rule__DeclaracaoLocal__Group_2__2__Impl : ( ':' ) ;
    public final void rule__DeclaracaoLocal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2010:1: ( ( ':' ) )
            // InternalT5.g:2011:1: ( ':' )
            {
            // InternalT5.g:2011:1: ( ':' )
            // InternalT5.g:2012:2: ':'
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getColonKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getColonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_2__2__Impl"


    // $ANTLR start "rule__DeclaracaoLocal__Group_2__3"
    // InternalT5.g:2021:1: rule__DeclaracaoLocal__Group_2__3 : rule__DeclaracaoLocal__Group_2__3__Impl ;
    public final void rule__DeclaracaoLocal__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2025:1: ( rule__DeclaracaoLocal__Group_2__3__Impl )
            // InternalT5.g:2026:2: rule__DeclaracaoLocal__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_2__3"


    // $ANTLR start "rule__DeclaracaoLocal__Group_2__3__Impl"
    // InternalT5.g:2032:1: rule__DeclaracaoLocal__Group_2__3__Impl : ( ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 ) ) ;
    public final void rule__DeclaracaoLocal__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2036:1: ( ( ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 ) ) )
            // InternalT5.g:2037:1: ( ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 ) )
            {
            // InternalT5.g:2037:1: ( ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 ) )
            // InternalT5.g:2038:2: ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getTipoDefAssignment_2_3()); 
            // InternalT5.g:2039:2: ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 )
            // InternalT5.g:2039:3: rule__DeclaracaoLocal__TipoDefAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoLocal__TipoDefAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoLocalAccess().getTipoDefAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__Group_2__3__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__0"
    // InternalT5.g:2048:1: rule__DeclaracaoGlobal__Group_0__0 : rule__DeclaracaoGlobal__Group_0__0__Impl rule__DeclaracaoGlobal__Group_0__1 ;
    public final void rule__DeclaracaoGlobal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2052:1: ( rule__DeclaracaoGlobal__Group_0__0__Impl rule__DeclaracaoGlobal__Group_0__1 )
            // InternalT5.g:2053:2: rule__DeclaracaoGlobal__Group_0__0__Impl rule__DeclaracaoGlobal__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclaracaoGlobal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__0"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__0__Impl"
    // InternalT5.g:2060:1: rule__DeclaracaoGlobal__Group_0__0__Impl : ( 'procedimento' ) ;
    public final void rule__DeclaracaoGlobal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2064:1: ( ( 'procedimento' ) )
            // InternalT5.g:2065:1: ( 'procedimento' )
            {
            // InternalT5.g:2065:1: ( 'procedimento' )
            // InternalT5.g:2066:2: 'procedimento'
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getProcedimentoKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getProcedimentoKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__0__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__1"
    // InternalT5.g:2075:1: rule__DeclaracaoGlobal__Group_0__1 : rule__DeclaracaoGlobal__Group_0__1__Impl rule__DeclaracaoGlobal__Group_0__2 ;
    public final void rule__DeclaracaoGlobal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2079:1: ( rule__DeclaracaoGlobal__Group_0__1__Impl rule__DeclaracaoGlobal__Group_0__2 )
            // InternalT5.g:2080:2: rule__DeclaracaoGlobal__Group_0__1__Impl rule__DeclaracaoGlobal__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__DeclaracaoGlobal__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__1"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__1__Impl"
    // InternalT5.g:2087:1: rule__DeclaracaoGlobal__Group_0__1__Impl : ( ( rule__DeclaracaoGlobal__NameAssignment_0_1 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2091:1: ( ( ( rule__DeclaracaoGlobal__NameAssignment_0_1 ) ) )
            // InternalT5.g:2092:1: ( ( rule__DeclaracaoGlobal__NameAssignment_0_1 ) )
            {
            // InternalT5.g:2092:1: ( ( rule__DeclaracaoGlobal__NameAssignment_0_1 ) )
            // InternalT5.g:2093:2: ( rule__DeclaracaoGlobal__NameAssignment_0_1 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getNameAssignment_0_1()); 
            // InternalT5.g:2094:2: ( rule__DeclaracaoGlobal__NameAssignment_0_1 )
            // InternalT5.g:2094:3: rule__DeclaracaoGlobal__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoGlobalAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__1__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__2"
    // InternalT5.g:2102:1: rule__DeclaracaoGlobal__Group_0__2 : rule__DeclaracaoGlobal__Group_0__2__Impl rule__DeclaracaoGlobal__Group_0__3 ;
    public final void rule__DeclaracaoGlobal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2106:1: ( rule__DeclaracaoGlobal__Group_0__2__Impl rule__DeclaracaoGlobal__Group_0__3 )
            // InternalT5.g:2107:2: rule__DeclaracaoGlobal__Group_0__2__Impl rule__DeclaracaoGlobal__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__DeclaracaoGlobal__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__2"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__2__Impl"
    // InternalT5.g:2114:1: rule__DeclaracaoGlobal__Group_0__2__Impl : ( '(' ) ;
    public final void rule__DeclaracaoGlobal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2118:1: ( ( '(' ) )
            // InternalT5.g:2119:1: ( '(' )
            {
            // InternalT5.g:2119:1: ( '(' )
            // InternalT5.g:2120:2: '('
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__2__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__3"
    // InternalT5.g:2129:1: rule__DeclaracaoGlobal__Group_0__3 : rule__DeclaracaoGlobal__Group_0__3__Impl rule__DeclaracaoGlobal__Group_0__4 ;
    public final void rule__DeclaracaoGlobal__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2133:1: ( rule__DeclaracaoGlobal__Group_0__3__Impl rule__DeclaracaoGlobal__Group_0__4 )
            // InternalT5.g:2134:2: rule__DeclaracaoGlobal__Group_0__3__Impl rule__DeclaracaoGlobal__Group_0__4
            {
            pushFollow(FOLLOW_17);
            rule__DeclaracaoGlobal__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__3"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__3__Impl"
    // InternalT5.g:2141:1: rule__DeclaracaoGlobal__Group_0__3__Impl : ( ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )? ) ;
    public final void rule__DeclaracaoGlobal__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2145:1: ( ( ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )? ) )
            // InternalT5.g:2146:1: ( ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )? )
            {
            // InternalT5.g:2146:1: ( ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )? )
            // InternalT5.g:2147:2: ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )?
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getParametrosAssignment_0_3()); 
            // InternalT5.g:2148:2: ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==50) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalT5.g:2148:3: rule__DeclaracaoGlobal__ParametrosAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaracaoGlobal__ParametrosAssignment_0_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaracaoGlobalAccess().getParametrosAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__3__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__4"
    // InternalT5.g:2156:1: rule__DeclaracaoGlobal__Group_0__4 : rule__DeclaracaoGlobal__Group_0__4__Impl rule__DeclaracaoGlobal__Group_0__5 ;
    public final void rule__DeclaracaoGlobal__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2160:1: ( rule__DeclaracaoGlobal__Group_0__4__Impl rule__DeclaracaoGlobal__Group_0__5 )
            // InternalT5.g:2161:2: rule__DeclaracaoGlobal__Group_0__4__Impl rule__DeclaracaoGlobal__Group_0__5
            {
            pushFollow(FOLLOW_6);
            rule__DeclaracaoGlobal__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__4"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__4__Impl"
    // InternalT5.g:2168:1: rule__DeclaracaoGlobal__Group_0__4__Impl : ( ')' ) ;
    public final void rule__DeclaracaoGlobal__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2172:1: ( ( ')' ) )
            // InternalT5.g:2173:1: ( ')' )
            {
            // InternalT5.g:2173:1: ( ')' )
            // InternalT5.g:2174:2: ')'
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getRightParenthesisKeyword_0_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__4__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__5"
    // InternalT5.g:2183:1: rule__DeclaracaoGlobal__Group_0__5 : rule__DeclaracaoGlobal__Group_0__5__Impl rule__DeclaracaoGlobal__Group_0__6 ;
    public final void rule__DeclaracaoGlobal__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2187:1: ( rule__DeclaracaoGlobal__Group_0__5__Impl rule__DeclaracaoGlobal__Group_0__6 )
            // InternalT5.g:2188:2: rule__DeclaracaoGlobal__Group_0__5__Impl rule__DeclaracaoGlobal__Group_0__6
            {
            pushFollow(FOLLOW_18);
            rule__DeclaracaoGlobal__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__5"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__5__Impl"
    // InternalT5.g:2195:1: rule__DeclaracaoGlobal__Group_0__5__Impl : ( ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2199:1: ( ( ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 ) ) )
            // InternalT5.g:2200:1: ( ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 ) )
            {
            // InternalT5.g:2200:1: ( ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 ) )
            // InternalT5.g:2201:2: ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getCorpoAssignment_0_5()); 
            // InternalT5.g:2202:2: ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 )
            // InternalT5.g:2202:3: rule__DeclaracaoGlobal__CorpoAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__CorpoAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoGlobalAccess().getCorpoAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__5__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__6"
    // InternalT5.g:2210:1: rule__DeclaracaoGlobal__Group_0__6 : rule__DeclaracaoGlobal__Group_0__6__Impl ;
    public final void rule__DeclaracaoGlobal__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2214:1: ( rule__DeclaracaoGlobal__Group_0__6__Impl )
            // InternalT5.g:2215:2: rule__DeclaracaoGlobal__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__6"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_0__6__Impl"
    // InternalT5.g:2221:1: rule__DeclaracaoGlobal__Group_0__6__Impl : ( 'fim_procedimento' ) ;
    public final void rule__DeclaracaoGlobal__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2225:1: ( ( 'fim_procedimento' ) )
            // InternalT5.g:2226:1: ( 'fim_procedimento' )
            {
            // InternalT5.g:2226:1: ( 'fim_procedimento' )
            // InternalT5.g:2227:2: 'fim_procedimento'
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getFim_procedimentoKeyword_0_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getFim_procedimentoKeyword_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_0__6__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__0"
    // InternalT5.g:2237:1: rule__DeclaracaoGlobal__Group_1__0 : rule__DeclaracaoGlobal__Group_1__0__Impl rule__DeclaracaoGlobal__Group_1__1 ;
    public final void rule__DeclaracaoGlobal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2241:1: ( rule__DeclaracaoGlobal__Group_1__0__Impl rule__DeclaracaoGlobal__Group_1__1 )
            // InternalT5.g:2242:2: rule__DeclaracaoGlobal__Group_1__0__Impl rule__DeclaracaoGlobal__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__DeclaracaoGlobal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__0"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__0__Impl"
    // InternalT5.g:2249:1: rule__DeclaracaoGlobal__Group_1__0__Impl : ( 'funcao' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2253:1: ( ( 'funcao' ) )
            // InternalT5.g:2254:1: ( 'funcao' )
            {
            // InternalT5.g:2254:1: ( 'funcao' )
            // InternalT5.g:2255:2: 'funcao'
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getFuncaoKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getFuncaoKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__0__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__1"
    // InternalT5.g:2264:1: rule__DeclaracaoGlobal__Group_1__1 : rule__DeclaracaoGlobal__Group_1__1__Impl rule__DeclaracaoGlobal__Group_1__2 ;
    public final void rule__DeclaracaoGlobal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2268:1: ( rule__DeclaracaoGlobal__Group_1__1__Impl rule__DeclaracaoGlobal__Group_1__2 )
            // InternalT5.g:2269:2: rule__DeclaracaoGlobal__Group_1__1__Impl rule__DeclaracaoGlobal__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__DeclaracaoGlobal__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__1"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__1__Impl"
    // InternalT5.g:2276:1: rule__DeclaracaoGlobal__Group_1__1__Impl : ( ( rule__DeclaracaoGlobal__NameAssignment_1_1 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2280:1: ( ( ( rule__DeclaracaoGlobal__NameAssignment_1_1 ) ) )
            // InternalT5.g:2281:1: ( ( rule__DeclaracaoGlobal__NameAssignment_1_1 ) )
            {
            // InternalT5.g:2281:1: ( ( rule__DeclaracaoGlobal__NameAssignment_1_1 ) )
            // InternalT5.g:2282:2: ( rule__DeclaracaoGlobal__NameAssignment_1_1 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getNameAssignment_1_1()); 
            // InternalT5.g:2283:2: ( rule__DeclaracaoGlobal__NameAssignment_1_1 )
            // InternalT5.g:2283:3: rule__DeclaracaoGlobal__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoGlobalAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__1__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__2"
    // InternalT5.g:2291:1: rule__DeclaracaoGlobal__Group_1__2 : rule__DeclaracaoGlobal__Group_1__2__Impl rule__DeclaracaoGlobal__Group_1__3 ;
    public final void rule__DeclaracaoGlobal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2295:1: ( rule__DeclaracaoGlobal__Group_1__2__Impl rule__DeclaracaoGlobal__Group_1__3 )
            // InternalT5.g:2296:2: rule__DeclaracaoGlobal__Group_1__2__Impl rule__DeclaracaoGlobal__Group_1__3
            {
            pushFollow(FOLLOW_17);
            rule__DeclaracaoGlobal__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__2"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__2__Impl"
    // InternalT5.g:2303:1: rule__DeclaracaoGlobal__Group_1__2__Impl : ( '(' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2307:1: ( ( '(' ) )
            // InternalT5.g:2308:1: ( '(' )
            {
            // InternalT5.g:2308:1: ( '(' )
            // InternalT5.g:2309:2: '('
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getLeftParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__2__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__3"
    // InternalT5.g:2318:1: rule__DeclaracaoGlobal__Group_1__3 : rule__DeclaracaoGlobal__Group_1__3__Impl rule__DeclaracaoGlobal__Group_1__4 ;
    public final void rule__DeclaracaoGlobal__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2322:1: ( rule__DeclaracaoGlobal__Group_1__3__Impl rule__DeclaracaoGlobal__Group_1__4 )
            // InternalT5.g:2323:2: rule__DeclaracaoGlobal__Group_1__3__Impl rule__DeclaracaoGlobal__Group_1__4
            {
            pushFollow(FOLLOW_17);
            rule__DeclaracaoGlobal__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__3"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__3__Impl"
    // InternalT5.g:2330:1: rule__DeclaracaoGlobal__Group_1__3__Impl : ( ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )? ) ;
    public final void rule__DeclaracaoGlobal__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2334:1: ( ( ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )? ) )
            // InternalT5.g:2335:1: ( ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )? )
            {
            // InternalT5.g:2335:1: ( ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )? )
            // InternalT5.g:2336:2: ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )?
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getParametrosAssignment_1_3()); 
            // InternalT5.g:2337:2: ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT5.g:2337:3: rule__DeclaracaoGlobal__ParametrosAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeclaracaoGlobal__ParametrosAssignment_1_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaracaoGlobalAccess().getParametrosAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__3__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__4"
    // InternalT5.g:2345:1: rule__DeclaracaoGlobal__Group_1__4 : rule__DeclaracaoGlobal__Group_1__4__Impl rule__DeclaracaoGlobal__Group_1__5 ;
    public final void rule__DeclaracaoGlobal__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2349:1: ( rule__DeclaracaoGlobal__Group_1__4__Impl rule__DeclaracaoGlobal__Group_1__5 )
            // InternalT5.g:2350:2: rule__DeclaracaoGlobal__Group_1__4__Impl rule__DeclaracaoGlobal__Group_1__5
            {
            pushFollow(FOLLOW_11);
            rule__DeclaracaoGlobal__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__4"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__4__Impl"
    // InternalT5.g:2357:1: rule__DeclaracaoGlobal__Group_1__4__Impl : ( ')' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2361:1: ( ( ')' ) )
            // InternalT5.g:2362:1: ( ')' )
            {
            // InternalT5.g:2362:1: ( ')' )
            // InternalT5.g:2363:2: ')'
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getRightParenthesisKeyword_1_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__4__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__5"
    // InternalT5.g:2372:1: rule__DeclaracaoGlobal__Group_1__5 : rule__DeclaracaoGlobal__Group_1__5__Impl rule__DeclaracaoGlobal__Group_1__6 ;
    public final void rule__DeclaracaoGlobal__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2376:1: ( rule__DeclaracaoGlobal__Group_1__5__Impl rule__DeclaracaoGlobal__Group_1__6 )
            // InternalT5.g:2377:2: rule__DeclaracaoGlobal__Group_1__5__Impl rule__DeclaracaoGlobal__Group_1__6
            {
            pushFollow(FOLLOW_15);
            rule__DeclaracaoGlobal__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__5"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__5__Impl"
    // InternalT5.g:2384:1: rule__DeclaracaoGlobal__Group_1__5__Impl : ( ':' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2388:1: ( ( ':' ) )
            // InternalT5.g:2389:1: ( ':' )
            {
            // InternalT5.g:2389:1: ( ':' )
            // InternalT5.g:2390:2: ':'
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getColonKeyword_1_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getColonKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__5__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__6"
    // InternalT5.g:2399:1: rule__DeclaracaoGlobal__Group_1__6 : rule__DeclaracaoGlobal__Group_1__6__Impl rule__DeclaracaoGlobal__Group_1__7 ;
    public final void rule__DeclaracaoGlobal__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2403:1: ( rule__DeclaracaoGlobal__Group_1__6__Impl rule__DeclaracaoGlobal__Group_1__7 )
            // InternalT5.g:2404:2: rule__DeclaracaoGlobal__Group_1__6__Impl rule__DeclaracaoGlobal__Group_1__7
            {
            pushFollow(FOLLOW_6);
            rule__DeclaracaoGlobal__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__6"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__6__Impl"
    // InternalT5.g:2411:1: rule__DeclaracaoGlobal__Group_1__6__Impl : ( ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2415:1: ( ( ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 ) ) )
            // InternalT5.g:2416:1: ( ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 ) )
            {
            // InternalT5.g:2416:1: ( ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 ) )
            // InternalT5.g:2417:2: ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getTipoRetornoAssignment_1_6()); 
            // InternalT5.g:2418:2: ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 )
            // InternalT5.g:2418:3: rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoGlobalAccess().getTipoRetornoAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__6__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__7"
    // InternalT5.g:2426:1: rule__DeclaracaoGlobal__Group_1__7 : rule__DeclaracaoGlobal__Group_1__7__Impl rule__DeclaracaoGlobal__Group_1__8 ;
    public final void rule__DeclaracaoGlobal__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2430:1: ( rule__DeclaracaoGlobal__Group_1__7__Impl rule__DeclaracaoGlobal__Group_1__8 )
            // InternalT5.g:2431:2: rule__DeclaracaoGlobal__Group_1__7__Impl rule__DeclaracaoGlobal__Group_1__8
            {
            pushFollow(FOLLOW_19);
            rule__DeclaracaoGlobal__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__7"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__7__Impl"
    // InternalT5.g:2438:1: rule__DeclaracaoGlobal__Group_1__7__Impl : ( ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2442:1: ( ( ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 ) ) )
            // InternalT5.g:2443:1: ( ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 ) )
            {
            // InternalT5.g:2443:1: ( ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 ) )
            // InternalT5.g:2444:2: ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getCorpoAssignment_1_7()); 
            // InternalT5.g:2445:2: ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 )
            // InternalT5.g:2445:3: rule__DeclaracaoGlobal__CorpoAssignment_1_7
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__CorpoAssignment_1_7();

            state._fsp--;


            }

             after(grammarAccess.getDeclaracaoGlobalAccess().getCorpoAssignment_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__7__Impl"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__8"
    // InternalT5.g:2453:1: rule__DeclaracaoGlobal__Group_1__8 : rule__DeclaracaoGlobal__Group_1__8__Impl ;
    public final void rule__DeclaracaoGlobal__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2457:1: ( rule__DeclaracaoGlobal__Group_1__8__Impl )
            // InternalT5.g:2458:2: rule__DeclaracaoGlobal__Group_1__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaracaoGlobal__Group_1__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__8"


    // $ANTLR start "rule__DeclaracaoGlobal__Group_1__8__Impl"
    // InternalT5.g:2464:1: rule__DeclaracaoGlobal__Group_1__8__Impl : ( 'fim_funcao' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2468:1: ( ( 'fim_funcao' ) )
            // InternalT5.g:2469:1: ( 'fim_funcao' )
            {
            // InternalT5.g:2469:1: ( 'fim_funcao' )
            // InternalT5.g:2470:2: 'fim_funcao'
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getFim_funcaoKeyword_1_8()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getFim_funcaoKeyword_1_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__Group_1__8__Impl"


    // $ANTLR start "rule__Variavel__Group__0"
    // InternalT5.g:2480:1: rule__Variavel__Group__0 : rule__Variavel__Group__0__Impl rule__Variavel__Group__1 ;
    public final void rule__Variavel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2484:1: ( rule__Variavel__Group__0__Impl rule__Variavel__Group__1 )
            // InternalT5.g:2485:2: rule__Variavel__Group__0__Impl rule__Variavel__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Variavel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variavel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__0"


    // $ANTLR start "rule__Variavel__Group__0__Impl"
    // InternalT5.g:2492:1: rule__Variavel__Group__0__Impl : ( ( rule__Variavel__IdAssignment_0 ) ) ;
    public final void rule__Variavel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2496:1: ( ( ( rule__Variavel__IdAssignment_0 ) ) )
            // InternalT5.g:2497:1: ( ( rule__Variavel__IdAssignment_0 ) )
            {
            // InternalT5.g:2497:1: ( ( rule__Variavel__IdAssignment_0 ) )
            // InternalT5.g:2498:2: ( rule__Variavel__IdAssignment_0 )
            {
             before(grammarAccess.getVariavelAccess().getIdAssignment_0()); 
            // InternalT5.g:2499:2: ( rule__Variavel__IdAssignment_0 )
            // InternalT5.g:2499:3: rule__Variavel__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__0__Impl"


    // $ANTLR start "rule__Variavel__Group__1"
    // InternalT5.g:2507:1: rule__Variavel__Group__1 : rule__Variavel__Group__1__Impl rule__Variavel__Group__2 ;
    public final void rule__Variavel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2511:1: ( rule__Variavel__Group__1__Impl rule__Variavel__Group__2 )
            // InternalT5.g:2512:2: rule__Variavel__Group__1__Impl rule__Variavel__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Variavel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variavel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__1"


    // $ANTLR start "rule__Variavel__Group__1__Impl"
    // InternalT5.g:2519:1: rule__Variavel__Group__1__Impl : ( ':' ) ;
    public final void rule__Variavel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2523:1: ( ( ':' ) )
            // InternalT5.g:2524:1: ( ':' )
            {
            // InternalT5.g:2524:1: ( ':' )
            // InternalT5.g:2525:2: ':'
            {
             before(grammarAccess.getVariavelAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariavelAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__1__Impl"


    // $ANTLR start "rule__Variavel__Group__2"
    // InternalT5.g:2534:1: rule__Variavel__Group__2 : rule__Variavel__Group__2__Impl ;
    public final void rule__Variavel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2538:1: ( rule__Variavel__Group__2__Impl )
            // InternalT5.g:2539:2: rule__Variavel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__2"


    // $ANTLR start "rule__Variavel__Group__2__Impl"
    // InternalT5.g:2545:1: rule__Variavel__Group__2__Impl : ( ( rule__Variavel__TipoVarAssignment_2 ) ) ;
    public final void rule__Variavel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2549:1: ( ( ( rule__Variavel__TipoVarAssignment_2 ) ) )
            // InternalT5.g:2550:1: ( ( rule__Variavel__TipoVarAssignment_2 ) )
            {
            // InternalT5.g:2550:1: ( ( rule__Variavel__TipoVarAssignment_2 ) )
            // InternalT5.g:2551:2: ( rule__Variavel__TipoVarAssignment_2 )
            {
             before(grammarAccess.getVariavelAccess().getTipoVarAssignment_2()); 
            // InternalT5.g:2552:2: ( rule__Variavel__TipoVarAssignment_2 )
            // InternalT5.g:2552:3: rule__Variavel__TipoVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variavel__TipoVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariavelAccess().getTipoVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__Group__2__Impl"


    // $ANTLR start "rule__Identificador__Group__0"
    // InternalT5.g:2561:1: rule__Identificador__Group__0 : rule__Identificador__Group__0__Impl rule__Identificador__Group__1 ;
    public final void rule__Identificador__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2565:1: ( rule__Identificador__Group__0__Impl rule__Identificador__Group__1 )
            // InternalT5.g:2566:2: rule__Identificador__Group__0__Impl rule__Identificador__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Identificador__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identificador__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group__0"


    // $ANTLR start "rule__Identificador__Group__0__Impl"
    // InternalT5.g:2573:1: rule__Identificador__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Identificador__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2577:1: ( ( RULE_ID ) )
            // InternalT5.g:2578:1: ( RULE_ID )
            {
            // InternalT5.g:2578:1: ( RULE_ID )
            // InternalT5.g:2579:2: RULE_ID
            {
             before(grammarAccess.getIdentificadorAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentificadorAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group__0__Impl"


    // $ANTLR start "rule__Identificador__Group__1"
    // InternalT5.g:2588:1: rule__Identificador__Group__1 : rule__Identificador__Group__1__Impl rule__Identificador__Group__2 ;
    public final void rule__Identificador__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2592:1: ( rule__Identificador__Group__1__Impl rule__Identificador__Group__2 )
            // InternalT5.g:2593:2: rule__Identificador__Group__1__Impl rule__Identificador__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Identificador__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identificador__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group__1"


    // $ANTLR start "rule__Identificador__Group__1__Impl"
    // InternalT5.g:2600:1: rule__Identificador__Group__1__Impl : ( ( rule__Identificador__Group_1__0 )* ) ;
    public final void rule__Identificador__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2604:1: ( ( ( rule__Identificador__Group_1__0 )* ) )
            // InternalT5.g:2605:1: ( ( rule__Identificador__Group_1__0 )* )
            {
            // InternalT5.g:2605:1: ( ( rule__Identificador__Group_1__0 )* )
            // InternalT5.g:2606:2: ( rule__Identificador__Group_1__0 )*
            {
             before(grammarAccess.getIdentificadorAccess().getGroup_1()); 
            // InternalT5.g:2607:2: ( rule__Identificador__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT5.g:2607:3: rule__Identificador__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Identificador__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getIdentificadorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group__1__Impl"


    // $ANTLR start "rule__Identificador__Group__2"
    // InternalT5.g:2615:1: rule__Identificador__Group__2 : rule__Identificador__Group__2__Impl ;
    public final void rule__Identificador__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2619:1: ( rule__Identificador__Group__2__Impl )
            // InternalT5.g:2620:2: rule__Identificador__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identificador__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group__2"


    // $ANTLR start "rule__Identificador__Group__2__Impl"
    // InternalT5.g:2626:1: rule__Identificador__Group__2__Impl : ( ( rule__Identificador__DimensoesAssignment_2 )* ) ;
    public final void rule__Identificador__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2630:1: ( ( ( rule__Identificador__DimensoesAssignment_2 )* ) )
            // InternalT5.g:2631:1: ( ( rule__Identificador__DimensoesAssignment_2 )* )
            {
            // InternalT5.g:2631:1: ( ( rule__Identificador__DimensoesAssignment_2 )* )
            // InternalT5.g:2632:2: ( rule__Identificador__DimensoesAssignment_2 )*
            {
             before(grammarAccess.getIdentificadorAccess().getDimensoesAssignment_2()); 
            // InternalT5.g:2633:2: ( rule__Identificador__DimensoesAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalT5.g:2633:3: rule__Identificador__DimensoesAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Identificador__DimensoesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getIdentificadorAccess().getDimensoesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group__2__Impl"


    // $ANTLR start "rule__Identificador__Group_1__0"
    // InternalT5.g:2642:1: rule__Identificador__Group_1__0 : rule__Identificador__Group_1__0__Impl rule__Identificador__Group_1__1 ;
    public final void rule__Identificador__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2646:1: ( rule__Identificador__Group_1__0__Impl rule__Identificador__Group_1__1 )
            // InternalT5.g:2647:2: rule__Identificador__Group_1__0__Impl rule__Identificador__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Identificador__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identificador__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group_1__0"


    // $ANTLR start "rule__Identificador__Group_1__0__Impl"
    // InternalT5.g:2654:1: rule__Identificador__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Identificador__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2658:1: ( ( '.' ) )
            // InternalT5.g:2659:1: ( '.' )
            {
            // InternalT5.g:2659:1: ( '.' )
            // InternalT5.g:2660:2: '.'
            {
             before(grammarAccess.getIdentificadorAccess().getFullStopKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIdentificadorAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group_1__0__Impl"


    // $ANTLR start "rule__Identificador__Group_1__1"
    // InternalT5.g:2669:1: rule__Identificador__Group_1__1 : rule__Identificador__Group_1__1__Impl ;
    public final void rule__Identificador__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2673:1: ( rule__Identificador__Group_1__1__Impl )
            // InternalT5.g:2674:2: rule__Identificador__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identificador__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group_1__1"


    // $ANTLR start "rule__Identificador__Group_1__1__Impl"
    // InternalT5.g:2680:1: rule__Identificador__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Identificador__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2684:1: ( ( RULE_ID ) )
            // InternalT5.g:2685:1: ( RULE_ID )
            {
            // InternalT5.g:2685:1: ( RULE_ID )
            // InternalT5.g:2686:2: RULE_ID
            {
             before(grammarAccess.getIdentificadorAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentificadorAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__Group_1__1__Impl"


    // $ANTLR start "rule__Dimensao__Group__0"
    // InternalT5.g:2696:1: rule__Dimensao__Group__0 : rule__Dimensao__Group__0__Impl rule__Dimensao__Group__1 ;
    public final void rule__Dimensao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2700:1: ( rule__Dimensao__Group__0__Impl rule__Dimensao__Group__1 )
            // InternalT5.g:2701:2: rule__Dimensao__Group__0__Impl rule__Dimensao__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Dimensao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimensao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimensao__Group__0"


    // $ANTLR start "rule__Dimensao__Group__0__Impl"
    // InternalT5.g:2708:1: rule__Dimensao__Group__0__Impl : ( '[' ) ;
    public final void rule__Dimensao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2712:1: ( ( '[' ) )
            // InternalT5.g:2713:1: ( '[' )
            {
            // InternalT5.g:2713:1: ( '[' )
            // InternalT5.g:2714:2: '['
            {
             before(grammarAccess.getDimensaoAccess().getLeftSquareBracketKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDimensaoAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimensao__Group__0__Impl"


    // $ANTLR start "rule__Dimensao__Group__1"
    // InternalT5.g:2723:1: rule__Dimensao__Group__1 : rule__Dimensao__Group__1__Impl rule__Dimensao__Group__2 ;
    public final void rule__Dimensao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2727:1: ( rule__Dimensao__Group__1__Impl rule__Dimensao__Group__2 )
            // InternalT5.g:2728:2: rule__Dimensao__Group__1__Impl rule__Dimensao__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Dimensao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimensao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimensao__Group__1"


    // $ANTLR start "rule__Dimensao__Group__1__Impl"
    // InternalT5.g:2735:1: rule__Dimensao__Group__1__Impl : ( ( rule__Dimensao__ExpAssignment_1 ) ) ;
    public final void rule__Dimensao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2739:1: ( ( ( rule__Dimensao__ExpAssignment_1 ) ) )
            // InternalT5.g:2740:1: ( ( rule__Dimensao__ExpAssignment_1 ) )
            {
            // InternalT5.g:2740:1: ( ( rule__Dimensao__ExpAssignment_1 ) )
            // InternalT5.g:2741:2: ( rule__Dimensao__ExpAssignment_1 )
            {
             before(grammarAccess.getDimensaoAccess().getExpAssignment_1()); 
            // InternalT5.g:2742:2: ( rule__Dimensao__ExpAssignment_1 )
            // InternalT5.g:2742:3: rule__Dimensao__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dimensao__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensaoAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimensao__Group__1__Impl"


    // $ANTLR start "rule__Dimensao__Group__2"
    // InternalT5.g:2750:1: rule__Dimensao__Group__2 : rule__Dimensao__Group__2__Impl ;
    public final void rule__Dimensao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2754:1: ( rule__Dimensao__Group__2__Impl )
            // InternalT5.g:2755:2: rule__Dimensao__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dimensao__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimensao__Group__2"


    // $ANTLR start "rule__Dimensao__Group__2__Impl"
    // InternalT5.g:2761:1: rule__Dimensao__Group__2__Impl : ( ']' ) ;
    public final void rule__Dimensao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2765:1: ( ( ']' ) )
            // InternalT5.g:2766:1: ( ']' )
            {
            // InternalT5.g:2766:1: ( ']' )
            // InternalT5.g:2767:2: ']'
            {
             before(grammarAccess.getDimensaoAccess().getRightSquareBracketKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDimensaoAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimensao__Group__2__Impl"


    // $ANTLR start "rule__Registro__Group__0"
    // InternalT5.g:2777:1: rule__Registro__Group__0 : rule__Registro__Group__0__Impl rule__Registro__Group__1 ;
    public final void rule__Registro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2781:1: ( rule__Registro__Group__0__Impl rule__Registro__Group__1 )
            // InternalT5.g:2782:2: rule__Registro__Group__0__Impl rule__Registro__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Registro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__0"


    // $ANTLR start "rule__Registro__Group__0__Impl"
    // InternalT5.g:2789:1: rule__Registro__Group__0__Impl : ( 'registro' ) ;
    public final void rule__Registro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2793:1: ( ( 'registro' ) )
            // InternalT5.g:2794:1: ( 'registro' )
            {
            // InternalT5.g:2794:1: ( 'registro' )
            // InternalT5.g:2795:2: 'registro'
            {
             before(grammarAccess.getRegistroAccess().getRegistroKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getRegistroKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__0__Impl"


    // $ANTLR start "rule__Registro__Group__1"
    // InternalT5.g:2804:1: rule__Registro__Group__1 : rule__Registro__Group__1__Impl rule__Registro__Group__2 ;
    public final void rule__Registro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2808:1: ( rule__Registro__Group__1__Impl rule__Registro__Group__2 )
            // InternalT5.g:2809:2: rule__Registro__Group__1__Impl rule__Registro__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Registro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registro__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__1"


    // $ANTLR start "rule__Registro__Group__1__Impl"
    // InternalT5.g:2816:1: rule__Registro__Group__1__Impl : ( ( rule__Registro__CamposAssignment_1 )* ) ;
    public final void rule__Registro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2820:1: ( ( ( rule__Registro__CamposAssignment_1 )* ) )
            // InternalT5.g:2821:1: ( ( rule__Registro__CamposAssignment_1 )* )
            {
            // InternalT5.g:2821:1: ( ( rule__Registro__CamposAssignment_1 )* )
            // InternalT5.g:2822:2: ( rule__Registro__CamposAssignment_1 )*
            {
             before(grammarAccess.getRegistroAccess().getCamposAssignment_1()); 
            // InternalT5.g:2823:2: ( rule__Registro__CamposAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT5.g:2823:3: rule__Registro__CamposAssignment_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Registro__CamposAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRegistroAccess().getCamposAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__1__Impl"


    // $ANTLR start "rule__Registro__Group__2"
    // InternalT5.g:2831:1: rule__Registro__Group__2 : rule__Registro__Group__2__Impl ;
    public final void rule__Registro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2835:1: ( rule__Registro__Group__2__Impl )
            // InternalT5.g:2836:2: rule__Registro__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Registro__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__2"


    // $ANTLR start "rule__Registro__Group__2__Impl"
    // InternalT5.g:2842:1: rule__Registro__Group__2__Impl : ( 'fim_registro' ) ;
    public final void rule__Registro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2846:1: ( ( 'fim_registro' ) )
            // InternalT5.g:2847:1: ( 'fim_registro' )
            {
            // InternalT5.g:2847:1: ( 'fim_registro' )
            // InternalT5.g:2848:2: 'fim_registro'
            {
             before(grammarAccess.getRegistroAccess().getFim_registroKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRegistroAccess().getFim_registroKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__Group__2__Impl"


    // $ANTLR start "rule__TipoEstendido__Group__0"
    // InternalT5.g:2858:1: rule__TipoEstendido__Group__0 : rule__TipoEstendido__Group__0__Impl rule__TipoEstendido__Group__1 ;
    public final void rule__TipoEstendido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2862:1: ( rule__TipoEstendido__Group__0__Impl rule__TipoEstendido__Group__1 )
            // InternalT5.g:2863:2: rule__TipoEstendido__Group__0__Impl rule__TipoEstendido__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__TipoEstendido__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TipoEstendido__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoEstendido__Group__0"


    // $ANTLR start "rule__TipoEstendido__Group__0__Impl"
    // InternalT5.g:2870:1: rule__TipoEstendido__Group__0__Impl : ( ( '^' )? ) ;
    public final void rule__TipoEstendido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2874:1: ( ( ( '^' )? ) )
            // InternalT5.g:2875:1: ( ( '^' )? )
            {
            // InternalT5.g:2875:1: ( ( '^' )? )
            // InternalT5.g:2876:2: ( '^' )?
            {
             before(grammarAccess.getTipoEstendidoAccess().getCircumflexAccentKeyword_0()); 
            // InternalT5.g:2877:2: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalT5.g:2877:3: '^'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTipoEstendidoAccess().getCircumflexAccentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoEstendido__Group__0__Impl"


    // $ANTLR start "rule__TipoEstendido__Group__1"
    // InternalT5.g:2885:1: rule__TipoEstendido__Group__1 : rule__TipoEstendido__Group__1__Impl ;
    public final void rule__TipoEstendido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2889:1: ( rule__TipoEstendido__Group__1__Impl )
            // InternalT5.g:2890:2: rule__TipoEstendido__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TipoEstendido__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoEstendido__Group__1"


    // $ANTLR start "rule__TipoEstendido__Group__1__Impl"
    // InternalT5.g:2896:1: rule__TipoEstendido__Group__1__Impl : ( ( rule__TipoEstendido__Alternatives_1 ) ) ;
    public final void rule__TipoEstendido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2900:1: ( ( ( rule__TipoEstendido__Alternatives_1 ) ) )
            // InternalT5.g:2901:1: ( ( rule__TipoEstendido__Alternatives_1 ) )
            {
            // InternalT5.g:2901:1: ( ( rule__TipoEstendido__Alternatives_1 ) )
            // InternalT5.g:2902:2: ( rule__TipoEstendido__Alternatives_1 )
            {
             before(grammarAccess.getTipoEstendidoAccess().getAlternatives_1()); 
            // InternalT5.g:2903:2: ( rule__TipoEstendido__Alternatives_1 )
            // InternalT5.g:2903:3: rule__TipoEstendido__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__TipoEstendido__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTipoEstendidoAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoEstendido__Group__1__Impl"


    // $ANTLR start "rule__Parametros__Group__0"
    // InternalT5.g:2912:1: rule__Parametros__Group__0 : rule__Parametros__Group__0__Impl rule__Parametros__Group__1 ;
    public final void rule__Parametros__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2916:1: ( rule__Parametros__Group__0__Impl rule__Parametros__Group__1 )
            // InternalT5.g:2917:2: rule__Parametros__Group__0__Impl rule__Parametros__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Parametros__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametros__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__Group__0"


    // $ANTLR start "rule__Parametros__Group__0__Impl"
    // InternalT5.g:2924:1: rule__Parametros__Group__0__Impl : ( ( rule__Parametros__ParametroAssignment_0 ) ) ;
    public final void rule__Parametros__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2928:1: ( ( ( rule__Parametros__ParametroAssignment_0 ) ) )
            // InternalT5.g:2929:1: ( ( rule__Parametros__ParametroAssignment_0 ) )
            {
            // InternalT5.g:2929:1: ( ( rule__Parametros__ParametroAssignment_0 ) )
            // InternalT5.g:2930:2: ( rule__Parametros__ParametroAssignment_0 )
            {
             before(grammarAccess.getParametrosAccess().getParametroAssignment_0()); 
            // InternalT5.g:2931:2: ( rule__Parametros__ParametroAssignment_0 )
            // InternalT5.g:2931:3: rule__Parametros__ParametroAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parametros__ParametroAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametrosAccess().getParametroAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__Group__0__Impl"


    // $ANTLR start "rule__Parametros__Group__1"
    // InternalT5.g:2939:1: rule__Parametros__Group__1 : rule__Parametros__Group__1__Impl ;
    public final void rule__Parametros__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2943:1: ( rule__Parametros__Group__1__Impl )
            // InternalT5.g:2944:2: rule__Parametros__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametros__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__Group__1"


    // $ANTLR start "rule__Parametros__Group__1__Impl"
    // InternalT5.g:2950:1: rule__Parametros__Group__1__Impl : ( ( rule__Parametros__Group_1__0 )* ) ;
    public final void rule__Parametros__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2954:1: ( ( ( rule__Parametros__Group_1__0 )* ) )
            // InternalT5.g:2955:1: ( ( rule__Parametros__Group_1__0 )* )
            {
            // InternalT5.g:2955:1: ( ( rule__Parametros__Group_1__0 )* )
            // InternalT5.g:2956:2: ( rule__Parametros__Group_1__0 )*
            {
             before(grammarAccess.getParametrosAccess().getGroup_1()); 
            // InternalT5.g:2957:2: ( rule__Parametros__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalT5.g:2957:3: rule__Parametros__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Parametros__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getParametrosAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__Group__1__Impl"


    // $ANTLR start "rule__Parametros__Group_1__0"
    // InternalT5.g:2966:1: rule__Parametros__Group_1__0 : rule__Parametros__Group_1__0__Impl rule__Parametros__Group_1__1 ;
    public final void rule__Parametros__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2970:1: ( rule__Parametros__Group_1__0__Impl rule__Parametros__Group_1__1 )
            // InternalT5.g:2971:2: rule__Parametros__Group_1__0__Impl rule__Parametros__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Parametros__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametros__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__Group_1__0"


    // $ANTLR start "rule__Parametros__Group_1__0__Impl"
    // InternalT5.g:2978:1: rule__Parametros__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parametros__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2982:1: ( ( ',' ) )
            // InternalT5.g:2983:1: ( ',' )
            {
            // InternalT5.g:2983:1: ( ',' )
            // InternalT5.g:2984:2: ','
            {
             before(grammarAccess.getParametrosAccess().getCommaKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParametrosAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__Group_1__0__Impl"


    // $ANTLR start "rule__Parametros__Group_1__1"
    // InternalT5.g:2993:1: rule__Parametros__Group_1__1 : rule__Parametros__Group_1__1__Impl ;
    public final void rule__Parametros__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2997:1: ( rule__Parametros__Group_1__1__Impl )
            // InternalT5.g:2998:2: rule__Parametros__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametros__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__Group_1__1"


    // $ANTLR start "rule__Parametros__Group_1__1__Impl"
    // InternalT5.g:3004:1: rule__Parametros__Group_1__1__Impl : ( ( rule__Parametros__ParametroAssignment_1_1 ) ) ;
    public final void rule__Parametros__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3008:1: ( ( ( rule__Parametros__ParametroAssignment_1_1 ) ) )
            // InternalT5.g:3009:1: ( ( rule__Parametros__ParametroAssignment_1_1 ) )
            {
            // InternalT5.g:3009:1: ( ( rule__Parametros__ParametroAssignment_1_1 ) )
            // InternalT5.g:3010:2: ( rule__Parametros__ParametroAssignment_1_1 )
            {
             before(grammarAccess.getParametrosAccess().getParametroAssignment_1_1()); 
            // InternalT5.g:3011:2: ( rule__Parametros__ParametroAssignment_1_1 )
            // InternalT5.g:3011:3: rule__Parametros__ParametroAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Parametros__ParametroAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParametrosAccess().getParametroAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__Group_1__1__Impl"


    // $ANTLR start "rule__Parametro__Group__0"
    // InternalT5.g:3020:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3024:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalT5.g:3025:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Parametro__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0"


    // $ANTLR start "rule__Parametro__Group__0__Impl"
    // InternalT5.g:3032:1: rule__Parametro__Group__0__Impl : ( ( 'var' )? ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3036:1: ( ( ( 'var' )? ) )
            // InternalT5.g:3037:1: ( ( 'var' )? )
            {
            // InternalT5.g:3037:1: ( ( 'var' )? )
            // InternalT5.g:3038:2: ( 'var' )?
            {
             before(grammarAccess.getParametroAccess().getVarKeyword_0()); 
            // InternalT5.g:3039:2: ( 'var' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalT5.g:3039:3: 'var'
                    {
                    match(input,50,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParametroAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__0__Impl"


    // $ANTLR start "rule__Parametro__Group__1"
    // InternalT5.g:3047:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl rule__Parametro__Group__2 ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3051:1: ( rule__Parametro__Group__1__Impl rule__Parametro__Group__2 )
            // InternalT5.g:3052:2: rule__Parametro__Group__1__Impl rule__Parametro__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Parametro__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1"


    // $ANTLR start "rule__Parametro__Group__1__Impl"
    // InternalT5.g:3059:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__IdsAssignment_1 ) ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3063:1: ( ( ( rule__Parametro__IdsAssignment_1 ) ) )
            // InternalT5.g:3064:1: ( ( rule__Parametro__IdsAssignment_1 ) )
            {
            // InternalT5.g:3064:1: ( ( rule__Parametro__IdsAssignment_1 ) )
            // InternalT5.g:3065:2: ( rule__Parametro__IdsAssignment_1 )
            {
             before(grammarAccess.getParametroAccess().getIdsAssignment_1()); 
            // InternalT5.g:3066:2: ( rule__Parametro__IdsAssignment_1 )
            // InternalT5.g:3066:3: rule__Parametro__IdsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__IdsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getIdsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__1__Impl"


    // $ANTLR start "rule__Parametro__Group__2"
    // InternalT5.g:3074:1: rule__Parametro__Group__2 : rule__Parametro__Group__2__Impl rule__Parametro__Group__3 ;
    public final void rule__Parametro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3078:1: ( rule__Parametro__Group__2__Impl rule__Parametro__Group__3 )
            // InternalT5.g:3079:2: rule__Parametro__Group__2__Impl rule__Parametro__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Parametro__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__2"


    // $ANTLR start "rule__Parametro__Group__2__Impl"
    // InternalT5.g:3086:1: rule__Parametro__Group__2__Impl : ( ( rule__Parametro__Group_2__0 )* ) ;
    public final void rule__Parametro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3090:1: ( ( ( rule__Parametro__Group_2__0 )* ) )
            // InternalT5.g:3091:1: ( ( rule__Parametro__Group_2__0 )* )
            {
            // InternalT5.g:3091:1: ( ( rule__Parametro__Group_2__0 )* )
            // InternalT5.g:3092:2: ( rule__Parametro__Group_2__0 )*
            {
             before(grammarAccess.getParametroAccess().getGroup_2()); 
            // InternalT5.g:3093:2: ( rule__Parametro__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalT5.g:3093:3: rule__Parametro__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Parametro__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getParametroAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__2__Impl"


    // $ANTLR start "rule__Parametro__Group__3"
    // InternalT5.g:3101:1: rule__Parametro__Group__3 : rule__Parametro__Group__3__Impl rule__Parametro__Group__4 ;
    public final void rule__Parametro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3105:1: ( rule__Parametro__Group__3__Impl rule__Parametro__Group__4 )
            // InternalT5.g:3106:2: rule__Parametro__Group__3__Impl rule__Parametro__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Parametro__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__3"


    // $ANTLR start "rule__Parametro__Group__3__Impl"
    // InternalT5.g:3113:1: rule__Parametro__Group__3__Impl : ( ':' ) ;
    public final void rule__Parametro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3117:1: ( ( ':' ) )
            // InternalT5.g:3118:1: ( ':' )
            {
            // InternalT5.g:3118:1: ( ':' )
            // InternalT5.g:3119:2: ':'
            {
             before(grammarAccess.getParametroAccess().getColonKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__3__Impl"


    // $ANTLR start "rule__Parametro__Group__4"
    // InternalT5.g:3128:1: rule__Parametro__Group__4 : rule__Parametro__Group__4__Impl ;
    public final void rule__Parametro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3132:1: ( rule__Parametro__Group__4__Impl )
            // InternalT5.g:3133:2: rule__Parametro__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__4"


    // $ANTLR start "rule__Parametro__Group__4__Impl"
    // InternalT5.g:3139:1: rule__Parametro__Group__4__Impl : ( ( rule__Parametro__TipoParamAssignment_4 ) ) ;
    public final void rule__Parametro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3143:1: ( ( ( rule__Parametro__TipoParamAssignment_4 ) ) )
            // InternalT5.g:3144:1: ( ( rule__Parametro__TipoParamAssignment_4 ) )
            {
            // InternalT5.g:3144:1: ( ( rule__Parametro__TipoParamAssignment_4 ) )
            // InternalT5.g:3145:2: ( rule__Parametro__TipoParamAssignment_4 )
            {
             before(grammarAccess.getParametroAccess().getTipoParamAssignment_4()); 
            // InternalT5.g:3146:2: ( rule__Parametro__TipoParamAssignment_4 )
            // InternalT5.g:3146:3: rule__Parametro__TipoParamAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__TipoParamAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getTipoParamAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group__4__Impl"


    // $ANTLR start "rule__Parametro__Group_2__0"
    // InternalT5.g:3155:1: rule__Parametro__Group_2__0 : rule__Parametro__Group_2__0__Impl rule__Parametro__Group_2__1 ;
    public final void rule__Parametro__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3159:1: ( rule__Parametro__Group_2__0__Impl rule__Parametro__Group_2__1 )
            // InternalT5.g:3160:2: rule__Parametro__Group_2__0__Impl rule__Parametro__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Parametro__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parametro__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_2__0"


    // $ANTLR start "rule__Parametro__Group_2__0__Impl"
    // InternalT5.g:3167:1: rule__Parametro__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Parametro__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3171:1: ( ( ',' ) )
            // InternalT5.g:3172:1: ( ',' )
            {
            // InternalT5.g:3172:1: ( ',' )
            // InternalT5.g:3173:2: ','
            {
             before(grammarAccess.getParametroAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParametroAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_2__0__Impl"


    // $ANTLR start "rule__Parametro__Group_2__1"
    // InternalT5.g:3182:1: rule__Parametro__Group_2__1 : rule__Parametro__Group_2__1__Impl ;
    public final void rule__Parametro__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3186:1: ( rule__Parametro__Group_2__1__Impl )
            // InternalT5.g:3187:2: rule__Parametro__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_2__1"


    // $ANTLR start "rule__Parametro__Group_2__1__Impl"
    // InternalT5.g:3193:1: rule__Parametro__Group_2__1__Impl : ( ( rule__Parametro__IdsAssignment_2_1 ) ) ;
    public final void rule__Parametro__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3197:1: ( ( ( rule__Parametro__IdsAssignment_2_1 ) ) )
            // InternalT5.g:3198:1: ( ( rule__Parametro__IdsAssignment_2_1 ) )
            {
            // InternalT5.g:3198:1: ( ( rule__Parametro__IdsAssignment_2_1 ) )
            // InternalT5.g:3199:2: ( rule__Parametro__IdsAssignment_2_1 )
            {
             before(grammarAccess.getParametroAccess().getIdsAssignment_2_1()); 
            // InternalT5.g:3200:2: ( rule__Parametro__IdsAssignment_2_1 )
            // InternalT5.g:3200:3: rule__Parametro__IdsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__IdsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getIdsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Group_2__1__Impl"


    // $ANTLR start "rule__Corpo__Group__0"
    // InternalT5.g:3209:1: rule__Corpo__Group__0 : rule__Corpo__Group__0__Impl rule__Corpo__Group__1 ;
    public final void rule__Corpo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3213:1: ( rule__Corpo__Group__0__Impl rule__Corpo__Group__1 )
            // InternalT5.g:3214:2: rule__Corpo__Group__0__Impl rule__Corpo__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Corpo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Corpo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corpo__Group__0"


    // $ANTLR start "rule__Corpo__Group__0__Impl"
    // InternalT5.g:3221:1: rule__Corpo__Group__0__Impl : ( ( rule__Corpo__LocaisAssignment_0 )* ) ;
    public final void rule__Corpo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3225:1: ( ( ( rule__Corpo__LocaisAssignment_0 )* ) )
            // InternalT5.g:3226:1: ( ( rule__Corpo__LocaisAssignment_0 )* )
            {
            // InternalT5.g:3226:1: ( ( rule__Corpo__LocaisAssignment_0 )* )
            // InternalT5.g:3227:2: ( rule__Corpo__LocaisAssignment_0 )*
            {
             before(grammarAccess.getCorpoAccess().getLocaisAssignment_0()); 
            // InternalT5.g:3228:2: ( rule__Corpo__LocaisAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33||LA25_0==35||LA25_0==37) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalT5.g:3228:3: rule__Corpo__LocaisAssignment_0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Corpo__LocaisAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCorpoAccess().getLocaisAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corpo__Group__0__Impl"


    // $ANTLR start "rule__Corpo__Group__1"
    // InternalT5.g:3236:1: rule__Corpo__Group__1 : rule__Corpo__Group__1__Impl ;
    public final void rule__Corpo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3240:1: ( rule__Corpo__Group__1__Impl )
            // InternalT5.g:3241:2: rule__Corpo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Corpo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corpo__Group__1"


    // $ANTLR start "rule__Corpo__Group__1__Impl"
    // InternalT5.g:3247:1: rule__Corpo__Group__1__Impl : ( ( rule__Corpo__ComandosAssignment_1 )* ) ;
    public final void rule__Corpo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3251:1: ( ( ( rule__Corpo__ComandosAssignment_1 )* ) )
            // InternalT5.g:3252:1: ( ( rule__Corpo__ComandosAssignment_1 )* )
            {
            // InternalT5.g:3252:1: ( ( rule__Corpo__ComandosAssignment_1 )* )
            // InternalT5.g:3253:2: ( rule__Corpo__ComandosAssignment_1 )*
            {
             before(grammarAccess.getCorpoAccess().getComandosAssignment_1()); 
            // InternalT5.g:3254:2: ( rule__Corpo__ComandosAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==49||(LA26_0>=51 && LA26_0<=53)||LA26_0==57||LA26_0==60||LA26_0==63||LA26_0==65||LA26_0==67) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalT5.g:3254:3: rule__Corpo__ComandosAssignment_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Corpo__ComandosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCorpoAccess().getComandosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corpo__Group__1__Impl"


    // $ANTLR start "rule__ComandoLeia__Group__0"
    // InternalT5.g:3263:1: rule__ComandoLeia__Group__0 : rule__ComandoLeia__Group__0__Impl rule__ComandoLeia__Group__1 ;
    public final void rule__ComandoLeia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3267:1: ( rule__ComandoLeia__Group__0__Impl rule__ComandoLeia__Group__1 )
            // InternalT5.g:3268:2: rule__ComandoLeia__Group__0__Impl rule__ComandoLeia__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ComandoLeia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__0"


    // $ANTLR start "rule__ComandoLeia__Group__0__Impl"
    // InternalT5.g:3275:1: rule__ComandoLeia__Group__0__Impl : ( 'leia' ) ;
    public final void rule__ComandoLeia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3279:1: ( ( 'leia' ) )
            // InternalT5.g:3280:1: ( 'leia' )
            {
            // InternalT5.g:3280:1: ( 'leia' )
            // InternalT5.g:3281:2: 'leia'
            {
             before(grammarAccess.getComandoLeiaAccess().getLeiaKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getComandoLeiaAccess().getLeiaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__0__Impl"


    // $ANTLR start "rule__ComandoLeia__Group__1"
    // InternalT5.g:3290:1: rule__ComandoLeia__Group__1 : rule__ComandoLeia__Group__1__Impl rule__ComandoLeia__Group__2 ;
    public final void rule__ComandoLeia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3294:1: ( rule__ComandoLeia__Group__1__Impl rule__ComandoLeia__Group__2 )
            // InternalT5.g:3295:2: rule__ComandoLeia__Group__1__Impl rule__ComandoLeia__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ComandoLeia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__1"


    // $ANTLR start "rule__ComandoLeia__Group__1__Impl"
    // InternalT5.g:3302:1: rule__ComandoLeia__Group__1__Impl : ( '(' ) ;
    public final void rule__ComandoLeia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3306:1: ( ( '(' ) )
            // InternalT5.g:3307:1: ( '(' )
            {
            // InternalT5.g:3307:1: ( '(' )
            // InternalT5.g:3308:2: '('
            {
             before(grammarAccess.getComandoLeiaAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComandoLeiaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__1__Impl"


    // $ANTLR start "rule__ComandoLeia__Group__2"
    // InternalT5.g:3317:1: rule__ComandoLeia__Group__2 : rule__ComandoLeia__Group__2__Impl rule__ComandoLeia__Group__3 ;
    public final void rule__ComandoLeia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3321:1: ( rule__ComandoLeia__Group__2__Impl rule__ComandoLeia__Group__3 )
            // InternalT5.g:3322:2: rule__ComandoLeia__Group__2__Impl rule__ComandoLeia__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ComandoLeia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__2"


    // $ANTLR start "rule__ComandoLeia__Group__2__Impl"
    // InternalT5.g:3329:1: rule__ComandoLeia__Group__2__Impl : ( ( '^' )? ) ;
    public final void rule__ComandoLeia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3333:1: ( ( ( '^' )? ) )
            // InternalT5.g:3334:1: ( ( '^' )? )
            {
            // InternalT5.g:3334:1: ( ( '^' )? )
            // InternalT5.g:3335:2: ( '^' )?
            {
             before(grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_2()); 
            // InternalT5.g:3336:2: ( '^' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalT5.g:3336:3: '^'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__2__Impl"


    // $ANTLR start "rule__ComandoLeia__Group__3"
    // InternalT5.g:3344:1: rule__ComandoLeia__Group__3 : rule__ComandoLeia__Group__3__Impl rule__ComandoLeia__Group__4 ;
    public final void rule__ComandoLeia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3348:1: ( rule__ComandoLeia__Group__3__Impl rule__ComandoLeia__Group__4 )
            // InternalT5.g:3349:2: rule__ComandoLeia__Group__3__Impl rule__ComandoLeia__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ComandoLeia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__3"


    // $ANTLR start "rule__ComandoLeia__Group__3__Impl"
    // InternalT5.g:3356:1: rule__ComandoLeia__Group__3__Impl : ( ( rule__ComandoLeia__AlvoAssignment_3 ) ) ;
    public final void rule__ComandoLeia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3360:1: ( ( ( rule__ComandoLeia__AlvoAssignment_3 ) ) )
            // InternalT5.g:3361:1: ( ( rule__ComandoLeia__AlvoAssignment_3 ) )
            {
            // InternalT5.g:3361:1: ( ( rule__ComandoLeia__AlvoAssignment_3 ) )
            // InternalT5.g:3362:2: ( rule__ComandoLeia__AlvoAssignment_3 )
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoAssignment_3()); 
            // InternalT5.g:3363:2: ( rule__ComandoLeia__AlvoAssignment_3 )
            // InternalT5.g:3363:3: rule__ComandoLeia__AlvoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComandoLeia__AlvoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComandoLeiaAccess().getAlvoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__3__Impl"


    // $ANTLR start "rule__ComandoLeia__Group__4"
    // InternalT5.g:3371:1: rule__ComandoLeia__Group__4 : rule__ComandoLeia__Group__4__Impl rule__ComandoLeia__Group__5 ;
    public final void rule__ComandoLeia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3375:1: ( rule__ComandoLeia__Group__4__Impl rule__ComandoLeia__Group__5 )
            // InternalT5.g:3376:2: rule__ComandoLeia__Group__4__Impl rule__ComandoLeia__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__ComandoLeia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__4"


    // $ANTLR start "rule__ComandoLeia__Group__4__Impl"
    // InternalT5.g:3383:1: rule__ComandoLeia__Group__4__Impl : ( ( rule__ComandoLeia__Group_4__0 )* ) ;
    public final void rule__ComandoLeia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3387:1: ( ( ( rule__ComandoLeia__Group_4__0 )* ) )
            // InternalT5.g:3388:1: ( ( rule__ComandoLeia__Group_4__0 )* )
            {
            // InternalT5.g:3388:1: ( ( rule__ComandoLeia__Group_4__0 )* )
            // InternalT5.g:3389:2: ( rule__ComandoLeia__Group_4__0 )*
            {
             before(grammarAccess.getComandoLeiaAccess().getGroup_4()); 
            // InternalT5.g:3390:2: ( rule__ComandoLeia__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==34) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalT5.g:3390:3: rule__ComandoLeia__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComandoLeia__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getComandoLeiaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__4__Impl"


    // $ANTLR start "rule__ComandoLeia__Group__5"
    // InternalT5.g:3398:1: rule__ComandoLeia__Group__5 : rule__ComandoLeia__Group__5__Impl ;
    public final void rule__ComandoLeia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3402:1: ( rule__ComandoLeia__Group__5__Impl )
            // InternalT5.g:3403:2: rule__ComandoLeia__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__5"


    // $ANTLR start "rule__ComandoLeia__Group__5__Impl"
    // InternalT5.g:3409:1: rule__ComandoLeia__Group__5__Impl : ( ')' ) ;
    public final void rule__ComandoLeia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3413:1: ( ( ')' ) )
            // InternalT5.g:3414:1: ( ')' )
            {
            // InternalT5.g:3414:1: ( ')' )
            // InternalT5.g:3415:2: ')'
            {
             before(grammarAccess.getComandoLeiaAccess().getRightParenthesisKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComandoLeiaAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group__5__Impl"


    // $ANTLR start "rule__ComandoLeia__Group_4__0"
    // InternalT5.g:3425:1: rule__ComandoLeia__Group_4__0 : rule__ComandoLeia__Group_4__0__Impl rule__ComandoLeia__Group_4__1 ;
    public final void rule__ComandoLeia__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3429:1: ( rule__ComandoLeia__Group_4__0__Impl rule__ComandoLeia__Group_4__1 )
            // InternalT5.g:3430:2: rule__ComandoLeia__Group_4__0__Impl rule__ComandoLeia__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__ComandoLeia__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group_4__0"


    // $ANTLR start "rule__ComandoLeia__Group_4__0__Impl"
    // InternalT5.g:3437:1: rule__ComandoLeia__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ComandoLeia__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3441:1: ( ( ',' ) )
            // InternalT5.g:3442:1: ( ',' )
            {
            // InternalT5.g:3442:1: ( ',' )
            // InternalT5.g:3443:2: ','
            {
             before(grammarAccess.getComandoLeiaAccess().getCommaKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComandoLeiaAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group_4__0__Impl"


    // $ANTLR start "rule__ComandoLeia__Group_4__1"
    // InternalT5.g:3452:1: rule__ComandoLeia__Group_4__1 : rule__ComandoLeia__Group_4__1__Impl rule__ComandoLeia__Group_4__2 ;
    public final void rule__ComandoLeia__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3456:1: ( rule__ComandoLeia__Group_4__1__Impl rule__ComandoLeia__Group_4__2 )
            // InternalT5.g:3457:2: rule__ComandoLeia__Group_4__1__Impl rule__ComandoLeia__Group_4__2
            {
            pushFollow(FOLLOW_31);
            rule__ComandoLeia__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group_4__1"


    // $ANTLR start "rule__ComandoLeia__Group_4__1__Impl"
    // InternalT5.g:3464:1: rule__ComandoLeia__Group_4__1__Impl : ( ( '^' )? ) ;
    public final void rule__ComandoLeia__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3468:1: ( ( ( '^' )? ) )
            // InternalT5.g:3469:1: ( ( '^' )? )
            {
            // InternalT5.g:3469:1: ( ( '^' )? )
            // InternalT5.g:3470:2: ( '^' )?
            {
             before(grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_4_1()); 
            // InternalT5.g:3471:2: ( '^' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalT5.g:3471:3: '^'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group_4__1__Impl"


    // $ANTLR start "rule__ComandoLeia__Group_4__2"
    // InternalT5.g:3479:1: rule__ComandoLeia__Group_4__2 : rule__ComandoLeia__Group_4__2__Impl ;
    public final void rule__ComandoLeia__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3483:1: ( rule__ComandoLeia__Group_4__2__Impl )
            // InternalT5.g:3484:2: rule__ComandoLeia__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoLeia__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group_4__2"


    // $ANTLR start "rule__ComandoLeia__Group_4__2__Impl"
    // InternalT5.g:3490:1: rule__ComandoLeia__Group_4__2__Impl : ( ( rule__ComandoLeia__AlvoAssignment_4_2 ) ) ;
    public final void rule__ComandoLeia__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3494:1: ( ( ( rule__ComandoLeia__AlvoAssignment_4_2 ) ) )
            // InternalT5.g:3495:1: ( ( rule__ComandoLeia__AlvoAssignment_4_2 ) )
            {
            // InternalT5.g:3495:1: ( ( rule__ComandoLeia__AlvoAssignment_4_2 ) )
            // InternalT5.g:3496:2: ( rule__ComandoLeia__AlvoAssignment_4_2 )
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoAssignment_4_2()); 
            // InternalT5.g:3497:2: ( rule__ComandoLeia__AlvoAssignment_4_2 )
            // InternalT5.g:3497:3: rule__ComandoLeia__AlvoAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ComandoLeia__AlvoAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComandoLeiaAccess().getAlvoAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__Group_4__2__Impl"


    // $ANTLR start "rule__ComandoEscreva__Group__0"
    // InternalT5.g:3506:1: rule__ComandoEscreva__Group__0 : rule__ComandoEscreva__Group__0__Impl rule__ComandoEscreva__Group__1 ;
    public final void rule__ComandoEscreva__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3510:1: ( rule__ComandoEscreva__Group__0__Impl rule__ComandoEscreva__Group__1 )
            // InternalT5.g:3511:2: rule__ComandoEscreva__Group__0__Impl rule__ComandoEscreva__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ComandoEscreva__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__0"


    // $ANTLR start "rule__ComandoEscreva__Group__0__Impl"
    // InternalT5.g:3518:1: rule__ComandoEscreva__Group__0__Impl : ( 'escreva' ) ;
    public final void rule__ComandoEscreva__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3522:1: ( ( 'escreva' ) )
            // InternalT5.g:3523:1: ( 'escreva' )
            {
            // InternalT5.g:3523:1: ( 'escreva' )
            // InternalT5.g:3524:2: 'escreva'
            {
             before(grammarAccess.getComandoEscrevaAccess().getEscrevaKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getComandoEscrevaAccess().getEscrevaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__0__Impl"


    // $ANTLR start "rule__ComandoEscreva__Group__1"
    // InternalT5.g:3533:1: rule__ComandoEscreva__Group__1 : rule__ComandoEscreva__Group__1__Impl rule__ComandoEscreva__Group__2 ;
    public final void rule__ComandoEscreva__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3537:1: ( rule__ComandoEscreva__Group__1__Impl rule__ComandoEscreva__Group__2 )
            // InternalT5.g:3538:2: rule__ComandoEscreva__Group__1__Impl rule__ComandoEscreva__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ComandoEscreva__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__1"


    // $ANTLR start "rule__ComandoEscreva__Group__1__Impl"
    // InternalT5.g:3545:1: rule__ComandoEscreva__Group__1__Impl : ( '(' ) ;
    public final void rule__ComandoEscreva__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3549:1: ( ( '(' ) )
            // InternalT5.g:3550:1: ( '(' )
            {
            // InternalT5.g:3550:1: ( '(' )
            // InternalT5.g:3551:2: '('
            {
             before(grammarAccess.getComandoEscrevaAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComandoEscrevaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__1__Impl"


    // $ANTLR start "rule__ComandoEscreva__Group__2"
    // InternalT5.g:3560:1: rule__ComandoEscreva__Group__2 : rule__ComandoEscreva__Group__2__Impl rule__ComandoEscreva__Group__3 ;
    public final void rule__ComandoEscreva__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3564:1: ( rule__ComandoEscreva__Group__2__Impl rule__ComandoEscreva__Group__3 )
            // InternalT5.g:3565:2: rule__ComandoEscreva__Group__2__Impl rule__ComandoEscreva__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ComandoEscreva__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__2"


    // $ANTLR start "rule__ComandoEscreva__Group__2__Impl"
    // InternalT5.g:3572:1: rule__ComandoEscreva__Group__2__Impl : ( ( rule__ComandoEscreva__ExpAssignment_2 ) ) ;
    public final void rule__ComandoEscreva__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3576:1: ( ( ( rule__ComandoEscreva__ExpAssignment_2 ) ) )
            // InternalT5.g:3577:1: ( ( rule__ComandoEscreva__ExpAssignment_2 ) )
            {
            // InternalT5.g:3577:1: ( ( rule__ComandoEscreva__ExpAssignment_2 ) )
            // InternalT5.g:3578:2: ( rule__ComandoEscreva__ExpAssignment_2 )
            {
             before(grammarAccess.getComandoEscrevaAccess().getExpAssignment_2()); 
            // InternalT5.g:3579:2: ( rule__ComandoEscreva__ExpAssignment_2 )
            // InternalT5.g:3579:3: rule__ComandoEscreva__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComandoEscrevaAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__2__Impl"


    // $ANTLR start "rule__ComandoEscreva__Group__3"
    // InternalT5.g:3587:1: rule__ComandoEscreva__Group__3 : rule__ComandoEscreva__Group__3__Impl rule__ComandoEscreva__Group__4 ;
    public final void rule__ComandoEscreva__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3591:1: ( rule__ComandoEscreva__Group__3__Impl rule__ComandoEscreva__Group__4 )
            // InternalT5.g:3592:2: rule__ComandoEscreva__Group__3__Impl rule__ComandoEscreva__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ComandoEscreva__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__3"


    // $ANTLR start "rule__ComandoEscreva__Group__3__Impl"
    // InternalT5.g:3599:1: rule__ComandoEscreva__Group__3__Impl : ( ( rule__ComandoEscreva__Group_3__0 )* ) ;
    public final void rule__ComandoEscreva__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3603:1: ( ( ( rule__ComandoEscreva__Group_3__0 )* ) )
            // InternalT5.g:3604:1: ( ( rule__ComandoEscreva__Group_3__0 )* )
            {
            // InternalT5.g:3604:1: ( ( rule__ComandoEscreva__Group_3__0 )* )
            // InternalT5.g:3605:2: ( rule__ComandoEscreva__Group_3__0 )*
            {
             before(grammarAccess.getComandoEscrevaAccess().getGroup_3()); 
            // InternalT5.g:3606:2: ( rule__ComandoEscreva__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalT5.g:3606:3: rule__ComandoEscreva__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComandoEscreva__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getComandoEscrevaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__3__Impl"


    // $ANTLR start "rule__ComandoEscreva__Group__4"
    // InternalT5.g:3614:1: rule__ComandoEscreva__Group__4 : rule__ComandoEscreva__Group__4__Impl ;
    public final void rule__ComandoEscreva__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3618:1: ( rule__ComandoEscreva__Group__4__Impl )
            // InternalT5.g:3619:2: rule__ComandoEscreva__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__4"


    // $ANTLR start "rule__ComandoEscreva__Group__4__Impl"
    // InternalT5.g:3625:1: rule__ComandoEscreva__Group__4__Impl : ( ')' ) ;
    public final void rule__ComandoEscreva__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3629:1: ( ( ')' ) )
            // InternalT5.g:3630:1: ( ')' )
            {
            // InternalT5.g:3630:1: ( ')' )
            // InternalT5.g:3631:2: ')'
            {
             before(grammarAccess.getComandoEscrevaAccess().getRightParenthesisKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComandoEscrevaAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group__4__Impl"


    // $ANTLR start "rule__ComandoEscreva__Group_3__0"
    // InternalT5.g:3641:1: rule__ComandoEscreva__Group_3__0 : rule__ComandoEscreva__Group_3__0__Impl rule__ComandoEscreva__Group_3__1 ;
    public final void rule__ComandoEscreva__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3645:1: ( rule__ComandoEscreva__Group_3__0__Impl rule__ComandoEscreva__Group_3__1 )
            // InternalT5.g:3646:2: rule__ComandoEscreva__Group_3__0__Impl rule__ComandoEscreva__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__ComandoEscreva__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group_3__0"


    // $ANTLR start "rule__ComandoEscreva__Group_3__0__Impl"
    // InternalT5.g:3653:1: rule__ComandoEscreva__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ComandoEscreva__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3657:1: ( ( ',' ) )
            // InternalT5.g:3658:1: ( ',' )
            {
            // InternalT5.g:3658:1: ( ',' )
            // InternalT5.g:3659:2: ','
            {
             before(grammarAccess.getComandoEscrevaAccess().getCommaKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComandoEscrevaAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group_3__0__Impl"


    // $ANTLR start "rule__ComandoEscreva__Group_3__1"
    // InternalT5.g:3668:1: rule__ComandoEscreva__Group_3__1 : rule__ComandoEscreva__Group_3__1__Impl ;
    public final void rule__ComandoEscreva__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3672:1: ( rule__ComandoEscreva__Group_3__1__Impl )
            // InternalT5.g:3673:2: rule__ComandoEscreva__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group_3__1"


    // $ANTLR start "rule__ComandoEscreva__Group_3__1__Impl"
    // InternalT5.g:3679:1: rule__ComandoEscreva__Group_3__1__Impl : ( ( rule__ComandoEscreva__ExpAssignment_3_1 ) ) ;
    public final void rule__ComandoEscreva__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3683:1: ( ( ( rule__ComandoEscreva__ExpAssignment_3_1 ) ) )
            // InternalT5.g:3684:1: ( ( rule__ComandoEscreva__ExpAssignment_3_1 ) )
            {
            // InternalT5.g:3684:1: ( ( rule__ComandoEscreva__ExpAssignment_3_1 ) )
            // InternalT5.g:3685:2: ( rule__ComandoEscreva__ExpAssignment_3_1 )
            {
             before(grammarAccess.getComandoEscrevaAccess().getExpAssignment_3_1()); 
            // InternalT5.g:3686:2: ( rule__ComandoEscreva__ExpAssignment_3_1 )
            // InternalT5.g:3686:3: rule__ComandoEscreva__ExpAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEscreva__ExpAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoEscrevaAccess().getExpAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__Group_3__1__Impl"


    // $ANTLR start "rule__ComandoSe__Group__0"
    // InternalT5.g:3695:1: rule__ComandoSe__Group__0 : rule__ComandoSe__Group__0__Impl rule__ComandoSe__Group__1 ;
    public final void rule__ComandoSe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3699:1: ( rule__ComandoSe__Group__0__Impl rule__ComandoSe__Group__1 )
            // InternalT5.g:3700:2: rule__ComandoSe__Group__0__Impl rule__ComandoSe__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ComandoSe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__0"


    // $ANTLR start "rule__ComandoSe__Group__0__Impl"
    // InternalT5.g:3707:1: rule__ComandoSe__Group__0__Impl : ( 'se' ) ;
    public final void rule__ComandoSe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3711:1: ( ( 'se' ) )
            // InternalT5.g:3712:1: ( 'se' )
            {
            // InternalT5.g:3712:1: ( 'se' )
            // InternalT5.g:3713:2: 'se'
            {
             before(grammarAccess.getComandoSeAccess().getSeKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getComandoSeAccess().getSeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__0__Impl"


    // $ANTLR start "rule__ComandoSe__Group__1"
    // InternalT5.g:3722:1: rule__ComandoSe__Group__1 : rule__ComandoSe__Group__1__Impl rule__ComandoSe__Group__2 ;
    public final void rule__ComandoSe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3726:1: ( rule__ComandoSe__Group__1__Impl rule__ComandoSe__Group__2 )
            // InternalT5.g:3727:2: rule__ComandoSe__Group__1__Impl rule__ComandoSe__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ComandoSe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__1"


    // $ANTLR start "rule__ComandoSe__Group__1__Impl"
    // InternalT5.g:3734:1: rule__ComandoSe__Group__1__Impl : ( ( rule__ComandoSe__CondAssignment_1 ) ) ;
    public final void rule__ComandoSe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3738:1: ( ( ( rule__ComandoSe__CondAssignment_1 ) ) )
            // InternalT5.g:3739:1: ( ( rule__ComandoSe__CondAssignment_1 ) )
            {
            // InternalT5.g:3739:1: ( ( rule__ComandoSe__CondAssignment_1 ) )
            // InternalT5.g:3740:2: ( rule__ComandoSe__CondAssignment_1 )
            {
             before(grammarAccess.getComandoSeAccess().getCondAssignment_1()); 
            // InternalT5.g:3741:2: ( rule__ComandoSe__CondAssignment_1 )
            // InternalT5.g:3741:3: rule__ComandoSe__CondAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSe__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoSeAccess().getCondAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__1__Impl"


    // $ANTLR start "rule__ComandoSe__Group__2"
    // InternalT5.g:3749:1: rule__ComandoSe__Group__2 : rule__ComandoSe__Group__2__Impl rule__ComandoSe__Group__3 ;
    public final void rule__ComandoSe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3753:1: ( rule__ComandoSe__Group__2__Impl rule__ComandoSe__Group__3 )
            // InternalT5.g:3754:2: rule__ComandoSe__Group__2__Impl rule__ComandoSe__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__ComandoSe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__2"


    // $ANTLR start "rule__ComandoSe__Group__2__Impl"
    // InternalT5.g:3761:1: rule__ComandoSe__Group__2__Impl : ( 'entao' ) ;
    public final void rule__ComandoSe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3765:1: ( ( 'entao' ) )
            // InternalT5.g:3766:1: ( 'entao' )
            {
            // InternalT5.g:3766:1: ( 'entao' )
            // InternalT5.g:3767:2: 'entao'
            {
             before(grammarAccess.getComandoSeAccess().getEntaoKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getComandoSeAccess().getEntaoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__2__Impl"


    // $ANTLR start "rule__ComandoSe__Group__3"
    // InternalT5.g:3776:1: rule__ComandoSe__Group__3 : rule__ComandoSe__Group__3__Impl rule__ComandoSe__Group__4 ;
    public final void rule__ComandoSe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3780:1: ( rule__ComandoSe__Group__3__Impl rule__ComandoSe__Group__4 )
            // InternalT5.g:3781:2: rule__ComandoSe__Group__3__Impl rule__ComandoSe__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ComandoSe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__3"


    // $ANTLR start "rule__ComandoSe__Group__3__Impl"
    // InternalT5.g:3788:1: rule__ComandoSe__Group__3__Impl : ( ( rule__ComandoSe__ComandosAssignment_3 )* ) ;
    public final void rule__ComandoSe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3792:1: ( ( ( rule__ComandoSe__ComandosAssignment_3 )* ) )
            // InternalT5.g:3793:1: ( ( rule__ComandoSe__ComandosAssignment_3 )* )
            {
            // InternalT5.g:3793:1: ( ( rule__ComandoSe__ComandosAssignment_3 )* )
            // InternalT5.g:3794:2: ( rule__ComandoSe__ComandosAssignment_3 )*
            {
             before(grammarAccess.getComandoSeAccess().getComandosAssignment_3()); 
            // InternalT5.g:3795:2: ( rule__ComandoSe__ComandosAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==49||(LA31_0>=51 && LA31_0<=53)||LA31_0==57||LA31_0==60||LA31_0==63||LA31_0==65||LA31_0==67) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalT5.g:3795:3: rule__ComandoSe__ComandosAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ComandoSe__ComandosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getComandoSeAccess().getComandosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__3__Impl"


    // $ANTLR start "rule__ComandoSe__Group__4"
    // InternalT5.g:3803:1: rule__ComandoSe__Group__4 : rule__ComandoSe__Group__4__Impl rule__ComandoSe__Group__5 ;
    public final void rule__ComandoSe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3807:1: ( rule__ComandoSe__Group__4__Impl rule__ComandoSe__Group__5 )
            // InternalT5.g:3808:2: rule__ComandoSe__Group__4__Impl rule__ComandoSe__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__ComandoSe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__4"


    // $ANTLR start "rule__ComandoSe__Group__4__Impl"
    // InternalT5.g:3815:1: rule__ComandoSe__Group__4__Impl : ( ( rule__ComandoSe__Group_4__0 )? ) ;
    public final void rule__ComandoSe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3819:1: ( ( ( rule__ComandoSe__Group_4__0 )? ) )
            // InternalT5.g:3820:1: ( ( rule__ComandoSe__Group_4__0 )? )
            {
            // InternalT5.g:3820:1: ( ( rule__ComandoSe__Group_4__0 )? )
            // InternalT5.g:3821:2: ( rule__ComandoSe__Group_4__0 )?
            {
             before(grammarAccess.getComandoSeAccess().getGroup_4()); 
            // InternalT5.g:3822:2: ( rule__ComandoSe__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==56) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalT5.g:3822:3: rule__ComandoSe__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoSe__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComandoSeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__4__Impl"


    // $ANTLR start "rule__ComandoSe__Group__5"
    // InternalT5.g:3830:1: rule__ComandoSe__Group__5 : rule__ComandoSe__Group__5__Impl ;
    public final void rule__ComandoSe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3834:1: ( rule__ComandoSe__Group__5__Impl )
            // InternalT5.g:3835:2: rule__ComandoSe__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__5"


    // $ANTLR start "rule__ComandoSe__Group__5__Impl"
    // InternalT5.g:3841:1: rule__ComandoSe__Group__5__Impl : ( 'fim_se' ) ;
    public final void rule__ComandoSe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3845:1: ( ( 'fim_se' ) )
            // InternalT5.g:3846:1: ( 'fim_se' )
            {
            // InternalT5.g:3846:1: ( 'fim_se' )
            // InternalT5.g:3847:2: 'fim_se'
            {
             before(grammarAccess.getComandoSeAccess().getFim_seKeyword_5()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getComandoSeAccess().getFim_seKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group__5__Impl"


    // $ANTLR start "rule__ComandoSe__Group_4__0"
    // InternalT5.g:3857:1: rule__ComandoSe__Group_4__0 : rule__ComandoSe__Group_4__0__Impl rule__ComandoSe__Group_4__1 ;
    public final void rule__ComandoSe__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3861:1: ( rule__ComandoSe__Group_4__0__Impl rule__ComandoSe__Group_4__1 )
            // InternalT5.g:3862:2: rule__ComandoSe__Group_4__0__Impl rule__ComandoSe__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__ComandoSe__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group_4__0"


    // $ANTLR start "rule__ComandoSe__Group_4__0__Impl"
    // InternalT5.g:3869:1: rule__ComandoSe__Group_4__0__Impl : ( 'senao' ) ;
    public final void rule__ComandoSe__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3873:1: ( ( 'senao' ) )
            // InternalT5.g:3874:1: ( 'senao' )
            {
            // InternalT5.g:3874:1: ( 'senao' )
            // InternalT5.g:3875:2: 'senao'
            {
             before(grammarAccess.getComandoSeAccess().getSenaoKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getComandoSeAccess().getSenaoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group_4__0__Impl"


    // $ANTLR start "rule__ComandoSe__Group_4__1"
    // InternalT5.g:3884:1: rule__ComandoSe__Group_4__1 : rule__ComandoSe__Group_4__1__Impl ;
    public final void rule__ComandoSe__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3888:1: ( rule__ComandoSe__Group_4__1__Impl )
            // InternalT5.g:3889:2: rule__ComandoSe__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoSe__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group_4__1"


    // $ANTLR start "rule__ComandoSe__Group_4__1__Impl"
    // InternalT5.g:3895:1: rule__ComandoSe__Group_4__1__Impl : ( ( rule__ComandoSe__ComandosElseAssignment_4_1 )* ) ;
    public final void rule__ComandoSe__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3899:1: ( ( ( rule__ComandoSe__ComandosElseAssignment_4_1 )* ) )
            // InternalT5.g:3900:1: ( ( rule__ComandoSe__ComandosElseAssignment_4_1 )* )
            {
            // InternalT5.g:3900:1: ( ( rule__ComandoSe__ComandosElseAssignment_4_1 )* )
            // InternalT5.g:3901:2: ( rule__ComandoSe__ComandosElseAssignment_4_1 )*
            {
             before(grammarAccess.getComandoSeAccess().getComandosElseAssignment_4_1()); 
            // InternalT5.g:3902:2: ( rule__ComandoSe__ComandosElseAssignment_4_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==49||(LA33_0>=51 && LA33_0<=53)||LA33_0==57||LA33_0==60||LA33_0==63||LA33_0==65||LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalT5.g:3902:3: rule__ComandoSe__ComandosElseAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ComandoSe__ComandosElseAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getComandoSeAccess().getComandosElseAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__Group_4__1__Impl"


    // $ANTLR start "rule__ComandoCaso__Group__0"
    // InternalT5.g:3911:1: rule__ComandoCaso__Group__0 : rule__ComandoCaso__Group__0__Impl rule__ComandoCaso__Group__1 ;
    public final void rule__ComandoCaso__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3915:1: ( rule__ComandoCaso__Group__0__Impl rule__ComandoCaso__Group__1 )
            // InternalT5.g:3916:2: rule__ComandoCaso__Group__0__Impl rule__ComandoCaso__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ComandoCaso__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__0"


    // $ANTLR start "rule__ComandoCaso__Group__0__Impl"
    // InternalT5.g:3923:1: rule__ComandoCaso__Group__0__Impl : ( 'caso' ) ;
    public final void rule__ComandoCaso__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3927:1: ( ( 'caso' ) )
            // InternalT5.g:3928:1: ( 'caso' )
            {
            // InternalT5.g:3928:1: ( 'caso' )
            // InternalT5.g:3929:2: 'caso'
            {
             before(grammarAccess.getComandoCasoAccess().getCasoKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getComandoCasoAccess().getCasoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__0__Impl"


    // $ANTLR start "rule__ComandoCaso__Group__1"
    // InternalT5.g:3938:1: rule__ComandoCaso__Group__1 : rule__ComandoCaso__Group__1__Impl rule__ComandoCaso__Group__2 ;
    public final void rule__ComandoCaso__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3942:1: ( rule__ComandoCaso__Group__1__Impl rule__ComandoCaso__Group__2 )
            // InternalT5.g:3943:2: rule__ComandoCaso__Group__1__Impl rule__ComandoCaso__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__ComandoCaso__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__1"


    // $ANTLR start "rule__ComandoCaso__Group__1__Impl"
    // InternalT5.g:3950:1: rule__ComandoCaso__Group__1__Impl : ( ( rule__ComandoCaso__ExpAssignment_1 ) ) ;
    public final void rule__ComandoCaso__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3954:1: ( ( ( rule__ComandoCaso__ExpAssignment_1 ) ) )
            // InternalT5.g:3955:1: ( ( rule__ComandoCaso__ExpAssignment_1 ) )
            {
            // InternalT5.g:3955:1: ( ( rule__ComandoCaso__ExpAssignment_1 ) )
            // InternalT5.g:3956:2: ( rule__ComandoCaso__ExpAssignment_1 )
            {
             before(grammarAccess.getComandoCasoAccess().getExpAssignment_1()); 
            // InternalT5.g:3957:2: ( rule__ComandoCaso__ExpAssignment_1 )
            // InternalT5.g:3957:3: rule__ComandoCaso__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCaso__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoCasoAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__1__Impl"


    // $ANTLR start "rule__ComandoCaso__Group__2"
    // InternalT5.g:3965:1: rule__ComandoCaso__Group__2 : rule__ComandoCaso__Group__2__Impl rule__ComandoCaso__Group__3 ;
    public final void rule__ComandoCaso__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3969:1: ( rule__ComandoCaso__Group__2__Impl rule__ComandoCaso__Group__3 )
            // InternalT5.g:3970:2: rule__ComandoCaso__Group__2__Impl rule__ComandoCaso__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__ComandoCaso__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__2"


    // $ANTLR start "rule__ComandoCaso__Group__2__Impl"
    // InternalT5.g:3977:1: rule__ComandoCaso__Group__2__Impl : ( 'seja' ) ;
    public final void rule__ComandoCaso__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3981:1: ( ( 'seja' ) )
            // InternalT5.g:3982:1: ( 'seja' )
            {
            // InternalT5.g:3982:1: ( 'seja' )
            // InternalT5.g:3983:2: 'seja'
            {
             before(grammarAccess.getComandoCasoAccess().getSejaKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getComandoCasoAccess().getSejaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__2__Impl"


    // $ANTLR start "rule__ComandoCaso__Group__3"
    // InternalT5.g:3992:1: rule__ComandoCaso__Group__3 : rule__ComandoCaso__Group__3__Impl rule__ComandoCaso__Group__4 ;
    public final void rule__ComandoCaso__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3996:1: ( rule__ComandoCaso__Group__3__Impl rule__ComandoCaso__Group__4 )
            // InternalT5.g:3997:2: rule__ComandoCaso__Group__3__Impl rule__ComandoCaso__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__ComandoCaso__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__3"


    // $ANTLR start "rule__ComandoCaso__Group__3__Impl"
    // InternalT5.g:4004:1: rule__ComandoCaso__Group__3__Impl : ( ( rule__ComandoCaso__SelecaoAssignment_3 )* ) ;
    public final void rule__ComandoCaso__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4008:1: ( ( ( rule__ComandoCaso__SelecaoAssignment_3 )* ) )
            // InternalT5.g:4009:1: ( ( rule__ComandoCaso__SelecaoAssignment_3 )* )
            {
            // InternalT5.g:4009:1: ( ( rule__ComandoCaso__SelecaoAssignment_3 )* )
            // InternalT5.g:4010:2: ( rule__ComandoCaso__SelecaoAssignment_3 )*
            {
             before(grammarAccess.getComandoCasoAccess().getSelecaoAssignment_3()); 
            // InternalT5.g:4011:2: ( rule__ComandoCaso__SelecaoAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==12) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalT5.g:4011:3: rule__ComandoCaso__SelecaoAssignment_3
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__ComandoCaso__SelecaoAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getComandoCasoAccess().getSelecaoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__3__Impl"


    // $ANTLR start "rule__ComandoCaso__Group__4"
    // InternalT5.g:4019:1: rule__ComandoCaso__Group__4 : rule__ComandoCaso__Group__4__Impl rule__ComandoCaso__Group__5 ;
    public final void rule__ComandoCaso__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4023:1: ( rule__ComandoCaso__Group__4__Impl rule__ComandoCaso__Group__5 )
            // InternalT5.g:4024:2: rule__ComandoCaso__Group__4__Impl rule__ComandoCaso__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__ComandoCaso__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__4"


    // $ANTLR start "rule__ComandoCaso__Group__4__Impl"
    // InternalT5.g:4031:1: rule__ComandoCaso__Group__4__Impl : ( ( rule__ComandoCaso__Group_4__0 )? ) ;
    public final void rule__ComandoCaso__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4035:1: ( ( ( rule__ComandoCaso__Group_4__0 )? ) )
            // InternalT5.g:4036:1: ( ( rule__ComandoCaso__Group_4__0 )? )
            {
            // InternalT5.g:4036:1: ( ( rule__ComandoCaso__Group_4__0 )? )
            // InternalT5.g:4037:2: ( rule__ComandoCaso__Group_4__0 )?
            {
             before(grammarAccess.getComandoCasoAccess().getGroup_4()); 
            // InternalT5.g:4038:2: ( rule__ComandoCaso__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalT5.g:4038:3: rule__ComandoCaso__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoCaso__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComandoCasoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__4__Impl"


    // $ANTLR start "rule__ComandoCaso__Group__5"
    // InternalT5.g:4046:1: rule__ComandoCaso__Group__5 : rule__ComandoCaso__Group__5__Impl ;
    public final void rule__ComandoCaso__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4050:1: ( rule__ComandoCaso__Group__5__Impl )
            // InternalT5.g:4051:2: rule__ComandoCaso__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__5"


    // $ANTLR start "rule__ComandoCaso__Group__5__Impl"
    // InternalT5.g:4057:1: rule__ComandoCaso__Group__5__Impl : ( 'fim_caso' ) ;
    public final void rule__ComandoCaso__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4061:1: ( ( 'fim_caso' ) )
            // InternalT5.g:4062:1: ( 'fim_caso' )
            {
            // InternalT5.g:4062:1: ( 'fim_caso' )
            // InternalT5.g:4063:2: 'fim_caso'
            {
             before(grammarAccess.getComandoCasoAccess().getFim_casoKeyword_5()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getComandoCasoAccess().getFim_casoKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group__5__Impl"


    // $ANTLR start "rule__ComandoCaso__Group_4__0"
    // InternalT5.g:4073:1: rule__ComandoCaso__Group_4__0 : rule__ComandoCaso__Group_4__0__Impl rule__ComandoCaso__Group_4__1 ;
    public final void rule__ComandoCaso__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4077:1: ( rule__ComandoCaso__Group_4__0__Impl rule__ComandoCaso__Group_4__1 )
            // InternalT5.g:4078:2: rule__ComandoCaso__Group_4__0__Impl rule__ComandoCaso__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__ComandoCaso__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group_4__0"


    // $ANTLR start "rule__ComandoCaso__Group_4__0__Impl"
    // InternalT5.g:4085:1: rule__ComandoCaso__Group_4__0__Impl : ( 'senao' ) ;
    public final void rule__ComandoCaso__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4089:1: ( ( 'senao' ) )
            // InternalT5.g:4090:1: ( 'senao' )
            {
            // InternalT5.g:4090:1: ( 'senao' )
            // InternalT5.g:4091:2: 'senao'
            {
             before(grammarAccess.getComandoCasoAccess().getSenaoKeyword_4_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getComandoCasoAccess().getSenaoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group_4__0__Impl"


    // $ANTLR start "rule__ComandoCaso__Group_4__1"
    // InternalT5.g:4100:1: rule__ComandoCaso__Group_4__1 : rule__ComandoCaso__Group_4__1__Impl ;
    public final void rule__ComandoCaso__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4104:1: ( rule__ComandoCaso__Group_4__1__Impl )
            // InternalT5.g:4105:2: rule__ComandoCaso__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoCaso__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group_4__1"


    // $ANTLR start "rule__ComandoCaso__Group_4__1__Impl"
    // InternalT5.g:4111:1: rule__ComandoCaso__Group_4__1__Impl : ( ( rule__ComandoCaso__ComandosElseAssignment_4_1 )* ) ;
    public final void rule__ComandoCaso__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4115:1: ( ( ( rule__ComandoCaso__ComandosElseAssignment_4_1 )* ) )
            // InternalT5.g:4116:1: ( ( rule__ComandoCaso__ComandosElseAssignment_4_1 )* )
            {
            // InternalT5.g:4116:1: ( ( rule__ComandoCaso__ComandosElseAssignment_4_1 )* )
            // InternalT5.g:4117:2: ( rule__ComandoCaso__ComandosElseAssignment_4_1 )*
            {
             before(grammarAccess.getComandoCasoAccess().getComandosElseAssignment_4_1()); 
            // InternalT5.g:4118:2: ( rule__ComandoCaso__ComandosElseAssignment_4_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==49||(LA36_0>=51 && LA36_0<=53)||LA36_0==57||LA36_0==60||LA36_0==63||LA36_0==65||LA36_0==67) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalT5.g:4118:3: rule__ComandoCaso__ComandosElseAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ComandoCaso__ComandosElseAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getComandoCasoAccess().getComandosElseAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__Group_4__1__Impl"


    // $ANTLR start "rule__ComandoPara__Group__0"
    // InternalT5.g:4127:1: rule__ComandoPara__Group__0 : rule__ComandoPara__Group__0__Impl rule__ComandoPara__Group__1 ;
    public final void rule__ComandoPara__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4131:1: ( rule__ComandoPara__Group__0__Impl rule__ComandoPara__Group__1 )
            // InternalT5.g:4132:2: rule__ComandoPara__Group__0__Impl rule__ComandoPara__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ComandoPara__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__0"


    // $ANTLR start "rule__ComandoPara__Group__0__Impl"
    // InternalT5.g:4139:1: rule__ComandoPara__Group__0__Impl : ( 'para' ) ;
    public final void rule__ComandoPara__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4143:1: ( ( 'para' ) )
            // InternalT5.g:4144:1: ( 'para' )
            {
            // InternalT5.g:4144:1: ( 'para' )
            // InternalT5.g:4145:2: 'para'
            {
             before(grammarAccess.getComandoParaAccess().getParaKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getComandoParaAccess().getParaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__0__Impl"


    // $ANTLR start "rule__ComandoPara__Group__1"
    // InternalT5.g:4154:1: rule__ComandoPara__Group__1 : rule__ComandoPara__Group__1__Impl rule__ComandoPara__Group__2 ;
    public final void rule__ComandoPara__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4158:1: ( rule__ComandoPara__Group__1__Impl rule__ComandoPara__Group__2 )
            // InternalT5.g:4159:2: rule__ComandoPara__Group__1__Impl rule__ComandoPara__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__ComandoPara__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__1"


    // $ANTLR start "rule__ComandoPara__Group__1__Impl"
    // InternalT5.g:4166:1: rule__ComandoPara__Group__1__Impl : ( ( rule__ComandoPara__VarAssignment_1 ) ) ;
    public final void rule__ComandoPara__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4170:1: ( ( ( rule__ComandoPara__VarAssignment_1 ) ) )
            // InternalT5.g:4171:1: ( ( rule__ComandoPara__VarAssignment_1 ) )
            {
            // InternalT5.g:4171:1: ( ( rule__ComandoPara__VarAssignment_1 ) )
            // InternalT5.g:4172:2: ( rule__ComandoPara__VarAssignment_1 )
            {
             before(grammarAccess.getComandoParaAccess().getVarAssignment_1()); 
            // InternalT5.g:4173:2: ( rule__ComandoPara__VarAssignment_1 )
            // InternalT5.g:4173:3: rule__ComandoPara__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoPara__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoParaAccess().getVarAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__1__Impl"


    // $ANTLR start "rule__ComandoPara__Group__2"
    // InternalT5.g:4181:1: rule__ComandoPara__Group__2 : rule__ComandoPara__Group__2__Impl rule__ComandoPara__Group__3 ;
    public final void rule__ComandoPara__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4185:1: ( rule__ComandoPara__Group__2__Impl rule__ComandoPara__Group__3 )
            // InternalT5.g:4186:2: rule__ComandoPara__Group__2__Impl rule__ComandoPara__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ComandoPara__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__2"


    // $ANTLR start "rule__ComandoPara__Group__2__Impl"
    // InternalT5.g:4193:1: rule__ComandoPara__Group__2__Impl : ( '<-' ) ;
    public final void rule__ComandoPara__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4197:1: ( ( '<-' ) )
            // InternalT5.g:4198:1: ( '<-' )
            {
            // InternalT5.g:4198:1: ( '<-' )
            // InternalT5.g:4199:2: '<-'
            {
             before(grammarAccess.getComandoParaAccess().getLessThanSignHyphenMinusKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getComandoParaAccess().getLessThanSignHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__2__Impl"


    // $ANTLR start "rule__ComandoPara__Group__3"
    // InternalT5.g:4208:1: rule__ComandoPara__Group__3 : rule__ComandoPara__Group__3__Impl rule__ComandoPara__Group__4 ;
    public final void rule__ComandoPara__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4212:1: ( rule__ComandoPara__Group__3__Impl rule__ComandoPara__Group__4 )
            // InternalT5.g:4213:2: rule__ComandoPara__Group__3__Impl rule__ComandoPara__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__ComandoPara__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__3"


    // $ANTLR start "rule__ComandoPara__Group__3__Impl"
    // InternalT5.g:4220:1: rule__ComandoPara__Group__3__Impl : ( ( rule__ComandoPara__InicioAssignment_3 ) ) ;
    public final void rule__ComandoPara__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4224:1: ( ( ( rule__ComandoPara__InicioAssignment_3 ) ) )
            // InternalT5.g:4225:1: ( ( rule__ComandoPara__InicioAssignment_3 ) )
            {
            // InternalT5.g:4225:1: ( ( rule__ComandoPara__InicioAssignment_3 ) )
            // InternalT5.g:4226:2: ( rule__ComandoPara__InicioAssignment_3 )
            {
             before(grammarAccess.getComandoParaAccess().getInicioAssignment_3()); 
            // InternalT5.g:4227:2: ( rule__ComandoPara__InicioAssignment_3 )
            // InternalT5.g:4227:3: rule__ComandoPara__InicioAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComandoPara__InicioAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComandoParaAccess().getInicioAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__3__Impl"


    // $ANTLR start "rule__ComandoPara__Group__4"
    // InternalT5.g:4235:1: rule__ComandoPara__Group__4 : rule__ComandoPara__Group__4__Impl rule__ComandoPara__Group__5 ;
    public final void rule__ComandoPara__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4239:1: ( rule__ComandoPara__Group__4__Impl rule__ComandoPara__Group__5 )
            // InternalT5.g:4240:2: rule__ComandoPara__Group__4__Impl rule__ComandoPara__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ComandoPara__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__4"


    // $ANTLR start "rule__ComandoPara__Group__4__Impl"
    // InternalT5.g:4247:1: rule__ComandoPara__Group__4__Impl : ( 'ate' ) ;
    public final void rule__ComandoPara__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4251:1: ( ( 'ate' ) )
            // InternalT5.g:4252:1: ( 'ate' )
            {
            // InternalT5.g:4252:1: ( 'ate' )
            // InternalT5.g:4253:2: 'ate'
            {
             before(grammarAccess.getComandoParaAccess().getAteKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getComandoParaAccess().getAteKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__4__Impl"


    // $ANTLR start "rule__ComandoPara__Group__5"
    // InternalT5.g:4262:1: rule__ComandoPara__Group__5 : rule__ComandoPara__Group__5__Impl rule__ComandoPara__Group__6 ;
    public final void rule__ComandoPara__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4266:1: ( rule__ComandoPara__Group__5__Impl rule__ComandoPara__Group__6 )
            // InternalT5.g:4267:2: rule__ComandoPara__Group__5__Impl rule__ComandoPara__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__ComandoPara__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__5"


    // $ANTLR start "rule__ComandoPara__Group__5__Impl"
    // InternalT5.g:4274:1: rule__ComandoPara__Group__5__Impl : ( ( rule__ComandoPara__FimAssignment_5 ) ) ;
    public final void rule__ComandoPara__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4278:1: ( ( ( rule__ComandoPara__FimAssignment_5 ) ) )
            // InternalT5.g:4279:1: ( ( rule__ComandoPara__FimAssignment_5 ) )
            {
            // InternalT5.g:4279:1: ( ( rule__ComandoPara__FimAssignment_5 ) )
            // InternalT5.g:4280:2: ( rule__ComandoPara__FimAssignment_5 )
            {
             before(grammarAccess.getComandoParaAccess().getFimAssignment_5()); 
            // InternalT5.g:4281:2: ( rule__ComandoPara__FimAssignment_5 )
            // InternalT5.g:4281:3: rule__ComandoPara__FimAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ComandoPara__FimAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComandoParaAccess().getFimAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__5__Impl"


    // $ANTLR start "rule__ComandoPara__Group__6"
    // InternalT5.g:4289:1: rule__ComandoPara__Group__6 : rule__ComandoPara__Group__6__Impl rule__ComandoPara__Group__7 ;
    public final void rule__ComandoPara__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4293:1: ( rule__ComandoPara__Group__6__Impl rule__ComandoPara__Group__7 )
            // InternalT5.g:4294:2: rule__ComandoPara__Group__6__Impl rule__ComandoPara__Group__7
            {
            pushFollow(FOLLOW_43);
            rule__ComandoPara__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__6"


    // $ANTLR start "rule__ComandoPara__Group__6__Impl"
    // InternalT5.g:4301:1: rule__ComandoPara__Group__6__Impl : ( 'faca' ) ;
    public final void rule__ComandoPara__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4305:1: ( ( 'faca' ) )
            // InternalT5.g:4306:1: ( 'faca' )
            {
            // InternalT5.g:4306:1: ( 'faca' )
            // InternalT5.g:4307:2: 'faca'
            {
             before(grammarAccess.getComandoParaAccess().getFacaKeyword_6()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getComandoParaAccess().getFacaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__6__Impl"


    // $ANTLR start "rule__ComandoPara__Group__7"
    // InternalT5.g:4316:1: rule__ComandoPara__Group__7 : rule__ComandoPara__Group__7__Impl rule__ComandoPara__Group__8 ;
    public final void rule__ComandoPara__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4320:1: ( rule__ComandoPara__Group__7__Impl rule__ComandoPara__Group__8 )
            // InternalT5.g:4321:2: rule__ComandoPara__Group__7__Impl rule__ComandoPara__Group__8
            {
            pushFollow(FOLLOW_43);
            rule__ComandoPara__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__7"


    // $ANTLR start "rule__ComandoPara__Group__7__Impl"
    // InternalT5.g:4328:1: rule__ComandoPara__Group__7__Impl : ( ( rule__ComandoPara__ComandosAssignment_7 )* ) ;
    public final void rule__ComandoPara__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4332:1: ( ( ( rule__ComandoPara__ComandosAssignment_7 )* ) )
            // InternalT5.g:4333:1: ( ( rule__ComandoPara__ComandosAssignment_7 )* )
            {
            // InternalT5.g:4333:1: ( ( rule__ComandoPara__ComandosAssignment_7 )* )
            // InternalT5.g:4334:2: ( rule__ComandoPara__ComandosAssignment_7 )*
            {
             before(grammarAccess.getComandoParaAccess().getComandosAssignment_7()); 
            // InternalT5.g:4335:2: ( rule__ComandoPara__ComandosAssignment_7 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==49||(LA37_0>=51 && LA37_0<=53)||LA37_0==57||LA37_0==60||LA37_0==63||LA37_0==65||LA37_0==67) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalT5.g:4335:3: rule__ComandoPara__ComandosAssignment_7
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ComandoPara__ComandosAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getComandoParaAccess().getComandosAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__7__Impl"


    // $ANTLR start "rule__ComandoPara__Group__8"
    // InternalT5.g:4343:1: rule__ComandoPara__Group__8 : rule__ComandoPara__Group__8__Impl ;
    public final void rule__ComandoPara__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4347:1: ( rule__ComandoPara__Group__8__Impl )
            // InternalT5.g:4348:2: rule__ComandoPara__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoPara__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__8"


    // $ANTLR start "rule__ComandoPara__Group__8__Impl"
    // InternalT5.g:4354:1: rule__ComandoPara__Group__8__Impl : ( 'fim_para' ) ;
    public final void rule__ComandoPara__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4358:1: ( ( 'fim_para' ) )
            // InternalT5.g:4359:1: ( 'fim_para' )
            {
            // InternalT5.g:4359:1: ( 'fim_para' )
            // InternalT5.g:4360:2: 'fim_para'
            {
             before(grammarAccess.getComandoParaAccess().getFim_paraKeyword_8()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getComandoParaAccess().getFim_paraKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__Group__8__Impl"


    // $ANTLR start "rule__ComandoEnquanto__Group__0"
    // InternalT5.g:4370:1: rule__ComandoEnquanto__Group__0 : rule__ComandoEnquanto__Group__0__Impl rule__ComandoEnquanto__Group__1 ;
    public final void rule__ComandoEnquanto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4374:1: ( rule__ComandoEnquanto__Group__0__Impl rule__ComandoEnquanto__Group__1 )
            // InternalT5.g:4375:2: rule__ComandoEnquanto__Group__0__Impl rule__ComandoEnquanto__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ComandoEnquanto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEnquanto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__0"


    // $ANTLR start "rule__ComandoEnquanto__Group__0__Impl"
    // InternalT5.g:4382:1: rule__ComandoEnquanto__Group__0__Impl : ( 'enquanto' ) ;
    public final void rule__ComandoEnquanto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4386:1: ( ( 'enquanto' ) )
            // InternalT5.g:4387:1: ( 'enquanto' )
            {
            // InternalT5.g:4387:1: ( 'enquanto' )
            // InternalT5.g:4388:2: 'enquanto'
            {
             before(grammarAccess.getComandoEnquantoAccess().getEnquantoKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getComandoEnquantoAccess().getEnquantoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__0__Impl"


    // $ANTLR start "rule__ComandoEnquanto__Group__1"
    // InternalT5.g:4397:1: rule__ComandoEnquanto__Group__1 : rule__ComandoEnquanto__Group__1__Impl rule__ComandoEnquanto__Group__2 ;
    public final void rule__ComandoEnquanto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4401:1: ( rule__ComandoEnquanto__Group__1__Impl rule__ComandoEnquanto__Group__2 )
            // InternalT5.g:4402:2: rule__ComandoEnquanto__Group__1__Impl rule__ComandoEnquanto__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__ComandoEnquanto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEnquanto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__1"


    // $ANTLR start "rule__ComandoEnquanto__Group__1__Impl"
    // InternalT5.g:4409:1: rule__ComandoEnquanto__Group__1__Impl : ( ( rule__ComandoEnquanto__CondAssignment_1 ) ) ;
    public final void rule__ComandoEnquanto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4413:1: ( ( ( rule__ComandoEnquanto__CondAssignment_1 ) ) )
            // InternalT5.g:4414:1: ( ( rule__ComandoEnquanto__CondAssignment_1 ) )
            {
            // InternalT5.g:4414:1: ( ( rule__ComandoEnquanto__CondAssignment_1 ) )
            // InternalT5.g:4415:2: ( rule__ComandoEnquanto__CondAssignment_1 )
            {
             before(grammarAccess.getComandoEnquantoAccess().getCondAssignment_1()); 
            // InternalT5.g:4416:2: ( rule__ComandoEnquanto__CondAssignment_1 )
            // InternalT5.g:4416:3: rule__ComandoEnquanto__CondAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEnquanto__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoEnquantoAccess().getCondAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__1__Impl"


    // $ANTLR start "rule__ComandoEnquanto__Group__2"
    // InternalT5.g:4424:1: rule__ComandoEnquanto__Group__2 : rule__ComandoEnquanto__Group__2__Impl rule__ComandoEnquanto__Group__3 ;
    public final void rule__ComandoEnquanto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4428:1: ( rule__ComandoEnquanto__Group__2__Impl rule__ComandoEnquanto__Group__3 )
            // InternalT5.g:4429:2: rule__ComandoEnquanto__Group__2__Impl rule__ComandoEnquanto__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ComandoEnquanto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEnquanto__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__2"


    // $ANTLR start "rule__ComandoEnquanto__Group__2__Impl"
    // InternalT5.g:4436:1: rule__ComandoEnquanto__Group__2__Impl : ( 'faca' ) ;
    public final void rule__ComandoEnquanto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4440:1: ( ( 'faca' ) )
            // InternalT5.g:4441:1: ( 'faca' )
            {
            // InternalT5.g:4441:1: ( 'faca' )
            // InternalT5.g:4442:2: 'faca'
            {
             before(grammarAccess.getComandoEnquantoAccess().getFacaKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getComandoEnquantoAccess().getFacaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__2__Impl"


    // $ANTLR start "rule__ComandoEnquanto__Group__3"
    // InternalT5.g:4451:1: rule__ComandoEnquanto__Group__3 : rule__ComandoEnquanto__Group__3__Impl rule__ComandoEnquanto__Group__4 ;
    public final void rule__ComandoEnquanto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4455:1: ( rule__ComandoEnquanto__Group__3__Impl rule__ComandoEnquanto__Group__4 )
            // InternalT5.g:4456:2: rule__ComandoEnquanto__Group__3__Impl rule__ComandoEnquanto__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__ComandoEnquanto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoEnquanto__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__3"


    // $ANTLR start "rule__ComandoEnquanto__Group__3__Impl"
    // InternalT5.g:4463:1: rule__ComandoEnquanto__Group__3__Impl : ( ( rule__ComandoEnquanto__ComandosAssignment_3 )* ) ;
    public final void rule__ComandoEnquanto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4467:1: ( ( ( rule__ComandoEnquanto__ComandosAssignment_3 )* ) )
            // InternalT5.g:4468:1: ( ( rule__ComandoEnquanto__ComandosAssignment_3 )* )
            {
            // InternalT5.g:4468:1: ( ( rule__ComandoEnquanto__ComandosAssignment_3 )* )
            // InternalT5.g:4469:2: ( rule__ComandoEnquanto__ComandosAssignment_3 )*
            {
             before(grammarAccess.getComandoEnquantoAccess().getComandosAssignment_3()); 
            // InternalT5.g:4470:2: ( rule__ComandoEnquanto__ComandosAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==49||(LA38_0>=51 && LA38_0<=53)||LA38_0==57||LA38_0==60||LA38_0==63||LA38_0==65||LA38_0==67) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalT5.g:4470:3: rule__ComandoEnquanto__ComandosAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ComandoEnquanto__ComandosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getComandoEnquantoAccess().getComandosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__3__Impl"


    // $ANTLR start "rule__ComandoEnquanto__Group__4"
    // InternalT5.g:4478:1: rule__ComandoEnquanto__Group__4 : rule__ComandoEnquanto__Group__4__Impl ;
    public final void rule__ComandoEnquanto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4482:1: ( rule__ComandoEnquanto__Group__4__Impl )
            // InternalT5.g:4483:2: rule__ComandoEnquanto__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoEnquanto__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__4"


    // $ANTLR start "rule__ComandoEnquanto__Group__4__Impl"
    // InternalT5.g:4489:1: rule__ComandoEnquanto__Group__4__Impl : ( 'fim_enquanto' ) ;
    public final void rule__ComandoEnquanto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4493:1: ( ( 'fim_enquanto' ) )
            // InternalT5.g:4494:1: ( 'fim_enquanto' )
            {
            // InternalT5.g:4494:1: ( 'fim_enquanto' )
            // InternalT5.g:4495:2: 'fim_enquanto'
            {
             before(grammarAccess.getComandoEnquantoAccess().getFim_enquantoKeyword_4()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getComandoEnquantoAccess().getFim_enquantoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__Group__4__Impl"


    // $ANTLR start "rule__ComandoFaca__Group__0"
    // InternalT5.g:4505:1: rule__ComandoFaca__Group__0 : rule__ComandoFaca__Group__0__Impl rule__ComandoFaca__Group__1 ;
    public final void rule__ComandoFaca__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4509:1: ( rule__ComandoFaca__Group__0__Impl rule__ComandoFaca__Group__1 )
            // InternalT5.g:4510:2: rule__ComandoFaca__Group__0__Impl rule__ComandoFaca__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__ComandoFaca__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoFaca__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__Group__0"


    // $ANTLR start "rule__ComandoFaca__Group__0__Impl"
    // InternalT5.g:4517:1: rule__ComandoFaca__Group__0__Impl : ( 'faca' ) ;
    public final void rule__ComandoFaca__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4521:1: ( ( 'faca' ) )
            // InternalT5.g:4522:1: ( 'faca' )
            {
            // InternalT5.g:4522:1: ( 'faca' )
            // InternalT5.g:4523:2: 'faca'
            {
             before(grammarAccess.getComandoFacaAccess().getFacaKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getComandoFacaAccess().getFacaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__Group__0__Impl"


    // $ANTLR start "rule__ComandoFaca__Group__1"
    // InternalT5.g:4532:1: rule__ComandoFaca__Group__1 : rule__ComandoFaca__Group__1__Impl rule__ComandoFaca__Group__2 ;
    public final void rule__ComandoFaca__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4536:1: ( rule__ComandoFaca__Group__1__Impl rule__ComandoFaca__Group__2 )
            // InternalT5.g:4537:2: rule__ComandoFaca__Group__1__Impl rule__ComandoFaca__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__ComandoFaca__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoFaca__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__Group__1"


    // $ANTLR start "rule__ComandoFaca__Group__1__Impl"
    // InternalT5.g:4544:1: rule__ComandoFaca__Group__1__Impl : ( ( rule__ComandoFaca__ComandosAssignment_1 )* ) ;
    public final void rule__ComandoFaca__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4548:1: ( ( ( rule__ComandoFaca__ComandosAssignment_1 )* ) )
            // InternalT5.g:4549:1: ( ( rule__ComandoFaca__ComandosAssignment_1 )* )
            {
            // InternalT5.g:4549:1: ( ( rule__ComandoFaca__ComandosAssignment_1 )* )
            // InternalT5.g:4550:2: ( rule__ComandoFaca__ComandosAssignment_1 )*
            {
             before(grammarAccess.getComandoFacaAccess().getComandosAssignment_1()); 
            // InternalT5.g:4551:2: ( rule__ComandoFaca__ComandosAssignment_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==49||(LA39_0>=51 && LA39_0<=53)||LA39_0==57||LA39_0==60||LA39_0==63||LA39_0==65||LA39_0==67) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalT5.g:4551:3: rule__ComandoFaca__ComandosAssignment_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ComandoFaca__ComandosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getComandoFacaAccess().getComandosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__Group__1__Impl"


    // $ANTLR start "rule__ComandoFaca__Group__2"
    // InternalT5.g:4559:1: rule__ComandoFaca__Group__2 : rule__ComandoFaca__Group__2__Impl rule__ComandoFaca__Group__3 ;
    public final void rule__ComandoFaca__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4563:1: ( rule__ComandoFaca__Group__2__Impl rule__ComandoFaca__Group__3 )
            // InternalT5.g:4564:2: rule__ComandoFaca__Group__2__Impl rule__ComandoFaca__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ComandoFaca__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoFaca__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__Group__2"


    // $ANTLR start "rule__ComandoFaca__Group__2__Impl"
    // InternalT5.g:4571:1: rule__ComandoFaca__Group__2__Impl : ( 'ate' ) ;
    public final void rule__ComandoFaca__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4575:1: ( ( 'ate' ) )
            // InternalT5.g:4576:1: ( 'ate' )
            {
            // InternalT5.g:4576:1: ( 'ate' )
            // InternalT5.g:4577:2: 'ate'
            {
             before(grammarAccess.getComandoFacaAccess().getAteKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getComandoFacaAccess().getAteKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__Group__2__Impl"


    // $ANTLR start "rule__ComandoFaca__Group__3"
    // InternalT5.g:4586:1: rule__ComandoFaca__Group__3 : rule__ComandoFaca__Group__3__Impl ;
    public final void rule__ComandoFaca__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4590:1: ( rule__ComandoFaca__Group__3__Impl )
            // InternalT5.g:4591:2: rule__ComandoFaca__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoFaca__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__Group__3"


    // $ANTLR start "rule__ComandoFaca__Group__3__Impl"
    // InternalT5.g:4597:1: rule__ComandoFaca__Group__3__Impl : ( ( rule__ComandoFaca__CondAssignment_3 ) ) ;
    public final void rule__ComandoFaca__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4601:1: ( ( ( rule__ComandoFaca__CondAssignment_3 ) ) )
            // InternalT5.g:4602:1: ( ( rule__ComandoFaca__CondAssignment_3 ) )
            {
            // InternalT5.g:4602:1: ( ( rule__ComandoFaca__CondAssignment_3 ) )
            // InternalT5.g:4603:2: ( rule__ComandoFaca__CondAssignment_3 )
            {
             before(grammarAccess.getComandoFacaAccess().getCondAssignment_3()); 
            // InternalT5.g:4604:2: ( rule__ComandoFaca__CondAssignment_3 )
            // InternalT5.g:4604:3: rule__ComandoFaca__CondAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComandoFaca__CondAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComandoFacaAccess().getCondAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__Group__3__Impl"


    // $ANTLR start "rule__ComandoAtribuicao__Group__0"
    // InternalT5.g:4613:1: rule__ComandoAtribuicao__Group__0 : rule__ComandoAtribuicao__Group__0__Impl rule__ComandoAtribuicao__Group__1 ;
    public final void rule__ComandoAtribuicao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4617:1: ( rule__ComandoAtribuicao__Group__0__Impl rule__ComandoAtribuicao__Group__1 )
            // InternalT5.g:4618:2: rule__ComandoAtribuicao__Group__0__Impl rule__ComandoAtribuicao__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__ComandoAtribuicao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoAtribuicao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__Group__0"


    // $ANTLR start "rule__ComandoAtribuicao__Group__0__Impl"
    // InternalT5.g:4625:1: rule__ComandoAtribuicao__Group__0__Impl : ( ( '^' )? ) ;
    public final void rule__ComandoAtribuicao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4629:1: ( ( ( '^' )? ) )
            // InternalT5.g:4630:1: ( ( '^' )? )
            {
            // InternalT5.g:4630:1: ( ( '^' )? )
            // InternalT5.g:4631:2: ( '^' )?
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getCircumflexAccentKeyword_0()); 
            // InternalT5.g:4632:2: ( '^' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalT5.g:4632:3: '^'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComandoAtribuicaoAccess().getCircumflexAccentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__Group__0__Impl"


    // $ANTLR start "rule__ComandoAtribuicao__Group__1"
    // InternalT5.g:4640:1: rule__ComandoAtribuicao__Group__1 : rule__ComandoAtribuicao__Group__1__Impl rule__ComandoAtribuicao__Group__2 ;
    public final void rule__ComandoAtribuicao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4644:1: ( rule__ComandoAtribuicao__Group__1__Impl rule__ComandoAtribuicao__Group__2 )
            // InternalT5.g:4645:2: rule__ComandoAtribuicao__Group__1__Impl rule__ComandoAtribuicao__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__ComandoAtribuicao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoAtribuicao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__Group__1"


    // $ANTLR start "rule__ComandoAtribuicao__Group__1__Impl"
    // InternalT5.g:4652:1: rule__ComandoAtribuicao__Group__1__Impl : ( ( rule__ComandoAtribuicao__TargetAssignment_1 ) ) ;
    public final void rule__ComandoAtribuicao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4656:1: ( ( ( rule__ComandoAtribuicao__TargetAssignment_1 ) ) )
            // InternalT5.g:4657:1: ( ( rule__ComandoAtribuicao__TargetAssignment_1 ) )
            {
            // InternalT5.g:4657:1: ( ( rule__ComandoAtribuicao__TargetAssignment_1 ) )
            // InternalT5.g:4658:2: ( rule__ComandoAtribuicao__TargetAssignment_1 )
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getTargetAssignment_1()); 
            // InternalT5.g:4659:2: ( rule__ComandoAtribuicao__TargetAssignment_1 )
            // InternalT5.g:4659:3: rule__ComandoAtribuicao__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoAtribuicao__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoAtribuicaoAccess().getTargetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__Group__1__Impl"


    // $ANTLR start "rule__ComandoAtribuicao__Group__2"
    // InternalT5.g:4667:1: rule__ComandoAtribuicao__Group__2 : rule__ComandoAtribuicao__Group__2__Impl rule__ComandoAtribuicao__Group__3 ;
    public final void rule__ComandoAtribuicao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4671:1: ( rule__ComandoAtribuicao__Group__2__Impl rule__ComandoAtribuicao__Group__3 )
            // InternalT5.g:4672:2: rule__ComandoAtribuicao__Group__2__Impl rule__ComandoAtribuicao__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ComandoAtribuicao__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoAtribuicao__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__Group__2"


    // $ANTLR start "rule__ComandoAtribuicao__Group__2__Impl"
    // InternalT5.g:4679:1: rule__ComandoAtribuicao__Group__2__Impl : ( '<-' ) ;
    public final void rule__ComandoAtribuicao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4683:1: ( ( '<-' ) )
            // InternalT5.g:4684:1: ( '<-' )
            {
            // InternalT5.g:4684:1: ( '<-' )
            // InternalT5.g:4685:2: '<-'
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getLessThanSignHyphenMinusKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getComandoAtribuicaoAccess().getLessThanSignHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__Group__2__Impl"


    // $ANTLR start "rule__ComandoAtribuicao__Group__3"
    // InternalT5.g:4694:1: rule__ComandoAtribuicao__Group__3 : rule__ComandoAtribuicao__Group__3__Impl ;
    public final void rule__ComandoAtribuicao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4698:1: ( rule__ComandoAtribuicao__Group__3__Impl )
            // InternalT5.g:4699:2: rule__ComandoAtribuicao__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoAtribuicao__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__Group__3"


    // $ANTLR start "rule__ComandoAtribuicao__Group__3__Impl"
    // InternalT5.g:4705:1: rule__ComandoAtribuicao__Group__3__Impl : ( ( rule__ComandoAtribuicao__ValorAssignment_3 ) ) ;
    public final void rule__ComandoAtribuicao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4709:1: ( ( ( rule__ComandoAtribuicao__ValorAssignment_3 ) ) )
            // InternalT5.g:4710:1: ( ( rule__ComandoAtribuicao__ValorAssignment_3 ) )
            {
            // InternalT5.g:4710:1: ( ( rule__ComandoAtribuicao__ValorAssignment_3 ) )
            // InternalT5.g:4711:2: ( rule__ComandoAtribuicao__ValorAssignment_3 )
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getValorAssignment_3()); 
            // InternalT5.g:4712:2: ( rule__ComandoAtribuicao__ValorAssignment_3 )
            // InternalT5.g:4712:3: rule__ComandoAtribuicao__ValorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComandoAtribuicao__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComandoAtribuicaoAccess().getValorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__Group__3__Impl"


    // $ANTLR start "rule__ComandoChamada__Group__0"
    // InternalT5.g:4721:1: rule__ComandoChamada__Group__0 : rule__ComandoChamada__Group__0__Impl rule__ComandoChamada__Group__1 ;
    public final void rule__ComandoChamada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4725:1: ( rule__ComandoChamada__Group__0__Impl rule__ComandoChamada__Group__1 )
            // InternalT5.g:4726:2: rule__ComandoChamada__Group__0__Impl rule__ComandoChamada__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ComandoChamada__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group__0"


    // $ANTLR start "rule__ComandoChamada__Group__0__Impl"
    // InternalT5.g:4733:1: rule__ComandoChamada__Group__0__Impl : ( ( rule__ComandoChamada__NameAssignment_0 ) ) ;
    public final void rule__ComandoChamada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4737:1: ( ( ( rule__ComandoChamada__NameAssignment_0 ) ) )
            // InternalT5.g:4738:1: ( ( rule__ComandoChamada__NameAssignment_0 ) )
            {
            // InternalT5.g:4738:1: ( ( rule__ComandoChamada__NameAssignment_0 ) )
            // InternalT5.g:4739:2: ( rule__ComandoChamada__NameAssignment_0 )
            {
             before(grammarAccess.getComandoChamadaAccess().getNameAssignment_0()); 
            // InternalT5.g:4740:2: ( rule__ComandoChamada__NameAssignment_0 )
            // InternalT5.g:4740:3: rule__ComandoChamada__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoChamada__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComandoChamadaAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group__0__Impl"


    // $ANTLR start "rule__ComandoChamada__Group__1"
    // InternalT5.g:4748:1: rule__ComandoChamada__Group__1 : rule__ComandoChamada__Group__1__Impl rule__ComandoChamada__Group__2 ;
    public final void rule__ComandoChamada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4752:1: ( rule__ComandoChamada__Group__1__Impl rule__ComandoChamada__Group__2 )
            // InternalT5.g:4753:2: rule__ComandoChamada__Group__1__Impl rule__ComandoChamada__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__ComandoChamada__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group__1"


    // $ANTLR start "rule__ComandoChamada__Group__1__Impl"
    // InternalT5.g:4760:1: rule__ComandoChamada__Group__1__Impl : ( '(' ) ;
    public final void rule__ComandoChamada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4764:1: ( ( '(' ) )
            // InternalT5.g:4765:1: ( '(' )
            {
            // InternalT5.g:4765:1: ( '(' )
            // InternalT5.g:4766:2: '('
            {
             before(grammarAccess.getComandoChamadaAccess().getLeftParenthesisKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComandoChamadaAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group__1__Impl"


    // $ANTLR start "rule__ComandoChamada__Group__2"
    // InternalT5.g:4775:1: rule__ComandoChamada__Group__2 : rule__ComandoChamada__Group__2__Impl rule__ComandoChamada__Group__3 ;
    public final void rule__ComandoChamada__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4779:1: ( rule__ComandoChamada__Group__2__Impl rule__ComandoChamada__Group__3 )
            // InternalT5.g:4780:2: rule__ComandoChamada__Group__2__Impl rule__ComandoChamada__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__ComandoChamada__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group__2"


    // $ANTLR start "rule__ComandoChamada__Group__2__Impl"
    // InternalT5.g:4787:1: rule__ComandoChamada__Group__2__Impl : ( ( rule__ComandoChamada__Group_2__0 )? ) ;
    public final void rule__ComandoChamada__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4791:1: ( ( ( rule__ComandoChamada__Group_2__0 )? ) )
            // InternalT5.g:4792:1: ( ( rule__ComandoChamada__Group_2__0 )? )
            {
            // InternalT5.g:4792:1: ( ( rule__ComandoChamada__Group_2__0 )? )
            // InternalT5.g:4793:2: ( rule__ComandoChamada__Group_2__0 )?
            {
             before(grammarAccess.getComandoChamadaAccess().getGroup_2()); 
            // InternalT5.g:4794:2: ( rule__ComandoChamada__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)||LA41_0==39||LA41_0==49||LA41_0==69) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalT5.g:4794:3: rule__ComandoChamada__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComandoChamada__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComandoChamadaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group__2__Impl"


    // $ANTLR start "rule__ComandoChamada__Group__3"
    // InternalT5.g:4802:1: rule__ComandoChamada__Group__3 : rule__ComandoChamada__Group__3__Impl ;
    public final void rule__ComandoChamada__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4806:1: ( rule__ComandoChamada__Group__3__Impl )
            // InternalT5.g:4807:2: rule__ComandoChamada__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group__3"


    // $ANTLR start "rule__ComandoChamada__Group__3__Impl"
    // InternalT5.g:4813:1: rule__ComandoChamada__Group__3__Impl : ( ')' ) ;
    public final void rule__ComandoChamada__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4817:1: ( ( ')' ) )
            // InternalT5.g:4818:1: ( ')' )
            {
            // InternalT5.g:4818:1: ( ')' )
            // InternalT5.g:4819:2: ')'
            {
             before(grammarAccess.getComandoChamadaAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComandoChamadaAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group__3__Impl"


    // $ANTLR start "rule__ComandoChamada__Group_2__0"
    // InternalT5.g:4829:1: rule__ComandoChamada__Group_2__0 : rule__ComandoChamada__Group_2__0__Impl rule__ComandoChamada__Group_2__1 ;
    public final void rule__ComandoChamada__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4833:1: ( rule__ComandoChamada__Group_2__0__Impl rule__ComandoChamada__Group_2__1 )
            // InternalT5.g:4834:2: rule__ComandoChamada__Group_2__0__Impl rule__ComandoChamada__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__ComandoChamada__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group_2__0"


    // $ANTLR start "rule__ComandoChamada__Group_2__0__Impl"
    // InternalT5.g:4841:1: rule__ComandoChamada__Group_2__0__Impl : ( ( rule__ComandoChamada__ArgsAssignment_2_0 ) ) ;
    public final void rule__ComandoChamada__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4845:1: ( ( ( rule__ComandoChamada__ArgsAssignment_2_0 ) ) )
            // InternalT5.g:4846:1: ( ( rule__ComandoChamada__ArgsAssignment_2_0 ) )
            {
            // InternalT5.g:4846:1: ( ( rule__ComandoChamada__ArgsAssignment_2_0 ) )
            // InternalT5.g:4847:2: ( rule__ComandoChamada__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getComandoChamadaAccess().getArgsAssignment_2_0()); 
            // InternalT5.g:4848:2: ( rule__ComandoChamada__ArgsAssignment_2_0 )
            // InternalT5.g:4848:3: rule__ComandoChamada__ArgsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ComandoChamada__ArgsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getComandoChamadaAccess().getArgsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group_2__0__Impl"


    // $ANTLR start "rule__ComandoChamada__Group_2__1"
    // InternalT5.g:4856:1: rule__ComandoChamada__Group_2__1 : rule__ComandoChamada__Group_2__1__Impl ;
    public final void rule__ComandoChamada__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4860:1: ( rule__ComandoChamada__Group_2__1__Impl )
            // InternalT5.g:4861:2: rule__ComandoChamada__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group_2__1"


    // $ANTLR start "rule__ComandoChamada__Group_2__1__Impl"
    // InternalT5.g:4867:1: rule__ComandoChamada__Group_2__1__Impl : ( ( rule__ComandoChamada__Group_2_1__0 )* ) ;
    public final void rule__ComandoChamada__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4871:1: ( ( ( rule__ComandoChamada__Group_2_1__0 )* ) )
            // InternalT5.g:4872:1: ( ( rule__ComandoChamada__Group_2_1__0 )* )
            {
            // InternalT5.g:4872:1: ( ( rule__ComandoChamada__Group_2_1__0 )* )
            // InternalT5.g:4873:2: ( rule__ComandoChamada__Group_2_1__0 )*
            {
             before(grammarAccess.getComandoChamadaAccess().getGroup_2_1()); 
            // InternalT5.g:4874:2: ( rule__ComandoChamada__Group_2_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==34) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalT5.g:4874:3: rule__ComandoChamada__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComandoChamada__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getComandoChamadaAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group_2__1__Impl"


    // $ANTLR start "rule__ComandoChamada__Group_2_1__0"
    // InternalT5.g:4883:1: rule__ComandoChamada__Group_2_1__0 : rule__ComandoChamada__Group_2_1__0__Impl rule__ComandoChamada__Group_2_1__1 ;
    public final void rule__ComandoChamada__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4887:1: ( rule__ComandoChamada__Group_2_1__0__Impl rule__ComandoChamada__Group_2_1__1 )
            // InternalT5.g:4888:2: rule__ComandoChamada__Group_2_1__0__Impl rule__ComandoChamada__Group_2_1__1
            {
            pushFollow(FOLLOW_33);
            rule__ComandoChamada__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group_2_1__0"


    // $ANTLR start "rule__ComandoChamada__Group_2_1__0__Impl"
    // InternalT5.g:4895:1: rule__ComandoChamada__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ComandoChamada__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4899:1: ( ( ',' ) )
            // InternalT5.g:4900:1: ( ',' )
            {
            // InternalT5.g:4900:1: ( ',' )
            // InternalT5.g:4901:2: ','
            {
             before(grammarAccess.getComandoChamadaAccess().getCommaKeyword_2_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComandoChamadaAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group_2_1__0__Impl"


    // $ANTLR start "rule__ComandoChamada__Group_2_1__1"
    // InternalT5.g:4910:1: rule__ComandoChamada__Group_2_1__1 : rule__ComandoChamada__Group_2_1__1__Impl ;
    public final void rule__ComandoChamada__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4914:1: ( rule__ComandoChamada__Group_2_1__1__Impl )
            // InternalT5.g:4915:2: rule__ComandoChamada__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoChamada__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group_2_1__1"


    // $ANTLR start "rule__ComandoChamada__Group_2_1__1__Impl"
    // InternalT5.g:4921:1: rule__ComandoChamada__Group_2_1__1__Impl : ( ( rule__ComandoChamada__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__ComandoChamada__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4925:1: ( ( ( rule__ComandoChamada__ArgsAssignment_2_1_1 ) ) )
            // InternalT5.g:4926:1: ( ( rule__ComandoChamada__ArgsAssignment_2_1_1 ) )
            {
            // InternalT5.g:4926:1: ( ( rule__ComandoChamada__ArgsAssignment_2_1_1 ) )
            // InternalT5.g:4927:2: ( rule__ComandoChamada__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getComandoChamadaAccess().getArgsAssignment_2_1_1()); 
            // InternalT5.g:4928:2: ( rule__ComandoChamada__ArgsAssignment_2_1_1 )
            // InternalT5.g:4928:3: rule__ComandoChamada__ArgsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoChamada__ArgsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoChamadaAccess().getArgsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__Group_2_1__1__Impl"


    // $ANTLR start "rule__ComandoRetorne__Group__0"
    // InternalT5.g:4937:1: rule__ComandoRetorne__Group__0 : rule__ComandoRetorne__Group__0__Impl rule__ComandoRetorne__Group__1 ;
    public final void rule__ComandoRetorne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4941:1: ( rule__ComandoRetorne__Group__0__Impl rule__ComandoRetorne__Group__1 )
            // InternalT5.g:4942:2: rule__ComandoRetorne__Group__0__Impl rule__ComandoRetorne__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ComandoRetorne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComandoRetorne__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRetorne__Group__0"


    // $ANTLR start "rule__ComandoRetorne__Group__0__Impl"
    // InternalT5.g:4949:1: rule__ComandoRetorne__Group__0__Impl : ( 'retorne' ) ;
    public final void rule__ComandoRetorne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4953:1: ( ( 'retorne' ) )
            // InternalT5.g:4954:1: ( 'retorne' )
            {
            // InternalT5.g:4954:1: ( 'retorne' )
            // InternalT5.g:4955:2: 'retorne'
            {
             before(grammarAccess.getComandoRetorneAccess().getRetorneKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getComandoRetorneAccess().getRetorneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRetorne__Group__0__Impl"


    // $ANTLR start "rule__ComandoRetorne__Group__1"
    // InternalT5.g:4964:1: rule__ComandoRetorne__Group__1 : rule__ComandoRetorne__Group__1__Impl ;
    public final void rule__ComandoRetorne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4968:1: ( rule__ComandoRetorne__Group__1__Impl )
            // InternalT5.g:4969:2: rule__ComandoRetorne__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComandoRetorne__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRetorne__Group__1"


    // $ANTLR start "rule__ComandoRetorne__Group__1__Impl"
    // InternalT5.g:4975:1: rule__ComandoRetorne__Group__1__Impl : ( ( rule__ComandoRetorne__ExpAssignment_1 ) ) ;
    public final void rule__ComandoRetorne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4979:1: ( ( ( rule__ComandoRetorne__ExpAssignment_1 ) ) )
            // InternalT5.g:4980:1: ( ( rule__ComandoRetorne__ExpAssignment_1 ) )
            {
            // InternalT5.g:4980:1: ( ( rule__ComandoRetorne__ExpAssignment_1 ) )
            // InternalT5.g:4981:2: ( rule__ComandoRetorne__ExpAssignment_1 )
            {
             before(grammarAccess.getComandoRetorneAccess().getExpAssignment_1()); 
            // InternalT5.g:4982:2: ( rule__ComandoRetorne__ExpAssignment_1 )
            // InternalT5.g:4982:3: rule__ComandoRetorne__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComandoRetorne__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComandoRetorneAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRetorne__Group__1__Impl"


    // $ANTLR start "rule__Selecao__Group__0"
    // InternalT5.g:4991:1: rule__Selecao__Group__0 : rule__Selecao__Group__0__Impl rule__Selecao__Group__1 ;
    public final void rule__Selecao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4995:1: ( rule__Selecao__Group__0__Impl rule__Selecao__Group__1 )
            // InternalT5.g:4996:2: rule__Selecao__Group__0__Impl rule__Selecao__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Selecao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__0"


    // $ANTLR start "rule__Selecao__Group__0__Impl"
    // InternalT5.g:5003:1: rule__Selecao__Group__0__Impl : ( ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* ) ) ;
    public final void rule__Selecao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5007:1: ( ( ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* ) ) )
            // InternalT5.g:5008:1: ( ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* ) )
            {
            // InternalT5.g:5008:1: ( ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* ) )
            // InternalT5.g:5009:2: ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* )
            {
            // InternalT5.g:5009:2: ( ( rule__Selecao__ItensAssignment_0 ) )
            // InternalT5.g:5010:3: ( rule__Selecao__ItensAssignment_0 )
            {
             before(grammarAccess.getSelecaoAccess().getItensAssignment_0()); 
            // InternalT5.g:5011:3: ( rule__Selecao__ItensAssignment_0 )
            // InternalT5.g:5011:4: rule__Selecao__ItensAssignment_0
            {
            pushFollow(FOLLOW_39);
            rule__Selecao__ItensAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelecaoAccess().getItensAssignment_0()); 

            }

            // InternalT5.g:5014:2: ( ( rule__Selecao__ItensAssignment_0 )* )
            // InternalT5.g:5015:3: ( rule__Selecao__ItensAssignment_0 )*
            {
             before(grammarAccess.getSelecaoAccess().getItensAssignment_0()); 
            // InternalT5.g:5016:3: ( rule__Selecao__ItensAssignment_0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==12) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalT5.g:5016:4: rule__Selecao__ItensAssignment_0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Selecao__ItensAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getSelecaoAccess().getItensAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__0__Impl"


    // $ANTLR start "rule__Selecao__Group__1"
    // InternalT5.g:5025:1: rule__Selecao__Group__1 : rule__Selecao__Group__1__Impl rule__Selecao__Group__2 ;
    public final void rule__Selecao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5029:1: ( rule__Selecao__Group__1__Impl rule__Selecao__Group__2 )
            // InternalT5.g:5030:2: rule__Selecao__Group__1__Impl rule__Selecao__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Selecao__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selecao__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__1"


    // $ANTLR start "rule__Selecao__Group__1__Impl"
    // InternalT5.g:5037:1: rule__Selecao__Group__1__Impl : ( ':' ) ;
    public final void rule__Selecao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5041:1: ( ( ':' ) )
            // InternalT5.g:5042:1: ( ':' )
            {
            // InternalT5.g:5042:1: ( ':' )
            // InternalT5.g:5043:2: ':'
            {
             before(grammarAccess.getSelecaoAccess().getColonKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSelecaoAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__1__Impl"


    // $ANTLR start "rule__Selecao__Group__2"
    // InternalT5.g:5052:1: rule__Selecao__Group__2 : rule__Selecao__Group__2__Impl ;
    public final void rule__Selecao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5056:1: ( rule__Selecao__Group__2__Impl )
            // InternalT5.g:5057:2: rule__Selecao__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selecao__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__2"


    // $ANTLR start "rule__Selecao__Group__2__Impl"
    // InternalT5.g:5063:1: rule__Selecao__Group__2__Impl : ( ( rule__Selecao__ComandosAssignment_2 )* ) ;
    public final void rule__Selecao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5067:1: ( ( ( rule__Selecao__ComandosAssignment_2 )* ) )
            // InternalT5.g:5068:1: ( ( rule__Selecao__ComandosAssignment_2 )* )
            {
            // InternalT5.g:5068:1: ( ( rule__Selecao__ComandosAssignment_2 )* )
            // InternalT5.g:5069:2: ( rule__Selecao__ComandosAssignment_2 )*
            {
             before(grammarAccess.getSelecaoAccess().getComandosAssignment_2()); 
            // InternalT5.g:5070:2: ( rule__Selecao__ComandosAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==49||(LA44_0>=51 && LA44_0<=53)||LA44_0==57||LA44_0==60||LA44_0==63||LA44_0==65||LA44_0==67) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalT5.g:5070:3: rule__Selecao__ComandosAssignment_2
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Selecao__ComandosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getSelecaoAccess().getComandosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__Group__2__Impl"


    // $ANTLR start "rule__ItemSelecao__Group__0"
    // InternalT5.g:5079:1: rule__ItemSelecao__Group__0 : rule__ItemSelecao__Group__0__Impl rule__ItemSelecao__Group__1 ;
    public final void rule__ItemSelecao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5083:1: ( rule__ItemSelecao__Group__0__Impl rule__ItemSelecao__Group__1 )
            // InternalT5.g:5084:2: rule__ItemSelecao__Group__0__Impl rule__ItemSelecao__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ItemSelecao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemSelecao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__Group__0"


    // $ANTLR start "rule__ItemSelecao__Group__0__Impl"
    // InternalT5.g:5091:1: rule__ItemSelecao__Group__0__Impl : ( ( rule__ItemSelecao__FaixasAssignment_0 ) ) ;
    public final void rule__ItemSelecao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5095:1: ( ( ( rule__ItemSelecao__FaixasAssignment_0 ) ) )
            // InternalT5.g:5096:1: ( ( rule__ItemSelecao__FaixasAssignment_0 ) )
            {
            // InternalT5.g:5096:1: ( ( rule__ItemSelecao__FaixasAssignment_0 ) )
            // InternalT5.g:5097:2: ( rule__ItemSelecao__FaixasAssignment_0 )
            {
             before(grammarAccess.getItemSelecaoAccess().getFaixasAssignment_0()); 
            // InternalT5.g:5098:2: ( rule__ItemSelecao__FaixasAssignment_0 )
            // InternalT5.g:5098:3: rule__ItemSelecao__FaixasAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ItemSelecao__FaixasAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemSelecaoAccess().getFaixasAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__Group__0__Impl"


    // $ANTLR start "rule__ItemSelecao__Group__1"
    // InternalT5.g:5106:1: rule__ItemSelecao__Group__1 : rule__ItemSelecao__Group__1__Impl ;
    public final void rule__ItemSelecao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5110:1: ( rule__ItemSelecao__Group__1__Impl )
            // InternalT5.g:5111:2: rule__ItemSelecao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemSelecao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__Group__1"


    // $ANTLR start "rule__ItemSelecao__Group__1__Impl"
    // InternalT5.g:5117:1: rule__ItemSelecao__Group__1__Impl : ( ( rule__ItemSelecao__Group_1__0 )* ) ;
    public final void rule__ItemSelecao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5121:1: ( ( ( rule__ItemSelecao__Group_1__0 )* ) )
            // InternalT5.g:5122:1: ( ( rule__ItemSelecao__Group_1__0 )* )
            {
            // InternalT5.g:5122:1: ( ( rule__ItemSelecao__Group_1__0 )* )
            // InternalT5.g:5123:2: ( rule__ItemSelecao__Group_1__0 )*
            {
             before(grammarAccess.getItemSelecaoAccess().getGroup_1()); 
            // InternalT5.g:5124:2: ( rule__ItemSelecao__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==34) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalT5.g:5124:3: rule__ItemSelecao__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ItemSelecao__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getItemSelecaoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__Group__1__Impl"


    // $ANTLR start "rule__ItemSelecao__Group_1__0"
    // InternalT5.g:5133:1: rule__ItemSelecao__Group_1__0 : rule__ItemSelecao__Group_1__0__Impl rule__ItemSelecao__Group_1__1 ;
    public final void rule__ItemSelecao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5137:1: ( rule__ItemSelecao__Group_1__0__Impl rule__ItemSelecao__Group_1__1 )
            // InternalT5.g:5138:2: rule__ItemSelecao__Group_1__0__Impl rule__ItemSelecao__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__ItemSelecao__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemSelecao__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__Group_1__0"


    // $ANTLR start "rule__ItemSelecao__Group_1__0__Impl"
    // InternalT5.g:5145:1: rule__ItemSelecao__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ItemSelecao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5149:1: ( ( ',' ) )
            // InternalT5.g:5150:1: ( ',' )
            {
            // InternalT5.g:5150:1: ( ',' )
            // InternalT5.g:5151:2: ','
            {
             before(grammarAccess.getItemSelecaoAccess().getCommaKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getItemSelecaoAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__Group_1__0__Impl"


    // $ANTLR start "rule__ItemSelecao__Group_1__1"
    // InternalT5.g:5160:1: rule__ItemSelecao__Group_1__1 : rule__ItemSelecao__Group_1__1__Impl ;
    public final void rule__ItemSelecao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5164:1: ( rule__ItemSelecao__Group_1__1__Impl )
            // InternalT5.g:5165:2: rule__ItemSelecao__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemSelecao__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__Group_1__1"


    // $ANTLR start "rule__ItemSelecao__Group_1__1__Impl"
    // InternalT5.g:5171:1: rule__ItemSelecao__Group_1__1__Impl : ( ( rule__ItemSelecao__FaixasAssignment_1_1 ) ) ;
    public final void rule__ItemSelecao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5175:1: ( ( ( rule__ItemSelecao__FaixasAssignment_1_1 ) ) )
            // InternalT5.g:5176:1: ( ( rule__ItemSelecao__FaixasAssignment_1_1 ) )
            {
            // InternalT5.g:5176:1: ( ( rule__ItemSelecao__FaixasAssignment_1_1 ) )
            // InternalT5.g:5177:2: ( rule__ItemSelecao__FaixasAssignment_1_1 )
            {
             before(grammarAccess.getItemSelecaoAccess().getFaixasAssignment_1_1()); 
            // InternalT5.g:5178:2: ( rule__ItemSelecao__FaixasAssignment_1_1 )
            // InternalT5.g:5178:3: rule__ItemSelecao__FaixasAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ItemSelecao__FaixasAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getItemSelecaoAccess().getFaixasAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__Group_1__1__Impl"


    // $ANTLR start "rule__NumeroIntervalo__Group__0"
    // InternalT5.g:5187:1: rule__NumeroIntervalo__Group__0 : rule__NumeroIntervalo__Group__0__Impl rule__NumeroIntervalo__Group__1 ;
    public final void rule__NumeroIntervalo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5191:1: ( rule__NumeroIntervalo__Group__0__Impl rule__NumeroIntervalo__Group__1 )
            // InternalT5.g:5192:2: rule__NumeroIntervalo__Group__0__Impl rule__NumeroIntervalo__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__NumeroIntervalo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group__0"


    // $ANTLR start "rule__NumeroIntervalo__Group__0__Impl"
    // InternalT5.g:5199:1: rule__NumeroIntervalo__Group__0__Impl : ( ( rule__NumeroIntervalo__SinalAssignment_0 ) ) ;
    public final void rule__NumeroIntervalo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5203:1: ( ( ( rule__NumeroIntervalo__SinalAssignment_0 ) ) )
            // InternalT5.g:5204:1: ( ( rule__NumeroIntervalo__SinalAssignment_0 ) )
            {
            // InternalT5.g:5204:1: ( ( rule__NumeroIntervalo__SinalAssignment_0 ) )
            // InternalT5.g:5205:2: ( rule__NumeroIntervalo__SinalAssignment_0 )
            {
             before(grammarAccess.getNumeroIntervaloAccess().getSinalAssignment_0()); 
            // InternalT5.g:5206:2: ( rule__NumeroIntervalo__SinalAssignment_0 )
            // InternalT5.g:5206:3: rule__NumeroIntervalo__SinalAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__SinalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumeroIntervaloAccess().getSinalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group__0__Impl"


    // $ANTLR start "rule__NumeroIntervalo__Group__1"
    // InternalT5.g:5214:1: rule__NumeroIntervalo__Group__1 : rule__NumeroIntervalo__Group__1__Impl rule__NumeroIntervalo__Group__2 ;
    public final void rule__NumeroIntervalo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5218:1: ( rule__NumeroIntervalo__Group__1__Impl rule__NumeroIntervalo__Group__2 )
            // InternalT5.g:5219:2: rule__NumeroIntervalo__Group__1__Impl rule__NumeroIntervalo__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__NumeroIntervalo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group__1"


    // $ANTLR start "rule__NumeroIntervalo__Group__1__Impl"
    // InternalT5.g:5226:1: rule__NumeroIntervalo__Group__1__Impl : ( ( rule__NumeroIntervalo__StartAssignment_1 ) ) ;
    public final void rule__NumeroIntervalo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5230:1: ( ( ( rule__NumeroIntervalo__StartAssignment_1 ) ) )
            // InternalT5.g:5231:1: ( ( rule__NumeroIntervalo__StartAssignment_1 ) )
            {
            // InternalT5.g:5231:1: ( ( rule__NumeroIntervalo__StartAssignment_1 ) )
            // InternalT5.g:5232:2: ( rule__NumeroIntervalo__StartAssignment_1 )
            {
             before(grammarAccess.getNumeroIntervaloAccess().getStartAssignment_1()); 
            // InternalT5.g:5233:2: ( rule__NumeroIntervalo__StartAssignment_1 )
            // InternalT5.g:5233:3: rule__NumeroIntervalo__StartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__StartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumeroIntervaloAccess().getStartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group__1__Impl"


    // $ANTLR start "rule__NumeroIntervalo__Group__2"
    // InternalT5.g:5241:1: rule__NumeroIntervalo__Group__2 : rule__NumeroIntervalo__Group__2__Impl ;
    public final void rule__NumeroIntervalo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5245:1: ( rule__NumeroIntervalo__Group__2__Impl )
            // InternalT5.g:5246:2: rule__NumeroIntervalo__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group__2"


    // $ANTLR start "rule__NumeroIntervalo__Group__2__Impl"
    // InternalT5.g:5252:1: rule__NumeroIntervalo__Group__2__Impl : ( ( rule__NumeroIntervalo__Group_2__0 )? ) ;
    public final void rule__NumeroIntervalo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5256:1: ( ( ( rule__NumeroIntervalo__Group_2__0 )? ) )
            // InternalT5.g:5257:1: ( ( rule__NumeroIntervalo__Group_2__0 )? )
            {
            // InternalT5.g:5257:1: ( ( rule__NumeroIntervalo__Group_2__0 )? )
            // InternalT5.g:5258:2: ( rule__NumeroIntervalo__Group_2__0 )?
            {
             before(grammarAccess.getNumeroIntervaloAccess().getGroup_2()); 
            // InternalT5.g:5259:2: ( rule__NumeroIntervalo__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalT5.g:5259:3: rule__NumeroIntervalo__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumeroIntervalo__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumeroIntervaloAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group__2__Impl"


    // $ANTLR start "rule__NumeroIntervalo__Group_2__0"
    // InternalT5.g:5268:1: rule__NumeroIntervalo__Group_2__0 : rule__NumeroIntervalo__Group_2__0__Impl rule__NumeroIntervalo__Group_2__1 ;
    public final void rule__NumeroIntervalo__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5272:1: ( rule__NumeroIntervalo__Group_2__0__Impl rule__NumeroIntervalo__Group_2__1 )
            // InternalT5.g:5273:2: rule__NumeroIntervalo__Group_2__0__Impl rule__NumeroIntervalo__Group_2__1
            {
            pushFollow(FOLLOW_48);
            rule__NumeroIntervalo__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group_2__0"


    // $ANTLR start "rule__NumeroIntervalo__Group_2__0__Impl"
    // InternalT5.g:5280:1: rule__NumeroIntervalo__Group_2__0__Impl : ( '..' ) ;
    public final void rule__NumeroIntervalo__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5284:1: ( ( '..' ) )
            // InternalT5.g:5285:1: ( '..' )
            {
            // InternalT5.g:5285:1: ( '..' )
            // InternalT5.g:5286:2: '..'
            {
             before(grammarAccess.getNumeroIntervaloAccess().getFullStopFullStopKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getNumeroIntervaloAccess().getFullStopFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group_2__0__Impl"


    // $ANTLR start "rule__NumeroIntervalo__Group_2__1"
    // InternalT5.g:5295:1: rule__NumeroIntervalo__Group_2__1 : rule__NumeroIntervalo__Group_2__1__Impl ;
    public final void rule__NumeroIntervalo__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5299:1: ( rule__NumeroIntervalo__Group_2__1__Impl )
            // InternalT5.g:5300:2: rule__NumeroIntervalo__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group_2__1"


    // $ANTLR start "rule__NumeroIntervalo__Group_2__1__Impl"
    // InternalT5.g:5306:1: rule__NumeroIntervalo__Group_2__1__Impl : ( ( rule__NumeroIntervalo__EndAssignment_2_1 ) ) ;
    public final void rule__NumeroIntervalo__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5310:1: ( ( ( rule__NumeroIntervalo__EndAssignment_2_1 ) ) )
            // InternalT5.g:5311:1: ( ( rule__NumeroIntervalo__EndAssignment_2_1 ) )
            {
            // InternalT5.g:5311:1: ( ( rule__NumeroIntervalo__EndAssignment_2_1 ) )
            // InternalT5.g:5312:2: ( rule__NumeroIntervalo__EndAssignment_2_1 )
            {
             before(grammarAccess.getNumeroIntervaloAccess().getEndAssignment_2_1()); 
            // InternalT5.g:5313:2: ( rule__NumeroIntervalo__EndAssignment_2_1 )
            // InternalT5.g:5313:3: rule__NumeroIntervalo__EndAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NumeroIntervalo__EndAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNumeroIntervaloAccess().getEndAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__Group_2__1__Impl"


    // $ANTLR start "rule__ExpressaoAritmetica__Group__0"
    // InternalT5.g:5322:1: rule__ExpressaoAritmetica__Group__0 : rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1 ;
    public final void rule__ExpressaoAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5326:1: ( rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1 )
            // InternalT5.g:5327:2: rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__ExpressaoAritmetica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressaoAritmetica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Group__0"


    // $ANTLR start "rule__ExpressaoAritmetica__Group__0__Impl"
    // InternalT5.g:5334:1: rule__ExpressaoAritmetica__Group__0__Impl : ( ( rule__ExpressaoAritmetica__TermosAssignment_0 ) ) ;
    public final void rule__ExpressaoAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5338:1: ( ( ( rule__ExpressaoAritmetica__TermosAssignment_0 ) ) )
            // InternalT5.g:5339:1: ( ( rule__ExpressaoAritmetica__TermosAssignment_0 ) )
            {
            // InternalT5.g:5339:1: ( ( rule__ExpressaoAritmetica__TermosAssignment_0 ) )
            // InternalT5.g:5340:2: ( rule__ExpressaoAritmetica__TermosAssignment_0 )
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getTermosAssignment_0()); 
            // InternalT5.g:5341:2: ( rule__ExpressaoAritmetica__TermosAssignment_0 )
            // InternalT5.g:5341:3: rule__ExpressaoAritmetica__TermosAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoAritmetica__TermosAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAritmeticaAccess().getTermosAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Group__0__Impl"


    // $ANTLR start "rule__ExpressaoAritmetica__Group__1"
    // InternalT5.g:5349:1: rule__ExpressaoAritmetica__Group__1 : rule__ExpressaoAritmetica__Group__1__Impl ;
    public final void rule__ExpressaoAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5353:1: ( rule__ExpressaoAritmetica__Group__1__Impl )
            // InternalT5.g:5354:2: rule__ExpressaoAritmetica__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoAritmetica__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Group__1"


    // $ANTLR start "rule__ExpressaoAritmetica__Group__1__Impl"
    // InternalT5.g:5360:1: rule__ExpressaoAritmetica__Group__1__Impl : ( ( rule__ExpressaoAritmetica__OutrosAssignment_1 )* ) ;
    public final void rule__ExpressaoAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5364:1: ( ( ( rule__ExpressaoAritmetica__OutrosAssignment_1 )* ) )
            // InternalT5.g:5365:1: ( ( rule__ExpressaoAritmetica__OutrosAssignment_1 )* )
            {
            // InternalT5.g:5365:1: ( ( rule__ExpressaoAritmetica__OutrosAssignment_1 )* )
            // InternalT5.g:5366:2: ( rule__ExpressaoAritmetica__OutrosAssignment_1 )*
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getOutrosAssignment_1()); 
            // InternalT5.g:5367:2: ( rule__ExpressaoAritmetica__OutrosAssignment_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==12) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==RULE_INT) ) {
                        switch ( input.LA(3) ) {
                        case 34:
                            {
                            int LA47_5 = input.LA(4);

                            if ( ((LA47_5>=RULE_STRING && LA47_5<=RULE_ID)||LA47_5==39||LA47_5==49||LA47_5==69) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case 12:
                            {
                            int LA47_6 = input.LA(4);

                            if ( ((LA47_6>=RULE_STRING && LA47_6<=RULE_ID)||LA47_6==39||LA47_6==49) ) {
                                alt47=1;
                            }


                            }
                            break;
                        case EOF:
                        case RULE_ID:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 32:
                        case 40:
                        case 41:
                        case 43:
                        case 46:
                        case 49:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            {
                            alt47=1;
                            }
                            break;

                        }

                    }
                    else if ( (LA47_2==RULE_STRING||(LA47_2>=RULE_REAL && LA47_2<=RULE_ID)||LA47_2==39||LA47_2==49) ) {
                        alt47=1;
                    }


                }
                else if ( (LA47_0==19) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalT5.g:5367:3: rule__ExpressaoAritmetica__OutrosAssignment_1
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__ExpressaoAritmetica__OutrosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getExpressaoAritmeticaAccess().getOutrosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__Group__1__Impl"


    // $ANTLR start "rule__OutroTermoAritmetico__Group__0"
    // InternalT5.g:5376:1: rule__OutroTermoAritmetico__Group__0 : rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1 ;
    public final void rule__OutroTermoAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5380:1: ( rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1 )
            // InternalT5.g:5381:2: rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__OutroTermoAritmetico__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__Group__0"


    // $ANTLR start "rule__OutroTermoAritmetico__Group__0__Impl"
    // InternalT5.g:5388:1: rule__OutroTermoAritmetico__Group__0__Impl : ( ( rule__OutroTermoAritmetico__OpAssignment_0 ) ) ;
    public final void rule__OutroTermoAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5392:1: ( ( ( rule__OutroTermoAritmetico__OpAssignment_0 ) ) )
            // InternalT5.g:5393:1: ( ( rule__OutroTermoAritmetico__OpAssignment_0 ) )
            {
            // InternalT5.g:5393:1: ( ( rule__OutroTermoAritmetico__OpAssignment_0 ) )
            // InternalT5.g:5394:2: ( rule__OutroTermoAritmetico__OpAssignment_0 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getOpAssignment_0()); 
            // InternalT5.g:5395:2: ( rule__OutroTermoAritmetico__OpAssignment_0 )
            // InternalT5.g:5395:3: rule__OutroTermoAritmetico__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoAritmeticoAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__Group__0__Impl"


    // $ANTLR start "rule__OutroTermoAritmetico__Group__1"
    // InternalT5.g:5403:1: rule__OutroTermoAritmetico__Group__1 : rule__OutroTermoAritmetico__Group__1__Impl ;
    public final void rule__OutroTermoAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5407:1: ( rule__OutroTermoAritmetico__Group__1__Impl )
            // InternalT5.g:5408:2: rule__OutroTermoAritmetico__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__Group__1"


    // $ANTLR start "rule__OutroTermoAritmetico__Group__1__Impl"
    // InternalT5.g:5414:1: rule__OutroTermoAritmetico__Group__1__Impl : ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) ) ;
    public final void rule__OutroTermoAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5418:1: ( ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) ) )
            // InternalT5.g:5419:1: ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) )
            {
            // InternalT5.g:5419:1: ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) )
            // InternalT5.g:5420:2: ( rule__OutroTermoAritmetico__TermoAssignment_1 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getTermoAssignment_1()); 
            // InternalT5.g:5421:2: ( rule__OutroTermoAritmetico__TermoAssignment_1 )
            // InternalT5.g:5421:3: rule__OutroTermoAritmetico__TermoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OutroTermoAritmetico__TermoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutroTermoAritmeticoAccess().getTermoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__Group__1__Impl"


    // $ANTLR start "rule__TermoAritmetico__Group__0"
    // InternalT5.g:5430:1: rule__TermoAritmetico__Group__0 : rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1 ;
    public final void rule__TermoAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5434:1: ( rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1 )
            // InternalT5.g:5435:2: rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__TermoAritmetico__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermoAritmetico__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Group__0"


    // $ANTLR start "rule__TermoAritmetico__Group__0__Impl"
    // InternalT5.g:5442:1: rule__TermoAritmetico__Group__0__Impl : ( ( rule__TermoAritmetico__FatoresAssignment_0 ) ) ;
    public final void rule__TermoAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5446:1: ( ( ( rule__TermoAritmetico__FatoresAssignment_0 ) ) )
            // InternalT5.g:5447:1: ( ( rule__TermoAritmetico__FatoresAssignment_0 ) )
            {
            // InternalT5.g:5447:1: ( ( rule__TermoAritmetico__FatoresAssignment_0 ) )
            // InternalT5.g:5448:2: ( rule__TermoAritmetico__FatoresAssignment_0 )
            {
             before(grammarAccess.getTermoAritmeticoAccess().getFatoresAssignment_0()); 
            // InternalT5.g:5449:2: ( rule__TermoAritmetico__FatoresAssignment_0 )
            // InternalT5.g:5449:3: rule__TermoAritmetico__FatoresAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TermoAritmetico__FatoresAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermoAritmeticoAccess().getFatoresAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Group__0__Impl"


    // $ANTLR start "rule__TermoAritmetico__Group__1"
    // InternalT5.g:5457:1: rule__TermoAritmetico__Group__1 : rule__TermoAritmetico__Group__1__Impl ;
    public final void rule__TermoAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5461:1: ( rule__TermoAritmetico__Group__1__Impl )
            // InternalT5.g:5462:2: rule__TermoAritmetico__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermoAritmetico__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Group__1"


    // $ANTLR start "rule__TermoAritmetico__Group__1__Impl"
    // InternalT5.g:5468:1: rule__TermoAritmetico__Group__1__Impl : ( ( rule__TermoAritmetico__OutrosAssignment_1 )* ) ;
    public final void rule__TermoAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5472:1: ( ( ( rule__TermoAritmetico__OutrosAssignment_1 )* ) )
            // InternalT5.g:5473:1: ( ( rule__TermoAritmetico__OutrosAssignment_1 )* )
            {
            // InternalT5.g:5473:1: ( ( rule__TermoAritmetico__OutrosAssignment_1 )* )
            // InternalT5.g:5474:2: ( rule__TermoAritmetico__OutrosAssignment_1 )*
            {
             before(grammarAccess.getTermoAritmeticoAccess().getOutrosAssignment_1()); 
            // InternalT5.g:5475:2: ( rule__TermoAritmetico__OutrosAssignment_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=20 && LA48_0<=21)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalT5.g:5475:3: rule__TermoAritmetico__OutrosAssignment_1
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__TermoAritmetico__OutrosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getTermoAritmeticoAccess().getOutrosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__Group__1__Impl"


    // $ANTLR start "rule__OutroFatorAritmetico__Group__0"
    // InternalT5.g:5484:1: rule__OutroFatorAritmetico__Group__0 : rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1 ;
    public final void rule__OutroFatorAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5488:1: ( rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1 )
            // InternalT5.g:5489:2: rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__OutroFatorAritmetico__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__Group__0"


    // $ANTLR start "rule__OutroFatorAritmetico__Group__0__Impl"
    // InternalT5.g:5496:1: rule__OutroFatorAritmetico__Group__0__Impl : ( ( rule__OutroFatorAritmetico__OpAssignment_0 ) ) ;
    public final void rule__OutroFatorAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5500:1: ( ( ( rule__OutroFatorAritmetico__OpAssignment_0 ) ) )
            // InternalT5.g:5501:1: ( ( rule__OutroFatorAritmetico__OpAssignment_0 ) )
            {
            // InternalT5.g:5501:1: ( ( rule__OutroFatorAritmetico__OpAssignment_0 ) )
            // InternalT5.g:5502:2: ( rule__OutroFatorAritmetico__OpAssignment_0 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getOpAssignment_0()); 
            // InternalT5.g:5503:2: ( rule__OutroFatorAritmetico__OpAssignment_0 )
            // InternalT5.g:5503:3: rule__OutroFatorAritmetico__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutroFatorAritmeticoAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__Group__0__Impl"


    // $ANTLR start "rule__OutroFatorAritmetico__Group__1"
    // InternalT5.g:5511:1: rule__OutroFatorAritmetico__Group__1 : rule__OutroFatorAritmetico__Group__1__Impl ;
    public final void rule__OutroFatorAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5515:1: ( rule__OutroFatorAritmetico__Group__1__Impl )
            // InternalT5.g:5516:2: rule__OutroFatorAritmetico__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__Group__1"


    // $ANTLR start "rule__OutroFatorAritmetico__Group__1__Impl"
    // InternalT5.g:5522:1: rule__OutroFatorAritmetico__Group__1__Impl : ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) ) ;
    public final void rule__OutroFatorAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5526:1: ( ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) ) )
            // InternalT5.g:5527:1: ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) )
            {
            // InternalT5.g:5527:1: ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) )
            // InternalT5.g:5528:2: ( rule__OutroFatorAritmetico__FatorAssignment_1 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getFatorAssignment_1()); 
            // InternalT5.g:5529:2: ( rule__OutroFatorAritmetico__FatorAssignment_1 )
            // InternalT5.g:5529:3: rule__OutroFatorAritmetico__FatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OutroFatorAritmetico__FatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutroFatorAritmeticoAccess().getFatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__Group__1__Impl"


    // $ANTLR start "rule__FatorAritmetico__Group_0__0"
    // InternalT5.g:5538:1: rule__FatorAritmetico__Group_0__0 : rule__FatorAritmetico__Group_0__0__Impl rule__FatorAritmetico__Group_0__1 ;
    public final void rule__FatorAritmetico__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5542:1: ( rule__FatorAritmetico__Group_0__0__Impl rule__FatorAritmetico__Group_0__1 )
            // InternalT5.g:5543:2: rule__FatorAritmetico__Group_0__0__Impl rule__FatorAritmetico__Group_0__1
            {
            pushFollow(FOLLOW_31);
            rule__FatorAritmetico__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_0__0"


    // $ANTLR start "rule__FatorAritmetico__Group_0__0__Impl"
    // InternalT5.g:5550:1: rule__FatorAritmetico__Group_0__0__Impl : ( ( '^' )? ) ;
    public final void rule__FatorAritmetico__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5554:1: ( ( ( '^' )? ) )
            // InternalT5.g:5555:1: ( ( '^' )? )
            {
            // InternalT5.g:5555:1: ( ( '^' )? )
            // InternalT5.g:5556:2: ( '^' )?
            {
             before(grammarAccess.getFatorAritmeticoAccess().getCircumflexAccentKeyword_0_0()); 
            // InternalT5.g:5557:2: ( '^' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==49) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalT5.g:5557:3: '^'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFatorAritmeticoAccess().getCircumflexAccentKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_0__0__Impl"


    // $ANTLR start "rule__FatorAritmetico__Group_0__1"
    // InternalT5.g:5565:1: rule__FatorAritmetico__Group_0__1 : rule__FatorAritmetico__Group_0__1__Impl ;
    public final void rule__FatorAritmetico__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5569:1: ( rule__FatorAritmetico__Group_0__1__Impl )
            // InternalT5.g:5570:2: rule__FatorAritmetico__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_0__1"


    // $ANTLR start "rule__FatorAritmetico__Group_0__1__Impl"
    // InternalT5.g:5576:1: rule__FatorAritmetico__Group_0__1__Impl : ( ( rule__FatorAritmetico__RefAssignment_0_1 ) ) ;
    public final void rule__FatorAritmetico__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5580:1: ( ( ( rule__FatorAritmetico__RefAssignment_0_1 ) ) )
            // InternalT5.g:5581:1: ( ( rule__FatorAritmetico__RefAssignment_0_1 ) )
            {
            // InternalT5.g:5581:1: ( ( rule__FatorAritmetico__RefAssignment_0_1 ) )
            // InternalT5.g:5582:2: ( rule__FatorAritmetico__RefAssignment_0_1 )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getRefAssignment_0_1()); 
            // InternalT5.g:5583:2: ( rule__FatorAritmetico__RefAssignment_0_1 )
            // InternalT5.g:5583:3: rule__FatorAritmetico__RefAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__RefAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFatorAritmeticoAccess().getRefAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_0__1__Impl"


    // $ANTLR start "rule__FatorAritmetico__Group_3__0"
    // InternalT5.g:5592:1: rule__FatorAritmetico__Group_3__0 : rule__FatorAritmetico__Group_3__0__Impl rule__FatorAritmetico__Group_3__1 ;
    public final void rule__FatorAritmetico__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5596:1: ( rule__FatorAritmetico__Group_3__0__Impl rule__FatorAritmetico__Group_3__1 )
            // InternalT5.g:5597:2: rule__FatorAritmetico__Group_3__0__Impl rule__FatorAritmetico__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__FatorAritmetico__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_3__0"


    // $ANTLR start "rule__FatorAritmetico__Group_3__0__Impl"
    // InternalT5.g:5604:1: rule__FatorAritmetico__Group_3__0__Impl : ( '(' ) ;
    public final void rule__FatorAritmetico__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5608:1: ( ( '(' ) )
            // InternalT5.g:5609:1: ( '(' )
            {
            // InternalT5.g:5609:1: ( '(' )
            // InternalT5.g:5610:2: '('
            {
             before(grammarAccess.getFatorAritmeticoAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFatorAritmeticoAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_3__0__Impl"


    // $ANTLR start "rule__FatorAritmetico__Group_3__1"
    // InternalT5.g:5619:1: rule__FatorAritmetico__Group_3__1 : rule__FatorAritmetico__Group_3__1__Impl rule__FatorAritmetico__Group_3__2 ;
    public final void rule__FatorAritmetico__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5623:1: ( rule__FatorAritmetico__Group_3__1__Impl rule__FatorAritmetico__Group_3__2 )
            // InternalT5.g:5624:2: rule__FatorAritmetico__Group_3__1__Impl rule__FatorAritmetico__Group_3__2
            {
            pushFollow(FOLLOW_54);
            rule__FatorAritmetico__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_3__1"


    // $ANTLR start "rule__FatorAritmetico__Group_3__1__Impl"
    // InternalT5.g:5631:1: rule__FatorAritmetico__Group_3__1__Impl : ( ( rule__FatorAritmetico__ExpAssignment_3_1 ) ) ;
    public final void rule__FatorAritmetico__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5635:1: ( ( ( rule__FatorAritmetico__ExpAssignment_3_1 ) ) )
            // InternalT5.g:5636:1: ( ( rule__FatorAritmetico__ExpAssignment_3_1 ) )
            {
            // InternalT5.g:5636:1: ( ( rule__FatorAritmetico__ExpAssignment_3_1 ) )
            // InternalT5.g:5637:2: ( rule__FatorAritmetico__ExpAssignment_3_1 )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getExpAssignment_3_1()); 
            // InternalT5.g:5638:2: ( rule__FatorAritmetico__ExpAssignment_3_1 )
            // InternalT5.g:5638:3: rule__FatorAritmetico__ExpAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__ExpAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFatorAritmeticoAccess().getExpAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_3__1__Impl"


    // $ANTLR start "rule__FatorAritmetico__Group_3__2"
    // InternalT5.g:5646:1: rule__FatorAritmetico__Group_3__2 : rule__FatorAritmetico__Group_3__2__Impl ;
    public final void rule__FatorAritmetico__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5650:1: ( rule__FatorAritmetico__Group_3__2__Impl )
            // InternalT5.g:5651:2: rule__FatorAritmetico__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FatorAritmetico__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_3__2"


    // $ANTLR start "rule__FatorAritmetico__Group_3__2__Impl"
    // InternalT5.g:5657:1: rule__FatorAritmetico__Group_3__2__Impl : ( ')' ) ;
    public final void rule__FatorAritmetico__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5661:1: ( ( ')' ) )
            // InternalT5.g:5662:1: ( ')' )
            {
            // InternalT5.g:5662:1: ( ')' )
            // InternalT5.g:5663:2: ')'
            {
             before(grammarAccess.getFatorAritmeticoAccess().getRightParenthesisKeyword_3_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFatorAritmeticoAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__Group_3__2__Impl"


    // $ANTLR start "rule__Expressao__Group__0"
    // InternalT5.g:5673:1: rule__Expressao__Group__0 : rule__Expressao__Group__0__Impl rule__Expressao__Group__1 ;
    public final void rule__Expressao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5677:1: ( rule__Expressao__Group__0__Impl rule__Expressao__Group__1 )
            // InternalT5.g:5678:2: rule__Expressao__Group__0__Impl rule__Expressao__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__Expressao__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expressao__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__0"


    // $ANTLR start "rule__Expressao__Group__0__Impl"
    // InternalT5.g:5685:1: rule__Expressao__Group__0__Impl : ( ( rule__Expressao__LogicosAssignment_0 ) ) ;
    public final void rule__Expressao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5689:1: ( ( ( rule__Expressao__LogicosAssignment_0 ) ) )
            // InternalT5.g:5690:1: ( ( rule__Expressao__LogicosAssignment_0 ) )
            {
            // InternalT5.g:5690:1: ( ( rule__Expressao__LogicosAssignment_0 ) )
            // InternalT5.g:5691:2: ( rule__Expressao__LogicosAssignment_0 )
            {
             before(grammarAccess.getExpressaoAccess().getLogicosAssignment_0()); 
            // InternalT5.g:5692:2: ( rule__Expressao__LogicosAssignment_0 )
            // InternalT5.g:5692:3: rule__Expressao__LogicosAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__LogicosAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getLogicosAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__0__Impl"


    // $ANTLR start "rule__Expressao__Group__1"
    // InternalT5.g:5700:1: rule__Expressao__Group__1 : rule__Expressao__Group__1__Impl ;
    public final void rule__Expressao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5704:1: ( rule__Expressao__Group__1__Impl )
            // InternalT5.g:5705:2: rule__Expressao__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__1"


    // $ANTLR start "rule__Expressao__Group__1__Impl"
    // InternalT5.g:5711:1: rule__Expressao__Group__1__Impl : ( ( rule__Expressao__Group_1__0 )* ) ;
    public final void rule__Expressao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5715:1: ( ( ( rule__Expressao__Group_1__0 )* ) )
            // InternalT5.g:5716:1: ( ( rule__Expressao__Group_1__0 )* )
            {
            // InternalT5.g:5716:1: ( ( rule__Expressao__Group_1__0 )* )
            // InternalT5.g:5717:2: ( rule__Expressao__Group_1__0 )*
            {
             before(grammarAccess.getExpressaoAccess().getGroup_1()); 
            // InternalT5.g:5718:2: ( rule__Expressao__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=28 && LA50_0<=29)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalT5.g:5718:3: rule__Expressao__Group_1__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__Expressao__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getExpressaoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group__1__Impl"


    // $ANTLR start "rule__Expressao__Group_1__0"
    // InternalT5.g:5727:1: rule__Expressao__Group_1__0 : rule__Expressao__Group_1__0__Impl rule__Expressao__Group_1__1 ;
    public final void rule__Expressao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5731:1: ( rule__Expressao__Group_1__0__Impl rule__Expressao__Group_1__1 )
            // InternalT5.g:5732:2: rule__Expressao__Group_1__0__Impl rule__Expressao__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Expressao__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expressao__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group_1__0"


    // $ANTLR start "rule__Expressao__Group_1__0__Impl"
    // InternalT5.g:5739:1: rule__Expressao__Group_1__0__Impl : ( ( rule__Expressao__OpAssignment_1_0 ) ) ;
    public final void rule__Expressao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5743:1: ( ( ( rule__Expressao__OpAssignment_1_0 ) ) )
            // InternalT5.g:5744:1: ( ( rule__Expressao__OpAssignment_1_0 ) )
            {
            // InternalT5.g:5744:1: ( ( rule__Expressao__OpAssignment_1_0 ) )
            // InternalT5.g:5745:2: ( rule__Expressao__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressaoAccess().getOpAssignment_1_0()); 
            // InternalT5.g:5746:2: ( rule__Expressao__OpAssignment_1_0 )
            // InternalT5.g:5746:3: rule__Expressao__OpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group_1__0__Impl"


    // $ANTLR start "rule__Expressao__Group_1__1"
    // InternalT5.g:5754:1: rule__Expressao__Group_1__1 : rule__Expressao__Group_1__1__Impl ;
    public final void rule__Expressao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5758:1: ( rule__Expressao__Group_1__1__Impl )
            // InternalT5.g:5759:2: rule__Expressao__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group_1__1"


    // $ANTLR start "rule__Expressao__Group_1__1__Impl"
    // InternalT5.g:5765:1: rule__Expressao__Group_1__1__Impl : ( ( rule__Expressao__LogicosAssignment_1_1 ) ) ;
    public final void rule__Expressao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5769:1: ( ( ( rule__Expressao__LogicosAssignment_1_1 ) ) )
            // InternalT5.g:5770:1: ( ( rule__Expressao__LogicosAssignment_1_1 ) )
            {
            // InternalT5.g:5770:1: ( ( rule__Expressao__LogicosAssignment_1_1 ) )
            // InternalT5.g:5771:2: ( rule__Expressao__LogicosAssignment_1_1 )
            {
             before(grammarAccess.getExpressaoAccess().getLogicosAssignment_1_1()); 
            // InternalT5.g:5772:2: ( rule__Expressao__LogicosAssignment_1_1 )
            // InternalT5.g:5772:3: rule__Expressao__LogicosAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expressao__LogicosAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoAccess().getLogicosAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__Group_1__1__Impl"


    // $ANTLR start "rule__TermoLogico__Group__0"
    // InternalT5.g:5781:1: rule__TermoLogico__Group__0 : rule__TermoLogico__Group__0__Impl rule__TermoLogico__Group__1 ;
    public final void rule__TermoLogico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5785:1: ( rule__TermoLogico__Group__0__Impl rule__TermoLogico__Group__1 )
            // InternalT5.g:5786:2: rule__TermoLogico__Group__0__Impl rule__TermoLogico__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__TermoLogico__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermoLogico__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoLogico__Group__0"


    // $ANTLR start "rule__TermoLogico__Group__0__Impl"
    // InternalT5.g:5793:1: rule__TermoLogico__Group__0__Impl : ( ( 'nao' )? ) ;
    public final void rule__TermoLogico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5797:1: ( ( ( 'nao' )? ) )
            // InternalT5.g:5798:1: ( ( 'nao' )? )
            {
            // InternalT5.g:5798:1: ( ( 'nao' )? )
            // InternalT5.g:5799:2: ( 'nao' )?
            {
             before(grammarAccess.getTermoLogicoAccess().getNaoKeyword_0()); 
            // InternalT5.g:5800:2: ( 'nao' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==69) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalT5.g:5800:3: 'nao'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTermoLogicoAccess().getNaoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoLogico__Group__0__Impl"


    // $ANTLR start "rule__TermoLogico__Group__1"
    // InternalT5.g:5808:1: rule__TermoLogico__Group__1 : rule__TermoLogico__Group__1__Impl ;
    public final void rule__TermoLogico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5812:1: ( rule__TermoLogico__Group__1__Impl )
            // InternalT5.g:5813:2: rule__TermoLogico__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermoLogico__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoLogico__Group__1"


    // $ANTLR start "rule__TermoLogico__Group__1__Impl"
    // InternalT5.g:5819:1: rule__TermoLogico__Group__1__Impl : ( ( rule__TermoLogico__RelAssignment_1 ) ) ;
    public final void rule__TermoLogico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5823:1: ( ( ( rule__TermoLogico__RelAssignment_1 ) ) )
            // InternalT5.g:5824:1: ( ( rule__TermoLogico__RelAssignment_1 ) )
            {
            // InternalT5.g:5824:1: ( ( rule__TermoLogico__RelAssignment_1 ) )
            // InternalT5.g:5825:2: ( rule__TermoLogico__RelAssignment_1 )
            {
             before(grammarAccess.getTermoLogicoAccess().getRelAssignment_1()); 
            // InternalT5.g:5826:2: ( rule__TermoLogico__RelAssignment_1 )
            // InternalT5.g:5826:3: rule__TermoLogico__RelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TermoLogico__RelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTermoLogicoAccess().getRelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoLogico__Group__1__Impl"


    // $ANTLR start "rule__ExpressaoRelacional__Group__0"
    // InternalT5.g:5835:1: rule__ExpressaoRelacional__Group__0 : rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1 ;
    public final void rule__ExpressaoRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5839:1: ( rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1 )
            // InternalT5.g:5840:2: rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__ExpressaoRelacional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group__0"


    // $ANTLR start "rule__ExpressaoRelacional__Group__0__Impl"
    // InternalT5.g:5847:1: rule__ExpressaoRelacional__Group__0__Impl : ( ( rule__ExpressaoRelacional__LeftAssignment_0 ) ) ;
    public final void rule__ExpressaoRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5851:1: ( ( ( rule__ExpressaoRelacional__LeftAssignment_0 ) ) )
            // InternalT5.g:5852:1: ( ( rule__ExpressaoRelacional__LeftAssignment_0 ) )
            {
            // InternalT5.g:5852:1: ( ( rule__ExpressaoRelacional__LeftAssignment_0 ) )
            // InternalT5.g:5853:2: ( rule__ExpressaoRelacional__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getLeftAssignment_0()); 
            // InternalT5.g:5854:2: ( rule__ExpressaoRelacional__LeftAssignment_0 )
            // InternalT5.g:5854:3: rule__ExpressaoRelacional__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoRelacionalAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group__0__Impl"


    // $ANTLR start "rule__ExpressaoRelacional__Group__1"
    // InternalT5.g:5862:1: rule__ExpressaoRelacional__Group__1 : rule__ExpressaoRelacional__Group__1__Impl ;
    public final void rule__ExpressaoRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5866:1: ( rule__ExpressaoRelacional__Group__1__Impl )
            // InternalT5.g:5867:2: rule__ExpressaoRelacional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group__1"


    // $ANTLR start "rule__ExpressaoRelacional__Group__1__Impl"
    // InternalT5.g:5873:1: rule__ExpressaoRelacional__Group__1__Impl : ( ( rule__ExpressaoRelacional__Group_1__0 )? ) ;
    public final void rule__ExpressaoRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5877:1: ( ( ( rule__ExpressaoRelacional__Group_1__0 )? ) )
            // InternalT5.g:5878:1: ( ( rule__ExpressaoRelacional__Group_1__0 )? )
            {
            // InternalT5.g:5878:1: ( ( rule__ExpressaoRelacional__Group_1__0 )? )
            // InternalT5.g:5879:2: ( rule__ExpressaoRelacional__Group_1__0 )?
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getGroup_1()); 
            // InternalT5.g:5880:2: ( rule__ExpressaoRelacional__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=22 && LA52_0<=27)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalT5.g:5880:3: rule__ExpressaoRelacional__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressaoRelacional__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressaoRelacionalAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group__1__Impl"


    // $ANTLR start "rule__ExpressaoRelacional__Group_1__0"
    // InternalT5.g:5889:1: rule__ExpressaoRelacional__Group_1__0 : rule__ExpressaoRelacional__Group_1__0__Impl rule__ExpressaoRelacional__Group_1__1 ;
    public final void rule__ExpressaoRelacional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5893:1: ( rule__ExpressaoRelacional__Group_1__0__Impl rule__ExpressaoRelacional__Group_1__1 )
            // InternalT5.g:5894:2: rule__ExpressaoRelacional__Group_1__0__Impl rule__ExpressaoRelacional__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__ExpressaoRelacional__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group_1__0"


    // $ANTLR start "rule__ExpressaoRelacional__Group_1__0__Impl"
    // InternalT5.g:5901:1: rule__ExpressaoRelacional__Group_1__0__Impl : ( ( rule__ExpressaoRelacional__OpAssignment_1_0 ) ) ;
    public final void rule__ExpressaoRelacional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5905:1: ( ( ( rule__ExpressaoRelacional__OpAssignment_1_0 ) ) )
            // InternalT5.g:5906:1: ( ( rule__ExpressaoRelacional__OpAssignment_1_0 ) )
            {
            // InternalT5.g:5906:1: ( ( rule__ExpressaoRelacional__OpAssignment_1_0 ) )
            // InternalT5.g:5907:2: ( rule__ExpressaoRelacional__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getOpAssignment_1_0()); 
            // InternalT5.g:5908:2: ( rule__ExpressaoRelacional__OpAssignment_1_0 )
            // InternalT5.g:5908:3: rule__ExpressaoRelacional__OpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__OpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoRelacionalAccess().getOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressaoRelacional__Group_1__1"
    // InternalT5.g:5916:1: rule__ExpressaoRelacional__Group_1__1 : rule__ExpressaoRelacional__Group_1__1__Impl ;
    public final void rule__ExpressaoRelacional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5920:1: ( rule__ExpressaoRelacional__Group_1__1__Impl )
            // InternalT5.g:5921:2: rule__ExpressaoRelacional__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group_1__1"


    // $ANTLR start "rule__ExpressaoRelacional__Group_1__1__Impl"
    // InternalT5.g:5927:1: rule__ExpressaoRelacional__Group_1__1__Impl : ( ( rule__ExpressaoRelacional__RightAssignment_1_1 ) ) ;
    public final void rule__ExpressaoRelacional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5931:1: ( ( ( rule__ExpressaoRelacional__RightAssignment_1_1 ) ) )
            // InternalT5.g:5932:1: ( ( rule__ExpressaoRelacional__RightAssignment_1_1 ) )
            {
            // InternalT5.g:5932:1: ( ( rule__ExpressaoRelacional__RightAssignment_1_1 ) )
            // InternalT5.g:5933:2: ( rule__ExpressaoRelacional__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getRightAssignment_1_1()); 
            // InternalT5.g:5934:2: ( rule__ExpressaoRelacional__RightAssignment_1_1 )
            // InternalT5.g:5934:3: rule__ExpressaoRelacional__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressaoRelacional__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressaoRelacionalAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__Group_1__1__Impl"


    // $ANTLR start "rule__Programa__DeclaracoesAssignment_1"
    // InternalT5.g:5943:1: rule__Programa__DeclaracoesAssignment_1 : ( ruleDeclaracao ) ;
    public final void rule__Programa__DeclaracoesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5947:1: ( ( ruleDeclaracao ) )
            // InternalT5.g:5948:2: ( ruleDeclaracao )
            {
            // InternalT5.g:5948:2: ( ruleDeclaracao )
            // InternalT5.g:5949:3: ruleDeclaracao
            {
             before(grammarAccess.getProgramaAccess().getDeclaracoesDeclaracaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaracao();

            state._fsp--;

             after(grammarAccess.getProgramaAccess().getDeclaracoesDeclaracaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__DeclaracoesAssignment_1"


    // $ANTLR start "rule__Programa__CorpoAssignment_3"
    // InternalT5.g:5958:1: rule__Programa__CorpoAssignment_3 : ( ruleCorpo ) ;
    public final void rule__Programa__CorpoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5962:1: ( ( ruleCorpo ) )
            // InternalT5.g:5963:2: ( ruleCorpo )
            {
            // InternalT5.g:5963:2: ( ruleCorpo )
            // InternalT5.g:5964:3: ruleCorpo
            {
             before(grammarAccess.getProgramaAccess().getCorpoCorpoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCorpo();

            state._fsp--;

             after(grammarAccess.getProgramaAccess().getCorpoCorpoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programa__CorpoAssignment_3"


    // $ANTLR start "rule__DeclaracaoLocal__VariaveisAssignment_0_1"
    // InternalT5.g:5973:1: rule__DeclaracaoLocal__VariaveisAssignment_0_1 : ( ruleVariavel ) ;
    public final void rule__DeclaracaoLocal__VariaveisAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5977:1: ( ( ruleVariavel ) )
            // InternalT5.g:5978:2: ( ruleVariavel )
            {
            // InternalT5.g:5978:2: ( ruleVariavel )
            // InternalT5.g:5979:3: ruleVariavel
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getVariaveisVariavelParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavel();

            state._fsp--;

             after(grammarAccess.getDeclaracaoLocalAccess().getVariaveisVariavelParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__VariaveisAssignment_0_1"


    // $ANTLR start "rule__DeclaracaoLocal__VariaveisAssignment_0_2_1"
    // InternalT5.g:5988:1: rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 : ( ruleVariavel ) ;
    public final void rule__DeclaracaoLocal__VariaveisAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5992:1: ( ( ruleVariavel ) )
            // InternalT5.g:5993:2: ( ruleVariavel )
            {
            // InternalT5.g:5993:2: ( ruleVariavel )
            // InternalT5.g:5994:3: ruleVariavel
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getVariaveisVariavelParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavel();

            state._fsp--;

             after(grammarAccess.getDeclaracaoLocalAccess().getVariaveisVariavelParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__VariaveisAssignment_0_2_1"


    // $ANTLR start "rule__DeclaracaoLocal__NameAssignment_1_1"
    // InternalT5.g:6003:1: rule__DeclaracaoLocal__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeclaracaoLocal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6007:1: ( ( RULE_ID ) )
            // InternalT5.g:6008:2: ( RULE_ID )
            {
            // InternalT5.g:6008:2: ( RULE_ID )
            // InternalT5.g:6009:3: RULE_ID
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__NameAssignment_1_1"


    // $ANTLR start "rule__DeclaracaoLocal__TipoBasicoAssignment_1_3"
    // InternalT5.g:6018:1: rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 : ( ruleTipoBasico ) ;
    public final void rule__DeclaracaoLocal__TipoBasicoAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6022:1: ( ( ruleTipoBasico ) )
            // InternalT5.g:6023:2: ( ruleTipoBasico )
            {
            // InternalT5.g:6023:2: ( ruleTipoBasico )
            // InternalT5.g:6024:3: ruleTipoBasico
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getTipoBasicoTipoBasicoParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoBasico();

            state._fsp--;

             after(grammarAccess.getDeclaracaoLocalAccess().getTipoBasicoTipoBasicoParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__TipoBasicoAssignment_1_3"


    // $ANTLR start "rule__DeclaracaoLocal__ValorAssignment_1_5"
    // InternalT5.g:6033:1: rule__DeclaracaoLocal__ValorAssignment_1_5 : ( ruleValorConstante ) ;
    public final void rule__DeclaracaoLocal__ValorAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6037:1: ( ( ruleValorConstante ) )
            // InternalT5.g:6038:2: ( ruleValorConstante )
            {
            // InternalT5.g:6038:2: ( ruleValorConstante )
            // InternalT5.g:6039:3: ruleValorConstante
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getValorValorConstanteParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleValorConstante();

            state._fsp--;

             after(grammarAccess.getDeclaracaoLocalAccess().getValorValorConstanteParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__ValorAssignment_1_5"


    // $ANTLR start "rule__DeclaracaoLocal__NameAssignment_2_1"
    // InternalT5.g:6048:1: rule__DeclaracaoLocal__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__DeclaracaoLocal__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6052:1: ( ( RULE_ID ) )
            // InternalT5.g:6053:2: ( RULE_ID )
            {
            // InternalT5.g:6053:2: ( RULE_ID )
            // InternalT5.g:6054:3: RULE_ID
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoLocalAccess().getNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__NameAssignment_2_1"


    // $ANTLR start "rule__DeclaracaoLocal__TipoDefAssignment_2_3"
    // InternalT5.g:6063:1: rule__DeclaracaoLocal__TipoDefAssignment_2_3 : ( ruleTipo ) ;
    public final void rule__DeclaracaoLocal__TipoDefAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6067:1: ( ( ruleTipo ) )
            // InternalT5.g:6068:2: ( ruleTipo )
            {
            // InternalT5.g:6068:2: ( ruleTipo )
            // InternalT5.g:6069:3: ruleTipo
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getTipoDefTipoParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getDeclaracaoLocalAccess().getTipoDefTipoParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoLocal__TipoDefAssignment_2_3"


    // $ANTLR start "rule__DeclaracaoGlobal__NameAssignment_0_1"
    // InternalT5.g:6078:1: rule__DeclaracaoGlobal__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__DeclaracaoGlobal__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6082:1: ( ( RULE_ID ) )
            // InternalT5.g:6083:2: ( RULE_ID )
            {
            // InternalT5.g:6083:2: ( RULE_ID )
            // InternalT5.g:6084:3: RULE_ID
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__NameAssignment_0_1"


    // $ANTLR start "rule__DeclaracaoGlobal__ParametrosAssignment_0_3"
    // InternalT5.g:6093:1: rule__DeclaracaoGlobal__ParametrosAssignment_0_3 : ( ruleParametros ) ;
    public final void rule__DeclaracaoGlobal__ParametrosAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6097:1: ( ( ruleParametros ) )
            // InternalT5.g:6098:2: ( ruleParametros )
            {
            // InternalT5.g:6098:2: ( ruleParametros )
            // InternalT5.g:6099:3: ruleParametros
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getParametrosParametrosParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParametros();

            state._fsp--;

             after(grammarAccess.getDeclaracaoGlobalAccess().getParametrosParametrosParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__ParametrosAssignment_0_3"


    // $ANTLR start "rule__DeclaracaoGlobal__CorpoAssignment_0_5"
    // InternalT5.g:6108:1: rule__DeclaracaoGlobal__CorpoAssignment_0_5 : ( ruleCorpo ) ;
    public final void rule__DeclaracaoGlobal__CorpoAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6112:1: ( ( ruleCorpo ) )
            // InternalT5.g:6113:2: ( ruleCorpo )
            {
            // InternalT5.g:6113:2: ( ruleCorpo )
            // InternalT5.g:6114:3: ruleCorpo
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getCorpoCorpoParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCorpo();

            state._fsp--;

             after(grammarAccess.getDeclaracaoGlobalAccess().getCorpoCorpoParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__CorpoAssignment_0_5"


    // $ANTLR start "rule__DeclaracaoGlobal__NameAssignment_1_1"
    // InternalT5.g:6123:1: rule__DeclaracaoGlobal__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeclaracaoGlobal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6127:1: ( ( RULE_ID ) )
            // InternalT5.g:6128:2: ( RULE_ID )
            {
            // InternalT5.g:6128:2: ( RULE_ID )
            // InternalT5.g:6129:3: RULE_ID
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaracaoGlobalAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__NameAssignment_1_1"


    // $ANTLR start "rule__DeclaracaoGlobal__ParametrosAssignment_1_3"
    // InternalT5.g:6138:1: rule__DeclaracaoGlobal__ParametrosAssignment_1_3 : ( ruleParametros ) ;
    public final void rule__DeclaracaoGlobal__ParametrosAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6142:1: ( ( ruleParametros ) )
            // InternalT5.g:6143:2: ( ruleParametros )
            {
            // InternalT5.g:6143:2: ( ruleParametros )
            // InternalT5.g:6144:3: ruleParametros
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getParametrosParametrosParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParametros();

            state._fsp--;

             after(grammarAccess.getDeclaracaoGlobalAccess().getParametrosParametrosParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__ParametrosAssignment_1_3"


    // $ANTLR start "rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6"
    // InternalT5.g:6153:1: rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 : ( ruleTipoEstendido ) ;
    public final void rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6157:1: ( ( ruleTipoEstendido ) )
            // InternalT5.g:6158:2: ( ruleTipoEstendido )
            {
            // InternalT5.g:6158:2: ( ruleTipoEstendido )
            // InternalT5.g:6159:3: ruleTipoEstendido
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getTipoRetornoTipoEstendidoParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoEstendido();

            state._fsp--;

             after(grammarAccess.getDeclaracaoGlobalAccess().getTipoRetornoTipoEstendidoParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6"


    // $ANTLR start "rule__DeclaracaoGlobal__CorpoAssignment_1_7"
    // InternalT5.g:6168:1: rule__DeclaracaoGlobal__CorpoAssignment_1_7 : ( ruleCorpo ) ;
    public final void rule__DeclaracaoGlobal__CorpoAssignment_1_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6172:1: ( ( ruleCorpo ) )
            // InternalT5.g:6173:2: ( ruleCorpo )
            {
            // InternalT5.g:6173:2: ( ruleCorpo )
            // InternalT5.g:6174:3: ruleCorpo
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getCorpoCorpoParserRuleCall_1_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCorpo();

            state._fsp--;

             after(grammarAccess.getDeclaracaoGlobalAccess().getCorpoCorpoParserRuleCall_1_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaracaoGlobal__CorpoAssignment_1_7"


    // $ANTLR start "rule__Variavel__IdAssignment_0"
    // InternalT5.g:6183:1: rule__Variavel__IdAssignment_0 : ( ruleIdentificador ) ;
    public final void rule__Variavel__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6187:1: ( ( ruleIdentificador ) )
            // InternalT5.g:6188:2: ( ruleIdentificador )
            {
            // InternalT5.g:6188:2: ( ruleIdentificador )
            // InternalT5.g:6189:3: ruleIdentificador
            {
             before(grammarAccess.getVariavelAccess().getIdIdentificadorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentificador();

            state._fsp--;

             after(grammarAccess.getVariavelAccess().getIdIdentificadorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__IdAssignment_0"


    // $ANTLR start "rule__Variavel__TipoVarAssignment_2"
    // InternalT5.g:6198:1: rule__Variavel__TipoVarAssignment_2 : ( ruleTipo ) ;
    public final void rule__Variavel__TipoVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6202:1: ( ( ruleTipo ) )
            // InternalT5.g:6203:2: ( ruleTipo )
            {
            // InternalT5.g:6203:2: ( ruleTipo )
            // InternalT5.g:6204:3: ruleTipo
            {
             before(grammarAccess.getVariavelAccess().getTipoVarTipoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTipo();

            state._fsp--;

             after(grammarAccess.getVariavelAccess().getTipoVarTipoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variavel__TipoVarAssignment_2"


    // $ANTLR start "rule__Identificador__DimensoesAssignment_2"
    // InternalT5.g:6213:1: rule__Identificador__DimensoesAssignment_2 : ( ruleDimensao ) ;
    public final void rule__Identificador__DimensoesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6217:1: ( ( ruleDimensao ) )
            // InternalT5.g:6218:2: ( ruleDimensao )
            {
            // InternalT5.g:6218:2: ( ruleDimensao )
            // InternalT5.g:6219:3: ruleDimensao
            {
             before(grammarAccess.getIdentificadorAccess().getDimensoesDimensaoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDimensao();

            state._fsp--;

             after(grammarAccess.getIdentificadorAccess().getDimensoesDimensaoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identificador__DimensoesAssignment_2"


    // $ANTLR start "rule__Dimensao__ExpAssignment_1"
    // InternalT5.g:6228:1: rule__Dimensao__ExpAssignment_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__Dimensao__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6232:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:6233:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:6233:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:6234:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getDimensaoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getDimensaoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimensao__ExpAssignment_1"


    // $ANTLR start "rule__Tipo__RegistroAssignment_0"
    // InternalT5.g:6243:1: rule__Tipo__RegistroAssignment_0 : ( ruleRegistro ) ;
    public final void rule__Tipo__RegistroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6247:1: ( ( ruleRegistro ) )
            // InternalT5.g:6248:2: ( ruleRegistro )
            {
            // InternalT5.g:6248:2: ( ruleRegistro )
            // InternalT5.g:6249:3: ruleRegistro
            {
             before(grammarAccess.getTipoAccess().getRegistroRegistroParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRegistro();

            state._fsp--;

             after(grammarAccess.getTipoAccess().getRegistroRegistroParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tipo__RegistroAssignment_0"


    // $ANTLR start "rule__Tipo__TipoExtAssignment_1"
    // InternalT5.g:6258:1: rule__Tipo__TipoExtAssignment_1 : ( ruleTipoEstendido ) ;
    public final void rule__Tipo__TipoExtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6262:1: ( ( ruleTipoEstendido ) )
            // InternalT5.g:6263:2: ( ruleTipoEstendido )
            {
            // InternalT5.g:6263:2: ( ruleTipoEstendido )
            // InternalT5.g:6264:3: ruleTipoEstendido
            {
             before(grammarAccess.getTipoAccess().getTipoExtTipoEstendidoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoEstendido();

            state._fsp--;

             after(grammarAccess.getTipoAccess().getTipoExtTipoEstendidoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tipo__TipoExtAssignment_1"


    // $ANTLR start "rule__Registro__CamposAssignment_1"
    // InternalT5.g:6273:1: rule__Registro__CamposAssignment_1 : ( ruleVariavel ) ;
    public final void rule__Registro__CamposAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6277:1: ( ( ruleVariavel ) )
            // InternalT5.g:6278:2: ( ruleVariavel )
            {
            // InternalT5.g:6278:2: ( ruleVariavel )
            // InternalT5.g:6279:3: ruleVariavel
            {
             before(grammarAccess.getRegistroAccess().getCamposVariavelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariavel();

            state._fsp--;

             after(grammarAccess.getRegistroAccess().getCamposVariavelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registro__CamposAssignment_1"


    // $ANTLR start "rule__TipoEstendido__BasicAssignment_1_0"
    // InternalT5.g:6288:1: rule__TipoEstendido__BasicAssignment_1_0 : ( ruleTipoBasico ) ;
    public final void rule__TipoEstendido__BasicAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6292:1: ( ( ruleTipoBasico ) )
            // InternalT5.g:6293:2: ( ruleTipoBasico )
            {
            // InternalT5.g:6293:2: ( ruleTipoBasico )
            // InternalT5.g:6294:3: ruleTipoBasico
            {
             before(grammarAccess.getTipoEstendidoAccess().getBasicTipoBasicoParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoBasico();

            state._fsp--;

             after(grammarAccess.getTipoEstendidoAccess().getBasicTipoBasicoParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoEstendido__BasicAssignment_1_0"


    // $ANTLR start "rule__TipoEstendido__RefAssignment_1_1"
    // InternalT5.g:6303:1: rule__TipoEstendido__RefAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TipoEstendido__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6307:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:6308:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:6308:2: ( ( RULE_ID ) )
            // InternalT5.g:6309:3: ( RULE_ID )
            {
             before(grammarAccess.getTipoEstendidoAccess().getRefDeclaracaoCrossReference_1_1_0()); 
            // InternalT5.g:6310:3: ( RULE_ID )
            // InternalT5.g:6311:4: RULE_ID
            {
             before(grammarAccess.getTipoEstendidoAccess().getRefDeclaracaoIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTipoEstendidoAccess().getRefDeclaracaoIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTipoEstendidoAccess().getRefDeclaracaoCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoEstendido__RefAssignment_1_1"


    // $ANTLR start "rule__Parametros__ParametroAssignment_0"
    // InternalT5.g:6322:1: rule__Parametros__ParametroAssignment_0 : ( ruleParametro ) ;
    public final void rule__Parametros__ParametroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6326:1: ( ( ruleParametro ) )
            // InternalT5.g:6327:2: ( ruleParametro )
            {
            // InternalT5.g:6327:2: ( ruleParametro )
            // InternalT5.g:6328:3: ruleParametro
            {
             before(grammarAccess.getParametrosAccess().getParametroParametroParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametrosAccess().getParametroParametroParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__ParametroAssignment_0"


    // $ANTLR start "rule__Parametros__ParametroAssignment_1_1"
    // InternalT5.g:6337:1: rule__Parametros__ParametroAssignment_1_1 : ( ruleParametro ) ;
    public final void rule__Parametros__ParametroAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6341:1: ( ( ruleParametro ) )
            // InternalT5.g:6342:2: ( ruleParametro )
            {
            // InternalT5.g:6342:2: ( ruleParametro )
            // InternalT5.g:6343:3: ruleParametro
            {
             before(grammarAccess.getParametrosAccess().getParametroParametroParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametrosAccess().getParametroParametroParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametros__ParametroAssignment_1_1"


    // $ANTLR start "rule__Parametro__IdsAssignment_1"
    // InternalT5.g:6352:1: rule__Parametro__IdsAssignment_1 : ( ruleIdentificador ) ;
    public final void rule__Parametro__IdsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6356:1: ( ( ruleIdentificador ) )
            // InternalT5.g:6357:2: ( ruleIdentificador )
            {
            // InternalT5.g:6357:2: ( ruleIdentificador )
            // InternalT5.g:6358:3: ruleIdentificador
            {
             before(grammarAccess.getParametroAccess().getIdsIdentificadorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentificador();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getIdsIdentificadorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__IdsAssignment_1"


    // $ANTLR start "rule__Parametro__IdsAssignment_2_1"
    // InternalT5.g:6367:1: rule__Parametro__IdsAssignment_2_1 : ( ruleIdentificador ) ;
    public final void rule__Parametro__IdsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6371:1: ( ( ruleIdentificador ) )
            // InternalT5.g:6372:2: ( ruleIdentificador )
            {
            // InternalT5.g:6372:2: ( ruleIdentificador )
            // InternalT5.g:6373:3: ruleIdentificador
            {
             before(grammarAccess.getParametroAccess().getIdsIdentificadorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIdentificador();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getIdsIdentificadorParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__IdsAssignment_2_1"


    // $ANTLR start "rule__Parametro__TipoParamAssignment_4"
    // InternalT5.g:6382:1: rule__Parametro__TipoParamAssignment_4 : ( ruleTipoEstendido ) ;
    public final void rule__Parametro__TipoParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6386:1: ( ( ruleTipoEstendido ) )
            // InternalT5.g:6387:2: ( ruleTipoEstendido )
            {
            // InternalT5.g:6387:2: ( ruleTipoEstendido )
            // InternalT5.g:6388:3: ruleTipoEstendido
            {
             before(grammarAccess.getParametroAccess().getTipoParamTipoEstendidoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoEstendido();

            state._fsp--;

             after(grammarAccess.getParametroAccess().getTipoParamTipoEstendidoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__TipoParamAssignment_4"


    // $ANTLR start "rule__Corpo__LocaisAssignment_0"
    // InternalT5.g:6397:1: rule__Corpo__LocaisAssignment_0 : ( ruleDeclaracaoLocal ) ;
    public final void rule__Corpo__LocaisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6401:1: ( ( ruleDeclaracaoLocal ) )
            // InternalT5.g:6402:2: ( ruleDeclaracaoLocal )
            {
            // InternalT5.g:6402:2: ( ruleDeclaracaoLocal )
            // InternalT5.g:6403:3: ruleDeclaracaoLocal
            {
             before(grammarAccess.getCorpoAccess().getLocaisDeclaracaoLocalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaracaoLocal();

            state._fsp--;

             after(grammarAccess.getCorpoAccess().getLocaisDeclaracaoLocalParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corpo__LocaisAssignment_0"


    // $ANTLR start "rule__Corpo__ComandosAssignment_1"
    // InternalT5.g:6412:1: rule__Corpo__ComandosAssignment_1 : ( ruleComando ) ;
    public final void rule__Corpo__ComandosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6416:1: ( ( ruleComando ) )
            // InternalT5.g:6417:2: ( ruleComando )
            {
            // InternalT5.g:6417:2: ( ruleComando )
            // InternalT5.g:6418:3: ruleComando
            {
             before(grammarAccess.getCorpoAccess().getComandosComandoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getCorpoAccess().getComandosComandoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Corpo__ComandosAssignment_1"


    // $ANTLR start "rule__ComandoLeia__AlvoAssignment_3"
    // InternalT5.g:6427:1: rule__ComandoLeia__AlvoAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoLeia__AlvoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6431:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:6432:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:6432:2: ( ( RULE_ID ) )
            // InternalT5.g:6433:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoCrossReference_3_0()); 
            // InternalT5.g:6434:3: ( RULE_ID )
            // InternalT5.g:6435:4: RULE_ID
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__AlvoAssignment_3"


    // $ANTLR start "rule__ComandoLeia__AlvoAssignment_4_2"
    // InternalT5.g:6446:1: rule__ComandoLeia__AlvoAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoLeia__AlvoAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6450:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:6451:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:6451:2: ( ( RULE_ID ) )
            // InternalT5.g:6452:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoCrossReference_4_2_0()); 
            // InternalT5.g:6453:3: ( RULE_ID )
            // InternalT5.g:6454:4: RULE_ID
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoLeia__AlvoAssignment_4_2"


    // $ANTLR start "rule__ComandoEscreva__ExpAssignment_2"
    // InternalT5.g:6465:1: rule__ComandoEscreva__ExpAssignment_2 : ( ruleExpressao ) ;
    public final void rule__ComandoEscreva__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6469:1: ( ( ruleExpressao ) )
            // InternalT5.g:6470:2: ( ruleExpressao )
            {
            // InternalT5.g:6470:2: ( ruleExpressao )
            // InternalT5.g:6471:3: ruleExpressao
            {
             before(grammarAccess.getComandoEscrevaAccess().getExpExpressaoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoEscrevaAccess().getExpExpressaoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__ExpAssignment_2"


    // $ANTLR start "rule__ComandoEscreva__ExpAssignment_3_1"
    // InternalT5.g:6480:1: rule__ComandoEscreva__ExpAssignment_3_1 : ( ruleExpressao ) ;
    public final void rule__ComandoEscreva__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6484:1: ( ( ruleExpressao ) )
            // InternalT5.g:6485:2: ( ruleExpressao )
            {
            // InternalT5.g:6485:2: ( ruleExpressao )
            // InternalT5.g:6486:3: ruleExpressao
            {
             before(grammarAccess.getComandoEscrevaAccess().getExpExpressaoParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoEscrevaAccess().getExpExpressaoParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEscreva__ExpAssignment_3_1"


    // $ANTLR start "rule__ComandoSe__CondAssignment_1"
    // InternalT5.g:6495:1: rule__ComandoSe__CondAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ComandoSe__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6499:1: ( ( ruleExpressao ) )
            // InternalT5.g:6500:2: ( ruleExpressao )
            {
            // InternalT5.g:6500:2: ( ruleExpressao )
            // InternalT5.g:6501:3: ruleExpressao
            {
             before(grammarAccess.getComandoSeAccess().getCondExpressaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoSeAccess().getCondExpressaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__CondAssignment_1"


    // $ANTLR start "rule__ComandoSe__ComandosAssignment_3"
    // InternalT5.g:6510:1: rule__ComandoSe__ComandosAssignment_3 : ( ruleComando ) ;
    public final void rule__ComandoSe__ComandosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6514:1: ( ( ruleComando ) )
            // InternalT5.g:6515:2: ( ruleComando )
            {
            // InternalT5.g:6515:2: ( ruleComando )
            // InternalT5.g:6516:3: ruleComando
            {
             before(grammarAccess.getComandoSeAccess().getComandosComandoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoSeAccess().getComandosComandoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__ComandosAssignment_3"


    // $ANTLR start "rule__ComandoSe__ComandosElseAssignment_4_1"
    // InternalT5.g:6525:1: rule__ComandoSe__ComandosElseAssignment_4_1 : ( ruleComando ) ;
    public final void rule__ComandoSe__ComandosElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6529:1: ( ( ruleComando ) )
            // InternalT5.g:6530:2: ( ruleComando )
            {
            // InternalT5.g:6530:2: ( ruleComando )
            // InternalT5.g:6531:3: ruleComando
            {
             before(grammarAccess.getComandoSeAccess().getComandosElseComandoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoSeAccess().getComandosElseComandoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoSe__ComandosElseAssignment_4_1"


    // $ANTLR start "rule__ComandoCaso__ExpAssignment_1"
    // InternalT5.g:6540:1: rule__ComandoCaso__ExpAssignment_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ComandoCaso__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6544:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:6545:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:6545:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:6546:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getComandoCasoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getComandoCasoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__ExpAssignment_1"


    // $ANTLR start "rule__ComandoCaso__SelecaoAssignment_3"
    // InternalT5.g:6555:1: rule__ComandoCaso__SelecaoAssignment_3 : ( ruleSelecao ) ;
    public final void rule__ComandoCaso__SelecaoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6559:1: ( ( ruleSelecao ) )
            // InternalT5.g:6560:2: ( ruleSelecao )
            {
            // InternalT5.g:6560:2: ( ruleSelecao )
            // InternalT5.g:6561:3: ruleSelecao
            {
             before(grammarAccess.getComandoCasoAccess().getSelecaoSelecaoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelecao();

            state._fsp--;

             after(grammarAccess.getComandoCasoAccess().getSelecaoSelecaoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__SelecaoAssignment_3"


    // $ANTLR start "rule__ComandoCaso__ComandosElseAssignment_4_1"
    // InternalT5.g:6570:1: rule__ComandoCaso__ComandosElseAssignment_4_1 : ( ruleComando ) ;
    public final void rule__ComandoCaso__ComandosElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6574:1: ( ( ruleComando ) )
            // InternalT5.g:6575:2: ( ruleComando )
            {
            // InternalT5.g:6575:2: ( ruleComando )
            // InternalT5.g:6576:3: ruleComando
            {
             before(grammarAccess.getComandoCasoAccess().getComandosElseComandoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoCasoAccess().getComandosElseComandoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoCaso__ComandosElseAssignment_4_1"


    // $ANTLR start "rule__ComandoPara__VarAssignment_1"
    // InternalT5.g:6585:1: rule__ComandoPara__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComandoPara__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6589:1: ( ( RULE_ID ) )
            // InternalT5.g:6590:2: ( RULE_ID )
            {
            // InternalT5.g:6590:2: ( RULE_ID )
            // InternalT5.g:6591:3: RULE_ID
            {
             before(grammarAccess.getComandoParaAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComandoParaAccess().getVarIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__VarAssignment_1"


    // $ANTLR start "rule__ComandoPara__InicioAssignment_3"
    // InternalT5.g:6600:1: rule__ComandoPara__InicioAssignment_3 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ComandoPara__InicioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6604:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:6605:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:6605:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:6606:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getComandoParaAccess().getInicioExpressaoAritmeticaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getComandoParaAccess().getInicioExpressaoAritmeticaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__InicioAssignment_3"


    // $ANTLR start "rule__ComandoPara__FimAssignment_5"
    // InternalT5.g:6615:1: rule__ComandoPara__FimAssignment_5 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ComandoPara__FimAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6619:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:6620:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:6620:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:6621:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getComandoParaAccess().getFimExpressaoAritmeticaParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getComandoParaAccess().getFimExpressaoAritmeticaParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__FimAssignment_5"


    // $ANTLR start "rule__ComandoPara__ComandosAssignment_7"
    // InternalT5.g:6630:1: rule__ComandoPara__ComandosAssignment_7 : ( ruleComando ) ;
    public final void rule__ComandoPara__ComandosAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6634:1: ( ( ruleComando ) )
            // InternalT5.g:6635:2: ( ruleComando )
            {
            // InternalT5.g:6635:2: ( ruleComando )
            // InternalT5.g:6636:3: ruleComando
            {
             before(grammarAccess.getComandoParaAccess().getComandosComandoParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoParaAccess().getComandosComandoParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoPara__ComandosAssignment_7"


    // $ANTLR start "rule__ComandoEnquanto__CondAssignment_1"
    // InternalT5.g:6645:1: rule__ComandoEnquanto__CondAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ComandoEnquanto__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6649:1: ( ( ruleExpressao ) )
            // InternalT5.g:6650:2: ( ruleExpressao )
            {
            // InternalT5.g:6650:2: ( ruleExpressao )
            // InternalT5.g:6651:3: ruleExpressao
            {
             before(grammarAccess.getComandoEnquantoAccess().getCondExpressaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoEnquantoAccess().getCondExpressaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__CondAssignment_1"


    // $ANTLR start "rule__ComandoEnquanto__ComandosAssignment_3"
    // InternalT5.g:6660:1: rule__ComandoEnquanto__ComandosAssignment_3 : ( ruleComando ) ;
    public final void rule__ComandoEnquanto__ComandosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6664:1: ( ( ruleComando ) )
            // InternalT5.g:6665:2: ( ruleComando )
            {
            // InternalT5.g:6665:2: ( ruleComando )
            // InternalT5.g:6666:3: ruleComando
            {
             before(grammarAccess.getComandoEnquantoAccess().getComandosComandoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoEnquantoAccess().getComandosComandoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoEnquanto__ComandosAssignment_3"


    // $ANTLR start "rule__ComandoFaca__ComandosAssignment_1"
    // InternalT5.g:6675:1: rule__ComandoFaca__ComandosAssignment_1 : ( ruleComando ) ;
    public final void rule__ComandoFaca__ComandosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6679:1: ( ( ruleComando ) )
            // InternalT5.g:6680:2: ( ruleComando )
            {
            // InternalT5.g:6680:2: ( ruleComando )
            // InternalT5.g:6681:3: ruleComando
            {
             before(grammarAccess.getComandoFacaAccess().getComandosComandoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoFacaAccess().getComandosComandoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__ComandosAssignment_1"


    // $ANTLR start "rule__ComandoFaca__CondAssignment_3"
    // InternalT5.g:6690:1: rule__ComandoFaca__CondAssignment_3 : ( ruleExpressao ) ;
    public final void rule__ComandoFaca__CondAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6694:1: ( ( ruleExpressao ) )
            // InternalT5.g:6695:2: ( ruleExpressao )
            {
            // InternalT5.g:6695:2: ( ruleExpressao )
            // InternalT5.g:6696:3: ruleExpressao
            {
             before(grammarAccess.getComandoFacaAccess().getCondExpressaoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoFacaAccess().getCondExpressaoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoFaca__CondAssignment_3"


    // $ANTLR start "rule__ComandoAtribuicao__TargetAssignment_1"
    // InternalT5.g:6705:1: rule__ComandoAtribuicao__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoAtribuicao__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6709:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:6710:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:6710:2: ( ( RULE_ID ) )
            // InternalT5.g:6711:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getTargetDeclaracaoCrossReference_1_0()); 
            // InternalT5.g:6712:3: ( RULE_ID )
            // InternalT5.g:6713:4: RULE_ID
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getTargetDeclaracaoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComandoAtribuicaoAccess().getTargetDeclaracaoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComandoAtribuicaoAccess().getTargetDeclaracaoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__TargetAssignment_1"


    // $ANTLR start "rule__ComandoAtribuicao__ValorAssignment_3"
    // InternalT5.g:6724:1: rule__ComandoAtribuicao__ValorAssignment_3 : ( ruleExpressao ) ;
    public final void rule__ComandoAtribuicao__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6728:1: ( ( ruleExpressao ) )
            // InternalT5.g:6729:2: ( ruleExpressao )
            {
            // InternalT5.g:6729:2: ( ruleExpressao )
            // InternalT5.g:6730:3: ruleExpressao
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getValorExpressaoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoAtribuicaoAccess().getValorExpressaoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoAtribuicao__ValorAssignment_3"


    // $ANTLR start "rule__ComandoChamada__NameAssignment_0"
    // InternalT5.g:6739:1: rule__ComandoChamada__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ComandoChamada__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6743:1: ( ( RULE_ID ) )
            // InternalT5.g:6744:2: ( RULE_ID )
            {
            // InternalT5.g:6744:2: ( RULE_ID )
            // InternalT5.g:6745:3: RULE_ID
            {
             before(grammarAccess.getComandoChamadaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComandoChamadaAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__NameAssignment_0"


    // $ANTLR start "rule__ComandoChamada__ArgsAssignment_2_0"
    // InternalT5.g:6754:1: rule__ComandoChamada__ArgsAssignment_2_0 : ( ruleExpressao ) ;
    public final void rule__ComandoChamada__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6758:1: ( ( ruleExpressao ) )
            // InternalT5.g:6759:2: ( ruleExpressao )
            {
            // InternalT5.g:6759:2: ( ruleExpressao )
            // InternalT5.g:6760:3: ruleExpressao
            {
             before(grammarAccess.getComandoChamadaAccess().getArgsExpressaoParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoChamadaAccess().getArgsExpressaoParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__ArgsAssignment_2_0"


    // $ANTLR start "rule__ComandoChamada__ArgsAssignment_2_1_1"
    // InternalT5.g:6769:1: rule__ComandoChamada__ArgsAssignment_2_1_1 : ( ruleExpressao ) ;
    public final void rule__ComandoChamada__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6773:1: ( ( ruleExpressao ) )
            // InternalT5.g:6774:2: ( ruleExpressao )
            {
            // InternalT5.g:6774:2: ( ruleExpressao )
            // InternalT5.g:6775:3: ruleExpressao
            {
             before(grammarAccess.getComandoChamadaAccess().getArgsExpressaoParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoChamadaAccess().getArgsExpressaoParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoChamada__ArgsAssignment_2_1_1"


    // $ANTLR start "rule__ComandoRetorne__ExpAssignment_1"
    // InternalT5.g:6784:1: rule__ComandoRetorne__ExpAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ComandoRetorne__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6788:1: ( ( ruleExpressao ) )
            // InternalT5.g:6789:2: ( ruleExpressao )
            {
            // InternalT5.g:6789:2: ( ruleExpressao )
            // InternalT5.g:6790:3: ruleExpressao
            {
             before(grammarAccess.getComandoRetorneAccess().getExpExpressaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressao();

            state._fsp--;

             after(grammarAccess.getComandoRetorneAccess().getExpExpressaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandoRetorne__ExpAssignment_1"


    // $ANTLR start "rule__Selecao__ItensAssignment_0"
    // InternalT5.g:6799:1: rule__Selecao__ItensAssignment_0 : ( ruleItemSelecao ) ;
    public final void rule__Selecao__ItensAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6803:1: ( ( ruleItemSelecao ) )
            // InternalT5.g:6804:2: ( ruleItemSelecao )
            {
            // InternalT5.g:6804:2: ( ruleItemSelecao )
            // InternalT5.g:6805:3: ruleItemSelecao
            {
             before(grammarAccess.getSelecaoAccess().getItensItemSelecaoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleItemSelecao();

            state._fsp--;

             after(grammarAccess.getSelecaoAccess().getItensItemSelecaoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__ItensAssignment_0"


    // $ANTLR start "rule__Selecao__ComandosAssignment_2"
    // InternalT5.g:6814:1: rule__Selecao__ComandosAssignment_2 : ( ruleComando ) ;
    public final void rule__Selecao__ComandosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6818:1: ( ( ruleComando ) )
            // InternalT5.g:6819:2: ( ruleComando )
            {
            // InternalT5.g:6819:2: ( ruleComando )
            // InternalT5.g:6820:3: ruleComando
            {
             before(grammarAccess.getSelecaoAccess().getComandosComandoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getSelecaoAccess().getComandosComandoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selecao__ComandosAssignment_2"


    // $ANTLR start "rule__ItemSelecao__FaixasAssignment_0"
    // InternalT5.g:6829:1: rule__ItemSelecao__FaixasAssignment_0 : ( ruleNumeroIntervalo ) ;
    public final void rule__ItemSelecao__FaixasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6833:1: ( ( ruleNumeroIntervalo ) )
            // InternalT5.g:6834:2: ( ruleNumeroIntervalo )
            {
            // InternalT5.g:6834:2: ( ruleNumeroIntervalo )
            // InternalT5.g:6835:3: ruleNumeroIntervalo
            {
             before(grammarAccess.getItemSelecaoAccess().getFaixasNumeroIntervaloParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNumeroIntervalo();

            state._fsp--;

             after(grammarAccess.getItemSelecaoAccess().getFaixasNumeroIntervaloParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__FaixasAssignment_0"


    // $ANTLR start "rule__ItemSelecao__FaixasAssignment_1_1"
    // InternalT5.g:6844:1: rule__ItemSelecao__FaixasAssignment_1_1 : ( ruleNumeroIntervalo ) ;
    public final void rule__ItemSelecao__FaixasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6848:1: ( ( ruleNumeroIntervalo ) )
            // InternalT5.g:6849:2: ( ruleNumeroIntervalo )
            {
            // InternalT5.g:6849:2: ( ruleNumeroIntervalo )
            // InternalT5.g:6850:3: ruleNumeroIntervalo
            {
             before(grammarAccess.getItemSelecaoAccess().getFaixasNumeroIntervaloParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumeroIntervalo();

            state._fsp--;

             after(grammarAccess.getItemSelecaoAccess().getFaixasNumeroIntervaloParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemSelecao__FaixasAssignment_1_1"


    // $ANTLR start "rule__NumeroIntervalo__SinalAssignment_0"
    // InternalT5.g:6859:1: rule__NumeroIntervalo__SinalAssignment_0 : ( ruleOpUnario ) ;
    public final void rule__NumeroIntervalo__SinalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6863:1: ( ( ruleOpUnario ) )
            // InternalT5.g:6864:2: ( ruleOpUnario )
            {
            // InternalT5.g:6864:2: ( ruleOpUnario )
            // InternalT5.g:6865:3: ruleOpUnario
            {
             before(grammarAccess.getNumeroIntervaloAccess().getSinalOpUnarioParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpUnario();

            state._fsp--;

             after(grammarAccess.getNumeroIntervaloAccess().getSinalOpUnarioParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__SinalAssignment_0"


    // $ANTLR start "rule__NumeroIntervalo__StartAssignment_1"
    // InternalT5.g:6874:1: rule__NumeroIntervalo__StartAssignment_1 : ( RULE_INT ) ;
    public final void rule__NumeroIntervalo__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6878:1: ( ( RULE_INT ) )
            // InternalT5.g:6879:2: ( RULE_INT )
            {
            // InternalT5.g:6879:2: ( RULE_INT )
            // InternalT5.g:6880:3: RULE_INT
            {
             before(grammarAccess.getNumeroIntervaloAccess().getStartINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumeroIntervaloAccess().getStartINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__StartAssignment_1"


    // $ANTLR start "rule__NumeroIntervalo__EndAssignment_2_1"
    // InternalT5.g:6889:1: rule__NumeroIntervalo__EndAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__NumeroIntervalo__EndAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6893:1: ( ( RULE_INT ) )
            // InternalT5.g:6894:2: ( RULE_INT )
            {
            // InternalT5.g:6894:2: ( RULE_INT )
            // InternalT5.g:6895:3: RULE_INT
            {
             before(grammarAccess.getNumeroIntervaloAccess().getEndINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumeroIntervaloAccess().getEndINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumeroIntervalo__EndAssignment_2_1"


    // $ANTLR start "rule__ExpressaoAritmetica__TermosAssignment_0"
    // InternalT5.g:6904:1: rule__ExpressaoAritmetica__TermosAssignment_0 : ( ruleTermoAritmetico ) ;
    public final void rule__ExpressaoAritmetica__TermosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6908:1: ( ( ruleTermoAritmetico ) )
            // InternalT5.g:6909:2: ( ruleTermoAritmetico )
            {
            // InternalT5.g:6909:2: ( ruleTermoAritmetico )
            // InternalT5.g:6910:3: ruleTermoAritmetico
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getTermosTermoAritmeticoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getExpressaoAritmeticaAccess().getTermosTermoAritmeticoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__TermosAssignment_0"


    // $ANTLR start "rule__ExpressaoAritmetica__OutrosAssignment_1"
    // InternalT5.g:6919:1: rule__ExpressaoAritmetica__OutrosAssignment_1 : ( ruleOutroTermoAritmetico ) ;
    public final void rule__ExpressaoAritmetica__OutrosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6923:1: ( ( ruleOutroTermoAritmetico ) )
            // InternalT5.g:6924:2: ( ruleOutroTermoAritmetico )
            {
            // InternalT5.g:6924:2: ( ruleOutroTermoAritmetico )
            // InternalT5.g:6925:3: ruleOutroTermoAritmetico
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getOutrosOutroTermoAritmeticoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutroTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getExpressaoAritmeticaAccess().getOutrosOutroTermoAritmeticoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoAritmetica__OutrosAssignment_1"


    // $ANTLR start "rule__OutroTermoAritmetico__OpAssignment_0"
    // InternalT5.g:6934:1: rule__OutroTermoAritmetico__OpAssignment_0 : ( ruleOpArit1 ) ;
    public final void rule__OutroTermoAritmetico__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6938:1: ( ( ruleOpArit1 ) )
            // InternalT5.g:6939:2: ( ruleOpArit1 )
            {
            // InternalT5.g:6939:2: ( ruleOpArit1 )
            // InternalT5.g:6940:3: ruleOpArit1
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getOpOpArit1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpArit1();

            state._fsp--;

             after(grammarAccess.getOutroTermoAritmeticoAccess().getOpOpArit1ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__OpAssignment_0"


    // $ANTLR start "rule__OutroTermoAritmetico__TermoAssignment_1"
    // InternalT5.g:6949:1: rule__OutroTermoAritmetico__TermoAssignment_1 : ( ruleTermoAritmetico ) ;
    public final void rule__OutroTermoAritmetico__TermoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6953:1: ( ( ruleTermoAritmetico ) )
            // InternalT5.g:6954:2: ( ruleTermoAritmetico )
            {
            // InternalT5.g:6954:2: ( ruleTermoAritmetico )
            // InternalT5.g:6955:3: ruleTermoAritmetico
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getTermoTermoAritmeticoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTermoAritmetico();

            state._fsp--;

             after(grammarAccess.getOutroTermoAritmeticoAccess().getTermoTermoAritmeticoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroTermoAritmetico__TermoAssignment_1"


    // $ANTLR start "rule__TermoAritmetico__FatoresAssignment_0"
    // InternalT5.g:6964:1: rule__TermoAritmetico__FatoresAssignment_0 : ( ruleFatorAritmetico ) ;
    public final void rule__TermoAritmetico__FatoresAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6968:1: ( ( ruleFatorAritmetico ) )
            // InternalT5.g:6969:2: ( ruleFatorAritmetico )
            {
            // InternalT5.g:6969:2: ( ruleFatorAritmetico )
            // InternalT5.g:6970:3: ruleFatorAritmetico
            {
             before(grammarAccess.getTermoAritmeticoAccess().getFatoresFatorAritmeticoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getTermoAritmeticoAccess().getFatoresFatorAritmeticoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__FatoresAssignment_0"


    // $ANTLR start "rule__TermoAritmetico__OutrosAssignment_1"
    // InternalT5.g:6979:1: rule__TermoAritmetico__OutrosAssignment_1 : ( ruleOutroFatorAritmetico ) ;
    public final void rule__TermoAritmetico__OutrosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6983:1: ( ( ruleOutroFatorAritmetico ) )
            // InternalT5.g:6984:2: ( ruleOutroFatorAritmetico )
            {
            // InternalT5.g:6984:2: ( ruleOutroFatorAritmetico )
            // InternalT5.g:6985:3: ruleOutroFatorAritmetico
            {
             before(grammarAccess.getTermoAritmeticoAccess().getOutrosOutroFatorAritmeticoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutroFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getTermoAritmeticoAccess().getOutrosOutroFatorAritmeticoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoAritmetico__OutrosAssignment_1"


    // $ANTLR start "rule__OutroFatorAritmetico__OpAssignment_0"
    // InternalT5.g:6994:1: rule__OutroFatorAritmetico__OpAssignment_0 : ( ruleOpArit2 ) ;
    public final void rule__OutroFatorAritmetico__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6998:1: ( ( ruleOpArit2 ) )
            // InternalT5.g:6999:2: ( ruleOpArit2 )
            {
            // InternalT5.g:6999:2: ( ruleOpArit2 )
            // InternalT5.g:7000:3: ruleOpArit2
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getOpOpArit2ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpArit2();

            state._fsp--;

             after(grammarAccess.getOutroFatorAritmeticoAccess().getOpOpArit2ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__OpAssignment_0"


    // $ANTLR start "rule__OutroFatorAritmetico__FatorAssignment_1"
    // InternalT5.g:7009:1: rule__OutroFatorAritmetico__FatorAssignment_1 : ( ruleFatorAritmetico ) ;
    public final void rule__OutroFatorAritmetico__FatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7013:1: ( ( ruleFatorAritmetico ) )
            // InternalT5.g:7014:2: ( ruleFatorAritmetico )
            {
            // InternalT5.g:7014:2: ( ruleFatorAritmetico )
            // InternalT5.g:7015:3: ruleFatorAritmetico
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getFatorFatorAritmeticoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFatorAritmetico();

            state._fsp--;

             after(grammarAccess.getOutroFatorAritmeticoAccess().getFatorFatorAritmeticoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutroFatorAritmetico__FatorAssignment_1"


    // $ANTLR start "rule__FatorAritmetico__RefAssignment_0_1"
    // InternalT5.g:7024:1: rule__FatorAritmetico__RefAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FatorAritmetico__RefAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7028:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:7029:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:7029:2: ( ( RULE_ID ) )
            // InternalT5.g:7030:3: ( RULE_ID )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getRefDeclaracaoCrossReference_0_1_0()); 
            // InternalT5.g:7031:3: ( RULE_ID )
            // InternalT5.g:7032:4: RULE_ID
            {
             before(grammarAccess.getFatorAritmeticoAccess().getRefDeclaracaoIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFatorAritmeticoAccess().getRefDeclaracaoIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getFatorAritmeticoAccess().getRefDeclaracaoCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__RefAssignment_0_1"


    // $ANTLR start "rule__FatorAritmetico__NumeroAssignment_1"
    // InternalT5.g:7043:1: rule__FatorAritmetico__NumeroAssignment_1 : ( RULE_INT ) ;
    public final void rule__FatorAritmetico__NumeroAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7047:1: ( ( RULE_INT ) )
            // InternalT5.g:7048:2: ( RULE_INT )
            {
            // InternalT5.g:7048:2: ( RULE_INT )
            // InternalT5.g:7049:3: RULE_INT
            {
             before(grammarAccess.getFatorAritmeticoAccess().getNumeroINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFatorAritmeticoAccess().getNumeroINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__NumeroAssignment_1"


    // $ANTLR start "rule__FatorAritmetico__RealAssignment_2"
    // InternalT5.g:7058:1: rule__FatorAritmetico__RealAssignment_2 : ( RULE_REAL ) ;
    public final void rule__FatorAritmetico__RealAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7062:1: ( ( RULE_REAL ) )
            // InternalT5.g:7063:2: ( RULE_REAL )
            {
            // InternalT5.g:7063:2: ( RULE_REAL )
            // InternalT5.g:7064:3: RULE_REAL
            {
             before(grammarAccess.getFatorAritmeticoAccess().getRealREALTerminalRuleCall_2_0()); 
            match(input,RULE_REAL,FOLLOW_2); 
             after(grammarAccess.getFatorAritmeticoAccess().getRealREALTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__RealAssignment_2"


    // $ANTLR start "rule__FatorAritmetico__ExpAssignment_3_1"
    // InternalT5.g:7073:1: rule__FatorAritmetico__ExpAssignment_3_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__FatorAritmetico__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7077:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:7078:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:7078:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:7079:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getFatorAritmeticoAccess().getExpExpressaoAritmeticaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getFatorAritmeticoAccess().getExpExpressaoAritmeticaParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FatorAritmetico__ExpAssignment_3_1"


    // $ANTLR start "rule__Expressao__LogicosAssignment_0"
    // InternalT5.g:7088:1: rule__Expressao__LogicosAssignment_0 : ( ruleTermoLogico ) ;
    public final void rule__Expressao__LogicosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7092:1: ( ( ruleTermoLogico ) )
            // InternalT5.g:7093:2: ( ruleTermoLogico )
            {
            // InternalT5.g:7093:2: ( ruleTermoLogico )
            // InternalT5.g:7094:3: ruleTermoLogico
            {
             before(grammarAccess.getExpressaoAccess().getLogicosTermoLogicoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTermoLogico();

            state._fsp--;

             after(grammarAccess.getExpressaoAccess().getLogicosTermoLogicoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__LogicosAssignment_0"


    // $ANTLR start "rule__Expressao__OpAssignment_1_0"
    // InternalT5.g:7103:1: rule__Expressao__OpAssignment_1_0 : ( ruleOpBool ) ;
    public final void rule__Expressao__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7107:1: ( ( ruleOpBool ) )
            // InternalT5.g:7108:2: ( ruleOpBool )
            {
            // InternalT5.g:7108:2: ( ruleOpBool )
            // InternalT5.g:7109:3: ruleOpBool
            {
             before(grammarAccess.getExpressaoAccess().getOpOpBoolParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpBool();

            state._fsp--;

             after(grammarAccess.getExpressaoAccess().getOpOpBoolParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__OpAssignment_1_0"


    // $ANTLR start "rule__Expressao__LogicosAssignment_1_1"
    // InternalT5.g:7118:1: rule__Expressao__LogicosAssignment_1_1 : ( ruleTermoLogico ) ;
    public final void rule__Expressao__LogicosAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7122:1: ( ( ruleTermoLogico ) )
            // InternalT5.g:7123:2: ( ruleTermoLogico )
            {
            // InternalT5.g:7123:2: ( ruleTermoLogico )
            // InternalT5.g:7124:3: ruleTermoLogico
            {
             before(grammarAccess.getExpressaoAccess().getLogicosTermoLogicoParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTermoLogico();

            state._fsp--;

             after(grammarAccess.getExpressaoAccess().getLogicosTermoLogicoParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expressao__LogicosAssignment_1_1"


    // $ANTLR start "rule__TermoLogico__RelAssignment_1"
    // InternalT5.g:7133:1: rule__TermoLogico__RelAssignment_1 : ( ruleExpressaoRelacional ) ;
    public final void rule__TermoLogico__RelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7137:1: ( ( ruleExpressaoRelacional ) )
            // InternalT5.g:7138:2: ( ruleExpressaoRelacional )
            {
            // InternalT5.g:7138:2: ( ruleExpressaoRelacional )
            // InternalT5.g:7139:3: ruleExpressaoRelacional
            {
             before(grammarAccess.getTermoLogicoAccess().getRelExpressaoRelacionalParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoRelacional();

            state._fsp--;

             after(grammarAccess.getTermoLogicoAccess().getRelExpressaoRelacionalParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermoLogico__RelAssignment_1"


    // $ANTLR start "rule__ExpressaoRelacional__LeftAssignment_0"
    // InternalT5.g:7148:1: rule__ExpressaoRelacional__LeftAssignment_0 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ExpressaoRelacional__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7152:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:7153:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:7153:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:7154:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getLeftExpressaoAritmeticaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getExpressaoRelacionalAccess().getLeftExpressaoAritmeticaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__LeftAssignment_0"


    // $ANTLR start "rule__ExpressaoRelacional__OpAssignment_1_0"
    // InternalT5.g:7163:1: rule__ExpressaoRelacional__OpAssignment_1_0 : ( ruleOpRel ) ;
    public final void rule__ExpressaoRelacional__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7167:1: ( ( ruleOpRel ) )
            // InternalT5.g:7168:2: ( ruleOpRel )
            {
            // InternalT5.g:7168:2: ( ruleOpRel )
            // InternalT5.g:7169:3: ruleOpRel
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getOpOpRelParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOpRel();

            state._fsp--;

             after(grammarAccess.getExpressaoRelacionalAccess().getOpOpRelParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__OpAssignment_1_0"


    // $ANTLR start "rule__ExpressaoRelacional__RightAssignment_1_1"
    // InternalT5.g:7178:1: rule__ExpressaoRelacional__RightAssignment_1_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ExpressaoRelacional__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7182:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:7183:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:7183:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:7184:3: ruleExpressaoAritmetica
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getRightExpressaoAritmeticaParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpressaoAritmetica();

            state._fsp--;

             after(grammarAccess.getExpressaoRelacionalAccess().getRightExpressaoAritmeticaParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressaoRelacional__RightAssignment_1_1"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\7\10\uffff\1\47\2\uffff";
    static final String dfa_3s = "\1\103\10\uffff\1\75\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\11";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\51\uffff\1\10\1\uffff\1\1\1\2\1\3\3\uffff\1\4\2\uffff\1\5\2\uffff\1\7\1\uffff\1\6\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\25\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1285:1: rule__Comando__Alternatives : ( ( ruleComandoLeia ) | ( ruleComandoEscreva ) | ( ruleComandoSe ) | ( ruleComandoCaso ) | ( ruleComandoPara ) | ( ruleComandoEnquanto ) | ( ruleComandoFaca ) | ( ruleComandoAtribuicao ) | ( ruleComandoChamada ) | ( ruleComandoRetorne ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000046A00000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000046A00000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x923A002A00000080L,0x000000000000000AL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000280000001E080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004010000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00020080000000F0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002A00000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x923A000000000082L,0x000000000000000AL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00020080000000F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x93BA000000000080L,0x000000000000000AL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x923A000000000080L,0x000000000000000AL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0900000000001000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x923A000000000080L,0x000000000000000BL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x923A000000000080L,0x000000000000000EL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xD23A000000000080L,0x000000000000000AL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00020180000000F0L,0x0000000000000020L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000000000FC00000L});

}