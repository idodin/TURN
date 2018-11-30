/**
 * generated by Xtext 2.15.0
 */
package org.xtext.project.turn.turn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Mmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.project.turn.turn.UCMmap#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.UCMmap#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.UCMmap#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.UCMmap#getStubs <em>Stubs</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.UCMmap#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.xtext.project.turn.turn.UCMmap#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.xtext.project.turn.turn.TurnPackage#getUCMmap()
 * @model
 * @generated
 */
public interface UCMmap extends URNmodelElement
{
  /**
   * Returns the value of the '<em><b>Singleton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Singleton</em>' attribute.
   * @see #setSingleton(boolean)
   * @see org.xtext.project.turn.turn.TurnPackage#getUCMmap_Singleton()
   * @model
   * @generated
   */
  boolean isSingleton();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.UCMmap#isSingleton <em>Singleton</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Singleton</em>' attribute.
   * @see #isSingleton()
   * @generated
   */
  void setSingleton(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.project.turn.turn.TurnPackage#getUCMmap_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.UCMmap#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Long Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Name</em>' containment reference.
   * @see #setLongName(LongName)
   * @see org.xtext.project.turn.turn.TurnPackage#getUCMmap_LongName()
   * @model containment="true"
   * @generated
   */
  LongName getLongName();

  /**
   * Sets the value of the '{@link org.xtext.project.turn.turn.UCMmap#getLongName <em>Long Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Name</em>' containment reference.
   * @see #getLongName()
   * @generated
   */
  void setLongName(LongName value);

  /**
   * Returns the value of the '<em><b>Stubs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.StubDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stubs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stubs</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getUCMmap_Stubs()
   * @model containment="true"
   * @generated
   */
  EList<StubDeclaration> getStubs();

  /**
   * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.Path}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paths</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paths</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getUCMmap_Paths()
   * @model containment="true"
   * @generated
   */
  EList<Path> getPaths();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.project.turn.turn.ComponentRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.project.turn.turn.TurnPackage#getUCMmap_Components()
   * @model containment="true"
   * @generated
   */
  EList<ComponentRef> getComponents();

} // UCMmap
