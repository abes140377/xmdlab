/**
 */
package org.xmdlab.jee.application.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#getModule <em>Module</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#isWebService <em>Web Service</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#isRemoteInterface <em>Remote Interface</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#isLocalInterface <em>Local Interface</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Service#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.ServiceOperation}.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.ServiceOperation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_Operations()
	 * @see org.xmdlab.jee.application.mm.ServiceOperation#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<ServiceOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Repository Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Dependencies</em>' reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_RepositoryDependencies()
	 * @model
	 * @generated
	 */
	EList<Repository> getRepositoryDependencies();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Module#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_Module()
	 * @see org.xmdlab.jee.application.mm.Module#getServices
	 * @model opposite="services" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Service#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Other Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Dependencies</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Dependencies</em>' attribute list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_OtherDependencies()
	 * @model
	 * @generated
	 */
	EList<String> getOtherDependencies();

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
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_ServiceDependencies()
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
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_GapClass()
	 * @model
	 * @generated
	 */
	boolean isGapClass();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Service#isGapClass <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap Class</em>' attribute.
	 * @see #isGapClass()
	 * @generated
	 */
	void setGapClass(boolean value);

	/**
	 * Returns the value of the '<em><b>Web Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Service</em>' attribute.
	 * @see #setWebService(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_WebService()
	 * @model
	 * @generated
	 */
	boolean isWebService();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Service#isWebService <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Service</em>' attribute.
	 * @see #isWebService()
	 * @generated
	 */
	void setWebService(boolean value);

	/**
	 * Returns the value of the '<em><b>Remote Interface</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Interface</em>' attribute.
	 * @see #setRemoteInterface(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_RemoteInterface()
	 * @model default="true"
	 * @generated
	 */
	boolean isRemoteInterface();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Service#isRemoteInterface <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Interface</em>' attribute.
	 * @see #isRemoteInterface()
	 * @generated
	 */
	void setRemoteInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Interface</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Interface</em>' attribute.
	 * @see #setLocalInterface(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_LocalInterface()
	 * @model default="true"
	 * @generated
	 */
	boolean isLocalInterface();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Service#isLocalInterface <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Interface</em>' attribute.
	 * @see #isLocalInterface()
	 * @generated
	 */
	void setLocalInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' reference.
	 * @see #setSubscribe(Subscribe)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getService_Subscribe()
	 * @model
	 * @generated
	 */
	Subscribe getSubscribe();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Service#getSubscribe <em>Subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(Subscribe value);

} // Service
