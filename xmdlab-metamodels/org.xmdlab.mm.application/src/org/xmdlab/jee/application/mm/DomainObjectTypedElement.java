/**
 */
package org.xmdlab.jee.application.mm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObjectTypedElement#getDomainObjectType <em>Domain Object Type</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObjectTypedElement#getMapKeyDomainObjectType <em>Map Key Domain Object Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObjectTypedElement()
 * @model
 * @generated
 */
public interface DomainObjectTypedElement extends TypedElement
{
	/**
	 * Returns the value of the '<em><b>Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Object Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Type</em>' reference.
	 * @see #setDomainObjectType(DomainObject)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObjectTypedElement_DomainObjectType()
	 * @model
	 * @generated
	 */
	DomainObject getDomainObjectType();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObjectTypedElement#getDomainObjectType <em>Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object Type</em>' reference.
	 * @see #getDomainObjectType()
	 * @generated
	 */
	void setDomainObjectType(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Map Key Domain Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Key Domain Object Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Key Domain Object Type</em>' reference.
	 * @see #setMapKeyDomainObjectType(DomainObject)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObjectTypedElement_MapKeyDomainObjectType()
	 * @model
	 * @generated
	 */
	DomainObject getMapKeyDomainObjectType();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObjectTypedElement#getMapKeyDomainObjectType <em>Map Key Domain Object Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Key Domain Object Type</em>' reference.
	 * @see #getMapKeyDomainObjectType()
	 * @generated
	 */
	void setMapKeyDomainObjectType(DomainObject value);

} // DomainObjectTypedElement
