/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Transfusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getName <em>Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getBank <em>Bank</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getAssociatedDonation <em>Associated Donation</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getDataProduct <em>Data Product</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getLaboratoryResults <em>Laboratory Results</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getEvents <em>Events</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataTransfusion#getResponsibleTransfusionPerson <em>Responsible Transfusion Person</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion()
 * @model
 * @generated
 */
public interface DataTransfusion extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"3440653129221915523L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_SerialVersionUID()
	 * @model default="3440653129221915523L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' reference.
	 * @see #setBank(DataBank)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_Bank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataBank getBank();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(DataBank value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_Institution()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataInstitution getInstitution();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getInstitution <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' reference.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(DataInstitution value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_Volume()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getVolume();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(DataPerson)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_Person()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataPerson getPerson();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(DataPerson value);

	/**
	 * Returns the value of the '<em><b>Associated Donation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Donation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Donation</em>' reference.
	 * @see #setAssociatedDonation(DataDonation)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_AssociatedDonation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataDonation getAssociatedDonation();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getAssociatedDonation <em>Associated Donation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Donation</em>' reference.
	 * @see #getAssociatedDonation()
	 * @generated
	 */
	void setAssociatedDonation(DataDonation value);

	/**
	 * Returns the value of the '<em><b>Data Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Product</em>' reference.
	 * @see #setDataProduct(DataProductType)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_DataProduct()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataProductType getDataProduct();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getDataProduct <em>Data Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Product</em>' reference.
	 * @see #getDataProduct()
	 * @generated
	 */
	void setDataProduct(DataProductType value);

	/**
	 * Returns the value of the '<em><b>Laboratory Results</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DataLaboratoryResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Laboratory Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Laboratory Results</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_LaboratoryResults()
	 * @model required="true"
	 * @generated
	 */
	EList<DataLaboratoryResult> getLaboratoryResults();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DataTransfusionEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_Events()
	 * @model required="true"
	 * @generated
	 */
	EList<DataTransfusionEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Responsible Transfusion Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Transfusion Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Transfusion Person</em>' reference.
	 * @see #setResponsibleTransfusionPerson(DataResponsiblePerson)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataTransfusion_ResponsibleTransfusionPerson()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataResponsiblePerson getResponsibleTransfusionPerson();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataTransfusion#getResponsibleTransfusionPerson <em>Responsible Transfusion Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Transfusion Person</em>' reference.
	 * @see #getResponsibleTransfusionPerson()
	 * @generated
	 */
	void setResponsibleTransfusionPerson(DataResponsiblePerson value);

} // DataTransfusion
