/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.turn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.project.turn.turn.ContributionContext;
import org.xtext.project.turn.turn.ContributionContextGroup;
import org.xtext.project.turn.turn.LongName;
import org.xtext.project.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution Context Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.impl.ContributionContextGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ContributionContextGroupImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ContributionContextGroupImpl#getContrib <em>Contrib</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ContributionContextGroupImpl#getContribs <em>Contribs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributionContextGroupImpl extends URNmodelElementImpl implements ContributionContextGroup
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLongName() <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongName()
   * @generated
   * @ordered
   */
  protected LongName longName;

  /**
   * The cached value of the '{@link #getContrib() <em>Contrib</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContrib()
   * @generated
   * @ordered
   */
  protected ContributionContext contrib;

  /**
   * The cached value of the '{@link #getContribs() <em>Contribs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribs()
   * @generated
   * @ordered
   */
  protected EList<ContributionContext> contribs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContributionContextGroupImpl()
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
    return TurnPackage.Literals.CONTRIBUTION_CONTEXT_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONTRIBUTION_CONTEXT_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongName getLongName()
  {
    return longName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongName(LongName newLongName, NotificationChain msgs)
  {
    LongName oldLongName = longName;
    longName = newLongName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME, oldLongName, newLongName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongName(LongName newLongName)
  {
    if (newLongName != longName)
    {
      NotificationChain msgs = null;
      if (longName != null)
        msgs = ((InternalEObject)longName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME, null, msgs);
      if (newLongName != null)
        msgs = ((InternalEObject)newLongName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME, null, msgs);
      msgs = basicSetLongName(newLongName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME, newLongName, newLongName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionContext getContrib()
  {
    if (contrib != null && contrib.eIsProxy())
    {
      InternalEObject oldContrib = (InternalEObject)contrib;
      contrib = (ContributionContext)eResolveProxy(oldContrib);
      if (contrib != oldContrib)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIB, oldContrib, contrib));
      }
    }
    return contrib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionContext basicGetContrib()
  {
    return contrib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContrib(ContributionContext newContrib)
  {
    ContributionContext oldContrib = contrib;
    contrib = newContrib;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIB, oldContrib, contrib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContributionContext> getContribs()
  {
    if (contribs == null)
    {
      contribs = new EObjectResolvingEList<ContributionContext>(ContributionContext.class, this, TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIBS);
    }
    return contribs;
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
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME:
        return basicSetLongName(null, msgs);
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
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__NAME:
        return getName();
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME:
        return getLongName();
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIB:
        if (resolve) return getContrib();
        return basicGetContrib();
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIBS:
        return getContribs();
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
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__NAME:
        setName((String)newValue);
        return;
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME:
        setLongName((LongName)newValue);
        return;
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIB:
        setContrib((ContributionContext)newValue);
        return;
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIBS:
        getContribs().clear();
        getContribs().addAll((Collection<? extends ContributionContext>)newValue);
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
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME:
        setLongName((LongName)null);
        return;
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIB:
        setContrib((ContributionContext)null);
        return;
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIBS:
        getContribs().clear();
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
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__LONG_NAME:
        return longName != null;
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIB:
        return contrib != null;
      case TurnPackage.CONTRIBUTION_CONTEXT_GROUP__CONTRIBS:
        return contribs != null && !contribs.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ContributionContextGroupImpl
