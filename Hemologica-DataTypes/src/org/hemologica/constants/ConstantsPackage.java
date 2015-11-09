/**
 */
package org.hemologica.constants;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.hemologica.constants.ConstantsFactory
 * @model kind="package"
 * @generated
 */
public interface ConstantsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constants";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hemologicadatatypes/org/hemologica/constants.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hemologicadatatypes.org.hemologica.constants";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstantsPackage eINSTANCE = org.hemologica.constants.impl.ConstantsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hemologica.constants.DataDonationStateEnum <em>Data Donation State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.constants.DataDonationStateEnum
	 * @see org.hemologica.constants.impl.ConstantsPackageImpl#getDataDonationStateEnum()
	 * @generated
	 */
	int DATA_DONATION_STATE_ENUM = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.constants.DataDonationRejectionType <em>Data Donation Rejection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.constants.DataDonationRejectionType
	 * @see org.hemologica.constants.impl.ConstantsPackageImpl#getDataDonationRejectionType()
	 * @generated
	 */
	int DATA_DONATION_REJECTION_TYPE = 1;

	/**
	 * The meta object id for the '{@link org.hemologica.constants.DataEventSeverityEnum <em>Data Event Severity Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.constants.DataEventSeverityEnum
	 * @see org.hemologica.constants.impl.ConstantsPackageImpl#getDataEventSeverityEnum()
	 * @generated
	 */
	int DATA_EVENT_SEVERITY_ENUM = 2;


	/**
	 * Returns the meta object for enum '{@link org.hemologica.constants.DataDonationStateEnum <em>Data Donation State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Donation State Enum</em>'.
	 * @see org.hemologica.constants.DataDonationStateEnum
	 * @generated
	 */
	EEnum getDataDonationStateEnum();

	/**
	 * Returns the meta object for enum '{@link org.hemologica.constants.DataDonationRejectionType <em>Data Donation Rejection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Donation Rejection Type</em>'.
	 * @see org.hemologica.constants.DataDonationRejectionType
	 * @generated
	 */
	EEnum getDataDonationRejectionType();

	/**
	 * Returns the meta object for enum '{@link org.hemologica.constants.DataEventSeverityEnum <em>Data Event Severity Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Event Severity Enum</em>'.
	 * @see org.hemologica.constants.DataEventSeverityEnum
	 * @generated
	 */
	EEnum getDataEventSeverityEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstantsFactory getConstantsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.hemologica.constants.DataDonationStateEnum <em>Data Donation State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.constants.DataDonationStateEnum
		 * @see org.hemologica.constants.impl.ConstantsPackageImpl#getDataDonationStateEnum()
		 * @generated
		 */
		EEnum DATA_DONATION_STATE_ENUM = eINSTANCE.getDataDonationStateEnum();

		/**
		 * The meta object literal for the '{@link org.hemologica.constants.DataDonationRejectionType <em>Data Donation Rejection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.constants.DataDonationRejectionType
		 * @see org.hemologica.constants.impl.ConstantsPackageImpl#getDataDonationRejectionType()
		 * @generated
		 */
		EEnum DATA_DONATION_REJECTION_TYPE = eINSTANCE.getDataDonationRejectionType();

		/**
		 * The meta object literal for the '{@link org.hemologica.constants.DataEventSeverityEnum <em>Data Event Severity Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.constants.DataEventSeverityEnum
		 * @see org.hemologica.constants.impl.ConstantsPackageImpl#getDataEventSeverityEnum()
		 * @generated
		 */
		EEnum DATA_EVENT_SEVERITY_ENUM = eINSTANCE.getDataEventSeverityEnum();

	}

} //ConstantsPackage
