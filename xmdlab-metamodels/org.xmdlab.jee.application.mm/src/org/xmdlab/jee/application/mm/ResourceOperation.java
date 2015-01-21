/**
 */
package org.xmdlab.jee.application.mm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.ResourceOperation#getResource <em>Resource</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.ResourceOperation#getPath <em>Path</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.ResourceOperation#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.ResourceOperation#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.ResourceOperation#getReturnString <em>Return String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResourceOperation()
 * @model
 * @generated
 */
public interface ResourceOperation extends Operation
{
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Resource#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' container reference.
	 * @see #setResource(Resource)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResourceOperation_Resource()
	 * @see org.xmdlab.jee.application.mm.Resource#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.ResourceOperation#getResource <em>Resource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' container reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResourceOperation_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.ResourceOperation#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.xmdlab.jee.application.mm.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see org.xmdlab.jee.application.mm.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResourceOperation_HttpMethod()
	 * @model default=""
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.ResourceOperation#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see org.xmdlab.jee.application.mm.HttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(ServiceOperation)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResourceOperation_Delegate()
	 * @model
	 * @generated
	 */
	ServiceOperation getDelegate();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.ResourceOperation#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(ServiceOperation value);

	/**
	 * Returns the value of the '<em><b>Return String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return String</em>' attribute.
	 * @see #setReturnString(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResourceOperation_ReturnString()
	 * @model
	 * @generated
	 */
	String getReturnString();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.ResourceOperation#getReturnString <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return String</em>' attribute.
	 * @see #getReturnString()
	 * @generated
	 */
	void setReturnString(String value);

} // ResourceOperation
