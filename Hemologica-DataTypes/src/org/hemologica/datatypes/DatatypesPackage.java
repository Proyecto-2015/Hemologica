/**
 */
package org.hemologica.datatypes;

import jdk.java.io.IoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.hemologica.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///hemologicadatatypes/org/hemologica/datatypes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hemologicadatatypes.org.hemologica.datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = org.hemologica.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataEventImpl <em>Data Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataEventImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataEvent()
	 * @generated
	 */
	int DATA_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__EVENT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT__SEVERITY = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EVENT_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataCodeImpl <em>Data Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataCodeImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCode()
	 * @generated
	 */
	int DATA_CODE = 1;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CODE__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CODE__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CODE__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CODE__DESCRIPTION = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CODE_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CODE_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataBankImpl <em>Data Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataBankImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataBank()
	 * @generated
	 */
	int DATA_BANK = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__INSTITUTION = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__HOUR = 4;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__TELEPHONE = 5;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__LATITUDE = 8;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK__LONGITUDE = 9;

	/**
	 * The number of structural features of the '<em>Data Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK___EQUALS__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Data Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataInstitutionImpl <em>Data Institution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataInstitutionImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataInstitution()
	 * @generated
	 */
	int DATA_INSTITUTION = 3;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Banks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__BANKS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__ADDRESS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__HOUR = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__TELEPHONE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__EMAIL = IoPackage.SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__INFORMATION = IoPackage.SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__LATITUDE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION__LONGITUDE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Data Institution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Data Institution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataBank_equalsImpl <em>Data Bank equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataBank_equalsImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataBank_equals()
	 * @generated
	 */
	int DATA_BANK_EQUALS = 4;

	/**
	 * The number of structural features of the '<em>Data Bank equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK_EQUALS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Bank equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BANK_EQUALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataBloodABOTypeImpl <em>Data Blood ABO Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataBloodABOTypeImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataBloodABOType()
	 * @generated
	 */
	int DATA_BLOOD_ABO_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_ABO_TYPE__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_ABO_TYPE__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_ABO_TYPE__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Blood ABO Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_ABO_TYPE_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Blood ABO Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_ABO_TYPE_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataBloodTypeImpl <em>Data Blood Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataBloodTypeImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataBloodType()
	 * @generated
	 */
	int DATA_BLOOD_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_TYPE__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_TYPE__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_TYPE__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Blood Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_TYPE_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Blood Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BLOOD_TYPE_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataCampaignImpl <em>Data Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataCampaignImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCampaign()
	 * @generated
	 */
	int DATA_CAMPAIGN = 7;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN__ID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN__TITLE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN__SUBTITLE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN__SUMMARY = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN__TEXT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN__DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN__IMAGE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Data Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Data Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CAMPAIGN_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataCityImpl <em>Data City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataCityImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCity()
	 * @generated
	 */
	int DATA_CITY = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CITY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CITY__ID = 2;

	/**
	 * The number of structural features of the '<em>Data City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CITY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CITY___EQUALS__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Data City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataCity_equalsImpl <em>Data City equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataCity_equalsImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCity_equals()
	 * @generated
	 */
	int DATA_CITY_EQUALS = 9;

	/**
	 * The number of structural features of the '<em>Data City equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CITY_EQUALS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data City equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CITY_EQUALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataCountryImpl <em>Data Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataCountryImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCountry()
	 * @generated
	 */
	int DATA_COUNTRY = 10;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COUNTRY__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COUNTRY__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COUNTRY__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COUNTRY_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COUNTRY_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDocumentTypeImpl <em>Data Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDocumentTypeImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDocumentType()
	 * @generated
	 */
	int DATA_DOCUMENT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DOCUMENT_TYPE__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DOCUMENT_TYPE__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DOCUMENT_TYPE__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DOCUMENT_TYPE_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DOCUMENT_TYPE_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonationImpl <em>Data Donation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonationImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonation()
	 * @generated
	 */
	int DATA_DONATION = 12;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__BANK = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__INSTITUTION = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__PERSON = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Data Donor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__DATA_DONOR_TYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__STATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Blood ABO Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__BLOOD_ABO_TYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Blood DType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__BLOOD_DTYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__FAIL = IoPackage.SERIALIZABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Lab Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__LAB_RESULTS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__EVENTS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Extraction Time Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__EXTRACTION_TIME_BEGIN = IoPackage.SERIALIZABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Extraction Time End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION__EXTRACTION_TIME_END = IoPackage.SERIALIZABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Data Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Data Donation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION___DATA_DONATION = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Approved</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION___IS_APPROVED = IoPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is State Defined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION___IS_STATE_DEFINED = IoPackage.SERIALIZABLE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataPersonImpl <em>Data Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataPersonImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataPerson()
	 * @generated
	 */
	int DATA_PERSON = 13;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__ID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__FIRST_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__SECOND_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__FIRST_LAST_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Second Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__SECOND_LAST_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Document Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__DOCUMENT_COUNTRY = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__DOCUMENT_TYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__DOCUMENT_NUMBER = IoPackage.SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Birthday Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__BIRTHDAY_DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__STATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__CITY = IoPackage.SERIALIZABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__ADDRESS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__TELEPHONE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__EMAIL = IoPackage.SERIALIZABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Blood Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__BLOOD_TYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Able To Donate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__ABLE_TO_DONATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__IMAGE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Allow Notification Need Donor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__ALLOW_NOTIFICATION_NEED_DONOR = IoPackage.SERIALIZABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Allow Notification Able To Donate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON__ALLOW_NOTIFICATION_ABLE_TO_DONATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Data Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Full Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON___GET_FULL_NAME = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataStateImpl <em>Data State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataStateImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataState()
	 * @generated
	 */
	int DATA_STATE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__ID = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Data State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE___EQUALS__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Data State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataState_equalsImpl <em>Data State equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataState_equalsImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataState_equals()
	 * @generated
	 */
	int DATA_STATE_EQUALS = 15;

	/**
	 * The number of structural features of the '<em>Data State equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE_EQUALS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data State equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE_EQUALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataPerson_getFullNameImpl <em>Data Person get Full Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataPerson_getFullNameImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataPerson_getFullName()
	 * @generated
	 */
	int DATA_PERSON_GET_FULL_NAME = 16;

	/**
	 * The number of structural features of the '<em>Data Person get Full Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON_GET_FULL_NAME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Person get Full Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PERSON_GET_FULL_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonationDonorTypeImpl <em>Data Donation Donor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonationDonorTypeImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationDonorType()
	 * @generated
	 */
	int DATA_DONATION_DONOR_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_DONOR_TYPE__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_DONOR_TYPE__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_DONOR_TYPE__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Donation Donor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_DONOR_TYPE_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Donation Donor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_DONOR_TYPE_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonationFailImpl <em>Data Donation Fail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonationFailImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationFail()
	 * @generated
	 */
	int DATA_DONATION_FAIL = 18;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL__DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL__CAUSE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rejection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL__REJECTION_TYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Donation Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Data Donation Fail</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL___DATA_DONATION_FAIL = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Donation Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonationFailCauseImpl <em>Data Donation Fail Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonationFailCauseImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationFailCause()
	 * @generated
	 */
	int DATA_DONATION_FAIL_CAUSE = 19;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_CAUSE__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_CAUSE__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_CAUSE__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Donation Fail Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_CAUSE_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Donation Fail Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_CAUSE_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonationFail_DataDonationFailImpl <em>Data Donation Fail Data Donation Fail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonationFail_DataDonationFailImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationFail_DataDonationFail()
	 * @generated
	 */
	int DATA_DONATION_FAIL_DATA_DONATION_FAIL = 20;

	/**
	 * The number of structural features of the '<em>Data Donation Fail Data Donation Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_DATA_DONATION_FAIL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Donation Fail Data Donation Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_FAIL_DATA_DONATION_FAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataLaboratoryResultImpl <em>Data Laboratory Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataLaboratoryResultImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataLaboratoryResult()
	 * @generated
	 */
	int DATA_LABORATORY_RESULT = 21;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LABORATORY_RESULT__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LABORATORY_RESULT__ANALYSIS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LABORATORY_RESULT__BANK = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LABORATORY_RESULT__DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Responsible Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LABORATORY_RESULT__RESULT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Laboratory Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LABORATORY_RESULT_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Data Laboratory Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LABORATORY_RESULT_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl <em>Data Responsible Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataResponsiblePersonImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataResponsiblePerson()
	 * @generated
	 */
	int DATA_RESPONSIBLE_PERSON = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON__ID = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Second Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON__SECOND_NAME = 2;

	/**
	 * The feature id for the '<em><b>First Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON__FIRST_LAST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Second Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON__SECOND_LAST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Document Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON__DOCUMENT_COUNTRY = 5;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON__DOCUMENT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Document Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON__DOCUMENT_NUMBER = 7;

	/**
	 * The number of structural features of the '<em>Data Responsible Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Full Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON___GET_FULL_NAME = 0;

	/**
	 * The number of operations of the '<em>Data Responsible Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataResponsiblePerson_getFullNameImpl <em>Data Responsible Person get Full Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataResponsiblePerson_getFullNameImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataResponsiblePerson_getFullName()
	 * @generated
	 */
	int DATA_RESPONSIBLE_PERSON_GET_FULL_NAME = 23;

	/**
	 * The number of structural features of the '<em>Data Responsible Person get Full Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON_GET_FULL_NAME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Responsible Person get Full Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSIBLE_PERSON_GET_FULL_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonationEventImpl <em>Data Donation Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonationEventImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationEvent()
	 * @generated
	 */
	int DATA_DONATION_EVENT = 24;

	/**
	 * The number of structural features of the '<em>Data Donation Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Donation Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonation_DataDonationImpl <em>Data Donation Data Donation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonation_DataDonationImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonation_DataDonation()
	 * @generated
	 */
	int DATA_DONATION_DATA_DONATION = 25;

	/**
	 * The number of structural features of the '<em>Data Donation Data Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_DATA_DONATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Donation Data Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_DATA_DONATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonation_isApprovedImpl <em>Data Donation is Approved</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonation_isApprovedImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonation_isApproved()
	 * @generated
	 */
	int DATA_DONATION_IS_APPROVED = 26;

	/**
	 * The number of structural features of the '<em>Data Donation is Approved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_IS_APPROVED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Donation is Approved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_IS_APPROVED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataDonation_isStateDefinedImpl <em>Data Donation is State Defined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataDonation_isStateDefinedImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonation_isStateDefined()
	 * @generated
	 */
	int DATA_DONATION_IS_STATE_DEFINED = 27;

	/**
	 * The number of structural features of the '<em>Data Donation is State Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_IS_STATE_DEFINED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Donation is State Defined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DONATION_IS_STATE_DEFINED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataInstitutionCenterImpl <em>Data Institution Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataInstitutionCenterImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataInstitutionCenter()
	 * @generated
	 */
	int DATA_INSTITUTION_CENTER = 28;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION_CENTER__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Institution Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION_CENTER_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Institution Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTITUTION_CENTER_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataProductImpl <em>Data Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataProductImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataProduct()
	 * @generated
	 */
	int DATA_PRODUCT = 29;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT__DISPLAY = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Donation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT__DONATION = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataProductTypeImpl <em>Data Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataProductTypeImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataProductType()
	 * @generated
	 */
	int DATA_PRODUCT_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT_TYPE__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT_TYPE__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT_TYPE__DISPLAY = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT_TYPE_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PRODUCT_TYPE_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataResponseImpl <em>Data Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataResponseImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataResponse()
	 * @generated
	 */
	int DATA_RESPONSE = 31;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSE__ERROR_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataStockImpl <em>Data Stock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataStockImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataStock()
	 * @generated
	 */
	int DATA_STOCK = 32;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK__BANK = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK__PRODUCTS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataStockProductTypeImpl <em>Data Stock Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataStockProductTypeImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataStockProductType()
	 * @generated
	 */
	int DATA_STOCK_PRODUCT_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE__SERIAL_VERSION_UID = DATA_PRODUCT_TYPE__SERIAL_VERSION_UID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE__CODE = DATA_PRODUCT_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE__DISPLAY = DATA_PRODUCT_TYPE__DISPLAY;

	/**
	 * The feature id for the '<em><b>Blood Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE__BLOOD_TYPES = DATA_PRODUCT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Stock Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE_FEATURE_COUNT = DATA_PRODUCT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Stock Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE_OPERATION_COUNT = DATA_PRODUCT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataStockProductTypeBloodTypeImpl <em>Data Stock Product Type Blood Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataStockProductTypeBloodTypeImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataStockProductTypeBloodType()
	 * @generated
	 */
	int DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE__SERIAL_VERSION_UID = DATA_BLOOD_TYPE__SERIAL_VERSION_UID;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE__CODE = DATA_BLOOD_TYPE__CODE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE__DISPLAY_NAME = DATA_BLOOD_TYPE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE__COUNT = DATA_BLOOD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Stock Product Type Blood Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE_FEATURE_COUNT = DATA_BLOOD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Stock Product Type Blood Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE_OPERATION_COUNT = DATA_BLOOD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataTransfusionImpl <em>Data Transfusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataTransfusionImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataTransfusion()
	 * @generated
	 */
	int DATA_TRANSFUSION = 35;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__BANK = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__INSTITUTION = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__VOLUME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__PERSON = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Associated Donation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__ASSOCIATED_DONATION = IoPackage.SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Data Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__DATA_PRODUCT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Laboratory Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__LABORATORY_RESULTS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__EVENTS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Responsible Transfusion Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON = IoPackage.SERIALIZABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Data Transfusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Data Transfusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataTransfusionEventImpl <em>Data Transfusion Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataTransfusionEventImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataTransfusionEvent()
	 * @generated
	 */
	int DATA_TRANSFUSION_EVENT = 36;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION_EVENT__SERIAL_VERSION_UID = DATA_EVENT__SERIAL_VERSION_UID;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION_EVENT__EVENT = DATA_EVENT__EVENT;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION_EVENT__SEVERITY = DATA_EVENT__SEVERITY;

	/**
	 * The number of structural features of the '<em>Data Transfusion Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION_EVENT_FEATURE_COUNT = DATA_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Transfusion Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRANSFUSION_EVENT_OPERATION_COUNT = DATA_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataUnitImpl <em>Data Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataUnitImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataUnit()
	 * @generated
	 */
	int DATA_UNIT = 37;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__ID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Donation Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__DONATION_ID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__INSTITUTION = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Institution Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__INSTITUTION_CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__PRODUCT_TYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Blood Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT__BLOOD_TYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Data Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNIT_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DataUserImpl <em>Data User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DataUserImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataUser()
	 * @generated
	 */
	int DATA_USER = 38;

	/**
	 * The feature id for the '<em><b>Person Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USER__PERSON_ID = 0;

	/**
	 * The feature id for the '<em><b>Banks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USER__BANKS = 1;

	/**
	 * The number of structural features of the '<em>Data User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DonationFilterDataImpl <em>Donation Filter Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DonationFilterDataImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationFilterData()
	 * @generated
	 */
	int DONATION_FILTER_DATA = 39;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_FILTER_DATA__CODE = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_FILTER_DATA__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_FILTER_DATA__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Donation Filter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_FILTER_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Donation Filter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_FILTER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DonationResultImpl <em>Donation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DonationResultImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationResult()
	 * @generated
	 */
	int DONATION_RESULT = 40;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Donation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT__DONATION_ID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Person Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT__PERSON_DOCUMENT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Person Complete Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT__PERSON_COMPLETE_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Donation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT__DONATION_DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Donation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT__DONATION_STATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Donation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Donation Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT___DONATION_RESULT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Donation Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT___DONATION_RESULT__STRING_STRING_STRING_DATE_STRING = IoPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Donation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DonationResult_DonationResultImpl <em>Donation Result Donation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DonationResult_DonationResultImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationResult_DonationResult()
	 * @generated
	 */
	int DONATION_RESULT_DONATION_RESULT = 41;

	/**
	 * The number of structural features of the '<em>Donation Result Donation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT_DONATION_RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Donation Result Donation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_RESULT_DONATION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DonationSearchImpl <em>Donation Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DonationSearchImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationSearch()
	 * @generated
	 */
	int DONATION_SEARCH = 42;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH__PERSON = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH__FROM = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH__TO = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Donation Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Donation Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH___DONATION_SEARCH = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Donation Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH___DONATION_SEARCH__STRING_DATE_DATE = IoPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Donation Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DonationSearch_DonationSearchImpl <em>Donation Search Donation Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DonationSearch_DonationSearchImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationSearch_DonationSearch()
	 * @generated
	 */
	int DONATION_SEARCH_DONATION_SEARCH = 43;

	/**
	 * The number of structural features of the '<em>Donation Search Donation Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH_DONATION_SEARCH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Donation Search Donation Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_SEARCH_DONATION_SEARCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl <em>Donations Statistics Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.DonationsStatisticsDataImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationsStatisticsData()
	 * @generated
	 */
	int DONATIONS_STATISTICS_DATA = 44;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA__TYPE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA__FROM_DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA__TO_DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Institution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA__INSTITUTION_ID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blood Bank Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA__BLOOD_BANK_ID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA__FILTERS = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Distinguish</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA__DISTINGUISH = IoPackage.SERIALIZABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Donations Statistics Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Donations Statistics Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATIONS_STATISTICS_DATA_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.LoginDataImpl <em>Login Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.LoginDataImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getLoginData()
	 * @generated
	 */
	int LOGIN_DATA = 45;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_DATA__USER = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_DATA__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Login Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Login Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.MailDataImpl <em>Mail Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.MailDataImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getMailData()
	 * @generated
	 */
	int MAIL_DATA = 46;

	/**
	 * The feature id for the '<em><b>Message Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_DATA__MESSAGE_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Blood Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_DATA__BLOOD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_DATA__SUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_DATA__TEXT = 3;

	/**
	 * The number of structural features of the '<em>Mail Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mail Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.MessageOptionDataImpl <em>Message Option Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.MessageOptionDataImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getMessageOptionData()
	 * @generated
	 */
	int MESSAGE_OPTION_DATA = 47;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPTION_DATA__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPTION_DATA__CODE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPTION_DATA__DISPLAY_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message Option Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPTION_DATA_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Message Option Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPTION_DATA_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.TransfusionFilterDataImpl <em>Transfusion Filter Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.TransfusionFilterDataImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionFilterData()
	 * @generated
	 */
	int TRANSFUSION_FILTER_DATA = 48;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_FILTER_DATA__CODE = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_FILTER_DATA__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_FILTER_DATA__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Transfusion Filter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_FILTER_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transfusion Filter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_FILTER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.TransfusionResultImpl <em>Transfusion Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.TransfusionResultImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionResult()
	 * @generated
	 */
	int TRANSFUSION_RESULT = 49;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transfusion Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT__TRANSFUSION_ID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Person Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT__PERSON_DOCUMENT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Person Complete Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT__PERSON_COMPLETE_NAME = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transfusion Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT__TRANSFUSION_DATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transfusion State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT__TRANSFUSION_STATE = IoPackage.SERIALIZABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transfusion Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Transfusion Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT___TRANSFUSION_RESULT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Transfusion Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT___TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING = IoPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transfusion Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.TransfusionResult_TransfusionResultImpl <em>Transfusion Result Transfusion Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.TransfusionResult_TransfusionResultImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionResult_TransfusionResult()
	 * @generated
	 */
	int TRANSFUSION_RESULT_TRANSFUSION_RESULT = 50;

	/**
	 * The number of structural features of the '<em>Transfusion Result Transfusion Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT_TRANSFUSION_RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transfusion Result Transfusion Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_RESULT_TRANSFUSION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.TransfusionSearchImpl <em>Transfusion Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.TransfusionSearchImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionSearch()
	 * @generated
	 */
	int TRANSFUSION_SEARCH = 51;

	/**
	 * The feature id for the '<em><b>Serial Version UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH__SERIAL_VERSION_UID = IoPackage.SERIALIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH__PERSON = IoPackage.SERIALIZABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH__FROM = IoPackage.SERIALIZABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH__TO = IoPackage.SERIALIZABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transfusion Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH_FEATURE_COUNT = IoPackage.SERIALIZABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Transfusion Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH___TRANSFUSION_SEARCH = IoPackage.SERIALIZABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Transfusion Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH___TRANSFUSION_SEARCH__STRING_DATE_DATE = IoPackage.SERIALIZABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transfusion Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH_OPERATION_COUNT = IoPackage.SERIALIZABLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.hemologica.datatypes.impl.TransfusionSearch_TransfusionSearchImpl <em>Transfusion Search Transfusion Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.hemologica.datatypes.impl.TransfusionSearch_TransfusionSearchImpl
	 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionSearch_TransfusionSearch()
	 * @generated
	 */
	int TRANSFUSION_SEARCH_TRANSFUSION_SEARCH = 52;

	/**
	 * The number of structural features of the '<em>Transfusion Search Transfusion Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH_TRANSFUSION_SEARCH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transfusion Search Transfusion Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFUSION_SEARCH_TRANSFUSION_SEARCH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataEvent <em>Data Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Event</em>'.
	 * @see org.hemologica.datatypes.DataEvent
	 * @generated
	 */
	EClass getDataEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataEvent#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataEvent#getSerialVersionUID()
	 * @see #getDataEvent()
	 * @generated
	 */
	EAttribute getDataEvent_SerialVersionUID();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see org.hemologica.datatypes.DataEvent#getEvent()
	 * @see #getDataEvent()
	 * @generated
	 */
	EReference getDataEvent_Event();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataEvent#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.hemologica.datatypes.DataEvent#getSeverity()
	 * @see #getDataEvent()
	 * @generated
	 */
	EAttribute getDataEvent_Severity();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataCode <em>Data Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Code</em>'.
	 * @see org.hemologica.datatypes.DataCode
	 * @generated
	 */
	EClass getDataCode();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCode#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataCode#getSerialVersionUID()
	 * @see #getDataCode()
	 * @generated
	 */
	EAttribute getDataCode_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataCode#getCode()
	 * @see #getDataCode()
	 * @generated
	 */
	EAttribute getDataCode_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCode#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DataCode#getDisplayName()
	 * @see #getDataCode()
	 * @generated
	 */
	EAttribute getDataCode_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.hemologica.datatypes.DataCode#getDescription()
	 * @see #getDataCode()
	 * @generated
	 */
	EAttribute getDataCode_Description();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataBank <em>Data Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Bank</em>'.
	 * @see org.hemologica.datatypes.DataBank
	 * @generated
	 */
	EClass getDataBank();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBank#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataBank#getCode()
	 * @see #getDataBank()
	 * @generated
	 */
	EAttribute getDataBank_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBank#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hemologica.datatypes.DataBank#getName()
	 * @see #getDataBank()
	 * @generated
	 */
	EAttribute getDataBank_Name();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataBank#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Institution</em>'.
	 * @see org.hemologica.datatypes.DataBank#getInstitution()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_Institution();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBank#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.hemologica.datatypes.DataBank#getAddress()
	 * @see #getDataBank()
	 * @generated
	 */
	EAttribute getDataBank_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBank#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.hemologica.datatypes.DataBank#getHour()
	 * @see #getDataBank()
	 * @generated
	 */
	EAttribute getDataBank_Hour();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBank#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see org.hemologica.datatypes.DataBank#getTelephone()
	 * @see #getDataBank()
	 * @generated
	 */
	EAttribute getDataBank_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBank#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.hemologica.datatypes.DataBank#getEmail()
	 * @see #getDataBank()
	 * @generated
	 */
	EAttribute getDataBank_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBank#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see org.hemologica.datatypes.DataBank#getInformation()
	 * @see #getDataBank()
	 * @generated
	 */
	EAttribute getDataBank_Information();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataBank#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latitude</em>'.
	 * @see org.hemologica.datatypes.DataBank#getLatitude()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_Latitude();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataBank#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longitude</em>'.
	 * @see org.hemologica.datatypes.DataBank#getLongitude()
	 * @see #getDataBank()
	 * @generated
	 */
	EReference getDataBank_Longitude();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataBank#equals(jdk.java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see org.hemologica.datatypes.DataBank#equals(jdk.java.lang.Object)
	 * @generated
	 */
	EOperation getDataBank__Equals__Object();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataInstitution <em>Data Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Institution</em>'.
	 * @see org.hemologica.datatypes.DataInstitution
	 * @generated
	 */
	EClass getDataInstitution();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitution#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getSerialVersionUID()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EAttribute getDataInstitution_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitution#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getCode()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EAttribute getDataInstitution_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getName()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EAttribute getDataInstitution_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DataInstitution#getBanks <em>Banks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Banks</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getBanks()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EReference getDataInstitution_Banks();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitution#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getAddress()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EAttribute getDataInstitution_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitution#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getHour()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EAttribute getDataInstitution_Hour();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitution#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getTelephone()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EAttribute getDataInstitution_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitution#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getEmail()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EAttribute getDataInstitution_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitution#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getInformation()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EAttribute getDataInstitution_Information();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataInstitution#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latitude</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getLatitude()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EReference getDataInstitution_Latitude();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataInstitution#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longitude</em>'.
	 * @see org.hemologica.datatypes.DataInstitution#getLongitude()
	 * @see #getDataInstitution()
	 * @generated
	 */
	EReference getDataInstitution_Longitude();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataBank_equals <em>Data Bank equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Bank equals</em>'.
	 * @see org.hemologica.datatypes.DataBank_equals
	 * @generated
	 */
	EClass getDataBank_equals();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataBloodABOType <em>Data Blood ABO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Blood ABO Type</em>'.
	 * @see org.hemologica.datatypes.DataBloodABOType
	 * @generated
	 */
	EClass getDataBloodABOType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBloodABOType#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataBloodABOType#getSerialVersionUID()
	 * @see #getDataBloodABOType()
	 * @generated
	 */
	EAttribute getDataBloodABOType_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBloodABOType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataBloodABOType#getCode()
	 * @see #getDataBloodABOType()
	 * @generated
	 */
	EAttribute getDataBloodABOType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBloodABOType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DataBloodABOType#getDisplayName()
	 * @see #getDataBloodABOType()
	 * @generated
	 */
	EAttribute getDataBloodABOType_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataBloodType <em>Data Blood Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Blood Type</em>'.
	 * @see org.hemologica.datatypes.DataBloodType
	 * @generated
	 */
	EClass getDataBloodType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBloodType#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataBloodType#getSerialVersionUID()
	 * @see #getDataBloodType()
	 * @generated
	 */
	EAttribute getDataBloodType_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBloodType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataBloodType#getCode()
	 * @see #getDataBloodType()
	 * @generated
	 */
	EAttribute getDataBloodType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataBloodType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DataBloodType#getDisplayName()
	 * @see #getDataBloodType()
	 * @generated
	 */
	EAttribute getDataBloodType_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataCampaign <em>Data Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Campaign</em>'.
	 * @see org.hemologica.datatypes.DataCampaign
	 * @generated
	 */
	EClass getDataCampaign();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCampaign#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataCampaign#getSerialVersionUID()
	 * @see #getDataCampaign()
	 * @generated
	 */
	EAttribute getDataCampaign_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCampaign#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hemologica.datatypes.DataCampaign#getId()
	 * @see #getDataCampaign()
	 * @generated
	 */
	EAttribute getDataCampaign_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCampaign#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.hemologica.datatypes.DataCampaign#getTitle()
	 * @see #getDataCampaign()
	 * @generated
	 */
	EAttribute getDataCampaign_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCampaign#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see org.hemologica.datatypes.DataCampaign#getSubtitle()
	 * @see #getDataCampaign()
	 * @generated
	 */
	EAttribute getDataCampaign_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCampaign#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.hemologica.datatypes.DataCampaign#getSummary()
	 * @see #getDataCampaign()
	 * @generated
	 */
	EAttribute getDataCampaign_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCampaign#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.hemologica.datatypes.DataCampaign#getText()
	 * @see #getDataCampaign()
	 * @generated
	 */
	EAttribute getDataCampaign_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCampaign#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.hemologica.datatypes.DataCampaign#getDate()
	 * @see #getDataCampaign()
	 * @generated
	 */
	EAttribute getDataCampaign_Date();

	/**
	 * Returns the meta object for the attribute list '{@link org.hemologica.datatypes.DataCampaign#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Image</em>'.
	 * @see org.hemologica.datatypes.DataCampaign#getImage()
	 * @see #getDataCampaign()
	 * @generated
	 */
	EAttribute getDataCampaign_Image();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataCity <em>Data City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data City</em>'.
	 * @see org.hemologica.datatypes.DataCity
	 * @generated
	 */
	EClass getDataCity();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCity#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataCity#getCode()
	 * @see #getDataCity()
	 * @generated
	 */
	EAttribute getDataCity_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hemologica.datatypes.DataCity#getName()
	 * @see #getDataCity()
	 * @generated
	 */
	EAttribute getDataCity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hemologica.datatypes.DataCity#getId()
	 * @see #getDataCity()
	 * @generated
	 */
	EAttribute getDataCity_Id();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataCity#equals(jdk.java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see org.hemologica.datatypes.DataCity#equals(jdk.java.lang.Object)
	 * @generated
	 */
	EOperation getDataCity__Equals__Object();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataCity_equals <em>Data City equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data City equals</em>'.
	 * @see org.hemologica.datatypes.DataCity_equals
	 * @generated
	 */
	EClass getDataCity_equals();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataCountry <em>Data Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Country</em>'.
	 * @see org.hemologica.datatypes.DataCountry
	 * @generated
	 */
	EClass getDataCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCountry#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataCountry#getSerialVersionUID()
	 * @see #getDataCountry()
	 * @generated
	 */
	EAttribute getDataCountry_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCountry#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataCountry#getCode()
	 * @see #getDataCountry()
	 * @generated
	 */
	EAttribute getDataCountry_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataCountry#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DataCountry#getDisplayName()
	 * @see #getDataCountry()
	 * @generated
	 */
	EAttribute getDataCountry_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDocumentType <em>Data Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Document Type</em>'.
	 * @see org.hemologica.datatypes.DataDocumentType
	 * @generated
	 */
	EClass getDataDocumentType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDocumentType#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataDocumentType#getSerialVersionUID()
	 * @see #getDataDocumentType()
	 * @generated
	 */
	EAttribute getDataDocumentType_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDocumentType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataDocumentType#getCode()
	 * @see #getDataDocumentType()
	 * @generated
	 */
	EAttribute getDataDocumentType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDocumentType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DataDocumentType#getDisplayName()
	 * @see #getDataDocumentType()
	 * @generated
	 */
	EAttribute getDataDocumentType_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonation <em>Data Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation</em>'.
	 * @see org.hemologica.datatypes.DataDonation
	 * @generated
	 */
	EClass getDataDonation();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonation#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getSerialVersionUID()
	 * @see #getDataDonation()
	 * @generated
	 */
	EAttribute getDataDonation_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getName()
	 * @see #getDataDonation()
	 * @generated
	 */
	EAttribute getDataDonation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonation#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getDate()
	 * @see #getDataDonation()
	 * @generated
	 */
	EAttribute getDataDonation_Date();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataDonation#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getBank()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_Bank();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataDonation#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Institution</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getInstitution()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_Institution();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataDonation#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getPerson()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_Person();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataDonation#getDataDonorType <em>Data Donor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Donor Type</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getDataDonorType()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_DataDonorType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonation#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getState()
	 * @see #getDataDonation()
	 * @generated
	 */
	EAttribute getDataDonation_State();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataDonation#getBloodABOType <em>Blood ABO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blood ABO Type</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getBloodABOType()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_BloodABOType();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataDonation#getBloodDType <em>Blood DType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blood DType</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getBloodDType()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_BloodDType();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataDonation#getFail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fail</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getFail()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_Fail();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DataDonation#getLabResults <em>Lab Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lab Results</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getLabResults()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_LabResults();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DataDonation#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getEvents()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_Events();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataDonation#getExtractionTimeBegin <em>Extraction Time Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extraction Time Begin</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getExtractionTimeBegin()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_ExtractionTimeBegin();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataDonation#getExtractionTimeEnd <em>Extraction Time End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extraction Time End</em>'.
	 * @see org.hemologica.datatypes.DataDonation#getExtractionTimeEnd()
	 * @see #getDataDonation()
	 * @generated
	 */
	EReference getDataDonation_ExtractionTimeEnd();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataDonation#DataDonation() <em>Data Donation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Donation</em>' operation.
	 * @see org.hemologica.datatypes.DataDonation#DataDonation()
	 * @generated
	 */
	EOperation getDataDonation__DataDonation();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataDonation#isApproved() <em>Is Approved</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Approved</em>' operation.
	 * @see org.hemologica.datatypes.DataDonation#isApproved()
	 * @generated
	 */
	EOperation getDataDonation__IsApproved();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataDonation#isStateDefined() <em>Is State Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is State Defined</em>' operation.
	 * @see org.hemologica.datatypes.DataDonation#isStateDefined()
	 * @generated
	 */
	EOperation getDataDonation__IsStateDefined();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataPerson <em>Data Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Person</em>'.
	 * @see org.hemologica.datatypes.DataPerson
	 * @generated
	 */
	EClass getDataPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getSerialVersionUID()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getId()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getFirstName()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getSecondName <em>Second Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Name</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getSecondName()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_SecondName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getFirstLastName <em>First Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Last Name</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getFirstLastName()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_FirstLastName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getSecondLastName <em>Second Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Last Name</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getSecondLastName()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_SecondLastName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getDocumentCountry <em>Document Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Country</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getDocumentCountry()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_DocumentCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Type</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getDocumentType()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_DocumentType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getDocumentNumber <em>Document Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Number</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getDocumentNumber()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_DocumentNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getBirthdayDate <em>Birthday Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthday Date</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getBirthdayDate()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_BirthdayDate();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataPerson#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getState()
	 * @see #getDataPerson()
	 * @generated
	 */
	EReference getDataPerson_State();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataPerson#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getCity()
	 * @see #getDataPerson()
	 * @generated
	 */
	EReference getDataPerson_City();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getAddress()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getTelephone()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getEmail()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_Email();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataPerson#getBloodType <em>Blood Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blood Type</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getBloodType()
	 * @see #getDataPerson()
	 * @generated
	 */
	EReference getDataPerson_BloodType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#isAbleToDonate <em>Able To Donate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Able To Donate</em>'.
	 * @see org.hemologica.datatypes.DataPerson#isAbleToDonate()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_AbleToDonate();

	/**
	 * Returns the meta object for the attribute list '{@link org.hemologica.datatypes.DataPerson#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Image</em>'.
	 * @see org.hemologica.datatypes.DataPerson#getImage()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#isAllowNotificationNeedDonor <em>Allow Notification Need Donor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Notification Need Donor</em>'.
	 * @see org.hemologica.datatypes.DataPerson#isAllowNotificationNeedDonor()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_AllowNotificationNeedDonor();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataPerson#isAllowNotificationAbleToDonate <em>Allow Notification Able To Donate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Notification Able To Donate</em>'.
	 * @see org.hemologica.datatypes.DataPerson#isAllowNotificationAbleToDonate()
	 * @see #getDataPerson()
	 * @generated
	 */
	EAttribute getDataPerson_AllowNotificationAbleToDonate();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataPerson#getFullName() <em>Get Full Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Name</em>' operation.
	 * @see org.hemologica.datatypes.DataPerson#getFullName()
	 * @generated
	 */
	EOperation getDataPerson__GetFullName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data State</em>'.
	 * @see org.hemologica.datatypes.DataState
	 * @generated
	 */
	EClass getDataState();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataState#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hemologica.datatypes.DataState#getId()
	 * @see #getDataState()
	 * @generated
	 */
	EAttribute getDataState_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataState#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataState#getCode()
	 * @see #getDataState()
	 * @generated
	 */
	EAttribute getDataState_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hemologica.datatypes.DataState#getName()
	 * @see #getDataState()
	 * @generated
	 */
	EAttribute getDataState_Name();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataState#equals(jdk.java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see org.hemologica.datatypes.DataState#equals(jdk.java.lang.Object)
	 * @generated
	 */
	EOperation getDataState__Equals__Object();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataState_equals <em>Data State equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data State equals</em>'.
	 * @see org.hemologica.datatypes.DataState_equals
	 * @generated
	 */
	EClass getDataState_equals();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataPerson_getFullName <em>Data Person get Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Person get Full Name</em>'.
	 * @see org.hemologica.datatypes.DataPerson_getFullName
	 * @generated
	 */
	EClass getDataPerson_getFullName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonationDonorType <em>Data Donation Donor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation Donor Type</em>'.
	 * @see org.hemologica.datatypes.DataDonationDonorType
	 * @generated
	 */
	EClass getDataDonationDonorType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationDonorType#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataDonationDonorType#getSerialVersionUID()
	 * @see #getDataDonationDonorType()
	 * @generated
	 */
	EAttribute getDataDonationDonorType_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationDonorType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataDonationDonorType#getCode()
	 * @see #getDataDonationDonorType()
	 * @generated
	 */
	EAttribute getDataDonationDonorType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationDonorType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DataDonationDonorType#getDisplayName()
	 * @see #getDataDonationDonorType()
	 * @generated
	 */
	EAttribute getDataDonationDonorType_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonationFail <em>Data Donation Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation Fail</em>'.
	 * @see org.hemologica.datatypes.DataDonationFail
	 * @generated
	 */
	EClass getDataDonationFail();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationFail#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataDonationFail#getSerialVersionUID()
	 * @see #getDataDonationFail()
	 * @generated
	 */
	EAttribute getDataDonationFail_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationFail#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataDonationFail#getCode()
	 * @see #getDataDonationFail()
	 * @generated
	 */
	EAttribute getDataDonationFail_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationFail#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DataDonationFail#getDisplayName()
	 * @see #getDataDonationFail()
	 * @generated
	 */
	EAttribute getDataDonationFail_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataDonationFail#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.hemologica.datatypes.DataDonationFail#getDate()
	 * @see #getDataDonationFail()
	 * @generated
	 */
	EReference getDataDonationFail_Date();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataDonationFail#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cause</em>'.
	 * @see org.hemologica.datatypes.DataDonationFail#getCause()
	 * @see #getDataDonationFail()
	 * @generated
	 */
	EReference getDataDonationFail_Cause();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationFail#getRejectionType <em>Rejection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejection Type</em>'.
	 * @see org.hemologica.datatypes.DataDonationFail#getRejectionType()
	 * @see #getDataDonationFail()
	 * @generated
	 */
	EAttribute getDataDonationFail_RejectionType();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataDonationFail#DataDonationFail() <em>Data Donation Fail</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Donation Fail</em>' operation.
	 * @see org.hemologica.datatypes.DataDonationFail#DataDonationFail()
	 * @generated
	 */
	EOperation getDataDonationFail__DataDonationFail();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonationFailCause <em>Data Donation Fail Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation Fail Cause</em>'.
	 * @see org.hemologica.datatypes.DataDonationFailCause
	 * @generated
	 */
	EClass getDataDonationFailCause();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationFailCause#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataDonationFailCause#getSerialVersionUID()
	 * @see #getDataDonationFailCause()
	 * @generated
	 */
	EAttribute getDataDonationFailCause_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationFailCause#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataDonationFailCause#getCode()
	 * @see #getDataDonationFailCause()
	 * @generated
	 */
	EAttribute getDataDonationFailCause_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataDonationFailCause#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DataDonationFailCause#getDisplayName()
	 * @see #getDataDonationFailCause()
	 * @generated
	 */
	EAttribute getDataDonationFailCause_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonationFail_DataDonationFail <em>Data Donation Fail Data Donation Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation Fail Data Donation Fail</em>'.
	 * @see org.hemologica.datatypes.DataDonationFail_DataDonationFail
	 * @generated
	 */
	EClass getDataDonationFail_DataDonationFail();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataLaboratoryResult <em>Data Laboratory Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Laboratory Result</em>'.
	 * @see org.hemologica.datatypes.DataLaboratoryResult
	 * @generated
	 */
	EClass getDataLaboratoryResult();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataLaboratoryResult#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataLaboratoryResult#getSerialVersionUID()
	 * @see #getDataLaboratoryResult()
	 * @generated
	 */
	EAttribute getDataLaboratoryResult_SerialVersionUID();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataLaboratoryResult#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis</em>'.
	 * @see org.hemologica.datatypes.DataLaboratoryResult#getAnalysis()
	 * @see #getDataLaboratoryResult()
	 * @generated
	 */
	EReference getDataLaboratoryResult_Analysis();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataLaboratoryResult#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank</em>'.
	 * @see org.hemologica.datatypes.DataLaboratoryResult#getBank()
	 * @see #getDataLaboratoryResult()
	 * @generated
	 */
	EAttribute getDataLaboratoryResult_Bank();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataLaboratoryResult#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.hemologica.datatypes.DataLaboratoryResult#getDate()
	 * @see #getDataLaboratoryResult()
	 * @generated
	 */
	EReference getDataLaboratoryResult_Date();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataLaboratoryResult#getResponsiblePerson <em>Responsible Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible Person</em>'.
	 * @see org.hemologica.datatypes.DataLaboratoryResult#getResponsiblePerson()
	 * @see #getDataLaboratoryResult()
	 * @generated
	 */
	EReference getDataLaboratoryResult_ResponsiblePerson();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataLaboratoryResult#isResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.hemologica.datatypes.DataLaboratoryResult#isResult()
	 * @see #getDataLaboratoryResult()
	 * @generated
	 */
	EAttribute getDataLaboratoryResult_Result();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataResponsiblePerson <em>Data Responsible Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Responsible Person</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson
	 * @generated
	 */
	EClass getDataResponsiblePerson();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponsiblePerson#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getId()
	 * @see #getDataResponsiblePerson()
	 * @generated
	 */
	EAttribute getDataResponsiblePerson_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponsiblePerson#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getFirstName()
	 * @see #getDataResponsiblePerson()
	 * @generated
	 */
	EAttribute getDataResponsiblePerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponsiblePerson#getSecondName <em>Second Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Name</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getSecondName()
	 * @see #getDataResponsiblePerson()
	 * @generated
	 */
	EAttribute getDataResponsiblePerson_SecondName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponsiblePerson#getFirstLastName <em>First Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Last Name</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getFirstLastName()
	 * @see #getDataResponsiblePerson()
	 * @generated
	 */
	EAttribute getDataResponsiblePerson_FirstLastName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponsiblePerson#getSecondLastName <em>Second Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Last Name</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getSecondLastName()
	 * @see #getDataResponsiblePerson()
	 * @generated
	 */
	EAttribute getDataResponsiblePerson_SecondLastName();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponsiblePerson#getDocumentCountry <em>Document Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Country</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getDocumentCountry()
	 * @see #getDataResponsiblePerson()
	 * @generated
	 */
	EAttribute getDataResponsiblePerson_DocumentCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponsiblePerson#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Type</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getDocumentType()
	 * @see #getDataResponsiblePerson()
	 * @generated
	 */
	EAttribute getDataResponsiblePerson_DocumentType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponsiblePerson#getDocumentNumber <em>Document Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Number</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getDocumentNumber()
	 * @see #getDataResponsiblePerson()
	 * @generated
	 */
	EAttribute getDataResponsiblePerson_DocumentNumber();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DataResponsiblePerson#getFullName() <em>Get Full Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Name</em>' operation.
	 * @see org.hemologica.datatypes.DataResponsiblePerson#getFullName()
	 * @generated
	 */
	EOperation getDataResponsiblePerson__GetFullName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataResponsiblePerson_getFullName <em>Data Responsible Person get Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Responsible Person get Full Name</em>'.
	 * @see org.hemologica.datatypes.DataResponsiblePerson_getFullName
	 * @generated
	 */
	EClass getDataResponsiblePerson_getFullName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonationEvent <em>Data Donation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation Event</em>'.
	 * @see org.hemologica.datatypes.DataDonationEvent
	 * @generated
	 */
	EClass getDataDonationEvent();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonation_DataDonation <em>Data Donation Data Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation Data Donation</em>'.
	 * @see org.hemologica.datatypes.DataDonation_DataDonation
	 * @generated
	 */
	EClass getDataDonation_DataDonation();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonation_isApproved <em>Data Donation is Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation is Approved</em>'.
	 * @see org.hemologica.datatypes.DataDonation_isApproved
	 * @generated
	 */
	EClass getDataDonation_isApproved();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataDonation_isStateDefined <em>Data Donation is State Defined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Donation is State Defined</em>'.
	 * @see org.hemologica.datatypes.DataDonation_isStateDefined
	 * @generated
	 */
	EClass getDataDonation_isStateDefined();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataInstitutionCenter <em>Data Institution Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Institution Center</em>'.
	 * @see org.hemologica.datatypes.DataInstitutionCenter
	 * @generated
	 */
	EClass getDataInstitutionCenter();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataInstitutionCenter#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataInstitutionCenter#getSerialVersionUID()
	 * @see #getDataInstitutionCenter()
	 * @generated
	 */
	EAttribute getDataInstitutionCenter_SerialVersionUID();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataProduct <em>Data Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Product</em>'.
	 * @see org.hemologica.datatypes.DataProduct
	 * @generated
	 */
	EClass getDataProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataProduct#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataProduct#getSerialVersionUID()
	 * @see #getDataProduct()
	 * @generated
	 */
	EAttribute getDataProduct_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataProduct#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataProduct#getCode()
	 * @see #getDataProduct()
	 * @generated
	 */
	EAttribute getDataProduct_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataProduct#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.hemologica.datatypes.DataProduct#getDisplay()
	 * @see #getDataProduct()
	 * @generated
	 */
	EAttribute getDataProduct_Display();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataProduct#getDonation <em>Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Donation</em>'.
	 * @see org.hemologica.datatypes.DataProduct#getDonation()
	 * @see #getDataProduct()
	 * @generated
	 */
	EReference getDataProduct_Donation();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataProductType <em>Data Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Product Type</em>'.
	 * @see org.hemologica.datatypes.DataProductType
	 * @generated
	 */
	EClass getDataProductType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataProductType#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataProductType#getSerialVersionUID()
	 * @see #getDataProductType()
	 * @generated
	 */
	EAttribute getDataProductType_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataProductType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataProductType#getCode()
	 * @see #getDataProductType()
	 * @generated
	 */
	EAttribute getDataProductType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataProductType#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.hemologica.datatypes.DataProductType#getDisplay()
	 * @see #getDataProductType()
	 * @generated
	 */
	EAttribute getDataProductType_Display();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataResponse <em>Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Response</em>'.
	 * @see org.hemologica.datatypes.DataResponse
	 * @generated
	 */
	EClass getDataResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponse#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataResponse#getCode()
	 * @see #getDataResponse()
	 * @generated
	 */
	EAttribute getDataResponse_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataResponse#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.hemologica.datatypes.DataResponse#getErrorMessage()
	 * @see #getDataResponse()
	 * @generated
	 */
	EAttribute getDataResponse_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataStock <em>Data Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Stock</em>'.
	 * @see org.hemologica.datatypes.DataStock
	 * @generated
	 */
	EClass getDataStock();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataStock#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataStock#getSerialVersionUID()
	 * @see #getDataStock()
	 * @generated
	 */
	EAttribute getDataStock_SerialVersionUID();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataStock#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank</em>'.
	 * @see org.hemologica.datatypes.DataStock#getBank()
	 * @see #getDataStock()
	 * @generated
	 */
	EReference getDataStock_Bank();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DataStock#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see org.hemologica.datatypes.DataStock#getProducts()
	 * @see #getDataStock()
	 * @generated
	 */
	EReference getDataStock_Products();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataStockProductType <em>Data Stock Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Stock Product Type</em>'.
	 * @see org.hemologica.datatypes.DataStockProductType
	 * @generated
	 */
	EClass getDataStockProductType();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DataStockProductType#getBloodTypes <em>Blood Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blood Types</em>'.
	 * @see org.hemologica.datatypes.DataStockProductType#getBloodTypes()
	 * @see #getDataStockProductType()
	 * @generated
	 */
	EReference getDataStockProductType_BloodTypes();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataStockProductTypeBloodType <em>Data Stock Product Type Blood Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Stock Product Type Blood Type</em>'.
	 * @see org.hemologica.datatypes.DataStockProductTypeBloodType
	 * @generated
	 */
	EClass getDataStockProductTypeBloodType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataStockProductTypeBloodType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.hemologica.datatypes.DataStockProductTypeBloodType#getCount()
	 * @see #getDataStockProductTypeBloodType()
	 * @generated
	 */
	EAttribute getDataStockProductTypeBloodType_Count();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataTransfusion <em>Data Transfusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transfusion</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion
	 * @generated
	 */
	EClass getDataTransfusion();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataTransfusion#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getSerialVersionUID()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EAttribute getDataTransfusion_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataTransfusion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getName()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EAttribute getDataTransfusion_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataTransfusion#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getDate()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EAttribute getDataTransfusion_Date();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataTransfusion#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getBank()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EReference getDataTransfusion_Bank();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataTransfusion#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Institution</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getInstitution()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EReference getDataTransfusion_Institution();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataTransfusion#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getVolume()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EAttribute getDataTransfusion_Volume();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataTransfusion#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getPerson()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EReference getDataTransfusion_Person();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataTransfusion#getAssociatedDonation <em>Associated Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Donation</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getAssociatedDonation()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EReference getDataTransfusion_AssociatedDonation();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataTransfusion#getDataProduct <em>Data Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Product</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getDataProduct()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EReference getDataTransfusion_DataProduct();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DataTransfusion#getLaboratoryResults <em>Laboratory Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Laboratory Results</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getLaboratoryResults()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EReference getDataTransfusion_LaboratoryResults();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DataTransfusion#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getEvents()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EReference getDataTransfusion_Events();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataTransfusion#getResponsibleTransfusionPerson <em>Responsible Transfusion Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible Transfusion Person</em>'.
	 * @see org.hemologica.datatypes.DataTransfusion#getResponsibleTransfusionPerson()
	 * @see #getDataTransfusion()
	 * @generated
	 */
	EReference getDataTransfusion_ResponsibleTransfusionPerson();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataTransfusionEvent <em>Data Transfusion Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Transfusion Event</em>'.
	 * @see org.hemologica.datatypes.DataTransfusionEvent
	 * @generated
	 */
	EClass getDataTransfusionEvent();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Unit</em>'.
	 * @see org.hemologica.datatypes.DataUnit
	 * @generated
	 */
	EClass getDataUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataUnit#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DataUnit#getSerialVersionUID()
	 * @see #getDataUnit()
	 * @generated
	 */
	EAttribute getDataUnit_SerialVersionUID();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataUnit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see org.hemologica.datatypes.DataUnit#getId()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DataUnit#getDonationId <em>Donation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Donation Id</em>'.
	 * @see org.hemologica.datatypes.DataUnit#getDonationId()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_DonationId();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataUnit#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DataUnit#getCode()
	 * @see #getDataUnit()
	 * @generated
	 */
	EAttribute getDataUnit_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataUnit#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see org.hemologica.datatypes.DataUnit#getInstitution()
	 * @see #getDataUnit()
	 * @generated
	 */
	EAttribute getDataUnit_Institution();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataUnit#getInstitutionCode <em>Institution Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution Code</em>'.
	 * @see org.hemologica.datatypes.DataUnit#getInstitutionCode()
	 * @see #getDataUnit()
	 * @generated
	 */
	EAttribute getDataUnit_InstitutionCode();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataUnit#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Type</em>'.
	 * @see org.hemologica.datatypes.DataUnit#getProductType()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_ProductType();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.DataUnit#getBloodType <em>Blood Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blood Type</em>'.
	 * @see org.hemologica.datatypes.DataUnit#getBloodType()
	 * @see #getDataUnit()
	 * @generated
	 */
	EReference getDataUnit_BloodType();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DataUser <em>Data User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data User</em>'.
	 * @see org.hemologica.datatypes.DataUser
	 * @generated
	 */
	EClass getDataUser();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DataUser#getPersonId <em>Person Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Id</em>'.
	 * @see org.hemologica.datatypes.DataUser#getPersonId()
	 * @see #getDataUser()
	 * @generated
	 */
	EAttribute getDataUser_PersonId();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DataUser#getBanks <em>Banks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Banks</em>'.
	 * @see org.hemologica.datatypes.DataUser#getBanks()
	 * @see #getDataUser()
	 * @generated
	 */
	EReference getDataUser_Banks();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DonationFilterData <em>Donation Filter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donation Filter Data</em>'.
	 * @see org.hemologica.datatypes.DonationFilterData
	 * @generated
	 */
	EClass getDonationFilterData();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationFilterData#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.DonationFilterData#getCode()
	 * @see #getDonationFilterData()
	 * @generated
	 */
	EAttribute getDonationFilterData_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationFilterData#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.DonationFilterData#getDisplayName()
	 * @see #getDonationFilterData()
	 * @generated
	 */
	EAttribute getDonationFilterData_DisplayName();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DonationFilterData#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see org.hemologica.datatypes.DonationFilterData#getOptions()
	 * @see #getDonationFilterData()
	 * @generated
	 */
	EReference getDonationFilterData_Options();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DonationResult <em>Donation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donation Result</em>'.
	 * @see org.hemologica.datatypes.DonationResult
	 * @generated
	 */
	EClass getDonationResult();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationResult#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DonationResult#getSerialVersionUID()
	 * @see #getDonationResult()
	 * @generated
	 */
	EAttribute getDonationResult_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationResult#getDonationId <em>Donation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Donation Id</em>'.
	 * @see org.hemologica.datatypes.DonationResult#getDonationId()
	 * @see #getDonationResult()
	 * @generated
	 */
	EAttribute getDonationResult_DonationId();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationResult#getPersonDocument <em>Person Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Document</em>'.
	 * @see org.hemologica.datatypes.DonationResult#getPersonDocument()
	 * @see #getDonationResult()
	 * @generated
	 */
	EAttribute getDonationResult_PersonDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationResult#getPersonCompleteName <em>Person Complete Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Complete Name</em>'.
	 * @see org.hemologica.datatypes.DonationResult#getPersonCompleteName()
	 * @see #getDonationResult()
	 * @generated
	 */
	EAttribute getDonationResult_PersonCompleteName();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DonationResult#getDonationDate <em>Donation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Donation Date</em>'.
	 * @see org.hemologica.datatypes.DonationResult#getDonationDate()
	 * @see #getDonationResult()
	 * @generated
	 */
	EReference getDonationResult_DonationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationResult#getDonationState <em>Donation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Donation State</em>'.
	 * @see org.hemologica.datatypes.DonationResult#getDonationState()
	 * @see #getDonationResult()
	 * @generated
	 */
	EAttribute getDonationResult_DonationState();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DonationResult#DonationResult() <em>Donation Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Donation Result</em>' operation.
	 * @see org.hemologica.datatypes.DonationResult#DonationResult()
	 * @generated
	 */
	EOperation getDonationResult__DonationResult();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DonationResult#DonationResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String) <em>Donation Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Donation Result</em>' operation.
	 * @see org.hemologica.datatypes.DonationResult#DonationResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getDonationResult__DonationResult__String_String_String_Date_String();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DonationResult_DonationResult <em>Donation Result Donation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donation Result Donation Result</em>'.
	 * @see org.hemologica.datatypes.DonationResult_DonationResult
	 * @generated
	 */
	EClass getDonationResult_DonationResult();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DonationSearch <em>Donation Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donation Search</em>'.
	 * @see org.hemologica.datatypes.DonationSearch
	 * @generated
	 */
	EClass getDonationSearch();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationSearch#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DonationSearch#getSerialVersionUID()
	 * @see #getDonationSearch()
	 * @generated
	 */
	EAttribute getDonationSearch_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationSearch#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person</em>'.
	 * @see org.hemologica.datatypes.DonationSearch#getPerson()
	 * @see #getDonationSearch()
	 * @generated
	 */
	EAttribute getDonationSearch_Person();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DonationSearch#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.hemologica.datatypes.DonationSearch#getFrom()
	 * @see #getDonationSearch()
	 * @generated
	 */
	EReference getDonationSearch_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.DonationSearch#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.hemologica.datatypes.DonationSearch#getTo()
	 * @see #getDonationSearch()
	 * @generated
	 */
	EReference getDonationSearch_To();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DonationSearch#DonationSearch() <em>Donation Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Donation Search</em>' operation.
	 * @see org.hemologica.datatypes.DonationSearch#DonationSearch()
	 * @generated
	 */
	EOperation getDonationSearch__DonationSearch();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.DonationSearch#DonationSearch(java.lang.String, jdk.java.util.Date, jdk.java.util.Date) <em>Donation Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Donation Search</em>' operation.
	 * @see org.hemologica.datatypes.DonationSearch#DonationSearch(java.lang.String, jdk.java.util.Date, jdk.java.util.Date)
	 * @generated
	 */
	EOperation getDonationSearch__DonationSearch__String_Date_Date();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DonationSearch_DonationSearch <em>Donation Search Donation Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donation Search Donation Search</em>'.
	 * @see org.hemologica.datatypes.DonationSearch_DonationSearch
	 * @generated
	 */
	EClass getDonationSearch_DonationSearch();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.DonationsStatisticsData <em>Donations Statistics Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donations Statistics Data</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData
	 * @generated
	 */
	EClass getDonationsStatisticsData();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationsStatisticsData#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData#getSerialVersionUID()
	 * @see #getDonationsStatisticsData()
	 * @generated
	 */
	EAttribute getDonationsStatisticsData_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationsStatisticsData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData#getType()
	 * @see #getDonationsStatisticsData()
	 * @generated
	 */
	EAttribute getDonationsStatisticsData_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationsStatisticsData#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData#getFromDate()
	 * @see #getDonationsStatisticsData()
	 * @generated
	 */
	EAttribute getDonationsStatisticsData_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationsStatisticsData#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData#getToDate()
	 * @see #getDonationsStatisticsData()
	 * @generated
	 */
	EAttribute getDonationsStatisticsData_ToDate();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationsStatisticsData#getInstitutionId <em>Institution Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution Id</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData#getInstitutionId()
	 * @see #getDonationsStatisticsData()
	 * @generated
	 */
	EAttribute getDonationsStatisticsData_InstitutionId();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.DonationsStatisticsData#getBloodBankId <em>Blood Bank Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blood Bank Id</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData#getBloodBankId()
	 * @see #getDonationsStatisticsData()
	 * @generated
	 */
	EAttribute getDonationsStatisticsData_BloodBankId();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DonationsStatisticsData#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filters</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData#getFilters()
	 * @see #getDonationsStatisticsData()
	 * @generated
	 */
	EReference getDonationsStatisticsData_Filters();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.DonationsStatisticsData#getDistinguish <em>Distinguish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Distinguish</em>'.
	 * @see org.hemologica.datatypes.DonationsStatisticsData#getDistinguish()
	 * @see #getDonationsStatisticsData()
	 * @generated
	 */
	EReference getDonationsStatisticsData_Distinguish();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.LoginData <em>Login Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Data</em>'.
	 * @see org.hemologica.datatypes.LoginData
	 * @generated
	 */
	EClass getLoginData();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.LoginData#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.hemologica.datatypes.LoginData#getUser()
	 * @see #getLoginData()
	 * @generated
	 */
	EAttribute getLoginData_User();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.LoginData#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.hemologica.datatypes.LoginData#getPassword()
	 * @see #getLoginData()
	 * @generated
	 */
	EAttribute getLoginData_Password();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.MailData <em>Mail Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail Data</em>'.
	 * @see org.hemologica.datatypes.MailData
	 * @generated
	 */
	EClass getMailData();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.MailData#getMessageOption <em>Message Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Option</em>'.
	 * @see org.hemologica.datatypes.MailData#getMessageOption()
	 * @see #getMailData()
	 * @generated
	 */
	EReference getMailData_MessageOption();

	/**
	 * Returns the meta object for the reference '{@link org.hemologica.datatypes.MailData#getBloodType <em>Blood Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blood Type</em>'.
	 * @see org.hemologica.datatypes.MailData#getBloodType()
	 * @see #getMailData()
	 * @generated
	 */
	EReference getMailData_BloodType();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.MailData#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.hemologica.datatypes.MailData#getSubject()
	 * @see #getMailData()
	 * @generated
	 */
	EAttribute getMailData_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.MailData#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.hemologica.datatypes.MailData#getText()
	 * @see #getMailData()
	 * @generated
	 */
	EAttribute getMailData_Text();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.MessageOptionData <em>Message Option Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Option Data</em>'.
	 * @see org.hemologica.datatypes.MessageOptionData
	 * @generated
	 */
	EClass getMessageOptionData();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.MessageOptionData#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.MessageOptionData#getSerialVersionUID()
	 * @see #getMessageOptionData()
	 * @generated
	 */
	EAttribute getMessageOptionData_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.MessageOptionData#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.MessageOptionData#getCode()
	 * @see #getMessageOptionData()
	 * @generated
	 */
	EAttribute getMessageOptionData_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.MessageOptionData#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.MessageOptionData#getDisplayName()
	 * @see #getMessageOptionData()
	 * @generated
	 */
	EAttribute getMessageOptionData_DisplayName();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.TransfusionFilterData <em>Transfusion Filter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfusion Filter Data</em>'.
	 * @see org.hemologica.datatypes.TransfusionFilterData
	 * @generated
	 */
	EClass getTransfusionFilterData();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionFilterData#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.hemologica.datatypes.TransfusionFilterData#getCode()
	 * @see #getTransfusionFilterData()
	 * @generated
	 */
	EAttribute getTransfusionFilterData_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionFilterData#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.hemologica.datatypes.TransfusionFilterData#getDisplayName()
	 * @see #getTransfusionFilterData()
	 * @generated
	 */
	EAttribute getTransfusionFilterData_DisplayName();

	/**
	 * Returns the meta object for the reference list '{@link org.hemologica.datatypes.TransfusionFilterData#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see org.hemologica.datatypes.TransfusionFilterData#getOptions()
	 * @see #getTransfusionFilterData()
	 * @generated
	 */
	EReference getTransfusionFilterData_Options();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.TransfusionResult <em>Transfusion Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfusion Result</em>'.
	 * @see org.hemologica.datatypes.TransfusionResult
	 * @generated
	 */
	EClass getTransfusionResult();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionResult#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.TransfusionResult#getSerialVersionUID()
	 * @see #getTransfusionResult()
	 * @generated
	 */
	EAttribute getTransfusionResult_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionResult#getTransfusionId <em>Transfusion Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfusion Id</em>'.
	 * @see org.hemologica.datatypes.TransfusionResult#getTransfusionId()
	 * @see #getTransfusionResult()
	 * @generated
	 */
	EAttribute getTransfusionResult_TransfusionId();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionResult#getPersonDocument <em>Person Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Document</em>'.
	 * @see org.hemologica.datatypes.TransfusionResult#getPersonDocument()
	 * @see #getTransfusionResult()
	 * @generated
	 */
	EAttribute getTransfusionResult_PersonDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionResult#getPersonCompleteName <em>Person Complete Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Complete Name</em>'.
	 * @see org.hemologica.datatypes.TransfusionResult#getPersonCompleteName()
	 * @see #getTransfusionResult()
	 * @generated
	 */
	EAttribute getTransfusionResult_PersonCompleteName();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.TransfusionResult#getTransfusionDate <em>Transfusion Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfusion Date</em>'.
	 * @see org.hemologica.datatypes.TransfusionResult#getTransfusionDate()
	 * @see #getTransfusionResult()
	 * @generated
	 */
	EReference getTransfusionResult_TransfusionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionResult#getTransfusionState <em>Transfusion State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfusion State</em>'.
	 * @see org.hemologica.datatypes.TransfusionResult#getTransfusionState()
	 * @see #getTransfusionResult()
	 * @generated
	 */
	EAttribute getTransfusionResult_TransfusionState();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.TransfusionResult#TransfusionResult() <em>Transfusion Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfusion Result</em>' operation.
	 * @see org.hemologica.datatypes.TransfusionResult#TransfusionResult()
	 * @generated
	 */
	EOperation getTransfusionResult__TransfusionResult();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.TransfusionResult#TransfusionResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String) <em>Transfusion Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfusion Result</em>' operation.
	 * @see org.hemologica.datatypes.TransfusionResult#TransfusionResult(java.lang.String, java.lang.String, java.lang.String, jdk.java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getTransfusionResult__TransfusionResult__String_String_String_Date_String();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.TransfusionResult_TransfusionResult <em>Transfusion Result Transfusion Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfusion Result Transfusion Result</em>'.
	 * @see org.hemologica.datatypes.TransfusionResult_TransfusionResult
	 * @generated
	 */
	EClass getTransfusionResult_TransfusionResult();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.TransfusionSearch <em>Transfusion Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfusion Search</em>'.
	 * @see org.hemologica.datatypes.TransfusionSearch
	 * @generated
	 */
	EClass getTransfusionSearch();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionSearch#getSerialVersionUID <em>Serial Version UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Version UID</em>'.
	 * @see org.hemologica.datatypes.TransfusionSearch#getSerialVersionUID()
	 * @see #getTransfusionSearch()
	 * @generated
	 */
	EAttribute getTransfusionSearch_SerialVersionUID();

	/**
	 * Returns the meta object for the attribute '{@link org.hemologica.datatypes.TransfusionSearch#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person</em>'.
	 * @see org.hemologica.datatypes.TransfusionSearch#getPerson()
	 * @see #getTransfusionSearch()
	 * @generated
	 */
	EAttribute getTransfusionSearch_Person();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.TransfusionSearch#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.hemologica.datatypes.TransfusionSearch#getFrom()
	 * @see #getTransfusionSearch()
	 * @generated
	 */
	EReference getTransfusionSearch_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.hemologica.datatypes.TransfusionSearch#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.hemologica.datatypes.TransfusionSearch#getTo()
	 * @see #getTransfusionSearch()
	 * @generated
	 */
	EReference getTransfusionSearch_To();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.TransfusionSearch#TransfusionSearch() <em>Transfusion Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfusion Search</em>' operation.
	 * @see org.hemologica.datatypes.TransfusionSearch#TransfusionSearch()
	 * @generated
	 */
	EOperation getTransfusionSearch__TransfusionSearch();

	/**
	 * Returns the meta object for the '{@link org.hemologica.datatypes.TransfusionSearch#TransfusionSearch(java.lang.String, jdk.java.util.Date, jdk.java.util.Date) <em>Transfusion Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfusion Search</em>' operation.
	 * @see org.hemologica.datatypes.TransfusionSearch#TransfusionSearch(java.lang.String, jdk.java.util.Date, jdk.java.util.Date)
	 * @generated
	 */
	EOperation getTransfusionSearch__TransfusionSearch__String_Date_Date();

	/**
	 * Returns the meta object for class '{@link org.hemologica.datatypes.TransfusionSearch_TransfusionSearch <em>Transfusion Search Transfusion Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfusion Search Transfusion Search</em>'.
	 * @see org.hemologica.datatypes.TransfusionSearch_TransfusionSearch
	 * @generated
	 */
	EClass getTransfusionSearch_TransfusionSearch();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataEventImpl <em>Data Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataEventImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataEvent()
		 * @generated
		 */
		EClass DATA_EVENT = eINSTANCE.getDataEvent();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EVENT__SERIAL_VERSION_UID = eINSTANCE.getDataEvent_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EVENT__EVENT = eINSTANCE.getDataEvent_Event();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EVENT__SEVERITY = eINSTANCE.getDataEvent_Severity();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataCodeImpl <em>Data Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataCodeImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCode()
		 * @generated
		 */
		EClass DATA_CODE = eINSTANCE.getDataCode();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CODE__SERIAL_VERSION_UID = eINSTANCE.getDataCode_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CODE__CODE = eINSTANCE.getDataCode_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CODE__DISPLAY_NAME = eINSTANCE.getDataCode_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CODE__DESCRIPTION = eINSTANCE.getDataCode_Description();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataBankImpl <em>Data Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataBankImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataBank()
		 * @generated
		 */
		EClass DATA_BANK = eINSTANCE.getDataBank();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BANK__CODE = eINSTANCE.getDataBank_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BANK__NAME = eINSTANCE.getDataBank_Name();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__INSTITUTION = eINSTANCE.getDataBank_Institution();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BANK__ADDRESS = eINSTANCE.getDataBank_Address();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BANK__HOUR = eINSTANCE.getDataBank_Hour();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BANK__TELEPHONE = eINSTANCE.getDataBank_Telephone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BANK__EMAIL = eINSTANCE.getDataBank_Email();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BANK__INFORMATION = eINSTANCE.getDataBank_Information();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__LATITUDE = eINSTANCE.getDataBank_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BANK__LONGITUDE = eINSTANCE.getDataBank_Longitude();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_BANK___EQUALS__OBJECT = eINSTANCE.getDataBank__Equals__Object();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataInstitutionImpl <em>Data Institution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataInstitutionImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataInstitution()
		 * @generated
		 */
		EClass DATA_INSTITUTION = eINSTANCE.getDataInstitution();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION__SERIAL_VERSION_UID = eINSTANCE.getDataInstitution_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION__CODE = eINSTANCE.getDataInstitution_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION__NAME = eINSTANCE.getDataInstitution_Name();

		/**
		 * The meta object literal for the '<em><b>Banks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INSTITUTION__BANKS = eINSTANCE.getDataInstitution_Banks();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION__ADDRESS = eINSTANCE.getDataInstitution_Address();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION__HOUR = eINSTANCE.getDataInstitution_Hour();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION__TELEPHONE = eINSTANCE.getDataInstitution_Telephone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION__EMAIL = eINSTANCE.getDataInstitution_Email();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION__INFORMATION = eINSTANCE.getDataInstitution_Information();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INSTITUTION__LATITUDE = eINSTANCE.getDataInstitution_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INSTITUTION__LONGITUDE = eINSTANCE.getDataInstitution_Longitude();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataBank_equalsImpl <em>Data Bank equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataBank_equalsImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataBank_equals()
		 * @generated
		 */
		EClass DATA_BANK_EQUALS = eINSTANCE.getDataBank_equals();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataBloodABOTypeImpl <em>Data Blood ABO Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataBloodABOTypeImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataBloodABOType()
		 * @generated
		 */
		EClass DATA_BLOOD_ABO_TYPE = eINSTANCE.getDataBloodABOType();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BLOOD_ABO_TYPE__SERIAL_VERSION_UID = eINSTANCE.getDataBloodABOType_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BLOOD_ABO_TYPE__CODE = eINSTANCE.getDataBloodABOType_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BLOOD_ABO_TYPE__DISPLAY_NAME = eINSTANCE.getDataBloodABOType_DisplayName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataBloodTypeImpl <em>Data Blood Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataBloodTypeImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataBloodType()
		 * @generated
		 */
		EClass DATA_BLOOD_TYPE = eINSTANCE.getDataBloodType();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BLOOD_TYPE__SERIAL_VERSION_UID = eINSTANCE.getDataBloodType_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BLOOD_TYPE__CODE = eINSTANCE.getDataBloodType_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BLOOD_TYPE__DISPLAY_NAME = eINSTANCE.getDataBloodType_DisplayName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataCampaignImpl <em>Data Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataCampaignImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCampaign()
		 * @generated
		 */
		EClass DATA_CAMPAIGN = eINSTANCE.getDataCampaign();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CAMPAIGN__SERIAL_VERSION_UID = eINSTANCE.getDataCampaign_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CAMPAIGN__ID = eINSTANCE.getDataCampaign_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CAMPAIGN__TITLE = eINSTANCE.getDataCampaign_Title();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CAMPAIGN__SUBTITLE = eINSTANCE.getDataCampaign_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CAMPAIGN__SUMMARY = eINSTANCE.getDataCampaign_Summary();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CAMPAIGN__TEXT = eINSTANCE.getDataCampaign_Text();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CAMPAIGN__DATE = eINSTANCE.getDataCampaign_Date();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CAMPAIGN__IMAGE = eINSTANCE.getDataCampaign_Image();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataCityImpl <em>Data City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataCityImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCity()
		 * @generated
		 */
		EClass DATA_CITY = eINSTANCE.getDataCity();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CITY__CODE = eINSTANCE.getDataCity_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CITY__NAME = eINSTANCE.getDataCity_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CITY__ID = eINSTANCE.getDataCity_Id();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_CITY___EQUALS__OBJECT = eINSTANCE.getDataCity__Equals__Object();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataCity_equalsImpl <em>Data City equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataCity_equalsImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCity_equals()
		 * @generated
		 */
		EClass DATA_CITY_EQUALS = eINSTANCE.getDataCity_equals();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataCountryImpl <em>Data Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataCountryImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataCountry()
		 * @generated
		 */
		EClass DATA_COUNTRY = eINSTANCE.getDataCountry();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COUNTRY__SERIAL_VERSION_UID = eINSTANCE.getDataCountry_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COUNTRY__CODE = eINSTANCE.getDataCountry_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COUNTRY__DISPLAY_NAME = eINSTANCE.getDataCountry_DisplayName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDocumentTypeImpl <em>Data Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDocumentTypeImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDocumentType()
		 * @generated
		 */
		EClass DATA_DOCUMENT_TYPE = eINSTANCE.getDataDocumentType();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DOCUMENT_TYPE__SERIAL_VERSION_UID = eINSTANCE.getDataDocumentType_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DOCUMENT_TYPE__CODE = eINSTANCE.getDataDocumentType_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DOCUMENT_TYPE__DISPLAY_NAME = eINSTANCE.getDataDocumentType_DisplayName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonationImpl <em>Data Donation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonationImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonation()
		 * @generated
		 */
		EClass DATA_DONATION = eINSTANCE.getDataDonation();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION__SERIAL_VERSION_UID = eINSTANCE.getDataDonation_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION__NAME = eINSTANCE.getDataDonation_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION__DATE = eINSTANCE.getDataDonation_Date();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__BANK = eINSTANCE.getDataDonation_Bank();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__INSTITUTION = eINSTANCE.getDataDonation_Institution();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__PERSON = eINSTANCE.getDataDonation_Person();

		/**
		 * The meta object literal for the '<em><b>Data Donor Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__DATA_DONOR_TYPE = eINSTANCE.getDataDonation_DataDonorType();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION__STATE = eINSTANCE.getDataDonation_State();

		/**
		 * The meta object literal for the '<em><b>Blood ABO Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__BLOOD_ABO_TYPE = eINSTANCE.getDataDonation_BloodABOType();

		/**
		 * The meta object literal for the '<em><b>Blood DType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__BLOOD_DTYPE = eINSTANCE.getDataDonation_BloodDType();

		/**
		 * The meta object literal for the '<em><b>Fail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__FAIL = eINSTANCE.getDataDonation_Fail();

		/**
		 * The meta object literal for the '<em><b>Lab Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__LAB_RESULTS = eINSTANCE.getDataDonation_LabResults();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__EVENTS = eINSTANCE.getDataDonation_Events();

		/**
		 * The meta object literal for the '<em><b>Extraction Time Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__EXTRACTION_TIME_BEGIN = eINSTANCE.getDataDonation_ExtractionTimeBegin();

		/**
		 * The meta object literal for the '<em><b>Extraction Time End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION__EXTRACTION_TIME_END = eINSTANCE.getDataDonation_ExtractionTimeEnd();

		/**
		 * The meta object literal for the '<em><b>Data Donation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_DONATION___DATA_DONATION = eINSTANCE.getDataDonation__DataDonation();

		/**
		 * The meta object literal for the '<em><b>Is Approved</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_DONATION___IS_APPROVED = eINSTANCE.getDataDonation__IsApproved();

		/**
		 * The meta object literal for the '<em><b>Is State Defined</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_DONATION___IS_STATE_DEFINED = eINSTANCE.getDataDonation__IsStateDefined();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataPersonImpl <em>Data Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataPersonImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataPerson()
		 * @generated
		 */
		EClass DATA_PERSON = eINSTANCE.getDataPerson();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__SERIAL_VERSION_UID = eINSTANCE.getDataPerson_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__ID = eINSTANCE.getDataPerson_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__FIRST_NAME = eINSTANCE.getDataPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Second Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__SECOND_NAME = eINSTANCE.getDataPerson_SecondName();

		/**
		 * The meta object literal for the '<em><b>First Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__FIRST_LAST_NAME = eINSTANCE.getDataPerson_FirstLastName();

		/**
		 * The meta object literal for the '<em><b>Second Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__SECOND_LAST_NAME = eINSTANCE.getDataPerson_SecondLastName();

		/**
		 * The meta object literal for the '<em><b>Document Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__DOCUMENT_COUNTRY = eINSTANCE.getDataPerson_DocumentCountry();

		/**
		 * The meta object literal for the '<em><b>Document Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__DOCUMENT_TYPE = eINSTANCE.getDataPerson_DocumentType();

		/**
		 * The meta object literal for the '<em><b>Document Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__DOCUMENT_NUMBER = eINSTANCE.getDataPerson_DocumentNumber();

		/**
		 * The meta object literal for the '<em><b>Birthday Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__BIRTHDAY_DATE = eINSTANCE.getDataPerson_BirthdayDate();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PERSON__STATE = eINSTANCE.getDataPerson_State();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PERSON__CITY = eINSTANCE.getDataPerson_City();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__ADDRESS = eINSTANCE.getDataPerson_Address();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__TELEPHONE = eINSTANCE.getDataPerson_Telephone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__EMAIL = eINSTANCE.getDataPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Blood Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PERSON__BLOOD_TYPE = eINSTANCE.getDataPerson_BloodType();

		/**
		 * The meta object literal for the '<em><b>Able To Donate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__ABLE_TO_DONATE = eINSTANCE.getDataPerson_AbleToDonate();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__IMAGE = eINSTANCE.getDataPerson_Image();

		/**
		 * The meta object literal for the '<em><b>Allow Notification Need Donor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__ALLOW_NOTIFICATION_NEED_DONOR = eINSTANCE.getDataPerson_AllowNotificationNeedDonor();

		/**
		 * The meta object literal for the '<em><b>Allow Notification Able To Donate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PERSON__ALLOW_NOTIFICATION_ABLE_TO_DONATE = eINSTANCE.getDataPerson_AllowNotificationAbleToDonate();

		/**
		 * The meta object literal for the '<em><b>Get Full Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PERSON___GET_FULL_NAME = eINSTANCE.getDataPerson__GetFullName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataStateImpl <em>Data State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataStateImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataState()
		 * @generated
		 */
		EClass DATA_STATE = eINSTANCE.getDataState();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STATE__ID = eINSTANCE.getDataState_Id();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STATE__CODE = eINSTANCE.getDataState_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STATE__NAME = eINSTANCE.getDataState_Name();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_STATE___EQUALS__OBJECT = eINSTANCE.getDataState__Equals__Object();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataState_equalsImpl <em>Data State equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataState_equalsImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataState_equals()
		 * @generated
		 */
		EClass DATA_STATE_EQUALS = eINSTANCE.getDataState_equals();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataPerson_getFullNameImpl <em>Data Person get Full Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataPerson_getFullNameImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataPerson_getFullName()
		 * @generated
		 */
		EClass DATA_PERSON_GET_FULL_NAME = eINSTANCE.getDataPerson_getFullName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonationDonorTypeImpl <em>Data Donation Donor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonationDonorTypeImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationDonorType()
		 * @generated
		 */
		EClass DATA_DONATION_DONOR_TYPE = eINSTANCE.getDataDonationDonorType();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_DONOR_TYPE__SERIAL_VERSION_UID = eINSTANCE.getDataDonationDonorType_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_DONOR_TYPE__CODE = eINSTANCE.getDataDonationDonorType_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_DONOR_TYPE__DISPLAY_NAME = eINSTANCE.getDataDonationDonorType_DisplayName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonationFailImpl <em>Data Donation Fail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonationFailImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationFail()
		 * @generated
		 */
		EClass DATA_DONATION_FAIL = eINSTANCE.getDataDonationFail();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_FAIL__SERIAL_VERSION_UID = eINSTANCE.getDataDonationFail_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_FAIL__CODE = eINSTANCE.getDataDonationFail_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_FAIL__DISPLAY_NAME = eINSTANCE.getDataDonationFail_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION_FAIL__DATE = eINSTANCE.getDataDonationFail_Date();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DONATION_FAIL__CAUSE = eINSTANCE.getDataDonationFail_Cause();

		/**
		 * The meta object literal for the '<em><b>Rejection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_FAIL__REJECTION_TYPE = eINSTANCE.getDataDonationFail_RejectionType();

		/**
		 * The meta object literal for the '<em><b>Data Donation Fail</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_DONATION_FAIL___DATA_DONATION_FAIL = eINSTANCE.getDataDonationFail__DataDonationFail();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonationFailCauseImpl <em>Data Donation Fail Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonationFailCauseImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationFailCause()
		 * @generated
		 */
		EClass DATA_DONATION_FAIL_CAUSE = eINSTANCE.getDataDonationFailCause();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_FAIL_CAUSE__SERIAL_VERSION_UID = eINSTANCE.getDataDonationFailCause_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_FAIL_CAUSE__CODE = eINSTANCE.getDataDonationFailCause_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DONATION_FAIL_CAUSE__DISPLAY_NAME = eINSTANCE.getDataDonationFailCause_DisplayName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonationFail_DataDonationFailImpl <em>Data Donation Fail Data Donation Fail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonationFail_DataDonationFailImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationFail_DataDonationFail()
		 * @generated
		 */
		EClass DATA_DONATION_FAIL_DATA_DONATION_FAIL = eINSTANCE.getDataDonationFail_DataDonationFail();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataLaboratoryResultImpl <em>Data Laboratory Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataLaboratoryResultImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataLaboratoryResult()
		 * @generated
		 */
		EClass DATA_LABORATORY_RESULT = eINSTANCE.getDataLaboratoryResult();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LABORATORY_RESULT__SERIAL_VERSION_UID = eINSTANCE.getDataLaboratoryResult_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LABORATORY_RESULT__ANALYSIS = eINSTANCE.getDataLaboratoryResult_Analysis();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LABORATORY_RESULT__BANK = eINSTANCE.getDataLaboratoryResult_Bank();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LABORATORY_RESULT__DATE = eINSTANCE.getDataLaboratoryResult_Date();

		/**
		 * The meta object literal for the '<em><b>Responsible Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_LABORATORY_RESULT__RESPONSIBLE_PERSON = eINSTANCE.getDataLaboratoryResult_ResponsiblePerson();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LABORATORY_RESULT__RESULT = eINSTANCE.getDataLaboratoryResult_Result();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataResponsiblePersonImpl <em>Data Responsible Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataResponsiblePersonImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataResponsiblePerson()
		 * @generated
		 */
		EClass DATA_RESPONSIBLE_PERSON = eINSTANCE.getDataResponsiblePerson();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSIBLE_PERSON__ID = eINSTANCE.getDataResponsiblePerson_Id();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSIBLE_PERSON__FIRST_NAME = eINSTANCE.getDataResponsiblePerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Second Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSIBLE_PERSON__SECOND_NAME = eINSTANCE.getDataResponsiblePerson_SecondName();

		/**
		 * The meta object literal for the '<em><b>First Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSIBLE_PERSON__FIRST_LAST_NAME = eINSTANCE.getDataResponsiblePerson_FirstLastName();

		/**
		 * The meta object literal for the '<em><b>Second Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSIBLE_PERSON__SECOND_LAST_NAME = eINSTANCE.getDataResponsiblePerson_SecondLastName();

		/**
		 * The meta object literal for the '<em><b>Document Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSIBLE_PERSON__DOCUMENT_COUNTRY = eINSTANCE.getDataResponsiblePerson_DocumentCountry();

		/**
		 * The meta object literal for the '<em><b>Document Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSIBLE_PERSON__DOCUMENT_TYPE = eINSTANCE.getDataResponsiblePerson_DocumentType();

		/**
		 * The meta object literal for the '<em><b>Document Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSIBLE_PERSON__DOCUMENT_NUMBER = eINSTANCE.getDataResponsiblePerson_DocumentNumber();

		/**
		 * The meta object literal for the '<em><b>Get Full Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_RESPONSIBLE_PERSON___GET_FULL_NAME = eINSTANCE.getDataResponsiblePerson__GetFullName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataResponsiblePerson_getFullNameImpl <em>Data Responsible Person get Full Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataResponsiblePerson_getFullNameImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataResponsiblePerson_getFullName()
		 * @generated
		 */
		EClass DATA_RESPONSIBLE_PERSON_GET_FULL_NAME = eINSTANCE.getDataResponsiblePerson_getFullName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonationEventImpl <em>Data Donation Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonationEventImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonationEvent()
		 * @generated
		 */
		EClass DATA_DONATION_EVENT = eINSTANCE.getDataDonationEvent();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonation_DataDonationImpl <em>Data Donation Data Donation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonation_DataDonationImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonation_DataDonation()
		 * @generated
		 */
		EClass DATA_DONATION_DATA_DONATION = eINSTANCE.getDataDonation_DataDonation();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonation_isApprovedImpl <em>Data Donation is Approved</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonation_isApprovedImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonation_isApproved()
		 * @generated
		 */
		EClass DATA_DONATION_IS_APPROVED = eINSTANCE.getDataDonation_isApproved();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataDonation_isStateDefinedImpl <em>Data Donation is State Defined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataDonation_isStateDefinedImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataDonation_isStateDefined()
		 * @generated
		 */
		EClass DATA_DONATION_IS_STATE_DEFINED = eINSTANCE.getDataDonation_isStateDefined();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataInstitutionCenterImpl <em>Data Institution Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataInstitutionCenterImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataInstitutionCenter()
		 * @generated
		 */
		EClass DATA_INSTITUTION_CENTER = eINSTANCE.getDataInstitutionCenter();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INSTITUTION_CENTER__SERIAL_VERSION_UID = eINSTANCE.getDataInstitutionCenter_SerialVersionUID();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataProductImpl <em>Data Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataProductImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataProduct()
		 * @generated
		 */
		EClass DATA_PRODUCT = eINSTANCE.getDataProduct();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PRODUCT__SERIAL_VERSION_UID = eINSTANCE.getDataProduct_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PRODUCT__CODE = eINSTANCE.getDataProduct_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PRODUCT__DISPLAY = eINSTANCE.getDataProduct_Display();

		/**
		 * The meta object literal for the '<em><b>Donation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PRODUCT__DONATION = eINSTANCE.getDataProduct_Donation();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataProductTypeImpl <em>Data Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataProductTypeImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataProductType()
		 * @generated
		 */
		EClass DATA_PRODUCT_TYPE = eINSTANCE.getDataProductType();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PRODUCT_TYPE__SERIAL_VERSION_UID = eINSTANCE.getDataProductType_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PRODUCT_TYPE__CODE = eINSTANCE.getDataProductType_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PRODUCT_TYPE__DISPLAY = eINSTANCE.getDataProductType_Display();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataResponseImpl <em>Data Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataResponseImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataResponse()
		 * @generated
		 */
		EClass DATA_RESPONSE = eINSTANCE.getDataResponse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSE__CODE = eINSTANCE.getDataResponse_Code();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RESPONSE__ERROR_MESSAGE = eINSTANCE.getDataResponse_ErrorMessage();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataStockImpl <em>Data Stock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataStockImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataStock()
		 * @generated
		 */
		EClass DATA_STOCK = eINSTANCE.getDataStock();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STOCK__SERIAL_VERSION_UID = eINSTANCE.getDataStock_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STOCK__BANK = eINSTANCE.getDataStock_Bank();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STOCK__PRODUCTS = eINSTANCE.getDataStock_Products();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataStockProductTypeImpl <em>Data Stock Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataStockProductTypeImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataStockProductType()
		 * @generated
		 */
		EClass DATA_STOCK_PRODUCT_TYPE = eINSTANCE.getDataStockProductType();

		/**
		 * The meta object literal for the '<em><b>Blood Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STOCK_PRODUCT_TYPE__BLOOD_TYPES = eINSTANCE.getDataStockProductType_BloodTypes();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataStockProductTypeBloodTypeImpl <em>Data Stock Product Type Blood Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataStockProductTypeBloodTypeImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataStockProductTypeBloodType()
		 * @generated
		 */
		EClass DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE = eINSTANCE.getDataStockProductTypeBloodType();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE__COUNT = eINSTANCE.getDataStockProductTypeBloodType_Count();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataTransfusionImpl <em>Data Transfusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataTransfusionImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataTransfusion()
		 * @generated
		 */
		EClass DATA_TRANSFUSION = eINSTANCE.getDataTransfusion();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFUSION__SERIAL_VERSION_UID = eINSTANCE.getDataTransfusion_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFUSION__NAME = eINSTANCE.getDataTransfusion_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFUSION__DATE = eINSTANCE.getDataTransfusion_Date();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRANSFUSION__BANK = eINSTANCE.getDataTransfusion_Bank();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRANSFUSION__INSTITUTION = eINSTANCE.getDataTransfusion_Institution();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRANSFUSION__VOLUME = eINSTANCE.getDataTransfusion_Volume();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRANSFUSION__PERSON = eINSTANCE.getDataTransfusion_Person();

		/**
		 * The meta object literal for the '<em><b>Associated Donation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRANSFUSION__ASSOCIATED_DONATION = eINSTANCE.getDataTransfusion_AssociatedDonation();

		/**
		 * The meta object literal for the '<em><b>Data Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRANSFUSION__DATA_PRODUCT = eINSTANCE.getDataTransfusion_DataProduct();

		/**
		 * The meta object literal for the '<em><b>Laboratory Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRANSFUSION__LABORATORY_RESULTS = eINSTANCE.getDataTransfusion_LaboratoryResults();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRANSFUSION__EVENTS = eINSTANCE.getDataTransfusion_Events();

		/**
		 * The meta object literal for the '<em><b>Responsible Transfusion Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRANSFUSION__RESPONSIBLE_TRANSFUSION_PERSON = eINSTANCE.getDataTransfusion_ResponsibleTransfusionPerson();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataTransfusionEventImpl <em>Data Transfusion Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataTransfusionEventImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataTransfusionEvent()
		 * @generated
		 */
		EClass DATA_TRANSFUSION_EVENT = eINSTANCE.getDataTransfusionEvent();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataUnitImpl <em>Data Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataUnitImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataUnit()
		 * @generated
		 */
		EClass DATA_UNIT = eINSTANCE.getDataUnit();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_UNIT__SERIAL_VERSION_UID = eINSTANCE.getDataUnit_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__ID = eINSTANCE.getDataUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Donation Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__DONATION_ID = eINSTANCE.getDataUnit_DonationId();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_UNIT__CODE = eINSTANCE.getDataUnit_Code();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_UNIT__INSTITUTION = eINSTANCE.getDataUnit_Institution();

		/**
		 * The meta object literal for the '<em><b>Institution Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_UNIT__INSTITUTION_CODE = eINSTANCE.getDataUnit_InstitutionCode();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__PRODUCT_TYPE = eINSTANCE.getDataUnit_ProductType();

		/**
		 * The meta object literal for the '<em><b>Blood Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_UNIT__BLOOD_TYPE = eINSTANCE.getDataUnit_BloodType();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DataUserImpl <em>Data User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DataUserImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDataUser()
		 * @generated
		 */
		EClass DATA_USER = eINSTANCE.getDataUser();

		/**
		 * The meta object literal for the '<em><b>Person Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_USER__PERSON_ID = eINSTANCE.getDataUser_PersonId();

		/**
		 * The meta object literal for the '<em><b>Banks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_USER__BANKS = eINSTANCE.getDataUser_Banks();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DonationFilterDataImpl <em>Donation Filter Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DonationFilterDataImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationFilterData()
		 * @generated
		 */
		EClass DONATION_FILTER_DATA = eINSTANCE.getDonationFilterData();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_FILTER_DATA__CODE = eINSTANCE.getDonationFilterData_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_FILTER_DATA__DISPLAY_NAME = eINSTANCE.getDonationFilterData_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONATION_FILTER_DATA__OPTIONS = eINSTANCE.getDonationFilterData_Options();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DonationResultImpl <em>Donation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DonationResultImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationResult()
		 * @generated
		 */
		EClass DONATION_RESULT = eINSTANCE.getDonationResult();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_RESULT__SERIAL_VERSION_UID = eINSTANCE.getDonationResult_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Donation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_RESULT__DONATION_ID = eINSTANCE.getDonationResult_DonationId();

		/**
		 * The meta object literal for the '<em><b>Person Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_RESULT__PERSON_DOCUMENT = eINSTANCE.getDonationResult_PersonDocument();

		/**
		 * The meta object literal for the '<em><b>Person Complete Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_RESULT__PERSON_COMPLETE_NAME = eINSTANCE.getDonationResult_PersonCompleteName();

		/**
		 * The meta object literal for the '<em><b>Donation Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONATION_RESULT__DONATION_DATE = eINSTANCE.getDonationResult_DonationDate();

		/**
		 * The meta object literal for the '<em><b>Donation State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_RESULT__DONATION_STATE = eINSTANCE.getDonationResult_DonationState();

		/**
		 * The meta object literal for the '<em><b>Donation Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DONATION_RESULT___DONATION_RESULT = eINSTANCE.getDonationResult__DonationResult();

		/**
		 * The meta object literal for the '<em><b>Donation Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DONATION_RESULT___DONATION_RESULT__STRING_STRING_STRING_DATE_STRING = eINSTANCE.getDonationResult__DonationResult__String_String_String_Date_String();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DonationResult_DonationResultImpl <em>Donation Result Donation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DonationResult_DonationResultImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationResult_DonationResult()
		 * @generated
		 */
		EClass DONATION_RESULT_DONATION_RESULT = eINSTANCE.getDonationResult_DonationResult();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DonationSearchImpl <em>Donation Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DonationSearchImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationSearch()
		 * @generated
		 */
		EClass DONATION_SEARCH = eINSTANCE.getDonationSearch();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_SEARCH__SERIAL_VERSION_UID = eINSTANCE.getDonationSearch_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION_SEARCH__PERSON = eINSTANCE.getDonationSearch_Person();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONATION_SEARCH__FROM = eINSTANCE.getDonationSearch_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONATION_SEARCH__TO = eINSTANCE.getDonationSearch_To();

		/**
		 * The meta object literal for the '<em><b>Donation Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DONATION_SEARCH___DONATION_SEARCH = eINSTANCE.getDonationSearch__DonationSearch();

		/**
		 * The meta object literal for the '<em><b>Donation Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DONATION_SEARCH___DONATION_SEARCH__STRING_DATE_DATE = eINSTANCE.getDonationSearch__DonationSearch__String_Date_Date();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DonationSearch_DonationSearchImpl <em>Donation Search Donation Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DonationSearch_DonationSearchImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationSearch_DonationSearch()
		 * @generated
		 */
		EClass DONATION_SEARCH_DONATION_SEARCH = eINSTANCE.getDonationSearch_DonationSearch();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.DonationsStatisticsDataImpl <em>Donations Statistics Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.DonationsStatisticsDataImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getDonationsStatisticsData()
		 * @generated
		 */
		EClass DONATIONS_STATISTICS_DATA = eINSTANCE.getDonationsStatisticsData();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATIONS_STATISTICS_DATA__SERIAL_VERSION_UID = eINSTANCE.getDonationsStatisticsData_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATIONS_STATISTICS_DATA__TYPE = eINSTANCE.getDonationsStatisticsData_Type();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATIONS_STATISTICS_DATA__FROM_DATE = eINSTANCE.getDonationsStatisticsData_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATIONS_STATISTICS_DATA__TO_DATE = eINSTANCE.getDonationsStatisticsData_ToDate();

		/**
		 * The meta object literal for the '<em><b>Institution Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATIONS_STATISTICS_DATA__INSTITUTION_ID = eINSTANCE.getDonationsStatisticsData_InstitutionId();

		/**
		 * The meta object literal for the '<em><b>Blood Bank Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATIONS_STATISTICS_DATA__BLOOD_BANK_ID = eINSTANCE.getDonationsStatisticsData_BloodBankId();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONATIONS_STATISTICS_DATA__FILTERS = eINSTANCE.getDonationsStatisticsData_Filters();

		/**
		 * The meta object literal for the '<em><b>Distinguish</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DONATIONS_STATISTICS_DATA__DISTINGUISH = eINSTANCE.getDonationsStatisticsData_Distinguish();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.LoginDataImpl <em>Login Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.LoginDataImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getLoginData()
		 * @generated
		 */
		EClass LOGIN_DATA = eINSTANCE.getLoginData();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_DATA__USER = eINSTANCE.getLoginData_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_DATA__PASSWORD = eINSTANCE.getLoginData_Password();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.MailDataImpl <em>Mail Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.MailDataImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getMailData()
		 * @generated
		 */
		EClass MAIL_DATA = eINSTANCE.getMailData();

		/**
		 * The meta object literal for the '<em><b>Message Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIL_DATA__MESSAGE_OPTION = eINSTANCE.getMailData_MessageOption();

		/**
		 * The meta object literal for the '<em><b>Blood Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIL_DATA__BLOOD_TYPE = eINSTANCE.getMailData_BloodType();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIL_DATA__SUBJECT = eINSTANCE.getMailData_Subject();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIL_DATA__TEXT = eINSTANCE.getMailData_Text();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.MessageOptionDataImpl <em>Message Option Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.MessageOptionDataImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getMessageOptionData()
		 * @generated
		 */
		EClass MESSAGE_OPTION_DATA = eINSTANCE.getMessageOptionData();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_OPTION_DATA__SERIAL_VERSION_UID = eINSTANCE.getMessageOptionData_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_OPTION_DATA__CODE = eINSTANCE.getMessageOptionData_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_OPTION_DATA__DISPLAY_NAME = eINSTANCE.getMessageOptionData_DisplayName();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.TransfusionFilterDataImpl <em>Transfusion Filter Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.TransfusionFilterDataImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionFilterData()
		 * @generated
		 */
		EClass TRANSFUSION_FILTER_DATA = eINSTANCE.getTransfusionFilterData();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_FILTER_DATA__CODE = eINSTANCE.getTransfusionFilterData_Code();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_FILTER_DATA__DISPLAY_NAME = eINSTANCE.getTransfusionFilterData_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFUSION_FILTER_DATA__OPTIONS = eINSTANCE.getTransfusionFilterData_Options();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.TransfusionResultImpl <em>Transfusion Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.TransfusionResultImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionResult()
		 * @generated
		 */
		EClass TRANSFUSION_RESULT = eINSTANCE.getTransfusionResult();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_RESULT__SERIAL_VERSION_UID = eINSTANCE.getTransfusionResult_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Transfusion Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_RESULT__TRANSFUSION_ID = eINSTANCE.getTransfusionResult_TransfusionId();

		/**
		 * The meta object literal for the '<em><b>Person Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_RESULT__PERSON_DOCUMENT = eINSTANCE.getTransfusionResult_PersonDocument();

		/**
		 * The meta object literal for the '<em><b>Person Complete Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_RESULT__PERSON_COMPLETE_NAME = eINSTANCE.getTransfusionResult_PersonCompleteName();

		/**
		 * The meta object literal for the '<em><b>Transfusion Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFUSION_RESULT__TRANSFUSION_DATE = eINSTANCE.getTransfusionResult_TransfusionDate();

		/**
		 * The meta object literal for the '<em><b>Transfusion State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_RESULT__TRANSFUSION_STATE = eINSTANCE.getTransfusionResult_TransfusionState();

		/**
		 * The meta object literal for the '<em><b>Transfusion Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFUSION_RESULT___TRANSFUSION_RESULT = eINSTANCE.getTransfusionResult__TransfusionResult();

		/**
		 * The meta object literal for the '<em><b>Transfusion Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFUSION_RESULT___TRANSFUSION_RESULT__STRING_STRING_STRING_DATE_STRING = eINSTANCE.getTransfusionResult__TransfusionResult__String_String_String_Date_String();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.TransfusionResult_TransfusionResultImpl <em>Transfusion Result Transfusion Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.TransfusionResult_TransfusionResultImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionResult_TransfusionResult()
		 * @generated
		 */
		EClass TRANSFUSION_RESULT_TRANSFUSION_RESULT = eINSTANCE.getTransfusionResult_TransfusionResult();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.TransfusionSearchImpl <em>Transfusion Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.TransfusionSearchImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionSearch()
		 * @generated
		 */
		EClass TRANSFUSION_SEARCH = eINSTANCE.getTransfusionSearch();

		/**
		 * The meta object literal for the '<em><b>Serial Version UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_SEARCH__SERIAL_VERSION_UID = eINSTANCE.getTransfusionSearch_SerialVersionUID();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFUSION_SEARCH__PERSON = eINSTANCE.getTransfusionSearch_Person();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFUSION_SEARCH__FROM = eINSTANCE.getTransfusionSearch_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFUSION_SEARCH__TO = eINSTANCE.getTransfusionSearch_To();

		/**
		 * The meta object literal for the '<em><b>Transfusion Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFUSION_SEARCH___TRANSFUSION_SEARCH = eINSTANCE.getTransfusionSearch__TransfusionSearch();

		/**
		 * The meta object literal for the '<em><b>Transfusion Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFUSION_SEARCH___TRANSFUSION_SEARCH__STRING_DATE_DATE = eINSTANCE.getTransfusionSearch__TransfusionSearch__String_Date_Date();

		/**
		 * The meta object literal for the '{@link org.hemologica.datatypes.impl.TransfusionSearch_TransfusionSearchImpl <em>Transfusion Search Transfusion Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.hemologica.datatypes.impl.TransfusionSearch_TransfusionSearchImpl
		 * @see org.hemologica.datatypes.impl.DatatypesPackageImpl#getTransfusionSearch_TransfusionSearch()
		 * @generated
		 */
		EClass TRANSFUSION_SEARCH_TRANSFUSION_SEARCH = eINSTANCE.getTransfusionSearch_TransfusionSearch();

	}

} //DatatypesPackage
