/**
 */
package org.xmdlab.jee.application.mm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xmdlab.jee.application.mm.DiscriminatorType;
import org.xmdlab.jee.application.mm.Inheritance;
import org.xmdlab.jee.application.mm.InheritanceType;
import org.xmdlab.jee.application.mm.JeeApplicationMmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.InheritanceImpl#getDiscriminatorColumnName <em>Discriminator Column Name</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.InheritanceImpl#getDiscriminatorColumnLength <em>Discriminator Column Length</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.InheritanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xmdlab.jee.application.mm.impl.InheritanceImpl#getDiscriminatorType <em>Discriminator Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InheritanceImpl extends MinimalEObjectImpl.Container implements Inheritance
{
	/**
	 * The default value of the '{@link #getDiscriminatorColumnName() <em>Discriminator Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorColumnName() <em>Discriminator Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumnName()
	 * @generated
	 * @ordered
	 */
	protected String discriminatorColumnName = DISCRIMINATOR_COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminatorColumnLength() <em>Discriminator Column Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumnLength()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_COLUMN_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorColumnLength() <em>Discriminator Column Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumnLength()
	 * @generated
	 * @ordered
	 */
	protected String discriminatorColumnLength = DISCRIMINATOR_COLUMN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InheritanceType TYPE_EDEFAULT = InheritanceType.SINGLE_TABLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InheritanceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorType()
	 * @generated
	 * @ordered
	 */
	protected static final DiscriminatorType DISCRIMINATOR_TYPE_EDEFAULT = DiscriminatorType.STRING;

	/**
	 * The cached value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorType()
	 * @generated
	 * @ordered
	 */
	protected DiscriminatorType discriminatorType = DISCRIMINATOR_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritanceImpl()
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
		return JeeApplicationMmPackage.Literals.INHERITANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminatorColumnName()
	{
		return discriminatorColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorColumnName(String newDiscriminatorColumnName)
	{
		String oldDiscriminatorColumnName = discriminatorColumnName;
		discriminatorColumnName = newDiscriminatorColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_NAME, oldDiscriminatorColumnName, discriminatorColumnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminatorColumnLength()
	{
		return discriminatorColumnLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorColumnLength(String newDiscriminatorColumnLength)
	{
		String oldDiscriminatorColumnLength = discriminatorColumnLength;
		discriminatorColumnLength = newDiscriminatorColumnLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH, oldDiscriminatorColumnLength, discriminatorColumnLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InheritanceType newType)
	{
		InheritanceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.INHERITANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorType getDiscriminatorType()
	{
		return discriminatorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorType(DiscriminatorType newDiscriminatorType)
	{
		DiscriminatorType oldDiscriminatorType = discriminatorType;
		discriminatorType = newDiscriminatorType == null ? DISCRIMINATOR_TYPE_EDEFAULT : newDiscriminatorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_TYPE, oldDiscriminatorType, discriminatorType));
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
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_NAME:
				return getDiscriminatorColumnName();
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH:
				return getDiscriminatorColumnLength();
			case JeeApplicationMmPackage.INHERITANCE__TYPE:
				return getType();
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_TYPE:
				return getDiscriminatorType();
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
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_NAME:
				setDiscriminatorColumnName((String)newValue);
				return;
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH:
				setDiscriminatorColumnLength((String)newValue);
				return;
			case JeeApplicationMmPackage.INHERITANCE__TYPE:
				setType((InheritanceType)newValue);
				return;
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_TYPE:
				setDiscriminatorType((DiscriminatorType)newValue);
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
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_NAME:
				setDiscriminatorColumnName(DISCRIMINATOR_COLUMN_NAME_EDEFAULT);
				return;
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH:
				setDiscriminatorColumnLength(DISCRIMINATOR_COLUMN_LENGTH_EDEFAULT);
				return;
			case JeeApplicationMmPackage.INHERITANCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_TYPE:
				setDiscriminatorType(DISCRIMINATOR_TYPE_EDEFAULT);
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
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_NAME:
				return DISCRIMINATOR_COLUMN_NAME_EDEFAULT == null ? discriminatorColumnName != null : !DISCRIMINATOR_COLUMN_NAME_EDEFAULT.equals(discriminatorColumnName);
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_COLUMN_LENGTH:
				return DISCRIMINATOR_COLUMN_LENGTH_EDEFAULT == null ? discriminatorColumnLength != null : !DISCRIMINATOR_COLUMN_LENGTH_EDEFAULT.equals(discriminatorColumnLength);
			case JeeApplicationMmPackage.INHERITANCE__TYPE:
				return type != TYPE_EDEFAULT;
			case JeeApplicationMmPackage.INHERITANCE__DISCRIMINATOR_TYPE:
				return discriminatorType != DISCRIMINATOR_TYPE_EDEFAULT;
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
		result.append(" (discriminatorColumnName: ");
		result.append(discriminatorColumnName);
		result.append(", discriminatorColumnLength: ");
		result.append(discriminatorColumnLength);
		result.append(", type: ");
		result.append(type);
		result.append(", discriminatorType: ");
		result.append(discriminatorType);
		result.append(')');
		return result.toString();
	}

} //InheritanceImpl
