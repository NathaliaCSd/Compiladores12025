/**
 * generated by Xtext 2.39.0
 */
package br.ufscar.dc.compiladores.t5.t5.impl;

import br.ufscar.dc.compiladores.t5.t5.ComandoEscreva;
import br.ufscar.dc.compiladores.t5.t5.Expressao;
import br.ufscar.dc.compiladores.t5.t5.T5Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comando Escreva</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.impl.ComandoEscrevaImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComandoEscrevaImpl extends ComandoImpl implements ComandoEscreva
{
  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected EList<Expressao> exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComandoEscrevaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return T5Package.Literals.COMANDO_ESCREVA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expressao> getExp()
  {
    if (exp == null)
    {
      exp = new EObjectContainmentEList<Expressao>(Expressao.class, this, T5Package.COMANDO_ESCREVA__EXP);
    }
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case T5Package.COMANDO_ESCREVA__EXP:
        return ((InternalEList<?>)getExp()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case T5Package.COMANDO_ESCREVA__EXP:
        return getExp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case T5Package.COMANDO_ESCREVA__EXP:
        getExp().clear();
        getExp().addAll((Collection<? extends Expressao>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case T5Package.COMANDO_ESCREVA__EXP:
        getExp().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case T5Package.COMANDO_ESCREVA__EXP:
        return exp != null && !exp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComandoEscrevaImpl
