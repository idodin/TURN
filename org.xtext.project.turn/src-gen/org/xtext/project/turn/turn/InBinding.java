/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.turn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.InBinding#getMapStart <em>Map Start</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.InBinding#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getInBinding()
 * @model
 * @generated
 */
public interface InBinding extends Binding
{
  /**
   * Returns the value of the '<em><b>Map Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Start</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Start</em>' reference.
   * @see #setMapStart(StartPoint)
   * @see org.xtext.project.turn.turn.TurnPackage#getInBinding_MapStart()
   * @model
   * @generated
   */
  StartPoint getMapStart();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.InBinding#getMapStart <em>Map Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Start</em>' reference.
   * @see #getMapStart()
   * @generated
   */
  void setMapStart(StartPoint value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see org.xtext.project.turn.turn.TurnPackage#getInBinding_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.InBinding#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

} // InBinding
