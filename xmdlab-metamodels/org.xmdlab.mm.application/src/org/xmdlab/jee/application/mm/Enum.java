/**
 */
package org.xmdlab.jee.application.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.Enum#getValues <em>Values</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Enum#isOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends DomainObject
{
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getEnum_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumValue> getValues();

	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal</em>' attribute.
	 * @see #setOrdinal(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getEnum_Ordinal()
	 * @model
	 * @generated
	 */
	boolean isOrdinal();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Enum#isOrdinal <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal</em>' attribute.
	 * @see #isOrdinal()
	 * @generated
	 */
	void setOrdinal(boolean value);

} // Enum
