package br.ufscar.dc.compiladores.at5.generator;

import br.ufscar.dc.compiladores.at5.t5f.Comando;
import br.ufscar.dc.compiladores.at5.t5f.ComandoAtribuicao;
import br.ufscar.dc.compiladores.at5.t5f.ComandoEscreva;
import br.ufscar.dc.compiladores.at5.t5f.ComandoLeia;
import br.ufscar.dc.compiladores.at5.t5f.Corpo;
import br.ufscar.dc.compiladores.at5.t5f.Declaracao;
import br.ufscar.dc.compiladores.at5.t5f.DeclaracaoLocal;
import br.ufscar.dc.compiladores.at5.t5f.Expressao;
import br.ufscar.dc.compiladores.at5.t5f.ExpressaoAritmetica;
import br.ufscar.dc.compiladores.at5.t5f.ExpressaoRelacional;
import br.ufscar.dc.compiladores.at5.t5f.FatorAritmetico;
import br.ufscar.dc.compiladores.at5.t5f.Identificador;
import br.ufscar.dc.compiladores.at5.t5f.OutroFatorAritmetico;
import br.ufscar.dc.compiladores.at5.t5f.OutroTermoAritmetico;
import br.ufscar.dc.compiladores.at5.t5f.Programa;
import br.ufscar.dc.compiladores.at5.t5f.T5fPackage;
import br.ufscar.dc.compiladores.at5.t5f.TermoAritmetico;
import br.ufscar.dc.compiladores.at5.t5f.TermoLogico;
import br.ufscar.dc.compiladores.at5.t5f.Tipo;
import br.ufscar.dc.compiladores.at5.t5f.TipoEstendido;
import br.ufscar.dc.compiladores.at5.t5f.Variavel;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public abstract class T5fGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Programa> _filter = Iterables.<Programa>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Programa.class);
    for (final Programa p : _filter) {
      fsa.generateFile("gen/Programa.java", this.compilePrograma(p));
    }
  }

  public String compilePrograma(final Programa p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package gen;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Scanner;");
    _builder.newLine();
    _builder.append("public class Programa {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("static Scanner sc = new Scanner(System.in);");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Declaracao> _declaracoes = p.getDeclaracoes();
      for(final Declaracao d : _declaracoes) {
        _builder.append("    ");
        String _compileDeclaracao = this.compileDeclaracao(((DeclaracaoLocal) d));
        _builder.append(_compileDeclaracao, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("        ");
    String _compileCorpo = this.compileCorpo(p.getCorpo());
    _builder.append(_compileCorpo, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  public String compileDeclaracao(final DeclaracaoLocal d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = d.getVariaveis().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<Variavel> _variaveis = d.getVariaveis();
          for(final Variavel v : _variaveis) {
            _builder.append("static ");
            String _tipoJava = this.getTipoJava(v.getTipoVar());
            _builder.append(_tipoJava);
            _builder.append(" ");
            String _name = v.getName().getName();
            _builder.append(_name);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }

  public String compileCorpo(final Corpo c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DeclaracaoLocal> _locais = c.getLocais();
      for(final DeclaracaoLocal local : _locais) {
        String _compileDeclaracao = this.compileDeclaracao(local);
        _builder.append(_compileDeclaracao);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Comando> _comandos = c.getComandos();
      for(final Comando cmd : _comandos) {
        String _compileComando = this.compileComando(cmd);
        _builder.append(_compileComando);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  protected String _compileComando(final ComandoLeia c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Identificador> _alvo = c.getAlvo();
      for(final Identificador id : _alvo) {
        String _name = id.getName();
        _builder.append(_name);
        _builder.append(" = ");
        EObject _eContainer = id.eContainer();
        String _tipoLeitura = this.getTipoLeitura(((Variavel) _eContainer));
        _builder.append(_tipoLeitura);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }

  protected String _compileComando(final ComandoEscreva c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Expressao> _exp = c.getExp();
      for(final Expressao exp : _exp) {
        _builder.append("System.out.print(");
        String _compileExpressao = this.compileExpressao(exp);
        _builder.append(_compileExpressao);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("System.out.println();");
    _builder.newLine();
    return _builder.toString();
  }

  protected String _compileComando(final ComandoAtribuicao c) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = c.getTarget().getName();
    _builder.append(_name);
    _builder.append(" = ");
    String _compileExpressao = this.compileExpressao(c.getValor());
    _builder.append(_compileExpressao);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String compileExpressao(final Expressao e) {
    String _xblockexpression = null;
    {
      final StringConcatenation sb = new StringConcatenation();
      sb.append(this.compileTermoLogico(e.getLogicos().get(0)));
      int _size = e.getLogicos().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(1, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          sb.append(" ");
          sb.append(this.compileOpBool(e.getOp().get(((i).intValue() - 1))));
          sb.append(" ");
          sb.append(this.compileTermoLogico(e.getLogicos().get((i).intValue())));
        }
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public String compileTermoLogico(final TermoLogico tl) {
    String _xblockexpression = null;
    {
      final StringConcatenation sb = new StringConcatenation();
      boolean _isNao = tl.isNao();
      if (_isNao) {
        sb.append("!");
      }
      sb.append("(");
      sb.append(this.compileExpressaoRelacional(tl.getRel()));
      sb.append(")");
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public String compileExpressaoRelacional(final ExpressaoRelacional er) {
    String _xifexpression = null;
    ExpressaoAritmetica _right = er.getRight();
    boolean _tripleNotEquals = (_right != null);
    if (_tripleNotEquals) {
      String _compileExpressaoAritmetica = this.compileExpressaoAritmetica(er.getLeft());
      String _plus = (_compileExpressaoAritmetica + " ");
      String _compileOpRel = this.compileOpRel(er.getOp());
      String _plus_1 = (_plus + _compileOpRel);
      String _plus_2 = (_plus_1 + " ");
      String _compileExpressaoAritmetica_1 = this.compileExpressaoAritmetica(er.getRight());
      _xifexpression = (_plus_2 + _compileExpressaoAritmetica_1);
    } else {
      _xifexpression = this.compileExpressaoAritmetica(er.getLeft());
    }
    return _xifexpression;
  }

  public String compileExpressaoAritmetica(final ExpressaoAritmetica e) {
    StringConcatenation _builder = new StringConcatenation();
    String _compileTermoAritmetico = this.compileTermoAritmetico(IterableExtensions.<TermoAritmetico>head(e.getTermos()));
    _builder.append(_compileTermoAritmetico);
    {
      EList<OutroTermoAritmetico> _outros = e.getOutros();
      for(final OutroTermoAritmetico ot : _outros) {
        _builder.append(" ");
        String _op = ot.getOp();
        _builder.append(_op);
        String _compileTermoAritmetico_1 = this.compileTermoAritmetico(ot.getTermo());
        _builder.append(_compileTermoAritmetico_1);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String compileTermoAritmetico(final TermoAritmetico t) {
    StringConcatenation _builder = new StringConcatenation();
    String _compileFatorAritmetico = this.compileFatorAritmetico(IterableExtensions.<FatorAritmetico>head(t.getFatores()));
    _builder.append(_compileFatorAritmetico);
    {
      EList<OutroFatorAritmetico> _outros = t.getOutros();
      for(final OutroFatorAritmetico of : _outros) {
        _builder.append(" ");
        String _op = of.getOp();
        _builder.append(_op);
        String _compileFatorAritmetico_1 = this.compileFatorAritmetico(of.getFator());
        _builder.append(_compileFatorAritmetico_1);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String compileFatorAritmetico(final FatorAritmetico f) {
    String _xblockexpression = null;
    {
      Identificador _ref = f.getRef();
      boolean _tripleNotEquals = (_ref != null);
      if (_tripleNotEquals) {
        Identificador _ref_1 = f.getRef();
        return ((Identificador) _ref_1).getName();
      }
      ExpressaoAritmetica _exp = f.getExp();
      boolean _tripleNotEquals_1 = (_exp != null);
      if (_tripleNotEquals_1) {
        String _compileExpressaoAritmetica = this.compileExpressaoAritmetica(f.getExp());
        String _plus = ("(" + _compileExpressaoAritmetica);
        return (_plus + ")");
      }
      boolean _eIsSet = f.eIsSet(T5fPackage.Literals.FATOR_ARITMETICO__REAL);
      if (_eIsSet) {
        return f.getReal().toString();
      }
      boolean _eIsSet_1 = f.eIsSet(T5fPackage.Literals.FATOR_ARITMETICO__NUMERO);
      if (_eIsSet_1) {
        return Integer.valueOf(f.getNumero()).toString();
      }
      String _str = f.getStr();
      boolean _tripleNotEquals_2 = (_str != null);
      if (_tripleNotEquals_2) {
        return f.getStr();
      }
      _xblockexpression = "";
    }
    return _xblockexpression;
  }

  public String compileOpBool(final String op) {
    if (op != null) {
      switch (op) {
        case "e":
          return "&&";
        case "ou":
          return "||";
        default:
          return "";
      }
    } else {
      return "";
    }
  }

  public String compileOpRel(final String op) {
    String _switchResult = null;
    if (op != null) {
      switch (op) {
        case "=":
          _switchResult = "==";
          break;
        case "<>":
          _switchResult = "!=";
          break;
        default:
          _switchResult = op;
          break;
      }
    } else {
      _switchResult = op;
    }
    return _switchResult;
  }

  public String getTipoJava(final Tipo t) {
    String _switchResult = null;
    TipoEstendido _tipoExt = t.getTipoExt();
    String _basic = null;
    if (_tipoExt!=null) {
      _basic=_tipoExt.getBasic();
    }
    if (_basic != null) {
      switch (_basic) {
        case "inteiro":
          _switchResult = "int";
          break;
        case "real":
          _switchResult = "double";
          break;
        case "literal":
          _switchResult = "String";
          break;
        case "logico":
          _switchResult = "boolean";
          break;
        default:
          _switchResult = "Object";
          break;
      }
    } else {
      _switchResult = "Object";
    }
    return _switchResult;
  }

  public String getTipoLeitura(final Variavel v) {
    String _switchResult = null;
    TipoEstendido _tipoExt = v.getTipoVar().getTipoExt();
    String _basic = null;
    if (_tipoExt!=null) {
      _basic=_tipoExt.getBasic();
    }
    if (_basic != null) {
      switch (_basic) {
        case "inteiro":
          _switchResult = "sc.nextInt()";
          break;
        case "real":
          _switchResult = "sc.nextDouble()";
          break;
        case "literal":
          _switchResult = "sc.next()";
          break;
        case "logico":
          _switchResult = "sc.nextBoolean()";
          break;
        default:
          _switchResult = "sc.next()";
          break;
      }
    } else {
      _switchResult = "sc.next()";
    }
    return _switchResult;
  }

  @XbaseGenerated
  public String compileComando(final Comando c) {
    if (c instanceof ComandoAtribuicao) {
      return _compileComando((ComandoAtribuicao)c);
    } else if (c instanceof ComandoEscreva) {
      return _compileComando((ComandoEscreva)c);
    } else if (c instanceof ComandoLeia) {
      return _compileComando((ComandoLeia)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
