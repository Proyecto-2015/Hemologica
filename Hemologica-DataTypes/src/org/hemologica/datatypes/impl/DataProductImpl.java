/**
 */
package org.hemologica.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataProduct;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataProductImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataProductImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataProductImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataProductImpl#getDonation <em>Donation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataProductImpl extends MinimalEObjectImpl.Container implements DataProduct {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "2826091238509417952L" is not valid.

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
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected String display = DISPLAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDonation() <em>Donation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonation()
	 * @generated
	 * @ordered
	 */
	protected DataDonation donation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PRODUCT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(String newDisplay) {
		String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PRODUCT__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation getDonation() {
		if (donation != null && donation.eIsProxy()) {
			InternalEObject oldDonation = (InternalEObject)donation;
			donation = (DataDonation)eResolveProxy(oldDonation);
			if (donation != oldDonation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_PRODUCT__DONATION, oldDonation, donation));
			}
		}
		return donation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation basicGetDonation() {
		return donation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonation(DataDonation newDonation) {
		DataDonation oldDonation = donation;
		donation = newDonation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PRODUCT__DONATION, oldDonation, donation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_PRODUCT__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_PRODUCT__CODE:
				return getCode();
			case DatatypesPackage.DATA_PRODUCT__DISPLAY:
				return getDisplay();
			case DatatypesPackage.DATA_PRODUCT__DONATION:
				if (resolve) return getDonation();
				return basicGetDonation();
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
			case DatatypesPackage.DATA_PRODUCT__CODE:
				setCode((String)newValue);
				return;
			case DatatypesPackage.DATA_PRODUCT__DISPLAY:
				setDisplay((String)newValue);
				return;
			case DatatypesPackage.DATA_PRODUCT__DONATION:
				setDonation((DataDonation)newValue);
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
			case DatatypesPackage.DATA_PRODUCT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PRODUCT__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PRODUCT__DONATION:
				setDonation((DataDonation)null);
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
			case DatatypesPackage.DATA_PRODUCT__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_PRODUCT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DatatypesPackage.DATA_PRODUCT__DISPLAY:
				return DISPLAY_EDEFAULT == null ? display != null : !DISPLAY_EDEFAULT.equals(display);
			case DatatypesPackage.DATA_PRODUCT__DONATION:
				return donation != null;
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
		result.append(", display: ");
		result.append(display);
		result.append(')');
		return result.toString();
	}

} //DataProductImpl
