/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import jdk.java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.hemologica.constants.DataDonationStateEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Donation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getName <em>Name</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getDate <em>Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getBank <em>Bank</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getDataDonorType <em>Data Donor Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getState <em>State</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getBloodABOType <em>Blood ABO Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getBloodDType <em>Blood DType</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getFail <em>Fail</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getLabResults <em>Lab Results</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getEvents <em>Events</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getExtractionTimeBegin <em>Extraction Time Begin</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DataDonation#getExtractionTimeEnd <em>Extraction Time End</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation()
 * @model
 * @generated
 */
public interface DataDonation extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"-4260250837335930498L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_SerialVersionUID()
	 * @model default="-4260250837335930498L" required="true" changeable="false" ordered="false"
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getName <em>Name</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getDate <em>Date</em>}' attribute.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_Bank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataBank getBank();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getBank <em>Bank</em>}' reference.
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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_Institution()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataInstitution getInstitution();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getInstitution <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' reference.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(DataInstitution value);

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
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_Person()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataPerson getPerson();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(DataPerson value);

	/**
	 * Returns the value of the '<em><b>Data Donor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Donor Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Donor Type</em>' reference.
	 * @see #setDataDonorType(DataDonationDonorType)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_DataDonorType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataDonationDonorType getDataDonorType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getDataDonorType <em>Data Donor Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Donor Type</em>' reference.
	 * @see #getDataDonorType()
	 * @generated
	 */
	void setDataDonorType(DataDonationDonorType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hemologica.constants.DataDonationStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.hemologica.constants.DataDonationStateEnum
	 * @see #setState(DataDonationStateEnum)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_State()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataDonationStateEnum getState();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.hemologica.constants.DataDonationStateEnum
	 * @see #getState()
	 * @generated
	 */
	void setState(DataDonationStateEnum value);

	/**
	 * Returns the value of the '<em><b>Blood ABO Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blood ABO Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blood ABO Type</em>' reference.
	 * @see #setBloodABOType(DataBloodABOType)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_BloodABOType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataBloodABOType getBloodABOType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getBloodABOType <em>Blood ABO Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blood ABO Type</em>' reference.
	 * @see #getBloodABOType()
	 * @generated
	 */
	void setBloodABOType(DataBloodABOType value);

	/**
	 * Returns the value of the '<em><b>Blood DType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blood DType</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blood DType</em>' reference.
	 * @see #setBloodDType(DataBloodType)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_BloodDType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataBloodType getBloodDType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getBloodDType <em>Blood DType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blood DType</em>' reference.
	 * @see #getBloodDType()
	 * @generated
	 */
	void setBloodDType(DataBloodType value);

	/**
	 * Returns the value of the '<em><b>Fail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail</em>' reference.
	 * @see #setFail(DataDonationFail)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_Fail()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataDonationFail getFail();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getFail <em>Fail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail</em>' reference.
	 * @see #getFail()
	 * @generated
	 */
	void setFail(DataDonationFail value);

	/**
	 * Returns the value of the '<em><b>Lab Results</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DataLaboratoryResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lab Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lab Results</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_LabResults()
	 * @model required="true"
	 * @generated
	 */
	EList<DataLaboratoryResult> getLabResults();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DataDonationEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_Events()
	 * @model required="true"
	 * @generated
	 */
	EList<DataDonationEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Extraction Time Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extraction Time Begin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extraction Time Begin</em>' containment reference.
	 * @see #setExtractionTimeBegin(Date)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_ExtractionTimeBegin()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Date getExtractionTimeBegin();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getExtractionTimeBegin <em>Extraction Time Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extraction Time Begin</em>' containment reference.
	 * @see #getExtractionTimeBegin()
	 * @generated
	 */
	void setExtractionTimeBegin(Date value);

	/**
	 * Returns the value of the '<em><b>Extraction Time End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extraction Time End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extraction Time End</em>' containment reference.
	 * @see #setExtractionTimeEnd(Date)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDataDonation_ExtractionTimeEnd()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Date getExtractionTimeEnd();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DataDonation#getExtractionTimeEnd <em>Extraction Time End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extraction Time End</em>' containment reference.
	 * @see #getExtractionTimeEnd()
	 * @generated
	 */
	void setExtractionTimeEnd(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='this.fail = new DataDonationFail();\n\t\tthis.bloodABOType = new DataBloodABOType();\n\t\tthis.bloodDType = new DataBloodType();\n\t\tthis.dataDonorType = new DataDonationDonorType();\n\t\tthis.person = new DataPerson();\n\t\tthis.labResults = new ArrayList<DataLaboratoryResult>();\n\t\tthis.events = new ArrayList<DataDonationEvent>();\n\t'"
	 * @generated
	 */
	DataDonation DataDonation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if(this.state != null)\n\t\t\treturn this.state.compareTo(DataDonationStateEnum.MADE)==0;\n\t\telse\n\t\t\treturn false;\n\t'"
	 * @generated
	 */
	boolean isApproved();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='return this.state != null;\n\t'"
	 * @generated
	 */
	boolean isStateDefined();

} // DataDonation
