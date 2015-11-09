/**
 */
package org.hemologica.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.hemologica.datatypes.DataStockProductType;
import org.hemologica.datatypes.DataStockProductTypeBloodType;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Stock Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataStockProductTypeImpl#getBloodTypes <em>Blood Types</em>}</li>
 *   <li>{@link org.hemologica.datatypes.impl.DataStockProductTypeImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStockProductTypeImpl extends DataProductTypeImpl implements DataStockProductType {
	/**
	 * The cached value of the '{@link #getBloodTypes() <em>Blood Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloodTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStockProductTypeBloodType> bloodTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStockProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_STOCK_PRODUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataStockProductTypeBloodType> getBloodTypes() {
		if (bloodTypes == null) {
			bloodTypes = new EObjectResolvingEList<DataStockProductTypeBloodType>(DataStockProductTypeBloodType.class, this, DatatypesPackage.DATA_STOCK_PRODUCT_TYPE__BLOOD_TYPES);
		}
		return bloodTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSerialVersionUID() {
		return serialVersionUID != SERIAL_VERSION_UID_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE__BLOOD_TYPES:
				return getBloodTypes();
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
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE__BLOOD_TYPES:
				getBloodTypes().clear();
				getBloodTypes().addAll((Collection<? extends DataStockProductTypeBloodType>)newValue);
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
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE__BLOOD_TYPES:
				getBloodTypes().clear();
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
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE__BLOOD_TYPES:
				return bloodTypes != null && !bloodTypes.isEmpty();
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE__SERIAL_VERSION_UID:
				return isSetSerialVersionUID();
		}
		return super.eIsSet(featureID);
	}

} //DataStockProductTypeImpl
