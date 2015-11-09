/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Stock Product Type Blood Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataStockProductTypeBloodType#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataStockProductTypeBloodType()
 * @model
 * @generated
 */
public interface DataStockProductTypeBloodType extends DataBloodType, Serializable {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataStockProductTypeBloodType_Count()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataStockProductTypeBloodType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

} // DataStockProductTypeBloodType
