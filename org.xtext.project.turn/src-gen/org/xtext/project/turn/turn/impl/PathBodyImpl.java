/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.turn.turn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.project.turn.turn.PathBody;
import org.xtext.project.turn.turn.ReferencedEnd;
import org.xtext.project.turn.turn.RegularEnd;
import org.xtext.project.turn.turn.Stub;
import org.xtext.project.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.impl.PathBodyImpl#getPathEnd <em>Path End</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.PathBodyImpl#getReferencedEnd <em>Referenced End</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.PathBodyImpl#getReferencedStub <em>Referenced Stub</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.PathBodyImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathBodyImpl extends MinimalEObjectImpl.Container implements PathBody
{
  /**
   * The cached value of the '{@link #getPathEnd() <em>Path End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathEnd()
   * @generated
   * @ordered
   */
  protected RegularEnd pathEnd;

  /**
   * The cached value of the '{@link #getReferencedEnd() <em>Referenced End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedEnd()
   * @generated
   * @ordered
   */
  protected ReferencedEnd referencedEnd;

  /**
   * The cached value of the '{@link #getReferencedStub() <em>Referenced Stub</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedStub()
   * @generated
   * @ordered
   */
  protected Stub referencedStub;

  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathBodyImpl()
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
    return TurnPackage.Literals.PATH_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegularEnd getPathEnd()
  {
    return pathEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPathEnd(RegularEnd newPathEnd, NotificationChain msgs)
  {
    RegularEnd oldPathEnd = pathEnd;
    pathEnd = newPathEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurnPackage.PATH_BODY__PATH_END, oldPathEnd, newPathEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPathEnd(RegularEnd newPathEnd)
  {
    if (newPathEnd != pathEnd)
    {
      NotificationChain msgs = null;
      if (pathEnd != null)
        msgs = ((InternalEObject)pathEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurnPackage.PATH_BODY__PATH_END, null, msgs);
      if (newPathEnd != null)
        msgs = ((InternalEObject)newPathEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurnPackage.PATH_BODY__PATH_END, null, msgs);
      msgs = basicSetPathEnd(newPathEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.PATH_BODY__PATH_END, newPathEnd, newPathEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedEnd getReferencedEnd()
  {
    if (referencedEnd != null && referencedEnd.eIsProxy())
    {
      InternalEObject oldReferencedEnd = (InternalEObject)referencedEnd;
      referencedEnd = (ReferencedEnd)eResolveProxy(oldReferencedEnd);
      if (referencedEnd != oldReferencedEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurnPackage.PATH_BODY__REFERENCED_END, oldReferencedEnd, referencedEnd));
      }
    }
    return referencedEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferencedEnd basicGetReferencedEnd()
  {
    return referencedEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedEnd(ReferencedEnd newReferencedEnd)
  {
    ReferencedEnd oldReferencedEnd = referencedEnd;
    referencedEnd = newReferencedEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.PATH_BODY__REFERENCED_END, oldReferencedEnd, referencedEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stub getReferencedStub()
  {
    if (referencedStub != null && referencedStub.eIsProxy())
    {
      InternalEObject oldReferencedStub = (InternalEObject)referencedStub;
      referencedStub = (Stub)eResolveProxy(oldReferencedStub);
      if (referencedStub != oldReferencedStub)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurnPackage.PATH_BODY__REFERENCED_STUB, oldReferencedStub, referencedStub));
      }
    }
    return referencedStub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stub basicGetReferencedStub()
  {
    return referencedStub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedStub(Stub newReferencedStub)
  {
    Stub oldReferencedStub = referencedStub;
    referencedStub = newReferencedStub;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.PATH_BODY__REFERENCED_STUB, oldReferencedStub, referencedStub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.PATH_BODY__INDEX, oldIndex, index));
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
      case TurnPackage.PATH_BODY__PATH_END:
        return basicSetPathEnd(null, msgs);
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
      case TurnPackage.PATH_BODY__PATH_END:
        return getPathEnd();
      case TurnPackage.PATH_BODY__REFERENCED_END:
        if (resolve) return getReferencedEnd();
        return basicGetReferencedEnd();
      case TurnPackage.PATH_BODY__REFERENCED_STUB:
        if (resolve) return getReferencedStub();
        return basicGetReferencedStub();
      case TurnPackage.PATH_BODY__INDEX:
        return getIndex();
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
      case TurnPackage.PATH_BODY__PATH_END:
        setPathEnd((RegularEnd)newValue);
        return;
      case TurnPackage.PATH_BODY__REFERENCED_END:
        setReferencedEnd((ReferencedEnd)newValue);
        return;
      case TurnPackage.PATH_BODY__REFERENCED_STUB:
        setReferencedStub((Stub)newValue);
        return;
      case TurnPackage.PATH_BODY__INDEX:
        setIndex((Integer)newValue);
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
      case TurnPackage.PATH_BODY__PATH_END:
        setPathEnd((RegularEnd)null);
        return;
      case TurnPackage.PATH_BODY__REFERENCED_END:
        setReferencedEnd((ReferencedEnd)null);
        return;
      case TurnPackage.PATH_BODY__REFERENCED_STUB:
        setReferencedStub((Stub)null);
        return;
      case TurnPackage.PATH_BODY__INDEX:
        setIndex(INDEX_EDEFAULT);
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
      case TurnPackage.PATH_BODY__PATH_END:
        return pathEnd != null;
      case TurnPackage.PATH_BODY__REFERENCED_END:
        return referencedEnd != null;
      case TurnPackage.PATH_BODY__REFERENCED_STUB:
        return referencedStub != null;
      case TurnPackage.PATH_BODY__INDEX:
        return index != INDEX_EDEFAULT;
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
    result.append(" (index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //PathBodyImpl
