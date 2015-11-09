/**
 */
package org.hemologica.datatypes.impl;

import org.eclipse.emf.ecore.EClass;

import org.hemologica.datatypes.DataTransfusionEvent;
import org.hemologica.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Transfusion Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.impl.DataTransfusionEventImpl#getSerialVersionUID <em>Serial Version UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTransfusionEventImpl extends DataEventImpl implements DataTransfusionEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTransfusionEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_TRANSFUSION_EVENT;
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatypesPackage.DATA_TRANSFUSION_EVENT__SERIAL_VERSION_UID:
				return isSetSerialVersionUID();
		}
		return super.eIsSet(featureID);
	}

} //DataTransfusionEventImpl
