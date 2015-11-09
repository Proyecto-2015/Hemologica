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
import org.hemologica.datatypes.TransfusionSearch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfusion Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionSearchImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionSearchImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionSearchImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.TransfusionSearchImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransfusionSearchImpl extends MinimalEObjectImpl.Container implements TransfusionSearch {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "2329098338218896354L" is not valid.

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
	 * The default value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected String person = PERSON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Date from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Date to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransfusionSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.TRANSFUSION_SEARCH;
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
	public String getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(String newPerson) {
		String oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_SEARCH__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Date newFrom, NotificationChain msgs) {
		Date oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_SEARCH__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Date newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TRANSFUSION_SEARCH__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TRANSFUSION_SEARCH__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_SEARCH__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Date newTo, NotificationChain msgs) {
		Date oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_SEARCH__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Date newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TRANSFUSION_SEARCH__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.TRANSFUSION_SEARCH__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.TRANSFUSION_SEARCH__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionSearch TransfusionSearch() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #TransfusionSearch(java.lang.String, jdk.java.util.Date, jdk.java.util.Date) <em>Transfusion Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TransfusionSearch(java.lang.String, jdk.java.util.Date, jdk.java.util.Date)
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFUSION_SEARCH__STRING_DATE_DATE__EOCL_EXP = "this.person = person;"+
"		this.from = from;"+
"		this.to = to;"+
"	";

	/**
	 * The cached OCL query for the '{@link #TransfusionSearch(java.lang.String, jdk.java.util.Date, jdk.java.util.Date) <em>Transfusion Search</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TransfusionSearch(java.lang.String, jdk.java.util.Date, jdk.java.util.Date)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> TRANSFUSION_SEARCH__STRING_DATE_DATE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionSearch TransfusionSearch(String person, Date from, Date to) {
		if (TRANSFUSION_SEARCH__STRING_DATE_DATE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(DatatypesPackage.Literals.TRANSFUSION_SEARCH, DatatypesPackage.Literals.TRANSFUSION_SEARCH.getEAllOperations().get(1));
			try {
				TRANSFUSION_SEARCH__STRING_DATE_DATE__EOCL_QRY = helper.createQuery(TRANSFUSION_SEARCH__STRING_DATE_DATE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(TRANSFUSION_SEARCH__STRING_DATE_DATE__EOCL_QRY);
		EvaluationEnvironment<?, ?, ?, ?, ?> environment = query.getEvaluationEnvironment();
		environment.add("person", person);
		environment.add("from", from);
		environment.add("to", to);
		return (TransfusionSearch) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.TRANSFUSION_SEARCH__FROM:
				return basicSetFrom(null, msgs);
			case DatatypesPackage.TRANSFUSION_SEARCH__TO:
				return basicSetTo(null, msgs);
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
			case DatatypesPackage.TRANSFUSION_SEARCH__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.TRANSFUSION_SEARCH__PERSON:
				return getPerson();
			case DatatypesPackage.TRANSFUSION_SEARCH__FROM:
				return getFrom();
			case DatatypesPackage.TRANSFUSION_SEARCH__TO:
				return getTo();
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
			case DatatypesPackage.TRANSFUSION_SEARCH__PERSON:
				setPerson((String)newValue);
				return;
			case DatatypesPackage.TRANSFUSION_SEARCH__FROM:
				setFrom((Date)newValue);
				return;
			case DatatypesPackage.TRANSFUSION_SEARCH__TO:
				setTo((Date)newValue);
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
			case DatatypesPackage.TRANSFUSION_SEARCH__PERSON:
				setPerson(PERSON_EDEFAULT);
				return;
			case DatatypesPackage.TRANSFUSION_SEARCH__FROM:
				setFrom((Date)null);
				return;
			case DatatypesPackage.TRANSFUSION_SEARCH__TO:
				setTo((Date)null);
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
			case DatatypesPackage.TRANSFUSION_SEARCH__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.TRANSFUSION_SEARCH__PERSON:
				return PERSON_EDEFAULT == null ? person != null : !PERSON_EDEFAULT.equals(person);
			case DatatypesPackage.TRANSFUSION_SEARCH__FROM:
				return from != null;
			case DatatypesPackage.TRANSFUSION_SEARCH__TO:
				return to != null;
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
			case DatatypesPackage.TRANSFUSION_SEARCH___TRANSFUSION_SEARCH:
				return TransfusionSearch();
			case DatatypesPackage.TRANSFUSION_SEARCH___TRANSFUSION_SEARCH__STRING_DATE_DATE:
				return TransfusionSearch((String)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
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
		result.append(", person: ");
		result.append(person);
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

} //TransfusionSearchImpl
