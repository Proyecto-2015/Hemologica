/**
 */
package org.hemologica.datatypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataProductType;
import org.hemologica.datatypes.DataUnit;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataUnitImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataUnitImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataUnitImpl#getDonationId <em>Donation Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataUnitImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataUnitImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataUnitImpl#getInstitutionCode <em>Institution Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataUnitImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataUnitImpl#getBloodType <em>Blood Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataUnitImpl extends MinimalEObjectImpl.Container implements DataUnit {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "-5470280587666900962L" is not valid.

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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected jdk.java.lang.Long id;

	/**
	 * The cached value of the '{@link #getDonationId() <em>Donation Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonationId()
	 * @generated
	 * @ordered
	 */
	protected jdk.java.lang.Long donationId;

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
	 * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected String institution = INSTITUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstitutionCode() <em>Institution Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitutionCode() <em>Institution Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitutionCode()
	 * @generated
	 * @ordered
	 */
	protected String institutionCode = INSTITUTION_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductType() <em>Product Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected DataProductType productType;

	/**
	 * The cached value of the '{@link #getBloodType() <em>Blood Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodType()
	 * @generated
	 * @ordered
	 */
	protected DataBloodType bloodType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_UNIT;
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
	public jdk.java.lang.Long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(jdk.java.lang.Long newId, NotificationChain msgs) {
		jdk.java.lang.Long oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(jdk.java.lang.Long newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_UNIT__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_UNIT__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public jdk.java.lang.Long getDonationId() {
		return donationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDonationId(jdk.java.lang.Long newDonationId, NotificationChain msgs) {
		jdk.java.lang.Long oldDonationId = donationId;
		donationId = newDonationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__DONATION_ID, oldDonationId, newDonationId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonationId(jdk.java.lang.Long newDonationId) {
		if (newDonationId != donationId) {
			NotificationChain msgs = null;
			if (donationId != null)
				msgs = ((InternalEObject)donationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_UNIT__DONATION_ID, null, msgs);
			if (newDonationId != null)
				msgs = ((InternalEObject)newDonationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_UNIT__DONATION_ID, null, msgs);
			msgs = basicSetDonationId(newDonationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__DONATION_ID, newDonationId, newDonationId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitution(String newInstitution) {
		String oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__INSTITUTION, oldInstitution, institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstitutionCode() {
		return institutionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitutionCode(String newInstitutionCode) {
		String oldInstitutionCode = institutionCode;
		institutionCode = newInstitutionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__INSTITUTION_CODE, oldInstitutionCode, institutionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductType getProductType() {
		if (productType != null && productType.eIsProxy()) {
			InternalEObject oldProductType = (InternalEObject)productType;
			productType = (DataProductType)eResolveProxy(oldProductType);
			if (productType != oldProductType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_UNIT__PRODUCT_TYPE, oldProductType, productType));
			}
		}
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductType basicGetProductType() {
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductType(DataProductType newProductType) {
		DataProductType oldProductType = productType;
		productType = newProductType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__PRODUCT_TYPE, oldProductType, productType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodType getBloodType() {
		if (bloodType != null && bloodType.eIsProxy()) {
			InternalEObject oldBloodType = (InternalEObject)bloodType;
			bloodType = (DataBloodType)eResolveProxy(oldBloodType);
			if (bloodType != oldBloodType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_UNIT__BLOOD_TYPE, oldBloodType, bloodType));
			}
		}
		return bloodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodType basicGetBloodType() {
		return bloodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloodType(DataBloodType newBloodType) {
		DataBloodType oldBloodType = bloodType;
		bloodType = newBloodType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_UNIT__BLOOD_TYPE, oldBloodType, bloodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.DATA_UNIT__ID:
				return basicSetId(null, msgs);
			case DatatypesPackage.DATA_UNIT__DONATION_ID:
				return basicSetDonationId(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_UNIT__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_UNIT__ID:
				return getId();
			case DatatypesPackage.DATA_UNIT__DONATION_ID:
				return getDonationId();
			case DatatypesPackage.DATA_UNIT__CODE:
				return getCode();
			case DatatypesPackage.DATA_UNIT__INSTITUTION:
				return getInstitution();
			case DatatypesPackage.DATA_UNIT__INSTITUTION_CODE:
				return getInstitutionCode();
			case DatatypesPackage.DATA_UNIT__PRODUCT_TYPE:
				if (resolve) return getProductType();
				return basicGetProductType();
			case DatatypesPackage.DATA_UNIT__BLOOD_TYPE:
				if (resolve) return getBloodType();
				return basicGetBloodType();
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
			case DatatypesPackage.DATA_UNIT__ID:
				setId((jdk.java.lang.Long)newValue);
				return;
			case DatatypesPackage.DATA_UNIT__DONATION_ID:
				setDonationId((jdk.java.lang.Long)newValue);
				return;
			case DatatypesPackage.DATA_UNIT__CODE:
				setCode((String)newValue);
				return;
			case DatatypesPackage.DATA_UNIT__INSTITUTION:
				setInstitution((String)newValue);
				return;
			case DatatypesPackage.DATA_UNIT__INSTITUTION_CODE:
				setInstitutionCode((String)newValue);
				return;
			case DatatypesPackage.DATA_UNIT__PRODUCT_TYPE:
				setProductType((DataProductType)newValue);
				return;
			case DatatypesPackage.DATA_UNIT__BLOOD_TYPE:
				setBloodType((DataBloodType)newValue);
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
			case DatatypesPackage.DATA_UNIT__ID:
				setId((jdk.java.lang.Long)null);
				return;
			case DatatypesPackage.DATA_UNIT__DONATION_ID:
				setDonationId((jdk.java.lang.Long)null);
				return;
			case DatatypesPackage.DATA_UNIT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_UNIT__INSTITUTION:
				setInstitution(INSTITUTION_EDEFAULT);
				return;
			case DatatypesPackage.DATA_UNIT__INSTITUTION_CODE:
				setInstitutionCode(INSTITUTION_CODE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_UNIT__PRODUCT_TYPE:
				setProductType((DataProductType)null);
				return;
			case DatatypesPackage.DATA_UNIT__BLOOD_TYPE:
				setBloodType((DataBloodType)null);
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
			case DatatypesPackage.DATA_UNIT__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_UNIT__ID:
				return id != null;
			case DatatypesPackage.DATA_UNIT__DONATION_ID:
				return donationId != null;
			case DatatypesPackage.DATA_UNIT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DatatypesPackage.DATA_UNIT__INSTITUTION:
				return INSTITUTION_EDEFAULT == null ? institution != null : !INSTITUTION_EDEFAULT.equals(institution);
			case DatatypesPackage.DATA_UNIT__INSTITUTION_CODE:
				return INSTITUTION_CODE_EDEFAULT == null ? institutionCode != null : !INSTITUTION_CODE_EDEFAULT.equals(institutionCode);
			case DatatypesPackage.DATA_UNIT__PRODUCT_TYPE:
				return productType != null;
			case DatatypesPackage.DATA_UNIT__BLOOD_TYPE:
				return bloodType != null;
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
		result.append(", institution: ");
		result.append(institution);
		result.append(", institutionCode: ");
		result.append(institutionCode);
		result.append(')');
		return result.toString();
	}

} //DataUnitImpl
