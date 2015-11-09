/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import jdk.java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfusion Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.TransfusionResult#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.TransfusionResult#getTransfusionId <em>Transfusion Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.TransfusionResult#getPersonDocument <em>Person Document</em>}</li>
 *   <li>{@link org.hemologica.datatypes.TransfusionResult#getPersonCompleteName <em>Person Complete Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.TransfusionResult#getTransfusionDate <em>Transfusion Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.TransfusionResult#getTransfusionState <em>Transfusion State</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionResult()
 * @model
 * @generated
 */
public interface TransfusionResult extends Serializable {
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionResult_SerialVersionUID()
	 * @model default="9023483717165649475L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Transfusion Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfusion Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfusion Id</em>' attribute.
	 * @see #setTransfusionId(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionResult_TransfusionId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTransfusionId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.TransfusionResult#getTransfusionId <em>Transfusion Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfusion Id</em>' attribute.
	 * @see #getTransfusionId()
	 * @generated
	 */
	void setTransfusionId(String value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionResult_PersonDocument()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPersonDocument();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.TransfusionResult#getPersonDocument <em>Person Document</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionResult_PersonCompleteName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPersonCompleteName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.TransfusionResult#getPersonCompleteName <em>Person Complete Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Complete Name</em>' attribute.
	 * @see #getPersonCompleteName()
	 * @generated
	 */
	void setPersonCompleteName(String value);

	/**
	 * Returns the value of the '<em><b>Transfusion Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfusion Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfusion Date</em>' containment reference.
	 * @see #setTransfusionDate(Date)
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionResult_TransfusionDate()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Date getTransfusionDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.TransfusionResult#getTransfusionDate <em>Transfusion Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfusion Date</em>' containment reference.
	 * @see #getTransfusionDate()
	 * @generated
	 */
	void setTransfusionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Transfusion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfusion State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfusion State</em>' attribute.
	 * @see #setTransfusionState(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getTransfusionResult_TransfusionState()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTransfusionState();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.TransfusionResult#getTransfusionState <em>Transfusion State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfusion State</em>' attribute.
	 * @see #getTransfusionState()
	 * @generated
	 */
	void setTransfusionState(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransfusionResult TransfusionResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" transfusionIdRequired="true" transfusionIdOrdered="false" personDocumentRequired="true" personDocumentOrdered="false" personCompleteNameRequired="true" personCompleteNameOrdered="false" transfusionDateRequired="true" transfusionDateOrdered="false" transfusionStateRequired="true" transfusionStateOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.transfusionId = transfusionId;\n\t\tthis.personDocument = personDocument;\n\t\tthis.personCompleteName = personCompleteName;\n\t\tthis.transfusionDate = transfusionDate;\n\t\tthis.transfusionState = transfusionState;\n\t'"
	 * @generated
	 */
	TransfusionResult TransfusionResult(String transfusionId, String personDocument, String personCompleteName, Date transfusionDate, String transfusionState);

} // TransfusionResult
