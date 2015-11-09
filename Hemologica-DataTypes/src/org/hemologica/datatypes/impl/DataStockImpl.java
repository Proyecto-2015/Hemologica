/**
 */
package org.hemologica.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.hemologica.datatypes.DataBank;
import org.hemologica.datatypes.DataStock;
import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Stock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataStockImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataStockImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataStockImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStockImpl extends MinimalEObjectImpl.Container implements DataStock {
	/**
	 * The default value of the '{@link #getSerialVersionUID() <em>Serial Version UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialVersionUID()
	 * @generated
	 * @ordered
	 */
	protected static final long SERIAL_VERSION_UID_EDEFAULT; // TODO The default value literal "-979972334865660149L" is not valid.

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
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected DataBank bank;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStockProductType> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_STOCK;
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
	public DataBank getBank() {
		if (bank != null && bank.eIsProxy()) {
			InternalEObject oldBank = (InternalEObject)bank;
			bank = (DataBank)eResolveProxy(oldBank);
			if (bank != oldBank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypesPackage.DATA_STOCK__BANK, oldBank, bank));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.DATA_STOCK__BANK, oldBank, bank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStockProductType> getProducts() {
		if (products == null) {
			products = new EObjectResolvingEList<DataStockProductType>(DataStockProductType.class, this, DatatypesPackage.DATA_STOCK__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_STOCK__SERIAL_VERSION_UID:
				return getSerialVersionUID();
			case DatatypesPackage.DATA_STOCK__BANK:
				if (resolve) return getBank();
				return basicGetBank();
			case DatatypesPackage.DATA_STOCK__PRODUCTS:
				return getProducts();
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
			case DatatypesPackage.DATA_STOCK__BANK:
				setBank((DataBank)newValue);
				return;
			case DatatypesPackage.DATA_STOCK__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends DataStockProductType>)newValue);
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
			case DatatypesPackage.DATA_STOCK__BANK:
				setBank((DataBank)null);
				return;
			case DatatypesPackage.DATA_STOCK__PRODUCTS:
				getProducts().clear();
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
			case DatatypesPackage.DATA_STOCK__SERIAL_VERSION_UID:
				return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
			case DatatypesPackage.DATA_STOCK__BANK:
				return bank != null;
			case DatatypesPackage.DATA_STOCK__PRODUCTS:
				return products != null && !products.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DataStockImpl
