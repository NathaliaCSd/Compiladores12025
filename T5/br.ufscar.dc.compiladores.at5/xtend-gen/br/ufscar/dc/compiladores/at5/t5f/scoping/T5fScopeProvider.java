package br.ufscar.dc.compiladores.at5.t5f.scoping;

import br.ufscar.dc.compiladores.at5.t5f.ComandoLeia;
import br.ufscar.dc.compiladores.at5.t5f.Declaracao;
import br.ufscar.dc.compiladores.at5.t5f.DeclaracaoLocal;
import br.ufscar.dc.compiladores.at5.t5f.Programa;
import br.ufscar.dc.compiladores.at5.t5f.Variavel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Cria o escopo para o cross‐reference ComandoLeia.alvo
 */
@SuppressWarnings("all")
public class T5fScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_ComandoLeia_alvo(final ComandoLeia ctx, final EReference ref) {
    final Programa prog = EcoreUtil2.<Programa>getContainerOfType(ctx, Programa.class);
    final Function1<Declaracao, Boolean> _function = (Declaracao it) -> {
      return Boolean.valueOf((it instanceof DeclaracaoLocal));
    };
    final Function1<Declaracao, EList<Variavel>> _function_1 = (Declaracao it) -> {
      return ((DeclaracaoLocal) it).getVariaveis();
    };
    final Iterable<Variavel> vars = IterableExtensions.<Declaracao, Variavel>flatMap(IterableExtensions.<Declaracao>filter(prog.getDeclaracoes(), _function), _function_1);
    return Scopes.scopeFor(vars);
  }
}
