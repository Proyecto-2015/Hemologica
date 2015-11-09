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

import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.hemologica.datatypes.DatatypesPackage;
import org.hemologica.datatypes.DonationResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Donation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DonationResultImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationResultImpl#getDonationId <em>Donation Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationResultImpl#getPersonDocument <em>Person Document</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationResultImpl#getPersonCompleteName <em>Person Complete Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationResultImpl#getDonationDate <em>Donation Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DonationResultImpl#getDonationState <em>Donation State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DonationResultImpl extends MinimalEObjectImpl.Container implements DonationResult {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "9023483717165649475L" is not valid.

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
	 * The default value of the '{@link #getDonationId() <em>Donation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonationId()
	 * @generated
	 * @ordered
	 */
	protected static final String DONATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDonationId() <em>Donation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonationId()
	 * @generated
	 * @ordered
	 */
	protected String donationId = DONATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonDocument() <em>Person Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDocument()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonDocument() <em>Person Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDocument()
	 * @generated
	 * @ordered
	 */
	protected String personDocument = PERSON_DOCUMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonCompleteName() <em>Person Complete Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonCompleteName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_COMPLETE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonCompleteName() <em>Person Complete Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonCompleteName()
	 * @generated
	 * @ordered
	 */
	protected String personCompleteName = PERSON_COMPLETE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDonationDate() <em>Donation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonationDate()
	 * @generated
	 * @ordered
	 */
	protected Date donationDate;

	/**
	 * The default value of the '{@link #getDonationState() <em>Donation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonationState()
	 * @generated
	 * @ordered
	 */
	protected static final String DONATION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDonationState() <em>Donation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDonationState()
	 * @generated
	 * @ordered
	 */
	protected String donationState = DONATION_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DonationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DONATION_RESULT;
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
	public String getDonationId() {
		return donationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonationId(String newDonationId) {
		String oldDonationId = donationId;
		donationId = newDonationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATION_RESULT__DONATION_ID, oldDonationId, donationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonDocument() {
		return personDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonDocument(String newPersonDocument) {
		String oldPersonDocument = personDocument;
		personDocument = newPersonDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATION_RESULT__PERSON_DOCUMENT, oldPersonDocument, personDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonCompleteName() {
		return personCompleteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonCompleteName(String newPersonCompleteName) {
		String oldPersonCompleteName = personCompleteName;
		personCompleteName = newPersonCompleteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATION_RESULT__PERSON_COMPLETE_NAME, oldPersonCompleteName, personCompleteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDonationDate() {
		return donationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDonationDate(Date newDonationDate, NotificationChain msgs) {
		Date oldDonationDate = donationDate;
		donationDate = newDonationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATION_RESULT__DONATION_DATE, oldDonationDate, newDonationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonationDate(Date newDonationDate) {
		if (newDonationDate != donationDate) {
			NotificationChain msgs = null;
			if (donationDate != null)
				msgs = ((InternalEObject)donationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DONATION_RESULT__DONATION_DATE, null, msgs);
			if (newDonationDate != null)
				msgs = ((InternalEObject)newDonationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DONATION_RESULT__DONATION_DATE, null, msgs);
			msgs = basicSetDonationDate(newDonationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATION_RESULT__DONATION_DATE, newDonationDate, newDonationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDonationState() {
		return donationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDonationState(String newDonationState) {
		String oldDonationState = donationState;
		donationState = newDonationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DONATION_RESULT__DONATION_STATE, oldDonationState, donationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationResult DonationResult() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #DonationResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String) <em>Donation Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DonationResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String DONATION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_EXP = "this.donationId = donationId;"+
"		this.personDocument = personDocument;"+
"		this.personCompleteName = personCompleteName;"+
"		this.donationDate = donationDate;"+
"		this.donationState = donationState;"+
"	";

	/**
	 * The cached OCL query for the '{@link #DonationResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String) <em>Donation Result</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DonationResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> DONATION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationResult DonationResult(String donationId, String personDocument, String personCompleteName, Date donationDate, String donationState) {
		if (DONATION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.DONATION_RESULT, DatatypesPackage.Literals.DONATION_RESULT.getEAllOperations().get(1));
			try {
				DONATION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_QRY = helper.createQuery(DONATION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(DONATION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("donationId", donationId);
		environment.add("personDocument", personDocument);
		environment.add("personCompleteName", personCompleteName);
		environment.add("donationDate", donationDate);
		environment.add("donationState", donationState);
		return (DonationResult) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.DONATION_RESULT__DONATION_DATE:
				return basicSetDonationDate(null, msgs);
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
			case DatatypesPackage.DONATION_RESULT__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DONATION_RESULT__DONATION_ID:
				return getDonationId();
			case DatatypesPackage.DONATION_RESULT__PERSON_DOCUMENT:
				return getPersonDocument();
			case DatatypesPackage.DONATION_RESULT__PERSON_COMPLETE_NAME:
				return getPersonCompleteName();
			case DatatypesPackage.DONATION_RESULT__DONATION_DATE:
				return getDonationDate();
			case DatatypesPackage.DONATION_RESULT__DONATION_STATE:
				return getDonationState();
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
			case DatatypesPackage.DONATION_RESULT__DONATION_ID:
				setDonationId((String)newValue);
				return;
			case DatatypesPackage.DONATION_RESULT__PERSON_DOCUMENT:
				setPersonDocument((String)newValue);
				return;
			case DatatypesPackage.DONATION_RESULT__PERSON_COMPLETE_NAME:
				setPersonCompleteName((String)newValue);
				return;
			case DatatypesPackage.DONATION_RESULT__DONATION_DATE:
				setDonationDate((Date)newValue);
				return;
			case DatatypesPackage.DONATION_RESULT__DONATION_STATE:
				setDonationState((String)newValue);
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
			case DatatypesPackage.DONATION_RESULT__DONATION_ID:
				setDonationId(DONATION_ID_EDEFAULT);
				return;
			case DatatypesPackage.DONATION_RESULT__PERSON_DOCUMENT:
				setPersonDocument(PERSON_DOCUMENT_EDEFAULT);
				return;
			case DatatypesPackage.DONATION_RESULT__PERSON_COMPLETE_NAME:
				setPersonCompleteName(PERSON_COMPLETE_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DONATION_RESULT__DONATION_DATE:
				setDonationDate((Date)null);
				return;
			case DatatypesPackage.DONATION_RESULT__DONATION_STATE:
				setDonationState(DONATION_STATE_EDEFAULT);
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
			case DatatypesPackage.DONATION_RESULT__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DONATION_RESULT__DONATION_ID:
				return DONATION_ID_EDEFAULT == null ? donationId != null : !DONATION_ID_EDEFAULT.equals(donationId);
			case DatatypesPackage.DONATION_RESULT__PERSON_DOCUMENT:
				return PERSON_DOCUMENT_EDEFAULT == null ? personDocument != null : !PERSON_DOCUMENT_EDEFAULT.equals(personDocument);
			case DatatypesPackage.DONATION_RESULT__PERSON_COMPLETE_NAME:
				return PERSON_COMPLETE_NAME_EDEFAULT == null ? personCompleteName != null : !PERSON_COMPLETE_NAME_EDEFAULT.equals(personCompleteName);
			case DatatypesPackage.DONATION_RESULT__DONATION_DATE:
				return donationDate != null;
			case DatatypesPackage.DONATION_RESULT__DONATION_STATE:
				return DONATION_STATE_EDEFAULT == null ? donationState != null : !DONATION_STATE_EDEFAULT.equals(donationState);
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
			case DatatypesPackage.DONATION_RESULT___DONATION_RESULT:
				return DonationResult();
			case DatatypesPackage.DONATION_RESULT___DONATION_RESULT__STRING_STRING_STRING_DATE_STRING:
				return DonationResult((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Date)arguments.get(3), (String)arguments.get(4));
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
		result.append(", donationId: ");
		result.append(donationId);
		result.append(", personDocument: ");
		result.append(personDocument);
		result.append(", personCompleteName: ");
		result.append(personCompleteName);
		result.append(", donationState: ");
		result.append(donationState);
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

} //DonationResultImpl
