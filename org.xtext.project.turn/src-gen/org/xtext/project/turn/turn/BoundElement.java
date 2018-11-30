/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.turn.turn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.BoundElement#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getBoundElement()
 * @model
 * @generated
 */
public interface BoundElement extends BoundOption
{
  /**
   * Returns the value of the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' reference.
   * @see #setElem(ReferencedBoundElement)
   * @see org.xtext.project.turn.turn.TurnPackage#getBoundElement_Elem()
   * @model
   * @generated
   */
  ReferencedBoundElement getElem();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.BoundElement#getElem <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' reference.
   * @see #getElem()
   * @generated
   */
  void setElem(ReferencedBoundElement value);

} // BoundElement
