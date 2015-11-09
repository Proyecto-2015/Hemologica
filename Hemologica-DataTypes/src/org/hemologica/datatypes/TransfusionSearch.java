/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import jdk.java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfusion Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.TransfusionSearch#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.TransfusionSearch#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hemologica.datatypes.TransfusionSearch#getFrom <em>From</em>}</li>
 *   <li>{@link org.hemologica.datatypes.TransfusionSearch#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionSearch()
 * @model
 * @generated
 */
public interface TransfusionSearch extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"2329098338218896354L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionSearch_SerialVersionUID()
	 * @model default="2329098338218896354L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' attribute.
	 * @see #setPerson(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionSearch_Person()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPerson();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.TransfusionSearch#getPerson <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' attribute.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Date)
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionSearch_From()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.TransfusionSearch#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Date value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Date)
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionSearch_To()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.TransfusionSearch#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransfusionSearch TransfusionSearch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" personRequired="true" personOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.person = person;\n\t\tthis.from = from;\n\t\tthis.to = to;\n\t'"
	 * @generated
	 */
	TransfusionSearch TransfusionSearch(String person, Date from, Date to);

} // TransfusionSearch
