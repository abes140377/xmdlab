/**
 */
package org.xmdlab.jee.application.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.Resource#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Resource#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Resource#getPath <em>Path</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Resource#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Resource#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResource_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<Service> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Gap Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gap Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Class</em>' attribute.
	 * @see #setGapClass(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResource_GapClass()
	 * @model
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Resource#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

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
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResource_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Resource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.ResourceOperation}.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.ResourceOperation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResource_Operations()
	 * @see org.xmdlab.jee.application.mm.ResourceOperation#getResource
	 * @model opposite="resource" containment="true"
	 * @generated
	 */
	EList<ResourceOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Module#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getResource_Module()
	 * @see org.xmdlab.jee.application.mm.Module#getResources
	 * @model opposite="resources" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Resource#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // Resource
