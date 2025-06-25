// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t5.ger;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link T5Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface T5Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link T5Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(T5Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(T5Parser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(T5Parser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(T5Parser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(T5Parser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(T5Parser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(T5Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(T5Parser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(T5Parser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(T5Parser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(T5Parser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(T5Parser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(T5Parser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(T5Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(T5Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(T5Parser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(T5Parser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(T5Parser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(T5Parser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(T5Parser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(T5Parser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(T5Parser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(T5Parser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(T5Parser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(T5Parser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(T5Parser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(T5Parser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(T5Parser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(T5Parser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(T5Parser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(T5Parser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(T5Parser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(T5Parser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(T5Parser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(T5Parser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(T5Parser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(T5Parser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(T5Parser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(T5Parser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(T5Parser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(T5Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(T5Parser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(T5Parser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(T5Parser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(T5Parser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(T5Parser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(T5Parser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(T5Parser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link T5Parser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(T5Parser.Op_logico_2Context ctx);
}