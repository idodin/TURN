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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.turn.turn.ConcreteStrategy;
import org.xtext.project.turn.turn.Evaluation;
import org.xtext.project.turn.turn.EvaluationStrategy;
import org.xtext.project.turn.turn.LongName;
import org.xtext.project.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.impl.EvaluationStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.EvaluationStrategyImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.EvaluationStrategyImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.EvaluationStrategyImpl#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.EvaluationStrategyImpl#getIncludedStrategy <em>Included Strategy</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.EvaluationStrategyImpl#getIncludedStrategies <em>Included Strategies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationStrategyImpl extends URNmodelElementImpl implements EvaluationStrategy
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
   * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfo()
   * @generated
   * @ordered
   */
  protected ConcreteStrategy info;

  /**
   * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluations()
   * @generated
   * @ordered
   */
  protected EList<Evaluation> evaluations;

  /**
   * The cached value of the '{@link #getIncludedStrategy() <em>Included Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedStrategy()
   * @generated
   * @ordered
   */
  protected EvaluationStrategy includedStrategy;

  /**
   * The cached value of the '{@link #getIncludedStrategies() <em>Included Strategies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedStrategies()
   * @generated
   * @ordered
   */
  protected EList<EvaluationStrategy> includedStrategies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluationStrategyImpl()
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
    return TurnPackage.Literals.EVALUATION_STRATEGY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.EVALUATION_STRATEGY__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurnPackage.EVALUATION_STRATEGY__LONG_NAME, oldLongName, newLongName);
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
        msgs = ((InternalEObject)longName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurnPackage.EVALUATION_STRATEGY__LONG_NAME, null, msgs);
      if (newLongName != null)
        msgs = ((InternalEObject)newLongName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurnPackage.EVALUATION_STRATEGY__LONG_NAME, null, msgs);
      msgs = basicSetLongName(newLongName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.EVALUATION_STRATEGY__LONG_NAME, newLongName, newLongName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteStrategy getInfo()
  {
    return info;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfo(ConcreteStrategy newInfo, NotificationChain msgs)
  {
    ConcreteStrategy oldInfo = info;
    info = newInfo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TurnPackage.EVALUATION_STRATEGY__INFO, oldInfo, newInfo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfo(ConcreteStrategy newInfo)
  {
    if (newInfo != info)
    {
      NotificationChain msgs = null;
      if (info != null)
        msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TurnPackage.EVALUATION_STRATEGY__INFO, null, msgs);
      if (newInfo != null)
        msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TurnPackage.EVALUATION_STRATEGY__INFO, null, msgs);
      msgs = basicSetInfo(newInfo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.EVALUATION_STRATEGY__INFO, newInfo, newInfo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Evaluation> getEvaluations()
  {
    if (evaluations == null)
    {
      evaluations = new EObjectContainmentEList<Evaluation>(Evaluation.class, this, TurnPackage.EVALUATION_STRATEGY__EVALUATIONS);
    }
    return evaluations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategy getIncludedStrategy()
  {
    if (includedStrategy != null && includedStrategy.eIsProxy())
    {
      InternalEObject oldIncludedStrategy = (InternalEObject)includedStrategy;
      includedStrategy = (EvaluationStrategy)eResolveProxy(oldIncludedStrategy);
      if (includedStrategy != oldIncludedStrategy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGY, oldIncludedStrategy, includedStrategy));
      }
    }
    return includedStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationStrategy basicGetIncludedStrategy()
  {
    return includedStrategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludedStrategy(EvaluationStrategy newIncludedStrategy)
  {
    EvaluationStrategy oldIncludedStrategy = includedStrategy;
    includedStrategy = newIncludedStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGY, oldIncludedStrategy, includedStrategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EvaluationStrategy> getIncludedStrategies()
  {
    if (includedStrategies == null)
    {
      includedStrategies = new EObjectResolvingEList<EvaluationStrategy>(EvaluationStrategy.class, this, TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES);
    }
    return includedStrategies;
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
      case TurnPackage.EVALUATION_STRATEGY__LONG_NAME:
        return basicSetLongName(null, msgs);
      case TurnPackage.EVALUATION_STRATEGY__INFO:
        return basicSetInfo(null, msgs);
      case TurnPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return ((InternalEList<?>)getEvaluations()).basicRemove(otherEnd, msgs);
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
      case TurnPackage.EVALUATION_STRATEGY__NAME:
        return getName();
      case TurnPackage.EVALUATION_STRATEGY__LONG_NAME:
        return getLongName();
      case TurnPackage.EVALUATION_STRATEGY__INFO:
        return getInfo();
      case TurnPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return getEvaluations();
      case TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGY:
        if (resolve) return getIncludedStrategy();
        return basicGetIncludedStrategy();
      case TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES:
        return getIncludedStrategies();
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
      case TurnPackage.EVALUATION_STRATEGY__NAME:
        setName((String)newValue);
        return;
      case TurnPackage.EVALUATION_STRATEGY__LONG_NAME:
        setLongName((LongName)newValue);
        return;
      case TurnPackage.EVALUATION_STRATEGY__INFO:
        setInfo((ConcreteStrategy)newValue);
        return;
      case TurnPackage.EVALUATION_STRATEGY__EVALUATIONS:
        getEvaluations().clear();
        getEvaluations().addAll((Collection<? extends Evaluation>)newValue);
        return;
      case TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGY:
        setIncludedStrategy((EvaluationStrategy)newValue);
        return;
      case TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES:
        getIncludedStrategies().clear();
        getIncludedStrategies().addAll((Collection<? extends EvaluationStrategy>)newValue);
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
      case TurnPackage.EVALUATION_STRATEGY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TurnPackage.EVALUATION_STRATEGY__LONG_NAME:
        setLongName((LongName)null);
        return;
      case TurnPackage.EVALUATION_STRATEGY__INFO:
        setInfo((ConcreteStrategy)null);
        return;
      case TurnPackage.EVALUATION_STRATEGY__EVALUATIONS:
        getEvaluations().clear();
        return;
      case TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGY:
        setIncludedStrategy((EvaluationStrategy)null);
        return;
      case TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES:
        getIncludedStrategies().clear();
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
      case TurnPackage.EVALUATION_STRATEGY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TurnPackage.EVALUATION_STRATEGY__LONG_NAME:
        return longName != null;
      case TurnPackage.EVALUATION_STRATEGY__INFO:
        return info != null;
      case TurnPackage.EVALUATION_STRATEGY__EVALUATIONS:
        return evaluations != null && !evaluations.isEmpty();
      case TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGY:
        return includedStrategy != null;
      case TurnPackage.EVALUATION_STRATEGY__INCLUDED_STRATEGIES:
        return includedStrategies != null && !includedStrategies.isEmpty();
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

} //EvaluationStrategyImpl