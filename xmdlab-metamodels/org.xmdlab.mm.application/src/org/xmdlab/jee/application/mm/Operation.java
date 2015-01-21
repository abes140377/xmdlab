/**
 */
package org.xmdlab.jee.application.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.Operation#getThrows <em>Throws</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Operation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Operation#getPublish <em>Publish</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends DomainObjectTypedElement
{
	/**
	 * Returns the value of the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' attribute.
	 * @see #setThrows(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getOperation_Throws()
	 * @model
	 * @generated
	 */
	String getThrows();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Operation#getThrows <em>Throws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' attribute.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getOperation_Visibility()
	 * @model
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Operation#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Publish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish</em>' reference.
	 * @see #setPublish(Publish)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getOperation_Publish()
	 * @model
	 * @generated
	 */
	Publish getPublish();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Operation#getPublish <em>Publish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish</em>' reference.
	 * @see #getPublish()
	 * @generated
	 */
	void setPublish(Publish value);

} // Operation
