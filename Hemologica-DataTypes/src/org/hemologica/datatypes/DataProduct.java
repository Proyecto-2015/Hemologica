/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataProduct#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataProduct#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataProduct#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataProduct#getDonation <em>Donation</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataProduct()
 * @model
 * @generated
 */
public interface DataProduct extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"2826091238509417952L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataProduct_SerialVersionUID()
	 * @model default="2826091238509417952L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataProduct_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataProduct#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' attribute.
	 * @see #setDisplay(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataProduct_Display()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDisplay();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataProduct#getDisplay <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' attribute.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Donation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donation</em>' reference.
	 * @see #setDonation(DataDonation)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataProduct_Donation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataDonation getDonation();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataProduct#getDonation <em>Donation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation</em>' reference.
	 * @see #getDonation()
	 * @generated
	 */
	void setDonation(DataDonation value);

} // DataProduct
