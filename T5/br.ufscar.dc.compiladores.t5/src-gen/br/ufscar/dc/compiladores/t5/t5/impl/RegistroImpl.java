/**
 * generated by Xtext 2.39.0
 */
package br.ufscar.dc.compiladores.t5.t5.impl;

import br.ufscar.dc.compiladores.t5.t5.Registro;
import br.ufscar.dc.compiladores.t5.t5.T5Package;
import br.ufscar.dc.compiladores.t5.t5.Variavel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufscar.dc.compiladores.t5.t5.impl.RegistroImpl#getCampos <em>Campos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistroImpl extends MinimalEObjectImpl.Container implements Registro
{
  /**
   * The cached value of the '{@link #getCampos() <em>Campos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCampos()
   * @generated
   * @ordered
   */
  protected EList<Variavel> campos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegistroImpl()
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
    return T5Package.Literals.REGISTRO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variavel> getCampos()
  {
    if (campos == null)
    {
      campos = new EObjectContainmentEList<Variavel>(Variavel.class, this, T5Package.REGISTRO__CAMPOS);
    }
    return campos;
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
      case T5Package.REGISTRO__CAMPOS:
        return ((InternalEList<?>)getCampos()).basicRemove(otherEnd, msgs);
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
      case T5Package.REGISTRO__CAMPOS:
        return getCampos();
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
      case T5Package.REGISTRO__CAMPOS:
        getCampos().clear();
        getCampos().addAll((Collection<? extends Variavel>)newValue);
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
      case T5Package.REGISTRO__CAMPOS:
        getCampos().clear();
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
      case T5Package.REGISTRO__CAMPOS:
        return campos != null && !campos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RegistroImpl
