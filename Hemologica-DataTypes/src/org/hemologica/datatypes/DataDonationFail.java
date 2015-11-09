/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import jdk.java.util.Date;

import org.hemologica.constants.DataDonationRejectionType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Donation Fail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataDonationFail#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonationFail#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonationFail#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonationFail#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonationFail#getCause <em>Cause</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonationFail#getRejectionType <em>Rejection Type</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationFail()
 * @model
 * @generated
 */
public interface DataDonationFail extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"-43336076178896132L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationFail_SerialVersionUID()
	 * @model default="-43336076178896132L" required="true" changeable="false" ordered="false"
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationFail_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonationFail#getCode <em>Code</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationFail_DisplayName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonationFail#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationFail_Date()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonationFail#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' reference.
	 * @see #setCause(DataDonationFailCause)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationFail_Cause()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataDonationFailCause getCause();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonationFail#getCause <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' reference.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(DataDonationFailCause value);

	/**
	 * Returns the value of the '<em><b>Rejection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hemologica.constants.DataDonationRejectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejection Type</em>' attribute.
	 * @see org.hemologica.constants.DataDonationRejectionType
	 * @see #setRejectionType(DataDonationRejectionType)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonationFail_RejectionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataDonationRejectionType getRejectionType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonationFail#getRejectionType <em>Rejection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejection Type</em>' attribute.
	 * @see org.hemologica.constants.DataDonationRejectionType
	 * @see #getRejectionType()
	 * @generated
	 */
	void setRejectionType(DataDonationRejectionType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.cause = new DataDonationFailCause();\n\t'"
	 * @generated
	 */
	DataDonationFail DataDonationFail();

} // DataDonationFail
