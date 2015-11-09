/**
 */
package org.hemologica.datatypes.impl;

import java.lang.reflect.InvocationTargetException;

import jdk.java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.hemologica.constants.DataDonationRejectionType;

import org.hemologica.datatypes.DataDonationFail;
import org.hemologica.datatypes.DataDonationFailCause;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Donation Fail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationFailImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationFailImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationFailImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationFailImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationFailImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationFailImpl#getRejectionType <em>Rejection Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDonationFailImpl extends MinimalEObjectImpl.Container implements DataDonationFail {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "-43336076178896132L" is not valid.

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected DataDonationFailCause cause;

	/**
	 * The default value of the '{@link #getRejectionType() <em>Rejection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectionType()
	 * @generated
	 * @ordered
	 */
	protected static final DataDonationRejectionType REJECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRejectionType() <em>Rejection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectionType()
	 * @generated
	 * @ordered
	 */
	protected DataDonationRejectionType rejectionType = REJECTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDonationFailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_DONATION_FAIL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION_FAIL__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION_FAIL__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION_FAIL__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_DONATION_FAIL__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_DONATION_FAIL__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION_FAIL__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationFailCause getCause() {
		if (cause != null && cause.eIsProxy()) {
			InternalEObject oldCause = (InternalEObject)cause;
			cause = (DataDonationFailCause)eResolveProxy(oldCause);
			if (cause != oldCause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_DONATION_FAIL__CAUSE, oldCause, cause));
			}
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationFailCause basicGetCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(DataDonationFailCause newCause) {
		DataDonationFailCause oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION_FAIL__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationRejectionType getRejectionType() {
		return rejectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRejectionType(DataDonationRejectionType newRejectionType) {
		DataDonationRejectionType oldRejectionType = rejectionType;
		rejectionType = newRejectionType == null ? REJECTION_TYPE_EDEFAULT : newRejectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION_FAIL__REJECTION_TYPE, oldRejectionType, rejectionType));
	}

	/**
	 * The cached OCL expression body for the '{@link #DataDonationFail() <em>Data Donation Fail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DataDonationFail()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DONATION_FAIL__EOCL_EXP = "this.cause = new DataDonationFailCause();"+
"	";

	/**
	 * The cached OCL query for the '{@link #DataDonationFail() <em>Data Donation Fail</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DataDonationFail()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> DATA_DONATION_FAIL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationFail DataDonationFail() {
		if (DATA_DONATION_FAIL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.DATA_DONATION_FAIL, DatatypesPackage.Literals.DATA_DONATION_FAIL.getEAllOperations().get(0));
			try {
				DATA_DONATION_FAIL__EOCL_QRY = helper.createQuery(DATA_DONATION_FAIL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(DATA_DONATION_FAIL__EOCL_QRY);
		return (DataDonationFail) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.DATA_DONATION_FAIL__DATE:
				return basicSetDate(null, msgs);
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
			case DatatypesPackage.DATA_DONATION_FAIL__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_DONATION_FAIL__CODE:
				return getCode();
			case DatatypesPackage.DATA_DONATION_FAIL__DISPLAY_NAME:
				return getDisplayName();
			case DatatypesPackage.DATA_DONATION_FAIL__DATE:
				return getDate();
			case DatatypesPackage.DATA_DONATION_FAIL__CAUSE:
				if (resolve) return getCause();
				return basicGetCause();
			case DatatypesPackage.DATA_DONATION_FAIL__REJECTION_TYPE:
				return getRejectionType();
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
			case DatatypesPackage.DATA_DONATION_FAIL__CODE:
				setCode((String)newValue);
				return;
			case DatatypesPackage.DATA_DONATION_FAIL__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case DatatypesPackage.DATA_DONATION_FAIL__DATE:
				setDate((Date)newValue);
				return;
			case DatatypesPackage.DATA_DONATION_FAIL__CAUSE:
				setCause((DataDonationFailCause)newValue);
				return;
			case DatatypesPackage.DATA_DONATION_FAIL__REJECTION_TYPE:
				setRejectionType((DataDonationRejectionType)newValue);
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
			case DatatypesPackage.DATA_DONATION_FAIL__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_DONATION_FAIL__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_DONATION_FAIL__DATE:
				setDate((Date)null);
				return;
			case DatatypesPackage.DATA_DONATION_FAIL__CAUSE:
				setCause((DataDonationFailCause)null);
				return;
			case DatatypesPackage.DATA_DONATION_FAIL__REJECTION_TYPE:
				setRejectionType(REJECTION_TYPE_EDEFAULT);
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
			case DatatypesPackage.DATA_DONATION_FAIL__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_DONATION_FAIL__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DatatypesPackage.DATA_DONATION_FAIL__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case DatatypesPackage.DATA_DONATION_FAIL__DATE:
				return date != null;
			case DatatypesPackage.DATA_DONATION_FAIL__CAUSE:
				return cause != null;
			case DatatypesPackage.DATA_DONATION_FAIL__REJECTION_TYPE:
				return rejectionType != REJECTION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DatatypesPackage.DATA_DONATION_FAIL___DATA_DONATION_FAIL:
				return DataDonationFail();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", rejectionType: ");
		result.append(rejectionType);
		result.append(')');
		return result.toString();
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} //DataDonationFailImpl
