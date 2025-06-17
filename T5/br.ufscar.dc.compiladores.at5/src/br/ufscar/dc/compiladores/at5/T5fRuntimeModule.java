package br.ufscar.dc.compiladores.at5;

import org.eclipse.xtext.scoping.IScopeProvider;
import br.ufscar.dc.compiladores.at5.t5f.scoping.T5fScopeProvider;

public class T5fRuntimeModule extends AbstractT5fRuntimeModule {
    @Override
    public Class<? extends IScopeProvider> bindIScopeProvider() {
        return T5fScopeProvider.class;
    }
}
