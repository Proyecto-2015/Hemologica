/**
 */
package org.hemologica.datatypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataBank#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getName <em>Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getAddress <em>Address</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getHour <em>Hour</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getEmail <em>Email</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getInformation <em>Information</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataBank#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank()
 * @model
 * @generated
 */
public interface DataBank extends EObject {
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getCode <em>Code</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' reference.
	 * @see #setInstitution(DataInstitution)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Institution()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataInstitution getInstitution();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getInstitution <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' reference.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(DataInstitution value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Address()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getAddress <em>Address</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Hour()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getHour();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getHour <em>Hour</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Telephone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getTelephone <em>Telephone</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getEmail <em>Email</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Information()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInformation();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getInformation <em>Information</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Latitude()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	jdk.java.lang.Double getLatitude();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getLatitude <em>Latitude</em>}' containment reference.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataBank_Longitude()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	jdk.java.lang.Double getLongitude();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataBank#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(jdk.java.lang.Double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" objRequired="true" objOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return super.equals(((DataBank)obj).getCode().equals(this.getCode()));\n\t'"
	 * @generated
	 */
	boolean equals(jdk.java.lang.Object obj);

} // DataBank
