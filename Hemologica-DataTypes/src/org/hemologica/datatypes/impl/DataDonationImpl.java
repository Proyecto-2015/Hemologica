/**
 */
package org.hemologica.datatypes.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import jdk.java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.hemologica.constants.DataDonationStateEnum;

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataBloodABOType;
import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataDonation;
import org.hemologica.datatypes.DataDonationDonorType;
import org.hemologica.datatypes.DataDonationEvent;
import org.hemologica.datatypes.DataDonationFail;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DataLaboratoryResult;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Donation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getDataDonorType <em>Data Donor Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getState <em>State</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getBloodABOType <em>Blood ABO Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getBloodDType <em>Blood DType</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getFail <em>Fail</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getLabResults <em>Lab Results</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getExtractionTimeBegin <em>Extraction Time Begin</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataDonationImpl#getExtractionTimeEnd <em>Extraction Time End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDonationImpl extends MinimalEObjectImpl.Container implements DataDonation {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "-4260250837335930498L" is not valid.

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected DataBank bank;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected DataInstitution institution;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected DataPerson person;

	/**
	 * The cached value of the '{@link #getDataDonorType() <em>Data Donor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDonorType()
	 * @generated
	 * @ordered
	 */
	protected DataDonationDonorType dataDonorType;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final DataDonationStateEnum STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected DataDonationStateEnum state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBloodABOType() <em>Blood ABO Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodABOType()
	 * @generated
	 * @ordered
	 */
	protected DataBloodABOType bloodABOType;

	/**
	 * The cached value of the '{@link #getBloodDType() <em>Blood DType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodDType()
	 * @generated
	 * @ordered
	 */
	protected DataBloodType bloodDType;

	/**
	 * The cached value of the '{@link #getFail() <em>Fail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFail()
	 * @generated
	 * @ordered
	 */
	protected DataDonationFail fail;

	/**
	 * The cached value of the '{@link #getLabResults() <em>Lab Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabResults()
	 * @generated
	 * @ordered
	 */
	protected EList<DataLaboratoryResult> labResults;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DataDonationEvent> events;

	/**
	 * The cached value of the '{@link #getExtractionTimeBegin() <em>Extraction Time Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractionTimeBegin()
	 * @generated
	 * @ordered
	 */
	protected Date extractionTimeBegin;

	/**
	 * The cached value of the '{@link #getExtractionTimeEnd() <em>Extraction Time End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractionTimeEnd()
	 * @generated
	 * @ordered
	 */
	protected Date extractionTimeEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDonationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_DONATION;
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBank getBank() {
		if (bank != null && bank.eIsProxy()) {
			InternalEObject oldBank = (InternalEObject)bank;
			bank = (DataBank)eResolveProxy(oldBank);
			if (bank != oldBank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_DONATION__BANK, oldBank, bank));
			}
		}
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBank basicGetBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(DataBank newBank) {
		DataBank oldBank = bank;
		bank = newBank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__BANK, oldBank, bank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInstitution getInstitution() {
		if (institution != null && institution.eIsProxy()) {
			InternalEObject oldInstitution = (InternalEObject)institution;
			institution = (DataInstitution)eResolveProxy(oldInstitution);
			if (institution != oldInstitution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_DONATION__INSTITUTION, oldInstitution, institution));
			}
		}
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInstitution basicGetInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitution(DataInstitution newInstitution) {
		DataInstitution oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__INSTITUTION, oldInstitution, institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPerson getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (DataPerson)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_DONATION__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPerson basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(DataPerson newPerson) {
		DataPerson oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationDonorType getDataDonorType() {
		if (dataDonorType != null && dataDonorType.eIsProxy()) {
			InternalEObject oldDataDonorType = (InternalEObject)dataDonorType;
			dataDonorType = (DataDonationDonorType)eResolveProxy(oldDataDonorType);
			if (dataDonorType != oldDataDonorType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_DONATION__DATA_DONOR_TYPE, oldDataDonorType, dataDonorType));
			}
		}
		return dataDonorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationDonorType basicGetDataDonorType() {
		return dataDonorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDonorType(DataDonationDonorType newDataDonorType) {
		DataDonationDonorType oldDataDonorType = dataDonorType;
		dataDonorType = newDataDonorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__DATA_DONOR_TYPE, oldDataDonorType, dataDonorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationStateEnum getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(DataDonationStateEnum newState) {
		DataDonationStateEnum oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodABOType getBloodABOType() {
		if (bloodABOType != null && bloodABOType.eIsProxy()) {
			InternalEObject oldBloodABOType = (InternalEObject)bloodABOType;
			bloodABOType = (DataBloodABOType)eResolveProxy(oldBloodABOType);
			if (bloodABOType != oldBloodABOType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_DONATION__BLOOD_ABO_TYPE, oldBloodABOType, bloodABOType));
			}
		}
		return bloodABOType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodABOType basicGetBloodABOType() {
		return bloodABOType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloodABOType(DataBloodABOType newBloodABOType) {
		DataBloodABOType oldBloodABOType = bloodABOType;
		bloodABOType = newBloodABOType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__BLOOD_ABO_TYPE, oldBloodABOType, bloodABOType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodType getBloodDType() {
		if (bloodDType != null && bloodDType.eIsProxy()) {
			InternalEObject oldBloodDType = (InternalEObject)bloodDType;
			bloodDType = (DataBloodType)eResolveProxy(oldBloodDType);
			if (bloodDType != oldBloodDType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_DONATION__BLOOD_DTYPE, oldBloodDType, bloodDType));
			}
		}
		return bloodDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodType basicGetBloodDType() {
		return bloodDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloodDType(DataBloodType newBloodDType) {
		DataBloodType oldBloodDType = bloodDType;
		bloodDType = newBloodDType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__BLOOD_DTYPE, oldBloodDType, bloodDType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationFail getFail() {
		if (fail != null && fail.eIsProxy()) {
			InternalEObject oldFail = (InternalEObject)fail;
			fail = (DataDonationFail)eResolveProxy(oldFail);
			if (fail != oldFail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_DONATION__FAIL, oldFail, fail));
			}
		}
		return fail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationFail basicGetFail() {
		return fail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFail(DataDonationFail newFail) {
		DataDonationFail oldFail = fail;
		fail = newFail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__FAIL, oldFail, fail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataLaboratoryResult> getLabResults() {
		if (labResults == null) {
			labResults = new EObjectResolvingEList<DataLaboratoryResult>(DataLaboratoryResult.class, this, DatatypesPackage.DATA_DONATION__LAB_RESULTS);
		}
		return labResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataDonationEvent> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<DataDonationEvent>(DataDonationEvent.class, this, DatatypesPackage.DATA_DONATION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExtractionTimeBegin() {
		return extractionTimeBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtractionTimeBegin(Date newExtractionTimeBegin, NotificationChain msgs) {
		Date oldExtractionTimeBegin = extractionTimeBegin;
		extractionTimeBegin = newExtractionTimeBegin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN, oldExtractionTimeBegin, newExtractionTimeBegin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractionTimeBegin(Date newExtractionTimeBegin) {
		if (newExtractionTimeBegin != extractionTimeBegin) {
			NotificationChain msgs = null;
			if (extractionTimeBegin != null)
				msgs = ((InternalEObject)extractionTimeBegin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN, null, msgs);
			if (newExtractionTimeBegin != null)
				msgs = ((InternalEObject)newExtractionTimeBegin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN, null, msgs);
			msgs = basicSetExtractionTimeBegin(newExtractionTimeBegin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN, newExtractionTimeBegin, newExtractionTimeBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExtractionTimeEnd() {
		return extractionTimeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtractionTimeEnd(Date newExtractionTimeEnd, NotificationChain msgs) {
		Date oldExtractionTimeEnd = extractionTimeEnd;
		extractionTimeEnd = newExtractionTimeEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END, oldExtractionTimeEnd, newExtractionTimeEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractionTimeEnd(Date newExtractionTimeEnd) {
		if (newExtractionTimeEnd != extractionTimeEnd) {
			NotificationChain msgs = null;
			if (extractionTimeEnd != null)
				msgs = ((InternalEObject)extractionTimeEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END, null, msgs);
			if (newExtractionTimeEnd != null)
				msgs = ((InternalEObject)newExtractionTimeEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END, null, msgs);
			msgs = basicSetExtractionTimeEnd(newExtractionTimeEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END, newExtractionTimeEnd, newExtractionTimeEnd));
	}

	/**
	 * The cached OCL expression body for the '{@link #DataDonation() <em>Data Donation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DataDonation()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DONATION__EOCL_EXP = "this.fail = new DataDonationFail();"+
"		this.bloodABOType = new DataBloodABOType();"+
"		this.bloodDType = new DataBloodType();"+
"		this.dataDonorType = new DataDonationDonorType();"+
"		this.person = new DataPerson();"+
"		this.labResults = new ArrayList<DataLaboratoryResult>();"+
"		this.events = new ArrayList<DataDonationEvent>();"+
"	";

	/**
	 * The cached OCL query for the '{@link #DataDonation() <em>Data Donation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DataDonation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> DATA_DONATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation DataDonation() {
		if (DATA_DONATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.DATA_DONATION, DatatypesPackage.Literals.DATA_DONATION.getEAllOperations().get(0));
			try {
				DATA_DONATION__EOCL_QRY = helper.createQuery(DATA_DONATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(DATA_DONATION__EOCL_QRY);
		return (DataDonation) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #isApproved() <em>Is Approved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApproved()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_APPROVED__EOCL_EXP = "if(this.state != null)"+
"			return this.state.compareTo(DataDonationStateEnum.MADE)==0;"+
"		else"+
"			return false;"+
"	";

	/**
	 * The cached OCL query for the '{@link #isApproved() <em>Is Approved</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApproved()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_APPROVED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApproved() {
		if (IS_APPROVED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.DATA_DONATION, DatatypesPackage.Literals.DATA_DONATION.getEAllOperations().get(1));
			try {
				IS_APPROVED__EOCL_QRY = helper.createQuery(IS_APPROVED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_APPROVED__EOCL_QRY);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * The cached OCL expression body for the '{@link #isStateDefined() <em>Is State Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateDefined()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_STATE_DEFINED__EOCL_EXP = "return this.state != null;"+
"	";

	/**
	 * The cached OCL query for the '{@link #isStateDefined() <em>Is State Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateDefined()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_STATE_DEFINED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStateDefined() {
		if (IS_STATE_DEFINED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.DATA_DONATION, DatatypesPackage.Literals.DATA_DONATION.getEAllOperations().get(2));
			try {
				IS_STATE_DEFINED__EOCL_QRY = helper.createQuery(IS_STATE_DEFINED__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IS_STATE_DEFINED__EOCL_QRY);
		return ((Boolean) query.evaluate(this)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN:
				return basicSetExtractionTimeBegin(null, msgs);
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END:
				return basicSetExtractionTimeEnd(null, msgs);
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
			case DatatypesPackage.DATA_DONATION__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_DONATION__NAME:
				return getName();
			case DatatypesPackage.DATA_DONATION__DATE:
				return getDate();
			case DatatypesPackage.DATA_DONATION__BANK:
				if (resolve) return getBank();
				return basicGetBank();
			case DatatypesPackage.DATA_DONATION__INSTITUTION:
				if (resolve) return getInstitution();
				return basicGetInstitution();
			case DatatypesPackage.DATA_DONATION__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case DatatypesPackage.DATA_DONATION__DATA_DONOR_TYPE:
				if (resolve) return getDataDonorType();
				return basicGetDataDonorType();
			case DatatypesPackage.DATA_DONATION__STATE:
				return getState();
			case DatatypesPackage.DATA_DONATION__BLOOD_ABO_TYPE:
				if (resolve) return getBloodABOType();
				return basicGetBloodABOType();
			case DatatypesPackage.DATA_DONATION__BLOOD_DTYPE:
				if (resolve) return getBloodDType();
				return basicGetBloodDType();
			case DatatypesPackage.DATA_DONATION__FAIL:
				if (resolve) return getFail();
				return basicGetFail();
			case DatatypesPackage.DATA_DONATION__LAB_RESULTS:
				return getLabResults();
			case DatatypesPackage.DATA_DONATION__EVENTS:
				return getEvents();
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN:
				return getExtractionTimeBegin();
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END:
				return getExtractionTimeEnd();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatypesPackage.DATA_DONATION__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__DATE:
				setDate((String)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__BANK:
				setBank((DataBank)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__INSTITUTION:
				setInstitution((DataInstitution)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__PERSON:
				setPerson((DataPerson)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__DATA_DONOR_TYPE:
				setDataDonorType((DataDonationDonorType)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__STATE:
				setState((DataDonationStateEnum)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__BLOOD_ABO_TYPE:
				setBloodABOType((DataBloodABOType)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__BLOOD_DTYPE:
				setBloodDType((DataBloodType)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__FAIL:
				setFail((DataDonationFail)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__LAB_RESULTS:
				getLabResults().clear();
				getLabResults().addAll((Collection<? extends DataLaboratoryResult>)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends DataDonationEvent>)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN:
				setExtractionTimeBegin((Date)newValue);
				return;
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END:
				setExtractionTimeEnd((Date)newValue);
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
			case DatatypesPackage.DATA_DONATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_DONATION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_DONATION__BANK:
				setBank((DataBank)null);
				return;
			case DatatypesPackage.DATA_DONATION__INSTITUTION:
				setInstitution((DataInstitution)null);
				return;
			case DatatypesPackage.DATA_DONATION__PERSON:
				setPerson((DataPerson)null);
				return;
			case DatatypesPackage.DATA_DONATION__DATA_DONOR_TYPE:
				setDataDonorType((DataDonationDonorType)null);
				return;
			case DatatypesPackage.DATA_DONATION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_DONATION__BLOOD_ABO_TYPE:
				setBloodABOType((DataBloodABOType)null);
				return;
			case DatatypesPackage.DATA_DONATION__BLOOD_DTYPE:
				setBloodDType((DataBloodType)null);
				return;
			case DatatypesPackage.DATA_DONATION__FAIL:
				setFail((DataDonationFail)null);
				return;
			case DatatypesPackage.DATA_DONATION__LAB_RESULTS:
				getLabResults().clear();
				return;
			case DatatypesPackage.DATA_DONATION__EVENTS:
				getEvents().clear();
				return;
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN:
				setExtractionTimeBegin((Date)null);
				return;
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END:
				setExtractionTimeEnd((Date)null);
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
			case DatatypesPackage.DATA_DONATION__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_DONATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.DATA_DONATION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DatatypesPackage.DATA_DONATION__BANK:
				return bank != null;
			case DatatypesPackage.DATA_DONATION__INSTITUTION:
				return institution != null;
			case DatatypesPackage.DATA_DONATION__PERSON:
				return person != null;
			case DatatypesPackage.DATA_DONATION__DATA_DONOR_TYPE:
				return dataDonorType != null;
			case DatatypesPackage.DATA_DONATION__STATE:
				return state != STATE_EDEFAULT;
			case DatatypesPackage.DATA_DONATION__BLOOD_ABO_TYPE:
				return bloodABOType != null;
			case DatatypesPackage.DATA_DONATION__BLOOD_DTYPE:
				return bloodDType != null;
			case DatatypesPackage.DATA_DONATION__FAIL:
				return fail != null;
			case DatatypesPackage.DATA_DONATION__LAB_RESULTS:
				return labResults != null && !labResults.isEmpty();
			case DatatypesPackage.DATA_DONATION__EVENTS:
				return events != null && !events.isEmpty();
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_BEGIN:
				return extractionTimeBegin != null;
			case DatatypesPackage.DATA_DONATION__EXTRACTION_TIME_END:
				return extractionTimeEnd != null;
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
			case DatatypesPackage.DATA_DONATION___DATA_DONATION:
				return DataDonation();
			case DatatypesPackage.DATA_DONATION___IS_APPROVED:
				return isApproved();
			case DatatypesPackage.DATA_DONATION___IS_STATE_DEFINED:
				return isStateDefined();
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
		result.append(", name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", state: ");
		result.append(state);
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

} //DataDonationImpl
