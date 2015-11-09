/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import jdk.java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Laboratory Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataLaboratoryResult#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataLaboratoryResult#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataLaboratoryResult#getBank <em>Bank</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataLaboratoryResult#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataLaboratoryResult#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataLaboratoryResult#isResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataLaboratoryResult()
 * @model
 * @generated
 */
public interface DataLaboratoryResult extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"7214257230098571156L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataLaboratoryResult_SerialVersionUID()
	 * @model default="7214257230098571156L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' reference.
	 * @see #setAnalysis(DataCode)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataLaboratoryResult_Analysis()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataCode getAnalysis();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataLaboratoryResult#getAnalysis <em>Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(DataCode value);

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' attribute.
	 * @see #setBank(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataLaboratoryResult_Bank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBank();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataLaboratoryResult#getBank <em>Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' attribute.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(String value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataLaboratoryResult_Date()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataLaboratoryResult#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Responsible Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Person</em>' reference.
	 * @see #setResponsiblePerson(DataResponsiblePerson)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataLaboratoryResult_ResponsiblePerson()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataResponsiblePerson getResponsiblePerson();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataLaboratoryResult#getResponsiblePerson <em>Responsible Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Person</em>' reference.
	 * @see #getResponsiblePerson()
	 * @generated
	 */
	void setResponsiblePerson(DataResponsiblePerson value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(boolean)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataLaboratoryResult_Result()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isResult();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataLaboratoryResult#isResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #isResult()
	 * @generated
	 */
	void setResult(boolean value);

} // DataLaboratoryResult
