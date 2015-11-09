/**
 */
package org.hemologica.datatypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mail Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.MailData#getMessageOption <em>Message Option</em>}</li>
 *   <li>{@link org.hemologica.datatypes.MailData#getBloodType <em>Blood Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.MailData#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hemologica.datatypes.MailData#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getMailData()
 * @model
 * @generated
 */
public interface MailData extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Option</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Option</em>' reference.
	 * @see #setMessageOption(MessageOptionData)
	 * @see org.hemologica.datatypes.DatatypesPackage#getMailData_MessageOption()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MessageOptionData getMessageOption();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.MailData#getMessageOption <em>Message Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Option</em>' reference.
	 * @see #getMessageOption()
	 * @generated
	 */
	void setMessageOption(MessageOptionData value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getMailData_BloodType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataBloodType getBloodType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.MailData#getBloodType <em>Blood Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blood Type</em>' reference.
	 * @see #getBloodType()
	 * @generated
	 */
	void setBloodType(DataBloodType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getMailData_Subject()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.MailData#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getMailData_Text()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.MailData#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // MailData
