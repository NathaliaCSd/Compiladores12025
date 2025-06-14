/**
 * generated by Xtext 2.39.0
 */
package br.ufscar.dc.compiladores.t5.t5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comando Para</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.ComandoPara#getVar <em>Var</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.ComandoPara#getInicio <em>Inicio</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.ComandoPara#getFim <em>Fim</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.ComandoPara#getComandos <em>Comandos</em>}</li>
 * </ul>
 *
 * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getComandoPara()
 * @model
 * @generated
 */
public interface ComandoPara extends Comando
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getComandoPara_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.t5.t5.ComandoPara#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>Inicio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inicio</em>' containment reference.
   * @see #setInicio(ExpressaoAritmetica)
   * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getComandoPara_Inicio()
   * @model containment="true"
   * @generated
   */
  ExpressaoAritmetica getInicio();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.t5.t5.ComandoPara#getInicio <em>Inicio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inicio</em>' containment reference.
   * @see #getInicio()
   * @generated
   */
  void setInicio(ExpressaoAritmetica value);

  /**
   * Returns the value of the '<em><b>Fim</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fim</em>' containment reference.
   * @see #setFim(ExpressaoAritmetica)
   * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getComandoPara_Fim()
   * @model containment="true"
   * @generated
   */
  ExpressaoAritmetica getFim();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.t5.t5.ComandoPara#getFim <em>Fim</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fim</em>' containment reference.
   * @see #getFim()
   * @generated
   */
  void setFim(ExpressaoAritmetica value);

  /**
   * Returns the value of the '<em><b>Comandos</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.dc.compiladores.t5.t5.Comando}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comandos</em>' containment reference list.
   * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getComandoPara_Comandos()
   * @model containment="true"
   * @generated
   */
  EList<Comando> getComandos();

} // ComandoPara
