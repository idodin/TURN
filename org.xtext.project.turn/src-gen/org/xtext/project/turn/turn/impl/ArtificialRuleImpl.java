/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.turn.turn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.project.turn.turn.ArtificialRule;
import org.xtext.project.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artificial Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.impl.ArtificialRuleImpl#getLongName <em>Long Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtificialRuleImpl extends URNmodelElementImpl implements ArtificialRule
{
  /**
   * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongName()
   * @generated
   * @ordered
   */
  protected static final String LONG_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongName()
   * @generated
   * @ordered
   */
  protected String longName = LONG_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtificialRuleImpl()
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
    return TurnPackage.Literals.ARTIFICIAL_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLongName()
  {
    return longName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongName(String newLongName)
  {
    String oldLongName = longName;
    longName = newLongName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.ARTIFICIAL_RULE__LONG_NAME, oldLongName, longName));
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
      case TurnPackage.ARTIFICIAL_RULE__LONG_NAME:
        return getLongName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TurnPackage.ARTIFICIAL_RULE__LONG_NAME:
        setLongName((String)newValue);
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
      case TurnPackage.ARTIFICIAL_RULE__LONG_NAME:
        setLongName(LONG_NAME_EDEFAULT);
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
      case TurnPackage.ARTIFICIAL_RULE__LONG_NAME:
        return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (longName: ");
    result.append(longName);
    result.append(')');
    return result.toString();
  }

} //ArtificialRuleImpl
