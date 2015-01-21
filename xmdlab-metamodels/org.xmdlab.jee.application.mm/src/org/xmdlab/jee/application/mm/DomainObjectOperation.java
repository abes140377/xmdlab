/**
 */
package org.xmdlab.jee.application.mm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObjectOperation#getDomainObject <em>Domain Object</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.DomainObjectOperation#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObjectOperation()
 * @model
 * @generated
 */
public interface DomainObjectOperation extends Operation
{
	/**
	 * Returns the value of the '<em><b>Domain Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.DomainObject#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object</em>' container reference.
	 * @see #setDomainObject(DomainObject)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObjectOperation_DomainObject()
	 * @see org.xmdlab.jee.application.mm.DomainObject#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	DomainObject getDomainObject();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObjectOperation#getDomainObject <em>Domain Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object</em>' container reference.
	 * @see #getDomainObject()
	 * @generated
	 */
	void setDomainObject(DomainObject value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getDomainObjectOperation_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.DomainObjectOperation#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

} // DomainObjectOperation
