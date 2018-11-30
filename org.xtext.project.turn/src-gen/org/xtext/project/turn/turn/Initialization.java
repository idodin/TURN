/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.turn.turn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.Initialization#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getInitialization()
 * @model
 * @generated
 */
public interface Initialization extends URNmodelElement
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see org.xtext.project.turn.turn.TurnPackage#getInitialization_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.Initialization#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // Initialization
