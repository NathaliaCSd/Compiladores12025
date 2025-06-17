package br.ufscar.dc.compiladores.at5.generator

import br.ufscar.dc.compiladores.at5.t5f.ComandoAtribuicao
import br.ufscar.dc.compiladores.at5.t5f.ComandoEscreva
import br.ufscar.dc.compiladores.at5.t5f.ComandoLeia
import br.ufscar.dc.compiladores.at5.t5f.Corpo
import br.ufscar.dc.compiladores.at5.t5f.DeclaracaoLocal
import br.ufscar.dc.compiladores.at5.t5f.Expressao
import br.ufscar.dc.compiladores.at5.t5f.ExpressaoAritmetica
import br.ufscar.dc.compiladores.at5.t5f.ExpressaoRelacional
import br.ufscar.dc.compiladores.at5.t5f.FatorAritmetico
import br.ufscar.dc.compiladores.at5.t5f.Identificador
import br.ufscar.dc.compiladores.at5.t5f.Programa
import br.ufscar.dc.compiladores.at5.t5f.T5fPackage
import br.ufscar.dc.compiladores.at5.t5f.TermoAritmetico
import br.ufscar.dc.compiladores.at5.t5f.TermoLogico
import br.ufscar.dc.compiladores.at5.t5f.Tipo
import br.ufscar.dc.compiladores.at5.t5f.Variavel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend2.lib.StringConcatenation
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

abstract class T5fGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        for (p : resource.allContents.toIterable.filter(Programa)) {
            fsa.generateFile("gen/Programa.java", compilePrograma(p))
        }
    }

    def String compilePrograma(Programa p) '''
package gen;

import java.util.Scanner;
public class Programa {
    static Scanner sc = new Scanner(System.in);

    «FOR d : p.declaracoes»
        «compileDeclaracao(d as DeclaracaoLocal)»
    «ENDFOR»

    public static void main(String[] args) {
        «compileCorpo(p.corpo)»
    }
}
'''

    def String compileDeclaracao(DeclaracaoLocal d) '''
«IF !d.variaveis.empty»
    «FOR v : d.variaveis»
        static «getTipoJava(v.tipoVar)» «v.name.name»;
    «ENDFOR»
«ENDIF»
'''

    def String compileCorpo(Corpo c) '''
«FOR local : c.locais»
    «compileDeclaracao(local)»
«ENDFOR»
«FOR cmd : c.comandos»
    «compileComando(cmd)»
«ENDFOR»
'''

    // --- Comandos ---
    def dispatch String compileComando(ComandoLeia c) '''
«FOR id : c.alvo»
    «id.name» = «getTipoLeitura(id.eContainer as Variavel)»;
«ENDFOR»
'''

    def dispatch String compileComando(ComandoEscreva c) '''
«FOR exp : c.exp»
    System.out.print(«compileExpressao(exp)»);
«ENDFOR»
System.out.println();
'''

    def dispatch String compileComando(ComandoAtribuicao c) '''
«c.target.name» = «compileExpressao(c.valor)»;
'''

    // --- Expressões ---
    def String compileExpressao(Expressao e) {
        val sb = new StringConcatenation
        sb.append(compileTermoLogico(e.logicos.get(0)))
        for (i : 1 ..< e.logicos.size) {
            sb.append(" ")
            sb.append(compileOpBool(e.op.get(i-1)))
            sb.append(" ")
            sb.append(compileTermoLogico(e.logicos.get(i)))
        }
        sb.toString
    }

    def String compileTermoLogico(TermoLogico tl) {
        val sb = new StringConcatenation
        if (tl.isNao) sb.append("!")
        sb.append("(")
        sb.append(compileExpressaoRelacional(tl.rel))
        sb.append(")")
        sb.toString
    }

    def String compileExpressaoRelacional(ExpressaoRelacional er) {
        if (er.right !== null) {
            compileExpressaoAritmetica(er.left)
                + " " + compileOpRel(er.op)
                + " " + compileExpressaoAritmetica(er.right)
        } else {
            compileExpressaoAritmetica(er.left)
        }
    }

    def String compileExpressaoAritmetica(ExpressaoAritmetica e) '''
«compileTermoAritmetico(e.termos.head)»«FOR ot : e.outros» «ot.op»«compileTermoAritmetico(ot.termo)»«ENDFOR»
'''

    def String compileTermoAritmetico(TermoAritmetico t) '''
«compileFatorAritmetico(t.fatores.head)»«FOR of : t.outros» «of.op»«compileFatorAritmetico(of.fator)»«ENDFOR»
'''

    def  String compileFatorAritmetico(FatorAritmetico f) {
        if (f.ref !== null) return (f.ref as Identificador).name
        if (f.exp !== null) return "(" + compileExpressaoAritmetica(f.exp) + ")"
        if (f.eIsSet(T5fPackage.Literals.FATOR_ARITMETICO__REAL))   return f.real.toString
        if (f.eIsSet(T5fPackage.Literals.FATOR_ARITMETICO__NUMERO)) return f.numero.toString
        if (f.str !== null) return f.str
        ""
    }

    def String compileOpBool(String op) {
    switch(op) {
        case "e":
            return "&&"
        case "ou":
            return "||"
        default:
            return ""
    }
}


    def String compileOpRel(String op) {
    	switch op {
        case "=":  "=="
        case "<>": "!="
        default:   op
        
        }
    }

    // --- Helpers de tipo ---
    def String getTipoJava(Tipo t) {
    	switch t.tipoExt?.basic {
        case "inteiro": "int"
        case "real":    "double"
        case "literal": "String"
        case "logico":  "boolean"
        default:        "Object"
        
        }
    }

    def String getTipoLeitura(Variavel v) {
    	switch v.tipoVar.tipoExt?.basic {
        case "inteiro": "sc.nextInt()"
        case "real":    "sc.nextDouble()"
        case "literal": "sc.next()"
        case "logico":  "sc.nextBoolean()"
        default:        "sc.next()"
    }
}
}