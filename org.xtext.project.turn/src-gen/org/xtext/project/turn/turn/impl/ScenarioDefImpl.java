/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.turn.turn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.project.turn.turn.Condition;
import org.xtext.project.turn.turn.EndPoint;
import org.xtext.project.turn.turn.Initialization;
import org.xtext.project.turn.turn.ScenarioDef;
import org.xtext.project.turn.turn.StartPoint;
import org.xtext.project.turn.turn.TurnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getPreconditions <em>Preconditions</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getPostconditions <em>Postconditions</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getInitialize <em>Initialize</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getStartPoint <em>Start Point</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getStartPoints <em>Start Points</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getEndPoints <em>End Points</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getIncludedScenario <em>Included Scenario</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.impl.ScenarioDefImpl#getIncludedScenarios <em>Included Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioDefImpl extends MinimalEObjectImpl.Container implements ScenarioDef
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
   * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreconditions()
   * @generated
   * @ordered
   */
  protected EList<Condition> preconditions;

  /**
   * The cached value of the '{@link #getPostconditions() <em>Postconditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostconditions()
   * @generated
   * @ordered
   */
  protected EList<Condition> postconditions;

  /**
   * The cached value of the '{@link #getInitialize() <em>Initialize</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialize()
   * @generated
   * @ordered
   */
  protected EList<Initialization> initialize;

  /**
   * The cached value of the '{@link #getStartPoint() <em>Start Point</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartPoint()
   * @generated
   * @ordered
   */
  protected EList<StartPoint> startPoint;

  /**
   * The cached value of the '{@link #getStartPoints() <em>Start Points</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartPoints()
   * @generated
   * @ordered
   */
  protected EList<StartPoint> startPoints;

  /**
   * The cached value of the '{@link #getEndPoints() <em>End Points</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndPoints()
   * @generated
   * @ordered
   */
  protected EList<EndPoint> endPoints;

  /**
   * The cached value of the '{@link #getIncludedScenario() <em>Included Scenario</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedScenario()
   * @generated
   * @ordered
   */
  protected EList<ScenarioDef> includedScenario;

  /**
   * The cached value of the '{@link #getIncludedScenarios() <em>Included Scenarios</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedScenarios()
   * @generated
   * @ordered
   */
  protected EList<ScenarioDef> includedScenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioDefImpl()
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
    return TurnPackage.Literals.SCENARIO_DEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TurnPackage.SCENARIO_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getPreconditions()
  {
    if (preconditions == null)
    {
      preconditions = new EObjectContainmentEList<Condition>(Condition.class, this, TurnPackage.SCENARIO_DEF__PRECONDITIONS);
    }
    return preconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getPostconditions()
  {
    if (postconditions == null)
    {
      postconditions = new EObjectContainmentEList<Condition>(Condition.class, this, TurnPackage.SCENARIO_DEF__POSTCONDITIONS);
    }
    return postconditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Initialization> getInitialize()
  {
    if (initialize == null)
    {
      initialize = new EObjectContainmentEList<Initialization>(Initialization.class, this, TurnPackage.SCENARIO_DEF__INITIALIZE);
    }
    return initialize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StartPoint> getStartPoint()
  {
    if (startPoint == null)
    {
      startPoint = new EObjectResolvingEList<StartPoint>(StartPoint.class, this, TurnPackage.SCENARIO_DEF__START_POINT);
    }
    return startPoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StartPoint> getStartPoints()
  {
    if (startPoints == null)
    {
      startPoints = new EObjectResolvingEList<StartPoint>(StartPoint.class, this, TurnPackage.SCENARIO_DEF__START_POINTS);
    }
    return startPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EndPoint> getEndPoints()
  {
    if (endPoints == null)
    {
      endPoints = new EObjectResolvingEList<EndPoint>(EndPoint.class, this, TurnPackage.SCENARIO_DEF__END_POINTS);
    }
    return endPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScenarioDef> getIncludedScenario()
  {
    if (includedScenario == null)
    {
      includedScenario = new EObjectResolvingEList<ScenarioDef>(ScenarioDef.class, this, TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIO);
    }
    return includedScenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScenarioDef> getIncludedScenarios()
  {
    if (includedScenarios == null)
    {
      includedScenarios = new EObjectResolvingEList<ScenarioDef>(ScenarioDef.class, this, TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIOS);
    }
    return includedScenarios;
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
      case TurnPackage.SCENARIO_DEF__PRECONDITIONS:
        return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
      case TurnPackage.SCENARIO_DEF__POSTCONDITIONS:
        return ((InternalEList<?>)getPostconditions()).basicRemove(otherEnd, msgs);
      case TurnPackage.SCENARIO_DEF__INITIALIZE:
        return ((InternalEList<?>)getInitialize()).basicRemove(otherEnd, msgs);
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
      case TurnPackage.SCENARIO_DEF__NAME:
        return getName();
      case TurnPackage.SCENARIO_DEF__PRECONDITIONS:
        return getPreconditions();
      case TurnPackage.SCENARIO_DEF__POSTCONDITIONS:
        return getPostconditions();
      case TurnPackage.SCENARIO_DEF__INITIALIZE:
        return getInitialize();
      case TurnPackage.SCENARIO_DEF__START_POINT:
        return getStartPoint();
      case TurnPackage.SCENARIO_DEF__START_POINTS:
        return getStartPoints();
      case TurnPackage.SCENARIO_DEF__END_POINTS:
        return getEndPoints();
      case TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIO:
        return getIncludedScenario();
      case TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIOS:
        return getIncludedScenarios();
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
      case TurnPackage.SCENARIO_DEF__NAME:
        setName((String)newValue);
        return;
      case TurnPackage.SCENARIO_DEF__PRECONDITIONS:
        getPreconditions().clear();
        getPreconditions().addAll((Collection<? extends Condition>)newValue);
        return;
      case TurnPackage.SCENARIO_DEF__POSTCONDITIONS:
        getPostconditions().clear();
        getPostconditions().addAll((Collection<? extends Condition>)newValue);
        return;
      case TurnPackage.SCENARIO_DEF__INITIALIZE:
        getInitialize().clear();
        getInitialize().addAll((Collection<? extends Initialization>)newValue);
        return;
      case TurnPackage.SCENARIO_DEF__START_POINT:
        getStartPoint().clear();
        getStartPoint().addAll((Collection<? extends StartPoint>)newValue);
        return;
      case TurnPackage.SCENARIO_DEF__START_POINTS:
        getStartPoints().clear();
        getStartPoints().addAll((Collection<? extends StartPoint>)newValue);
        return;
      case TurnPackage.SCENARIO_DEF__END_POINTS:
        getEndPoints().clear();
        getEndPoints().addAll((Collection<? extends EndPoint>)newValue);
        return;
      case TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIO:
        getIncludedScenario().clear();
        getIncludedScenario().addAll((Collection<? extends ScenarioDef>)newValue);
        return;
      case TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIOS:
        getIncludedScenarios().clear();
        getIncludedScenarios().addAll((Collection<? extends ScenarioDef>)newValue);
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
      case TurnPackage.SCENARIO_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TurnPackage.SCENARIO_DEF__PRECONDITIONS:
        getPreconditions().clear();
        return;
      case TurnPackage.SCENARIO_DEF__POSTCONDITIONS:
        getPostconditions().clear();
        return;
      case TurnPackage.SCENARIO_DEF__INITIALIZE:
        getInitialize().clear();
        return;
      case TurnPackage.SCENARIO_DEF__START_POINT:
        getStartPoint().clear();
        return;
      case TurnPackage.SCENARIO_DEF__START_POINTS:
        getStartPoints().clear();
        return;
      case TurnPackage.SCENARIO_DEF__END_POINTS:
        getEndPoints().clear();
        return;
      case TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIO:
        getIncludedScenario().clear();
        return;
      case TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIOS:
        getIncludedScenarios().clear();
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
      case TurnPackage.SCENARIO_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TurnPackage.SCENARIO_DEF__PRECONDITIONS:
        return preconditions != null && !preconditions.isEmpty();
      case TurnPackage.SCENARIO_DEF__POSTCONDITIONS:
        return postconditions != null && !postconditions.isEmpty();
      case TurnPackage.SCENARIO_DEF__INITIALIZE:
        return initialize != null && !initialize.isEmpty();
      case TurnPackage.SCENARIO_DEF__START_POINT:
        return startPoint != null && !startPoint.isEmpty();
      case TurnPackage.SCENARIO_DEF__START_POINTS:
        return startPoints != null && !startPoints.isEmpty();
      case TurnPackage.SCENARIO_DEF__END_POINTS:
        return endPoints != null && !endPoints.isEmpty();
      case TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIO:
        return includedScenario != null && !includedScenario.isEmpty();
      case TurnPackage.SCENARIO_DEF__INCLUDED_SCENARIOS:
        return includedScenarios != null && !includedScenarios.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ScenarioDefImpl