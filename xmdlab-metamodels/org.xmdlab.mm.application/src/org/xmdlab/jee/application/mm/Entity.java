/**
 */
package org.xmdlab.jee.application.mm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.Entity#isAuditable <em>Auditable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DomainObject
{
	/**
	 * Returns the value of the '<em><b>Auditable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditable</em>' attribute.
	 * @see #setAuditable(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getEntity_Auditable()
	 * @model default="true"
	 * @generated
	 */
	boolean isAuditable();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Entity#isAuditable <em>Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditable</em>' attribute.
	 * @see #isAuditable()
	 * @generated
	 */
	void setAuditable(boolean value);

} // Entity
