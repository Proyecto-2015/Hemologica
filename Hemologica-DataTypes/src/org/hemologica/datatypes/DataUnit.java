/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataUnit#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataUnit#getId <em>Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataUnit#getDonationId <em>Donation Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataUnit#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataUnit#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataUnit#getInstitutionCode <em>Institution Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataUnit#getProductType <em>Product Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataUnit#getBloodType <em>Blood Type</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit()
 * @model
 * @generated
 */
public interface DataUnit extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"-5470280587666900962L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit_SerialVersionUID()
	 * @model default="-5470280587666900962L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(jdk.java.lang.Long)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit_Id()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	jdk.java.lang.Long getId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataUnit#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(jdk.java.lang.Long value);

	/**
	 * Returns the value of the '<em><b>Donation Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donation Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donation Id</em>' containment reference.
	 * @see #setDonationId(jdk.java.lang.Long)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit_DonationId()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	jdk.java.lang.Long getDonationId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataUnit#getDonationId <em>Donation Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation Id</em>' containment reference.
	 * @see #getDonationId()
	 * @generated
	 */
	void setDonationId(jdk.java.lang.Long value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataUnit#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit_Institution()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataUnit#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Institution Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution Code</em>' attribute.
	 * @see #setInstitutionCode(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit_InstitutionCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInstitutionCode();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataUnit#getInstitutionCode <em>Institution Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Code</em>' attribute.
	 * @see #getInstitutionCode()
	 * @generated
	 */
	void setInstitutionCode(String value);

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type</em>' reference.
	 * @see #setProductType(DataProductType)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit_ProductType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataProductType getProductType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataUnit#getProductType <em>Product Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' reference.
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(DataProductType value);

	/**
	 * Returns the value of the '<em><b>Blood Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blood Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blood Type</em>' reference.
	 * @see #setBloodType(DataBloodType)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUnit_BloodType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataBloodType getBloodType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataUnit#getBloodType <em>Blood Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blood Type</em>' reference.
	 * @see #getBloodType()
	 * @generated
	 */
	void setBloodType(DataBloodType value);

} // DataUnit
