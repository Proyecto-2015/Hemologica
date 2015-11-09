/**
 */
package org.hemologica.datatypes.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.hemologica.datatypes.DataResponsiblePerson;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Responsible Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl#getSecondName <em>Second Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl#getFirstLastName <em>First Last Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl#getSecondLastName <em>Second Last Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl#getDocumentCountry <em>Document Country</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl#getDocumentNumber <em>Document Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataResponsiblePersonImpl extends MinimalEObjectImpl.Container implements DataResponsiblePerson {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondName() <em>Second Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondName() <em>Second Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondName()
	 * @generated
	 * @ordered
	 */
	protected String secondName = SECOND_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstLastName() <em>First Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstLastName() <em>First Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLastName()
	 * @generated
	 * @ordered
	 */
	protected String firstLastName = FIRST_LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondLastName() <em>Second Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondLastName() <em>Second Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondLastName()
	 * @generated
	 * @ordered
	 */
	protected String secondLastName = SECOND_LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentCountry() <em>Document Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentCountry() <em>Document Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentCountry()
	 * @generated
	 * @ordered
	 */
	protected String documentCountry = DOCUMENT_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentType() <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentType() <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected String documentType = DOCUMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentNumber() <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentNumber() <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentNumber()
	 * @generated
	 * @ordered
	 */
	protected String documentNumber = DOCUMENT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataResponsiblePersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_RESPONSIBLE_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_RESPONSIBLE_PERSON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondName(String newSecondName) {
		String oldSecondName = secondName;
		secondName = newSecondName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_NAME, oldSecondName, secondName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstLastName() {
		return firstLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstLastName(String newFirstLastName) {
		String oldFirstLastName = firstLastName;
		firstLastName = newFirstLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_LAST_NAME, oldFirstLastName, firstLastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondLastName() {
		return secondLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondLastName(String newSecondLastName) {
		String oldSecondLastName = secondLastName;
		secondLastName = newSecondLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_LAST_NAME, oldSecondLastName, secondLastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentCountry() {
		return documentCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentCountry(String newDocumentCountry) {
		String oldDocumentCountry = documentCountry;
		documentCountry = newDocumentCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_COUNTRY, oldDocumentCountry, documentCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentType() {
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentType(String newDocumentType) {
		String oldDocumentType = documentType;
		documentType = newDocumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_TYPE, oldDocumentType, documentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentNumber(String newDocumentNumber) {
		String oldDocumentNumber = documentNumber;
		documentNumber = newDocumentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_NUMBER, oldDocumentNumber, documentNumber));
	}

	/**
	 * The cached OCL expression body for the '{@link #getFullName() <em>Get Full Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FULL_NAME__EOCL_EXP = "return firstName + " " + secondName + " " + firstLastName+ " " + secondLastName;"+
"	";

	/**
	 * The cached OCL query for the '{@link #getFullName() <em>Get Full Name</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FULL_NAME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		if (GET_FULL_NAME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.DATA_RESPONSIBLE_PERSON, DatatypesPackage.Literals.DATA_RESPONSIBLE_PERSON.getEAllOperations().get(0));
			try {
				GET_FULL_NAME__EOCL_QRY = helper.createQuery(GET_FULL_NAME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FULL_NAME__EOCL_QRY);
		return (String) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__ID:
				return getId();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_NAME:
				return getFirstName();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_NAME:
				return getSecondName();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_LAST_NAME:
				return getFirstLastName();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_LAST_NAME:
				return getSecondLastName();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_COUNTRY:
				return getDocumentCountry();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_TYPE:
				return getDocumentType();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_NUMBER:
				return getDocumentNumber();
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
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__ID:
				setId((String)newValue);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_NAME:
				setSecondName((String)newValue);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_LAST_NAME:
				setFirstLastName((String)newValue);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_LAST_NAME:
				setSecondLastName((String)newValue);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_COUNTRY:
				setDocumentCountry((String)newValue);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_TYPE:
				setDocumentType((String)newValue);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_NUMBER:
				setDocumentNumber((String)newValue);
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
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_NAME:
				setSecondName(SECOND_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_LAST_NAME:
				setFirstLastName(FIRST_LAST_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_LAST_NAME:
				setSecondLastName(SECOND_LAST_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_COUNTRY:
				setDocumentCountry(DOCUMENT_COUNTRY_EDEFAULT);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_TYPE:
				setDocumentType(DOCUMENT_TYPE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_NUMBER:
				setDocumentNumber(DOCUMENT_NUMBER_EDEFAULT);
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
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_NAME:
				return SECOND_NAME_EDEFAULT == null ? secondName != null : !SECOND_NAME_EDEFAULT.equals(secondName);
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__FIRST_LAST_NAME:
				return FIRST_LAST_NAME_EDEFAULT == null ? firstLastName != null : !FIRST_LAST_NAME_EDEFAULT.equals(firstLastName);
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__SECOND_LAST_NAME:
				return SECOND_LAST_NAME_EDEFAULT == null ? secondLastName != null : !SECOND_LAST_NAME_EDEFAULT.equals(secondLastName);
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_COUNTRY:
				return DOCUMENT_COUNTRY_EDEFAULT == null ? documentCountry != null : !DOCUMENT_COUNTRY_EDEFAULT.equals(documentCountry);
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_TYPE:
				return DOCUMENT_TYPE_EDEFAULT == null ? documentType != null : !DOCUMENT_TYPE_EDEFAULT.equals(documentType);
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON__DOCUMENT_NUMBER:
				return DOCUMENT_NUMBER_EDEFAULT == null ? documentNumber != null : !DOCUMENT_NUMBER_EDEFAULT.equals(documentNumber);
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
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON___GET_FULL_NAME:
				return getFullName();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", secondName: ");
		result.append(secondName);
		result.append(", firstLastName: ");
		result.append(firstLastName);
		result.append(", secondLastName: ");
		result.append(secondLastName);
		result.append(", documentCountry: ");
		result.append(documentCountry);
		result.append(", documentType: ");
		result.append(documentType);
		result.append(", documentNumber: ");
		result.append(documentNumber);
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

} //DataResponsiblePersonImpl
