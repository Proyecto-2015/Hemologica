/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Stock Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataStockProductType#getBloodTypes <em>Blood Types</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataStockProductType()
 * @model
 * @generated
 */
public interface DataStockProductType extends DataProductType, Serializable {
	/**
	 * Returns the value of the '<em><b>Blood Types</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DataStockProductTypeBloodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blood Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blood Types</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataStockProductType_BloodTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<DataStockProductTypeBloodType> getBloodTypes();

} // DataStockProductType
