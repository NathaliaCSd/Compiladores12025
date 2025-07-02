// Generated from c:/UFSCar/Compiladores/T1/Compiladores12025/T5/t5-ger/src/main/antlr4/br/ufscar/dc/compiladores/t5/ger/T5.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link T5Parser}.
 */
public interface T5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link T5Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(T5Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(T5Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(T5Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(T5Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(T5Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(T5Parser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(T5Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(T5Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(T5Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(T5Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(T5Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(T5Parser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(T5Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(T5Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(T5Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(T5Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(T5Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(T5Parser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(T5Parser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(T5Parser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(T5Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(T5Parser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(T5Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(T5Parser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(T5Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(T5Parser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(T5Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(T5Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(T5Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(T5Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(T5Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(T5Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(T5Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(T5Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(T5Parser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(T5Parser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(T5Parser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(T5Parser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(T5Parser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(T5Parser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(T5Parser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(T5Parser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(T5Parser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(T5Parser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(T5Parser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(T5Parser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(T5Parser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(T5Parser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(T5Parser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(T5Parser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(T5Parser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(T5Parser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(T5Parser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(T5Parser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(T5Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(T5Parser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(T5Parser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(T5Parser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(T5Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(T5Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(T5Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(T5Parser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(T5Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(T5Parser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(T5Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(T5Parser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(T5Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(T5Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(T5Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(T5Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(T5Parser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(T5Parser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(T5Parser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(T5Parser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(T5Parser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(T5Parser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(T5Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(T5Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(T5Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(T5Parser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(T5Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(T5Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(T5Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(T5Parser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(T5Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(T5Parser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(T5Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(T5Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(T5Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(T5Parser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(T5Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(T5Parser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(T5Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(T5Parser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(T5Parser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(T5Parser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link T5Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(T5Parser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link T5Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(T5Parser.Op_logico_2Context ctx);
}