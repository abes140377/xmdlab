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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xmdlab.jee.application.mm.EnumValue;
import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.EnumImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.EnumImpl#isOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumImpl extends DomainObjectImpl implements org.xmdlab.jee.application.mm.Enum
{
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumValue> values;

	/**
	 * The default value of the '{@link #isOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdinal()
	 * @generated
	 * @ordered
	 */
	protected boolean ordinal = ORDINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumImpl()
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
		return JeeApplicationMmPackage.Literals.ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumValue> getValues()
	{
		if (values == null)
		{
			values = new EObjectContainmentEList<EnumValue>(EnumValue.class, this, JeeApplicationMmPackage.ENUM__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdinal()
	{
		return ordinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdinal(boolean newOrdinal)
	{
		boolean oldOrdinal = ordinal;
		ordinal = newOrdinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.ENUM__ORDINAL, oldOrdinal, ordinal));
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
			case JeeApplicationMmPackage.ENUM__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case JeeApplicationMmPackage.ENUM__VALUES:
				return getValues();
			case JeeApplicationMmPackage.ENUM__ORDINAL:
				return isOrdinal();
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
			case JeeApplicationMmPackage.ENUM__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends EnumValue>)newValue);
				return;
			case JeeApplicationMmPackage.ENUM__ORDINAL:
				setOrdinal((Boolean)newValue);
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
			case JeeApplicationMmPackage.ENUM__VALUES:
				getValues().clear();
				return;
			case JeeApplicationMmPackage.ENUM__ORDINAL:
				setOrdinal(ORDINAL_EDEFAULT);
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
			case JeeApplicationMmPackage.ENUM__VALUES:
				return values != null && !values.isEmpty();
			case JeeApplicationMmPackage.ENUM__ORDINAL:
				return ordinal != ORDINAL_EDEFAULT;
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
		result.append(" (ordinal: ");
		result.append(ordinal);
		result.append(')');
		return result.toString();
	}

} //EnumImpl
