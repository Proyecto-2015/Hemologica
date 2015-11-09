/**
 */
package org.hemologica.datatypes.impl;

import jdk.java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hemologica.datatypes.DataCode;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Laboratory Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataLaboratoryResultImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataLaboratoryResultImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataLaboratoryResultImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataLaboratoryResultImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataLaboratoryResultImpl#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataLaboratoryResultImpl#isResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataLaboratoryResultImpl extends MinimalEObjectImpl.Container implements DataLaboratoryResult {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "7214257230098571156L" is not valid.

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
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected DataCode analysis;

	/**
	 * The default value of the '{@link #getBank() <em>Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected String bank = BANK_EDEFAULT;

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
	 * The cached value of the '{@link #getResponsiblePerson() <em>Responsible Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePerson()
	 * @generated
	 * @ordered
	 */
	protected DataResponsiblePerson responsiblePerson;

	/**
	 * The default value of the '{@link #isResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResult()
	 * @generated
	 * @ordered
	 */
	protected boolean result = RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLaboratoryResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_LABORATORY_RESULT;
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
	public DataCode getAnalysis() {
		if (analysis != null && analysis.eIsProxy()) {
			InternalEObject oldAnalysis = (InternalEObject)analysis;
			analysis = (DataCode)eResolveProxy(oldAnalysis);
			if (analysis != oldAnalysis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_LABORATORY_RESULT__ANALYSIS, oldAnalysis, analysis));
			}
		}
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCode basicGetAnalysis() {
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysis(DataCode newAnalysis) {
		DataCode oldAnalysis = analysis;
		analysis = newAnalysis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_LABORATORY_RESULT__ANALYSIS, oldAnalysis, analysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(String newBank) {
		String oldBank = bank;
		bank = newBank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_LABORATORY_RESULT__BANK, oldBank, bank));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_LABORATORY_RESULT__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_LABORATORY_RESULT__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_LABORATORY_RESULT__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_LABORATORY_RESULT__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResponsiblePerson getResponsiblePerson() {
		if (responsiblePerson != null && responsiblePerson.eIsProxy()) {
			InternalEObject oldResponsiblePerson = (InternalEObject)responsiblePerson;
			responsiblePerson = (DataResponsiblePerson)eResolveProxy(oldResponsiblePerson);
			if (responsiblePerson != oldResponsiblePerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON, oldResponsiblePerson, responsiblePerson));
			}
		}
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResponsiblePerson basicGetResponsiblePerson() {
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiblePerson(DataResponsiblePerson newResponsiblePerson) {
		DataResponsiblePerson oldResponsiblePerson = responsiblePerson;
		responsiblePerson = newResponsiblePerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON, oldResponsiblePerson, responsiblePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(boolean newResult) {
		boolean oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_LABORATORY_RESULT__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.DATA_LABORATORY_RESULT__DATE:
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
			case DatatypesPackage.DATA_LABORATORY_RESULT__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_LABORATORY_RESULT__ANALYSIS:
				if (resolve) return getAnalysis();
				return basicGetAnalysis();
			case DatatypesPackage.DATA_LABORATORY_RESULT__BANK:
				return getBank();
			case DatatypesPackage.DATA_LABORATORY_RESULT__DATE:
				return getDate();
			case DatatypesPackage.DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON:
				if (resolve) return getResponsiblePerson();
				return basicGetResponsiblePerson();
			case DatatypesPackage.DATA_LABORATORY_RESULT__RESULT:
				return isResult();
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
			case DatatypesPackage.DATA_LABORATORY_RESULT__ANALYSIS:
				setAnalysis((DataCode)newValue);
				return;
			case DatatypesPackage.DATA_LABORATORY_RESULT__BANK:
				setBank((String)newValue);
				return;
			case DatatypesPackage.DATA_LABORATORY_RESULT__DATE:
				setDate((Date)newValue);
				return;
			case DatatypesPackage.DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON:
				setResponsiblePerson((DataResponsiblePerson)newValue);
				return;
			case DatatypesPackage.DATA_LABORATORY_RESULT__RESULT:
				setResult((Boolean)newValue);
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
			case DatatypesPackage.DATA_LABORATORY_RESULT__ANALYSIS:
				setAnalysis((DataCode)null);
				return;
			case DatatypesPackage.DATA_LABORATORY_RESULT__BANK:
				setBank(BANK_EDEFAULT);
				return;
			case DatatypesPackage.DATA_LABORATORY_RESULT__DATE:
				setDate((Date)null);
				return;
			case DatatypesPackage.DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON:
				setResponsiblePerson((DataResponsiblePerson)null);
				return;
			case DatatypesPackage.DATA_LABORATORY_RESULT__RESULT:
				setResult(RESULT_EDEFAULT);
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
			case DatatypesPackage.DATA_LABORATORY_RESULT__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_LABORATORY_RESULT__ANALYSIS:
				return analysis != null;
			case DatatypesPackage.DATA_LABORATORY_RESULT__BANK:
				return BANK_EDEFAULT == null ? bank != null : !BANK_EDEFAULT.equals(bank);
			case DatatypesPackage.DATA_LABORATORY_RESULT__DATE:
				return date != null;
			case DatatypesPackage.DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON:
				return responsiblePerson != null;
			case DatatypesPackage.DATA_LABORATORY_RESULT__RESULT:
				return result != RESULT_EDEFAULT;
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
		result.append(", bank: ");
		result.append(bank);
		result.append(", result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //DataLaboratoryResultImpl
