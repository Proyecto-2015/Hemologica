/**
 */
package org.hemologica.datatypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataResponse#getCode <em>Code</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataResponse#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataResponse()
 * @model
 * @generated
 */
public interface DataResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataResponse_Code()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataResponse#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataResponse_ErrorMessage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataResponse#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

} // DataResponse
