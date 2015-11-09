/**
 */
package org.hemologica.datatypes;

import jdk.java.io.Serializable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Donations Statistics Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hemologica.datatypes.DonationsStatisticsData#getSerialVersionUID <em>Serial Version UID</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationsStatisticsData#getType <em>Type</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationsStatisticsData#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationsStatisticsData#getToDate <em>To Date</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationsStatisticsData#getInstitutionId <em>Institution Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationsStatisticsData#getBloodBankId <em>Blood Bank Id</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationsStatisticsData#getFilters <em>Filters</em>}</li>
 *   <li>{@link org.hemologica.datatypes.DonationsStatisticsData#getDistinguish <em>Distinguish</em>}</li>
 * </ul>
 *
 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData()
 * @model
 * @generated
 */
public interface DonationsStatisticsData extends Serializable {
	/**
	 * Returns the value of the '<em><b>Serial Version UID</b></em>' attribute.
	 * The default value is <code>"1L"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Version UID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Version UID</em>' attribute.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData_SerialVersionUID()
	 * @model default="1L" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	long getSerialVersionUID();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationsStatisticsData#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData_FromDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFromDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationsStatisticsData#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(String value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' attribute.
	 * @see #setToDate(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData_ToDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getToDate();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationsStatisticsData#getToDate <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' attribute.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(String value);

	/**
	 * Returns the value of the '<em><b>Institution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution Id</em>' attribute.
	 * @see #setInstitutionId(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData_InstitutionId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInstitutionId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationsStatisticsData#getInstitutionId <em>Institution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution Id</em>' attribute.
	 * @see #getInstitutionId()
	 * @generated
	 */
	void setInstitutionId(String value);

	/**
	 * Returns the value of the '<em><b>Blood Bank Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blood Bank Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blood Bank Id</em>' attribute.
	 * @see #setBloodBankId(String)
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData_BloodBankId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBloodBankId();

	/**
	 * Sets the value of the '{@link org.hemologica.datatypes.DonationsStatisticsData#getBloodBankId <em>Blood Bank Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blood Bank Id</em>' attribute.
	 * @see #getBloodBankId()
	 * @generated
	 */
	void setBloodBankId(String value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DonationFilterData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData_Filters()
	 * @model required="true"
	 * @generated
	 */
	EList<DonationFilterData> getFilters();

	/**
	 * Returns the value of the '<em><b>Distinguish</b></em>' reference list.
	 * The list contents are of type {@link org.hemologica.datatypes.DonationFilterData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distinguish</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinguish</em>' reference list.
	 * @see org.hemologica.datatypes.DatatypesPackage#getDonationsStatisticsData_Distinguish()
	 * @model required="true"
	 * @generated
	 */
	EList<DonationFilterData> getDistinguish();

} // DonationsStatisticsData
