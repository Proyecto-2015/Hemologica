/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Stock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataStock#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataStock#getBank <em>Bank</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataStock#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataStock()
 * @model
 * @generated
 */
public interface DataStock extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"-979972334865660149L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataStock_SerialVersionUID()
	 * @model default="-979972334865660149L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' reference.
	 * @see #setBank(DataBank)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataStock_Bank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataBank getBank();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataStock#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(DataBank value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DataStockProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataStock_Products()
	 * @model required="true"
	 * @generated
	 */
	EList<DataStockProductType> getProducts();

} // DataStock
