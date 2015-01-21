/**
 */
package org.xmdlab.jee.application.mm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xmdlab.jee.application.mm.Entity;
import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.EntityImpl#isAuditable <em>Auditable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends DomainObjectImpl implements Entity
{
	/**
	 * The default value of the '{@link #isAuditable() <em>Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUDITABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAuditable() <em>Auditable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuditable()
	 * @generated
	 * @ordered
	 */
	protected boolean auditable = AUDITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl()
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
		return JeeApplicationMmPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuditable()
	{
		return auditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditable(boolean newAuditable)
	{
		boolean oldAuditable = auditable;
		auditable = newAuditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.ENTITY__AUDITABLE, oldAuditable, auditable));
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
			case JeeApplicationMmPackage.ENTITY__AUDITABLE:
				return isAuditable();
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
			case JeeApplicationMmPackage.ENTITY__AUDITABLE:
				setAuditable((Boolean)newValue);
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
			case JeeApplicationMmPackage.ENTITY__AUDITABLE:
				setAuditable(AUDITABLE_EDEFAULT);
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
			case JeeApplicationMmPackage.ENTITY__AUDITABLE:
				return auditable != AUDITABLE_EDEFAULT;
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
		result.append(" (auditable: ");
		result.append(auditable);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
