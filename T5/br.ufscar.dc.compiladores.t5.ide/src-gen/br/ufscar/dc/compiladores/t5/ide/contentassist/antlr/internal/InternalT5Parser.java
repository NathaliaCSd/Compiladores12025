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



    // $ANTLR start "entryRuleModel"
    // InternalT5.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalT5.g:54:1: ( ruleModel EOF )
            // InternalT5.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalT5.g:62:1: ruleModel : ( ( rule__Model__ProgramaAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:66:2: ( ( ( rule__Model__ProgramaAssignment ) ) )
            // InternalT5.g:67:2: ( ( rule__Model__ProgramaAssignment ) )
            {
            // InternalT5.g:67:2: ( ( rule__Model__ProgramaAssignment ) )
            // InternalT5.g:68:3: ( rule__Model__ProgramaAssignment )
            {
             before(grammarAccess.getModelAccess().getProgramaAssignment()); 
            // InternalT5.g:69:3: ( rule__Model__ProgramaAssignment )
            // InternalT5.g:69:4: rule__Model__ProgramaAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProgramaAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProgramaAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePrograma"
    // InternalT5.g:78:1: entryRulePrograma : rulePrograma EOF ;
    public final void entryRulePrograma() throws RecognitionException {
        try {
            // InternalT5.g:79:1: ( rulePrograma EOF )
            // InternalT5.g:80:1: rulePrograma EOF
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
    // InternalT5.g:87:1: rulePrograma : ( ( rule__Programa__Group__0 ) ) ;
    public final void rulePrograma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:91:2: ( ( ( rule__Programa__Group__0 ) ) )
            // InternalT5.g:92:2: ( ( rule__Programa__Group__0 ) )
            {
            // InternalT5.g:92:2: ( ( rule__Programa__Group__0 ) )
            // InternalT5.g:93:3: ( rule__Programa__Group__0 )
            {
             before(grammarAccess.getProgramaAccess().getGroup()); 
            // InternalT5.g:94:3: ( rule__Programa__Group__0 )
            // InternalT5.g:94:4: rule__Programa__Group__0
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
    // InternalT5.g:103:1: entryRuleDeclaracao : ruleDeclaracao EOF ;
    public final void entryRuleDeclaracao() throws RecognitionException {
        try {
            // InternalT5.g:104:1: ( ruleDeclaracao EOF )
            // InternalT5.g:105:1: ruleDeclaracao EOF
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
    // InternalT5.g:112:1: ruleDeclaracao : ( ( rule__Declaracao__Alternatives ) ) ;
    public final void ruleDeclaracao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:116:2: ( ( ( rule__Declaracao__Alternatives ) ) )
            // InternalT5.g:117:2: ( ( rule__Declaracao__Alternatives ) )
            {
            // InternalT5.g:117:2: ( ( rule__Declaracao__Alternatives ) )
            // InternalT5.g:118:3: ( rule__Declaracao__Alternatives )
            {
             before(grammarAccess.getDeclaracaoAccess().getAlternatives()); 
            // InternalT5.g:119:3: ( rule__Declaracao__Alternatives )
            // InternalT5.g:119:4: rule__Declaracao__Alternatives
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
    // InternalT5.g:128:1: entryRuleDeclaracaoLocal : ruleDeclaracaoLocal EOF ;
    public final void entryRuleDeclaracaoLocal() throws RecognitionException {
        try {
            // InternalT5.g:129:1: ( ruleDeclaracaoLocal EOF )
            // InternalT5.g:130:1: ruleDeclaracaoLocal EOF
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
    // InternalT5.g:137:1: ruleDeclaracaoLocal : ( ( rule__DeclaracaoLocal__Alternatives ) ) ;
    public final void ruleDeclaracaoLocal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:141:2: ( ( ( rule__DeclaracaoLocal__Alternatives ) ) )
            // InternalT5.g:142:2: ( ( rule__DeclaracaoLocal__Alternatives ) )
            {
            // InternalT5.g:142:2: ( ( rule__DeclaracaoLocal__Alternatives ) )
            // InternalT5.g:143:3: ( rule__DeclaracaoLocal__Alternatives )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getAlternatives()); 
            // InternalT5.g:144:3: ( rule__DeclaracaoLocal__Alternatives )
            // InternalT5.g:144:4: rule__DeclaracaoLocal__Alternatives
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
    // InternalT5.g:153:1: entryRuleDeclaracaoGlobal : ruleDeclaracaoGlobal EOF ;
    public final void entryRuleDeclaracaoGlobal() throws RecognitionException {
        try {
            // InternalT5.g:154:1: ( ruleDeclaracaoGlobal EOF )
            // InternalT5.g:155:1: ruleDeclaracaoGlobal EOF
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
    // InternalT5.g:162:1: ruleDeclaracaoGlobal : ( ( rule__DeclaracaoGlobal__Alternatives ) ) ;
    public final void ruleDeclaracaoGlobal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:166:2: ( ( ( rule__DeclaracaoGlobal__Alternatives ) ) )
            // InternalT5.g:167:2: ( ( rule__DeclaracaoGlobal__Alternatives ) )
            {
            // InternalT5.g:167:2: ( ( rule__DeclaracaoGlobal__Alternatives ) )
            // InternalT5.g:168:3: ( rule__DeclaracaoGlobal__Alternatives )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getAlternatives()); 
            // InternalT5.g:169:3: ( rule__DeclaracaoGlobal__Alternatives )
            // InternalT5.g:169:4: rule__DeclaracaoGlobal__Alternatives
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
    // InternalT5.g:178:1: entryRuleVariavel : ruleVariavel EOF ;
    public final void entryRuleVariavel() throws RecognitionException {
        try {
            // InternalT5.g:179:1: ( ruleVariavel EOF )
            // InternalT5.g:180:1: ruleVariavel EOF
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
    // InternalT5.g:187:1: ruleVariavel : ( ( rule__Variavel__Group__0 ) ) ;
    public final void ruleVariavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:191:2: ( ( ( rule__Variavel__Group__0 ) ) )
            // InternalT5.g:192:2: ( ( rule__Variavel__Group__0 ) )
            {
            // InternalT5.g:192:2: ( ( rule__Variavel__Group__0 ) )
            // InternalT5.g:193:3: ( rule__Variavel__Group__0 )
            {
             before(grammarAccess.getVariavelAccess().getGroup()); 
            // InternalT5.g:194:3: ( rule__Variavel__Group__0 )
            // InternalT5.g:194:4: rule__Variavel__Group__0
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
    // InternalT5.g:203:1: entryRuleIdentificador : ruleIdentificador EOF ;
    public final void entryRuleIdentificador() throws RecognitionException {
        try {
            // InternalT5.g:204:1: ( ruleIdentificador EOF )
            // InternalT5.g:205:1: ruleIdentificador EOF
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
    // InternalT5.g:212:1: ruleIdentificador : ( ( rule__Identificador__Group__0 ) ) ;
    public final void ruleIdentificador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:216:2: ( ( ( rule__Identificador__Group__0 ) ) )
            // InternalT5.g:217:2: ( ( rule__Identificador__Group__0 ) )
            {
            // InternalT5.g:217:2: ( ( rule__Identificador__Group__0 ) )
            // InternalT5.g:218:3: ( rule__Identificador__Group__0 )
            {
             before(grammarAccess.getIdentificadorAccess().getGroup()); 
            // InternalT5.g:219:3: ( rule__Identificador__Group__0 )
            // InternalT5.g:219:4: rule__Identificador__Group__0
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
    // InternalT5.g:228:1: entryRuleDimensao : ruleDimensao EOF ;
    public final void entryRuleDimensao() throws RecognitionException {
        try {
            // InternalT5.g:229:1: ( ruleDimensao EOF )
            // InternalT5.g:230:1: ruleDimensao EOF
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
    // InternalT5.g:237:1: ruleDimensao : ( ( rule__Dimensao__Group__0 ) ) ;
    public final void ruleDimensao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:241:2: ( ( ( rule__Dimensao__Group__0 ) ) )
            // InternalT5.g:242:2: ( ( rule__Dimensao__Group__0 ) )
            {
            // InternalT5.g:242:2: ( ( rule__Dimensao__Group__0 ) )
            // InternalT5.g:243:3: ( rule__Dimensao__Group__0 )
            {
             before(grammarAccess.getDimensaoAccess().getGroup()); 
            // InternalT5.g:244:3: ( rule__Dimensao__Group__0 )
            // InternalT5.g:244:4: rule__Dimensao__Group__0
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
    // InternalT5.g:253:1: entryRuleTipo : ruleTipo EOF ;
    public final void entryRuleTipo() throws RecognitionException {
        try {
            // InternalT5.g:254:1: ( ruleTipo EOF )
            // InternalT5.g:255:1: ruleTipo EOF
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
    // InternalT5.g:262:1: ruleTipo : ( ( rule__Tipo__Alternatives ) ) ;
    public final void ruleTipo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:266:2: ( ( ( rule__Tipo__Alternatives ) ) )
            // InternalT5.g:267:2: ( ( rule__Tipo__Alternatives ) )
            {
            // InternalT5.g:267:2: ( ( rule__Tipo__Alternatives ) )
            // InternalT5.g:268:3: ( rule__Tipo__Alternatives )
            {
             before(grammarAccess.getTipoAccess().getAlternatives()); 
            // InternalT5.g:269:3: ( rule__Tipo__Alternatives )
            // InternalT5.g:269:4: rule__Tipo__Alternatives
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
    // InternalT5.g:278:1: entryRuleRegistro : ruleRegistro EOF ;
    public final void entryRuleRegistro() throws RecognitionException {
        try {
            // InternalT5.g:279:1: ( ruleRegistro EOF )
            // InternalT5.g:280:1: ruleRegistro EOF
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
    // InternalT5.g:287:1: ruleRegistro : ( ( rule__Registro__Group__0 ) ) ;
    public final void ruleRegistro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:291:2: ( ( ( rule__Registro__Group__0 ) ) )
            // InternalT5.g:292:2: ( ( rule__Registro__Group__0 ) )
            {
            // InternalT5.g:292:2: ( ( rule__Registro__Group__0 ) )
            // InternalT5.g:293:3: ( rule__Registro__Group__0 )
            {
             before(grammarAccess.getRegistroAccess().getGroup()); 
            // InternalT5.g:294:3: ( rule__Registro__Group__0 )
            // InternalT5.g:294:4: rule__Registro__Group__0
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
    // InternalT5.g:303:1: entryRuleTipoEstendido : ruleTipoEstendido EOF ;
    public final void entryRuleTipoEstendido() throws RecognitionException {
        try {
            // InternalT5.g:304:1: ( ruleTipoEstendido EOF )
            // InternalT5.g:305:1: ruleTipoEstendido EOF
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
    // InternalT5.g:312:1: ruleTipoEstendido : ( ( rule__TipoEstendido__Group__0 ) ) ;
    public final void ruleTipoEstendido() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:316:2: ( ( ( rule__TipoEstendido__Group__0 ) ) )
            // InternalT5.g:317:2: ( ( rule__TipoEstendido__Group__0 ) )
            {
            // InternalT5.g:317:2: ( ( rule__TipoEstendido__Group__0 ) )
            // InternalT5.g:318:3: ( rule__TipoEstendido__Group__0 )
            {
             before(grammarAccess.getTipoEstendidoAccess().getGroup()); 
            // InternalT5.g:319:3: ( rule__TipoEstendido__Group__0 )
            // InternalT5.g:319:4: rule__TipoEstendido__Group__0
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
    // InternalT5.g:328:1: entryRuleTipoBasico : ruleTipoBasico EOF ;
    public final void entryRuleTipoBasico() throws RecognitionException {
        try {
            // InternalT5.g:329:1: ( ruleTipoBasico EOF )
            // InternalT5.g:330:1: ruleTipoBasico EOF
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
    // InternalT5.g:337:1: ruleTipoBasico : ( ( rule__TipoBasico__Alternatives ) ) ;
    public final void ruleTipoBasico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:341:2: ( ( ( rule__TipoBasico__Alternatives ) ) )
            // InternalT5.g:342:2: ( ( rule__TipoBasico__Alternatives ) )
            {
            // InternalT5.g:342:2: ( ( rule__TipoBasico__Alternatives ) )
            // InternalT5.g:343:3: ( rule__TipoBasico__Alternatives )
            {
             before(grammarAccess.getTipoBasicoAccess().getAlternatives()); 
            // InternalT5.g:344:3: ( rule__TipoBasico__Alternatives )
            // InternalT5.g:344:4: rule__TipoBasico__Alternatives
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
    // InternalT5.g:353:1: entryRuleValorConstante : ruleValorConstante EOF ;
    public final void entryRuleValorConstante() throws RecognitionException {
        try {
            // InternalT5.g:354:1: ( ruleValorConstante EOF )
            // InternalT5.g:355:1: ruleValorConstante EOF
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
    // InternalT5.g:362:1: ruleValorConstante : ( ( rule__ValorConstante__Alternatives ) ) ;
    public final void ruleValorConstante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:366:2: ( ( ( rule__ValorConstante__Alternatives ) ) )
            // InternalT5.g:367:2: ( ( rule__ValorConstante__Alternatives ) )
            {
            // InternalT5.g:367:2: ( ( rule__ValorConstante__Alternatives ) )
            // InternalT5.g:368:3: ( rule__ValorConstante__Alternatives )
            {
             before(grammarAccess.getValorConstanteAccess().getAlternatives()); 
            // InternalT5.g:369:3: ( rule__ValorConstante__Alternatives )
            // InternalT5.g:369:4: rule__ValorConstante__Alternatives
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
    // InternalT5.g:378:1: entryRuleParametros : ruleParametros EOF ;
    public final void entryRuleParametros() throws RecognitionException {
        try {
            // InternalT5.g:379:1: ( ruleParametros EOF )
            // InternalT5.g:380:1: ruleParametros EOF
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
    // InternalT5.g:387:1: ruleParametros : ( ( rule__Parametros__Group__0 ) ) ;
    public final void ruleParametros() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:391:2: ( ( ( rule__Parametros__Group__0 ) ) )
            // InternalT5.g:392:2: ( ( rule__Parametros__Group__0 ) )
            {
            // InternalT5.g:392:2: ( ( rule__Parametros__Group__0 ) )
            // InternalT5.g:393:3: ( rule__Parametros__Group__0 )
            {
             before(grammarAccess.getParametrosAccess().getGroup()); 
            // InternalT5.g:394:3: ( rule__Parametros__Group__0 )
            // InternalT5.g:394:4: rule__Parametros__Group__0
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
    // InternalT5.g:403:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalT5.g:404:1: ( ruleParametro EOF )
            // InternalT5.g:405:1: ruleParametro EOF
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
    // InternalT5.g:412:1: ruleParametro : ( ( rule__Parametro__Group__0 ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:416:2: ( ( ( rule__Parametro__Group__0 ) ) )
            // InternalT5.g:417:2: ( ( rule__Parametro__Group__0 ) )
            {
            // InternalT5.g:417:2: ( ( rule__Parametro__Group__0 ) )
            // InternalT5.g:418:3: ( rule__Parametro__Group__0 )
            {
             before(grammarAccess.getParametroAccess().getGroup()); 
            // InternalT5.g:419:3: ( rule__Parametro__Group__0 )
            // InternalT5.g:419:4: rule__Parametro__Group__0
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
    // InternalT5.g:428:1: entryRuleCorpo : ruleCorpo EOF ;
    public final void entryRuleCorpo() throws RecognitionException {
        try {
            // InternalT5.g:429:1: ( ruleCorpo EOF )
            // InternalT5.g:430:1: ruleCorpo EOF
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
    // InternalT5.g:437:1: ruleCorpo : ( ( rule__Corpo__Group__0 ) ) ;
    public final void ruleCorpo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:441:2: ( ( ( rule__Corpo__Group__0 ) ) )
            // InternalT5.g:442:2: ( ( rule__Corpo__Group__0 ) )
            {
            // InternalT5.g:442:2: ( ( rule__Corpo__Group__0 ) )
            // InternalT5.g:443:3: ( rule__Corpo__Group__0 )
            {
             before(grammarAccess.getCorpoAccess().getGroup()); 
            // InternalT5.g:444:3: ( rule__Corpo__Group__0 )
            // InternalT5.g:444:4: rule__Corpo__Group__0
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
    // InternalT5.g:453:1: entryRuleComando : ruleComando EOF ;
    public final void entryRuleComando() throws RecognitionException {
        try {
            // InternalT5.g:454:1: ( ruleComando EOF )
            // InternalT5.g:455:1: ruleComando EOF
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
    // InternalT5.g:462:1: ruleComando : ( ( rule__Comando__Alternatives ) ) ;
    public final void ruleComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:466:2: ( ( ( rule__Comando__Alternatives ) ) )
            // InternalT5.g:467:2: ( ( rule__Comando__Alternatives ) )
            {
            // InternalT5.g:467:2: ( ( rule__Comando__Alternatives ) )
            // InternalT5.g:468:3: ( rule__Comando__Alternatives )
            {
             before(grammarAccess.getComandoAccess().getAlternatives()); 
            // InternalT5.g:469:3: ( rule__Comando__Alternatives )
            // InternalT5.g:469:4: rule__Comando__Alternatives
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
    // InternalT5.g:478:1: entryRuleComandoLeia : ruleComandoLeia EOF ;
    public final void entryRuleComandoLeia() throws RecognitionException {
        try {
            // InternalT5.g:479:1: ( ruleComandoLeia EOF )
            // InternalT5.g:480:1: ruleComandoLeia EOF
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
    // InternalT5.g:487:1: ruleComandoLeia : ( ( rule__ComandoLeia__Group__0 ) ) ;
    public final void ruleComandoLeia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:491:2: ( ( ( rule__ComandoLeia__Group__0 ) ) )
            // InternalT5.g:492:2: ( ( rule__ComandoLeia__Group__0 ) )
            {
            // InternalT5.g:492:2: ( ( rule__ComandoLeia__Group__0 ) )
            // InternalT5.g:493:3: ( rule__ComandoLeia__Group__0 )
            {
             before(grammarAccess.getComandoLeiaAccess().getGroup()); 
            // InternalT5.g:494:3: ( rule__ComandoLeia__Group__0 )
            // InternalT5.g:494:4: rule__ComandoLeia__Group__0
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
    // InternalT5.g:503:1: entryRuleComandoEscreva : ruleComandoEscreva EOF ;
    public final void entryRuleComandoEscreva() throws RecognitionException {
        try {
            // InternalT5.g:504:1: ( ruleComandoEscreva EOF )
            // InternalT5.g:505:1: ruleComandoEscreva EOF
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
    // InternalT5.g:512:1: ruleComandoEscreva : ( ( rule__ComandoEscreva__Group__0 ) ) ;
    public final void ruleComandoEscreva() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:516:2: ( ( ( rule__ComandoEscreva__Group__0 ) ) )
            // InternalT5.g:517:2: ( ( rule__ComandoEscreva__Group__0 ) )
            {
            // InternalT5.g:517:2: ( ( rule__ComandoEscreva__Group__0 ) )
            // InternalT5.g:518:3: ( rule__ComandoEscreva__Group__0 )
            {
             before(grammarAccess.getComandoEscrevaAccess().getGroup()); 
            // InternalT5.g:519:3: ( rule__ComandoEscreva__Group__0 )
            // InternalT5.g:519:4: rule__ComandoEscreva__Group__0
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
    // InternalT5.g:528:1: entryRuleComandoSe : ruleComandoSe EOF ;
    public final void entryRuleComandoSe() throws RecognitionException {
        try {
            // InternalT5.g:529:1: ( ruleComandoSe EOF )
            // InternalT5.g:530:1: ruleComandoSe EOF
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
    // InternalT5.g:537:1: ruleComandoSe : ( ( rule__ComandoSe__Group__0 ) ) ;
    public final void ruleComandoSe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:541:2: ( ( ( rule__ComandoSe__Group__0 ) ) )
            // InternalT5.g:542:2: ( ( rule__ComandoSe__Group__0 ) )
            {
            // InternalT5.g:542:2: ( ( rule__ComandoSe__Group__0 ) )
            // InternalT5.g:543:3: ( rule__ComandoSe__Group__0 )
            {
             before(grammarAccess.getComandoSeAccess().getGroup()); 
            // InternalT5.g:544:3: ( rule__ComandoSe__Group__0 )
            // InternalT5.g:544:4: rule__ComandoSe__Group__0
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
    // InternalT5.g:553:1: entryRuleComandoCaso : ruleComandoCaso EOF ;
    public final void entryRuleComandoCaso() throws RecognitionException {
        try {
            // InternalT5.g:554:1: ( ruleComandoCaso EOF )
            // InternalT5.g:555:1: ruleComandoCaso EOF
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
    // InternalT5.g:562:1: ruleComandoCaso : ( ( rule__ComandoCaso__Group__0 ) ) ;
    public final void ruleComandoCaso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:566:2: ( ( ( rule__ComandoCaso__Group__0 ) ) )
            // InternalT5.g:567:2: ( ( rule__ComandoCaso__Group__0 ) )
            {
            // InternalT5.g:567:2: ( ( rule__ComandoCaso__Group__0 ) )
            // InternalT5.g:568:3: ( rule__ComandoCaso__Group__0 )
            {
             before(grammarAccess.getComandoCasoAccess().getGroup()); 
            // InternalT5.g:569:3: ( rule__ComandoCaso__Group__0 )
            // InternalT5.g:569:4: rule__ComandoCaso__Group__0
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
    // InternalT5.g:578:1: entryRuleComandoPara : ruleComandoPara EOF ;
    public final void entryRuleComandoPara() throws RecognitionException {
        try {
            // InternalT5.g:579:1: ( ruleComandoPara EOF )
            // InternalT5.g:580:1: ruleComandoPara EOF
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
    // InternalT5.g:587:1: ruleComandoPara : ( ( rule__ComandoPara__Group__0 ) ) ;
    public final void ruleComandoPara() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:591:2: ( ( ( rule__ComandoPara__Group__0 ) ) )
            // InternalT5.g:592:2: ( ( rule__ComandoPara__Group__0 ) )
            {
            // InternalT5.g:592:2: ( ( rule__ComandoPara__Group__0 ) )
            // InternalT5.g:593:3: ( rule__ComandoPara__Group__0 )
            {
             before(grammarAccess.getComandoParaAccess().getGroup()); 
            // InternalT5.g:594:3: ( rule__ComandoPara__Group__0 )
            // InternalT5.g:594:4: rule__ComandoPara__Group__0
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
    // InternalT5.g:603:1: entryRuleComandoEnquanto : ruleComandoEnquanto EOF ;
    public final void entryRuleComandoEnquanto() throws RecognitionException {
        try {
            // InternalT5.g:604:1: ( ruleComandoEnquanto EOF )
            // InternalT5.g:605:1: ruleComandoEnquanto EOF
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
    // InternalT5.g:612:1: ruleComandoEnquanto : ( ( rule__ComandoEnquanto__Group__0 ) ) ;
    public final void ruleComandoEnquanto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:616:2: ( ( ( rule__ComandoEnquanto__Group__0 ) ) )
            // InternalT5.g:617:2: ( ( rule__ComandoEnquanto__Group__0 ) )
            {
            // InternalT5.g:617:2: ( ( rule__ComandoEnquanto__Group__0 ) )
            // InternalT5.g:618:3: ( rule__ComandoEnquanto__Group__0 )
            {
             before(grammarAccess.getComandoEnquantoAccess().getGroup()); 
            // InternalT5.g:619:3: ( rule__ComandoEnquanto__Group__0 )
            // InternalT5.g:619:4: rule__ComandoEnquanto__Group__0
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
    // InternalT5.g:628:1: entryRuleComandoFaca : ruleComandoFaca EOF ;
    public final void entryRuleComandoFaca() throws RecognitionException {
        try {
            // InternalT5.g:629:1: ( ruleComandoFaca EOF )
            // InternalT5.g:630:1: ruleComandoFaca EOF
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
    // InternalT5.g:637:1: ruleComandoFaca : ( ( rule__ComandoFaca__Group__0 ) ) ;
    public final void ruleComandoFaca() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:641:2: ( ( ( rule__ComandoFaca__Group__0 ) ) )
            // InternalT5.g:642:2: ( ( rule__ComandoFaca__Group__0 ) )
            {
            // InternalT5.g:642:2: ( ( rule__ComandoFaca__Group__0 ) )
            // InternalT5.g:643:3: ( rule__ComandoFaca__Group__0 )
            {
             before(grammarAccess.getComandoFacaAccess().getGroup()); 
            // InternalT5.g:644:3: ( rule__ComandoFaca__Group__0 )
            // InternalT5.g:644:4: rule__ComandoFaca__Group__0
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
    // InternalT5.g:653:1: entryRuleComandoAtribuicao : ruleComandoAtribuicao EOF ;
    public final void entryRuleComandoAtribuicao() throws RecognitionException {
        try {
            // InternalT5.g:654:1: ( ruleComandoAtribuicao EOF )
            // InternalT5.g:655:1: ruleComandoAtribuicao EOF
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
    // InternalT5.g:662:1: ruleComandoAtribuicao : ( ( rule__ComandoAtribuicao__Group__0 ) ) ;
    public final void ruleComandoAtribuicao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:666:2: ( ( ( rule__ComandoAtribuicao__Group__0 ) ) )
            // InternalT5.g:667:2: ( ( rule__ComandoAtribuicao__Group__0 ) )
            {
            // InternalT5.g:667:2: ( ( rule__ComandoAtribuicao__Group__0 ) )
            // InternalT5.g:668:3: ( rule__ComandoAtribuicao__Group__0 )
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getGroup()); 
            // InternalT5.g:669:3: ( rule__ComandoAtribuicao__Group__0 )
            // InternalT5.g:669:4: rule__ComandoAtribuicao__Group__0
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
    // InternalT5.g:678:1: entryRuleComandoChamada : ruleComandoChamada EOF ;
    public final void entryRuleComandoChamada() throws RecognitionException {
        try {
            // InternalT5.g:679:1: ( ruleComandoChamada EOF )
            // InternalT5.g:680:1: ruleComandoChamada EOF
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
    // InternalT5.g:687:1: ruleComandoChamada : ( ( rule__ComandoChamada__Group__0 ) ) ;
    public final void ruleComandoChamada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:691:2: ( ( ( rule__ComandoChamada__Group__0 ) ) )
            // InternalT5.g:692:2: ( ( rule__ComandoChamada__Group__0 ) )
            {
            // InternalT5.g:692:2: ( ( rule__ComandoChamada__Group__0 ) )
            // InternalT5.g:693:3: ( rule__ComandoChamada__Group__0 )
            {
             before(grammarAccess.getComandoChamadaAccess().getGroup()); 
            // InternalT5.g:694:3: ( rule__ComandoChamada__Group__0 )
            // InternalT5.g:694:4: rule__ComandoChamada__Group__0
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
    // InternalT5.g:703:1: entryRuleComandoRetorne : ruleComandoRetorne EOF ;
    public final void entryRuleComandoRetorne() throws RecognitionException {
        try {
            // InternalT5.g:704:1: ( ruleComandoRetorne EOF )
            // InternalT5.g:705:1: ruleComandoRetorne EOF
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
    // InternalT5.g:712:1: ruleComandoRetorne : ( ( rule__ComandoRetorne__Group__0 ) ) ;
    public final void ruleComandoRetorne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:716:2: ( ( ( rule__ComandoRetorne__Group__0 ) ) )
            // InternalT5.g:717:2: ( ( rule__ComandoRetorne__Group__0 ) )
            {
            // InternalT5.g:717:2: ( ( rule__ComandoRetorne__Group__0 ) )
            // InternalT5.g:718:3: ( rule__ComandoRetorne__Group__0 )
            {
             before(grammarAccess.getComandoRetorneAccess().getGroup()); 
            // InternalT5.g:719:3: ( rule__ComandoRetorne__Group__0 )
            // InternalT5.g:719:4: rule__ComandoRetorne__Group__0
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
    // InternalT5.g:728:1: entryRuleSelecao : ruleSelecao EOF ;
    public final void entryRuleSelecao() throws RecognitionException {
        try {
            // InternalT5.g:729:1: ( ruleSelecao EOF )
            // InternalT5.g:730:1: ruleSelecao EOF
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
    // InternalT5.g:737:1: ruleSelecao : ( ( rule__Selecao__Group__0 ) ) ;
    public final void ruleSelecao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:741:2: ( ( ( rule__Selecao__Group__0 ) ) )
            // InternalT5.g:742:2: ( ( rule__Selecao__Group__0 ) )
            {
            // InternalT5.g:742:2: ( ( rule__Selecao__Group__0 ) )
            // InternalT5.g:743:3: ( rule__Selecao__Group__0 )
            {
             before(grammarAccess.getSelecaoAccess().getGroup()); 
            // InternalT5.g:744:3: ( rule__Selecao__Group__0 )
            // InternalT5.g:744:4: rule__Selecao__Group__0
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
    // InternalT5.g:753:1: entryRuleItemSelecao : ruleItemSelecao EOF ;
    public final void entryRuleItemSelecao() throws RecognitionException {
        try {
            // InternalT5.g:754:1: ( ruleItemSelecao EOF )
            // InternalT5.g:755:1: ruleItemSelecao EOF
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
    // InternalT5.g:762:1: ruleItemSelecao : ( ( rule__ItemSelecao__Group__0 ) ) ;
    public final void ruleItemSelecao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:766:2: ( ( ( rule__ItemSelecao__Group__0 ) ) )
            // InternalT5.g:767:2: ( ( rule__ItemSelecao__Group__0 ) )
            {
            // InternalT5.g:767:2: ( ( rule__ItemSelecao__Group__0 ) )
            // InternalT5.g:768:3: ( rule__ItemSelecao__Group__0 )
            {
             before(grammarAccess.getItemSelecaoAccess().getGroup()); 
            // InternalT5.g:769:3: ( rule__ItemSelecao__Group__0 )
            // InternalT5.g:769:4: rule__ItemSelecao__Group__0
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
    // InternalT5.g:778:1: entryRuleNumeroIntervalo : ruleNumeroIntervalo EOF ;
    public final void entryRuleNumeroIntervalo() throws RecognitionException {
        try {
            // InternalT5.g:779:1: ( ruleNumeroIntervalo EOF )
            // InternalT5.g:780:1: ruleNumeroIntervalo EOF
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
    // InternalT5.g:787:1: ruleNumeroIntervalo : ( ( rule__NumeroIntervalo__Group__0 ) ) ;
    public final void ruleNumeroIntervalo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:791:2: ( ( ( rule__NumeroIntervalo__Group__0 ) ) )
            // InternalT5.g:792:2: ( ( rule__NumeroIntervalo__Group__0 ) )
            {
            // InternalT5.g:792:2: ( ( rule__NumeroIntervalo__Group__0 ) )
            // InternalT5.g:793:3: ( rule__NumeroIntervalo__Group__0 )
            {
             before(grammarAccess.getNumeroIntervaloAccess().getGroup()); 
            // InternalT5.g:794:3: ( rule__NumeroIntervalo__Group__0 )
            // InternalT5.g:794:4: rule__NumeroIntervalo__Group__0
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
    // InternalT5.g:803:1: entryRuleOpUnario : ruleOpUnario EOF ;
    public final void entryRuleOpUnario() throws RecognitionException {
        try {
            // InternalT5.g:804:1: ( ruleOpUnario EOF )
            // InternalT5.g:805:1: ruleOpUnario EOF
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
    // InternalT5.g:812:1: ruleOpUnario : ( '-' ) ;
    public final void ruleOpUnario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:816:2: ( ( '-' ) )
            // InternalT5.g:817:2: ( '-' )
            {
            // InternalT5.g:817:2: ( '-' )
            // InternalT5.g:818:3: '-'
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
    // InternalT5.g:828:1: entryRuleExpressaoAritmetica : ruleExpressaoAritmetica EOF ;
    public final void entryRuleExpressaoAritmetica() throws RecognitionException {
        try {
            // InternalT5.g:829:1: ( ruleExpressaoAritmetica EOF )
            // InternalT5.g:830:1: ruleExpressaoAritmetica EOF
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
    // InternalT5.g:837:1: ruleExpressaoAritmetica : ( ( rule__ExpressaoAritmetica__Group__0 ) ) ;
    public final void ruleExpressaoAritmetica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:841:2: ( ( ( rule__ExpressaoAritmetica__Group__0 ) ) )
            // InternalT5.g:842:2: ( ( rule__ExpressaoAritmetica__Group__0 ) )
            {
            // InternalT5.g:842:2: ( ( rule__ExpressaoAritmetica__Group__0 ) )
            // InternalT5.g:843:3: ( rule__ExpressaoAritmetica__Group__0 )
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getGroup()); 
            // InternalT5.g:844:3: ( rule__ExpressaoAritmetica__Group__0 )
            // InternalT5.g:844:4: rule__ExpressaoAritmetica__Group__0
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
    // InternalT5.g:853:1: entryRuleOutroTermoAritmetico : ruleOutroTermoAritmetico EOF ;
    public final void entryRuleOutroTermoAritmetico() throws RecognitionException {
        try {
            // InternalT5.g:854:1: ( ruleOutroTermoAritmetico EOF )
            // InternalT5.g:855:1: ruleOutroTermoAritmetico EOF
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
    // InternalT5.g:862:1: ruleOutroTermoAritmetico : ( ( rule__OutroTermoAritmetico__Group__0 ) ) ;
    public final void ruleOutroTermoAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:866:2: ( ( ( rule__OutroTermoAritmetico__Group__0 ) ) )
            // InternalT5.g:867:2: ( ( rule__OutroTermoAritmetico__Group__0 ) )
            {
            // InternalT5.g:867:2: ( ( rule__OutroTermoAritmetico__Group__0 ) )
            // InternalT5.g:868:3: ( rule__OutroTermoAritmetico__Group__0 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getGroup()); 
            // InternalT5.g:869:3: ( rule__OutroTermoAritmetico__Group__0 )
            // InternalT5.g:869:4: rule__OutroTermoAritmetico__Group__0
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
    // InternalT5.g:878:1: entryRuleTermoAritmetico : ruleTermoAritmetico EOF ;
    public final void entryRuleTermoAritmetico() throws RecognitionException {
        try {
            // InternalT5.g:879:1: ( ruleTermoAritmetico EOF )
            // InternalT5.g:880:1: ruleTermoAritmetico EOF
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
    // InternalT5.g:887:1: ruleTermoAritmetico : ( ( rule__TermoAritmetico__Group__0 ) ) ;
    public final void ruleTermoAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:891:2: ( ( ( rule__TermoAritmetico__Group__0 ) ) )
            // InternalT5.g:892:2: ( ( rule__TermoAritmetico__Group__0 ) )
            {
            // InternalT5.g:892:2: ( ( rule__TermoAritmetico__Group__0 ) )
            // InternalT5.g:893:3: ( rule__TermoAritmetico__Group__0 )
            {
             before(grammarAccess.getTermoAritmeticoAccess().getGroup()); 
            // InternalT5.g:894:3: ( rule__TermoAritmetico__Group__0 )
            // InternalT5.g:894:4: rule__TermoAritmetico__Group__0
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
    // InternalT5.g:903:1: entryRuleOutroFatorAritmetico : ruleOutroFatorAritmetico EOF ;
    public final void entryRuleOutroFatorAritmetico() throws RecognitionException {
        try {
            // InternalT5.g:904:1: ( ruleOutroFatorAritmetico EOF )
            // InternalT5.g:905:1: ruleOutroFatorAritmetico EOF
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
    // InternalT5.g:912:1: ruleOutroFatorAritmetico : ( ( rule__OutroFatorAritmetico__Group__0 ) ) ;
    public final void ruleOutroFatorAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:916:2: ( ( ( rule__OutroFatorAritmetico__Group__0 ) ) )
            // InternalT5.g:917:2: ( ( rule__OutroFatorAritmetico__Group__0 ) )
            {
            // InternalT5.g:917:2: ( ( rule__OutroFatorAritmetico__Group__0 ) )
            // InternalT5.g:918:3: ( rule__OutroFatorAritmetico__Group__0 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getGroup()); 
            // InternalT5.g:919:3: ( rule__OutroFatorAritmetico__Group__0 )
            // InternalT5.g:919:4: rule__OutroFatorAritmetico__Group__0
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
    // InternalT5.g:928:1: entryRuleFatorAritmetico : ruleFatorAritmetico EOF ;
    public final void entryRuleFatorAritmetico() throws RecognitionException {
        try {
            // InternalT5.g:929:1: ( ruleFatorAritmetico EOF )
            // InternalT5.g:930:1: ruleFatorAritmetico EOF
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
    // InternalT5.g:937:1: ruleFatorAritmetico : ( ( rule__FatorAritmetico__Alternatives ) ) ;
    public final void ruleFatorAritmetico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:941:2: ( ( ( rule__FatorAritmetico__Alternatives ) ) )
            // InternalT5.g:942:2: ( ( rule__FatorAritmetico__Alternatives ) )
            {
            // InternalT5.g:942:2: ( ( rule__FatorAritmetico__Alternatives ) )
            // InternalT5.g:943:3: ( rule__FatorAritmetico__Alternatives )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getAlternatives()); 
            // InternalT5.g:944:3: ( rule__FatorAritmetico__Alternatives )
            // InternalT5.g:944:4: rule__FatorAritmetico__Alternatives
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
    // InternalT5.g:953:1: entryRuleExpressao : ruleExpressao EOF ;
    public final void entryRuleExpressao() throws RecognitionException {
        try {
            // InternalT5.g:954:1: ( ruleExpressao EOF )
            // InternalT5.g:955:1: ruleExpressao EOF
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
    // InternalT5.g:962:1: ruleExpressao : ( ( rule__Expressao__Group__0 ) ) ;
    public final void ruleExpressao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:966:2: ( ( ( rule__Expressao__Group__0 ) ) )
            // InternalT5.g:967:2: ( ( rule__Expressao__Group__0 ) )
            {
            // InternalT5.g:967:2: ( ( rule__Expressao__Group__0 ) )
            // InternalT5.g:968:3: ( rule__Expressao__Group__0 )
            {
             before(grammarAccess.getExpressaoAccess().getGroup()); 
            // InternalT5.g:969:3: ( rule__Expressao__Group__0 )
            // InternalT5.g:969:4: rule__Expressao__Group__0
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
    // InternalT5.g:978:1: entryRuleTermoLogico : ruleTermoLogico EOF ;
    public final void entryRuleTermoLogico() throws RecognitionException {
        try {
            // InternalT5.g:979:1: ( ruleTermoLogico EOF )
            // InternalT5.g:980:1: ruleTermoLogico EOF
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
    // InternalT5.g:987:1: ruleTermoLogico : ( ( rule__TermoLogico__Group__0 ) ) ;
    public final void ruleTermoLogico() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:991:2: ( ( ( rule__TermoLogico__Group__0 ) ) )
            // InternalT5.g:992:2: ( ( rule__TermoLogico__Group__0 ) )
            {
            // InternalT5.g:992:2: ( ( rule__TermoLogico__Group__0 ) )
            // InternalT5.g:993:3: ( rule__TermoLogico__Group__0 )
            {
             before(grammarAccess.getTermoLogicoAccess().getGroup()); 
            // InternalT5.g:994:3: ( rule__TermoLogico__Group__0 )
            // InternalT5.g:994:4: rule__TermoLogico__Group__0
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
    // InternalT5.g:1003:1: entryRuleExpressaoRelacional : ruleExpressaoRelacional EOF ;
    public final void entryRuleExpressaoRelacional() throws RecognitionException {
        try {
            // InternalT5.g:1004:1: ( ruleExpressaoRelacional EOF )
            // InternalT5.g:1005:1: ruleExpressaoRelacional EOF
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
    // InternalT5.g:1012:1: ruleExpressaoRelacional : ( ( rule__ExpressaoRelacional__Group__0 ) ) ;
    public final void ruleExpressaoRelacional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1016:2: ( ( ( rule__ExpressaoRelacional__Group__0 ) ) )
            // InternalT5.g:1017:2: ( ( rule__ExpressaoRelacional__Group__0 ) )
            {
            // InternalT5.g:1017:2: ( ( rule__ExpressaoRelacional__Group__0 ) )
            // InternalT5.g:1018:3: ( rule__ExpressaoRelacional__Group__0 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getGroup()); 
            // InternalT5.g:1019:3: ( rule__ExpressaoRelacional__Group__0 )
            // InternalT5.g:1019:4: rule__ExpressaoRelacional__Group__0
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
    // InternalT5.g:1028:1: entryRuleOpArit1 : ruleOpArit1 EOF ;
    public final void entryRuleOpArit1() throws RecognitionException {
        try {
            // InternalT5.g:1029:1: ( ruleOpArit1 EOF )
            // InternalT5.g:1030:1: ruleOpArit1 EOF
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
    // InternalT5.g:1037:1: ruleOpArit1 : ( ( rule__OpArit1__Alternatives ) ) ;
    public final void ruleOpArit1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1041:2: ( ( ( rule__OpArit1__Alternatives ) ) )
            // InternalT5.g:1042:2: ( ( rule__OpArit1__Alternatives ) )
            {
            // InternalT5.g:1042:2: ( ( rule__OpArit1__Alternatives ) )
            // InternalT5.g:1043:3: ( rule__OpArit1__Alternatives )
            {
             before(grammarAccess.getOpArit1Access().getAlternatives()); 
            // InternalT5.g:1044:3: ( rule__OpArit1__Alternatives )
            // InternalT5.g:1044:4: rule__OpArit1__Alternatives
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
    // InternalT5.g:1053:1: entryRuleOpArit2 : ruleOpArit2 EOF ;
    public final void entryRuleOpArit2() throws RecognitionException {
        try {
            // InternalT5.g:1054:1: ( ruleOpArit2 EOF )
            // InternalT5.g:1055:1: ruleOpArit2 EOF
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
    // InternalT5.g:1062:1: ruleOpArit2 : ( ( rule__OpArit2__Alternatives ) ) ;
    public final void ruleOpArit2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1066:2: ( ( ( rule__OpArit2__Alternatives ) ) )
            // InternalT5.g:1067:2: ( ( rule__OpArit2__Alternatives ) )
            {
            // InternalT5.g:1067:2: ( ( rule__OpArit2__Alternatives ) )
            // InternalT5.g:1068:3: ( rule__OpArit2__Alternatives )
            {
             before(grammarAccess.getOpArit2Access().getAlternatives()); 
            // InternalT5.g:1069:3: ( rule__OpArit2__Alternatives )
            // InternalT5.g:1069:4: rule__OpArit2__Alternatives
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
    // InternalT5.g:1078:1: entryRuleOpRel : ruleOpRel EOF ;
    public final void entryRuleOpRel() throws RecognitionException {
        try {
            // InternalT5.g:1079:1: ( ruleOpRel EOF )
            // InternalT5.g:1080:1: ruleOpRel EOF
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
    // InternalT5.g:1087:1: ruleOpRel : ( ( rule__OpRel__Alternatives ) ) ;
    public final void ruleOpRel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1091:2: ( ( ( rule__OpRel__Alternatives ) ) )
            // InternalT5.g:1092:2: ( ( rule__OpRel__Alternatives ) )
            {
            // InternalT5.g:1092:2: ( ( rule__OpRel__Alternatives ) )
            // InternalT5.g:1093:3: ( rule__OpRel__Alternatives )
            {
             before(grammarAccess.getOpRelAccess().getAlternatives()); 
            // InternalT5.g:1094:3: ( rule__OpRel__Alternatives )
            // InternalT5.g:1094:4: rule__OpRel__Alternatives
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
    // InternalT5.g:1103:1: entryRuleOpBool : ruleOpBool EOF ;
    public final void entryRuleOpBool() throws RecognitionException {
        try {
            // InternalT5.g:1104:1: ( ruleOpBool EOF )
            // InternalT5.g:1105:1: ruleOpBool EOF
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
    // InternalT5.g:1112:1: ruleOpBool : ( ( rule__OpBool__Alternatives ) ) ;
    public final void ruleOpBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1116:2: ( ( ( rule__OpBool__Alternatives ) ) )
            // InternalT5.g:1117:2: ( ( rule__OpBool__Alternatives ) )
            {
            // InternalT5.g:1117:2: ( ( rule__OpBool__Alternatives ) )
            // InternalT5.g:1118:3: ( rule__OpBool__Alternatives )
            {
             before(grammarAccess.getOpBoolAccess().getAlternatives()); 
            // InternalT5.g:1119:3: ( rule__OpBool__Alternatives )
            // InternalT5.g:1119:4: rule__OpBool__Alternatives
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
    // InternalT5.g:1127:1: rule__Declaracao__Alternatives : ( ( ruleDeclaracaoLocal ) | ( ruleDeclaracaoGlobal ) );
    public final void rule__Declaracao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1131:1: ( ( ruleDeclaracaoLocal ) | ( ruleDeclaracaoGlobal ) )
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
                    // InternalT5.g:1132:2: ( ruleDeclaracaoLocal )
                    {
                    // InternalT5.g:1132:2: ( ruleDeclaracaoLocal )
                    // InternalT5.g:1133:3: ruleDeclaracaoLocal
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
                    // InternalT5.g:1138:2: ( ruleDeclaracaoGlobal )
                    {
                    // InternalT5.g:1138:2: ( ruleDeclaracaoGlobal )
                    // InternalT5.g:1139:3: ruleDeclaracaoGlobal
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
    // InternalT5.g:1148:1: rule__DeclaracaoLocal__Alternatives : ( ( ( rule__DeclaracaoLocal__Group_0__0 ) ) | ( ( rule__DeclaracaoLocal__Group_1__0 ) ) | ( ( rule__DeclaracaoLocal__Group_2__0 ) ) );
    public final void rule__DeclaracaoLocal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1152:1: ( ( ( rule__DeclaracaoLocal__Group_0__0 ) ) | ( ( rule__DeclaracaoLocal__Group_1__0 ) ) | ( ( rule__DeclaracaoLocal__Group_2__0 ) ) )
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
                    // InternalT5.g:1153:2: ( ( rule__DeclaracaoLocal__Group_0__0 ) )
                    {
                    // InternalT5.g:1153:2: ( ( rule__DeclaracaoLocal__Group_0__0 ) )
                    // InternalT5.g:1154:3: ( rule__DeclaracaoLocal__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaracaoLocalAccess().getGroup_0()); 
                    // InternalT5.g:1155:3: ( rule__DeclaracaoLocal__Group_0__0 )
                    // InternalT5.g:1155:4: rule__DeclaracaoLocal__Group_0__0
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
                    // InternalT5.g:1159:2: ( ( rule__DeclaracaoLocal__Group_1__0 ) )
                    {
                    // InternalT5.g:1159:2: ( ( rule__DeclaracaoLocal__Group_1__0 ) )
                    // InternalT5.g:1160:3: ( rule__DeclaracaoLocal__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaracaoLocalAccess().getGroup_1()); 
                    // InternalT5.g:1161:3: ( rule__DeclaracaoLocal__Group_1__0 )
                    // InternalT5.g:1161:4: rule__DeclaracaoLocal__Group_1__0
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
                    // InternalT5.g:1165:2: ( ( rule__DeclaracaoLocal__Group_2__0 ) )
                    {
                    // InternalT5.g:1165:2: ( ( rule__DeclaracaoLocal__Group_2__0 ) )
                    // InternalT5.g:1166:3: ( rule__DeclaracaoLocal__Group_2__0 )
                    {
                     before(grammarAccess.getDeclaracaoLocalAccess().getGroup_2()); 
                    // InternalT5.g:1167:3: ( rule__DeclaracaoLocal__Group_2__0 )
                    // InternalT5.g:1167:4: rule__DeclaracaoLocal__Group_2__0
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
    // InternalT5.g:1175:1: rule__DeclaracaoGlobal__Alternatives : ( ( ( rule__DeclaracaoGlobal__Group_0__0 ) ) | ( ( rule__DeclaracaoGlobal__Group_1__0 ) ) );
    public final void rule__DeclaracaoGlobal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1179:1: ( ( ( rule__DeclaracaoGlobal__Group_0__0 ) ) | ( ( rule__DeclaracaoGlobal__Group_1__0 ) ) )
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
                    // InternalT5.g:1180:2: ( ( rule__DeclaracaoGlobal__Group_0__0 ) )
                    {
                    // InternalT5.g:1180:2: ( ( rule__DeclaracaoGlobal__Group_0__0 ) )
                    // InternalT5.g:1181:3: ( rule__DeclaracaoGlobal__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaracaoGlobalAccess().getGroup_0()); 
                    // InternalT5.g:1182:3: ( rule__DeclaracaoGlobal__Group_0__0 )
                    // InternalT5.g:1182:4: rule__DeclaracaoGlobal__Group_0__0
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
                    // InternalT5.g:1186:2: ( ( rule__DeclaracaoGlobal__Group_1__0 ) )
                    {
                    // InternalT5.g:1186:2: ( ( rule__DeclaracaoGlobal__Group_1__0 ) )
                    // InternalT5.g:1187:3: ( rule__DeclaracaoGlobal__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaracaoGlobalAccess().getGroup_1()); 
                    // InternalT5.g:1188:3: ( rule__DeclaracaoGlobal__Group_1__0 )
                    // InternalT5.g:1188:4: rule__DeclaracaoGlobal__Group_1__0
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
    // InternalT5.g:1196:1: rule__Tipo__Alternatives : ( ( ( rule__Tipo__RegistroAssignment_0 ) ) | ( ( rule__Tipo__TipoExtAssignment_1 ) ) );
    public final void rule__Tipo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1200:1: ( ( ( rule__Tipo__RegistroAssignment_0 ) ) | ( ( rule__Tipo__TipoExtAssignment_1 ) ) )
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
                    // InternalT5.g:1201:2: ( ( rule__Tipo__RegistroAssignment_0 ) )
                    {
                    // InternalT5.g:1201:2: ( ( rule__Tipo__RegistroAssignment_0 ) )
                    // InternalT5.g:1202:3: ( rule__Tipo__RegistroAssignment_0 )
                    {
                     before(grammarAccess.getTipoAccess().getRegistroAssignment_0()); 
                    // InternalT5.g:1203:3: ( rule__Tipo__RegistroAssignment_0 )
                    // InternalT5.g:1203:4: rule__Tipo__RegistroAssignment_0
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
                    // InternalT5.g:1207:2: ( ( rule__Tipo__TipoExtAssignment_1 ) )
                    {
                    // InternalT5.g:1207:2: ( ( rule__Tipo__TipoExtAssignment_1 ) )
                    // InternalT5.g:1208:3: ( rule__Tipo__TipoExtAssignment_1 )
                    {
                     before(grammarAccess.getTipoAccess().getTipoExtAssignment_1()); 
                    // InternalT5.g:1209:3: ( rule__Tipo__TipoExtAssignment_1 )
                    // InternalT5.g:1209:4: rule__Tipo__TipoExtAssignment_1
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
    // InternalT5.g:1217:1: rule__TipoEstendido__Alternatives_1 : ( ( ( rule__TipoEstendido__BasicAssignment_1_0 ) ) | ( ( rule__TipoEstendido__RefAssignment_1_1 ) ) );
    public final void rule__TipoEstendido__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1221:1: ( ( ( rule__TipoEstendido__BasicAssignment_1_0 ) ) | ( ( rule__TipoEstendido__RefAssignment_1_1 ) ) )
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
                    // InternalT5.g:1222:2: ( ( rule__TipoEstendido__BasicAssignment_1_0 ) )
                    {
                    // InternalT5.g:1222:2: ( ( rule__TipoEstendido__BasicAssignment_1_0 ) )
                    // InternalT5.g:1223:3: ( rule__TipoEstendido__BasicAssignment_1_0 )
                    {
                     before(grammarAccess.getTipoEstendidoAccess().getBasicAssignment_1_0()); 
                    // InternalT5.g:1224:3: ( rule__TipoEstendido__BasicAssignment_1_0 )
                    // InternalT5.g:1224:4: rule__TipoEstendido__BasicAssignment_1_0
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
                    // InternalT5.g:1228:2: ( ( rule__TipoEstendido__RefAssignment_1_1 ) )
                    {
                    // InternalT5.g:1228:2: ( ( rule__TipoEstendido__RefAssignment_1_1 ) )
                    // InternalT5.g:1229:3: ( rule__TipoEstendido__RefAssignment_1_1 )
                    {
                     before(grammarAccess.getTipoEstendidoAccess().getRefAssignment_1_1()); 
                    // InternalT5.g:1230:3: ( rule__TipoEstendido__RefAssignment_1_1 )
                    // InternalT5.g:1230:4: rule__TipoEstendido__RefAssignment_1_1
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
    // InternalT5.g:1238:1: rule__TipoBasico__Alternatives : ( ( 'literal' ) | ( 'inteiro' ) | ( 'real' ) | ( 'logico' ) );
    public final void rule__TipoBasico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1242:1: ( ( 'literal' ) | ( 'inteiro' ) | ( 'real' ) | ( 'logico' ) )
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
                    // InternalT5.g:1243:2: ( 'literal' )
                    {
                    // InternalT5.g:1243:2: ( 'literal' )
                    // InternalT5.g:1244:3: 'literal'
                    {
                     before(grammarAccess.getTipoBasicoAccess().getLiteralKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTipoBasicoAccess().getLiteralKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1249:2: ( 'inteiro' )
                    {
                    // InternalT5.g:1249:2: ( 'inteiro' )
                    // InternalT5.g:1250:3: 'inteiro'
                    {
                     before(grammarAccess.getTipoBasicoAccess().getInteiroKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTipoBasicoAccess().getInteiroKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1255:2: ( 'real' )
                    {
                    // InternalT5.g:1255:2: ( 'real' )
                    // InternalT5.g:1256:3: 'real'
                    {
                     before(grammarAccess.getTipoBasicoAccess().getRealKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTipoBasicoAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:1261:2: ( 'logico' )
                    {
                    // InternalT5.g:1261:2: ( 'logico' )
                    // InternalT5.g:1262:3: 'logico'
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
    // InternalT5.g:1271:1: rule__ValorConstante__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_REAL ) | ( 'verdadeiro' ) | ( 'falso' ) );
    public final void rule__ValorConstante__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1275:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_REAL ) | ( 'verdadeiro' ) | ( 'falso' ) )
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
                    // InternalT5.g:1276:2: ( RULE_STRING )
                    {
                    // InternalT5.g:1276:2: ( RULE_STRING )
                    // InternalT5.g:1277:3: RULE_STRING
                    {
                     before(grammarAccess.getValorConstanteAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1282:2: ( RULE_INT )
                    {
                    // InternalT5.g:1282:2: ( RULE_INT )
                    // InternalT5.g:1283:3: RULE_INT
                    {
                     before(grammarAccess.getValorConstanteAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1288:2: ( RULE_REAL )
                    {
                    // InternalT5.g:1288:2: ( RULE_REAL )
                    // InternalT5.g:1289:3: RULE_REAL
                    {
                     before(grammarAccess.getValorConstanteAccess().getREALTerminalRuleCall_2()); 
                    match(input,RULE_REAL,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getREALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:1294:2: ( 'verdadeiro' )
                    {
                    // InternalT5.g:1294:2: ( 'verdadeiro' )
                    // InternalT5.g:1295:3: 'verdadeiro'
                    {
                     before(grammarAccess.getValorConstanteAccess().getVerdadeiroKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getValorConstanteAccess().getVerdadeiroKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT5.g:1300:2: ( 'falso' )
                    {
                    // InternalT5.g:1300:2: ( 'falso' )
                    // InternalT5.g:1301:3: 'falso'
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
    // InternalT5.g:1310:1: rule__Comando__Alternatives : ( ( ruleComandoLeia ) | ( ruleComandoEscreva ) | ( ruleComandoSe ) | ( ruleComandoCaso ) | ( ruleComandoPara ) | ( ruleComandoEnquanto ) | ( ruleComandoFaca ) | ( ruleComandoAtribuicao ) | ( ruleComandoChamada ) | ( ruleComandoRetorne ) );
    public final void rule__Comando__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1314:1: ( ( ruleComandoLeia ) | ( ruleComandoEscreva ) | ( ruleComandoSe ) | ( ruleComandoCaso ) | ( ruleComandoPara ) | ( ruleComandoEnquanto ) | ( ruleComandoFaca ) | ( ruleComandoAtribuicao ) | ( ruleComandoChamada ) | ( ruleComandoRetorne ) )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalT5.g:1315:2: ( ruleComandoLeia )
                    {
                    // InternalT5.g:1315:2: ( ruleComandoLeia )
                    // InternalT5.g:1316:3: ruleComandoLeia
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
                    // InternalT5.g:1321:2: ( ruleComandoEscreva )
                    {
                    // InternalT5.g:1321:2: ( ruleComandoEscreva )
                    // InternalT5.g:1322:3: ruleComandoEscreva
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
                    // InternalT5.g:1327:2: ( ruleComandoSe )
                    {
                    // InternalT5.g:1327:2: ( ruleComandoSe )
                    // InternalT5.g:1328:3: ruleComandoSe
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
                    // InternalT5.g:1333:2: ( ruleComandoCaso )
                    {
                    // InternalT5.g:1333:2: ( ruleComandoCaso )
                    // InternalT5.g:1334:3: ruleComandoCaso
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
                    // InternalT5.g:1339:2: ( ruleComandoPara )
                    {
                    // InternalT5.g:1339:2: ( ruleComandoPara )
                    // InternalT5.g:1340:3: ruleComandoPara
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
                    // InternalT5.g:1345:2: ( ruleComandoEnquanto )
                    {
                    // InternalT5.g:1345:2: ( ruleComandoEnquanto )
                    // InternalT5.g:1346:3: ruleComandoEnquanto
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
                    // InternalT5.g:1351:2: ( ruleComandoFaca )
                    {
                    // InternalT5.g:1351:2: ( ruleComandoFaca )
                    // InternalT5.g:1352:3: ruleComandoFaca
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
                    // InternalT5.g:1357:2: ( ruleComandoAtribuicao )
                    {
                    // InternalT5.g:1357:2: ( ruleComandoAtribuicao )
                    // InternalT5.g:1358:3: ruleComandoAtribuicao
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
                    // InternalT5.g:1363:2: ( ruleComandoChamada )
                    {
                    // InternalT5.g:1363:2: ( ruleComandoChamada )
                    // InternalT5.g:1364:3: ruleComandoChamada
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
                    // InternalT5.g:1369:2: ( ruleComandoRetorne )
                    {
                    // InternalT5.g:1369:2: ( ruleComandoRetorne )
                    // InternalT5.g:1370:3: ruleComandoRetorne
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
    // InternalT5.g:1379:1: rule__FatorAritmetico__Alternatives : ( ( ( rule__FatorAritmetico__Group_0__0 ) ) | ( ( rule__FatorAritmetico__NumeroAssignment_1 ) ) | ( ( rule__FatorAritmetico__RealAssignment_2 ) ) | ( ( rule__FatorAritmetico__Group_3__0 ) ) | ( RULE_STRING ) );
    public final void rule__FatorAritmetico__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1383:1: ( ( ( rule__FatorAritmetico__Group_0__0 ) ) | ( ( rule__FatorAritmetico__NumeroAssignment_1 ) ) | ( ( rule__FatorAritmetico__RealAssignment_2 ) ) | ( ( rule__FatorAritmetico__Group_3__0 ) ) | ( RULE_STRING ) )
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
                    // InternalT5.g:1384:2: ( ( rule__FatorAritmetico__Group_0__0 ) )
                    {
                    // InternalT5.g:1384:2: ( ( rule__FatorAritmetico__Group_0__0 ) )
                    // InternalT5.g:1385:3: ( rule__FatorAritmetico__Group_0__0 )
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getGroup_0()); 
                    // InternalT5.g:1386:3: ( rule__FatorAritmetico__Group_0__0 )
                    // InternalT5.g:1386:4: rule__FatorAritmetico__Group_0__0
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
                    // InternalT5.g:1390:2: ( ( rule__FatorAritmetico__NumeroAssignment_1 ) )
                    {
                    // InternalT5.g:1390:2: ( ( rule__FatorAritmetico__NumeroAssignment_1 ) )
                    // InternalT5.g:1391:3: ( rule__FatorAritmetico__NumeroAssignment_1 )
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getNumeroAssignment_1()); 
                    // InternalT5.g:1392:3: ( rule__FatorAritmetico__NumeroAssignment_1 )
                    // InternalT5.g:1392:4: rule__FatorAritmetico__NumeroAssignment_1
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
                    // InternalT5.g:1396:2: ( ( rule__FatorAritmetico__RealAssignment_2 ) )
                    {
                    // InternalT5.g:1396:2: ( ( rule__FatorAritmetico__RealAssignment_2 ) )
                    // InternalT5.g:1397:3: ( rule__FatorAritmetico__RealAssignment_2 )
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getRealAssignment_2()); 
                    // InternalT5.g:1398:3: ( rule__FatorAritmetico__RealAssignment_2 )
                    // InternalT5.g:1398:4: rule__FatorAritmetico__RealAssignment_2
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
                    // InternalT5.g:1402:2: ( ( rule__FatorAritmetico__Group_3__0 ) )
                    {
                    // InternalT5.g:1402:2: ( ( rule__FatorAritmetico__Group_3__0 ) )
                    // InternalT5.g:1403:3: ( rule__FatorAritmetico__Group_3__0 )
                    {
                     before(grammarAccess.getFatorAritmeticoAccess().getGroup_3()); 
                    // InternalT5.g:1404:3: ( rule__FatorAritmetico__Group_3__0 )
                    // InternalT5.g:1404:4: rule__FatorAritmetico__Group_3__0
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
                    // InternalT5.g:1408:2: ( RULE_STRING )
                    {
                    // InternalT5.g:1408:2: ( RULE_STRING )
                    // InternalT5.g:1409:3: RULE_STRING
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
    // InternalT5.g:1418:1: rule__OpArit1__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__OpArit1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1422:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalT5.g:1423:2: ( '+' )
                    {
                    // InternalT5.g:1423:2: ( '+' )
                    // InternalT5.g:1424:3: '+'
                    {
                     before(grammarAccess.getOpArit1Access().getPlusSignKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOpArit1Access().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1429:2: ( '-' )
                    {
                    // InternalT5.g:1429:2: ( '-' )
                    // InternalT5.g:1430:3: '-'
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
    // InternalT5.g:1439:1: rule__OpArit2__Alternatives : ( ( '*' ) | ( '/' ) );
    public final void rule__OpArit2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1443:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalT5.g:1444:2: ( '*' )
                    {
                    // InternalT5.g:1444:2: ( '*' )
                    // InternalT5.g:1445:3: '*'
                    {
                     before(grammarAccess.getOpArit2Access().getAsteriskKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOpArit2Access().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1450:2: ( '/' )
                    {
                    // InternalT5.g:1450:2: ( '/' )
                    // InternalT5.g:1451:3: '/'
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
    // InternalT5.g:1460:1: rule__OpRel__Alternatives : ( ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) | ( '<>' ) | ( '=' ) );
    public final void rule__OpRel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1464:1: ( ( '>' ) | ( '>=' ) | ( '<' ) | ( '<=' ) | ( '<>' ) | ( '=' ) )
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
                    // InternalT5.g:1465:2: ( '>' )
                    {
                    // InternalT5.g:1465:2: ( '>' )
                    // InternalT5.g:1466:3: '>'
                    {
                     before(grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1471:2: ( '>=' )
                    {
                    // InternalT5.g:1471:2: ( '>=' )
                    // InternalT5.g:1472:3: '>='
                    {
                     before(grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getGreaterThanSignEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT5.g:1477:2: ( '<' )
                    {
                    // InternalT5.g:1477:2: ( '<' )
                    // InternalT5.g:1478:3: '<'
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignKeyword_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT5.g:1483:2: ( '<=' )
                    {
                    // InternalT5.g:1483:2: ( '<=' )
                    // InternalT5.g:1484:3: '<='
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT5.g:1489:2: ( '<>' )
                    {
                    // InternalT5.g:1489:2: ( '<>' )
                    // InternalT5.g:1490:3: '<>'
                    {
                     before(grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOpRelAccess().getLessThanSignGreaterThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT5.g:1495:2: ( '=' )
                    {
                    // InternalT5.g:1495:2: ( '=' )
                    // InternalT5.g:1496:3: '='
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
    // InternalT5.g:1505:1: rule__OpBool__Alternatives : ( ( 'e' ) | ( 'ou' ) );
    public final void rule__OpBool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1509:1: ( ( 'e' ) | ( 'ou' ) )
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
                    // InternalT5.g:1510:2: ( 'e' )
                    {
                    // InternalT5.g:1510:2: ( 'e' )
                    // InternalT5.g:1511:3: 'e'
                    {
                     before(grammarAccess.getOpBoolAccess().getEKeyword_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getOpBoolAccess().getEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT5.g:1516:2: ( 'ou' )
                    {
                    // InternalT5.g:1516:2: ( 'ou' )
                    // InternalT5.g:1517:3: 'ou'
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
    // InternalT5.g:1526:1: rule__Programa__Group__0 : rule__Programa__Group__0__Impl rule__Programa__Group__1 ;
    public final void rule__Programa__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1530:1: ( rule__Programa__Group__0__Impl rule__Programa__Group__1 )
            // InternalT5.g:1531:2: rule__Programa__Group__0__Impl rule__Programa__Group__1
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
    // InternalT5.g:1538:1: rule__Programa__Group__0__Impl : ( 'DECLARACOES' ) ;
    public final void rule__Programa__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1542:1: ( ( 'DECLARACOES' ) )
            // InternalT5.g:1543:1: ( 'DECLARACOES' )
            {
            // InternalT5.g:1543:1: ( 'DECLARACOES' )
            // InternalT5.g:1544:2: 'DECLARACOES'
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
    // InternalT5.g:1553:1: rule__Programa__Group__1 : rule__Programa__Group__1__Impl rule__Programa__Group__2 ;
    public final void rule__Programa__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1557:1: ( rule__Programa__Group__1__Impl rule__Programa__Group__2 )
            // InternalT5.g:1558:2: rule__Programa__Group__1__Impl rule__Programa__Group__2
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
    // InternalT5.g:1565:1: rule__Programa__Group__1__Impl : ( ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* ) ) ;
    public final void rule__Programa__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1569:1: ( ( ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* ) ) )
            // InternalT5.g:1570:1: ( ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* ) )
            {
            // InternalT5.g:1570:1: ( ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* ) )
            // InternalT5.g:1571:2: ( ( rule__Programa__DeclaracoesAssignment_1 ) ) ( ( rule__Programa__DeclaracoesAssignment_1 )* )
            {
            // InternalT5.g:1571:2: ( ( rule__Programa__DeclaracoesAssignment_1 ) )
            // InternalT5.g:1572:3: ( rule__Programa__DeclaracoesAssignment_1 )
            {
             before(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_1()); 
            // InternalT5.g:1573:3: ( rule__Programa__DeclaracoesAssignment_1 )
            // InternalT5.g:1573:4: rule__Programa__DeclaracoesAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Programa__DeclaracoesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_1()); 

            }

            // InternalT5.g:1576:2: ( ( rule__Programa__DeclaracoesAssignment_1 )* )
            // InternalT5.g:1577:3: ( rule__Programa__DeclaracoesAssignment_1 )*
            {
             before(grammarAccess.getProgramaAccess().getDeclaracoesAssignment_1()); 
            // InternalT5.g:1578:3: ( rule__Programa__DeclaracoesAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33||LA14_0==35||(LA14_0>=37 && LA14_0<=38)||LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalT5.g:1578:4: rule__Programa__DeclaracoesAssignment_1
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
    // InternalT5.g:1587:1: rule__Programa__Group__2 : rule__Programa__Group__2__Impl rule__Programa__Group__3 ;
    public final void rule__Programa__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1591:1: ( rule__Programa__Group__2__Impl rule__Programa__Group__3 )
            // InternalT5.g:1592:2: rule__Programa__Group__2__Impl rule__Programa__Group__3
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
    // InternalT5.g:1599:1: rule__Programa__Group__2__Impl : ( 'ALGORITMO' ) ;
    public final void rule__Programa__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1603:1: ( ( 'ALGORITMO' ) )
            // InternalT5.g:1604:1: ( 'ALGORITMO' )
            {
            // InternalT5.g:1604:1: ( 'ALGORITMO' )
            // InternalT5.g:1605:2: 'ALGORITMO'
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
    // InternalT5.g:1614:1: rule__Programa__Group__3 : rule__Programa__Group__3__Impl rule__Programa__Group__4 ;
    public final void rule__Programa__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1618:1: ( rule__Programa__Group__3__Impl rule__Programa__Group__4 )
            // InternalT5.g:1619:2: rule__Programa__Group__3__Impl rule__Programa__Group__4
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
    // InternalT5.g:1626:1: rule__Programa__Group__3__Impl : ( ( rule__Programa__CorpoAssignment_3 ) ) ;
    public final void rule__Programa__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1630:1: ( ( ( rule__Programa__CorpoAssignment_3 ) ) )
            // InternalT5.g:1631:1: ( ( rule__Programa__CorpoAssignment_3 ) )
            {
            // InternalT5.g:1631:1: ( ( rule__Programa__CorpoAssignment_3 ) )
            // InternalT5.g:1632:2: ( rule__Programa__CorpoAssignment_3 )
            {
             before(grammarAccess.getProgramaAccess().getCorpoAssignment_3()); 
            // InternalT5.g:1633:2: ( rule__Programa__CorpoAssignment_3 )
            // InternalT5.g:1633:3: rule__Programa__CorpoAssignment_3
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
    // InternalT5.g:1641:1: rule__Programa__Group__4 : rule__Programa__Group__4__Impl ;
    public final void rule__Programa__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1645:1: ( rule__Programa__Group__4__Impl )
            // InternalT5.g:1646:2: rule__Programa__Group__4__Impl
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
    // InternalT5.g:1652:1: rule__Programa__Group__4__Impl : ( 'FIM_ALGORITMO' ) ;
    public final void rule__Programa__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1656:1: ( ( 'FIM_ALGORITMO' ) )
            // InternalT5.g:1657:1: ( 'FIM_ALGORITMO' )
            {
            // InternalT5.g:1657:1: ( 'FIM_ALGORITMO' )
            // InternalT5.g:1658:2: 'FIM_ALGORITMO'
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
    // InternalT5.g:1668:1: rule__DeclaracaoLocal__Group_0__0 : rule__DeclaracaoLocal__Group_0__0__Impl rule__DeclaracaoLocal__Group_0__1 ;
    public final void rule__DeclaracaoLocal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1672:1: ( rule__DeclaracaoLocal__Group_0__0__Impl rule__DeclaracaoLocal__Group_0__1 )
            // InternalT5.g:1673:2: rule__DeclaracaoLocal__Group_0__0__Impl rule__DeclaracaoLocal__Group_0__1
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
    // InternalT5.g:1680:1: rule__DeclaracaoLocal__Group_0__0__Impl : ( 'declare' ) ;
    public final void rule__DeclaracaoLocal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1684:1: ( ( 'declare' ) )
            // InternalT5.g:1685:1: ( 'declare' )
            {
            // InternalT5.g:1685:1: ( 'declare' )
            // InternalT5.g:1686:2: 'declare'
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
    // InternalT5.g:1695:1: rule__DeclaracaoLocal__Group_0__1 : rule__DeclaracaoLocal__Group_0__1__Impl rule__DeclaracaoLocal__Group_0__2 ;
    public final void rule__DeclaracaoLocal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1699:1: ( rule__DeclaracaoLocal__Group_0__1__Impl rule__DeclaracaoLocal__Group_0__2 )
            // InternalT5.g:1700:2: rule__DeclaracaoLocal__Group_0__1__Impl rule__DeclaracaoLocal__Group_0__2
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
    // InternalT5.g:1707:1: rule__DeclaracaoLocal__Group_0__1__Impl : ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 ) ) ;
    public final void rule__DeclaracaoLocal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1711:1: ( ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 ) ) )
            // InternalT5.g:1712:1: ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 ) )
            {
            // InternalT5.g:1712:1: ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 ) )
            // InternalT5.g:1713:2: ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getVariaveisAssignment_0_1()); 
            // InternalT5.g:1714:2: ( rule__DeclaracaoLocal__VariaveisAssignment_0_1 )
            // InternalT5.g:1714:3: rule__DeclaracaoLocal__VariaveisAssignment_0_1
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
    // InternalT5.g:1722:1: rule__DeclaracaoLocal__Group_0__2 : rule__DeclaracaoLocal__Group_0__2__Impl ;
    public final void rule__DeclaracaoLocal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1726:1: ( rule__DeclaracaoLocal__Group_0__2__Impl )
            // InternalT5.g:1727:2: rule__DeclaracaoLocal__Group_0__2__Impl
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
    // InternalT5.g:1733:1: rule__DeclaracaoLocal__Group_0__2__Impl : ( ( rule__DeclaracaoLocal__Group_0_2__0 )* ) ;
    public final void rule__DeclaracaoLocal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1737:1: ( ( ( rule__DeclaracaoLocal__Group_0_2__0 )* ) )
            // InternalT5.g:1738:1: ( ( rule__DeclaracaoLocal__Group_0_2__0 )* )
            {
            // InternalT5.g:1738:1: ( ( rule__DeclaracaoLocal__Group_0_2__0 )* )
            // InternalT5.g:1739:2: ( rule__DeclaracaoLocal__Group_0_2__0 )*
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getGroup_0_2()); 
            // InternalT5.g:1740:2: ( rule__DeclaracaoLocal__Group_0_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalT5.g:1740:3: rule__DeclaracaoLocal__Group_0_2__0
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
    // InternalT5.g:1749:1: rule__DeclaracaoLocal__Group_0_2__0 : rule__DeclaracaoLocal__Group_0_2__0__Impl rule__DeclaracaoLocal__Group_0_2__1 ;
    public final void rule__DeclaracaoLocal__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1753:1: ( rule__DeclaracaoLocal__Group_0_2__0__Impl rule__DeclaracaoLocal__Group_0_2__1 )
            // InternalT5.g:1754:2: rule__DeclaracaoLocal__Group_0_2__0__Impl rule__DeclaracaoLocal__Group_0_2__1
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
    // InternalT5.g:1761:1: rule__DeclaracaoLocal__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__DeclaracaoLocal__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1765:1: ( ( ',' ) )
            // InternalT5.g:1766:1: ( ',' )
            {
            // InternalT5.g:1766:1: ( ',' )
            // InternalT5.g:1767:2: ','
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
    // InternalT5.g:1776:1: rule__DeclaracaoLocal__Group_0_2__1 : rule__DeclaracaoLocal__Group_0_2__1__Impl ;
    public final void rule__DeclaracaoLocal__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1780:1: ( rule__DeclaracaoLocal__Group_0_2__1__Impl )
            // InternalT5.g:1781:2: rule__DeclaracaoLocal__Group_0_2__1__Impl
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
    // InternalT5.g:1787:1: rule__DeclaracaoLocal__Group_0_2__1__Impl : ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 ) ) ;
    public final void rule__DeclaracaoLocal__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1791:1: ( ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 ) ) )
            // InternalT5.g:1792:1: ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 ) )
            {
            // InternalT5.g:1792:1: ( ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 ) )
            // InternalT5.g:1793:2: ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getVariaveisAssignment_0_2_1()); 
            // InternalT5.g:1794:2: ( rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 )
            // InternalT5.g:1794:3: rule__DeclaracaoLocal__VariaveisAssignment_0_2_1
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
    // InternalT5.g:1803:1: rule__DeclaracaoLocal__Group_1__0 : rule__DeclaracaoLocal__Group_1__0__Impl rule__DeclaracaoLocal__Group_1__1 ;
    public final void rule__DeclaracaoLocal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1807:1: ( rule__DeclaracaoLocal__Group_1__0__Impl rule__DeclaracaoLocal__Group_1__1 )
            // InternalT5.g:1808:2: rule__DeclaracaoLocal__Group_1__0__Impl rule__DeclaracaoLocal__Group_1__1
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
    // InternalT5.g:1815:1: rule__DeclaracaoLocal__Group_1__0__Impl : ( 'constante' ) ;
    public final void rule__DeclaracaoLocal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1819:1: ( ( 'constante' ) )
            // InternalT5.g:1820:1: ( 'constante' )
            {
            // InternalT5.g:1820:1: ( 'constante' )
            // InternalT5.g:1821:2: 'constante'
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
    // InternalT5.g:1830:1: rule__DeclaracaoLocal__Group_1__1 : rule__DeclaracaoLocal__Group_1__1__Impl rule__DeclaracaoLocal__Group_1__2 ;
    public final void rule__DeclaracaoLocal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1834:1: ( rule__DeclaracaoLocal__Group_1__1__Impl rule__DeclaracaoLocal__Group_1__2 )
            // InternalT5.g:1835:2: rule__DeclaracaoLocal__Group_1__1__Impl rule__DeclaracaoLocal__Group_1__2
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
    // InternalT5.g:1842:1: rule__DeclaracaoLocal__Group_1__1__Impl : ( ( rule__DeclaracaoLocal__NameAssignment_1_1 ) ) ;
    public final void rule__DeclaracaoLocal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1846:1: ( ( ( rule__DeclaracaoLocal__NameAssignment_1_1 ) ) )
            // InternalT5.g:1847:1: ( ( rule__DeclaracaoLocal__NameAssignment_1_1 ) )
            {
            // InternalT5.g:1847:1: ( ( rule__DeclaracaoLocal__NameAssignment_1_1 ) )
            // InternalT5.g:1848:2: ( rule__DeclaracaoLocal__NameAssignment_1_1 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getNameAssignment_1_1()); 
            // InternalT5.g:1849:2: ( rule__DeclaracaoLocal__NameAssignment_1_1 )
            // InternalT5.g:1849:3: rule__DeclaracaoLocal__NameAssignment_1_1
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
    // InternalT5.g:1857:1: rule__DeclaracaoLocal__Group_1__2 : rule__DeclaracaoLocal__Group_1__2__Impl rule__DeclaracaoLocal__Group_1__3 ;
    public final void rule__DeclaracaoLocal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1861:1: ( rule__DeclaracaoLocal__Group_1__2__Impl rule__DeclaracaoLocal__Group_1__3 )
            // InternalT5.g:1862:2: rule__DeclaracaoLocal__Group_1__2__Impl rule__DeclaracaoLocal__Group_1__3
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
    // InternalT5.g:1869:1: rule__DeclaracaoLocal__Group_1__2__Impl : ( ':' ) ;
    public final void rule__DeclaracaoLocal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1873:1: ( ( ':' ) )
            // InternalT5.g:1874:1: ( ':' )
            {
            // InternalT5.g:1874:1: ( ':' )
            // InternalT5.g:1875:2: ':'
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
    // InternalT5.g:1884:1: rule__DeclaracaoLocal__Group_1__3 : rule__DeclaracaoLocal__Group_1__3__Impl rule__DeclaracaoLocal__Group_1__4 ;
    public final void rule__DeclaracaoLocal__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1888:1: ( rule__DeclaracaoLocal__Group_1__3__Impl rule__DeclaracaoLocal__Group_1__4 )
            // InternalT5.g:1889:2: rule__DeclaracaoLocal__Group_1__3__Impl rule__DeclaracaoLocal__Group_1__4
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
    // InternalT5.g:1896:1: rule__DeclaracaoLocal__Group_1__3__Impl : ( ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 ) ) ;
    public final void rule__DeclaracaoLocal__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1900:1: ( ( ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 ) ) )
            // InternalT5.g:1901:1: ( ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 ) )
            {
            // InternalT5.g:1901:1: ( ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 ) )
            // InternalT5.g:1902:2: ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getTipoBasicoAssignment_1_3()); 
            // InternalT5.g:1903:2: ( rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 )
            // InternalT5.g:1903:3: rule__DeclaracaoLocal__TipoBasicoAssignment_1_3
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
    // InternalT5.g:1911:1: rule__DeclaracaoLocal__Group_1__4 : rule__DeclaracaoLocal__Group_1__4__Impl rule__DeclaracaoLocal__Group_1__5 ;
    public final void rule__DeclaracaoLocal__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1915:1: ( rule__DeclaracaoLocal__Group_1__4__Impl rule__DeclaracaoLocal__Group_1__5 )
            // InternalT5.g:1916:2: rule__DeclaracaoLocal__Group_1__4__Impl rule__DeclaracaoLocal__Group_1__5
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
    // InternalT5.g:1923:1: rule__DeclaracaoLocal__Group_1__4__Impl : ( '=' ) ;
    public final void rule__DeclaracaoLocal__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1927:1: ( ( '=' ) )
            // InternalT5.g:1928:1: ( '=' )
            {
            // InternalT5.g:1928:1: ( '=' )
            // InternalT5.g:1929:2: '='
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
    // InternalT5.g:1938:1: rule__DeclaracaoLocal__Group_1__5 : rule__DeclaracaoLocal__Group_1__5__Impl ;
    public final void rule__DeclaracaoLocal__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1942:1: ( rule__DeclaracaoLocal__Group_1__5__Impl )
            // InternalT5.g:1943:2: rule__DeclaracaoLocal__Group_1__5__Impl
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
    // InternalT5.g:1949:1: rule__DeclaracaoLocal__Group_1__5__Impl : ( ( rule__DeclaracaoLocal__ValorAssignment_1_5 ) ) ;
    public final void rule__DeclaracaoLocal__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1953:1: ( ( ( rule__DeclaracaoLocal__ValorAssignment_1_5 ) ) )
            // InternalT5.g:1954:1: ( ( rule__DeclaracaoLocal__ValorAssignment_1_5 ) )
            {
            // InternalT5.g:1954:1: ( ( rule__DeclaracaoLocal__ValorAssignment_1_5 ) )
            // InternalT5.g:1955:2: ( rule__DeclaracaoLocal__ValorAssignment_1_5 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getValorAssignment_1_5()); 
            // InternalT5.g:1956:2: ( rule__DeclaracaoLocal__ValorAssignment_1_5 )
            // InternalT5.g:1956:3: rule__DeclaracaoLocal__ValorAssignment_1_5
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
    // InternalT5.g:1965:1: rule__DeclaracaoLocal__Group_2__0 : rule__DeclaracaoLocal__Group_2__0__Impl rule__DeclaracaoLocal__Group_2__1 ;
    public final void rule__DeclaracaoLocal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1969:1: ( rule__DeclaracaoLocal__Group_2__0__Impl rule__DeclaracaoLocal__Group_2__1 )
            // InternalT5.g:1970:2: rule__DeclaracaoLocal__Group_2__0__Impl rule__DeclaracaoLocal__Group_2__1
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
    // InternalT5.g:1977:1: rule__DeclaracaoLocal__Group_2__0__Impl : ( 'tipo' ) ;
    public final void rule__DeclaracaoLocal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1981:1: ( ( 'tipo' ) )
            // InternalT5.g:1982:1: ( 'tipo' )
            {
            // InternalT5.g:1982:1: ( 'tipo' )
            // InternalT5.g:1983:2: 'tipo'
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
    // InternalT5.g:1992:1: rule__DeclaracaoLocal__Group_2__1 : rule__DeclaracaoLocal__Group_2__1__Impl rule__DeclaracaoLocal__Group_2__2 ;
    public final void rule__DeclaracaoLocal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:1996:1: ( rule__DeclaracaoLocal__Group_2__1__Impl rule__DeclaracaoLocal__Group_2__2 )
            // InternalT5.g:1997:2: rule__DeclaracaoLocal__Group_2__1__Impl rule__DeclaracaoLocal__Group_2__2
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
    // InternalT5.g:2004:1: rule__DeclaracaoLocal__Group_2__1__Impl : ( ( rule__DeclaracaoLocal__NameAssignment_2_1 ) ) ;
    public final void rule__DeclaracaoLocal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2008:1: ( ( ( rule__DeclaracaoLocal__NameAssignment_2_1 ) ) )
            // InternalT5.g:2009:1: ( ( rule__DeclaracaoLocal__NameAssignment_2_1 ) )
            {
            // InternalT5.g:2009:1: ( ( rule__DeclaracaoLocal__NameAssignment_2_1 ) )
            // InternalT5.g:2010:2: ( rule__DeclaracaoLocal__NameAssignment_2_1 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getNameAssignment_2_1()); 
            // InternalT5.g:2011:2: ( rule__DeclaracaoLocal__NameAssignment_2_1 )
            // InternalT5.g:2011:3: rule__DeclaracaoLocal__NameAssignment_2_1
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
    // InternalT5.g:2019:1: rule__DeclaracaoLocal__Group_2__2 : rule__DeclaracaoLocal__Group_2__2__Impl rule__DeclaracaoLocal__Group_2__3 ;
    public final void rule__DeclaracaoLocal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2023:1: ( rule__DeclaracaoLocal__Group_2__2__Impl rule__DeclaracaoLocal__Group_2__3 )
            // InternalT5.g:2024:2: rule__DeclaracaoLocal__Group_2__2__Impl rule__DeclaracaoLocal__Group_2__3
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
    // InternalT5.g:2031:1: rule__DeclaracaoLocal__Group_2__2__Impl : ( ':' ) ;
    public final void rule__DeclaracaoLocal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2035:1: ( ( ':' ) )
            // InternalT5.g:2036:1: ( ':' )
            {
            // InternalT5.g:2036:1: ( ':' )
            // InternalT5.g:2037:2: ':'
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
    // InternalT5.g:2046:1: rule__DeclaracaoLocal__Group_2__3 : rule__DeclaracaoLocal__Group_2__3__Impl ;
    public final void rule__DeclaracaoLocal__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2050:1: ( rule__DeclaracaoLocal__Group_2__3__Impl )
            // InternalT5.g:2051:2: rule__DeclaracaoLocal__Group_2__3__Impl
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
    // InternalT5.g:2057:1: rule__DeclaracaoLocal__Group_2__3__Impl : ( ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 ) ) ;
    public final void rule__DeclaracaoLocal__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2061:1: ( ( ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 ) ) )
            // InternalT5.g:2062:1: ( ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 ) )
            {
            // InternalT5.g:2062:1: ( ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 ) )
            // InternalT5.g:2063:2: ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 )
            {
             before(grammarAccess.getDeclaracaoLocalAccess().getTipoDefAssignment_2_3()); 
            // InternalT5.g:2064:2: ( rule__DeclaracaoLocal__TipoDefAssignment_2_3 )
            // InternalT5.g:2064:3: rule__DeclaracaoLocal__TipoDefAssignment_2_3
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
    // InternalT5.g:2073:1: rule__DeclaracaoGlobal__Group_0__0 : rule__DeclaracaoGlobal__Group_0__0__Impl rule__DeclaracaoGlobal__Group_0__1 ;
    public final void rule__DeclaracaoGlobal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2077:1: ( rule__DeclaracaoGlobal__Group_0__0__Impl rule__DeclaracaoGlobal__Group_0__1 )
            // InternalT5.g:2078:2: rule__DeclaracaoGlobal__Group_0__0__Impl rule__DeclaracaoGlobal__Group_0__1
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
    // InternalT5.g:2085:1: rule__DeclaracaoGlobal__Group_0__0__Impl : ( 'procedimento' ) ;
    public final void rule__DeclaracaoGlobal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2089:1: ( ( 'procedimento' ) )
            // InternalT5.g:2090:1: ( 'procedimento' )
            {
            // InternalT5.g:2090:1: ( 'procedimento' )
            // InternalT5.g:2091:2: 'procedimento'
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
    // InternalT5.g:2100:1: rule__DeclaracaoGlobal__Group_0__1 : rule__DeclaracaoGlobal__Group_0__1__Impl rule__DeclaracaoGlobal__Group_0__2 ;
    public final void rule__DeclaracaoGlobal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2104:1: ( rule__DeclaracaoGlobal__Group_0__1__Impl rule__DeclaracaoGlobal__Group_0__2 )
            // InternalT5.g:2105:2: rule__DeclaracaoGlobal__Group_0__1__Impl rule__DeclaracaoGlobal__Group_0__2
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
    // InternalT5.g:2112:1: rule__DeclaracaoGlobal__Group_0__1__Impl : ( ( rule__DeclaracaoGlobal__NameAssignment_0_1 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2116:1: ( ( ( rule__DeclaracaoGlobal__NameAssignment_0_1 ) ) )
            // InternalT5.g:2117:1: ( ( rule__DeclaracaoGlobal__NameAssignment_0_1 ) )
            {
            // InternalT5.g:2117:1: ( ( rule__DeclaracaoGlobal__NameAssignment_0_1 ) )
            // InternalT5.g:2118:2: ( rule__DeclaracaoGlobal__NameAssignment_0_1 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getNameAssignment_0_1()); 
            // InternalT5.g:2119:2: ( rule__DeclaracaoGlobal__NameAssignment_0_1 )
            // InternalT5.g:2119:3: rule__DeclaracaoGlobal__NameAssignment_0_1
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
    // InternalT5.g:2127:1: rule__DeclaracaoGlobal__Group_0__2 : rule__DeclaracaoGlobal__Group_0__2__Impl rule__DeclaracaoGlobal__Group_0__3 ;
    public final void rule__DeclaracaoGlobal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2131:1: ( rule__DeclaracaoGlobal__Group_0__2__Impl rule__DeclaracaoGlobal__Group_0__3 )
            // InternalT5.g:2132:2: rule__DeclaracaoGlobal__Group_0__2__Impl rule__DeclaracaoGlobal__Group_0__3
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
    // InternalT5.g:2139:1: rule__DeclaracaoGlobal__Group_0__2__Impl : ( '(' ) ;
    public final void rule__DeclaracaoGlobal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2143:1: ( ( '(' ) )
            // InternalT5.g:2144:1: ( '(' )
            {
            // InternalT5.g:2144:1: ( '(' )
            // InternalT5.g:2145:2: '('
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
    // InternalT5.g:2154:1: rule__DeclaracaoGlobal__Group_0__3 : rule__DeclaracaoGlobal__Group_0__3__Impl rule__DeclaracaoGlobal__Group_0__4 ;
    public final void rule__DeclaracaoGlobal__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2158:1: ( rule__DeclaracaoGlobal__Group_0__3__Impl rule__DeclaracaoGlobal__Group_0__4 )
            // InternalT5.g:2159:2: rule__DeclaracaoGlobal__Group_0__3__Impl rule__DeclaracaoGlobal__Group_0__4
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
    // InternalT5.g:2166:1: rule__DeclaracaoGlobal__Group_0__3__Impl : ( ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )? ) ;
    public final void rule__DeclaracaoGlobal__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2170:1: ( ( ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )? ) )
            // InternalT5.g:2171:1: ( ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )? )
            {
            // InternalT5.g:2171:1: ( ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )? )
            // InternalT5.g:2172:2: ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )?
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getParametrosAssignment_0_3()); 
            // InternalT5.g:2173:2: ( rule__DeclaracaoGlobal__ParametrosAssignment_0_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==50) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalT5.g:2173:3: rule__DeclaracaoGlobal__ParametrosAssignment_0_3
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
    // InternalT5.g:2181:1: rule__DeclaracaoGlobal__Group_0__4 : rule__DeclaracaoGlobal__Group_0__4__Impl rule__DeclaracaoGlobal__Group_0__5 ;
    public final void rule__DeclaracaoGlobal__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2185:1: ( rule__DeclaracaoGlobal__Group_0__4__Impl rule__DeclaracaoGlobal__Group_0__5 )
            // InternalT5.g:2186:2: rule__DeclaracaoGlobal__Group_0__4__Impl rule__DeclaracaoGlobal__Group_0__5
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
    // InternalT5.g:2193:1: rule__DeclaracaoGlobal__Group_0__4__Impl : ( ')' ) ;
    public final void rule__DeclaracaoGlobal__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2197:1: ( ( ')' ) )
            // InternalT5.g:2198:1: ( ')' )
            {
            // InternalT5.g:2198:1: ( ')' )
            // InternalT5.g:2199:2: ')'
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
    // InternalT5.g:2208:1: rule__DeclaracaoGlobal__Group_0__5 : rule__DeclaracaoGlobal__Group_0__5__Impl rule__DeclaracaoGlobal__Group_0__6 ;
    public final void rule__DeclaracaoGlobal__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2212:1: ( rule__DeclaracaoGlobal__Group_0__5__Impl rule__DeclaracaoGlobal__Group_0__6 )
            // InternalT5.g:2213:2: rule__DeclaracaoGlobal__Group_0__5__Impl rule__DeclaracaoGlobal__Group_0__6
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
    // InternalT5.g:2220:1: rule__DeclaracaoGlobal__Group_0__5__Impl : ( ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2224:1: ( ( ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 ) ) )
            // InternalT5.g:2225:1: ( ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 ) )
            {
            // InternalT5.g:2225:1: ( ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 ) )
            // InternalT5.g:2226:2: ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getCorpoAssignment_0_5()); 
            // InternalT5.g:2227:2: ( rule__DeclaracaoGlobal__CorpoAssignment_0_5 )
            // InternalT5.g:2227:3: rule__DeclaracaoGlobal__CorpoAssignment_0_5
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
    // InternalT5.g:2235:1: rule__DeclaracaoGlobal__Group_0__6 : rule__DeclaracaoGlobal__Group_0__6__Impl ;
    public final void rule__DeclaracaoGlobal__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2239:1: ( rule__DeclaracaoGlobal__Group_0__6__Impl )
            // InternalT5.g:2240:2: rule__DeclaracaoGlobal__Group_0__6__Impl
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
    // InternalT5.g:2246:1: rule__DeclaracaoGlobal__Group_0__6__Impl : ( 'fim_procedimento' ) ;
    public final void rule__DeclaracaoGlobal__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2250:1: ( ( 'fim_procedimento' ) )
            // InternalT5.g:2251:1: ( 'fim_procedimento' )
            {
            // InternalT5.g:2251:1: ( 'fim_procedimento' )
            // InternalT5.g:2252:2: 'fim_procedimento'
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
    // InternalT5.g:2262:1: rule__DeclaracaoGlobal__Group_1__0 : rule__DeclaracaoGlobal__Group_1__0__Impl rule__DeclaracaoGlobal__Group_1__1 ;
    public final void rule__DeclaracaoGlobal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2266:1: ( rule__DeclaracaoGlobal__Group_1__0__Impl rule__DeclaracaoGlobal__Group_1__1 )
            // InternalT5.g:2267:2: rule__DeclaracaoGlobal__Group_1__0__Impl rule__DeclaracaoGlobal__Group_1__1
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
    // InternalT5.g:2274:1: rule__DeclaracaoGlobal__Group_1__0__Impl : ( 'funcao' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2278:1: ( ( 'funcao' ) )
            // InternalT5.g:2279:1: ( 'funcao' )
            {
            // InternalT5.g:2279:1: ( 'funcao' )
            // InternalT5.g:2280:2: 'funcao'
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
    // InternalT5.g:2289:1: rule__DeclaracaoGlobal__Group_1__1 : rule__DeclaracaoGlobal__Group_1__1__Impl rule__DeclaracaoGlobal__Group_1__2 ;
    public final void rule__DeclaracaoGlobal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2293:1: ( rule__DeclaracaoGlobal__Group_1__1__Impl rule__DeclaracaoGlobal__Group_1__2 )
            // InternalT5.g:2294:2: rule__DeclaracaoGlobal__Group_1__1__Impl rule__DeclaracaoGlobal__Group_1__2
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
    // InternalT5.g:2301:1: rule__DeclaracaoGlobal__Group_1__1__Impl : ( ( rule__DeclaracaoGlobal__NameAssignment_1_1 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2305:1: ( ( ( rule__DeclaracaoGlobal__NameAssignment_1_1 ) ) )
            // InternalT5.g:2306:1: ( ( rule__DeclaracaoGlobal__NameAssignment_1_1 ) )
            {
            // InternalT5.g:2306:1: ( ( rule__DeclaracaoGlobal__NameAssignment_1_1 ) )
            // InternalT5.g:2307:2: ( rule__DeclaracaoGlobal__NameAssignment_1_1 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getNameAssignment_1_1()); 
            // InternalT5.g:2308:2: ( rule__DeclaracaoGlobal__NameAssignment_1_1 )
            // InternalT5.g:2308:3: rule__DeclaracaoGlobal__NameAssignment_1_1
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
    // InternalT5.g:2316:1: rule__DeclaracaoGlobal__Group_1__2 : rule__DeclaracaoGlobal__Group_1__2__Impl rule__DeclaracaoGlobal__Group_1__3 ;
    public final void rule__DeclaracaoGlobal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2320:1: ( rule__DeclaracaoGlobal__Group_1__2__Impl rule__DeclaracaoGlobal__Group_1__3 )
            // InternalT5.g:2321:2: rule__DeclaracaoGlobal__Group_1__2__Impl rule__DeclaracaoGlobal__Group_1__3
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
    // InternalT5.g:2328:1: rule__DeclaracaoGlobal__Group_1__2__Impl : ( '(' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2332:1: ( ( '(' ) )
            // InternalT5.g:2333:1: ( '(' )
            {
            // InternalT5.g:2333:1: ( '(' )
            // InternalT5.g:2334:2: '('
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
    // InternalT5.g:2343:1: rule__DeclaracaoGlobal__Group_1__3 : rule__DeclaracaoGlobal__Group_1__3__Impl rule__DeclaracaoGlobal__Group_1__4 ;
    public final void rule__DeclaracaoGlobal__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2347:1: ( rule__DeclaracaoGlobal__Group_1__3__Impl rule__DeclaracaoGlobal__Group_1__4 )
            // InternalT5.g:2348:2: rule__DeclaracaoGlobal__Group_1__3__Impl rule__DeclaracaoGlobal__Group_1__4
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
    // InternalT5.g:2355:1: rule__DeclaracaoGlobal__Group_1__3__Impl : ( ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )? ) ;
    public final void rule__DeclaracaoGlobal__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2359:1: ( ( ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )? ) )
            // InternalT5.g:2360:1: ( ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )? )
            {
            // InternalT5.g:2360:1: ( ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )? )
            // InternalT5.g:2361:2: ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )?
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getParametrosAssignment_1_3()); 
            // InternalT5.g:2362:2: ( rule__DeclaracaoGlobal__ParametrosAssignment_1_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==50) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalT5.g:2362:3: rule__DeclaracaoGlobal__ParametrosAssignment_1_3
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
    // InternalT5.g:2370:1: rule__DeclaracaoGlobal__Group_1__4 : rule__DeclaracaoGlobal__Group_1__4__Impl rule__DeclaracaoGlobal__Group_1__5 ;
    public final void rule__DeclaracaoGlobal__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2374:1: ( rule__DeclaracaoGlobal__Group_1__4__Impl rule__DeclaracaoGlobal__Group_1__5 )
            // InternalT5.g:2375:2: rule__DeclaracaoGlobal__Group_1__4__Impl rule__DeclaracaoGlobal__Group_1__5
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
    // InternalT5.g:2382:1: rule__DeclaracaoGlobal__Group_1__4__Impl : ( ')' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2386:1: ( ( ')' ) )
            // InternalT5.g:2387:1: ( ')' )
            {
            // InternalT5.g:2387:1: ( ')' )
            // InternalT5.g:2388:2: ')'
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
    // InternalT5.g:2397:1: rule__DeclaracaoGlobal__Group_1__5 : rule__DeclaracaoGlobal__Group_1__5__Impl rule__DeclaracaoGlobal__Group_1__6 ;
    public final void rule__DeclaracaoGlobal__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2401:1: ( rule__DeclaracaoGlobal__Group_1__5__Impl rule__DeclaracaoGlobal__Group_1__6 )
            // InternalT5.g:2402:2: rule__DeclaracaoGlobal__Group_1__5__Impl rule__DeclaracaoGlobal__Group_1__6
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
    // InternalT5.g:2409:1: rule__DeclaracaoGlobal__Group_1__5__Impl : ( ':' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2413:1: ( ( ':' ) )
            // InternalT5.g:2414:1: ( ':' )
            {
            // InternalT5.g:2414:1: ( ':' )
            // InternalT5.g:2415:2: ':'
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
    // InternalT5.g:2424:1: rule__DeclaracaoGlobal__Group_1__6 : rule__DeclaracaoGlobal__Group_1__6__Impl rule__DeclaracaoGlobal__Group_1__7 ;
    public final void rule__DeclaracaoGlobal__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2428:1: ( rule__DeclaracaoGlobal__Group_1__6__Impl rule__DeclaracaoGlobal__Group_1__7 )
            // InternalT5.g:2429:2: rule__DeclaracaoGlobal__Group_1__6__Impl rule__DeclaracaoGlobal__Group_1__7
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
    // InternalT5.g:2436:1: rule__DeclaracaoGlobal__Group_1__6__Impl : ( ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2440:1: ( ( ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 ) ) )
            // InternalT5.g:2441:1: ( ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 ) )
            {
            // InternalT5.g:2441:1: ( ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 ) )
            // InternalT5.g:2442:2: ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getTipoRetornoAssignment_1_6()); 
            // InternalT5.g:2443:2: ( rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 )
            // InternalT5.g:2443:3: rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6
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
    // InternalT5.g:2451:1: rule__DeclaracaoGlobal__Group_1__7 : rule__DeclaracaoGlobal__Group_1__7__Impl rule__DeclaracaoGlobal__Group_1__8 ;
    public final void rule__DeclaracaoGlobal__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2455:1: ( rule__DeclaracaoGlobal__Group_1__7__Impl rule__DeclaracaoGlobal__Group_1__8 )
            // InternalT5.g:2456:2: rule__DeclaracaoGlobal__Group_1__7__Impl rule__DeclaracaoGlobal__Group_1__8
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
    // InternalT5.g:2463:1: rule__DeclaracaoGlobal__Group_1__7__Impl : ( ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 ) ) ;
    public final void rule__DeclaracaoGlobal__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2467:1: ( ( ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 ) ) )
            // InternalT5.g:2468:1: ( ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 ) )
            {
            // InternalT5.g:2468:1: ( ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 ) )
            // InternalT5.g:2469:2: ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 )
            {
             before(grammarAccess.getDeclaracaoGlobalAccess().getCorpoAssignment_1_7()); 
            // InternalT5.g:2470:2: ( rule__DeclaracaoGlobal__CorpoAssignment_1_7 )
            // InternalT5.g:2470:3: rule__DeclaracaoGlobal__CorpoAssignment_1_7
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
    // InternalT5.g:2478:1: rule__DeclaracaoGlobal__Group_1__8 : rule__DeclaracaoGlobal__Group_1__8__Impl ;
    public final void rule__DeclaracaoGlobal__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2482:1: ( rule__DeclaracaoGlobal__Group_1__8__Impl )
            // InternalT5.g:2483:2: rule__DeclaracaoGlobal__Group_1__8__Impl
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
    // InternalT5.g:2489:1: rule__DeclaracaoGlobal__Group_1__8__Impl : ( 'fim_funcao' ) ;
    public final void rule__DeclaracaoGlobal__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2493:1: ( ( 'fim_funcao' ) )
            // InternalT5.g:2494:1: ( 'fim_funcao' )
            {
            // InternalT5.g:2494:1: ( 'fim_funcao' )
            // InternalT5.g:2495:2: 'fim_funcao'
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
    // InternalT5.g:2505:1: rule__Variavel__Group__0 : rule__Variavel__Group__0__Impl rule__Variavel__Group__1 ;
    public final void rule__Variavel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2509:1: ( rule__Variavel__Group__0__Impl rule__Variavel__Group__1 )
            // InternalT5.g:2510:2: rule__Variavel__Group__0__Impl rule__Variavel__Group__1
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
    // InternalT5.g:2517:1: rule__Variavel__Group__0__Impl : ( ( rule__Variavel__IdAssignment_0 ) ) ;
    public final void rule__Variavel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2521:1: ( ( ( rule__Variavel__IdAssignment_0 ) ) )
            // InternalT5.g:2522:1: ( ( rule__Variavel__IdAssignment_0 ) )
            {
            // InternalT5.g:2522:1: ( ( rule__Variavel__IdAssignment_0 ) )
            // InternalT5.g:2523:2: ( rule__Variavel__IdAssignment_0 )
            {
             before(grammarAccess.getVariavelAccess().getIdAssignment_0()); 
            // InternalT5.g:2524:2: ( rule__Variavel__IdAssignment_0 )
            // InternalT5.g:2524:3: rule__Variavel__IdAssignment_0
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
    // InternalT5.g:2532:1: rule__Variavel__Group__1 : rule__Variavel__Group__1__Impl rule__Variavel__Group__2 ;
    public final void rule__Variavel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2536:1: ( rule__Variavel__Group__1__Impl rule__Variavel__Group__2 )
            // InternalT5.g:2537:2: rule__Variavel__Group__1__Impl rule__Variavel__Group__2
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
    // InternalT5.g:2544:1: rule__Variavel__Group__1__Impl : ( ':' ) ;
    public final void rule__Variavel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2548:1: ( ( ':' ) )
            // InternalT5.g:2549:1: ( ':' )
            {
            // InternalT5.g:2549:1: ( ':' )
            // InternalT5.g:2550:2: ':'
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
    // InternalT5.g:2559:1: rule__Variavel__Group__2 : rule__Variavel__Group__2__Impl ;
    public final void rule__Variavel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2563:1: ( rule__Variavel__Group__2__Impl )
            // InternalT5.g:2564:2: rule__Variavel__Group__2__Impl
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
    // InternalT5.g:2570:1: rule__Variavel__Group__2__Impl : ( ( rule__Variavel__TipoVarAssignment_2 ) ) ;
    public final void rule__Variavel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2574:1: ( ( ( rule__Variavel__TipoVarAssignment_2 ) ) )
            // InternalT5.g:2575:1: ( ( rule__Variavel__TipoVarAssignment_2 ) )
            {
            // InternalT5.g:2575:1: ( ( rule__Variavel__TipoVarAssignment_2 ) )
            // InternalT5.g:2576:2: ( rule__Variavel__TipoVarAssignment_2 )
            {
             before(grammarAccess.getVariavelAccess().getTipoVarAssignment_2()); 
            // InternalT5.g:2577:2: ( rule__Variavel__TipoVarAssignment_2 )
            // InternalT5.g:2577:3: rule__Variavel__TipoVarAssignment_2
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
    // InternalT5.g:2586:1: rule__Identificador__Group__0 : rule__Identificador__Group__0__Impl rule__Identificador__Group__1 ;
    public final void rule__Identificador__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2590:1: ( rule__Identificador__Group__0__Impl rule__Identificador__Group__1 )
            // InternalT5.g:2591:2: rule__Identificador__Group__0__Impl rule__Identificador__Group__1
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
    // InternalT5.g:2598:1: rule__Identificador__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Identificador__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2602:1: ( ( RULE_ID ) )
            // InternalT5.g:2603:1: ( RULE_ID )
            {
            // InternalT5.g:2603:1: ( RULE_ID )
            // InternalT5.g:2604:2: RULE_ID
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
    // InternalT5.g:2613:1: rule__Identificador__Group__1 : rule__Identificador__Group__1__Impl rule__Identificador__Group__2 ;
    public final void rule__Identificador__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2617:1: ( rule__Identificador__Group__1__Impl rule__Identificador__Group__2 )
            // InternalT5.g:2618:2: rule__Identificador__Group__1__Impl rule__Identificador__Group__2
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
    // InternalT5.g:2625:1: rule__Identificador__Group__1__Impl : ( ( rule__Identificador__Group_1__0 )* ) ;
    public final void rule__Identificador__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2629:1: ( ( ( rule__Identificador__Group_1__0 )* ) )
            // InternalT5.g:2630:1: ( ( rule__Identificador__Group_1__0 )* )
            {
            // InternalT5.g:2630:1: ( ( rule__Identificador__Group_1__0 )* )
            // InternalT5.g:2631:2: ( rule__Identificador__Group_1__0 )*
            {
             before(grammarAccess.getIdentificadorAccess().getGroup_1()); 
            // InternalT5.g:2632:2: ( rule__Identificador__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalT5.g:2632:3: rule__Identificador__Group_1__0
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
    // InternalT5.g:2640:1: rule__Identificador__Group__2 : rule__Identificador__Group__2__Impl ;
    public final void rule__Identificador__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2644:1: ( rule__Identificador__Group__2__Impl )
            // InternalT5.g:2645:2: rule__Identificador__Group__2__Impl
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
    // InternalT5.g:2651:1: rule__Identificador__Group__2__Impl : ( ( rule__Identificador__DimensoesAssignment_2 )* ) ;
    public final void rule__Identificador__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2655:1: ( ( ( rule__Identificador__DimensoesAssignment_2 )* ) )
            // InternalT5.g:2656:1: ( ( rule__Identificador__DimensoesAssignment_2 )* )
            {
            // InternalT5.g:2656:1: ( ( rule__Identificador__DimensoesAssignment_2 )* )
            // InternalT5.g:2657:2: ( rule__Identificador__DimensoesAssignment_2 )*
            {
             before(grammarAccess.getIdentificadorAccess().getDimensoesAssignment_2()); 
            // InternalT5.g:2658:2: ( rule__Identificador__DimensoesAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalT5.g:2658:3: rule__Identificador__DimensoesAssignment_2
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
    // InternalT5.g:2667:1: rule__Identificador__Group_1__0 : rule__Identificador__Group_1__0__Impl rule__Identificador__Group_1__1 ;
    public final void rule__Identificador__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2671:1: ( rule__Identificador__Group_1__0__Impl rule__Identificador__Group_1__1 )
            // InternalT5.g:2672:2: rule__Identificador__Group_1__0__Impl rule__Identificador__Group_1__1
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
    // InternalT5.g:2679:1: rule__Identificador__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Identificador__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2683:1: ( ( '.' ) )
            // InternalT5.g:2684:1: ( '.' )
            {
            // InternalT5.g:2684:1: ( '.' )
            // InternalT5.g:2685:2: '.'
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
    // InternalT5.g:2694:1: rule__Identificador__Group_1__1 : rule__Identificador__Group_1__1__Impl ;
    public final void rule__Identificador__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2698:1: ( rule__Identificador__Group_1__1__Impl )
            // InternalT5.g:2699:2: rule__Identificador__Group_1__1__Impl
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
    // InternalT5.g:2705:1: rule__Identificador__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__Identificador__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2709:1: ( ( RULE_ID ) )
            // InternalT5.g:2710:1: ( RULE_ID )
            {
            // InternalT5.g:2710:1: ( RULE_ID )
            // InternalT5.g:2711:2: RULE_ID
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
    // InternalT5.g:2721:1: rule__Dimensao__Group__0 : rule__Dimensao__Group__0__Impl rule__Dimensao__Group__1 ;
    public final void rule__Dimensao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2725:1: ( rule__Dimensao__Group__0__Impl rule__Dimensao__Group__1 )
            // InternalT5.g:2726:2: rule__Dimensao__Group__0__Impl rule__Dimensao__Group__1
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
    // InternalT5.g:2733:1: rule__Dimensao__Group__0__Impl : ( '[' ) ;
    public final void rule__Dimensao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2737:1: ( ( '[' ) )
            // InternalT5.g:2738:1: ( '[' )
            {
            // InternalT5.g:2738:1: ( '[' )
            // InternalT5.g:2739:2: '['
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
    // InternalT5.g:2748:1: rule__Dimensao__Group__1 : rule__Dimensao__Group__1__Impl rule__Dimensao__Group__2 ;
    public final void rule__Dimensao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2752:1: ( rule__Dimensao__Group__1__Impl rule__Dimensao__Group__2 )
            // InternalT5.g:2753:2: rule__Dimensao__Group__1__Impl rule__Dimensao__Group__2
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
    // InternalT5.g:2760:1: rule__Dimensao__Group__1__Impl : ( ( rule__Dimensao__ExpAssignment_1 ) ) ;
    public final void rule__Dimensao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2764:1: ( ( ( rule__Dimensao__ExpAssignment_1 ) ) )
            // InternalT5.g:2765:1: ( ( rule__Dimensao__ExpAssignment_1 ) )
            {
            // InternalT5.g:2765:1: ( ( rule__Dimensao__ExpAssignment_1 ) )
            // InternalT5.g:2766:2: ( rule__Dimensao__ExpAssignment_1 )
            {
             before(grammarAccess.getDimensaoAccess().getExpAssignment_1()); 
            // InternalT5.g:2767:2: ( rule__Dimensao__ExpAssignment_1 )
            // InternalT5.g:2767:3: rule__Dimensao__ExpAssignment_1
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
    // InternalT5.g:2775:1: rule__Dimensao__Group__2 : rule__Dimensao__Group__2__Impl ;
    public final void rule__Dimensao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2779:1: ( rule__Dimensao__Group__2__Impl )
            // InternalT5.g:2780:2: rule__Dimensao__Group__2__Impl
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
    // InternalT5.g:2786:1: rule__Dimensao__Group__2__Impl : ( ']' ) ;
    public final void rule__Dimensao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2790:1: ( ( ']' ) )
            // InternalT5.g:2791:1: ( ']' )
            {
            // InternalT5.g:2791:1: ( ']' )
            // InternalT5.g:2792:2: ']'
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
    // InternalT5.g:2802:1: rule__Registro__Group__0 : rule__Registro__Group__0__Impl rule__Registro__Group__1 ;
    public final void rule__Registro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2806:1: ( rule__Registro__Group__0__Impl rule__Registro__Group__1 )
            // InternalT5.g:2807:2: rule__Registro__Group__0__Impl rule__Registro__Group__1
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
    // InternalT5.g:2814:1: rule__Registro__Group__0__Impl : ( 'registro' ) ;
    public final void rule__Registro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2818:1: ( ( 'registro' ) )
            // InternalT5.g:2819:1: ( 'registro' )
            {
            // InternalT5.g:2819:1: ( 'registro' )
            // InternalT5.g:2820:2: 'registro'
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
    // InternalT5.g:2829:1: rule__Registro__Group__1 : rule__Registro__Group__1__Impl rule__Registro__Group__2 ;
    public final void rule__Registro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2833:1: ( rule__Registro__Group__1__Impl rule__Registro__Group__2 )
            // InternalT5.g:2834:2: rule__Registro__Group__1__Impl rule__Registro__Group__2
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
    // InternalT5.g:2841:1: rule__Registro__Group__1__Impl : ( ( rule__Registro__CamposAssignment_1 )* ) ;
    public final void rule__Registro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2845:1: ( ( ( rule__Registro__CamposAssignment_1 )* ) )
            // InternalT5.g:2846:1: ( ( rule__Registro__CamposAssignment_1 )* )
            {
            // InternalT5.g:2846:1: ( ( rule__Registro__CamposAssignment_1 )* )
            // InternalT5.g:2847:2: ( rule__Registro__CamposAssignment_1 )*
            {
             before(grammarAccess.getRegistroAccess().getCamposAssignment_1()); 
            // InternalT5.g:2848:2: ( rule__Registro__CamposAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalT5.g:2848:3: rule__Registro__CamposAssignment_1
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
    // InternalT5.g:2856:1: rule__Registro__Group__2 : rule__Registro__Group__2__Impl ;
    public final void rule__Registro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2860:1: ( rule__Registro__Group__2__Impl )
            // InternalT5.g:2861:2: rule__Registro__Group__2__Impl
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
    // InternalT5.g:2867:1: rule__Registro__Group__2__Impl : ( 'fim_registro' ) ;
    public final void rule__Registro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2871:1: ( ( 'fim_registro' ) )
            // InternalT5.g:2872:1: ( 'fim_registro' )
            {
            // InternalT5.g:2872:1: ( 'fim_registro' )
            // InternalT5.g:2873:2: 'fim_registro'
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
    // InternalT5.g:2883:1: rule__TipoEstendido__Group__0 : rule__TipoEstendido__Group__0__Impl rule__TipoEstendido__Group__1 ;
    public final void rule__TipoEstendido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2887:1: ( rule__TipoEstendido__Group__0__Impl rule__TipoEstendido__Group__1 )
            // InternalT5.g:2888:2: rule__TipoEstendido__Group__0__Impl rule__TipoEstendido__Group__1
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
    // InternalT5.g:2895:1: rule__TipoEstendido__Group__0__Impl : ( ( '^' )? ) ;
    public final void rule__TipoEstendido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2899:1: ( ( ( '^' )? ) )
            // InternalT5.g:2900:1: ( ( '^' )? )
            {
            // InternalT5.g:2900:1: ( ( '^' )? )
            // InternalT5.g:2901:2: ( '^' )?
            {
             before(grammarAccess.getTipoEstendidoAccess().getCircumflexAccentKeyword_0()); 
            // InternalT5.g:2902:2: ( '^' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalT5.g:2902:3: '^'
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
    // InternalT5.g:2910:1: rule__TipoEstendido__Group__1 : rule__TipoEstendido__Group__1__Impl ;
    public final void rule__TipoEstendido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2914:1: ( rule__TipoEstendido__Group__1__Impl )
            // InternalT5.g:2915:2: rule__TipoEstendido__Group__1__Impl
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
    // InternalT5.g:2921:1: rule__TipoEstendido__Group__1__Impl : ( ( rule__TipoEstendido__Alternatives_1 ) ) ;
    public final void rule__TipoEstendido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2925:1: ( ( ( rule__TipoEstendido__Alternatives_1 ) ) )
            // InternalT5.g:2926:1: ( ( rule__TipoEstendido__Alternatives_1 ) )
            {
            // InternalT5.g:2926:1: ( ( rule__TipoEstendido__Alternatives_1 ) )
            // InternalT5.g:2927:2: ( rule__TipoEstendido__Alternatives_1 )
            {
             before(grammarAccess.getTipoEstendidoAccess().getAlternatives_1()); 
            // InternalT5.g:2928:2: ( rule__TipoEstendido__Alternatives_1 )
            // InternalT5.g:2928:3: rule__TipoEstendido__Alternatives_1
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
    // InternalT5.g:2937:1: rule__Parametros__Group__0 : rule__Parametros__Group__0__Impl rule__Parametros__Group__1 ;
    public final void rule__Parametros__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2941:1: ( rule__Parametros__Group__0__Impl rule__Parametros__Group__1 )
            // InternalT5.g:2942:2: rule__Parametros__Group__0__Impl rule__Parametros__Group__1
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
    // InternalT5.g:2949:1: rule__Parametros__Group__0__Impl : ( ( rule__Parametros__ParametroAssignment_0 ) ) ;
    public final void rule__Parametros__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2953:1: ( ( ( rule__Parametros__ParametroAssignment_0 ) ) )
            // InternalT5.g:2954:1: ( ( rule__Parametros__ParametroAssignment_0 ) )
            {
            // InternalT5.g:2954:1: ( ( rule__Parametros__ParametroAssignment_0 ) )
            // InternalT5.g:2955:2: ( rule__Parametros__ParametroAssignment_0 )
            {
             before(grammarAccess.getParametrosAccess().getParametroAssignment_0()); 
            // InternalT5.g:2956:2: ( rule__Parametros__ParametroAssignment_0 )
            // InternalT5.g:2956:3: rule__Parametros__ParametroAssignment_0
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
    // InternalT5.g:2964:1: rule__Parametros__Group__1 : rule__Parametros__Group__1__Impl ;
    public final void rule__Parametros__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2968:1: ( rule__Parametros__Group__1__Impl )
            // InternalT5.g:2969:2: rule__Parametros__Group__1__Impl
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
    // InternalT5.g:2975:1: rule__Parametros__Group__1__Impl : ( ( rule__Parametros__Group_1__0 )* ) ;
    public final void rule__Parametros__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2979:1: ( ( ( rule__Parametros__Group_1__0 )* ) )
            // InternalT5.g:2980:1: ( ( rule__Parametros__Group_1__0 )* )
            {
            // InternalT5.g:2980:1: ( ( rule__Parametros__Group_1__0 )* )
            // InternalT5.g:2981:2: ( rule__Parametros__Group_1__0 )*
            {
             before(grammarAccess.getParametrosAccess().getGroup_1()); 
            // InternalT5.g:2982:2: ( rule__Parametros__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalT5.g:2982:3: rule__Parametros__Group_1__0
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
    // InternalT5.g:2991:1: rule__Parametros__Group_1__0 : rule__Parametros__Group_1__0__Impl rule__Parametros__Group_1__1 ;
    public final void rule__Parametros__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:2995:1: ( rule__Parametros__Group_1__0__Impl rule__Parametros__Group_1__1 )
            // InternalT5.g:2996:2: rule__Parametros__Group_1__0__Impl rule__Parametros__Group_1__1
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
    // InternalT5.g:3003:1: rule__Parametros__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parametros__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3007:1: ( ( ',' ) )
            // InternalT5.g:3008:1: ( ',' )
            {
            // InternalT5.g:3008:1: ( ',' )
            // InternalT5.g:3009:2: ','
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
    // InternalT5.g:3018:1: rule__Parametros__Group_1__1 : rule__Parametros__Group_1__1__Impl ;
    public final void rule__Parametros__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3022:1: ( rule__Parametros__Group_1__1__Impl )
            // InternalT5.g:3023:2: rule__Parametros__Group_1__1__Impl
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
    // InternalT5.g:3029:1: rule__Parametros__Group_1__1__Impl : ( ( rule__Parametros__ParametroAssignment_1_1 ) ) ;
    public final void rule__Parametros__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3033:1: ( ( ( rule__Parametros__ParametroAssignment_1_1 ) ) )
            // InternalT5.g:3034:1: ( ( rule__Parametros__ParametroAssignment_1_1 ) )
            {
            // InternalT5.g:3034:1: ( ( rule__Parametros__ParametroAssignment_1_1 ) )
            // InternalT5.g:3035:2: ( rule__Parametros__ParametroAssignment_1_1 )
            {
             before(grammarAccess.getParametrosAccess().getParametroAssignment_1_1()); 
            // InternalT5.g:3036:2: ( rule__Parametros__ParametroAssignment_1_1 )
            // InternalT5.g:3036:3: rule__Parametros__ParametroAssignment_1_1
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
    // InternalT5.g:3045:1: rule__Parametro__Group__0 : rule__Parametro__Group__0__Impl rule__Parametro__Group__1 ;
    public final void rule__Parametro__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3049:1: ( rule__Parametro__Group__0__Impl rule__Parametro__Group__1 )
            // InternalT5.g:3050:2: rule__Parametro__Group__0__Impl rule__Parametro__Group__1
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
    // InternalT5.g:3057:1: rule__Parametro__Group__0__Impl : ( ( 'var' )? ) ;
    public final void rule__Parametro__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3061:1: ( ( ( 'var' )? ) )
            // InternalT5.g:3062:1: ( ( 'var' )? )
            {
            // InternalT5.g:3062:1: ( ( 'var' )? )
            // InternalT5.g:3063:2: ( 'var' )?
            {
             before(grammarAccess.getParametroAccess().getVarKeyword_0()); 
            // InternalT5.g:3064:2: ( 'var' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalT5.g:3064:3: 'var'
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
    // InternalT5.g:3072:1: rule__Parametro__Group__1 : rule__Parametro__Group__1__Impl rule__Parametro__Group__2 ;
    public final void rule__Parametro__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3076:1: ( rule__Parametro__Group__1__Impl rule__Parametro__Group__2 )
            // InternalT5.g:3077:2: rule__Parametro__Group__1__Impl rule__Parametro__Group__2
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
    // InternalT5.g:3084:1: rule__Parametro__Group__1__Impl : ( ( rule__Parametro__IdsAssignment_1 ) ) ;
    public final void rule__Parametro__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3088:1: ( ( ( rule__Parametro__IdsAssignment_1 ) ) )
            // InternalT5.g:3089:1: ( ( rule__Parametro__IdsAssignment_1 ) )
            {
            // InternalT5.g:3089:1: ( ( rule__Parametro__IdsAssignment_1 ) )
            // InternalT5.g:3090:2: ( rule__Parametro__IdsAssignment_1 )
            {
             before(grammarAccess.getParametroAccess().getIdsAssignment_1()); 
            // InternalT5.g:3091:2: ( rule__Parametro__IdsAssignment_1 )
            // InternalT5.g:3091:3: rule__Parametro__IdsAssignment_1
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
    // InternalT5.g:3099:1: rule__Parametro__Group__2 : rule__Parametro__Group__2__Impl rule__Parametro__Group__3 ;
    public final void rule__Parametro__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3103:1: ( rule__Parametro__Group__2__Impl rule__Parametro__Group__3 )
            // InternalT5.g:3104:2: rule__Parametro__Group__2__Impl rule__Parametro__Group__3
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
    // InternalT5.g:3111:1: rule__Parametro__Group__2__Impl : ( ( rule__Parametro__Group_2__0 )* ) ;
    public final void rule__Parametro__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3115:1: ( ( ( rule__Parametro__Group_2__0 )* ) )
            // InternalT5.g:3116:1: ( ( rule__Parametro__Group_2__0 )* )
            {
            // InternalT5.g:3116:1: ( ( rule__Parametro__Group_2__0 )* )
            // InternalT5.g:3117:2: ( rule__Parametro__Group_2__0 )*
            {
             before(grammarAccess.getParametroAccess().getGroup_2()); 
            // InternalT5.g:3118:2: ( rule__Parametro__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalT5.g:3118:3: rule__Parametro__Group_2__0
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
    // InternalT5.g:3126:1: rule__Parametro__Group__3 : rule__Parametro__Group__3__Impl rule__Parametro__Group__4 ;
    public final void rule__Parametro__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3130:1: ( rule__Parametro__Group__3__Impl rule__Parametro__Group__4 )
            // InternalT5.g:3131:2: rule__Parametro__Group__3__Impl rule__Parametro__Group__4
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
    // InternalT5.g:3138:1: rule__Parametro__Group__3__Impl : ( ':' ) ;
    public final void rule__Parametro__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3142:1: ( ( ':' ) )
            // InternalT5.g:3143:1: ( ':' )
            {
            // InternalT5.g:3143:1: ( ':' )
            // InternalT5.g:3144:2: ':'
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
    // InternalT5.g:3153:1: rule__Parametro__Group__4 : rule__Parametro__Group__4__Impl ;
    public final void rule__Parametro__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3157:1: ( rule__Parametro__Group__4__Impl )
            // InternalT5.g:3158:2: rule__Parametro__Group__4__Impl
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
    // InternalT5.g:3164:1: rule__Parametro__Group__4__Impl : ( ( rule__Parametro__TipoParamAssignment_4 ) ) ;
    public final void rule__Parametro__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3168:1: ( ( ( rule__Parametro__TipoParamAssignment_4 ) ) )
            // InternalT5.g:3169:1: ( ( rule__Parametro__TipoParamAssignment_4 ) )
            {
            // InternalT5.g:3169:1: ( ( rule__Parametro__TipoParamAssignment_4 ) )
            // InternalT5.g:3170:2: ( rule__Parametro__TipoParamAssignment_4 )
            {
             before(grammarAccess.getParametroAccess().getTipoParamAssignment_4()); 
            // InternalT5.g:3171:2: ( rule__Parametro__TipoParamAssignment_4 )
            // InternalT5.g:3171:3: rule__Parametro__TipoParamAssignment_4
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
    // InternalT5.g:3180:1: rule__Parametro__Group_2__0 : rule__Parametro__Group_2__0__Impl rule__Parametro__Group_2__1 ;
    public final void rule__Parametro__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3184:1: ( rule__Parametro__Group_2__0__Impl rule__Parametro__Group_2__1 )
            // InternalT5.g:3185:2: rule__Parametro__Group_2__0__Impl rule__Parametro__Group_2__1
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
    // InternalT5.g:3192:1: rule__Parametro__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Parametro__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3196:1: ( ( ',' ) )
            // InternalT5.g:3197:1: ( ',' )
            {
            // InternalT5.g:3197:1: ( ',' )
            // InternalT5.g:3198:2: ','
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
    // InternalT5.g:3207:1: rule__Parametro__Group_2__1 : rule__Parametro__Group_2__1__Impl ;
    public final void rule__Parametro__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3211:1: ( rule__Parametro__Group_2__1__Impl )
            // InternalT5.g:3212:2: rule__Parametro__Group_2__1__Impl
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
    // InternalT5.g:3218:1: rule__Parametro__Group_2__1__Impl : ( ( rule__Parametro__IdsAssignment_2_1 ) ) ;
    public final void rule__Parametro__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3222:1: ( ( ( rule__Parametro__IdsAssignment_2_1 ) ) )
            // InternalT5.g:3223:1: ( ( rule__Parametro__IdsAssignment_2_1 ) )
            {
            // InternalT5.g:3223:1: ( ( rule__Parametro__IdsAssignment_2_1 ) )
            // InternalT5.g:3224:2: ( rule__Parametro__IdsAssignment_2_1 )
            {
             before(grammarAccess.getParametroAccess().getIdsAssignment_2_1()); 
            // InternalT5.g:3225:2: ( rule__Parametro__IdsAssignment_2_1 )
            // InternalT5.g:3225:3: rule__Parametro__IdsAssignment_2_1
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
    // InternalT5.g:3234:1: rule__Corpo__Group__0 : rule__Corpo__Group__0__Impl rule__Corpo__Group__1 ;
    public final void rule__Corpo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3238:1: ( rule__Corpo__Group__0__Impl rule__Corpo__Group__1 )
            // InternalT5.g:3239:2: rule__Corpo__Group__0__Impl rule__Corpo__Group__1
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
    // InternalT5.g:3246:1: rule__Corpo__Group__0__Impl : ( ( rule__Corpo__LocaisAssignment_0 )* ) ;
    public final void rule__Corpo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3250:1: ( ( ( rule__Corpo__LocaisAssignment_0 )* ) )
            // InternalT5.g:3251:1: ( ( rule__Corpo__LocaisAssignment_0 )* )
            {
            // InternalT5.g:3251:1: ( ( rule__Corpo__LocaisAssignment_0 )* )
            // InternalT5.g:3252:2: ( rule__Corpo__LocaisAssignment_0 )*
            {
             before(grammarAccess.getCorpoAccess().getLocaisAssignment_0()); 
            // InternalT5.g:3253:2: ( rule__Corpo__LocaisAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33||LA25_0==35||LA25_0==37) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalT5.g:3253:3: rule__Corpo__LocaisAssignment_0
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
    // InternalT5.g:3261:1: rule__Corpo__Group__1 : rule__Corpo__Group__1__Impl ;
    public final void rule__Corpo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3265:1: ( rule__Corpo__Group__1__Impl )
            // InternalT5.g:3266:2: rule__Corpo__Group__1__Impl
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
    // InternalT5.g:3272:1: rule__Corpo__Group__1__Impl : ( ( rule__Corpo__ComandosAssignment_1 )* ) ;
    public final void rule__Corpo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3276:1: ( ( ( rule__Corpo__ComandosAssignment_1 )* ) )
            // InternalT5.g:3277:1: ( ( rule__Corpo__ComandosAssignment_1 )* )
            {
            // InternalT5.g:3277:1: ( ( rule__Corpo__ComandosAssignment_1 )* )
            // InternalT5.g:3278:2: ( rule__Corpo__ComandosAssignment_1 )*
            {
             before(grammarAccess.getCorpoAccess().getComandosAssignment_1()); 
            // InternalT5.g:3279:2: ( rule__Corpo__ComandosAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==49||(LA26_0>=51 && LA26_0<=53)||LA26_0==57||LA26_0==60||LA26_0==63||LA26_0==65||LA26_0==67) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalT5.g:3279:3: rule__Corpo__ComandosAssignment_1
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
    // InternalT5.g:3288:1: rule__ComandoLeia__Group__0 : rule__ComandoLeia__Group__0__Impl rule__ComandoLeia__Group__1 ;
    public final void rule__ComandoLeia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3292:1: ( rule__ComandoLeia__Group__0__Impl rule__ComandoLeia__Group__1 )
            // InternalT5.g:3293:2: rule__ComandoLeia__Group__0__Impl rule__ComandoLeia__Group__1
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
    // InternalT5.g:3300:1: rule__ComandoLeia__Group__0__Impl : ( 'leia' ) ;
    public final void rule__ComandoLeia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3304:1: ( ( 'leia' ) )
            // InternalT5.g:3305:1: ( 'leia' )
            {
            // InternalT5.g:3305:1: ( 'leia' )
            // InternalT5.g:3306:2: 'leia'
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
    // InternalT5.g:3315:1: rule__ComandoLeia__Group__1 : rule__ComandoLeia__Group__1__Impl rule__ComandoLeia__Group__2 ;
    public final void rule__ComandoLeia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3319:1: ( rule__ComandoLeia__Group__1__Impl rule__ComandoLeia__Group__2 )
            // InternalT5.g:3320:2: rule__ComandoLeia__Group__1__Impl rule__ComandoLeia__Group__2
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
    // InternalT5.g:3327:1: rule__ComandoLeia__Group__1__Impl : ( '(' ) ;
    public final void rule__ComandoLeia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3331:1: ( ( '(' ) )
            // InternalT5.g:3332:1: ( '(' )
            {
            // InternalT5.g:3332:1: ( '(' )
            // InternalT5.g:3333:2: '('
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
    // InternalT5.g:3342:1: rule__ComandoLeia__Group__2 : rule__ComandoLeia__Group__2__Impl rule__ComandoLeia__Group__3 ;
    public final void rule__ComandoLeia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3346:1: ( rule__ComandoLeia__Group__2__Impl rule__ComandoLeia__Group__3 )
            // InternalT5.g:3347:2: rule__ComandoLeia__Group__2__Impl rule__ComandoLeia__Group__3
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
    // InternalT5.g:3354:1: rule__ComandoLeia__Group__2__Impl : ( ( '^' )? ) ;
    public final void rule__ComandoLeia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3358:1: ( ( ( '^' )? ) )
            // InternalT5.g:3359:1: ( ( '^' )? )
            {
            // InternalT5.g:3359:1: ( ( '^' )? )
            // InternalT5.g:3360:2: ( '^' )?
            {
             before(grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_2()); 
            // InternalT5.g:3361:2: ( '^' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalT5.g:3361:3: '^'
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
    // InternalT5.g:3369:1: rule__ComandoLeia__Group__3 : rule__ComandoLeia__Group__3__Impl rule__ComandoLeia__Group__4 ;
    public final void rule__ComandoLeia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3373:1: ( rule__ComandoLeia__Group__3__Impl rule__ComandoLeia__Group__4 )
            // InternalT5.g:3374:2: rule__ComandoLeia__Group__3__Impl rule__ComandoLeia__Group__4
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
    // InternalT5.g:3381:1: rule__ComandoLeia__Group__3__Impl : ( ( rule__ComandoLeia__AlvoAssignment_3 ) ) ;
    public final void rule__ComandoLeia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3385:1: ( ( ( rule__ComandoLeia__AlvoAssignment_3 ) ) )
            // InternalT5.g:3386:1: ( ( rule__ComandoLeia__AlvoAssignment_3 ) )
            {
            // InternalT5.g:3386:1: ( ( rule__ComandoLeia__AlvoAssignment_3 ) )
            // InternalT5.g:3387:2: ( rule__ComandoLeia__AlvoAssignment_3 )
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoAssignment_3()); 
            // InternalT5.g:3388:2: ( rule__ComandoLeia__AlvoAssignment_3 )
            // InternalT5.g:3388:3: rule__ComandoLeia__AlvoAssignment_3
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
    // InternalT5.g:3396:1: rule__ComandoLeia__Group__4 : rule__ComandoLeia__Group__4__Impl rule__ComandoLeia__Group__5 ;
    public final void rule__ComandoLeia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3400:1: ( rule__ComandoLeia__Group__4__Impl rule__ComandoLeia__Group__5 )
            // InternalT5.g:3401:2: rule__ComandoLeia__Group__4__Impl rule__ComandoLeia__Group__5
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
    // InternalT5.g:3408:1: rule__ComandoLeia__Group__4__Impl : ( ( rule__ComandoLeia__Group_4__0 )* ) ;
    public final void rule__ComandoLeia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3412:1: ( ( ( rule__ComandoLeia__Group_4__0 )* ) )
            // InternalT5.g:3413:1: ( ( rule__ComandoLeia__Group_4__0 )* )
            {
            // InternalT5.g:3413:1: ( ( rule__ComandoLeia__Group_4__0 )* )
            // InternalT5.g:3414:2: ( rule__ComandoLeia__Group_4__0 )*
            {
             before(grammarAccess.getComandoLeiaAccess().getGroup_4()); 
            // InternalT5.g:3415:2: ( rule__ComandoLeia__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==34) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalT5.g:3415:3: rule__ComandoLeia__Group_4__0
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
    // InternalT5.g:3423:1: rule__ComandoLeia__Group__5 : rule__ComandoLeia__Group__5__Impl ;
    public final void rule__ComandoLeia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3427:1: ( rule__ComandoLeia__Group__5__Impl )
            // InternalT5.g:3428:2: rule__ComandoLeia__Group__5__Impl
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
    // InternalT5.g:3434:1: rule__ComandoLeia__Group__5__Impl : ( ')' ) ;
    public final void rule__ComandoLeia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3438:1: ( ( ')' ) )
            // InternalT5.g:3439:1: ( ')' )
            {
            // InternalT5.g:3439:1: ( ')' )
            // InternalT5.g:3440:2: ')'
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
    // InternalT5.g:3450:1: rule__ComandoLeia__Group_4__0 : rule__ComandoLeia__Group_4__0__Impl rule__ComandoLeia__Group_4__1 ;
    public final void rule__ComandoLeia__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3454:1: ( rule__ComandoLeia__Group_4__0__Impl rule__ComandoLeia__Group_4__1 )
            // InternalT5.g:3455:2: rule__ComandoLeia__Group_4__0__Impl rule__ComandoLeia__Group_4__1
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
    // InternalT5.g:3462:1: rule__ComandoLeia__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ComandoLeia__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3466:1: ( ( ',' ) )
            // InternalT5.g:3467:1: ( ',' )
            {
            // InternalT5.g:3467:1: ( ',' )
            // InternalT5.g:3468:2: ','
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
    // InternalT5.g:3477:1: rule__ComandoLeia__Group_4__1 : rule__ComandoLeia__Group_4__1__Impl rule__ComandoLeia__Group_4__2 ;
    public final void rule__ComandoLeia__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3481:1: ( rule__ComandoLeia__Group_4__1__Impl rule__ComandoLeia__Group_4__2 )
            // InternalT5.g:3482:2: rule__ComandoLeia__Group_4__1__Impl rule__ComandoLeia__Group_4__2
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
    // InternalT5.g:3489:1: rule__ComandoLeia__Group_4__1__Impl : ( ( '^' )? ) ;
    public final void rule__ComandoLeia__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3493:1: ( ( ( '^' )? ) )
            // InternalT5.g:3494:1: ( ( '^' )? )
            {
            // InternalT5.g:3494:1: ( ( '^' )? )
            // InternalT5.g:3495:2: ( '^' )?
            {
             before(grammarAccess.getComandoLeiaAccess().getCircumflexAccentKeyword_4_1()); 
            // InternalT5.g:3496:2: ( '^' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalT5.g:3496:3: '^'
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
    // InternalT5.g:3504:1: rule__ComandoLeia__Group_4__2 : rule__ComandoLeia__Group_4__2__Impl ;
    public final void rule__ComandoLeia__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3508:1: ( rule__ComandoLeia__Group_4__2__Impl )
            // InternalT5.g:3509:2: rule__ComandoLeia__Group_4__2__Impl
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
    // InternalT5.g:3515:1: rule__ComandoLeia__Group_4__2__Impl : ( ( rule__ComandoLeia__AlvoAssignment_4_2 ) ) ;
    public final void rule__ComandoLeia__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3519:1: ( ( ( rule__ComandoLeia__AlvoAssignment_4_2 ) ) )
            // InternalT5.g:3520:1: ( ( rule__ComandoLeia__AlvoAssignment_4_2 ) )
            {
            // InternalT5.g:3520:1: ( ( rule__ComandoLeia__AlvoAssignment_4_2 ) )
            // InternalT5.g:3521:2: ( rule__ComandoLeia__AlvoAssignment_4_2 )
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoAssignment_4_2()); 
            // InternalT5.g:3522:2: ( rule__ComandoLeia__AlvoAssignment_4_2 )
            // InternalT5.g:3522:3: rule__ComandoLeia__AlvoAssignment_4_2
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
    // InternalT5.g:3531:1: rule__ComandoEscreva__Group__0 : rule__ComandoEscreva__Group__0__Impl rule__ComandoEscreva__Group__1 ;
    public final void rule__ComandoEscreva__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3535:1: ( rule__ComandoEscreva__Group__0__Impl rule__ComandoEscreva__Group__1 )
            // InternalT5.g:3536:2: rule__ComandoEscreva__Group__0__Impl rule__ComandoEscreva__Group__1
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
    // InternalT5.g:3543:1: rule__ComandoEscreva__Group__0__Impl : ( 'escreva' ) ;
    public final void rule__ComandoEscreva__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3547:1: ( ( 'escreva' ) )
            // InternalT5.g:3548:1: ( 'escreva' )
            {
            // InternalT5.g:3548:1: ( 'escreva' )
            // InternalT5.g:3549:2: 'escreva'
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
    // InternalT5.g:3558:1: rule__ComandoEscreva__Group__1 : rule__ComandoEscreva__Group__1__Impl rule__ComandoEscreva__Group__2 ;
    public final void rule__ComandoEscreva__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3562:1: ( rule__ComandoEscreva__Group__1__Impl rule__ComandoEscreva__Group__2 )
            // InternalT5.g:3563:2: rule__ComandoEscreva__Group__1__Impl rule__ComandoEscreva__Group__2
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
    // InternalT5.g:3570:1: rule__ComandoEscreva__Group__1__Impl : ( '(' ) ;
    public final void rule__ComandoEscreva__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3574:1: ( ( '(' ) )
            // InternalT5.g:3575:1: ( '(' )
            {
            // InternalT5.g:3575:1: ( '(' )
            // InternalT5.g:3576:2: '('
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
    // InternalT5.g:3585:1: rule__ComandoEscreva__Group__2 : rule__ComandoEscreva__Group__2__Impl rule__ComandoEscreva__Group__3 ;
    public final void rule__ComandoEscreva__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3589:1: ( rule__ComandoEscreva__Group__2__Impl rule__ComandoEscreva__Group__3 )
            // InternalT5.g:3590:2: rule__ComandoEscreva__Group__2__Impl rule__ComandoEscreva__Group__3
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
    // InternalT5.g:3597:1: rule__ComandoEscreva__Group__2__Impl : ( ( rule__ComandoEscreva__ExpAssignment_2 ) ) ;
    public final void rule__ComandoEscreva__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3601:1: ( ( ( rule__ComandoEscreva__ExpAssignment_2 ) ) )
            // InternalT5.g:3602:1: ( ( rule__ComandoEscreva__ExpAssignment_2 ) )
            {
            // InternalT5.g:3602:1: ( ( rule__ComandoEscreva__ExpAssignment_2 ) )
            // InternalT5.g:3603:2: ( rule__ComandoEscreva__ExpAssignment_2 )
            {
             before(grammarAccess.getComandoEscrevaAccess().getExpAssignment_2()); 
            // InternalT5.g:3604:2: ( rule__ComandoEscreva__ExpAssignment_2 )
            // InternalT5.g:3604:3: rule__ComandoEscreva__ExpAssignment_2
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
    // InternalT5.g:3612:1: rule__ComandoEscreva__Group__3 : rule__ComandoEscreva__Group__3__Impl rule__ComandoEscreva__Group__4 ;
    public final void rule__ComandoEscreva__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3616:1: ( rule__ComandoEscreva__Group__3__Impl rule__ComandoEscreva__Group__4 )
            // InternalT5.g:3617:2: rule__ComandoEscreva__Group__3__Impl rule__ComandoEscreva__Group__4
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
    // InternalT5.g:3624:1: rule__ComandoEscreva__Group__3__Impl : ( ( rule__ComandoEscreva__Group_3__0 )* ) ;
    public final void rule__ComandoEscreva__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3628:1: ( ( ( rule__ComandoEscreva__Group_3__0 )* ) )
            // InternalT5.g:3629:1: ( ( rule__ComandoEscreva__Group_3__0 )* )
            {
            // InternalT5.g:3629:1: ( ( rule__ComandoEscreva__Group_3__0 )* )
            // InternalT5.g:3630:2: ( rule__ComandoEscreva__Group_3__0 )*
            {
             before(grammarAccess.getComandoEscrevaAccess().getGroup_3()); 
            // InternalT5.g:3631:2: ( rule__ComandoEscreva__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalT5.g:3631:3: rule__ComandoEscreva__Group_3__0
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
    // InternalT5.g:3639:1: rule__ComandoEscreva__Group__4 : rule__ComandoEscreva__Group__4__Impl ;
    public final void rule__ComandoEscreva__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3643:1: ( rule__ComandoEscreva__Group__4__Impl )
            // InternalT5.g:3644:2: rule__ComandoEscreva__Group__4__Impl
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
    // InternalT5.g:3650:1: rule__ComandoEscreva__Group__4__Impl : ( ')' ) ;
    public final void rule__ComandoEscreva__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3654:1: ( ( ')' ) )
            // InternalT5.g:3655:1: ( ')' )
            {
            // InternalT5.g:3655:1: ( ')' )
            // InternalT5.g:3656:2: ')'
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
    // InternalT5.g:3666:1: rule__ComandoEscreva__Group_3__0 : rule__ComandoEscreva__Group_3__0__Impl rule__ComandoEscreva__Group_3__1 ;
    public final void rule__ComandoEscreva__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3670:1: ( rule__ComandoEscreva__Group_3__0__Impl rule__ComandoEscreva__Group_3__1 )
            // InternalT5.g:3671:2: rule__ComandoEscreva__Group_3__0__Impl rule__ComandoEscreva__Group_3__1
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
    // InternalT5.g:3678:1: rule__ComandoEscreva__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ComandoEscreva__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3682:1: ( ( ',' ) )
            // InternalT5.g:3683:1: ( ',' )
            {
            // InternalT5.g:3683:1: ( ',' )
            // InternalT5.g:3684:2: ','
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
    // InternalT5.g:3693:1: rule__ComandoEscreva__Group_3__1 : rule__ComandoEscreva__Group_3__1__Impl ;
    public final void rule__ComandoEscreva__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3697:1: ( rule__ComandoEscreva__Group_3__1__Impl )
            // InternalT5.g:3698:2: rule__ComandoEscreva__Group_3__1__Impl
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
    // InternalT5.g:3704:1: rule__ComandoEscreva__Group_3__1__Impl : ( ( rule__ComandoEscreva__ExpAssignment_3_1 ) ) ;
    public final void rule__ComandoEscreva__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3708:1: ( ( ( rule__ComandoEscreva__ExpAssignment_3_1 ) ) )
            // InternalT5.g:3709:1: ( ( rule__ComandoEscreva__ExpAssignment_3_1 ) )
            {
            // InternalT5.g:3709:1: ( ( rule__ComandoEscreva__ExpAssignment_3_1 ) )
            // InternalT5.g:3710:2: ( rule__ComandoEscreva__ExpAssignment_3_1 )
            {
             before(grammarAccess.getComandoEscrevaAccess().getExpAssignment_3_1()); 
            // InternalT5.g:3711:2: ( rule__ComandoEscreva__ExpAssignment_3_1 )
            // InternalT5.g:3711:3: rule__ComandoEscreva__ExpAssignment_3_1
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
    // InternalT5.g:3720:1: rule__ComandoSe__Group__0 : rule__ComandoSe__Group__0__Impl rule__ComandoSe__Group__1 ;
    public final void rule__ComandoSe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3724:1: ( rule__ComandoSe__Group__0__Impl rule__ComandoSe__Group__1 )
            // InternalT5.g:3725:2: rule__ComandoSe__Group__0__Impl rule__ComandoSe__Group__1
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
    // InternalT5.g:3732:1: rule__ComandoSe__Group__0__Impl : ( 'se' ) ;
    public final void rule__ComandoSe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3736:1: ( ( 'se' ) )
            // InternalT5.g:3737:1: ( 'se' )
            {
            // InternalT5.g:3737:1: ( 'se' )
            // InternalT5.g:3738:2: 'se'
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
    // InternalT5.g:3747:1: rule__ComandoSe__Group__1 : rule__ComandoSe__Group__1__Impl rule__ComandoSe__Group__2 ;
    public final void rule__ComandoSe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3751:1: ( rule__ComandoSe__Group__1__Impl rule__ComandoSe__Group__2 )
            // InternalT5.g:3752:2: rule__ComandoSe__Group__1__Impl rule__ComandoSe__Group__2
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
    // InternalT5.g:3759:1: rule__ComandoSe__Group__1__Impl : ( ( rule__ComandoSe__CondAssignment_1 ) ) ;
    public final void rule__ComandoSe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3763:1: ( ( ( rule__ComandoSe__CondAssignment_1 ) ) )
            // InternalT5.g:3764:1: ( ( rule__ComandoSe__CondAssignment_1 ) )
            {
            // InternalT5.g:3764:1: ( ( rule__ComandoSe__CondAssignment_1 ) )
            // InternalT5.g:3765:2: ( rule__ComandoSe__CondAssignment_1 )
            {
             before(grammarAccess.getComandoSeAccess().getCondAssignment_1()); 
            // InternalT5.g:3766:2: ( rule__ComandoSe__CondAssignment_1 )
            // InternalT5.g:3766:3: rule__ComandoSe__CondAssignment_1
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
    // InternalT5.g:3774:1: rule__ComandoSe__Group__2 : rule__ComandoSe__Group__2__Impl rule__ComandoSe__Group__3 ;
    public final void rule__ComandoSe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3778:1: ( rule__ComandoSe__Group__2__Impl rule__ComandoSe__Group__3 )
            // InternalT5.g:3779:2: rule__ComandoSe__Group__2__Impl rule__ComandoSe__Group__3
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
    // InternalT5.g:3786:1: rule__ComandoSe__Group__2__Impl : ( 'entao' ) ;
    public final void rule__ComandoSe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3790:1: ( ( 'entao' ) )
            // InternalT5.g:3791:1: ( 'entao' )
            {
            // InternalT5.g:3791:1: ( 'entao' )
            // InternalT5.g:3792:2: 'entao'
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
    // InternalT5.g:3801:1: rule__ComandoSe__Group__3 : rule__ComandoSe__Group__3__Impl rule__ComandoSe__Group__4 ;
    public final void rule__ComandoSe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3805:1: ( rule__ComandoSe__Group__3__Impl rule__ComandoSe__Group__4 )
            // InternalT5.g:3806:2: rule__ComandoSe__Group__3__Impl rule__ComandoSe__Group__4
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
    // InternalT5.g:3813:1: rule__ComandoSe__Group__3__Impl : ( ( rule__ComandoSe__ComandosAssignment_3 )* ) ;
    public final void rule__ComandoSe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3817:1: ( ( ( rule__ComandoSe__ComandosAssignment_3 )* ) )
            // InternalT5.g:3818:1: ( ( rule__ComandoSe__ComandosAssignment_3 )* )
            {
            // InternalT5.g:3818:1: ( ( rule__ComandoSe__ComandosAssignment_3 )* )
            // InternalT5.g:3819:2: ( rule__ComandoSe__ComandosAssignment_3 )*
            {
             before(grammarAccess.getComandoSeAccess().getComandosAssignment_3()); 
            // InternalT5.g:3820:2: ( rule__ComandoSe__ComandosAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==49||(LA31_0>=51 && LA31_0<=53)||LA31_0==57||LA31_0==60||LA31_0==63||LA31_0==65||LA31_0==67) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalT5.g:3820:3: rule__ComandoSe__ComandosAssignment_3
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
    // InternalT5.g:3828:1: rule__ComandoSe__Group__4 : rule__ComandoSe__Group__4__Impl rule__ComandoSe__Group__5 ;
    public final void rule__ComandoSe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3832:1: ( rule__ComandoSe__Group__4__Impl rule__ComandoSe__Group__5 )
            // InternalT5.g:3833:2: rule__ComandoSe__Group__4__Impl rule__ComandoSe__Group__5
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
    // InternalT5.g:3840:1: rule__ComandoSe__Group__4__Impl : ( ( rule__ComandoSe__Group_4__0 )? ) ;
    public final void rule__ComandoSe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3844:1: ( ( ( rule__ComandoSe__Group_4__0 )? ) )
            // InternalT5.g:3845:1: ( ( rule__ComandoSe__Group_4__0 )? )
            {
            // InternalT5.g:3845:1: ( ( rule__ComandoSe__Group_4__0 )? )
            // InternalT5.g:3846:2: ( rule__ComandoSe__Group_4__0 )?
            {
             before(grammarAccess.getComandoSeAccess().getGroup_4()); 
            // InternalT5.g:3847:2: ( rule__ComandoSe__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==56) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalT5.g:3847:3: rule__ComandoSe__Group_4__0
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
    // InternalT5.g:3855:1: rule__ComandoSe__Group__5 : rule__ComandoSe__Group__5__Impl ;
    public final void rule__ComandoSe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3859:1: ( rule__ComandoSe__Group__5__Impl )
            // InternalT5.g:3860:2: rule__ComandoSe__Group__5__Impl
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
    // InternalT5.g:3866:1: rule__ComandoSe__Group__5__Impl : ( 'fim_se' ) ;
    public final void rule__ComandoSe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3870:1: ( ( 'fim_se' ) )
            // InternalT5.g:3871:1: ( 'fim_se' )
            {
            // InternalT5.g:3871:1: ( 'fim_se' )
            // InternalT5.g:3872:2: 'fim_se'
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
    // InternalT5.g:3882:1: rule__ComandoSe__Group_4__0 : rule__ComandoSe__Group_4__0__Impl rule__ComandoSe__Group_4__1 ;
    public final void rule__ComandoSe__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3886:1: ( rule__ComandoSe__Group_4__0__Impl rule__ComandoSe__Group_4__1 )
            // InternalT5.g:3887:2: rule__ComandoSe__Group_4__0__Impl rule__ComandoSe__Group_4__1
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
    // InternalT5.g:3894:1: rule__ComandoSe__Group_4__0__Impl : ( 'senao' ) ;
    public final void rule__ComandoSe__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3898:1: ( ( 'senao' ) )
            // InternalT5.g:3899:1: ( 'senao' )
            {
            // InternalT5.g:3899:1: ( 'senao' )
            // InternalT5.g:3900:2: 'senao'
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
    // InternalT5.g:3909:1: rule__ComandoSe__Group_4__1 : rule__ComandoSe__Group_4__1__Impl ;
    public final void rule__ComandoSe__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3913:1: ( rule__ComandoSe__Group_4__1__Impl )
            // InternalT5.g:3914:2: rule__ComandoSe__Group_4__1__Impl
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
    // InternalT5.g:3920:1: rule__ComandoSe__Group_4__1__Impl : ( ( rule__ComandoSe__ComandosElseAssignment_4_1 )* ) ;
    public final void rule__ComandoSe__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3924:1: ( ( ( rule__ComandoSe__ComandosElseAssignment_4_1 )* ) )
            // InternalT5.g:3925:1: ( ( rule__ComandoSe__ComandosElseAssignment_4_1 )* )
            {
            // InternalT5.g:3925:1: ( ( rule__ComandoSe__ComandosElseAssignment_4_1 )* )
            // InternalT5.g:3926:2: ( rule__ComandoSe__ComandosElseAssignment_4_1 )*
            {
             before(grammarAccess.getComandoSeAccess().getComandosElseAssignment_4_1()); 
            // InternalT5.g:3927:2: ( rule__ComandoSe__ComandosElseAssignment_4_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==49||(LA33_0>=51 && LA33_0<=53)||LA33_0==57||LA33_0==60||LA33_0==63||LA33_0==65||LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalT5.g:3927:3: rule__ComandoSe__ComandosElseAssignment_4_1
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
    // InternalT5.g:3936:1: rule__ComandoCaso__Group__0 : rule__ComandoCaso__Group__0__Impl rule__ComandoCaso__Group__1 ;
    public final void rule__ComandoCaso__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3940:1: ( rule__ComandoCaso__Group__0__Impl rule__ComandoCaso__Group__1 )
            // InternalT5.g:3941:2: rule__ComandoCaso__Group__0__Impl rule__ComandoCaso__Group__1
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
    // InternalT5.g:3948:1: rule__ComandoCaso__Group__0__Impl : ( 'caso' ) ;
    public final void rule__ComandoCaso__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3952:1: ( ( 'caso' ) )
            // InternalT5.g:3953:1: ( 'caso' )
            {
            // InternalT5.g:3953:1: ( 'caso' )
            // InternalT5.g:3954:2: 'caso'
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
    // InternalT5.g:3963:1: rule__ComandoCaso__Group__1 : rule__ComandoCaso__Group__1__Impl rule__ComandoCaso__Group__2 ;
    public final void rule__ComandoCaso__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3967:1: ( rule__ComandoCaso__Group__1__Impl rule__ComandoCaso__Group__2 )
            // InternalT5.g:3968:2: rule__ComandoCaso__Group__1__Impl rule__ComandoCaso__Group__2
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
    // InternalT5.g:3975:1: rule__ComandoCaso__Group__1__Impl : ( ( rule__ComandoCaso__ExpAssignment_1 ) ) ;
    public final void rule__ComandoCaso__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3979:1: ( ( ( rule__ComandoCaso__ExpAssignment_1 ) ) )
            // InternalT5.g:3980:1: ( ( rule__ComandoCaso__ExpAssignment_1 ) )
            {
            // InternalT5.g:3980:1: ( ( rule__ComandoCaso__ExpAssignment_1 ) )
            // InternalT5.g:3981:2: ( rule__ComandoCaso__ExpAssignment_1 )
            {
             before(grammarAccess.getComandoCasoAccess().getExpAssignment_1()); 
            // InternalT5.g:3982:2: ( rule__ComandoCaso__ExpAssignment_1 )
            // InternalT5.g:3982:3: rule__ComandoCaso__ExpAssignment_1
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
    // InternalT5.g:3990:1: rule__ComandoCaso__Group__2 : rule__ComandoCaso__Group__2__Impl rule__ComandoCaso__Group__3 ;
    public final void rule__ComandoCaso__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:3994:1: ( rule__ComandoCaso__Group__2__Impl rule__ComandoCaso__Group__3 )
            // InternalT5.g:3995:2: rule__ComandoCaso__Group__2__Impl rule__ComandoCaso__Group__3
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
    // InternalT5.g:4002:1: rule__ComandoCaso__Group__2__Impl : ( 'seja' ) ;
    public final void rule__ComandoCaso__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4006:1: ( ( 'seja' ) )
            // InternalT5.g:4007:1: ( 'seja' )
            {
            // InternalT5.g:4007:1: ( 'seja' )
            // InternalT5.g:4008:2: 'seja'
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
    // InternalT5.g:4017:1: rule__ComandoCaso__Group__3 : rule__ComandoCaso__Group__3__Impl rule__ComandoCaso__Group__4 ;
    public final void rule__ComandoCaso__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4021:1: ( rule__ComandoCaso__Group__3__Impl rule__ComandoCaso__Group__4 )
            // InternalT5.g:4022:2: rule__ComandoCaso__Group__3__Impl rule__ComandoCaso__Group__4
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
    // InternalT5.g:4029:1: rule__ComandoCaso__Group__3__Impl : ( ( rule__ComandoCaso__SelecaoAssignment_3 )* ) ;
    public final void rule__ComandoCaso__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4033:1: ( ( ( rule__ComandoCaso__SelecaoAssignment_3 )* ) )
            // InternalT5.g:4034:1: ( ( rule__ComandoCaso__SelecaoAssignment_3 )* )
            {
            // InternalT5.g:4034:1: ( ( rule__ComandoCaso__SelecaoAssignment_3 )* )
            // InternalT5.g:4035:2: ( rule__ComandoCaso__SelecaoAssignment_3 )*
            {
             before(grammarAccess.getComandoCasoAccess().getSelecaoAssignment_3()); 
            // InternalT5.g:4036:2: ( rule__ComandoCaso__SelecaoAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==12) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalT5.g:4036:3: rule__ComandoCaso__SelecaoAssignment_3
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
    // InternalT5.g:4044:1: rule__ComandoCaso__Group__4 : rule__ComandoCaso__Group__4__Impl rule__ComandoCaso__Group__5 ;
    public final void rule__ComandoCaso__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4048:1: ( rule__ComandoCaso__Group__4__Impl rule__ComandoCaso__Group__5 )
            // InternalT5.g:4049:2: rule__ComandoCaso__Group__4__Impl rule__ComandoCaso__Group__5
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
    // InternalT5.g:4056:1: rule__ComandoCaso__Group__4__Impl : ( ( rule__ComandoCaso__Group_4__0 )? ) ;
    public final void rule__ComandoCaso__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4060:1: ( ( ( rule__ComandoCaso__Group_4__0 )? ) )
            // InternalT5.g:4061:1: ( ( rule__ComandoCaso__Group_4__0 )? )
            {
            // InternalT5.g:4061:1: ( ( rule__ComandoCaso__Group_4__0 )? )
            // InternalT5.g:4062:2: ( rule__ComandoCaso__Group_4__0 )?
            {
             before(grammarAccess.getComandoCasoAccess().getGroup_4()); 
            // InternalT5.g:4063:2: ( rule__ComandoCaso__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalT5.g:4063:3: rule__ComandoCaso__Group_4__0
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
    // InternalT5.g:4071:1: rule__ComandoCaso__Group__5 : rule__ComandoCaso__Group__5__Impl ;
    public final void rule__ComandoCaso__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4075:1: ( rule__ComandoCaso__Group__5__Impl )
            // InternalT5.g:4076:2: rule__ComandoCaso__Group__5__Impl
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
    // InternalT5.g:4082:1: rule__ComandoCaso__Group__5__Impl : ( 'fim_caso' ) ;
    public final void rule__ComandoCaso__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4086:1: ( ( 'fim_caso' ) )
            // InternalT5.g:4087:1: ( 'fim_caso' )
            {
            // InternalT5.g:4087:1: ( 'fim_caso' )
            // InternalT5.g:4088:2: 'fim_caso'
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
    // InternalT5.g:4098:1: rule__ComandoCaso__Group_4__0 : rule__ComandoCaso__Group_4__0__Impl rule__ComandoCaso__Group_4__1 ;
    public final void rule__ComandoCaso__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4102:1: ( rule__ComandoCaso__Group_4__0__Impl rule__ComandoCaso__Group_4__1 )
            // InternalT5.g:4103:2: rule__ComandoCaso__Group_4__0__Impl rule__ComandoCaso__Group_4__1
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
    // InternalT5.g:4110:1: rule__ComandoCaso__Group_4__0__Impl : ( 'senao' ) ;
    public final void rule__ComandoCaso__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4114:1: ( ( 'senao' ) )
            // InternalT5.g:4115:1: ( 'senao' )
            {
            // InternalT5.g:4115:1: ( 'senao' )
            // InternalT5.g:4116:2: 'senao'
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
    // InternalT5.g:4125:1: rule__ComandoCaso__Group_4__1 : rule__ComandoCaso__Group_4__1__Impl ;
    public final void rule__ComandoCaso__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4129:1: ( rule__ComandoCaso__Group_4__1__Impl )
            // InternalT5.g:4130:2: rule__ComandoCaso__Group_4__1__Impl
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
    // InternalT5.g:4136:1: rule__ComandoCaso__Group_4__1__Impl : ( ( rule__ComandoCaso__ComandosElseAssignment_4_1 )* ) ;
    public final void rule__ComandoCaso__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4140:1: ( ( ( rule__ComandoCaso__ComandosElseAssignment_4_1 )* ) )
            // InternalT5.g:4141:1: ( ( rule__ComandoCaso__ComandosElseAssignment_4_1 )* )
            {
            // InternalT5.g:4141:1: ( ( rule__ComandoCaso__ComandosElseAssignment_4_1 )* )
            // InternalT5.g:4142:2: ( rule__ComandoCaso__ComandosElseAssignment_4_1 )*
            {
             before(grammarAccess.getComandoCasoAccess().getComandosElseAssignment_4_1()); 
            // InternalT5.g:4143:2: ( rule__ComandoCaso__ComandosElseAssignment_4_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==49||(LA36_0>=51 && LA36_0<=53)||LA36_0==57||LA36_0==60||LA36_0==63||LA36_0==65||LA36_0==67) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalT5.g:4143:3: rule__ComandoCaso__ComandosElseAssignment_4_1
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
    // InternalT5.g:4152:1: rule__ComandoPara__Group__0 : rule__ComandoPara__Group__0__Impl rule__ComandoPara__Group__1 ;
    public final void rule__ComandoPara__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4156:1: ( rule__ComandoPara__Group__0__Impl rule__ComandoPara__Group__1 )
            // InternalT5.g:4157:2: rule__ComandoPara__Group__0__Impl rule__ComandoPara__Group__1
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
    // InternalT5.g:4164:1: rule__ComandoPara__Group__0__Impl : ( 'para' ) ;
    public final void rule__ComandoPara__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4168:1: ( ( 'para' ) )
            // InternalT5.g:4169:1: ( 'para' )
            {
            // InternalT5.g:4169:1: ( 'para' )
            // InternalT5.g:4170:2: 'para'
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
    // InternalT5.g:4179:1: rule__ComandoPara__Group__1 : rule__ComandoPara__Group__1__Impl rule__ComandoPara__Group__2 ;
    public final void rule__ComandoPara__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4183:1: ( rule__ComandoPara__Group__1__Impl rule__ComandoPara__Group__2 )
            // InternalT5.g:4184:2: rule__ComandoPara__Group__1__Impl rule__ComandoPara__Group__2
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
    // InternalT5.g:4191:1: rule__ComandoPara__Group__1__Impl : ( ( rule__ComandoPara__VarAssignment_1 ) ) ;
    public final void rule__ComandoPara__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4195:1: ( ( ( rule__ComandoPara__VarAssignment_1 ) ) )
            // InternalT5.g:4196:1: ( ( rule__ComandoPara__VarAssignment_1 ) )
            {
            // InternalT5.g:4196:1: ( ( rule__ComandoPara__VarAssignment_1 ) )
            // InternalT5.g:4197:2: ( rule__ComandoPara__VarAssignment_1 )
            {
             before(grammarAccess.getComandoParaAccess().getVarAssignment_1()); 
            // InternalT5.g:4198:2: ( rule__ComandoPara__VarAssignment_1 )
            // InternalT5.g:4198:3: rule__ComandoPara__VarAssignment_1
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
    // InternalT5.g:4206:1: rule__ComandoPara__Group__2 : rule__ComandoPara__Group__2__Impl rule__ComandoPara__Group__3 ;
    public final void rule__ComandoPara__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4210:1: ( rule__ComandoPara__Group__2__Impl rule__ComandoPara__Group__3 )
            // InternalT5.g:4211:2: rule__ComandoPara__Group__2__Impl rule__ComandoPara__Group__3
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
    // InternalT5.g:4218:1: rule__ComandoPara__Group__2__Impl : ( '<-' ) ;
    public final void rule__ComandoPara__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4222:1: ( ( '<-' ) )
            // InternalT5.g:4223:1: ( '<-' )
            {
            // InternalT5.g:4223:1: ( '<-' )
            // InternalT5.g:4224:2: '<-'
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
    // InternalT5.g:4233:1: rule__ComandoPara__Group__3 : rule__ComandoPara__Group__3__Impl rule__ComandoPara__Group__4 ;
    public final void rule__ComandoPara__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4237:1: ( rule__ComandoPara__Group__3__Impl rule__ComandoPara__Group__4 )
            // InternalT5.g:4238:2: rule__ComandoPara__Group__3__Impl rule__ComandoPara__Group__4
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
    // InternalT5.g:4245:1: rule__ComandoPara__Group__3__Impl : ( ( rule__ComandoPara__InicioAssignment_3 ) ) ;
    public final void rule__ComandoPara__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4249:1: ( ( ( rule__ComandoPara__InicioAssignment_3 ) ) )
            // InternalT5.g:4250:1: ( ( rule__ComandoPara__InicioAssignment_3 ) )
            {
            // InternalT5.g:4250:1: ( ( rule__ComandoPara__InicioAssignment_3 ) )
            // InternalT5.g:4251:2: ( rule__ComandoPara__InicioAssignment_3 )
            {
             before(grammarAccess.getComandoParaAccess().getInicioAssignment_3()); 
            // InternalT5.g:4252:2: ( rule__ComandoPara__InicioAssignment_3 )
            // InternalT5.g:4252:3: rule__ComandoPara__InicioAssignment_3
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
    // InternalT5.g:4260:1: rule__ComandoPara__Group__4 : rule__ComandoPara__Group__4__Impl rule__ComandoPara__Group__5 ;
    public final void rule__ComandoPara__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4264:1: ( rule__ComandoPara__Group__4__Impl rule__ComandoPara__Group__5 )
            // InternalT5.g:4265:2: rule__ComandoPara__Group__4__Impl rule__ComandoPara__Group__5
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
    // InternalT5.g:4272:1: rule__ComandoPara__Group__4__Impl : ( 'ate' ) ;
    public final void rule__ComandoPara__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4276:1: ( ( 'ate' ) )
            // InternalT5.g:4277:1: ( 'ate' )
            {
            // InternalT5.g:4277:1: ( 'ate' )
            // InternalT5.g:4278:2: 'ate'
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
    // InternalT5.g:4287:1: rule__ComandoPara__Group__5 : rule__ComandoPara__Group__5__Impl rule__ComandoPara__Group__6 ;
    public final void rule__ComandoPara__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4291:1: ( rule__ComandoPara__Group__5__Impl rule__ComandoPara__Group__6 )
            // InternalT5.g:4292:2: rule__ComandoPara__Group__5__Impl rule__ComandoPara__Group__6
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
    // InternalT5.g:4299:1: rule__ComandoPara__Group__5__Impl : ( ( rule__ComandoPara__FimAssignment_5 ) ) ;
    public final void rule__ComandoPara__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4303:1: ( ( ( rule__ComandoPara__FimAssignment_5 ) ) )
            // InternalT5.g:4304:1: ( ( rule__ComandoPara__FimAssignment_5 ) )
            {
            // InternalT5.g:4304:1: ( ( rule__ComandoPara__FimAssignment_5 ) )
            // InternalT5.g:4305:2: ( rule__ComandoPara__FimAssignment_5 )
            {
             before(grammarAccess.getComandoParaAccess().getFimAssignment_5()); 
            // InternalT5.g:4306:2: ( rule__ComandoPara__FimAssignment_5 )
            // InternalT5.g:4306:3: rule__ComandoPara__FimAssignment_5
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
    // InternalT5.g:4314:1: rule__ComandoPara__Group__6 : rule__ComandoPara__Group__6__Impl rule__ComandoPara__Group__7 ;
    public final void rule__ComandoPara__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4318:1: ( rule__ComandoPara__Group__6__Impl rule__ComandoPara__Group__7 )
            // InternalT5.g:4319:2: rule__ComandoPara__Group__6__Impl rule__ComandoPara__Group__7
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
    // InternalT5.g:4326:1: rule__ComandoPara__Group__6__Impl : ( 'faca' ) ;
    public final void rule__ComandoPara__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4330:1: ( ( 'faca' ) )
            // InternalT5.g:4331:1: ( 'faca' )
            {
            // InternalT5.g:4331:1: ( 'faca' )
            // InternalT5.g:4332:2: 'faca'
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
    // InternalT5.g:4341:1: rule__ComandoPara__Group__7 : rule__ComandoPara__Group__7__Impl rule__ComandoPara__Group__8 ;
    public final void rule__ComandoPara__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4345:1: ( rule__ComandoPara__Group__7__Impl rule__ComandoPara__Group__8 )
            // InternalT5.g:4346:2: rule__ComandoPara__Group__7__Impl rule__ComandoPara__Group__8
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
    // InternalT5.g:4353:1: rule__ComandoPara__Group__7__Impl : ( ( rule__ComandoPara__ComandosAssignment_7 )* ) ;
    public final void rule__ComandoPara__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4357:1: ( ( ( rule__ComandoPara__ComandosAssignment_7 )* ) )
            // InternalT5.g:4358:1: ( ( rule__ComandoPara__ComandosAssignment_7 )* )
            {
            // InternalT5.g:4358:1: ( ( rule__ComandoPara__ComandosAssignment_7 )* )
            // InternalT5.g:4359:2: ( rule__ComandoPara__ComandosAssignment_7 )*
            {
             before(grammarAccess.getComandoParaAccess().getComandosAssignment_7()); 
            // InternalT5.g:4360:2: ( rule__ComandoPara__ComandosAssignment_7 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==49||(LA37_0>=51 && LA37_0<=53)||LA37_0==57||LA37_0==60||LA37_0==63||LA37_0==65||LA37_0==67) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalT5.g:4360:3: rule__ComandoPara__ComandosAssignment_7
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
    // InternalT5.g:4368:1: rule__ComandoPara__Group__8 : rule__ComandoPara__Group__8__Impl ;
    public final void rule__ComandoPara__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4372:1: ( rule__ComandoPara__Group__8__Impl )
            // InternalT5.g:4373:2: rule__ComandoPara__Group__8__Impl
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
    // InternalT5.g:4379:1: rule__ComandoPara__Group__8__Impl : ( 'fim_para' ) ;
    public final void rule__ComandoPara__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4383:1: ( ( 'fim_para' ) )
            // InternalT5.g:4384:1: ( 'fim_para' )
            {
            // InternalT5.g:4384:1: ( 'fim_para' )
            // InternalT5.g:4385:2: 'fim_para'
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
    // InternalT5.g:4395:1: rule__ComandoEnquanto__Group__0 : rule__ComandoEnquanto__Group__0__Impl rule__ComandoEnquanto__Group__1 ;
    public final void rule__ComandoEnquanto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4399:1: ( rule__ComandoEnquanto__Group__0__Impl rule__ComandoEnquanto__Group__1 )
            // InternalT5.g:4400:2: rule__ComandoEnquanto__Group__0__Impl rule__ComandoEnquanto__Group__1
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
    // InternalT5.g:4407:1: rule__ComandoEnquanto__Group__0__Impl : ( 'enquanto' ) ;
    public final void rule__ComandoEnquanto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4411:1: ( ( 'enquanto' ) )
            // InternalT5.g:4412:1: ( 'enquanto' )
            {
            // InternalT5.g:4412:1: ( 'enquanto' )
            // InternalT5.g:4413:2: 'enquanto'
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
    // InternalT5.g:4422:1: rule__ComandoEnquanto__Group__1 : rule__ComandoEnquanto__Group__1__Impl rule__ComandoEnquanto__Group__2 ;
    public final void rule__ComandoEnquanto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4426:1: ( rule__ComandoEnquanto__Group__1__Impl rule__ComandoEnquanto__Group__2 )
            // InternalT5.g:4427:2: rule__ComandoEnquanto__Group__1__Impl rule__ComandoEnquanto__Group__2
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
    // InternalT5.g:4434:1: rule__ComandoEnquanto__Group__1__Impl : ( ( rule__ComandoEnquanto__CondAssignment_1 ) ) ;
    public final void rule__ComandoEnquanto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4438:1: ( ( ( rule__ComandoEnquanto__CondAssignment_1 ) ) )
            // InternalT5.g:4439:1: ( ( rule__ComandoEnquanto__CondAssignment_1 ) )
            {
            // InternalT5.g:4439:1: ( ( rule__ComandoEnquanto__CondAssignment_1 ) )
            // InternalT5.g:4440:2: ( rule__ComandoEnquanto__CondAssignment_1 )
            {
             before(grammarAccess.getComandoEnquantoAccess().getCondAssignment_1()); 
            // InternalT5.g:4441:2: ( rule__ComandoEnquanto__CondAssignment_1 )
            // InternalT5.g:4441:3: rule__ComandoEnquanto__CondAssignment_1
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
    // InternalT5.g:4449:1: rule__ComandoEnquanto__Group__2 : rule__ComandoEnquanto__Group__2__Impl rule__ComandoEnquanto__Group__3 ;
    public final void rule__ComandoEnquanto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4453:1: ( rule__ComandoEnquanto__Group__2__Impl rule__ComandoEnquanto__Group__3 )
            // InternalT5.g:4454:2: rule__ComandoEnquanto__Group__2__Impl rule__ComandoEnquanto__Group__3
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
    // InternalT5.g:4461:1: rule__ComandoEnquanto__Group__2__Impl : ( 'faca' ) ;
    public final void rule__ComandoEnquanto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4465:1: ( ( 'faca' ) )
            // InternalT5.g:4466:1: ( 'faca' )
            {
            // InternalT5.g:4466:1: ( 'faca' )
            // InternalT5.g:4467:2: 'faca'
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
    // InternalT5.g:4476:1: rule__ComandoEnquanto__Group__3 : rule__ComandoEnquanto__Group__3__Impl rule__ComandoEnquanto__Group__4 ;
    public final void rule__ComandoEnquanto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4480:1: ( rule__ComandoEnquanto__Group__3__Impl rule__ComandoEnquanto__Group__4 )
            // InternalT5.g:4481:2: rule__ComandoEnquanto__Group__3__Impl rule__ComandoEnquanto__Group__4
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
    // InternalT5.g:4488:1: rule__ComandoEnquanto__Group__3__Impl : ( ( rule__ComandoEnquanto__ComandosAssignment_3 )* ) ;
    public final void rule__ComandoEnquanto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4492:1: ( ( ( rule__ComandoEnquanto__ComandosAssignment_3 )* ) )
            // InternalT5.g:4493:1: ( ( rule__ComandoEnquanto__ComandosAssignment_3 )* )
            {
            // InternalT5.g:4493:1: ( ( rule__ComandoEnquanto__ComandosAssignment_3 )* )
            // InternalT5.g:4494:2: ( rule__ComandoEnquanto__ComandosAssignment_3 )*
            {
             before(grammarAccess.getComandoEnquantoAccess().getComandosAssignment_3()); 
            // InternalT5.g:4495:2: ( rule__ComandoEnquanto__ComandosAssignment_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==49||(LA38_0>=51 && LA38_0<=53)||LA38_0==57||LA38_0==60||LA38_0==63||LA38_0==65||LA38_0==67) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalT5.g:4495:3: rule__ComandoEnquanto__ComandosAssignment_3
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
    // InternalT5.g:4503:1: rule__ComandoEnquanto__Group__4 : rule__ComandoEnquanto__Group__4__Impl ;
    public final void rule__ComandoEnquanto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4507:1: ( rule__ComandoEnquanto__Group__4__Impl )
            // InternalT5.g:4508:2: rule__ComandoEnquanto__Group__4__Impl
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
    // InternalT5.g:4514:1: rule__ComandoEnquanto__Group__4__Impl : ( 'fim_enquanto' ) ;
    public final void rule__ComandoEnquanto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4518:1: ( ( 'fim_enquanto' ) )
            // InternalT5.g:4519:1: ( 'fim_enquanto' )
            {
            // InternalT5.g:4519:1: ( 'fim_enquanto' )
            // InternalT5.g:4520:2: 'fim_enquanto'
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
    // InternalT5.g:4530:1: rule__ComandoFaca__Group__0 : rule__ComandoFaca__Group__0__Impl rule__ComandoFaca__Group__1 ;
    public final void rule__ComandoFaca__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4534:1: ( rule__ComandoFaca__Group__0__Impl rule__ComandoFaca__Group__1 )
            // InternalT5.g:4535:2: rule__ComandoFaca__Group__0__Impl rule__ComandoFaca__Group__1
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
    // InternalT5.g:4542:1: rule__ComandoFaca__Group__0__Impl : ( 'faca' ) ;
    public final void rule__ComandoFaca__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4546:1: ( ( 'faca' ) )
            // InternalT5.g:4547:1: ( 'faca' )
            {
            // InternalT5.g:4547:1: ( 'faca' )
            // InternalT5.g:4548:2: 'faca'
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
    // InternalT5.g:4557:1: rule__ComandoFaca__Group__1 : rule__ComandoFaca__Group__1__Impl rule__ComandoFaca__Group__2 ;
    public final void rule__ComandoFaca__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4561:1: ( rule__ComandoFaca__Group__1__Impl rule__ComandoFaca__Group__2 )
            // InternalT5.g:4562:2: rule__ComandoFaca__Group__1__Impl rule__ComandoFaca__Group__2
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
    // InternalT5.g:4569:1: rule__ComandoFaca__Group__1__Impl : ( ( rule__ComandoFaca__ComandosAssignment_1 )* ) ;
    public final void rule__ComandoFaca__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4573:1: ( ( ( rule__ComandoFaca__ComandosAssignment_1 )* ) )
            // InternalT5.g:4574:1: ( ( rule__ComandoFaca__ComandosAssignment_1 )* )
            {
            // InternalT5.g:4574:1: ( ( rule__ComandoFaca__ComandosAssignment_1 )* )
            // InternalT5.g:4575:2: ( rule__ComandoFaca__ComandosAssignment_1 )*
            {
             before(grammarAccess.getComandoFacaAccess().getComandosAssignment_1()); 
            // InternalT5.g:4576:2: ( rule__ComandoFaca__ComandosAssignment_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||LA39_0==49||(LA39_0>=51 && LA39_0<=53)||LA39_0==57||LA39_0==60||LA39_0==63||LA39_0==65||LA39_0==67) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalT5.g:4576:3: rule__ComandoFaca__ComandosAssignment_1
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
    // InternalT5.g:4584:1: rule__ComandoFaca__Group__2 : rule__ComandoFaca__Group__2__Impl rule__ComandoFaca__Group__3 ;
    public final void rule__ComandoFaca__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4588:1: ( rule__ComandoFaca__Group__2__Impl rule__ComandoFaca__Group__3 )
            // InternalT5.g:4589:2: rule__ComandoFaca__Group__2__Impl rule__ComandoFaca__Group__3
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
    // InternalT5.g:4596:1: rule__ComandoFaca__Group__2__Impl : ( 'ate' ) ;
    public final void rule__ComandoFaca__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4600:1: ( ( 'ate' ) )
            // InternalT5.g:4601:1: ( 'ate' )
            {
            // InternalT5.g:4601:1: ( 'ate' )
            // InternalT5.g:4602:2: 'ate'
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
    // InternalT5.g:4611:1: rule__ComandoFaca__Group__3 : rule__ComandoFaca__Group__3__Impl ;
    public final void rule__ComandoFaca__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4615:1: ( rule__ComandoFaca__Group__3__Impl )
            // InternalT5.g:4616:2: rule__ComandoFaca__Group__3__Impl
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
    // InternalT5.g:4622:1: rule__ComandoFaca__Group__3__Impl : ( ( rule__ComandoFaca__CondAssignment_3 ) ) ;
    public final void rule__ComandoFaca__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4626:1: ( ( ( rule__ComandoFaca__CondAssignment_3 ) ) )
            // InternalT5.g:4627:1: ( ( rule__ComandoFaca__CondAssignment_3 ) )
            {
            // InternalT5.g:4627:1: ( ( rule__ComandoFaca__CondAssignment_3 ) )
            // InternalT5.g:4628:2: ( rule__ComandoFaca__CondAssignment_3 )
            {
             before(grammarAccess.getComandoFacaAccess().getCondAssignment_3()); 
            // InternalT5.g:4629:2: ( rule__ComandoFaca__CondAssignment_3 )
            // InternalT5.g:4629:3: rule__ComandoFaca__CondAssignment_3
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
    // InternalT5.g:4638:1: rule__ComandoAtribuicao__Group__0 : rule__ComandoAtribuicao__Group__0__Impl rule__ComandoAtribuicao__Group__1 ;
    public final void rule__ComandoAtribuicao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4642:1: ( rule__ComandoAtribuicao__Group__0__Impl rule__ComandoAtribuicao__Group__1 )
            // InternalT5.g:4643:2: rule__ComandoAtribuicao__Group__0__Impl rule__ComandoAtribuicao__Group__1
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
    // InternalT5.g:4650:1: rule__ComandoAtribuicao__Group__0__Impl : ( ( '^' )? ) ;
    public final void rule__ComandoAtribuicao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4654:1: ( ( ( '^' )? ) )
            // InternalT5.g:4655:1: ( ( '^' )? )
            {
            // InternalT5.g:4655:1: ( ( '^' )? )
            // InternalT5.g:4656:2: ( '^' )?
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getCircumflexAccentKeyword_0()); 
            // InternalT5.g:4657:2: ( '^' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalT5.g:4657:3: '^'
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
    // InternalT5.g:4665:1: rule__ComandoAtribuicao__Group__1 : rule__ComandoAtribuicao__Group__1__Impl rule__ComandoAtribuicao__Group__2 ;
    public final void rule__ComandoAtribuicao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4669:1: ( rule__ComandoAtribuicao__Group__1__Impl rule__ComandoAtribuicao__Group__2 )
            // InternalT5.g:4670:2: rule__ComandoAtribuicao__Group__1__Impl rule__ComandoAtribuicao__Group__2
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
    // InternalT5.g:4677:1: rule__ComandoAtribuicao__Group__1__Impl : ( ( rule__ComandoAtribuicao__TargetAssignment_1 ) ) ;
    public final void rule__ComandoAtribuicao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4681:1: ( ( ( rule__ComandoAtribuicao__TargetAssignment_1 ) ) )
            // InternalT5.g:4682:1: ( ( rule__ComandoAtribuicao__TargetAssignment_1 ) )
            {
            // InternalT5.g:4682:1: ( ( rule__ComandoAtribuicao__TargetAssignment_1 ) )
            // InternalT5.g:4683:2: ( rule__ComandoAtribuicao__TargetAssignment_1 )
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getTargetAssignment_1()); 
            // InternalT5.g:4684:2: ( rule__ComandoAtribuicao__TargetAssignment_1 )
            // InternalT5.g:4684:3: rule__ComandoAtribuicao__TargetAssignment_1
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
    // InternalT5.g:4692:1: rule__ComandoAtribuicao__Group__2 : rule__ComandoAtribuicao__Group__2__Impl rule__ComandoAtribuicao__Group__3 ;
    public final void rule__ComandoAtribuicao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4696:1: ( rule__ComandoAtribuicao__Group__2__Impl rule__ComandoAtribuicao__Group__3 )
            // InternalT5.g:4697:2: rule__ComandoAtribuicao__Group__2__Impl rule__ComandoAtribuicao__Group__3
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
    // InternalT5.g:4704:1: rule__ComandoAtribuicao__Group__2__Impl : ( '<-' ) ;
    public final void rule__ComandoAtribuicao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4708:1: ( ( '<-' ) )
            // InternalT5.g:4709:1: ( '<-' )
            {
            // InternalT5.g:4709:1: ( '<-' )
            // InternalT5.g:4710:2: '<-'
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
    // InternalT5.g:4719:1: rule__ComandoAtribuicao__Group__3 : rule__ComandoAtribuicao__Group__3__Impl ;
    public final void rule__ComandoAtribuicao__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4723:1: ( rule__ComandoAtribuicao__Group__3__Impl )
            // InternalT5.g:4724:2: rule__ComandoAtribuicao__Group__3__Impl
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
    // InternalT5.g:4730:1: rule__ComandoAtribuicao__Group__3__Impl : ( ( rule__ComandoAtribuicao__ValorAssignment_3 ) ) ;
    public final void rule__ComandoAtribuicao__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4734:1: ( ( ( rule__ComandoAtribuicao__ValorAssignment_3 ) ) )
            // InternalT5.g:4735:1: ( ( rule__ComandoAtribuicao__ValorAssignment_3 ) )
            {
            // InternalT5.g:4735:1: ( ( rule__ComandoAtribuicao__ValorAssignment_3 ) )
            // InternalT5.g:4736:2: ( rule__ComandoAtribuicao__ValorAssignment_3 )
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getValorAssignment_3()); 
            // InternalT5.g:4737:2: ( rule__ComandoAtribuicao__ValorAssignment_3 )
            // InternalT5.g:4737:3: rule__ComandoAtribuicao__ValorAssignment_3
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
    // InternalT5.g:4746:1: rule__ComandoChamada__Group__0 : rule__ComandoChamada__Group__0__Impl rule__ComandoChamada__Group__1 ;
    public final void rule__ComandoChamada__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4750:1: ( rule__ComandoChamada__Group__0__Impl rule__ComandoChamada__Group__1 )
            // InternalT5.g:4751:2: rule__ComandoChamada__Group__0__Impl rule__ComandoChamada__Group__1
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
    // InternalT5.g:4758:1: rule__ComandoChamada__Group__0__Impl : ( ( rule__ComandoChamada__NameAssignment_0 ) ) ;
    public final void rule__ComandoChamada__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4762:1: ( ( ( rule__ComandoChamada__NameAssignment_0 ) ) )
            // InternalT5.g:4763:1: ( ( rule__ComandoChamada__NameAssignment_0 ) )
            {
            // InternalT5.g:4763:1: ( ( rule__ComandoChamada__NameAssignment_0 ) )
            // InternalT5.g:4764:2: ( rule__ComandoChamada__NameAssignment_0 )
            {
             before(grammarAccess.getComandoChamadaAccess().getNameAssignment_0()); 
            // InternalT5.g:4765:2: ( rule__ComandoChamada__NameAssignment_0 )
            // InternalT5.g:4765:3: rule__ComandoChamada__NameAssignment_0
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
    // InternalT5.g:4773:1: rule__ComandoChamada__Group__1 : rule__ComandoChamada__Group__1__Impl rule__ComandoChamada__Group__2 ;
    public final void rule__ComandoChamada__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4777:1: ( rule__ComandoChamada__Group__1__Impl rule__ComandoChamada__Group__2 )
            // InternalT5.g:4778:2: rule__ComandoChamada__Group__1__Impl rule__ComandoChamada__Group__2
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
    // InternalT5.g:4785:1: rule__ComandoChamada__Group__1__Impl : ( '(' ) ;
    public final void rule__ComandoChamada__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4789:1: ( ( '(' ) )
            // InternalT5.g:4790:1: ( '(' )
            {
            // InternalT5.g:4790:1: ( '(' )
            // InternalT5.g:4791:2: '('
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
    // InternalT5.g:4800:1: rule__ComandoChamada__Group__2 : rule__ComandoChamada__Group__2__Impl rule__ComandoChamada__Group__3 ;
    public final void rule__ComandoChamada__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4804:1: ( rule__ComandoChamada__Group__2__Impl rule__ComandoChamada__Group__3 )
            // InternalT5.g:4805:2: rule__ComandoChamada__Group__2__Impl rule__ComandoChamada__Group__3
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
    // InternalT5.g:4812:1: rule__ComandoChamada__Group__2__Impl : ( ( rule__ComandoChamada__Group_2__0 )? ) ;
    public final void rule__ComandoChamada__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4816:1: ( ( ( rule__ComandoChamada__Group_2__0 )? ) )
            // InternalT5.g:4817:1: ( ( rule__ComandoChamada__Group_2__0 )? )
            {
            // InternalT5.g:4817:1: ( ( rule__ComandoChamada__Group_2__0 )? )
            // InternalT5.g:4818:2: ( rule__ComandoChamada__Group_2__0 )?
            {
             before(grammarAccess.getComandoChamadaAccess().getGroup_2()); 
            // InternalT5.g:4819:2: ( rule__ComandoChamada__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_ID)||LA41_0==39||LA41_0==49||LA41_0==69) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalT5.g:4819:3: rule__ComandoChamada__Group_2__0
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
    // InternalT5.g:4827:1: rule__ComandoChamada__Group__3 : rule__ComandoChamada__Group__3__Impl ;
    public final void rule__ComandoChamada__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4831:1: ( rule__ComandoChamada__Group__3__Impl )
            // InternalT5.g:4832:2: rule__ComandoChamada__Group__3__Impl
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
    // InternalT5.g:4838:1: rule__ComandoChamada__Group__3__Impl : ( ')' ) ;
    public final void rule__ComandoChamada__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4842:1: ( ( ')' ) )
            // InternalT5.g:4843:1: ( ')' )
            {
            // InternalT5.g:4843:1: ( ')' )
            // InternalT5.g:4844:2: ')'
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
    // InternalT5.g:4854:1: rule__ComandoChamada__Group_2__0 : rule__ComandoChamada__Group_2__0__Impl rule__ComandoChamada__Group_2__1 ;
    public final void rule__ComandoChamada__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4858:1: ( rule__ComandoChamada__Group_2__0__Impl rule__ComandoChamada__Group_2__1 )
            // InternalT5.g:4859:2: rule__ComandoChamada__Group_2__0__Impl rule__ComandoChamada__Group_2__1
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
    // InternalT5.g:4866:1: rule__ComandoChamada__Group_2__0__Impl : ( ( rule__ComandoChamada__ArgsAssignment_2_0 ) ) ;
    public final void rule__ComandoChamada__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4870:1: ( ( ( rule__ComandoChamada__ArgsAssignment_2_0 ) ) )
            // InternalT5.g:4871:1: ( ( rule__ComandoChamada__ArgsAssignment_2_0 ) )
            {
            // InternalT5.g:4871:1: ( ( rule__ComandoChamada__ArgsAssignment_2_0 ) )
            // InternalT5.g:4872:2: ( rule__ComandoChamada__ArgsAssignment_2_0 )
            {
             before(grammarAccess.getComandoChamadaAccess().getArgsAssignment_2_0()); 
            // InternalT5.g:4873:2: ( rule__ComandoChamada__ArgsAssignment_2_0 )
            // InternalT5.g:4873:3: rule__ComandoChamada__ArgsAssignment_2_0
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
    // InternalT5.g:4881:1: rule__ComandoChamada__Group_2__1 : rule__ComandoChamada__Group_2__1__Impl ;
    public final void rule__ComandoChamada__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4885:1: ( rule__ComandoChamada__Group_2__1__Impl )
            // InternalT5.g:4886:2: rule__ComandoChamada__Group_2__1__Impl
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
    // InternalT5.g:4892:1: rule__ComandoChamada__Group_2__1__Impl : ( ( rule__ComandoChamada__Group_2_1__0 )* ) ;
    public final void rule__ComandoChamada__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4896:1: ( ( ( rule__ComandoChamada__Group_2_1__0 )* ) )
            // InternalT5.g:4897:1: ( ( rule__ComandoChamada__Group_2_1__0 )* )
            {
            // InternalT5.g:4897:1: ( ( rule__ComandoChamada__Group_2_1__0 )* )
            // InternalT5.g:4898:2: ( rule__ComandoChamada__Group_2_1__0 )*
            {
             before(grammarAccess.getComandoChamadaAccess().getGroup_2_1()); 
            // InternalT5.g:4899:2: ( rule__ComandoChamada__Group_2_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==34) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalT5.g:4899:3: rule__ComandoChamada__Group_2_1__0
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
    // InternalT5.g:4908:1: rule__ComandoChamada__Group_2_1__0 : rule__ComandoChamada__Group_2_1__0__Impl rule__ComandoChamada__Group_2_1__1 ;
    public final void rule__ComandoChamada__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4912:1: ( rule__ComandoChamada__Group_2_1__0__Impl rule__ComandoChamada__Group_2_1__1 )
            // InternalT5.g:4913:2: rule__ComandoChamada__Group_2_1__0__Impl rule__ComandoChamada__Group_2_1__1
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
    // InternalT5.g:4920:1: rule__ComandoChamada__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ComandoChamada__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4924:1: ( ( ',' ) )
            // InternalT5.g:4925:1: ( ',' )
            {
            // InternalT5.g:4925:1: ( ',' )
            // InternalT5.g:4926:2: ','
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
    // InternalT5.g:4935:1: rule__ComandoChamada__Group_2_1__1 : rule__ComandoChamada__Group_2_1__1__Impl ;
    public final void rule__ComandoChamada__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4939:1: ( rule__ComandoChamada__Group_2_1__1__Impl )
            // InternalT5.g:4940:2: rule__ComandoChamada__Group_2_1__1__Impl
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
    // InternalT5.g:4946:1: rule__ComandoChamada__Group_2_1__1__Impl : ( ( rule__ComandoChamada__ArgsAssignment_2_1_1 ) ) ;
    public final void rule__ComandoChamada__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4950:1: ( ( ( rule__ComandoChamada__ArgsAssignment_2_1_1 ) ) )
            // InternalT5.g:4951:1: ( ( rule__ComandoChamada__ArgsAssignment_2_1_1 ) )
            {
            // InternalT5.g:4951:1: ( ( rule__ComandoChamada__ArgsAssignment_2_1_1 ) )
            // InternalT5.g:4952:2: ( rule__ComandoChamada__ArgsAssignment_2_1_1 )
            {
             before(grammarAccess.getComandoChamadaAccess().getArgsAssignment_2_1_1()); 
            // InternalT5.g:4953:2: ( rule__ComandoChamada__ArgsAssignment_2_1_1 )
            // InternalT5.g:4953:3: rule__ComandoChamada__ArgsAssignment_2_1_1
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
    // InternalT5.g:4962:1: rule__ComandoRetorne__Group__0 : rule__ComandoRetorne__Group__0__Impl rule__ComandoRetorne__Group__1 ;
    public final void rule__ComandoRetorne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4966:1: ( rule__ComandoRetorne__Group__0__Impl rule__ComandoRetorne__Group__1 )
            // InternalT5.g:4967:2: rule__ComandoRetorne__Group__0__Impl rule__ComandoRetorne__Group__1
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
    // InternalT5.g:4974:1: rule__ComandoRetorne__Group__0__Impl : ( 'retorne' ) ;
    public final void rule__ComandoRetorne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4978:1: ( ( 'retorne' ) )
            // InternalT5.g:4979:1: ( 'retorne' )
            {
            // InternalT5.g:4979:1: ( 'retorne' )
            // InternalT5.g:4980:2: 'retorne'
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
    // InternalT5.g:4989:1: rule__ComandoRetorne__Group__1 : rule__ComandoRetorne__Group__1__Impl ;
    public final void rule__ComandoRetorne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:4993:1: ( rule__ComandoRetorne__Group__1__Impl )
            // InternalT5.g:4994:2: rule__ComandoRetorne__Group__1__Impl
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
    // InternalT5.g:5000:1: rule__ComandoRetorne__Group__1__Impl : ( ( rule__ComandoRetorne__ExpAssignment_1 ) ) ;
    public final void rule__ComandoRetorne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5004:1: ( ( ( rule__ComandoRetorne__ExpAssignment_1 ) ) )
            // InternalT5.g:5005:1: ( ( rule__ComandoRetorne__ExpAssignment_1 ) )
            {
            // InternalT5.g:5005:1: ( ( rule__ComandoRetorne__ExpAssignment_1 ) )
            // InternalT5.g:5006:2: ( rule__ComandoRetorne__ExpAssignment_1 )
            {
             before(grammarAccess.getComandoRetorneAccess().getExpAssignment_1()); 
            // InternalT5.g:5007:2: ( rule__ComandoRetorne__ExpAssignment_1 )
            // InternalT5.g:5007:3: rule__ComandoRetorne__ExpAssignment_1
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
    // InternalT5.g:5016:1: rule__Selecao__Group__0 : rule__Selecao__Group__0__Impl rule__Selecao__Group__1 ;
    public final void rule__Selecao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5020:1: ( rule__Selecao__Group__0__Impl rule__Selecao__Group__1 )
            // InternalT5.g:5021:2: rule__Selecao__Group__0__Impl rule__Selecao__Group__1
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
    // InternalT5.g:5028:1: rule__Selecao__Group__0__Impl : ( ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* ) ) ;
    public final void rule__Selecao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5032:1: ( ( ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* ) ) )
            // InternalT5.g:5033:1: ( ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* ) )
            {
            // InternalT5.g:5033:1: ( ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* ) )
            // InternalT5.g:5034:2: ( ( rule__Selecao__ItensAssignment_0 ) ) ( ( rule__Selecao__ItensAssignment_0 )* )
            {
            // InternalT5.g:5034:2: ( ( rule__Selecao__ItensAssignment_0 ) )
            // InternalT5.g:5035:3: ( rule__Selecao__ItensAssignment_0 )
            {
             before(grammarAccess.getSelecaoAccess().getItensAssignment_0()); 
            // InternalT5.g:5036:3: ( rule__Selecao__ItensAssignment_0 )
            // InternalT5.g:5036:4: rule__Selecao__ItensAssignment_0
            {
            pushFollow(FOLLOW_39);
            rule__Selecao__ItensAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelecaoAccess().getItensAssignment_0()); 

            }

            // InternalT5.g:5039:2: ( ( rule__Selecao__ItensAssignment_0 )* )
            // InternalT5.g:5040:3: ( rule__Selecao__ItensAssignment_0 )*
            {
             before(grammarAccess.getSelecaoAccess().getItensAssignment_0()); 
            // InternalT5.g:5041:3: ( rule__Selecao__ItensAssignment_0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==12) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalT5.g:5041:4: rule__Selecao__ItensAssignment_0
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
    // InternalT5.g:5050:1: rule__Selecao__Group__1 : rule__Selecao__Group__1__Impl rule__Selecao__Group__2 ;
    public final void rule__Selecao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5054:1: ( rule__Selecao__Group__1__Impl rule__Selecao__Group__2 )
            // InternalT5.g:5055:2: rule__Selecao__Group__1__Impl rule__Selecao__Group__2
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
    // InternalT5.g:5062:1: rule__Selecao__Group__1__Impl : ( ':' ) ;
    public final void rule__Selecao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5066:1: ( ( ':' ) )
            // InternalT5.g:5067:1: ( ':' )
            {
            // InternalT5.g:5067:1: ( ':' )
            // InternalT5.g:5068:2: ':'
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
    // InternalT5.g:5077:1: rule__Selecao__Group__2 : rule__Selecao__Group__2__Impl ;
    public final void rule__Selecao__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5081:1: ( rule__Selecao__Group__2__Impl )
            // InternalT5.g:5082:2: rule__Selecao__Group__2__Impl
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
    // InternalT5.g:5088:1: rule__Selecao__Group__2__Impl : ( ( rule__Selecao__ComandosAssignment_2 )* ) ;
    public final void rule__Selecao__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5092:1: ( ( ( rule__Selecao__ComandosAssignment_2 )* ) )
            // InternalT5.g:5093:1: ( ( rule__Selecao__ComandosAssignment_2 )* )
            {
            // InternalT5.g:5093:1: ( ( rule__Selecao__ComandosAssignment_2 )* )
            // InternalT5.g:5094:2: ( rule__Selecao__ComandosAssignment_2 )*
            {
             before(grammarAccess.getSelecaoAccess().getComandosAssignment_2()); 
            // InternalT5.g:5095:2: ( rule__Selecao__ComandosAssignment_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||LA44_0==49||(LA44_0>=51 && LA44_0<=53)||LA44_0==57||LA44_0==60||LA44_0==63||LA44_0==65||LA44_0==67) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalT5.g:5095:3: rule__Selecao__ComandosAssignment_2
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
    // InternalT5.g:5104:1: rule__ItemSelecao__Group__0 : rule__ItemSelecao__Group__0__Impl rule__ItemSelecao__Group__1 ;
    public final void rule__ItemSelecao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5108:1: ( rule__ItemSelecao__Group__0__Impl rule__ItemSelecao__Group__1 )
            // InternalT5.g:5109:2: rule__ItemSelecao__Group__0__Impl rule__ItemSelecao__Group__1
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
    // InternalT5.g:5116:1: rule__ItemSelecao__Group__0__Impl : ( ( rule__ItemSelecao__FaixasAssignment_0 ) ) ;
    public final void rule__ItemSelecao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5120:1: ( ( ( rule__ItemSelecao__FaixasAssignment_0 ) ) )
            // InternalT5.g:5121:1: ( ( rule__ItemSelecao__FaixasAssignment_0 ) )
            {
            // InternalT5.g:5121:1: ( ( rule__ItemSelecao__FaixasAssignment_0 ) )
            // InternalT5.g:5122:2: ( rule__ItemSelecao__FaixasAssignment_0 )
            {
             before(grammarAccess.getItemSelecaoAccess().getFaixasAssignment_0()); 
            // InternalT5.g:5123:2: ( rule__ItemSelecao__FaixasAssignment_0 )
            // InternalT5.g:5123:3: rule__ItemSelecao__FaixasAssignment_0
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
    // InternalT5.g:5131:1: rule__ItemSelecao__Group__1 : rule__ItemSelecao__Group__1__Impl ;
    public final void rule__ItemSelecao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5135:1: ( rule__ItemSelecao__Group__1__Impl )
            // InternalT5.g:5136:2: rule__ItemSelecao__Group__1__Impl
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
    // InternalT5.g:5142:1: rule__ItemSelecao__Group__1__Impl : ( ( rule__ItemSelecao__Group_1__0 )* ) ;
    public final void rule__ItemSelecao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5146:1: ( ( ( rule__ItemSelecao__Group_1__0 )* ) )
            // InternalT5.g:5147:1: ( ( rule__ItemSelecao__Group_1__0 )* )
            {
            // InternalT5.g:5147:1: ( ( rule__ItemSelecao__Group_1__0 )* )
            // InternalT5.g:5148:2: ( rule__ItemSelecao__Group_1__0 )*
            {
             before(grammarAccess.getItemSelecaoAccess().getGroup_1()); 
            // InternalT5.g:5149:2: ( rule__ItemSelecao__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==34) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalT5.g:5149:3: rule__ItemSelecao__Group_1__0
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
    // InternalT5.g:5158:1: rule__ItemSelecao__Group_1__0 : rule__ItemSelecao__Group_1__0__Impl rule__ItemSelecao__Group_1__1 ;
    public final void rule__ItemSelecao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5162:1: ( rule__ItemSelecao__Group_1__0__Impl rule__ItemSelecao__Group_1__1 )
            // InternalT5.g:5163:2: rule__ItemSelecao__Group_1__0__Impl rule__ItemSelecao__Group_1__1
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
    // InternalT5.g:5170:1: rule__ItemSelecao__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ItemSelecao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5174:1: ( ( ',' ) )
            // InternalT5.g:5175:1: ( ',' )
            {
            // InternalT5.g:5175:1: ( ',' )
            // InternalT5.g:5176:2: ','
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
    // InternalT5.g:5185:1: rule__ItemSelecao__Group_1__1 : rule__ItemSelecao__Group_1__1__Impl ;
    public final void rule__ItemSelecao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5189:1: ( rule__ItemSelecao__Group_1__1__Impl )
            // InternalT5.g:5190:2: rule__ItemSelecao__Group_1__1__Impl
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
    // InternalT5.g:5196:1: rule__ItemSelecao__Group_1__1__Impl : ( ( rule__ItemSelecao__FaixasAssignment_1_1 ) ) ;
    public final void rule__ItemSelecao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5200:1: ( ( ( rule__ItemSelecao__FaixasAssignment_1_1 ) ) )
            // InternalT5.g:5201:1: ( ( rule__ItemSelecao__FaixasAssignment_1_1 ) )
            {
            // InternalT5.g:5201:1: ( ( rule__ItemSelecao__FaixasAssignment_1_1 ) )
            // InternalT5.g:5202:2: ( rule__ItemSelecao__FaixasAssignment_1_1 )
            {
             before(grammarAccess.getItemSelecaoAccess().getFaixasAssignment_1_1()); 
            // InternalT5.g:5203:2: ( rule__ItemSelecao__FaixasAssignment_1_1 )
            // InternalT5.g:5203:3: rule__ItemSelecao__FaixasAssignment_1_1
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
    // InternalT5.g:5212:1: rule__NumeroIntervalo__Group__0 : rule__NumeroIntervalo__Group__0__Impl rule__NumeroIntervalo__Group__1 ;
    public final void rule__NumeroIntervalo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5216:1: ( rule__NumeroIntervalo__Group__0__Impl rule__NumeroIntervalo__Group__1 )
            // InternalT5.g:5217:2: rule__NumeroIntervalo__Group__0__Impl rule__NumeroIntervalo__Group__1
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
    // InternalT5.g:5224:1: rule__NumeroIntervalo__Group__0__Impl : ( ( rule__NumeroIntervalo__SinalAssignment_0 ) ) ;
    public final void rule__NumeroIntervalo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5228:1: ( ( ( rule__NumeroIntervalo__SinalAssignment_0 ) ) )
            // InternalT5.g:5229:1: ( ( rule__NumeroIntervalo__SinalAssignment_0 ) )
            {
            // InternalT5.g:5229:1: ( ( rule__NumeroIntervalo__SinalAssignment_0 ) )
            // InternalT5.g:5230:2: ( rule__NumeroIntervalo__SinalAssignment_0 )
            {
             before(grammarAccess.getNumeroIntervaloAccess().getSinalAssignment_0()); 
            // InternalT5.g:5231:2: ( rule__NumeroIntervalo__SinalAssignment_0 )
            // InternalT5.g:5231:3: rule__NumeroIntervalo__SinalAssignment_0
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
    // InternalT5.g:5239:1: rule__NumeroIntervalo__Group__1 : rule__NumeroIntervalo__Group__1__Impl rule__NumeroIntervalo__Group__2 ;
    public final void rule__NumeroIntervalo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5243:1: ( rule__NumeroIntervalo__Group__1__Impl rule__NumeroIntervalo__Group__2 )
            // InternalT5.g:5244:2: rule__NumeroIntervalo__Group__1__Impl rule__NumeroIntervalo__Group__2
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
    // InternalT5.g:5251:1: rule__NumeroIntervalo__Group__1__Impl : ( ( rule__NumeroIntervalo__StartAssignment_1 ) ) ;
    public final void rule__NumeroIntervalo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5255:1: ( ( ( rule__NumeroIntervalo__StartAssignment_1 ) ) )
            // InternalT5.g:5256:1: ( ( rule__NumeroIntervalo__StartAssignment_1 ) )
            {
            // InternalT5.g:5256:1: ( ( rule__NumeroIntervalo__StartAssignment_1 ) )
            // InternalT5.g:5257:2: ( rule__NumeroIntervalo__StartAssignment_1 )
            {
             before(grammarAccess.getNumeroIntervaloAccess().getStartAssignment_1()); 
            // InternalT5.g:5258:2: ( rule__NumeroIntervalo__StartAssignment_1 )
            // InternalT5.g:5258:3: rule__NumeroIntervalo__StartAssignment_1
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
    // InternalT5.g:5266:1: rule__NumeroIntervalo__Group__2 : rule__NumeroIntervalo__Group__2__Impl ;
    public final void rule__NumeroIntervalo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5270:1: ( rule__NumeroIntervalo__Group__2__Impl )
            // InternalT5.g:5271:2: rule__NumeroIntervalo__Group__2__Impl
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
    // InternalT5.g:5277:1: rule__NumeroIntervalo__Group__2__Impl : ( ( rule__NumeroIntervalo__Group_2__0 )? ) ;
    public final void rule__NumeroIntervalo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5281:1: ( ( ( rule__NumeroIntervalo__Group_2__0 )? ) )
            // InternalT5.g:5282:1: ( ( rule__NumeroIntervalo__Group_2__0 )? )
            {
            // InternalT5.g:5282:1: ( ( rule__NumeroIntervalo__Group_2__0 )? )
            // InternalT5.g:5283:2: ( rule__NumeroIntervalo__Group_2__0 )?
            {
             before(grammarAccess.getNumeroIntervaloAccess().getGroup_2()); 
            // InternalT5.g:5284:2: ( rule__NumeroIntervalo__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalT5.g:5284:3: rule__NumeroIntervalo__Group_2__0
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
    // InternalT5.g:5293:1: rule__NumeroIntervalo__Group_2__0 : rule__NumeroIntervalo__Group_2__0__Impl rule__NumeroIntervalo__Group_2__1 ;
    public final void rule__NumeroIntervalo__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5297:1: ( rule__NumeroIntervalo__Group_2__0__Impl rule__NumeroIntervalo__Group_2__1 )
            // InternalT5.g:5298:2: rule__NumeroIntervalo__Group_2__0__Impl rule__NumeroIntervalo__Group_2__1
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
    // InternalT5.g:5305:1: rule__NumeroIntervalo__Group_2__0__Impl : ( '..' ) ;
    public final void rule__NumeroIntervalo__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5309:1: ( ( '..' ) )
            // InternalT5.g:5310:1: ( '..' )
            {
            // InternalT5.g:5310:1: ( '..' )
            // InternalT5.g:5311:2: '..'
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
    // InternalT5.g:5320:1: rule__NumeroIntervalo__Group_2__1 : rule__NumeroIntervalo__Group_2__1__Impl ;
    public final void rule__NumeroIntervalo__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5324:1: ( rule__NumeroIntervalo__Group_2__1__Impl )
            // InternalT5.g:5325:2: rule__NumeroIntervalo__Group_2__1__Impl
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
    // InternalT5.g:5331:1: rule__NumeroIntervalo__Group_2__1__Impl : ( ( rule__NumeroIntervalo__EndAssignment_2_1 ) ) ;
    public final void rule__NumeroIntervalo__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5335:1: ( ( ( rule__NumeroIntervalo__EndAssignment_2_1 ) ) )
            // InternalT5.g:5336:1: ( ( rule__NumeroIntervalo__EndAssignment_2_1 ) )
            {
            // InternalT5.g:5336:1: ( ( rule__NumeroIntervalo__EndAssignment_2_1 ) )
            // InternalT5.g:5337:2: ( rule__NumeroIntervalo__EndAssignment_2_1 )
            {
             before(grammarAccess.getNumeroIntervaloAccess().getEndAssignment_2_1()); 
            // InternalT5.g:5338:2: ( rule__NumeroIntervalo__EndAssignment_2_1 )
            // InternalT5.g:5338:3: rule__NumeroIntervalo__EndAssignment_2_1
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
    // InternalT5.g:5347:1: rule__ExpressaoAritmetica__Group__0 : rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1 ;
    public final void rule__ExpressaoAritmetica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5351:1: ( rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1 )
            // InternalT5.g:5352:2: rule__ExpressaoAritmetica__Group__0__Impl rule__ExpressaoAritmetica__Group__1
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
    // InternalT5.g:5359:1: rule__ExpressaoAritmetica__Group__0__Impl : ( ( rule__ExpressaoAritmetica__TermosAssignment_0 ) ) ;
    public final void rule__ExpressaoAritmetica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5363:1: ( ( ( rule__ExpressaoAritmetica__TermosAssignment_0 ) ) )
            // InternalT5.g:5364:1: ( ( rule__ExpressaoAritmetica__TermosAssignment_0 ) )
            {
            // InternalT5.g:5364:1: ( ( rule__ExpressaoAritmetica__TermosAssignment_0 ) )
            // InternalT5.g:5365:2: ( rule__ExpressaoAritmetica__TermosAssignment_0 )
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getTermosAssignment_0()); 
            // InternalT5.g:5366:2: ( rule__ExpressaoAritmetica__TermosAssignment_0 )
            // InternalT5.g:5366:3: rule__ExpressaoAritmetica__TermosAssignment_0
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
    // InternalT5.g:5374:1: rule__ExpressaoAritmetica__Group__1 : rule__ExpressaoAritmetica__Group__1__Impl ;
    public final void rule__ExpressaoAritmetica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5378:1: ( rule__ExpressaoAritmetica__Group__1__Impl )
            // InternalT5.g:5379:2: rule__ExpressaoAritmetica__Group__1__Impl
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
    // InternalT5.g:5385:1: rule__ExpressaoAritmetica__Group__1__Impl : ( ( rule__ExpressaoAritmetica__OutrosAssignment_1 )* ) ;
    public final void rule__ExpressaoAritmetica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5389:1: ( ( ( rule__ExpressaoAritmetica__OutrosAssignment_1 )* ) )
            // InternalT5.g:5390:1: ( ( rule__ExpressaoAritmetica__OutrosAssignment_1 )* )
            {
            // InternalT5.g:5390:1: ( ( rule__ExpressaoAritmetica__OutrosAssignment_1 )* )
            // InternalT5.g:5391:2: ( rule__ExpressaoAritmetica__OutrosAssignment_1 )*
            {
             before(grammarAccess.getExpressaoAritmeticaAccess().getOutrosAssignment_1()); 
            // InternalT5.g:5392:2: ( rule__ExpressaoAritmetica__OutrosAssignment_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==12) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==RULE_INT) ) {
                        switch ( input.LA(3) ) {
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
            	    // InternalT5.g:5392:3: rule__ExpressaoAritmetica__OutrosAssignment_1
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
    // InternalT5.g:5401:1: rule__OutroTermoAritmetico__Group__0 : rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1 ;
    public final void rule__OutroTermoAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5405:1: ( rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1 )
            // InternalT5.g:5406:2: rule__OutroTermoAritmetico__Group__0__Impl rule__OutroTermoAritmetico__Group__1
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
    // InternalT5.g:5413:1: rule__OutroTermoAritmetico__Group__0__Impl : ( ( rule__OutroTermoAritmetico__OpAssignment_0 ) ) ;
    public final void rule__OutroTermoAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5417:1: ( ( ( rule__OutroTermoAritmetico__OpAssignment_0 ) ) )
            // InternalT5.g:5418:1: ( ( rule__OutroTermoAritmetico__OpAssignment_0 ) )
            {
            // InternalT5.g:5418:1: ( ( rule__OutroTermoAritmetico__OpAssignment_0 ) )
            // InternalT5.g:5419:2: ( rule__OutroTermoAritmetico__OpAssignment_0 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getOpAssignment_0()); 
            // InternalT5.g:5420:2: ( rule__OutroTermoAritmetico__OpAssignment_0 )
            // InternalT5.g:5420:3: rule__OutroTermoAritmetico__OpAssignment_0
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
    // InternalT5.g:5428:1: rule__OutroTermoAritmetico__Group__1 : rule__OutroTermoAritmetico__Group__1__Impl ;
    public final void rule__OutroTermoAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5432:1: ( rule__OutroTermoAritmetico__Group__1__Impl )
            // InternalT5.g:5433:2: rule__OutroTermoAritmetico__Group__1__Impl
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
    // InternalT5.g:5439:1: rule__OutroTermoAritmetico__Group__1__Impl : ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) ) ;
    public final void rule__OutroTermoAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5443:1: ( ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) ) )
            // InternalT5.g:5444:1: ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) )
            {
            // InternalT5.g:5444:1: ( ( rule__OutroTermoAritmetico__TermoAssignment_1 ) )
            // InternalT5.g:5445:2: ( rule__OutroTermoAritmetico__TermoAssignment_1 )
            {
             before(grammarAccess.getOutroTermoAritmeticoAccess().getTermoAssignment_1()); 
            // InternalT5.g:5446:2: ( rule__OutroTermoAritmetico__TermoAssignment_1 )
            // InternalT5.g:5446:3: rule__OutroTermoAritmetico__TermoAssignment_1
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
    // InternalT5.g:5455:1: rule__TermoAritmetico__Group__0 : rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1 ;
    public final void rule__TermoAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5459:1: ( rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1 )
            // InternalT5.g:5460:2: rule__TermoAritmetico__Group__0__Impl rule__TermoAritmetico__Group__1
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
    // InternalT5.g:5467:1: rule__TermoAritmetico__Group__0__Impl : ( ( rule__TermoAritmetico__FatoresAssignment_0 ) ) ;
    public final void rule__TermoAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5471:1: ( ( ( rule__TermoAritmetico__FatoresAssignment_0 ) ) )
            // InternalT5.g:5472:1: ( ( rule__TermoAritmetico__FatoresAssignment_0 ) )
            {
            // InternalT5.g:5472:1: ( ( rule__TermoAritmetico__FatoresAssignment_0 ) )
            // InternalT5.g:5473:2: ( rule__TermoAritmetico__FatoresAssignment_0 )
            {
             before(grammarAccess.getTermoAritmeticoAccess().getFatoresAssignment_0()); 
            // InternalT5.g:5474:2: ( rule__TermoAritmetico__FatoresAssignment_0 )
            // InternalT5.g:5474:3: rule__TermoAritmetico__FatoresAssignment_0
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
    // InternalT5.g:5482:1: rule__TermoAritmetico__Group__1 : rule__TermoAritmetico__Group__1__Impl ;
    public final void rule__TermoAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5486:1: ( rule__TermoAritmetico__Group__1__Impl )
            // InternalT5.g:5487:2: rule__TermoAritmetico__Group__1__Impl
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
    // InternalT5.g:5493:1: rule__TermoAritmetico__Group__1__Impl : ( ( rule__TermoAritmetico__OutrosAssignment_1 )* ) ;
    public final void rule__TermoAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5497:1: ( ( ( rule__TermoAritmetico__OutrosAssignment_1 )* ) )
            // InternalT5.g:5498:1: ( ( rule__TermoAritmetico__OutrosAssignment_1 )* )
            {
            // InternalT5.g:5498:1: ( ( rule__TermoAritmetico__OutrosAssignment_1 )* )
            // InternalT5.g:5499:2: ( rule__TermoAritmetico__OutrosAssignment_1 )*
            {
             before(grammarAccess.getTermoAritmeticoAccess().getOutrosAssignment_1()); 
            // InternalT5.g:5500:2: ( rule__TermoAritmetico__OutrosAssignment_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=20 && LA48_0<=21)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalT5.g:5500:3: rule__TermoAritmetico__OutrosAssignment_1
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
    // InternalT5.g:5509:1: rule__OutroFatorAritmetico__Group__0 : rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1 ;
    public final void rule__OutroFatorAritmetico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5513:1: ( rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1 )
            // InternalT5.g:5514:2: rule__OutroFatorAritmetico__Group__0__Impl rule__OutroFatorAritmetico__Group__1
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
    // InternalT5.g:5521:1: rule__OutroFatorAritmetico__Group__0__Impl : ( ( rule__OutroFatorAritmetico__OpAssignment_0 ) ) ;
    public final void rule__OutroFatorAritmetico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5525:1: ( ( ( rule__OutroFatorAritmetico__OpAssignment_0 ) ) )
            // InternalT5.g:5526:1: ( ( rule__OutroFatorAritmetico__OpAssignment_0 ) )
            {
            // InternalT5.g:5526:1: ( ( rule__OutroFatorAritmetico__OpAssignment_0 ) )
            // InternalT5.g:5527:2: ( rule__OutroFatorAritmetico__OpAssignment_0 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getOpAssignment_0()); 
            // InternalT5.g:5528:2: ( rule__OutroFatorAritmetico__OpAssignment_0 )
            // InternalT5.g:5528:3: rule__OutroFatorAritmetico__OpAssignment_0
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
    // InternalT5.g:5536:1: rule__OutroFatorAritmetico__Group__1 : rule__OutroFatorAritmetico__Group__1__Impl ;
    public final void rule__OutroFatorAritmetico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5540:1: ( rule__OutroFatorAritmetico__Group__1__Impl )
            // InternalT5.g:5541:2: rule__OutroFatorAritmetico__Group__1__Impl
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
    // InternalT5.g:5547:1: rule__OutroFatorAritmetico__Group__1__Impl : ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) ) ;
    public final void rule__OutroFatorAritmetico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5551:1: ( ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) ) )
            // InternalT5.g:5552:1: ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) )
            {
            // InternalT5.g:5552:1: ( ( rule__OutroFatorAritmetico__FatorAssignment_1 ) )
            // InternalT5.g:5553:2: ( rule__OutroFatorAritmetico__FatorAssignment_1 )
            {
             before(grammarAccess.getOutroFatorAritmeticoAccess().getFatorAssignment_1()); 
            // InternalT5.g:5554:2: ( rule__OutroFatorAritmetico__FatorAssignment_1 )
            // InternalT5.g:5554:3: rule__OutroFatorAritmetico__FatorAssignment_1
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
    // InternalT5.g:5563:1: rule__FatorAritmetico__Group_0__0 : rule__FatorAritmetico__Group_0__0__Impl rule__FatorAritmetico__Group_0__1 ;
    public final void rule__FatorAritmetico__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5567:1: ( rule__FatorAritmetico__Group_0__0__Impl rule__FatorAritmetico__Group_0__1 )
            // InternalT5.g:5568:2: rule__FatorAritmetico__Group_0__0__Impl rule__FatorAritmetico__Group_0__1
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
    // InternalT5.g:5575:1: rule__FatorAritmetico__Group_0__0__Impl : ( ( '^' )? ) ;
    public final void rule__FatorAritmetico__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5579:1: ( ( ( '^' )? ) )
            // InternalT5.g:5580:1: ( ( '^' )? )
            {
            // InternalT5.g:5580:1: ( ( '^' )? )
            // InternalT5.g:5581:2: ( '^' )?
            {
             before(grammarAccess.getFatorAritmeticoAccess().getCircumflexAccentKeyword_0_0()); 
            // InternalT5.g:5582:2: ( '^' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==49) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalT5.g:5582:3: '^'
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
    // InternalT5.g:5590:1: rule__FatorAritmetico__Group_0__1 : rule__FatorAritmetico__Group_0__1__Impl ;
    public final void rule__FatorAritmetico__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5594:1: ( rule__FatorAritmetico__Group_0__1__Impl )
            // InternalT5.g:5595:2: rule__FatorAritmetico__Group_0__1__Impl
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
    // InternalT5.g:5601:1: rule__FatorAritmetico__Group_0__1__Impl : ( ( rule__FatorAritmetico__RefAssignment_0_1 ) ) ;
    public final void rule__FatorAritmetico__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5605:1: ( ( ( rule__FatorAritmetico__RefAssignment_0_1 ) ) )
            // InternalT5.g:5606:1: ( ( rule__FatorAritmetico__RefAssignment_0_1 ) )
            {
            // InternalT5.g:5606:1: ( ( rule__FatorAritmetico__RefAssignment_0_1 ) )
            // InternalT5.g:5607:2: ( rule__FatorAritmetico__RefAssignment_0_1 )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getRefAssignment_0_1()); 
            // InternalT5.g:5608:2: ( rule__FatorAritmetico__RefAssignment_0_1 )
            // InternalT5.g:5608:3: rule__FatorAritmetico__RefAssignment_0_1
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
    // InternalT5.g:5617:1: rule__FatorAritmetico__Group_3__0 : rule__FatorAritmetico__Group_3__0__Impl rule__FatorAritmetico__Group_3__1 ;
    public final void rule__FatorAritmetico__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5621:1: ( rule__FatorAritmetico__Group_3__0__Impl rule__FatorAritmetico__Group_3__1 )
            // InternalT5.g:5622:2: rule__FatorAritmetico__Group_3__0__Impl rule__FatorAritmetico__Group_3__1
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
    // InternalT5.g:5629:1: rule__FatorAritmetico__Group_3__0__Impl : ( '(' ) ;
    public final void rule__FatorAritmetico__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5633:1: ( ( '(' ) )
            // InternalT5.g:5634:1: ( '(' )
            {
            // InternalT5.g:5634:1: ( '(' )
            // InternalT5.g:5635:2: '('
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
    // InternalT5.g:5644:1: rule__FatorAritmetico__Group_3__1 : rule__FatorAritmetico__Group_3__1__Impl rule__FatorAritmetico__Group_3__2 ;
    public final void rule__FatorAritmetico__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5648:1: ( rule__FatorAritmetico__Group_3__1__Impl rule__FatorAritmetico__Group_3__2 )
            // InternalT5.g:5649:2: rule__FatorAritmetico__Group_3__1__Impl rule__FatorAritmetico__Group_3__2
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
    // InternalT5.g:5656:1: rule__FatorAritmetico__Group_3__1__Impl : ( ( rule__FatorAritmetico__ExpAssignment_3_1 ) ) ;
    public final void rule__FatorAritmetico__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5660:1: ( ( ( rule__FatorAritmetico__ExpAssignment_3_1 ) ) )
            // InternalT5.g:5661:1: ( ( rule__FatorAritmetico__ExpAssignment_3_1 ) )
            {
            // InternalT5.g:5661:1: ( ( rule__FatorAritmetico__ExpAssignment_3_1 ) )
            // InternalT5.g:5662:2: ( rule__FatorAritmetico__ExpAssignment_3_1 )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getExpAssignment_3_1()); 
            // InternalT5.g:5663:2: ( rule__FatorAritmetico__ExpAssignment_3_1 )
            // InternalT5.g:5663:3: rule__FatorAritmetico__ExpAssignment_3_1
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
    // InternalT5.g:5671:1: rule__FatorAritmetico__Group_3__2 : rule__FatorAritmetico__Group_3__2__Impl ;
    public final void rule__FatorAritmetico__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5675:1: ( rule__FatorAritmetico__Group_3__2__Impl )
            // InternalT5.g:5676:2: rule__FatorAritmetico__Group_3__2__Impl
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
    // InternalT5.g:5682:1: rule__FatorAritmetico__Group_3__2__Impl : ( ')' ) ;
    public final void rule__FatorAritmetico__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5686:1: ( ( ')' ) )
            // InternalT5.g:5687:1: ( ')' )
            {
            // InternalT5.g:5687:1: ( ')' )
            // InternalT5.g:5688:2: ')'
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
    // InternalT5.g:5698:1: rule__Expressao__Group__0 : rule__Expressao__Group__0__Impl rule__Expressao__Group__1 ;
    public final void rule__Expressao__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5702:1: ( rule__Expressao__Group__0__Impl rule__Expressao__Group__1 )
            // InternalT5.g:5703:2: rule__Expressao__Group__0__Impl rule__Expressao__Group__1
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
    // InternalT5.g:5710:1: rule__Expressao__Group__0__Impl : ( ( rule__Expressao__LogicosAssignment_0 ) ) ;
    public final void rule__Expressao__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5714:1: ( ( ( rule__Expressao__LogicosAssignment_0 ) ) )
            // InternalT5.g:5715:1: ( ( rule__Expressao__LogicosAssignment_0 ) )
            {
            // InternalT5.g:5715:1: ( ( rule__Expressao__LogicosAssignment_0 ) )
            // InternalT5.g:5716:2: ( rule__Expressao__LogicosAssignment_0 )
            {
             before(grammarAccess.getExpressaoAccess().getLogicosAssignment_0()); 
            // InternalT5.g:5717:2: ( rule__Expressao__LogicosAssignment_0 )
            // InternalT5.g:5717:3: rule__Expressao__LogicosAssignment_0
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
    // InternalT5.g:5725:1: rule__Expressao__Group__1 : rule__Expressao__Group__1__Impl ;
    public final void rule__Expressao__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5729:1: ( rule__Expressao__Group__1__Impl )
            // InternalT5.g:5730:2: rule__Expressao__Group__1__Impl
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
    // InternalT5.g:5736:1: rule__Expressao__Group__1__Impl : ( ( rule__Expressao__Group_1__0 )* ) ;
    public final void rule__Expressao__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5740:1: ( ( ( rule__Expressao__Group_1__0 )* ) )
            // InternalT5.g:5741:1: ( ( rule__Expressao__Group_1__0 )* )
            {
            // InternalT5.g:5741:1: ( ( rule__Expressao__Group_1__0 )* )
            // InternalT5.g:5742:2: ( rule__Expressao__Group_1__0 )*
            {
             before(grammarAccess.getExpressaoAccess().getGroup_1()); 
            // InternalT5.g:5743:2: ( rule__Expressao__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=28 && LA50_0<=29)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalT5.g:5743:3: rule__Expressao__Group_1__0
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
    // InternalT5.g:5752:1: rule__Expressao__Group_1__0 : rule__Expressao__Group_1__0__Impl rule__Expressao__Group_1__1 ;
    public final void rule__Expressao__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5756:1: ( rule__Expressao__Group_1__0__Impl rule__Expressao__Group_1__1 )
            // InternalT5.g:5757:2: rule__Expressao__Group_1__0__Impl rule__Expressao__Group_1__1
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
    // InternalT5.g:5764:1: rule__Expressao__Group_1__0__Impl : ( ( rule__Expressao__OpAssignment_1_0 ) ) ;
    public final void rule__Expressao__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5768:1: ( ( ( rule__Expressao__OpAssignment_1_0 ) ) )
            // InternalT5.g:5769:1: ( ( rule__Expressao__OpAssignment_1_0 ) )
            {
            // InternalT5.g:5769:1: ( ( rule__Expressao__OpAssignment_1_0 ) )
            // InternalT5.g:5770:2: ( rule__Expressao__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressaoAccess().getOpAssignment_1_0()); 
            // InternalT5.g:5771:2: ( rule__Expressao__OpAssignment_1_0 )
            // InternalT5.g:5771:3: rule__Expressao__OpAssignment_1_0
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
    // InternalT5.g:5779:1: rule__Expressao__Group_1__1 : rule__Expressao__Group_1__1__Impl ;
    public final void rule__Expressao__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5783:1: ( rule__Expressao__Group_1__1__Impl )
            // InternalT5.g:5784:2: rule__Expressao__Group_1__1__Impl
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
    // InternalT5.g:5790:1: rule__Expressao__Group_1__1__Impl : ( ( rule__Expressao__LogicosAssignment_1_1 ) ) ;
    public final void rule__Expressao__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5794:1: ( ( ( rule__Expressao__LogicosAssignment_1_1 ) ) )
            // InternalT5.g:5795:1: ( ( rule__Expressao__LogicosAssignment_1_1 ) )
            {
            // InternalT5.g:5795:1: ( ( rule__Expressao__LogicosAssignment_1_1 ) )
            // InternalT5.g:5796:2: ( rule__Expressao__LogicosAssignment_1_1 )
            {
             before(grammarAccess.getExpressaoAccess().getLogicosAssignment_1_1()); 
            // InternalT5.g:5797:2: ( rule__Expressao__LogicosAssignment_1_1 )
            // InternalT5.g:5797:3: rule__Expressao__LogicosAssignment_1_1
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
    // InternalT5.g:5806:1: rule__TermoLogico__Group__0 : rule__TermoLogico__Group__0__Impl rule__TermoLogico__Group__1 ;
    public final void rule__TermoLogico__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5810:1: ( rule__TermoLogico__Group__0__Impl rule__TermoLogico__Group__1 )
            // InternalT5.g:5811:2: rule__TermoLogico__Group__0__Impl rule__TermoLogico__Group__1
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
    // InternalT5.g:5818:1: rule__TermoLogico__Group__0__Impl : ( ( 'nao' )? ) ;
    public final void rule__TermoLogico__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5822:1: ( ( ( 'nao' )? ) )
            // InternalT5.g:5823:1: ( ( 'nao' )? )
            {
            // InternalT5.g:5823:1: ( ( 'nao' )? )
            // InternalT5.g:5824:2: ( 'nao' )?
            {
             before(grammarAccess.getTermoLogicoAccess().getNaoKeyword_0()); 
            // InternalT5.g:5825:2: ( 'nao' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==69) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalT5.g:5825:3: 'nao'
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
    // InternalT5.g:5833:1: rule__TermoLogico__Group__1 : rule__TermoLogico__Group__1__Impl ;
    public final void rule__TermoLogico__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5837:1: ( rule__TermoLogico__Group__1__Impl )
            // InternalT5.g:5838:2: rule__TermoLogico__Group__1__Impl
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
    // InternalT5.g:5844:1: rule__TermoLogico__Group__1__Impl : ( ( rule__TermoLogico__RelAssignment_1 ) ) ;
    public final void rule__TermoLogico__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5848:1: ( ( ( rule__TermoLogico__RelAssignment_1 ) ) )
            // InternalT5.g:5849:1: ( ( rule__TermoLogico__RelAssignment_1 ) )
            {
            // InternalT5.g:5849:1: ( ( rule__TermoLogico__RelAssignment_1 ) )
            // InternalT5.g:5850:2: ( rule__TermoLogico__RelAssignment_1 )
            {
             before(grammarAccess.getTermoLogicoAccess().getRelAssignment_1()); 
            // InternalT5.g:5851:2: ( rule__TermoLogico__RelAssignment_1 )
            // InternalT5.g:5851:3: rule__TermoLogico__RelAssignment_1
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
    // InternalT5.g:5860:1: rule__ExpressaoRelacional__Group__0 : rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1 ;
    public final void rule__ExpressaoRelacional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5864:1: ( rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1 )
            // InternalT5.g:5865:2: rule__ExpressaoRelacional__Group__0__Impl rule__ExpressaoRelacional__Group__1
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
    // InternalT5.g:5872:1: rule__ExpressaoRelacional__Group__0__Impl : ( ( rule__ExpressaoRelacional__LeftAssignment_0 ) ) ;
    public final void rule__ExpressaoRelacional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5876:1: ( ( ( rule__ExpressaoRelacional__LeftAssignment_0 ) ) )
            // InternalT5.g:5877:1: ( ( rule__ExpressaoRelacional__LeftAssignment_0 ) )
            {
            // InternalT5.g:5877:1: ( ( rule__ExpressaoRelacional__LeftAssignment_0 ) )
            // InternalT5.g:5878:2: ( rule__ExpressaoRelacional__LeftAssignment_0 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getLeftAssignment_0()); 
            // InternalT5.g:5879:2: ( rule__ExpressaoRelacional__LeftAssignment_0 )
            // InternalT5.g:5879:3: rule__ExpressaoRelacional__LeftAssignment_0
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
    // InternalT5.g:5887:1: rule__ExpressaoRelacional__Group__1 : rule__ExpressaoRelacional__Group__1__Impl ;
    public final void rule__ExpressaoRelacional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5891:1: ( rule__ExpressaoRelacional__Group__1__Impl )
            // InternalT5.g:5892:2: rule__ExpressaoRelacional__Group__1__Impl
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
    // InternalT5.g:5898:1: rule__ExpressaoRelacional__Group__1__Impl : ( ( rule__ExpressaoRelacional__Group_1__0 )? ) ;
    public final void rule__ExpressaoRelacional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5902:1: ( ( ( rule__ExpressaoRelacional__Group_1__0 )? ) )
            // InternalT5.g:5903:1: ( ( rule__ExpressaoRelacional__Group_1__0 )? )
            {
            // InternalT5.g:5903:1: ( ( rule__ExpressaoRelacional__Group_1__0 )? )
            // InternalT5.g:5904:2: ( rule__ExpressaoRelacional__Group_1__0 )?
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getGroup_1()); 
            // InternalT5.g:5905:2: ( rule__ExpressaoRelacional__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=22 && LA52_0<=27)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalT5.g:5905:3: rule__ExpressaoRelacional__Group_1__0
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
    // InternalT5.g:5914:1: rule__ExpressaoRelacional__Group_1__0 : rule__ExpressaoRelacional__Group_1__0__Impl rule__ExpressaoRelacional__Group_1__1 ;
    public final void rule__ExpressaoRelacional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5918:1: ( rule__ExpressaoRelacional__Group_1__0__Impl rule__ExpressaoRelacional__Group_1__1 )
            // InternalT5.g:5919:2: rule__ExpressaoRelacional__Group_1__0__Impl rule__ExpressaoRelacional__Group_1__1
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
    // InternalT5.g:5926:1: rule__ExpressaoRelacional__Group_1__0__Impl : ( ( rule__ExpressaoRelacional__OpAssignment_1_0 ) ) ;
    public final void rule__ExpressaoRelacional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5930:1: ( ( ( rule__ExpressaoRelacional__OpAssignment_1_0 ) ) )
            // InternalT5.g:5931:1: ( ( rule__ExpressaoRelacional__OpAssignment_1_0 ) )
            {
            // InternalT5.g:5931:1: ( ( rule__ExpressaoRelacional__OpAssignment_1_0 ) )
            // InternalT5.g:5932:2: ( rule__ExpressaoRelacional__OpAssignment_1_0 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getOpAssignment_1_0()); 
            // InternalT5.g:5933:2: ( rule__ExpressaoRelacional__OpAssignment_1_0 )
            // InternalT5.g:5933:3: rule__ExpressaoRelacional__OpAssignment_1_0
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
    // InternalT5.g:5941:1: rule__ExpressaoRelacional__Group_1__1 : rule__ExpressaoRelacional__Group_1__1__Impl ;
    public final void rule__ExpressaoRelacional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5945:1: ( rule__ExpressaoRelacional__Group_1__1__Impl )
            // InternalT5.g:5946:2: rule__ExpressaoRelacional__Group_1__1__Impl
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
    // InternalT5.g:5952:1: rule__ExpressaoRelacional__Group_1__1__Impl : ( ( rule__ExpressaoRelacional__RightAssignment_1_1 ) ) ;
    public final void rule__ExpressaoRelacional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5956:1: ( ( ( rule__ExpressaoRelacional__RightAssignment_1_1 ) ) )
            // InternalT5.g:5957:1: ( ( rule__ExpressaoRelacional__RightAssignment_1_1 ) )
            {
            // InternalT5.g:5957:1: ( ( rule__ExpressaoRelacional__RightAssignment_1_1 ) )
            // InternalT5.g:5958:2: ( rule__ExpressaoRelacional__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpressaoRelacionalAccess().getRightAssignment_1_1()); 
            // InternalT5.g:5959:2: ( rule__ExpressaoRelacional__RightAssignment_1_1 )
            // InternalT5.g:5959:3: rule__ExpressaoRelacional__RightAssignment_1_1
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


    // $ANTLR start "rule__Model__ProgramaAssignment"
    // InternalT5.g:5968:1: rule__Model__ProgramaAssignment : ( rulePrograma ) ;
    public final void rule__Model__ProgramaAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5972:1: ( ( rulePrograma ) )
            // InternalT5.g:5973:2: ( rulePrograma )
            {
            // InternalT5.g:5973:2: ( rulePrograma )
            // InternalT5.g:5974:3: rulePrograma
            {
             before(grammarAccess.getModelAccess().getProgramaProgramaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrograma();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramaProgramaParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProgramaAssignment"


    // $ANTLR start "rule__Programa__DeclaracoesAssignment_1"
    // InternalT5.g:5983:1: rule__Programa__DeclaracoesAssignment_1 : ( ruleDeclaracao ) ;
    public final void rule__Programa__DeclaracoesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:5987:1: ( ( ruleDeclaracao ) )
            // InternalT5.g:5988:2: ( ruleDeclaracao )
            {
            // InternalT5.g:5988:2: ( ruleDeclaracao )
            // InternalT5.g:5989:3: ruleDeclaracao
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
    // InternalT5.g:5998:1: rule__Programa__CorpoAssignment_3 : ( ruleCorpo ) ;
    public final void rule__Programa__CorpoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6002:1: ( ( ruleCorpo ) )
            // InternalT5.g:6003:2: ( ruleCorpo )
            {
            // InternalT5.g:6003:2: ( ruleCorpo )
            // InternalT5.g:6004:3: ruleCorpo
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
    // InternalT5.g:6013:1: rule__DeclaracaoLocal__VariaveisAssignment_0_1 : ( ruleVariavel ) ;
    public final void rule__DeclaracaoLocal__VariaveisAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6017:1: ( ( ruleVariavel ) )
            // InternalT5.g:6018:2: ( ruleVariavel )
            {
            // InternalT5.g:6018:2: ( ruleVariavel )
            // InternalT5.g:6019:3: ruleVariavel
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
    // InternalT5.g:6028:1: rule__DeclaracaoLocal__VariaveisAssignment_0_2_1 : ( ruleVariavel ) ;
    public final void rule__DeclaracaoLocal__VariaveisAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6032:1: ( ( ruleVariavel ) )
            // InternalT5.g:6033:2: ( ruleVariavel )
            {
            // InternalT5.g:6033:2: ( ruleVariavel )
            // InternalT5.g:6034:3: ruleVariavel
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
    // InternalT5.g:6043:1: rule__DeclaracaoLocal__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeclaracaoLocal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6047:1: ( ( RULE_ID ) )
            // InternalT5.g:6048:2: ( RULE_ID )
            {
            // InternalT5.g:6048:2: ( RULE_ID )
            // InternalT5.g:6049:3: RULE_ID
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
    // InternalT5.g:6058:1: rule__DeclaracaoLocal__TipoBasicoAssignment_1_3 : ( ruleTipoBasico ) ;
    public final void rule__DeclaracaoLocal__TipoBasicoAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6062:1: ( ( ruleTipoBasico ) )
            // InternalT5.g:6063:2: ( ruleTipoBasico )
            {
            // InternalT5.g:6063:2: ( ruleTipoBasico )
            // InternalT5.g:6064:3: ruleTipoBasico
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
    // InternalT5.g:6073:1: rule__DeclaracaoLocal__ValorAssignment_1_5 : ( ruleValorConstante ) ;
    public final void rule__DeclaracaoLocal__ValorAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6077:1: ( ( ruleValorConstante ) )
            // InternalT5.g:6078:2: ( ruleValorConstante )
            {
            // InternalT5.g:6078:2: ( ruleValorConstante )
            // InternalT5.g:6079:3: ruleValorConstante
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
    // InternalT5.g:6088:1: rule__DeclaracaoLocal__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__DeclaracaoLocal__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6092:1: ( ( RULE_ID ) )
            // InternalT5.g:6093:2: ( RULE_ID )
            {
            // InternalT5.g:6093:2: ( RULE_ID )
            // InternalT5.g:6094:3: RULE_ID
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
    // InternalT5.g:6103:1: rule__DeclaracaoLocal__TipoDefAssignment_2_3 : ( ruleTipo ) ;
    public final void rule__DeclaracaoLocal__TipoDefAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6107:1: ( ( ruleTipo ) )
            // InternalT5.g:6108:2: ( ruleTipo )
            {
            // InternalT5.g:6108:2: ( ruleTipo )
            // InternalT5.g:6109:3: ruleTipo
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
    // InternalT5.g:6118:1: rule__DeclaracaoGlobal__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__DeclaracaoGlobal__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6122:1: ( ( RULE_ID ) )
            // InternalT5.g:6123:2: ( RULE_ID )
            {
            // InternalT5.g:6123:2: ( RULE_ID )
            // InternalT5.g:6124:3: RULE_ID
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
    // InternalT5.g:6133:1: rule__DeclaracaoGlobal__ParametrosAssignment_0_3 : ( ruleParametros ) ;
    public final void rule__DeclaracaoGlobal__ParametrosAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6137:1: ( ( ruleParametros ) )
            // InternalT5.g:6138:2: ( ruleParametros )
            {
            // InternalT5.g:6138:2: ( ruleParametros )
            // InternalT5.g:6139:3: ruleParametros
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
    // InternalT5.g:6148:1: rule__DeclaracaoGlobal__CorpoAssignment_0_5 : ( ruleCorpo ) ;
    public final void rule__DeclaracaoGlobal__CorpoAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6152:1: ( ( ruleCorpo ) )
            // InternalT5.g:6153:2: ( ruleCorpo )
            {
            // InternalT5.g:6153:2: ( ruleCorpo )
            // InternalT5.g:6154:3: ruleCorpo
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
    // InternalT5.g:6163:1: rule__DeclaracaoGlobal__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeclaracaoGlobal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6167:1: ( ( RULE_ID ) )
            // InternalT5.g:6168:2: ( RULE_ID )
            {
            // InternalT5.g:6168:2: ( RULE_ID )
            // InternalT5.g:6169:3: RULE_ID
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
    // InternalT5.g:6178:1: rule__DeclaracaoGlobal__ParametrosAssignment_1_3 : ( ruleParametros ) ;
    public final void rule__DeclaracaoGlobal__ParametrosAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6182:1: ( ( ruleParametros ) )
            // InternalT5.g:6183:2: ( ruleParametros )
            {
            // InternalT5.g:6183:2: ( ruleParametros )
            // InternalT5.g:6184:3: ruleParametros
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
    // InternalT5.g:6193:1: rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6 : ( ruleTipoEstendido ) ;
    public final void rule__DeclaracaoGlobal__TipoRetornoAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6197:1: ( ( ruleTipoEstendido ) )
            // InternalT5.g:6198:2: ( ruleTipoEstendido )
            {
            // InternalT5.g:6198:2: ( ruleTipoEstendido )
            // InternalT5.g:6199:3: ruleTipoEstendido
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
    // InternalT5.g:6208:1: rule__DeclaracaoGlobal__CorpoAssignment_1_7 : ( ruleCorpo ) ;
    public final void rule__DeclaracaoGlobal__CorpoAssignment_1_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6212:1: ( ( ruleCorpo ) )
            // InternalT5.g:6213:2: ( ruleCorpo )
            {
            // InternalT5.g:6213:2: ( ruleCorpo )
            // InternalT5.g:6214:3: ruleCorpo
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
    // InternalT5.g:6223:1: rule__Variavel__IdAssignment_0 : ( ruleIdentificador ) ;
    public final void rule__Variavel__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6227:1: ( ( ruleIdentificador ) )
            // InternalT5.g:6228:2: ( ruleIdentificador )
            {
            // InternalT5.g:6228:2: ( ruleIdentificador )
            // InternalT5.g:6229:3: ruleIdentificador
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
    // InternalT5.g:6238:1: rule__Variavel__TipoVarAssignment_2 : ( ruleTipo ) ;
    public final void rule__Variavel__TipoVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6242:1: ( ( ruleTipo ) )
            // InternalT5.g:6243:2: ( ruleTipo )
            {
            // InternalT5.g:6243:2: ( ruleTipo )
            // InternalT5.g:6244:3: ruleTipo
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
    // InternalT5.g:6253:1: rule__Identificador__DimensoesAssignment_2 : ( ruleDimensao ) ;
    public final void rule__Identificador__DimensoesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6257:1: ( ( ruleDimensao ) )
            // InternalT5.g:6258:2: ( ruleDimensao )
            {
            // InternalT5.g:6258:2: ( ruleDimensao )
            // InternalT5.g:6259:3: ruleDimensao
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
    // InternalT5.g:6268:1: rule__Dimensao__ExpAssignment_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__Dimensao__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6272:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:6273:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:6273:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:6274:3: ruleExpressaoAritmetica
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
    // InternalT5.g:6283:1: rule__Tipo__RegistroAssignment_0 : ( ruleRegistro ) ;
    public final void rule__Tipo__RegistroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6287:1: ( ( ruleRegistro ) )
            // InternalT5.g:6288:2: ( ruleRegistro )
            {
            // InternalT5.g:6288:2: ( ruleRegistro )
            // InternalT5.g:6289:3: ruleRegistro
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
    // InternalT5.g:6298:1: rule__Tipo__TipoExtAssignment_1 : ( ruleTipoEstendido ) ;
    public final void rule__Tipo__TipoExtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6302:1: ( ( ruleTipoEstendido ) )
            // InternalT5.g:6303:2: ( ruleTipoEstendido )
            {
            // InternalT5.g:6303:2: ( ruleTipoEstendido )
            // InternalT5.g:6304:3: ruleTipoEstendido
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
    // InternalT5.g:6313:1: rule__Registro__CamposAssignment_1 : ( ruleVariavel ) ;
    public final void rule__Registro__CamposAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6317:1: ( ( ruleVariavel ) )
            // InternalT5.g:6318:2: ( ruleVariavel )
            {
            // InternalT5.g:6318:2: ( ruleVariavel )
            // InternalT5.g:6319:3: ruleVariavel
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
    // InternalT5.g:6328:1: rule__TipoEstendido__BasicAssignment_1_0 : ( ruleTipoBasico ) ;
    public final void rule__TipoEstendido__BasicAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6332:1: ( ( ruleTipoBasico ) )
            // InternalT5.g:6333:2: ( ruleTipoBasico )
            {
            // InternalT5.g:6333:2: ( ruleTipoBasico )
            // InternalT5.g:6334:3: ruleTipoBasico
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
    // InternalT5.g:6343:1: rule__TipoEstendido__RefAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TipoEstendido__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6347:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:6348:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:6348:2: ( ( RULE_ID ) )
            // InternalT5.g:6349:3: ( RULE_ID )
            {
             before(grammarAccess.getTipoEstendidoAccess().getRefDeclaracaoCrossReference_1_1_0()); 
            // InternalT5.g:6350:3: ( RULE_ID )
            // InternalT5.g:6351:4: RULE_ID
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
    // InternalT5.g:6362:1: rule__Parametros__ParametroAssignment_0 : ( ruleParametro ) ;
    public final void rule__Parametros__ParametroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6366:1: ( ( ruleParametro ) )
            // InternalT5.g:6367:2: ( ruleParametro )
            {
            // InternalT5.g:6367:2: ( ruleParametro )
            // InternalT5.g:6368:3: ruleParametro
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
    // InternalT5.g:6377:1: rule__Parametros__ParametroAssignment_1_1 : ( ruleParametro ) ;
    public final void rule__Parametros__ParametroAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6381:1: ( ( ruleParametro ) )
            // InternalT5.g:6382:2: ( ruleParametro )
            {
            // InternalT5.g:6382:2: ( ruleParametro )
            // InternalT5.g:6383:3: ruleParametro
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
    // InternalT5.g:6392:1: rule__Parametro__IdsAssignment_1 : ( ruleIdentificador ) ;
    public final void rule__Parametro__IdsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6396:1: ( ( ruleIdentificador ) )
            // InternalT5.g:6397:2: ( ruleIdentificador )
            {
            // InternalT5.g:6397:2: ( ruleIdentificador )
            // InternalT5.g:6398:3: ruleIdentificador
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
    // InternalT5.g:6407:1: rule__Parametro__IdsAssignment_2_1 : ( ruleIdentificador ) ;
    public final void rule__Parametro__IdsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6411:1: ( ( ruleIdentificador ) )
            // InternalT5.g:6412:2: ( ruleIdentificador )
            {
            // InternalT5.g:6412:2: ( ruleIdentificador )
            // InternalT5.g:6413:3: ruleIdentificador
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
    // InternalT5.g:6422:1: rule__Parametro__TipoParamAssignment_4 : ( ruleTipoEstendido ) ;
    public final void rule__Parametro__TipoParamAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6426:1: ( ( ruleTipoEstendido ) )
            // InternalT5.g:6427:2: ( ruleTipoEstendido )
            {
            // InternalT5.g:6427:2: ( ruleTipoEstendido )
            // InternalT5.g:6428:3: ruleTipoEstendido
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
    // InternalT5.g:6437:1: rule__Corpo__LocaisAssignment_0 : ( ruleDeclaracaoLocal ) ;
    public final void rule__Corpo__LocaisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6441:1: ( ( ruleDeclaracaoLocal ) )
            // InternalT5.g:6442:2: ( ruleDeclaracaoLocal )
            {
            // InternalT5.g:6442:2: ( ruleDeclaracaoLocal )
            // InternalT5.g:6443:3: ruleDeclaracaoLocal
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
    // InternalT5.g:6452:1: rule__Corpo__ComandosAssignment_1 : ( ruleComando ) ;
    public final void rule__Corpo__ComandosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6456:1: ( ( ruleComando ) )
            // InternalT5.g:6457:2: ( ruleComando )
            {
            // InternalT5.g:6457:2: ( ruleComando )
            // InternalT5.g:6458:3: ruleComando
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
    // InternalT5.g:6467:1: rule__ComandoLeia__AlvoAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoLeia__AlvoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6471:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:6472:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:6472:2: ( ( RULE_ID ) )
            // InternalT5.g:6473:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoCrossReference_3_0()); 
            // InternalT5.g:6474:3: ( RULE_ID )
            // InternalT5.g:6475:4: RULE_ID
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
    // InternalT5.g:6486:1: rule__ComandoLeia__AlvoAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoLeia__AlvoAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6490:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:6491:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:6491:2: ( ( RULE_ID ) )
            // InternalT5.g:6492:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoLeiaAccess().getAlvoDeclaracaoCrossReference_4_2_0()); 
            // InternalT5.g:6493:3: ( RULE_ID )
            // InternalT5.g:6494:4: RULE_ID
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
    // InternalT5.g:6505:1: rule__ComandoEscreva__ExpAssignment_2 : ( ruleExpressao ) ;
    public final void rule__ComandoEscreva__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6509:1: ( ( ruleExpressao ) )
            // InternalT5.g:6510:2: ( ruleExpressao )
            {
            // InternalT5.g:6510:2: ( ruleExpressao )
            // InternalT5.g:6511:3: ruleExpressao
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
    // InternalT5.g:6520:1: rule__ComandoEscreva__ExpAssignment_3_1 : ( ruleExpressao ) ;
    public final void rule__ComandoEscreva__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6524:1: ( ( ruleExpressao ) )
            // InternalT5.g:6525:2: ( ruleExpressao )
            {
            // InternalT5.g:6525:2: ( ruleExpressao )
            // InternalT5.g:6526:3: ruleExpressao
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
    // InternalT5.g:6535:1: rule__ComandoSe__CondAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ComandoSe__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6539:1: ( ( ruleExpressao ) )
            // InternalT5.g:6540:2: ( ruleExpressao )
            {
            // InternalT5.g:6540:2: ( ruleExpressao )
            // InternalT5.g:6541:3: ruleExpressao
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
    // InternalT5.g:6550:1: rule__ComandoSe__ComandosAssignment_3 : ( ruleComando ) ;
    public final void rule__ComandoSe__ComandosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6554:1: ( ( ruleComando ) )
            // InternalT5.g:6555:2: ( ruleComando )
            {
            // InternalT5.g:6555:2: ( ruleComando )
            // InternalT5.g:6556:3: ruleComando
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
    // InternalT5.g:6565:1: rule__ComandoSe__ComandosElseAssignment_4_1 : ( ruleComando ) ;
    public final void rule__ComandoSe__ComandosElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6569:1: ( ( ruleComando ) )
            // InternalT5.g:6570:2: ( ruleComando )
            {
            // InternalT5.g:6570:2: ( ruleComando )
            // InternalT5.g:6571:3: ruleComando
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
    // InternalT5.g:6580:1: rule__ComandoCaso__ExpAssignment_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ComandoCaso__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6584:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:6585:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:6585:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:6586:3: ruleExpressaoAritmetica
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
    // InternalT5.g:6595:1: rule__ComandoCaso__SelecaoAssignment_3 : ( ruleSelecao ) ;
    public final void rule__ComandoCaso__SelecaoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6599:1: ( ( ruleSelecao ) )
            // InternalT5.g:6600:2: ( ruleSelecao )
            {
            // InternalT5.g:6600:2: ( ruleSelecao )
            // InternalT5.g:6601:3: ruleSelecao
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
    // InternalT5.g:6610:1: rule__ComandoCaso__ComandosElseAssignment_4_1 : ( ruleComando ) ;
    public final void rule__ComandoCaso__ComandosElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6614:1: ( ( ruleComando ) )
            // InternalT5.g:6615:2: ( ruleComando )
            {
            // InternalT5.g:6615:2: ( ruleComando )
            // InternalT5.g:6616:3: ruleComando
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
    // InternalT5.g:6625:1: rule__ComandoPara__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComandoPara__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6629:1: ( ( RULE_ID ) )
            // InternalT5.g:6630:2: ( RULE_ID )
            {
            // InternalT5.g:6630:2: ( RULE_ID )
            // InternalT5.g:6631:3: RULE_ID
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
    // InternalT5.g:6640:1: rule__ComandoPara__InicioAssignment_3 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ComandoPara__InicioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6644:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:6645:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:6645:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:6646:3: ruleExpressaoAritmetica
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
    // InternalT5.g:6655:1: rule__ComandoPara__FimAssignment_5 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ComandoPara__FimAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6659:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:6660:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:6660:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:6661:3: ruleExpressaoAritmetica
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
    // InternalT5.g:6670:1: rule__ComandoPara__ComandosAssignment_7 : ( ruleComando ) ;
    public final void rule__ComandoPara__ComandosAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6674:1: ( ( ruleComando ) )
            // InternalT5.g:6675:2: ( ruleComando )
            {
            // InternalT5.g:6675:2: ( ruleComando )
            // InternalT5.g:6676:3: ruleComando
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
    // InternalT5.g:6685:1: rule__ComandoEnquanto__CondAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ComandoEnquanto__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6689:1: ( ( ruleExpressao ) )
            // InternalT5.g:6690:2: ( ruleExpressao )
            {
            // InternalT5.g:6690:2: ( ruleExpressao )
            // InternalT5.g:6691:3: ruleExpressao
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
    // InternalT5.g:6700:1: rule__ComandoEnquanto__ComandosAssignment_3 : ( ruleComando ) ;
    public final void rule__ComandoEnquanto__ComandosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6704:1: ( ( ruleComando ) )
            // InternalT5.g:6705:2: ( ruleComando )
            {
            // InternalT5.g:6705:2: ( ruleComando )
            // InternalT5.g:6706:3: ruleComando
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
    // InternalT5.g:6715:1: rule__ComandoFaca__ComandosAssignment_1 : ( ruleComando ) ;
    public final void rule__ComandoFaca__ComandosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6719:1: ( ( ruleComando ) )
            // InternalT5.g:6720:2: ( ruleComando )
            {
            // InternalT5.g:6720:2: ( ruleComando )
            // InternalT5.g:6721:3: ruleComando
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
    // InternalT5.g:6730:1: rule__ComandoFaca__CondAssignment_3 : ( ruleExpressao ) ;
    public final void rule__ComandoFaca__CondAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6734:1: ( ( ruleExpressao ) )
            // InternalT5.g:6735:2: ( ruleExpressao )
            {
            // InternalT5.g:6735:2: ( ruleExpressao )
            // InternalT5.g:6736:3: ruleExpressao
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
    // InternalT5.g:6745:1: rule__ComandoAtribuicao__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComandoAtribuicao__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6749:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:6750:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:6750:2: ( ( RULE_ID ) )
            // InternalT5.g:6751:3: ( RULE_ID )
            {
             before(grammarAccess.getComandoAtribuicaoAccess().getTargetDeclaracaoCrossReference_1_0()); 
            // InternalT5.g:6752:3: ( RULE_ID )
            // InternalT5.g:6753:4: RULE_ID
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
    // InternalT5.g:6764:1: rule__ComandoAtribuicao__ValorAssignment_3 : ( ruleExpressao ) ;
    public final void rule__ComandoAtribuicao__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6768:1: ( ( ruleExpressao ) )
            // InternalT5.g:6769:2: ( ruleExpressao )
            {
            // InternalT5.g:6769:2: ( ruleExpressao )
            // InternalT5.g:6770:3: ruleExpressao
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
    // InternalT5.g:6779:1: rule__ComandoChamada__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ComandoChamada__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6783:1: ( ( RULE_ID ) )
            // InternalT5.g:6784:2: ( RULE_ID )
            {
            // InternalT5.g:6784:2: ( RULE_ID )
            // InternalT5.g:6785:3: RULE_ID
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
    // InternalT5.g:6794:1: rule__ComandoChamada__ArgsAssignment_2_0 : ( ruleExpressao ) ;
    public final void rule__ComandoChamada__ArgsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6798:1: ( ( ruleExpressao ) )
            // InternalT5.g:6799:2: ( ruleExpressao )
            {
            // InternalT5.g:6799:2: ( ruleExpressao )
            // InternalT5.g:6800:3: ruleExpressao
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
    // InternalT5.g:6809:1: rule__ComandoChamada__ArgsAssignment_2_1_1 : ( ruleExpressao ) ;
    public final void rule__ComandoChamada__ArgsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6813:1: ( ( ruleExpressao ) )
            // InternalT5.g:6814:2: ( ruleExpressao )
            {
            // InternalT5.g:6814:2: ( ruleExpressao )
            // InternalT5.g:6815:3: ruleExpressao
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
    // InternalT5.g:6824:1: rule__ComandoRetorne__ExpAssignment_1 : ( ruleExpressao ) ;
    public final void rule__ComandoRetorne__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6828:1: ( ( ruleExpressao ) )
            // InternalT5.g:6829:2: ( ruleExpressao )
            {
            // InternalT5.g:6829:2: ( ruleExpressao )
            // InternalT5.g:6830:3: ruleExpressao
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
    // InternalT5.g:6839:1: rule__Selecao__ItensAssignment_0 : ( ruleItemSelecao ) ;
    public final void rule__Selecao__ItensAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6843:1: ( ( ruleItemSelecao ) )
            // InternalT5.g:6844:2: ( ruleItemSelecao )
            {
            // InternalT5.g:6844:2: ( ruleItemSelecao )
            // InternalT5.g:6845:3: ruleItemSelecao
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
    // InternalT5.g:6854:1: rule__Selecao__ComandosAssignment_2 : ( ruleComando ) ;
    public final void rule__Selecao__ComandosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6858:1: ( ( ruleComando ) )
            // InternalT5.g:6859:2: ( ruleComando )
            {
            // InternalT5.g:6859:2: ( ruleComando )
            // InternalT5.g:6860:3: ruleComando
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
    // InternalT5.g:6869:1: rule__ItemSelecao__FaixasAssignment_0 : ( ruleNumeroIntervalo ) ;
    public final void rule__ItemSelecao__FaixasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6873:1: ( ( ruleNumeroIntervalo ) )
            // InternalT5.g:6874:2: ( ruleNumeroIntervalo )
            {
            // InternalT5.g:6874:2: ( ruleNumeroIntervalo )
            // InternalT5.g:6875:3: ruleNumeroIntervalo
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
    // InternalT5.g:6884:1: rule__ItemSelecao__FaixasAssignment_1_1 : ( ruleNumeroIntervalo ) ;
    public final void rule__ItemSelecao__FaixasAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6888:1: ( ( ruleNumeroIntervalo ) )
            // InternalT5.g:6889:2: ( ruleNumeroIntervalo )
            {
            // InternalT5.g:6889:2: ( ruleNumeroIntervalo )
            // InternalT5.g:6890:3: ruleNumeroIntervalo
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
    // InternalT5.g:6899:1: rule__NumeroIntervalo__SinalAssignment_0 : ( ruleOpUnario ) ;
    public final void rule__NumeroIntervalo__SinalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6903:1: ( ( ruleOpUnario ) )
            // InternalT5.g:6904:2: ( ruleOpUnario )
            {
            // InternalT5.g:6904:2: ( ruleOpUnario )
            // InternalT5.g:6905:3: ruleOpUnario
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
    // InternalT5.g:6914:1: rule__NumeroIntervalo__StartAssignment_1 : ( RULE_INT ) ;
    public final void rule__NumeroIntervalo__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6918:1: ( ( RULE_INT ) )
            // InternalT5.g:6919:2: ( RULE_INT )
            {
            // InternalT5.g:6919:2: ( RULE_INT )
            // InternalT5.g:6920:3: RULE_INT
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
    // InternalT5.g:6929:1: rule__NumeroIntervalo__EndAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__NumeroIntervalo__EndAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6933:1: ( ( RULE_INT ) )
            // InternalT5.g:6934:2: ( RULE_INT )
            {
            // InternalT5.g:6934:2: ( RULE_INT )
            // InternalT5.g:6935:3: RULE_INT
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
    // InternalT5.g:6944:1: rule__ExpressaoAritmetica__TermosAssignment_0 : ( ruleTermoAritmetico ) ;
    public final void rule__ExpressaoAritmetica__TermosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6948:1: ( ( ruleTermoAritmetico ) )
            // InternalT5.g:6949:2: ( ruleTermoAritmetico )
            {
            // InternalT5.g:6949:2: ( ruleTermoAritmetico )
            // InternalT5.g:6950:3: ruleTermoAritmetico
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
    // InternalT5.g:6959:1: rule__ExpressaoAritmetica__OutrosAssignment_1 : ( ruleOutroTermoAritmetico ) ;
    public final void rule__ExpressaoAritmetica__OutrosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6963:1: ( ( ruleOutroTermoAritmetico ) )
            // InternalT5.g:6964:2: ( ruleOutroTermoAritmetico )
            {
            // InternalT5.g:6964:2: ( ruleOutroTermoAritmetico )
            // InternalT5.g:6965:3: ruleOutroTermoAritmetico
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
    // InternalT5.g:6974:1: rule__OutroTermoAritmetico__OpAssignment_0 : ( ruleOpArit1 ) ;
    public final void rule__OutroTermoAritmetico__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6978:1: ( ( ruleOpArit1 ) )
            // InternalT5.g:6979:2: ( ruleOpArit1 )
            {
            // InternalT5.g:6979:2: ( ruleOpArit1 )
            // InternalT5.g:6980:3: ruleOpArit1
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
    // InternalT5.g:6989:1: rule__OutroTermoAritmetico__TermoAssignment_1 : ( ruleTermoAritmetico ) ;
    public final void rule__OutroTermoAritmetico__TermoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:6993:1: ( ( ruleTermoAritmetico ) )
            // InternalT5.g:6994:2: ( ruleTermoAritmetico )
            {
            // InternalT5.g:6994:2: ( ruleTermoAritmetico )
            // InternalT5.g:6995:3: ruleTermoAritmetico
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
    // InternalT5.g:7004:1: rule__TermoAritmetico__FatoresAssignment_0 : ( ruleFatorAritmetico ) ;
    public final void rule__TermoAritmetico__FatoresAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7008:1: ( ( ruleFatorAritmetico ) )
            // InternalT5.g:7009:2: ( ruleFatorAritmetico )
            {
            // InternalT5.g:7009:2: ( ruleFatorAritmetico )
            // InternalT5.g:7010:3: ruleFatorAritmetico
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
    // InternalT5.g:7019:1: rule__TermoAritmetico__OutrosAssignment_1 : ( ruleOutroFatorAritmetico ) ;
    public final void rule__TermoAritmetico__OutrosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7023:1: ( ( ruleOutroFatorAritmetico ) )
            // InternalT5.g:7024:2: ( ruleOutroFatorAritmetico )
            {
            // InternalT5.g:7024:2: ( ruleOutroFatorAritmetico )
            // InternalT5.g:7025:3: ruleOutroFatorAritmetico
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
    // InternalT5.g:7034:1: rule__OutroFatorAritmetico__OpAssignment_0 : ( ruleOpArit2 ) ;
    public final void rule__OutroFatorAritmetico__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7038:1: ( ( ruleOpArit2 ) )
            // InternalT5.g:7039:2: ( ruleOpArit2 )
            {
            // InternalT5.g:7039:2: ( ruleOpArit2 )
            // InternalT5.g:7040:3: ruleOpArit2
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
    // InternalT5.g:7049:1: rule__OutroFatorAritmetico__FatorAssignment_1 : ( ruleFatorAritmetico ) ;
    public final void rule__OutroFatorAritmetico__FatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7053:1: ( ( ruleFatorAritmetico ) )
            // InternalT5.g:7054:2: ( ruleFatorAritmetico )
            {
            // InternalT5.g:7054:2: ( ruleFatorAritmetico )
            // InternalT5.g:7055:3: ruleFatorAritmetico
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
    // InternalT5.g:7064:1: rule__FatorAritmetico__RefAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FatorAritmetico__RefAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7068:1: ( ( ( RULE_ID ) ) )
            // InternalT5.g:7069:2: ( ( RULE_ID ) )
            {
            // InternalT5.g:7069:2: ( ( RULE_ID ) )
            // InternalT5.g:7070:3: ( RULE_ID )
            {
             before(grammarAccess.getFatorAritmeticoAccess().getRefDeclaracaoCrossReference_0_1_0()); 
            // InternalT5.g:7071:3: ( RULE_ID )
            // InternalT5.g:7072:4: RULE_ID
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
    // InternalT5.g:7083:1: rule__FatorAritmetico__NumeroAssignment_1 : ( RULE_INT ) ;
    public final void rule__FatorAritmetico__NumeroAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7087:1: ( ( RULE_INT ) )
            // InternalT5.g:7088:2: ( RULE_INT )
            {
            // InternalT5.g:7088:2: ( RULE_INT )
            // InternalT5.g:7089:3: RULE_INT
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
    // InternalT5.g:7098:1: rule__FatorAritmetico__RealAssignment_2 : ( RULE_REAL ) ;
    public final void rule__FatorAritmetico__RealAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7102:1: ( ( RULE_REAL ) )
            // InternalT5.g:7103:2: ( RULE_REAL )
            {
            // InternalT5.g:7103:2: ( RULE_REAL )
            // InternalT5.g:7104:3: RULE_REAL
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
    // InternalT5.g:7113:1: rule__FatorAritmetico__ExpAssignment_3_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__FatorAritmetico__ExpAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7117:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:7118:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:7118:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:7119:3: ruleExpressaoAritmetica
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
    // InternalT5.g:7128:1: rule__Expressao__LogicosAssignment_0 : ( ruleTermoLogico ) ;
    public final void rule__Expressao__LogicosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7132:1: ( ( ruleTermoLogico ) )
            // InternalT5.g:7133:2: ( ruleTermoLogico )
            {
            // InternalT5.g:7133:2: ( ruleTermoLogico )
            // InternalT5.g:7134:3: ruleTermoLogico
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
    // InternalT5.g:7143:1: rule__Expressao__OpAssignment_1_0 : ( ruleOpBool ) ;
    public final void rule__Expressao__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7147:1: ( ( ruleOpBool ) )
            // InternalT5.g:7148:2: ( ruleOpBool )
            {
            // InternalT5.g:7148:2: ( ruleOpBool )
            // InternalT5.g:7149:3: ruleOpBool
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
    // InternalT5.g:7158:1: rule__Expressao__LogicosAssignment_1_1 : ( ruleTermoLogico ) ;
    public final void rule__Expressao__LogicosAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7162:1: ( ( ruleTermoLogico ) )
            // InternalT5.g:7163:2: ( ruleTermoLogico )
            {
            // InternalT5.g:7163:2: ( ruleTermoLogico )
            // InternalT5.g:7164:3: ruleTermoLogico
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
    // InternalT5.g:7173:1: rule__TermoLogico__RelAssignment_1 : ( ruleExpressaoRelacional ) ;
    public final void rule__TermoLogico__RelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7177:1: ( ( ruleExpressaoRelacional ) )
            // InternalT5.g:7178:2: ( ruleExpressaoRelacional )
            {
            // InternalT5.g:7178:2: ( ruleExpressaoRelacional )
            // InternalT5.g:7179:3: ruleExpressaoRelacional
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
    // InternalT5.g:7188:1: rule__ExpressaoRelacional__LeftAssignment_0 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ExpressaoRelacional__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7192:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:7193:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:7193:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:7194:3: ruleExpressaoAritmetica
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
    // InternalT5.g:7203:1: rule__ExpressaoRelacional__OpAssignment_1_0 : ( ruleOpRel ) ;
    public final void rule__ExpressaoRelacional__OpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7207:1: ( ( ruleOpRel ) )
            // InternalT5.g:7208:2: ( ruleOpRel )
            {
            // InternalT5.g:7208:2: ( ruleOpRel )
            // InternalT5.g:7209:3: ruleOpRel
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
    // InternalT5.g:7218:1: rule__ExpressaoRelacional__RightAssignment_1_1 : ( ruleExpressaoAritmetica ) ;
    public final void rule__ExpressaoRelacional__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT5.g:7222:1: ( ( ruleExpressaoAritmetica ) )
            // InternalT5.g:7223:2: ( ruleExpressaoAritmetica )
            {
            // InternalT5.g:7223:2: ( ruleExpressaoAritmetica )
            // InternalT5.g:7224:3: ruleExpressaoAritmetica
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
            return "1310:1: rule__Comando__Alternatives : ( ( ruleComandoLeia ) | ( ruleComandoEscreva ) | ( ruleComandoSe ) | ( ruleComandoCaso ) | ( ruleComandoPara ) | ( ruleComandoEnquanto ) | ( ruleComandoFaca ) | ( ruleComandoAtribuicao ) | ( ruleComandoChamada ) | ( ruleComandoRetorne ) );";
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