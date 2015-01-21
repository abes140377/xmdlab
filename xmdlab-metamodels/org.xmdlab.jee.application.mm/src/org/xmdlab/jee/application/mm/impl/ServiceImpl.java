/**
 */
package org.xmdlab.jee.application.mm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;
import org.xmdlab.jee.application.mm.Module;
import org.xmdlab.jee.application.mm.Repository;
import org.xmdlab.jee.application.mm.Service;
import org.xmdlab.jee.application.mm.ServiceOperation;
import org.xmdlab.jee.application.mm.Subscribe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#getRepositoryDependencies <em>Repository Dependencies</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#isGapClass <em>Gap Class</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#isWebService <em>Web Service</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#isRemoteInterface <em>Remote Interface</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#isLocalInterface <em>Local Interface</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceImpl#getSubscribe <em>Subscribe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends NamedElementImpl implements Service
{
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOperation> operations;

	/**
	 * The cached value of the '{@link #getRepositoryDependencies() <em>Repository Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositoryDependencies;

	/**
	 * The cached value of the '{@link #getOtherDependencies() <em>Other Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDependencies;

	/**
	 * The cached value of the '{@link #getServiceDependencies() <em>Service Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> serviceDependencies;

	/**
	 * The default value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GAP_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGapClass() <em>Gap Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGapClass()
	 * @generated
	 * @ordered
	 */
	protected boolean gapClass = GAP_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isWebService() <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWebService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEB_SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWebService() <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWebService()
	 * @generated
	 * @ordered
	 */
	protected boolean webService = WEB_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoteInterface() <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_INTERFACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRemoteInterface() <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteInterface = REMOTE_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocalInterface() <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_INTERFACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLocalInterface() <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean localInterface = LOCAL_INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected Subscribe subscribe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return JeeApplicationMmPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceOperation> getOperations()
	{
		if (operations == null)
		{
			operations = new EObjectContainmentWithInverseEList<ServiceOperation>(ServiceOperation.class, this, JeeApplicationMmPackage.SERVICE__OPERATIONS, JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositoryDependencies()
	{
		if (repositoryDependencies == null)
		{
			repositoryDependencies = new EObjectResolvingEList<Repository>(Repository.class, this, JeeApplicationMmPackage.SERVICE__REPOSITORY_DEPENDENCIES);
		}
		return repositoryDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule()
	{
		if (eContainerFeatureID() != JeeApplicationMmPackage.SERVICE__MODULE) return null;
		return (Module)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newModule, JeeApplicationMmPackage.SERVICE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule)
	{
		if (newModule != eInternalContainer() || (eContainerFeatureID() != JeeApplicationMmPackage.SERVICE__MODULE && newModule != null))
		{
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, JeeApplicationMmPackage.MODULE__SERVICES, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOtherDependencies()
	{
		if (otherDependencies == null)
		{
			otherDependencies = new EDataTypeUniqueEList<String>(String.class, this, JeeApplicationMmPackage.SERVICE__OTHER_DEPENDENCIES);
		}
		return otherDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServiceDependencies()
	{
		if (serviceDependencies == null)
		{
			serviceDependencies = new EObjectResolvingEList<Service>(Service.class, this, JeeApplicationMmPackage.SERVICE__SERVICE_DEPENDENCIES);
		}
		return serviceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGapClass()
	{
		return gapClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGapClass(boolean newGapClass)
	{
		boolean oldGapClass = gapClass;
		gapClass = newGapClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE__GAP_CLASS, oldGapClass, gapClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWebService()
	{
		return webService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebService(boolean newWebService)
	{
		boolean oldWebService = webService;
		webService = newWebService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE__WEB_SERVICE, oldWebService, webService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemoteInterface()
	{
		return remoteInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteInterface(boolean newRemoteInterface)
	{
		boolean oldRemoteInterface = remoteInterface;
		remoteInterface = newRemoteInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE__REMOTE_INTERFACE, oldRemoteInterface, remoteInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocalInterface()
	{
		return localInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalInterface(boolean newLocalInterface)
	{
		boolean oldLocalInterface = localInterface;
		localInterface = newLocalInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE__LOCAL_INTERFACE, oldLocalInterface, localInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscribe getSubscribe()
	{
		if (subscribe != null && subscribe.eIsProxy())
		{
			InternalEObject oldSubscribe = (InternalEObject)subscribe;
			subscribe = (Subscribe)eResolveProxy(oldSubscribe);
			if (subscribe != oldSubscribe)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JeeApplicationMmPackage.SERVICE__SUBSCRIBE, oldSubscribe, subscribe));
			}
		}
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscribe basicGetSubscribe()
	{
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribe(Subscribe newSubscribe)
	{
		Subscribe oldSubscribe = subscribe;
		subscribe = newSubscribe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE__SUBSCRIBE, oldSubscribe, subscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case JeeApplicationMmPackage.SERVICE__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case JeeApplicationMmPackage.SERVICE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case JeeApplicationMmPackage.SERVICE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case JeeApplicationMmPackage.SERVICE__MODULE:
				return basicSetModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case JeeApplicationMmPackage.SERVICE__MODULE:
				return eInternalContainer().eInverseRemove(this, JeeApplicationMmPackage.MODULE__SERVICES, Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case JeeApplicationMmPackage.SERVICE__OPERATIONS:
				return getOperations();
			case JeeApplicationMmPackage.SERVICE__REPOSITORY_DEPENDENCIES:
				return getRepositoryDependencies();
			case JeeApplicationMmPackage.SERVICE__MODULE:
				return getModule();
			case JeeApplicationMmPackage.SERVICE__OTHER_DEPENDENCIES:
				return getOtherDependencies();
			case JeeApplicationMmPackage.SERVICE__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
			case JeeApplicationMmPackage.SERVICE__GAP_CLASS:
				return isGapClass();
			case JeeApplicationMmPackage.SERVICE__WEB_SERVICE:
				return isWebService();
			case JeeApplicationMmPackage.SERVICE__REMOTE_INTERFACE:
				return isRemoteInterface();
			case JeeApplicationMmPackage.SERVICE__LOCAL_INTERFACE:
				return isLocalInterface();
			case JeeApplicationMmPackage.SERVICE__SUBSCRIBE:
				if (resolve) return getSubscribe();
				return basicGetSubscribe();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case JeeApplicationMmPackage.SERVICE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ServiceOperation>)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				getRepositoryDependencies().addAll((Collection<? extends Repository>)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__MODULE:
				setModule((Module)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				getOtherDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				getServiceDependencies().addAll((Collection<? extends Service>)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__GAP_CLASS:
				setGapClass((Boolean)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__WEB_SERVICE:
				setWebService((Boolean)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__REMOTE_INTERFACE:
				setRemoteInterface((Boolean)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__LOCAL_INTERFACE:
				setLocalInterface((Boolean)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE__SUBSCRIBE:
				setSubscribe((Subscribe)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case JeeApplicationMmPackage.SERVICE__OPERATIONS:
				getOperations().clear();
				return;
			case JeeApplicationMmPackage.SERVICE__REPOSITORY_DEPENDENCIES:
				getRepositoryDependencies().clear();
				return;
			case JeeApplicationMmPackage.SERVICE__MODULE:
				setModule((Module)null);
				return;
			case JeeApplicationMmPackage.SERVICE__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				return;
			case JeeApplicationMmPackage.SERVICE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				return;
			case JeeApplicationMmPackage.SERVICE__GAP_CLASS:
				setGapClass(GAP_CLASS_EDEFAULT);
				return;
			case JeeApplicationMmPackage.SERVICE__WEB_SERVICE:
				setWebService(WEB_SERVICE_EDEFAULT);
				return;
			case JeeApplicationMmPackage.SERVICE__REMOTE_INTERFACE:
				setRemoteInterface(REMOTE_INTERFACE_EDEFAULT);
				return;
			case JeeApplicationMmPackage.SERVICE__LOCAL_INTERFACE:
				setLocalInterface(LOCAL_INTERFACE_EDEFAULT);
				return;
			case JeeApplicationMmPackage.SERVICE__SUBSCRIBE:
				setSubscribe((Subscribe)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case JeeApplicationMmPackage.SERVICE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case JeeApplicationMmPackage.SERVICE__REPOSITORY_DEPENDENCIES:
				return repositoryDependencies != null && !repositoryDependencies.isEmpty();
			case JeeApplicationMmPackage.SERVICE__MODULE:
				return getModule() != null;
			case JeeApplicationMmPackage.SERVICE__OTHER_DEPENDENCIES:
				return otherDependencies != null && !otherDependencies.isEmpty();
			case JeeApplicationMmPackage.SERVICE__SERVICE_DEPENDENCIES:
				return serviceDependencies != null && !serviceDependencies.isEmpty();
			case JeeApplicationMmPackage.SERVICE__GAP_CLASS:
				return gapClass != GAP_CLASS_EDEFAULT;
			case JeeApplicationMmPackage.SERVICE__WEB_SERVICE:
				return webService != WEB_SERVICE_EDEFAULT;
			case JeeApplicationMmPackage.SERVICE__REMOTE_INTERFACE:
				return remoteInterface != REMOTE_INTERFACE_EDEFAULT;
			case JeeApplicationMmPackage.SERVICE__LOCAL_INTERFACE:
				return localInterface != LOCAL_INTERFACE_EDEFAULT;
			case JeeApplicationMmPackage.SERVICE__SUBSCRIBE:
				return subscribe != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (otherDependencies: ");
		result.append(otherDependencies);
		result.append(", gapClass: ");
		result.append(gapClass);
		result.append(", webService: ");
		result.append(webService);
		result.append(", remoteInterface: ");
		result.append(remoteInterface);
		result.append(", localInterface: ");
		result.append(localInterface);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
