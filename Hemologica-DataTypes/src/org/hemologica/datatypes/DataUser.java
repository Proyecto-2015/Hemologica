/**
 */
package org.hemologica.datatypes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataUser#getPersonId <em>Person Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataUser#getBanks <em>Banks</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataUser()
 * @model
 * @generated
 */
public interface DataUser extends EObject {
	/**
	 * Returns the value of the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Id</em>' attribute.
	 * @see #setPersonId(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUser_PersonId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPersonId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataUser#getPersonId <em>Person Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Id</em>' attribute.
	 * @see #getPersonId()
	 * @generated
	 */
	void setPersonId(String value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataUser_Banks()
	 * @model required="true"
	 * @generated
	 */
	EList<DataBank> getBanks();

} // DataUser
