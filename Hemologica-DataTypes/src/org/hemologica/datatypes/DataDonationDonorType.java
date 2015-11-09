/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Donation Donor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataDonationDonorType#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonationDonorType#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonationDonorType#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationDonorType()
 * @model
 * @generated
 */
public interface DataDonationDonorType extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"9176360583037903695L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationDonorType_SerialVersionUID()
	 * @model default="9176360583037903695L" required="true" changeable="false" ordered="false"
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationDonorType_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonationDonorType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationDonorType_DisplayName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonationDonorType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // DataDonationDonorType
