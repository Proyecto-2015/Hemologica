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
import org.hemologica.datatypes.TransfusionResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfusion Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionResultImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionResultImpl#getTransfusionId <em>Transfusion Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionResultImpl#getPersonDocument <em>Person Document</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionResultImpl#getPersonCompleteName <em>Person Complete Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionResultImpl#getTransfusionDate <em>Transfusion Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionResultImpl#getTransfusionState <em>Transfusion State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransfusionResultImpl extends MinimalEObjectImpl.Container implements TransfusionResult {
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
	 * The default value of the '{@link #getTransfusionId() <em>Transfusion Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfusionId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFUSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransfusionId() <em>Transfusion Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfusionId()
	 * @generated
	 * @ordered
	 */
	protected String transfusionId = TRANSFUSION_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getTransfusionDate() <em>Transfusion Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfusionDate()
	 * @generated
	 * @ordered
	 */
	protected Date transfusionDate;

	/**
	 * The default value of the '{@link #getTransfusionState() <em>Transfusion State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfusionState()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFUSION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransfusionState() <em>Transfusion State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfusionState()
	 * @generated
	 * @ordered
	 */
	protected String transfusionState = TRANSFUSION_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransfusionResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.TRANSFUSION_RESULT;
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
	public String getTransfusionId() {
		return transfusionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfusionId(String newTransfusionId) {
		String oldTransfusionId = transfusionId;
		transfusionId = newTransfusionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_ID, oldTransfusionId, transfusionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_RESULT__PERSON_DOCUMENT, oldPersonDocument, personDocument));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_RESULT__PERSON_COMPLETE_NAME, oldPersonCompleteName, personCompleteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTransfusionDate() {
		return transfusionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransfusionDate(Date newTransfusionDate, NotificationChain msgs) {
		Date oldTransfusionDate = transfusionDate;
		transfusionDate = newTransfusionDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE, oldTransfusionDate, newTransfusionDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfusionDate(Date newTransfusionDate) {
		if (newTransfusionDate != transfusionDate) {
			NotificationChain msgs = null;
			if (transfusionDate != null)
				msgs = ((InternalEObject)transfusionDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE, null, msgs);
			if (newTransfusionDate != null)
				msgs = ((InternalEObject)newTransfusionDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE, null, msgs);
			msgs = basicSetTransfusionDate(newTransfusionDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE, newTransfusionDate, newTransfusionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransfusionState() {
		return transfusionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfusionState(String newTransfusionState) {
		String oldTransfusionState = transfusionState;
		transfusionState = newTransfusionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_STATE, oldTransfusionState, transfusionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionResult TransfusionResult() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #TransfusionResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String) <em>Transfusion Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TransfusionResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_EXP = "this.transfusionId = transfusionId;"+
"		this.personDocument = personDocument;"+
"		this.personCompleteName = personCompleteName;"+
"		this.transfusionDate = transfusionDate;"+
"		this.transfusionState = transfusionState;"+
"	";

	/**
	 * The cached OCL query for the '{@link #TransfusionResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String) <em>Transfusion Result</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TransfusionResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionResult TransfusionResult(String transfusionId, String personDocument, String personCompleteName, Date transfusionDate, String transfusionState) {
		if (TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.TRANSFUSION_RESULT, DatatypesPackage.Literals.TRANSFUSION_RESULT.getEAllOperations().get(1));
			try {
				TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_QRY = helper.createQuery(TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("transfusionId", transfusionId);
		environment.add("personDocument", personDocument);
		environment.add("personCompleteName", personCompleteName);
		environment.add("transfusionDate", transfusionDate);
		environment.add("transfusionState", transfusionState);
		return (TransfusionResult) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE:
				return basicSetTransfusionDate(null, msgs);
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
			case DatatypesPackage.TRANSFUSION_RESULT__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_ID:
				return getTransfusionId();
			case DatatypesPackage.TRANSFUSION_RESULT__PERSON_DOCUMENT:
				return getPersonDocument();
			case DatatypesPackage.TRANSFUSION_RESULT__PERSON_COMPLETE_NAME:
				return getPersonCompleteName();
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE:
				return getTransfusionDate();
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_STATE:
				return getTransfusionState();
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
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_ID:
				setTransfusionId((String)newValue);
				return;
			case DatatypesPackage.TRANSFUSION_RESULT__PERSON_DOCUMENT:
				setPersonDocument((String)newValue);
				return;
			case DatatypesPackage.TRANSFUSION_RESULT__PERSON_COMPLETE_NAME:
				setPersonCompleteName((String)newValue);
				return;
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE:
				setTransfusionDate((Date)newValue);
				return;
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_STATE:
				setTransfusionState((String)newValue);
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
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_ID:
				setTransfusionId(TRANSFUSION_ID_EDEFAULT);
				return;
			case DatatypesPackage.TRANSFUSION_RESULT__PERSON_DOCUMENT:
				setPersonDocument(PERSON_DOCUMENT_EDEFAULT);
				return;
			case DatatypesPackage.TRANSFUSION_RESULT__PERSON_COMPLETE_NAME:
				setPersonCompleteName(PERSON_COMPLETE_NAME_EDEFAULT);
				return;
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE:
				setTransfusionDate((Date)null);
				return;
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_STATE:
				setTransfusionState(TRANSFUSION_STATE_EDEFAULT);
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
			case DatatypesPackage.TRANSFUSION_RESULT__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_ID:
				return TRANSFUSION_ID_EDEFAULT == null ? transfusionId != null : !TRANSFUSION_ID_EDEFAULT.equals(transfusionId);
			case DatatypesPackage.TRANSFUSION_RESULT__PERSON_DOCUMENT:
				return PERSON_DOCUMENT_EDEFAULT == null ? personDocument != null : !PERSON_DOCUMENT_EDEFAULT.equals(personDocument);
			case DatatypesPackage.TRANSFUSION_RESULT__PERSON_COMPLETE_NAME:
				return PERSON_COMPLETE_NAME_EDEFAULT == null ? personCompleteName != null : !PERSON_COMPLETE_NAME_EDEFAULT.equals(personCompleteName);
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_DATE:
				return transfusionDate != null;
			case DatatypesPackage.TRANSFUSION_RESULT__TRANSFUSION_STATE:
				return TRANSFUSION_STATE_EDEFAULT == null ? transfusionState != null : !TRANSFUSION_STATE_EDEFAULT.equals(transfusionState);
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
			case DatatypesPackage.TRANSFUSION_RESULT___TRANSFUSION_RESULT:
				return TransfusionResult();
			case DatatypesPackage.TRANSFUSION_RESULT___TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING:
				return TransfusionResult((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Date)arguments.get(3), (String)arguments.get(4));
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
		result.append(", transfusionId: ");
		result.append(transfusionId);
		result.append(", personDocument: ");
		result.append(personDocument);
		result.append(", personCompleteName: ");
		result.append(personCompleteName);
		result.append(", transfusionState: ");
		result.append(transfusionState);
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

} //TransfusionResultImpl
