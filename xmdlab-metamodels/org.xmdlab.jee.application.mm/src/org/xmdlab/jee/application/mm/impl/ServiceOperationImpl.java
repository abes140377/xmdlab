/**
 */
package org.xmdlab.jee.application.mm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;
import org.xmdlab.jee.application.mm.RepositoryOperation;
import org.xmdlab.jee.application.mm.Service;
import org.xmdlab.jee.application.mm.ServiceOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceOperationImpl#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceOperationImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ServiceOperationImpl#getServiceDelegate <em>Service Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceOperationImpl extends OperationImpl implements ServiceOperation
{
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected RepositoryOperation delegate;

	/**
	 * The cached value of the '{@link #getServiceDelegate() <em>Service Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDelegate()
	 * @generated
	 * @ordered
	 */
	protected ServiceOperation serviceDelegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOperationImpl()
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
		return JeeApplicationMmPackage.Literals.SERVICE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryOperation getDelegate()
	{
		if (delegate != null && delegate.eIsProxy())
		{
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (RepositoryOperation)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JeeApplicationMmPackage.SERVICE_OPERATION__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryOperation basicGetDelegate()
	{
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(RepositoryOperation newDelegate)
	{
		RepositoryOperation oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE_OPERATION__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService()
	{
		if (eContainerFeatureID() != JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newService, JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService)
	{
		if (newService != eInternalContainer() || (eContainerFeatureID() != JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE && newService != null))
		{
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, JeeApplicationMmPackage.SERVICE__OPERATIONS, Service.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation getServiceDelegate()
	{
		if (serviceDelegate != null && serviceDelegate.eIsProxy())
		{
			InternalEObject oldServiceDelegate = (InternalEObject)serviceDelegate;
			serviceDelegate = (ServiceOperation)eResolveProxy(oldServiceDelegate);
			if (serviceDelegate != oldServiceDelegate)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE_DELEGATE, oldServiceDelegate, serviceDelegate));
			}
		}
		return serviceDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation basicGetServiceDelegate()
	{
		return serviceDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDelegate(ServiceOperation newServiceDelegate)
	{
		ServiceOperation oldServiceDelegate = serviceDelegate;
		serviceDelegate = newServiceDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE_DELEGATE, oldServiceDelegate, serviceDelegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((Service)otherEnd, msgs);
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
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE:
				return basicSetService(null, msgs);
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
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE:
				return eInternalContainer().eInverseRemove(this, JeeApplicationMmPackage.SERVICE__OPERATIONS, Service.class, msgs);
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
			case JeeApplicationMmPackage.SERVICE_OPERATION__DELEGATE:
				if (resolve) return getDelegate();
				return basicGetDelegate();
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE:
				return getService();
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				if (resolve) return getServiceDelegate();
				return basicGetServiceDelegate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case JeeApplicationMmPackage.SERVICE_OPERATION__DELEGATE:
				setDelegate((RepositoryOperation)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE:
				setService((Service)newValue);
				return;
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				setServiceDelegate((ServiceOperation)newValue);
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
			case JeeApplicationMmPackage.SERVICE_OPERATION__DELEGATE:
				setDelegate((RepositoryOperation)null);
				return;
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE:
				setService((Service)null);
				return;
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				setServiceDelegate((ServiceOperation)null);
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
			case JeeApplicationMmPackage.SERVICE_OPERATION__DELEGATE:
				return delegate != null;
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE:
				return getService() != null;
			case JeeApplicationMmPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				return serviceDelegate != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceOperationImpl
