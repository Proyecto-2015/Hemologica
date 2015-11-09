/**
 */
package org.hemologica.datatypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.LoginData#getUser <em>User</em>}</li>
 *   <li>{@link org.hemologica.datatypes.LoginData#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getLoginData()
 * @model
 * @generated
 */
public interface LoginData extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getLoginData_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.LoginData#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getLoginData_Password()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.LoginData#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // LoginData
