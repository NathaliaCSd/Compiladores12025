/**
 * generated by Xtext 2.39.0
 */
package br.ufscar.dc.compiladores.t5.t5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.Parametro#getIds <em>Ids</em>}</li>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.Parametro#getTipoParam <em>Tipo Param</em>}</li>
 * </ul>
 *
 * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getParametro()
 * @model
 * @generated
 */
public interface Parametro extends EObject
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' containment reference list.
   * The list contents are of type {@link br.ufscar.dc.compiladores.t5.t5.Identificador}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' containment reference list.
   * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getParametro_Ids()
   * @model containment="true"
   * @generated
   */
  EList<Identificador> getIds();

  /**
   * Returns the value of the '<em><b>Tipo Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Param</em>' containment reference.
   * @see #setTipoParam(TipoEstendido)
   * @see br.ufscar.dc.compiladores.t5.t5.T5Package#getParametro_TipoParam()
   * @model containment="true"
   * @generated
   */
  TipoEstendido getTipoParam();

  /**
   * Sets the value of the '{@link br.ufscar.dc.compiladores.t5.t5.Parametro#getTipoParam <em>Tipo Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Param</em>' containment reference.
   * @see #getTipoParam()
   * @generated
   */
  void setTipoParam(TipoEstendido value);

} // Parametro
