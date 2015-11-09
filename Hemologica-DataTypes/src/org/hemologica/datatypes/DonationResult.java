/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import jdk.java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DonationResult#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationResult#getDonationId <em>Donation Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationResult#getPersonDocument <em>Person Document</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationResult#getPersonCompleteName <em>Person Complete Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationResult#getDonationDate <em>Donation Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationResult#getDonationState <em>Donation State</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDonationResult()
 * @model
 * @generated
 */
public interface DonationResult extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"9023483717165649475L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationResult_SerialVersionUID()
	 * @model default="9023483717165649475L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Donation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donation Id</em>' attribute.
	 * @see #setDonationId(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationResult_DonationId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDonationId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationResult#getDonationId <em>Donation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation Id</em>' attribute.
	 * @see #getDonationId()
	 * @generated
	 */
	void setDonationId(String value);

	/**
	 * Returns the value of the '<em><b>Person Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Document</em>' attribute.
	 * @see #setPersonDocument(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationResult_PersonDocument()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPersonDocument();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationResult#getPersonDocument <em>Person Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Document</em>' attribute.
	 * @see #getPersonDocument()
	 * @generated
	 */
	void setPersonDocument(String value);

	/**
	 * Returns the value of the '<em><b>Person Complete Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Complete Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Complete Name</em>' attribute.
	 * @see #setPersonCompleteName(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationResult_PersonCompleteName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPersonCompleteName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationResult#getPersonCompleteName <em>Person Complete Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Complete Name</em>' attribute.
	 * @see #getPersonCompleteName()
	 * @generated
	 */
	void setPersonCompleteName(String value);

	/**
	 * Returns the value of the '<em><b>Donation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donation Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donation Date</em>' containment reference.
	 * @see #setDonationDate(Date)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationResult_DonationDate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Date getDonationDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationResult#getDonationDate <em>Donation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation Date</em>' containment reference.
	 * @see #getDonationDate()
	 * @generated
	 */
	void setDonationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Donation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Donation State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Donation State</em>' attribute.
	 * @see #setDonationState(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationResult_DonationState()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDonationState();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationResult#getDonationState <em>Donation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Donation State</em>' attribute.
	 * @see #getDonationState()
	 * @generated
	 */
	void setDonationState(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DonationResult DonationResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" donationIdRequired="true" donationIdOrdered="false" personDocumentRequired="true" personDocumentOrdered="false" personCompleteNameRequired="true" personCompleteNameOrdered="false" donationDateRequired="true" donationDateOrdered="false" donationStateRequired="true" donationStateOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.donationId = donationId;\n\t\tthis.personDocument = personDocument;\n\t\tthis.personCompleteName = personCompleteName;\n\t\tthis.donationDate = donationDate;\n\t\tthis.donationState = donationState;\n\t'"
	 * @generated
	 */
	DonationResult DonationResult(String donationId, String personDocument, String personCompleteName, Date donationDate, String donationState);

} // DonationResult
