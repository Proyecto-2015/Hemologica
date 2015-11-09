/**
 */
package org.hemologica.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataUser;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataUserImpl#getPersonId <em>Person Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataUserImpl#getBanks <em>Banks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataUserImpl extends MinimalEObjectImpl.Container implements DataUser {
	/**
	 * The default value of the '{@link #getPersonId() <em>Person Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonId() <em>Person Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonId()
	 * @generated
	 * @ordered
	 */
	protected String personId = PERSON_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBanks() <em>Banks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBanks()
	 * @generated
	 * @ordered
	 */
	protected EList<DataBank> banks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonId() {
		return personId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonId(String newPersonId) {
		String oldPersonId = personId;
		personId = newPersonId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_USER__PERSON_ID, oldPersonId, personId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataBank> getBanks() {
		if (banks == null) {
			banks = new EObjectResolvingEList<DataBank>(DataBank.class, this, DatatypesPackage.DATA_USER__BANKS);
		}
		return banks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_USER__PERSON_ID:
				return getPersonId();
			case DatatypesPackage.DATA_USER__BANKS:
				return getBanks();
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
			case DatatypesPackage.DATA_USER__PERSON_ID:
				setPersonId((String)newValue);
				return;
			case DatatypesPackage.DATA_USER__BANKS:
				getBanks().clear();
				getBanks().addAll((Collection<? extends DataBank>)newValue);
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
			case DatatypesPackage.DATA_USER__PERSON_ID:
				setPersonId(PERSON_ID_EDEFAULT);
				return;
			case DatatypesPackage.DATA_USER__BANKS:
				getBanks().clear();
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
			case DatatypesPackage.DATA_USER__PERSON_ID:
				return PERSON_ID_EDEFAULT == null ? personId != null : !PERSON_ID_EDEFAULT.equals(personId);
			case DatatypesPackage.DATA_USER__BANKS:
				return banks != null && !banks.isEmpty();
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
		result.append(" (personId: ");
		result.append(personId);
		result.append(')');
		return result.toString();
	}

} //DataUserImpl
