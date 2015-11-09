/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getId <em>Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getSecondName <em>Second Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getFirstLastName <em>First Last Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getSecondLastName <em>Second Last Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getDocumentCountry <em>Document Country</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getBirthdayDate <em>Birthday Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getState <em>State</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getCity <em>City</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getEmail <em>Email</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getBloodType <em>Blood Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#isAbleToDonate <em>Able To Donate</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#getImage <em>Image</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#isAllowNotificationNeedDonor <em>Allow Notification Need Donor</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataPerson#isAllowNotificationAbleToDonate <em>Allow Notification Able To Donate</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson()
 * @model
 * @generated
 */
public interface DataPerson extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"1221320030601695117L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_SerialVersionUID()
	 * @model default="1221320030601695117L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Second Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Name</em>' attribute.
	 * @see #setSecondName(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_SecondName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSecondName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getSecondName <em>Second Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Name</em>' attribute.
	 * @see #getSecondName()
	 * @generated
	 */
	void setSecondName(String value);

	/**
	 * Returns the value of the '<em><b>First Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Last Name</em>' attribute.
	 * @see #setFirstLastName(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_FirstLastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstLastName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getFirstLastName <em>First Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Last Name</em>' attribute.
	 * @see #getFirstLastName()
	 * @generated
	 */
	void setFirstLastName(String value);

	/**
	 * Returns the value of the '<em><b>Second Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Last Name</em>' attribute.
	 * @see #setSecondLastName(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_SecondLastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSecondLastName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getSecondLastName <em>Second Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Last Name</em>' attribute.
	 * @see #getSecondLastName()
	 * @generated
	 */
	void setSecondLastName(String value);

	/**
	 * Returns the value of the '<em><b>Document Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Country</em>' attribute.
	 * @see #setDocumentCountry(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_DocumentCountry()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDocumentCountry();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getDocumentCountry <em>Document Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Country</em>' attribute.
	 * @see #getDocumentCountry()
	 * @generated
	 */
	void setDocumentCountry(String value);

	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type</em>' attribute.
	 * @see #setDocumentType(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_DocumentType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDocumentType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getDocumentType <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' attribute.
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(String value);

	/**
	 * Returns the value of the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Number</em>' attribute.
	 * @see #setDocumentNumber(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_DocumentNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDocumentNumber();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getDocumentNumber <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Number</em>' attribute.
	 * @see #getDocumentNumber()
	 * @generated
	 */
	void setDocumentNumber(String value);

	/**
	 * Returns the value of the '<em><b>Birthday Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birthday Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthday Date</em>' attribute.
	 * @see #setBirthdayDate(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_BirthdayDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBirthdayDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getBirthdayDate <em>Birthday Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthday Date</em>' attribute.
	 * @see #getBirthdayDate()
	 * @generated
	 */
	void setBirthdayDate(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(DataState)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_State()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataState getState();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(DataState value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(DataCity)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_City()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataCity getCity();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(DataCity value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_Address()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_Telephone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_BloodType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataBloodType getBloodType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#getBloodType <em>Blood Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blood Type</em>' reference.
	 * @see #getBloodType()
	 * @generated
	 */
	void setBloodType(DataBloodType value);

	/**
	 * Returns the value of the '<em><b>Able To Donate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Able To Donate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Able To Donate</em>' attribute.
	 * @see #setAbleToDonate(boolean)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_AbleToDonate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAbleToDonate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#isAbleToDonate <em>Able To Donate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Able To Donate</em>' attribute.
	 * @see #isAbleToDonate()
	 * @generated
	 */
	void setAbleToDonate(boolean value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Byte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_Image()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Byte> getImage();

	/**
	 * Returns the value of the '<em><b>Allow Notification Need Donor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Notification Need Donor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Notification Need Donor</em>' attribute.
	 * @see #setAllowNotificationNeedDonor(boolean)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_AllowNotificationNeedDonor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowNotificationNeedDonor();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#isAllowNotificationNeedDonor <em>Allow Notification Need Donor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Notification Need Donor</em>' attribute.
	 * @see #isAllowNotificationNeedDonor()
	 * @generated
	 */
	void setAllowNotificationNeedDonor(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Notification Able To Donate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Notification Able To Donate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Notification Able To Donate</em>' attribute.
	 * @see #setAllowNotificationAbleToDonate(boolean)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataPerson_AllowNotificationAbleToDonate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowNotificationAbleToDonate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataPerson#isAllowNotificationAbleToDonate <em>Allow Notification Able To Donate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Notification Able To Donate</em>' attribute.
	 * @see #isAllowNotificationAbleToDonate()
	 * @generated
	 */
	void setAllowNotificationAbleToDonate(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return firstName + \" \" + secondName + \" \" + firstLastName+ \" \" + secondLastName;\n\t\t\n\t'"
	 * @generated
	 */
	String getFullName();

} // DataPerson
