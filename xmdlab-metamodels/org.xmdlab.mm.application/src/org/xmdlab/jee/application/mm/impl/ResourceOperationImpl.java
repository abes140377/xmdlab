/**
 */
package org.xmdlab.jee.application.mm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.xmdlab.jee.application.mm.HttpMethod;
import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;
import org.xmdlab.jee.application.mm.Resource;
import org.xmdlab.jee.application.mm.ResourceOperation;
import org.xmdlab.jee.application.mm.ServiceOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ResourceOperationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ResourceOperationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ResourceOperationImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ResourceOperationImpl#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ResourceOperationImpl#getReturnString <em>Return String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceOperationImpl extends OperationImpl implements ResourceOperation
{
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod HTTP_METHOD_EDEFAULT = HttpMethod.UNDEFINED;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod httpMethod = HTTP_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected ServiceOperation delegate;

	/**
	 * The default value of the '{@link #getReturnString() <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnString()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnString() <em>Return String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnString()
	 * @generated
	 * @ordered
	 */
	protected String returnString = RETURN_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceOperationImpl()
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
		return JeeApplicationMmPackage.Literals.RESOURCE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource()
	{
		if (eContainerFeatureID() != JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newResource, JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource)
	{
		if (newResource != eInternalContainer() || (eContainerFeatureID() != JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE && newResource != null))
		{
			if (EcoreUtil.isAncestor(this, newResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, JeeApplicationMmPackage.RESOURCE__OPERATIONS, Resource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath()
	{
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath)
	{
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.RESOURCE_OPERATION__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getHttpMethod()
	{
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpMethod(HttpMethod newHttpMethod)
	{
		HttpMethod oldHttpMethod = httpMethod;
		httpMethod = newHttpMethod == null ? HTTP_METHOD_EDEFAULT : newHttpMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.RESOURCE_OPERATION__HTTP_METHOD, oldHttpMethod, httpMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation getDelegate()
	{
		if (delegate != null && delegate.eIsProxy())
		{
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (ServiceOperation)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JeeApplicationMmPackage.RESOURCE_OPERATION__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation basicGetDelegate()
	{
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(ServiceOperation newDelegate)
	{
		ServiceOperation oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.RESOURCE_OPERATION__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnString()
	{
		return returnString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnString(String newReturnString)
	{
		String oldReturnString = returnString;
		returnString = newReturnString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.RESOURCE_OPERATION__RETURN_STRING, oldReturnString, returnString));
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
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResource((Resource)otherEnd, msgs);
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
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE:
				return basicSetResource(null, msgs);
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
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE:
				return eInternalContainer().eInverseRemove(this, JeeApplicationMmPackage.RESOURCE__OPERATIONS, Resource.class, msgs);
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
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE:
				return getResource();
			case JeeApplicationMmPackage.RESOURCE_OPERATION__PATH:
				return getPath();
			case JeeApplicationMmPackage.RESOURCE_OPERATION__HTTP_METHOD:
				return getHttpMethod();
			case JeeApplicationMmPackage.RESOURCE_OPERATION__DELEGATE:
				if (resolve) return getDelegate();
				return basicGetDelegate();
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RETURN_STRING:
				return getReturnString();
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
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE:
				setResource((Resource)newValue);
				return;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__PATH:
				setPath((String)newValue);
				return;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__HTTP_METHOD:
				setHttpMethod((HttpMethod)newValue);
				return;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__DELEGATE:
				setDelegate((ServiceOperation)newValue);
				return;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RETURN_STRING:
				setReturnString((String)newValue);
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
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE:
				setResource((Resource)null);
				return;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__HTTP_METHOD:
				setHttpMethod(HTTP_METHOD_EDEFAULT);
				return;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__DELEGATE:
				setDelegate((ServiceOperation)null);
				return;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RETURN_STRING:
				setReturnString(RETURN_STRING_EDEFAULT);
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
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RESOURCE:
				return getResource() != null;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case JeeApplicationMmPackage.RESOURCE_OPERATION__HTTP_METHOD:
				return httpMethod != HTTP_METHOD_EDEFAULT;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__DELEGATE:
				return delegate != null;
			case JeeApplicationMmPackage.RESOURCE_OPERATION__RETURN_STRING:
				return RETURN_STRING_EDEFAULT == null ? returnString != null : !RETURN_STRING_EDEFAULT.equals(returnString);
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
		result.append(" (path: ");
		result.append(path);
		result.append(", httpMethod: ");
		result.append(httpMethod);
		result.append(", returnString: ");
		result.append(returnString);
		result.append(')');
		return result.toString();
	}

} //ResourceOperationImpl
