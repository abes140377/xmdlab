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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmdlab.jee.application.mm.Application;
import org.xmdlab.jee.application.mm.Consumer;
import org.xmdlab.jee.application.mm.DomainObject;
import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;
import org.xmdlab.jee.application.mm.Module;
import org.xmdlab.jee.application.mm.Resource;
import org.xmdlab.jee.application.mm.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ModuleImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ModuleImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ModuleImpl#getDomainObjects <em>Domain Objects</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ModuleImpl#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ModuleImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ModuleImpl#isExternal <em>External</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ModuleImpl#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.ModuleImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends NamedElementImpl implements Module
{
	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainObjects() <em>Domain Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> domainObjects;

	/**
	 * The cached value of the '{@link #getConsumers() <em>Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<Consumer> consumers;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnit()
	 * @generated
	 * @ordered
	 */
	protected String persistenceUnit = PERSISTENCE_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl()
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
		return JeeApplicationMmPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage()
	{
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage)
	{
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.MODULE__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication()
	{
		if (eContainerFeatureID() != JeeApplicationMmPackage.MODULE__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newApplication, JeeApplicationMmPackage.MODULE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication)
	{
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != JeeApplicationMmPackage.MODULE__APPLICATION && newApplication != null))
		{
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, JeeApplicationMmPackage.APPLICATION__MODULES, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.MODULE__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObject> getDomainObjects()
	{
		if (domainObjects == null)
		{
			domainObjects = new EObjectContainmentWithInverseEList<DomainObject>(DomainObject.class, this, JeeApplicationMmPackage.MODULE__DOMAIN_OBJECTS, JeeApplicationMmPackage.DOMAIN_OBJECT__MODULE);
		}
		return domainObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consumer> getConsumers()
	{
		if (consumers == null)
		{
			consumers = new EObjectContainmentWithInverseEList<Consumer>(Consumer.class, this, JeeApplicationMmPackage.MODULE__CONSUMERS, JeeApplicationMmPackage.CONSUMER__MODULE);
		}
		return consumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices()
	{
		if (services == null)
		{
			services = new EObjectContainmentWithInverseEList<Service>(Service.class, this, JeeApplicationMmPackage.MODULE__SERVICES, JeeApplicationMmPackage.SERVICE__MODULE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal()
	{
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal(boolean newExternal)
	{
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.MODULE__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistenceUnit()
	{
		return persistenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceUnit(String newPersistenceUnit)
	{
		String oldPersistenceUnit = persistenceUnit;
		persistenceUnit = newPersistenceUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.MODULE__PERSISTENCE_UNIT, oldPersistenceUnit, persistenceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources()
	{
		if (resources == null)
		{
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, JeeApplicationMmPackage.MODULE__RESOURCES, JeeApplicationMmPackage.RESOURCE__MODULE);
		}
		return resources;
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
			case JeeApplicationMmPackage.MODULE__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
			case JeeApplicationMmPackage.MODULE__DOMAIN_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomainObjects()).basicAdd(otherEnd, msgs);
			case JeeApplicationMmPackage.MODULE__CONSUMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumers()).basicAdd(otherEnd, msgs);
			case JeeApplicationMmPackage.MODULE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
			case JeeApplicationMmPackage.MODULE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case JeeApplicationMmPackage.MODULE__APPLICATION:
				return basicSetApplication(null, msgs);
			case JeeApplicationMmPackage.MODULE__DOMAIN_OBJECTS:
				return ((InternalEList<?>)getDomainObjects()).basicRemove(otherEnd, msgs);
			case JeeApplicationMmPackage.MODULE__CONSUMERS:
				return ((InternalEList<?>)getConsumers()).basicRemove(otherEnd, msgs);
			case JeeApplicationMmPackage.MODULE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case JeeApplicationMmPackage.MODULE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case JeeApplicationMmPackage.MODULE__APPLICATION:
				return eInternalContainer().eInverseRemove(this, JeeApplicationMmPackage.APPLICATION__MODULES, Application.class, msgs);
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
			case JeeApplicationMmPackage.MODULE__BASE_PACKAGE:
				return getBasePackage();
			case JeeApplicationMmPackage.MODULE__APPLICATION:
				return getApplication();
			case JeeApplicationMmPackage.MODULE__DOMAIN_OBJECTS:
				return getDomainObjects();
			case JeeApplicationMmPackage.MODULE__CONSUMERS:
				return getConsumers();
			case JeeApplicationMmPackage.MODULE__SERVICES:
				return getServices();
			case JeeApplicationMmPackage.MODULE__EXTERNAL:
				return isExternal();
			case JeeApplicationMmPackage.MODULE__PERSISTENCE_UNIT:
				return getPersistenceUnit();
			case JeeApplicationMmPackage.MODULE__RESOURCES:
				return getResources();
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
			case JeeApplicationMmPackage.MODULE__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case JeeApplicationMmPackage.MODULE__APPLICATION:
				setApplication((Application)newValue);
				return;
			case JeeApplicationMmPackage.MODULE__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				getDomainObjects().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case JeeApplicationMmPackage.MODULE__CONSUMERS:
				getConsumers().clear();
				getConsumers().addAll((Collection<? extends Consumer>)newValue);
				return;
			case JeeApplicationMmPackage.MODULE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case JeeApplicationMmPackage.MODULE__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case JeeApplicationMmPackage.MODULE__PERSISTENCE_UNIT:
				setPersistenceUnit((String)newValue);
				return;
			case JeeApplicationMmPackage.MODULE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
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
			case JeeApplicationMmPackage.MODULE__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case JeeApplicationMmPackage.MODULE__APPLICATION:
				setApplication((Application)null);
				return;
			case JeeApplicationMmPackage.MODULE__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				return;
			case JeeApplicationMmPackage.MODULE__CONSUMERS:
				getConsumers().clear();
				return;
			case JeeApplicationMmPackage.MODULE__SERVICES:
				getServices().clear();
				return;
			case JeeApplicationMmPackage.MODULE__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case JeeApplicationMmPackage.MODULE__PERSISTENCE_UNIT:
				setPersistenceUnit(PERSISTENCE_UNIT_EDEFAULT);
				return;
			case JeeApplicationMmPackage.MODULE__RESOURCES:
				getResources().clear();
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
			case JeeApplicationMmPackage.MODULE__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case JeeApplicationMmPackage.MODULE__APPLICATION:
				return getApplication() != null;
			case JeeApplicationMmPackage.MODULE__DOMAIN_OBJECTS:
				return domainObjects != null && !domainObjects.isEmpty();
			case JeeApplicationMmPackage.MODULE__CONSUMERS:
				return consumers != null && !consumers.isEmpty();
			case JeeApplicationMmPackage.MODULE__SERVICES:
				return services != null && !services.isEmpty();
			case JeeApplicationMmPackage.MODULE__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case JeeApplicationMmPackage.MODULE__PERSISTENCE_UNIT:
				return PERSISTENCE_UNIT_EDEFAULT == null ? persistenceUnit != null : !PERSISTENCE_UNIT_EDEFAULT.equals(persistenceUnit);
			case JeeApplicationMmPackage.MODULE__RESOURCES:
				return resources != null && !resources.isEmpty();
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", external: ");
		result.append(external);
		result.append(", persistenceUnit: ");
		result.append(persistenceUnit);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
