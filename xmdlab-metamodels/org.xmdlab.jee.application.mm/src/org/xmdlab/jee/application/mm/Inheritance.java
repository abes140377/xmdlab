/**
 */
package org.xmdlab.jee.application.mm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorColumnName <em>Discriminator Column Name</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Inheritance#getType <em>Type</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorType <em>Discriminator Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends EObject
{
	/**
	 * Returns the value of the '<em><b>Discriminator Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Column Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column Name</em>' attribute.
	 * @see #setDiscriminatorColumnName(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getInheritance_DiscriminatorColumnName()
	 * @model
	 * @generated
	 */
	String getDiscriminatorColumnName();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorColumnName <em>Discriminator Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column Name</em>' attribute.
	 * @see #getDiscriminatorColumnName()
	 * @generated
	 */
	void setDiscriminatorColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Discriminator Column Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Column Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Column Length</em>' attribute.
	 * @see #setDiscriminatorColumnLength(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getInheritance_DiscriminatorColumnLength()
	 * @model
	 * @generated
	 */
	String getDiscriminatorColumnLength();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Column Length</em>' attribute.
	 * @see #getDiscriminatorColumnLength()
	 * @generated
	 */
	void setDiscriminatorColumnLength(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xmdlab.jee.application.mm.InheritanceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.xmdlab.jee.application.mm.InheritanceType
	 * @see #setType(InheritanceType)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getInheritance_Type()
	 * @model
	 * @generated
	 */
	InheritanceType getType();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Inheritance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.xmdlab.jee.application.mm.InheritanceType
	 * @see #getType()
	 * @generated
	 */
	void setType(InheritanceType value);

	/**
	 * Returns the value of the '<em><b>Discriminator Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.xmdlab.jee.application.mm.DiscriminatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator Type</em>' attribute.
	 * @see org.xmdlab.jee.application.mm.DiscriminatorType
	 * @see #setDiscriminatorType(DiscriminatorType)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getInheritance_DiscriminatorType()
	 * @model
	 * @generated
	 */
	DiscriminatorType getDiscriminatorType();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Inheritance#getDiscriminatorType <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator Type</em>' attribute.
	 * @see org.xmdlab.jee.application.mm.DiscriminatorType
	 * @see #getDiscriminatorType()
	 * @generated
	 */
	void setDiscriminatorType(DiscriminatorType value);

} // Inheritance
