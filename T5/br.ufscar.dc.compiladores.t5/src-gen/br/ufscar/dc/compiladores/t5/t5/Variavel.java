/**
 * generated by Xtext 2.39.0
 */
package br.ufscar.dc.compiladores.t5.t5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variavel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.Variavel#getId <em>Id</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.Variavel#getTipoVar <em>Tipo Var</em>}</li>
 * </ul>
 *
 * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getVariavel()
 * @model
 * @generated
 */
public interface Variavel extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Identificador)
   * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getVariavel_Id()
   * @model containment="true"
   * @generated
   */
  Identificador getId();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.t5.t5.Variavel#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identificador value);

  /**
   * Returns the value of the '<em><b>Tipo Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Var</em>' containment reference.
   * @see #setTipoVar(Tipo)
   * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getVariavel_TipoVar()
   * @model containment="true"
   * @generated
   */
  Tipo getTipoVar();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.t5.t5.Variavel#getTipoVar <em>Tipo Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Var</em>' containment reference.
   * @see #getTipoVar()
   * @generated
   */
  void setTipoVar(Tipo value);

} // Variavel
