/**
 */
package org.hemologica.datatypes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.hemologica.datatypes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesFactoryImpl extends EFactoryImpl implements DatatypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesFactory init() {
		try {
			DatatypesFactory theDatatypesFactory = (DatatypesFactory)EPackage.Registry.INSTANCE.getEFactory(DatatypesPackage.eNS_URI);
			if (theDatatypesFactory != null) {
				return theDatatypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatatypesPackage.DATA_CODE: return createDataCode();
			case DatatypesPackage.DATA_BANK: return createDataBank();
			case DatatypesPackage.DATA_INSTITUTION: return createDataInstitution();
			case DatatypesPackage.DATA_BANK_EQUALS: return createDataBank_equals();
			case DatatypesPackage.DATA_BLOOD_ABO_TYPE: return createDataBloodABOType();
			case DatatypesPackage.DATA_BLOOD_TYPE: return createDataBloodType();
			case DatatypesPackage.DATA_CAMPAIGN: return createDataCampaign();
			case DatatypesPackage.DATA_CITY: return createDataCity();
			case DatatypesPackage.DATA_CITY_EQUALS: return createDataCity_equals();
			case DatatypesPackage.DATA_COUNTRY: return createDataCountry();
			case DatatypesPackage.DATA_DOCUMENT_TYPE: return createDataDocumentType();
			case DatatypesPackage.DATA_DONATION: return createDataDonation();
			case DatatypesPackage.DATA_PERSON: return createDataPerson();
			case DatatypesPackage.DATA_STATE: return createDataState();
			case DatatypesPackage.DATA_STATE_EQUALS: return createDataState_equals();
			case DatatypesPackage.DATA_PERSON_GET_FULL_NAME: return createDataPerson_getFullName();
			case DatatypesPackage.DATA_DONATION_DONOR_TYPE: return createDataDonationDonorType();
			case DatatypesPackage.DATA_DONATION_FAIL: return createDataDonationFail();
			case DatatypesPackage.DATA_DONATION_FAIL_CAUSE: return createDataDonationFailCause();
			case DatatypesPackage.DATA_DONATION_FAIL_DATA_DONATION_FAIL: return createDataDonationFail_DataDonationFail();
			case DatatypesPackage.DATA_LABORATORY_RESULT: return createDataLaboratoryResult();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON: return createDataResponsiblePerson();
			case DatatypesPackage.DATA_RESPONSIBLE_PERSON_GET_FULL_NAME: return createDataResponsiblePerson_getFullName();
			case DatatypesPackage.DATA_DONATION_EVENT: return createDataDonationEvent();
			case DatatypesPackage.DATA_DONATION_DATA_DONATION: return createDataDonation_DataDonation();
			case DatatypesPackage.DATA_DONATION_IS_APPROVED: return createDataDonation_isApproved();
			case DatatypesPackage.DATA_DONATION_IS_STATE_DEFINED: return createDataDonation_isStateDefined();
			case DatatypesPackage.DATA_INSTITUTION_CENTER: return createDataInstitutionCenter();
			case DatatypesPackage.DATA_PRODUCT: return createDataProduct();
			case DatatypesPackage.DATA_PRODUCT_TYPE: return createDataProductType();
			case DatatypesPackage.DATA_RESPONSE: return createDataResponse();
			case DatatypesPackage.DATA_STOCK: return createDataStock();
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE: return createDataStockProductType();
			case DatatypesPackage.DATA_STOCK_PRODUCT_TYPE_BLOOD_TYPE: return createDataStockProductTypeBloodType();
			case DatatypesPackage.DATA_TRANSFUSION: return createDataTransfusion();
			case DatatypesPackage.DATA_TRANSFUSION_EVENT: return createDataTransfusionEvent();
			case DatatypesPackage.DATA_UNIT: return createDataUnit();
			case DatatypesPackage.DATA_USER: return createDataUser();
			case DatatypesPackage.DONATION_FILTER_DATA: return createDonationFilterData();
			case DatatypesPackage.DONATION_RESULT: return createDonationResult();
			case DatatypesPackage.DONATION_RESULT_DONATION_RESULT: return createDonationResult_DonationResult();
			case DatatypesPackage.DONATION_SEARCH: return createDonationSearch();
			case DatatypesPackage.DONATION_SEARCH_DONATION_SEARCH: return createDonationSearch_DonationSearch();
			case DatatypesPackage.DONATIONS_STATISTICS_DATA: return createDonationsStatisticsData();
			case DatatypesPackage.LOGIN_DATA: return createLoginData();
			case DatatypesPackage.MAIL_DATA: return createMailData();
			case DatatypesPackage.MESSAGE_OPTION_DATA: return createMessageOptionData();
			case DatatypesPackage.TRANSFUSION_FILTER_DATA: return createTransfusionFilterData();
			case DatatypesPackage.TRANSFUSION_RESULT: return createTransfusionResult();
			case DatatypesPackage.TRANSFUSION_RESULT_TRANSFUSION_RESULT: return createTransfusionResult_TransfusionResult();
			case DatatypesPackage.TRANSFUSION_SEARCH: return createTransfusionSearch();
			case DatatypesPackage.TRANSFUSION_SEARCH_TRANSFUSION_SEARCH: return createTransfusionSearch_TransfusionSearch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCode createDataCode() {
		DataCodeImpl dataCode = new DataCodeImpl();
		return dataCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBank createDataBank() {
		DataBankImpl dataBank = new DataBankImpl();
		return dataBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInstitution createDataInstitution() {
		DataInstitutionImpl dataInstitution = new DataInstitutionImpl();
		return dataInstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBank_equals createDataBank_equals() {
		DataBank_equalsImpl dataBank_equals = new DataBank_equalsImpl();
		return dataBank_equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodABOType createDataBloodABOType() {
		DataBloodABOTypeImpl dataBloodABOType = new DataBloodABOTypeImpl();
		return dataBloodABOType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBloodType createDataBloodType() {
		DataBloodTypeImpl dataBloodType = new DataBloodTypeImpl();
		return dataBloodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCampaign createDataCampaign() {
		DataCampaignImpl dataCampaign = new DataCampaignImpl();
		return dataCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCity createDataCity() {
		DataCityImpl dataCity = new DataCityImpl();
		return dataCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCity_equals createDataCity_equals() {
		DataCity_equalsImpl dataCity_equals = new DataCity_equalsImpl();
		return dataCity_equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCountry createDataCountry() {
		DataCountryImpl dataCountry = new DataCountryImpl();
		return dataCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDocumentType createDataDocumentType() {
		DataDocumentTypeImpl dataDocumentType = new DataDocumentTypeImpl();
		return dataDocumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation createDataDonation() {
		DataDonationImpl dataDonation = new DataDonationImpl();
		return dataDonation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPerson createDataPerson() {
		DataPersonImpl dataPerson = new DataPersonImpl();
		return dataPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState createDataState() {
		DataStateImpl dataState = new DataStateImpl();
		return dataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState_equals createDataState_equals() {
		DataState_equalsImpl dataState_equals = new DataState_equalsImpl();
		return dataState_equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPerson_getFullName createDataPerson_getFullName() {
		DataPerson_getFullNameImpl dataPerson_getFullName = new DataPerson_getFullNameImpl();
		return dataPerson_getFullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationDonorType createDataDonationDonorType() {
		DataDonationDonorTypeImpl dataDonationDonorType = new DataDonationDonorTypeImpl();
		return dataDonationDonorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationFail createDataDonationFail() {
		DataDonationFailImpl dataDonationFail = new DataDonationFailImpl();
		return dataDonationFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationFailCause createDataDonationFailCause() {
		DataDonationFailCauseImpl dataDonationFailCause = new DataDonationFailCauseImpl();
		return dataDonationFailCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationFail_DataDonationFail createDataDonationFail_DataDonationFail() {
		DataDonationFail_DataDonationFailImpl dataDonationFail_DataDonationFail = new DataDonationFail_DataDonationFailImpl();
		return dataDonationFail_DataDonationFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLaboratoryResult createDataLaboratoryResult() {
		DataLaboratoryResultImpl dataLaboratoryResult = new DataLaboratoryResultImpl();
		return dataLaboratoryResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResponsiblePerson createDataResponsiblePerson() {
		DataResponsiblePersonImpl dataResponsiblePerson = new DataResponsiblePersonImpl();
		return dataResponsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResponsiblePerson_getFullName createDataResponsiblePerson_getFullName() {
		DataResponsiblePerson_getFullNameImpl dataResponsiblePerson_getFullName = new DataResponsiblePerson_getFullNameImpl();
		return dataResponsiblePerson_getFullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonationEvent createDataDonationEvent() {
		DataDonationEventImpl dataDonationEvent = new DataDonationEventImpl();
		return dataDonationEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation_DataDonation createDataDonation_DataDonation() {
		DataDonation_DataDonationImpl dataDonation_DataDonation = new DataDonation_DataDonationImpl();
		return dataDonation_DataDonation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation_isApproved createDataDonation_isApproved() {
		DataDonation_isApprovedImpl dataDonation_isApproved = new DataDonation_isApprovedImpl();
		return dataDonation_isApproved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDonation_isStateDefined createDataDonation_isStateDefined() {
		DataDonation_isStateDefinedImpl dataDonation_isStateDefined = new DataDonation_isStateDefinedImpl();
		return dataDonation_isStateDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInstitutionCenter createDataInstitutionCenter() {
		DataInstitutionCenterImpl dataInstitutionCenter = new DataInstitutionCenterImpl();
		return dataInstitutionCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProduct createDataProduct() {
		DataProductImpl dataProduct = new DataProductImpl();
		return dataProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProductType createDataProductType() {
		DataProductTypeImpl dataProductType = new DataProductTypeImpl();
		return dataProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResponse createDataResponse() {
		DataResponseImpl dataResponse = new DataResponseImpl();
		return dataResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStock createDataStock() {
		DataStockImpl dataStock = new DataStockImpl();
		return dataStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStockProductType createDataStockProductType() {
		DataStockProductTypeImpl dataStockProductType = new DataStockProductTypeImpl();
		return dataStockProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStockProductTypeBloodType createDataStockProductTypeBloodType() {
		DataStockProductTypeBloodTypeImpl dataStockProductTypeBloodType = new DataStockProductTypeBloodTypeImpl();
		return dataStockProductTypeBloodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransfusion createDataTransfusion() {
		DataTransfusionImpl dataTransfusion = new DataTransfusionImpl();
		return dataTransfusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTransfusionEvent createDataTransfusionEvent() {
		DataTransfusionEventImpl dataTransfusionEvent = new DataTransfusionEventImpl();
		return dataTransfusionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUnit createDataUnit() {
		DataUnitImpl dataUnit = new DataUnitImpl();
		return dataUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataUser createDataUser() {
		DataUserImpl dataUser = new DataUserImpl();
		return dataUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationFilterData createDonationFilterData() {
		DonationFilterDataImpl donationFilterData = new DonationFilterDataImpl();
		return donationFilterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationResult createDonationResult() {
		DonationResultImpl donationResult = new DonationResultImpl();
		return donationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationResult_DonationResult createDonationResult_DonationResult() {
		DonationResult_DonationResultImpl donationResult_DonationResult = new DonationResult_DonationResultImpl();
		return donationResult_DonationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationSearch createDonationSearch() {
		DonationSearchImpl donationSearch = new DonationSearchImpl();
		return donationSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationSearch_DonationSearch createDonationSearch_DonationSearch() {
		DonationSearch_DonationSearchImpl donationSearch_DonationSearch = new DonationSearch_DonationSearchImpl();
		return donationSearch_DonationSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DonationsStatisticsData createDonationsStatisticsData() {
		DonationsStatisticsDataImpl donationsStatisticsData = new DonationsStatisticsDataImpl();
		return donationsStatisticsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginData createLoginData() {
		LoginDataImpl loginData = new LoginDataImpl();
		return loginData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailData createMailData() {
		MailDataImpl mailData = new MailDataImpl();
		return mailData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageOptionData createMessageOptionData() {
		MessageOptionDataImpl messageOptionData = new MessageOptionDataImpl();
		return messageOptionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionFilterData createTransfusionFilterData() {
		TransfusionFilterDataImpl transfusionFilterData = new TransfusionFilterDataImpl();
		return transfusionFilterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionResult createTransfusionResult() {
		TransfusionResultImpl transfusionResult = new TransfusionResultImpl();
		return transfusionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionResult_TransfusionResult createTransfusionResult_TransfusionResult() {
		TransfusionResult_TransfusionResultImpl transfusionResult_TransfusionResult = new TransfusionResult_TransfusionResultImpl();
		return transfusionResult_TransfusionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionSearch createTransfusionSearch() {
		TransfusionSearchImpl transfusionSearch = new TransfusionSearchImpl();
		return transfusionSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfusionSearch_TransfusionSearch createTransfusionSearch_TransfusionSearch() {
		TransfusionSearch_TransfusionSearchImpl transfusionSearch_TransfusionSearch = new TransfusionSearch_TransfusionSearchImpl();
		return transfusionSearch_TransfusionSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesPackage getDatatypesPackage() {
		return (DatatypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesPackage getPackage() {
		return DatatypesPackage.eINSTANCE;
	}

} //DatatypesFactoryImpl
