/**
 */
package org.hemologica.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hemologica.datatypes.DataDonationDonorType;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Donation Donor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationDonorTypeImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationDonorTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationDonorTypeImpl#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDonationDonorTypeImpl extends MinimalEObjectImpl.Container implements DataDonationDonorType {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "9176360583037903695L" is not valid.

	/**
	 * The cached value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected long serialVersionUID = SERIAL_VERSION_UID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDonationDonorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_DONATION_DONOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION_DONOR_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION_DONOR_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__CODE:
				return getCode();
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__DISPLAY_NAME:
				return getDisplayName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__CODE:
				setCode((String)newValue);
				return;
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serialVersionUID: ");
		result.append(serialVersionUID);
		result.append(", code: ");
		result.append(code);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(')');
		return result.toString();
	}

} //DataDonationDonorTypeImpl
