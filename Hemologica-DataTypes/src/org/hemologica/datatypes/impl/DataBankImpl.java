/**
 */
package org.hemologica.datatypes.impl;

import java.lang.reflect.InvocationTargetException;

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

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataInstitution;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataBankImpl#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataBankImpl extends MinimalEObjectImpl.Container implements DataBank {
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
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected DataInstitution institution;

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
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected String hour = HOUR_EDEFAULT;

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
	 * The default value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected String information = INFORMATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected jdk.java.lang.Double latitude;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected jdk.java.lang.Double longitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_BANK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_BANK__INSTITUTION, oldInstitution, institution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__INSTITUTION, oldInstitution, institution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(String newHour) {
		String oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__HOUR, oldHour, hour));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__TELEPHONE, oldTelephone, telephone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformation(String newInformation) {
		String oldInformation = information;
		information = newInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__INFORMATION, oldInformation, information));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public jdk.java.lang.Double getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatitude(jdk.java.lang.Double newLatitude, NotificationChain msgs) {
		jdk.java.lang.Double oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__LATITUDE, oldLatitude, newLatitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(jdk.java.lang.Double newLatitude) {
		if (newLatitude != latitude) {
			NotificationChain msgs = null;
			if (latitude != null)
				msgs = ((InternalEObject)latitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_BANK__LATITUDE, null, msgs);
			if (newLatitude != null)
				msgs = ((InternalEObject)newLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_BANK__LATITUDE, null, msgs);
			msgs = basicSetLatitude(newLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__LATITUDE, newLatitude, newLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public jdk.java.lang.Double getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongitude(jdk.java.lang.Double newLongitude, NotificationChain msgs) {
		jdk.java.lang.Double oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__LONGITUDE, oldLongitude, newLongitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(jdk.java.lang.Double newLongitude) {
		if (newLongitude != longitude) {
			NotificationChain msgs = null;
			if (longitude != null)
				msgs = ((InternalEObject)longitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_BANK__LONGITUDE, null, msgs);
			if (newLongitude != null)
				msgs = ((InternalEObject)newLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.DATA_BANK__LONGITUDE, null, msgs);
			msgs = basicSetLongitude(newLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_BANK__LONGITUDE, newLongitude, newLongitude));
	}

	/**
	 * The cached OCL expression body for the '{@link #equals(jdk.java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equals(jdk.java.lang.Object)
	 * @generated
	 * @ordered
	 */
	protected static final String EQUALS__OBJECT__EOCL_EXP = "return super.equals(((DataBank)obj).getCode().equals(this.getCode()));"+
"	";

	/**
	 * The cached OCL query for the '{@link #equals(jdk.java.lang.Object) <em>Equals</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equals(jdk.java.lang.Object)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> EQUALS__OBJECT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(jdk.java.lang.Object obj) {
		if (EQUALS__OBJECT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.DATA_BANK, DatatypesPackage.Literals.DATA_BANK.getEAllOperations().get(0));
			try {
				EQUALS__OBJECT__EOCL_QRY = helper.createQuery(EQUALS__OBJECT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(EQUALS__OBJECT__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("obj", obj);
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
			case DatatypesPackage.DATA_BANK__LATITUDE:
				return basicSetLatitude(null, msgs);
			case DatatypesPackage.DATA_BANK__LONGITUDE:
				return basicSetLongitude(null, msgs);
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
			case DatatypesPackage.DATA_BANK__CODE:
				return getCode();
			case DatatypesPackage.DATA_BANK__NAME:
				return getName();
			case DatatypesPackage.DATA_BANK__INSTITUTION:
				if (resolve) return getInstitution();
				return basicGetInstitution();
			case DatatypesPackage.DATA_BANK__ADDRESS:
				return getAddress();
			case DatatypesPackage.DATA_BANK__HOUR:
				return getHour();
			case DatatypesPackage.DATA_BANK__TELEPHONE:
				return getTelephone();
			case DatatypesPackage.DATA_BANK__EMAIL:
				return getEmail();
			case DatatypesPackage.DATA_BANK__INFORMATION:
				return getInformation();
			case DatatypesPackage.DATA_BANK__LATITUDE:
				return getLatitude();
			case DatatypesPackage.DATA_BANK__LONGITUDE:
				return getLongitude();
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
			case DatatypesPackage.DATA_BANK__CODE:
				setCode((String)newValue);
				return;
			case DatatypesPackage.DATA_BANK__NAME:
				setName((String)newValue);
				return;
			case DatatypesPackage.DATA_BANK__INSTITUTION:
				setInstitution((DataInstitution)newValue);
				return;
			case DatatypesPackage.DATA_BANK__ADDRESS:
				setAddress((String)newValue);
				return;
			case DatatypesPackage.DATA_BANK__HOUR:
				setHour((String)newValue);
				return;
			case DatatypesPackage.DATA_BANK__TELEPHONE:
				setTelephone((String)newValue);
				return;
			case DatatypesPackage.DATA_BANK__EMAIL:
				setEmail((String)newValue);
				return;
			case DatatypesPackage.DATA_BANK__INFORMATION:
				setInformation((String)newValue);
				return;
			case DatatypesPackage.DATA_BANK__LATITUDE:
				setLatitude((jdk.java.lang.Double)newValue);
				return;
			case DatatypesPackage.DATA_BANK__LONGITUDE:
				setLongitude((jdk.java.lang.Double)newValue);
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
			case DatatypesPackage.DATA_BANK__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_BANK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatatypesPackage.DATA_BANK__INSTITUTION:
				setInstitution((DataInstitution)null);
				return;
			case DatatypesPackage.DATA_BANK__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case DatatypesPackage.DATA_BANK__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case DatatypesPackage.DATA_BANK__TELEPHONE:
				setTelephone(TELEPHONE_EDEFAULT);
				return;
			case DatatypesPackage.DATA_BANK__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case DatatypesPackage.DATA_BANK__INFORMATION:
				setInformation(INFORMATION_EDEFAULT);
				return;
			case DatatypesPackage.DATA_BANK__LATITUDE:
				setLatitude((jdk.java.lang.Double)null);
				return;
			case DatatypesPackage.DATA_BANK__LONGITUDE:
				setLongitude((jdk.java.lang.Double)null);
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
			case DatatypesPackage.DATA_BANK__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case DatatypesPackage.DATA_BANK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatatypesPackage.DATA_BANK__INSTITUTION:
				return institution != null;
			case DatatypesPackage.DATA_BANK__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case DatatypesPackage.DATA_BANK__HOUR:
				return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
			case DatatypesPackage.DATA_BANK__TELEPHONE:
				return TELEPHONE_EDEFAULT == null ? telephone != null : !TELEPHONE_EDEFAULT.equals(telephone);
			case DatatypesPackage.DATA_BANK__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case DatatypesPackage.DATA_BANK__INFORMATION:
				return INFORMATION_EDEFAULT == null ? information != null : !INFORMATION_EDEFAULT.equals(information);
			case DatatypesPackage.DATA_BANK__LATITUDE:
				return latitude != null;
			case DatatypesPackage.DATA_BANK__LONGITUDE:
				return longitude != null;
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
			case DatatypesPackage.DATA_BANK___EQUALS__OBJECT:
				return equals((jdk.java.lang.Object)arguments.get(0));
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", hour: ");
		result.append(hour);
		result.append(", telephone: ");
		result.append(telephone);
		result.append(", email: ");
		result.append(email);
		result.append(", information: ");
		result.append(information);
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

} //DataBankImpl
