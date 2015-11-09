/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Institution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getName <em>Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getBanks <em>Banks</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getHour <em>Hour</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getEmail <em>Email</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataInstitution#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution()
 * @model
 * @generated
 */
public interface DataInstitution extends Serializable {
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_SerialVersionUID()
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Banks</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DataBank}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Banks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Banks</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Banks()
	 * @model required="true"
	 * @generated
	 */
	EList<DataBank> getBanks();

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Address()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Hour()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getHour();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(String value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Telephone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getTelephone <em>Telephone</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' attribute.
	 * @see #setInformation(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Information()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getInformation <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information</em>' attribute.
	 * @see #getInformation()
	 * @generated
	 */
	void setInformation(String value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(jdk.java.lang.Double)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Latitude()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	jdk.java.lang.Double getLatitude();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(jdk.java.lang.Double value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(jdk.java.lang.Double)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataInstitution_Longitude()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	jdk.java.lang.Double getLongitude();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataInstitution#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(jdk.java.lang.Double value);

} // DataInstitution
