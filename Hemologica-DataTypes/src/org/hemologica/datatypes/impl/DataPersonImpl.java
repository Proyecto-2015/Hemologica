/**
 */
package org.hemologica.datatypes.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.hemologica.datatypes.DataBloodType;
import org.hemologica.datatypes.DataCity;
import org.hemologica.datatypes.DataPerson;
import org.hemologica.datatypes.DataState;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getSecondName <em>Second Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getFirstLastName <em>First Last Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getSecondLastName <em>Second Last Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getDocumentCountry <em>Document Country</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getBirthdayDate <em>Birthday Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getState <em>State</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getBloodType <em>Blood Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#isAbleToDonate <em>Able To Donate</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#isAllowNotificationNeedDonor <em>Allow Notification Need Donor</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataPersonImpl#isAllowNotificationAbleToDonate <em>Allow Notification Able To Donate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPersonImpl extends MinimalEObjectImpl.Container implements DataPerson {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "1221320030601695117L" is not valid.

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
	 * The default value of the '{@link #getBirthdayDate() <em>Birthday Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdayDate()
	 * @generated
	 * @ordered
	 */
	protected static final String BIRTHDAY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdayDate() <em>Birthday Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdayDate()
	 * @generated
	 * @ordered
	 */
	protected String birthdayDate = BIRTHDAY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected DataState state;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected DataCity city;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephone() <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephone()
	 * @generated
	 * @ordered
	 */
	protected String telephone = TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

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
	 * The default value of the '{@link #isAbleToDonate() <em>Able To Donate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbleToDonate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABLE_TO_DONATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbleToDonate() <em>Able To Donate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbleToDonate()
	 * @generated
	 * @ordered
	 */
	protected boolean ableToDonate = ABLE_TO_DONATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<Byte> image;

	/**
	 * The default value of the '{@link #isAllowNotificationNeedDonor() <em>Allow Notification Need Donor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowNotificationNeedDonor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_NOTIFICATION_NEED_DONOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowNotificationNeedDonor() <em>Allow Notification Need Donor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowNotificationNeedDonor()
	 * @generated
	 * @ordered
	 */
	protected boolean allowNotificationNeedDonor = ALLOW_NOTIFICATION_NEED_DONOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowNotificationAbleToDonate() <em>Allow Notification Able To Donate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowNotificationAbleToDonate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_NOTIFICATION_ABLE_TO_DONATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowNotificationAbleToDonate() <em>Allow Notification Able To Donate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowNotificationAbleToDonate()
	 * @generated
	 * @ordered
	 */
	protected boolean allowNotificationAbleToDonate = ALLOW_NOTIFICATION_ABLE_TO_DONATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_PERSON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__FIRST_NAME, oldFirstName, firstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__SECOND_NAME, oldSecondName, secondName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__FIRST_LAST_NAME, oldFirstLastName, firstLastName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__SECOND_LAST_NAME, oldSecondLastName, secondLastName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__DOCUMENT_COUNTRY, oldDocumentCountry, documentCountry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__DOCUMENT_TYPE, oldDocumentType, documentType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__DOCUMENT_NUMBER, oldDocumentNumber, documentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBirthdayDate() {
		return birthdayDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdayDate(String newBirthdayDate) {
		String oldBirthdayDate = birthdayDate;
		birthdayDate = newBirthdayDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__BIRTHDAY_DATE, oldBirthdayDate, birthdayDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (DataState)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_PERSON__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(DataState newState) {
		DataState oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCity getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject)city;
			city = (DataCity)eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_PERSON__CITY, oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCity basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(DataCity newCity) {
		DataCity oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephone(String newTelephone) {
		String oldTelephone = telephone;
		telephone = newTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__TELEPHONE, oldTelephone, telephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__EMAIL, oldEmail, email));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_PERSON__BLOOD_TYPE, oldBloodType, bloodType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__BLOOD_TYPE, oldBloodType, bloodType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbleToDonate() {
		return ableToDonate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbleToDonate(boolean newAbleToDonate) {
		boolean oldAbleToDonate = ableToDonate;
		ableToDonate = newAbleToDonate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__ABLE_TO_DONATE, oldAbleToDonate, ableToDonate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Byte> getImage() {
		if (image == null) {
			image = new EDataTypeUniqueEList<Byte>(Byte.class, this, DatatypesPackage.DATA_PERSON__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowNotificationNeedDonor() {
		return allowNotificationNeedDonor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowNotificationNeedDonor(boolean newAllowNotificationNeedDonor) {
		boolean oldAllowNotificationNeedDonor = allowNotificationNeedDonor;
		allowNotificationNeedDonor = newAllowNotificationNeedDonor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_NEED_DONOR, oldAllowNotificationNeedDonor, allowNotificationNeedDonor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowNotificationAbleToDonate() {
		return allowNotificationAbleToDonate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowNotificationAbleToDonate(boolean newAllowNotificationAbleToDonate) {
		boolean oldAllowNotificationAbleToDonate = allowNotificationAbleToDonate;
		allowNotificationAbleToDonate = newAllowNotificationAbleToDonate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_ABLE_TO_DONATE, oldAllowNotificationAbleToDonate, allowNotificationAbleToDonate));
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
"		"+
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
			helper.setOperationContext(DatatypesPackage.Literals.DATA_PERSON, DatatypesPackage.Literals.DATA_PERSON.getEAllOperations().get(0));
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
			case DatatypesPackage.DATA_PERSON__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_PERSON__ID:
				return getId();
			case DatatypesPackage.DATA_PERSON__FIRST_NAME:
				return getFirstName();
			case DatatypesPackage.DATA_PERSON__SECOND_NAME:
				return getSecondName();
			case DatatypesPackage.DATA_PERSON__FIRST_LAST_NAME:
				return getFirstLastName();
			case DatatypesPackage.DATA_PERSON__SECOND_LAST_NAME:
				return getSecondLastName();
			case DatatypesPackage.DATA_PERSON__DOCUMENT_COUNTRY:
				return getDocumentCountry();
			case DatatypesPackage.DATA_PERSON__DOCUMENT_TYPE:
				return getDocumentType();
			case DatatypesPackage.DATA_PERSON__DOCUMENT_NUMBER:
				return getDocumentNumber();
			case DatatypesPackage.DATA_PERSON__BIRTHDAY_DATE:
				return getBirthdayDate();
			case DatatypesPackage.DATA_PERSON__STATE:
				if (resolve) return getState();
				return basicGetState();
			case DatatypesPackage.DATA_PERSON__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case DatatypesPackage.DATA_PERSON__ADDRESS:
				return getAddress();
			case DatatypesPackage.DATA_PERSON__TELEPHONE:
				return getTelephone();
			case DatatypesPackage.DATA_PERSON__EMAIL:
				return getEmail();
			case DatatypesPackage.DATA_PERSON__BLOOD_TYPE:
				if (resolve) return getBloodType();
				return basicGetBloodType();
			case DatatypesPackage.DATA_PERSON__ABLE_TO_DONATE:
				return isAbleToDonate();
			case DatatypesPackage.DATA_PERSON__IMAGE:
				return getImage();
			case DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_NEED_DONOR:
				return isAllowNotificationNeedDonor();
			case DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_ABLE_TO_DONATE:
				return isAllowNotificationAbleToDonate();
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
			case DatatypesPackage.DATA_PERSON__ID:
				setId((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__SECOND_NAME:
				setSecondName((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__FIRST_LAST_NAME:
				setFirstLastName((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__SECOND_LAST_NAME:
				setSecondLastName((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__DOCUMENT_COUNTRY:
				setDocumentCountry((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__DOCUMENT_TYPE:
				setDocumentType((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__DOCUMENT_NUMBER:
				setDocumentNumber((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__BIRTHDAY_DATE:
				setBirthdayDate((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__STATE:
				setState((DataState)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__CITY:
				setCity((DataCity)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__ADDRESS:
				setAddress((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__TELEPHONE:
				setTelephone((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__EMAIL:
				setEmail((String)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__BLOOD_TYPE:
				setBloodType((DataBloodType)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__ABLE_TO_DONATE:
				setAbleToDonate((Boolean)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends Byte>)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_NEED_DONOR:
				setAllowNotificationNeedDonor((Boolean)newValue);
				return;
			case DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_ABLE_TO_DONATE:
				setAllowNotificationAbleToDonate((Boolean)newValue);
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
			case DatatypesPackage.DATA_PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__SECOND_NAME:
				setSecondName(SECOND_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__FIRST_LAST_NAME:
				setFirstLastName(FIRST_LAST_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__SECOND_LAST_NAME:
				setSecondLastName(SECOND_LAST_NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__DOCUMENT_COUNTRY:
				setDocumentCountry(DOCUMENT_COUNTRY_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__DOCUMENT_TYPE:
				setDocumentType(DOCUMENT_TYPE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__DOCUMENT_NUMBER:
				setDocumentNumber(DOCUMENT_NUMBER_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__BIRTHDAY_DATE:
				setBirthdayDate(BIRTHDAY_DATE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__STATE:
				setState((DataState)null);
				return;
			case DatatypesPackage.DATA_PERSON__CITY:
				setCity((DataCity)null);
				return;
			case DatatypesPackage.DATA_PERSON__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__BLOOD_TYPE:
				setBloodType((DataBloodType)null);
				return;
			case DatatypesPackage.DATA_PERSON__ABLE_TO_DONATE:
				setAbleToDonate(ABLE_TO_DONATE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__IMAGE:
				getImage().clear();
				return;
			case DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_NEED_DONOR:
				setAllowNotificationNeedDonor(ALLOW_NOTIFICATION_NEED_DONOR_EDEFAULT);
				return;
			case DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_ABLE_TO_DONATE:
				setAllowNotificationAbleToDonate(ALLOW_NOTIFICATION_ABLE_TO_DONATE_EDEFAULT);
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
			case DatatypesPackage.DATA_PERSON__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_PERSON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DatatypesPackage.DATA_PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case DatatypesPackage.DATA_PERSON__SECOND_NAME:
				return SECOND_NAME_EDEFAULT == null ? secondName != null : !SECOND_NAME_EDEFAULT.equals(secondName);
			case DatatypesPackage.DATA_PERSON__FIRST_LAST_NAME:
				return FIRST_LAST_NAME_EDEFAULT == null ? firstLastName != null : !FIRST_LAST_NAME_EDEFAULT.equals(firstLastName);
			case DatatypesPackage.DATA_PERSON__SECOND_LAST_NAME:
				return SECOND_LAST_NAME_EDEFAULT == null ? secondLastName != null : !SECOND_LAST_NAME_EDEFAULT.equals(secondLastName);
			case DatatypesPackage.DATA_PERSON__DOCUMENT_COUNTRY:
				return DOCUMENT_COUNTRY_EDEFAULT == null ? documentCountry != null : !DOCUMENT_COUNTRY_EDEFAULT.equals(documentCountry);
			case DatatypesPackage.DATA_PERSON__DOCUMENT_TYPE:
				return DOCUMENT_TYPE_EDEFAULT == null ? documentType != null : !DOCUMENT_TYPE_EDEFAULT.equals(documentType);
			case DatatypesPackage.DATA_PERSON__DOCUMENT_NUMBER:
				return DOCUMENT_NUMBER_EDEFAULT == null ? documentNumber != null : !DOCUMENT_NUMBER_EDEFAULT.equals(documentNumber);
			case DatatypesPackage.DATA_PERSON__BIRTHDAY_DATE:
				return BIRTHDAY_DATE_EDEFAULT == null ? birthdayDate != null : !BIRTHDAY_DATE_EDEFAULT.equals(birthdayDate);
			case DatatypesPackage.DATA_PERSON__STATE:
				return state != null;
			case DatatypesPackage.DATA_PERSON__CITY:
				return city != null;
			case DatatypesPackage.DATA_PERSON__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case DatatypesPackage.DATA_PERSON__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
			case DatatypesPackage.DATA_PERSON__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DatatypesPackage.DATA_PERSON__BLOOD_TYPE:
				return bloodType != null;
			case DatatypesPackage.DATA_PERSON__ABLE_TO_DONATE:
				return ableToDonate != ABLE_TO_DONATE_EDEFAULT;
			case DatatypesPackage.DATA_PERSON__IMAGE:
				return image != null && !image.isEmpty();
			case DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_NEED_DONOR:
				return allowNotificationNeedDonor != ALLOW_NOTIFICATION_NEED_DONOR_EDEFAULT;
			case DatatypesPackage.DATA_PERSON__ALLOW_NOTIFICATION_ABLE_TO_DONATE:
				return allowNotificationAbleToDonate != ALLOW_NOTIFICATION_ABLE_TO_DONATE_EDEFAULT;
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
			case DatatypesPackage.DATA_PERSON___GET_FULL_NAME:
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
		result.append(" (serialVersionUID: ");
		result.append(serialVersionUID);
		result.append(", id: ");
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
		result.append(", birthdayDate: ");
		result.append(birthdayDate);
		result.append(", address: ");
		result.append(address);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", email: ");
		result.append(email);
		result.append(", ableToDonate: ");
		result.append(ableToDonate);
		result.append(", image: ");
		result.append(image);
		result.append(", allowNotificationNeedDonor: ");
		result.append(allowNotificationNeedDonor);
		result.append(", allowNotificationAbleToDonate: ");
		result.append(allowNotificationAbleToDonate);
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

} //DataPersonImpl
