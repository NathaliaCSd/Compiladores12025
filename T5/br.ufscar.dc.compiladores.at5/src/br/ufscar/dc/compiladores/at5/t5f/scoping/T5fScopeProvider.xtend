package br.ufscar.dc.compiladores.at5.t5f.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import br.ufscar.dc.compiladores.at5.t5f.Programa
import br.ufscar.dc.compiladores.at5.t5f.DeclaracaoLocal
import br.ufscar.dc.compiladores.at5.t5f.Variavel
import br.ufscar.dc.compiladores.at5.t5f.ComandoLeia

/**
 * Cria o escopo para o cross‐reference ComandoLeia.alvo
 */
class T5fScopeProvider extends AbstractDeclarativeScopeProvider {

  def IScope scope_ComandoLeia_alvo(ComandoLeia ctx, EReference ref) {
    // Encontra o nó Programa mais acima na árvore
    val Programa prog = EcoreUtil2.getContainerOfType(ctx, Programa)
    // Filtra todas as variáveis das declarações locais
    val vars = prog.declaracoes
      .filter[ it instanceof DeclaracaoLocal ]
      .flatMap[ (it as DeclaracaoLocal).variaveis ]
    // Retorna um escopo contendo essas Variavel
    return Scopes.scopeFor(vars)
  }
}
