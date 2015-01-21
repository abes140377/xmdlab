/**
 */
package org.xmdlab.jee.application.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.Module#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Module#getApplication <em>Application</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Module#getDomainObjects <em>Domain Objects</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Module#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Module#getServices <em>Services</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Module#isExternal <em>External</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Module#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.Module#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Module#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Application#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule_Application()
	 * @see org.xmdlab.jee.application.mm.Application#getModules
	 * @model opposite="modules" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Module#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Domain Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.DomainObject}.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.DomainObject#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Objects</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule_DomainObjects()
	 * @see org.xmdlab.jee.application.mm.DomainObject#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<DomainObject> getDomainObjects();

	/**
	 * Returns the value of the '<em><b>Consumers</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Consumer}.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Consumer#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumers</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule_Consumers()
	 * @see org.xmdlab.jee.application.mm.Consumer#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Consumer> getConsumers();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Service}.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Service#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule_Services()
	 * @see org.xmdlab.jee.application.mm.Service#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Module#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

	/**
	 * Returns the value of the '<em><b>Persistence Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit</em>' attribute.
	 * @see #setPersistenceUnit(String)
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule_PersistenceUnit()
	 * @model
	 * @generated
	 */
	String getPersistenceUnit();

	/**
	 * Sets the value of the '{@link org.xmdlab.jee.application.mm.Module#getPersistenceUnit <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Unit</em>' attribute.
	 * @see #getPersistenceUnit()
	 * @generated
	 */
	void setPersistenceUnit(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.xmdlab.jee.application.mm.Resource}.
	 * It is bidirectional and its opposite is '{@link org.xmdlab.jee.application.mm.Resource#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.xmdlab.jee.application.mm.JeeApplicationMmPackage#getModule_Resources()
	 * @see org.xmdlab.jee.application.mm.Resource#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // Module
